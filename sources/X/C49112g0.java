package X;

import android.content.Context;

/* renamed from: X.2g0  reason: invalid class name and case insensitive filesystem */
public class C49112g0 {
    public AnonymousClass1R5 A00;
    public final Context A01;
    public final AnonymousClass4C1 A02;

    public AnonymousClass4GK A01() {
        AnonymousClass1R5 r0;
        synchronized (this) {
            r0 = this.A00;
            if (r0 == null) {
                r0 = (AnonymousClass1R5) this.A02.get();
                this.A00 = r0;
            }
        }
        return r0.get();
    }

    public static AnonymousClass4GK A00(C55362qE r0) {
        return r0.A01.A00.A01();
    }

    public C49112g0(Context context, AnonymousClass4C1 r2) {
        this.A01 = context;
        this.A02 = r2;
    }
}
