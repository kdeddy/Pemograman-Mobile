package com.example.recyleview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyleView;

    String Image[],Deskripsi[];
    int Images[] = {R.drawable.whatsapp, R.drawable.instagram,R.drawable.youtube,R.drawable.pinterest,
            R.drawable.facebook,R.drawable.snapchat,R.drawable.linkedin,R.drawable.twitter};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyleView = findViewById(R.id.recyleView);

        Image = getResources().getStringArray(R.array.SocialList);
        Deskripsi = getResources().getStringArray(R.array.Deskripsi);

        MyAdapter myAdapter = new MyAdapter( this, Image, Deskripsi, Images);
        recyleView.setAdapter(myAdapter);
        recyleView.setLayoutManager(new LinearLayoutManager(this));
    }
}
