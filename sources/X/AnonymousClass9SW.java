package X;

import android.util.Log;

/* renamed from: X.9SW  reason: invalid class name */
public class AnonymousClass9SW {
    public final int A00;
    public final int A01;
    public final byte[] A02;

    public static void A00(Throwable th) {
        Log.e("ExifReader", "IOException occurred while closing InputStream", th);
    }

    /* JADX WARNING: Removed duplicated region for block: B:157:0x0235 A[SYNTHETIC, Splitter:B:157:0x0235] */
    /* JADX WARNING: Removed duplicated region for block: B:166:0x0243 A[SYNTHETIC, Splitter:B:166:0x0243] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A01(java.nio.ByteOrder r24) {
        /*
            r23 = this;
            java.lang.String r14 = "IOException occurred while closing InputStream"
            r21 = 0
            r1 = r23
            byte[] r6 = r1.A02     // Catch:{ IOException -> 0x0229, all -> 0x0227 }
            java.io.ByteArrayInputStream r0 = new java.io.ByteArrayInputStream     // Catch:{ IOException -> 0x0229, all -> 0x0227 }
            r0.<init>(r6)     // Catch:{ IOException -> 0x0229, all -> 0x0227 }
            X.9eS r5 = new X.9eS     // Catch:{ IOException -> 0x0229, all -> 0x0227 }
            r5.<init>(r0)     // Catch:{ IOException -> 0x0229, all -> 0x0227 }
            r0 = r24
            r5.A02 = r0     // Catch:{ IOException -> 0x0225 }
            int r0 = r1.A00     // Catch:{ IOException -> 0x0225 }
            r4 = 0
            r9 = 1
            switch(r0) {
                case 1: goto L_0x0027;
                case 2: goto L_0x01e6;
                case 3: goto L_0x01cd;
                case 4: goto L_0x01ad;
                case 5: goto L_0x0182;
                case 6: goto L_0x0027;
                case 7: goto L_0x01e6;
                case 8: goto L_0x0169;
                case 9: goto L_0x0150;
                case 10: goto L_0x0136;
                case 11: goto L_0x0118;
                case 12: goto L_0x0059;
                default: goto L_0x001d;
            }     // Catch:{ IOException -> 0x0225 }
        L_0x001d:
            r5.close()     // Catch:{ IOException -> 0x0021 }
            goto L_0x0026
        L_0x0021:
            r0 = move-exception
            A00(r0)
            return r21
        L_0x0026:
            return r21
        L_0x0027:
            int r0 = r6.length     // Catch:{ IOException -> 0x0225 }
            if (r0 != r9) goto L_0x0046
            byte r0 = r6[r4]     // Catch:{ IOException -> 0x0225 }
            if (r0 < 0) goto L_0x0046
            if (r0 > r9) goto L_0x0046
            char[] r2 = new char[r9]     // Catch:{ IOException -> 0x0225 }
            int r0 = r0 + 48
            char r0 = (char) r0     // Catch:{ IOException -> 0x0225 }
            r2[r4] = r0     // Catch:{ IOException -> 0x0225 }
            java.lang.String r1 = new java.lang.String     // Catch:{ IOException -> 0x0225 }
            r1.<init>(r2)     // Catch:{ IOException -> 0x0225 }
            r5.close()     // Catch:{ IOException -> 0x0040 }
            goto L_0x0045
        L_0x0040:
            r0 = move-exception
            A00(r0)
            return r1
        L_0x0045:
            return r1
        L_0x0046:
            java.nio.charset.Charset r0 = X.AnonymousClass9VQ.A04     // Catch:{ IOException -> 0x0225 }
            java.lang.String r2 = new java.lang.String     // Catch:{ IOException -> 0x0225 }
            r2.<init>(r6, r0)     // Catch:{ IOException -> 0x0225 }
            r5.close()     // Catch:{ IOException -> 0x0051 }
            goto L_0x0058
        L_0x0051:
            r1 = move-exception
            java.lang.String r0 = "ExifReader"
            android.util.Log.e(r0, r14, r1)
            return r2
        L_0x0058:
            return r2
        L_0x0059:
            int r0 = r1.A01     // Catch:{ IOException -> 0x0225 }
            r22 = r0
            double[] r15 = new double[r0]     // Catch:{ IOException -> 0x0225 }
        L_0x005f:
            r0 = r22
            if (r4 >= r0) goto L_0x010e
            int r0 = r5.A00     // Catch:{ IOException -> 0x0225 }
            int r1 = r0 + 8
            r5.A00 = r1     // Catch:{ IOException -> 0x0225 }
            int r0 = r5.A03     // Catch:{ IOException -> 0x0225 }
            if (r1 > r0) goto L_0x0102
            java.io.DataInputStream r0 = r5.A01     // Catch:{ IOException -> 0x0225 }
            int r11 = r0.read()     // Catch:{ IOException -> 0x0225 }
            int r10 = r0.read()     // Catch:{ IOException -> 0x0225 }
            int r13 = r0.read()     // Catch:{ IOException -> 0x0225 }
            int r12 = r0.read()     // Catch:{ IOException -> 0x0225 }
            int r7 = r0.read()     // Catch:{ IOException -> 0x0225 }
            int r6 = r0.read()     // Catch:{ IOException -> 0x0225 }
            int r9 = r0.read()     // Catch:{ IOException -> 0x0225 }
            int r8 = r0.read()     // Catch:{ IOException -> 0x0225 }
            r0 = r11 | r10
            r0 = r0 | r13
            r0 = r0 | r12
            r0 = r0 | r7
            r0 = r0 | r6
            r0 = r0 | r9
            r0 = r0 | r8
            if (r0 < 0) goto L_0x0108
            java.nio.ByteOrder r2 = r5.A02     // Catch:{ IOException -> 0x0225 }
            java.nio.ByteOrder r0 = X.C198149eS.A05     // Catch:{ IOException -> 0x0225 }
            r20 = 16
            r19 = 24
            r18 = 32
            r17 = 40
            r16 = 48
            r1 = 56
            if (r2 != r0) goto L_0x00c8
            long r2 = (long) r8     // Catch:{ IOException -> 0x0225 }
            long r2 = r2 << r1
            long r0 = (long) r9     // Catch:{ IOException -> 0x0225 }
            long r0 = r0 << r16
            long r2 = r2 + r0
            long r0 = (long) r6     // Catch:{ IOException -> 0x0225 }
            long r0 = r0 << r17
            long r2 = r2 + r0
            long r0 = (long) r7     // Catch:{ IOException -> 0x0225 }
            long r0 = r0 << r18
            long r2 = r2 + r0
            long r0 = (long) r12     // Catch:{ IOException -> 0x0225 }
            long r0 = r0 << r19
            long r2 = r2 + r0
            long r0 = (long) r13     // Catch:{ IOException -> 0x0225 }
            long r0 = r0 << r20
            long r2 = r2 + r0
            long r0 = (long) r10     // Catch:{ IOException -> 0x0225 }
            r6 = 8
            long r0 = r0 << r6
            long r2 = r2 + r0
            long r0 = (long) r11     // Catch:{ IOException -> 0x0225 }
            goto L_0x00e8
        L_0x00c8:
            java.nio.ByteOrder r0 = X.C198149eS.A04     // Catch:{ IOException -> 0x0225 }
            if (r2 != r0) goto L_0x00f3
            long r2 = (long) r11     // Catch:{ IOException -> 0x0225 }
            long r2 = r2 << r1
            long r0 = (long) r10     // Catch:{ IOException -> 0x0225 }
            long r0 = r0 << r16
            long r2 = r2 + r0
            long r0 = (long) r13     // Catch:{ IOException -> 0x0225 }
            long r0 = r0 << r17
            long r2 = r2 + r0
            long r0 = (long) r12     // Catch:{ IOException -> 0x0225 }
            long r0 = r0 << r18
            long r2 = r2 + r0
            long r0 = (long) r7     // Catch:{ IOException -> 0x0225 }
            long r0 = r0 << r19
            long r2 = r2 + r0
            long r0 = (long) r6     // Catch:{ IOException -> 0x0225 }
            long r0 = r0 << r20
            long r2 = r2 + r0
            long r0 = (long) r9     // Catch:{ IOException -> 0x0225 }
            r6 = 8
            long r0 = r0 << r6
            long r2 = r2 + r0
            long r0 = (long) r8     // Catch:{ IOException -> 0x0225 }
        L_0x00e8:
            long r2 = r2 + r0
            double r0 = java.lang.Double.longBitsToDouble(r2)     // Catch:{ IOException -> 0x0225 }
            r15[r4] = r0     // Catch:{ IOException -> 0x0225 }
            int r4 = r4 + 1
            goto L_0x005f
        L_0x00f3:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ IOException -> 0x0225 }
            java.lang.String r0 = "Invalid byte order: "
            java.lang.String r0 = X.AnonymousClass000.A0P(r2, r0, r1)     // Catch:{ IOException -> 0x0225 }
            java.io.IOException r0 = X.AnonymousClass002.A0C(r0)     // Catch:{ IOException -> 0x0225 }
            goto L_0x010d
        L_0x0102:
            java.io.EOFException r0 = new java.io.EOFException     // Catch:{ IOException -> 0x0225 }
            r0.<init>()     // Catch:{ IOException -> 0x0225 }
            goto L_0x010d
        L_0x0108:
            java.io.EOFException r0 = new java.io.EOFException     // Catch:{ IOException -> 0x0225 }
            r0.<init>()     // Catch:{ IOException -> 0x0225 }
        L_0x010d:
            throw r0     // Catch:{ IOException -> 0x0225 }
        L_0x010e:
            r5.close()     // Catch:{ IOException -> 0x0112 }
            goto L_0x0117
        L_0x0112:
            r0 = move-exception
            A00(r0)
            return r15
        L_0x0117:
            return r15
        L_0x0118:
            int r3 = r1.A01     // Catch:{ IOException -> 0x0225 }
            double[] r2 = new double[r3]     // Catch:{ IOException -> 0x0225 }
        L_0x011c:
            if (r4 >= r3) goto L_0x012c
            int r0 = r5.A01()     // Catch:{ IOException -> 0x0225 }
            float r0 = java.lang.Float.intBitsToFloat(r0)     // Catch:{ IOException -> 0x0225 }
            double r0 = (double) r0     // Catch:{ IOException -> 0x0225 }
            r2[r4] = r0     // Catch:{ IOException -> 0x0225 }
            int r4 = r4 + 1
            goto L_0x011c
        L_0x012c:
            r5.close()     // Catch:{ IOException -> 0x0130 }
            goto L_0x0135
        L_0x0130:
            r0 = move-exception
            A00(r0)
            return r2
        L_0x0135:
            return r2
        L_0x0136:
            int r8 = r1.A01     // Catch:{ IOException -> 0x0225 }
            X.9Qv[] r7 = new X.C193939Qv[r8]     // Catch:{ IOException -> 0x0225 }
        L_0x013a:
            if (r4 >= r8) goto L_0x01a3
            int r0 = r5.A01()     // Catch:{ IOException -> 0x0225 }
            long r2 = (long) r0     // Catch:{ IOException -> 0x0225 }
            int r0 = r5.A01()     // Catch:{ IOException -> 0x0225 }
            long r0 = (long) r0     // Catch:{ IOException -> 0x0225 }
            X.9Qv r6 = new X.9Qv     // Catch:{ IOException -> 0x0225 }
            r6.<init>(r2, r0)     // Catch:{ IOException -> 0x0225 }
            r7[r4] = r6     // Catch:{ IOException -> 0x0225 }
            int r4 = r4 + 1
            goto L_0x013a
        L_0x0150:
            int r2 = r1.A01     // Catch:{ IOException -> 0x0225 }
            int[] r1 = new int[r2]     // Catch:{ IOException -> 0x0225 }
        L_0x0154:
            if (r4 >= r2) goto L_0x015f
            int r0 = r5.A01()     // Catch:{ IOException -> 0x0225 }
            r1[r4] = r0     // Catch:{ IOException -> 0x0225 }
            int r4 = r4 + 1
            goto L_0x0154
        L_0x015f:
            r5.close()     // Catch:{ IOException -> 0x0163 }
            goto L_0x0168
        L_0x0163:
            r0 = move-exception
            A00(r0)
            return r1
        L_0x0168:
            return r1
        L_0x0169:
            int r2 = r1.A01     // Catch:{ IOException -> 0x0225 }
            int[] r1 = new int[r2]     // Catch:{ IOException -> 0x0225 }
        L_0x016d:
            if (r4 >= r2) goto L_0x0178
            short r0 = r5.A04()     // Catch:{ IOException -> 0x0225 }
            r1[r4] = r0     // Catch:{ IOException -> 0x0225 }
            int r4 = r4 + 1
            goto L_0x016d
        L_0x0178:
            r5.close()     // Catch:{ IOException -> 0x017c }
            goto L_0x0181
        L_0x017c:
            r0 = move-exception
            A00(r0)
            return r1
        L_0x0181:
            return r1
        L_0x0182:
            int r10 = r1.A01     // Catch:{ IOException -> 0x0225 }
            X.9Qv[] r7 = new X.C193939Qv[r10]     // Catch:{ IOException -> 0x0225 }
        L_0x0186:
            if (r4 >= r10) goto L_0x01a3
            int r0 = r5.A01()     // Catch:{ IOException -> 0x0225 }
            long r2 = (long) r0     // Catch:{ IOException -> 0x0225 }
            r8 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r2 = r2 & r8
            int r0 = r5.A01()     // Catch:{ IOException -> 0x0225 }
            long r0 = (long) r0     // Catch:{ IOException -> 0x0225 }
            long r0 = r0 & r8
            X.9Qv r6 = new X.9Qv     // Catch:{ IOException -> 0x0225 }
            r6.<init>(r2, r0)     // Catch:{ IOException -> 0x0225 }
            r7[r4] = r6     // Catch:{ IOException -> 0x0225 }
            int r4 = r4 + 1
            goto L_0x0186
        L_0x01a3:
            r5.close()     // Catch:{ IOException -> 0x01a7 }
            goto L_0x01ac
        L_0x01a7:
            r0 = move-exception
            A00(r0)
            return r7
        L_0x01ac:
            return r7
        L_0x01ad:
            int r7 = r1.A01     // Catch:{ IOException -> 0x0225 }
            long[] r6 = new long[r7]     // Catch:{ IOException -> 0x0225 }
        L_0x01b1:
            if (r4 >= r7) goto L_0x01c3
            int r0 = r5.A01()     // Catch:{ IOException -> 0x0225 }
            long r2 = (long) r0     // Catch:{ IOException -> 0x0225 }
            r0 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r2 = r2 & r0
            r6[r4] = r2     // Catch:{ IOException -> 0x0225 }
            int r4 = r4 + 1
            goto L_0x01b1
        L_0x01c3:
            r5.close()     // Catch:{ IOException -> 0x01c7 }
            goto L_0x01cc
        L_0x01c7:
            r0 = move-exception
            A00(r0)
            return r6
        L_0x01cc:
            return r6
        L_0x01cd:
            int r2 = r1.A01     // Catch:{ IOException -> 0x0225 }
            int[] r1 = new int[r2]     // Catch:{ IOException -> 0x0225 }
        L_0x01d1:
            if (r4 >= r2) goto L_0x01dc
            int r0 = r5.A02()     // Catch:{ IOException -> 0x0225 }
            r1[r4] = r0     // Catch:{ IOException -> 0x0225 }
            int r4 = r4 + 1
            goto L_0x01d1
        L_0x01dc:
            r5.close()     // Catch:{ IOException -> 0x01e0 }
            goto L_0x01e5
        L_0x01e0:
            r0 = move-exception
            A00(r0)
            return r1
        L_0x01e5:
            return r1
        L_0x01e6:
            int r8 = r1.A01     // Catch:{ IOException -> 0x0225 }
            byte[] r7 = X.AnonymousClass9VQ.A07     // Catch:{ IOException -> 0x0225 }
            int r3 = r7.length     // Catch:{ IOException -> 0x0225 }
            if (r8 < r3) goto L_0x01fe
            r2 = 0
        L_0x01ee:
            if (r2 >= r3) goto L_0x01fb
            byte r1 = r6[r2]     // Catch:{ IOException -> 0x0225 }
            byte r0 = r7[r2]     // Catch:{ IOException -> 0x0225 }
            if (r1 == r0) goto L_0x01f7
            goto L_0x01fa
        L_0x01f7:
            int r2 = r2 + 1
            goto L_0x01ee
        L_0x01fa:
            r9 = 0
        L_0x01fb:
            if (r9 == 0) goto L_0x01fe
            r4 = r3
        L_0x01fe:
            java.lang.StringBuilder r3 = X.AnonymousClass001.A0o()     // Catch:{ IOException -> 0x0225 }
        L_0x0202:
            if (r4 >= r8) goto L_0x0215
            byte r2 = r6[r4]     // Catch:{ IOException -> 0x0225 }
            if (r2 == 0) goto L_0x0215
            r1 = 32
            r0 = 63
            if (r2 < r1) goto L_0x020f
            char r0 = (char) r2     // Catch:{ IOException -> 0x0225 }
        L_0x020f:
            r3.append(r0)     // Catch:{ IOException -> 0x0225 }
            int r4 = r4 + 1
            goto L_0x0202
        L_0x0215:
            java.lang.String r2 = r3.toString()     // Catch:{ IOException -> 0x0225 }
            r5.close()     // Catch:{ IOException -> 0x021d }
            goto L_0x0224
        L_0x021d:
            r1 = move-exception
            java.lang.String r0 = "ExifReader"
            android.util.Log.e(r0, r14, r1)
            return r2
        L_0x0224:
            return r2
        L_0x0225:
            r2 = move-exception
            goto L_0x022c
        L_0x0227:
            r1 = move-exception
            goto L_0x0241
        L_0x0229:
            r2 = move-exception
            r5 = r21
        L_0x022c:
            java.lang.String r1 = "ExifReader"
            java.lang.String r0 = "IOException occurred during reading a value"
            android.util.Log.w(r1, r0, r2)     // Catch:{ all -> 0x023e }
            if (r5 == 0) goto L_0x023d
            r5.close()     // Catch:{ IOException -> 0x0239 }
            return r21
        L_0x0239:
            r0 = move-exception
            android.util.Log.e(r1, r14, r0)
        L_0x023d:
            return r21
        L_0x023e:
            r1 = move-exception
            r21 = r5
        L_0x0241:
            if (r21 == 0) goto L_0x024b
            r21.close()     // Catch:{ IOException -> 0x0247 }
            throw r1
        L_0x0247:
            r0 = move-exception
            A00(r0)
        L_0x024b:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass9SW.A01(java.nio.ByteOrder):java.lang.Object");
    }

    public AnonymousClass9SW(byte[] bArr, int i, int i2) {
        this.A00 = i;
        this.A01 = i2;
        this.A02 = bArr;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("(");
        A0o.append(AnonymousClass9VQ.A0E[this.A00]);
        A0o.append(", data length:");
        A0o.append(this.A02.length);
        return AnonymousClass000.A0X(")", A0o);
    }
}
