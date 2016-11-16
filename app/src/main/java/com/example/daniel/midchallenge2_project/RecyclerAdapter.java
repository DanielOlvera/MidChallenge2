package com.example.daniel.midchallenge2_project;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.daniel.midchallenge2_project.entities.SearchResult;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by Daniel on 11/16/16.
 */

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.RecyclerVwHoldr>{

    List<SearchResult> searchResultList;
    Context context;

    public RecyclerAdapter(List<SearchResult> searchResultList, Context context) {
        this.searchResultList = searchResultList;
        this.context = context;
    }

    @Override
    public RecyclerVwHoldr onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater
                    .from(parent.getContext())
                    .inflate(R.layout.itemrecycler, parent, false);

        RecyclerVwHoldr viewHolder = new RecyclerVwHoldr(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(RecyclerVwHoldr holder, int position) {
        holder.txtVw.setText(searchResultList.get(position).getListing().getName());
    }

    @Override
    public int getItemCount() {
        return searchResultList.size();
    }

    @Override
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
    }

    public class RecyclerVwHoldr extends RecyclerView.ViewHolder{

        @BindView(R.id.ir_txtVw)
        TextView txtVw;

        public RecyclerVwHoldr(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }
    }
}
