package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintSet;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.math.BigDecimal;

public class MainActivity extends AppCompatActivity {

    private TextView textView;
    private String outputValue;
    private StringBuilder valueOne = new StringBuilder();
    private StringBuilder valueTwo = new StringBuilder();
    private boolean firstValue;
    private BigDecimal valueOneBD = new BigDecimal("0");
    private BigDecimal valueTwoBD = new BigDecimal("0");
    private String mathCheck;
    private boolean signCheck = false;
    private boolean drawCheck;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button oneBTN;
        Button twoBTN;
        Button threeBTN;
        Button fourBTN;
        Button fiveBTN;
        Button sixBTN;
        Button sevenBTN;
        Button eightBTN;
        Button nineBTN;
        Button zeroBTN;

        Button pointBTN;
        Button signBTN;
        Button sqrtBTN;
        Button clearBTN;
        Button percentBTN;

        Button addBTN;
        Button subtractBTN;
        Button divideBTN;
        Button multBTN;

        Button equalsBTN;

        /*Button Captures*/{
            oneBTN = findViewById(R.id.oneBTN);
            twoBTN = findViewById(R.id.twoBTN);
            threeBTN = findViewById(R.id.threeBTN);
            fourBTN = findViewById(R.id.fourBTN);
            fiveBTN = findViewById(R.id.fiveBTN);
            sixBTN = findViewById(R.id.sixBTN);
            sevenBTN = findViewById(R.id.sevenBTN);
            eightBTN = findViewById(R.id.eightBTN);
            nineBTN = findViewById(R.id.nineBTN);
            zeroBTN = findViewById(R.id.zeroBTN);

            pointBTN = findViewById(R.id.pointBTN);
            signBTN = findViewById(R.id.signBTN);
            sqrtBTN = findViewById(R.id.sqrtBTN);
            clearBTN = findViewById(R.id.clearBTN);
            percentBTN = findViewById(R.id.percentBTN);

            addBTN = findViewById(R.id.addBTN);
            subtractBTN = findViewById(R.id.subtractBTN);
            divideBTN = findViewById(R.id.divideBTN);
            multBTN = findViewById(R.id.multBTN);

            equalsBTN = findViewById(R.id.equalsBTN);
        }
        /*Set Button Text*/{
            oneBTN.setText("1");
            twoBTN.setText("2");
            threeBTN.setText("3");
            fourBTN.setText("4");
            fiveBTN.setText("5");
            sixBTN.setText("6");
            sevenBTN.setText("7");
            eightBTN.setText("8");
            nineBTN.setText("9");
            zeroBTN.setText("0");

            pointBTN.setText(".");
            signBTN.setText("\u00B1");
            sqrtBTN.setText("\u221A");
            clearBTN.setText("C");
            percentBTN.setText("%");

            addBTN.setText("+");
            subtractBTN.setText("-");
            divideBTN.setText("\u00F7");
            multBTN.setText("\u00D7");

            equalsBTN.setText("=");
        }

        textView = findViewById(R.id.textView);
        try{outputValue = valueOne.toString();} catch (Exception e) {
            e.printStackTrace();
        }
        firstValue = true;
        textView.setText(outputValue);


