package com.hcmute.mobile.tranthibaongocbttuan05;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.hcmute.mobile.tranthibaongocbttuan05.adapter.MonHocAdapter;
import com.hcmute.mobile.tranthibaongocbttuan05.model.MonHoc;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends AppCompatActivity {
    AppCompatButton btnListView, btnGridView, btnRecycleView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnListView = findViewById(R.id.baitap_listview);
        btnGridView = findViewById(R.id.baitap_gridview);
        btnRecycleView = findViewById(R.id.baitap_recycleview);

        btnListView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, CustomAdapterListviewActivity.class);
                startActivity(intent);
            }
        });

        btnGridView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, CustomAdapterGridViewActivity.class);
                startActivity(intent);
            }
        });

        btnRecycleView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, RecyclerViewActivity.class);
                startActivity(intent);
            }
        });
    }
}