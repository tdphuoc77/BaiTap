package com.example.baitapt6;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView lvGood;
    Adapter adt;
    ArrayList<Good> arr;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lvGood=findViewById(R.id.lvGood);

        arr.add(new Good(R.drawable.a_teveloper_tester_can_never_be_friend, "Tester", 20));
        arr.add(new Good(R.drawable.computer, "Computer", 50));
        arr.add(new Good(R.drawable.worlds_best_developer, "Worlds best Developer", 30));
        arr.add(new Good(R.drawable.yellow_google, "Yellow Google", 52));

        adt= new Adapter(this,R.layout.list_view_item, arr);
        lvGood.setAdapter(adt);
    }
}