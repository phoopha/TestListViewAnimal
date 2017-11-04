package com.example.user.testlistview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.example.user.testlistview.Adapter.AnimalListAdapter;
import com.example.user.testlistview.model.Animal;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ListView mListView;
    private ArrayList<Animal> mData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mListView = (ListView) findViewById(R.id.list_view);

        /*AnimalData animalData = AnimalData.getsInstance();
        animalData.animalList = new ArrayList<>();

        animalData.animalList.add(new Animal("Cat", R.drawable.cat));
        animalData.animalList.add(new Animal("Dog", R.drawable.dog));
        animalData.animalList.add(new Animal("Dolphin", R.drawable.dolphin));
        animalData.animalList.add(new Animal("Rabit", R.drawable.rabbit));
        animalData.animalList.add(new Animal("Koala", R.drawable.koala));
        animalData.animalList.add(new Animal("Lion", R.drawable.lion));
        animalData.animalList.add(new Animal("Owl", R.drawable.owl));
        animalData.animalList.add(new Animal("penguin", R.drawable.penguin));
        animalData.animalList.add(new Animal("pig", R.drawable.pig));
        animalData.animalList.add(new Animal("tiger", R.drawable.tiger));*/

        mData = new ArrayList<>();

        Animal animal = new Animal("แมว (Cat)", R.drawable.cat, getString(R.string.details_cat));
        mData.add(animal);
        mData.add(new Animal("หมา (Dog)", R.drawable.dog, getString(R.string.details_dog)));
        mData.add(new Animal("โลมา (Dolphin)", R.drawable.dolphin, getString(R.string.details_dolphin)));
        mData.add(new Animal("กระต่าย (Rabit)", R.drawable.rabbit, getString(R.string.details_rabbit)));
        mData.add(new Animal("โคอาล่า (Koala)", R.drawable.koala, getString(R.string.details_koala)));
        mData.add(new Animal("สิงโต (Lion)", R.drawable.lion, getString(R.string.details_lion)));
        mData.add(new Animal("นกฮูก (Owl)", R.drawable.owl, getString(R.string.details_owl)));
        mData.add(new Animal("เพนกวิน (Penguin)", R.drawable.penguin, getString(R.string.details_penguin)));
        mData.add(new Animal("หมู (Pig)", R.drawable.pig, getString(R.string.details_pig)));
        mData.add(new Animal("เสือ (Tiger)", R.drawable.tiger, getString(R.string.details_tiger)));


        AnimalListAdapter adapter = new AnimalListAdapter(
                this,
                R.layout.item,
                mData
        );

        mListView.setAdapter(adapter);

        mListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int i, long l) {
                Animal animal = mData.get(i);
                Toast.makeText(MainActivity.this, animal.name, Toast.LENGTH_LONG).show();

                Intent intent = new Intent(MainActivity.this, AnimalDetailsActivity.class);
                intent.putExtra("name", animal.name);
                intent.putExtra("picture", animal.picture);
                intent.putExtra("niphawan", animal.detail);
                startActivity(intent);
            }
        });
    }
}
