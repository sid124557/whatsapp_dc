package X;

/* renamed from: X.883  reason: invalid class name */
public final class AnonymousClass883 implements C185338tU {
    public final long A00;
    public final C185338tU A01;

    public boolean BIe() {
        return this.A01.BIe();
    }

    public void BL1() {
        this.A01.BL1();
    }

    public int BiK(C147807Fu r6, C126496Oc r7, boolean z) {
        int BiK = this.A01.BiK(r6, r7, z);
        if (BiK == -4) {
            r7.A00 = Math.max(0, r7.A00 + this.A00);
        }
        return BiK;
    }

    public int BpO(long j) {
        return this.A01.BpO(j - this.A00);
    }

    public AnonymousClass883(C185338tU r1, long j) {
        this.A01 = r1;
        this.A00 = j;
    }
}
