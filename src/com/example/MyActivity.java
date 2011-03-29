package com.example;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MyActivity extends Activity
    implements View.OnClickListener
{
    private Button btn1;
    private int clickCount = 0;

    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        btn1 = (Button)findViewById(R.id.button1);
        btn1.setOnClickListener(this);
    }


    public void onClick(View view) {
        TextView textView = (TextView) findViewById(R.id.theString);
        if (clickCount++ == 0){
           textView.setText("Thanks for clicking my button!");
            btn1.setText("I've been clicked already");
        }
        else {
            Context context = getApplicationContext();
            Toast toast = Toast.makeText(context, String.format("I've already been clicked %d time%s!", clickCount, clickCount == 1 ? "" : "s"), Toast.LENGTH_SHORT);
            toast.show();
        }

    }
}
