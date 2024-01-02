package com.example.newcanvas;

import static com.example.newcanvas.Display.colorList;
import static com.example.newcanvas.Display.currentBrush;
import static com.example.newcanvas.Display.pathList;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.os.Bundle;
import android.view.View;

import com.google.firebase.auth.FirebaseAuth;


public class MainActivity extends AppCompatActivity {


    public static Path path = new Path();

    public static Paint paintBrush = new Paint();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void pencil(View view)
    {
        paintBrush.setColor(Color.BLACK);
        currentColor(paintBrush.getColor());
    }

    public void eraser(View view)
    {
        pathList.clear();
        colorList.clear();
        path.reset();
    }


    public void redColor(View view)
    {
        paintBrush.setColor(Color.RED);
        currentColor(paintBrush.getColor());
    }

    public void yellowColor(View view)
    {
        paintBrush.setColor(Color.YELLOW);
        currentColor(paintBrush.getColor());
    }

    public void greenColor(View view)
    {
        paintBrush.setColor(Color.GREEN);
        currentColor(paintBrush.getColor());
    }

    public void pinkColor(View view)
    {
        paintBrush.setColor(Color.MAGENTA);
        currentColor(paintBrush.getColor());
    }

    public void blueColor(View view)
    {
        paintBrush.setColor(Color.BLUE);
        currentColor(paintBrush.getColor());
    }

    public void currentColor(int c)
    {
        currentBrush = c;
        path = new Path();
    }







}