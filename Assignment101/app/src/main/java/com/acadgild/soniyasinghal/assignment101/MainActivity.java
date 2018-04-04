package com.acadgild.soniyasinghal.assignment101;

import android.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int i = 1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getFragmentManager().findFragmentById(R.id.FrameLayout1);

    }

    public static class SimpleAddition extends Fragment {
        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {
            View v = inflater.inflate(R.layout.activity_main, container, false);

            Button b = (Button) v.findViewById(R.id.button1);
            final EditText et1 = (EditText) v.findViewById(R.id.editText1);
            final TextView tv = (TextView) v.findViewById(R.id.textView1);

            b.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View v) {
                    tv.setText(et1.getText().toString());
                }
            });
            return v;
        }
    }

}

