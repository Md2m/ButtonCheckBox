package com.md2m.iVira;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.util.Log;

import java.util.ArrayList;

import com.md2m.iVira.Models.Category;
import com.md2m.iVira.Service.ApiClient;
import com.md2m.iVira.Service.ApiInterFace;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        ButtonCheckBox checkBox = findViewById(R.id.md2m);

        checkBox.enableAnimation(true);


        getCategory();


    }



    public void getCategory(){

        ApiInterFace interFace = ApiClient.getClient().create(ApiInterFace.class);

        Call<ArrayList<Category>> callCat = interFace.getCategories();

        callCat.enqueue(new Callback<ArrayList<Category>>() {

            @Override
            public void onResponse(Call<ArrayList<Category>> call, Response<ArrayList<Category>> response) {

                if (response.code() == 200){

                    Log.i("response >>" , response.body().toString());

                }



            }

            @Override
            public void onFailure(Call<ArrayList<Category>> call, Throwable t) {

                t.printStackTrace();

            }
        });


    }

}
