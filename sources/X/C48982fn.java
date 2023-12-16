package X;

import java.util.Arrays;

/* renamed from: X.2fn  reason: invalid class name and case insensitive filesystem */
public final class C48982fn {
    public final String A00;
    public final byte[] A01;
    public final byte[] A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || C48982fn.class != obj.getClass()) {
                return false;
            }
            C48982fn r5 = (C48982fn) obj;
            if (!Arrays.equals(this.A01, r5.A01) || !Arrays.equals(this.A02, r5.A02) || !AnonymousClass75J.A00(this.A00, r5.A00)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return ((((Arrays.hashCode(this.A01) + 31) * 31) + Arrays.hashCode(this.A02)) * 31) + C18270x1.A00(this.A00);
    }

    public C48982fn(String str, byte[] bArr, byte[] bArr2) {
        this.A00 = str;
        this.A02 = bArr;
        this.A01 = bArr2;
    }
}
