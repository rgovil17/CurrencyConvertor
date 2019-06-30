package com.raghavapp.currencyconvertor;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void convert(View view) {
        EditText amount = findViewById(R.id.amount);
        double moneyusd = Double.parseDouble(amount.getText().toString());
        double moneyinr = moneyusd * 71.22;
        Toast.makeText(this, moneyusd + "$ is equal to ₹" + moneyinr , Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
