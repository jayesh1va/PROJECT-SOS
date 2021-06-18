package com.example.tnp;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.tnp.databinding.ActivityStatusBinding;


public class status extends AppCompatActivity {
    Button  buh;
    TextView trv;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_status);
        buh=findViewById(R.id.button33);
        trv=findViewById(R.id.textView15);
        trv.setEllipsize(TextUtils.TruncateAt.MARQUEE);
        trv.setSelected(true);
        buh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent hom = new  Intent(status.this,Mainhome.class);
                startActivity(hom);

            }
        });
    }
}