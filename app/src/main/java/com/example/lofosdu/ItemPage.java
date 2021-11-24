package com.example.lofosdu;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

public class ItemPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item_page);

        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM);
            actionBar.setCustomView(R.layout.action_item_title);
            actionBar.setDisplayHomeAsUpEnabled(true);
        }



        ImageView itemImg = findViewById(R.id.itemImg);

        TextView itemTitle = findViewById(R.id.itmTitle);
        TextView location = findViewById(R.id.item_loc);
        TextView description = findViewById(R.id.description);

        ImageView itemAva = findViewById(R.id.item_ava);

        TextView itemName = findViewById(R.id.itemName);
        TextView eType = findViewById(R.id.eType);
        TextView itemStatus = findViewById(R.id.itemStatus);
        TextView itemDate = findViewById(R.id.itemDate);

        itemImg.setImageResource(getIntent().getIntExtra("itemImage",0));
        itemAva.setImageResource(getIntent().getIntExtra("itemAva",0));

        itemTitle.setText(getIntent().getStringExtra("itemTitle"));
        location.setText(getIntent().getStringExtra("itemLocation"));
//        description.setText(getIntent().getStringExtra("itemDescription"));
        itemName.setText(getIntent().getStringExtra("itemName"));
        eType.setText(getIntent().getStringExtra("itemEType"));
        itemStatus.setText(getIntent().getStringExtra("itemStatus"));
        itemDate.setText(getIntent().getStringExtra("itemDate"));
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.actionmenu,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if(item.getItemId() ==android.R.id.home){
            onBackPressed();
            return true;
        }
        else {
            Intent intent = new Intent(Intent.ACTION_SEND);
            intent.setType("text/plain");
            intent.putExtra(Intent.EXTRA_SUBJECT, "Is it your lost item?");
            startActivity(Intent.createChooser(intent, "Share via"));
            return super.onOptionsItemSelected(item);
        }
    }
}