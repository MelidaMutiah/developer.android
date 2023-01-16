package com.example.melidaapp;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.view.Menu;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @SuppressLint("NonConstantResourceId")
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.mi_input_control_activity:
                startActivity(new Intent(this, InputControlActivity.class));
                break;
            case R.id.mi_listview_activity:
                startActivity(new Intent(this, ListViewActivity.class));
                break;
            case R.id.mi_recycleview_activity:
                startActivity(new Intent(this, RecyclerViewActivity.class));
                break;
            case R.id.mi_quit:
                finish();
                break;
        }
        return false;
    }

    }
