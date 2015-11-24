package com.example.p13207102.arkanoid.controller;

import android.content.Intent;
import android.graphics.Canvas;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.example.p13207102.arkanoid.R;
import com.example.p13207102.arkanoid.view.GameView;

public class GameActivity extends AppCompatActivity {

    private GameView gv;
    private Canvas canvas;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Toast.makeText(this,"Game Activity Created", Toast.LENGTH_LONG).show();
        setContentView(R.layout.activity_game);

        canvas = new Canvas();

        gv = new GameView(this);
        setContentView(gv);

        gv.onDraw(canvas);
    }


    public void startGame(View view) {
        Intent intentStart = new Intent(this, MainActivity.class);
        startActivity(intentStart);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_game, menu);
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
