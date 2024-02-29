package com.example.anamenu;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;

public class yerAcivitiy extends AppCompatActivity {
    private ListView yg2_ListView2;
    private ImageView yg3_seçilen2;
    private ArrayAdapter<String> yg_adapter2;
    private String[] yg2_açıklama2={"Türk aklının dolmaya düşkünlüğü herkesçe bilinmektedir. Ancak bu farklı dolma deneyenlere bildikleri tüm dolmaları unutturuyor. İzmir’de en sevilen ana yemeklerden biri olan kabak çiçeği dolması, hem hafifliği hem de kabak çiçeğinin eşsiz lezzetiyle yiyen herkesi kendine hayran bırakıyor.","Ege bölgesi ile özellikle de İzmir ile özdeşleşmiş yemeklerden biri olan enginar dolması bahar aylarında İzmir’de adına festivaller düzenlenen enginar bitkisi ile yapılan bir yemek. Başka bölgelerde pek bilinmeyen enginar, zeytinyağlılarıyla ünlü İzmir mutfağının en çok tüketilen sebzelerinden biridir. Mevsimi gelince İzmir pazarlarını şenlendiren enginardan vazgeçemeyen İzmirli kadınlar kışın da bu lezzetin keyfini çıkarabilmek için dondurucularında saklıyor.","Ege’nin tüm illerinde olduğu gibi İzmir’de de deniz ürünleri ile hazırlanan sofralar çok meşhurdur. Gün batımına karşı kurulan gecenin geç saatlerine kadar oturulan sofralarda yemeğin açılışını yapan en güzel lezzettir deniz börülcesi. Bol zeytinyağlı ve sarımsaklı İzmir usulü deniz börülcesi sofralarda hem meze hem de salata olarak yerini almaktadır."};
    private int[] yg_resim2 ={R.drawable.kabakcicegidolmasi,R.drawable.enginardolmasi,R.drawable.denizborulcesi};
    private Intent yg2_yerIntent2;
    static public Bitmap yg_secilenAna2;
    private String[]yg2_yemekler={"Kabak Çiceği Dolması","Enginar Dolması","Deniz Börülcesi"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_yer_acivitiy);
       yg2_ListView2=findViewById(R.id.Yer_Activity_yg2_ListView2);
        yg_adapter2=new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,yg2_yemekler);
        yg2_ListView2.setAdapter(yg_adapter2);
        this.setTitle("İzmir Yöresel Yemekleri");


        yg2_ListView2.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                Class<? extends Activity> ooclasser;
                switch (i) {
                    case 0:
                        ooclasser = YemekActivity.class;
                        break;
                    case 1:
                        ooclasser = yerAcivitiy.class;

                        break;
                    case 2:
                        ooclasser = yerAcivitiy.class;
                        break;

                    default:
                        ooclasser = yerAcivitiy.class;
                }
                if (i == 0) {
                    yg2_yerIntent2  = new Intent(yerAcivitiy.this, YemekActivity.class);

                    yg2_yerIntent2.putExtra("yg_izmir", yg2_yemekler[i]);
                    yg2_yerIntent2.putExtra("yg_metin", yg2_açıklama2[i]);
                    yg_secilenAna2 = BitmapFactory.decodeResource(getApplicationContext().getResources(), yg_resim2[i]);
                    startActivity(yg2_yerIntent2);
                }
                else if (i==1){
                    yg2_yerIntent2  = new Intent(yerAcivitiy.this, YemekActivity.class);

                    yg2_yerIntent2.putExtra("yg_izmir", yg2_yemekler[i]);
                    yg2_yerIntent2.putExtra("yg_metin",yg2_açıklama2[i]);
                    yg_secilenAna2= BitmapFactory.decodeResource(getApplicationContext().getResources(),yg_resim2[i]);
                    startActivity(yg2_yerIntent2);

                }
                else if (i==2){
                    yg2_yerIntent2  = new Intent(yerAcivitiy.this, YemekActivity.class);

                    yg2_yerIntent2.putExtra("yg_izmir", yg2_yemekler[i]);
                    yg2_yerIntent2.putExtra("yg_metin",yg2_açıklama2[i]);
                    yg_secilenAna2= BitmapFactory.decodeResource(getApplicationContext().getResources(),yg_resim2[i]);
                    startActivity(yg2_yerIntent2);
                }

                else {
                    System.out.println(ooclasser);
                    startActivity(yg2_yerIntent2);

                }

            }
        });
    }
}