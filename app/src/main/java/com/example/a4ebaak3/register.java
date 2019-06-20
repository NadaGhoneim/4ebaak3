package com.example.a4ebaak3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Spinner;
import android.widget.Toast;
import android.widget.AdapterView;


public class register extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        final Spinner spinner = (Spinner) findViewById( R.id.spinner );
        spinner.setOnItemSelectedListener( new AdapterView.OnItemSelectedListener() {


            @Override
            public void onItemSelected(AdapterView parent, View view, int position, long id) {

                String item = parent.getItemAtPosition(position).toString();
                Toast.makeText( parent.getContext() , parent.getSelectedItem().toString(), Toast.LENGTH_SHORT).show();

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }

        } );

        final Button signup = findViewById(R.id.btn_signup);

        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(register.this, homepage.class);
                startActivity(intent);
            }
        });

        final TextView login = findViewById(R.id.link_login);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(register.this, sign_in.class);
                startActivity(intent);
            }
        });


    }
}