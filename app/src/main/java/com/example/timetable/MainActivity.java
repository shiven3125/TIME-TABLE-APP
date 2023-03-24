package com.example.timetable;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Toast;

import com.example.timetable.databinding.ActivityMainBinding;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;

    ArrayList<String> arraylist_time;
    ArrayList<Integer> arraylist_drawables;


    String[] item = {"G1","G2","G3","G4","G5","G6","G7","G8","G9","G10","G11","G12","G13","G14","G15","G16","G17","G18","G19","G20","G21","G22","G23","G24","G25","G26","G27","G28","G29","G30"};
    AutoCompleteTextView autoCompleteTextView;
    ArrayAdapter<String> adapterItems;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        load_data();



        autoCompleteTextView = findViewById(R.id.auto_complete_txt);
        adapterItems = new ArrayAdapter<String>(this,R.layout.list_items,item);

        autoCompleteTextView.setAdapter(adapterItems);

        autoCompleteTextView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                binding.imgAnimal.setImageResource(arraylist_drawables.get(position));
                String item = adapterView.getItemAtPosition(position).toString();
                Toast.makeText(MainActivity.this,"Selected :"+item,Toast.LENGTH_SHORT).show();
            }
        });
    }
    public void  load_data()
    {
        arraylist_drawables=new ArrayList<>();
        arraylist_drawables.add(R.drawable.g1);
        arraylist_drawables.add(R.drawable.g2);
        arraylist_drawables.add(R.drawable.g3);
        arraylist_drawables.add(R.drawable.g4);
        arraylist_drawables.add(R.drawable.g5);
        arraylist_drawables.add(R.drawable.g6);
        arraylist_drawables.add(R.drawable.g7);
        arraylist_drawables.add(R.drawable.g8);
        arraylist_drawables.add(R.drawable.g9);
        arraylist_drawables.add(R.drawable.g10);
        arraylist_drawables.add(R.drawable.g11);
        arraylist_drawables.add(R.drawable.g12);
        arraylist_drawables.add(R.drawable.g13);
        arraylist_drawables.add(R.drawable.g14);
        arraylist_drawables.add(R.drawable.g15);
        arraylist_drawables.add(R.drawable.g16);
        arraylist_drawables.add(R.drawable.g17);
        arraylist_drawables.add(R.drawable.g18);
        arraylist_drawables.add(R.drawable.g19);
        arraylist_drawables.add(R.drawable.g20);
        arraylist_drawables.add(R.drawable.g21);
        arraylist_drawables.add(R.drawable.g22);
        arraylist_drawables.add(R.drawable.g23);
        arraylist_drawables.add(R.drawable.g24);
        arraylist_drawables.add(R.drawable.g25);
        arraylist_drawables.add(R.drawable.g26);
        arraylist_drawables.add(R.drawable.g27);
        arraylist_drawables.add(R.drawable.g28);
        arraylist_drawables.add(R.drawable.g29);
        arraylist_drawables.add(R.drawable.g30);
    }
}