package com.example.anamenu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class YemekActivity extends AppCompatActivity {
    private TextView yg_izmir2,yg_metin2;
    private ImageView yg_resim2;
    private Intent yg_getIntent2;
    private String yg_ymetin2;
    private String yg_yİzmir2;
    private int yg_yResim2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_yemek);
        yg_izmir2=(TextView)findViewById(R.id.YemekActivity_Activitys_yg_textView2);
        yg_resim2= (ImageView) findViewById(R.id.YemekActivity_Activitys_yg_ImageView2);
        yg_metin2=(TextView) findViewById(R.id.YemekActivity_Activitys_yg_tarihce2);
        this.setTitle("İzmir Yöresel Yemekleri");
        yg_getIntent2=getIntent();
        yg_yİzmir2=yg_getIntent2.getStringExtra("yg_izmir");
        yg_ymetin2=yg_getIntent2.getStringExtra("yg_metin");

        if (!TextUtils.isEmpty(yg_yİzmir2) && !TextUtils.isEmpty(yg_ymetin2)){
            yg_izmir2.setText(yg_yİzmir2);
            yg_metin2.setText(yg_ymetin2);
            yg_resim2.setImageBitmap(yerAcivitiy.yg_secilenAna2);
        }

    }
}