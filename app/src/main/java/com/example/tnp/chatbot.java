package com.example.tnp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class chatbot extends AppCompatActivity {
    TextView tex5;
    Button butchat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chatbot);
        butchat=findViewById(R.id.button7);
        butchat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent home2 =new Intent(chatbot.this,Mainhome.class);
                startActivity(home2);

            }
        });
        tex5=findViewById(R.id.textView5);
        tex5.setEllipsize(TextUtils.TruncateAt.MARQUEE);
        tex5.setSelected(true);
    }

}