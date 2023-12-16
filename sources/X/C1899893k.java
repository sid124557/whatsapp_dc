package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* renamed from: X.93k  reason: invalid class name and case insensitive filesystem */
public class C1899893k extends BroadcastReceiver {
    public final /* synthetic */ C191129Co A00;

    public C1899893k(C191129Co r1) {
        this.A00 = r1;
    }

    public void onReceive(Context context, Intent intent) {
        C191129Co r1 = this.A00;
        if (r1.A00 != null) {
            r1.A7j();
        } else {
            r1.A04.A06("onLibraryResult got resend otp but bankaccount is null");
        }
    }
}
