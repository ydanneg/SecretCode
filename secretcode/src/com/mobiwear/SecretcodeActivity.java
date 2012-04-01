package com.mobiwear;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SecretcodeActivity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        handleIntent(getIntent());
    }

    private void handleIntent(Intent intent) {
        TextView text = (TextView) findViewById(R.id.textSecretCode);
        text.setText("You've enterd a secret code: " + intent.getStringExtra("secretCode"));
    }

    @Override
    protected void onNewIntent(android.content.Intent intent) {
        handleIntent(intent);
    };
}