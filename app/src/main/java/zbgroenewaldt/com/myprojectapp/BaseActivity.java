package zbgroenewaldt.com.myprojectapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class BaseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_base);
    }

    // CREATING OPTIONS MENU
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.options_menu,menu);
        return super.onCreateOptionsMenu(menu);
    }

    // CREATING ON CLICK FOR OPTIONS MENU
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();

        if (id==R.id.mnuSettings)
        {
            Toast.makeText(this, "Settings menu clicked!", Toast.LENGTH_SHORT).show();
            startActivity(new Intent(this, SettingsActivity.class));
        }
        else
            if(id==R.id.mnuHelp)
            {
                Toast.makeText(this, "Help menu clicked!", Toast.LENGTH_SHORT).show();
            }

        return super.onOptionsItemSelected(item);
    }
}
