package X;

import android.os.SystemClock;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.2bk  reason: invalid class name and case insensitive filesystem */
public class C46512bk {
    public final long A00;
    public final AnonymousClass4FV A01;
    public final AnonymousClass5ZC A02;
    public final String A03;
    public final AtomicBoolean A04 = C18280x3.A0l();

    public void A00() {
        if (this.A04.compareAndSet(false, true)) {
            long elapsedRealtime = SystemClock.elapsedRealtime() - this.A00;
            StringBuilder A0l = AnonymousClass000.A0l("PerfTimer(");
            String str = this.A03;
            A0l.append(str);
            C18260x0.A10(") done in ", A0l, elapsedRealtime);
            C24591Xz r2 = new C24591Xz();
            r2.A00 = Long.valueOf(elapsedRealtime);
            r2.A02 = str;
            r2.A01 = null;
            AnonymousClass5ZC r1 = this.A02;
            AnonymousClass4FV r0 = this.A01;
            if (r1 == null) {
                r0.BhD(r2);
            } else {
                r0.BhC(r2, r1);
            }
        } else {
            StringBuilder A0l2 = AnonymousClass000.A0l("PerfTimer(");
            A0l2.append(this.A03);
            C626936e.A0D(false, AnonymousClass000.A0X(") already stopped", A0l2));
        }
    }

    public C46512bk(AnonymousClass4FV r3, AnonymousClass5ZC r4, String str) {
        this.A01 = r3;
        this.A03 = str;
        this.A02 = r4;
        this.A00 = SystemClock.elapsedRealtime();
    }
}
