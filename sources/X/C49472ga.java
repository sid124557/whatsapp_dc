package X;

import android.os.SystemClock;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: X.2ga  reason: invalid class name and case insensitive filesystem */
public class C49472ga {
    public final C72303dV A00;
    public final AnonymousClass4FV A01;
    public final AnonymousClass5ZC A02;
    public final AtomicLong A03 = new AtomicLong(-1);

    public void A02(String str, long j) {
        A01(this.A02, str, j);
    }

    public C49472ga(C72303dV r4, AnonymousClass4FV r5) {
        this.A01 = r5;
        this.A00 = r4;
        this.A02 = new C24941Zi().samplingRate;
    }

    public static void A00(C49472ga r2, String str, long j) {
        r2.A02(str, SystemClock.uptimeMillis() - j);
    }

    public void A01(AnonymousClass5ZC r9, String str, long j) {
        if (r9.A00()) {
            C24941Zi r2 = new C24941Zi();
            r2.A05 = str;
            r2.A03 = Long.valueOf(j);
            r2.A01 = Boolean.valueOf(C615631i.A02());
            r2.A00 = Boolean.TRUE;
            AtomicLong atomicLong = this.A03;
            if (atomicLong.get() == -1) {
                C72303dV r0 = this.A00;
                r0.A05();
                atomicLong.compareAndSet(-1, r0.A05.length() / 1048576);
            }
            r2.A04 = Long.valueOf(atomicLong.get());
            if (Boolean.TRUE.equals(C626936e.A01)) {
                r2.A02 = AnonymousClass001.A0f();
            }
            this.A01.BhE(r2, r9.A01);
        }
    }
}
