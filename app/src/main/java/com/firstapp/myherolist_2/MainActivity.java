package com.firstapp.myherolist_2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);
        LinearLayoutManager lmg = new LinearLayoutManager(this,
                LinearLayoutManager.VERTICAL, false);

        recyclerView.setLayoutManager(lmg);


        ArrayList<MyModel> models = new ArrayList<>();{
            models.add(new MyModel(R.drawable.batman, "Batman", "details about Batman"));
            models.add(new MyModel(R.drawable.biker_mice, "Biker Mice from Mars", "details about Biker Mice"));
            models.add(new MyModel(R.drawable.blade, "Blade", "details about Blade"));
            models.add(new MyModel(R.drawable.bruce_lee, "Bruce Lee", "details about Bruce Lee"));
            models.add(new MyModel(R.drawable.chip_and_dail, "Chip And Dail", "details about Chip And Dail"));
            models.add(new MyModel(R.drawable.darkwing_duck, "Darkwing Duck", "details about Darkwing Duck"));
            models.add(new MyModel(R.drawable.rambo, "Rambo", "details about Rambo"));
            models.add(new MyModel(R.drawable.robocop, "Robocop", "details about Robocop"));
            models.add(new MyModel(R.drawable.spiderman, "Spiderman", "details about Spiderman"));
            models.add(new MyModel(R.drawable.superman, "Superman", "details about Superman"));
            models.add(new MyModel(R.drawable.terminator, "Terminator", "details about Terminator"));
            models.add(new MyModel(R.drawable.turtles, "TNMT", "Teenage Mutant Ninja Turtles"));
        }

        MyAdapter myAdapter = new MyAdapter(models);
        recyclerView.setAdapter(myAdapter);


    }
}