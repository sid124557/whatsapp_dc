package X;

import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Random;

/* renamed from: X.7s4  reason: invalid class name and case insensitive filesystem */
public class C162427s4 {
    public static final Object A08 = "false";
    public static final Object A09 = "length";
    public static final Object A0A = C159427lo.A00(1.0d);
    public static final Object A0B = "true";
    public static final Object A0C = C159427lo.A00(0.0d);
    public int A00;
    public int A01;
    public int A02;
    public C146797Bq A03;
    public int[] A04 = new int[16];
    public Object[] A05 = new Object[16];
    public final Object A06 = AnonymousClass001.A0t();
    public final Random A07 = new Random();

    public static boolean A0J(String str) {
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (charAt == 'x' || charAt < 9) {
                return true;
            }
            if (charAt > 13 && (charAt < ' ' || charAt > '~')) {
                return true;
            }
        }
        return false;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v18, resolved type: java.util.HashMap} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v42, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v59, resolved type: X.7Tp} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v60, resolved type: X.7Tp} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v61, resolved type: X.6dJ} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v70, resolved type: java.util.HashMap} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v71, resolved type: java.util.HashMap} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v72, resolved type: java.util.HashMap} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v73, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v69, resolved type: X.6dJ} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v70, resolved type: X.6dJ} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v71, resolved type: X.6dJ} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v72, resolved type: X.6dJ} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v73, resolved type: X.6dJ} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v74, resolved type: X.6dJ} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v6, resolved type: X.6dJ} */
    /* JADX WARNING: type inference failed for: r2v92, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x034f, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:173:0x0402, code lost:
        A0R(r8, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:254:0x05d8, code lost:
        if (r1 == null) goto L_0x05da;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:304:0x06c3, code lost:
        r1 = A0A(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:314:0x06f6, code lost:
        r9.A02(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:358:0x078a, code lost:
        if (r1 == null) goto L_0x078c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:417:0x0858, code lost:
        r1 = A0A(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x017f, code lost:
        if (r11 == null) goto L_0x016e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0181, code lost:
        r0 = r11.equals(r6.A04);
        r6 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0187, code lost:
        if (r0 != false) goto L_0x016e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:470:0x090a, code lost:
        r1 = A0A(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0189, code lost:
        r6 = new X.C151147Tp(r6.A00, r6.A01, r6.A02, (java.util.List) r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:531:0x09dc, code lost:
        r1 = A0A(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:580:0x0a9a, code lost:
        r9.A02((java.lang.Object) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:591:0x0acb, code lost:
        r1 = A0A(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:617:0x0b92, code lost:
        r9.A02(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:694:0x0d9d, code lost:
        A0R(r8, A0L(A08(r10)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:704:0x0de0, code lost:
        A0R(r8, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:774:0x0f35, code lost:
        if (r2 != null) goto L_0x0f37;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:777:0x0f3b, code lost:
        if (r0 == 0) goto L_0x0f3d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:784:0x0f57, code lost:
        r18.getShort();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:788:0x0f89, code lost:
        if (r0 == false) goto L_0x111d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:792:0x0fb1, code lost:
        if (r0 != false) goto L_0x111d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:795:0x0fbb, code lost:
        r18.position(r1 + r16);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:873:0x1227, code lost:
        r0 = "Substring offset out of range";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:874:0x1229, code lost:
        A0D(r0);
        r1 = X.AnonymousClass000.A0L();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:876:0x1235, code lost:
        r0 = "SubstringCompare offset out of range";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:877:0x1237, code lost:
        A0D(r0);
        r1 = X.AnonymousClass000.A0L();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:879:0x1243, code lost:
        r0 = "StringSearch offset out of range";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:880:0x1245, code lost:
        A0D(r0);
        r1 = X.AnonymousClass000.A0L();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:884:0x126d, code lost:
        A0D("ArrayCopy dst index out of range");
        r1 = X.AnonymousClass000.A0L();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:885:0x1278, code lost:
        A0D("ArrayCopy src index out of range");
        r1 = X.AnonymousClass000.A0L();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:890:0x12b2, code lost:
        r1 = X.AnonymousClass001.A0o();
        r1.append("Type assertion failed. Expected ");
        r1.append(r4);
        r1.append(", got ");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:891:0x12c3, code lost:
        if (r3 != null) goto L_0x12c8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:892:0x12c5, code lost:
        r0 = "null";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:893:0x12c8, code lost:
        r0 = X.AnonymousClass000.A0O(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:894:0x12cc, code lost:
        r1 = A0A(X.AnonymousClass000.A0X(r0, r1));
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:972:0x11ae A[SYNTHETIC] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0N() {
        /*
            r35 = this;
            r0 = 4
            r10 = r35
            int r1 = r10.A00
            int r1 = r1 - r0
            java.lang.Object[] r0 = r10.A05
            r0 = r0[r1]
            X.7KA r17 = A03(r0)
            r0 = r17
            X.7TT r2 = r0.A00
            X.7nd r15 = r2.A03
            java.nio.ByteBuffer r0 = r15.A01
            java.nio.ByteBuffer r18 = r0.duplicate()
            java.nio.ByteOrder r1 = r0.order()
            r0 = r18
            r0.order(r1)
            int r1 = r2.A02
            r0.position(r1)
            int r0 = r2.A00
            int r1 = r1 + r0
            r0 = r18
            r0.limit(r1)
            int r1 = r18.position()
            int r0 = X.AnonymousClass6CA.A08(r0, r1)
            r3 = 1
            r8 = 0
            r1 = 2
            if (r0 != r1) goto L_0x13c2
            r19 = 0
            r16 = 0
        L_0x0041:
            int r16 = r18.position()     // Catch:{ 8RX -> 0x1357 }
            int r5 = X.AnonymousClass6CA.A07(r18)     // Catch:{ 8RX -> 0x1357 }
            java.lang.String r9 = "vector index out of range"
            java.lang.String r6 = "key not in map"
            r22 = 0
            java.lang.String r2 = "invalid get_by_val vector index"
            java.lang.String r4 = "modifying immutable container"
            r0 = 3
            switch(r5) {
                case 0: goto L_0x00ab;
                case 1: goto L_0x049e;
                case 2: goto L_0x0fcd;
                case 3: goto L_0x052c;
                case 4: goto L_0x00eb;
                case 5: goto L_0x0555;
                case 6: goto L_0x0b97;
                case 7: goto L_0x01a1;
                case 8: goto L_0x0bd6;
                case 9: goto L_0x01c5;
                case 10: goto L_0x0c02;
                case 11: goto L_0x1122;
                case 12: goto L_0x130c;
                case 13: goto L_0x1043;
                case 14: goto L_0x0495;
                case 15: goto L_0x0c84;
                case 16: goto L_0x0245;
                case 17: goto L_0x0209;
                case 18: goto L_0x0264;
                case 19: goto L_0x0299;
                case 20: goto L_0x02f4;
                case 21: goto L_0x0318;
                case 22: goto L_0x0318;
                case 23: goto L_0x036e;
                case 24: goto L_0x0385;
                case 25: goto L_0x0385;
                case 26: goto L_0x03a8;
                case 27: goto L_0x03ce;
                case 28: goto L_0x040a;
                case 29: goto L_0x040a;
                case 30: goto L_0x0c9c;
                case 31: goto L_0x0059;
                case 32: goto L_0x0059;
                case 33: goto L_0x0cca;
                case 34: goto L_0x0f4b;
                case 35: goto L_0x0cd3;
                case 36: goto L_0x0cf8;
                case 37: goto L_0x0d20;
                case 38: goto L_0x0d32;
                case 39: goto L_0x0bd0;
                case 40: goto L_0x104a;
                case 41: goto L_0x1051;
                case 42: goto L_0x0d4d;
                case 43: goto L_0x0d5a;
                case 44: goto L_0x0d67;
                case 45: goto L_0x0d75;
                case 46: goto L_0x0fc4;
                case 47: goto L_0x0454;
                case 48: goto L_0x0d83;
                case 49: goto L_0x0d9d;
                case 50: goto L_0x0daa;
                case 51: goto L_0x0dbc;
                case 52: goto L_0x0dce;
                case 53: goto L_0x0de5;
                case 54: goto L_0x0e03;
                case 55: goto L_0x03f2;
                case 56: goto L_0x0e14;
                case 57: goto L_0x0e29;
                case 58: goto L_0x0e4d;
                case 59: goto L_0x1058;
                case 60: goto L_0x105f;
                case 61: goto L_0x1066;
                case 62: goto L_0x106d;
                case 63: goto L_0x1074;
                case 64: goto L_0x0465;
                case 65: goto L_0x0e65;
                case 66: goto L_0x107c;
                case 67: goto L_0x1084;
                case 68: goto L_0x108c;
                case 69: goto L_0x1095;
                case 70: goto L_0x109e;
                case 71: goto L_0x10a6;
                case 72: goto L_0x0e80;
                case 73: goto L_0x10ae;
                case 74: goto L_0x10b6;
                case 75: goto L_0x10be;
                case 76: goto L_0x10c6;
                case 77: goto L_0x10ce;
                case 78: goto L_0x0e98;
                case 79: goto L_0x10d6;
                case 80: goto L_0x10de;
                case 81: goto L_0x10e6;
                case 82: goto L_0x10ee;
                case 83: goto L_0x10f6;
                case 84: goto L_0x10fe;
                case 85: goto L_0x0eb0;
                case 86: goto L_0x0eb0;
                case 87: goto L_0x1106;
                case 88: goto L_0x110c;
                case 89: goto L_0x1112;
                case 90: goto L_0x1118;
                case 91: goto L_0x0f50;
                case 92: goto L_0x0f54;
                case 93: goto L_0x0f64;
                case 94: goto L_0x0f77;
                case 95: goto L_0x0f8c;
                case 96: goto L_0x0f9f;
                case 97: goto L_0x0f5c;
                case 98: goto L_0x0fb4;
                default: goto L_0x0057;
            }
        L_0x0057:
            goto L_0x133e
        L_0x0059:
            int r2 = r10.A01     // Catch:{ 8RX -> 0x1357 }
            int r8 = r2 + -1
            int r1 = r8 - r1
            java.lang.Object[] r2 = r10.A05     // Catch:{ 8RX -> 0x1357 }
            r6 = r2[r1]     // Catch:{ 8RX -> 0x1357 }
            r7 = r2[r8]     // Catch:{ 8RX -> 0x1357 }
            boolean r1 = r6 instanceof java.util.List     // Catch:{ 8RX -> 0x1357 }
            if (r1 != 0) goto L_0x0071
            java.lang.String r0 = "vector_resize 1st argument must be a vector"
            java.lang.RuntimeException r1 = A09(r6, r0)     // Catch:{ 8RX -> 0x1357 }
            goto L_0x1356
        L_0x0071:
            java.util.List r6 = (java.util.List) r6     // Catch:{ UnsupportedOperationException -> 0x0367 }
            int r8 = r8 - r3
            r3 = r2[r8]     // Catch:{ UnsupportedOperationException -> 0x0367 }
            java.lang.String r2 = "invalid vector_resize_length"
            r1 = 4194304(0x400000, float:5.877472E-39)
            int r3 = r10.A0K(r3, r2, r1)     // Catch:{ UnsupportedOperationException -> 0x0367 }
            int r2 = r6.size()     // Catch:{ UnsupportedOperationException -> 0x0367 }
            if (r3 <= r2) goto L_0x0097
            boolean r1 = r6 instanceof java.util.ArrayList     // Catch:{ UnsupportedOperationException -> 0x0367 }
            if (r1 == 0) goto L_0x008e
            r1 = r6
            java.util.ArrayList r1 = (java.util.ArrayList) r1     // Catch:{ UnsupportedOperationException -> 0x0367 }
            r1.ensureCapacity(r3)     // Catch:{ UnsupportedOperationException -> 0x0367 }
        L_0x008e:
            r6.add(r7)     // Catch:{ UnsupportedOperationException -> 0x0367 }
            int r2 = r2 + 1
            if (r3 > r2) goto L_0x008e
            goto L_0x0c7f
        L_0x0097:
            if (r3 >= r2) goto L_0x0c7f
        L_0x0099:
            int r2 = r2 + -1
            r6.remove(r2)     // Catch:{ UnsupportedOperationException -> 0x0367 }
            if (r3 < r2) goto L_0x0099
            boolean r1 = r6 instanceof java.util.ArrayList     // Catch:{ UnsupportedOperationException -> 0x0367 }
            if (r1 == 0) goto L_0x0c7f
            java.util.ArrayList r6 = (java.util.ArrayList) r6     // Catch:{ UnsupportedOperationException -> 0x0367 }
            r6.trimToSize()     // Catch:{ UnsupportedOperationException -> 0x0367 }
            goto L_0x0c7f
        L_0x00ab:
            short r6 = r18.getShort()     // Catch:{ 8RX -> 0x1357 }
            r0 = 65535(0xffff, float:9.1834E-41)
            r6 = r6 & r0
            int r3 = X.AnonymousClass6CA.A07(r18)     // Catch:{ 8RX -> 0x1357 }
            r0 = r17
            java.lang.Object r5 = r0.A01     // Catch:{ 8RX -> 0x1357 }
            if (r3 != 0) goto L_0x00bf
            r4 = 0
            goto L_0x00d0
        L_0x00bf:
            java.lang.Object[] r4 = new java.lang.Object[r3]     // Catch:{ 8RX -> 0x1357 }
            int r2 = r3 + -1
            int r0 = r10.A01     // Catch:{ 8RX -> 0x1357 }
            int r1 = r0 + -1
            int r1 = r1 - r2
            java.lang.Object[] r0 = r10.A05     // Catch:{ 8RX -> 0x1357 }
            java.lang.System.arraycopy(r0, r1, r4, r8, r3)     // Catch:{ 8RX -> 0x1357 }
            r10.A0P(r3)     // Catch:{ 8RX -> 0x1357 }
        L_0x00d0:
            X.7TT r0 = r15.A00(r6)     // Catch:{ 8RX -> 0x1357 }
            X.7KA r3 = new X.7KA     // Catch:{ 8RX -> 0x1357 }
            r3.<init>(r0, r5, r4)     // Catch:{ 8RX -> 0x1357 }
            r2 = 0
            java.lang.Object r0 = r3.A01     // Catch:{ 8RX -> 0x1357 }
            X.8DF r1 = new X.8DF     // Catch:{ 8RX -> 0x1357 }
            r1.<init>(r2, r3, r0)     // Catch:{ 8RX -> 0x1357 }
            X.7fV r0 = new X.7fV     // Catch:{ 8RX -> 0x1357 }
            r0.<init>(r1)     // Catch:{ 8RX -> 0x1357 }
            r10.A0V(r0)     // Catch:{ 8RX -> 0x1357 }
            goto L_0x111d
        L_0x00eb:
            short r1 = r18.getShort()     // Catch:{ 8RX -> 0x1357 }
            r0 = 65535(0xffff, float:9.1834E-41)
            r1 = r1 & r0
            int r13 = X.AnonymousClass6CA.A07(r18)     // Catch:{ 8RX -> 0x1357 }
            java.lang.Object r12 = r15.A01(r1)     // Catch:{ 8RX -> 0x1357 }
            r0 = r17
            java.lang.Object r11 = r0.A01     // Catch:{ 8RX -> 0x1357 }
            java.lang.Object[] r3 = new java.lang.Object[r13]     // Catch:{ 8RX -> 0x1357 }
            int r2 = r13 + -1
            int r0 = r10.A01     // Catch:{ 8RX -> 0x1357 }
            int r1 = r0 + -1
            int r1 = r1 - r2
            java.lang.Object[] r0 = r10.A05     // Catch:{ 8RX -> 0x1357 }
            java.lang.System.arraycopy(r0, r1, r3, r8, r13)     // Catch:{ 8RX -> 0x1357 }
            int r9 = r10.A02     // Catch:{ 8RX -> 0x1357 }
            r0 = r16
            r10.A02 = r0     // Catch:{ 8RX -> 0x1357 }
            java.lang.String r12 = (java.lang.String) r12     // Catch:{ 8RX -> 0x1357 }
            X.7Bq r0 = r10.A03     // Catch:{ 8Rc -> 0x116e, Exception -> 0x114a }
            java.util.List r7 = java.util.Arrays.asList(r3)     // Catch:{ 8Rc -> 0x116e, Exception -> 0x114a }
            X.7Tp r6 = r0.A00     // Catch:{ 8Rc -> 0x116e, Exception -> 0x114a }
            boolean r0 = r6 instanceof X.C131266dJ     // Catch:{ 8Rc -> 0x116e, Exception -> 0x114a }
            if (r0 == 0) goto L_0x017f
            X.6dJ r6 = (X.C131266dJ) r6     // Catch:{ 8Rc -> 0x116e, Exception -> 0x114a }
            if (r11 == 0) goto L_0x016e
            java.util.List r0 = r6.A04     // Catch:{ 8Rc -> 0x116e, Exception -> 0x114a }
            boolean r0 = r11.equals(r0)     // Catch:{ 8Rc -> 0x116e, Exception -> 0x114a }
            if (r0 != 0) goto L_0x016e
            java.util.List r11 = (java.util.List) r11     // Catch:{ 8Rc -> 0x116e, Exception -> 0x114a }
            boolean r0 = r11.isEmpty()     // Catch:{ 8Rc -> 0x116e, Exception -> 0x114a }
            if (r0 != 0) goto L_0x016e
            X.7bI r0 = r6.A00     // Catch:{ 8Rc -> 0x116e, Exception -> 0x114a }
            r22 = r0
            X.7fz r0 = r6.A05     // Catch:{ 8Rc -> 0x116e, Exception -> 0x114a }
            r28 = r0
            java.util.Map r0 = r6.A09     // Catch:{ 8Rc -> 0x116e, Exception -> 0x114a }
            r33 = r0
            X.7ke r0 = r6.A01     // Catch:{ 8Rc -> 0x116e, Exception -> 0x114a }
            r24 = r0
            java.util.Set r14 = r6.A0A     // Catch:{ 8Rc -> 0x116e, Exception -> 0x114a }
            X.48u r5 = r6.A02     // Catch:{ 8Rc -> 0x116e, Exception -> 0x114a }
            X.7e8 r4 = r6.A03     // Catch:{ 8Rc -> 0x116e, Exception -> 0x114a }
            java.lang.String r3 = r6.A07     // Catch:{ 8Rc -> 0x116e, Exception -> 0x114a }
            X.7dc r2 = r6.A01     // Catch:{ 8Rc -> 0x116e, Exception -> 0x114a }
            r23 = 0
            X.6va r1 = r6.A04     // Catch:{ 8Rc -> 0x116e, Exception -> 0x114a }
            X.7e7 r0 = r6.A02     // Catch:{ 8Rc -> 0x116e, Exception -> 0x114a }
            X.6dJ r6 = new X.6dJ     // Catch:{ 8Rc -> 0x116e, Exception -> 0x114a }
            r20 = r6
            r21 = r2
            r25 = r0
            r26 = r4
            r27 = r1
            r29 = r5
            r30 = r3
            r31 = r23
            r32 = r11
            r34 = r14
            r20.<init>(r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34)     // Catch:{ 8Rc -> 0x116e, Exception -> 0x114a }
        L_0x016e:
            X.48u r2 = r6.A02     // Catch:{ 8Rc -> 0x116e, Exception -> 0x114a }
            X.7Bp r1 = new X.7Bp     // Catch:{ 8Rc -> 0x116e, Exception -> 0x114a }
            r1.<init>(r12)     // Catch:{ 8Rc -> 0x116e, Exception -> 0x114a }
            X.7jD r0 = new X.7jD     // Catch:{ 8Rc -> 0x116e, Exception -> 0x114a }
            r0.<init>(r7)     // Catch:{ 8Rc -> 0x116e, Exception -> 0x114a }
            java.lang.Object r0 = r2.B2m(r0, r1, r6)     // Catch:{ 8Rc -> 0x116e, Exception -> 0x114a }
            goto L_0x0197
        L_0x017f:
            if (r11 == 0) goto L_0x016e
            java.util.List r0 = r6.A04     // Catch:{ 8Rc -> 0x116e, Exception -> 0x114a }
            boolean r0 = r11.equals(r0)     // Catch:{ 8Rc -> 0x116e, Exception -> 0x114a }
            if (r0 != 0) goto L_0x016e
            X.71U r2 = r6.A00     // Catch:{ 8Rc -> 0x116e, Exception -> 0x114a }
            java.util.List r11 = (java.util.List) r11     // Catch:{ 8Rc -> 0x116e, Exception -> 0x114a }
            X.48u r1 = r6.A02     // Catch:{ 8Rc -> 0x116e, Exception -> 0x114a }
            X.7dc r0 = r6.A01     // Catch:{ 8Rc -> 0x116e, Exception -> 0x114a }
            X.7Tp r6 = new X.7Tp     // Catch:{ 8Rc -> 0x116e, Exception -> 0x114a }
            r6.<init>(r2, r0, r1, r11)     // Catch:{ 8Rc -> 0x116e, Exception -> 0x114a }
            goto L_0x016e
        L_0x0197:
            r10.A02 = r9     // Catch:{ 8RX -> 0x1357 }
            r10.A0P(r13)     // Catch:{ 8RX -> 0x1357 }
            r10.A0R(r8, r0)     // Catch:{ 8RX -> 0x1357 }
            goto L_0x111d
        L_0x01a1:
            r1 = 4
            int r3 = r10.A00     // Catch:{ 8RX -> 0x1357 }
            int r2 = r3 - r1
            java.lang.Object[] r1 = r10.A05     // Catch:{ 8RX -> 0x1357 }
            r1 = r1[r2]     // Catch:{ 8RX -> 0x1357 }
            X.7KA r1 = A03(r1)     // Catch:{ 8RX -> 0x1357 }
            java.lang.Object[] r1 = r1.A02     // Catch:{ 8RX -> 0x1357 }
            if (r1 == 0) goto L_0x01c3
            int r1 = r1.length     // Catch:{ 8RX -> 0x1357 }
        L_0x01b3:
            int r3 = r3 - r0
            int[] r0 = r10.A04     // Catch:{ 8RX -> 0x1357 }
            r0 = r0[r3]     // Catch:{ 8RX -> 0x1357 }
            int r1 = r1 + r0
            double r0 = (double) r1     // Catch:{ 8RX -> 0x1357 }
            java.lang.Number r0 = X.C159427lo.A00(r0)     // Catch:{ 8RX -> 0x1357 }
            r10.A0V(r0)     // Catch:{ 8RX -> 0x1357 }
            goto L_0x111d
        L_0x01c3:
            r1 = 0
            goto L_0x01b3
        L_0x01c5:
            r1 = 4
            int r4 = r10.A00     // Catch:{ 8RX -> 0x1357 }
            int r2 = r4 - r1
            java.lang.Object[] r1 = r10.A05     // Catch:{ 8RX -> 0x1357 }
            r1 = r1[r2]     // Catch:{ 8RX -> 0x1357 }
            X.7KA r1 = A03(r1)     // Catch:{ 8RX -> 0x1357 }
            java.lang.Object[] r1 = r1.A02     // Catch:{ 8RX -> 0x1357 }
            if (r1 == 0) goto L_0x01f7
            int r3 = r1.length     // Catch:{ 8RX -> 0x1357 }
        L_0x01d7:
            int r4 = r4 - r0
            int[] r0 = r10.A04     // Catch:{ 8RX -> 0x1357 }
            r2 = r0[r4]     // Catch:{ 8RX -> 0x1357 }
            int r0 = r3 + r2
            java.lang.Object[] r4 = new java.lang.Object[r0]     // Catch:{ 8RX -> 0x1357 }
            if (r1 == 0) goto L_0x01e5
            java.lang.System.arraycopy(r1, r8, r4, r8, r3)     // Catch:{ 8RX -> 0x1357 }
        L_0x01e5:
            int r1 = r10.A00     // Catch:{ 8RX -> 0x1357 }
            int r0 = r2 + -1
            int r0 = r0 + 5
            int r1 = r1 - r0
            java.lang.Object[] r0 = r10.A05     // Catch:{ 8RX -> 0x1357 }
            java.lang.System.arraycopy(r0, r1, r4, r3, r2)     // Catch:{ 8RX -> 0x1357 }
            int r3 = r4.length     // Catch:{ 8RX -> 0x1357 }
            java.util.ArrayList r2 = X.AnonymousClass002.A0I(r3)     // Catch:{ 8RX -> 0x1357 }
            goto L_0x01f9
        L_0x01f7:
            r3 = 0
            goto L_0x01d7
        L_0x01f9:
            r1 = 0
        L_0x01fa:
            if (r1 >= r3) goto L_0x0204
            r0 = r4[r1]     // Catch:{ 8RX -> 0x1357 }
            r2.add(r0)     // Catch:{ 8RX -> 0x1357 }
            int r1 = r1 + 1
            goto L_0x01fa
        L_0x0204:
            r10.A0V(r2)     // Catch:{ 8RX -> 0x1357 }
            goto L_0x111d
        L_0x0209:
            java.lang.Object r1 = A08(r10)     // Catch:{ 8RX -> 0x1357 }
            boolean r0 = r1 instanceof java.util.List     // Catch:{ 8RX -> 0x1357 }
            if (r0 == 0) goto L_0x0220
            java.util.Collection r1 = (java.util.Collection) r1     // Catch:{ 8RX -> 0x1357 }
            java.util.ArrayList r0 = X.AnonymousClass002.A0J(r1)     // Catch:{ 8RX -> 0x1357 }
            java.util.List r1 = java.util.Collections.unmodifiableList(r0)     // Catch:{ 8RX -> 0x1357 }
        L_0x021b:
            r10.A0R(r8, r1)     // Catch:{ 8RX -> 0x1357 }
            goto L_0x111d
        L_0x0220:
            boolean r0 = r1 instanceof java.util.Map     // Catch:{ 8RX -> 0x1357 }
            if (r0 == 0) goto L_0x022b
            java.util.Map r1 = (java.util.Map) r1     // Catch:{ 8RX -> 0x1357 }
            java.util.Map r1 = X.AnonymousClass6C9.A0l(r1)     // Catch:{ 8RX -> 0x1357 }
            goto L_0x021b
        L_0x022b:
            if (r1 == 0) goto L_0x021b
            boolean r0 = r1 instanceof java.lang.String     // Catch:{ 8RX -> 0x1357 }
            if (r0 != 0) goto L_0x021b
            boolean r0 = r1 instanceof java.lang.Number     // Catch:{ 8RX -> 0x1357 }
            if (r0 != 0) goto L_0x021b
            boolean r0 = r1 instanceof java.lang.Boolean     // Catch:{ 8RX -> 0x1357 }
            if (r0 != 0) goto L_0x021b
            boolean r0 = r1 instanceof X.C155787fV     // Catch:{ 8RX -> 0x1357 }
            if (r0 != 0) goto L_0x021b
            java.lang.String r0 = "argument of immutable_clone cannot be a host ref"
            java.lang.RuntimeException r1 = A09(r1, r0)     // Catch:{ 8RX -> 0x1357 }
            goto L_0x1356
        L_0x0245:
            java.lang.Object r1 = A08(r10)     // Catch:{ 8RX -> 0x1357 }
            boolean r0 = r1 instanceof java.util.List     // Catch:{ 8RX -> 0x1357 }
            if (r0 == 0) goto L_0x0258
            java.util.Collection r1 = (java.util.Collection) r1     // Catch:{ 8RX -> 0x1357 }
            java.util.ArrayList r0 = X.AnonymousClass002.A0J(r1)     // Catch:{ 8RX -> 0x1357 }
        L_0x0253:
            r10.A0R(r8, r0)     // Catch:{ 8RX -> 0x1357 }
            goto L_0x111d
        L_0x0258:
            boolean r0 = r1 instanceof java.util.Map     // Catch:{ 8RX -> 0x1357 }
            if (r0 == 0) goto L_0x1171
            java.util.Map r1 = (java.util.Map) r1     // Catch:{ 8RX -> 0x1357 }
            java.util.HashMap r0 = new java.util.HashMap     // Catch:{ 8RX -> 0x1357 }
            r0.<init>(r1)     // Catch:{ 8RX -> 0x1357 }
            goto L_0x0253
        L_0x0264:
            int r0 = r10.A01     // Catch:{ 8RX -> 0x1357 }
            int r5 = r0 + -1
            int r1 = r5 - r3
            java.lang.Object[] r0 = r10.A05     // Catch:{ 8RX -> 0x1357 }
            r4 = r0[r1]     // Catch:{ 8RX -> 0x1357 }
            r1 = r0[r5]     // Catch:{ 8RX -> 0x1357 }
            boolean r0 = r4 instanceof java.util.Map     // Catch:{ 8RX -> 0x1357 }
            if (r0 == 0) goto L_0x0283
            java.util.Map r4 = (java.util.Map) r4     // Catch:{ 8RX -> 0x1357 }
            boolean r0 = r4.containsKey(r1)     // Catch:{ 8RX -> 0x1357 }
        L_0x027a:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ 8RX -> 0x1357 }
            r10.A0R(r3, r0)     // Catch:{ 8RX -> 0x1357 }
            goto L_0x0f4b
        L_0x0283:
            boolean r0 = r4 instanceof java.util.List     // Catch:{ 8RX -> 0x1357 }
            if (r0 == 0) goto L_0x1179
            java.util.List r4 = (java.util.List) r4     // Catch:{ 8RX -> 0x1357 }
            r0 = 4194303(0x3fffff, float:5.87747E-39)
            int r1 = r10.A0K(r1, r2, r0)     // Catch:{ 8RX -> 0x1357 }
            int r0 = r4.size()     // Catch:{ 8RX -> 0x1357 }
            boolean r0 = X.AnonymousClass001.A1Y(r1, r0)
            goto L_0x027a
        L_0x0299:
            int r0 = r10.A01     // Catch:{ 8RX -> 0x1357 }
            int r5 = r0 + -1
            int r1 = r5 - r3
            java.lang.Object[] r0 = r10.A05     // Catch:{ 8RX -> 0x1357 }
            r4 = r0[r1]     // Catch:{ 8RX -> 0x1357 }
            r5 = r0[r5]     // Catch:{ 8RX -> 0x1357 }
            boolean r0 = r4 instanceof java.util.Map     // Catch:{ 8RX -> 0x1357 }
            if (r0 == 0) goto L_0x02b9
            java.util.Map r4 = (java.util.Map) r4     // Catch:{ 8RX -> 0x1357 }
            java.lang.Object r0 = r4.get(r5)     // Catch:{ 8RX -> 0x1357 }
            if (r0 != 0) goto L_0x02d0
            boolean r0 = r4.containsKey(r5)     // Catch:{ 8RX -> 0x1357 }
            if (r0 == 0) goto L_0x1181
            r0 = 0
            goto L_0x02d0
        L_0x02b9:
            boolean r0 = r4 instanceof java.util.List     // Catch:{ 8RX -> 0x1357 }
            if (r0 == 0) goto L_0x02d5
            java.util.List r4 = (java.util.List) r4     // Catch:{ 8RX -> 0x1357 }
            r0 = 4194303(0x3fffff, float:5.87747E-39)
            int r1 = r10.A0K(r5, r2, r0)     // Catch:{ 8RX -> 0x1357 }
            int r0 = r4.size()     // Catch:{ 8RX -> 0x1357 }
            if (r1 >= r0) goto L_0x118a
            java.lang.Object r0 = r4.get(r1)     // Catch:{ 8RX -> 0x1357 }
        L_0x02d0:
            r10.A0R(r3, r0)     // Catch:{ 8RX -> 0x1357 }
            goto L_0x0f4b
        L_0x02d5:
            boolean r0 = r4 instanceof java.lang.String     // Catch:{ 8RX -> 0x1357 }
            if (r0 == 0) goto L_0x119e
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ 8RX -> 0x1357 }
            java.lang.String r1 = "invalid get_by_val string index"
            r0 = 2147483647(0x7fffffff, float:NaN)
            int r1 = r10.A0K(r5, r1, r0)     // Catch:{ 8RX -> 0x1357 }
            int r0 = r4.length()     // Catch:{ 8RX -> 0x1357 }
            if (r1 >= r0) goto L_0x1193
            char r0 = r4.charAt(r1)     // Catch:{ 8RX -> 0x1357 }
            double r0 = (double) r0     // Catch:{ 8RX -> 0x1357 }
            java.lang.Number r0 = X.C159427lo.A00(r0)     // Catch:{ 8RX -> 0x1357 }
            goto L_0x02d0
        L_0x02f4:
            int r0 = r10.A01     // Catch:{ 8RX -> 0x1357 }
            int r7 = r0 + -1
            int r0 = r7 - r1
            java.lang.Object[] r6 = r10.A05     // Catch:{ 8RX -> 0x1357 }
            r4 = r6[r0]     // Catch:{ 8RX -> 0x1357 }
            int r0 = r7 - r3
            r5 = r6[r0]     // Catch:{ 8RX -> 0x1357 }
            r6 = r6[r7]     // Catch:{ 8RX -> 0x1357 }
            boolean r0 = r4 instanceof java.util.Map     // Catch:{ 8RX -> 0x1357 }
            if (r0 == 0) goto L_0x0432
            java.util.Map r4 = (java.util.Map) r4     // Catch:{ 8RX -> 0x1357 }
            java.lang.Object r0 = r4.get(r5)     // Catch:{ 8RX -> 0x1357 }
            if (r0 != 0) goto L_0x0449
            boolean r0 = r4.containsKey(r5)     // Catch:{ 8RX -> 0x1357 }
            if (r0 == 0) goto L_0x0452
            goto L_0x0451
        L_0x0318:
            int r2 = r10.A01     // Catch:{ 8RX -> 0x1357 }
            int r8 = r2 + -1
            int r1 = r8 - r1
            java.lang.Object[] r2 = r10.A05     // Catch:{ 8RX -> 0x1357 }
            r6 = r2[r1]     // Catch:{ 8RX -> 0x1357 }
            int r1 = r8 - r3
            r7 = r2[r1]     // Catch:{ 8RX -> 0x1357 }
            r3 = r2[r8]     // Catch:{ 8RX -> 0x1357 }
            boolean r1 = r6 instanceof java.util.Map     // Catch:{ UnsupportedOperationException -> 0x0363 }
            if (r1 == 0) goto L_0x0333
            java.util.Map r6 = (java.util.Map) r6     // Catch:{ UnsupportedOperationException -> 0x0363 }
            r6.put(r7, r3)     // Catch:{ UnsupportedOperationException -> 0x0363 }
            goto L_0x0c7f
        L_0x0333:
            boolean r1 = r6 instanceof java.util.List     // Catch:{ UnsupportedOperationException -> 0x0363 }
            if (r1 == 0) goto L_0x0350
            java.util.List r6 = (java.util.List) r6     // Catch:{ UnsupportedOperationException -> 0x0363 }
            java.lang.String r2 = "invalid put_by_val vector index"
            r1 = 4194303(0x3fffff, float:5.87747E-39)
            int r2 = r10.A0K(r7, r2, r1)     // Catch:{ UnsupportedOperationException -> 0x0363 }
            int r1 = r6.size()     // Catch:{ UnsupportedOperationException -> 0x0363 }
            if (r2 <= r1) goto L_0x0357
            A0D(r9)     // Catch:{ UnsupportedOperationException -> 0x0363 }
            java.lang.RuntimeException r1 = X.AnonymousClass000.A0L()     // Catch:{ UnsupportedOperationException -> 0x0363 }
        L_0x034f:
            throw r1     // Catch:{ UnsupportedOperationException -> 0x0363 }
        L_0x0350:
            java.lang.String r1 = "put_by_val 1st argument must be a container"
            java.lang.RuntimeException r1 = A09(r6, r1)     // Catch:{ UnsupportedOperationException -> 0x0363 }
            goto L_0x034f
        L_0x0357:
            if (r2 != r1) goto L_0x035e
            r6.add(r3)     // Catch:{ UnsupportedOperationException -> 0x0363 }
            goto L_0x0c7f
        L_0x035e:
            r6.set(r2, r3)     // Catch:{ UnsupportedOperationException -> 0x0363 }
            goto L_0x0c7f
        L_0x0363:
            r2 = move-exception
            r1 = 22
            goto L_0x036a
        L_0x0367:
            r2 = move-exception
            r1 = 32
        L_0x036a:
            if (r5 == r1) goto L_0x0c7f
            goto L_0x11ae
        L_0x036e:
            int r0 = r10.A01     // Catch:{ 8RX -> 0x1357 }
            int r5 = r0 + -1
            int r2 = r5 - r3
            java.lang.Object[] r0 = r10.A05     // Catch:{ 8RX -> 0x1357 }
            r3 = r0[r2]     // Catch:{ 8RX -> 0x1357 }
            r2 = r0[r5]     // Catch:{ 8RX -> 0x1357 }
            boolean r0 = r3 instanceof java.util.List     // Catch:{ UnsupportedOperationException -> 0x11c6 }
            if (r0 == 0) goto L_0x11bf
            java.util.List r3 = (java.util.List) r3     // Catch:{ UnsupportedOperationException -> 0x11c6 }
            r3.add(r2)     // Catch:{ UnsupportedOperationException -> 0x11c6 }
            goto L_0x044c
        L_0x0385:
            int r0 = r10.A01     // Catch:{ 8RX -> 0x1357 }
            int r6 = r0 + -1
            int r2 = r6 - r3
            java.lang.Object[] r0 = r10.A05     // Catch:{ 8RX -> 0x1357 }
            r3 = r0[r2]     // Catch:{ 8RX -> 0x1357 }
            r2 = r0[r6]     // Catch:{ 8RX -> 0x1357 }
            boolean r0 = r3 instanceof java.util.Map     // Catch:{ UnsupportedOperationException -> 0x03a3 }
            if (r0 == 0) goto L_0x039c
            java.util.Map r3 = (java.util.Map) r3     // Catch:{ UnsupportedOperationException -> 0x03a3 }
            r3.remove(r2)     // Catch:{ UnsupportedOperationException -> 0x03a3 }
            goto L_0x044c
        L_0x039c:
            java.lang.String r0 = "del_by_val 1st argument must be a map"
            java.lang.RuntimeException r0 = A09(r3, r0)     // Catch:{ UnsupportedOperationException -> 0x03a3 }
            throw r0     // Catch:{ UnsupportedOperationException -> 0x03a3 }
        L_0x03a3:
            r2 = move-exception
            r0 = 25
            goto L_0x042e
        L_0x03a8:
            short r2 = r18.getShort()     // Catch:{ 8RX -> 0x1357 }
            r0 = 65535(0xffff, float:9.1834E-41)
            r2 = r2 & r0
            java.lang.Object r1 = A08(r10)     // Catch:{ 8RX -> 0x1357 }
            r0 = 26
            java.util.Map r1 = r10.A0M(r1, r0)     // Catch:{ 8RX -> 0x1357 }
            r10.A0O()     // Catch:{ 8RX -> 0x1357 }
            java.lang.Object r0 = r15.A01(r2)     // Catch:{ 8RX -> 0x1357 }
            boolean r0 = r1.containsKey(r0)     // Catch:{ 8RX -> 0x1357 }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ 8RX -> 0x1357 }
            r10.A0V(r0)     // Catch:{ 8RX -> 0x1357 }
            goto L_0x111d
        L_0x03ce:
            short r3 = r18.getShort()     // Catch:{ 8RX -> 0x1357 }
            r0 = 65535(0xffff, float:9.1834E-41)
            r3 = r3 & r0
            java.lang.Object r1 = A08(r10)     // Catch:{ 8RX -> 0x1357 }
            r0 = 26
            java.util.Map r2 = r10.A0M(r1, r0)     // Catch:{ 8RX -> 0x1357 }
            java.lang.Object r1 = r15.A01(r3)     // Catch:{ 8RX -> 0x1357 }
            java.lang.Object r0 = r2.get(r1)     // Catch:{ 8RX -> 0x1357 }
            if (r0 != 0) goto L_0x0402
            boolean r0 = r2.containsKey(r1)     // Catch:{ 8RX -> 0x1357 }
            if (r0 == 0) goto L_0x11c8
            r0 = 0
            goto L_0x0402
        L_0x03f2:
            java.lang.Object r1 = A08(r10)     // Catch:{ 8RX -> 0x1357 }
            boolean r0 = r1 instanceof java.lang.Boolean     // Catch:{ 8RX -> 0x1357 }
            if (r0 == 0) goto L_0x111d
            boolean r0 = X.AnonymousClass001.A1Z(r1)     // Catch:{ 8RX -> 0x1357 }
            if (r0 == 0) goto L_0x0407
            java.lang.Object r0 = A0A     // Catch:{ 8RX -> 0x1357 }
        L_0x0402:
            r10.A0R(r8, r0)     // Catch:{ 8RX -> 0x1357 }
            goto L_0x111d
        L_0x0407:
            java.lang.Object r0 = A0C     // Catch:{ 8RX -> 0x1357 }
            goto L_0x0402
        L_0x040a:
            short r7 = r18.getShort()     // Catch:{ 8RX -> 0x1357 }
            r0 = 65535(0xffff, float:9.1834E-41)
            r7 = r7 & r0
            int r0 = r10.A01     // Catch:{ 8RX -> 0x1357 }
            int r2 = r0 + -1
            java.lang.Object[] r0 = r10.A05     // Catch:{ 8RX -> 0x1357 }
            r6 = r0[r2]     // Catch:{ 8RX -> 0x1357 }
            int r2 = r2 - r3
            r2 = r0[r2]     // Catch:{ 8RX -> 0x1357 }
            r0 = 28
            java.util.Map r2 = r10.A0M(r2, r0)     // Catch:{ 8RX -> 0x1357 }
            java.lang.Object r0 = r15.A01(r7)     // Catch:{ UnsupportedOperationException -> 0x042b }
            r2.put(r0, r6)     // Catch:{ UnsupportedOperationException -> 0x042b }
            goto L_0x044c
        L_0x042b:
            r2 = move-exception
            r0 = 29
        L_0x042e:
            if (r5 == r0) goto L_0x044c
            goto L_0x11d1
        L_0x0432:
            boolean r0 = r4 instanceof java.util.List     // Catch:{ 8RX -> 0x1357 }
            if (r0 == 0) goto L_0x11e2
            java.util.List r4 = (java.util.List) r4     // Catch:{ 8RX -> 0x1357 }
            r0 = 4194303(0x3fffff, float:5.87747E-39)
            int r2 = r10.A0K(r5, r2, r0)     // Catch:{ 8RX -> 0x1357 }
            int r0 = r4.size()     // Catch:{ 8RX -> 0x1357 }
            if (r2 >= r0) goto L_0x0452
            java.lang.Object r0 = r4.get(r2)     // Catch:{ 8RX -> 0x1357 }
        L_0x0449:
            r10.A0R(r1, r0)     // Catch:{ 8RX -> 0x1357 }
        L_0x044c:
            r10.A0P(r1)     // Catch:{ 8RX -> 0x1357 }
            goto L_0x111d
        L_0x0451:
            r6 = 0
        L_0x0452:
            r0 = r6
            goto L_0x0449
        L_0x0454:
            short r1 = r18.getShort()     // Catch:{ 8RX -> 0x1357 }
            r0 = 65535(0xffff, float:9.1834E-41)
            r1 = r1 & r0
            java.lang.Object r0 = r15.A01(r1)     // Catch:{ 8RX -> 0x1357 }
            r10.A0V(r0)     // Catch:{ 8RX -> 0x1357 }
            goto L_0x111d
        L_0x0465:
            int r0 = r10.A01     // Catch:{ 8RX -> 0x1357 }
            int r4 = r0 + -1
            int r1 = r4 - r3
            java.lang.Object[] r0 = r10.A05     // Catch:{ 8RX -> 0x1357 }
            r2 = r0[r1]     // Catch:{ 8RX -> 0x1357 }
            r1 = r0[r4]     // Catch:{ 8RX -> 0x1357 }
            boolean r0 = r2 instanceof java.lang.String     // Catch:{ 8RX -> 0x1357 }
            if (r0 == 0) goto L_0x048d
            boolean r0 = r1 instanceof java.lang.String     // Catch:{ 8RX -> 0x1357 }
            if (r0 == 0) goto L_0x048d
            java.lang.StringBuilder r0 = X.AnonymousClass001.A0o()     // Catch:{ 8RX -> 0x1357 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ 8RX -> 0x1357 }
            r0.append(r2)     // Catch:{ 8RX -> 0x1357 }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ 8RX -> 0x1357 }
            java.lang.String r0 = X.AnonymousClass000.A0X(r1, r0)     // Catch:{ 8RX -> 0x1357 }
            r10.A0R(r3, r0)     // Catch:{ 8RX -> 0x1357 }
            goto L_0x0f4b
        L_0x048d:
            java.lang.String r1 = "+"
            r0 = 5
            r10.A0S(r0, r1)     // Catch:{ 8RX -> 0x1357 }
            goto L_0x111d
        L_0x0495:
            java.util.HashMap r0 = X.AnonymousClass001.A0t()     // Catch:{ 8RX -> 0x1357 }
            r10.A0V(r0)     // Catch:{ 8RX -> 0x1357 }
            goto L_0x111d
        L_0x049e:
            int r1 = X.AnonymousClass6CA.A07(r18)     // Catch:{ 8RX -> 0x1357 }
            int r4 = r1 + 1
            int r0 = r10.A01     // Catch:{ 8RX -> 0x1357 }
            int r2 = r0 + -1
            int r2 = r2 - r4
            java.lang.Object[] r0 = r10.A05     // Catch:{ 8RX -> 0x1357 }
            r2 = r0[r2]     // Catch:{ 8RX -> 0x1357 }
            boolean r0 = r2 instanceof X.C155787fV     // Catch:{ 8RX -> 0x1357 }
            if (r0 == 0) goto L_0x11fa
            X.7KA r7 = A03(r2)     // Catch:{ 8RX -> 0x1357 }
            r9 = 0
            java.lang.Object r6 = A08(r10)     // Catch:{ 8RX -> 0x1357 }
            boolean r0 = r6 instanceof java.util.List     // Catch:{ 8RX -> 0x1357 }
            if (r0 == 0) goto L_0x04d8
            java.util.List r6 = (java.util.List) r6     // Catch:{ 8RX -> 0x1357 }
            r2 = 32768(0x8000, float:4.5918E-41)
            int r2 = r2 - r1
            int r0 = r6.size()     // Catch:{ 8RX -> 0x1357 }
            if (r2 >= r0) goto L_0x04d2
            java.lang.String r0 = "too many arguments to bind"
            java.lang.RuntimeException r1 = A0A(r0)     // Catch:{ 8RX -> 0x1357 }
            goto L_0x1356
        L_0x04d2:
            int r2 = r6.size()     // Catch:{ 8RX -> 0x1357 }
            int r2 = r2 + r1
            goto L_0x04dc
        L_0x04d8:
            if (r6 != 0) goto L_0x11f2
            r6 = 0
            r2 = r1
        L_0x04dc:
            if (r2 == 0) goto L_0x0f4b
            java.lang.Object[] r0 = r7.A02     // Catch:{ 8RX -> 0x1357 }
            if (r0 == 0) goto L_0x04ea
            int r3 = r0.length     // Catch:{ 8RX -> 0x1357 }
            int r2 = r2 + r3
            java.lang.Object[] r5 = new java.lang.Object[r2]     // Catch:{ 8RX -> 0x1357 }
            java.lang.System.arraycopy(r0, r8, r5, r8, r3)     // Catch:{ 8RX -> 0x1357 }
            goto L_0x04ed
        L_0x04ea:
            java.lang.Object[] r5 = new java.lang.Object[r2]     // Catch:{ 8RX -> 0x1357 }
            r3 = 0
        L_0x04ed:
            if (r1 == 0) goto L_0x04fa
            int r0 = r10.A01     // Catch:{ 8RX -> 0x1357 }
            int r2 = r0 + -1
            int r2 = r2 - r1
            java.lang.Object[] r0 = r10.A05     // Catch:{ 8RX -> 0x1357 }
            java.lang.System.arraycopy(r0, r2, r5, r3, r1)     // Catch:{ 8RX -> 0x1357 }
            int r3 = r3 + r1
        L_0x04fa:
            if (r6 == 0) goto L_0x050e
            int r2 = r6.size()     // Catch:{ 8RX -> 0x1357 }
        L_0x0500:
            if (r9 >= r2) goto L_0x050e
            int r1 = r3 + 1
            java.lang.Object r0 = r6.get(r9)     // Catch:{ 8RX -> 0x1357 }
            r5[r3] = r0     // Catch:{ 8RX -> 0x1357 }
            int r9 = r9 + 1
            r3 = r1
            goto L_0x0500
        L_0x050e:
            X.7TT r1 = r7.A00     // Catch:{ 8RX -> 0x1357 }
            java.lang.Object r0 = r7.A01     // Catch:{ 8RX -> 0x1357 }
            X.7KA r3 = new X.7KA     // Catch:{ 8RX -> 0x1357 }
            r3.<init>(r1, r0, r5)     // Catch:{ 8RX -> 0x1357 }
            r2 = 0
            java.lang.Object r0 = r3.A01     // Catch:{ 8RX -> 0x1357 }
            X.8DF r1 = new X.8DF     // Catch:{ 8RX -> 0x1357 }
            r1.<init>(r2, r3, r0)     // Catch:{ 8RX -> 0x1357 }
            X.7fV r0 = new X.7fV     // Catch:{ 8RX -> 0x1357 }
            r0.<init>(r1)     // Catch:{ 8RX -> 0x1357 }
            r10.A0R(r4, r0)     // Catch:{ 8RX -> 0x1357 }
            r10.A0P(r4)     // Catch:{ 8RX -> 0x1357 }
            goto L_0x111d
        L_0x052c:
            int r4 = X.AnonymousClass6CA.A07(r18)     // Catch:{ 8RX -> 0x1357 }
            int r0 = r10.A01     // Catch:{ 8RX -> 0x1357 }
            int r0 = r0 + -1
            int r0 = r0 - r4
            java.lang.Object[] r3 = r10.A05     // Catch:{ 8RX -> 0x1357 }
            r2 = r3[r0]     // Catch:{ 8RX -> 0x1357 }
            boolean r0 = r2 instanceof X.C155787fV     // Catch:{ 8RX -> 0x1357 }
            if (r0 != 0) goto L_0x0545
            java.lang.String r0 = "op_call target is not a closure"
            java.lang.RuntimeException r1 = A09(r2, r0)     // Catch:{ 8RX -> 0x1357 }
            goto L_0x1356
        L_0x0545:
            r1 = 4
            int r0 = r10.A00     // Catch:{ 8RX -> 0x1357 }
            int r0 = r0 - r1
            r1 = r3[r0]     // Catch:{ 8RX -> 0x1357 }
            r0 = r16
            r10.A0W(r2, r1, r4, r0)     // Catch:{ 8RX -> 0x1357 }
            r10.A0N()     // Catch:{ 8RX -> 0x1357 }
            goto L_0x111d
        L_0x0555:
            int r2 = X.AnonymousClass6CA.A07(r18)     // Catch:{ 8RX -> 0x1357 }
            int r4 = X.AnonymousClass6CA.A07(r18)     // Catch:{ 8RX -> 0x1357 }
            X.7jN r9 = new X.7jN     // Catch:{ 8RX -> 0x1357 }
            r9.<init>(r10, r4)     // Catch:{ 8RX -> 0x1357 }
            switch(r2) {
                case 0: goto L_0x0583;
                case 1: goto L_0x0567;
                case 2: goto L_0x059f;
                case 3: goto L_0x05e0;
                case 4: goto L_0x0624;
                case 5: goto L_0x0667;
                case 6: goto L_0x0684;
                case 7: goto L_0x06ac;
                case 8: goto L_0x06fb;
                case 9: goto L_0x0792;
                case 10: goto L_0x07c8;
                case 11: goto L_0x0845;
                case 12: goto L_0x08f7;
                case 13: goto L_0x09c9;
                case 14: goto L_0x0aa0;
                case 15: goto L_0x0ab9;
                case 16: goto L_0x0b0a;
                case 17: goto L_0x0b39;
                case 18: goto L_0x067c;
                default: goto L_0x0565;
            }     // Catch:{ 8RX -> 0x1357 }
        L_0x0565:
            goto L_0x1211
        L_0x0567:
            int r0 = r9.A00     // Catch:{ 8RX -> 0x1357 }
            boolean r1 = X.AnonymousClass000.A1T(r0)
            java.lang.String r0 = "RuntimeRandom expects 0 arguments"
            X.AnonymousClass73P.A00(r0, r1)     // Catch:{ 8RX -> 0x1357 }
            X.7s4 r0 = r9.A02     // Catch:{ 8RX -> 0x1357 }
            java.util.Random r0 = r0.A07     // Catch:{ 8RX -> 0x1357 }
            double r0 = r0.nextDouble()     // Catch:{ 8RX -> 0x1357 }
            java.lang.Number r0 = X.C159427lo.A00(r0)     // Catch:{ 8RX -> 0x1357 }
            r9.A02(r0)     // Catch:{ 8RX -> 0x1357 }
            goto L_0x111d
        L_0x0583:
            int r0 = r9.A00     // Catch:{ 8RX -> 0x1357 }
            boolean r1 = X.AnonymousClass000.A1U(r0, r1)
            java.lang.String r0 = "VectorRemove requires 2 arguments"
            java.lang.Object r4 = A07(r9, r0, r8, r1)     // Catch:{ 8RX -> 0x1357 }
            java.lang.Object r3 = r9.A01(r3)     // Catch:{ 8RX -> 0x1357 }
            boolean r0 = r4 instanceof java.util.List     // Catch:{ 8RX -> 0x1357 }
            if (r0 != 0) goto L_0x0a84
            java.lang.String r0 = "VectorRemove 1st arg must be a vector"
            java.lang.RuntimeException r1 = A09(r4, r0)     // Catch:{ 8RX -> 0x1357 }
            goto L_0x1356
        L_0x059f:
            int r0 = r9.A00     // Catch:{ 8RX -> 0x1357 }
            boolean r1 = X.AnonymousClass6C9.A1M(r0)
            java.lang.String r0 = "ParseNumber requires one argument"
            java.lang.Object r1 = A07(r9, r0, r8, r1)     // Catch:{ 8RX -> 0x1357 }
            boolean r0 = A0H(r1)     // Catch:{ 8RX -> 0x1357 }
            if (r0 != 0) goto L_0x05d8
            boolean r0 = r1 instanceof java.lang.Long     // Catch:{ 8RX -> 0x1357 }
            if (r0 == 0) goto L_0x05bf
            long r2 = X.C18310x6.A0B(r1)     // Catch:{ 8RX -> 0x1357 }
            double r0 = (double) r2     // Catch:{ 8RX -> 0x1357 }
            java.lang.Number r1 = X.C159427lo.A00(r0)     // Catch:{ 8RX -> 0x1357 }
            goto L_0x05d8
        L_0x05bf:
            boolean r0 = r1 instanceof java.lang.String     // Catch:{ 8RX -> 0x1357 }
            if (r0 == 0) goto L_0x05d4
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ 8RX -> 0x1357 }
            boolean r0 = A0J(r1)     // Catch:{ 8RX -> 0x1357 }
            if (r0 != 0) goto L_0x05da
            double r0 = java.lang.Double.parseDouble(r1)     // Catch:{ NumberFormatException -> 0x05da }
            java.lang.Number r1 = X.C159427lo.A00(r0)     // Catch:{ NumberFormatException -> 0x05da }
            goto L_0x05d8
        L_0x05d4:
            java.lang.Number r1 = A04(r1)     // Catch:{ 8RX -> 0x1357 }
        L_0x05d8:
            if (r1 != 0) goto L_0x05db
        L_0x05da:
            r1 = 0
        L_0x05db:
            r9.A02(r1)     // Catch:{ 8RX -> 0x1357 }
            goto L_0x111d
        L_0x05e0:
            int r4 = r9.A00     // Catch:{ 8RX -> 0x1357 }
            r2 = 4
            boolean r4 = X.AnonymousClass000.A1U(r4, r2)
            java.lang.String r2 = "StringReplace requires 4 arguments"
            X.AnonymousClass73P.A00(r2, r4)     // Catch:{ 8RX -> 0x1357 }
            X.7s4 r5 = r9.A02     // Catch:{ 8RX -> 0x1357 }
            java.lang.Object r2 = r9.A01(r8)     // Catch:{ 8RX -> 0x1357 }
            java.lang.Object r4 = r5.A0L(r2)     // Catch:{ 8RX -> 0x1357 }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ 8RX -> 0x1357 }
            java.lang.Object r2 = r9.A01(r3)     // Catch:{ 8RX -> 0x1357 }
            java.lang.Object r2 = r5.A0L(r2)     // Catch:{ 8RX -> 0x1357 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ 8RX -> 0x1357 }
            java.lang.Object r1 = r9.A01(r1)     // Catch:{ 8RX -> 0x1357 }
            java.lang.Object r1 = r5.A0L(r1)     // Catch:{ 8RX -> 0x1357 }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ 8RX -> 0x1357 }
            java.lang.Object r0 = r9.A01(r0)     // Catch:{ 8RX -> 0x1357 }
            boolean r0 = A0I(r0)     // Catch:{ 8RX -> 0x1357 }
            if (r0 == 0) goto L_0x061f
            java.lang.String r0 = r4.replaceAll(r2, r1)     // Catch:{ 8RX -> 0x1357 }
        L_0x061a:
            r9.A02(r0)     // Catch:{ 8RX -> 0x1357 }
            goto L_0x111d
        L_0x061f:
            java.lang.String r0 = r4.replaceFirst(r2, r1)     // Catch:{ 8RX -> 0x1357 }
            goto L_0x061a
        L_0x0624:
            int r2 = r9.A00     // Catch:{ 8RX -> 0x1357 }
            boolean r2 = X.AnonymousClass000.A1U(r2, r0)
            java.lang.String r0 = "MapPutAll requires 3 arguments"
            java.lang.Object r2 = A07(r9, r0, r1, r2)     // Catch:{ 8RX -> 0x1357 }
            java.lang.Object r1 = r9.A01(r3)     // Catch:{ 8RX -> 0x1357 }
            boolean r0 = r1 instanceof java.util.Map     // Catch:{ 8RX -> 0x1357 }
            if (r0 != 0) goto L_0x0640
            java.lang.String r0 = "MapPutAll 2nd arg must be a Map"
            java.lang.RuntimeException r1 = A09(r1, r0)     // Catch:{ 8RX -> 0x1357 }
            goto L_0x1356
        L_0x0640:
            boolean r0 = r2 instanceof java.util.Map     // Catch:{ 8RX -> 0x1357 }
            if (r0 != 0) goto L_0x064c
            java.lang.String r0 = "MapPutAll 3rd arg must be a Map"
            java.lang.RuntimeException r1 = A09(r2, r0)     // Catch:{ 8RX -> 0x1357 }
            goto L_0x1356
        L_0x064c:
            java.util.Map r2 = (java.util.Map) r2     // Catch:{ 8RX -> 0x1357 }
            java.util.Map r1 = (java.util.Map) r1     // Catch:{ 8RX -> 0x1357 }
            java.lang.Object r0 = r9.A01(r8)     // Catch:{ 8RX -> 0x1357 }
            boolean r0 = A0I(r0)     // Catch:{ 8RX -> 0x1357 }
            if (r2 == r1) goto L_0x0661
            r1.putAll(r2)     // Catch:{ UnsupportedOperationException -> 0x065e }
            goto L_0x0661
        L_0x065e:
            r1 = move-exception
            if (r0 != 0) goto L_0x1356
        L_0x0661:
            r0 = 0
            r9.A02(r0)     // Catch:{ 8RX -> 0x1357 }
            goto L_0x111d
        L_0x0667:
            int r0 = r9.A00     // Catch:{ 8RX -> 0x1357 }
            java.util.ArrayList r2 = X.AnonymousClass002.A0I(r0)     // Catch:{ 8RX -> 0x1357 }
            r1 = 0
        L_0x066e:
            int r0 = r9.A00     // Catch:{ 8RX -> 0x1357 }
            if (r1 >= r0) goto L_0x06f6
            java.lang.Object r0 = r9.A01(r1)     // Catch:{ 8RX -> 0x1357 }
            r2.add(r0)     // Catch:{ 8RX -> 0x1357 }
            int r1 = r1 + 1
            goto L_0x066e
        L_0x067c:
            int r2 = r9.A00     // Catch:{ 8RX -> 0x1357 }
            boolean r2 = X.AnonymousClass000.A1U(r2, r0)
            goto L_0x0b63
        L_0x0684:
            int r1 = r9.A00     // Catch:{ 8RX -> 0x1357 }
            int r0 = r1 % 2
            if (r0 == 0) goto L_0x0692
            java.lang.String r0 = "MakeSmallMap requires an even number of arguments"
            java.lang.RuntimeException r1 = A0A(r0)     // Catch:{ 8RX -> 0x1357 }
            goto L_0x1356
        L_0x0692:
            int r3 = r1 / 2
            java.util.HashMap r4 = new java.util.HashMap     // Catch:{ 8RX -> 0x1357 }
            r4.<init>(r3)     // Catch:{ 8RX -> 0x1357 }
            r2 = 0
        L_0x069a:
            if (r2 >= r3) goto L_0x0b92
            java.lang.Object r1 = r9.A01(r2)     // Catch:{ 8RX -> 0x1357 }
            int r0 = r3 + r2
            java.lang.Object r0 = r9.A01(r0)     // Catch:{ 8RX -> 0x1357 }
            r4.put(r1, r0)     // Catch:{ 8RX -> 0x1357 }
            int r2 = r2 + 1
            goto L_0x069a
        L_0x06ac:
            int r0 = r9.A00     // Catch:{ 8RX -> 0x1357 }
            r4 = 0
            boolean r1 = X.AnonymousClass000.A1U(r0, r1)
            java.lang.String r0 = "MakeMap expects 2 arguments"
            java.lang.Object r5 = A07(r9, r0, r8, r1)     // Catch:{ 8RX -> 0x1357 }
            java.lang.Object r6 = r9.A01(r3)     // Catch:{ 8RX -> 0x1357 }
            boolean r0 = r5 instanceof java.util.List     // Catch:{ 8RX -> 0x1357 }
            if (r0 != 0) goto L_0x06c9
            java.lang.String r0 = "MakeMap arg 0 must be a list"
        L_0x06c3:
            java.lang.RuntimeException r1 = A0A(r0)     // Catch:{ 8RX -> 0x1357 }
            goto L_0x1356
        L_0x06c9:
            boolean r0 = r6 instanceof java.util.List     // Catch:{ 8RX -> 0x1357 }
            if (r0 != 0) goto L_0x06d0
            java.lang.String r0 = "MakeMap arg 1 must be a list"
            goto L_0x06c3
        L_0x06d0:
            java.util.List r5 = (java.util.List) r5     // Catch:{ 8RX -> 0x1357 }
            java.util.List r6 = (java.util.List) r6     // Catch:{ 8RX -> 0x1357 }
            int r3 = r5.size()     // Catch:{ 8RX -> 0x1357 }
            int r0 = r6.size()     // Catch:{ 8RX -> 0x1357 }
            if (r3 == r0) goto L_0x06e1
            java.lang.String r0 = "MakeMap different number keys/values"
            goto L_0x06c3
        L_0x06e1:
            java.util.HashMap r2 = new java.util.HashMap     // Catch:{ 8RX -> 0x1357 }
            r2.<init>(r3)     // Catch:{ 8RX -> 0x1357 }
        L_0x06e6:
            if (r4 >= r3) goto L_0x06f6
            java.lang.Object r1 = r5.get(r4)     // Catch:{ 8RX -> 0x1357 }
            java.lang.Object r0 = r6.get(r4)     // Catch:{ 8RX -> 0x1357 }
            r2.put(r1, r0)     // Catch:{ 8RX -> 0x1357 }
            int r4 = r4 + 1
            goto L_0x06e6
        L_0x06f6:
            r9.A02(r2)     // Catch:{ 8RX -> 0x1357 }
            goto L_0x111d
        L_0x06fb:
            int r0 = r9.A00     // Catch:{ 8RX -> 0x1357 }
            boolean r1 = X.AnonymousClass000.A1U(r0, r1)
            java.lang.String r0 = "ParseInt64 requires 2 arguments"
            java.lang.Object r1 = A07(r9, r0, r8, r1)     // Catch:{ 8RX -> 0x1357 }
            java.lang.Object r0 = r9.A01(r3)     // Catch:{ 8RX -> 0x1357 }
            boolean r24 = A0I(r0)     // Catch:{ 8RX -> 0x1357 }
            boolean r0 = A0H(r1)     // Catch:{ 8RX -> 0x1357 }
            if (r0 == 0) goto L_0x071f
            double r2 = X.AnonymousClass6C9.A02(r1)     // Catch:{ 8RX -> 0x1357 }
            long r0 = (long) r2     // Catch:{ 8RX -> 0x1357 }
            java.lang.Long r1 = java.lang.Long.valueOf(r0)     // Catch:{ 8RX -> 0x1357 }
            goto L_0x078a
        L_0x071f:
            boolean r0 = r1 instanceof java.lang.Long     // Catch:{ 8RX -> 0x1357 }
            if (r0 != 0) goto L_0x078a
            boolean r0 = r1 instanceof java.lang.String     // Catch:{ 8RX -> 0x1357 }
            if (r0 == 0) goto L_0x0786
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ 8RX -> 0x1357 }
            boolean r0 = A0J(r1)     // Catch:{ 8RX -> 0x1357 }
            if (r0 != 0) goto L_0x078c
            java.lang.String r7 = r1.trim()     // Catch:{ 8RX -> 0x1357 }
            int r6 = r7.length()     // Catch:{ NumberFormatException -> 0x078c }
            if (r6 == 0) goto L_0x078c
            r5 = 0
            char r1 = r7.charAt(r8)     // Catch:{ NumberFormatException -> 0x078c }
            r0 = 45
            r8 = 1
            if (r1 != r0) goto L_0x0747
            r22 = -9223372036854775808
            r5 = 1
            goto L_0x0752
        L_0x0747:
            r0 = 43
            r22 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r1 != r0) goto L_0x0751
            r5 = 1
        L_0x0751:
            r8 = 0
        L_0x0752:
            if (r5 == r6) goto L_0x078c
            r20 = 10
            long r13 = r22 / r20
            r2 = 0
        L_0x075a:
            if (r5 >= r6) goto L_0x077e
            char r0 = r7.charAt(r5)     // Catch:{ NumberFormatException -> 0x078c }
            int r1 = r0 + -48
            if (r1 < 0) goto L_0x078c
            r0 = 9
            if (r1 > r0) goto L_0x078c
            int r0 = (r2 > r13 ? 1 : (r2 == r13 ? 0 : -1))
            if (r0 < 0) goto L_0x0779
            long r2 = r2 * r20
            long r0 = (long) r1     // Catch:{ NumberFormatException -> 0x078c }
            long r11 = r22 + r0
            int r4 = (r2 > r11 ? 1 : (r2 == r11 ? 0 : -1))
            if (r4 < 0) goto L_0x0779
            long r2 = r2 - r0
        L_0x0776:
            int r5 = r5 + 1
            goto L_0x075a
        L_0x0779:
            if (r24 == 0) goto L_0x078c
            r2 = r22
            goto L_0x0776
        L_0x077e:
            if (r8 != 0) goto L_0x0781
            long r2 = -r2
        L_0x0781:
            java.lang.Long r1 = java.lang.Long.valueOf(r2)     // Catch:{ NumberFormatException -> 0x078c }
            goto L_0x078a
        L_0x0786:
            java.lang.Number r1 = A06(r1)     // Catch:{ 8RX -> 0x1357 }
        L_0x078a:
            if (r1 != 0) goto L_0x078d
        L_0x078c:
            r1 = 0
        L_0x078d:
            r9.A02(r1)     // Catch:{ 8RX -> 0x1357 }
            goto L_0x111d
        L_0x0792:
            int r0 = r9.A00     // Catch:{ 8RX -> 0x1357 }
            boolean r1 = X.AnonymousClass6C9.A1M(r0)
            java.lang.String r0 = "IsFinite expects 1 argument"
            java.lang.Object r0 = A07(r9, r0, r8, r1)     // Catch:{ 8RX -> 0x1357 }
            java.lang.Number r0 = A04(r0)     // Catch:{ 8RX -> 0x1357 }
            if (r0 != 0) goto L_0x07ac
            java.lang.String r0 = "IsFinite argument must be numeric"
            java.lang.RuntimeException r1 = A0A(r0)     // Catch:{ 8RX -> 0x1357 }
            goto L_0x1356
        L_0x07ac:
            double r0 = r0.doubleValue()     // Catch:{ 8RX -> 0x1357 }
            double r3 = java.lang.Math.abs(r0)     // Catch:{ 8RX -> 0x1357 }
            r1 = 9218868437227405311(0x7fefffffffffffff, double:1.7976931348623157E308)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            boolean r0 = X.AnonymousClass0x7.A1P(r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ 8RX -> 0x1357 }
            r9.A02(r0)     // Catch:{ 8RX -> 0x1357 }
            goto L_0x111d
        L_0x07c8:
            int r2 = r9.A00     // Catch:{ 8RX -> 0x1357 }
            boolean r2 = X.AnonymousClass000.A1U(r2, r0)
            java.lang.String r0 = "Substring expects 3 arguments"
            java.lang.Object r0 = A07(r9, r0, r8, r2)     // Catch:{ 8RX -> 0x1357 }
            boolean r0 = r0 instanceof java.lang.String     // Catch:{ 8RX -> 0x1357 }
            if (r0 != 0) goto L_0x07e0
            java.lang.String r0 = "Substring 1st arg must be a string"
        L_0x07da:
            java.lang.RuntimeException r1 = A0A(r0)     // Catch:{ 8RX -> 0x1357 }
            goto L_0x1356
        L_0x07e0:
            java.lang.Object r11 = r9.A01(r8)     // Catch:{ 8RX -> 0x1357 }
            java.lang.String r11 = (java.lang.String) r11     // Catch:{ 8RX -> 0x1357 }
            double r6 = A00(r9, r3)     // Catch:{ 8RX -> 0x1357 }
            boolean r0 = X.C158067jN.A00(r6)     // Catch:{ 8RX -> 0x1357 }
            if (r0 != 0) goto L_0x07f3
            java.lang.String r0 = "Substring 2nd arg must be an integer"
            goto L_0x07da
        L_0x07f3:
            java.lang.Object r0 = r9.A01(r1)     // Catch:{ 8RX -> 0x1357 }
            if (r0 != 0) goto L_0x07fa
            goto L_0x0807
        L_0x07fa:
            double r4 = A00(r9, r1)     // Catch:{ 8RX -> 0x1357 }
            boolean r0 = X.C158067jN.A00(r4)     // Catch:{ 8RX -> 0x1357 }
            if (r0 != 0) goto L_0x0809
            java.lang.String r0 = "Substring 3rd arg must be an integer or null"
            goto L_0x07da
        L_0x0807:
            r4 = 9221120237041090560(0x7ff8000000000000, double:NaN)
        L_0x0809:
            int r12 = r11.length()     // Catch:{ 8RX -> 0x1357 }
            int r0 = (r6 > r22 ? 1 : (r6 == r22 ? 0 : -1))
            if (r0 >= 0) goto L_0x0813
            double r0 = (double) r12     // Catch:{ 8RX -> 0x1357 }
            double r6 = r6 + r0
        L_0x0813:
            int r0 = (r6 > r22 ? 1 : (r6 == r22 ? 0 : -1))
            if (r0 < 0) goto L_0x1227
            double r2 = (double) r12     // Catch:{ 8RX -> 0x1357 }
            int r0 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r0 > 0) goto L_0x1227
            int r13 = (int) r6     // Catch:{ 8RX -> 0x1357 }
            boolean r0 = java.lang.Double.isNaN(r4)     // Catch:{ 8RX -> 0x1357 }
            if (r0 != 0) goto L_0x082f
            int r0 = (r4 > r22 ? 1 : (r4 == r22 ? 0 : -1))
            if (r0 < 0) goto L_0x1224
            double r0 = (double) r13     // Catch:{ 8RX -> 0x1357 }
            double r0 = r0 + r4
            int r6 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r6 > 0) goto L_0x1224
            int r0 = (int) r4     // Catch:{ 8RX -> 0x1357 }
            goto L_0x0831
        L_0x082f:
            int r0 = r12 - r13
        L_0x0831:
            if (r13 != 0) goto L_0x0836
            if (r0 != r12) goto L_0x0836
            goto L_0x083c
        L_0x0836:
            int r0 = r0 + r13
            java.lang.String r0 = r11.substring(r13, r0)     // Catch:{ 8RX -> 0x1357 }
            goto L_0x0840
        L_0x083c:
            java.lang.Object r0 = r9.A01(r8)     // Catch:{ 8RX -> 0x1357 }
        L_0x0840:
            r9.A02(r0)     // Catch:{ 8RX -> 0x1357 }
            goto L_0x111d
        L_0x0845:
            int r4 = r9.A00     // Catch:{ 8RX -> 0x1357 }
            r2 = 4
            boolean r4 = X.AnonymousClass000.A1U(r4, r2)
            java.lang.String r2 = "SubstringCompare expects 4 arguments"
            java.lang.Object r2 = A07(r9, r2, r8, r4)     // Catch:{ 8RX -> 0x1357 }
            boolean r2 = r2 instanceof java.lang.String     // Catch:{ 8RX -> 0x1357 }
            if (r2 != 0) goto L_0x085e
            java.lang.String r0 = "SubstringCompare 1st arg must be a string"
        L_0x0858:
            java.lang.RuntimeException r1 = A0A(r0)     // Catch:{ 8RX -> 0x1357 }
            goto L_0x1356
        L_0x085e:
            java.lang.Object r11 = r9.A01(r8)     // Catch:{ 8RX -> 0x1357 }
            java.lang.String r11 = (java.lang.String) r11     // Catch:{ 8RX -> 0x1357 }
            java.lang.Object r2 = r9.A01(r3)     // Catch:{ 8RX -> 0x1357 }
            boolean r2 = r2 instanceof java.lang.String     // Catch:{ 8RX -> 0x1357 }
            if (r2 != 0) goto L_0x086f
            java.lang.String r0 = "SubstringCompare 2nd arg must be a string"
            goto L_0x0858
        L_0x086f:
            java.lang.Object r8 = r9.A01(r3)     // Catch:{ 8RX -> 0x1357 }
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ 8RX -> 0x1357 }
            java.lang.Object r2 = r9.A01(r1)     // Catch:{ 8RX -> 0x1357 }
            boolean r2 = X.AnonymousClass000.A1X(r2)
            r4 = 9221120237041090560(0x7ff8000000000000, double:NaN)
            if (r2 != 0) goto L_0x088e
            double r6 = A00(r9, r1)     // Catch:{ 8RX -> 0x1357 }
            boolean r1 = X.C158067jN.A00(r6)     // Catch:{ 8RX -> 0x1357 }
            if (r1 != 0) goto L_0x0890
            java.lang.String r0 = "SubstringCompare 3rd arg must be an integer or null"
            goto L_0x0858
        L_0x088e:
            r6 = 9221120237041090560(0x7ff8000000000000, double:NaN)
        L_0x0890:
            java.lang.Object r1 = r9.A01(r0)     // Catch:{ 8RX -> 0x1357 }
            if (r1 == 0) goto L_0x08a3
            double r4 = A00(r9, r0)     // Catch:{ 8RX -> 0x1357 }
            boolean r0 = X.C158067jN.A00(r4)     // Catch:{ 8RX -> 0x1357 }
            if (r0 != 0) goto L_0x08a3
            java.lang.String r0 = "SubstringCompare 4th arg must be an integer or null"
            goto L_0x0858
        L_0x08a3:
            int r12 = r11.length()     // Catch:{ 8RX -> 0x1357 }
            boolean r0 = java.lang.Double.isNaN(r6)     // Catch:{ 8RX -> 0x1357 }
            r20 = 0
            if (r0 == 0) goto L_0x08b0
            goto L_0x08bb
        L_0x08b0:
            int r0 = (r6 > r22 ? 1 : (r6 == r22 ? 0 : -1))
            if (r0 >= 0) goto L_0x08b6
            double r0 = (double) r12     // Catch:{ 8RX -> 0x1357 }
            double r6 = r6 + r0
        L_0x08b6:
            int r0 = (r6 > r22 ? 1 : (r6 == r22 ? 0 : -1))
            if (r0 < 0) goto L_0x1235
            goto L_0x08bd
        L_0x08bb:
            r6 = 0
        L_0x08bd:
            double r2 = (double) r12     // Catch:{ 8RX -> 0x1357 }
            int r0 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r0 > 0) goto L_0x1235
            int r13 = (int) r6     // Catch:{ 8RX -> 0x1357 }
            boolean r0 = java.lang.Double.isNaN(r4)     // Catch:{ 8RX -> 0x1357 }
            if (r0 != 0) goto L_0x08d5
            int r0 = (r4 > r22 ? 1 : (r4 == r22 ? 0 : -1))
            if (r0 < 0) goto L_0x1232
            double r0 = (double) r13     // Catch:{ 8RX -> 0x1357 }
            double r0 = r0 + r4
            int r6 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r6 > 0) goto L_0x1232
            int r0 = (int) r4     // Catch:{ 8RX -> 0x1357 }
            goto L_0x08d7
        L_0x08d5:
            int r0 = r12 - r13
        L_0x08d7:
            if (r13 != 0) goto L_0x08dc
            if (r0 != r12) goto L_0x08dc
            goto L_0x08e1
        L_0x08dc:
            int r0 = r0 + r13
            java.lang.String r11 = r11.substring(r13, r0)     // Catch:{ 8RX -> 0x1357 }
        L_0x08e1:
            int r0 = r11.compareTo(r8)     // Catch:{ 8RX -> 0x1357 }
            if (r0 >= 0) goto L_0x08ea
            r20 = -4616189618054758400(0xbff0000000000000, double:-1.0)
            goto L_0x08ee
        L_0x08ea:
            if (r0 == 0) goto L_0x08ee
            r20 = 4607182418800017408(0x3ff0000000000000, double:1.0)
        L_0x08ee:
            java.lang.Number r0 = X.C159427lo.A00(r20)     // Catch:{ 8RX -> 0x1357 }
            r9.A02(r0)     // Catch:{ 8RX -> 0x1357 }
            goto L_0x111d
        L_0x08f7:
            int r4 = r9.A00     // Catch:{ 8RX -> 0x1357 }
            r2 = 5
            boolean r4 = X.AnonymousClass000.A1U(r4, r2)
            java.lang.String r2 = "StringSearch expects 5 arguments"
            java.lang.Object r2 = A07(r9, r2, r8, r4)     // Catch:{ 8RX -> 0x1357 }
            boolean r2 = r2 instanceof java.lang.String     // Catch:{ 8RX -> 0x1357 }
            if (r2 != 0) goto L_0x0910
            java.lang.String r0 = "StringSearch 1st arg must be a string"
        L_0x090a:
            java.lang.RuntimeException r1 = A0A(r0)     // Catch:{ 8RX -> 0x1357 }
            goto L_0x1356
        L_0x0910:
            java.lang.Object r11 = r9.A01(r8)     // Catch:{ 8RX -> 0x1357 }
            java.lang.String r11 = (java.lang.String) r11     // Catch:{ 8RX -> 0x1357 }
            java.lang.Object r2 = r9.A01(r3)     // Catch:{ 8RX -> 0x1357 }
            boolean r2 = r2 instanceof java.lang.String     // Catch:{ 8RX -> 0x1357 }
            if (r2 != 0) goto L_0x0921
            java.lang.String r0 = "StringSearch 2nd arg must be a string"
            goto L_0x090a
        L_0x0921:
            java.lang.Object r8 = r9.A01(r3)     // Catch:{ 8RX -> 0x1357 }
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ 8RX -> 0x1357 }
            java.lang.Object r2 = r9.A01(r1)     // Catch:{ 8RX -> 0x1357 }
            boolean r2 = X.AnonymousClass000.A1X(r2)
            r4 = 9221120237041090560(0x7ff8000000000000, double:NaN)
            if (r2 != 0) goto L_0x0940
            double r6 = A00(r9, r1)     // Catch:{ 8RX -> 0x1357 }
            boolean r1 = X.C158067jN.A00(r6)     // Catch:{ 8RX -> 0x1357 }
            if (r1 != 0) goto L_0x0942
            java.lang.String r0 = "StringSearch 3rd arg must be an integer or null"
            goto L_0x090a
        L_0x0940:
            r6 = 9221120237041090560(0x7ff8000000000000, double:NaN)
        L_0x0942:
            java.lang.Object r1 = r9.A01(r0)     // Catch:{ 8RX -> 0x1357 }
            if (r1 == 0) goto L_0x0955
            double r4 = A00(r9, r0)     // Catch:{ 8RX -> 0x1357 }
            boolean r0 = X.C158067jN.A00(r4)     // Catch:{ 8RX -> 0x1357 }
            if (r0 != 0) goto L_0x0955
            java.lang.String r0 = "StringSearch 4th arg must be an integer or null"
            goto L_0x090a
        L_0x0955:
            r1 = 4
            java.lang.Object r0 = r9.A01(r1)     // Catch:{ 8RX -> 0x1357 }
            boolean r0 = r0 instanceof java.lang.Boolean     // Catch:{ 8RX -> 0x1357 }
            if (r0 != 0) goto L_0x0961
            java.lang.String r0 = "StringSearch 5th arg must be a boolean"
            goto L_0x090a
        L_0x0961:
            java.lang.Object r0 = r9.A01(r1)     // Catch:{ 8RX -> 0x1357 }
            boolean r14 = X.AnonymousClass001.A1Z(r0)     // Catch:{ 8RX -> 0x1357 }
            int r12 = r11.length()     // Catch:{ 8RX -> 0x1357 }
            boolean r0 = java.lang.Double.isNaN(r6)     // Catch:{ 8RX -> 0x1357 }
            if (r0 == 0) goto L_0x0974
            goto L_0x097f
        L_0x0974:
            int r0 = (r6 > r22 ? 1 : (r6 == r22 ? 0 : -1))
            if (r0 >= 0) goto L_0x097a
            double r0 = (double) r12     // Catch:{ 8RX -> 0x1357 }
            double r6 = r6 + r0
        L_0x097a:
            int r0 = (r6 > r22 ? 1 : (r6 == r22 ? 0 : -1))
            if (r0 < 0) goto L_0x1243
            goto L_0x0981
        L_0x097f:
            r6 = 0
        L_0x0981:
            double r2 = (double) r12     // Catch:{ 8RX -> 0x1357 }
            int r0 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r0 > 0) goto L_0x1243
            int r13 = (int) r6     // Catch:{ 8RX -> 0x1357 }
            boolean r0 = java.lang.Double.isNaN(r4)     // Catch:{ 8RX -> 0x1357 }
            if (r0 != 0) goto L_0x0999
            int r0 = (r4 > r22 ? 1 : (r4 == r22 ? 0 : -1))
            if (r0 < 0) goto L_0x1240
            double r0 = (double) r13     // Catch:{ 8RX -> 0x1357 }
            double r0 = r0 + r4
            int r6 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r6 > 0) goto L_0x1240
            int r1 = (int) r4     // Catch:{ 8RX -> 0x1357 }
            goto L_0x099b
        L_0x0999:
            int r1 = r12 - r13
        L_0x099b:
            int r0 = r8.length()     // Catch:{ 8RX -> 0x1357 }
            if (r0 == 0) goto L_0x09bc
            if (r0 > r1) goto L_0x09bc
            if (r13 != 0) goto L_0x09aa
            if (r1 != r12) goto L_0x09aa
        L_0x09a7:
            if (r14 == 0) goto L_0x09b5
            goto L_0x09b0
        L_0x09aa:
            int r1 = r1 + r13
            java.lang.String r11 = r11.substring(r13, r1)     // Catch:{ 8RX -> 0x1357 }
            goto L_0x09a7
        L_0x09b0:
            int r0 = r11.lastIndexOf(r8)     // Catch:{ 8RX -> 0x1357 }
            goto L_0x09b9
        L_0x09b5:
            int r0 = r11.indexOf(r8)     // Catch:{ 8RX -> 0x1357 }
        L_0x09b9:
            if (r0 < 0) goto L_0x09bc
            goto L_0x09be
        L_0x09bc:
            r0 = 0
            goto L_0x09c4
        L_0x09be:
            int r0 = r0 + r13
            double r0 = (double) r0     // Catch:{ 8RX -> 0x1357 }
            java.lang.Number r0 = X.C159427lo.A00(r0)     // Catch:{ 8RX -> 0x1357 }
        L_0x09c4:
            r9.A02(r0)     // Catch:{ 8RX -> 0x1357 }
            goto L_0x111d
        L_0x09c9:
            int r4 = r9.A00     // Catch:{ 8RX -> 0x1357 }
            r2 = 5
            boolean r4 = X.AnonymousClass000.A1U(r4, r2)
            java.lang.String r2 = "ArrayCopy expects 5 arguments"
            java.lang.Object r2 = A07(r9, r2, r8, r4)     // Catch:{ 8RX -> 0x1357 }
            boolean r2 = r2 instanceof java.util.List     // Catch:{ 8RX -> 0x1357 }
            if (r2 != 0) goto L_0x09e2
            java.lang.String r0 = "ArrayCopy 1st argument must be an array"
        L_0x09dc:
            java.lang.RuntimeException r1 = A0A(r0)     // Catch:{ 8RX -> 0x1357 }
            goto L_0x1356
        L_0x09e2:
            java.lang.Object r8 = r9.A01(r8)     // Catch:{ 8RX -> 0x1357 }
            java.util.List r8 = (java.util.List) r8     // Catch:{ 8RX -> 0x1357 }
            double r6 = A00(r9, r3)     // Catch:{ 8RX -> 0x1357 }
            boolean r2 = X.C158067jN.A00(r6)     // Catch:{ 8RX -> 0x1357 }
            if (r2 != 0) goto L_0x09f5
            java.lang.String r0 = "ArrayCopy 2nd argument must be an integer"
            goto L_0x09dc
        L_0x09f5:
            java.lang.Object r2 = r9.A01(r1)     // Catch:{ 8RX -> 0x1357 }
            boolean r2 = r2 instanceof java.util.List     // Catch:{ 8RX -> 0x1357 }
            if (r2 != 0) goto L_0x0a00
            java.lang.String r0 = "ArrayCopy 3rd argument must be an array"
            goto L_0x09dc
        L_0x0a00:
            java.lang.Object r5 = r9.A01(r1)     // Catch:{ 8RX -> 0x1357 }
            java.util.List r5 = (java.util.List) r5     // Catch:{ 8RX -> 0x1357 }
            double r0 = A00(r9, r0)     // Catch:{ 8RX -> 0x1357 }
            boolean r2 = X.C158067jN.A00(r0)     // Catch:{ 8RX -> 0x1357 }
            if (r2 != 0) goto L_0x0a13
            java.lang.String r0 = "ArrayCopy 4th argument must be an integer"
            goto L_0x09dc
        L_0x0a13:
            r2 = 4
            double r3 = A00(r9, r2)     // Catch:{ 8RX -> 0x1357 }
            boolean r2 = X.C158067jN.A00(r3)     // Catch:{ 8RX -> 0x1357 }
            if (r2 != 0) goto L_0x0a21
            java.lang.String r0 = "ArrayCopy 5th argument must be an integer"
            goto L_0x09dc
        L_0x0a21:
            int r2 = r8.size()     // Catch:{ 8RX -> 0x1357 }
            int r14 = r5.size()     // Catch:{ 8RX -> 0x1357 }
            int r11 = (r6 > r22 ? 1 : (r6 == r22 ? 0 : -1))
            if (r11 >= 0) goto L_0x0a2f
            double r11 = (double) r2     // Catch:{ 8RX -> 0x1357 }
            double r6 = r6 + r11
        L_0x0a2f:
            int r11 = (r6 > r22 ? 1 : (r6 == r22 ? 0 : -1))
            if (r11 < 0) goto L_0x1278
            double r12 = (double) r2     // Catch:{ 8RX -> 0x1357 }
            int r2 = (r6 > r12 ? 1 : (r6 == r12 ? 0 : -1))
            if (r2 > 0) goto L_0x1278
            int r2 = (int) r6     // Catch:{ 8RX -> 0x1357 }
            int r6 = (r0 > r22 ? 1 : (r0 == r22 ? 0 : -1))
            if (r6 >= 0) goto L_0x0a3f
            double r6 = (double) r14     // Catch:{ 8RX -> 0x1357 }
            double r0 = r0 + r6
        L_0x0a3f:
            int r6 = (r0 > r22 ? 1 : (r0 == r22 ? 0 : -1))
            if (r6 < 0) goto L_0x126d
            double r6 = (double) r14     // Catch:{ 8RX -> 0x1357 }
            int r11 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r11 > 0) goto L_0x126d
            int r11 = (int) r0     // Catch:{ 8RX -> 0x1357 }
            int r0 = (r3 > r22 ? 1 : (r3 == r22 ? 0 : -1))
            if (r0 < 0) goto L_0x1262
            double r0 = (double) r2     // Catch:{ 8RX -> 0x1357 }
            double r0 = r0 + r3
            int r14 = (r0 > r12 ? 1 : (r0 == r12 ? 0 : -1))
            if (r14 > 0) goto L_0x1262
            double r0 = (double) r11     // Catch:{ 8RX -> 0x1357 }
            double r0 = r0 + r3
            int r12 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r12 > 0) goto L_0x1262
            int r0 = (int) r3     // Catch:{ 8RX -> 0x1357 }
            if (r8 != r5) goto L_0x0a71
            if (r11 <= r2) goto L_0x0a71
            int r2 = r2 + r0
            int r11 = r11 + r0
        L_0x0a60:
            int r1 = r0 + -1
            if (r0 == 0) goto L_0x0a9a
            int r11 = r11 + -1
            int r2 = r2 + -1
            java.lang.Object r0 = r8.get(r2)     // Catch:{ UnsupportedOperationException -> 0x124e }
            r5.set(r11, r0)     // Catch:{ UnsupportedOperationException -> 0x124e }
            r0 = r1
            goto L_0x0a60
        L_0x0a71:
            int r4 = r0 + -1
            if (r0 == 0) goto L_0x0a9a
            int r3 = r11 + 1
            int r1 = r2 + 1
            java.lang.Object r0 = r8.get(r2)     // Catch:{ UnsupportedOperationException -> 0x124e }
            r5.set(r11, r0)     // Catch:{ UnsupportedOperationException -> 0x124e }
            r11 = r3
            r0 = r4
            r2 = r1
            goto L_0x0a71
        L_0x0a84:
            java.util.List r4 = (java.util.List) r4     // Catch:{ 8RX -> 0x1357 }
            X.7s4 r2 = r9.A02     // Catch:{ 8RX -> 0x1357 }
            r1 = 4194303(0x3fffff, float:5.87747E-39)
            java.lang.String r0 = "VectorRemove invalid vector index"
            int r1 = r2.A0K(r3, r0, r1)     // Catch:{ 8RX -> 0x1357 }
            int r0 = r4.size()     // Catch:{ 8RX -> 0x1357 }
            if (r1 >= r0) goto L_0x0a9a
            r4.remove(r1)     // Catch:{ 8RX -> 0x1357 }
        L_0x0a9a:
            r0 = 0
            r9.A02(r0)     // Catch:{ 8RX -> 0x1357 }
            goto L_0x111d
        L_0x0aa0:
            int r0 = r9.A00     // Catch:{ 8RX -> 0x1357 }
            boolean r1 = X.AnonymousClass000.A1T(r0)
            java.lang.String r0 = "CurrentTimeMillis expects no arguments"
            X.AnonymousClass73P.A00(r0, r1)     // Catch:{ 8RX -> 0x1357 }
            long r2 = java.lang.System.currentTimeMillis()     // Catch:{ 8RX -> 0x1357 }
            double r0 = (double) r2     // Catch:{ 8RX -> 0x1357 }
            java.lang.Number r0 = X.C159427lo.A00(r0)     // Catch:{ 8RX -> 0x1357 }
            r9.A02(r0)     // Catch:{ 8RX -> 0x1357 }
            goto L_0x111d
        L_0x0ab9:
            int r0 = r9.A00     // Catch:{ 8RX -> 0x1357 }
            boolean r1 = X.AnonymousClass000.A1U(r0, r1)
            java.lang.String r0 = "MapKeysValues expects 2 arguments"
            java.lang.Object r0 = A07(r9, r0, r8, r1)     // Catch:{ 8RX -> 0x1357 }
            boolean r0 = r0 instanceof java.util.Map     // Catch:{ 8RX -> 0x1357 }
            if (r0 != 0) goto L_0x0ad1
            java.lang.String r0 = "MapKeysValues 1st arg must be a map"
        L_0x0acb:
            java.lang.RuntimeException r1 = A0A(r0)     // Catch:{ 8RX -> 0x1357 }
            goto L_0x1356
        L_0x0ad1:
            java.lang.Object r1 = r9.A01(r8)     // Catch:{ 8RX -> 0x1357 }
            java.util.Map r1 = (java.util.Map) r1     // Catch:{ 8RX -> 0x1357 }
            java.lang.Object r0 = r9.A01(r3)     // Catch:{ 8RX -> 0x1357 }
            boolean r0 = r0 instanceof java.lang.Boolean     // Catch:{ 8RX -> 0x1357 }
            if (r0 != 0) goto L_0x0ae2
            java.lang.String r0 = "MapKeysValues 2nd arg must be a boolean"
            goto L_0x0acb
        L_0x0ae2:
            java.lang.Object r0 = r9.A01(r3)     // Catch:{ 8RX -> 0x1357 }
            boolean r0 = X.AnonymousClass001.A1Z(r0)     // Catch:{ 8RX -> 0x1357 }
            if (r0 == 0) goto L_0x0b01
            java.util.Set r0 = r1.keySet()     // Catch:{ 8RX -> 0x1357 }
            java.lang.Object[] r0 = r0.toArray()     // Catch:{ 8RX -> 0x1357 }
        L_0x0af4:
            java.util.ArrayList r0 = X.AnonymousClass0x2.A0i(r0)     // Catch:{ 8RX -> 0x1357 }
            java.util.List r0 = java.util.Collections.unmodifiableList(r0)     // Catch:{ 8RX -> 0x1357 }
            r9.A02(r0)     // Catch:{ 8RX -> 0x1357 }
            goto L_0x111d
        L_0x0b01:
            java.util.Collection r0 = r1.values()     // Catch:{ 8RX -> 0x1357 }
            java.lang.Object[] r0 = r0.toArray()     // Catch:{ 8RX -> 0x1357 }
            goto L_0x0af4
        L_0x0b0a:
            int r0 = r9.A00     // Catch:{ 8RX -> 0x1357 }
            boolean r1 = X.AnonymousClass000.A1U(r0, r1)
            java.lang.String r0 = "MapHasValue expects 2 arguments"
            java.lang.Object r0 = A07(r9, r0, r8, r1)     // Catch:{ 8RX -> 0x1357 }
            boolean r0 = r0 instanceof java.util.Map     // Catch:{ 8RX -> 0x1357 }
            if (r0 != 0) goto L_0x0b22
            java.lang.String r0 = "MapHasValue 1st arg must be a map"
            java.lang.RuntimeException r1 = A0A(r0)     // Catch:{ 8RX -> 0x1357 }
            goto L_0x1356
        L_0x0b22:
            java.lang.Object r1 = r9.A01(r8)     // Catch:{ 8RX -> 0x1357 }
            java.util.Map r1 = (java.util.Map) r1     // Catch:{ 8RX -> 0x1357 }
            java.lang.Object r0 = r9.A01(r3)     // Catch:{ 8RX -> 0x1357 }
            boolean r0 = r1.containsValue(r0)     // Catch:{ 8RX -> 0x1357 }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ 8RX -> 0x1357 }
            r9.A02(r0)     // Catch:{ 8RX -> 0x1357 }
            goto L_0x111d
        L_0x0b39:
            int r1 = r9.A00     // Catch:{ 8RX -> 0x1357 }
            int r0 = r1 % 2
            if (r0 == 0) goto L_0x0b47
            java.lang.String r0 = "MakeSmallMapKV requires an even number of arguments"
            java.lang.RuntimeException r1 = A0A(r0)     // Catch:{ 8RX -> 0x1357 }
            goto L_0x1356
        L_0x0b47:
            int r0 = r1 / 2
            java.util.HashMap r4 = new java.util.HashMap     // Catch:{ 8RX -> 0x1357 }
            r4.<init>(r0)     // Catch:{ 8RX -> 0x1357 }
            r2 = 0
        L_0x0b4f:
            int r0 = r9.A00     // Catch:{ 8RX -> 0x1357 }
            if (r2 >= r0) goto L_0x0b92
            java.lang.Object r1 = r9.A01(r2)     // Catch:{ 8RX -> 0x1357 }
            int r0 = r2 + 1
            java.lang.Object r0 = r9.A01(r0)     // Catch:{ 8RX -> 0x1357 }
            r4.put(r1, r0)     // Catch:{ 8RX -> 0x1357 }
            int r2 = r2 + 2
            goto L_0x0b4f
        L_0x0b63:
            java.lang.String r0 = "StringReplaceAll requires 3 arguments"
            X.AnonymousClass73P.A00(r0, r2)     // Catch:{ 8RX -> 0x1357 }
            X.7s4 r5 = r9.A02     // Catch:{ 8RX -> 0x1357 }
            java.lang.Object r0 = r9.A01(r8)     // Catch:{ 8RX -> 0x1357 }
            java.lang.Object r4 = r5.A0L(r0)     // Catch:{ 8RX -> 0x1357 }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ 8RX -> 0x1357 }
            java.lang.Object r0 = r9.A01(r3)     // Catch:{ 8RX -> 0x1357 }
            java.lang.Object r2 = r5.A0L(r0)     // Catch:{ 8RX -> 0x1357 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ 8RX -> 0x1357 }
            java.lang.Object r0 = r9.A01(r1)     // Catch:{ 8RX -> 0x1357 }
            java.lang.Object r1 = r5.A0L(r0)     // Catch:{ 8RX -> 0x1357 }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ 8RX -> 0x1357 }
            boolean r0 = r2.isEmpty()     // Catch:{ 8RX -> 0x1357 }
            if (r0 != 0) goto L_0x0b92
            java.lang.String r4 = r4.replace(r2, r1)     // Catch:{ 8RX -> 0x1357 }
        L_0x0b92:
            r9.A02(r4)     // Catch:{ 8RX -> 0x1357 }
            goto L_0x111d
        L_0x0b97:
            int r6 = X.AnonymousClass6CA.A07(r18)     // Catch:{ 8RX -> 0x1357 }
            r1 = 4
            int r4 = r10.A00     // Catch:{ 8RX -> 0x1357 }
            int r1 = r4 - r1
            java.lang.Object[] r3 = r10.A05     // Catch:{ 8RX -> 0x1357 }
            r1 = r3[r1]     // Catch:{ 8RX -> 0x1357 }
            X.7KA r1 = A03(r1)     // Catch:{ 8RX -> 0x1357 }
            java.lang.Object[] r5 = r1.A02     // Catch:{ 8RX -> 0x1357 }
            if (r5 == 0) goto L_0x0bbc
            int r2 = r5.length     // Catch:{ 8RX -> 0x1357 }
        L_0x0bad:
            int r1 = r4 - r0
            int[] r0 = r10.A04     // Catch:{ 8RX -> 0x1357 }
            r1 = r0[r1]     // Catch:{ 8RX -> 0x1357 }
            if (r6 >= r2) goto L_0x0bbe
            r0 = r5[r6]     // Catch:{ 8RX -> 0x1357 }
            r10.A0V(r0)     // Catch:{ 8RX -> 0x1357 }
            goto L_0x111d
        L_0x0bbc:
            r2 = 0
            goto L_0x0bad
        L_0x0bbe:
            int r0 = r2 + r1
            if (r6 >= r0) goto L_0x0bd0
            int r6 = r6 - r2
            int r1 = r1 - r6
            int r0 = r1 + -1
            int r0 = r0 + 5
            int r4 = r4 - r0
            r0 = r3[r4]     // Catch:{ 8RX -> 0x1357 }
            r10.A0V(r0)     // Catch:{ 8RX -> 0x1357 }
            goto L_0x111d
        L_0x0bd0:
            r0 = 0
            r10.A0V(r0)     // Catch:{ 8RX -> 0x1357 }
            goto L_0x111d
        L_0x0bd6:
            int r3 = X.AnonymousClass6CA.A07(r18)     // Catch:{ 8RX -> 0x1357 }
            r1 = 4
            int r4 = r10.A00     // Catch:{ 8RX -> 0x1357 }
            int r2 = r4 - r1
            java.lang.Object[] r1 = r10.A05     // Catch:{ 8RX -> 0x1357 }
            r1 = r1[r2]     // Catch:{ 8RX -> 0x1357 }
            X.7KA r1 = A03(r1)     // Catch:{ 8RX -> 0x1357 }
            java.lang.Object[] r1 = r1.A02     // Catch:{ 8RX -> 0x1357 }
            if (r1 == 0) goto L_0x0bf3
            int r1 = r1.length     // Catch:{ 8RX -> 0x1357 }
        L_0x0bec:
            int r4 = r4 - r0
            int[] r0 = r10.A04     // Catch:{ 8RX -> 0x1357 }
            r0 = r0[r4]     // Catch:{ 8RX -> 0x1357 }
            int r1 = r1 + r0
            goto L_0x0bf5
        L_0x0bf3:
            r1 = 0
            goto L_0x0bec
        L_0x0bf5:
            boolean r0 = X.AnonymousClass000.A1U(r1, r3)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ 8RX -> 0x1357 }
            r10.A0V(r0)     // Catch:{ 8RX -> 0x1357 }
            goto L_0x111d
        L_0x0c02:
            int r5 = X.AnonymousClass6CA.A07(r18)     // Catch:{ 8RX -> 0x1357 }
            int r11 = r5 + 1
            int r0 = r10.A01     // Catch:{ 8RX -> 0x1357 }
            int r1 = r0 + -1
            int r1 = r1 - r11
            java.lang.Object[] r0 = r10.A05     // Catch:{ 8RX -> 0x1357 }
            r2 = r0[r1]     // Catch:{ 8RX -> 0x1357 }
            r3 = 10
            boolean r0 = r2 instanceof X.C155787fV     // Catch:{ 8RX -> 0x1357 }
            if (r0 == 0) goto L_0x1293
            A03(r2)     // Catch:{ 8RX -> 0x1357 }
            java.lang.Object r6 = A08(r10)     // Catch:{ 8RX -> 0x1357 }
            boolean r0 = r6 instanceof java.util.List     // Catch:{ 8RX -> 0x1357 }
            if (r0 == 0) goto L_0x0c29
            java.util.List r6 = (java.util.List) r6     // Catch:{ 8RX -> 0x1357 }
            int r8 = r6.size()     // Catch:{ 8RX -> 0x1357 }
            goto L_0x0c2c
        L_0x0c29:
            if (r6 != 0) goto L_0x128b
            r6 = 0
        L_0x0c2c:
            r0 = 32768(0x8000, float:4.5918E-41)
            int r0 = r0 - r5
            if (r0 >= r8) goto L_0x0c34
            goto L_0x1283
        L_0x0c34:
            int r3 = r5 + r8
            int r9 = r3 + 1
            r10.A0Q(r9)     // Catch:{ 8RX -> 0x1357 }
            int r4 = r10.A01     // Catch:{ 8RX -> 0x1357 }
            int r1 = r4 + -1
            int r1 = r1 - r5
            int r9 = r9 + r4
            r10.A01 = r9     // Catch:{ 8RX -> 0x1357 }
            java.lang.Object[] r7 = r10.A05     // Catch:{ 8RX -> 0x1357 }
            r0 = 0
            java.util.Arrays.fill(r7, r4, r9, r0)     // Catch:{ 8RX -> 0x1357 }
            int r7 = r4 + 1
            java.lang.Object[] r0 = r10.A05     // Catch:{ 8RX -> 0x1357 }
            r0[r4] = r2     // Catch:{ 8RX -> 0x1357 }
            java.lang.System.arraycopy(r0, r1, r0, r7, r5)     // Catch:{ 8RX -> 0x1357 }
            int r7 = r7 + r5
            if (r6 == 0) goto L_0x0c66
            r5 = 0
        L_0x0c56:
            if (r5 >= r8) goto L_0x0c66
            int r4 = r7 + 1
            java.lang.Object r1 = r6.get(r5)     // Catch:{ 8RX -> 0x1357 }
            java.lang.Object[] r0 = r10.A05     // Catch:{ 8RX -> 0x1357 }
            r0[r7] = r1     // Catch:{ 8RX -> 0x1357 }
            int r5 = r5 + 1
            r7 = r4
            goto L_0x0c56
        L_0x0c66:
            r0 = 4
            int r1 = r10.A00     // Catch:{ 8RX -> 0x1357 }
            int r1 = r1 - r0
            java.lang.Object[] r0 = r10.A05     // Catch:{ 8RX -> 0x1357 }
            r1 = r0[r1]     // Catch:{ 8RX -> 0x1357 }
            r0 = r16
            r10.A0W(r2, r1, r3, r0)     // Catch:{ 8RX -> 0x1357 }
            r10.A0N()     // Catch:{ 8RX -> 0x1357 }
            int r0 = r11 + 1
            java.lang.Object r1 = A08(r10)     // Catch:{ 8RX -> 0x1357 }
            r10.A0R(r0, r1)     // Catch:{ 8RX -> 0x1357 }
        L_0x0c7f:
            r10.A0P(r0)     // Catch:{ 8RX -> 0x1357 }
            goto L_0x111d
        L_0x0c84:
            java.lang.Object r2 = A08(r10)     // Catch:{ 8RX -> 0x1357 }
            java.lang.String r1 = "invalid vector capacity"
            r0 = 4194304(0x400000, float:5.877472E-39)
            int r1 = r10.A0K(r2, r1, r0)     // Catch:{ 8RX -> 0x1357 }
            java.util.ArrayList r0 = X.AnonymousClass001.A0s()     // Catch:{ 8RX -> 0x1357 }
            r0.ensureCapacity(r1)     // Catch:{ 8RX -> 0x1357 }
            r10.A0R(r8, r0)     // Catch:{ 8RX -> 0x1357 }
            goto L_0x111d
        L_0x0c9c:
            java.lang.Object r1 = A08(r10)     // Catch:{ 8RX -> 0x1357 }
            boolean r0 = r1 instanceof java.util.Map     // Catch:{ 8RX -> 0x1357 }
            if (r0 == 0) goto L_0x0cb4
            java.util.Map r1 = (java.util.Map) r1     // Catch:{ 8RX -> 0x1357 }
            int r0 = r1.size()     // Catch:{ 8RX -> 0x1357 }
        L_0x0caa:
            double r0 = (double) r0     // Catch:{ 8RX -> 0x1357 }
            java.lang.Number r0 = X.C159427lo.A00(r0)     // Catch:{ 8RX -> 0x1357 }
            r10.A0R(r8, r0)     // Catch:{ 8RX -> 0x1357 }
            goto L_0x111d
        L_0x0cb4:
            boolean r0 = r1 instanceof java.util.List     // Catch:{ 8RX -> 0x1357 }
            if (r0 == 0) goto L_0x0cbf
            java.util.List r1 = (java.util.List) r1     // Catch:{ 8RX -> 0x1357 }
            int r0 = r1.size()     // Catch:{ 8RX -> 0x1357 }
            goto L_0x0caa
        L_0x0cbf:
            boolean r0 = r1 instanceof java.lang.String     // Catch:{ 8RX -> 0x1357 }
            if (r0 == 0) goto L_0x12aa
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ 8RX -> 0x1357 }
            int r0 = r1.length()     // Catch:{ 8RX -> 0x1357 }
            goto L_0x0caa
        L_0x0cca:
            java.lang.Object r0 = A08(r10)     // Catch:{ 8RX -> 0x1357 }
            r10.A0V(r0)     // Catch:{ 8RX -> 0x1357 }
            goto L_0x111d
        L_0x0cd3:
            int r2 = X.AnonymousClass6CA.A07(r18)     // Catch:{ 8RX -> 0x1357 }
            r0 = r19
            boolean r1 = X.AnonymousClass001.A1Y(r2, r0)
            java.lang.String r0 = "invalid local load index"
            if (r1 != 0) goto L_0x0cea
            A0F(r0)     // Catch:{ 8RX -> 0x1357 }
            java.lang.RuntimeException r1 = X.AnonymousClass000.A0L()     // Catch:{ 8RX -> 0x1357 }
            goto L_0x1356
        L_0x0cea:
            int r0 = r10.A00     // Catch:{ 8RX -> 0x1357 }
            int r0 = r0 + r2
            int r1 = r0 + 1
            java.lang.Object[] r0 = r10.A05     // Catch:{ 8RX -> 0x1357 }
            r0 = r0[r1]     // Catch:{ 8RX -> 0x1357 }
            r10.A0V(r0)     // Catch:{ 8RX -> 0x1357 }
            goto L_0x111d
        L_0x0cf8:
            int r3 = X.AnonymousClass6CA.A07(r18)     // Catch:{ 8RX -> 0x1357 }
            r0 = r19
            boolean r1 = X.AnonymousClass001.A1Y(r3, r0)
            java.lang.String r0 = "invalid local store index"
            if (r1 != 0) goto L_0x0d0f
            A0F(r0)     // Catch:{ 8RX -> 0x1357 }
            java.lang.RuntimeException r1 = X.AnonymousClass000.A0L()     // Catch:{ 8RX -> 0x1357 }
            goto L_0x1356
        L_0x0d0f:
            int r0 = r10.A01     // Catch:{ 8RX -> 0x1357 }
            int r0 = r0 + -1
            java.lang.Object[] r2 = r10.A05     // Catch:{ 8RX -> 0x1357 }
            r1 = r2[r0]     // Catch:{ 8RX -> 0x1357 }
            int r0 = r10.A00     // Catch:{ 8RX -> 0x1357 }
            int r0 = r0 + r3
            int r0 = r0 + 1
            r2[r0] = r1     // Catch:{ 8RX -> 0x1357 }
            goto L_0x0f4b
        L_0x0d20:
            java.lang.Object r0 = A08(r10)     // Catch:{ 8RX -> 0x1357 }
            int r0 = A02(r0)     // Catch:{ 8RX -> 0x1357 }
            double r0 = (double) r0     // Catch:{ 8RX -> 0x1357 }
            java.lang.Number r0 = X.C159427lo.A00(r0)     // Catch:{ 8RX -> 0x1357 }
            r10.A0R(r8, r0)     // Catch:{ 8RX -> 0x1357 }
            goto L_0x111d
        L_0x0d32:
            int r4 = X.AnonymousClass6CA.A07(r18)     // Catch:{ 8RX -> 0x1357 }
            java.lang.Object r3 = A08(r10)     // Catch:{ 8RX -> 0x1357 }
            int r2 = A02(r3)     // Catch:{ 8RX -> 0x1357 }
            r1 = 100
            if (r4 != r1) goto L_0x0d49
            r1 = 4
            if (r2 == r1) goto L_0x111d
            if (r2 == r0) goto L_0x111d
            goto L_0x12b2
        L_0x0d49:
            if (r2 == r4) goto L_0x111d
            goto L_0x12b2
        L_0x0d4d:
            long r0 = r18.getLong()     // Catch:{ 8RX -> 0x1357 }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ 8RX -> 0x1357 }
            r10.A0V(r0)     // Catch:{ 8RX -> 0x1357 }
            goto L_0x111d
        L_0x0d5a:
            double r0 = r18.getDouble()     // Catch:{ 8RX -> 0x1357 }
            java.lang.Number r0 = X.C159427lo.A00(r0)     // Catch:{ 8RX -> 0x1357 }
            r10.A0V(r0)     // Catch:{ 8RX -> 0x1357 }
            goto L_0x111d
        L_0x0d67:
            short r0 = r18.getShort()     // Catch:{ 8RX -> 0x1357 }
            double r0 = (double) r0     // Catch:{ 8RX -> 0x1357 }
            java.lang.Number r0 = X.C159427lo.A00(r0)     // Catch:{ 8RX -> 0x1357 }
            r10.A0V(r0)     // Catch:{ 8RX -> 0x1357 }
            goto L_0x111d
        L_0x0d75:
            int r0 = r18.getInt()     // Catch:{ 8RX -> 0x1357 }
            double r0 = (double) r0     // Catch:{ 8RX -> 0x1357 }
            java.lang.Number r0 = X.C159427lo.A00(r0)     // Catch:{ 8RX -> 0x1357 }
            r10.A0V(r0)     // Catch:{ 8RX -> 0x1357 }
            goto L_0x111d
        L_0x0d83:
            java.lang.Object r1 = A08(r10)     // Catch:{ 8RX -> 0x1357 }
            java.lang.Number r0 = A05(r1)     // Catch:{ 8RX -> 0x1357 }
            if (r0 == 0) goto L_0x12d6
            int r1 = r0.intValue()     // Catch:{ 8RX -> 0x1357 }
            r0 = 65535(0xffff, float:9.1834E-41)
            r1 = r1 & r0
            char r0 = (char) r1     // Catch:{ 8RX -> 0x1357 }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ 8RX -> 0x1357 }
            r10.A0R(r8, r0)     // Catch:{ 8RX -> 0x1357 }
        L_0x0d9d:
            java.lang.Object r0 = A08(r10)     // Catch:{ 8RX -> 0x1357 }
            java.lang.Object r0 = r10.A0L(r0)     // Catch:{ 8RX -> 0x1357 }
            r10.A0R(r8, r0)     // Catch:{ 8RX -> 0x1357 }
            goto L_0x111d
        L_0x0daa:
            java.lang.Object r1 = A08(r10)     // Catch:{ 8RX -> 0x1357 }
            java.lang.Number r0 = A04(r1)     // Catch:{ 8RX -> 0x1357 }
            if (r0 != 0) goto L_0x0de0
            java.lang.String r0 = "TO_NUMBER operand must be numeric"
            java.lang.RuntimeException r1 = A09(r1, r0)     // Catch:{ 8RX -> 0x1357 }
            goto L_0x1356
        L_0x0dbc:
            java.lang.Object r1 = A08(r10)     // Catch:{ 8RX -> 0x1357 }
            java.lang.Number r0 = A06(r1)     // Catch:{ 8RX -> 0x1357 }
            if (r0 != 0) goto L_0x0de0
            java.lang.String r0 = "TO_BIGINT operand must be numeric"
            java.lang.RuntimeException r1 = A09(r1, r0)     // Catch:{ 8RX -> 0x1357 }
            goto L_0x1356
        L_0x0dce:
            java.lang.Object r1 = A08(r10)     // Catch:{ 8RX -> 0x1357 }
            java.lang.Number r0 = A05(r1)     // Catch:{ 8RX -> 0x1357 }
            if (r0 != 0) goto L_0x0de0
            java.lang.String r0 = "TO_INT32 operand must be numeric"
            java.lang.RuntimeException r1 = A09(r1, r0)     // Catch:{ 8RX -> 0x1357 }
            goto L_0x1356
        L_0x0de0:
            r10.A0R(r8, r0)     // Catch:{ 8RX -> 0x1357 }
            goto L_0x111d
        L_0x0de5:
            java.lang.Object r1 = A08(r10)     // Catch:{ 8RX -> 0x1357 }
            java.lang.Number r0 = A05(r1)     // Catch:{ 8RX -> 0x1357 }
            if (r0 == 0) goto L_0x12dd
            long r2 = r0.longValue()     // Catch:{ 8RX -> 0x1357 }
            r0 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r2 = r2 & r0
            double r0 = (double) r2     // Catch:{ 8RX -> 0x1357 }
            java.lang.Number r0 = X.C159427lo.A00(r0)     // Catch:{ 8RX -> 0x1357 }
            r10.A0R(r8, r0)     // Catch:{ 8RX -> 0x1357 }
            goto L_0x111d
        L_0x0e03:
            java.lang.Object r0 = A08(r10)     // Catch:{ 8RX -> 0x1357 }
            boolean r0 = A0I(r0)     // Catch:{ 8RX -> 0x1357 }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ 8RX -> 0x1357 }
            r10.A0R(r8, r0)     // Catch:{ 8RX -> 0x1357 }
            goto L_0x111d
        L_0x0e14:
            java.lang.Object r0 = A08(r10)     // Catch:{ 8RX -> 0x1357 }
            boolean r0 = A0I(r0)     // Catch:{ 8RX -> 0x1357 }
            boolean r0 = X.AnonymousClass000.A1T(r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ 8RX -> 0x1357 }
            r10.A0R(r8, r0)     // Catch:{ 8RX -> 0x1357 }
            goto L_0x111d
        L_0x0e29:
            java.lang.Object r1 = A08(r10)     // Catch:{ 8RX -> 0x1357 }
            java.lang.Number r0 = A04(r1)     // Catch:{ 8RX -> 0x1357 }
            if (r0 == 0) goto L_0x12e4
            double r1 = r0.doubleValue()     // Catch:{ 8RX -> 0x1357 }
            int r0 = (r1 > r22 ? 1 : (r1 == r22 ? 0 : -1))
            if (r0 <= 0) goto L_0x0e48
            double r0 = java.lang.Math.floor(r1)     // Catch:{ 8RX -> 0x1357 }
        L_0x0e3f:
            java.lang.Number r0 = X.C159427lo.A00(r0)     // Catch:{ 8RX -> 0x1357 }
            r10.A0R(r8, r0)     // Catch:{ 8RX -> 0x1357 }
            goto L_0x111d
        L_0x0e48:
            double r0 = java.lang.Math.ceil(r1)     // Catch:{ 8RX -> 0x1357 }
            goto L_0x0e3f
        L_0x0e4d:
            java.lang.Object r1 = A08(r10)     // Catch:{ 8RX -> 0x1357 }
            java.lang.Number r0 = A04(r1)     // Catch:{ 8RX -> 0x1357 }
            if (r0 == 0) goto L_0x12eb
            double r2 = r0.doubleValue()     // Catch:{ 8RX -> 0x1357 }
            double r0 = -r2
            java.lang.Number r0 = X.C159427lo.A00(r0)     // Catch:{ 8RX -> 0x1357 }
            r10.A0R(r8, r0)     // Catch:{ 8RX -> 0x1357 }
            goto L_0x111d
        L_0x0e65:
            java.lang.Object r1 = A08(r10)     // Catch:{ 8RX -> 0x1357 }
            java.lang.Number r0 = A04(r1)     // Catch:{ 8RX -> 0x1357 }
            if (r0 == 0) goto L_0x12f2
            double r2 = r0.doubleValue()     // Catch:{ 8RX -> 0x1357 }
            long r0 = (long) r2     // Catch:{ 8RX -> 0x1357 }
            int r2 = (int) r0     // Catch:{ 8RX -> 0x1357 }
            int r0 = ~r2     // Catch:{ 8RX -> 0x1357 }
            double r0 = (double) r0     // Catch:{ 8RX -> 0x1357 }
            java.lang.Number r0 = X.C159427lo.A00(r0)     // Catch:{ 8RX -> 0x1357 }
            r10.A0R(r8, r0)     // Catch:{ 8RX -> 0x1357 }
            goto L_0x111d
        L_0x0e80:
            java.lang.Object r1 = A08(r10)     // Catch:{ 8RX -> 0x1357 }
            java.lang.Number r0 = A06(r1)     // Catch:{ 8RX -> 0x1357 }
            if (r0 == 0) goto L_0x12f9
            long r2 = r0.longValue()     // Catch:{ 8RX -> 0x1357 }
            long r0 = -r2
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ 8RX -> 0x1357 }
            r10.A0R(r8, r0)     // Catch:{ 8RX -> 0x1357 }
            goto L_0x111d
        L_0x0e98:
            java.lang.Object r1 = A08(r10)     // Catch:{ 8RX -> 0x1357 }
            java.lang.Number r0 = A06(r1)     // Catch:{ 8RX -> 0x1357 }
            if (r0 == 0) goto L_0x1300
            long r2 = r0.longValue()     // Catch:{ 8RX -> 0x1357 }
            long r0 = ~r2     // Catch:{ 8RX -> 0x1357 }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ 8RX -> 0x1357 }
            r10.A0R(r8, r0)     // Catch:{ 8RX -> 0x1357 }
            goto L_0x111d
        L_0x0eb0:
            int r0 = r10.A01     // Catch:{ 8RX -> 0x1357 }
            int r1 = r0 + -1
            java.lang.Object[] r0 = r10.A05     // Catch:{ 8RX -> 0x1357 }
            r2 = r0[r1]     // Catch:{ 8RX -> 0x1357 }
            int r1 = r1 - r3
            r1 = r0[r1]     // Catch:{ 8RX -> 0x1357 }
            if (r1 != 0) goto L_0x0ebe
            goto L_0x0f34
        L_0x0ebe:
            boolean r0 = r1 instanceof java.lang.Boolean     // Catch:{ 8RX -> 0x1357 }
            r8 = 1
            if (r0 == 0) goto L_0x0ed2
            boolean r4 = X.AnonymousClass001.A1Z(r1)     // Catch:{ 8RX -> 0x1357 }
            boolean r0 = r2 instanceof java.lang.Boolean     // Catch:{ 8RX -> 0x1357 }
            if (r0 == 0) goto L_0x0efa
            boolean r0 = X.AnonymousClass001.A1Z(r2)     // Catch:{ 8RX -> 0x1357 }
            if (r4 != r0) goto L_0x0f37
            goto L_0x0f3d
        L_0x0ed2:
            boolean r0 = A0H(r1)     // Catch:{ 8RX -> 0x1357 }
            if (r0 == 0) goto L_0x0ee7
            double r6 = X.AnonymousClass6C9.A02(r1)     // Catch:{ 8RX -> 0x1357 }
            boolean r0 = A0H(r2)     // Catch:{ 8RX -> 0x1357 }
            if (r0 == 0) goto L_0x0efa
            double r1 = X.AnonymousClass6C9.A02(r2)     // Catch:{ 8RX -> 0x1357 }
            goto L_0x0f39
        L_0x0ee7:
            boolean r0 = r1 instanceof java.lang.Long     // Catch:{ 8RX -> 0x1357 }
            if (r0 == 0) goto L_0x0f0f
            long r6 = X.C18310x6.A0B(r1)     // Catch:{ 8RX -> 0x1357 }
            boolean r0 = r2 instanceof java.lang.Long     // Catch:{ 8RX -> 0x1357 }
            if (r0 == 0) goto L_0x0efa
            long r1 = X.C18310x6.A0B(r2)     // Catch:{ 8RX -> 0x1357 }
            int r0 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            goto L_0x0f3b
        L_0x0efa:
            java.lang.Number r1 = A04(r1)     // Catch:{ 8RX -> 0x1357 }
            if (r1 == 0) goto L_0x0f37
            java.lang.Number r0 = A04(r2)     // Catch:{ 8RX -> 0x1357 }
            if (r0 == 0) goto L_0x0f37
            double r6 = r1.doubleValue()     // Catch:{ 8RX -> 0x1357 }
            double r1 = r0.doubleValue()     // Catch:{ 8RX -> 0x1357 }
            goto L_0x0f39
        L_0x0f0f:
            boolean r0 = r1 instanceof java.lang.String     // Catch:{ 8RX -> 0x1357 }
            if (r0 == 0) goto L_0x0f20
            boolean r0 = r2 instanceof java.lang.String     // Catch:{ 8RX -> 0x1357 }
            if (r0 == 0) goto L_0x0f37
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ 8RX -> 0x1357 }
            boolean r0 = r1.equals(r2)     // Catch:{ 8RX -> 0x1357 }
            if (r0 == 0) goto L_0x0f37
            goto L_0x0f3d
        L_0x0f20:
            boolean r0 = r1 instanceof java.util.List     // Catch:{ 8RX -> 0x1357 }
            if (r0 != 0) goto L_0x0f31
            boolean r0 = r1 instanceof java.util.Map     // Catch:{ 8RX -> 0x1357 }
            if (r0 != 0) goto L_0x0f31
            boolean r0 = r1 instanceof X.C155787fV     // Catch:{ 8RX -> 0x1357 }
            if (r0 != 0) goto L_0x0f31
            boolean r8 = r1.equals(r2)     // Catch:{ 8RX -> 0x1357 }
            goto L_0x0f3d
        L_0x0f31:
            if (r1 != r2) goto L_0x0f37
            goto L_0x0f3d
        L_0x0f34:
            r8 = 1
            if (r2 == 0) goto L_0x0f3d
        L_0x0f37:
            r8 = 0
            goto L_0x0f3d
        L_0x0f39:
            int r0 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
        L_0x0f3b:
            if (r0 != 0) goto L_0x0f37
        L_0x0f3d:
            r0 = 86
            boolean r0 = X.AnonymousClass000.A1U(r5, r0)
            r8 = r8 ^ r0
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r8)     // Catch:{ 8RX -> 0x1357 }
            r10.A0R(r3, r0)     // Catch:{ 8RX -> 0x1357 }
        L_0x0f4b:
            r10.A0O()     // Catch:{ 8RX -> 0x1357 }
            goto L_0x111d
        L_0x0f50:
            r18.getShort()     // Catch:{ 8RX -> 0x1357 }
            goto L_0x0f57
        L_0x0f54:
            r18.getInt()     // Catch:{ 8RX -> 0x1357 }
        L_0x0f57:
            r18.getShort()     // Catch:{ 8RX -> 0x1357 }
            goto L_0x111d
        L_0x0f5c:
            short r1 = r18.getShort()     // Catch:{ 8RX -> 0x1357 }
            r18.getShort()     // Catch:{ 8RX -> 0x1357 }
            goto L_0x0fbb
        L_0x0f64:
            short r1 = r18.getShort()     // Catch:{ 8RX -> 0x1357 }
            r18.getShort()     // Catch:{ 8RX -> 0x1357 }
            java.lang.Object r0 = A08(r10)     // Catch:{ 8RX -> 0x1357 }
            boolean r0 = A0I(r0)     // Catch:{ 8RX -> 0x1357 }
            r10.A0O()     // Catch:{ 8RX -> 0x1357 }
            goto L_0x0f89
        L_0x0f77:
            int r1 = r18.getInt()     // Catch:{ 8RX -> 0x1357 }
            r18.getShort()     // Catch:{ 8RX -> 0x1357 }
            java.lang.Object r0 = A08(r10)     // Catch:{ 8RX -> 0x1357 }
            boolean r0 = A0I(r0)     // Catch:{ 8RX -> 0x1357 }
            r10.A0O()     // Catch:{ 8RX -> 0x1357 }
        L_0x0f89:
            if (r0 == 0) goto L_0x111d
            goto L_0x0fbb
        L_0x0f8c:
            short r1 = r18.getShort()     // Catch:{ 8RX -> 0x1357 }
            r18.getShort()     // Catch:{ 8RX -> 0x1357 }
            java.lang.Object r0 = A08(r10)     // Catch:{ 8RX -> 0x1357 }
            boolean r0 = A0I(r0)     // Catch:{ 8RX -> 0x1357 }
            r10.A0O()     // Catch:{ 8RX -> 0x1357 }
            goto L_0x0fb1
        L_0x0f9f:
            int r1 = r18.getInt()     // Catch:{ 8RX -> 0x1357 }
            r18.getShort()     // Catch:{ 8RX -> 0x1357 }
            java.lang.Object r0 = A08(r10)     // Catch:{ 8RX -> 0x1357 }
            boolean r0 = A0I(r0)     // Catch:{ 8RX -> 0x1357 }
            r10.A0O()     // Catch:{ 8RX -> 0x1357 }
        L_0x0fb1:
            if (r0 != 0) goto L_0x111d
            goto L_0x0fbb
        L_0x0fb4:
            int r1 = r18.getInt()     // Catch:{ 8RX -> 0x1357 }
            r18.getShort()     // Catch:{ 8RX -> 0x1357 }
        L_0x0fbb:
            int r1 = r1 + r16
            r0 = r18
            r0.position(r1)     // Catch:{ 8RX -> 0x1357 }
            goto L_0x111d
        L_0x0fc4:
            java.lang.Number r0 = X.C159427lo.A00(r22)     // Catch:{ 8RX -> 0x1357 }
            r10.A0V(r0)     // Catch:{ 8RX -> 0x1357 }
            goto L_0x111d
        L_0x0fcd:
            boolean r2 = X.AnonymousClass000.A1T(r19)
            java.lang.String r1 = "enter executed more than once"
            if (r2 == 0) goto L_0x1307
            int r19 = X.AnonymousClass6CA.A07(r18)     // Catch:{ 8RX -> 0x1357 }
            int r2 = X.AnonymousClass6CA.A07(r18)     // Catch:{ 8RX -> 0x1357 }
            short r4 = r18.getShort()     // Catch:{ 8RX -> 0x1357 }
            r1 = 65535(0xffff, float:9.1834E-41)
            r4 = r4 & r1
            r1 = r19
            boolean r3 = X.AnonymousClass6C8.A1P(r2, r1)
            java.lang.String r1 = "op_enter too many params to copy"
            if (r3 != 0) goto L_0x0ff8
            A0F(r1)     // Catch:{ 8RX -> 0x1357 }
            java.lang.RuntimeException r1 = X.AnonymousClass000.A0L()     // Catch:{ 8RX -> 0x1357 }
            goto L_0x1356
        L_0x0ff8:
            int r4 = r4 + r19
            int r1 = r4 + 5
            r10.A0Q(r1)     // Catch:{ 8RX -> 0x1357 }
            int r4 = r10.A01     // Catch:{ 8RX -> 0x1357 }
            int r5 = r19 + r4
            r10.A01 = r5     // Catch:{ 8RX -> 0x1357 }
            java.lang.Object[] r3 = r10.A05     // Catch:{ 8RX -> 0x1357 }
            r1 = 0
            java.util.Arrays.fill(r3, r4, r5, r1)     // Catch:{ 8RX -> 0x1357 }
            int r6 = r10.A00     // Catch:{ 8RX -> 0x1357 }
            int r1 = r6 - r0
            int[] r0 = r10.A04     // Catch:{ 8RX -> 0x1357 }
            r5 = r0[r1]     // Catch:{ 8RX -> 0x1357 }
            r0 = 4
            int r6 = r6 - r0
            java.lang.Object[] r3 = r10.A05     // Catch:{ 8RX -> 0x1357 }
            r0 = r3[r6]     // Catch:{ 8RX -> 0x1357 }
            X.7KA r0 = A03(r0)     // Catch:{ 8RX -> 0x1357 }
            java.lang.Object[] r1 = r0.A02     // Catch:{ 8RX -> 0x1357 }
            if (r1 == 0) goto L_0x102c
            int r0 = r1.length     // Catch:{ 8RX -> 0x1357 }
        L_0x1022:
            int r0 = java.lang.Math.min(r0, r2)     // Catch:{ 8RX -> 0x1357 }
            if (r0 == 0) goto L_0x102f
            java.lang.System.arraycopy(r1, r8, r3, r4, r0)     // Catch:{ 8RX -> 0x1357 }
            goto L_0x102e
        L_0x102c:
            r0 = 0
            goto L_0x1022
        L_0x102e:
            int r4 = r4 + r0
        L_0x102f:
            int r3 = X.AnonymousClass6C9.A0A(r2, r0, r5)     // Catch:{ 8RX -> 0x1357 }
            if (r3 <= 0) goto L_0x111d
            java.lang.Object[] r2 = r10.A05     // Catch:{ 8RX -> 0x1357 }
            int r1 = r10.A00     // Catch:{ 8RX -> 0x1357 }
            int r0 = r5 + -1
            int r0 = r0 + 5
            int r1 = r1 - r0
            java.lang.System.arraycopy(r2, r1, r2, r4, r3)     // Catch:{ 8RX -> 0x1357 }
            goto L_0x111d
        L_0x1043:
            java.lang.Object r0 = r10.A06     // Catch:{ 8RX -> 0x1357 }
            r10.A0V(r0)     // Catch:{ 8RX -> 0x1357 }
            goto L_0x111d
        L_0x104a:
            java.lang.Boolean r0 = java.lang.Boolean.TRUE     // Catch:{ 8RX -> 0x1357 }
            r10.A0V(r0)     // Catch:{ 8RX -> 0x1357 }
            goto L_0x111d
        L_0x1051:
            java.lang.Boolean r0 = java.lang.Boolean.FALSE     // Catch:{ 8RX -> 0x1357 }
            r10.A0V(r0)     // Catch:{ 8RX -> 0x1357 }
            goto L_0x111d
        L_0x1058:
            java.lang.String r0 = "*"
            r10.A0S(r8, r0)     // Catch:{ 8RX -> 0x1357 }
            goto L_0x111d
        L_0x105f:
            java.lang.String r0 = "imul"
            r10.A0S(r3, r0)     // Catch:{ 8RX -> 0x1357 }
            goto L_0x111d
        L_0x1066:
            java.lang.String r0 = "/"
            r10.A0S(r1, r0)     // Catch:{ 8RX -> 0x1357 }
            goto L_0x111d
        L_0x106d:
            java.lang.String r1 = "%"
            r10.A0S(r0, r1)     // Catch:{ 8RX -> 0x1357 }
            goto L_0x111d
        L_0x1074:
            java.lang.String r1 = "-"
            r0 = 4
            r10.A0S(r0, r1)     // Catch:{ 8RX -> 0x1357 }
            goto L_0x111d
        L_0x107c:
            java.lang.String r1 = "&"
            r0 = 6
            r10.A0S(r0, r1)     // Catch:{ 8RX -> 0x1357 }
            goto L_0x111d
        L_0x1084:
            java.lang.String r1 = "|"
            r0 = 7
            r10.A0S(r0, r1)     // Catch:{ 8RX -> 0x1357 }
            goto L_0x111d
        L_0x108c:
            java.lang.String r1 = "^"
            r0 = 8
            r10.A0S(r0, r1)     // Catch:{ 8RX -> 0x1357 }
            goto L_0x111d
        L_0x1095:
            java.lang.String r1 = "<<"
            r0 = 9
            r10.A0S(r0, r1)     // Catch:{ 8RX -> 0x1357 }
            goto L_0x111d
        L_0x109e:
            java.lang.String r1 = ">>"
            r0 = 10
            r10.A0S(r0, r1)     // Catch:{ 8RX -> 0x1357 }
            goto L_0x111d
        L_0x10a6:
            java.lang.String r1 = ">>>"
            r0 = 11
            r10.A0S(r0, r1)     // Catch:{ 8RX -> 0x1357 }
            goto L_0x111d
        L_0x10ae:
            java.lang.String r1 = "INT64_MUL"
            r0 = 12
            r10.A0T(r0, r1)     // Catch:{ 8RX -> 0x1357 }
            goto L_0x111d
        L_0x10b6:
            java.lang.String r1 = "INT64_DIV"
            r0 = 13
            r10.A0T(r0, r1)     // Catch:{ 8RX -> 0x1357 }
            goto L_0x111d
        L_0x10be:
            java.lang.String r1 = "INT64_MOD"
            r0 = 14
            r10.A0T(r0, r1)     // Catch:{ 8RX -> 0x1357 }
            goto L_0x111d
        L_0x10c6:
            java.lang.String r1 = "INT64_SUB"
            r0 = 15
            r10.A0T(r0, r1)     // Catch:{ 8RX -> 0x1357 }
            goto L_0x111d
        L_0x10ce:
            java.lang.String r1 = "INT64_ADD"
            r0 = 16
            r10.A0T(r0, r1)     // Catch:{ 8RX -> 0x1357 }
            goto L_0x111d
        L_0x10d6:
            java.lang.String r1 = "INT64_AND"
            r0 = 17
            r10.A0T(r0, r1)     // Catch:{ 8RX -> 0x1357 }
            goto L_0x111d
        L_0x10de:
            java.lang.String r1 = "INT64_OR"
            r0 = 18
            r10.A0T(r0, r1)     // Catch:{ 8RX -> 0x1357 }
            goto L_0x111d
        L_0x10e6:
            java.lang.String r1 = "INT64_XOR"
            r0 = 19
            r10.A0T(r0, r1)     // Catch:{ 8RX -> 0x1357 }
            goto L_0x111d
        L_0x10ee:
            java.lang.String r1 = "INT64_SHL"
            r0 = 20
            r10.A0T(r0, r1)     // Catch:{ 8RX -> 0x1357 }
            goto L_0x111d
        L_0x10f6:
            java.lang.String r1 = "INT64_ASR"
            r0 = 21
            r10.A0T(r0, r1)     // Catch:{ 8RX -> 0x1357 }
            goto L_0x111d
        L_0x10fe:
            java.lang.String r1 = "INT64_SHR"
            r0 = 22
            r10.A0T(r0, r1)     // Catch:{ 8RX -> 0x1357 }
            goto L_0x111d
        L_0x1106:
            java.lang.String r0 = ">="
            r10.A0U(r8, r0)     // Catch:{ 8RX -> 0x1357 }
            goto L_0x111d
        L_0x110c:
            java.lang.String r0 = ">"
            r10.A0U(r3, r0)     // Catch:{ 8RX -> 0x1357 }
            goto L_0x111d
        L_0x1112:
            java.lang.String r0 = "<"
            r10.A0U(r1, r0)     // Catch:{ 8RX -> 0x1357 }
            goto L_0x111d
        L_0x1118:
            java.lang.String r1 = "<="
            r10.A0U(r0, r1)     // Catch:{ 8RX -> 0x1357 }
        L_0x111d:
            r3 = 1
            r8 = 0
            r1 = 2
            goto L_0x0041
        L_0x1122:
            int r6 = r10.A01     // Catch:{ 8RX -> 0x1357 }
            int r1 = r6 + -1
            java.lang.Object[] r5 = r10.A05     // Catch:{ 8RX -> 0x1357 }
            r4 = r5[r1]     // Catch:{ 8RX -> 0x1357 }
            int r3 = r10.A00     // Catch:{ 8RX -> 0x1357 }
            int r0 = r3 - r0
            int[] r1 = r10.A04     // Catch:{ 8RX -> 0x1357 }
            r2 = r1[r0]     // Catch:{ 8RX -> 0x1357 }
            int r0 = r2 + 1
            int r0 = r0 + -1
            int r0 = r0 + 5
            int r0 = r3 - r0
            r5[r0] = r4     // Catch:{ 8RX -> 0x1357 }
            r1 = r1[r3]     // Catch:{ 8RX -> 0x1357 }
            int r0 = r3 + 1
            int r0 = r0 + -5
            int r0 = r0 - r2
            int r6 = r6 - r0
            r10.A0P(r6)     // Catch:{ 8RX -> 0x1357 }
            r10.A00 = r1     // Catch:{ 8RX -> 0x1357 }
            return
        L_0x114a:
            r3 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ 8RX -> 0x1357 }
            java.lang.String r0 = "extension '"
            r1.append(r0)     // Catch:{ 8RX -> 0x1357 }
            r1.append(r12)     // Catch:{ 8RX -> 0x1357 }
            java.lang.String r0 = "' threw an exception: "
            java.lang.String r2 = X.AnonymousClass000.A0a(r0, r1, r3)     // Catch:{ 8RX -> 0x1357 }
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ 8RX -> 0x1357 }
            java.lang.String r0 = "UserError: "
            java.lang.String r0 = X.AnonymousClass000.A0V(r0, r2, r1)     // Catch:{ 8RX -> 0x1357 }
            X.8RX r1 = new X.8RX     // Catch:{ 8RX -> 0x1357 }
            r1.<init>(r0, r3)     // Catch:{ 8RX -> 0x1357 }
            goto L_0x1356
        L_0x116e:
            r1 = move-exception
            goto L_0x1356
        L_0x1171:
            java.lang.String r0 = "argument of container_clone must be a container"
            java.lang.RuntimeException r1 = A09(r1, r0)     // Catch:{ 8RX -> 0x1357 }
            goto L_0x1356
        L_0x1179:
            java.lang.String r0 = "in_by_val 2nd argument must be a container"
            java.lang.RuntimeException r1 = A09(r4, r0)     // Catch:{ 8RX -> 0x1357 }
            goto L_0x1356
        L_0x1181:
            A0D(r6)     // Catch:{ 8RX -> 0x1357 }
            java.lang.RuntimeException r1 = X.AnonymousClass000.A0L()     // Catch:{ 8RX -> 0x1357 }
            goto L_0x1356
        L_0x118a:
            A0D(r9)     // Catch:{ 8RX -> 0x1357 }
            java.lang.RuntimeException r1 = X.AnonymousClass000.A0L()     // Catch:{ 8RX -> 0x1357 }
            goto L_0x1356
        L_0x1193:
            java.lang.String r0 = "string index out of range"
            A0D(r0)     // Catch:{ 8RX -> 0x1357 }
            java.lang.RuntimeException r1 = X.AnonymousClass000.A0L()     // Catch:{ 8RX -> 0x1357 }
            goto L_0x1356
        L_0x119e:
            java.lang.String r1 = "get_by_val 1st argument must be a container for key %s"
            java.lang.Object[] r0 = new java.lang.Object[r3]     // Catch:{ 8RX -> 0x1357 }
            r0[r8] = r5     // Catch:{ 8RX -> 0x1357 }
            java.lang.String r0 = java.lang.String.format(r1, r0)     // Catch:{ 8RX -> 0x1357 }
            java.lang.RuntimeException r1 = A09(r4, r0)     // Catch:{ 8RX -> 0x1357 }
            goto L_0x1356
        L_0x11ae:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ 8RX -> 0x1357 }
            java.lang.String r0 = "TypeError: "
            java.lang.String r0 = X.AnonymousClass000.A0V(r0, r4, r1)     // Catch:{ 8RX -> 0x1357 }
            X.8RX r1 = new X.8RX     // Catch:{ 8RX -> 0x1357 }
            r1.<init>(r0, r2)     // Catch:{ 8RX -> 0x1357 }
            goto L_0x1356
        L_0x11bf:
            java.lang.String r0 = "vector_append 1st argument must be a vector"
            java.lang.RuntimeException r0 = A09(r3, r0)     // Catch:{ UnsupportedOperationException -> 0x11c6 }
            throw r0     // Catch:{ UnsupportedOperationException -> 0x11c6 }
        L_0x11c6:
            r2 = move-exception
            goto L_0x11d1
        L_0x11c8:
            A0D(r6)     // Catch:{ 8RX -> 0x1357 }
            java.lang.RuntimeException r1 = X.AnonymousClass000.A0L()     // Catch:{ 8RX -> 0x1357 }
            goto L_0x1356
        L_0x11d1:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ 8RX -> 0x1357 }
            java.lang.String r0 = "TypeError: "
            java.lang.String r0 = X.AnonymousClass000.A0V(r0, r4, r1)     // Catch:{ 8RX -> 0x1357 }
            X.8RX r1 = new X.8RX     // Catch:{ 8RX -> 0x1357 }
            r1.<init>(r0, r2)     // Catch:{ 8RX -> 0x1357 }
            goto L_0x1356
        L_0x11e2:
            java.lang.String r1 = "get_by_val_or 1st argument must be a container for key %s"
            java.lang.Object[] r0 = X.AnonymousClass6C9.A1Z(r5, r3)     // Catch:{ 8RX -> 0x1357 }
            java.lang.String r0 = java.lang.String.format(r1, r0)     // Catch:{ 8RX -> 0x1357 }
            java.lang.RuntimeException r1 = A09(r4, r0)     // Catch:{ 8RX -> 0x1357 }
            goto L_0x1356
        L_0x11f2:
            java.lang.String r0 = "last bind() operand must be a vector or undefined"
            java.lang.RuntimeException r1 = A09(r6, r0)     // Catch:{ 8RX -> 0x1357 }
            goto L_0x1356
        L_0x11fa:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ 8RX -> 0x1357 }
            java.lang.String r0 = "Expected stack value of closure type for opcode "
            r1.append(r0)     // Catch:{ 8RX -> 0x1357 }
            java.lang.String[] r0 = X.AnonymousClass77O.A00     // Catch:{ 8RX -> 0x1357 }
            r0 = r0[r3]     // Catch:{ 8RX -> 0x1357 }
            java.lang.String r0 = X.AnonymousClass000.A0X(r0, r1)     // Catch:{ 8RX -> 0x1357 }
            java.lang.RuntimeException r1 = A09(r2, r0)     // Catch:{ 8RX -> 0x1357 }
            goto L_0x1356
        L_0x1211:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ 8RX -> 0x1357 }
            java.lang.String r0 = "invalid runtime function index "
            java.lang.String r0 = X.AnonymousClass000.A0Y(r0, r1, r2)     // Catch:{ 8RX -> 0x1357 }
            A0D(r0)     // Catch:{ 8RX -> 0x1357 }
            java.lang.RuntimeException r1 = X.AnonymousClass000.A0L()     // Catch:{ 8RX -> 0x1357 }
            goto L_0x1356
        L_0x1224:
            java.lang.String r0 = "Substring length out of range"
            goto L_0x1229
        L_0x1227:
            java.lang.String r0 = "Substring offset out of range"
        L_0x1229:
            A0D(r0)     // Catch:{ 8RX -> 0x1357 }
            java.lang.RuntimeException r1 = X.AnonymousClass000.A0L()     // Catch:{ 8RX -> 0x1357 }
            goto L_0x1356
        L_0x1232:
            java.lang.String r0 = "SubstringCompare length out of range"
            goto L_0x1237
        L_0x1235:
            java.lang.String r0 = "SubstringCompare offset out of range"
        L_0x1237:
            A0D(r0)     // Catch:{ 8RX -> 0x1357 }
            java.lang.RuntimeException r1 = X.AnonymousClass000.A0L()     // Catch:{ 8RX -> 0x1357 }
            goto L_0x1356
        L_0x1240:
            java.lang.String r0 = "StringSearch length out of range"
            goto L_0x1245
        L_0x1243:
            java.lang.String r0 = "StringSearch offset out of range"
        L_0x1245:
            A0D(r0)     // Catch:{ 8RX -> 0x1357 }
            java.lang.RuntimeException r1 = X.AnonymousClass000.A0L()     // Catch:{ 8RX -> 0x1357 }
            goto L_0x1356
        L_0x124e:
            r3 = move-exception
            java.lang.String r2 = "ArrayCopy dst must be mutable"
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ 8RX -> 0x1357 }
            java.lang.String r0 = "TypeError: "
            java.lang.String r0 = X.AnonymousClass000.A0V(r0, r2, r1)     // Catch:{ 8RX -> 0x1357 }
            X.8RX r1 = new X.8RX     // Catch:{ 8RX -> 0x1357 }
            r1.<init>(r0, r3)     // Catch:{ 8RX -> 0x1357 }
            goto L_0x1356
        L_0x1262:
            java.lang.String r0 = "ArrayCopy length out of range"
            A0D(r0)     // Catch:{ 8RX -> 0x1357 }
            java.lang.RuntimeException r1 = X.AnonymousClass000.A0L()     // Catch:{ 8RX -> 0x1357 }
            goto L_0x1356
        L_0x126d:
            java.lang.String r0 = "ArrayCopy dst index out of range"
            A0D(r0)     // Catch:{ 8RX -> 0x1357 }
            java.lang.RuntimeException r1 = X.AnonymousClass000.A0L()     // Catch:{ 8RX -> 0x1357 }
            goto L_0x1356
        L_0x1278:
            java.lang.String r0 = "ArrayCopy src index out of range"
            A0D(r0)     // Catch:{ 8RX -> 0x1357 }
            java.lang.RuntimeException r1 = X.AnonymousClass000.A0L()     // Catch:{ 8RX -> 0x1357 }
            goto L_0x1356
        L_0x1283:
            java.lang.String r0 = "too many arguments to apply"
            java.lang.RuntimeException r1 = A0A(r0)     // Catch:{ 8RX -> 0x1357 }
            goto L_0x1356
        L_0x128b:
            java.lang.String r0 = "last apply() argument must be a vector or undefined"
            java.lang.RuntimeException r1 = A09(r6, r0)     // Catch:{ 8RX -> 0x1357 }
            goto L_0x1356
        L_0x1293:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ 8RX -> 0x1357 }
            java.lang.String r0 = "Expected stack value of closure type for opcode "
            r1.append(r0)     // Catch:{ 8RX -> 0x1357 }
            java.lang.String[] r0 = X.AnonymousClass77O.A00     // Catch:{ 8RX -> 0x1357 }
            r0 = r0[r3]     // Catch:{ 8RX -> 0x1357 }
            java.lang.String r0 = X.AnonymousClass000.A0X(r0, r1)     // Catch:{ 8RX -> 0x1357 }
            java.lang.RuntimeException r1 = A09(r2, r0)     // Catch:{ 8RX -> 0x1357 }
            goto L_0x1356
        L_0x12aa:
            java.lang.String r0 = "get_element_count argument must be a container or string"
            java.lang.RuntimeException r1 = A09(r1, r0)     // Catch:{ 8RX -> 0x1357 }
            goto L_0x1356
        L_0x12b2:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ 8RX -> 0x1357 }
            java.lang.String r0 = "Type assertion failed. Expected "
            r1.append(r0)     // Catch:{ 8RX -> 0x1357 }
            r1.append(r4)     // Catch:{ 8RX -> 0x1357 }
            java.lang.String r0 = ", got "
            r1.append(r0)     // Catch:{ 8RX -> 0x1357 }
            if (r3 != 0) goto L_0x12c8
            java.lang.String r0 = "null"
            goto L_0x12cc
        L_0x12c8:
            java.lang.String r0 = X.AnonymousClass000.A0O(r3)     // Catch:{ 8RX -> 0x1357 }
        L_0x12cc:
            java.lang.String r0 = X.AnonymousClass000.A0X(r0, r1)     // Catch:{ 8RX -> 0x1357 }
            java.lang.RuntimeException r1 = A0A(r0)     // Catch:{ 8RX -> 0x1357 }
            goto L_0x1356
        L_0x12d6:
            java.lang.String r0 = "CHR16 operand must be numeric"
            java.lang.RuntimeException r1 = A09(r1, r0)     // Catch:{ 8RX -> 0x1357 }
            goto L_0x1356
        L_0x12dd:
            java.lang.String r0 = "TO_UINT32 operand must be numeric"
            java.lang.RuntimeException r1 = A09(r1, r0)     // Catch:{ 8RX -> 0x1357 }
            goto L_0x1356
        L_0x12e4:
            java.lang.String r0 = "TRUNC operand must be numeric"
            java.lang.RuntimeException r1 = A09(r1, r0)     // Catch:{ 8RX -> 0x1357 }
            goto L_0x1356
        L_0x12eb:
            java.lang.String r0 = "NEG operand must be numeric"
            java.lang.RuntimeException r1 = A09(r1, r0)     // Catch:{ 8RX -> 0x1357 }
            goto L_0x1356
        L_0x12f2:
            java.lang.String r0 = "BIN_NOT operand must be numeric"
            java.lang.RuntimeException r1 = A09(r1, r0)     // Catch:{ 8RX -> 0x1357 }
            goto L_0x1356
        L_0x12f9:
            java.lang.String r0 = "INT64_NEG operand must be numeric"
            java.lang.RuntimeException r1 = A09(r1, r0)     // Catch:{ 8RX -> 0x1357 }
            goto L_0x1356
        L_0x1300:
            java.lang.String r0 = "INT64_NOT operand must be numeric"
            java.lang.RuntimeException r1 = A09(r1, r0)     // Catch:{ 8RX -> 0x1357 }
            goto L_0x1356
        L_0x1307:
            java.lang.IllegalStateException r1 = X.AnonymousClass001.A0e(r1)     // Catch:{ 8RX -> 0x1357 }
            goto L_0x1356
        L_0x130c:
            java.lang.Object r3 = A08(r10)     // Catch:{ 8RX -> 0x1357 }
            boolean r0 = r3 instanceof java.lang.String     // Catch:{ 8RX -> 0x1357 }
            if (r0 == 0) goto L_0x1326
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ 8RX -> 0x1357 }
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ 8RX -> 0x1357 }
            java.lang.String r0 = "UserError: "
            java.lang.String r0 = X.AnonymousClass000.A0V(r0, r3, r1)     // Catch:{ 8RX -> 0x1357 }
            X.8RX r1 = new X.8RX     // Catch:{ 8RX -> 0x1357 }
            r1.<init>(r0)     // Catch:{ 8RX -> 0x1357 }
            goto L_0x1356
        L_0x1326:
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()     // Catch:{ 8RX -> 0x1357 }
            java.lang.String r0 = "Expected stack value of string type for opcode "
            r2.append(r0)     // Catch:{ 8RX -> 0x1357 }
            r1 = 12
            java.lang.String[] r0 = X.AnonymousClass77O.A00     // Catch:{ 8RX -> 0x1357 }
            r0 = r0[r1]     // Catch:{ 8RX -> 0x1357 }
            java.lang.String r0 = X.AnonymousClass000.A0X(r0, r2)     // Catch:{ 8RX -> 0x1357 }
            java.lang.RuntimeException r1 = A09(r3, r0)     // Catch:{ 8RX -> 0x1357 }
            goto L_0x1356
        L_0x133e:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ 8RX -> 0x1357 }
            java.lang.String r0 = "Unsupported opcode "
            r1.append(r0)     // Catch:{ 8RX -> 0x1357 }
            java.lang.String[] r0 = X.AnonymousClass77O.A00     // Catch:{ 8RX -> 0x1357 }
            r0 = r0[r5]     // Catch:{ 8RX -> 0x1357 }
            java.lang.String r0 = X.AnonymousClass000.A0X(r0, r1)     // Catch:{ 8RX -> 0x1357 }
            A0F(r0)     // Catch:{ 8RX -> 0x1357 }
            java.lang.RuntimeException r1 = X.AnonymousClass000.A0L()     // Catch:{ 8RX -> 0x1357 }
        L_0x1356:
            throw r1     // Catch:{ 8RX -> 0x1357 }
        L_0x1357:
            r4 = move-exception
            java.io.StringWriter r5 = new java.io.StringWriter
            r5.<init>()
            java.lang.String r0 = r4.getMessage()
            java.io.StringWriter r1 = r5.append(r0)
            r0 = 10
            java.io.StringWriter r6 = r1.append(r0)
            java.lang.StringBuilder r7 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "mins stack trace:\n"
            r7.append(r0)
            int r2 = r10.A00
            int r1 = r2 + -4
            java.lang.Object[] r0 = r10.A05
            r0 = r0[r1]
            X.7KA r1 = A03(r0)
            r0 = r16
            A0B(r1, r7, r0)
        L_0x1385:
            int[] r1 = r10.A04
            r3 = r1[r2]
            if (r3 != 0) goto L_0x13af
            java.lang.String r0 = r7.toString()
            r6.append(r0)
            java.lang.Throwable r1 = r4.getCause()
            if (r1 == 0) goto L_0x13a5
            java.lang.String r0 = "\n\nNative Stack Trace:\n"
            r5.append(r0)
            java.io.PrintWriter r0 = new java.io.PrintWriter
            r0.<init>(r5)
            r1.printStackTrace(r0)
        L_0x13a5:
            java.lang.String r1 = r5.toString()
            X.8Rc r0 = new X.8Rc
            r0.<init>(r1, r4)
            throw r0
        L_0x13af:
            int r0 = r2 + -1
            r2 = r1[r0]
            int r1 = r3 + -4
            java.lang.Object[] r0 = r10.A05
            r0 = r0[r1]
            X.7KA r0 = A03(r0)
            A0B(r0, r7, r2)
            r2 = r3
            goto L_0x1385
        L_0x13c2:
            r0 = 0
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0e(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C162427s4.A0N():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002e, code lost:
        r7 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x006d, code lost:
        if (r4 > 0) goto L_0x002e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0072, code lost:
        if (r4 < 0) goto L_0x002f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0028, code lost:
        if (r9 != 1) goto L_0x002a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0U(int r9, java.lang.String r10) {
        /*
            r8 = this;
            r7 = 0
            int r0 = r8.A01
            int r1 = r0 + -1
            java.lang.Object[] r0 = r8.A05
            r4 = r0[r1]
            r5 = 1
            int r1 = r1 - r5
            r2 = r0[r1]
            boolean r0 = r2 instanceof java.lang.Long
            r6 = 2
            if (r0 == 0) goto L_0x003f
            boolean r0 = r4 instanceof java.lang.Long
            if (r0 == 0) goto L_0x003f
            long r2 = X.C18310x6.A0B(r2)
            boolean r0 = r4 instanceof java.lang.Long
            if (r0 == 0) goto L_0x003d
            java.lang.Number r4 = (java.lang.Number) r4
        L_0x0020:
            long r0 = r4.longValue()
            int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
        L_0x0026:
            if (r9 == 0) goto L_0x0072
            if (r9 == r5) goto L_0x006d
        L_0x002a:
            if (r9 == r6) goto L_0x003a
            if (r4 > 0) goto L_0x002f
        L_0x002e:
            r7 = 1
        L_0x002f:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r7)
            r8.A0R(r5, r0)
            r8.A0O()
            return
        L_0x003a:
            if (r4 >= 0) goto L_0x002f
            goto L_0x002e
        L_0x003d:
            r4 = 0
            goto L_0x0020
        L_0x003f:
            boolean r0 = r2 instanceof java.lang.String
            if (r0 == 0) goto L_0x0050
            boolean r0 = r4 instanceof java.lang.String
            if (r0 == 0) goto L_0x0050
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r4 = (java.lang.String) r4
            int r4 = r2.compareTo(r4)
            goto L_0x0026
        L_0x0050:
            java.lang.Number r1 = A04(r2)
            java.lang.Number r0 = A04(r4)
            if (r1 == 0) goto L_0x0075
            if (r0 == 0) goto L_0x0075
            double r2 = r1.doubleValue()
            double r0 = r0.doubleValue()
            if (r9 == 0) goto L_0x0070
            if (r9 == r5) goto L_0x006b
            int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            goto L_0x002a
        L_0x006b:
            int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
        L_0x006d:
            if (r4 <= 0) goto L_0x002f
            goto L_0x002e
        L_0x0070:
            int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
        L_0x0072:
            if (r4 < 0) goto L_0x002f
            goto L_0x002e
        L_0x0075:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "Incompatible operand types of "
            java.lang.String r0 = X.AnonymousClass000.A0V(r0, r10, r1)
            A0C(r2, r4, r0)
            java.lang.RuntimeException r0 = X.AnonymousClass000.A0L()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C162427s4.A0U(int, java.lang.String):void");
    }

    public static final int A02(Object obj) {
        if (obj == null) {
            return 0;
        }
        if (obj instanceof Boolean) {
            return 1;
        }
        if (obj instanceof Long) {
            return 3;
        }
        if (A0H(obj)) {
            return 4;
        }
        if (obj instanceof String) {
            return 2;
        }
        if (obj instanceof List) {
            return 6;
        }
        if (obj instanceof Map) {
            return 7;
        }
        if (obj instanceof C155787fV) {
            return 8;
        }
        return 5;
    }

    public static AnonymousClass7KA A03(Object obj) {
        AnonymousClass7KA r0 = ((C155787fV) obj).A00.A00;
        if (r0 != null) {
            return r0;
        }
        throw AnonymousClass001.A0e("The Lispy expression has not been parsed");
    }

    public static Number A05(Object obj) {
        int A022;
        double d;
        Number number;
        if ((obj instanceof Long) && (number = (Number) obj) != null) {
            A022 = number.intValue();
        } else if (obj instanceof Boolean) {
            if (AnonymousClass001.A1Z(obj)) {
                d = 1.0d;
            } else {
                d = 0.0d;
            }
            return C159427lo.A00(d);
        } else if (!A0H(obj)) {
            return null;
        } else {
            A022 = (int) ((long) AnonymousClass6C9.A02(obj));
        }
        d = (double) A022;
        return C159427lo.A00(d);
    }

    public static Number A06(Object obj) {
        long A022;
        Number number;
        if ((obj instanceof Long) && (number = (Number) obj) != null) {
            return number;
        }
        if (obj instanceof Boolean) {
            A022 = C18290x4.A09(AnonymousClass001.A1Z(obj) ? 1 : 0);
        } else if (!A0H(obj)) {
            return null;
        } else {
            A022 = (long) AnonymousClass6C9.A02(obj);
        }
        return Long.valueOf(A022);
    }

    public static Object A08(C162427s4 r2) {
        return r2.A05[r2.A01 - 1];
    }

    public static void A0B(AnonymousClass7KA r5, StringBuilder sb, int i) {
        AnonymousClass7TT r3 = r5.A00;
        C160437nd r2 = r3.A03;
        ByteBuffer byteBuffer = r2.A01;
        ByteBuffer duplicate = byteBuffer.duplicate();
        duplicate.order(byteBuffer.order());
        int i2 = r3.A02;
        duplicate.position(i2);
        duplicate.limit(r3.A00 + i2);
        if (AnonymousClass6CA.A08(duplicate, i) == 4) {
            sb.append("  at extension function ");
            sb.append((String) r2.A01(duplicate.getShort(i + 1) & 65535));
            sb.append(10);
        }
        sb.append("  at offset ");
        sb.append(i - r2.A04[2].A02);
        AnonymousClass6C8.A1D("  (offset ", sb, i, i2);
        sb.append(" in function ");
        sb.append((String) r2.A01(r3.A01));
        sb.append(')');
        sb.append(" in script \"");
        sb.append(r2.A00);
        sb.append('\"');
        sb.append("\n");
    }

    public static boolean A0H(Object obj) {
        if (!(obj instanceof Number) || (obj instanceof Long)) {
            return false;
        }
        return true;
    }

    public static boolean A0I(Object obj) {
        if (obj instanceof Boolean) {
            return AnonymousClass001.A1Z(obj);
        }
        if (!AnonymousClass000.A1X(obj)) {
            if (obj instanceof String) {
                return !((String) obj).isEmpty();
            }
            if (A0H(obj)) {
                double A022 = AnonymousClass6C9.A02(obj);
                if (A022 == 0.0d || Double.isNaN(A022)) {
                    return false;
                }
                return true;
            } else if (!(obj instanceof Long) || C18310x6.A0B(obj) != 0) {
                return true;
            }
        }
        return false;
    }

    public int A0K(Object obj, String str, int i) {
        int i2;
        int i3;
        if (obj instanceof Long) {
            long A0B2 = C18310x6.A0B(obj);
            i2 = (int) A0B2;
            i3 = (((long) i2) > A0B2 ? 1 : (((long) i2) == A0B2 ? 0 : -1));
        } else {
            if (A0H(obj)) {
                double A022 = AnonymousClass6C9.A02(obj);
                i2 = (int) A022;
                i3 = (((double) i2) > A022 ? 1 : (((double) i2) == A022 ? 0 : -1));
            }
            throw A0A(str);
        }
        if (i3 == 0 && i2 >= 0 && i2 <= i) {
            return i2;
        }
        throw A0A(str);
    }

    public Object A0L(Object obj) {
        if (obj instanceof Boolean) {
            if (AnonymousClass001.A1Z(obj)) {
                return "true";
            }
            return "false";
        } else if (obj instanceof Long) {
            return Long.toString(C18310x6.A0B(obj));
        } else {
            if (A0H(obj)) {
                double A022 = AnonymousClass6C9.A02(obj);
                int i = (int) A022;
                if (((double) i) == A022) {
                    return Integer.toString(i);
                }
                String d = Double.toString(A022);
                int indexOf = d.indexOf(69);
                if (indexOf < 0) {
                    return d;
                }
                int length = d.length();
                int i2 = length + 1;
                char[] cArr = new char[i2];
                d.getChars(0, indexOf, cArr, 0);
                cArr[indexOf] = 'e';
                int i3 = indexOf + 1;
                if (d.charAt(i3) == '-') {
                    d.getChars(i3, length, cArr, i3);
                } else {
                    cArr[i3] = '+';
                    d.getChars(i3, length, cArr, indexOf + 2);
                    length = i2;
                }
                return new String(cArr, 0, length);
            } else if (obj instanceof String) {
                return obj;
            } else {
                throw A09(obj, "Value cannot be converted to string");
            }
        }
    }

    public final Map A0M(Object obj, int i) {
        if (obj instanceof Map) {
            return (Map) obj;
        }
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("Expected stack value of map type for opcode ");
        throw A09(obj, AnonymousClass000.A0X(AnonymousClass77O.A00[i], A0o));
    }

    public final void A0O() {
        int i = this.A01 - 1;
        this.A01 = i;
        this.A05[i] = null;
    }

    public void A0P(int i) {
        int i2 = this.A01 - i;
        this.A01 = i2;
        Arrays.fill(this.A05, i2, i + i2, (Object) null);
    }

    public final void A0Q(int i) {
        Object[] objArr = this.A05;
        int length = objArr.length;
        int i2 = this.A01;
        if (length - i2 < i) {
            int i3 = i2 + i;
            int i4 = 536870912;
            if (i3 > 536870912) {
                throw AnonymousClass001.A0e("MinScript stack overflow");
            }
            do {
                length <<= 1;
            } while (length < i3);
            if (length <= 536870912) {
                i4 = length;
            }
            Object[] objArr2 = new Object[i4];
            System.arraycopy(objArr, 0, objArr2, 0, i2);
            this.A05 = objArr2;
            int[] iArr = new int[i4];
            System.arraycopy(this.A04, 0, iArr, 0, this.A01);
            this.A04 = iArr;
        }
    }

    public final void A0R(int i, Object obj) {
        this.A05[(this.A01 - i) - 1] = obj;
    }

    public final void A0S(int i, String str) {
        double doubleValue;
        int i2;
        int i3 = this.A01 - 1;
        Object[] objArr = this.A05;
        Object obj = objArr[i3];
        Object obj2 = objArr[i3 - 1];
        Number A042 = A04(obj2);
        Number A043 = A04(obj);
        if (A042 == null || A043 == null) {
            A0C(obj2, obj, AnonymousClass000.A0V("Incompatible operand types of ", str, AnonymousClass001.A0o()));
            throw AnonymousClass000.A0L();
        }
        switch (i) {
            case 0:
                doubleValue = A042.doubleValue() * A043.doubleValue();
                break;
            case 1:
                doubleValue = (double) ((int) ((A042.longValue() & 4294967295L) * (A043.longValue() & 4294967295L)));
                break;
            case 2:
                doubleValue = A042.doubleValue() / A043.doubleValue();
                break;
            case 3:
                doubleValue = A042.doubleValue() % A043.doubleValue();
                break;
            case 4:
                doubleValue = A042.doubleValue() - A043.doubleValue();
                break;
            case 5:
                doubleValue = A042.doubleValue() + A043.doubleValue();
                break;
            case 6:
                i2 = ((int) ((long) A042.doubleValue())) & ((int) ((long) A043.doubleValue()));
                break;
            case 7:
                i2 = ((int) ((long) A042.doubleValue())) | ((int) ((long) A043.doubleValue()));
                break;
            case 8:
                i2 = ((int) ((long) A042.doubleValue())) ^ ((int) ((long) A043.doubleValue()));
                break;
            case 9:
                i2 = ((int) ((long) A042.doubleValue())) << (((int) ((long) A043.doubleValue())) & 31);
                break;
            case 10:
                i2 = ((int) ((long) A042.doubleValue())) >> (((int) ((long) A043.doubleValue())) & 31);
                break;
            default:
                doubleValue = (double) (((long) (((int) ((long) A042.doubleValue())) >>> (((int) ((long) A043.doubleValue())) & 31))) & 4294967295L);
                break;
        }
        doubleValue = (double) i2;
        A0R(1, C159427lo.A00(doubleValue));
        A0O();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00a2, code lost:
        throw A0A(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x002a, code lost:
        A0R(1, java.lang.Long.valueOf(r4));
        A0O();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0034, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0T(int r11, java.lang.String r12) {
        /*
            r10 = this;
            int r0 = r10.A01
            int r1 = r0 + -1
            java.lang.Object[] r0 = r10.A05
            r4 = r0[r1]
            r3 = 1
            int r1 = r1 - r3
            r2 = r0[r1]
            java.lang.Number r9 = A06(r2)
            java.lang.Number r8 = A06(r4)
            if (r9 == 0) goto L_0x00b9
            if (r8 == 0) goto L_0x00b9
            r4 = 0
            r6 = 63
            switch(r11) {
                case 12: goto L_0x00ae;
                case 13: goto L_0x0094;
                case 14: goto L_0x007f;
                case 15: goto L_0x0075;
                case 16: goto L_0x006b;
                case 17: goto L_0x0061;
                case 18: goto L_0x0057;
                case 19: goto L_0x004d;
                case 20: goto L_0x0041;
                case 21: goto L_0x0035;
                default: goto L_0x001f;
            }
        L_0x001f:
            long r4 = r9.longValue()
            long r1 = r8.longValue()
            long r1 = r1 & r6
            int r0 = (int) r1
            long r4 = r4 >>> r0
        L_0x002a:
            java.lang.Long r0 = java.lang.Long.valueOf(r4)
            r10.A0R(r3, r0)
            r10.A0O()
            return
        L_0x0035:
            long r4 = r9.longValue()
            long r1 = r8.longValue()
            long r1 = r1 & r6
            int r0 = (int) r1
            long r4 = r4 >> r0
            goto L_0x002a
        L_0x0041:
            long r4 = r9.longValue()
            long r1 = r8.longValue()
            long r1 = r1 & r6
            int r0 = (int) r1
            long r4 = r4 << r0
            goto L_0x002a
        L_0x004d:
            long r4 = r9.longValue()
            long r0 = r8.longValue()
            long r4 = r4 ^ r0
            goto L_0x002a
        L_0x0057:
            long r4 = r9.longValue()
            long r0 = r8.longValue()
            long r4 = r4 | r0
            goto L_0x002a
        L_0x0061:
            long r4 = r9.longValue()
            long r0 = r8.longValue()
            long r4 = r4 & r0
            goto L_0x002a
        L_0x006b:
            long r4 = r9.longValue()
            long r0 = r8.longValue()
            long r4 = r4 + r0
            goto L_0x002a
        L_0x0075:
            long r4 = r9.longValue()
            long r0 = r8.longValue()
            long r4 = r4 - r0
            goto L_0x002a
        L_0x007f:
            long r1 = r8.longValue()
            int r0 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r0 != 0) goto L_0x008a
            java.lang.String r0 = "INT64_MOD division by zero"
            goto L_0x009e
        L_0x008a:
            long r4 = r9.longValue()
            long r0 = r8.longValue()
            long r4 = r4 % r0
            goto L_0x002a
        L_0x0094:
            long r1 = r8.longValue()
            int r0 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r0 != 0) goto L_0x00a3
            java.lang.String r0 = "INT64_DIV division by zero"
        L_0x009e:
            java.lang.RuntimeException r0 = A0A(r0)
            throw r0
        L_0x00a3:
            long r4 = r9.longValue()
            long r0 = r8.longValue()
            long r4 = r4 / r0
            goto L_0x002a
        L_0x00ae:
            long r4 = r9.longValue()
            long r0 = r8.longValue()
            long r4 = r4 * r0
            goto L_0x002a
        L_0x00b9:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "Incompatible operand types of "
            java.lang.String r0 = X.AnonymousClass000.A0V(r0, r12, r1)
            A0C(r2, r4, r0)
            java.lang.RuntimeException r0 = X.AnonymousClass000.A0L()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C162427s4.A0T(int, java.lang.String):void");
    }

    public final void A0V(Object obj) {
        Object[] objArr = this.A05;
        int i = this.A01;
        objArr[i] = obj;
        this.A01 = i + 1;
    }

    public static double A00(C158067jN r0, int i) {
        return A01(r0.A01(i));
    }

    public static double A01(Object obj) {
        Number number;
        if (A0H(obj) && (number = (Number) obj) != null) {
            return number.doubleValue();
        }
        if (obj instanceof Boolean) {
            if (AnonymousClass001.A1Z(obj)) {
                return 1.0d;
            }
            return 0.0d;
        } else if (obj instanceof Long) {
            return (double) C18310x6.A0B(obj);
        } else {
            return Double.NaN;
        }
    }

    public static Number A04(Object obj) {
        Object obj2;
        Number number;
        if (A0H(obj) && (number = (Number) obj) != null) {
            return number;
        }
        if (obj instanceof Boolean) {
            if (AnonymousClass001.A1Z(obj)) {
                obj2 = A0A;
            } else {
                obj2 = A0C;
            }
            if (A0H(obj2)) {
                return (Number) obj2;
            }
            return null;
        } else if (obj instanceof Long) {
            return C159427lo.A00((double) C18310x6.A0B(obj));
        } else {
            return null;
        }
    }

    public static Object A07(C158067jN r0, Object obj, int i, boolean z) {
        AnonymousClass73P.A00(obj, z);
        return r0.A01(i);
    }

    public static RuntimeException A09(Object obj, String str) {
        A0G(str, obj);
        return new RuntimeException("Redex: Unreachable code after no-return invoke");
    }

    public static RuntimeException A0A(String str) {
        A0E(str);
        return new RuntimeException("Redex: Unreachable code after no-return invoke");
    }

    public static final void A0C(Object obj, Object obj2, String str) {
        String A0O;
        String A0O2;
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("TypeError: ");
        A0o.append(str);
        A0o.append(". Got ");
        if (obj == null) {
            A0O = "null";
        } else {
            A0O = AnonymousClass000.A0O(obj);
        }
        A0o.append(A0O);
        A0o.append(" and ");
        if (obj2 == null) {
            A0O2 = "null";
        } else {
            A0O2 = AnonymousClass000.A0O(obj2);
        }
        throw new AnonymousClass8RX(AnonymousClass000.A0X(A0O2, A0o));
    }

    public static void A0D(String str) {
        throw new AnonymousClass8RX(AnonymousClass000.A0V("RangeError: ", str, AnonymousClass001.A0o()));
    }

    public static void A0E(String str) {
        throw new AnonymousClass8RX(AnonymousClass000.A0V("TypeError: ", str, AnonymousClass001.A0o()));
    }

    public static final void A0F(String str) {
        throw new C173668Rc(AnonymousClass000.A0V("InvalidBytecode: ", str, AnonymousClass001.A0o()));
    }

    public static void A0G(String str, Object obj) {
        String A0O;
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("TypeError: ");
        A0o.append(str);
        A0o.append(". Got ");
        if (obj == null) {
            A0O = "null";
        } else {
            A0O = AnonymousClass000.A0O(obj);
        }
        throw new AnonymousClass8RX(AnonymousClass000.A0X(A0O, A0o));
    }

    public final void A0W(Object obj, Object obj2, int i, int i2) {
        A0V(obj);
        int[] iArr = this.A04;
        int i3 = this.A01;
        iArr[i3] = i;
        this.A01 = i3 + 1;
        A0V(obj2);
        int i4 = this.A01;
        iArr[i4] = i2;
        int i5 = i4 + 1;
        this.A01 = i5;
        iArr[i5] = this.A00;
        int i6 = i5 + 1;
        this.A01 = i6;
        this.A00 = i6 - 1;
    }
}
