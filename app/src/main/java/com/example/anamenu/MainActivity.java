package com.example.anamenu;

import androidx.appcompat.app.AppCompatActivity;

import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private ListView yg_listView;
    private ArrayAdapter<String> yg_adapter;
    private String[] yg_menu = {"İzmir Tarihçesi", "İzmirde Bulunan Tarihi Yerler", "İzmir Yöresel Yemekleri", "İzmir Yöresel Tatlıları"};
    private String[] yg_metin = {"Eski İzmir kenti, körfezin kuzeydoğusunda yer alan ve yüzölçümü yaklaşık yüz dönüm olan bir yarım adacık üzerinde kurulmuştu. Sonraki yüzyıllar boyunca Meles Çayı'nın ve bugünkü Yamanlar Dağı'ndan gelen sellerin getirdikleri mil ile bugünkü Bornova ovası oluştu ve yarım adacık, bir tepe hâline dönüştü."};
    private Intent yg2_yerIntent;
    private int[] yg_resim = {R.drawable.iizmirr};
    private Intent yg_MenuIntents;
    static public Bitmap yg_secilenAna;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        yg_listView = (ListView) findViewById(R.id.main_activity_yg_listView);
        yg_adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, yg_menu);
        yg_listView.setAdapter(yg_adapter);


        yg_listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                System.out.println(i);

                Class<? extends Activity> ooclasser;

                switch (i) {
                    case 0:
                        ooclasser = MenuActivitys.class;

                        break;
                    case 1:
                        ooclasser = YerActivity.class;

                        break;
                    case 2:
                        ooclasser = yerAcivitiy.class;
                        break;
                    case 3:
                        ooclasser = YerActivity2.class;
                        break;
                    default:
                        ooclasser=MainActivity.class;
                }

                yg_MenuIntents = new Intent(MainActivity.this, ooclasser);
                if (i == 0) {
                    yg_MenuIntents.putExtra("yg_izmir", yg_menu[i]);
                    yg_MenuIntents.putExtra("yg_metin", yg_metin[i]);
                    yg_secilenAna = BitmapFactory.decodeResource(getApplicationContext().getResources(), yg_resim[i]);
                    startActivity(yg_MenuIntents);


                } else {
                    System.out.println(ooclasser);
                    startActivity(yg_MenuIntents);

                }
            }
        });
    }
}