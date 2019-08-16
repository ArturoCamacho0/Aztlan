package com.example.aztlan;

import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private BottomNavigationView bottomNavigationView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bottomNavigationView = (BottomNavigationView)findViewById(R.id.bottom_navigation);

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch(item.getItemId()){
                    case R.id.nav_home:
                        Toast.makeText(MainActivity.this, "Home", Toast.LENGTH_LONG).show();
                        return true;
                    case R.id.nav_info:
                        Toast.makeText(MainActivity.this, "Info", Toast.LENGTH_LONG).show();
                        return true;
                    case R.id.nav_message:
                        Toast.makeText(MainActivity.this, "Message", Toast.LENGTH_LONG).show();
                        return true;
                    case R.id.nav_files:
                        Toast.makeText(MainActivity.this, "Files", Toast.LENGTH_LONG).show();
                        return true;
                    case R.id.nav_user:
                        Toast.makeText(MainActivity.this, "User", Toast.LENGTH_LONG).show();
                        return true;
                    default:
                        return false;
                }
            }
        });
    }
}
