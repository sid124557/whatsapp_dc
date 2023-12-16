package X;

import java.io.Closeable;
import java.util.Arrays;

/* renamed from: X.0hz  reason: invalid class name and case insensitive filesystem */
public abstract class C10470hz implements Closeable {
    public static final String[] A04 = new String[128];
    public int A00;
    public int[] A01 = new int[32];
    public int[] A02 = new int[32];
    public String[] A03 = new String[32];

    public abstract double A08();

    public abstract int A09();

    public abstract int A0A(AnonymousClass0T2 r1);

    public abstract AnonymousClass0G4 A0C();

    public abstract String A0E();

    public abstract String A0F();

    public abstract void A0G();

    public abstract void A0H();

    public abstract void A0I();

    public abstract void A0J();

    public abstract void A0K();

    public abstract void A0L();

    public abstract boolean A0N();

    public abstract boolean A0O();

    static {
        String[] strArr;
        int i = 0;
        do {
            strArr = A04;
            Object[] A0L = AnonymousClass002.A0L();
            AnonymousClass000.A1P(A0L, i, 0);
            strArr[i] = String.format("\\u%04x", A0L);
            i++;
        } while (i <= 31);
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
    }

    public static C10470hz A04(C188558z5 r1) {
        return new C01700Bw(r1);
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A06(java.lang.String r6, X.C172278Kj r7) {
        /*
            java.lang.String[] r5 = A04
            r7.A09()
            int r4 = r6.length()
            r3 = 0
            r2 = 0
        L_0x000b:
            if (r3 >= r4) goto L_0x0034
            char r1 = r6.charAt(r3)
            r0 = 128(0x80, float:1.794E-43)
            if (r1 >= r0) goto L_0x001c
            r0 = r5[r1]
            if (r0 != 0) goto L_0x0022
        L_0x0019:
            int r3 = r3 + 1
            goto L_0x000b
        L_0x001c:
            r0 = 8232(0x2028, float:1.1535E-41)
            if (r1 != r0) goto L_0x002d
            java.lang.String r0 = "\\u2028"
        L_0x0022:
            if (r2 >= r3) goto L_0x0027
            r7.A0E(r6, r2, r3)
        L_0x0027:
            r7.A0C(r0)
            int r2 = r3 + 1
            goto L_0x0019
        L_0x002d:
            r0 = 8233(0x2029, float:1.1537E-41)
            if (r1 != r0) goto L_0x0019
            java.lang.String r0 = "\\u2029"
            goto L_0x0022
        L_0x0034:
            if (r2 >= r4) goto L_0x0039
            r7.A0E(r6, r2, r4)
        L_0x0039:
            r7.A09()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C10470hz.A06(java.lang.String, X.8Kj):void");
    }

    public final String A0D() {
        int i = this.A00;
        int[] iArr = this.A02;
        String[] strArr = this.A03;
        int[] iArr2 = this.A01;
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append('$');
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = iArr[i2];
            if (i3 == 1 || i3 == 2) {
                A0o.append('[');
                A0o.append(iArr2[i2]);
                A0o.append(']');
            } else if (i3 == 3 || i3 == 4 || i3 == 5) {
                A0o.append('.');
                String str = strArr[i2];
                if (str != null) {
                    A0o.append(str);
                }
            }
        }
        return A0o.toString();
    }

    public final void A0M(int i) {
        int i2 = this.A00;
        int[] iArr = this.A02;
        int length = iArr.length;
        if (i2 == length) {
            if (i2 != 256) {
                this.A02 = Arrays.copyOf(iArr, length * 2);
                String[] strArr = this.A03;
                this.A03 = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
                int[] iArr2 = this.A01;
                this.A01 = Arrays.copyOf(iArr2, iArr2.length * 2);
            } else {
                throw C01700Bw.A01(this, "Nesting too deep at ", AnonymousClass001.A0o());
            }
        }
        int[] iArr3 = this.A02;
        int i3 = this.A00;
        this.A00 = i3 + 1;
        iArr3[i3] = i;
    }

    public static float A03(C10470hz r2) {
        return (float) r2.A08();
    }

    public static void A05(C10470hz r0, String str, StringBuilder sb) {
        sb.append(str);
        sb.append(r0.A0C());
    }

    public final AnonymousClass0FC A0B(String str) {
        StringBuilder A0l = AnonymousClass000.A0l(str);
        A0l.append(" at path ");
        throw new AnonymousClass0FC(AnonymousClass000.A0X(A0D(), A0l));
    }
}
