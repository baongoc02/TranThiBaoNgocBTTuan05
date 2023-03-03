package com.hcmute.mobile.tranthibaongocbttuan05.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.hcmute.mobile.tranthibaongocbttuan05.R;
import com.hcmute.mobile.tranthibaongocbttuan05.model.MonHoc;

import java.util.List;

public class MonHocGridViewAdapter extends BaseAdapter {
    private Context context;
    private int layout;

    public MonHocGridViewAdapter(Context context, int layout, List<MonHoc> monHocList) {
        this.context = context;
        this.layout = layout;
        this.monHocList = monHocList;
    }

    public Context getContext() {
        return context;
    }

    public void setContext(Context context) {
        this.context = context;
    }

    public int getLayout() {
        return layout;
    }

    public void setLayout(int layout) {
        this.layout = layout;
    }

    public List<MonHoc> getMonHocList() {
        return monHocList;
    }

    public void setMonHocList(List<MonHoc> monHocList) {
        this.monHocList = monHocList;
    }

    private List<MonHoc> monHocList;

    @Override
    public int getCount() {
        return monHocList.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        LayoutInflater inflater = (LayoutInflater)
                context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        view = inflater.inflate(layout, null);

        TextView textName = (TextView) view.findViewById(R.id.textName);
        TextView textDesc = (TextView) view.findViewById(R.id.textDesc);
        ImageView imagePic = (ImageView) view.findViewById(R.id.imagePic);
        MonHoc monHoc = monHocList.get(i);
        textName.setText(monHoc.getName());
        textDesc.setText(monHoc.getDesc());
        imagePic.setImageResource(monHoc.getPic());

        return view;

    }
}
