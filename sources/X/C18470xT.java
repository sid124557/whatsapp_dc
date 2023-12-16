package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* renamed from: X.0xT  reason: invalid class name and case insensitive filesystem */
public class C18470xT extends BroadcastReceiver {
    public final C183538qC A00;

    public C18470xT(C183538qC r1) {
        this.A00 = r1;
    }

    public void onReceive(Context context, Intent intent) {
        boolean booleanExtra = intent.getBooleanExtra("noPopup", true);
        boolean A1N = AnonymousClass0x9.A1N(intent, "isAndroidWearRefresh");
        ((C619933b) this.A00.get()).A0C(C107395bF.A02(intent), booleanExtra, A1N);
    }
}
