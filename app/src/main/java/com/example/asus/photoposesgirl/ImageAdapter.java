package com.example.asus.photoposesgirl;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.google.firebase.storage.UploadTask;

import java.util.List;

/**
 * Created by Asus on 22-Apr-18.
 */

public class ImageAdapter extends RecyclerView.Adapter<ImageAdapter.ImageViewHolder> {

    private Context mContext;
    private List<UploadTask> mUpload;


    public ImageAdapter(Context context,List<UploadTask> Uploads){

        mContext=context;
        mUpload=Uploads;


    }

    @Override
    public ImageViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
       View v= LayoutInflater.from(mContext).inflate(R.layout.image_view,parent,false);
       return new ImageViewHolder(v);

    }

    @Override
    public void onBindViewHolder(ImageViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return mUpload.size();
    }

    public class ImageViewHolder extends RecyclerView.ViewHolder{

        public ImageView imageView;

        public ImageViewHolder(View itemView) {
            super(itemView);

            imageView=itemView.findViewById(R.id.imageView_upload);
        }
    }
}
