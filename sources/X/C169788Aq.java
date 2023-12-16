package X;

/* renamed from: X.8Aq  reason: invalid class name and case insensitive filesystem */
public final class C169788Aq implements C178618hp {
    public final int A00;
    public final C187848xu A01;
    public final String A02;
    public final Object[] A03;

    public C169788Aq(C187848xu r6, String str, Object[] objArr) {
        char charAt;
        this.A01 = r6;
        this.A02 = str;
        this.A03 = objArr;
        char A002 = AnonymousClass6C9.A00(str);
        if (A002 >= 55296) {
            int i = A002 & 8191;
            int i2 = 13;
            int i3 = 1;
            while (true) {
                int i4 = i3 + 1;
                charAt = str.charAt(i3);
                if (charAt < 55296) {
                    break;
                }
                i = AnonymousClass6C9.A09(charAt, i2, i);
                i2 += 13;
                i3 = i4;
            }
            A002 = i | (charAt << i2);
        }
        this.A00 = A002;
    }
}
