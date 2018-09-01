package com.example.tanaygupta.saveandviewdataindbonserver;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }
    public void move(View view)
    {
        Intent intent;
        switch (view.getId()){
            case R.id.add_button:
                intent = new Intent(this, AddRecords.class);
                startActivity(intent);
                break;
            case R.id.view_button:
                intent = new Intent(this, ViewRecords.class);
                startActivity(intent);
                break;
        }

    }
}
