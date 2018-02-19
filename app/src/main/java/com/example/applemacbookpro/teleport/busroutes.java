package com.example.applemacbookpro.teleport;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.Toast;

import static android.widget.Toast.LENGTH_LONG;

public class busroutes extends AppCompatActivity {
    EditText myplace;
    EditText Destination;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_busroutes);

        myplace = (EditText) findViewById(R.id.myplace);
        Destination = (EditText) findViewById(R.id.Destination);

    }
public void onclicksearch(View view)
{
    Intent e=new Intent(this,Result.class);
    startActivity(e);
}

}

