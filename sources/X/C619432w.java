package X;

/* renamed from: X.32w  reason: invalid class name and case insensitive filesystem */
public class C619432w {
    public final int A00;
    public final int A01;
    public final long A02;
    public final byte[] A03;

    public C619432w(byte[] bArr, int i, long j) {
        this.A01 = i;
        this.A02 = bArr != null ? j + 16 + 16 : j;
        this.A00 = 0;
        this.A03 = bArr;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("FpmMessage{type=");
        A0o.append(this.A01);
        A0o.append(", length=");
        A0o.append(this.A02);
        A0o.append(", errorCode=");
        A0o.append(this.A00);
        return AnonymousClass000.A0d(A0o);
    }

    public C619432w(int i) {
        this.A01 = i;
        this.A02 = 0;
        this.A00 = 0;
        this.A03 = null;
    }

    public C619432w(int i, long j, int i2) {
        this.A01 = i;
        this.A02 = j;
        this.A00 = i2;
        this.A03 = null;
    }
}
