package com.chinmay.newsapp;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class ListAdapter extends ArrayAdapter<NewsItem> {


    public ListAdapter(Activity context, ArrayList<NewsItem> newsItems) {
        super(context, 0,newsItems);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listitemview=convertView;
        if (listitemview==null){
            listitemview= LayoutInflater.from(getContext()).inflate(R.layout.news_item,parent,false);

        }
        final NewsItem newsItem=getItem(position);
        TextView title=listitemview.findViewById(R.id.title);
        TextView sectname=listitemview.findViewById(R.id.sectname);
        TextView date=listitemview.findViewById(R.id.date);
        date.setText(newsItem.getWebPublicationDate());
        title.setText(newsItem.getWebTitle());
        sectname.setText(newsItem.getSectionName());

        listitemview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(
                        Intent.ACTION_VIEW,
                        Uri.parse(newsItem.getWebUrl())
                );
                getContext().startActivity(i);

            }
        });


        return listitemview;
    }
}
