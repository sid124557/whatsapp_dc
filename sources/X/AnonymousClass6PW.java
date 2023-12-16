package X;

import java.util.zip.Inflater;

/* renamed from: X.6PW  reason: invalid class name */
public final class AnonymousClass6PW extends C126516Og {
    public Inflater A00;
    public final C150107Pe A01 = new C150107Pe();
    public final C161467pi A02 = new C161467pi();
    public final C161467pi A03 = new C161467pi();

    public AnonymousClass6PW() {
        super("PgsDecoder");
    }

    /* JADX WARNING: CFG modification limit reached, blocks count: 206 */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C185358tW A04(byte[] r24, int r25, boolean r26) {
        /*
            r23 = this;
            r4 = r23
            X.7pi r13 = r4.A02
            r1 = r24
            r0 = r25
            r13.A0U(r1, r0)
            int r0 = r13.A00
            int r1 = r13.A01
            int r0 = r0 - r1
            if (r0 <= 0) goto L_0x0086
            byte[] r0 = r13.A02
            byte r0 = r0[r1]
            r1 = r0 & 255(0xff, float:3.57E-43)
            r0 = 120(0x78, float:1.68E-43)
            if (r1 != r0) goto L_0x0086
            java.util.zip.Inflater r5 = r4.A00
            if (r5 != 0) goto L_0x0027
            java.util.zip.Inflater r5 = new java.util.zip.Inflater
            r5.<init>()
            r4.A00 = r5
        L_0x0027:
            X.7pi r3 = r4.A03
            int r1 = X.C161467pi.A00(r13)
            if (r1 <= 0) goto L_0x0086
            byte[] r0 = r3.A02
            int r0 = r0.length
            if (r0 >= r1) goto L_0x0039
            int r0 = r1 * 2
            r3.A0P(r0)
        L_0x0039:
            byte[] r2 = r13.A02
            int r1 = r13.A01
            int r0 = r13.A00
            int r0 = r0 - r1
            r5.setInput(r2, r1, r0)
            r2 = 0
            goto L_0x004a
        L_0x0045:
            int r0 = r0 * 2
            r3.A0P(r0)     // Catch:{ DataFormatException -> 0x0078, all -> 0x0073 }
        L_0x004a:
            byte[] r1 = r3.A02     // Catch:{ DataFormatException -> 0x0078, all -> 0x0073 }
            int r0 = r1.length     // Catch:{ DataFormatException -> 0x0078, all -> 0x0073 }
            int r0 = r0 - r2
            int r0 = r5.inflate(r1, r2, r0)     // Catch:{ DataFormatException -> 0x0078, all -> 0x0073 }
            int r2 = r2 + r0
            boolean r0 = r5.finished()     // Catch:{ DataFormatException -> 0x0078, all -> 0x0073 }
            if (r0 == 0) goto L_0x005d
            r3.A0R(r2)     // Catch:{ DataFormatException -> 0x0078, all -> 0x0073 }
            goto L_0x007c
        L_0x005d:
            boolean r0 = r5.needsDictionary()     // Catch:{ DataFormatException -> 0x0078, all -> 0x0073 }
            if (r0 != 0) goto L_0x006f
            boolean r0 = r5.needsInput()     // Catch:{ DataFormatException -> 0x0078, all -> 0x0073 }
            if (r0 != 0) goto L_0x006f
            byte[] r0 = r3.A02     // Catch:{ DataFormatException -> 0x0078, all -> 0x0073 }
            int r0 = r0.length     // Catch:{ DataFormatException -> 0x0078, all -> 0x0073 }
            if (r2 != r0) goto L_0x004a
            goto L_0x0045
        L_0x006f:
            r5.reset()
            goto L_0x0086
        L_0x0073:
            r0 = move-exception
            r5.reset()
            throw r0
        L_0x0078:
            r5.reset()
            goto L_0x0086
        L_0x007c:
            r5.reset()
            byte[] r1 = r3.A02
            int r0 = r3.A00
            r13.A0U(r1, r0)
        L_0x0086:
            X.7Pe r12 = r4.A01
            r0 = 0
            r12.A05 = r0
            r12.A04 = r0
            r12.A02 = r0
            r12.A03 = r0
            r12.A01 = r0
            r12.A00 = r0
            X.7pi r11 = r12.A07
            r11.A0Q(r0)
            r12.A06 = r0
            java.util.ArrayList r20 = X.AnonymousClass001.A0s()
        L_0x00a0:
            int r2 = r13.A00
            int r0 = r13.A01
            int r0 = r2 - r0
            r4 = 3
            if (r0 < r4) goto L_0x0256
            int r1 = r13.A0C()
            int r3 = r13.A0F()
            int r10 = r13.A01
            int r10 = r10 + r3
            r14 = 0
            if (r10 <= r2) goto L_0x00bb
            r13.A0S(r2)
            goto L_0x00a0
        L_0x00bb:
            r0 = 128(0x80, float:1.794E-43)
            if (r1 == r0) goto L_0x01a7
            switch(r1) {
                case 20: goto L_0x00cd;
                case 21: goto L_0x0141;
                case 22: goto L_0x0184;
                default: goto L_0x00c2;
            }
        L_0x00c2:
            r13.A0S(r10)
            if (r14 == 0) goto L_0x00a0
            r0 = r20
            r0.add(r14)
            goto L_0x00a0
        L_0x00cd:
            int r1 = r3 % 5
            r0 = 2
            if (r1 != r0) goto L_0x00c2
            r13.A0T(r0)
            int[] r15 = r12.A08
            r9 = 0
            java.util.Arrays.fill(r15, r9)
            int r0 = r3 / 5
            r22 = r0
            r8 = 0
        L_0x00e0:
            r0 = r22
            if (r8 >= r0) goto L_0x0251
            int r19 = r13.A0C()
            int r1 = r13.A0C()
            int r0 = r13.A0C()
            int r3 = r13.A0C()
            int r18 = r13.A0C()
            double r6 = (double) r1
            int r0 = r0 + -128
            double r4 = (double) r0
            r0 = 4608992865850220347(0x3ff66e978d4fdf3b, double:1.402)
            double r0 = r0 * r4
            double r0 = r0 + r6
            int r2 = (int) r0
            r21 = r2
            int r0 = r3 + -128
            double r2 = (double) r0
            r16 = 4599871095020959050(0x3fd60663c74fb54a, double:0.34414)
            double r16 = r16 * r2
            double r0 = r6 - r16
            r16 = 4604607620821057148(0x3fe6da3c21187e7c, double:0.71414)
            double r4 = r4 * r16
            double r0 = r0 - r4
            int r4 = (int) r0
            r0 = 4610659197712347431(0x3ffc5a1cac083127, double:1.772)
            double r2 = r2 * r0
            double r6 = r6 + r2
            int r2 = (int) r6
            int r5 = r18 << 24
            r3 = 255(0xff, float:3.57E-43)
            r0 = r21
            int r0 = X.AnonymousClass001.A0D(r0, r3, r9)
            int r0 = r0 << 16
            r5 = r5 | r0
            int r0 = X.AnonymousClass001.A0D(r4, r3, r9)
            int r1 = r0 << 8
            r1 = r1 | r5
            int r0 = X.AnonymousClass001.A0D(r2, r3, r9)
            r1 = r1 | r0
            r15[r19] = r1
            int r8 = r8 + 1
            goto L_0x00e0
        L_0x0141:
            r2 = 4
            if (r3 < r2) goto L_0x00c2
            int r0 = X.C161467pi.A02(r13, r4)
            r0 = r0 & 128(0x80, float:1.794E-43)
            boolean r0 = X.AnonymousClass000.A1S(r0)
            int r3 = r3 + -4
            if (r0 == 0) goto L_0x016d
            r0 = 7
            if (r3 < r0) goto L_0x00c2
            int r1 = r13.A0D()
            if (r1 < r2) goto L_0x00c2
            int r0 = r13.A0F()
            r12.A01 = r0
            int r0 = r13.A0F()
            r12.A00 = r0
            int r1 = r1 - r2
            r11.A0Q(r1)
            int r3 = r3 + -7
        L_0x016d:
            int r2 = r11.A01
            int r0 = r11.A00
            if (r2 >= r0) goto L_0x00c2
            if (r3 <= 0) goto L_0x00c2
            int r1 = X.AnonymousClass6C9.A0A(r0, r2, r3)
            byte[] r0 = r11.A02
            r13.A0V(r0, r2, r1)
            int r2 = r2 + r1
            r11.A0S(r2)
            goto L_0x00c2
        L_0x0184:
            r0 = 19
            if (r3 < r0) goto L_0x00c2
            int r0 = r13.A0F()
            r12.A05 = r0
            int r0 = r13.A0F()
            r12.A04 = r0
            r0 = 11
            r13.A0T(r0)
            int r0 = r13.A0F()
            r12.A02 = r0
            int r0 = r13.A0F()
            r12.A03 = r0
            goto L_0x00c2
        L_0x01a7:
            int r0 = r12.A05
            if (r0 == 0) goto L_0x0240
            int r0 = r12.A04
            if (r0 == 0) goto L_0x0240
            int r0 = r12.A01
            if (r0 == 0) goto L_0x0240
            int r0 = r12.A00
            if (r0 == 0) goto L_0x0240
            int r1 = r11.A00
            if (r1 == 0) goto L_0x0240
            int r0 = r11.A01
            if (r0 != r1) goto L_0x0240
            boolean r0 = r12.A06
            if (r0 == 0) goto L_0x0240
            r5 = 0
            r11.A0S(r5)
            int r6 = r12.A01
            int r0 = r12.A00
            int r6 = r6 * r0
            int[] r3 = new int[r6]
            r4 = 0
        L_0x01cf:
            if (r4 >= r6) goto L_0x0207
            int r1 = r11.A0C()
            if (r1 == 0) goto L_0x01e1
            int r2 = r4 + 1
            int[] r0 = r12.A08
            r0 = r0[r1]
            r3[r4] = r0
        L_0x01df:
            r4 = r2
            goto L_0x01cf
        L_0x01e1:
            int r1 = r11.A0C()
            if (r1 == 0) goto L_0x01cf
            r0 = r1 & 64
            r2 = r1 & 63
            if (r0 == 0) goto L_0x01f4
            int r2 = r2 << 8
            int r0 = r11.A0C()
            r2 = r2 | r0
        L_0x01f4:
            r0 = r1 & 128(0x80, float:1.794E-43)
            if (r0 != 0) goto L_0x01fe
            r0 = 0
        L_0x01f9:
            int r2 = r2 + r4
            java.util.Arrays.fill(r3, r4, r2, r0)
            goto L_0x01df
        L_0x01fe:
            int[] r1 = r12.A08
            int r0 = r11.A0C()
            r0 = r1[r0]
            goto L_0x01f9
        L_0x0207:
            int r2 = r12.A01
            int r1 = r12.A00
            android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.ARGB_8888
            android.graphics.Bitmap r0 = android.graphics.Bitmap.createBitmap(r3, r2, r1, r0)
            X.7ip r4 = new X.7ip
            r4.<init>()
            r4.A0C = r0
            int r0 = r12.A02
            float r1 = (float) r0
            int r0 = r12.A05
            float r3 = (float) r0
            float r1 = r1 / r3
            r4.A02 = r1
            r4.A08 = r5
            int r0 = r12.A03
            float r2 = (float) r0
            int r0 = r12.A04
            float r1 = (float) r0
            float r2 = r2 / r1
            r4.A01 = r2
            r4.A07 = r5
            r4.A06 = r5
            int r0 = r12.A01
            float r0 = (float) r0
            float r0 = r0 / r3
            r4.A04 = r0
            int r0 = r12.A00
            float r0 = (float) r0
            float r0 = r0 / r1
            r4.A00 = r0
            X.7hc r14 = r4.A00()
        L_0x0240:
            r0 = 0
            r12.A05 = r0
            r12.A04 = r0
            r12.A02 = r0
            r12.A03 = r0
            r12.A01 = r0
            r12.A00 = r0
            r11.A0Q(r0)
            goto L_0x0252
        L_0x0251:
            r0 = 1
        L_0x0252:
            r12.A06 = r0
            goto L_0x00c2
        L_0x0256:
            java.util.List r1 = java.util.Collections.unmodifiableList(r20)
            X.88H r0 = new X.88H
            r0.<init>(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6PW.A04(byte[], int, boolean):X.8tW");
    }
}
