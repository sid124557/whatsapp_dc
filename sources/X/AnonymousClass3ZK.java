package X;

import java.math.BigInteger;
import java.util.Arrays;

/* renamed from: X.3ZK  reason: invalid class name */
public class AnonymousClass3ZK implements Comparable {
    public final byte[] A00;

    public byte[] A00() {
        return C616531r.A00(new byte[]{5}, this.A00);
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof AnonymousClass3ZK)) {
            return false;
        }
        return Arrays.equals(this.A00, ((AnonymousClass3ZK) obj).A00);
    }

    public /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return new BigInteger(this.A00).compareTo(new BigInteger(((AnonymousClass3ZK) obj).A00));
    }

    public int hashCode() {
        return Arrays.hashCode(this.A00);
    }

    public AnonymousClass3ZK(byte[] bArr) {
        this.A00 = bArr;
    }
}
