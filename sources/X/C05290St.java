package X;

import android.os.Build;

/* renamed from: X.0St  reason: invalid class name and case insensitive filesystem */
public final class C05290St {
    public final AnonymousClass0UT A00;

    public C05290St(AnonymousClass0XY r3) {
        AnonymousClass0UT r0;
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            r0 = new AnonymousClass06A(r3);
        } else if (i >= 29) {
            r0 = new AnonymousClass06C(r3);
        } else {
            r0 = new AnonymousClass06B(r3);
        }
        this.A00 = r0;
    }

    public C05290St() {
        AnonymousClass0UT r0;
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            r0 = new AnonymousClass06A();
        } else if (i >= 29) {
            r0 = new AnonymousClass06C();
        } else {
            r0 = new AnonymousClass06B();
        }
        this.A00 = r0;
    }
}
