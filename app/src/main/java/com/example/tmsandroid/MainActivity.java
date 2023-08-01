package com.example.tmsandroid;

import android.os.Bundle;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
     private RecyclerView eventsRecView;
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        eventsRecView = findViewById(R.id.eventsRecView);

        ArrayList<Event> events = new ArrayList<>();
        events.add(new Event(1,"Untold","Festival de Muzica", "https://i0.1616.ro/media/2/2701/33647/21212741/1/untold.png"));
        events.add(new Event(2, "RockFestival", "Festival de Rock", "https://www.institutiilestatului.ro/wp-content/uploads/2023/06/355694001_658527916301559_2796432390177616914_n.jpg"));
       EventsRecViewAdapter adapter = new EventsRecViewAdapter();
       adapter.setEvents(events);
       eventsRecView.setAdapter(adapter);
       eventsRecView.setLayoutManager(new LinearLayoutManager(this));
    }
}
