package com.cringe.timetable;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class Monday extends Activity {

    ListView l;
    String[] names = {"   Digital Logic Design","   Operating Systems","   Computer Graphics and Multimedia","   Electromagnetic Field Theory","   Analog Electronic","   Database Management Systems","   Database Management Systems"};
    String[] loc = {"  TT504 - ECE2003","  SJT424 - CSE2005","  SJT419 - CSE3016","  TT504 - ECE1003","  TT246 - ECE2002","  SJT508 - CSE2004","  SJT515 - CSE2004"};
    String[] timing = {"  8:00am - 8:50am","  9:00am - 9:50am","  10:00am - 11:30am","  12:00pm - 12:50pm","  2:00pm - 3:30pm","  4:00pm - 4:50pm","  5:31pm - 7:00pm"};
    String[] slot = {"  A1 - Theory","  F1 - Theory","  L3-L4 - Lab","  TG1 - Theory","  L31-L32 - Lab","  D2 - Theory","  L35-L36 Lab"};
    String[] faculty = {"  Jagannadha Naidu K","  Jayakumar K","  Aju D","  Vijay Kumar","  Aarthi G","  Ramanathan L","  Ramanathan L"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.monday);
        l = findViewById(R.id.list1);
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
