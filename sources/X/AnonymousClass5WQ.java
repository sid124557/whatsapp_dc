package X;

import java.lang.ref.WeakReference;

/* renamed from: X.5WQ  reason: invalid class name */
public final class AnonymousClass5WQ {
    public static WeakReference A00;
    public static final AnonymousClass5WQ A01 = new AnonymousClass5WQ();

    public final void A00(int i) {
        C1229366k r1;
        AnonymousClass58O r0;
        WeakReference weakReference = A00;
        if (!(weakReference == null || (r1 = (C1229366k) weakReference.get()) == null)) {
            if (i == 5) {
                r1.Bf6();
            } else if (i == 145) {
                r1.Bf9();
            } else if (i == 155) {
                r1.Bf5();
            } else if (i != 165) {
                if (i == 400) {
                    r0 = AnonymousClass58O.ERROR_FAIL_TO_DOWNLOAD;
                } else if (i == 420) {
                    r0 = AnonymousClass58O.ERROR_MISMATCHED_TEMPLATE;
                } else if (i == 499) {
                    r0 = AnonymousClass58O.ERROR_UNKNOWN;
                } else {
                    return;
                }
                r1.BZv(r0);
            } else {
                r1.Bf7();
            }
        }
        A00 = null;
    }
}
