package org.institutoserpis.aprueba;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText oper1,oper2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        oper1=(EditText)findViewById(R.id.editText6);

        oper2=(EditText)findViewById(R.id.editText8);


    }

    public void sumar(View v){
        int n1=Integer.parseInt(oper1.getText().toString());
        int n2=Integer.parseInt(oper2.getText().toString());

        int sum=n1+n2;

        mostrar(sum);
    }
    public void restar(View v){
        int n1=Integer.parseInt(oper1.getText().toString());
        int n2=Integer.parseInt(oper2.getText().toString());

        int sum=n1-n2;

        mostrar(sum);
    }
    public void multiplicar(View v){
        int n1=Integer.parseInt(oper1.getText().toString());
        int n2=Integer.parseInt(oper2.getText().toString());

        int sum=n1*n2;

        mostrar(sum);
    }
    public void dividir(View v){
        int n1=Integer.parseInt(oper1.getText().toString());
        int n2=Integer.parseInt(oper2.getText().toString());

        int sum=n1/n2;

        mostrar(sum);
    }
    private void mostrar(int res){
        Toast.makeText(this,"Resultado operación"+res,Toast.LENGTH_LONG).show();
    }
}



