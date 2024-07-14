package com.example.program8;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    // Array of strings...
    ListView simpleList;
    String courseList[] = {"C-Programming", "Data Structure", "Database",
            "Python", "Java", "Operating System", "Compiler Design", "Android Development"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        simpleList = findViewById(R.id.simpleListView);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(
                this, R.layout.activity_list_view, R.id.textView, courseList);
        simpleList.setAdapter(arrayAdapter);
    }
}
