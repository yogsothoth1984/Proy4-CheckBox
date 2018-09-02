package com.max.checkbox;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.EditText;
import android.widget.Button;
import android.widget.CheckBox;
import android.view.View;
public class MainActivity extends AppCompatActivity {
    //Definimos los objetos y tipo
    private EditText et1,et2;
    private Button botonCalcular;
    private TextView tv1;
    private CheckBox checkSumar,checkRestar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Vincular con id
        et1=findViewById(R.id.et1);
        et2=findViewById(R.id.et2);
        botonCalcular=findViewById(R.id.botonCalcular);
        tv1=findViewById(R.id.tv1);
        checkSumar=findViewById(R.id.checkSumar);
        checkRestar=findViewById(R.id.checkRestar);
    }
    public void calcular(View vcalcular){
        int nro1=Integer.parseInt(et1.getText().toString());
        int nro2=Integer.parseInt(et2.getText().toString());
        String resultado= "Ingrese valores";
        if(checkSumar.isChecked()==true){
            int suma=nro1 + nro2;
            resultado="La suma es igual: "+ suma;
        }
        if(checkRestar.isChecked()==true){
            int resta=nro1 - nro2;
            resultado=resultado + "La resta es igual: "+ resta;
        }
        tv1.setText(resultado);
    }
}
