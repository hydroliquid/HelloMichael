package com.example.mjben.hellomichael;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
            // Change color of text
        findViewById(R.id.buttTextColor).setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view)
           {
               ((TextView)findViewById(R.id.textView)).setTextColor(
                       getResources().getColor(R.color.brightGreen));
           }
        });
            // Change background color
        findViewById(R.id.buttBackgrdColor).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                findViewById(R.id.rootView).setBackgroundColor(
                        getResources().getColor(R.color.deepPurple)
                );
            }
        });
        // Change Text // Allow for user text edit
        findViewById(R.id.buttChangText).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                String newText = ((EditText) findViewById(R.id.editText)).getText().toString();
                if (TextUtils.isEmpty(newText))
                {
                    ((TextView) findViewById(R.id.textView)).setText("Hello from Michael!");
                }else
                {
                    ((TextView) findViewById(R.id.textView)).setText(newText);
                }



            }
        });

        // Change everything back to original
        findViewById(R.id.rootView).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((TextView)findViewById(R.id.textView)).setTextColor(
                        getResources().getColor(R.color.colorPrimary));
                findViewById(R.id.rootView).setBackgroundColor(
                        getResources().getColor(R.color.colorAccent));
                ((TextView) findViewById(R.id.textView)).setText("Hello from Michael!");
            }
        });






    }
}
