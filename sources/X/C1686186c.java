package X;

/* renamed from: X.86c  reason: invalid class name and case insensitive filesystem */
public final class C1686186c implements C187648xa {
    public final long A00;
    public final C187648xa A01;

    public boolean Bge(byte[] bArr, int i, int i2, boolean z) {
        return this.A01.Bge(bArr, 0, i2, z);
    }

    public boolean BiM(byte[] bArr, int i, int i2, boolean z) {
        return this.A01.BiM(bArr, 0, i2, z);
    }

    public int BpM(int i) {
        return this.A01.BpM(1);
    }

    public void Awu(int i) {
        this.A01.Awu(i);
    }

    public long BBF() {
        return this.A01.BBF() - this.A00;
    }

    public long BBW() {
        return this.A01.BBW() - this.A00;
    }

    public int BgZ(byte[] bArr, int i, int i2) {
        return this.A01.BgZ(bArr, i, i2);
    }

    public void Bgd(byte[] bArr, int i, int i2) {
        this.A01.Bgd(bArr, i, i2);
    }

    public void Bjy() {
        this.A01.Bjy();
    }

    public void BpP(int i) {
        this.A01.BpP(i);
    }

    public long getLength() {
        return this.A01.getLength() - this.A00;
    }

    public int read(byte[] bArr, int i, int i2) {
        return this.A01.read(bArr, i, i2);
    }

    public void readFully(byte[] bArr, int i, int i2) {
        this.A01.readFully(bArr, i, i2);
    }

    public C1686186c(C187648xa r4, long j) {
        this.A01 = r4;
        C161487pm.A03(AnonymousClass001.A1U((r4.BBW() > j ? 1 : (r4.BBW() == j ? 0 : -1))));
        this.A00 = j;
    }
}
