package X;

import java.util.Arrays;

/* renamed from: X.7Vz  reason: invalid class name and case insensitive filesystem */
public class C151707Vz {
    public final int A00;
    public final byte[] A01;

    public boolean equals(Object obj) {
        if (obj instanceof C151707Vz) {
            return Arrays.equals(this.A01, ((C151707Vz) obj).A01);
        }
        return false;
    }

    public int hashCode() {
        return this.A00;
    }

    public C151707Vz(byte[] bArr) {
        this.A00 = C161007oo.A00(bArr);
        this.A01 = bArr;
    }
}
