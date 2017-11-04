package com.example.user.testlistview.Adapter;

import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.user.testlistview.R;
import com.example.user.testlistview.model.Animal;

import java.util.ArrayList;

/**
 * Created by User on 29/10/2560.
 */

public class AnimalListAdapter extends ArrayAdapter<Animal>{

    private Context mContext;
    private int mLayoutResId;
    private ArrayList<Animal> mAnimalsList;

    public AnimalListAdapter(@NonNull Context context, @LayoutRes int resource, @NonNull ArrayList<Animal> objects) {
        super(context, resource, objects);

        this.mContext = context;
        this.mAnimalsList = objects;
        this.mLayoutResId = resource;

    }

    // กด Ctrl+O
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = LayoutInflater.from(mContext);
        View v = inflater.inflate(mLayoutResId, null);
        //v.findViewById(R.id.imageView);
        ImageView iv = (ImageView) v.findViewById(R.id.imageView);
        TextView tv = (TextView) v.findViewById(R.id.textView);

        Animal animal = mAnimalsList.get(position);

        iv.setImageResource(animal.picture);
        tv.setText(animal.name);

        return v;
    }
}
