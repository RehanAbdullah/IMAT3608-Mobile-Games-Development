package com.example.p13207102.arkanoid.model;

import android.graphics.Canvas;
import android.graphics.Paint;

/**
 * Created by rehanabdullah on 16/11/2015.
 */
public class BreakBlock extends Block {

    private int widthIn;
    private int heightIn;
    private int xPosIn;
    private int yPosIn;
    private int blockColour;

    public BreakBlock() {

        super();
    }


    public BreakBlock(int widthIn, int heightIn, int xPosIn, int yPosIn, int blockColour) {
        this.widthIn = widthIn;
        this.heightIn = heightIn;
        this.xPosIn = xPosIn;
        this.yPosIn = yPosIn;
        this.blockColour = blockColour;
    }

    public void drawRect(Paint p, Canvas c) {

        p.setColor(blockColour);
        c.drawRect(xPosIn, yPosIn, widthIn+xPosIn, heightIn+yPosIn, p);
    }
}
