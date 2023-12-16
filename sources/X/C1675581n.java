package X;

import android.net.Uri;

/* renamed from: X.81n  reason: invalid class name and case insensitive filesystem */
public class C1675581n implements C185788uF {
    public Uri A00;
    public final C185788uF A01;

    public Uri BE6() {
        return this.A00;
    }

    public long Bfw(C161387pX r3) {
        this.A00 = r3.A04;
        return this.A01.Bfw(r3);
    }

    public /* synthetic */ void cancel() {
    }

    public void close() {
        this.A01.close();
    }

    public int read(byte[] bArr, int i, int i2) {
        return this.A01.read(bArr, i, i2);
    }

    public C1675581n(C185788uF r1) {
        this.A01 = r1;
    }

    public void Awq(C184768sU r2) {
        r2.getClass();
        this.A01.Awq(r2);
    }
}
