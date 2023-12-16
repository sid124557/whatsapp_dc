package X;

/* renamed from: X.5ji  reason: invalid class name and case insensitive filesystem */
public class C112425ji implements C185658u2 {
    public final long A00;
    public final long A01;
    public final C117005rE A02;
    public final C104375Qs A03;
    public final C95814uZ A04;

    public int hashCode() {
        Object[] objArr = new Object[5];
        C18280x3.A1S(objArr, this.A00);
        objArr[1] = this.A04;
        objArr[2] = this.A03;
        objArr[3] = Long.valueOf(this.A01);
        return C18310x6.A08(this.A02, objArr, 4);
    }

    public C117005rE B58() {
        return this.A02;
    }

    public int B8k() {
        return 7;
    }

    public C95814uZ B8o() {
        return null;
    }

    public /* synthetic */ int BCW() {
        return -1;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C112425ji)) {
            return false;
        }
        C112425ji r7 = (C112425ji) obj;
        if (this.A00 != r7.A00 || !this.A04.equals(r7.A04) || !this.A03.equals(r7.A03) || this.A01 != r7.A01 || !AnonymousClass75J.A00(this.A02, r7.A02)) {
            return false;
        }
        return true;
    }

    public C112425ji(C117005rE r1, C104375Qs r2, C95814uZ r3, long j, long j2) {
        this.A00 = j;
        this.A01 = j2;
        this.A04 = r3;
        this.A03 = r2;
        this.A02 = r1;
    }
}
