package com.example.shopulse.Sellers;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.shopulse.Buyers.MainActivity;
import com.example.shopulse.R;

public class SellerRegistrationActivity extends AppCompatActivity
{
    private Button sellerLoginBegin;
    private EditText name

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seller_registration);

        sellerLoginBegin = findViewById(R.id.seller_already_btn);

        sellerLoginBegin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SellerRegistrationActivity.this, SellersLoginActivity.class);
                startActivity(intent);
            }
        });
    }
}
