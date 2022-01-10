package com.mycalendar;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {
    CalendarView calendarView;
    TextView textView;
    Calendar calendar;
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        calendarView=findViewById(R.id.calendarView);
        textView = findViewById(R.id.textView);
        button= findViewById(R.id.button);

        calendarView.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
            @Override
            public void onSelectedDayChange(@NonNull CalendarView calendarView, int i, int i1, int i2) {
                String myData = "Year: "+ i+"-"+"Month : "+ i1  +"-"+"day : "+i2 ;
                Toast.makeText(getApplicationContext(), myData, Toast.LENGTH_LONG).show();
                textView.setText(myData);
            }
        });



    }
}