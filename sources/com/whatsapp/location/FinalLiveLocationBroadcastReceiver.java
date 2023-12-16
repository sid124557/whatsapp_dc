package com.whatsapp.location;

import X.AnonymousClass002;
import X.AnonymousClass2A1;
import X.C621233o;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.whatsapp.util.Log;

public class FinalLiveLocationBroadcastReceiver extends BroadcastReceiver {
    public C621233o A00;
    public final Object A01;
    public volatile boolean A02;

    public void onReceive(Context context, Intent intent) {
        if (!this.A02) {
            synchronized (this.A01) {
                if (!this.A02) {
                    AnonymousClass2A1.A00(context).ARN(this);
                    this.A02 = true;
                }
            }
        }
        Log.i("FinalLiveLocationBroadcastReceiver/onReceive");
        this.A00.A0F();
    }

    public FinalLiveLocationBroadcastReceiver(int i) {
        this.A02 = false;
        this.A01 = AnonymousClass002.A0D();
    }

    public FinalLiveLocationBroadcastReceiver() {
        this(0);
    }
}
