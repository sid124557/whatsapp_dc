package X;

import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;

/* renamed from: X.0XJ  reason: invalid class name */
public final class AnonymousClass0XJ {
    public static AnonymousClass0XJ A01;
    public static final PorterDuff.Mode A02 = PorterDuff.Mode.SRC_IN;
    public AnonymousClass0XW A00;

    public static synchronized PorterDuffColorFilter A00(PorterDuff.Mode mode, int i) {
        PorterDuffColorFilter A002;
        synchronized (AnonymousClass0XJ.class) {
            A002 = AnonymousClass0XW.A00(mode, i);
        }
        return A002;
    }

    public static synchronized AnonymousClass0XJ A01() {
        AnonymousClass0XJ r0;
        synchronized (AnonymousClass0XJ.class) {
            if (A01 == null) {
                A02();
            }
            r0 = A01;
        }
        return r0;
    }

    public static synchronized void A02() {
        synchronized (AnonymousClass0XJ.class) {
            if (A01 == null) {
                AnonymousClass0XJ r1 = new AnonymousClass0XJ();
                A01 = r1;
                r1.A00 = AnonymousClass0XW.A03();
                AnonymousClass0XW r12 = A01.A00;
                C07640bM r0 = new C07640bM();
                synchronized (r12) {
                    r12.A01 = r0;
                }
            }
        }
    }
}
