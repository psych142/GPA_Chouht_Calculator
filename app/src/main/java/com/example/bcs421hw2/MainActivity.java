package com.example.bcs421hw2;

import androidx.appcompat.app.AppCompatActivity;
import java.util.Scanner;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    Button add;
    EditText c1, c2, c3, c4, c5;
    EditText empText;
    TextView result;

    int counter = 5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        c1 = (EditText) findViewById(R.id.editText1);
        c2 = (EditText) findViewById(R.id.editText2);
        c3 = (EditText) findViewById(R.id.editText3);
        c4 = (EditText) findViewById(R.id.editText4);
        c5 = (EditText) findViewById(R.id.editText5);
        result = (TextView) findViewById(R.id.tvanswer);
        add = (Button) findViewById(R.id.button);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int cs1 = Integer.parseInt(c1.getText().toString());
                int cs2 = Integer.parseInt(c2.getText().toString());
                int cs3 = Integer.parseInt(c3.getText().toString());
                int cs4 = Integer.parseInt(c4.getText().toString());
                int cs5 = Integer.parseInt(c5.getText().toString());
                int sum = (cs1 + cs2 + cs3 + cs4 + cs5) /counter;
                result.setText(Float.toString(sum));
            }
        });
    }
    private boolean isEmpty(EditText empText)
    {
        return empText.getText().toString().trim().length() == 0;
    }

    public void ResetCalc(View view) {
        c1.setText("");
        c2.setText("");
        c3.setText("");
        c4.setText("");
        c5.setText("");
        result.setText("0");
    }
}
