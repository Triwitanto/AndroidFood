package androidfood.triwi.id.androidfood;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;

import java.util.ArrayList;


public class HomeActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    RecyclerView.LayoutManager layoutManager;
    RecyclerView.Adapter adapter;
    Toolbar toolbar;
    int[] img_id = {R.drawable.kue1,R.drawable.kue2,R.drawable.kue3,R.drawable.kue4,R.drawable.kue5,R.drawable.kue6,R.drawable.kue7};

    ArrayList<Contact> Contacts = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        recyclerView = findViewById(R.id.recyclearView);
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setHasFixedSize(true);

        String[] nama, jenis;
        nama = getResources().getStringArray(R.array.namaKue);
        jenis = getResources().getStringArray(R.array.jenisKue);
        int i = 0;
        for (String NAMA : nama) {
            Contact contact = new Contact(img_id[i],NAMA,jenis[i]);
            Contacts.add(contact);
            i++;
        }
        adapter = new ContactAdapter(Contacts, HomeActivity.this);
        recyclerView.setAdapter(adapter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_activity_main, menu);
        return true;
    }


    }
