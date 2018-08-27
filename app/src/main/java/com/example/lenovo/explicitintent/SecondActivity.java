package com.example.lenovo.explicitintent;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    TextView txt1,txt2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        txt1 = (TextView) findViewById(R.id.NameResult);//connected with textView2
        txt2 = (TextView) findViewById(R.id.NoResult);

        //to get access of intent
        Bundle b1 = getIntent().getExtras();//transfer from one to sec activity
        String s1 = b1.getString("userEnterName");//to access data by sec activity by the same key
        //and store in s1
        Bundle b2 = getIntent().getExtras();
        String s2 = b2.getString("userEnterMobNo");
        txt1.setText(s1); //to see access data
        txt2.setText(s2);
    }

}
