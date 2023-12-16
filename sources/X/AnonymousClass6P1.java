package X;

import com.facebook.msys.mci.DefaultCrypto;
import java.util.Locale;

/* renamed from: X.6P1  reason: invalid class name */
public final class AnonymousClass6P1 extends C1689287h {
    public static final C180708lV A01 = new C1689487j();
    public final C180708lV A00;

    public static int A00(byte[] bArr, int i, int i2) {
        int length;
        while (true) {
            length = bArr.length;
            if (i < length) {
                if (bArr[i] == 0) {
                    break;
                }
                i++;
            } else {
                i = length;
                break;
            }
        }
        if (i2 == 0 || i2 == 3) {
            return i;
        }
        while (i < length - 1) {
            if (i % 2 != 0 || bArr[i + 1] != 0) {
                while (true) {
                    i++;
                    if (i < length) {
                        if (bArr[i] == 0) {
                            break;
                        }
                    } else {
                        i = length;
                        break;
                    }
                }
            } else {
                return i;
            }
        }
        return length;
    }

    public static String A02(int i) {
        if (i == 1) {
            return "UTF-16";
        }
        if (i == 2) {
            return "UTF-16BE";
        }
        if (i != 3) {
            return "ISO-8859-1";
        }
        return DefaultCrypto.UTF_8;
    }

    public static String A03(int i, int i2, int i3, int i4, int i5) {
        Object[] objArr;
        String str;
        Locale locale = Locale.US;
        if (i == 2) {
            objArr = new Object[3];
            C86604Kt.A1X(objArr, i2, 0, i3, 1);
            AnonymousClass000.A1P(objArr, i4, 2);
            str = "%c%c%c";
        } else {
            objArr = new Object[4];
            C86604Kt.A1X(objArr, i2, 0, i3, 1);
            C86604Kt.A1X(objArr, i4, 2, i5, 3);
            str = "%c%c%c%c";
        }
        return String.format(locale, str, objArr);
    }

