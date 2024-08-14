package com.termux.app;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

import com.termux.R;
import com.termux.x11.MainActivity;

public class Main extends Activity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button b=new Button(this);
        b.setText("Start Termux");
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent termux_activity=new Intent(Main.this, TermuxActivity.class);
                startActivity(termux_activity);
            }
        });
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) LinearLayout ll=findViewById(R.id.main_layout);
        ll.addView(b);
        Button b1=new Button(this);
        b1.setText("Start X11");
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent termux_activity=new Intent(Main.this, MainActivity.class);
                startActivity(termux_activity);
            }
        });
        ll.addView(b1);
    }
}
