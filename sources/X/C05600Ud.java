package X;

import java.util.Locale;

/* renamed from: X.0Ud  reason: invalid class name and case insensitive filesystem */
public class C05600Ud {
    public int A00;
    public int A01 = 0;
    public AnonymousClass0TY A02 = new AnonymousClass0TY();
    public String A03;

    public static boolean A01(int i) {
        if (i == 32 || i == 10 || i == 13 || i == 9) {
            return true;
        }
        return false;
    }

    public float A02() {
        AnonymousClass0TY r3 = this.A02;
        float A002 = r3.A00(this.A03, this.A01, this.A00);
        if (!Float.isNaN(A002)) {
            this.A01 = r3.A00;
        }
        return A002;
    }

    public int A05() {
        int i = this.A01;
        int i2 = this.A00;
        if (i == i2) {
            return -1;
        }
        int i3 = i + 1;
        this.A01 = i3;
        if (i3 < i2) {
            return this.A03.charAt(i3);
        }
        return -1;
    }

    public AnonymousClass0G3 A07() {
        if (!AnonymousClass000.A1U(this.A01, this.A00)) {
            String str = this.A03;
            char charAt = str.charAt(this.A01);
            int i = this.A01;
            if (charAt == '%') {
                this.A01 = i + 1;
                return AnonymousClass0G3.percent;
            } else if (i <= this.A00 - 2) {
                try {
                    AnonymousClass0G3 valueOf = AnonymousClass0G3.valueOf(str.substring(i, i + 2).toLowerCase(Locale.US));
                    this.A01 += 2;
                    return valueOf;
                } catch (IllegalArgumentException unused) {
                    return null;
                }
            }
        }
        return null;
    }

    public Boolean A08(Object obj) {
        if (obj == null) {
            return null;
        }
        A0D();
        int i = this.A01;
        if (i == this.A00) {
            return null;
        }
        char charAt = this.A03.charAt(i);
        if (charAt != '0' && charAt != '1') {
            return null;
        }
        boolean z = true;
        this.A01++;
        if (charAt != '1') {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public Integer A09() {
        int i = this.A01;
        if (i == this.A00) {
            return null;
        }
        String str = this.A03;
        this.A01 = i + 1;
        return Integer.valueOf(str.charAt(i));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000b, code lost:
        r4 = r6.A01;
        r3 = r6.A03;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String A0A() {
        /*
            r6 = this;
            int r1 = r6.A01
            int r0 = r6.A00
            boolean r0 = X.AnonymousClass000.A1U(r1, r0)
            r5 = 0
            if (r0 != 0) goto L_0x001b
            int r4 = r6.A01
            java.lang.String r3 = r6.A03
            char r2 = r3.charAt(r4)
            r0 = 39
            if (r2 == r0) goto L_0x001c
            r0 = 34
            if (r2 == r0) goto L_0x001c
        L_0x001b:
            return r5
        L_0x001c:
            int r1 = r6.A05()
            r0 = -1
            if (r1 == r0) goto L_0x0034
            if (r1 != r2) goto L_0x001c
            int r0 = r6.A01
            int r0 = r0 + 1
            r6.A01 = r0
            int r1 = r4 + 1
            int r0 = r0 + -1
            java.lang.String r0 = r3.substring(r1, r0)
            return r0
        L_0x0034:
            r6.A01 = r4
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C05600Ud.A0A():java.lang.String");
    }

    public String A0B(char c, boolean z) {
        if (!AnonymousClass000.A1U(this.A01, this.A00)) {
            String str = this.A03;
            char charAt = str.charAt(this.A01);
            if ((z || !A01(charAt)) && charAt != c) {
                int i = this.A01;
                while (true) {
                    int A05 = A05();
                    if (A05 == -1 || A05 == c || (!z && A01(A05))) {
                    }
                }
                return str.substring(i, this.A01);
            }
        }
        return null;
    }

    public void A0C() {
        while (true) {
            int i = this.A01;
            if (i < this.A00 && A01(this.A03.charAt(i))) {
                this.A01++;
            } else {
                return;
            }
        }
    }

    public boolean A0E(char c) {
        int i = this.A01;
        if (i >= this.A00 || this.A03.charAt(i) != c) {
            return false;
        }
        this.A01++;
        return true;
    }

    public C05600Ud(String str) {
        String trim = str.trim();
        this.A03 = trim;
        this.A00 = trim.length();
    }

    public float A03() {
        A0D();
        AnonymousClass0TY r3 = this.A02;
        float A002 = r3.A00(this.A03, this.A01, this.A00);
        if (!Float.isNaN(A002)) {
            this.A01 = r3.A00;
        }
        return A002;
    }

    public float A04(float f) {
        if (Float.isNaN(f)) {
            return Float.NaN;
        }
        A0D();
        return A02();
    }

    public C10540i6 A06() {
        float A022 = A02();
        if (Float.isNaN(A022)) {
            return null;
        }
        AnonymousClass0G3 A07 = A07();
        if (A07 == null) {
            A07 = AnonymousClass0G3.px;
        }
        return new C10540i6(A07, A022);
    }

    public boolean A0D() {
        A0C();
        int i = this.A01;
        if (i == this.A00 || this.A03.charAt(i) != ',') {
            return false;
        }
        this.A01++;
        A0C();
        return true;
    }

    public boolean A0F(String str) {
        int length = str.length();
        int i = this.A01;
        if (i > this.A00 - length || !this.A03.substring(i, i + length).equals(str)) {
            return false;
        }
        this.A01 += length;
        return true;
    }
}
