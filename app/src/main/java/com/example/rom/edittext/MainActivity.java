package com.example.rom.edittext;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
public Button enter;
    String user;
    EditText e1;
    public void edit()
    {
        enter=(Button)findViewById(R.id.enter);
        e1=(EditText)findViewById(R.id.username);
        enter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent home =new Intent(MainActivity.this,activity2.class);
                user=e1.getText().toString();
                home.putExtra("ROM",user);
                home.putExtra("data",962458765);
                Toast.makeText(MainActivity.this,user,Toast.LENGTH_SHORT).show();
                startActivity(home);
            }
        });

    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edit();
    }
}
