package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.util.Log;
import com.google.firebase.iid.FirebaseInstanceId;

/* renamed from: X.0xR  reason: invalid class name and case insensitive filesystem */
public final class C18450xR extends BroadcastReceiver {
    public C71513cE A00;

    public final void onReceive(Context context, Intent intent) {
        ConnectivityManager connectivityManager;
        NetworkInfo activeNetworkInfo;
        C71513cE r0 = this.A00;
        if (r0 != null && (connectivityManager = (ConnectivityManager) r0.A01().getSystemService("connectivity")) != null && (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) != null && activeNetworkInfo.isConnected()) {
            if (FirebaseInstanceId.A03()) {
                Log.d("FirebaseInstanceId", "Connectivity changed. Starting background sync.");
            }
            FirebaseInstanceId.A02(this.A00, 0);
            this.A00.A01().unregisterReceiver(this);
            this.A00 = null;
        }
    }

    public C18450xR(C71513cE r1) {
        this.A00 = r1;
    }
}
