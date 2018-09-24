package com.example.taufiq.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by taufiq on 17/09/18.
 */

public class MainActivity extends AppCompatActivity{

    private EditText edtData;
    private Button btnSubmit;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edtData = (EditText) findViewById(R.id.edt_data);
        btnSubmit = (Button) findViewById(R.id.btn_submit);
        btnSubmitClicked();
    }

    private void btnSubmitClicked() {
        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String data = edtData.getText().toString();

                Intent detailIntent = new Intent(MainActivity.this, DetailActivity.class);
                detailIntent.putExtra("dataku", data);
                startActivity(detailIntent);
            }
        });
    }
}
