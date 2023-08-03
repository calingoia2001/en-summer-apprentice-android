package com.example.tmsandroid.adapters;

import android.content.Context;
import android.transition.TransitionManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;
import com.example.tmsandroid.R;
import com.example.tmsandroid.models.OrderTest;

import java.util.ArrayList;

public class OrdersRecViewAdapter extends RecyclerView.Adapter<OrdersRecViewAdapter.ViewHolder> {
    private ArrayList<OrderTest> orderTests = new ArrayList<>();
    private Context context;

    public OrdersRecViewAdapter(Context context) {
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.orders_list_item, parent, false);
        ViewHolder holder = new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.orderID.setText(String.valueOf("Order ID: " + orderTests.get(position).getEventID()));
        holder.orderedAt.setText("Order date: " + orderTests.get(position).getOrderedAt());
        holder.numberOfTickets.setText(String.valueOf("Number of tickets: " + orderTests.get(position).getNumberOfTickets()));
        holder.totalPrice.setText(String.valueOf("Total Price: " + orderTests.get(position).getTotalPrice()));
        holder.test.setText("Edit your order:");

        if(orderTests.get(position).isExpanded()) {
            TransitionManager.beginDelayedTransition(holder.parentSecond);
            holder.expandedRelativeLayout2.setVisibility(View.VISIBLE);
            holder.downArrow.setVisibility(View.GONE);
        } else {
            TransitionManager.beginDelayedTransition(holder.parentSecond);
            holder.expandedRelativeLayout2.setVisibility(View.GONE);
            holder.downArrow.setVisibility(View.VISIBLE);
        }

    }

    @Override
    public int getItemCount() {
        return orderTests.size();
    }

    public ArrayList<OrderTest> getOrders() {
        return orderTests;
    }

    public void setOrders(ArrayList<OrderTest> orderTests) {
        this.orderTests = orderTests;
        notifyDataSetChanged();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private TextView orderID, orderedAt, numberOfTickets, totalPrice, test;
        private ImageView downArrow, upArrow;
        private CardView parentSecond;
        private RelativeLayout expandedRelativeLayout2;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            parentSecond = itemView.findViewById(R.id.parentSecond);
            orderID = itemView.findViewById(R.id.orderID);
            orderedAt = itemView.findViewById(R.id.orderedAt);
            numberOfTickets = itemView.findViewById(R.id.numberOfTickets);
            totalPrice = itemView.findViewById(R.id.totalPrice);
            test = itemView.findViewById(R.id.edit);
            downArrow = itemView.findViewById(R.id.btnDownArrow2);
            upArrow = itemView.findViewById(R.id.btnUpArrow2);
            expandedRelativeLayout2 = itemView.findViewById(R.id.expandedRelativeLayout2);

            downArrow.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    OrderTest orderTest = orderTests.get(getAdapterPosition());
                    orderTest.setExpanded(!orderTest.isExpanded());
                    notifyItemChanged(getAdapterPosition());
                }
            });

            upArrow.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    OrderTest orderTest = orderTests.get(getAdapterPosition());
                    orderTest.setExpanded(!orderTest.isExpanded());
                    notifyItemChanged(getAdapterPosition());
                }
            });
        }
    }
}
