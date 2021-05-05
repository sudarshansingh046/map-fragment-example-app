package com.example.map;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends ListActivity {
    TextView t1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String[] values={"Taj Mahal","Pyramids of giza","colosseum","Brazil christ the redeemer","Eiffel Tower of Paris","Leaning Tower of Pisa","New York's Statue of Liberty"};
        ArrayAdapter<String> arrayAdapter=new ArrayAdapter<String>
                (this,android.R.layout.simple_list_item_1,values);
        setListAdapter(arrayAdapter);
    }
    @Override
    protected void onListItemClick(ListView l, View v,int Position,long id)
    {
        super.onListItemClick(l,v,Position,id);
        int itemPosition=Position;
        String itemvalues=(String)l.getItemAtPosition(Position);
        if(itemPosition==0)
        {
            Intent i=new Intent(MainActivity.this,MapsActivity1.class);
            startActivity(i);

        }
        if(itemPosition==1)
        {
            Intent i=new Intent(MainActivity.this,MapsActivity2.class);
            startActivity(i);

        }
        if(itemPosition==2)
        {
            Intent i=new Intent(MainActivity.this,MapsActivity3.class);
            startActivity(i);

        }
        if(itemPosition==3)
        {
            Intent i=new Intent(MainActivity.this,MapsActivity4.class);
            startActivity(i);

        }
        if(itemPosition==4)
        {
            Intent i=new Intent(MainActivity.this,MapsActivity5.class);
            startActivity(i);

        }
        if(itemPosition==5)
        {
            Intent i=new Intent(MainActivity.this,MapsActivity6.class);
            startActivity(i);

        }
        if(itemPosition==6)
        {
            Intent i=new Intent(MainActivity.this,MapsActivity7.class);
            startActivity(i);

        }
    }
}