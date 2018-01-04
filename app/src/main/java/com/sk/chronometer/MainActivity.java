package com.sk.chronometer;

import android.os.Bundle;
import android.os.SystemClock;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Chronometer;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Toolbar mToolbar;
    private Chronometer mChronometer;
    private Button mButtonStart;
    private Button mButtonStop;
    private Button mButtonRestart;
    private Button mButtonSetFormat;
    private Button mButtonClearFormat;
    private Button mButtonDefaultTime;
    private FloatingActionButton mFab;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();
    }

    private void initView() {
        mToolbar = (Toolbar) findViewById(R.id.toolbar);
        mChronometer = (Chronometer) findViewById(R.id.chronometer);
        mButtonStart = (Button) findViewById(R.id.buttonStart);
        mButtonStop = (Button) findViewById(R.id.buttonStop);
        mButtonRestart = (Button) findViewById(R.id.buttonRestart);
        mButtonSetFormat = (Button) findViewById(R.id.buttonSetFormat);
        mButtonClearFormat = (Button) findViewById(R.id.buttonClearFormat);
        mButtonDefaultTime = (Button) findViewById(R.id.buttonDefaultTime);
        mFab = (FloatingActionButton) findViewById(R.id.fab);

        mButtonStart.setOnClickListener(this);
        mButtonStop.setOnClickListener(this);
        mButtonRestart.setOnClickListener(this);
        mButtonSetFormat.setOnClickListener(this);
        mButtonClearFormat.setOnClickListener(this);
        mButtonDefaultTime.setOnClickListener(this);

        mFab.setOnClickListener(this);

        setSupportActionBar(mToolbar);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            default:
                break;

            case R.id.buttonStart:
                startChronometer();
                break;

            case R.id.buttonStop:
                stopChronometer();
                break;

            case R.id.buttonRestart:
                restartChronometer();
                break;

            case R.id.buttonSetFormat:
                setFormatChronometer();
                break;

            case R.id.buttonClearFormat:
                clearFormatChronometer();
                break;

            case R.id.buttonDefaultTime:
                defaultTimeChronometer();
                break;

            case R.id.fab:
                Snackbar.make(v, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
                break;
        }
    }

    private void startChronometer() {
        mChronometer.setBase(SystemClock.elapsedRealtime());
        mChronometer.start();
    }

    private void stopChronometer() {
        mChronometer.stop();
    }

    private void restartChronometer() {
        mChronometer.setBase(SystemClock.elapsedRealtime());
    }

    private void setFormatChronometer() {
        mChronometer.setFormat("Formated Time - %s");
    }

    private void clearFormatChronometer() {
        mChronometer.setFormat(null);
    }


    private void defaultTimeChronometer() {
        mChronometer.setBase(SystemClock.elapsedRealtime());

        /* if you want to start at another time, you have to subtract the time you want in milliseconds.
            For example, you want to start your Chronometer at 2 min and 10 seconds:*/
        mChronometer.setBase(SystemClock.elapsedRealtime() - (2 * 60000 + 10 * 1000));
        mChronometer.start();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
