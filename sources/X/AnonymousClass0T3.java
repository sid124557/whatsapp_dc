package X;

/* renamed from: X.0T3  reason: invalid class name */
public class AnonymousClass0T3 {
    public int A00;
    public long A01;

    public static AnonymousClass0T3 A00(String str, int i, int i2) {
        if (i < i2) {
            long j = 0;
            int i3 = i;
            while (true) {
                if (i3 < i2) {
                    char charAt = str.charAt(i3);
                    if (charAt < '0' || charAt > '9') {
                        break;
                    }
                    j = (j * 10) + ((long) (charAt - '0'));
                    if (j > 2147483647L) {
                        break;
                    }
                    i3++;
                } else {
                    break;
                }
            }
            if (i3 != i) {
                return new AnonymousClass0T3(j, i3);
            }
        }
        return null;
    }

    public AnonymousClass0T3(long j, int i) {
        this.A01 = j;
        this.A00 = i;
    }
}
