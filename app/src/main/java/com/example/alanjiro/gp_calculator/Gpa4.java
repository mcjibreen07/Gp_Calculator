package com.example.alanjiro.gp_calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import SpinnerClass.Selectitems;

public class Gpa4 extends AppCompatActivity {
    public String a, b, c, d, e, f, g;
    EditText t1, t2, t3, t4, t5, t6, t7, num1, num2, num3, num4, num5, num6, num7;
    TextView finalresult;

    Button calc;
    //Selectitems unit = new Selectitems();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gpa4);
        num1 = (EditText) findViewById(R.id.cr1);
        num2 = (EditText) findViewById(R.id.cr2);
        num3 = (EditText) findViewById(R.id.cr3);
        num4 = (EditText) findViewById(R.id.cr4);
        num5 = (EditText) findViewById(R.id.cr5);
        num6 = (EditText) findViewById(R.id.cr6);
        num7 = (EditText) findViewById(R.id.cr7);
        finalresult = (TextView) findViewById(R.id.Result);

        //unit.getTotalUnit(x1,x2,x3,x4,x5,x6,x7);

        spin1();
        spin2();
        spin3();
        spin4();
        spin5();
        spin();
        spin0();


        calc = (Button) findViewById(R.id.GetResult);
        calc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int x1 = Integer.parseInt(num1.getText().toString());
                int x2 = Integer.parseInt(num2.getText().toString());
                int x3 = Integer.parseInt(num3.getText().toString());
                int x4 = Integer.parseInt(num4.getText().toString());
                int x5 = Integer.parseInt(num5.getText().toString());
                int x6 = Integer.parseInt(num6.getText().toString());
                int x7 = Integer.parseInt(num7.getText().toString());
                //int r ;
                Selectitems tt = new Selectitems();
                int x = tt.getTotalUnit(x1, x2, x3, x4, x5, x6, x7);
                System.out.println(x);
                finalresult.setText(String.valueOf(x));
            }
        });
    }

    public String spin0() {
        Spinner spinner = findViewById(R.id.c1);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.numbers, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        //String g =spinner.getSelectedItem().toString();
        return spinner.getSelectedItem().toString();
    }

    public String spin() {
        Spinner spinner2 = findViewById(R.id.c2);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.numbers, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner2.setAdapter(adapter);
        return spinner2.getSelectedItem().toString();
    }

    public String spin1() {
        Spinner spinner1 = findViewById(R.id.c3);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.numbers, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner1.setAdapter(adapter);
        //spinner.setOnItemSelectedListener(this);
        String g = spinner1.getSelectedItem().toString();
        return g;
    }

    public void spin2() {
        Spinner spinner1 = findViewById(R.id.c4);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.numbers, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner1.setAdapter(adapter);

    }

    public void spin3() {
        Spinner spinner1 = findViewById(R.id.c5);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.numbers, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner1.setAdapter(adapter);

    }

    public void spin4() {
        Spinner spinner1 = findViewById(R.id.c6);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.numbers, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner1.setAdapter(adapter);

    }

    public void spin5() {
        Spinner spinner1 = findViewById(R.id.c7);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.numbers, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner1.setAdapter(adapter);

    }

    public Double getUnit(String a, String b, String c, String d, String e, String f, String g) {


        return 0.0;
    }
}
