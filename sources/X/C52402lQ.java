package X;

import java.util.Arrays;

/* renamed from: X.2lQ  reason: invalid class name and case insensitive filesystem */
public class C52402lQ {
    public final long A00;
    public final C61162zo A01;
    public final byte[] A02;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C52402lQ)) {
            return false;
        }
        C52402lQ r7 = (C52402lQ) obj;
        return this.A00 == r7.A00 && Arrays.equals(this.A02, r7.A02) && this.A01.equals(r7.A01);
    }

    public C52402lQ(C61162zo r1, byte[] bArr, long j) {
        this.A02 = bArr;
        this.A00 = j;
        this.A01 = r1;
    }

    public int hashCode() {
        Object[] A0M = AnonymousClass002.A0M();
        C18280x3.A1S(A0M, this.A00);
        return (C18310x6.A08(this.A01, A0M, 1) * 31) + Arrays.hashCode(this.A02);
    }

    public String toString() {
        return "SyncdKeyData";
    }
}
