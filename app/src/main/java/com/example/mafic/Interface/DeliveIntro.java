package com.example.mafic.Interface;

import android.os.Bundle;
import android.widget.LinearLayout;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.mafic.Domain.CategoryDomain;
import com.example.mafic.R;

import java.util.ArrayList;

public class DeliveIntro extends AppCompatActivity {
private RecyclerView.Adapter adapter, adapter2;
private RecyclerView recyclerViewCategotyList,recyclerViewPopularList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_delive_intro);

        recyclerViewCategoty();

    }

    private void recyclerViewCategoty() {
        LinearLayoutManager linearLayoutManager=new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        recyclerViewCategotyList=findViewById(R.id.View1);
        recyclerViewCategotyList.setLayoutManager(linearLayoutManager);

        ArrayList< CategoryDomain> categoryList=new ArrayList<>();
        categoryList.add(new CategoryDomain("Pizza", "cat_1"));
        categoryList.add(new CategoryDomain("Hamburguesas", "cat_2"));
        categoryList.add(new CategoryDomain("P  ollo sazonado", "cat_3"));
        categoryList.add(new CategoryDomain("Bebidas", "cat_4"));
        categoryList.add(new CategoryDomain("Bocadillos", "cat_5"));

        //adapter=

    }
}