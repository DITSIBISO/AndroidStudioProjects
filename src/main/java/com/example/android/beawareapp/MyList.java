package com.example.android.beawareapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class MyList extends AppCompatActivity {

    ListView list;
    String[] itemname ={
            "Tembisa High School Parent Meeting",
            "Rabasotho Drug Abuse Youth Meeting",
            "Community Meeting",
            "Parent Meeting Leboneng Pre-School",
            "HIV Awareness March",
            "Youth Development Meeting",
            "Community Meeting",
            "HIV Awareness March"
    };

    Integer[] imgid={
            R.drawable.comm,
            R.drawable.community,
            R.drawable.pic,
            R.drawable.picc,
            R.drawable.piccc,
            R.drawable.piccccc,
            R.drawable.pic,
            R.drawable.piccc,
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);



           MyListAdapter adapter=new MyListAdapter(this, itemname, imgid);
            list=(ListView)findViewById(R.id.list);
            list.setAdapter(adapter);

            list.setOnItemClickListener(new AdapterView.OnItemClickListener() {

                @Override
                public void onItemClick(AdapterView<?> parent, View view,
                                        int position, long id) {
                    // TODO Auto-generated method stub
                    String Slecteditem= itemname[+position];
                    Toast.makeText(getApplicationContext(), Slecteditem, Toast.LENGTH_SHORT).show();

                }
            });
        }
    }


