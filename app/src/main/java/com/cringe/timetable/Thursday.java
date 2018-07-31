package com.cringe.timetable;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class Thursday extends Activity {

    ListView l;
    String[] names = {"   Analog Electronic Circuits","   Electromagnetic Field Theory","   Soft Skills","   Database Management Systems"};
    String[] loc = {"  TT504 - ECE2002","  TT504 - ECE1003","  CDMM301 - STS2001","  SJT508 - CSE2004"};
    String[] timing = {"  9:00am - 9:50am","  10:00am - 10:50am","  11:00am - 11:50am","  2:00pm - 2:50pm"};
    String[] slot = {"  B1 - Theory","  G1 - Theory","  TE1 - Theory","  D2 - Theory"};
    String[] faculty = {"  Aarthi G","  Vijay Kumar","  SMART","  Ramanathan L"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.thursday);
        l = findViewById(R.id.list4);
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
