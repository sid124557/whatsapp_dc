package X;

import android.net.Uri;

/* renamed from: X.0Py  reason: invalid class name */
public class AnonymousClass0Py {
    public long A00;
    public long A01;
    public long A02;
    public final int A03;
    public final Uri A04;
    public final C160487ni A05;
    public final String A06;
    public final byte[] A07;

    public C161387pX A00() {
        Uri uri = this.A04;
        byte[] bArr = this.A07;
        long j = this.A00;
        long j2 = this.A02;
        long j3 = this.A01;
        return new C161387pX(uri, this.A05, this.A06, bArr, this.A03, j, j2, j3);
    }

    public void A01(int i) {
        long j = this.A01;
        if (j != -1) {
            long j2 = j - ((long) i);
            C159197lM.A02(AnonymousClass001.A1U((j2 > 0 ? 1 : (j2 == 0 ? 0 : -1))));
            this.A01 = j2;
        }
        long j3 = (long) i;
        this.A00 += j3;
        this.A02 += j3;
    }

    public void A02(long j) {
        C159197lM.A02(AnonymousClass000.A1T((this.A01 > -1 ? 1 : (this.A01 == -1 ? 0 : -1))));
        this.A01 = j;
    }

    public AnonymousClass0Py(C161387pX r3, String str) {
        this.A04 = r3.A04;
        this.A06 = str;
        this.A03 = r3.A00;
        this.A07 = r3.A08;
        this.A00 = r3.A01;
        this.A02 = r3.A03;
        this.A01 = r3.A02;
        this.A05 = r3.A05;
    }
}
