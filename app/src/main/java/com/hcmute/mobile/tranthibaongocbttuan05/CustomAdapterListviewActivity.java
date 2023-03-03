package com.hcmute.mobile.tranthibaongocbttuan05;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import com.hcmute.mobile.tranthibaongocbttuan05.adapter.MonHocAdapter;
import com.hcmute.mobile.tranthibaongocbttuan05.model.MonHoc;

import java.util.ArrayList;

public class CustomAdapterListviewActivity extends AppCompatActivity {
    ListView monHocListView;
    ArrayList<MonHoc> listMonHoc;
    MonHocAdapter adapter;
    EditText editText1;

    private void AnhXa() {
        monHocListView = (ListView) findViewById(R.id.listViewMonHoc);

        listMonHoc = new ArrayList<>();
        listMonHoc.add(new MonHoc("Java", "Java 1", R.drawable.wallet_icon));
        listMonHoc.add(new MonHoc("C#", "C# 1", R.drawable.wallet_icon));
        listMonHoc.add(new MonHoc("PHP", "PHP 1", R.drawable.wallet_icon));
        listMonHoc.add(new MonHoc("Kotlin", "Kotlin 1", R.drawable.wallet_icon));
        listMonHoc.add(new MonHoc("Dart", "Dart 1", R.drawable.wallet_icon));
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_adapter_list_view);

        AnhXa();

        adapter = new MonHocAdapter(CustomAdapterListviewActivity.this,
                R.layout.row_monhoc,
                listMonHoc
        );

        monHocListView.setAdapter(adapter);
    }
}

