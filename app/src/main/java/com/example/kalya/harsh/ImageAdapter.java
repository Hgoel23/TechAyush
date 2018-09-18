package com.example.kalya.harsh;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.List;

/**
 * Created by kalya on 6/5/2018.
 */

public class ImageAdapter extends RecyclerView.Adapter<ImageAdapter.ImageViewHolder> {
    private Context mContext;
    private List<Upload> mUploads;
    private OnItemClickListner mListener;


    public ImageAdapter(Context context, List<Upload> uploads)
    {
        mContext = context;
        mUploads = uploads;
    }
    @Override
    public ImageViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(mContext).inflate(R.layout.image_item,parent,false);
        return new ImageViewHolder(v);
    }

    @Override
    public void onBindViewHolder(ImageViewHolder holder, int position) {
        Upload uploadcurrent = mUploads.get(position);
        holder.textViewName.setText(uploadcurrent.getName());
        holder.Age.setText(uploadcurrent.getExp());
        holder.Height.setText(uploadcurrent.getSpl());
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

        public TextView textViewName,Contact,Age,Height,Address;
        public ImageView imageView;
        public ImageViewHolder(View itemView) {
            super(itemView);
            Age = (TextView) itemView.findViewById(R.id.Age);
            Height = (TextView) itemView.findViewById(R.id.Height);
            textViewName = (TextView) itemView.findViewById(R.id.text_view_name);
            imageView = (ImageView) itemView.findViewById(R.id.image_view_upload);

            itemView.setOnClickListener(this);
            itemView.setOnCreateContextMenuListener(this);
        }

        @Override
        public void onClick(View v) {
            if (mListener!= null){
                int position = getAdapterPosition();
                if (position != RecyclerView.NO_POSITION){
                    mListener.onItemClick(position,mUploads.get(position).getPhno().toString());
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
        void onItemClick(int position, String Phno);

        void onWhatEverClicked(int position);

        void onDeleteClick(int position);
    }
    public void setOnItemClickListner(OnItemClickListner listener){
        mListener = listener;
    }
}
