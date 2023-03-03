package com.hcmute.mobile.tranthibaongocbttuan05.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.hcmute.mobile.tranthibaongocbttuan05.R;
import com.hcmute.mobile.tranthibaongocbttuan05.model.SongModel;

import java.util.List;

public class SongRecyclerViewAdapter extends BaseAdapter {

    private static final String TAG = "SongAdapter";
    private List<SongModel> mSongs;
    private Context mContext;

    public SongRecyclerViewAdapter(List<SongModel> mSongs, Context mContext, LayoutInflater mLayoutInflater) {
        this.mSongs = mSongs;
        this.mContext = mContext;
        this.mLayoutInflater = mLayoutInflater;
    }

    private LayoutInflater mLayoutInflater;


    @Override
    public int getCount() {
        return mSongs.size();
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
    public SongViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = mLayoutInflater.inflate(R.layout.row_item_song, parent, false);
        return new SongViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(SongViewHolder holder, int position) {
        SongModel song = mSongs.get(position);

        holder.tvCode.setText(song.getmCode());
        holder.tvTitle.setText(song.getmTitle());
        holder.tvLyric.setText(song.getmLyric());
        holder.tvArtist.setText(song.getmArtist());
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        return null;
    }

    class SongViewHolder extends RecyclerView.ViewHolder {
        private TextView tvCode;
        private TextView tvTitle;
        private TextView tvLyric;
        private TextView tvArtist;

        public SongViewHolder(View itemView) {
            super(itemView);
            tvCode = (TextView) itemView.findViewById(R.id.tv_code);
            tvTitle = (TextView) itemView.findViewById(R.id.tv_title);
            tvLyric = (TextView) itemView.findViewById(R.id.tv_lyric);
            tvArtist = (TextView) itemView.findViewById(R.id.tv_artist);
        }
    }
}
