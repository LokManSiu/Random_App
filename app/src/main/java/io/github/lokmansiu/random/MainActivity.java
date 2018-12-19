package io.github.lokmansiu.random;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    EditText input_minimum, input_maximum;
    Button random;
    TextView output;

    Random r;
    int minimum, maximum, tempout;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        r = new Random();

        input_minimum = (EditText) findViewById(R.id.input_minimum);
        input_maximum = (EditText) findViewById(R.id.input_maximum);
        random = (Button) findViewById(R.id.random);
        output = (TextView) findViewById(R.id.output);

                random.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        String tempminimum, tempmaximum;
                        tempminimum = input_minimum.getText().toString();
                        tempmaximum = input_maximum.getText().toString();
                        if (!tempminimum.equals("") && !tempmaximum.equals("")) ;
                        {
                            minimum = Integer.parseInt(tempminimum);
                            maximum = Integer.parseInt(tempmaximum);
                            if (maximum > minimum) {
                                tempout = r.nextInt((maximum - minimum) + 1) + minimum;
                                output.setText("" + tempout);
                            }
                        }
                    }
                });

    }
}
