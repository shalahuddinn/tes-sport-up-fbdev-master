package com.example.android.sportup;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.ListView;

import com.firebase.ui.database.FirebaseListAdapter;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;

public class EventList extends AppCompatActivity {
    private static final String db_event = "db_event";
    private ArrayList<CardModel> modelData = new ArrayList<CardModel>();

    private FirebaseListAdapter<CardModel> adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_event_list);
        populateCard();
    }

    protected void populateCard(){
        final CardAdapter adapter = new CardAdapter(this, modelData);

        ListView list = (ListView) findViewById(R.id.lisuto);
        DatabaseReference data = FirebaseDatabase.getInstance().getReference(db_event);
        data.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                for(DataSnapshot child: dataSnapshot.getChildren()){
                    String nama = (String) child.child("nama_pembuat").getValue();
                    String type = (String) child.child("type").getValue();
                    String waktu= (String) child.child("waktu").getValue();
                    CardModel x = new CardModel();
                    x.setType(type);
                    x.setTime(waktu);
                    x.setOrganizer(nama);
                    Log.i(nama, type);
                    modelData.add(x);

                }
                adapter.notifyDataSetChanged();
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });



        list.setAdapter(adapter);
    }
}
