package X;

/* renamed from: X.7Y4  reason: invalid class name */
public final class AnonymousClass7Y4 {
    public int A00;
    public final String A01;

    public final void A02() {
        int i = this.A00;
        int i2 = i + 1;
        int length = this.A01.length();
        if (i2 <= length) {
            this.A00 = i2;
            return;
        }
        StringBuilder A0o = AnonymousClass001.A0o();
        AnonymousClass6C8.A1D("remaining data length is ", A0o, length, i);
        throw new IndexOutOfBoundsException(AnonymousClass000.A0Y(", which is shorter than requested ", A0o, 1));
    }

    public final char A00() {
        while (!AnonymousClass000.A1T(this.A01.length() - this.A00)) {
            if (A01(0) != ' ') {
                return A01(0);
            }
            A02();
        }
        return 0;
    }

    public final char A01(int i) {
        int i2 = this.A00;
        int i3 = i2 + i;
        String str = this.A01;
        int length = str.length();
        if (i3 < length) {
            return str.charAt(i3);
        }
        StringBuilder A0o = AnonymousClass001.A0o();
        AnonymousClass6C8.A1D("remaining data length is ", A0o, length, i2);
        throw new IndexOutOfBoundsException(AnonymousClass000.A0Y(", which is shorter than requested ", A0o, i));
    }

    public AnonymousClass7Y4(String str) {
        this.A01 = str;
    }
}
