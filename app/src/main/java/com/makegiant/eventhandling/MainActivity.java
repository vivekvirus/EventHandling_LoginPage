package com.makegiant.eventhandling;

import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Objects;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    Button login;
    TextView enteredid;
    TextView enteredpass;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        login=findViewById(R.id.login);
        login.setOnClickListener(this);
        enteredid=findViewById(R.id.username);
        enteredpass=findViewById(R.id.password);

    }

    @RequiresApi(api = Build.VERSION_CODES.KITKAT)
    @Override
    public void onClick(View view) {
        String username=enteredid.getText().toString();
        String password=enteredpass.getText().toString();

        if(Objects.equals(username, "hemant") && Objects.equals(password, "12345")) {
            Toast.makeText(this, "Welcome " + username, Toast.LENGTH_LONG).show();
        }
        else {
            Toast.makeText(this, "Sorry " + username + " is not a valid user!", Toast.LENGTH_SHORT).show();
        }

    }
}
