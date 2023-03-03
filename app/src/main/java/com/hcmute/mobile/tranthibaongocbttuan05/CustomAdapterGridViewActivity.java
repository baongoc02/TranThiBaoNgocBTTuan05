package com.hcmute.mobile.tranthibaongocbttuan05;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.hcmute.mobile.tranthibaongocbttuan05.adapter.MonHocAdapter;
import com.hcmute.mobile.tranthibaongocbttuan05.adapter.MonHocGridViewAdapter;
import com.hcmute.mobile.tranthibaongocbttuan05.model.MonHoc;

import java.util.ArrayList;

public class CustomAdapterGridViewActivity extends AppCompatActivity {
    GridView gridView;
    ArrayList<MonHoc> arrayList;
    MonHocGridViewAdapter adapter;

    private void AnhXa() {
        gridView = (GridView) findViewById(R.id.listGridMonHoc);

        arrayList = new ArrayList<>();
        arrayList.add(new MonHoc("Java", "Java 1", R.drawable.wallet_icon));
        arrayList.add(new MonHoc("C#", "C# 1", R.drawable.bubble_icon));
        arrayList.add(new MonHoc("PHP", "PHP 1", R.drawable.badge_icon));
        arrayList.add(new MonHoc("Kotlin", "Kotlin 1", R.drawable.archive_icon));
        arrayList.add(new MonHoc("Dart", "Dart 1", R.drawable.badge_icon));
    }


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_adapter_grid_view);

        AnhXa();

        adapter = new MonHocGridViewAdapter(CustomAdapterGridViewActivity.this,
                R.layout.row_monhoc_gridview,
                arrayList
        );

        gridView.setAdapter(adapter);

//        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
//                Toast.makeText(CustomAdapterGridViewActivity.this, "Bạn đã chọn" + i + " - " + arrayList.get(i), Toast.LENGTH_SHORT).show();
//            }
//        });
//
//        gridView.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
//            @Override
//            public boolean
//            onItemLongClick(AdapterView<?> adapterView,
//                            View view, int i, long l) {
//                Toast.makeText(CustomAdapterGridViewActivity.this, "Bạn đang nhấn giữ" + i + " - " + arrayList.get(i),
//                        Toast.LENGTH_SHORT).show();
//                return false;
//            }
//        });
    }
}
