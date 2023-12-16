package com.whatsapp.businessdirectory.view.activity;

import android.content.Intent;
import android.view.MenuItem;

public class DirectoryBusinessChainingActivity extends BusinessDirectoryActivity {
    public void A7G(boolean z) {
        Intent intent = new Intent(this, BusinessDirectoryActivity.class);
        intent.putExtra("arg_launch_consumer_home", true);
        intent.setFlags(67108864);
        startActivity(intent);
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 1) {
            return super.onOptionsItemSelected(menuItem);
        }
        Intent intent = new Intent(this, BusinessDirectoryActivity.class);
        intent.putExtra("arg_launch_consumer_home", true);
        intent.setFlags(67108864);
        startActivity(intent);
        return true;
    }
}
