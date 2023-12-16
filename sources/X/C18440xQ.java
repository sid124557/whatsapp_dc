package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* renamed from: X.0xQ  reason: invalid class name and case insensitive filesystem */
public final class C18440xQ extends BroadcastReceiver {
    public final AnonymousClass4CC A00;

    public C18440xQ(AnonymousClass4CC r1) {
        C626936e.A06(r1);
        this.A00 = r1;
    }

    public void onReceive(Context context, Intent intent) {
        if (getResultCode() == -1) {
            AnonymousClass2XL r8 = new AnonymousClass2XL(getResultData(), getResultExtras(true).getLong("timestamp", Long.MAX_VALUE));
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("received phone id from ");
            A0o.append(intent.getPackage());
            C18260x0.A1P(A0o, ": ", r8);
            String str = intent.getPackage();
            AnonymousClass4CC r6 = this.A00;
            AnonymousClass2XL BBI = r6.BBI();
            if (BBI.A01 == null || (r8.A01 != null && r8.A00 < BBI.A00)) {
                r6.Bmt(r8);
                StringBuilder A0o2 = AnonymousClass001.A0o();
                A0o2.append("updated phone id from ");
                A0o2.append(BBI);
                A0o2.append(" to ");
                A0o2.append(r8);
                C18260x0.A0s(" based on package ", str, A0o2);
                return;
            }
            return;
        }
        StringBuilder A0o3 = AnonymousClass001.A0o();
        A0o3.append("unsuccessful phone id query to ");
        C18260x0.A1J(A0o3, intent.getPackage());
    }
}
