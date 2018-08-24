package com.josehinojo.jokesactivity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class JokesActivity extends AppCompatActivity {

    TextView jokeView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jokes);
        if(getIntent().getExtras() != null){
            jokeView = findViewById(R.id.joke);
            jokeView.setText(getIntent().getExtras().getString("joke"));
        }
    }
}
