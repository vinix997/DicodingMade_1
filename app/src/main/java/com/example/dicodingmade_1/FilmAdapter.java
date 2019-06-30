package com.example.dicodingmade_1;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class FilmAdapter extends BaseAdapter {
    public Context context;

    public FilmAdapter(Context context,ArrayList<Film> ourFilms) {
        this.context = context;
        this.films = ourFilms;
    }



    public ArrayList<Film> films;
    @Override
    public int getCount() {
        return films.size() ;
    }

    @Override
    public Object getItem(int i) {
        return i;
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup parent) {
        ViewHolder holder = null;


            holder = new ViewHolder();
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = inflater.inflate(R.layout.list_film,parent,false);
            holder.imgFoto = view.findViewById(R.id.iv_img);
            holder.txtTitle = view.findViewById(R.id.tv_title);
            holder.txtDate = view.findViewById(R.id.tv_date);



        holder.imgFoto.setImageResource(films.get(i).getImage());
        holder.txtTitle.setText("Judul : "+films.get(i).getTitle());
        holder.txtDate.setText("Release Date : "+films.get(i).getDate());
        return view;
    }
    private class ViewHolder{
        private ImageView imgFoto;
        private TextView txtTitle;
        private TextView txtDate;


    }
}
