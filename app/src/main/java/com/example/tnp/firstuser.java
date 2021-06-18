package com.example.tnp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class firstuser extends AppCompatActivity {
    EditText name,mobile,aadhar,re1,re2,rem1,rem2,addr,ret1,ret2;
    TextView alert;
    Button sumb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_firstuser);
        name=findViewById(R.id.editTextTextPersonName9);
        mobile=findViewById(R.id.editTextTextPersonName3);
        aadhar=findViewById(R.id.editTextTextPersonName4);
        addr=findViewById(R.id.editTextTextPersonName);
        re1=findViewById(R.id.editTextTextPersonName6);
        re2=findViewById(R.id.editTextTextPersonName10);
        rem1=findViewById(R.id.editTextTextPersonName2);
        rem2=findViewById(R.id.editTextTextPersonName8);
        ret1=findViewById(R.id.editTextTextPersonName7);
        ret2=findViewById(R.id.editTextTextPersonName5);
//        alert=findViewById(R.id.textView18);
        sumb=findViewById(R.id.button2);

        sumb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (name.getText().toString().equals("")){
                    name.setError("enter a valid name");
                }
                else if (mobile.getText().toString().equals("")){
                    mobile.setError("enter a valid mobile number");
                }
                else if (aadhar.getText().toString().equals("")){
                    aadhar.setError("enter a valid adhaar number");
                }
                else if (addr.getText().toString().equals("")){
                    addr.setError("enter a valid address");
                }
                else if (re1.getText().toString().equals("")){
                    re1.setError("enter a valid name");
                }
                else if (re2.getText().toString().equals("")){
                    re2.setError("enter a valid name");
                }
                else if (rem1.getText().toString().equals("")){
                    rem1.setError("enter a valid mobile number");
                }
                else if (rem2.getText().toString().equals("")){
                    rem2.setError("enter a valid mobile number");
                }
                else if (ret1.getText().toString().equals("")){
                    ret1.setError("enter a valid type");
                }
                else if (ret2.getText().toString().equals("")){
                    ret2.setError("enter a valid type");
                }
                else {
                    Toast.makeText(firstuser.this,"Info Submmited Sucessfully",Toast.LENGTH_SHORT).show();
                    Intent ntent = new Intent(firstuser.this, Mainhome.class);
                    startActivity(ntent);
                }


            }
        });



    }
}