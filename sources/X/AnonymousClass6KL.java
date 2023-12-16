package X;

import android.net.Uri;

/* renamed from: X.6KL  reason: invalid class name */
public final class AnonymousClass6KL extends C1675681o implements C185788uF {
    public int A00;
    public int A01;
    public Uri A02;
    public boolean A03;
    public final byte[] A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass6KL(byte[] bArr) {
        super(false);
        boolean z = false;
        bArr.getClass();
        C159197lM.A01(bArr.length > 0 ? true : z);
        this.A04 = bArr;
    }

    public Uri BE6() {
        return this.A02;
    }

    public long Bfw(C161387pX r12) {
        this.A02 = r12.A04;
        A01();
        long j = r12.A03;
        int i = (int) j;
        this.A01 = i;
        long j2 = r12.A02;
        long j3 = j2;
        if (j2 == -1) {
            j2 = ((long) this.A04.length) - j;
        }
        int i2 = (int) j2;
        this.A00 = i2;
        if (i2 <= 0 || i + i2 > this.A04.length) {
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("Unsatisfiable range: [");
            A0o.append(i);
            AnonymousClass001.A1M(A0o);
            A0o.append(j3);
            A0o.append("], length: ");
            throw AnonymousClass002.A0C(AnonymousClass000.A0h(A0o, this.A04.length));
        }
        this.A03 = true;
        A03(r12);
        return (long) this.A00;
    }

    public void close() {
        if (this.A03) {
            this.A03 = false;
            A00();
        }
        this.A02 = null;
    }

    public int read(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        int i3 = this.A00;
        if (i3 == 0) {
            return -1;
        }
        int min = Math.min(i2, i3);
        System.arraycopy(this.A04, this.A01, bArr, i, min);
        this.A01 += min;
        this.A00 -= min;
        A02(min);
        return min;
    }
}
