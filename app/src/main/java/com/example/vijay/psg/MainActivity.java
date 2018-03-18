package com.example.vijay.psg;

import android.support.annotation.IntegerRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.google.android.gms.tasks.Task;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.HashMap;

public class MainActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        FirebaseDatabase database=FirebaseDatabase.getInstance();
        DatabaseReference ref=database.getReference("USERS");
        HashMap<String,Integer> a=new HashMap<String, Integer>();
        HashMap<String,Integer> a1=new HashMap<String, Integer>();
        a1.put("2",4);
        a.put("sda",2);
        ref.setValue(a);
        ref.setValue(a1);
    }
}
