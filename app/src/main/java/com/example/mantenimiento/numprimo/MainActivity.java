package com.example.mantenimiento.numprimo;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {

    private EditText editText;
    private TextView textView;

    String tag="CICLO DE VIDA";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void calcularPrimo(View v)
    {
        editText= (EditText) findViewById(R.id.editText);
        textView= (TextView) findViewById(R.id.textView3);

        int p=1;
        int d=2;
        int c=2;
        int mos=0;
        long numero=Integer.parseInt(editText.getText().toString());

        while (c <= numero) {
            if (p % d == 0) {
                if (p == d) {
                    mos =p;
                    c++;
                }
                d = 2;
                p++;
            }else {
                d++;
            }
        }
        textView.setText("El nº primo de la posición "+numero+" es el "+mos);
    }

    public void onStart()
    {
        super.onStart();
        Log.d(tag,"ESTOY EN EL onStart()");
    }

    public void onRestart()
    {
        super.onRestart();
        Log.d(tag, "ESTOY EN EL onRestart()");
    }

    public void onResume()
    {
        super.onResume();
        Log.d(tag, "ESTOY EN EL onResume()");
    }

    public void onPause()
    {
        super.onPause();
        Log.d(tag, "ESTOY EN EL onPause()");
    }

    public void onStop()
    {
        super.onStop();
        Log.d(tag, "ESTOY EN EL onStop()");
    }

    public void onDestroy()
    {
        super.onDestroy();
        Log.d(tag, "ESTOY EN EL onDestroy()");
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
