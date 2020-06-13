package com.ospino.mushsnap;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import androidx.appcompat.app.AppCompatActivity;


/**
 *
 */
public class ResultActivity extends AppCompatActivity {

    private MushroomAdapter mAdapter;
    private TextView mEmptyStateTextView;


    /**
     * On create inflate the view
     * @param savedInstanceState
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true); // Backpressed
        setTitle("Detection Result");

        Intent intent = getIntent();
        List<Mushroom> mushrooms = (ArrayList<Mushroom>) intent.getSerializableExtra("mushrooms");

        ListView mushroomsListView = (ListView) findViewById(R.id.list);
        mEmptyStateTextView = (TextView) findViewById(R.id.empty_view);

        LayoutInflater inflater = getLayoutInflater();
        ViewGroup header = (ViewGroup) inflater.inflate(R.layout.listview_header, mushroomsListView, false);
        mushroomsListView.addHeaderView(header, null, false);
        mushroomsListView.setEmptyView(mEmptyStateTextView);
        mAdapter = new MushroomAdapter(this, new ArrayList<Mushroom>());
        mushroomsListView.setAdapter(mAdapter);

        mAdapter.addAll(mushrooms);
    }

    /**
     * On Options Item Selected
     * @param item
     * @return
     */
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        onBackPressed();
        return true;
    }
}
