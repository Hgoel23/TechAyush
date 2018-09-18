package com.example.kalya.harsh;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.widget.RecyclerView;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by kalya on 6/5/2018.
 */

public class ImageAdapterforEvents extends RecyclerView.Adapter<ImageAdapterforEvents.ImageViewHolder> {
    private Context mContext;
    private String url;
    private List<UploadforEvents> mUploads;
    private OnItemClickListner mListener;

    public ImageAdapterforEvents(Context context, List<UploadforEvents> uploads)
    {
        mContext = context;
        mUploads = uploads;
    }
    @Override
    public ImageViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(mContext).inflate(R.layout.image_item_for_event,parent,false);
        return new ImageViewHolder(v);
    }

    @Override
    public void onBindViewHolder(ImageViewHolder holder, int position) {
        UploadforEvents uploadcurrent = mUploads.get(position);
        holder.Nameforevent.setText(uploadcurrent.getName());
        Picasso.with(mContext)
                .load(uploadcurrent.getUrl())
                .placeholder(R.mipmap.ic_launcher)
                .fit()
                .centerCrop()
                .into(holder.imageView);
    }

    @Override
    public int getItemCount() {
        return mUploads.size();
    }

    public class ImageViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener ,View.OnCreateContextMenuListener,MenuItem.OnMenuItemClickListener{

        public TextView Dateforevent,Nameforevent;
        public ImageView imageView;
        public ImageViewHolder(View itemView) {
            super(itemView);
            Dateforevent = (TextView) itemView.findViewById(R.id.Date_for_event);
            Nameforevent = (TextView) itemView.findViewById(R.id.Name_for_event);
            imageView = (ImageView) itemView.findViewById(R.id.image_view_upload_for_event);

            itemView.setOnClickListener(this);
            itemView.setOnCreateContextMenuListener(this);
        }

        @Override
        public void onClick(View v) {
            if (mListener!= null){
                int position = getAdapterPosition();
                if (position != RecyclerView.NO_POSITION){
                    mListener.onItemClick(position,mUploads.get(position).getUrl1().toString());
                }
            }
        }

        @Override
        public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
            menu.setHeaderTitle("select Action");
            MenuItem dowhatever =menu.add(Menu.NONE,1,1,"do what ever");
            MenuItem delete =menu.add(Menu.NONE,2,2,"delete");

            dowhatever.setOnMenuItemClickListener(this);
            delete.setOnMenuItemClickListener(this);
        }

        @Override
        public boolean onMenuItemClick(MenuItem item) {
            if (mListener!= null){
                int position = getAdapterPosition();
                if (position != RecyclerView.NO_POSITION){
                    switch (item.getItemId()){
                        case 1:
                            mListener.onWhatEverClicked(position);
                            return true;
                        case 2:
                            mListener.onDeleteClick(position);
                            return true;
                    }
                }
            }
            return false;
        }
    }
    public interface OnItemClickListner{
        void onItemClick(int position,String url);

        void onWhatEverClicked(int position);

        void onDeleteClick(int position);
    }
    public void setOnItemClickListner(OnItemClickListner listener){
        mListener = listener;
    }
}
