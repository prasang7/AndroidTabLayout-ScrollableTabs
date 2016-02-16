package com.iotaconcepts.tabstask;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.TextView;

public class FontTextView extends TextView
{

    public FontTextView(Context context)
    {
        super(context);
        Typeface face=Typeface.createFromAsset(context.getAssets(), "Montserrat-Regular.otf");
        this.setTypeface(face);
    }

    public FontTextView(Context context, AttributeSet attrs)
    {
        super(context, attrs);
        Typeface face=Typeface.createFromAsset(context.getAssets(), "Montserrat-Hairline.otf");
        this.setTypeface(face);
    }

    public FontTextView(Context context, AttributeSet attrs, int defStyle)
    {
        super(context, attrs, defStyle);
        Typeface face=Typeface.createFromAsset(context.getAssets(), "Montserrat-Bold.otf");
        this.setTypeface(face);
    }

    protected void onDraw (Canvas canvas)
    {
        super.onDraw(canvas);
    }






}