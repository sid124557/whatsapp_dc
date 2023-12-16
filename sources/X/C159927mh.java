package X;

import android.os.Handler;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.7mh  reason: invalid class name and case insensitive filesystem */
public final class C159927mh {
    public static final Runnable A00;
    public static final Runnable A01;
    public static final ConcurrentHashMap A02 = AnonymousClass0x9.A1D();
    public static final AtomicInteger A03 = new AtomicInteger(0);
    public static final AtomicInteger A04 = new AtomicInteger(0);
    public static final AtomicInteger A05 = new AtomicInteger(0);
    public static final AnonymousClass66R A06;

    static {
        AnonymousClass8P7 A002 = AnonymousClass8P7.A00(AnonymousClass8XC.A00);
        A06 = A002;
        C172578Lw r2 = new C172578Lw(1);
        A00 = r2;
        C172578Lw r1 = new C172578Lw(2);
        A01 = r1;
        ((Handler) A002.getValue()).post(r2);
        ((Handler) A06.getValue()).post(r1);
    }

    public static final void A00(AnonymousClass7FO r5, int i) {
        int i2 = r5.A00;
        float f = ((float) i2) * 0.5f;
        if (f < 1.0f) {
            f = 1.0f;
        }
        int i3 = (int) f;
        C1677982o r3 = r5.A01;
        int i4 = r3.A00;
        int A002 = C175708Zk.A00(i4 + i, i3, i2);
        if (A002 != i4 && A002 != r3.A00) {
            r3.A00 = C175708Zk.A00(A002, 1, r3.A04);
            r3.A01().A03(r3.A00);
        }
    }
}
