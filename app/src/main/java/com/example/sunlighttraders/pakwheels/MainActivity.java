package com.example.sunlighttraders.pakwheels;

import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


         loadFragment(new Car());
    }

    public void loadFragment(Fragment fragment){

        getSupportFragmentManager().
                beginTransaction().
                replace(R.id.frgContainer,fragment).
                commit();
    }

    public void carButtonClick(View view) {
        loadFragment(new Car());

    }

    public void bikeButtonClick(View view) {
        loadFragment(new Bike());
    }


    public void sparepartButtonClick(View view) {
        loadFragment(new Sparepart());
    }
}
