package com.example.shopulse.Admin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.example.shopulse.Buyers.HomeActivity;
import com.example.shopulse.Buyers.MainActivity;
import com.example.shopulse.R;

public class AdminKategoriActivity extends AppCompatActivity
{

    private ImageView tShirt, sportsTShirts, kadinElbise, mont;
    private ImageView gozluk, sapka, canta, ayakkabi;
    private ImageView kulaklik, laptop, saat, telefon;

    private Button LogoutBtn, CheckOrdersBtn, maintainProducsBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_kategori);

        LogoutBtn = (Button) findViewById(R.id.admin_logout_btn);
        CheckOrdersBtn = (Button) findViewById(R.id.check_orders_btn);
        maintainProducsBtn = (Button) findViewById(R.id.maintain_btn);



        maintainProducsBtn.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(AdminKategoriActivity.this, HomeActivity.class);
                intent.putExtra("Admin", "Admin");
                startActivity(intent);
            }
        });

        LogoutBtn.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(AdminKategoriActivity.this, MainActivity.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
                startActivity(intent);
                finish();
            }
        });


        CheckOrdersBtn.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(AdminKategoriActivity.this, AdminNewOrdersActivity.class);
                startActivity(intent);
            }
        });


        tShirt = (ImageView) findViewById(R.id.t_shirt);
        sportsTShirts = (ImageView) findViewById(R.id.sports_t_shirt);
        kadinElbise = (ImageView) findViewById(R.id.kadın_elbise);
        mont = (ImageView) findViewById(R.id.mont);

        gozluk = (ImageView) findViewById(R.id.gozluk);
        sapka = (ImageView) findViewById(R.id.sapka);
        canta = (ImageView) findViewById(R.id.canta);
        ayakkabi = (ImageView) findViewById(R.id.ayakkabi);
        
        kulaklik = (ImageView) findViewById(R.id.kulaklik);
        laptop = (ImageView) findViewById(R.id.laptop);
        saat = (ImageView) findViewById(R.id.saat);
        telefon = (ImageView) findViewById(R.id.telefon);


        tShirt.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(AdminKategoriActivity.this, AdminYeniUrunEkleActivity.class);
                intent.putExtra("category", "tShirts");
                startActivity(intent);
            }
        });

        sportsTShirts.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(AdminKategoriActivity.this,AdminYeniUrunEkleActivity.class);
                intent.putExtra("category", "Sports tShirts");
                startActivity(intent);
            }
        });
        kadinElbise.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(AdminKategoriActivity.this,AdminYeniUrunEkleActivity.class);
                intent.putExtra("category", "Female Dresses");
                startActivity(intent);
            }
        });
        mont.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(AdminKategoriActivity.this,AdminYeniUrunEkleActivity.class);
                intent.putExtra("category", "Sweather");
                startActivity(intent);
            }
        });
        gozluk.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(AdminKategoriActivity.this,AdminYeniUrunEkleActivity.class);
                intent.putExtra("category", "Glasses");
                startActivity(intent);
            }
        });
        sapka.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(AdminKategoriActivity.this,AdminYeniUrunEkleActivity.class);
                intent.putExtra("category", "Hats Caps");
                startActivity(intent);
            }
        });
        canta.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(AdminKategoriActivity.this,AdminYeniUrunEkleActivity.class);
                intent.putExtra("category", "Wallets Bags Purses");
                startActivity(intent);
            }
        });
        ayakkabi.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(AdminKategoriActivity.this,AdminYeniUrunEkleActivity.class);
                intent.putExtra("category", "Shoes");
                startActivity(intent);
            }
        });
        kulaklik.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(AdminKategoriActivity.this,AdminYeniUrunEkleActivity.class);
                intent.putExtra("category", "HeadPhones HandFree");
                startActivity(intent);
            }
        });
        laptop.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(AdminKategoriActivity.this,AdminYeniUrunEkleActivity.class);
                intent.putExtra("category", "Laptops");
                startActivity(intent);
            }
        });
        saat.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(AdminKategoriActivity.this,AdminYeniUrunEkleActivity.class);
                intent.putExtra("category", "Watches");
                startActivity(intent);
            }
        });
        telefon.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(AdminKategoriActivity.this,AdminYeniUrunEkleActivity.class);
                intent.putExtra("category", "Mobile Phones");
                startActivity(intent);
            }
        });
    }
}
