package com.example.user.testlistview;

import com.example.user.testlistview.model.Animal;

import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * Created by User on 29/10/2560.
 */

public class AnimalData {

    private static AnimalData sInstance;

    public ArrayList<Animal> animalList;
    //public int i;

    public static AnimalData getsInstance(){
        if (sInstance == null){
            sInstance = new AnimalData();
        }
        return sInstance;
    }
}
