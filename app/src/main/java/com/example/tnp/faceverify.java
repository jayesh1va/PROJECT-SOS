package com.example.tnp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class faceverify extends AppCompatActivity {
    TextView tex;
    Button go;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_faceverify);
        go=findViewById(R.id.button6);
        go.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent home3 =new Intent(faceverify.this,Mainhome.class);
                startActivity(home3);

            }
        });
        TextView tex=findViewById(R.id.textView6);
        tex.setEllipsize(TextUtils.TruncateAt.MARQUEE);
        tex.setSelected(true);
    }

}