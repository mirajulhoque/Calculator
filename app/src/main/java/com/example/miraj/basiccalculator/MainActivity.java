package com.example.miraj.basiccalculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btnPlus,btnSub,btnMulti,btnDiv,btnClear,btnMiraj;
    TextView txtResult;
    EditText etxtNumber1,etxtNumber2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtResult=findViewById(R.id.txt_result);
        btnPlus=findViewById(R.id.btn_plus);
        btnSub=findViewById(R.id.btn_sub);
        btnMulti=findViewById(R.id.btn_multi  );
        btnDiv=findViewById(R.id.btn_div);
        btnClear=findViewById(R.id.btn_clear);
        btnMiraj=findViewById(R.id.btn_miraj);

        etxtNumber1=findViewById(R.id.etxt_number1);
        etxtNumber2=findViewById(R.id.etxt_number2);

        btnPlus.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String value1=etxtNumber1.getText().toString();
                String value2=etxtNumber2.getText().toString();

                if (!value1.isEmpty() && !value2.isEmpty()) {
                    double n1=Double.parseDouble(value1);
                    double n2=Double.parseDouble(value2);
                    double result=n1+n2;

                    txtResult.setText(""+result);

                }

            }




        });
        btnMulti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String value1=etxtNumber1.getText().toString();
                String value2=etxtNumber2.getText().toString();

                if (!value1.isEmpty() && !value2.isEmpty()) {
                    double n1=Double.parseDouble(value1);
                    double n2=Double.parseDouble(value2);
                    double result=n1*n2;

                    txtResult.setText(""+result);

                }
            }


        });
        btnSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String value1=etxtNumber1.getText().toString();
                String value2=etxtNumber2.getText().toString();

                if (!value1.isEmpty() && !value2.isEmpty()) {
                    double n1=Double.parseDouble(value1);
                    double n2=Double.parseDouble(value2);
                    double result=n1-n2;

                    txtResult.setText(""+result);

                }


            }
        });
        btnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String value1=etxtNumber1.getText().toString();
                String value2=etxtNumber2.getText().toString();

                if(!value1.isEmpty()&& !value2.isEmpty()) {
                    double n1=Double.parseDouble(value1);
                    double n2=Double.parseDouble(value2);
                    double result=n1/n2;

                    txtResult.setText(""+result);

                }

            }




        });
        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                txtResult.setText("0");
                etxtNumber1.setText("");
                etxtNumber2.setText("");

            }





        });


        btnMiraj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,MirajActivity.class);
                intent.putExtra("Miraj","MIRAJ");
                Toast.makeText(MainActivity.this, "MIRAJUL HOQ", Toast.LENGTH_SHORT).show();
                startActivity(intent);

            }
        });


    }
}
