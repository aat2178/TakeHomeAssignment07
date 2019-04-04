package com.example.takehomeassignment07;

import android.app.Person;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.view.View;

import java.util.ArrayList;

public class RecyclerView extends AppCompatActivity {

    ArrayList<President> presidents;
    private PresidentAdapter presidentAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_view);

        android.support.v7.widget.RecyclerView recyclerView = findViewById(R.id.recycler_view);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        initialData();

        presidentAdapter = new PresidentAdapter(presidents, this);
        recyclerView.setAdapter(presidentAdapter);
    }

    private void initialData() {
        presidents = new ArrayList<>();
        presidents.add(new President("Bill Clinton", "1993-2001", R.drawable.clinton));
        presidents.add(new President("George W. Bush", "2001-2009", R.drawable.bush));
        presidents.add(new President("Barack Obama", "2009-2017", R.drawable.obama));
    }

    private President getRandomPresident(){
        int num = (int) (Math.random()*3);
        if (num == 0){
            return new President("Bill Clinton", "1993-2001", R.drawable.clinton);
        }
        else if(num == 1){
            return new President("George W. Bush", "2001-2009", R.drawable.bush);
        }
        else
            return new President("Barack Obama", "2009-2017", R.drawable.obama);
    }

    public void addPresident(View view){
        President newPres = getRandomPresident();
        presidents.add(newPres);
        presidentAdapter.notifyDataSetChanged();
    }

}
