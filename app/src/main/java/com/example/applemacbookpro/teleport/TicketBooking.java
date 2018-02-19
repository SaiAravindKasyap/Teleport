package com.example.applemacbookpro.teleport;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class TicketBooking extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ticket_booking);
    }


    public void onclickproceed(View view)
    {
        Intent e=new Intent(this,ticketfare.class);
        startActivity(e);
    }
}
