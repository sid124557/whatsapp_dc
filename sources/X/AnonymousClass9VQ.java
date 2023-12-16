package X;

import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/* renamed from: X.9VQ  reason: invalid class name */
public class AnonymousClass9VQ {
    public static final Charset A04;
    public static final HashMap A05 = AnonymousClass001.A0t();
    public static final HashSet A06 = C18280x3.A0h(new String[]{"DigitalZoomRatio", "ExposureTime"});
    public static final byte[] A07 = {65, 83, 67, 73, 73, 0, 0, 0};
    public static final byte[] A08;
    public static final byte[] A09 = {-1, -40, -1};
    public static final int[] A0A = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8, 1};
    public static final C193489Ov[] A0B = {new C193489Ov("SubIFDPointer", 330, 4), new C193489Ov("ExifIFDPointer", 34665, 4)};
    public static final C193489Ov[] A0C;
    public static final C193489Ov[] A0D;
    public static final String[] A0E = {"", "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE"};
    public static final HashMap[] A0F = new HashMap[3];
    public static final C193489Ov[][] A0G;
    public int A00;
    public ByteOrder A01;
    public final Set A02;
    public final HashMap[] A03;

    static {
        C193489Ov[] r12 = {new C193489Ov("Orientation", 274, 3), new C193489Ov("SubIFDPointer", 330, 4), new C193489Ov("ExifIFDPointer", 34665, 4)};
        A0D = r12;
        C193489Ov[] r6 = {new C193489Ov("ExposureTime", 33434, 5), new C193489Ov("PhotographicSensitivity", 34855, 3), new C193489Ov("ShutterSpeedValue", 37377, 10), new C193489Ov("ApertureValue", 37378, 5), new C193489Ov("FocalLength", 37386, 5), new C193489Ov("WhiteBalance", 41987, 3), new C193489Ov("DigitalZoomRatio", 41988, 5), new C193489Ov("FocalLengthIn35mmFilm", 41989, 3)};
        A0C = r6;
        A0G = new C193489Ov[][]{r12, r6, r12};
        Charset forName = Charset.forName("US-ASCII");
        A04 = forName;
        A08 = "Exif\u0000\u0000".getBytes(forName);
        int i = 0;
        while (true) {
            C193489Ov[][] r2 = A0G;
            if (i < r2.length) {
                A0F[i] = AnonymousClass001.A0t();
                for (C193489Ov r22 : r2[i]) {
                    AnonymousClass0x2.A1H(r22, A0F[i], r22.A00);
                }
                i++;
            } else {
                A05.put(Integer.valueOf(A0B[1].A00), 1);
                return;
            }
        }
    }

    public int A01(String str) {
        NumberFormatException numberFormatException;
        if (str != null) {
            int i = 0;
            while (i < A0G.length) {
                AnonymousClass9SW r1 = (AnonymousClass9SW) this.A03[i].get(str);
                if (r1 != null) {
                    try {
                        Object A012 = r1.A01(this.A01);
                        if (A012 == null) {
                            numberFormatException = new NumberFormatException("NULL can't be converted to a integer value");
                        } else if (A012 instanceof String) {
                            return Integer.parseInt((String) A012);
                        } else {
                            if (A012 instanceof long[]) {
                                long[] jArr = (long[]) A012;
                                if (jArr.length == 1) {
                                    return (int) jArr[0];
                                }
                                numberFormatException = new NumberFormatException("There are more than one component");
                            } else if (A012 instanceof int[]) {
                                int[] iArr = (int[]) A012;
                                if (iArr.length == 1) {
                                    return iArr[0];
                                }
                                numberFormatException = new NumberFormatException("There are more than one component");
                            } else {
                                numberFormatException = new NumberFormatException("Couldn't find a integer value");
                            }
                        }
                        throw numberFormatException;
                    } catch (NumberFormatException unused) {
                        return -1;
                    }
                } else {
                    i++;
                }
            }
            return -1;
        }
        throw AnonymousClass001.A0g("tag shouldn't be null");
    }

    public double A00(String str) {
        NumberFormatException numberFormatException;
        if (str != null) {
            int i = 0;
            while (i < A0G.length) {
                AnonymousClass9SW r1 = (AnonymousClass9SW) this.A03[i].get(str);
                if (r1 != null) {
                    try {
                        Object A012 = r1.A01(this.A01);
                        if (A012 == null) {
                            numberFormatException = new NumberFormatException("NULL can't be converted to a double value");
                        } else if (A012 instanceof String) {
                            return Double.parseDouble((String) A012);
                        } else {
                            if (A012 instanceof long[]) {
                                long[] jArr = (long[]) A012;
                                if (jArr.length == 1) {
                                    return (double) jArr[0];
                                }
                                numberFormatException = new NumberFormatException("There are more than one component");
                            } else if (A012 instanceof int[]) {
                                int[] iArr = (int[]) A012;
                                if (iArr.length == 1) {
                                    return (double) iArr[0];
                                }
                                numberFormatException = new NumberFormatException("There are more than one component");
                            } else if (A012 instanceof double[]) {
                                double[] dArr = (double[]) A012;
                                if (dArr.length == 1) {
                                    return dArr[0];
                                }
                                numberFormatException = new NumberFormatException("There are more than one component");
                            } else if (A012 instanceof C193939Qv[]) {
                                C193939Qv[] r4 = (C193939Qv[]) A012;
                                if (r4.length == 1) {
                                    C193939Qv r2 = r4[0];
                                    return ((double) r2.A01) / ((double) r2.A00);
                                }
                                numberFormatException = new NumberFormatException("There are more than one component");
                            } else {
                                numberFormatException = new NumberFormatException("Couldn't find a double value");
                            }
                        }
                        throw numberFormatException;
                    } catch (NumberFormatException unused) {
                        return -1.0d;
                    }
                } else {
                    i++;
                }
            }
            return -1.0d;
        }
        throw AnonymousClass001.A0g("tag shouldn't be null");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0063, code lost:
        if (r12 == r0) goto L_0x0065;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0066, code lost:
        if (r12 == 7) goto L_0x0068;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x012a, code lost:
        if (((long) r9.A00) != r4) goto L_0x00ae;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A02(X.C198149eS r22, int r23) {
        /*
            r21 = this;
            r20 = r21
            r0 = r20
            java.util.Set r15 = r0.A02
            r9 = r22
            int r0 = r9.A00
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r15.add(r0)
            int r0 = r9.A00
            int r0 = r0 + 2
            int r8 = r9.A03
            if (r0 > r8) goto L_0x00d2
            short r14 = r9.A04()
            int r1 = r9.A00
            int r0 = r14 * 12
            int r1 = r1 + r0
            if (r1 > r8) goto L_0x00d2
            if (r14 <= 0) goto L_0x00d2
            r10 = 0
        L_0x0027:
            int r2 = r9.A02()
            int r12 = r9.A02()
            int r19 = r9.A01()
            int r0 = r9.A00
            long r4 = (long) r0
            r0 = 4
            long r4 = r4 + r0
            java.util.HashMap[] r0 = A0F
            r0 = r0[r23]
            java.lang.Integer r13 = java.lang.Integer.valueOf(r2)
            java.lang.Object r11 = r0.get(r13)
            X.9Ov r11 = (X.C193489Ov) r11
            if (r11 == 0) goto L_0x00ae
            if (r12 <= 0) goto L_0x00ae
            int[] r1 = A0A
            int r0 = r1.length
            if (r12 >= r0) goto L_0x00ae
            int r2 = r11.A01
            r0 = 7
            if (r2 == r0) goto L_0x0065
            if (r12 == r0) goto L_0x0068
            if (r2 == r12) goto L_0x0065
            r3 = 4
            r0 = 3
            if (r2 == r3) goto L_0x0063
            r0 = 9
            if (r2 != r0) goto L_0x00ae
            r0 = 8
        L_0x0063:
            if (r12 != r0) goto L_0x00ae
        L_0x0065:
            r0 = 7
            if (r12 != r0) goto L_0x0069
        L_0x0068:
            r12 = r2
        L_0x0069:
            r0 = r19
            long r6 = (long) r0
            r0 = r1[r12]
            long r0 = (long) r0
            long r6 = r6 * r0
            r1 = 0
            int r0 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x00ae
            r1 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r0 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x00ae
            r1 = 4
            int r0 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0092
            int r0 = r9.A01()
            long r2 = (long) r0
            long r17 = r2 + r6
            long r0 = (long) r8
            int r16 = (r17 > r0 ? 1 : (r17 == r0 ? 0 : -1))
            if (r16 > 0) goto L_0x00ae
            r9.A05(r2)
        L_0x0092:
            java.util.HashMap r0 = A05
            java.lang.Object r13 = r0.get(r13)
            java.lang.Number r13 = (java.lang.Number) r13
            if (r13 == 0) goto L_0x010d
            r0 = 3
            if (r12 == r0) goto L_0x00e4
            r0 = 4
            if (r12 == r0) goto L_0x00d8
            r0 = 8
            if (r12 == r0) goto L_0x00d3
            r0 = 9
            if (r12 == r0) goto L_0x00e9
            r0 = 13
            if (r12 == r0) goto L_0x00e9
        L_0x00ae:
            r9.A05(r4)
        L_0x00b1:
            int r0 = r10 + 1
            short r10 = (short) r0
            if (r10 < r14) goto L_0x0027
            int r0 = r9.A00
            int r0 = r0 + 4
            if (r0 > r8) goto L_0x00d2
            int r5 = r9.A01()
            long r1 = (long) r5
            r3 = 0
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 <= 0) goto L_0x00d2
            if (r5 >= r8) goto L_0x00d2
            boolean r0 = X.C18300x5.A1X(r15, r5)
            if (r0 != 0) goto L_0x00d2
            r9.A05(r1)
        L_0x00d2:
            return
        L_0x00d3:
            short r0 = r9.A04()
            goto L_0x00ed
        L_0x00d8:
            int r0 = r9.A01()
            long r2 = (long) r0
            r0 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r2 = r2 & r0
            goto L_0x00ee
        L_0x00e4:
            int r0 = r9.A02()
            goto L_0x00ed
        L_0x00e9:
            int r0 = r9.A01()
        L_0x00ed:
            long r2 = (long) r0
        L_0x00ee:
            r6 = 0
            int r0 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r0 <= 0) goto L_0x00ae
            long r0 = (long) r8
            int r6 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r6 >= 0) goto L_0x00ae
            int r0 = (int) r2
            boolean r0 = X.C18300x5.A1X(r15, r0)
            if (r0 != 0) goto L_0x00ae
            r9.A05(r2)
            int r1 = r13.intValue()
            r0 = r20
            r0.A02(r9, r1)
            goto L_0x00ae
        L_0x010d:
            int r0 = (int) r6
            byte[] r1 = new byte[r0]
            r9.A06(r1)
            X.9SW r2 = new X.9SW
            r0 = r19
            r2.<init>(r1, r12, r0)
            r0 = r20
            java.util.HashMap[] r0 = r0.A03
            r1 = r0[r23]
            java.lang.String r0 = r11.A02
            r1.put(r0, r2)
            int r0 = r9.A00
            long r0 = (long) r0
            int r2 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r2 == 0) goto L_0x00b1
            goto L_0x00ae
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass9VQ.A02(X.9eS, int):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:89:?, code lost:
        return;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass9VQ(java.io.InputStream r14) {
        /*
            r13 = this;
            r13.<init>()
            X.9Ov[][] r0 = A0G
            int r3 = r0.length
            java.util.HashMap[] r0 = new java.util.HashMap[r3]
            r13.A03 = r0
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>(r3)
            r13.A02 = r0
            java.nio.ByteOrder r6 = java.nio.ByteOrder.BIG_ENDIAN
            r13.A01 = r6
            r2 = 0
        L_0x0016:
            if (r2 >= r3) goto L_0x0023
            java.util.HashMap[] r1 = r13.A03     // Catch:{ IOException -> 0x0192, all -> 0x0193 }
            java.util.HashMap r0 = X.AnonymousClass001.A0t()     // Catch:{ IOException -> 0x0192, all -> 0x0193 }
            r1[r2] = r0     // Catch:{ IOException -> 0x0192, all -> 0x0193 }
            int r2 = r2 + 1
            goto L_0x0016
        L_0x0023:
            r0 = 5000(0x1388, float:7.006E-42)
            java.io.BufferedInputStream r5 = new java.io.BufferedInputStream     // Catch:{ IOException -> 0x0192, all -> 0x0193 }
            r5.<init>(r14, r0)     // Catch:{ IOException -> 0x0192, all -> 0x0193 }
            r5.mark(r0)     // Catch:{ IOException -> 0x0192, all -> 0x0193 }
            byte[] r4 = new byte[r0]     // Catch:{ IOException -> 0x0192, all -> 0x0193 }
            r5.read(r4)     // Catch:{ IOException -> 0x0192, all -> 0x0193 }
            r5.reset()     // Catch:{ IOException -> 0x0192, all -> 0x0193 }
            r3 = 0
        L_0x0036:
            byte[] r2 = A09     // Catch:{ IOException -> 0x0192, all -> 0x0193 }
            int r0 = r2.length     // Catch:{ IOException -> 0x0192, all -> 0x0193 }
            if (r3 >= r0) goto L_0x004b
            byte r1 = r4[r3]     // Catch:{ IOException -> 0x0192, all -> 0x0193 }
            byte r0 = r2[r3]     // Catch:{ IOException -> 0x0192, all -> 0x0193 }
            if (r1 == r0) goto L_0x0048
            java.lang.String r0 = "This EXIF util only supports JPEG"
            java.io.IOException r0 = X.AnonymousClass002.A0C(r0)     // Catch:{ IOException -> 0x0192, all -> 0x0193 }
        L_0x0047:
            throw r0     // Catch:{ IOException -> 0x0192, all -> 0x0193 }
        L_0x0048:
            int r3 = r3 + 1
            goto L_0x0036
        L_0x004b:
            X.9eS r4 = new X.9eS     // Catch:{ IOException -> 0x0192, all -> 0x0193 }
            r4.<init>(r5)     // Catch:{ IOException -> 0x0192, all -> 0x0193 }
            r4.A02 = r6     // Catch:{ IOException -> 0x0192, all -> 0x0193 }
            byte r0 = r4.A00()     // Catch:{ IOException -> 0x0192, all -> 0x0193 }
            java.lang.String r2 = "Invalid marker: "
            r3 = -1
            if (r0 != r3) goto L_0x017e
            byte r1 = r4.A00()     // Catch:{ IOException -> 0x0192, all -> 0x0193 }
            r0 = -40
            if (r1 != r0) goto L_0x016a
            r12 = 2
            r10 = 2
        L_0x0065:
            byte r2 = r4.A00()     // Catch:{ IOException -> 0x0192, all -> 0x0193 }
            if (r2 != r3) goto L_0x0151
            r6 = 1
            int r0 = r10 + 1
            byte r2 = r4.A00()     // Catch:{ IOException -> 0x0192, all -> 0x0193 }
            int r1 = r0 + 1
            r0 = -39
            if (r2 == r0) goto L_0x0192
            r0 = -38
            if (r2 == r0) goto L_0x0192
            int r11 = r4.A02()     // Catch:{ IOException -> 0x0192, all -> 0x0193 }
            int r11 = r11 - r12
            int r10 = r1 + 2
            java.lang.String r0 = "Invalid length"
            if (r11 < 0) goto L_0x014b
            r0 = -31
            if (r2 != r0) goto L_0x0104
            byte[] r9 = new byte[r11]     // Catch:{ IOException -> 0x0192, all -> 0x0193 }
            r4.A06(r9)     // Catch:{ IOException -> 0x0192, all -> 0x0193 }
            int r8 = r10 + r11
            byte[] r7 = A08     // Catch:{ IOException -> 0x0192, all -> 0x0193 }
            if (r7 != 0) goto L_0x0097
            r6 = 0
        L_0x0097:
            int r5 = r7.length     // Catch:{ IOException -> 0x0192, all -> 0x0193 }
            if (r11 >= r5) goto L_0x009b
            r6 = 0
        L_0x009b:
            r2 = 0
        L_0x009c:
            if (r2 >= r5) goto L_0x00a8
            byte r1 = r9[r2]     // Catch:{ IOException -> 0x0192, all -> 0x0193 }
            byte r0 = r7[r2]     // Catch:{ IOException -> 0x0192, all -> 0x0193 }
            if (r1 == r0) goto L_0x00a5
            r6 = 0
        L_0x00a5:
            int r2 = r2 + 1
            goto L_0x009c
        L_0x00a8:
            if (r6 == 0) goto L_0x0102
            byte[] r1 = java.util.Arrays.copyOfRange(r9, r5, r11)     // Catch:{ IOException -> 0x0192, all -> 0x0193 }
            int r10 = r10 + r5
            r13.A00 = r10     // Catch:{ IOException -> 0x0192, all -> 0x0193 }
            r6 = 0
            java.io.ByteArrayInputStream r0 = new java.io.ByteArrayInputStream     // Catch:{ IOException -> 0x0192, all -> 0x0193 }
            r0.<init>(r1)     // Catch:{ IOException -> 0x0192, all -> 0x0193 }
            X.9eS r5 = new X.9eS     // Catch:{ IOException -> 0x0192, all -> 0x0193 }
            r5.<init>(r0)     // Catch:{ IOException -> 0x0192, all -> 0x0193 }
            int r1 = r1.length     // Catch:{ IOException -> 0x0192, all -> 0x0193 }
            short r2 = r5.A04()     // Catch:{ IOException -> 0x0192, all -> 0x0193 }
            r0 = 18761(0x4949, float:2.629E-41)
            if (r2 == r0) goto L_0x00ca
            r0 = 19789(0x4d4d, float:2.773E-41)
            if (r2 != r0) goto L_0x010d
            goto L_0x00cd
        L_0x00ca:
            java.nio.ByteOrder r0 = java.nio.ByteOrder.LITTLE_ENDIAN     // Catch:{ IOException -> 0x0192, all -> 0x0193 }
            goto L_0x00cf
        L_0x00cd:
            java.nio.ByteOrder r0 = java.nio.ByteOrder.BIG_ENDIAN     // Catch:{ IOException -> 0x0192, all -> 0x0193 }
        L_0x00cf:
            r13.A01 = r0     // Catch:{ IOException -> 0x0192, all -> 0x0193 }
            r5.A02 = r0     // Catch:{ IOException -> 0x0192, all -> 0x0193 }
            int r2 = r5.A02()     // Catch:{ IOException -> 0x0192, all -> 0x0193 }
            r0 = 42
            if (r2 != r0) goto L_0x0130
            int r2 = r5.A01()     // Catch:{ IOException -> 0x0192, all -> 0x0193 }
            r0 = 8
            if (r2 < r0) goto L_0x0120
            if (r2 >= r1) goto L_0x0120
            int r2 = r2 + -8
            if (r2 <= 0) goto L_0x00ff
            int r0 = r5.A03(r2)     // Catch:{ IOException -> 0x0192, all -> 0x0193 }
            if (r0 == r2) goto L_0x00ff
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ IOException -> 0x0192, all -> 0x0193 }
            java.lang.String r0 = "Couldn't jump to first Ifd: "
            java.lang.String r0 = X.AnonymousClass000.A0Y(r0, r1, r2)     // Catch:{ IOException -> 0x0192, all -> 0x0193 }
            java.io.IOException r0 = X.AnonymousClass002.A0C(r0)     // Catch:{ IOException -> 0x0192, all -> 0x0193 }
            goto L_0x0047
        L_0x00ff:
            r13.A02(r5, r6)     // Catch:{ IOException -> 0x0192, all -> 0x0193 }
        L_0x0102:
            r10 = r8
            r11 = 0
        L_0x0104:
            int r0 = r4.A03(r11)     // Catch:{ IOException -> 0x0192, all -> 0x0193 }
            if (r0 != r11) goto L_0x0143
            int r10 = r10 + r11
            goto L_0x0065
        L_0x010d:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ IOException -> 0x0192, all -> 0x0193 }
            java.lang.String r0 = "Invalid byte order: "
            X.AnonymousClass000.A1G(r0, r1, r2)     // Catch:{ IOException -> 0x0192, all -> 0x0193 }
            java.lang.String r0 = r1.toString()     // Catch:{ IOException -> 0x0192, all -> 0x0193 }
            java.io.IOException r0 = X.AnonymousClass002.A0C(r0)     // Catch:{ IOException -> 0x0192, all -> 0x0193 }
            goto L_0x0047
        L_0x0120:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ IOException -> 0x0192, all -> 0x0193 }
            java.lang.String r0 = "Invalid first Ifd offset: "
            java.lang.String r0 = X.AnonymousClass000.A0Y(r0, r1, r2)     // Catch:{ IOException -> 0x0192, all -> 0x0193 }
            java.io.IOException r0 = X.AnonymousClass002.A0C(r0)     // Catch:{ IOException -> 0x0192, all -> 0x0193 }
            goto L_0x0047
        L_0x0130:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ IOException -> 0x0192, all -> 0x0193 }
            java.lang.String r0 = "Invalid start code: "
            X.AnonymousClass000.A1G(r0, r1, r2)     // Catch:{ IOException -> 0x0192, all -> 0x0193 }
            java.lang.String r0 = r1.toString()     // Catch:{ IOException -> 0x0192, all -> 0x0193 }
            java.io.IOException r0 = X.AnonymousClass002.A0C(r0)     // Catch:{ IOException -> 0x0192, all -> 0x0193 }
            goto L_0x0047
        L_0x0143:
            java.lang.String r0 = "Invalid JPEG segment"
            java.io.IOException r0 = X.AnonymousClass002.A0C(r0)     // Catch:{ IOException -> 0x0192, all -> 0x0193 }
            goto L_0x0047
        L_0x014b:
            java.io.IOException r0 = X.AnonymousClass002.A0C(r0)     // Catch:{ IOException -> 0x0192, all -> 0x0193 }
            goto L_0x0047
        L_0x0151:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ IOException -> 0x0192, all -> 0x0193 }
            java.lang.String r0 = "Invalid marker:"
            r1.append(r0)     // Catch:{ IOException -> 0x0192, all -> 0x0193 }
            r0 = r2 & 255(0xff, float:3.57E-43)
            java.lang.String r0 = java.lang.Integer.toHexString(r0)     // Catch:{ IOException -> 0x0192, all -> 0x0193 }
            java.lang.String r0 = X.AnonymousClass000.A0X(r0, r1)     // Catch:{ IOException -> 0x0192, all -> 0x0193 }
            java.io.IOException r0 = X.AnonymousClass002.A0C(r0)     // Catch:{ IOException -> 0x0192, all -> 0x0193 }
            goto L_0x0047
        L_0x016a:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0l(r2)     // Catch:{ IOException -> 0x0192, all -> 0x0193 }
            r0 = 255(0xff, float:3.57E-43)
            java.lang.String r0 = java.lang.Integer.toHexString(r0)     // Catch:{ IOException -> 0x0192, all -> 0x0193 }
            java.lang.String r0 = X.AnonymousClass000.A0X(r0, r1)     // Catch:{ IOException -> 0x0192, all -> 0x0193 }
            java.io.IOException r0 = X.AnonymousClass002.A0C(r0)     // Catch:{ IOException -> 0x0192, all -> 0x0193 }
            goto L_0x0047
        L_0x017e:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0l(r2)     // Catch:{ IOException -> 0x0192, all -> 0x0193 }
            r0 = r0 & 255(0xff, float:3.57E-43)
            java.lang.String r0 = java.lang.Integer.toHexString(r0)     // Catch:{ IOException -> 0x0192, all -> 0x0193 }
            java.lang.String r0 = X.AnonymousClass000.A0X(r0, r1)     // Catch:{ IOException -> 0x0192, all -> 0x0193 }
            java.io.IOException r0 = X.AnonymousClass002.A0C(r0)     // Catch:{ IOException -> 0x0192, all -> 0x0193 }
            goto L_0x0047
        L_0x0192:
            return
        L_0x0193:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass9VQ.<init>(java.io.InputStream):void");
    }
}
