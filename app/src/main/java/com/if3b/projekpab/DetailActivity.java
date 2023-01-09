package com.if3b.projekpab;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class DetailActivity extends AppCompatActivity {

    private ImageView ivPhoto;
    private TextView tvNama, tvTentang;
    private String getLokasi;
    private Button Lokasi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        ivPhoto = findViewById(R.id.iv_detail_foto);
        tvNama = findViewById(R.id.tv_detail_nama);
        tvTentang = findViewById(R.id.tv_detail_tentang);
        Lokasi = findViewById(R.id.btn_lokasi);

        Intent terima = getIntent();
        String nama = terima.getStringExtra("xNama");
        String tentang = terima.getStringExtra("xTentang");
        String photo = terima.getStringExtra("xFoto");

        setTitle(nama);
        tvNama.setText(nama);
        tvTentang.setText(tentang);
        Glide.with(this)
                .load(photo)
                .into(ivPhoto);

        Lokasi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getLokasi = nama;
                Uri location = Uri.parse("geo:0,0?q=" +
                        getLokasi + " Palembang");
                Intent bukaLokasi = new
                        Intent(Intent.ACTION_VIEW, location);
                startActivity(bukaLokasi);
            }
        });

        }

    }
