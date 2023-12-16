package X;

import com.whatsapp.util.Log;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.2YO  reason: invalid class name */
public class AnonymousClass2YO {
    public C185518to A00;
    public final AtomicInteger A01 = new AtomicInteger();

    public Object A00(C182538oa r8) {
        C185518to r0;
        C185518to r3 = this.A00;
        AnonymousClass7US B6Y = r3.B6Y();
        if (B6Y == null) {
            Log.d("transfer-retries/no routes");
        } else {
            C161997qy r4 = null;
            boolean z = false;
            while (B6Y != null) {
                StringBuilder A0o = AnonymousClass001.A0o();
                A0o.append("transfer-retries/run attempt = ");
                A0o.append(r3.B6N());
                A0o.append("; route = ");
                C18260x0.A1J(A0o, B6Y.A02);
                r4 = r8.BkH(B6Y);
                if (z) {
                    this.A01.incrementAndGet();
                }
                if (!r4.A05) {
                    int i = r4.A00;
                    z = true;
                    if (i != 1 || (r0 = r4.A01) == null) {
                        C185518to r02 = this.A00;
                        boolean z2 = r4.A04;
                        r02.BSM(z2, i);
                        boolean z3 = r4.A03;
                        StringBuilder A0o2 = AnonymousClass001.A0o();
                        if (!z3) {
                            C18260x0.A0w("transfer-retries/run error; don't retry, responseCode=", A0o2, i);
                        } else {
                            A0o2.append("transfer-retries/run error; retry, hasProgress=");
                            A0o2.append(z2);
                            C18260x0.A0w("; responseCode=", A0o2, i);
                        }
                    } else {
                        this.A00 = r0;
                        z = false;
                    }
                    try {
                        Thread.sleep(this.A00.B4c());
                        r3 = this.A00;
                        B6Y = r3.B6Y();
                    } catch (InterruptedException unused) {
                        Log.d("transfer-retries/interrupted; return");
                        C18300x5.A11();
                    }
                }
                return r4.A02;
            }
            if (r4 != null) {
                return r4.A02;
            }
        }
        return null;
    }

    public AnonymousClass2YO(C185518to r2) {
        this.A00 = r2;
    }
}
