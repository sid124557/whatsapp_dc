package X;

import java.io.IOException;
import java.math.BigInteger;
import java.util.concurrent.ConcurrentMap;

/* renamed from: X.8dX  reason: invalid class name and case insensitive filesystem */
public class C176768dX extends C177088e3 {
    public static final ConcurrentMap A02 = AnonymousClass0x9.A1D();
    public byte[] A00;
    public final String A01;

    /* JADX WARNING: Removed duplicated region for block: B:26:0x0083  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0087  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00a9  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00d8  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized byte[] A0U() {
        /*
            r13 = this;
            monitor-enter(r13)
            byte[] r0 = r13.A00     // Catch:{ all -> 0x00e0 }
            if (r0 != 0) goto L_0x00de
            java.io.ByteArrayOutputStream r6 = X.AnonymousClass0x9.A0e()     // Catch:{ all -> 0x00e0 }
            java.lang.String r5 = r13.A01     // Catch:{ all -> 0x00e0 }
            r1 = 0
            r2 = 0
            r0 = -1
            r4 = 46
            int r1 = r5.indexOf(r4, r1)     // Catch:{ all -> 0x00e0 }
            if (r1 != r0) goto L_0x0025
            java.lang.String r0 = r5.substring(r2)     // Catch:{ all -> 0x00e0 }
            r3 = -1
        L_0x001b:
            int r0 = java.lang.Integer.parseInt(r0)     // Catch:{ all -> 0x00e0 }
            int r9 = r0 * 40
            r1 = -1
            if (r3 != r1) goto L_0x002e
            goto L_0x002c
        L_0x0025:
            java.lang.String r0 = r5.substring(r2, r1)     // Catch:{ all -> 0x00e0 }
            int r3 = r1 + 1
            goto L_0x001b
        L_0x002c:
            r8 = 0
            goto L_0x0039
        L_0x002e:
            int r0 = r5.indexOf(r4, r3)     // Catch:{ all -> 0x00e0 }
            if (r0 != r1) goto L_0x00d0
            java.lang.String r8 = r5.substring(r3)     // Catch:{ all -> 0x00e0 }
            r3 = -1
        L_0x0039:
            int r0 = r8.length()     // Catch:{ all -> 0x00e0 }
            r2 = 18
            if (r0 > r2) goto L_0x006a
            long r0 = (long) r9     // Catch:{ all -> 0x00e0 }
            long r7 = java.lang.Long.parseLong(r8)     // Catch:{ all -> 0x00e0 }
            long r0 = r0 + r7
        L_0x0047:
            r7 = 9
            byte[] r9 = new byte[r7]     // Catch:{ all -> 0x00e0 }
            int r7 = (int) r0     // Catch:{ all -> 0x00e0 }
            r7 = r7 & 127(0x7f, float:1.78E-43)
            byte r7 = (byte) r7     // Catch:{ all -> 0x00e0 }
            r8 = 8
        L_0x0051:
            r9[r8] = r7     // Catch:{ all -> 0x00e0 }
            r10 = 128(0x80, double:6.32E-322)
            int r7 = (r0 > r10 ? 1 : (r0 == r10 ? 0 : -1))
            if (r7 < 0) goto L_0x0064
            r7 = 7
            long r0 = r0 >> r7
            int r8 = r8 + -1
            int r7 = (int) r0     // Catch:{ all -> 0x00e0 }
            r7 = r7 & 127(0x7f, float:1.78E-43)
            r7 = r7 | 128(0x80, float:1.794E-43)
            byte r7 = (byte) r7     // Catch:{ all -> 0x00e0 }
            goto L_0x0051
        L_0x0064:
            int r0 = 9 - r8
            r6.write(r9, r8, r0)     // Catch:{ all -> 0x00e0 }
            goto L_0x00a6
        L_0x006a:
            java.math.BigInteger r7 = new java.math.BigInteger     // Catch:{ all -> 0x00e0 }
            r7.<init>(r8)     // Catch:{ all -> 0x00e0 }
            long r0 = (long) r9     // Catch:{ all -> 0x00e0 }
            java.math.BigInteger r0 = java.math.BigInteger.valueOf(r0)     // Catch:{ all -> 0x00e0 }
            java.math.BigInteger r12 = r7.add(r0)     // Catch:{ all -> 0x00e0 }
        L_0x0078:
            int r0 = r12.bitLength()     // Catch:{ all -> 0x00e0 }
            int r11 = r0 + 6
            r10 = 7
            int r11 = r11 / r10
            r9 = 0
            if (r11 != 0) goto L_0x0087
            r6.write(r9)     // Catch:{ all -> 0x00e0 }
            goto L_0x00a6
        L_0x0087:
            byte[] r8 = new byte[r11]     // Catch:{ all -> 0x00e0 }
            int r7 = r11 + -1
            r1 = r7
        L_0x008c:
            if (r1 < 0) goto L_0x009c
            int r0 = r12.intValue()     // Catch:{ all -> 0x00e0 }
            X.AnonymousClass6C9.A1H(r8, r0, r1)     // Catch:{ all -> 0x00e0 }
            java.math.BigInteger r12 = r12.shiftRight(r10)     // Catch:{ all -> 0x00e0 }
            int r1 = r1 + -1
            goto L_0x008c
        L_0x009c:
            byte r0 = r8[r7]     // Catch:{ all -> 0x00e0 }
            r0 = r0 & 127(0x7f, float:1.78E-43)
            byte r0 = (byte) r0     // Catch:{ all -> 0x00e0 }
            r8[r7] = r0     // Catch:{ all -> 0x00e0 }
            r6.write(r8, r9, r11)     // Catch:{ all -> 0x00e0 }
        L_0x00a6:
            r1 = -1
            if (r3 == r1) goto L_0x00d8
            if (r3 != r1) goto L_0x00ad
            r1 = 0
            goto L_0x00b8
        L_0x00ad:
            int r0 = r5.indexOf(r4, r3)     // Catch:{ all -> 0x00e0 }
            if (r0 != r1) goto L_0x00c3
            java.lang.String r1 = r5.substring(r3)     // Catch:{ all -> 0x00e0 }
            r3 = -1
        L_0x00b8:
            int r0 = r1.length()     // Catch:{ all -> 0x00e0 }
            if (r0 > r2) goto L_0x00ca
            long r0 = java.lang.Long.parseLong(r1)     // Catch:{ all -> 0x00e0 }
            goto L_0x0047
        L_0x00c3:
            java.lang.String r1 = r5.substring(r3, r0)     // Catch:{ all -> 0x00e0 }
            int r3 = r0 + 1
            goto L_0x00b8
        L_0x00ca:
            java.math.BigInteger r12 = new java.math.BigInteger     // Catch:{ all -> 0x00e0 }
            r12.<init>(r1)     // Catch:{ all -> 0x00e0 }
            goto L_0x0078
        L_0x00d0:
            java.lang.String r8 = r5.substring(r3, r0)     // Catch:{ all -> 0x00e0 }
            int r3 = r0 + 1
            goto L_0x0039
        L_0x00d8:
            byte[] r0 = r6.toByteArray()     // Catch:{ all -> 0x00e0 }
            r13.A00 = r0     // Catch:{ all -> 0x00e0 }
        L_0x00de:
            monitor-exit(r13)
            return r0
        L_0x00e0:
            r0 = move-exception
            monitor-exit(r13)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C176768dX.A0U():byte[]");
    }

    public static C176768dX A0A(Object obj) {
        if (obj == null || (obj instanceof C176768dX)) {
            return (C176768dX) obj;
        }
        if (obj instanceof C183618qL) {
            C177088e3 Bqk = ((C183618qL) obj).Bqk();
            if (Bqk instanceof C176768dX) {
                return (C176768dX) Bqk;
            }
        }
        if (obj instanceof byte[]) {
            try {
                return (C176768dX) C177088e3.A0I((byte[]) obj);
            } catch (IOException e) {
                throw AnonymousClass001.A0c(AnonymousClass000.A0a("failed to construct object identifier from byte[]: ", AnonymousClass001.A0o(), e));
            }
        } else {
            StringBuilder A0o = AnonymousClass001.A0o();
            C18260x0.A1T(A0o, "illegal object in getInstance: ", obj);
            throw C18310x6.A0d(A0o);
        }
    }

    public static C176768dX A0B(String str) {
        return new C176768dX(str);
    }

    public static C176768dX A0C(String str) {
        C176768dX r3 = new C176768dX(str);
        C151707Vz r2 = new C151707Vz(r3.A0U());
        ConcurrentMap concurrentMap = A02;
        C176768dX r0 = (C176768dX) concurrentMap.get(r2);
        if (r0 == null && (r0 = (C176768dX) concurrentMap.putIfAbsent(r2, r3)) == null) {
            return r3;
        }
        return r0;
    }

    public static C176768dX A0D(String str, C176768dX r5) {
        C176768dX r3 = new C176768dX(str, r5);
        C151707Vz r2 = new C151707Vz(r3.A0U());
        ConcurrentMap concurrentMap = A02;
        C176768dX r0 = (C176768dX) concurrentMap.get(r2);
        if (r0 == null && (r0 = (C176768dX) concurrentMap.putIfAbsent(r2, r3)) == null) {
            return r3;
        }
        return r0;
    }

    public static C176768dX A0E(String str, C176768dX r2) {
        return new C176768dX(str, r2);
    }

    public int hashCode() {
        return this.A01.hashCode();
    }

    public String toString() {
        return this.A01;
    }

    public C176768dX(String str, C176768dX r4) {
        boolean A0F = A0F(str, 0);
        StringBuilder A0o = AnonymousClass001.A0o();
        if (A0F) {
            A0o.append(r4.A01);
            this.A01 = AnonymousClass000.A0V(".", str, A0o);
            return;
        }
        A0o.append("string ");
        A0o.append(str);
        throw AnonymousClass000.A0F(" not a valid OID branch", A0o);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0015, code lost:
        if (r4 == 0) goto L_0x0021;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0017, code lost:
        if (r4 <= 1) goto L_0x0005;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001f, code lost:
        if (r7.charAt(r6 + 1) != '0') goto L_0x0005;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean A0F(java.lang.String r7, int r8) {
        /*
            int r6 = r7.length()
            r5 = 0
        L_0x0005:
            r4 = 0
        L_0x0006:
            int r6 = r6 + -1
            r3 = 48
            r2 = 1
            if (r6 < r8) goto L_0x002b
            char r1 = r7.charAt(r6)
            r0 = 46
            if (r1 != r0) goto L_0x0022
            if (r4 == 0) goto L_0x0021
            if (r4 <= r2) goto L_0x0005
            int r0 = r6 + 1
            char r0 = r7.charAt(r0)
            if (r0 != r3) goto L_0x0005
        L_0x0021:
            return r5
        L_0x0022:
            if (r3 > r1) goto L_0x0021
            r0 = 57
            if (r1 > r0) goto L_0x0021
            int r4 = r4 + 1
            goto L_0x0006
        L_0x002b:
            if (r4 == 0) goto L_0x0021
            if (r4 <= r2) goto L_0x0038
            int r0 = r6 + 1
            char r0 = r7.charAt(r0)
            if (r0 != r3) goto L_0x0038
            return r5
        L_0x0038:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C176768dX.A0F(java.lang.String, int):boolean");
    }

    public C176768dX(byte[] bArr) {
        StringBuffer A0X = AnonymousClass6CA.A0X();
        boolean z = true;
        BigInteger bigInteger = null;
        int i = 0;
        long j = 0;
        while (true) {
            byte[] bArr2 = bArr;
            if (i != bArr2.length) {
                byte b = bArr[i] & 255;
                if (j <= 72057594037927808L) {
                    long j2 = j + ((long) (b & Byte.MAX_VALUE));
                    if ((b & 128) == 0) {
                        if (z) {
                            if (j2 < 40) {
                                A0X.append('0');
                            } else if (j2 < 80) {
                                A0X.append('1');
                                j2 -= 40;
                            } else {
                                A0X.append('2');
                                j2 -= 80;
                            }
                            z = false;
                        }
                        A0X.append('.');
                        A0X.append(j2);
                    } else {
                        j = j2 << 7;
                        i++;
                    }
                } else {
                    BigInteger or = (bigInteger == null ? BigInteger.valueOf(j) : bigInteger).or(BigInteger.valueOf((long) (b & Byte.MAX_VALUE)));
                    if ((b & 128) == 0) {
                        if (z) {
                            A0X.append('2');
                            or = or.subtract(BigInteger.valueOf(80));
                            z = false;
                        }
                        A0X.append('.');
                        A0X.append(or);
                        bigInteger = null;
                    } else {
                        bigInteger = or.shiftLeft(7);
                        i++;
                    }
                }
                j = 0;
                i++;
            } else {
                this.A01 = A0X.toString();
                this.A00 = C161007oo.A02(bArr2);
                return;
            }
        }
    }

    public C176768dX(String str) {
        char charAt;
        if (str == null) {
            throw AnonymousClass001.A0g("'identifier' cannot be null");
        } else if (str.length() < 3 || str.charAt(1) != '.' || (charAt = str.charAt(0)) < '0' || charAt > '2' || !A0F(str, 2)) {
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("string ");
            A0o.append(str);
            throw AnonymousClass000.A0F(" not an OID", A0o);
        } else {
            this.A01 = str;
        }
    }
}
