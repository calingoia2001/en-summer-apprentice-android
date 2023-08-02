package com.example.tmsandroid;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.example.tmsandroid.adapters.OrdersRecViewAdapter;
import com.example.tmsandroid.models.Order;
import java.util.ArrayList;

public class SecondActivity extends AppCompatActivity {
    private RecyclerView ordersRecView;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        //getSupportActionBar().setTitle("Orders");

        ordersRecView = findViewById(R.id.ordersRecView);

        ArrayList<Order> orders = new ArrayList<>();
        orders.add(new Order(1, "2023", 2,2600));
        orders.add(new Order(2, "2022", 3,2400));
        orders.add(new Order(3, "2021", 4,2300));
        orders.add(new Order(4, "2022", 5,2200));
        orders.add(new Order(5, "2023", 1,2200));

        OrdersRecViewAdapter adapter = new OrdersRecViewAdapter(this);
        adapter.setOrders(orders);
        ordersRecView.setAdapter(adapter);
        ordersRecView.setLayoutManager(new LinearLayoutManager(this));
    }

    public void openFirstActivity(View view) {
        startActivity(new Intent(this, MainActivity.class));
    }
}
