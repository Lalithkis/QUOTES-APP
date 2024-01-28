package com.example.quoteapp.categories;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.quoteapp.R;
import com.example.quoteapp.quotes;

import java.util.ArrayList;
import java.util.List;

public class CategoriesAdapter extends RecyclerView.Adapter<CategoriesAdapter.MyViewHolder>{
    private final List<listcategories>list;

    private final Context context;
    private final List<listcategories> listcategories = new ArrayList<listcategories>();


    public CategoriesAdapter(List<listcategories> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new MyViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.categories_adapter_layout,null));
    }

    @Override
    public void onBindViewHolder(@NonNull CategoriesAdapter.MyViewHolder holder, int position) {

        listcategories list2 = list.get(position);

        holder.CN.setText(list2.getCategoryName());
        holder.categoryImage.setImageResource(list2.getCategoryImg());
        holder.rootLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent action;
                Intent intent = new Intent(context, quotes.class);

                String name;
                intent.putExtra("name",list2.getCategoryName());

                context.startActivity(intent);

            }
        });
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    static class MyViewHolder extends RecyclerView.ViewHolder {
        private final TextView CN;
        private final ImageView categoryImage;
        private final CardView rootLayout;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            CN = itemView.findViewById(R.id.CN);
            categoryImage = itemView.findViewById(R.id.categoryImage);
            rootLayout = itemView.findViewById(R.id.rootlayout);
        }
    }
}
