package com.akansh.classwork.fragmentchangeexample;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;

public class MainActivity extends AppCompatActivity {
    FrameLayout frameLayout;
    Button fragOne;
    Button fragTwo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        frameLayout = findViewById(R.id.frameLayout);
        fragOne = findViewById(R.id.fragOne);
        fragTwo = findViewById(R.id.fragTwo);

        fragOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showFragment(new FragmentOne());
            }
        });

        fragTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showFragment(new FragmentTwo());
            }
        });
    }

    private void showFragment(Fragment fragment) {
        FragmentTransaction fragTrans = getSupportFragmentManager().beginTransaction();

        fragTrans.replace(R.id.frameLayout, fragment, fragment.getClass().getName());
        fragTrans.commit();
    }
}
