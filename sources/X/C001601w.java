package X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* renamed from: X.01w  reason: invalid class name and case insensitive filesystem */
public class C001601w extends Handler {
    public void handleMessage(Message message) {
        AnonymousClass84O A01;
        C835248t A0L;
        super.handleMessage(message);
        AnonymousClass0XI r5 = (AnonymousClass0XI) message.obj;
        if (message.what == 0 && r5 != null && (A01 = r5.A0D) != null && r5.A0C != null && (A0L = A01.A0L(38)) != null) {
            AnonymousClass84O A012 = r5.A0D;
            C152057Xj r2 = new C152057Xj();
            r2.A04(Float.valueOf(((float) r5.A07) / 2.14748365E9f), 0);
            r2.A04(r5.A0C, 1);
            C159377lj.A01(r5.A0C, A012, r2.A03(), A0L);
        }
    }

    public C001601w(Looper looper) {
        super(looper);
    }
}
