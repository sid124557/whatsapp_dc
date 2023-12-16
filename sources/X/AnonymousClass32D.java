package X;

import android.os.Build;

/* renamed from: X.32D  reason: invalid class name */
public class AnonymousClass32D {
    public static final AnonymousClass5ZC A02 = new AnonymousClass5ZC(1000, 1000, 0, false);
    public static final AnonymousClass5ZC A03 = new AnonymousClass5ZC(1, 100, 0, false);
    public final AnonymousClass4FV A00;
    public final AnonymousClass5ZC A01;

    public AnonymousClass32D(AnonymousClass4FV r3) {
        AnonymousClass5ZC r0;
        if (Build.VERSION.SDK_INT >= 34) {
            r0 = A03;
        } else {
            r0 = A02;
        }
        this.A00 = r3;
        this.A01 = r0;
    }

    public AnonymousClass32D() {
    }
}
