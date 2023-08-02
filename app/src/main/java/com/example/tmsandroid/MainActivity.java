package com.example.tmsandroid;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SearchView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.tmsandroid.adapters.EventsRecViewAdapter;
import com.example.tmsandroid.models.Event;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
     private RecyclerView eventsRecView;
     private SearchView searchView;
     private List<Event> eventList;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setTitle("Events");

        eventsRecView = findViewById(R.id.eventsRecView);
        eventList = new ArrayList<>();

        searchView = findViewById(R.id.searchView);
        searchView.clearFocus();
        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                //filterList(newText);
                return true;
            }
        });

        ArrayList<Event> events = new ArrayList<>();
        events.add(new Event(1,"Untold","Festival de Muzica", "https://i0.1616.ro/media/2/2701/33647/21212741/1/untold.png", "2022"));
        events.add(new Event(2, "RockFestival", "Festival de Rock", "https://www.institutiilestatului.ro/wp-content/uploads/2023/06/355694001_658527916301559_2796432390177616914_n.jpg", "2023"));
        events.add(new Event(3, "JazzFestival", "Festival de Jazz", "https://www.centrulculturaldeva.ro/wp-content/uploads/2022/08/DJF.jpg", "2024"));
        events.add(new Event(4, "FolkFestival", "Festival de Folk", "https://www.observatorcultural.ro/wp-content/uploads/2022/07/afis-Folk-la-altar-scaled.jpg", "2019"));

        EventsRecViewAdapter adapter = new EventsRecViewAdapter(this);
       adapter.setEvents(events);
       eventsRecView.setAdapter(adapter);
       eventsRecView.setLayoutManager(new LinearLayoutManager(this));
    }

    /*
    private void filterList(String text) {
        ArrayList<Event> filteredList = new ArrayList<>();
        EventsRecViewAdapter adapter2 = new EventsRecViewAdapter(this);
        for(Event event : eventList) {
            if(event.getEventName().toLowerCase().contains(text.toLowerCase())) {
                filteredList.add(event);
            }
        }
        if(filteredList.isEmpty()) {
            Toast.makeText(this,"No data found", Toast.LENGTH_SHORT).show();
        } else {
            adapter2.setFilteredList(filteredList);
        }
    } */

    public void openSecondActivity(View view) {
        startActivity(new Intent(this, SecondActivity.class));
    }
}
