package com.example.bbuettn.senior_project;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ExpandableListView;
import android.widget.ImageButton;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ExpandableListView listView;
    private ExpandableListAdapter listAdapter;
    private List<String> listDataHeader;
    private HashMap<String, List<String>> listHash;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.purchasing);

        final ImageButton parkingButton = findViewById(R.id.parkingButton);
        final ImageButton balanceButton = findViewById(R.id.balanceButton);
        final ImageButton purchasingButton = findViewById(R.id.purchasingButton);
        final ImageButton helpButton = findViewById(R.id.helpButton);

        parkingButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadParkingPage = new Intent(MainActivity.this, ParkingActivity.class);
                startActivity(intentLoadParkingPage);
            }
        });

        balanceButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadBalancePage = new Intent(MainActivity.this, BalanceActivity.class);
                startActivity(intentLoadBalancePage);
            }
        });

        purchasingButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadPurchasingPage = new Intent(MainActivity.this, PurchasingActivity.class);
                startActivity(intentLoadPurchasingPage);
            }
        });


        listView = (ExpandableListView) findViewById(R.id.lvExp);
        initData();
        listAdapter = new ExpandableListAdapter(this, listDataHeader, listHash);
        listView.setAdapter(listAdapter);
    }

    private void initData() {
        listDataHeader = new ArrayList<>();
        listHash = new HashMap<>();

        /*listDataHeader.add("EDMTDev");
        listDataHeader.add("Android");*/
        listDataHeader.add("Faculty");
        listDataHeader.add("Students");

       /* List<String> edmtDev = new ArrayList<>();
        edmtDev.add("This is Expandable ListView");

        List<String> androidStudio = new ArrayList<>();
        androidStudio.add("Expandable ListView");
        androidStudio.add("Google Map");
        androidStudio.add("Chat Application");
        androidStudio.add("FireBase");*/

        List<String> faculty = new ArrayList<>();
        faculty.add("Green   Year:$181   Sem:$108");
        faculty.add("Orange   Year:$181   Sem:$108");
        faculty.add("Brown   Year:$181   Sem:$108");
        faculty.add("Evening Commuter Silver   Year:$152   Sem:$93");
        faculty.add("Evening Residential Silver   Year:$171   Sem:$102");
        faculty.add("Carpool  $90.50");

        List<String> student = new ArrayList<>();
        student.add("Brown   Year:$181   Sem:$108");
        student.add("Red   Year:$123   Sem:$74");
        student.add("Residential (Yellow)   Year:$161   Sem:$97");
        student.add("Evening Commuter Silver   Year:$152   Sem:$93");
        student.add("Evening Residential Silver   Year:$171   Sem:$102");
        student.add("Carpool  $90.50");

    }
}
