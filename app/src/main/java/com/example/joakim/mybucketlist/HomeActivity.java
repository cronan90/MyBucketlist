package com.example.joakim.mybucketlist;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;

import java.util.ArrayList;

public class HomeActivity extends AppCompatActivity {

    private Button addBucketButton, showBucketListButton;
    public static ArrayList<Bucket> myBucketList = new ArrayList<Bucket>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homepage);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        addBucketButton = (Button) findViewById(R.id.addBucketButton);
        addBucketButton.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v){
                startActivity(new Intent(getApplicationContext(), AddBucketActivity.class));
            }
        });

        myBucketList.add(new Bucket("Go to the moon", false));
        myBucketList.add(new Bucket("Shoppa en dinosaurie till Minna", false));

        showBucketListButton = (Button) findViewById(R.id.showBucketListButton);
        showBucketListButton.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v){
                startActivity(new Intent(getApplicationContext(), ShowBucketListActivity.class));
            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_homepage, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
