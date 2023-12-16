package X;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: X.0XT  reason: invalid class name */
public class AnonymousClass0XT {
    public final int A00;
    public final int A01;
    public final long A02;
    public final byte[] A03;

    public static AnonymousClass0XT A02(ByteOrder byteOrder, int[] iArr) {
        int i = AnonymousClass0YU.A0t[3];
        ByteBuffer wrap = ByteBuffer.wrap(new byte[(i * r3)]);
        wrap.order(byteOrder);
        for (int i2 : iArr) {
            wrap.putShort((short) i2);
        }
        return A01(wrap, 3, r3);
    }

    public static AnonymousClass0XT A03(ByteOrder byteOrder, long[] jArr) {
        int i = AnonymousClass0YU.A0t[4];
        ByteBuffer wrap = ByteBuffer.wrap(new byte[(i * r5)]);
        wrap.order(byteOrder);
        for (long j : jArr) {
            wrap.putInt((int) j);
        }
        return A01(wrap, 4, r5);
    }

    public static AnonymousClass0XT A04(ByteOrder byteOrder, AnonymousClass0NB[] r9) {
        int i = AnonymousClass0YU.A0t[5];
        ByteBuffer wrap = ByteBuffer.wrap(new byte[(i * r6)]);
        wrap.order(byteOrder);
        for (AnonymousClass0NB r3 : r9) {
            wrap.putInt((int) r3.A01);
            wrap.putInt((int) r3.A00);
        }
        return A01(wrap, 5, r6);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:41:?, code lost:
        r6.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0072, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0073, code lost:
        android.util.Log.e("ExifInterface", "IOException occurred while closing InputStream", r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0076, code lost:
        return r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0077, code lost:
        return r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:?, code lost:
        r6.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x00e9, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x00ea, code lost:
        android.util.Log.e("ExifInterface", "IOException occurred while closing InputStream", r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x00ed, code lost:
        return r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x00ee, code lost:
        return r9;
     */
    /* JADX WARNING: Removed duplicated region for block: B:134:0x0172 A[SYNTHETIC, Splitter:B:134:0x0172] */
    /* JADX WARNING: Removed duplicated region for block: B:143:0x017f A[SYNTHETIC, Splitter:B:143:0x017f] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object A05(java.nio.ByteOrder r15) {
        /*
            r14 = this;
            java.lang.String r5 = "IOException occurred while closing InputStream"
            java.lang.String r4 = "ExifInterface"
            r13 = 0
            byte[] r8 = r14.A03     // Catch:{ IOException -> 0x0169, all -> 0x0167 }
            X.0FE r6 = new X.0FE     // Catch:{ IOException -> 0x0169, all -> 0x0167 }
            r6.<init>(r8)     // Catch:{ IOException -> 0x0169, all -> 0x0167 }
            r6.A01 = r15     // Catch:{ IOException -> 0x0165 }
            int r0 = r14.A00     // Catch:{ IOException -> 0x0165 }
            r7 = 0
            r11 = 1
            switch(r0) {
                case 1: goto L_0x001f;
                case 2: goto L_0x0128;
                case 3: goto L_0x010f;
                case 4: goto L_0x00ef;
                case 5: goto L_0x00c4;
                case 6: goto L_0x001f;
                case 7: goto L_0x0128;
                case 8: goto L_0x00ab;
                case 9: goto L_0x0092;
                case 10: goto L_0x0078;
                case 11: goto L_0x005e;
                case 12: goto L_0x004f;
                default: goto L_0x0015;
            }     // Catch:{ IOException -> 0x0165 }
        L_0x0015:
            r6.close()     // Catch:{ IOException -> 0x0019 }
            goto L_0x001e
        L_0x0019:
            r0 = move-exception
            android.util.Log.e(r4, r5, r0)
            return r13
        L_0x001e:
            return r13
        L_0x001f:
            int r0 = r8.length     // Catch:{ IOException -> 0x0165 }
            if (r0 != r11) goto L_0x003e
            byte r0 = r8[r7]     // Catch:{ IOException -> 0x0165 }
            if (r0 < 0) goto L_0x003e
            if (r0 > r11) goto L_0x003e
            char[] r2 = new char[r11]     // Catch:{ IOException -> 0x0165 }
            int r0 = r0 + 48
            char r0 = (char) r0     // Catch:{ IOException -> 0x0165 }
            r2[r7] = r0     // Catch:{ IOException -> 0x0165 }
            java.lang.String r1 = new java.lang.String     // Catch:{ IOException -> 0x0165 }
            r1.<init>(r2)     // Catch:{ IOException -> 0x0165 }
            r6.close()     // Catch:{ IOException -> 0x0038 }
            goto L_0x003d
        L_0x0038:
            r0 = move-exception
            android.util.Log.e(r4, r5, r0)
            return r1
        L_0x003d:
            return r1
        L_0x003e:
            java.nio.charset.Charset r0 = X.AnonymousClass0YU.A0L     // Catch:{ IOException -> 0x0165 }
            java.lang.String r1 = new java.lang.String     // Catch:{ IOException -> 0x0165 }
            r1.<init>(r8, r0)     // Catch:{ IOException -> 0x0165 }
            r6.close()     // Catch:{ IOException -> 0x0049 }
            goto L_0x004e
        L_0x0049:
            r0 = move-exception
            android.util.Log.e(r4, r5, r0)
            return r1
        L_0x004e:
            return r1
        L_0x004f:
            int r2 = r14.A01     // Catch:{ IOException -> 0x0165 }
            double[] r3 = new double[r2]     // Catch:{ IOException -> 0x0165 }
        L_0x0053:
            if (r7 >= r2) goto L_0x006e
            double r0 = r6.readDouble()     // Catch:{ IOException -> 0x0165 }
            r3[r7] = r0     // Catch:{ IOException -> 0x0165 }
            int r7 = r7 + 1
            goto L_0x0053
        L_0x005e:
            int r2 = r14.A01     // Catch:{ IOException -> 0x0165 }
            double[] r3 = new double[r2]     // Catch:{ IOException -> 0x0165 }
        L_0x0062:
            if (r7 >= r2) goto L_0x006e
            float r0 = r6.readFloat()     // Catch:{ IOException -> 0x0165 }
            double r0 = (double) r0     // Catch:{ IOException -> 0x0165 }
            r3[r7] = r0     // Catch:{ IOException -> 0x0165 }
            int r7 = r7 + 1
            goto L_0x0062
        L_0x006e:
            r6.close()     // Catch:{ IOException -> 0x0072 }
            goto L_0x0077
        L_0x0072:
            r0 = move-exception
            android.util.Log.e(r4, r5, r0)
            return r3
        L_0x0077:
            return r3
        L_0x0078:
            int r10 = r14.A01     // Catch:{ IOException -> 0x0165 }
            X.0NB[] r9 = new X.AnonymousClass0NB[r10]     // Catch:{ IOException -> 0x0165 }
        L_0x007c:
            if (r7 >= r10) goto L_0x00e5
            int r0 = r6.readInt()     // Catch:{ IOException -> 0x0165 }
            long r2 = (long) r0     // Catch:{ IOException -> 0x0165 }
            int r0 = r6.readInt()     // Catch:{ IOException -> 0x0165 }
            long r0 = (long) r0     // Catch:{ IOException -> 0x0165 }
            X.0NB r8 = new X.0NB     // Catch:{ IOException -> 0x0165 }
            r8.<init>(r2, r0)     // Catch:{ IOException -> 0x0165 }
            r9[r7] = r8     // Catch:{ IOException -> 0x0165 }
            int r7 = r7 + 1
            goto L_0x007c
        L_0x0092:
            int r2 = r14.A01     // Catch:{ IOException -> 0x0165 }
            int[] r1 = new int[r2]     // Catch:{ IOException -> 0x0165 }
        L_0x0096:
            if (r7 >= r2) goto L_0x00a1
            int r0 = r6.readInt()     // Catch:{ IOException -> 0x0165 }
            r1[r7] = r0     // Catch:{ IOException -> 0x0165 }
            int r7 = r7 + 1
            goto L_0x0096
        L_0x00a1:
            r6.close()     // Catch:{ IOException -> 0x00a5 }
            goto L_0x00aa
        L_0x00a5:
            r0 = move-exception
            android.util.Log.e(r4, r5, r0)
            return r1
        L_0x00aa:
            return r1
        L_0x00ab:
            int r2 = r14.A01     // Catch:{ IOException -> 0x0165 }
            int[] r1 = new int[r2]     // Catch:{ IOException -> 0x0165 }
        L_0x00af:
            if (r7 >= r2) goto L_0x00ba
            short r0 = r6.readShort()     // Catch:{ IOException -> 0x0165 }
            r1[r7] = r0     // Catch:{ IOException -> 0x0165 }
            int r7 = r7 + 1
            goto L_0x00af
        L_0x00ba:
            r6.close()     // Catch:{ IOException -> 0x00be }
            goto L_0x00c3
        L_0x00be:
            r0 = move-exception
            android.util.Log.e(r4, r5, r0)
            return r1
        L_0x00c3:
            return r1
        L_0x00c4:
            int r12 = r14.A01     // Catch:{ IOException -> 0x0165 }
            X.0NB[] r9 = new X.AnonymousClass0NB[r12]     // Catch:{ IOException -> 0x0165 }
        L_0x00c8:
            if (r7 >= r12) goto L_0x00e5
            int r0 = r6.readInt()     // Catch:{ IOException -> 0x0165 }
            long r2 = (long) r0     // Catch:{ IOException -> 0x0165 }
            r10 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r2 = r2 & r10
            int r0 = r6.readInt()     // Catch:{ IOException -> 0x0165 }
            long r0 = (long) r0     // Catch:{ IOException -> 0x0165 }
            long r0 = r0 & r10
            X.0NB r8 = new X.0NB     // Catch:{ IOException -> 0x0165 }
            r8.<init>(r2, r0)     // Catch:{ IOException -> 0x0165 }
            r9[r7] = r8     // Catch:{ IOException -> 0x0165 }
            int r7 = r7 + 1
            goto L_0x00c8
        L_0x00e5:
            r6.close()     // Catch:{ IOException -> 0x00e9 }
            goto L_0x00ee
        L_0x00e9:
            r0 = move-exception
            android.util.Log.e(r4, r5, r0)
            return r9
        L_0x00ee:
            return r9
        L_0x00ef:
            int r9 = r14.A01     // Catch:{ IOException -> 0x0165 }
            long[] r8 = new long[r9]     // Catch:{ IOException -> 0x0165 }
        L_0x00f3:
            if (r7 >= r9) goto L_0x0105
            int r0 = r6.readInt()     // Catch:{ IOException -> 0x0165 }
            long r0 = (long) r0     // Catch:{ IOException -> 0x0165 }
            r2 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r0 = r0 & r2
            r8[r7] = r0     // Catch:{ IOException -> 0x0165 }
            int r7 = r7 + 1
            goto L_0x00f3
        L_0x0105:
            r6.close()     // Catch:{ IOException -> 0x0109 }
            goto L_0x010e
        L_0x0109:
            r0 = move-exception
            android.util.Log.e(r4, r5, r0)
            return r8
        L_0x010e:
            return r8
        L_0x010f:
            int r2 = r14.A01     // Catch:{ IOException -> 0x0165 }
            int[] r1 = new int[r2]     // Catch:{ IOException -> 0x0165 }
        L_0x0113:
            if (r7 >= r2) goto L_0x011e
            int r0 = r6.readUnsignedShort()     // Catch:{ IOException -> 0x0165 }
            r1[r7] = r0     // Catch:{ IOException -> 0x0165 }
            int r7 = r7 + 1
            goto L_0x0113
        L_0x011e:
            r6.close()     // Catch:{ IOException -> 0x0122 }
            goto L_0x0127
        L_0x0122:
            r0 = move-exception
            android.util.Log.e(r4, r5, r0)
            return r1
        L_0x0127:
            return r1
        L_0x0128:
            int r10 = r14.A01     // Catch:{ IOException -> 0x0165 }
            byte[] r9 = X.AnonymousClass0YU.A0V     // Catch:{ IOException -> 0x0165 }
            int r3 = r9.length     // Catch:{ IOException -> 0x0165 }
            if (r10 < r3) goto L_0x0140
            r2 = 0
        L_0x0130:
            if (r2 >= r3) goto L_0x013d
            byte r1 = r8[r2]     // Catch:{ IOException -> 0x0165 }
            byte r0 = r9[r2]     // Catch:{ IOException -> 0x0165 }
            if (r1 == r0) goto L_0x0139
            goto L_0x013c
        L_0x0139:
            int r2 = r2 + 1
            goto L_0x0130
        L_0x013c:
            r11 = 0
        L_0x013d:
            if (r11 == 0) goto L_0x0140
            r7 = r3
        L_0x0140:
            java.lang.StringBuilder r3 = X.AnonymousClass001.A0o()     // Catch:{ IOException -> 0x0165 }
        L_0x0144:
            if (r7 >= r10) goto L_0x0157
            byte r2 = r8[r7]     // Catch:{ IOException -> 0x0165 }
            if (r2 == 0) goto L_0x0157
            r1 = 32
            r0 = 63
            if (r2 < r1) goto L_0x0151
            char r0 = (char) r2     // Catch:{ IOException -> 0x0165 }
        L_0x0151:
            r3.append(r0)     // Catch:{ IOException -> 0x0165 }
            int r7 = r7 + 1
            goto L_0x0144
        L_0x0157:
            java.lang.String r1 = r3.toString()     // Catch:{ IOException -> 0x0165 }
            r6.close()     // Catch:{ IOException -> 0x015f }
            goto L_0x0164
        L_0x015f:
            r0 = move-exception
            android.util.Log.e(r4, r5, r0)
            return r1
        L_0x0164:
            return r1
        L_0x0165:
            r1 = move-exception
            goto L_0x016b
        L_0x0167:
            r1 = move-exception
            goto L_0x017d
        L_0x0169:
            r1 = move-exception
            r6 = r13
        L_0x016b:
            java.lang.String r0 = "IOException occurred during reading a value"
            android.util.Log.w(r4, r0, r1)     // Catch:{ all -> 0x017b }
            if (r6 == 0) goto L_0x017a
            r6.close()     // Catch:{ IOException -> 0x0176 }
            return r13
        L_0x0176:
            r0 = move-exception
            android.util.Log.e(r4, r5, r0)
        L_0x017a:
            return r13
        L_0x017b:
            r1 = move-exception
            r13 = r6
        L_0x017d:
            if (r13 == 0) goto L_0x0187
            r13.close()     // Catch:{ IOException -> 0x0183 }
            throw r1
        L_0x0183:
            r0 = move-exception
            android.util.Log.e(r4, r5, r0)
        L_0x0187:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0XT.A05(java.nio.ByteOrder):java.lang.Object");
    }

    public AnonymousClass0XT(long j, byte[] bArr, int i, int i2) {
        this.A00 = i;
        this.A01 = i2;
        this.A02 = j;
        this.A03 = bArr;
    }

    public static AnonymousClass0XT A00(String str) {
        byte[] bytes = AnonymousClass001.A0j(AnonymousClass000.A0l(str), 0).getBytes(AnonymousClass0YU.A0L);
        return new AnonymousClass0XT(-1, bytes, 2, bytes.length);
    }

    public static AnonymousClass0XT A01(ByteBuffer byteBuffer, int i, int i2) {
        return new AnonymousClass0XT(-1, byteBuffer.array(), i, i2);
    }

    public String A06(ByteOrder byteOrder) {
        Object A05 = A05(byteOrder);
        if (A05 != null) {
            if (A05 instanceof String) {
                return (String) A05;
            }
            StringBuilder A0o = AnonymousClass001.A0o();
            int i = 0;
            if (!(A05 instanceof long[])) {
                if (!(A05 instanceof int[])) {
                    if (!(A05 instanceof double[])) {
                        if (A05 instanceof AnonymousClass0NB[]) {
                            AnonymousClass0NB[] r7 = (AnonymousClass0NB[]) A05;
                            while (true) {
                                int length = r7.length;
                                if (i >= length) {
                                    break;
                                }
                                AnonymousClass0NB r2 = r7[i];
                                A0o.append(r2.A01);
                                A0o.append('/');
                                A0o.append(r2.A00);
                                i++;
                                if (i != length) {
                                    A0o.append(",");
                                }
                            }
                        }
                    } else {
                        double[] dArr = (double[]) A05;
                        while (true) {
                            int length2 = dArr.length;
                            if (i >= length2) {
                                break;
                            }
                            A0o.append(dArr[i]);
                            i++;
                            if (i != length2) {
                                A0o.append(",");
                            }
                        }
                    }
                } else {
                    int[] iArr = (int[]) A05;
                    while (true) {
                        int length3 = iArr.length;
                        if (i >= length3) {
                            break;
                        }
                        A0o.append(iArr[i]);
                        i++;
                        if (i != length3) {
                            A0o.append(",");
                        }
                    }
                }
            } else {
                long[] jArr = (long[]) A05;
                while (true) {
                    int length4 = jArr.length;
                    if (i >= length4) {
                        break;
                    }
                    A0o.append(jArr[i]);
                    i++;
                    if (i != length4) {
                        A0o.append(",");
                    }
                }
            }
            return A0o.toString();
        }
        return null;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("(");
        A0o.append(AnonymousClass0YU.A14[this.A00]);
        A0o.append(", data length:");
        A0o.append(this.A03.length);
        return AnonymousClass000.A0e(A0o);
    }
}
