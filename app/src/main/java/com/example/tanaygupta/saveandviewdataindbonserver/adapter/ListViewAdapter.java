package com.example.tanaygupta.saveandviewdataindbonserver.adapter;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.example.tanaygupta.saveandviewdataindbonserver.R;
import com.example.tanaygupta.saveandviewdataindbonserver.model.CategoryTO;

import java.util.List;

public class ListViewAdapter extends ArrayAdapter<CategoryTO> {

    private final Activity context;
    private final List<CategoryTO> categories;
    public ListViewAdapter(Activity context,List<CategoryTO> categories){
        super(context, R.layout.list_view_row,categories);
        this.context = context;
        this.categories = categories;
    }

    @Override
    public int getCount() {
        if(categories!=null){
            return categories.size();
        }
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();
        View row = inflater.inflate(R.layout.list_view_row,null,true);
        TextView tv1 = (TextView)row.findViewById(R.id.tv_name);
        TextView tv2 = (TextView)row.findViewById(R.id.tv_name);
        if(categories!=null && position < categories.size()){
            CategoryTO ct = categories.get(position);
            tv1.setText(ct.getName());
            tv2.setText(ct.getClass_name());
        }
        return row;
    }

}
