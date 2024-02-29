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

public class YerActivity2 extends AppCompatActivity {
    private ListView yg2_ListView3;
    private ImageView yg3_seçilen3;
    private ArrayAdapter<String> yg_adapter3;
    private String[] yg2_açıklama3={"Başta İzmir olmak üzere Batı Anadolu'ya özgü bir tatlıdır.İzmir Şambalisi adıyla coğrafi işaret almıştır. Ramazan aylarında özellikle yapılmaktadır.","Yunanistan'dan, Arabistan'a içerisinde Türkiye'nin de bulunduğu geniş bir coğrafyada değişik isimlerle ve benzer tariflerle bilinen lokma tatlısı özellikle İzmir kültürünün vazgeçilmez bir parçası haline gelmiştir. Bu yüzden İzmir Lokması olarak bilinir.","Ayıklanan bademlerin su, limon ve şeker ile ezilerek macun kıvamına getirilmesiyle yapılan bir tatlıdır. "};
            private int[] yg_resim3 ={R.drawable.sambalitatlisi,R.drawable.lokma,R.drawable.bademezmesi};
    private Intent yg2_yerIntent3;
    static public Bitmap yg_secilenAna3;
    private String[]yg2_tatlılar={" Şambali Tatlısı","Lokma","Badem Ezmesi"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_yer2);
        yg2_ListView3=findViewById(R.id.Yer_Activity_yg2_ListView3);
        yg_adapter3=new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,yg2_tatlılar);
        yg2_ListView3.setAdapter(yg_adapter3);
        this.setTitle("İzmir Yöresel Tatlıları");


        yg2_ListView3.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                Class<? extends Activity> ooclasser;
                switch (i) {
                    case 0:
                        ooclasser = TatliActivity.class;
                        break;
                    case 1:
                        ooclasser =YerActivity2.class;

                        break;
                    case 2:
                        ooclasser = YerActivity2.class;
                        break;

                    default:
                        ooclasser = YerActivity2.class;
                }
                if (i == 0) {
                    yg2_yerIntent3  = new Intent(YerActivity2.this, TatliActivity.class);

                    yg2_yerIntent3.putExtra("yg_izmir", yg2_tatlılar[i]);
                    yg2_yerIntent3.putExtra("yg_metin", yg2_açıklama3[i]);
                    yg_secilenAna3 = BitmapFactory.decodeResource(getApplicationContext().getResources(), yg_resim3[i]);
                    startActivity(yg2_yerIntent3);
                }
                else if (i==1){
                    yg2_yerIntent3  = new Intent(YerActivity2.this, TatliActivity.class);

                    yg2_yerIntent3.putExtra("yg_izmir", yg2_tatlılar[i]);
                    yg2_yerIntent3.putExtra("yg_metin",yg2_açıklama3[i]);
                    yg_secilenAna3= BitmapFactory.decodeResource(getApplicationContext().getResources(),yg_resim3[i]);
                    startActivity(yg2_yerIntent3);

                }
                else if (i==2){
                    yg2_yerIntent3  = new Intent(YerActivity2.this, TatliActivity.class);

                    yg2_yerIntent3.putExtra("yg_izmir", yg2_tatlılar[i]);
                    yg2_yerIntent3.putExtra("yg_metin",yg2_açıklama3[i]);
                    yg_secilenAna3= BitmapFactory.decodeResource(getApplicationContext().getResources(),yg_resim3[i]);
                    startActivity(yg2_yerIntent3);
                }

                else {
                    System.out.println(ooclasser);
                    startActivity(yg2_yerIntent3);

                }

            }
        });
    }

}
