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
import com.example.tmsandroid.models.EventTest;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
     private RecyclerView eventsRecView;
     private SearchView searchView;
     private List<EventTest> eventTestList;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        eventsRecView = findViewById(R.id.eventsRecView);
        eventTestList = new ArrayList<>();

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

        ArrayList<EventTest> eventTests = new ArrayList<>();
        eventTests.add(new EventTest(1,"Untold","Festival de Muzica", "https://i0.1616.ro/media/2/2701/33647/21212741/1/untold.png", "4 aug 2023"));
        eventTests.add(new EventTest(2, "Rockstadt", "Festival de Rock", "https://www.maximumrock.ro/wp-content/uploads/2018/07/rockstadtfinal.jpg", "5 sep 2023"));
        eventTests.add(new EventTest(3, "Smida Jazz", "Festival de Jazz", "https://www.centrulculturaldeva.ro/wp-content/uploads/2022/08/DJF.jpg", "2 dec 2024"));
        eventTests.add(new EventTest(4, "Folk Festival", "Festival de Folk", "https://www.observatorcultural.ro/wp-content/uploads/2022/07/afis-Folk-la-altar-scaled.jpg", "12 aug 2023"));

        EventsRecViewAdapter adapter = new EventsRecViewAdapter(this);
       adapter.setEvents(eventTests);
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
