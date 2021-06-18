package com.example.tnp;

import androidx.appcompat.app.AppCompatActivity;

import android.Manifest;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.karumi.dexter.Dexter;
import com.karumi.dexter.MultiplePermissionsReport;
import com.karumi.dexter.PermissionToken;
import com.karumi.dexter.listener.PermissionRequest;
import com.karumi.dexter.listener.multi.MultiplePermissionsListener;

import java.util.List;

public class Mainhome extends AppCompatActivity {
    Button comp;
    TextView tev;


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
//        emergency=findViewById(R.id.sosss);
        comp=findViewById(R.id.fcomp);
        tev=findViewById(R.id.textView26);
        tev.setEllipsize(TextUtils.TruncateAt.MARQUEE);
        tev.setSelected(true);

        comp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent homeIntent = new Intent(Mainhome.this, filecomp.class);
                startActivity(homeIntent);

            }

        });

    }
    public void movenext(View view) {
        Dexter.withContext(Mainhome.this).withPermissions(Manifest.permission.CAMERA,Manifest.permission.ACCESS_COARSE_LOCATION,Manifest.permission.ACCESS_FINE_LOCATION, Manifest.permission.READ_CONTACTS, Manifest.permission.READ_EXTERNAL_STORAGE, Manifest.permission.BLUETOOTH, Manifest.permission.WRITE_CONTACTS, Manifest.permission.WRITE_EXTERNAL_STORAGE, Manifest.permission.SEND_SMS, Manifest.permission.ACCESS_NETWORK_STATE, Manifest.permission.ANSWER_PHONE_CALLS, Manifest.permission.CALL_PHONE, Manifest.permission.READ_CALL_LOG).withListener(new MultiplePermissionsListener() {
            @Override
            public void onPermissionsChecked(MultiplePermissionsReport multiplePermissionsReport) {
                if (multiplePermissionsReport.areAllPermissionsGranted()) {
                    Toast.makeText(Mainhome.this,"PERMISSIONS GRANTED",Toast.LENGTH_SHORT).show();
                    Intent imp =new Intent(Mainhome.this,impaftersos.class);
                    startActivity(imp);

                }
                else {
                    Toast.makeText(Mainhome.this,"PERMISSIONS NOT GRANTED",Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onPermissionRationaleShouldBeShown(List<PermissionRequest> list, PermissionToken permissionToken) {
                permissionToken.continuePermissionRequest();
            }
        }).check();

    }

    public void movemedi(View view) {
        Dexter.withContext(Mainhome.this).withPermissions(Manifest.permission.CAMERA,Manifest.permission.ACCESS_COARSE_LOCATION,Manifest.permission.ACCESS_FINE_LOCATION ,Manifest.permission.READ_CONTACTS, Manifest.permission.READ_EXTERNAL_STORAGE, Manifest.permission.BLUETOOTH, Manifest.permission.WRITE_CONTACTS, Manifest.permission.WRITE_EXTERNAL_STORAGE, Manifest.permission.SEND_SMS, Manifest.permission.ACCESS_NETWORK_STATE, Manifest.permission.ANSWER_PHONE_CALLS, Manifest.permission.CALL_PHONE, Manifest.permission.READ_CALL_LOG).withListener(new MultiplePermissionsListener() {
            @Override
            public void onPermissionsChecked(MultiplePermissionsReport multiplePermissionsReport) {
                if (multiplePermissionsReport.areAllPermissionsGranted()) {
                    Toast.makeText(Mainhome.this,"PERMISSIONS GRANTED",Toast.LENGTH_SHORT).show();
                    Intent move2 = new Intent(Mainhome.this,medical.class);
                    startActivity(move2);
                }
                else {
                    Toast.makeText(Mainhome.this,"PERMISSIONS NOT GRANTED",Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onPermissionRationaleShouldBeShown(List<PermissionRequest> list, PermissionToken permissionToken) {
                permissionToken.continuePermissionRequest();
            }
        }).check();

    }

    public void movefire(View view) {
        Dexter.withContext(Mainhome.this).withPermissions(Manifest.permission.CAMERA, Manifest.permission.READ_CONTACTS,Manifest.permission.ACCESS_COARSE_LOCATION,Manifest.permission.ACCESS_FINE_LOCATION , Manifest.permission.READ_EXTERNAL_STORAGE, Manifest.permission.BLUETOOTH, Manifest.permission.WRITE_CONTACTS, Manifest.permission.WRITE_EXTERNAL_STORAGE, Manifest.permission.SEND_SMS, Manifest.permission.ACCESS_NETWORK_STATE, Manifest.permission.ANSWER_PHONE_CALLS, Manifest.permission.CALL_PHONE, Manifest.permission.READ_CALL_LOG).withListener(new MultiplePermissionsListener() {
            @Override
            public void onPermissionsChecked(MultiplePermissionsReport multiplePermissionsReport) {
                if (multiplePermissionsReport.areAllPermissionsGranted()) {
                    Toast.makeText(Mainhome.this,"PERMISSIONS GRANTED",Toast.LENGTH_SHORT).show();
                    Intent movefire = new Intent(Mainhome.this,fire.class);
                    startActivity(movefire);
                }
                else {
                    Toast.makeText(Mainhome.this,"PERMISSIONS NOT GRANTED",Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onPermissionRationaleShouldBeShown(List<PermissionRequest> list, PermissionToken permissionToken) {
                permissionToken.continuePermissionRequest();
            }
        }).check();
    }

    public void nearby(View view) {
        Dexter.withContext(Mainhome.this).withPermissions(Manifest.permission.CAMERA, Manifest.permission.READ_CONTACTS, Manifest.permission.READ_EXTERNAL_STORAGE,Manifest.permission.ACCESS_COARSE_LOCATION,Manifest.permission.ACCESS_FINE_LOCATION, Manifest.permission.BLUETOOTH, Manifest.permission.WRITE_CONTACTS, Manifest.permission.WRITE_EXTERNAL_STORAGE, Manifest.permission.SEND_SMS, Manifest.permission.ACCESS_NETWORK_STATE, Manifest.permission.ANSWER_PHONE_CALLS, Manifest.permission.CALL_PHONE, Manifest.permission.READ_CALL_LOG).withListener(new MultiplePermissionsListener() {
            @Override
            public void onPermissionsChecked(MultiplePermissionsReport multiplePermissionsReport) {
                if (multiplePermissionsReport.areAllPermissionsGranted()) {
                    Toast.makeText(Mainhome.this,"PERMISSIONS GRANTED",Toast.LENGTH_SHORT).show();
                    Intent nearby = new Intent(Mainhome.this,map2.class);
                    startActivity(nearby);
                }
                else {
                    Toast.makeText(Mainhome.this,"PERMISSIONS NOT GRANTED",Toast.LENGTH_SHORT).show();

                }
            }

            @Override
            public void onPermissionRationaleShouldBeShown(List<PermissionRequest> list, PermissionToken permissionToken) {
                permissionToken.continuePermissionRequest();
            }
        }).check();
    }

    public void faceveri(View view) {
        Dexter.withContext(Mainhome.this).withPermissions(Manifest.permission.CAMERA,Manifest.permission.ACCESS_COARSE_LOCATION,Manifest.permission.ACCESS_FINE_LOCATION, Manifest.permission.READ_CONTACTS, Manifest.permission.READ_EXTERNAL_STORAGE, Manifest.permission.BLUETOOTH, Manifest.permission.WRITE_CONTACTS, Manifest.permission.WRITE_EXTERNAL_STORAGE, Manifest.permission.SEND_SMS, Manifest.permission.ACCESS_NETWORK_STATE, Manifest.permission.ANSWER_PHONE_CALLS, Manifest.permission.CALL_PHONE, Manifest.permission.READ_CALL_LOG).withListener(new MultiplePermissionsListener() {
            @Override
            public void onPermissionsChecked(MultiplePermissionsReport multiplePermissionsReport) {
                if (multiplePermissionsReport.areAllPermissionsGranted()) {
                    Toast.makeText(Mainhome.this,"PERMISSIONS GRANTED",Toast.LENGTH_SHORT).show();
                    Intent faceveri = new Intent(Mainhome.this,faceverify.class);
                    startActivity(faceveri);
                }
                else {
                    Toast.makeText(Mainhome.this,"PERMISSIONS NOT GRANTED",Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onPermissionRationaleShouldBeShown(List<PermissionRequest> list, PermissionToken permissionToken) {
                permissionToken.continuePermissionRequest();
            }
        }).check();
    }

    public void openbot(View view) {
        Dexter.withContext(Mainhome.this).withPermissions(Manifest.permission.CAMERA,Manifest.permission.ACCESS_COARSE_LOCATION,Manifest.permission.ACCESS_FINE_LOCATION, Manifest.permission.READ_CONTACTS, Manifest.permission.READ_EXTERNAL_STORAGE, Manifest.permission.BLUETOOTH, Manifest.permission.WRITE_CONTACTS, Manifest.permission.WRITE_EXTERNAL_STORAGE, Manifest.permission.SEND_SMS, Manifest.permission.ACCESS_NETWORK_STATE, Manifest.permission.ANSWER_PHONE_CALLS, Manifest.permission.CALL_PHONE, Manifest.permission.READ_CALL_LOG).withListener(new MultiplePermissionsListener() {
            @Override
            public void onPermissionsChecked(MultiplePermissionsReport multiplePermissionsReport) {
                if (multiplePermissionsReport.areAllPermissionsGranted()) {
                    Toast.makeText(Mainhome.this,"PERMISSIONS GRANTED",Toast.LENGTH_SHORT).show();
                    Intent openbot = new Intent(Mainhome.this,chatbot.class);
                    startActivity(openbot);
                }
                else {
                    Toast.makeText(Mainhome.this,"PERMISSIONS NOT GRANTED",Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onPermissionRationaleShouldBeShown(List<PermissionRequest> list, PermissionToken permissionToken) {
                permissionToken.continuePermissionRequest();
            }
        }).check();
    }
}