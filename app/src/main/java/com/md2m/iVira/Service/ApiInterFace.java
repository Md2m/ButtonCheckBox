package com.md2m.iVira.Service;

import java.util.ArrayList;

import com.md2m.iVira.Models.Category;
import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiInterFace {


    @GET("shop/categories")
    Call<ArrayList<Category>> getCategories();


}
