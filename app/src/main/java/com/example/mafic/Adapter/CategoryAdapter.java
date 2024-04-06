package com.example.mafic.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import com.example.mafic.Domain.CategoryDomain;
import com.example.mafic.R;

import java.util.ArrayList;

public class CategoryAdapter extends RecyclerView.Adapter<CategoryAdapter.ViewHolder> {
    ArrayList<CategoryDomain> categoryDomais;

    public CategoryAdapter(ArrayList<CategoryDomain> categoryDomains) {
      this.categoryDomais = categoryDomains;
    }
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType){
      View inflate = LayoutInflater.from(parent.getContext()).inflate(R.layout.viewholder_category, parent, false);
      return new ViewHolder(inflate);
    }
    @Override
    public void  onBindViewHolder(@NonNull ViewHolder holder, int position) {
           holder.categoryName.setText(categoryDomais.get(position).getTitle());
           String picUrl;
           switch (position){
               case 0: {
                   picUrl="cat_1";
                   break;
               }
               case 1: {
                   picUrl="cat_2";
                   break;
               }
               case 2: {
                   picUrl="cat_3";
                   break;
               }
               case 3: {
                   picUrl="cat_4";
                   break;
               }
               case 4: {
                   picUrl="cat_5";
                   break;
               }
           }

        //int drawableReourceId=holder.itemView.getContext().getResources().getIdentifier(picUrl, defType: "drawable", holder.itemView.getContext().getPackageName());
    }
    @Override
    public int getItemCount(){ return categoryDomais.size();}

    public class ViewHolder extends RecyclerView.ViewHolder {
      TextView categoryName;
      ImageView categotyPic;
      ConstraintLayout mainLayout;
      public ViewHolder (@NonNull View itemView) {
        super(itemView);
       // categoryName=itemView.findViewById(R.id.categoryName);
        //categotyPic=itemView.findViewById(R.id.categoryPic);
        //mainLayout=itemView.findViewById(R.id.mainLayout);
      }
    }

 }

