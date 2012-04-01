/**
 * 
 */
package com.mobiwear;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.util.Log;
import android.widget.Toast;

/**
 * @author ydanneg
 * 
 */
public class SecretCodeReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        Uri uri = intent.getData();
        String secretCode = uri.getHost();
        Log.i("SecretCodeReceiver", "secretCode: " + secretCode);
        Intent activity = new Intent(context, SecretcodeActivity.class);
        activity.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        activity.putExtra("secretCode", secretCode);
        context.startActivity(activity);
        
        Toast.makeText(context, "Secret Code: " + secretCode, Toast.LENGTH_SHORT).show();
    }
}
