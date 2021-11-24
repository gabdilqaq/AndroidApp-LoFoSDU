package com.example.lofosdu;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.ActionBar;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.lofosdu.adapter.CategoryAdapter;
import com.example.lofosdu.adapter.ItemAdapter;
import com.example.lofosdu.model.Category;
import com.example.lofosdu.MainActivity;
import com.example.lofosdu.model.Item;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

public class HomeFragment extends Fragment {

    RecyclerView categoryRecycler;
    CategoryAdapter categoryAdapter;

    static ItemAdapter itemAdapter;
    static List<Item> itemList = new ArrayList<>();
    RecyclerView itemRecycler;



    @Nullable
    @org.jetbrains.annotations.Nullable
    @Override
    public View onCreateView(@NonNull @NotNull LayoutInflater inflater, @Nullable @org.jetbrains.annotations.Nullable ViewGroup container, @Nullable @org.jetbrains.annotations.Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_home, container, false);


        return view;

    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        //recycler
        List<Category> categoryList = new ArrayList<>();
        categoryList.add(new Category(1,"Mobile"));
        categoryList.add(new Category(2,"Documents"));
        categoryList.add(new Category(3,"Charger"));
        categoryList.add(new Category(4,"Laptop"));
        categoryList.add(new Category(5,"Earphone"));
        categoryList.add(new Category(6,"Card"));

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getContext(),RecyclerView.HORIZONTAL, false);
        categoryRecycler = (RecyclerView) view.findViewById(R.id.categoryRecycler);
        categoryRecycler.setLayoutManager(layoutManager);

        // define an adapter
        categoryAdapter = new CategoryAdapter(getContext(), categoryList);
        categoryRecycler.setAdapter(categoryAdapter);

        itemList.add(new Item(1,"I lost my iphone at university","f101","lost","Bella Smith","1","student","phone","11.09.2021"));
        itemList.add(new Item(2,"I lost my iphone at university","f101","lost","Bella Smith","1","student","phone","11.09.2021"));
        itemList.add(new Item(3,"I lost my iphone at university","f101","lost","Bella Smith","1","student","phone","11.09.2021"));
        itemList.add(new Item(4,"I lost my iphone at university","f101","lost","Bella Smith","1","student","phone","11.09.2021"));
        itemList.add(new Item(5,"I lost my iphone at university","f101","lost","Bella Smith","1","student","phone","11.09.2021"));
        itemList.add(new Item(6,"I lost my iphone at university","f101","lost","Bella Smith","1","student","phone","11.09.2021"));
        itemList.add(new Item(7,"I lost my iphone at university","f101","lost","Bella Smith","1","student","phone","11.09.2021"));
        itemList.add(new Item(8,"I lost my iphone at university","f101","lost","Bella Smith","1","student","phone","11.09.2021"));

        RecyclerView.LayoutManager layoutManager2 = new LinearLayoutManager(getContext(),RecyclerView.VERTICAL, false);
        itemRecycler = view.findViewById(R.id.itemRecycler);
        itemRecycler.setLayoutManager(layoutManager2);

        itemAdapter = new ItemAdapter(getContext(),itemList);
        itemRecycler.setAdapter(itemAdapter);



    }


}
