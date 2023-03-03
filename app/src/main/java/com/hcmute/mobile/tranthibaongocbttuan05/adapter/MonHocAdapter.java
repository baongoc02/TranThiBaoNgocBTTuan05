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

public class MonHocAdapter extends BaseAdapter {
    //khai báo
    private Context context;
    private int layout;
    private List<MonHoc> monHocList;

    public MonHocAdapter(Context context, int layout, List<MonHoc> monHocList) {
        this.context = context;
        this.layout = layout;
        this.monHocList = monHocList;
    }

    @Override
    public int getCount() {
        return this.monHocList.size();
    }

    @Override
    public Object getItem(int i) {
        return this.monHocList.get(i);
    }

    @Override
    public long getItemId(int i) {
        //TODO: i don't know
        return 0;
    }

    /**
     * Đem list ở trên (listMonHoc) for, mỗi lần for gọi hàm này
     * @param i
     * @param view
     * @param viewGroup
     * @return
     */
    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        //Lấy layout ra
        //view <-> (ánh xạ) <-> 1 row (row_monHoc.xml)
        LayoutInflater inflater = (LayoutInflater)this.context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        view = inflater.inflate(this.layout, null);

        //Lấy dữ liệu như onCreate(..)
        TextView textViewMonHocName = view.findViewById(R.id.txtMonHocName);
        TextView textViewMonHocDescription = view.findViewById(R.id.txtMonHocDescription);
        ImageView imagePic = (ImageView) view.findViewById(R.id.imagePic);
        //Đẩy data vào
        MonHoc monHoc = this.monHocList.get(i);
        textViewMonHocName.setText(monHoc.getName());
        textViewMonHocDescription.setText(monHoc.getDesc());
        imagePic.setImageResource(monHoc.getPic());

        return view;
    }
}
