package androidx.test.core.app;

import X.C17480ve;
import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;

public class InstrumentationActivityInvoker$EmptyActivity extends Activity {
    public final BroadcastReceiver A00 = new C17480ve(this, 2);

    public void finish() {
        super.finish();
        overridePendingTransition(0, 0);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        registerReceiver(this.A00, new IntentFilter("androidx.test.core.app.InstrumentationActivityInvoker.FINISH_EMPTY_ACTIVITIES"));
        overridePendingTransition(0, 0);
    }

    public void onDestroy() {
        super.onDestroy();
        unregisterReceiver(this.A00);
    }

    public void onResume() {
        super.onResume();
        sendBroadcast(new Intent("androidx.test.core.app.InstrumentationActivityInvoker.EMPTY_ACTIVITY_RESUMED"));
    }
}
