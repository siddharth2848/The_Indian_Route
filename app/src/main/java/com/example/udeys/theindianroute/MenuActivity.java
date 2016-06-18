package com.example.udeys.theindianroute;

import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Bundle;
import android.view.LayoutInflater;

public class MenuActivity extends AppCompatActivity implements View.OnClickListener{



    ImageButton hm , srch , pst, notif , prfl ;
    FragmentTransaction ft;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        initFragments();

        hm = (ImageButton) findViewById(R.id.home);
        srch = (ImageButton) findViewById(R.id.trip);
        pst = (ImageButton) findViewById(R.id.post);
        notif = (ImageButton) findViewById(R.id.notification);
        prfl = (ImageButton) findViewById(R.id.profile);


        hm.setOnClickListener(this);
        srch.setOnClickListener(this);
        pst.setOnClickListener(this);
        notif.setOnClickListener(this);
        prfl.setOnClickListener(this);

    }


    @Override
    public void onClick(View v) {
        int id = v.getId();

        switch (id){
            case R.id.home:
                 ft = getFragmentManager().beginTransaction();
                ft.replace(R.id.fragment_1, new HomeFragment());
                ft.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE);
                ft.commit();
                break;
            case R.id.trip:
                 ft = getFragmentManager().beginTransaction();
                ft.replace(R.id.fragment_1, new TripFragment());
                ft.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE);
                ft.commit();
                break;
            case R.id.post:
                ft = getFragmentManager().beginTransaction();
                ft.replace(R.id.fragment_1, new PostFragment());
                ft.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE);
                ft.commit();
                break;
            case R.id.notification:
                ft = getFragmentManager().beginTransaction();
                ft.replace(R.id.fragment_1, new NotificationFragment());
                ft.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE);
                ft.commit();
                break;
            case R.id.profile:
                ft = getFragmentManager().beginTransaction();
                ft.replace(R.id.fragment_1, new ProfileFragment());
                ft.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE);
                ft.commit();
                break;
        }

    }

    private void initFragments() {
        ft = getFragmentManager().beginTransaction();
        ft.add(R.id.fragment_1,new HomeFragment());
        ft.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE);
        //ft.hide(mGalleryFragment);
        ft.commit();
    }
}
