package vgtu.iip.lab2;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class PirmaActivity extends AppCompatActivity {

    final static int IVEDIMAS = 1;

    TextView isvedimoLaukas;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.i("2Lab", "PirmaActivity.onCreate()");
        setContentView(R.layout.activity_pirma);
        isvedimoLaukas = (TextView) findViewById(R.id.tekstas);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("2Lab", "PirmaActivity.onStart()");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("2Lab", "PirmaActivity.onResume()");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("2Lab", "PirmaActivity.onPause()");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("2Lab", "PirmaActivity.onRestart()");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("2Lab", "PirmaActivity.onStop()");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("2Lab", "PirmaActivity.onDestroy()");
    }

    public void atvertiVeiklaRezultatuGavimui(View w){
        Log.i("2Lab", "PirmaActivity.atvertiVeiklaRezultatuGavimui()");
        Intent antraActivityIntent = new Intent(this, AntraActivity.class);
        startActivityForResult(antraActivityIntent , IVEDIMAS);
    }

    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        Log.i("2Lab", "PirmaActivity.onActivityResult()");
        if (requestCode == IVEDIMAS) {
            if (resultCode == Activity.RESULT_OK) {
                isvedimoLaukas.setText(data.getStringExtra(Intent.EXTRA_TEXT));
            }
        }
    }

    public void sukurtiExplicitIntent(View w){
        Log.i("2Lab", "PirmaActivity.sukurtiExplicitIntent()");
        String tekstas = isvedimoLaukas.getText().toString();
        Intent treciaActivityIntent = new Intent(this, TreciaActivity.class);
        treciaActivityIntent.putExtra(Intent.EXTRA_TEXT, tekstas);
        startActivity(treciaActivityIntent);
    }

    public void sukurtiImplicitIntent(View w){
        Log.i("2Lab", "PirmaActivity.sukurtiImplicitIntent()");
        String duomenysSiuntimui = isvedimoLaukas.getText().toString();
        Intent sendIntent = new Intent(Intent.ACTION_SEND);
        String title = getResources().getString(R.string.pasirinkite);
        sendIntent.putExtra(Intent.EXTRA_TEXT, duomenysSiuntimui);
        sendIntent.setType("text/plain");
        Intent chooser = Intent.createChooser(sendIntent, title);
        if (sendIntent.resolveActivity(getPackageManager()) != null) {
            startActivity(chooser);
        }
    }
}
