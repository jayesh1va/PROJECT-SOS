package com.example.tnp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class medical extends AppCompatActivity {
    Button b22;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_medical);
        TextView textView9=findViewById(R.id.textView9);
        textView9.setEllipsize(TextUtils.TruncateAt.MARQUEE);
        textView9.setSelected(true);
        TextView textView25=findViewById(R.id.textView25);
        textView25.setEllipsize(TextUtils.TruncateAt.MARQUEE);
        textView25.setSelected(true);

        b22=findViewById(R.id.button4);
        b22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent b222 = new Intent(medical.this, Mainhome.class);
                startActivity(b222);

            }
        });
    }

    public void home6(View view) {

        Intent callIntent = new Intent(Intent.ACTION_CALL);
        callIntent.setData(Uri.parse("tel:108"));

        if (ActivityCompat.checkSelfPermission(medical.this,
                Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
            return;
        }
        startActivity(callIntent);
    }
}