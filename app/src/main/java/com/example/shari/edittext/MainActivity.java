package com.example.shari.edittext;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final EditText eText = (EditText)findViewById(R.id.edittext);
        Button btn = (Button) findViewById(R.id.button);
        final int [] myArray = {10, 20, 30, 40};
        AutoCompleteTextView auto;
        String arr[]={"Arun","Mathev","Vishnu","Vishal","Arjun",
                "Arul","Balaji","Babu","Boopathy","Godwin","Nagaraj"};
        AutoCompleteTextView t =  (AutoCompleteTextView) findViewById(R.id.autoCompleteTextView1);
        ArrayAdapter<String> adp = new ArrayAdapter<String>(this, android.R.layout.simple_dropdown_item_1line,arr);
        t.setThreshold(1);
        t.setAdapter(adp);


        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str = eText.getText().toString();
                Toast msg = Toast.makeText(getBaseContext(), str, Toast.LENGTH_LONG);
                msg.show();


            }
        });

    }
}
