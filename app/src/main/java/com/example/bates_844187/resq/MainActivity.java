package com.example.bates_844187.resq;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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
        /*
        if (id == R.id.action_settings) {
            return true;
        }
        */

        return super.onOptionsItemSelected(item);
    }

    public void update(View v)
    {
        TextView rScore = (TextView) findViewById(R.id.rScore);
        TextView bScore = (TextView) findViewById(R.id.bScore);

        EditText rHighGoal = (EditText) findViewById(R.id.rHighGoal);
        EditText bHighGoal = (EditText) findViewById(R.id.bHighGoal);
        EditText rMidGoal = (EditText) findViewById(R.id.rMidGoal);
        EditText bMidGoal = (EditText) findViewById(R.id.bMidGoal);
        EditText rLowGoal = (EditText) findViewById(R.id.rLowGoal);
        EditText bLowGoal = (EditText) findViewById(R.id.bLowGoal);
        EditText rHang = (EditText) findViewById(R.id.rHang);
        EditText bHang = (EditText) findViewById(R.id.bHang);
        EditText rHighZone = (EditText) findViewById(R.id.rHighZone);
        EditText bHighZone = (EditText) findViewById(R.id.bHighZone);
        EditText rMidZone = (EditText) findViewById(R.id.rMidZone);
        EditText bMidZone = (EditText) findViewById(R.id.bMidZone);
        EditText rLowZone = (EditText) findViewById(R.id.rLowZone);
        EditText bLowZone = (EditText) findViewById(R.id.bLowZone);
        EditText rPart = (EditText) findViewById(R.id.rPart);
        EditText bPart = (EditText) findViewById(R.id.bPart);
        EditText rZip = (EditText) findViewById(R.id.rZip);
        EditText bZip = (EditText) findViewById(R.id.bZip);
        EditText rClimb = (EditText) findViewById(R.id.rClimb);
        EditText bClimb = (EditText) findViewById(R.id.bClimb);
        /*
        RadioButton r1Hang = (RadioButton) findViewById(R.id.r1Hang);
        RadioButton r2Hang = (RadioButton) findViewById(R.id.r2Hang);
        RadioButton b1Hang = (RadioButton) findViewById(R.id.b1Hang);
        RadioButton b2Hang = (RadioButton) findViewById(R.id.b2Hang);
        RadioButton r1High = (RadioButton) findViewById(R.id.r1Hang);
        RadioButton r2High = (RadioButton) findViewById(R.id.r2Hang);
        RadioButton b1High = (RadioButton) findViewById(R.id.b1Hang);
        RadioButton b2High = (RadioButton) findViewById(R.id.b2Hang);
        */

        /*
        int r1h = 0;
        if(r1Hang.isChecked()){
            r1h = 80;
        }
        else{
            r1h = 0;
        }

        int r2h = 0;
        if(r1Hang.isChecked()){
            r2h = 80;
        }
        else{
            r2h = 0;
        }

        int b1h = 0;
        if(r1Hang.isChecked()){
            b1h = 80;
        }
        else{
            b1h = 0;
        }

        int b2h = 0;
        if(r1Hang.isChecked()){
            b2h = 80;
        }
        else{
            b2h = 0;
        }

        int r1hi = 0;
        if(r1High.isChecked()){
            r1hi = 80;
        }
        else{
            r1hi = 0;
        }

        int r2hi = 0;
        if(r1High.isChecked()){
            r2hi = 80;
        }
        else{
            r2hi = 0;
        }

        int b1hi = 0;
        if(r1High.isChecked()){
            b1hi = 80;
        }
        else{
            b1hi = 0;
        }

        int b2hi = 0;
        if(r1High.isChecked()){
            b2hi = 80;
        }
        else{
            b2hi = 0;
        }
        */

        int rScr = 0;
        int bScr = 0;

        try {

            rScr = (Integer.parseInt(rHighGoal.getText().toString()) * 15);
            rScr += (Integer.parseInt(rMidGoal.getText().toString()) * 10);
            rScr += (Integer.parseInt(rLowGoal.getText().toString()) * 5);
            rScr += (Integer.parseInt(rHang.getText().toString()) * 80);
            rScr += (Integer.parseInt(rHighZone.getText().toString()) * 40);
            rScr += (Integer.parseInt(rMidZone.getText().toString()) * 20);
            rScr += (Integer.parseInt(rLowZone.getText().toString()) * 10);
            rScr += (Integer.parseInt(rPart.getText().toString()) * 5);
            rScr += (Integer.parseInt(rZip.getText().toString()) * 20);
            rScr += (Integer.parseInt(rClimb.getText().toString()) * 10);
            //rScr += r1h + r2h + r1hi + r2hi;


        }
        catch(NumberFormatException e){
            rScr = -1;

        }

        try{
            bScr = (Integer.parseInt(bHighGoal.getText().toString()) * 15) + (Integer.parseInt(bMidGoal.getText().toString()) * 10) + (Integer.parseInt(bLowGoal.getText().toString()) * 5);
            bScr += (Integer.parseInt(bHang.getText().toString()) * 80);
            bScr += (Integer.parseInt(bHighZone.getText().toString()) * 40);
            bScr += (Integer.parseInt(bMidZone.getText().toString()) * 20);
            bScr += (Integer.parseInt(bLowZone.getText().toString()) * 10);
            rScr += (Integer.parseInt(bPart.getText().toString()) * 5);
            rScr += (Integer.parseInt(bZip.getText().toString()) * 20);
            rScr += (Integer.parseInt(bClimb.getText().toString()) * 10);

            //bScr += b1h + b2h + b1hi + b2hi;
        }
        catch(NumberFormatException e){
            bScr = -1;
        }


        rScore.setText("" + rScr);
        bScore.setText("" + bScr);
    }
}
