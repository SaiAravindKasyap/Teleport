package com.example.applemacbookpro.teleport;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Final extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_final);
    }
    public void onclickhome(View view)
    {
        Intent k=new Intent(this,MainActivity.class);
        startActivity(k);
    }
}
