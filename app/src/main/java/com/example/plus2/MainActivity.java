package com.example.plus2;

import android.content.res.Configuration;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText no1 , no2;
    Button add;
    TextView answer;
    double ans = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        // for text views
        no1 = findViewById(R.id.first_no);
        no2 = findViewById(R.id.second_no);

        // for button with operations
        add = findViewById(R.id.add);

        // for answer field
        answer = findViewById(R.id.answer);

        add.setOnClickListener(v -> {
            String num1 = no1.getText().toString();
            String num2 = no2.getText().toString();

            if (num1.isEmpty() || num2.isEmpty()) {
                Toast.makeText(getApplicationContext(),"Enter Numbers",Toast.LENGTH_SHORT).show();
            }
            else {
                double a = Double.parseDouble(no1.getText().toString());
                double b = Double.parseDouble(no2.getText().toString());
                ans = a + b;
            }
            String ans1 = String.valueOf(ans);
            answer.setText(ans1);
            ans= 0;
        });
    }
    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);

        // Checks the orientation of the screen
        if (newConfig.orientation == Configuration.ORIENTATION_LANDSCAPE) {
            Toast.makeText(this, "landscape", Toast.LENGTH_SHORT).show();
        } else if (newConfig.orientation == Configuration.ORIENTATION_PORTRAIT){
            Toast.makeText(this, "portrait", Toast.LENGTH_SHORT).show();
        }
    }

}