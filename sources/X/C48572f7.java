package X;

import java.util.Arrays;

/* renamed from: X.2f7  reason: invalid class name and case insensitive filesystem */
public final class C48572f7 {
    public final String A00;
    public final byte[] A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || C48572f7.class != obj.getClass()) {
                return false;
            }
            C48572f7 r5 = (C48572f7) obj;
            if (!Arrays.equals(this.A01, r5.A01) || !AnonymousClass75J.A00(this.A00, r5.A00)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return ((Arrays.hashCode(this.A01) + 31) * 31) + C18270x1.A00(this.A00);
    }

    public C48572f7(String str, byte[] bArr) {
        this.A00 = str;
        this.A01 = bArr;
    }
}
