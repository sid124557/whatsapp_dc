package X;

import java.util.concurrent.CancellationException;

/* renamed from: X.5TU  reason: invalid class name */
public final class AnonymousClass5TU {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public int A08;
    public int A09;
    public long A0A;
    public long A0B;
    public long A0C;
    public long A0D;
    public long A0E;
    public long A0F;
    public C85474Gj A0G;
    public boolean A0H;
    public boolean A0I;
    public final C104965Ta A0J;
    public final C104965Ta A0K;
    public final C104965Ta A0L;
    public final C104965Ta A0M;
    public final C104965Ta A0N;
    public final C104965Ta A0O;
    public final C73853gB A0P;
    public final C73853gB A0Q;

    public AnonymousClass5TU(C104965Ta r2, C104965Ta r3, C104965Ta r4, C104965Ta r5, C104965Ta r6, C104965Ta r7, C73853gB r8, C73853gB r9) {
        C162457s7.A0J(r8, 1);
        this.A0Q = r8;
        this.A0N = r2;
        this.A0K = r3;
        this.A0P = r9;
        this.A0M = r4;
        this.A0L = r5;
        this.A0O = r6;
        this.A0J = r7;
    }

    public final void A00() {
        this.A0L.A01();
        this.A0M.A01();
        this.A0N.A01();
        this.A0C = 0;
        this.A0D = 0;
        this.A0B = 0;
        this.A0A = 0;
        this.A0E = 0;
        C85474Gj r2 = this.A0G;
        if (r2 != null && r2.BGz()) {
            r2.AyX((CancellationException) null);
        }
        this.A0G = null;
        this.A08 = 0;
        this.A0H = false;
        this.A0F = 0;
        this.A0O.A01();
        this.A06 = 0;
        this.A07 = 0;
        this.A02 = 0;
        this.A04 = 0;
        this.A09 = 0;
        this.A0I = false;
        this.A00 = 0;
        this.A01 = 0;
        this.A03 = 0;
    }

    public final void A01(int i) {
        int i2;
        if (i == -100) {
            i2 = 4;
        } else if (i == -1) {
            i2 = 1;
        } else if (i == 670007) {
            i2 = 16;
        } else if (i == -14) {
            i2 = 8;
        } else if (i != -13) {
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("voip/ScreenShareLoggingHelper/ driver error ");
            A0o.append(i);
            C18260x0.A1J(A0o, " not logged");
            i2 = 128;
        } else {
            i2 = 2;
        }
        this.A02 |= i2;
        this.A04 = i2;
    }
}
