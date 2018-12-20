package com.example.star.retrofit.Adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.example.star.retrofit.Bean.AllService;
import com.example.star.retrofit.R;


public class RecycAdapter extends RecyclerView.Adapter<RecycAdapter.getViewHolder> {


    private Context context;
    private AllService allService;

    public RecycAdapter(Context context, AllService allService) {
        this.context = context;
        this.allService = allService;
    }

    @NonNull
    @Override
    public RecycAdapter.getViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.activity_view, viewGroup, false);
        return new getViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecycAdapter.getViewHolder getViewHolder, int i) {
//        getViewHolder.service_name.setText(allService.setServiceImages(););

    }

    @Override
    public int getItemCount() {
        return allService.getServiceImages().size();
    }

    public class getViewHolder extends RecyclerView.ViewHolder {

        TextView service_name;
        ImageView circleImageView;

        public getViewHolder(@NonNull View itemView) {
            super(itemView);
            service_name = itemView.findViewById(R.id.service_name);
            circleImageView = itemView.findViewById(R.id.circleImageView);
        }
    }
}
