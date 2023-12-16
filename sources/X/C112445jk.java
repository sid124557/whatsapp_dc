package X;

import java.util.Arrays;
import java.util.List;

/* renamed from: X.5jk  reason: invalid class name and case insensitive filesystem */
public class C112445jk implements C185658u2 {
    public final int A00;
    public final C117005rE A01;
    public final AnonymousClass5R4 A02;
    public final AnonymousClass3ZH A03;
    public final String A04;
    public final List A05;

    public int hashCode() {
        Object[] objArr = new Object[7];
        AnonymousClass000.A1L(objArr, 3);
        objArr[1] = this.A01;
        objArr[2] = this.A03;
        objArr[3] = this.A02;
        objArr[4] = this.A04;
        objArr[5] = this.A05;
        C18290x4.A1U(objArr, this.A00);
        return Arrays.hashCode(objArr);
    }

    public C117005rE B58() {
        return this.A01;
    }

    public int B8k() {
        return 3;
    }

    public C95814uZ B8o() {
        return null;
    }

    public int BCW() {
        return this.A00;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C112445jk)) {
            return false;
        }
        C112445jk r4 = (C112445jk) obj;
        if (!AnonymousClass75J.A00(this.A01, r4.A01) || !AnonymousClass75J.A00(this.A03, r4.A03) || !AnonymousClass75J.A00(this.A02, r4.A02) || !AnonymousClass75J.A00(this.A04, r4.A04) || !AnonymousClass75J.A00(this.A05, r4.A05) || this.A00 != r4.A00) {
            return false;
        }
        return true;
    }

    public C112445jk(C117005rE r1, AnonymousClass5R4 r2, AnonymousClass3ZH r3, String str, List list, int i) {
        this.A01 = r1;
        this.A03 = r3;
        this.A02 = r2;
        this.A04 = str;
        this.A05 = list;
        this.A00 = i;
    }
}
