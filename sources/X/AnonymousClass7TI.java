package X;

import java.util.Locale;

/* renamed from: X.7TI  reason: invalid class name */
public final class AnonymousClass7TI {
    public final int A00;
    public final int[] A01;
    public final String[] A02;
    public final String[] A03;

    public AnonymousClass7TI(int[] iArr, String[] strArr, String[] strArr2, int i) {
        this.A03 = strArr;
        this.A01 = iArr;
        this.A02 = strArr2;
        this.A00 = i;
    }

    public String A00(String str, int i, long j, long j2) {
        Locale locale;
        String str2;
        Object[] objArr;
        Object valueOf;
        StringBuilder A0o = AnonymousClass001.A0o();
        int i2 = 0;
        while (true) {
            int i3 = this.A00;
            String[] strArr = this.A03;
            if (i2 >= i3) {
                return AnonymousClass000.A0X(strArr[i3], A0o);
            }
            A0o.append(strArr[i2]);
            int i4 = this.A01[i2];
            if (i4 == 1) {
                A0o.append(str);
            } else {
                if (i4 == 2) {
                    locale = Locale.US;
                    str2 = this.A02[i2];
                    objArr = new Object[1];
                    valueOf = Long.valueOf(j);
                } else if (i4 == 3) {
                    locale = Locale.US;
                    str2 = this.A02[i2];
                    objArr = new Object[1];
                    valueOf = Integer.valueOf(i);
                } else if (i4 == 4) {
                    locale = Locale.US;
                    str2 = this.A02[i2];
                    objArr = new Object[1];
                    valueOf = Long.valueOf(j2);
                }
                objArr[0] = valueOf;
                A0o.append(String.format(locale, str2, objArr));
            }
            i2++;
        }
    }
}
