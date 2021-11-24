package com.example.lofosdu.adapter;

import android.app.Activity;
import android.app.ActivityOptions;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.recyclerview.widget.RecyclerView;

import com.example.lofosdu.ItemPage;
import com.example.lofosdu.R;
import com.example.lofosdu.model.Item;

import org.jetbrains.annotations.NotNull;

import java.util.List;

public class ItemAdapter extends RecyclerView.Adapter<ItemAdapter.CourseViewHolder>{
    Context context;
    List<Item> items;

    public ItemAdapter(Context context, List<Item> items) {
        this.context = context;
        this.items = items;
    }

    @NonNull
    @NotNull
    @Override
    public CourseViewHolder onCreateViewHolder(@NonNull @NotNull ViewGroup parent, int viewType) {
        View courseItems = LayoutInflater.from(context).inflate(R.layout.item_item,parent,false);
        return new ItemAdapter.CourseViewHolder(courseItems);
    }

    @Override
    public void onBindViewHolder(@NonNull @NotNull ItemAdapter.CourseViewHolder holder, int position) {
        int imageId = context.getResources().getIdentifier("phone","drawable",context.getPackageName());
        holder.itemImage.setImageResource(imageId);

        int avaId = context.getResources().getIdentifier("dropbox","drawable",context.getPackageName());
        holder.ava.setImageResource(avaId);

        holder.itemTitle.setText(items.get(position).getTitle());
        holder.date.setText(items.get(position).getDate());
        holder.status.setText(items.get(position).getStatus());
        holder.location.setText(items.get(position).getLocation());
        holder.eType.setText(items.get(position).geteType());
        holder.name.setText(items.get(position).getName());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, ItemPage.class);

//                ActivityOptions options = ActivityOptions.makeSceneTransitionAnimation(
//                        (Activity)context,
//                        new Pair<View,String>(holder.itemImage,"itemImage")
//                );


                intent.putExtra("itemImage",imageId);
                intent.putExtra("itemAva",avaId);
                intent.putExtra("itemTitle",items.get(position).getTitle());
                intent.putExtra("itemDate",items.get(position).getDate());
                intent.putExtra("itemStatus",items.get(position).getStatus());
                intent.putExtra("itemLocation",items.get(position).getLocation());
                intent.putExtra("itemEType",items.get(position).geteType());
                intent.putExtra("itemName",items.get(position).getName());

                context.startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return items.size();
    }


    public class CourseViewHolder extends RecyclerView.ViewHolder{
        ImageView itemImage,ava;
        TextView itemTitle,location,status,name,eType,date;
        public CourseViewHolder(@NonNull @NotNull View itemView) {
            super(itemView);

            itemImage =itemView.findViewById(R.id.itemImg);
            itemTitle = itemView.findViewById(R.id.itemTitle);
            location = itemView.findViewById(R.id.itemLocation);
            status = itemView.findViewById(R.id.itemStatus);
            name = itemView.findViewById(R.id.name);
            eType = itemView.findViewById(R.id.eType);
            date = itemView.findViewById(R.id.itemDate);
            ava = itemView.findViewById(R.id.ava);

        }
    }
}
