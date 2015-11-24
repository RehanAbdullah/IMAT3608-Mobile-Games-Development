package com.example.adm_jshell00.arkanoid.View;

/**
 * Created by adm-jshell00 on 29/09/2015.
 */

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Point;
import android.util.Log;
import android.view.View;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GameView extends View{

    //Paint need to be able to draw the blocks
    Paint paint = new Paint();


    //Constructor of the GameView
    public GameView(Context context) {
        super(context);
    }

    private void blockConstruct() {
        //Used to construct the blocks
        //Here is where you add your block construction using rectangle
    }
    //Over loading the onDraw method to draw a custom canvas
    public void onDraw(Canvas canvas) {
        //Construct the blocks for the canvas
        blockConstruct();

    }
}
