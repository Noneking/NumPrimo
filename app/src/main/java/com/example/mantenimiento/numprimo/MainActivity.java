package com.example.mantenimiento.numprimo;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {

    private EditText editText;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void calcularPrimo(View v)
    {
        editText= (EditText) findViewById(R.id.editText);
        textView= (TextView) findViewById(R.id.textView3);

        int cont=0;
        long num=Integer.parseInt(editText.getText().toString());
        for(int i=1;i<num;i++)
        {
            if(num%i==0)
            {
                cont++;
            }
        }
        if(cont<=2)
        {
            textView.setText("El nº "+num+" es PRIMO");
        }
        else if(cont>2)
        {
            textView.setText("El nº "+num+" NO ES PRIMO");
        }
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
