package com.example.mindsharpener;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {

    private EditText edittext;
    private Button checkbutton;
    private RadioGroup groupradio;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.edittext = (EditText)findViewById(R.id.editText);
        this.checkbutton = (Button)findViewById(R.id.button);
        this.groupradio = (RadioGroup)findViewById(R.id.radioGroup);

    }
}