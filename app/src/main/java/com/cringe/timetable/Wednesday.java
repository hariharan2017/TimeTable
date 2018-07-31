package com.cringe.timetable;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class Wednesday extends Activity {

    ListView l;
    String[] names = {"   Signals and Systems","   Digital Logic Design","   Operating Systems","   Computer Graphics and Multimedia"};
    String[] loc = {"  CBMR301 - ECE1004","  TT504 - ECE2003","  SJT424 - CSE2005","  SJT403 - CSE3016"};
    String[] timing = {"  8:00am - 8:50am","  9:00am - 9:50am","  10:00am - 10:50am","  2:00pm - 2:50pm"};
    String[] slot = {"  C1 - Theory","  A1 - Theory","  F1 - Theory","  C2 - Theory"};
    String[] faculty = {"  Deepa Madathil","  Jagannadha Naidu K","  Jayakumar K","  Aju D"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.wednesday);
        l = findViewById(R.id.list3);
        CustomAdapter customAdapter = new CustomAdapter();
        l.setAdapter(customAdapter);
    }

    class CustomAdapter extends BaseAdapter {

        @Override
        public int getCount() {
            return names.length;
        }

        @Override
        public Object getItem(int i) {
            return null;
        }

        @Override
        public long getItemId(int i) {
            return 0;
        }

        @SuppressLint("ViewHolder")
        @Override
        public View getView(int i, View view, ViewGroup viewGroup) {
            view = getLayoutInflater().inflate(R.layout.adapter_view, null);
            TextView t1 = view.findViewById(R.id.textView1);
            TextView t2 = view.findViewById(R.id.textView2);
            TextView t3 = view.findViewById(R.id.textView3);
            TextView t4 = view.findViewById(R.id.textView4);
            TextView t5 = view.findViewById(R.id.textView5);

            t1.setText(names[i]);
            t2.setText(loc[i]);
            t3.setText(timing[i]);
            t4.setText(slot[i]);
            t5.setText(faculty[i]);

            return view;
        }
    }

}
