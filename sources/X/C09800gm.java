package X;

/* renamed from: X.0gm  reason: invalid class name and case insensitive filesystem */
public class C09800gm implements C184748sS {
    public C09810gn A00;
    public C1675081i A01;

    public void Bfy(C161387pX r2) {
        this.A00.Bfy(r2);
        this.A01.Bfy(r2);
    }

    public void close() {
        this.A00.close();
        this.A01.close();
    }

    public void write(byte[] bArr, int i, int i2) {
        this.A00.write(bArr, i, i2);
        this.A01.write(bArr, i, i2);
    }

    public C09800gm(C09810gn r1, C1675081i r2) {
        this.A00 = r1;
        this.A01 = r2;
    }
}
