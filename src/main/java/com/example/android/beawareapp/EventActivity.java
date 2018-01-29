package com.example.android.beawareapp;

import android.content.Intent;
import android.provider.CalendarContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import java.util.Calendar;

public class EventActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_event);
    }

    public void onAddEventClicked(View view) {
        Intent intent = new Intent(Intent.ACTION_INSERT);
        intent.setType("vnd.android.cursor.item/event");

        Calendar cal = Calendar.getInstance();
        long startTime = cal.getTimeInMillis();
        long endTime = cal.getTimeInMillis() + 60 * 60 * 1000;

        intent.putExtra(CalendarContract.EXTRA_EVENT_BEGIN_TIME, startTime);
        intent.putExtra(CalendarContract.EXTRA_EVENT_END_TIME, endTime);
        intent.putExtra(CalendarContract.EXTRA_EVENT_ALL_DAY, true);

        intent.putExtra(CalendarContract.Events.TITLE, "Tembisa Youth Meeting");
        intent.putExtra(CalendarContract.Events.DESCRIPTION, "YOUTH DEVELOPMENT MEETING");
        intent.putExtra(CalendarContract.Events.EVENT_LOCATION, "Mehlareng Stadium");
        intent.putExtra(CalendarContract.Events.RRULE, "FREQ=MONTHLY");

        startActivity(intent);
    }
    public void onViewEventClicked(View view){

    }
}