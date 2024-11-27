package com.example.myapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.example.myapp.databinding.ActivityMainBinding;

import org.json.JSONException;
import org.json.JSONObject;

public class MainActivity extends AppCompatActivity{
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        Intent intent = new Intent(MainActivity.this,MainActivity2.class);
        startActivity(intent);

String datajson = {
        "book":{
            "imgURL": "https://www.chemicals.co.uk/blog/what-do-vv-ww-wv-mean",
                    "titel": "Hamlet",
                    "author": "Shakespeare",
                    "isPublished": "ture",
                    "puplisher": {
                "name": "simon",
                        "location":"londen"
            }



        }
}


    }


}