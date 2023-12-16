package X;

/* renamed from: X.7S9  reason: invalid class name */
public final class AnonymousClass7S9 {
    public int A00 = 0;
    public final String A01;

    public final int A00() {
        String str = this.A01;
        int i = this.A00;
        this.A00 = i + 1;
        char charAt = str.charAt(i);
        if (charAt < 55296) {
            return charAt;
        }
        int i2 = charAt & 8191;
        int i3 = 13;
        while (true) {
            int i4 = this.A00;
            this.A00 = i4 + 1;
            char charAt2 = str.charAt(i4);
            if (charAt2 < 55296) {
                return i2 | (charAt2 << i3);
            }
            i2 = AnonymousClass6C9.A09(charAt2, i3, i2);
            i3 += 13;
        }
    }

    public AnonymousClass7S9(String str) {
        this.A01 = str;
    }
}
