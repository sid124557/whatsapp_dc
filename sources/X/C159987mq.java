package X;

import android.content.Context;

/* renamed from: X.7mq  reason: invalid class name and case insensitive filesystem */
public class C159987mq {
    public static C159987mq A01 = new C159987mq();
    public AnonymousClass7BQ A00 = null;

    public static AnonymousClass7BQ A00(Context context) {
        AnonymousClass7BQ r0;
        C159987mq r1 = A01;
        synchronized (r1) {
            r0 = r1.A00;
            if (r0 == null) {
                if (context.getApplicationContext() != null) {
                    context = context.getApplicationContext();
                }
                r0 = new AnonymousClass7BQ(context);
                r1.A00 = r0;
            }
        }
        return r0;
    }
}
