package X;

import android.content.Context;
import android.widget.TextView;
import com.whatsapp.R;
import java.text.DateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Locale;

/* renamed from: X.5bW  reason: invalid class name and case insensitive filesystem */
public class C107565bW {
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x002c, code lost:
        r6 = new java.lang.Object[1];
        r4 = new java.lang.Object[1];
        r6[X.C18300x5.A1Y(r4, r9)] = java.lang.String.format(X.C620733j.A02(r8), "%d", r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0046, code lost:
        return r8.A0K(r6, r7, (long) r9);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String A05(X.C620733j r8, int r9, int r10) {
        /*
            r0 = 7
            if (r10 != r0) goto L_0x000e
            r0 = -1
            if (r9 != r0) goto L_0x0011
            r0 = 2131890891(0x7f1212cb, float:1.9416487E38)
            java.lang.String r0 = r8.A0B(r0)
            return r0
        L_0x000e:
            switch(r10) {
                case 0: goto L_0x0018;
                case 1: goto L_0x001b;
                case 2: goto L_0x001e;
                case 3: goto L_0x0021;
                case 4: goto L_0x0024;
                case 5: goto L_0x0027;
                case 6: goto L_0x002a;
                default: goto L_0x0011;
            }
        L_0x0011:
            java.lang.String r0 = "Invalid duration unit"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass001.A0c(r0)
            throw r0
        L_0x0018:
            r7 = 290(0x122, float:4.06E-43)
            goto L_0x002c
        L_0x001b:
            r7 = 284(0x11c, float:3.98E-43)
            goto L_0x002c
        L_0x001e:
            r7 = 279(0x117, float:3.91E-43)
            goto L_0x002c
        L_0x0021:
            r7 = 275(0x113, float:3.85E-43)
            goto L_0x002c
        L_0x0024:
            r7 = 294(0x126, float:4.12E-43)
            goto L_0x002c
        L_0x0027:
            r7 = 287(0x11f, float:4.02E-43)
            goto L_0x002c
        L_0x002a:
            r7 = 296(0x128, float:4.15E-43)
        L_0x002c:
            long r1 = (long) r9
            r0 = 1
            java.lang.Object[] r6 = new java.lang.Object[r0]
            java.util.Locale r5 = X.C620733j.A02(r8)
            java.lang.Object[] r4 = new java.lang.Object[r0]
            boolean r3 = X.C18300x5.A1Y(r4, r9)
            java.lang.String r0 = "%d"
            java.lang.String r0 = java.lang.String.format(r5, r0, r4)
            r6[r3] = r0
            java.lang.String r0 = r8.A0K(r6, r7, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C107565bW.A05(X.33j, int, int):java.lang.String");
    }

    public static String A0C(C620733j r13, long j) {
        String A0D;
        int i;
        int i2;
        C626936e.A0C(AnonymousClass001.A1U((j > 0 ? 1 : (j == 0 ? 0 : -1))));
        long j2 = j / 3600000;
        long j3 = j - (3600000 * j2);
        long j4 = j3 / 60000;
        if (j3 - (60000 * j4) > 0) {
            j4++;
        }
        if (j4 == 60) {
            j2++;
            j4 = 0;
        }
        if (j2 == 0) {
            i2 = (int) j4;
            A0D = A05(r13, i2, 1);
            i = R.plurals.f9nameremoved;
        } else {
            A0D = r13.A0D(239, A06(r13, (int) j2, 2), A06(r13, (int) j4, 1));
            i = R.plurals.f9nameremoved;
            i2 = (int) (j2 + j4);
        }
        long j5 = (long) i2;
        return r13.A0L(new Object[]{A0D}, i, j5);
    }

    public static String A0E(C620733j r3, long j) {
        int A00 = C107175ap.A00(System.currentTimeMillis(), j);
        if (A00 == 0) {
            return C107505bQ.A07(C620733j.A02(r3), r3.A0A(272));
        }
        if (A00 == 1) {
            return C107505bQ.A00(r3);
        }
        if (A00 >= 7) {
            return C107505bQ.A05(r3, j);
        }
        Calendar instance = Calendar.getInstance(C620733j.A02(r3));
        instance.setTimeInMillis(j);
        return C107505bQ.A01(r3, instance.get(7));
    }

    public static String A04(Context context, C620733j r5, long j, long j2) {
        if (((int) Math.floor(((double) (j - j2)) / 3600000.0d)) < 12) {
            return AnonymousClass002.A0F(context, C107145am.A00(r5, j), new Object[1], 0, R.string.f11nameremoved);
        }
        return AnonymousClass0x2.A0Y(context.getResources(), C107175ap.A00(j, j2), 0, R.plurals.f9nameremoved);
    }

    public static String A06(C620733j r8, int i, int i2) {
        int i3;
        if (i2 != 0) {
            i3 = 286;
            if (i2 != 1) {
                i3 = 281;
            }
        } else {
            i3 = 292;
        }
        Object[] objArr = new Object[1];
        Object[] objArr2 = new Object[1];
        objArr[C18300x5.A1Y(objArr2, i)] = String.format(C620733j.A02(r8), "%d", objArr2);
        return r8.A0K(objArr, i3, (long) i);
    }

    public static String A09(C620733j r9, long j) {
        C626936e.A0C(AnonymousClass001.A1U((j > 0 ? 1 : (j == 0 ? 0 : -1))));
        int i = (int) (j / 3600000);
        long j2 = j % 3600000;
        int i2 = (int) (j2 / 60000);
        int A0B = (int) C18290x4.A0B(j2 % 60000);
        if (i > 0) {
            return r9.A0D(244, A06(r9, i, 2), A06(r9, i2, 1));
        } else if (i2 > 0) {
            return A06(r9, i2, 1);
        } else {
            return A06(r9, A0B, 0);
        }
    }

    public static String A0A(C620733j r18, long j) {
        long j2;
        long j3;
        String str;
        Object[] objArr;
        Long valueOf;
        if (j >= 3600) {
            j2 = j / 3600;
            j -= 3600 * j2;
        } else {
            j2 = 0;
        }
        if (j >= 60) {
            j3 = j / 60;
            j -= 60 * j3;
        } else {
            j3 = 0;
        }
        int i = 222;
        if (j2 > 0) {
            i = 221;
        }
        C620733j r1 = r18;
        String A0A = r1.A0A(i);
        int length = A0A.length();
        StringBuilder sb = new StringBuilder(length);
        Locale A02 = C620733j.A02(r1);
        int i2 = 0;
        while (i2 < length) {
            char charAt = A0A.charAt(i2);
            if (charAt == 'h' || charAt == 'm' || charAt == 's') {
                int i3 = i2 + 1;
                if (i3 >= length || A0A.charAt(i3) != charAt) {
                    str = "%d";
                    i3 = i2;
                } else {
                    str = "%02d";
                }
                if (charAt == 'h') {
                    objArr = new Object[1];
                    valueOf = Long.valueOf(j2);
                } else if (charAt != 'm') {
                    if (charAt == 's') {
                        objArr = new Object[1];
                        valueOf = Long.valueOf(j);
                    }
                    i2 = i3;
                } else {
                    objArr = new Object[1];
                    valueOf = Long.valueOf(j3);
                }
                objArr[0] = valueOf;
                sb.append(String.format(A02, str, objArr));
                i2 = i3;
            } else {
                sb.append(charAt);
            }
            i2++;
        }
        return sb.toString();
    }

    public static String A0B(C620733j r8, long j) {
        C626936e.A0C(AnonymousClass001.A1U((j > 0 ? 1 : (j == 0 ? 0 : -1))));
        int i = (int) (j / 3600000);
        long j2 = j % 3600000;
        int i2 = (int) (j2 / 60000);
        String A05 = A05(r8, (int) C18290x4.A0B(j2 % 60000), 0);
        if (i > 0) {
            return r8.A0D(238, r8.A0D(243, A05(r8, i, 2), A05(r8, i2, 1)), A05);
        } else if (i2 <= 0) {
            return A05;
        } else {
            return r8.A0D(244, A05(r8, i2, 1), A05);
        }
    }

    public static String A0G(C620733j r2, C30471mV r3) {
        return A0A(r2, (long) r3.A0B);
    }

    public static CharSequence A00(C56612sH r1, C620733j r2, long j) {
        return A03(r2, r1.A0I(j));
    }

    public static CharSequence A01(C56612sH r2, C620733j r3, long j) {
        Locale A02;
        int i;
        if (C107175ap.A00(r2.A0D(), j) == 1) {
            return C107505bQ.A00(r3);
        }
        if (C107175ap.A00(r2.A0D(), j) == 0) {
            A02 = C620733j.A02(r3);
            i = 272;
        } else if (C107175ap.A00(r2.A0D(), j) != -1) {
            return C86614Ku.A0v(r3, 172, j);
        } else {
            A02 = C620733j.A02(r3);
            i = 273;
        }
        return C107505bQ.A07(A02, r3.A0A(i));
    }

    public static CharSequence A02(C620733j r5, long j) {
        int i;
        String A06;
        long currentTimeMillis = System.currentTimeMillis();
        int A00 = C107175ap.A00(currentTimeMillis, j);
        if (A00 == 0) {
            i = R.string.f11nameremoved;
        } else if (A00 == 1) {
            i = R.string.f11nameremoved;
        } else {
            if (C107175ap.A06(currentTimeMillis, j)) {
                A06 = C86624Kv.A0c(C107505bQ.A08(r5), j);
            } else {
                A06 = C107505bQ.A06(r5, j);
            }
            return r5.A0E(R.string.f11nameremoved, C107175ap.A04(r5, A06, C107145am.A00(r5, j)));
        }
        return C107145am.A01(r5, r5.A0E(i, C107145am.A00(r5, j)), j);
    }

    public static CharSequence A03(C620733j r8, long j) {
        String str;
        long currentTimeMillis = System.currentTimeMillis();
        int A00 = C107175ap.A00(currentTimeMillis, j);
        if (A00 == 0) {
            int i = (int) ((currentTimeMillis - j) / 60000);
            if (i < 1) {
                return r8.A0B(R.string.f11nameremoved);
            }
            if (i < 60) {
                long j2 = (long) i;
                Object[] objArr = new Object[1];
                Object[] objArr2 = new Object[1];
                objArr[C18300x5.A1Y(objArr2, i)] = String.format(C620733j.A02(r8), "%d", objArr2);
                return r8.A0K(objArr, 270, j2);
            }
            str = C107505bQ.A07(C620733j.A02(r8), r8.A0A(272));
        } else if (A00 == 1) {
            str = C107505bQ.A00(r8);
        } else if (C107175ap.A06(currentTimeMillis, j)) {
            str = C86624Kv.A0c(C107505bQ.A08(r8), j);
        } else {
            str = C107505bQ.A06(r8, j);
        }
        return C107175ap.A04(r8, str, C107145am.A00(r8, j));
    }

    public static String A07(C620733j r6, int i, long j) {
        int i2;
        Object[] objArr;
        String A02;
        String str;
        String A07 = r6.A07();
        if ("en".equals(A07) || "de".equals(A07) || "es".equals(A07)) {
            if (i <= 30) {
                i2 = R.string.f11nameremoved;
                objArr = new Object[1];
                A02 = C107505bQ.A02(r6, j);
            } else {
                if (C107505bQ.A01 == null) {
                    C107505bQ.A01 = DateFormat.getDateInstance(2, C620733j.A02(r6));
                }
                return r6.A0E(R.string.f11nameremoved, C86624Kv.A0c((DateFormat) C107505bQ.A01.clone(), j));
            }
        } else if (i <= 30) {
            i2 = R.string.f11nameremoved;
            objArr = new Object[1];
            A02 = C107505bQ.A06(r6, j);
        } else {
            i2 = R.string.f11nameremoved;
            objArr = new Object[1];
            str = C107505bQ.A06(r6, j);
            objArr[0] = str;
            return r6.A0E(i2, objArr);
        }
        str = C107175ap.A04(r6, A02, C107145am.A00(r6, j));
        objArr[0] = str;
        return r6.A0E(i2, objArr);
    }

    public static String A08(C620733j r2, long j) {
        if (C107175ap.A00(System.currentTimeMillis(), j) == 0) {
            return C107145am.A00(r2, j);
        }
        return A03(r2, j).toString();
    }

    public static String A0D(C620733j r11, long j) {
        long j2 = j / 3600000;
        long j3 = (j - (3600000 * j2)) / 60000;
        if (j2 == 0) {
            if (j3 == 0) {
                return A05(r11, (int) C18290x4.A0B(j), 0);
            }
            return A05(r11, (int) j3, 1);
        } else if (j3 == 0) {
            return A05(r11, (int) j2, 2);
        } else {
            return r11.A0D(244, A05(r11, (int) j2, 2), A05(r11, (int) j3, 1));
        }
    }

    public static String A0F(C620733j r2, long j, boolean z) {
        int A00 = C107175ap.A00(System.currentTimeMillis(), j);
        if (A00 == 0) {
            return C107145am.A00(r2, j);
        }
        if (A00 == 1) {
            return C107505bQ.A00(r2);
        }
        if (z) {
            return C86624Kv.A0c(C107505bQ.A09(r2, 0), j);
        }
        return C107505bQ.A06(r2, j);
    }

    public static String A0H(C620733j r5, Object[] objArr, int i, int i2, int i3, long j, boolean z) {
        Object[] copyOf;
        String A06;
        int A00 = C107175ap.A00(System.currentTimeMillis(), j);
        int length = objArr.length;
        if (length == 0) {
            copyOf = new String[1];
        } else {
            copyOf = Arrays.copyOf(objArr, length + 1);
        }
        if (A00 == 0 || A00 == 1) {
            C620733j.A03(r5, C107145am.A00(r5, j), copyOf, length);
            if (A00 != 0) {
                i = i2;
            }
            return C107145am.A01(r5, r5.A0E(i, copyOf), j);
        }
        if (A00 > 30 || !z) {
            A06 = C107505bQ.A06(r5, j);
        } else {
            A06 = C107175ap.A04(r5, C107505bQ.A06(r5, j), C107145am.A00(r5, j));
        }
        C620733j.A03(r5, A06, copyOf, length);
        return r5.A0E(i3, copyOf);
    }

    public static void A0I(TextView textView, C620733j r2, long j) {
        textView.setText(A0A(r2, j));
    }
}
