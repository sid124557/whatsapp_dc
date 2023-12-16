package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* renamed from: X.4MX  reason: invalid class name */
public final class AnonymousClass4MX extends Handler {
    public final Context A00;
    public final AnonymousClass5Y0 A01;

    public void handleMessage(Message message) {
        AnonymousClass4NX r2;
        long j;
        C157857j0 r5;
        Message obtain;
        AnonymousClass7MU r0 = (AnonymousClass7MU) message.obj;
        if (r0 != null) {
            r2 = r0.A01;
            r5 = r0.A02;
            j = r0.A00;
        } else {
            r2 = null;
            j = -1;
            r5 = null;
        }
        AnonymousClass5Y0 r3 = this.A01;
        Resources resources = this.A00.getResources();
        C626936e.A06(r5);
        Drawable A04 = r3.A04(resources, r5, 0.6f, j);
        if (r2 != null) {
            r2.setTag(A04);
            obtain = Message.obtain(AnonymousClass5ZF.A0W, 0, 0, 0, AnonymousClass0x9.A0C(Long.valueOf(j), r2));
        } else {
            obtain = Message.obtain(AnonymousClass5ZF.A0W, 1, 0, 0, AnonymousClass0x9.A0C(Long.valueOf(j), A04));
        }
        obtain.sendToTarget();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass4MX(Context context, Looper looper, AnonymousClass5Y0 r4) {
        super(looper);
        C626936e.A06(looper);
        this.A00 = context.getApplicationContext();
        this.A01 = r4;
    }
}
