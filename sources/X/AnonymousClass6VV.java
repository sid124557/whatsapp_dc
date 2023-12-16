package X;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Message;

/* renamed from: X.6VV  reason: invalid class name */
public final class AnonymousClass6VV extends C124806Dy {
    public final Context A00;
    public final /* synthetic */ AnonymousClass6Q8 A01;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass6VV(android.content.Context r2, X.AnonymousClass6Q8 r3) {
        /*
            r1 = this;
            r1.A01 = r3
            android.os.Looper r0 = android.os.Looper.myLooper()
            if (r0 != 0) goto L_0x0016
            android.os.Looper r0 = android.os.Looper.getMainLooper()
        L_0x000c:
            r1.<init>(r0)
            android.content.Context r0 = r2.getApplicationContext()
            r1.A00 = r0
            return
        L_0x0016:
            android.os.Looper r0 = android.os.Looper.myLooper()
            goto L_0x000c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6VV.<init>(android.content.Context, X.6Q8):void");
    }

    public final void handleMessage(Message message) {
        PendingIntent activity;
        int i = message.what;
        if (i != 1) {
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("Don't know how to handle this message: ");
            A0o.append(i);
            AnonymousClass6C7.A1A(A0o, "GoogleApiAvailability");
            return;
        }
        AnonymousClass6Q8 r6 = this.A01;
        Context context = this.A00;
        int A04 = r6.A04(context, 12451000);
        if (A04 == 1 || A04 == 2 || A04 == 3 || A04 == 9) {
            Intent A05 = r6.A05(context, "n", A04);
            if (A05 == null) {
                activity = null;
            } else {
                activity = PendingIntent.getActivity(context, 0, A05, C1456876w.A00 | 134217728);
            }
            r6.A07(activity, context, A04);
        }
    }
}
