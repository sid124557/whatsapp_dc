package X;

import java.util.Arrays;

/* renamed from: X.7W2  reason: invalid class name */
public class AnonymousClass7W2 {
    public int A00;
    public byte[] A01;

    public boolean equals(Object obj) {
        if (obj instanceof AnonymousClass7W2) {
            AnonymousClass7W2 r4 = (AnonymousClass7W2) obj;
            if (r4.A00 == this.A00) {
                return Arrays.equals(this.A01, r4.A01);
            }
        }
        return false;
    }

    public int hashCode() {
        return this.A00 ^ C161007oo.A00(this.A01);
    }

    public AnonymousClass7W2(byte[] bArr, int i) {
        this.A01 = C161007oo.A02(bArr);
        this.A00 = i;
    }
}
