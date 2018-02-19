package com.example.applemacbookpro.teleport;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class BusPass extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bus_pass);
    }

    public void onclickgp(View view){
        Intent q=new Intent(this,BusPassFare.class);
        startActivity(q);
    }
}
