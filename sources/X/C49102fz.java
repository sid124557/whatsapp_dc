package X;

import android.content.Context;

/* renamed from: X.2fz  reason: invalid class name and case insensitive filesystem */
public class C49102fz {
    public AnonymousClass1R6 A00;
    public final Context A01;
    public final AnonymousClass4C1 A02;

    public AnonymousClass4GK A00() {
        AnonymousClass1R6 r0;
        synchronized (this) {
            r0 = this.A00;
            if (r0 == null) {
                r0 = (AnonymousClass1R6) this.A02.get();
                this.A00 = r0;
            }
        }
        return r0.get();
    }

    public C85284Fq A01() {
        AnonymousClass1R6 r0;
        synchronized (this) {
            r0 = this.A00;
            if (r0 == null) {
                r0 = (AnonymousClass1R6) this.A02.get();
                this.A00 = r0;
            }
        }
        return r0.A0C();
    }

    public C49102fz(Context context, AnonymousClass4C1 r2) {
        this.A01 = context;
        this.A02 = r2;
    }
}
