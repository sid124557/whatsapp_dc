package X;

import java.util.concurrent.TimeUnit;

/* renamed from: X.2wV  reason: invalid class name and case insensitive filesystem */
public final class C59192wV {
    public static final long A01 = TimeUnit.SECONDS.toMillis(30);
    public final AnonymousClass4FS A00;

    public C59192wV(AnonymousClass4FS r2) {
        C162457s7.A0J(r2, 1);
        this.A00 = r2;
    }

    public final void A00(C54662p5 r5, C84344Bz r6, C27131dK r7, Runnable runnable) {
        C18260x0.A0O(r7, r5);
        Object A002 = r7.A00((Object) null);
        C626936e.A06(A002);
        Number number = (Number) A002;
        if (number != null) {
            int intValue = number.intValue();
            if (intValue != 3489016) {
                if (intValue == 3489014) {
                    Long A012 = r5.A01();
                    if (A012 != null) {
                        this.A00.Bkn(runnable, "XFamilyGraphqlErrorHandler/retryWithBackoff", A012.longValue());
                        return;
                    }
                }
            }
            r6.onError(intValue);
            return;
        }
        C162457s7.A0H(number);
        r6.onError(number.intValue());
    }
}
