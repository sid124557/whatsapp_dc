package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.whatsapp.util.Log;

/* renamed from: X.93n  reason: invalid class name and case insensitive filesystem */
public class C1900193n extends BroadcastReceiver {
    public C194489Tb A00;
    public final Object A01 = AnonymousClass002.A0D();
    public volatile boolean A02 = false;

    public void onReceive(Context context, Intent intent) {
        if (!this.A02) {
            synchronized (this.A01) {
                if (!this.A02) {
                    ((C64333Db) AnonymousClass2A1.A01(context)).AcK.A00.ARW(this);
                    this.A02 = true;
                }
            }
        }
        Log.i("PaymentMethodUpdateNotification/dismiss");
        this.A00.A00();
    }
}
