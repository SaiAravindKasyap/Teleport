package com.example.applemacbookpro.teleport;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class BusPassFare extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bus_pass_fare);
    }
    public void onclickpr(View view)
    {
        Intent p=new Intent(this,Payment.class);
        startActivity(p);
    }
}
