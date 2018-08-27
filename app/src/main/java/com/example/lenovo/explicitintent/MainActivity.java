package com.example.lenovo.explicitintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText e1,p1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        e1=(EditText)findViewById(R.id.editName); //connecting with editName
        p1=(EditText)findViewById(R.id.editMobNo);

    }

    public void goToSecActivity(View view) {
        Intent i1=new Intent(this,SecondActivity.class);
        i1.putExtra("userEnterName",e1.getText().toString()); //transfer data with the help of intent,
        // by the bundle data i,e on close the app data are goes away, userEnter is any key must be define
        i1.putExtra("userEnterMobNo",p1.getText().toString());
        startActivity(i1);
    }
}
