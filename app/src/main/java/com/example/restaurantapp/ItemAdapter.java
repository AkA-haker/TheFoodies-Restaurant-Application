package com.example.restaurantapp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ItemAdapter extends RecyclerView.Adapter<ItemAdapter.ItemsDisplayAdapter> {
    private Dish[] items;

    public ItemAdapter(Dish[] items) {
        this.items = items;
    }

    @Override
    public int getItemCount() {
        return items.length;
    }

    @NonNull
    @Override
    public ItemsDisplayAdapter onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_item, parent, false);

        return new ItemsDisplayAdapter(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ItemsDisplayAdapter holder, int position) {

        holder.bind(items[position]);
    }

    static class ItemsDisplayAdapter extends RecyclerView.ViewHolder {
        TextView itemName;
        TextView itemDescription;
        TextView itemPrice;
        ImageView itemImage;
        RatingBar rating;

        public ItemsDisplayAdapter(@NonNull View itemView) {
            super(itemView);
            itemName = itemView.findViewById(R.id.text_view_item_name);
            itemDescription = itemView.findViewById(R.id.text_view_item_description);
            itemPrice = itemView.findViewById(R.id.text_view_item_price);
            itemImage = itemView.findViewById(R.id.image_view_image);
            rating=itemView.findViewById(R.id.rating_bar_rating);

        }

        public void bind(Dish items) {
            itemName.setText(items.title);
            itemDescription.setText(items.description);
            itemPrice.setText(items.price);
            itemImage.setImageResource(items.image);
            rating.setRating(items.raring);

        }
    }
}
