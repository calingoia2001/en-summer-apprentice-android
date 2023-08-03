package com.example.tmsandroid;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.example.tmsandroid.adapters.OrdersRecViewAdapter;
import com.example.tmsandroid.models.OrderTest;
import java.util.ArrayList;

public class SecondActivity extends AppCompatActivity {
    private RecyclerView ordersRecView;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        ordersRecView = findViewById(R.id.ordersRecView);

        ArrayList<OrderTest> orderTests = new ArrayList<>();
        orderTests.add(new OrderTest(1, "2023", 2,2600));
        orderTests.add(new OrderTest(2, "2022", 3,2400));
        orderTests.add(new OrderTest(3, "2021", 4,2300));
        orderTests.add(new OrderTest(4, "2022", 5,2200));
        orderTests.add(new OrderTest(5, "2023", 1,2200));

        OrdersRecViewAdapter adapter = new OrdersRecViewAdapter(this);
        adapter.setOrders(orderTests);
        ordersRecView.setAdapter(adapter);
        ordersRecView.setLayoutManager(new LinearLayoutManager(this));
    }

    public void openFirstActivity(View view) {
        startActivity(new Intent(this, MainActivity.class));
    }
}
