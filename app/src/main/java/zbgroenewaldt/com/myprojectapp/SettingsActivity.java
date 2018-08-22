package zbgroenewaldt.com.myprojectapp;

import android.app.ListActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;

public class SettingsActivity extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);

        String[] settings = {"change user name", "change system number", "change emergency number"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getListView().getContext(), android.R.layout.simple_list_item_1, settings);


/*
        // Find the toolbar view inside the activity layout
        Toolbar myToolbar = (Toolbar) findViewById(R.id.my_toolbar);
        //Sets the Toolbar to act as the ActionBar for this Activity widow.
        //Make sure the toolbar exists in the activity and is not null
        setSupportActionBar(myToolbar);
        setTitle("Settings"); */
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        //Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.options_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        return super.onOptionsItemSelected(item);
    }
}
