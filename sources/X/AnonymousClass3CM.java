package X;

import android.os.SystemClock;

/* renamed from: X.3CM  reason: invalid class name */
public final class AnonymousClass3CM implements AnonymousClass4CD {
    public final AnonymousClass1VX A00;
    public final C54112oC A01;
    public final C183538qC A02;
    public final AnonymousClass66R A03 = C154517dI.A01(new C79683x1(this));
    public final AnonymousClass66R A04 = C154517dI.A01(new C79693x2(this));

    public void BMV() {
        if (C18270x1.A1V(this.A04)) {
            AnonymousClass30V r3 = (AnonymousClass30V) this.A02.get();
            r3.A05.BkM(new C117095rN(r3, 6));
        }
    }

    public void onAppBackgrounded() {
        if (C18270x1.A1V(this.A04)) {
            AnonymousClass30V r3 = (AnonymousClass30V) this.A02.get();
            r3.A05.BkM(new C117095rN(r3, 7));
        }
        if (C18270x1.A1V(this.A03)) {
            C54112oC r4 = this.A01;
            if (r4.A06) {
                r4.A02((C18290x4.A0B(SystemClock.elapsedRealtime()) - r4.A03) + 1);
                Runnable runnable = r4.A04;
                if (runnable != null) {
                    r4.A0C.BjN(runnable);
                }
            }
        }
    }

    public AnonymousClass3CM(AnonymousClass1VX r2, C54112oC r3, C183538qC r4) {
        C18260x0.A0V(r2, r3, r4);
        this.A00 = r2;
        this.A01 = r3;
        this.A02 = r4;
    }
}
