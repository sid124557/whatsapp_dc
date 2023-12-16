package X;

import java.util.Arrays;
import java.util.Collection;
import java.util.Map;

/* renamed from: X.2fw  reason: invalid class name and case insensitive filesystem */
public class C49072fw {
    public final Collection A00;
    public final Map A01;
    public final byte[] A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C49072fw r5 = (C49072fw) obj;
            if (!Arrays.equals(this.A02, r5.A02) || !this.A00.equals(r5.A00) || !this.A01.equals(r5.A01)) {
                return false;
            }
        }
        return true;
    }

    public C49072fw(Collection collection, Map map, byte[] bArr) {
        this.A02 = bArr;
        this.A00 = collection;
        this.A01 = map;
    }

    public int hashCode() {
        Object[] A1X = AnonymousClass0x9.A1X();
        A1X[0] = this.A02;
        A1X[1] = this.A01;
        return C18310x6.A08(this.A00, A1X, 2);
    }
}