        /*Click Checks*/{
        findViewById(R.id.oneBTN).setOnClickListener(new View.OnClickListener() { @Override public void onClick(View view) { checkThose(oneBTN.getText().toString());} });
        findViewById(R.id.twoBTN).setOnClickListener(new View.OnClickListener() { @Override public void onClick(View view) { checkThose(twoBTN.getText().toString());} });
        findViewById(R.id.threeBTN).setOnClickListener(new View.OnClickListener() { @Override public void onClick(View view) { checkThose(threeBTN.getText().toString());} });
        findViewById(R.id.fourBTN).setOnClickListener(new View.OnClickListener() { @Override public void onClick(View view) { checkThose(fourBTN.getText().toString());} });
        findViewById(R.id.fiveBTN).setOnClickListener(new View.OnClickListener() { @Override public void onClick(View view) { checkThose(fiveBTN.getText().toString());} });
        findViewById(R.id.sixBTN).setOnClickListener(new View.OnClickListener() { @Override public void onClick(View view) { checkThose(sixBTN.getText().toString());} });
        findViewById(R.id.sevenBTN).setOnClickListener(new View.OnClickListener() { @Override public void onClick(View view) { checkThose(sevenBTN.getText().toString());} });
        findViewById(R.id.eightBTN).setOnClickListener(new View.OnClickListener() { @Override public void onClick(View view) { checkThose(eightBTN.getText().toString());} });
        findViewById(R.id.nineBTN).setOnClickListener(new View.OnClickListener() { @Override public void onClick(View view) { checkThose(nineBTN.getText().toString());} });
        findViewById(R.id.zeroBTN).setOnClickListener(new View.OnClickListener() { @Override public void onClick(View view) { checkThose(zeroBTN.getText().toString());} });

        findViewById(R.id.pointBTN).setOnClickListener(new View.OnClickListener() { @Override public void onClick(View view) { checkThose(pointBTN.getText().toString());} });
        findViewById(R.id.signBTN).setOnClickListener(new View.OnClickListener() { @Override public void onClick(View view) { checkThose(signBTN.getText().toString());} });
        findViewById(R.id.sqrtBTN).setOnClickListener(new View.OnClickListener() { @Override public void onClick(View view) { checkThose(sqrtBTN.getText().toString());} });
        findViewById(R.id.clearBTN).setOnClickListener(new View.OnClickListener() { @Override public void onClick(View view) { checkThose(clearBTN.getText().toString());} });
        findViewById(R.id.percentBTN).setOnClickListener(new View.OnClickListener() { @Override public void onClick(View view) { checkThose(percentBTN.getText().toString());} });

        findViewById(R.id.addBTN).setOnClickListener(new View.OnClickListener() { @Override public void onClick(View view) { checkThose(addBTN.getText().toString());} });
        findViewById(R.id.subtractBTN).setOnClickListener(new View.OnClickListener() { @Override public void onClick(View view) { checkThose(subtractBTN.getText().toString());} });
        findViewById(R.id.divideBTN).setOnClickListener(new View.OnClickListener() { @Override public void onClick(View view) { checkThose(divideBTN.getText().toString());} });
        findViewById(R.id.multBTN).setOnClickListener(new View.OnClickListener() { @Override public void onClick(View view) { checkThose(multBTN.getText().toString());} });

        findViewById(R.id.equalsBTN).setOnClickListener(new View.OnClickListener() { @Override public void onClick(View view) { checkThose(equalsBTN.getText().toString());} });
        }
    }
    void checkThose(String value){
        drawCheck = true;

        try {
            valueOneBD = new BigDecimal(valueOne.toString());
            valueTwoBD = new BigDecimal(valueTwo.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }

        if (value.equals("+")) {
            if (firstValue){
                firstValue = false;
                valueOne.setLength(0);
                valueOne.append(valueOneBD.toString());
                outputValue = valueOne.toString();
                mathCheck = "+";
            }
            else{
                valueOneBD.add(valueTwoBD);
                valueTwoBD = new BigDecimal("0");
                valueOne.setLength(0);
                mathCheck = "+";
                valueOne.append(valueOneBD.toString());
                outputValue = valueOne.toString();
            }
        }
        else if (value.equals("-")) {
            if (firstValue){
                firstValue = false;
                valueOne.setLength(0);
                valueOne.append(valueOneBD.toString());
                outputValue = valueOne.toString();
                mathCheck = "-";
            }
            else{
                valueOneBD.subtract(valueTwoBD);
                valueTwoBD = new BigDecimal("0");
                valueOne.setLength(0);
                mathCheck = "-";
                valueOne.append(valueOneBD.toString());
                outputValue = valueOne.toString();
            }
        }
        else if (value.equals(".")) {
            if (firstValue) {valueOne.append("."); outputValue = valueOne.toString();}
            else{ valueTwo.append("."); outputValue = valueTwo.toString();}
        }
        else if (value.equals("C")) {firstValue = true; valueOne.setLength(0); valueTwo.setLength(0); outputValue = "0"; textView.setText(outputValue); valueOneBD = new BigDecimal("0"); valueTwoBD = new BigDecimal("0");}
        else if (value.equals("%")) {
            if (firstValue){
                mathCheck = "%";
                valueOne.setLength(0);
                valueOne.append(valueOneBD.toString());
                outputValue = valueOne.toString();
                firstValue = false;
                drawCheck = true;
            }
            else{
                /*Math Stuff*/
                mathCheck = "%";
            }

        }

        /*Sign*/
        else if (value.equals("\u00B1")) {

            if (firstValue){
                outputValue = "";
                if (!signCheck){
                    outputValue = "-" + valueOne.toString();
                    signCheck = true;
                }
                else{
                    outputValue = valueOne.toString();
                    signCheck = false;}
                textView.setText(outputValue);
            }
            else{
                outputValue = "";
                if (!signCheck){
                    outputValue = "-" + valueTwo.toString();
                    signCheck = true;
                }
                else{
                    outputValue = valueTwo.toString();
                    signCheck = false;
                }
                textView.setText(outputValue);
            }
            drawCheck = true;
        }
        /*Square Root*/
        else if (value.equals("\u221A")) {
            if (firstValue){
                mathCheck = "\u221A";
                outputValue = "\u221A";
                firstValue = false;
                valueOne.setLength(0);
                valueOne.append(valueOneBD.toString());
                outputValue = valueOne.toString();
            }
            else{
                /*Math Stuff*/
                mathCheck = "\u221A";
                valueTwoBD = new BigDecimal("0");
                valueOne.setLength(0);
                valueOne.append(valueOneBD.toString());
                outputValue = valueOne.toString();
            }
        }
        /*Divide*/
        else if (value.equals("\u00F7")) {
            if (firstValue){
                mathCheck = "\u00F7";
                firstValue = false;
                valueOne.setLength(0);
                valueOne.append(valueOneBD.toString());
                outputValue = valueOne.toString();
            }
            else{
                /*Math Stuff*/
                mathCheck = "\u00F7";
                valueOneBD.divide(valueTwoBD);
                valueTwoBD = new BigDecimal("0");
                valueOne.setLength(0);
                valueOne.append(valueOneBD.toString());
                outputValue = valueOne.toString();
            }
        }
        /*Multiply*/
        else if (value.equals("\u00D7")) {
            if (firstValue){
                mathCheck = "\u00D7";
                firstValue = false;
                valueOne.setLength(0);
                valueOne.append(valueOneBD.toString());
                outputValue = valueOne.toString();
            }
            else{
                /*Math Stuff*/
                mathCheck = "\u00D7";
                valueOneBD.multiply(valueTwoBD);
                valueTwoBD = new BigDecimal("0");
                valueOne.setLength(0);
                valueOne.append(valueOneBD.toString());
                outputValue = valueOne.toString();
            }
        }
        else if (value.equals("=")) {

            if (mathCheck.equals("+")){outputValue = valueOneBD.add(valueTwoBD).toString();}
            if (mathCheck.equals("-")){outputValue = valueOneBD.subtract(valueTwoBD).toString();}
            if (mathCheck.equals("\u00D7")){outputValue = valueOneBD.multiply(valueTwoBD).toString();}
            if (mathCheck.equals("\u00F7")){outputValue = valueOneBD.divide(valueTwoBD).toString();}

            /*Square Root*/
            if (mathCheck.equals("\u221A")){outputValue = valueTwoBD.pow((1/2)).toString();}

            if (mathCheck.equals("%")){outputValue = valueTwoBD.multiply(valueOneBD.divide((BigDecimal.TEN).pow(valueOneBD.toString().length()))).toString();}

        }
        else{
            if (firstValue){
                valueOne.append(value.toString());
            }
            else{
                valueTwo.append(value.toString());
            }
            drawCheck = false;
        }

        if(!drawCheck) {
            if (firstValue) {
                outputValue = valueOne.toString();
            } else {
                outputValue = valueTwo.toString();
            }
        }

        textView.setText(outputValue);

    }

}