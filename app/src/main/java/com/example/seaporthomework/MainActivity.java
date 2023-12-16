package com.example.seaporthomework;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Hub Hub = new Hub() { @Override protected double resultMoneyForMonth() { return 0; }};
        System.out.println(Hub.incomePerMonth(170_000, 125, 3500));

        TextView rent = findViewById(R.id.rentIncome);
        String rentText = "Доход с аренды площадей порта: " + Hub.getRentIncome();
        rent.setText(rentText);

        TextView service = findViewById(R.id.serviceIncome);
        String serviceText = "Доход с обслуживания судов " + Hub.getServiceIncome();
        service.setText(serviceText);

        TextView income = findViewById(R.id.income);
        String incomeText = "Общий доход порта: " + Hub.incomePerMonth(170_000, 125, 3500);
        income.setText(incomeText);



    }

}