package X;

import java.util.Arrays;

/* renamed from: X.2y4  reason: invalid class name and case insensitive filesystem */
public class C60142y4 {
    public int A00;
    public long A01 = -1;
    public String A02;
    public final String A03;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C60142y4)) {
            return false;
        }
        C60142y4 r7 = (C60142y4) obj;
        return this.A01 == r7.A01 && this.A00 == r7.A00 && AnonymousClass75J.A00(this.A02, r7.A02) && AnonymousClass75J.A00(this.A03, r7.A03);
    }

    public int hashCode() {
        Object[] objArr = new Object[4];
        objArr[0] = this.A03;
        AnonymousClass000.A1M(objArr, this.A00);
        objArr[2] = this.A02;
        AnonymousClass0x2.A1V(objArr, this.A01);
        return Arrays.hashCode(objArr);
    }

    public C60142y4(String str) {
        this.A03 = str;
        try {
            this.A02 = C18270x1.A0V(AnonymousClass0x7.A0t(), str.getBytes(C58152un.A0D));
        } catch (Exception e) {
            throw C18330xA.A09(e);
        }
    }

    public C60142y4(String str, String str2) {
        this.A03 = str;
        this.A02 = str2;
    }
}
