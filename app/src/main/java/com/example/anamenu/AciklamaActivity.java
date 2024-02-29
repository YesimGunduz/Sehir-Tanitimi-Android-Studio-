package com.example.anamenu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class AciklamaActivity extends AppCompatActivity {

    private TextView yg3_EfesA,yg3_metin;
    private ImageView yg3_resim;
    private Intent yg3_getIntent;
    private String yg3_y3metin;
    private String yg3_y3EfesA;
    private int yg3_y3Resim;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       yg3_EfesA=(TextView) findViewById(R.id.Aciklama_Activitys_yg3_TtextView);
        yg3_metin=(TextView) findViewById(R.id.Aciklama_Activitys_yg3_Ttarihce);
        yg3_resim=(ImageView) findViewById(R.id.Aciklama_Activitys_yg3_IimageView);
        this.setTitle("İzmir Tarihi Yerler");
        yg3_getIntent=getIntent();
        yg3_y3EfesA=yg3_getIntent.getStringExtra("yg3_EfesA");
        yg3_y3metin=yg3_getIntent.getStringExtra("yg3_metin");
        if (!TextUtils.isEmpty(yg3_y3EfesA) && !TextUtils.isEmpty(yg3_y3EfesA)){
            yg3_metin.setText(yg3_y3EfesA);
            yg3_metin.setText(yg3_y3metin);
        }

    }
}