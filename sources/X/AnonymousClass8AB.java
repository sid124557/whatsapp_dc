package X;

/* renamed from: X.8AB  reason: invalid class name */
public final class AnonymousClass8AB implements C178488hc {
    public final int A00;
    public final C187798xp A01;
    public final Object[] A02;

    public AnonymousClass8AB(C187798xp r7, Object[] objArr) {
        char charAt;
        this.A01 = r7;
        this.A02 = objArr;
        char A002 = AnonymousClass6C9.A00("\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a");
        if (A002 >= 55296) {
            int i = A002 & 8191;
            int i2 = 13;
            int i3 = 1;
            while (true) {
                int i4 = i3 + 1;
                charAt = "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a".charAt(i3);
                if (charAt < 55296) {
                    break;
                }
                i = AnonymousClass6C9.A09(charAt, i2, i);
                i2 += 13;
                i3 = i4;
            }
            A002 = (charAt << i2) | i;
        }
        this.A00 = A002;
    }
}
