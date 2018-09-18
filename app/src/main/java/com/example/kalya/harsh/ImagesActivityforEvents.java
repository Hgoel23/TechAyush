package com.example.kalya.harsh;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.List;

public class ImagesActivityforEvents extends AppCompatActivity implements ImageAdapterforEvents.OnItemClickListner{
    private RecyclerView mRecyclerView;
    private ImageAdapterforEvents mAdapter,mAdapter1;

    private ProgressBar mProgressCircle;

    private DatabaseReference mDatabaseRef;
    private List<UploadforEvents> mUploads;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_images_for_event);

        mProgressCircle = (ProgressBar)findViewById(R.id.progress_circle);

        mRecyclerView = (RecyclerView)findViewById(R.id.recycler_view);
        mRecyclerView.setHasFixedSize(true);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));

        mUploads = new ArrayList<>();

        mDatabaseRef = FirebaseDatabase.getInstance().getReference("NewsFeed");

        mDatabaseRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                for (DataSnapshot postSnapshot : dataSnapshot.getChildren())
                {
                    UploadforEvents upload = postSnapshot.getValue(UploadforEvents.class);
                    mUploads.add(upload);
                }
                mAdapter = new ImageAdapterforEvents(ImagesActivityforEvents.this,mUploads);
                mRecyclerView.setAdapter(mAdapter);
                mAdapter.setOnItemClickListner(ImagesActivityforEvents.this);
                mProgressCircle.setVisibility(View.INVISIBLE);
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {
                Toast.makeText(ImagesActivityforEvents.this,databaseError.getMessage(), Toast.LENGTH_SHORT).show();
                mProgressCircle.setVisibility(View.INVISIBLE);
            }
        });
    }

    @Override
    public void onItemClick(int position, String url) {
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse(url));
        startActivity(intent);
    }

    @Override
    public void onWhatEverClicked(int position) {
        Toast.makeText(this,"on what ever clicked" + position, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onDeleteClick(int position) {
        Toast.makeText(this,"on delete click"+position, Toast.LENGTH_SHORT).show();
    }
}
