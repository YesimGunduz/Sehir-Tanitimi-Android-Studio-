package com.example.anamenu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class TatliActivity extends AppCompatActivity {
    private TextView yg_izmir3,yg_metin3;
    private ImageView yg_resim3;
    private Intent yg_getIntent3;
    private String yg_ymetin3;
    private String yg_yİzmir3;
    private int yg_yResim3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tatli);
        yg_izmir3=(TextView)findViewById(R.id.TatliActivity_Activitys_yg_textView3);
        yg_resim3= (ImageView) findViewById(R.id.TatliActivity_Activitys_yg_ImageView3);
        yg_metin3=(TextView) findViewById(R.id.TatliActivity_Activitys_yg_tarihce3);
        this.setTitle("İzmir Yöresel Tatlıları");
        yg_getIntent3=getIntent();
        yg_yİzmir3=yg_getIntent3.getStringExtra("yg_izmir");
        yg_ymetin3=yg_getIntent3.getStringExtra("yg_metin");

        if (!TextUtils.isEmpty(yg_yİzmir3) && !TextUtils.isEmpty(yg_ymetin3)){
            yg_izmir3.setText(yg_yİzmir3);
            yg_metin3.setText(yg_ymetin3);
            yg_resim3.setImageBitmap(YerActivity2.yg_secilenAna3);
        }

    }
}