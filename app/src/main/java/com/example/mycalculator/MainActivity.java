package com.example.mycalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    private TextView Tv_Result;
    private Double first, second;
    private boolean isClickOperation = false;
    private String operetion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Tv_Result = findViewById(R.id.result);
    }

    public void onClickNumber(View view) {
        switch (view.getId()) {
            case R.id.btn_zero:
                if (Tv_Result.getText().toString().equals("0")) {
                    Tv_Result.setText("0");
                } else {
                    Tv_Result.append("0");
                }
                if (isClickOperation) {
                    Tv_Result.setText("0");
                }
                isClickOperation = false;

                break;
            case R.id.btn_one:
                if (Tv_Result.getText().toString().equals("0")) {
                    Tv_Result.setText("1");
                } else {
                    Tv_Result.append("1");
                }
                if (isClickOperation) {
                    Tv_Result.setText("1");
                }
                isClickOperation = false;

                break;
            case R.id.btn_two:
                if (Tv_Result.getText().toString().equals("0")) {
                    Tv_Result.setText("2");
                } else {
                    Tv_Result.append("2");
                }
                if (isClickOperation) {
                    Tv_Result.setText("2");
                }
                isClickOperation = false;
                break;
            case R.id.btn_three:
                if (Tv_Result.getText().toString().equals("0")) {
                    Tv_Result.setText("3");
                } else {
                    Tv_Result.append("3");
                }
                if (isClickOperation) {
                    Tv_Result.setText("3");
                }
                isClickOperation = false;
                break;
            case R.id.btn_four:
                if (Tv_Result.getText().toString().equals("0")) {
                    Tv_Result.setText("4");
                } else {
                    Tv_Result.append("4");
                }
                if (isClickOperation) {
                    Tv_Result.setText("4");
                }
                isClickOperation = false;
                break;
            case R.id.btn_five:
                if (Tv_Result.getText().toString().equals("0")) {
                    Tv_Result.setText("5");
                } else {
                    Tv_Result.append("5");
                }
                if (isClickOperation) {
                    Tv_Result.setText("5");
                }
                isClickOperation = false;
                break;
            case R.id.btn_six:
                if (Tv_Result.getText().toString().equals("0")) {
                    Tv_Result.setText("6");
                } else {
                    Tv_Result.append("6");
                }
                if (isClickOperation) {
                    Tv_Result.setText("6");
                }
                isClickOperation = false;
                break;
            case R.id.btn_seven:
                if (Tv_Result.getText().toString().equals("0")) {
                    Tv_Result.setText("7");
                } else {
                    Tv_Result.append("7");
                }
                if (isClickOperation) {
                    Tv_Result.setText("7");
                }
                isClickOperation = false;
                break;
            case R.id.btn_eigth:
                if (Tv_Result.getText().toString().equals("0")) {
                    Tv_Result.setText("8");
                } else {
                    Tv_Result.append("8");
                }
                if (isClickOperation) {
                    Tv_Result.setText("8");
                }
                isClickOperation = false;
                break;
            case R.id.btn_nine:
                if (Tv_Result.getText().toString().equals("0")) {
                    Tv_Result.setText("9");
                } else {
                    Tv_Result.append("9");
                }
                if (isClickOperation) {
                    Tv_Result.setText("9");
                }
                isClickOperation = false;
                break;
            case R.id.btn_clear:
                Tv_Result.setText("0");
                isClickOperation = false;
                first = 0.0;
                second = 0.0;
                break;
        }
    }

    public void onClickOperation(View view) {
        switch (view.getId()) {

            case R.id.btn_minus:
                first = Double.parseDouble(Tv_Result.getText().toString());
                isClickOperation = true;
                operetion = "-";
                break;
            case R.id.plus:
                first = Double.parseDouble(Tv_Result.getText().toString());
                isClickOperation = true;
                operetion = "+";
                break;
            case R.id.btn_umnosh:
                first = Double.parseDouble(Tv_Result.getText().toString());
                isClickOperation = true;
                operetion = "*";
                break;
            case R.id.btn_delit:
                first = Double.parseDouble(Tv_Result.getText().toString());
                isClickOperation = true;
                operetion = "/";
                break;
            case R.id.btn_procent:
                first = Double.parseDouble(Tv_Result.getText().toString());
                isClickOperation = true;
                operetion = "%";
                break;
            case R.id.tochka:
                first = Double.parseDouble(Tv_Result.getText().toString());
                isClickOperation = true;
                operetion = ".";
                break;
            case R.id.btn_equals:
                second = Double.parseDouble(Tv_Result.getText().toString());
                Double result = 0.0;
                switch (operetion) {
                    case "+":
                        result = first + second;
                        break;
                    case "*":
                        result = first * second;
                        break;
                    case "-":
                        result = first - second;
                        break;
                    case "/":
                        result = first / second;
                        break;
                    case "%":
                        result = first % second;
                        break;
                    case ".":
                        result = second;
                        break;
                }
                Tv_Result.setText(result.toString());
                isClickOperation = true;

                break;
        }
    }
}