package com.example.applemacbookpro.teleport;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.MultiFormatWriter;
import com.google.zxing.WriterException;
import com.google.zxing.common.BitMatrix;
import com.journeyapps.barcodescanner.BarcodeEncoder;

import  android.graphics.Bitmap;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.view.menu.ActionMenuItemView;
import android.text.Html;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.MultiFormatWriter;
import com.google.zxing.WriterException;
import com.google.zxing.common.BitMatrix;
import com.journeyapps.barcodescanner.BarcodeEncoder;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

import static android.icu.lang.UCharacter.GraphemeClusterBreak.V;

public class QrGenerator extends AppCompatActivity {
    TextView text;
    EditText text1;
    Button btn1;
    ImageView image;
    String text2Qr;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_qrgenerator);


        text=(TextView)findViewById(R.id.text);
        text1=(EditText) findViewById(R.id.text1);
        btn1=(Button)findViewById(R.id.btn1);
        image=(ImageView)findViewById(R.id.image);

        RequestTask requestTask =  new RequestTask(text1);
        requestTask.execute("http://192.168.43.47/conn.php");


        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text2Qr=text1.getText().toString().trim();
                MultiFormatWriter multiFormatWriter=new MultiFormatWriter();
                try{
                    BitMatrix bitMatrix=multiFormatWriter.encode(text2Qr, BarcodeFormat.QR_CODE,200,200);
                    BarcodeEncoder barcodeEncoder=new BarcodeEncoder();
                    Bitmap bitmap=barcodeEncoder.createBitmap(bitMatrix);
                    image.setImageBitmap(bitmap);
                }
                catch (WriterException e)
                {
                    e.printStackTrace();
                }
            }
        });



    }
    public void onclickverify(View view)
    {
        Intent l=new Intent(this,Final.class);
        startActivity(l);
    }

}
