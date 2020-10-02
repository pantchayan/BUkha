package com.example.pantchayan.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.app.Activity;


public class bmi extends Activity {

    private EditText height;
    private EditText weight;
    private TextView result;
    private TextView diet;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bmi);
        height = (EditText) findViewById(R.id.height);
        weight = (EditText) findViewById(R.id.weight);
        result = (TextView) findViewById(R.id.result);
        diet = (TextView) findViewById(R.id.diet);

    }

    public void calculateBMI(View v) {
        String heightStr = height.getText().toString();
        String weightStr = weight.getText().toString();

        if (heightStr != null && !"".equals(heightStr)
                && weightStr != null  &&  !"".equals(weightStr)) {
            float heightValue = Float.parseFloat(heightStr) / 100;
            float weightValue = Float.parseFloat(weightStr);

            float bmi = weightValue / (heightValue * heightValue);

            displayBMI(bmi);
        }
    }

    private void displayBMI(float bmi) {
        String bmiLabel = "";
        String dietLabel ="";

        if (Float.compare(bmi, 15f) <= 0) {
            bmiLabel = getString(R.string.very_severely_underweight);
            dietLabel ="Please meet a physician and plan your diet.";
        } else if (Float.compare(bmi, 15f) > 0  &&  Float.compare(bmi, 16f) <= 0) {
            bmiLabel = getString(R.string.severely_underweight);
            dietLabel ="Increase the intake of good fats and carbohydrates";
        } else if (Float.compare(bmi, 16f) > 0  &&  Float.compare(bmi, 18.5f) <= 0) {
            bmiLabel = getString(R.string.underweight);
            dietLabel = "Increase the intake of good fats and carbohydrates";
        } else if (Float.compare(bmi, 18.5f) > 0  &&  Float.compare(bmi, 25f) <= 0) {
            bmiLabel = getString(R.string.normal);
            dietLabel = "Well done ! Maintain Your Diet.";
        } else if (Float.compare(bmi, 25f) > 0  &&  Float.compare(bmi, 30f) <= 0) {
            bmiLabel = getString(R.string.overweight);
            dietLabel = "Consider reducing the intake of sugary substances and bad fats , and start exercising .";
        } else if (Float.compare(bmi, 30f) > 0  &&  Float.compare(bmi, 35f) <= 0) {
            bmiLabel = getString(R.string.obese_class_i);
            dietLabel = "Reduce the intake of sugary substances and bad fats , and start exercising .";
        } else if (Float.compare(bmi, 35f) > 0  &&  Float.compare(bmi, 40f) <= 0) {
            bmiLabel = getString(R.string.obese_class_ii);
            dietLabel ="Please meet a physician and plan your diet.";
        } else {
            bmiLabel = getString(R.string.obese_class_iii);
            dietLabel ="Please meet a physician and plan your diet.";
        }

        bmiLabel = bmi + "\n\n" + bmiLabel;
        result.setText(bmiLabel);
        diet.setText(dietLabel);
    }
}
