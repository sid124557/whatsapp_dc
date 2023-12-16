package X;

import java.io.InputStream;

/* renamed from: X.6uJ  reason: invalid class name and case insensitive filesystem */
public final class C140686uJ extends InputStream {
    public final /* synthetic */ C173338Pf A00;

    public int read(byte[] bArr, int i, int i2) {
        C162457s7.A0I(bArr, 0);
        C173338Pf r5 = this.A00;
        if (!r5.A00) {
            C1453875h.A00((long) bArr.length, (long) i, (long) i2);
            C172278Kj r6 = r5.A01;
            if (r6.A00 == 0 && C173338Pf.A00(r6, r5) == -1) {
                return -1;
            }
            return r6.A01(bArr, i, i2);
        }
        throw AnonymousClass002.A0C("closed");
    }

    public C140686uJ(C173338Pf r1) {
        this.A00 = r1;
    }

    public int available() {
        C173338Pf r1 = this.A00;
        if (!r1.A00) {
            return AnonymousClass6CA.A02(r1.A01.A00, (long) Integer.MAX_VALUE);
        }
        throw AnonymousClass002.A0C("closed");
    }

    public void close() {
        this.A00.close();
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append(this.A00);
        return AnonymousClass000.A0X(".inputStream()", A0o);
    }

    public int read() {
        C173338Pf r6 = this.A00;
        if (!r6.A00) {
            C172278Kj r5 = r6.A01;
            if (r5.A00 == 0 && C173338Pf.A00(r5, r6) == -1) {
                return -1;
            }
            return r5.readByte() & 255;
        }
        throw AnonymousClass002.A0C("closed");
    }
}
