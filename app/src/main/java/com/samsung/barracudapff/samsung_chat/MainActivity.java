package com.samsung.barracudapff.samsung_chat;

import android.support.annotation.NonNull;
import android.support.design.internal.BottomNavigationMenu;
import android.support.design.internal.NavigationMenu;
import android.support.design.widget.AppBarLayout;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;

import com.samsung.barracudapff.samsung_chat.fragments.ChatListFragment;
import com.samsung.barracudapff.samsung_chat.fragments.MapFragment;
import com.samsung.barracudapff.samsung_chat.fragments.PeopleFragment;

public class MainActivity extends AppCompatActivity {
    private ChatListFragment chatListFragment;
    private MapFragment mapFragment;
    private PeopleFragment peopleFragment;

    private BottomNavigationView navigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        switchFragment(mapFragment);

    }

    private void init() {
        chatListFragment = new ChatListFragment();
        mapFragment = new MapFragment();
        peopleFragment = new PeopleFragment();
        navigationView = findViewById(R.id.navigation);
        navigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                switch (menuItem.getItemId()) {
                    case R.id.navigation_map: {
                        switchFragment(mapFragment);
                        break;
                    }
                    case R.id.navigation_chat_list: {
                        switchFragment(chatListFragment);
                        break;
                    }
                    case R.id.navigation_social: {
                        switchFragment(peopleFragment);
                        break;
                    }
                }
                return false;
            }
        });
    }

    public void switchFragment(Fragment fragment) {
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.screen_frame, fragment)
                .commit();
    }
}
