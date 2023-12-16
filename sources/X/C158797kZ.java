package X;

import android.os.SystemClock;

/* renamed from: X.7kZ  reason: invalid class name and case insensitive filesystem */
public class C158797kZ {
    public static final AnonymousClass5ZC A04 = new AnonymousClass5ZC(1, 10);
    public long A00 = -1;
    public final long A01;
    public final AnonymousClass4FV A02;
    public final C134226ie A03;

    public void A00() {
        long j = this.A00;
        C626936e.A0C(AnonymousClass001.A1W((j > 0 ? 1 : (j == 0 ? 0 : -1))));
        C134226ie r4 = this.A03;
        r4.A02 = Boolean.FALSE;
        r4.A0A = C18310x6.A0f(SystemClock.uptimeMillis(), j);
        r4.A0O = C18310x6.A0f(SystemClock.uptimeMillis(), this.A01);
        this.A02.BhC(r4, A04);
    }

    public void A01() {
        long j = this.A00;
        C626936e.A0C(AnonymousClass001.A1W((j > 0 ? 1 : (j == 0 ? 0 : -1))));
        C134226ie r4 = this.A03;
        r4.A0A = C18310x6.A0f(SystemClock.uptimeMillis(), j);
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("mediatranscodequeue/srcLength");
        A0o.append(r4.A0K);
        A0o.append(" destinationSize=");
        A0o.append(r4.A08);
        A0o.append(" compressionRate=");
        A0o.append(((float) r4.A08.longValue()) / ((float) r4.A0K.longValue()));
        A0o.append(" duration=");
        A0o.append(r4.A0A);
        A0o.append(" width=");
        A0o.append(r4.A09);
        A0o.append(" height=");
        A0o.append(r4.A07);
        A0o.append(" isProgressiveJpeg=");
        A0o.append(r4.A03);
        A0o.append(" firstScanLength=");
        A0o.append(r4.A0B);
        A0o.append(" thumbnailLength=");
        C18260x0.A0o(r4.A0N, A0o);
        r4.A02 = Boolean.TRUE;
        r4.A0O = C18310x6.A0f(SystemClock.uptimeMillis(), this.A01);
        this.A02.BhD(r4);
    }

    public void A02(int i, int i2) {
        C134226ie r1 = this.A03;
        r1.A09 = AnonymousClass0x9.A0m(i);
        r1.A07 = AnonymousClass0x9.A0m(i2);
    }

    public void A03(C104315Qm r4) {
        C134226ie r2 = this.A03;
        r2.A0L = AnonymousClass0x9.A0m(r4.A03);
        r2.A0J = AnonymousClass0x9.A0m(r4.A01);
        r2.A0H = AnonymousClass0x9.A0m(r4.A01() / 1000);
        r2.A0I = Long.valueOf(C18290x4.A0B(r4.A04));
    }

    public C158797kZ(AnonymousClass4FV r3) {
        this.A02 = r3;
        this.A03 = new C134226ie();
        this.A01 = SystemClock.uptimeMillis();
    }
}
