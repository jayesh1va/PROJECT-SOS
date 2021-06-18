package com.example.tnp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.net.Uri;
import android.widget.Button;
import android.widget.TextView;

public class fire extends AppCompatActivity {
    Button h2;
    TextView textView2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fire);
        textView2=findViewById(R.id.textView24);
        textView2.setEllipsize(TextUtils.TruncateAt.MARQUEE);
        textView2.setSelected(true);
        h2=findViewById(R.id.button3);
        h2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent h22 = new Intent(fire.this, Mainhome.class);
                startActivity(h22);
            }
        });
    }


    public void home4(View view) {

        Intent callIntent = new Intent(Intent.ACTION_CALL);
        callIntent.setData(Uri.parse("tel:101"));

        if (ActivityCompat.checkSelfPermission(fire.this,
                Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
            return;
        }
        startActivity(callIntent);
    }

    }
