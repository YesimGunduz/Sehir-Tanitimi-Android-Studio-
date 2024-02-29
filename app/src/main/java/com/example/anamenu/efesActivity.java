package com.example.anamenu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class efesActivity extends AppCompatActivity {
    private TextView yg_izmir1,yg_metin1;
    private ImageView yg_resim1;
    private Intent yg_getIntent1;
    private String yg_ymetin1;
    private String yg_yİzmir1;
    private int yg_yResim1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_efes);
        yg_izmir1=(TextView)findViewById(R.id.efesActivity_Activitys_yg_textView);
        yg_resim1= (ImageView) findViewById(R.id.efesActivity_Activitys_yg_ImageView);
        yg_metin1=(TextView) findViewById(R.id.efesActivity_Activitys_yg_tarihce);
        this.setTitle("İzmir Tarihi Yerler");
        yg_getIntent1=getIntent();
        yg_yİzmir1=yg_getIntent1.getStringExtra("yg_izmir");
        yg_ymetin1=yg_getIntent1.getStringExtra("yg_metin");

        if (!TextUtils.isEmpty(yg_yİzmir1) && !TextUtils.isEmpty(yg_ymetin1)){
            yg_izmir1.setText(yg_yİzmir1);
            yg_metin1.setText(yg_ymetin1);
            yg_resim1.setImageBitmap(YerActivity.yg_secilenAna1);
        }

    }
}