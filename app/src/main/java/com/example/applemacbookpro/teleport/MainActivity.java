package com.example.applemacbookpro.teleport;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onclickbr(View view)
    {
        Intent a=new Intent(this,busroutes.class);
        startActivity(a);
    }
    public void onclicktb(View view)
    {
        Intent b=new Intent(this,busroutes.class);
        startActivity(b);
    }
    public void onclickmenu(View view)
    {
        Intent g=new Intent(this,history.class);
        startActivity(g);
    }
    public void onclickbp(View view)
    {
        Intent o=new Intent(this,BusPass.class);
        startActivity(o);
    }
}
