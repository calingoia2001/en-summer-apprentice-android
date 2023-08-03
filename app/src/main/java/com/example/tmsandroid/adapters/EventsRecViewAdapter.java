package com.example.tmsandroid.adapters;

import android.content.Context;
import android.transition.TransitionManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.tmsandroid.R;
import com.example.tmsandroid.models.Event;

import java.util.ArrayList;

public class EventsRecViewAdapter extends RecyclerView.Adapter<EventsRecViewAdapter.ViewHolder> {
    private ArrayList<Event> events = new ArrayList<>();
    private Context context;
    public EventsRecViewAdapter(Context context) {
        this.context = context;
    }

    public void setFilteredList(ArrayList<Event> filteredList) {
        this.events = filteredList;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.events_list_item, parent, false);
        ViewHolder holder = new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        holder.txtName.setText(events.get(position).getEventName());


        holder.parent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context, events.get(position).getEventName() + " selected!", Toast.LENGTH_SHORT).show();
            }
        });


        holder.eventDescription.setText(events.get(position).getEventDescription());
        holder.startDate.setText("Date: " + events.get(position).getStartDate());

        Glide.with(context)
                .asBitmap()
                .load(events.get(position).getImageUrl())
                .into(holder.image);




        if(events.get(position).isExpanded()) {
            TransitionManager.beginDelayedTransition(holder.parent);
            holder.expandedRelativeLayout.setVisibility(View.VISIBLE);
            holder.downArrow.setVisibility(View.GONE);
        } else {
            TransitionManager.beginDelayedTransition(holder.parent);
            holder.expandedRelativeLayout.setVisibility(View.GONE);
            holder.downArrow.setVisibility(View.VISIBLE);
        }

    }

    @Override
    public int getItemCount() {
        return events.size();
    }

    public ArrayList<Event> getEvents() {
        return events;
    }

    public void setEvents(ArrayList<Event> events) {
        this.events = events;
        notifyDataSetChanged();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private TextView txtName;
        private CardView parent;
        private ImageView image;
        private ImageView downArrow, upArrow;
        private RelativeLayout expandedRelativeLayout;
        private TextView eventDescription, startDate;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            txtName = itemView.findViewById(R.id.txtName);
            parent = itemView.findViewById(R.id.parent);
            image = itemView.findViewById(R.id.image);
            downArrow = itemView.findViewById(R.id.btnDownArrow);
            upArrow = itemView.findViewById(R.id.btnUpArrow);
            expandedRelativeLayout = itemView.findViewById(R.id.expandedRelativeLayout);
            eventDescription = itemView.findViewById(R.id.eventDescription);
            startDate = itemView.findViewById(R.id.startDate);

            downArrow.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Event event = events.get(getAdapterPosition());
                    event.setExpanded(!event.isExpanded());
                    notifyItemChanged(getAdapterPosition());
                }
            });

            upArrow.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Event event = events.get(getAdapterPosition());
                    event.setExpanded(!event.isExpanded());
                    notifyItemChanged(getAdapterPosition());
                }
            });
        }
    }
}
