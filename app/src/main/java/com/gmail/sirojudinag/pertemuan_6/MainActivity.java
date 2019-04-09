package com.gmail.sirojudinag.pertemuan_6;

//TODO 1: import package yang dibutuhkan untuk pembuatan projek
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    //TODO 2: pembuatan objek, variabel dan array
    ListView listView;
    TextView textView;
    String[] listItem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //TODO 3: mengkoneksikan layout dengan class java
        listView = (ListView) findViewById(R.id.listView);
        textView = (TextView) findViewById(R.id.textView);

        //TODO 4: mengambil data dari sumber di string
        listItem = getResources().getStringArray(R.array.array_technology);

        //TODO 5: menyiapkan objek adapter dengan sumber data berasal dari listener
        final ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, android.R.id.text1, listItem);
        listView.setAdapter(adapter);

        //TODO 6: melakukan proses yang diterima dari action on click dengan onclick listener
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long
                    l) {
                // TODO 7: menampilkan toas pada layar ketika list ditekan, dengan mengambil nilai/value dari adapater
                String value = adapter.getItem(position);
                Toast.makeText(getApplicationContext(), value, Toast.LENGTH_SHORT).show();
            }
        });
    }
}
