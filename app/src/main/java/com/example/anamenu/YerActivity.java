package com.example.anamenu;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.opengl.Matrix;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;

public class YerActivity extends AppCompatActivity {
    private ListView yg2_ListView;
    private ImageView yg3_seçilen;
    private ArrayAdapter<String>yg_adapter;
    private String[] yg2_açıklama={"Efes, Anadolu'nun batı kıyısında, bugünkü İzmir ilinin Selçuk ilçesinin üç kilometre güneybatısında yer alan antik bir Luvi şehriydi. Şehir Anadolu'da Yunan sömürgeciliğinin başlamasıyla birlikte İyonya ve daha sonra Roma dönemlerinde de önemini korumuştur. Kuruluşu Cilalı Taş Devri'ne yani MÖ 6000 yıllarına dayanır.","İzmir’in Karataş bölgesi tarih boyunca taş ocağı olarak kullanıldığından, sahil şeridi (bugünkü Mithatpaşa Caddesi) ile yukarıdaki Halil Rıfat Paşa semti uçurumlarla birbirinden ayrılmıştı. İki semt arasına Türklerin “Karataş Merdivenleri”, yukarıdaki semte yerleşen Yahudilerin “Devidasların Merdiveni” adını verdikleri merdivenler yapıldı","İzmir’in Karataş bölgesi tarih boyunca taş ocağı olarak kullanıldığından, sahil şeridi (bugünkü Mithatpaşa Caddesi) ile yukarıdaki Halil Rıfat Paşa semti uçurumlarla birbirinden ayrılmıştı. İki semt arasına Türklerin “Karataş Merdivenleri”, yukarıdaki semte yerleşen Yahudilerin “Devidasların Merdiveni” adını verdikleri merdivenler yapıldı"};

    private int[] yg_resim1 = {R.drawable.efes,R.drawable.saatkulesi,R.drawable.tarihi};
    private Intent yg2_yerIntent;
    static public Bitmap yg_secilenAna1;
    private String[] yg2_Yerler={"Efes Antik Kenti","Saat Kulesi","Tarihi Asansör"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_yer);
        yg2_ListView=findViewById(R.id.Yer_Activity_yg2_ListView);
        yg_adapter=new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,yg2_Yerler);
        yg2_ListView.setAdapter(yg_adapter);
        this.setTitle("İzmir Tarihi Yerler");


        yg2_ListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                Class<? extends Activity> ooclasser;
                switch (i) {
                    case 0:
                        ooclasser = efesActivity.class;
                        break;
                    case 1:
                        ooclasser = YerActivity.class;

                        break;
                    case 2:
                        ooclasser = YerActivity.class;
                        break;

                    default:
                        ooclasser =YerActivity.class;
                }
                if (i == 0) {
                    yg2_yerIntent  = new Intent(YerActivity.this, efesActivity.class);

                    yg2_yerIntent.putExtra("yg_izmir", yg2_Yerler[i]);
                    yg2_yerIntent.putExtra("yg_metin", yg2_açıklama[i]);
                    yg_secilenAna1 = BitmapFactory.decodeResource(getApplicationContext().getResources(), yg_resim1[i]);
                    startActivity(yg2_yerIntent);

                }
                    else if (i==1){
                    yg2_yerIntent  = new Intent(YerActivity.this, efesActivity.class);

                    yg2_yerIntent.putExtra("yg_izmir", yg2_Yerler[i]);
                        yg2_yerIntent.putExtra("yg_metin",yg2_açıklama[i]);
                        yg_secilenAna1= BitmapFactory.decodeResource(getApplicationContext().getResources(),yg_resim1[i]);
                        startActivity(yg2_yerIntent);

                    }
                    else if (i==2){
                    yg2_yerIntent  = new Intent(YerActivity.this, efesActivity.class);

                    yg2_yerIntent.putExtra("yg_izmir", yg2_Yerler[i]);
                        yg2_yerIntent.putExtra("yg_metin",yg2_açıklama[i]);
                        yg_secilenAna1= BitmapFactory.decodeResource(getApplicationContext().getResources(),yg_resim1[i]);
                        startActivity(yg2_yerIntent);
                    }

                 else {
                    System.out.println(ooclasser);
                    startActivity(yg2_yerIntent);

                }

            }
        });
                }




}