    /* JADX WARNING: type inference failed for: r0v4, types: [X.87X] */
    /* JADX WARNING: type inference failed for: r0v126 */
    /* JADX WARNING: type inference failed for: r0v127 */
    /* JADX WARNING: type inference failed for: r0v128 */
    /* JADX WARNING: type inference failed for: r0v129 */
    /* JADX WARNING: type inference failed for: r18v2, types: [X.6P3] */
    /* JADX WARNING: type inference failed for: r8v23, types: [X.6PC] */
    /* JADX WARNING: type inference failed for: r9v25, types: [X.6PB] */
    /* JADX WARNING: type inference failed for: r0v130 */
    /* JADX WARNING: type inference failed for: r0v131 */
    /* JADX WARNING: type inference failed for: r0v132 */
    /* JADX WARNING: type inference failed for: r0v133 */
    /* JADX WARNING: type inference failed for: r0v134 */
    /* JADX WARNING: type inference failed for: r0v135 */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x01e8, code lost:
        if (r11 == 3) goto L_0x01ea;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x0218, code lost:
        if (r8 == 67) goto L_0x021a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:149:0x0286, code lost:
        if (r10 == 3) goto L_0x0288;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:168:0x02d3, code lost:
        if (r10 == 3) goto L_0x02d5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x010a, code lost:
        if (r9 == 3) goto L_0x010c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x014b, code lost:
        if (r9 == 3) goto L_0x014d;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:159:0x02a1 A[Catch:{ UnsupportedEncodingException -> 0x04be, all -> 0x04c4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:172:0x02e9 A[Catch:{ UnsupportedEncodingException -> 0x04be, all -> 0x04c4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:185:0x034d A[ADDED_TO_REGION, Catch:{ UnsupportedEncodingException -> 0x04be, all -> 0x04c4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:213:0x03c7 A[Catch:{ UnsupportedEncodingException -> 0x04be, all -> 0x04c4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:222:0x03f9 A[Catch:{ UnsupportedEncodingException -> 0x04be, all -> 0x04c4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:233:0x0423 A[Catch:{ UnsupportedEncodingException -> 0x04be, all -> 0x04c4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:247:0x0483 A[Catch:{ UnsupportedEncodingException -> 0x04be, all -> 0x04c4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:249:0x049b A[Catch:{ UnsupportedEncodingException -> 0x04be, all -> 0x04c4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:281:0x03ce A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00e4 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x011f A[Catch:{ UnsupportedEncodingException -> 0x04be, all -> 0x04c4 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.AnonymousClass87X A01(X.C180708lV r19, X.C161467pi r20, int r21, int r22, boolean r23) {
        /*
            r2 = r20
            int r12 = r2.A0C()
            int r11 = r2.A0C()
            int r10 = r2.A0C()
            r9 = 3
            r6 = r21
            r18 = r23
            if (r6 < r9) goto L_0x0060
            int r8 = r2.A0C()
            r0 = 4
            int r4 = r2.A0E()
            if (r6 != r0) goto L_0x0039
            if (r23 != 0) goto L_0x0039
            r1 = r4 & 255(0xff, float:3.57E-43)
            int r0 = r4 >> 8
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r0 = r0 << 7
            r1 = r1 | r0
            int r0 = r4 >> 16
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r0 = r0 << 14
            r1 = r1 | r0
            int r0 = r4 >> 24
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r4 = r0 << 21
            r4 = r4 | r1
        L_0x0039:
            int r5 = r2.A0F()
        L_0x003d:
            r17 = 0
            if (r12 != 0) goto L_0x0051
            if (r11 != 0) goto L_0x0051
            if (r10 != 0) goto L_0x0051
            if (r8 != 0) goto L_0x0051
            if (r4 != 0) goto L_0x0051
            if (r5 != 0) goto L_0x0051
        L_0x004b:
            int r0 = r2.A00
            r2.A0S(r0)
            return r17
        L_0x0051:
            int r1 = r2.A01
            int r1 = r1 + r4
            int r0 = r2.A00
            java.lang.String r3 = "Id3Decoder"
            if (r1 <= r0) goto L_0x0067
            java.lang.String r0 = "Frame size exceeds remaining tag data"
            android.util.Log.w(r3, r0)
            goto L_0x004b
        L_0x0060:
            r8 = 0
            int r4 = r2.A0D()
            r5 = 0
            goto L_0x003d
        L_0x0067:
            if (r19 != 0) goto L_0x04ce
            r7 = 1
            if (r6 != r9) goto L_0x00bb
            r0 = r5 & 128(0x80, float:1.794E-43)
            boolean r16 = X.AnonymousClass000.A1S(r0)
            r0 = r5 & 64
            boolean r15 = X.AnonymousClass000.A1S(r0)
            r0 = r5 & 32
            boolean r14 = X.AnonymousClass000.A1S(r0)
            r13 = r16
            r9 = 0
        L_0x0081:
            if (r13 != 0) goto L_0x04c9
            if (r15 != 0) goto L_0x04c9
            if (r14 == 0) goto L_0x008c
            int r4 = r4 + -1
            r2.A0T(r7)
        L_0x008c:
            if (r16 == 0) goto L_0x0094
            int r4 = r4 + -4
            r0 = 4
            r2.A0T(r0)
        L_0x0094:
            if (r9 == 0) goto L_0x00dd
            byte[] r14 = r2.A02
            int r13 = r2.A01
            r15 = r13
        L_0x009b:
            int r9 = r15 + 1
            int r0 = r13 + r4
            if (r9 >= r0) goto L_0x00dd
            byte r5 = r14[r15]
            r0 = 255(0xff, float:3.57E-43)
            r5 = r5 & r0
            if (r5 != r0) goto L_0x00b9
            byte r0 = r14[r9]
            if (r0 != 0) goto L_0x00b9
            int r0 = r15 - r13
            int r5 = r15 + 2
            int r0 = r4 - r0
            int r0 = r0 + -2
            java.lang.System.arraycopy(r14, r5, r14, r9, r0)
            int r4 = r4 + -1
        L_0x00b9:
            r15 = r9
            goto L_0x009b
        L_0x00bb:
            r0 = 4
            if (r6 != r0) goto L_0x00dd
            r0 = r5 & 64
            boolean r14 = X.AnonymousClass000.A1S(r0)
            r0 = r5 & 8
            boolean r13 = X.AnonymousClass000.A1S(r0)
            r0 = r5 & 4
            boolean r15 = X.AnonymousClass000.A1S(r0)
            r0 = r5 & 2
            boolean r9 = X.AnonymousClass000.A1S(r0)
            r0 = r5 & 1
            boolean r16 = X.AnonymousClass000.A1S(r0)
            goto L_0x0081
        L_0x00dd:
            r9 = 84
            r0 = 2
            r13 = 88
            if (r12 != r9) goto L_0x011f
            if (r11 != r13) goto L_0x047d
            if (r10 != r13) goto L_0x047d
            if (r6 == r0) goto L_0x00ec
            if (r8 != r13) goto L_0x047d
        L_0x00ec:
            if (r4 < r7) goto L_0x02e6
            int r9 = r2.A0C()     // Catch:{ UnsupportedEncodingException -> 0x04be }
            java.lang.String r8 = A02(r9)     // Catch:{ UnsupportedEncodingException -> 0x04be }
            int r4 = r4 - r7
            byte[] r7 = new byte[r4]     // Catch:{ UnsupportedEncodingException -> 0x04be }
            r0 = 0
            r2.A0V(r7, r0, r4)     // Catch:{ UnsupportedEncodingException -> 0x04be }
            int r5 = A00(r7, r0, r9)     // Catch:{ UnsupportedEncodingException -> 0x04be }
            java.lang.String r6 = new java.lang.String     // Catch:{ UnsupportedEncodingException -> 0x04be }
            r6.<init>(r7, r0, r5, r8)     // Catch:{ UnsupportedEncodingException -> 0x04be }
            if (r9 == 0) goto L_0x010c
            r4 = 3
            r0 = 2
            if (r9 != r4) goto L_0x010d
        L_0x010c:
            r0 = 1
        L_0x010d:
            int r5 = r5 + r0
            int r0 = A00(r7, r5, r9)     // Catch:{ UnsupportedEncodingException -> 0x04be }
            java.lang.String r5 = A04(r8, r7, r5, r0)     // Catch:{ UnsupportedEncodingException -> 0x04be }
            java.lang.String r4 = "TXXX"
            X.6P5 r0 = new X.6P5     // Catch:{ UnsupportedEncodingException -> 0x04be }
            r0.<init>(r4, r6, r5)     // Catch:{ UnsupportedEncodingException -> 0x04be }
            goto L_0x04ba
        L_0x011f:
            if (r12 == r9) goto L_0x047d
            r5 = 87
            if (r12 != r5) goto L_0x0169
            if (r11 != r13) goto L_0x0459
            if (r10 != r13) goto L_0x0459
            if (r6 == r0) goto L_0x012d
            if (r8 != r13) goto L_0x0459
        L_0x012d:
            if (r4 < r7) goto L_0x02e6
            int r9 = r2.A0C()     // Catch:{ UnsupportedEncodingException -> 0x04be }
            java.lang.String r5 = A02(r9)     // Catch:{ UnsupportedEncodingException -> 0x04be }
            int r4 = r4 - r7
            byte[] r8 = new byte[r4]     // Catch:{ UnsupportedEncodingException -> 0x04be }
            r0 = 0
            r2.A0V(r8, r0, r4)     // Catch:{ UnsupportedEncodingException -> 0x04be }
            int r7 = A00(r8, r0, r9)     // Catch:{ UnsupportedEncodingException -> 0x04be }
            java.lang.String r6 = new java.lang.String     // Catch:{ UnsupportedEncodingException -> 0x04be }
            r6.<init>(r8, r0, r7, r5)     // Catch:{ UnsupportedEncodingException -> 0x04be }
            if (r9 == 0) goto L_0x014d
            r5 = 3
            r0 = 2
            if (r9 != r5) goto L_0x014e
        L_0x014d:
            r0 = 1
        L_0x014e:
            int r7 = r7 + r0
            r5 = r7
        L_0x0150:
            if (r5 >= r4) goto L_0x0159
            byte r0 = r8[r5]     // Catch:{ UnsupportedEncodingException -> 0x04be }
            if (r0 == 0) goto L_0x015a
            int r5 = r5 + 1
            goto L_0x0150
        L_0x0159:
            r5 = r4
        L_0x015a:
            java.lang.String r0 = "ISO-8859-1"
            java.lang.String r5 = A04(r0, r8, r7, r5)     // Catch:{ UnsupportedEncodingException -> 0x04be }
            java.lang.String r4 = "WXXX"
            X.6P6 r0 = new X.6P6     // Catch:{ UnsupportedEncodingException -> 0x04be }
            r0.<init>(r4, r6, r5)     // Catch:{ UnsupportedEncodingException -> 0x04be }
            goto L_0x04ba
        L_0x0169:
            if (r12 == r5) goto L_0x0459
            r15 = 73
            r14 = 80
            if (r12 != r14) goto L_0x01a6
            r5 = 82
            if (r11 != r5) goto L_0x01a6
            if (r10 != r15) goto L_0x01a6
            r5 = 86
            if (r8 != r5) goto L_0x01a6
            byte[] r8 = new byte[r4]     // Catch:{ UnsupportedEncodingException -> 0x04be }
            r7 = 0
            r2.A0V(r8, r7, r4)     // Catch:{ UnsupportedEncodingException -> 0x04be }
            r6 = 0
        L_0x0182:
            if (r6 >= r4) goto L_0x018b
            byte r0 = r8[r6]     // Catch:{ UnsupportedEncodingException -> 0x04be }
            if (r0 == 0) goto L_0x018c
            int r6 = r6 + 1
            goto L_0x0182
        L_0x018b:
            r6 = r4
        L_0x018c:
            java.lang.String r0 = "ISO-8859-1"
            java.lang.String r5 = new java.lang.String     // Catch:{ UnsupportedEncodingException -> 0x04be }
            r5.<init>(r8, r7, r6, r0)     // Catch:{ UnsupportedEncodingException -> 0x04be }
            int r0 = r6 + 1
            if (r4 > r0) goto L_0x0198
            goto L_0x019d
        L_0x0198:
            byte[] r4 = java.util.Arrays.copyOfRange(r8, r0, r4)     // Catch:{ UnsupportedEncodingException -> 0x04be }
            goto L_0x019f
        L_0x019d:
            byte[] r4 = X.C162387ry.A0A     // Catch:{ UnsupportedEncodingException -> 0x04be }
        L_0x019f:
            X.6P4 r0 = new X.6P4     // Catch:{ UnsupportedEncodingException -> 0x04be }
            r0.<init>(r5, r4)     // Catch:{ UnsupportedEncodingException -> 0x04be }
            goto L_0x04ba
        L_0x01a6:
            r5 = 71
            r13 = 79
            if (r12 != r5) goto L_0x0205
            r5 = 69
            if (r11 != r5) goto L_0x0205
            if (r10 != r13) goto L_0x0205
            r5 = 66
            if (r8 == r5) goto L_0x01b8
            if (r6 != r0) goto L_0x0205
        L_0x01b8:
            int r11 = r2.A0C()     // Catch:{ UnsupportedEncodingException -> 0x04be }
            java.lang.String r10 = A02(r11)     // Catch:{ UnsupportedEncodingException -> 0x04be }
            int r9 = r4 + -1
            byte[] r8 = new byte[r9]     // Catch:{ UnsupportedEncodingException -> 0x04be }
            r5 = 0
            r2.A0V(r8, r5, r9)     // Catch:{ UnsupportedEncodingException -> 0x04be }
            r4 = 0
        L_0x01c9:
            if (r4 >= r9) goto L_0x01d2
            byte r0 = r8[r4]     // Catch:{ UnsupportedEncodingException -> 0x04be }
            if (r0 == 0) goto L_0x01d3
            int r4 = r4 + 1
            goto L_0x01c9
        L_0x01d2:
            r4 = r9
        L_0x01d3:
            java.lang.String r0 = "ISO-8859-1"
            java.lang.String r7 = new java.lang.String     // Catch:{ UnsupportedEncodingException -> 0x04be }
            r7.<init>(r8, r5, r4, r0)     // Catch:{ UnsupportedEncodingException -> 0x04be }
            int r0 = r4 + 1
            int r5 = A00(r8, r0, r11)     // Catch:{ UnsupportedEncodingException -> 0x04be }
            java.lang.String r6 = A04(r10, r8, r0, r5)     // Catch:{ UnsupportedEncodingException -> 0x04be }
            if (r11 == 0) goto L_0x01ea
            r0 = 3
            r4 = 2
            if (r11 != r0) goto L_0x01eb
        L_0x01ea:
            r4 = 1
        L_0x01eb:
            int r5 = r5 + r4
            int r0 = A00(r8, r5, r11)     // Catch:{ UnsupportedEncodingException -> 0x04be }
            java.lang.String r5 = A04(r10, r8, r5, r0)     // Catch:{ UnsupportedEncodingException -> 0x04be }
            int r0 = r0 + r4
            if (r9 > r0) goto L_0x0200
            byte[] r4 = X.C162387ry.A0A     // Catch:{ UnsupportedEncodingException -> 0x04be }
        L_0x01f9:
            X.6PA r0 = new X.6PA     // Catch:{ UnsupportedEncodingException -> 0x04be }
            r0.<init>(r7, r6, r5, r4)     // Catch:{ UnsupportedEncodingException -> 0x04be }
            goto L_0x04ba
        L_0x0200:
            byte[] r4 = java.util.Arrays.copyOfRange(r8, r0, r9)     // Catch:{ UnsupportedEncodingException -> 0x04be }
            goto L_0x01f9
        L_0x0205:
            r7 = 65
            r5 = 67
            if (r6 != r0) goto L_0x0212
            if (r12 != r14) goto L_0x029b
            if (r11 != r15) goto L_0x0449
            if (r10 != r5) goto L_0x0449
            goto L_0x021a
        L_0x0212:
            if (r12 != r7) goto L_0x029b
            if (r11 != r14) goto L_0x0449
            if (r10 != r15) goto L_0x0449
            if (r8 != r5) goto L_0x0449
        L_0x021a:
            int r10 = r2.A0C()     // Catch:{ UnsupportedEncodingException -> 0x04be }
            java.lang.String r12 = A02(r10)     // Catch:{ UnsupportedEncodingException -> 0x04be }
            int r11 = r4 + -1
            byte[] r9 = new byte[r11]     // Catch:{ UnsupportedEncodingException -> 0x04be }
            r13 = 0
            r2.A0V(r9, r13, r11)     // Catch:{ UnsupportedEncodingException -> 0x04be }
            java.lang.String r7 = "image/"
            java.lang.String r8 = "ISO-8859-1"
            if (r6 != r0) goto L_0x024e
            java.lang.StringBuilder r5 = X.AnonymousClass000.A0l(r7)     // Catch:{ UnsupportedEncodingException -> 0x04be }
            r4 = 3
            java.lang.String r0 = new java.lang.String     // Catch:{ UnsupportedEncodingException -> 0x04be }
            r0.<init>(r9, r13, r4, r8)     // Catch:{ UnsupportedEncodingException -> 0x04be }
            java.lang.String r0 = X.AnonymousClass0x9.A0z(r0)     // Catch:{ UnsupportedEncodingException -> 0x04be }
            java.lang.String r8 = X.AnonymousClass000.A0X(r0, r5)     // Catch:{ UnsupportedEncodingException -> 0x04be }
            java.lang.String r0 = "image/jpg"
            boolean r0 = r0.equals(r8)     // Catch:{ UnsupportedEncodingException -> 0x04be }
            if (r0 == 0) goto L_0x024c
            java.lang.String r8 = "image/jpeg"
        L_0x024c:
            r5 = 2
            goto L_0x026f
        L_0x024e:
            r5 = 0
        L_0x024f:
            if (r5 >= r11) goto L_0x0258
            byte r0 = r9[r5]     // Catch:{ UnsupportedEncodingException -> 0x04be }
            if (r0 == 0) goto L_0x0259
            int r5 = r5 + 1
            goto L_0x024f
        L_0x0258:
            r5 = r11
        L_0x0259:
            java.lang.String r0 = new java.lang.String     // Catch:{ UnsupportedEncodingException -> 0x04be }
            r0.<init>(r9, r13, r5, r8)     // Catch:{ UnsupportedEncodingException -> 0x04be }
            java.lang.String r8 = X.AnonymousClass0x9.A0z(r0)     // Catch:{ UnsupportedEncodingException -> 0x04be }
            r0 = 47
            int r4 = r8.indexOf(r0)     // Catch:{ UnsupportedEncodingException -> 0x04be }
            r0 = -1
            if (r4 != r0) goto L_0x026f
            java.lang.String r8 = X.AnonymousClass000.A0T(r7, r8)     // Catch:{ UnsupportedEncodingException -> 0x04be }
        L_0x026f:
            int r0 = r5 + 1
            byte r0 = r9[r0]     // Catch:{ UnsupportedEncodingException -> 0x04be }
            r7 = r0 & 255(0xff, float:3.57E-43)
            int r4 = r5 + 2
            int r6 = A00(r9, r4, r10)     // Catch:{ UnsupportedEncodingException -> 0x04be }
            int r0 = r6 - r4
            java.lang.String r5 = new java.lang.String     // Catch:{ UnsupportedEncodingException -> 0x04be }
            r5.<init>(r9, r4, r0, r12)     // Catch:{ UnsupportedEncodingException -> 0x04be }
            if (r10 == 0) goto L_0x0288
            r4 = 3
            r0 = 2
            if (r10 != r4) goto L_0x0289
        L_0x0288:
            r0 = 1
        L_0x0289:
            int r6 = r6 + r0
            if (r11 > r6) goto L_0x028d
            goto L_0x0292
        L_0x028d:
            byte[] r4 = java.util.Arrays.copyOfRange(r9, r6, r11)     // Catch:{ UnsupportedEncodingException -> 0x04be }
            goto L_0x0294
        L_0x0292:
            byte[] r4 = X.C162387ry.A0A     // Catch:{ UnsupportedEncodingException -> 0x04be }
        L_0x0294:
            X.6P9 r0 = new X.6P9     // Catch:{ UnsupportedEncodingException -> 0x04be }
            r0.<init>(r8, r5, r4, r7)     // Catch:{ UnsupportedEncodingException -> 0x04be }
            goto L_0x04ba
        L_0x029b:
            r15 = 77
            r20 = r22
            if (r12 != r5) goto L_0x02e9
            if (r11 != r13) goto L_0x0349
            if (r10 != r15) goto L_0x0449
            if (r8 == r15) goto L_0x02a9
            if (r6 != r0) goto L_0x0449
        L_0x02a9:
            r7 = 4
            if (r4 < r7) goto L_0x02e6
            int r10 = r2.A0C()     // Catch:{ UnsupportedEncodingException -> 0x04be }
            java.lang.String r9 = A02(r10)     // Catch:{ UnsupportedEncodingException -> 0x04be }
            r6 = 3
            byte[] r5 = new byte[r6]     // Catch:{ UnsupportedEncodingException -> 0x04be }
            r0 = 0
            r2.A0V(r5, r0, r6)     // Catch:{ UnsupportedEncodingException -> 0x04be }
            java.lang.String r8 = new java.lang.String     // Catch:{ UnsupportedEncodingException -> 0x04be }
            r8.<init>(r5, r0, r6)     // Catch:{ UnsupportedEncodingException -> 0x04be }
            int r4 = r4 - r7
            byte[] r7 = new byte[r4]     // Catch:{ UnsupportedEncodingException -> 0x04be }
            r2.A0V(r7, r0, r4)     // Catch:{ UnsupportedEncodingException -> 0x04be }
            int r6 = A00(r7, r0, r10)     // Catch:{ UnsupportedEncodingException -> 0x04be }
            java.lang.String r5 = new java.lang.String     // Catch:{ UnsupportedEncodingException -> 0x04be }
            r5.<init>(r7, r0, r6, r9)     // Catch:{ UnsupportedEncodingException -> 0x04be }
            if (r10 == 0) goto L_0x02d5
            r4 = 3
            r0 = 2
            if (r10 != r4) goto L_0x02d6
        L_0x02d5:
            r0 = 1
        L_0x02d6:
            int r6 = r6 + r0
            int r0 = A00(r7, r6, r10)     // Catch:{ UnsupportedEncodingException -> 0x04be }
            java.lang.String r4 = A04(r9, r7, r6, r0)     // Catch:{ UnsupportedEncodingException -> 0x04be }
            X.6P7 r0 = new X.6P7     // Catch:{ UnsupportedEncodingException -> 0x04be }
            r0.<init>(r8, r5, r4)     // Catch:{ UnsupportedEncodingException -> 0x04be }
            goto L_0x04ba
        L_0x02e6:
            r0 = 0
            goto L_0x0485
        L_0x02e9:
            if (r12 == r5) goto L_0x0349
            if (r12 == r5) goto L_0x03b9
            if (r12 != r15) goto L_0x0449
            r0 = 76
            if (r11 != r0) goto L_0x0449
            if (r10 != r0) goto L_0x0449
            if (r8 != r9) goto L_0x0449
            int r10 = r2.A0F()     // Catch:{ UnsupportedEncodingException -> 0x04be }
            int r11 = r2.A0D()     // Catch:{ UnsupportedEncodingException -> 0x04be }
            int r12 = r2.A0D()     // Catch:{ UnsupportedEncodingException -> 0x04be }
            int r8 = r2.A0C()     // Catch:{ UnsupportedEncodingException -> 0x04be }
            int r7 = r2.A0C()     // Catch:{ UnsupportedEncodingException -> 0x04be }
            X.7oL r6 = new X.7oL     // Catch:{ UnsupportedEncodingException -> 0x04be }
            r6.<init>()     // Catch:{ UnsupportedEncodingException -> 0x04be }
            byte[] r0 = r2.A02     // Catch:{ UnsupportedEncodingException -> 0x04be }
            int r5 = r2.A00     // Catch:{ UnsupportedEncodingException -> 0x04be }
            r6.A03 = r0     // Catch:{ UnsupportedEncodingException -> 0x04be }
            r0 = 0
            r6.A02 = r0     // Catch:{ UnsupportedEncodingException -> 0x04be }
            r6.A00 = r0     // Catch:{ UnsupportedEncodingException -> 0x04be }
            r6.A01 = r5     // Catch:{ UnsupportedEncodingException -> 0x04be }
            int r0 = r2.A01     // Catch:{ UnsupportedEncodingException -> 0x04be }
            int r0 = r0 * 8
            r6.A08(r0)     // Catch:{ UnsupportedEncodingException -> 0x04be }
            int r0 = r4 + -10
            int r9 = r0 * 8
            int r0 = r8 + r7
            int r9 = r9 / r0
            int[] r13 = new int[r9]     // Catch:{ UnsupportedEncodingException -> 0x04be }
            int[] r14 = new int[r9]     // Catch:{ UnsupportedEncodingException -> 0x04be }
            r5 = 0
        L_0x0330:
            if (r5 >= r9) goto L_0x0341
            int r4 = r6.A04(r8)     // Catch:{ UnsupportedEncodingException -> 0x04be }
            int r0 = r6.A04(r7)     // Catch:{ UnsupportedEncodingException -> 0x04be }
            r13[r5] = r4     // Catch:{ UnsupportedEncodingException -> 0x04be }
            r14[r5] = r0     // Catch:{ UnsupportedEncodingException -> 0x04be }
            int r5 = r5 + 1
            goto L_0x0330
        L_0x0341:
            X.6PB r0 = new X.6PB     // Catch:{ UnsupportedEncodingException -> 0x04be }
            r9 = r0
            r9.<init>(r10, r11, r12, r13, r14)     // Catch:{ UnsupportedEncodingException -> 0x04be }
            goto L_0x04ba
        L_0x0349:
            r0 = 72
            if (r11 != r0) goto L_0x03b9
            if (r10 != r7) goto L_0x0449
            if (r8 != r14) goto L_0x0449
            int r8 = r2.A01     // Catch:{ UnsupportedEncodingException -> 0x04be }
            byte[] r10 = r2.A02     // Catch:{ UnsupportedEncodingException -> 0x04be }
            r9 = r8
        L_0x0356:
            int r0 = r10.length     // Catch:{ UnsupportedEncodingException -> 0x04be }
            if (r9 >= r0) goto L_0x0360
            byte r0 = r10[r9]     // Catch:{ UnsupportedEncodingException -> 0x04be }
            if (r0 == 0) goto L_0x0361
            int r9 = r9 + 1
            goto L_0x0356
        L_0x0360:
            r9 = r0
        L_0x0361:
            int r5 = r9 - r8
            java.lang.String r0 = "ISO-8859-1"
            java.lang.String r7 = new java.lang.String     // Catch:{ UnsupportedEncodingException -> 0x04be }
            r7.<init>(r10, r8, r5, r0)     // Catch:{ UnsupportedEncodingException -> 0x04be }
            int r0 = r9 + 1
            int r11 = X.C161467pi.A04(r2, r0)     // Catch:{ UnsupportedEncodingException -> 0x04be }
            int r12 = r2.A07()     // Catch:{ UnsupportedEncodingException -> 0x04be }
            long r13 = r2.A0I()     // Catch:{ UnsupportedEncodingException -> 0x04be }
            r9 = 4294967295(0xffffffff, double:2.1219957905E-314)
            int r0 = (r13 > r9 ? 1 : (r13 == r9 ? 0 : -1))
            if (r0 != 0) goto L_0x0383
            r13 = -1
        L_0x0383:
            long r15 = r2.A0I()     // Catch:{ UnsupportedEncodingException -> 0x04be }
            int r0 = (r15 > r9 ? 1 : (r15 == r9 ? 0 : -1))
            if (r0 != 0) goto L_0x038d
            r15 = -1
        L_0x038d:
            java.util.ArrayList r5 = X.AnonymousClass001.A0s()     // Catch:{ UnsupportedEncodingException -> 0x04be }
            int r8 = r8 + r4
        L_0x0392:
            int r0 = r2.A01     // Catch:{ UnsupportedEncodingException -> 0x04be }
            if (r0 >= r8) goto L_0x03a6
            r9 = r19
            r4 = r20
            r0 = r18
            X.87X r0 = A01(r9, r2, r6, r4, r0)     // Catch:{ UnsupportedEncodingException -> 0x04be }
            if (r0 == 0) goto L_0x0392
            r5.add(r0)     // Catch:{ UnsupportedEncodingException -> 0x04be }
            goto L_0x0392
        L_0x03a6:
            r0 = 0
            X.87X[] r0 = new X.AnonymousClass87X[r0]     // Catch:{ UnsupportedEncodingException -> 0x04be }
            java.lang.Object[] r4 = r5.toArray(r0)     // Catch:{ UnsupportedEncodingException -> 0x04be }
            X.87X[] r4 = (X.AnonymousClass87X[]) r4     // Catch:{ UnsupportedEncodingException -> 0x04be }
            X.6PC r0 = new X.6PC     // Catch:{ UnsupportedEncodingException -> 0x04be }
            r9 = r7
            r10 = r4
            r8 = r0
            r8.<init>(r9, r10, r11, r12, r13, r15)     // Catch:{ UnsupportedEncodingException -> 0x04be }
            goto L_0x04ba
        L_0x03b9:
            if (r11 != r9) goto L_0x0449
            if (r10 != r13) goto L_0x0449
            if (r8 != r5) goto L_0x0449
            int r13 = r2.A01     // Catch:{ UnsupportedEncodingException -> 0x04be }
            byte[] r8 = r2.A02     // Catch:{ UnsupportedEncodingException -> 0x04be }
            r7 = r13
        L_0x03c4:
            int r0 = r8.length     // Catch:{ UnsupportedEncodingException -> 0x04be }
            if (r7 >= r0) goto L_0x03ce
            byte r0 = r8[r7]     // Catch:{ UnsupportedEncodingException -> 0x04be }
            if (r0 == 0) goto L_0x03cf
            int r7 = r7 + 1
            goto L_0x03c4
        L_0x03ce:
            r7 = r0
        L_0x03cf:
            int r5 = r7 - r13
            java.lang.String r12 = "ISO-8859-1"
            java.lang.String r16 = new java.lang.String     // Catch:{ UnsupportedEncodingException -> 0x04be }
            r0 = r16
            r0.<init>(r8, r13, r5, r12)     // Catch:{ UnsupportedEncodingException -> 0x04be }
            int r0 = r7 + 1
            r2.A0S(r0)     // Catch:{ UnsupportedEncodingException -> 0x04be }
            int r5 = r2.A0C()     // Catch:{ UnsupportedEncodingException -> 0x04be }
            r0 = r5 & 2
            r14 = 0
            boolean r22 = X.AnonymousClass000.A1S(r0)
            r0 = r5 & 1
            boolean r23 = X.AnonymousClass000.A1S(r0)
            int r11 = r2.A0C()     // Catch:{ UnsupportedEncodingException -> 0x04be }
            java.lang.String[] r15 = new java.lang.String[r11]     // Catch:{ UnsupportedEncodingException -> 0x04be }
            r10 = 0
        L_0x03f7:
            if (r10 >= r11) goto L_0x041a
            int r9 = r2.A01     // Catch:{ UnsupportedEncodingException -> 0x04be }
            byte[] r8 = r2.A02     // Catch:{ UnsupportedEncodingException -> 0x04be }
            r7 = r9
        L_0x03fe:
            int r0 = r8.length     // Catch:{ UnsupportedEncodingException -> 0x04be }
            if (r7 >= r0) goto L_0x0408
            byte r0 = r8[r7]     // Catch:{ UnsupportedEncodingException -> 0x04be }
            if (r0 == 0) goto L_0x0409
            int r7 = r7 + 1
            goto L_0x03fe
        L_0x0408:
            r7 = r0
        L_0x0409:
            int r5 = r7 - r9
            java.lang.String r0 = new java.lang.String     // Catch:{ UnsupportedEncodingException -> 0x04be }
            r0.<init>(r8, r9, r5, r12)     // Catch:{ UnsupportedEncodingException -> 0x04be }
            r15[r10] = r0     // Catch:{ UnsupportedEncodingException -> 0x04be }
            int r0 = r7 + 1
            r2.A0S(r0)     // Catch:{ UnsupportedEncodingException -> 0x04be }
            int r10 = r10 + 1
            goto L_0x03f7
        L_0x041a:
            java.util.ArrayList r7 = X.AnonymousClass001.A0s()     // Catch:{ UnsupportedEncodingException -> 0x04be }
            int r13 = r13 + r4
        L_0x041f:
            int r0 = r2.A01     // Catch:{ UnsupportedEncodingException -> 0x04be }
            if (r0 >= r13) goto L_0x0433
            r5 = r19
            r4 = r20
            r0 = r18
            X.87X r0 = A01(r5, r2, r6, r4, r0)     // Catch:{ UnsupportedEncodingException -> 0x04be }
            if (r0 == 0) goto L_0x041f
            r7.add(r0)     // Catch:{ UnsupportedEncodingException -> 0x04be }
            goto L_0x041f
        L_0x0433:
            X.87X[] r0 = new X.AnonymousClass87X[r14]     // Catch:{ UnsupportedEncodingException -> 0x04be }
            java.lang.Object[] r4 = r7.toArray(r0)     // Catch:{ UnsupportedEncodingException -> 0x04be }
            X.87X[] r4 = (X.AnonymousClass87X[]) r4     // Catch:{ UnsupportedEncodingException -> 0x04be }
            X.6P3 r0 = new X.6P3     // Catch:{ UnsupportedEncodingException -> 0x04be }
            r19 = r16
            r20 = r4
            r21 = r15
            r18 = r0
            r18.<init>(r19, r20, r21, r22, r23)     // Catch:{ UnsupportedEncodingException -> 0x04be }
            goto L_0x04ba
        L_0x0449:
            java.lang.String r6 = A03(r6, r12, r11, r10, r8)     // Catch:{ UnsupportedEncodingException -> 0x04be }
            byte[] r5 = new byte[r4]     // Catch:{ UnsupportedEncodingException -> 0x04be }
            r0 = 0
            r2.A0V(r5, r0, r4)     // Catch:{ UnsupportedEncodingException -> 0x04be }
            X.6P2 r0 = new X.6P2     // Catch:{ UnsupportedEncodingException -> 0x04be }
            r0.<init>(r6, r5)     // Catch:{ UnsupportedEncodingException -> 0x04be }
            goto L_0x04ba
        L_0x0459:
            java.lang.String r9 = A03(r6, r12, r11, r10, r8)     // Catch:{ UnsupportedEncodingException -> 0x04be }
            byte[] r8 = new byte[r4]     // Catch:{ UnsupportedEncodingException -> 0x04be }
            r7 = 0
            r2.A0V(r8, r7, r4)     // Catch:{ UnsupportedEncodingException -> 0x04be }
            r6 = 0
        L_0x0464:
            if (r6 >= r4) goto L_0x046d
            byte r0 = r8[r6]     // Catch:{ UnsupportedEncodingException -> 0x04be }
            if (r0 == 0) goto L_0x046e
            int r6 = r6 + 1
            goto L_0x0464
        L_0x046d:
            r6 = r4
        L_0x046e:
            java.lang.String r0 = "ISO-8859-1"
            java.lang.String r5 = new java.lang.String     // Catch:{ UnsupportedEncodingException -> 0x04be }
            r5.<init>(r8, r7, r6, r0)     // Catch:{ UnsupportedEncodingException -> 0x04be }
            X.6P6 r0 = new X.6P6     // Catch:{ UnsupportedEncodingException -> 0x04be }
            r4 = r17
            r0.<init>(r9, r4, r5)     // Catch:{ UnsupportedEncodingException -> 0x04be }
            goto L_0x04ba
        L_0x047d:
            java.lang.String r9 = A03(r6, r12, r11, r10, r8)     // Catch:{ UnsupportedEncodingException -> 0x04be }
            if (r4 >= r7) goto L_0x049b
            r0 = r17
        L_0x0485:
            java.lang.StringBuilder r7 = X.AnonymousClass001.A0o()     // Catch:{ UnsupportedEncodingException -> 0x04be }
            java.lang.String r5 = "Failed to decode frame: id="
            r7.append(r5)     // Catch:{ UnsupportedEncodingException -> 0x04be }
            java.lang.String r5 = A03(r6, r12, r11, r10, r8)     // Catch:{ UnsupportedEncodingException -> 0x04be }
            r7.append(r5)     // Catch:{ UnsupportedEncodingException -> 0x04be }
            java.lang.String r5 = ", frameSize="
            X.AnonymousClass6C7.A1I(r5, r3, r7, r4)     // Catch:{ UnsupportedEncodingException -> 0x04be }
            goto L_0x04ba
        L_0x049b:
            int r0 = r2.A0C()     // Catch:{ UnsupportedEncodingException -> 0x04be }
            java.lang.String r8 = A02(r0)     // Catch:{ UnsupportedEncodingException -> 0x04be }
            int r4 = r4 - r7
            byte[] r7 = new byte[r4]     // Catch:{ UnsupportedEncodingException -> 0x04be }
            r6 = 0
            r2.A0V(r7, r6, r4)     // Catch:{ UnsupportedEncodingException -> 0x04be }
            int r0 = A00(r7, r6, r0)     // Catch:{ UnsupportedEncodingException -> 0x04be }
            java.lang.String r5 = new java.lang.String     // Catch:{ UnsupportedEncodingException -> 0x04be }
            r5.<init>(r7, r6, r0, r8)     // Catch:{ UnsupportedEncodingException -> 0x04be }
            X.6P5 r0 = new X.6P5     // Catch:{ UnsupportedEncodingException -> 0x04be }
            r4 = r17
            r0.<init>(r9, r4, r5)     // Catch:{ UnsupportedEncodingException -> 0x04be }
        L_0x04ba:
            r2.A0S(r1)
            return r0
        L_0x04be:
            java.lang.String r0 = "Unsupported character encoding"
            android.util.Log.w(r3, r0)     // Catch:{ all -> 0x04c4 }
            goto L_0x04ce
        L_0x04c4:
            r0 = move-exception
            r2.A0S(r1)
            throw r0
        L_0x04c9:
            java.lang.String r0 = "Skipping unsupported compressed or encrypted frame"
            android.util.Log.w(r3, r0)
        L_0x04ce:
            r2.A0S(r1)
            return r17
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6P1.A01(X.8lV, X.7pi, int, int, boolean):X.87X");
    }

    public static String A04(String str, byte[] bArr, int i, int i2) {
        if (i2 <= i || i2 > bArr.length) {
            return "";
        }
        return new String(bArr, i, i2 - i, str);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:34:0x008c, code lost:
        r13.A0S(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x008f, code lost:
        return false;
     */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0082 A[SYNTHETIC, Splitter:B:30:0x0082] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x008c A[EDGE_INSN: B:42:0x008c->B:34:0x008c ?: BREAK  , SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean A05(X.C161467pi r13, int r14, int r15, boolean r16) {
        /*
            int r5 = r13.A01
            goto L_0x0007
        L_0x0003:
            int r0 = (int) r3     // Catch:{ all -> 0x0090 }
            r13.A0T(r0)     // Catch:{ all -> 0x0090 }
        L_0x0007:
            int r6 = r13.A00     // Catch:{ all -> 0x0090 }
            int r0 = r13.A01     // Catch:{ all -> 0x0090 }
            int r0 = r6 - r0
            r10 = 1
            if (r0 < r15) goto L_0x0035
            r2 = 3
            r12 = 0
            if (r14 < r2) goto L_0x0021
            int r1 = r13.A07()     // Catch:{ all -> 0x0090 }
            long r3 = r13.A0I()     // Catch:{ all -> 0x0090 }
            int r7 = r13.A0F()     // Catch:{ all -> 0x0090 }
            goto L_0x002b
        L_0x0021:
            int r1 = r13.A0D()     // Catch:{ all -> 0x0090 }
            int r0 = r13.A0D()     // Catch:{ all -> 0x0090 }
            long r3 = (long) r0     // Catch:{ all -> 0x0090 }
            r7 = 0
        L_0x002b:
            r8 = 0
            if (r1 != 0) goto L_0x0039
            int r0 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r0 != 0) goto L_0x0039
            if (r7 != 0) goto L_0x0039
        L_0x0035:
            r13.A0S(r5)
            return r10
        L_0x0039:
            r0 = 4
            if (r14 != r0) goto L_0x0075
            if (r16 != 0) goto L_0x0063
            r1 = 8421504(0x808080, double:4.160776E-317)
            long r1 = r1 & r3
            int r0 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r0 != 0) goto L_0x008c
            r10 = 255(0xff, double:1.26E-321)
            long r8 = r3 & r10
            r0 = 8
            long r1 = r3 >> r0
            long r1 = r1 & r10
            r0 = 7
            long r1 = r1 << r0
            long r8 = r8 | r1
            r0 = 16
            long r1 = r3 >> r0
            long r1 = r1 & r10
            r0 = 14
            long r1 = r1 << r0
            long r8 = r8 | r1
            r0 = 24
            long r3 = r3 >> r0
            long r3 = r3 & r10
            r0 = 21
            long r3 = r3 << r0
            long r3 = r3 | r8
        L_0x0063:
            r0 = r7 & 64
            boolean r1 = X.AnonymousClass000.A1S(r0)
            r0 = r7 & 1
        L_0x006b:
            if (r0 == 0) goto L_0x006f
            int r1 = r1 + 4
        L_0x006f:
            long r1 = (long) r1
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x008c
            goto L_0x0082
        L_0x0075:
            if (r14 != r2) goto L_0x0080
            r0 = r7 & 32
            boolean r1 = X.AnonymousClass000.A1S(r0)
            r0 = r7 & 128(0x80, float:1.794E-43)
            goto L_0x006b
        L_0x0080:
            r1 = 0
            goto L_0x006f
        L_0x0082:
            int r0 = r13.A01     // Catch:{ all -> 0x0090 }
            int r6 = r6 - r0
            long r1 = (long) r6     // Catch:{ all -> 0x0090 }
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 < 0) goto L_0x008c
            goto L_0x0003
        L_0x008c:
            r13.A0S(r5)
            return r12
        L_0x0090:
            r0 = move-exception
            r13.A0S(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6P1.A05(X.7pi, int, int, boolean):boolean");
    }

    public AnonymousClass6P1(C180708lV r1) {
        this.A00 = r1;
    }

    /* JADX WARNING: Removed duplicated region for block: B:6:0x001c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C166547ys A07(byte[] r14, int r15) {
        /*
            r13 = this;
            java.util.ArrayList r2 = X.AnonymousClass001.A0s()
            X.7pi r3 = new X.7pi
            r3.<init>(r14, r15)
            int r1 = X.C161467pi.A00(r3)
            r0 = 10
            r9 = 0
            java.lang.String r5 = "Id3Decoder"
            if (r1 >= r0) goto L_0x004f
            java.lang.String r0 = "Data too short to be an ID3 tag"
        L_0x0016:
            android.util.Log.w(r5, r0)
        L_0x0019:
            r12 = 0
            if (r9 == 0) goto L_0x0101
            int r10 = r3.A01
            int r4 = r9.A01
            r0 = 2
            r6 = 10
            if (r4 != r0) goto L_0x0026
            r6 = 6
        L_0x0026:
            int r8 = r9.A00
            boolean r0 = r9.A02
            if (r0 == 0) goto L_0x00ca
            byte[] r9 = r3.A02
            r11 = r10
        L_0x002f:
            int r7 = r11 + 1
            int r0 = r10 + r8
            if (r7 >= r0) goto L_0x00ca
            byte r1 = r9[r11]
            r0 = 255(0xff, float:3.57E-43)
            r1 = r1 & r0
            if (r1 != r0) goto L_0x004d
            byte r0 = r9[r7]
            if (r0 != 0) goto L_0x004d
            int r0 = r11 - r10
            int r1 = r11 + 2
            int r0 = r8 - r0
            int r0 = r0 + -2
            java.lang.System.arraycopy(r9, r1, r9, r7, r0)
            int r8 = r8 + -1
        L_0x004d:
            r11 = r7
            goto L_0x002f
        L_0x004f:
            int r6 = r3.A0D()
            r0 = 4801587(0x494433, float:6.728456E-39)
            r7 = 0
            r1 = 1
            if (r6 == r0) goto L_0x0073
            java.lang.StringBuilder r4 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "Unexpected first three bytes of ID3 tag header: 0x"
            r4.append(r0)
            java.lang.Object[] r1 = new java.lang.Object[r1]
            X.AnonymousClass000.A1P(r1, r6, r7)
            java.lang.String r0 = "%06X"
            java.lang.String r0 = java.lang.String.format(r0, r1)
            java.lang.String r0 = X.AnonymousClass000.A0X(r0, r4)
            goto L_0x0016
        L_0x0073:
            int r4 = r3.A0C()
            int r8 = X.C161467pi.A02(r3, r1)
            int r6 = r3.A0B()
            r0 = 2
            r1 = 4
            if (r4 != r0) goto L_0x008a
            r0 = r8 & 64
            if (r0 == 0) goto L_0x009b
            java.lang.String r0 = "Skipped ID3 tag with majorVersion=2 and undefined compression scheme"
            goto L_0x0016
        L_0x008a:
            r0 = 3
            if (r4 != r0) goto L_0x00a7
            r0 = r8 & 64
            if (r0 == 0) goto L_0x009b
            int r0 = r3.A07()
            r3.A0T(r0)
            int r0 = r0 + 4
            int r6 = r6 - r0
        L_0x009b:
            r0 = r8 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x00a0
            r7 = 1
        L_0x00a0:
            X.7Ja r9 = new X.7Ja
            r9.<init>(r4, r6, r7)
            goto L_0x0019
        L_0x00a7:
            if (r4 != r1) goto L_0x00be
            r0 = r8 & 64
            if (r0 == 0) goto L_0x00b7
            int r1 = r3.A0B()
            int r0 = r1 + -4
            r3.A0T(r0)
            int r6 = r6 - r1
        L_0x00b7:
            r0 = r8 & 16
            if (r0 == 0) goto L_0x00a0
            int r6 = r6 + -10
            goto L_0x00a0
        L_0x00be:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "Skipped ID3 tag with unsupported majorVersion="
            java.lang.String r0 = X.AnonymousClass000.A0Y(r0, r1, r4)
            goto L_0x0016
        L_0x00ca:
            int r10 = r10 + r8
            r3.A0R(r10)
            r1 = 0
            boolean r0 = A05(r3, r4, r6, r1)
            if (r0 != 0) goto L_0x00e0
            r1 = 4
            if (r4 != r1) goto L_0x00f8
            r0 = 1
            boolean r0 = A05(r3, r1, r6, r0)
            if (r0 == 0) goto L_0x00f8
            r1 = 1
        L_0x00e0:
            int r0 = X.C161467pi.A00(r3)
            if (r0 < r6) goto L_0x00f2
            X.8lV r0 = r13.A00
            X.87X r0 = A01(r0, r3, r4, r6, r1)
            if (r0 == 0) goto L_0x00e0
            r2.add(r0)
            goto L_0x00e0
        L_0x00f2:
            X.7ys r0 = new X.7ys
            r0.<init>((java.util.List) r2)
            return r0
        L_0x00f8:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "Failed to validate ID3 tag with majorVersion="
            X.AnonymousClass6C7.A1I(r0, r5, r1, r4)
        L_0x0101:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6P1.A07(byte[], int):X.7ys");
    }

    public AnonymousClass6P1() {
        this((C180708lV) null);
    }
}
