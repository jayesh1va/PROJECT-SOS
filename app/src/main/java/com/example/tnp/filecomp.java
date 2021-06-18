package com.example.tnp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;


public class filecomp extends AppCompatActivity {
    Button back,report;
    EditText naame,number,adhaar,numcriminals,ativity,spot;
    RadioGroup radioGroup;
    RadioButton selectedbutton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fcomp);
        report=findViewById(R.id.button);
        naame=findViewById(R.id.editText);
        number=findViewById(R.id.editText3);
        adhaar=findViewById(R.id.editText2);
        numcriminals=findViewById(R.id.edit);
        ativity=findViewById(R.id.editText4);
        spot=findViewById(R.id.editText5);


        report.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (naame.getText().toString().equals("")){
                    naame.setError("enter a valid name");
                }
                else if (number.getText().toString().equals("")){
                    number.setError("enter a valid mobile number");
                }
                else if (adhaar.getText().toString().equals("")){
                    adhaar.setError("enter a valid adhaar number");
                }
                else if (numcriminals.getText().toString().equals("")){
                    numcriminals.setError("enter a valid number");
                }
                else if (ativity.getText().toString().equals("")){
                    ativity.setError("enter a valid activity");
                }
                else if (spot.getText().toString().equals("")){
                    spot.setError("enter a valid address");
                }
                else{
                    Intent status = new Intent(filecomp.this, status.class);
                    startActivity(status);
                }
            }
        });

    }

}
