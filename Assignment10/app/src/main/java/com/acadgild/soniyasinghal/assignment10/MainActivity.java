package com.acadgild.soniyasinghal.assignment10;

import android.annotation.SuppressLint;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class MainActivity extends FragmentActivity implements Top_Fragment.textEntered {

    String value;
    boolean check=false;
    Bottom_Fragment frg2;
    FragmentTransaction transaction;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Top_Fragment frg=new Top_Fragment();//create the fragment instance for the top fragment

        frg2=new Bottom_Fragment();//create the fragment instance for the bottom fragment
        Middle_Fragment frg1=new Middle_Fragment();//create the fragment instance for the middle fragment


        FragmentManager manager=getSupportFragmentManager();//create an instance of fragment manager

        FragmentTransaction transaction=manager.beginTransaction();//create an instance of Fragment-transaction

      transaction.add(R.id.My_Container_1_ID, frg, "Frag_Top_tag");
        transaction.add(R.id.My_Container_2_ID, frg1, "Frag_Middle_tag");
        transaction.add(R.id.My_Container_3_ID, frg2, "Frag_Bottom_tag");


        transaction.commit();

    }
    @SuppressLint("WrongConstant")
    @Override
    public void setValue(String editextvalue) {
        // TODO Auto-generated method stub
        value =editextvalue;
             if (frg2 != null) {
            frg2.setName(value);
        }
        else
        {
            Toast.makeText(getApplicationContext(),"fragment 2  is null", 1000).show();
        }
    }

}

