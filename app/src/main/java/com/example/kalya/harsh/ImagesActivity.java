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

public class ImagesActivity extends AppCompatActivity implements ImageAdapter.OnItemClickListner{
    private RecyclerView mRecyclerView;
    private ImageAdapter mAdapter,mAdapter1;

    private ProgressBar mProgressCircle;

    private DatabaseReference mDatabaseRef;
    private List<Upload> mUploads;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_images);
        String data =  getIntent().getStringExtra("name");
        Toast.makeText(this,data,Toast.LENGTH_LONG).show();
        mProgressCircle = (ProgressBar)findViewById(R.id.progress_circle);

        mRecyclerView = (RecyclerView)findViewById(R.id.recycler_view);
        mRecyclerView.setHasFixedSize(true);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));

        mUploads = new ArrayList<>();

        if (data.equals("abc"))
        {
            mDatabaseRef = FirebaseDatabase.getInstance().getReference();
        }else {
            mDatabaseRef = FirebaseDatabase.getInstance().getReference(data);
        }
        mDatabaseRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                for (DataSnapshot postSnapshot : dataSnapshot.getChildren())
                {
                    Upload upload = postSnapshot.getValue(Upload.class);
                    mUploads.add(upload);
                }
                mAdapter = new ImageAdapter(ImagesActivity.this,mUploads);
                mRecyclerView.setAdapter(mAdapter);
                mAdapter.setOnItemClickListner(ImagesActivity.this);
                mProgressCircle.setVisibility(View.INVISIBLE);
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {
                Toast.makeText(ImagesActivity.this,databaseError.getMessage(), Toast.LENGTH_SHORT).show();
                mProgressCircle.setVisibility(View.INVISIBLE);
            }
        });
    }

    @Override
    public void onItemClick(int position,String Phno) {
        dialContactPhone(Phno);
        Toast.makeText(this,"item click"+Phno, Toast.LENGTH_SHORT).show();
    }

    private void dialContactPhone(String phno) {
        startActivity(new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", phno, null)));
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
