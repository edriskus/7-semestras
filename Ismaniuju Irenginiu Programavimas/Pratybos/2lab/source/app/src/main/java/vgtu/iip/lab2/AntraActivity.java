package vgtu.iip.lab2;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class AntraActivity extends AppCompatActivity {

    EditText ivedimoLaukas;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.i("2Lab", "AntraActivity.onCreate()");
        setContentView(R.layout.activity_antra);
        ivedimoLaukas = (EditText) findViewById(R.id.ivedimui);
    }

    public void grazintiRezultatus(View w){
        Log.i("2Lab", "AntraActivity.grazintiRezultatus()");
        String ivestasTekstas = ivedimoLaukas.getText().toString();
        Intent pirmaActivityIntent = new Intent(this, PirmaActivity.class);
        pirmaActivityIntent.putExtra(Intent.EXTRA_TEXT, ivestasTekstas);
        setResult(Activity.RESULT_OK, pirmaActivityIntent);
        finish();
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("2Lab", "AntraActivity.onStart()");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("2Lab", "AntraActivity.onResume()");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("2Lab", "AntraActivity.onPause()");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("2Lab", "AntraActivity.onRestart()");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("2Lab", "AntraActivity.onStop()");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("2Lab", "AntraActivity.onDestroy()");
    }
}
