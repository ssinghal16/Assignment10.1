package com.acadgild.soniyasinghal.assignment10;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * Created by vlohiya on 02-04-2018.
 */

public class Middle_Fragment extends Fragment{

    View view;
    Button btn;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // TODO Auto-generated method stub

        view=inflater.inflate(R.layout.my_fragment2, container, false);
        btn=(Button) view.findViewById(R.id.button1);
        btn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub



            }
        });
        return view;
    }
}
