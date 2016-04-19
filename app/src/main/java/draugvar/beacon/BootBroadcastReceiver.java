package draugvar.beacon;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/**
 * Created by Sara on 19/04/2016.
 */
public class BootBroadcastReceiver extends BroadcastReceiver {
    static final String ACTION = "android.intent.action.BOOT_COMPLETED";
    @Override
    public void onReceive(Context context, Intent intent) {
        // BOOT_COMPLETED” start Service
        if (intent.getAction().equals(ACTION)) {
            //Service
            Intent serviceIntent = new Intent(context, SimpleService.class);
            context.startService(serviceIntent);
        }
    }
}