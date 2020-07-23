package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recycler_view);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        layoutManager.setOrientation(LinearLayoutManager.VERTICAL);

        recyclerView.setLayoutManager(layoutManager);
        List<ModelClass> modelClassList = new ArrayList<>();
        modelClassList.add(new ModelClass(R.drawable.krishna,"Picture 1","Radha Krishna"));
        modelClassList.add(new ModelClass(R.drawable.birds,"Picture 2","Birds"));
        modelClassList.add(new ModelClass(R.drawable.night,"Picture 3","Night"));
        modelClassList.add(new ModelClass(R.drawable.zebra,"Picture 4","Zebra"));
        modelClassList.add(new ModelClass(R.drawable.buddha,"Picture 5","Gautam Buddha"));
        modelClassList.add(new ModelClass(R.drawable.girl,"Picture 6","Girl"));
        modelClassList.add(new ModelClass(R.drawable.cycle,"Picture 7","Bicycle"));
        modelClassList.add(new ModelClass(R.drawable.ganesha,"Picture 8","Ganesha"));

 Adapter adapter = new Adapter(modelClassList);
 recyclerView.setAdapter(adapter);
 adapter.notifyDataSetChanged();
    }
}
