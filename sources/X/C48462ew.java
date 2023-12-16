package X;

import java.util.Arrays;

/* renamed from: X.2ew  reason: invalid class name and case insensitive filesystem */
public class C48462ew {
    public final byte A00;
    public final byte[] A01;

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof C48462ew)) {
            return false;
        }
        return Arrays.equals(this.A01, ((C48462ew) obj).A01);
    }

    public int hashCode() {
        return Arrays.hashCode(this.A01);
    }

    public C48462ew(byte[] bArr, byte b) {
        this.A01 = bArr;
        this.A00 = b;
    }
}
