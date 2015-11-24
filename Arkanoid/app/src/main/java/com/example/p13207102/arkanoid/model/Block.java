package com.example.p13207102.arkanoid.model;

import android.graphics.Canvas;
import android.graphics.Paint;

import java.util.Random;

/**
 * Created by rehanabdullah on 16/11/2015.
 */
public abstract class Block implements BlockInterface {

    // Fields

    private int widthIn;
    private int heightIn;
    private int xPosIn;
    private int yPosIn;
    private int blockColour;
    private boolean bonus;


    // Constructors

    public Block() {
        widthIn = 40;
        heightIn = 40;
        xPosIn = 40;
        yPosIn = 40;
        bonus = randomise();

    }

    public Block (int widthIn, int heightIn, int xPosIn, int yPosIn, int blockColour) {
        this.widthIn = widthIn;
        this.heightIn = heightIn;
        this.xPosIn = xPosIn;
        this.yPosIn = yPosIn;
        this.blockColour = blockColour;
        bonus = randomise();
    }

    public void drawRect (Paint p, Canvas c) {

        p.setColor(blockColour);
        c.drawRect(xPosIn, yPosIn, widthIn+xPosIn, heightIn+yPosIn, p);
    }

    private boolean randomise() {
        Random r = new Random(250);
        return r.nextBoolean();
    }

    // Methods

    public void setWidth (int widthIn) {
        this.widthIn = widthIn;
    }

    public int getWidth() {
        return widthIn;
    }

    public void setHeight (int heightIn) {
        this.heightIn = heightIn;
    }

    public int getHeight() {
        return heightIn;
    }

    public void setyPosIn(int yPosIn) {
        this.yPosIn = yPosIn;
    }

    public int getyPosIn() {
        return yPosIn;
    }

    public void setxPosIn(int xPosIn) {
        this.xPosIn = xPosIn;
    }

    public int getxPosIn() {
        return xPosIn;
    }

    public void setBlockColour(int blockColour) {
        this.blockColour = blockColour;
    }

    public int getBlockColour() {
        return blockColour;
    }


}
