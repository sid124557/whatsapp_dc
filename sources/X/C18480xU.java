package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* renamed from: X.0xU  reason: invalid class name and case insensitive filesystem */
public abstract class C18480xU extends BroadcastReceiver {
    public final Object A00 = AnonymousClass002.A0D();
    public volatile boolean A01 = false;

    public void onReceive(Context context, Intent intent) {
        if (!this.A01) {
            synchronized (this.A00) {
                if (!this.A01) {
                    AnonymousClass2A1.A01(context);
                    this.A01 = true;
                }
            }
        }
    }
}
