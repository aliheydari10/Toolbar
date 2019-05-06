package  com.example.toolbar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Toolbar mToolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mToolbar = (Toolbar) findViewById(R.id.m_toolbar);
        setSupportActionBar(mToolbar);

        mToolbar.setLogo(R.drawable.ic_android_black_24dp);
        mToolbar.setTitle(R.string.app_name);
        mToolbar.setSubtitle(R.string.app_name);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.toolbar_menu, menu);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        return super.onCreateOptionsMenu(menu);

    }



    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();

        if (id == R.id.setting) {
            Toast.makeText(getApplicationContext(), "Settings Item Clicked", Toast.LENGTH_SHORT).show();
        }
        else if (id == R.id.about) {
            Toast.makeText(getApplicationContext(), "About Item Clicked", Toast.LENGTH_SHORT).show();
        }
        else if (id == R.id.profile) {
            Toast.makeText(getApplicationContext(), "profile Item Clicked", Toast.LENGTH_SHORT).show();
        }
        else if (id == R.id.basket) {
            Toast.makeText(getApplicationContext(), "basket Item Clicked", Toast.LENGTH_SHORT).show();
        }
        else  if (id == android.R.id.home){
            onBackPressed();
        }

        return super.onOptionsItemSelected(item);
    }
}

