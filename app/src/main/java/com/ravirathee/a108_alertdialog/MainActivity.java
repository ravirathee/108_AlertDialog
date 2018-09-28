package com.ravirathee.a108_alertdialog;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button button;

    AlertDialog.Builder builder; //Required for AlertDialog

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        builder = new AlertDialog.Builder(this); //Just like onclicklistner for Button
                                                        //this is required for AlertDialog

        button = findViewById(R.id.alert_button);



        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(getApplicationContext(), "Hello from OK",Toast.LENGTH_SHORT).show();
                        System.exit(0);
//                        finish();
                    }
                });

                builder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(getApplicationContext(),"Hello from cancel",Toast.LENGTH_SHORT).show();
//                        finish();
                    }
                });

                builder.setMessage("What is your name");

                builder.setCancelable(true);
                //If we click somewhere else on screen it goes away(1) or not(0)
                //set true to make it able to go away
                //set false to make it able to not go away

                AlertDialog a = builder.create();
                a.setTitle("qwerty");
                a.show();

            }
        }  );

    }

    @Override
    public void onClick(View v) {
        if(v.getId()==R.id.alert_button){

        }
    }
}
