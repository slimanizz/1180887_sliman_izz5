package com.example.a1180887_sliman_izz;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements Fragment1.communicator1,Fragment2.communicator2{
    final Fragment2 secondFragment = new Fragment2();
    final FragmentManager fragmentManager = getSupportFragmentManager();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void respond1(String data) {
        Fragment1 ff1 =
                (Fragment1)getSupportFragmentManager().findFragmentById(R.id.fragment1);
        assert ff1 != null;
        ff1.changeData1(data);
    }

    @Override
    public void respond2(String data) {
        Fragment2 ff2 =
                (Fragment2) getSupportFragmentManager().findFragmentById(R.id.fragment2);
        assert ff2 != null;
        ff2.changeData(data);
    }


}