package com.example.recyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import ContactAdapter.ContactsAdapter;
import model.Contacts;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);

        List<Contacts> contactsList = new ArrayList<>();
        contactsList.add( new Contacts("Saugat Malla", "9808011122",R.drawable.saugat,"Kalanki","saugat@gmail.com"));
        contactsList.add( new Contacts("Rajesh Hamal", "9808022122",R.drawable.rajesh,"Kathmandu","rajesh@gmail.com"));
        contactsList.add( new Contacts("Dayahang Rai", "9808033122",R.drawable.dahayang,"Dharan","raidahang@gmail.com"));
        contactsList.add( new Contacts("Bhuwan KC", "9808023122",R.drawable.bhuwan,"Bhakatapur","buwan@gmail.com"));

        ContactsAdapter contactsAdapter = new ContactsAdapter(this, contactsList);
        recyclerView.setAdapter(contactsAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

    }
}
