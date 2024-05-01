package com.example.food.ui.slideshow.placeholder;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.example.food.R;

import java.util.Timer;
import java.util.TimerTask;

public class ActivityThree extends AppCompatActivity {
    ProgressBar pb;
    int counter =1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_three);
        Button pickUp = findViewById(R.id.pickupBTN);
        pickUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(ActivityThree.this, "Scan Qr", Toast.LENGTH_SHORT).show();
            }
        });
        Button deliver = findViewById(R.id.deliverBTN);

        deliver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(ActivityThree.this,"Your package will be delivered soon", Toast.LENGTH_SHORT).show();
                pb = (ProgressBar)findViewById(R.id.pb);

                final Timer t = new Timer();
                TimerTask tt = new TimerTask() {
                    @Override
                    public void run()
                    {
                        counter++;
                        pb.setProgress(counter);

                        if(counter == 100)
                            t.cancel();
                    }
                };

                t.schedule(tt,0,100);
            }
        });
    }
}