package zbgroenewaldt.com.myprojectapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    ImageView lockCar;
    ImageView unlockCar;
    ImageView locateCar;
    ImageView statusCar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Find the toolbar view inside the activity layout
        Toolbar myToolbar = (Toolbar) findViewById(R.id.my_toolbar);
        //Sets the Toolbar to act as the ActionBar for this Activity widow.
        //Make sure the toolbar exists in the activity and is not null
        setSupportActionBar(myToolbar);

        setTitle("Dashboard");


    lockCar = (ImageView) findViewById(R.id.lockCar);
    unlockCar = (ImageView) findViewById(R.id.unlockCar);
    locateCar = (ImageView) findViewById(R.id.locateCar);
    statusCar = (ImageView) findViewById(R.id.statusCar);

        lockCar.setOnClickListener(this);
        unlockCar.setOnClickListener(this);
        locateCar.setOnClickListener(this);
        statusCar.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.lockCar:
                //statements

                openLockCar();
                break;
            case R.id.unlockCar:
                //statements
                openUnlockCar();
                break;
            case R.id.locateCar:
                //statements
                openLocateCar();
                break;
            case R.id.statusCar:
                //statements
                openStatusCar();
                break;
        }
    }

    public void openLockCar(){
        Intent intent = new Intent(this, LockCar.class);
        startActivity(intent);
    }

    public void openUnlockCar(){
       Intent intent = new Intent(this, UnlockCar.class);
        startActivity(intent);
    }

    public void openLocateCar(){
        Intent intent = new Intent(this, LocateCar.class);
        startActivity(intent);
    }

    public void openStatusCar(){
        Intent intent = new Intent(this, StatusCar.class);
        startActivity(intent);
    }

    // Menu icons are inflated just as they were with actionbar
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.options_menu, menu);
        return true;
    }

    // Respond to menu item clicks

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle presses on the action bar items
        switch (item.getItemId()){
            case R.id.mnuSettings:
                startActivity(new Intent(getApplicationContext(), SettingsActivity.class));
                return true;
            case R.id.mnuHelp:
                Toast.makeText(
                        getApplicationContext(),
                        "You clicked the Help button",
                        Toast.LENGTH_SHORT)
                        .show();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }


    }

