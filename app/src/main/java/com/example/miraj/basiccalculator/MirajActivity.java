package com.example.miraj.basiccalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

public class MirajActivity extends AppCompatActivity {
    ImageView imageView;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_miraj);

        imageView=findViewById(R.id.imageId);
        textView=findViewById(R.id.textId);

        String getMiraj=getIntent().getExtras().getString("Miraj");

        Log.d("Miraj",getMiraj);

        if (getMiraj.equals("Miraj"))
        {
            imageView.setImageResource(R.drawable.miiii);
            textView.setText("MIRAJUL HOQ");
        }
    }
}
