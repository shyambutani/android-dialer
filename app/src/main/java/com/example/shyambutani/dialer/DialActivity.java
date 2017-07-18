package com.example.shyambutani.dialer;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class DialActivity extends AppCompatActivity {

    EditText phoneno;
    Button submit;
    String nostring;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dial);

        submit = (Button) findViewById(R.id.submit);
        phoneno = (EditText) findViewById(R.id.phoneno);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                nostring = phoneno.getText().toString();
                Intent myIntent = new Intent();
                myIntent.setAction(Intent.ACTION_CALL);
                myIntent.setData(Uri.parse("tel:"+nostring));
                startActivity(myIntent);
            }
        });
    }

}
