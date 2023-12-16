package X;

import java.util.concurrent.TimeUnit;

/* renamed from: X.3Cs  reason: invalid class name and case insensitive filesystem */
public final class C64243Cs implements AnonymousClass4F2, C84334By {
    public static final long A0A = TimeUnit.SECONDS.toMillis(3);
    public C72173dI A00;
    public C33281sk A01;
    public Runnable A02;
    public final C56612sH A03;
    public final AnonymousClass4FS A04;
    public final C56042rK A05;
    public final C183538qC A06;
    public final C183538qC A07;
    public final C183538qC A08;
    public final C183538qC A09;

    public void BUB() {
        this.A00.execute(new C71303bt(this, 5));
    }

    public void BUD() {
        this.A00.execute(new C71303bt(this, 4));
    }

    public void Beu() {
        this.A04.BkM(new C71303bt(this, 7));
    }

    public C64243Cs(C56612sH r2, AnonymousClass4FS r3, C56042rK r4, C183538qC r5, C183538qC r6, C183538qC r7, C183538qC r8) {
        C18260x0.A0f(r2, r3, r4, r5, r6);
        C18260x0.A0U(r7, r8);
        this.A03 = r2;
        this.A04 = r3;
        this.A05 = r4;
        this.A06 = r5;
        this.A09 = r6;
        this.A07 = r7;
        this.A08 = r8;
        this.A00 = C72173dI.A00(r3);
    }

    public /* synthetic */ void BUC() {
    }

    public /* synthetic */ void BUE() {
    }

    public /* synthetic */ void BUF() {
    }
}
