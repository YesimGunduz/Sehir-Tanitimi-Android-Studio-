package com.example.anamenu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class MenuActivitys extends AppCompatActivity {
    private TextView yg_izmir,yg_metin;
    private ImageView yg_resim;
    private Intent yg_getIntent;
    private String yg_ymetin;
    private String yg_yİzmir;
    private int yg_yResim;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_activitys);
        yg_izmir=(TextView)findViewById(R.id.Menu_Activitys_yg_textView);
        yg_resim= (ImageView) findViewById(R.id.Menu_Activitys_yg_ImageView);
        yg_metin=(TextView) findViewById(R.id.Menu_Activitys_yg_tarihce);
        this.setTitle("İzmir Tarihçesi");
        yg_getIntent=getIntent();
        yg_yİzmir=yg_getIntent.getStringExtra("yg_izmir");
        yg_ymetin=yg_getIntent.getStringExtra("yg_metin");

        if (!TextUtils.isEmpty(yg_yİzmir) && !TextUtils.isEmpty(yg_ymetin)){
        yg_izmir.setText(yg_yİzmir);
        yg_metin.setText(yg_ymetin);
        yg_resim.setImageBitmap(MainActivity.yg_secilenAna);
        }

    }
}