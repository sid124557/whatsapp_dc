package X;

import java.util.Arrays;

/* renamed from: X.2gP  reason: invalid class name and case insensitive filesystem */
public class C49362gP {
    public int A00;
    public String A01;
    public String A02;
    public boolean A03;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C49362gP) {
                C49362gP r5 = (C49362gP) obj;
                if (this.A00 != r5.A00 || this.A03 != r5.A03 || !AnonymousClass75J.A00(this.A02, r5.A02) || !AnonymousClass75J.A00(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        Object[] objArr = new Object[4];
        AnonymousClass000.A1L(objArr, this.A00);
        AnonymousClass000.A1R(objArr, this.A03);
        objArr[2] = this.A02;
        objArr[3] = this.A01;
        return Arrays.deepHashCode(objArr);
    }

    public C49362gP(String str, String str2, int i, boolean z) {
        this.A00 = i;
        this.A03 = z;
        this.A02 = str;
        this.A01 = str2;
    }
}
