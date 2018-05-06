package com.example.rom.edittext;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class activity2 extends AppCompatActivity {
TextView act;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity2);
        act=(TextView)findViewById(R.id.act);
        act.setText(getIntent().getStringExtra("ROM"));
        int i=getIntent().getLongExtra("data");
//practice
    }
}
