package ug.ac.must.bcs.kamfred;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class PersonData extends AppCompatActivity {
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_person_data);

        listView = (ListView) findViewById(R.id.list_item);

        ArrayList<String> arrayList = new ArrayList<>();

        arrayList.add("new_place");
        arrayList.add("location");
        arrayList.add("distance");


        ArrayAdapter arrayAdapter = new ArrayAdapter(this, R.layout.activity_person_data,arrayList);
        listView.setAdapter(arrayAdapter);


            }
        }