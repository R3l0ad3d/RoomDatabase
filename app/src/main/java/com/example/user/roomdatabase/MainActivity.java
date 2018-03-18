package com.example.user.roomdatabase;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.user.roomdatabase.Database.DatabaseInitializer;
import com.example.user.roomdatabase.Database.MyDatabase;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DatabaseInitializer.populateAsync(MyDatabase.getAppDatabase(this));

    }
}
