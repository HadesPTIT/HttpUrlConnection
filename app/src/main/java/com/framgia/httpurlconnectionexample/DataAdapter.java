package com.framgia.httpurlconnectionexample;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.framgia.httpurlconnectionexample.entity.Data;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class DataAdapter extends RecyclerView.Adapter<DataAdapter.DataViewHolder> {

    private ArrayList<Data> mDatas;
    private LayoutInflater mInflater;

    public DataAdapter(Context context, ArrayList<Data> datas) {
        mDatas = datas;
        mInflater = LayoutInflater.from(context);
    }

    @NonNull
    @Override
    public DataViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View rootView = mInflater.inflate(R.layout.item_data, parent, false);
        return new DataViewHolder(rootView);
    }

    @Override
    public void onBindViewHolder(@NonNull DataViewHolder holder, int position) {
        Data data = mDatas.get(position);
        holder.tvId.setText(String.valueOf(data.getId()));
        holder.tvNodeId.setText(String.valueOf(data.getNodeId()));
        holder.tvName.setText(data.getName());
        holder.tvFullName.setText(data.getFullName());
        holder.tvOwnerId.setText(String.valueOf(data.getOwner().getId()));
        Picasso.get().load(data.getOwner().getAvatarUrl()).into(holder.imgAvatar);
    }

    @Override
    public int getItemCount() {
        return mDatas == null ? 0 : mDatas.size();
    }

    static class DataViewHolder extends RecyclerView.ViewHolder {

        TextView tvId;
        TextView tvNodeId;
        TextView tvName;
        TextView tvFullName;
        TextView tvOwnerId;
        ImageView imgAvatar;

        public DataViewHolder(View itemView) {
            super(itemView);
            tvId = itemView.findViewById(R.id.text_id);
            tvNodeId = itemView.findViewById(R.id.text_node_id);
            tvName = itemView.findViewById(R.id.text_name);
            tvFullName = itemView.findViewById(R.id.text_full_name);
            tvOwnerId = itemView.findViewById(R.id.text_owner_id);
            imgAvatar = itemView.findViewById(R.id.image_owner_avatar);
        }
    }
}
