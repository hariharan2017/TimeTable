package com.cringe.timetable;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class Tuesday extends Activity {

    ListView l;
    String[] names = {"   Analog Electronic Circuits","   Electromagnetic Field Theory","   Soft Skills","   Digital Logic Design","   Operating Systems"};
    String[] loc = {"  TT504 - ECE2002","  TT504 - ECE1003","  CDMM301 - STS2001","  TT422 - ECE2003","  SJT516 - CSE2005"};
    String[] timing = {"  8:00am - 8:50am","  9:00am - 9:50am","  10:00am - 10:50am","  4:00pm - 5:30pm","  5:31pm - 7:00pm"};
    String[] slot = {"  B1 - Theory","  G1 - Theory","  E1 - Theory","  L39-L40 - Lab","  L41-L42 - Lab"};
    String[] faculty = {"  Aarthi G","  Vijay Kumar","  SMART","  Jagannadha Naidu K","  Jayakumar K"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tuesday);
        l = findViewById(R.id.list2);
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
