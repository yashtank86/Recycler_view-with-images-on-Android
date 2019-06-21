package com.tanky.recycler_image_view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerView.LayoutManager layoutManager;
    private Recycler_Adapter recycler_adapter;

    private int[] images_array = {R.drawable.image_1,R.drawable.image_2,R.drawable.image_3,R.drawable.image_4,R.drawable.image_5,
    R.drawable.image_6,R.drawable.image_7,R.drawable.image_8,R.drawable.image_9, R.drawable.image_10, R.drawable.image_11,
            R.drawable.image_12,R.drawable.image_13,R.drawable.image_14,R.drawable.image_15,R.drawable.image_16};



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recycler_view);
        layoutManager = new GridLayoutManager(this,2);
        recyclerView.setLayoutManager(layoutManager);

        recycler_adapter = new Recycler_Adapter(images_array);
        recyclerView.setAdapter(recycler_adapter);
    }
}
