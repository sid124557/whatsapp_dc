package X;

import java.util.Arrays;

/* renamed from: X.1S8  reason: invalid class name */
public class AnonymousClass1S8 extends C46712c5 {
    public final String A00;
    public final String[] A01;

    public AnonymousClass1S8(String str, String str2, String[] strArr, long j, long j2) {
        super(str, AnonymousClass268.A00(str2), 7, j, j2);
        this.A00 = str2;
        this.A01 = strArr;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            AnonymousClass1S8 r4 = (AnonymousClass1S8) obj;
            if (this.A00.equals(r4.A00)) {
                return Arrays.equals(this.A01, r4.A01);
            }
        }
        return false;
    }

    public int hashCode() {
        return C18310x6.A09(this.A00) + Arrays.hashCode(this.A01);
    }
}
