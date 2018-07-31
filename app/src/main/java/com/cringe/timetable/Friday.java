package com.cringe.timetable;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class Friday extends Activity {

    ListView l;
    String[] names = {"   Soft Skills","   Signals and Systems","   Computer Graphics and Multimedia"};
    String[] loc = {"  CDMM301 - STS2001","  CBMR301 - ECE1004","  SJT403 - CSE3016"};
    String[] timing = {"  8:00am - 8:50am","  9:00am - 9:50am","  3:00pm - 3:50pm"};
    String[] slot = {"  E1 - Theory","  C1 - Theory","  C2 - Theory"};
    String[] faculty = {"  SMART","  Deepa Madathil","  Aju D"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.friday);
        l = findViewById(R.id.list5);
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
