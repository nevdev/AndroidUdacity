package com.example.android.justjava;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;



import java.text.NumberFormat;

/**
 * This app displays an order form to order coffee.
 */
public class MainActivity extends AppCompatActivity {

    private int order = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * This method is called when the order button is clicked.
     */
    public void submitOrder(View view){
        int price = 6;



        displayPrice(price * this.order);
    }

    public void decrementQuantity(View view){
        TextView quantityTextView = (TextView) findViewById(
                R.id.quantity_text_view);
        this.order = Integer.parseInt(quantityTextView.getText().toString());
        if (this.order != 0)
            this.order--;

        quantityTextView.setText("" + this.order);
    }

    public void incrementQuantity(View view){
        TextView quantityTextView = (TextView) findViewById(
                R.id.quantity_text_view);
        this.order = Integer.parseInt(quantityTextView.getText().toString());
        this.order++;

        quantityTextView.setText("" + this.order);
    }
/*
/**
 *  This method displays the given price on the screen.
 */

    private void displayPrice(int number){
        TextView priceTextView = (TextView) findViewById(
                R.id.price_text_view);
        priceTextView.setText(NumberFormat.getCurrencyInstance().format(number));
    }

/**
 * This method displays the given quantity value on screen.
 */
/*
    private void display(int number){
        TextView quantityTextView = (TextView) findViewById(
                R.id.quantity_text_view);
        quantityTextView.setText("" + number);
    }
  */
}
