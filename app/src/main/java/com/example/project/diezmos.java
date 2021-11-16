package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DecimalFormat;

public class diezmos extends AppCompatActivity {

    double amountEntered;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_diezmos);

        final EditText money = (EditText) findViewById(R.id.amount_entered);
        final RadioButton tithes = (RadioButton) findViewById(R.id.tithe_payment);
        final RadioButton donations  = (RadioButton) findViewById(R.id.donation_payment);
        final TextView result = (TextView) findViewById(R.id.result);

        Button sentMoney = (Button) findViewById(R.id.pay_button);
        sentMoney.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                amountEntered = Double.parseDouble(money.getText().toString());
                DecimalFormat tenth = new DecimalFormat("###,###.##");

                if (tithes.isChecked()) {
                    if (amountEntered <= 100000) {
                       result.setText(tenth.format(amountEntered) + " was your tithe!");
                    } else
                        Toast.makeText(diezmos.this, "Talk to Financial", Toast.LENGTH_LONG).show();
                } //end of tithes

                if (donations.isChecked()) {
                    if (amountEntered <= 100000) {
                       result.setText(tenth.format(amountEntered) + " was your donation!");
                    } else
                        Toast.makeText(diezmos.this, "Talk to Financial", Toast.LENGTH_LONG).show();
                } //end of donations
                Toast.makeText(diezmos.this, "Payment Accepted", Toast.LENGTH_LONG).show();
            } //end of onClick
        }); //end of setOnClickListener
    } //end of onCreate
} //end of class