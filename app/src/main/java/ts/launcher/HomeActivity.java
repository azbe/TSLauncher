package ts.launcher;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class HomeActivity extends Activity
{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }

    public void showApps(View v){
        Intent i = new Intent(this, AppListActivity.class);
        startActivity(i);
    }

    public void showSettings(View v)
    {
        Intent i = new Intent(this, SettingsActivity.class);
        startActivity(i);
    }

}