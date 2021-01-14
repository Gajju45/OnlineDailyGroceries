package com.android.gajju45.onlinedailygroceries.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.android.gajju45.onlinedailygroceries.R;
import com.android.gajju45.onlinedailygroceries.model.DiscountedProducts;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class DiscountedProductAdapter extends RecyclerView.Adapter<DiscountedProductAdapter.DiscountedProductViewHolder> {

    Context context;
    List<DiscountedProducts> discountedProductsList;

    public DiscountedProductAdapter(Context context, List<DiscountedProducts> discountedProductsList) {
        this.context = context;
        this.discountedProductsList = discountedProductsList;
    }

    @NonNull
    @Override
    public DiscountedProductViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(context).inflate(R.layout.discounted_row_item, parent, false);
        return new DiscountedProductViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull DiscountedProductViewHolder holder, int position) {

        holder.discountImageView.setImageResource(discountedProductsList.get(position).getImageurl());

    }

    @Override
    public int getItemCount() {
        return discountedProductsList.size();
    }

    //view Holeder
    public static class DiscountedProductViewHolder extends  RecyclerView.ViewHolder{

        ImageView discountImageView;
        public DiscountedProductViewHolder(@NonNull View itemView) {
            super(itemView);
            discountImageView=itemView.findViewById(R.id.discountImage);


        }
    }
}
