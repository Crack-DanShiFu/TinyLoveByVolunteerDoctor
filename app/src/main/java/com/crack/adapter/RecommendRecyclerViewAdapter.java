package com.crack.adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.crack.component.RecommendItem;
import com.crack.tinylovebyvolunteerdoctor.R;

import java.util.List;

public class RecommendRecyclerViewAdapter extends RecyclerView.Adapter<RecommendRecyclerViewAdapter.ItemHolder>{
    private List<RecommendItem> mItems;

    public RecommendRecyclerViewAdapter(List<RecommendItem> mItems) {
        this.mItems = mItems;
    }

    @NonNull
    @Override
    public RecommendRecyclerViewAdapter.ItemHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return new ItemHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.recommend_item,viewGroup,false));
    }

    @Override
    public void onBindViewHolder(@NonNull RecommendRecyclerViewAdapter.ItemHolder itemHolder, int i) {
        itemHolder.recommendItemTitle.setText(mItems.get(i).getTitle());
        itemHolder.recommendItemDetails.setText(mItems.get(i).getDetails());
    }

    @Override
    public int getItemCount() {
        return mItems.size();
    }
    class ItemHolder extends RecyclerView.ViewHolder {

        TextView recommendItemTitle;
        TextView recommendItemDetails;

        ItemHolder(View item) {
            super(item);
            recommendItemTitle = item.findViewById(R.id.recommendItemTitle);
            recommendItemDetails = item.findViewById(R.id.recommendItemDetails);
        }
    }
}
