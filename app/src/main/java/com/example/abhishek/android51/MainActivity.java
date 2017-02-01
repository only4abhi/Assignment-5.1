package com.example.abhishek.android51;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView mtextView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        mtextView = (TextView)findViewById(R.id.textVw);

        switch (item.getItemId()){

            case R.id.red:
                mtextView.setTextColor(Color.RED);
                break;
            case R.id.green:
                mtextView.setTextColor(Color.GREEN);
                break;
            case R.id.blue:
                mtextView.setTextColor(Color.BLUE);
                break;

        }

        return super.onOptionsItemSelected(item);
    }
}
