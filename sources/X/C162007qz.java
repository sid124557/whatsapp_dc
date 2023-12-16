package X;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PathEffect;
import android.graphics.PorterDuff;

/* renamed from: X.7qz  reason: invalid class name and case insensitive filesystem */
public final class C162007qz {
    public static final byte[] A07 = {0, 7, 8, 15};
    public static final byte[] A08 = {0, 119, -120, -1};
    public static final byte[] A09 = {0, 17, 34, 51, 68, 85, 102, 119, -120, -103, -86, -69, -52, -35, -18, -1};
    public Bitmap A00;
    public final Canvas A01 = new Canvas();
    public final Paint A02;
    public final Paint A03;
    public final AnonymousClass7M9 A04 = new AnonymousClass7M9(new int[]{0, -1, -16777216, -8421505}, A03(), A04(), 0);
    public final AnonymousClass7OT A05 = new AnonymousClass7OT(719, 575, 0, 719, 0, 575);
    public final C150097Pd A06;

    public static AnonymousClass7M9 A00(C160807oL r18, int i) {
        int[] iArr;
        int A042;
        int A043;
        int A044;
        int A045;
        int i2 = 8;
        C160807oL r12 = r18;
        int A046 = r12.A04(8);
        r12.A09(8);
        int i3 = 2;
        int i4 = i - 2;
        int[] iArr2 = {0, -1, -16777216, -8421505};
        int[] A032 = A03();
        int[] A047 = A04();
        while (i4 > 0) {
            int A048 = r12.A04(i2);
            int A049 = r12.A04(i2);
            int i5 = i4 - 2;
            if ((A049 & 128) != 0) {
                iArr = iArr2;
            } else {
                iArr = A047;
                if ((A049 & 64) != 0) {
                    iArr = A032;
                }
            }
            if ((A049 & 1) != 0) {
                A042 = r12.A04(i2);
                A043 = r12.A04(i2);
                A044 = r12.A04(i2);
                A045 = r12.A04(i2);
                i4 = i5 - 4;
            } else {
                A042 = r12.A04(6) << i3;
                A043 = r12.A04(4) << 4;
                A044 = r12.A04(4) << 4;
                A045 = r12.A04(i3) << 6;
                i4 = i5 - 2;
            }
            if (A042 == 0) {
                A043 = 0;
                A044 = 0;
                A045 = 255;
            }
            double d = (double) A042;
            double d2 = (double) (A043 - 128);
            double d3 = (double) (A044 - 128);
            iArr[A048] = (((byte) (255 - (A045 & 255))) << 24) | (AnonymousClass001.A0D((int) (d + (1.402d * d2)), 255, 0) << 16) | (AnonymousClass001.A0D((int) ((d - (0.34414d * d3)) - (d2 * 0.71414d)), 255, 0) << 8) | AnonymousClass001.A0D((int) (d + (d3 * 1.772d)), 255, 0);
            i2 = 8;
            i3 = 2;
        }
        return new AnonymousClass7M9(iArr2, A032, A047, A046);
    }

    public static AnonymousClass7MA A01(C160807oL r6) {
        byte[] bArr;
        int A042 = r6.A04(16);
        r6.A09(4);
        int A043 = r6.A04(2);
        boolean A0D = r6.A0D();
        r6.A09(1);
        byte[] bArr2 = C162387ry.A0A;
        if (A043 == 1) {
            r6.A09(r6.A04(8) * 16);
        } else if (A043 == 0) {
            int A044 = r6.A04(16);
            int A045 = r6.A04(16);
            if (A044 > 0) {
                bArr2 = new byte[A044];
                r6.A0C(bArr2, A044);
            }
            if (A045 > 0) {
                bArr = new byte[A045];
                r6.A0C(bArr, A045);
                return new AnonymousClass7MA(bArr2, bArr, A042, A0D);
            }
        }
        bArr = bArr2;
        return new AnonymousClass7MA(bArr2, bArr, A042, A0D);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v26, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v27, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v31, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v33, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v34, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v35, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v41, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v54, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v55, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v56, resolved type: byte} */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0062, code lost:
        if (r0 == 0) goto L_0x0086;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0064, code lost:
        r13 = false;
        r12 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0066, code lost:
        if (r24 == null) goto L_0x0082;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0068, code lost:
        r10.setColor(r26[r0]);
        r17.drawRect((float) r7, (float) r9, (float) (r7 + r12), (float) (r9 + 1), r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0082, code lost:
        r7 = r7 + r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0086, code lost:
        r1 = r8.A0D();
        r12 = r8.A04(7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x008f, code lost:
        if (r1 != false) goto L_0x0099;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0091, code lost:
        if (r12 == 0) goto L_0x0096;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0093, code lost:
        r13 = false;
        r0 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0096, code lost:
        r13 = true;
        r12 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0099, code lost:
        r0 = r8.A04(8);
        r13 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x009e, code lost:
        if (r12 == 0) goto L_0x0082;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00ea, code lost:
        if (r12 != 0) goto L_0x00b1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x016e, code lost:
        if (r12 != 0) goto L_0x0134;
     */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Incorrect type for immutable var: ssa=byte, code=int, for r0v20, types: [byte] */
    /* JADX WARNING: Incorrect type for immutable var: ssa=byte, code=int, for r0v40, types: [byte] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00b3  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x0136  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A02(android.graphics.Canvas r23, android.graphics.Paint r24, byte[] r25, int[] r26, int r27, int r28, int r29) {
        /*
            r1 = r25
            r9 = r29
            int r0 = r1.length
            X.7oL r8 = new X.7oL
            r8.<init>(r1, r0)
            r16 = 0
            r7 = r28
            r6 = r16
            r5 = r6
            r4 = r6
        L_0x0012:
            int r0 = X.C160807oL.A00(r8)
            if (r0 == 0) goto L_0x01b4
            r3 = 8
            int r1 = r8.A04(r3)
            r0 = 240(0xf0, float:3.36E-43)
            if (r1 == r0) goto L_0x01ae
            r2 = 3
            r17 = r23
            r10 = r24
            r11 = r27
            switch(r1) {
                case 16: goto L_0x0124;
                case 17: goto L_0x00a1;
                case 18: goto L_0x005e;
                default: goto L_0x002c;
            }
        L_0x002c:
            switch(r1) {
                case 32: goto L_0x004f;
                case 33: goto L_0x0040;
                case 34: goto L_0x0030;
                default: goto L_0x002f;
            }
        L_0x002f:
            goto L_0x0012
        L_0x0030:
            r2 = 16
            byte[] r5 = new byte[r2]
            r1 = 0
        L_0x0035:
            int r0 = r8.A04(r3)
            int r1 = X.AnonymousClass6CA.A0A(r5, r0, r1)
            if (r1 >= r2) goto L_0x0012
            goto L_0x0035
        L_0x0040:
            r2 = 4
            byte[] r6 = new byte[r2]
            r1 = 0
        L_0x0044:
            int r0 = r8.A04(r3)
            int r1 = X.AnonymousClass6CA.A0A(r6, r0, r1)
            if (r1 >= r2) goto L_0x0012
            goto L_0x0044
        L_0x004f:
            r2 = 4
            byte[] r4 = new byte[r2]
            r1 = 0
        L_0x0053:
            int r0 = r8.A04(r2)
            int r1 = X.AnonymousClass6CA.A0A(r4, r0, r1)
            if (r1 >= r2) goto L_0x0012
            goto L_0x0053
        L_0x005e:
            int r0 = r8.A04(r3)
            if (r0 == 0) goto L_0x0086
            r13 = 0
            r12 = 1
        L_0x0066:
            if (r24 == 0) goto L_0x0082
            r0 = r26[r0]
            r10.setColor(r0)
            float r11 = (float) r7
            float r2 = (float) r9
            int r0 = r7 + r12
            float r1 = (float) r0
            int r0 = r9 + 1
            float r0 = (float) r0
            r22 = r10
            r19 = r2
            r20 = r1
            r21 = r0
            r18 = r11
            r17.drawRect(r18, r19, r20, r21, r22)
        L_0x0082:
            int r7 = r7 + r12
            if (r13 == 0) goto L_0x005e
            goto L_0x0012
        L_0x0086:
            boolean r1 = r8.A0D()
            r0 = 7
            int r12 = r8.A04(r0)
            if (r1 != 0) goto L_0x0099
            if (r12 == 0) goto L_0x0096
            r13 = 0
            r0 = 0
            goto L_0x0066
        L_0x0096:
            r13 = 1
            r12 = 0
            goto L_0x0082
        L_0x0099:
            int r0 = r8.A04(r3)
            r13 = 0
            if (r12 == 0) goto L_0x0082
            goto L_0x0066
        L_0x00a1:
            if (r11 != r2) goto L_0x0121
            if (r5 != 0) goto L_0x011f
            byte[] r15 = A09
        L_0x00a7:
            r11 = 4
            int r0 = r8.A04(r11)
            r13 = 1
            if (r0 == 0) goto L_0x00d9
            r14 = 0
        L_0x00b0:
            r12 = 1
        L_0x00b1:
            if (r24 == 0) goto L_0x00d1
            if (r15 == 0) goto L_0x00b7
            byte r0 = r15[r0]
        L_0x00b7:
            r0 = r26[r0]
            r10.setColor(r0)
            float r13 = (float) r7
            float r11 = (float) r9
            int r0 = r7 + r12
            float r1 = (float) r0
            int r0 = r9 + 1
            float r0 = (float) r0
            r22 = r10
            r19 = r11
            r20 = r1
            r21 = r0
            r18 = r13
            r17.drawRect(r18, r19, r20, r21, r22)
        L_0x00d1:
            int r7 = r7 + r12
            if (r14 == 0) goto L_0x00a7
            r8.A05()
            goto L_0x0012
        L_0x00d9:
            boolean r0 = r8.A0D()
            if (r0 != 0) goto L_0x00ed
            int r0 = r8.A04(r2)
            r14 = 1
            if (r0 == 0) goto L_0x0109
            int r12 = r0 + 2
            r14 = 0
            r0 = 0
        L_0x00ea:
            if (r12 == 0) goto L_0x00d1
            goto L_0x00b1
        L_0x00ed:
            boolean r1 = r8.A0D()
            r12 = 2
            int r0 = r8.A04(r12)
            if (r1 != 0) goto L_0x0100
            int r12 = r0 + 4
        L_0x00fa:
            int r0 = r8.A04(r11)
            r14 = 0
            goto L_0x00ea
        L_0x0100:
            if (r0 == 0) goto L_0x011c
            if (r0 == r13) goto L_0x0119
            if (r0 == r12) goto L_0x0112
            if (r0 == r2) goto L_0x010b
            r14 = 0
        L_0x0109:
            r12 = 0
            goto L_0x00d1
        L_0x010b:
            int r0 = r8.A04(r3)
            int r12 = r0 + 25
            goto L_0x00fa
        L_0x0112:
            int r0 = r8.A04(r11)
            int r12 = r0 + 9
            goto L_0x00fa
        L_0x0119:
            r14 = 0
            r0 = 0
            goto L_0x00b1
        L_0x011c:
            r14 = 0
            r0 = 0
            goto L_0x00b0
        L_0x011f:
            r15 = r5
            goto L_0x00a7
        L_0x0121:
            r15 = r16
            goto L_0x00a7
        L_0x0124:
            if (r11 != r2) goto L_0x01a0
            if (r6 != 0) goto L_0x019e
            byte[] r14 = A08
        L_0x012a:
            r1 = 2
            int r0 = r8.A04(r1)
            r11 = 1
            if (r0 == 0) goto L_0x015c
            r13 = 0
        L_0x0133:
            r12 = 1
        L_0x0134:
            if (r24 == 0) goto L_0x0154
            if (r14 == 0) goto L_0x013a
            byte r0 = r14[r0]
        L_0x013a:
            r0 = r26[r0]
            r10.setColor(r0)
            float r11 = (float) r7
            float r2 = (float) r9
            int r0 = r7 + r12
            float r1 = (float) r0
            int r0 = r9 + 1
            float r0 = (float) r0
            r22 = r10
            r19 = r2
            r20 = r1
            r21 = r0
            r18 = r11
            r17.drawRect(r18, r19, r20, r21, r22)
        L_0x0154:
            int r7 = r7 + r12
            if (r13 == 0) goto L_0x012a
            r8.A05()
            goto L_0x0012
        L_0x015c:
            boolean r0 = r8.A0D()
            r2 = 3
            if (r0 == 0) goto L_0x0171
            int r0 = r8.A04(r2)
            int r12 = r0 + 3
        L_0x0169:
            int r0 = r8.A04(r1)
            r13 = 0
            if (r12 == 0) goto L_0x0154
            goto L_0x0134
        L_0x0171:
            boolean r0 = r8.A0D()
            if (r0 == 0) goto L_0x017a
            r13 = 0
            r0 = 0
            goto L_0x0133
        L_0x017a:
            int r0 = r8.A04(r1)
            if (r0 == 0) goto L_0x0189
            if (r0 == r11) goto L_0x019a
            if (r0 == r1) goto L_0x0192
            if (r0 == r2) goto L_0x018b
            r13 = 0
        L_0x0187:
            r12 = 0
            goto L_0x0154
        L_0x0189:
            r13 = 1
            goto L_0x0187
        L_0x018b:
            int r0 = r8.A04(r3)
            int r12 = r0 + 29
            goto L_0x0169
        L_0x0192:
            r0 = 4
            int r0 = r8.A04(r0)
            int r12 = r0 + 12
            goto L_0x0169
        L_0x019a:
            r13 = 0
            r0 = 0
            r12 = 2
            goto L_0x0134
        L_0x019e:
            r14 = r6
            goto L_0x012a
        L_0x01a0:
            r0 = 2
            if (r11 != r0) goto L_0x01aa
            if (r4 != 0) goto L_0x01a8
            byte[] r14 = A07
            goto L_0x012a
        L_0x01a8:
            r14 = r4
            goto L_0x012a
        L_0x01aa:
            r14 = r16
            goto L_0x012a
        L_0x01ae:
            int r9 = r9 + 2
            r7 = r28
            goto L_0x0012
        L_0x01b4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C162007qz.A02(android.graphics.Canvas, android.graphics.Paint, byte[], int[], int, int, int):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002d, code lost:
        r4 = 0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int[] A03() {
        /*
            r7 = 16
            int[] r6 = new int[r7]
            r0 = 0
            r6[r0] = r0
            r5 = 1
        L_0x0008:
            r4 = 255(0xff, float:3.57E-43)
        L_0x000a:
            r0 = r5 & 2
            r3 = 0
            if (r0 == 0) goto L_0x0011
            r3 = 255(0xff, float:3.57E-43)
        L_0x0011:
            r0 = r5 & 4
            r2 = 0
            if (r0 == 0) goto L_0x0018
            r2 = 255(0xff, float:3.57E-43)
        L_0x0018:
            r1 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            int r0 = r4 << 16
            r1 = r1 | r0
            int r0 = r3 << 8
            r1 = r1 | r0
            r1 = r1 | r2
        L_0x0021:
            r6[r5] = r1
            int r5 = r5 + 1
            if (r5 >= r7) goto L_0x004e
            r1 = 8
            r0 = r5 & 1
            if (r5 >= r1) goto L_0x0031
            r4 = 0
            if (r0 == 0) goto L_0x000a
            goto L_0x0008
        L_0x0031:
            r4 = 127(0x7f, float:1.78E-43)
            r3 = 0
            if (r0 == 0) goto L_0x0038
            r3 = 127(0x7f, float:1.78E-43)
        L_0x0038:
            r0 = r5 & 2
            r2 = 0
            if (r0 == 0) goto L_0x003f
            r2 = 127(0x7f, float:1.78E-43)
        L_0x003f:
            r0 = r5 & 4
            if (r0 != 0) goto L_0x0044
            r4 = 0
        L_0x0044:
            r1 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            int r0 = r3 << 16
            r1 = r1 | r0
            int r0 = r2 << 8
            r1 = r1 | r0
            r1 = r1 | r4
            goto L_0x0021
        L_0x004e:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C162007qz.A03():int[]");
    }

    public static int[] A04() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int[] iArr = new int[256];
        iArr[0] = 0;
        int i7 = 0;
        do {
            int i8 = 255;
            if (i7 < 8) {
                i4 = 0;
                if ((i7 & 1) != 0) {
                    i4 = 255;
                }
                i5 = 0;
                if ((i7 & 2) != 0) {
                    i5 = 255;
                }
                if ((i7 & 4) == 0) {
                    i8 = 0;
                }
                i6 = 1056964608;
            } else {
                int i9 = i7 & 136;
                int i10 = 170;
                int i11 = 85;
                if (i9 == 0) {
                    int i12 = 0;
                    if ((i7 & 1) != 0) {
                        i12 = 85;
                    }
                    int i13 = 0;
                    if ((i7 & 16) != 0) {
                        i13 = 170;
                    }
                    i = i12 + i13;
                    int i14 = 0;
                    if ((i7 & 2) != 0) {
                        i14 = 85;
                    }
                    int i15 = 0;
                    if ((i7 & 32) != 0) {
                        i15 = 170;
                    }
                    i2 = i14 + i15;
                    if ((i7 & 4) == 0) {
                        i11 = 0;
                    }
                    if ((i7 & 64) == 0) {
                        i10 = 0;
                    }
                } else if (i9 != 8) {
                    i10 = 43;
                    if (i9 != 128) {
                        if (i9 == 136) {
                            int i16 = 0;
                            if ((i7 & 1) != 0) {
                                i16 = 43;
                            }
                            int i17 = 0;
                            if ((i7 & 16) != 0) {
                                i17 = 85;
                            }
                            i = i16 + i17;
                            int i18 = 0;
                            if ((i7 & 2) != 0) {
                                i18 = 43;
                            }
                            int i19 = 0;
                            if ((i7 & 32) != 0) {
                                i19 = 85;
                            }
                            i2 = i18 + i19;
                            if ((i7 & 4) == 0) {
                                i10 = 0;
                            }
                        }
                        i7++;
                    } else {
                        int i20 = 0;
                        if ((i7 & 1) != 0) {
                            i20 = 43;
                        }
                        int i21 = i20 + 127;
                        int i22 = 0;
                        if ((i7 & 16) != 0) {
                            i22 = 85;
                        }
                        i = i21 + i22;
                        int i23 = 0;
                        if ((i7 & 2) != 0) {
                            i23 = 43;
                        }
                        int i24 = i23 + 127;
                        int i25 = 0;
                        if ((i7 & 32) != 0) {
                            i25 = 85;
                        }
                        i2 = i24 + i25;
                        if ((i7 & 4) == 0) {
                            i10 = 0;
                        }
                        i10 += 127;
                    }
                    if ((i7 & 64) == 0) {
                        i11 = 0;
                    }
                } else {
                    int i26 = 0;
                    if ((i7 & 1) != 0) {
                        i26 = 85;
                    }
                    int i27 = 0;
                    if ((i7 & 16) != 0) {
                        i27 = 170;
                    }
                    i4 = i26 + i27;
                    int i28 = 0;
                    if ((i7 & 2) != 0) {
                        i28 = 85;
                    }
                    int i29 = 0;
                    if ((i7 & 32) != 0) {
                        i29 = 170;
                    }
                    i5 = i28 + i29;
                    if ((i7 & 4) == 0) {
                        i11 = 0;
                    }
                    if ((i7 & 64) == 0) {
                        i10 = 0;
                    }
                    i8 = i11 + i10;
                    i6 = 2130706432;
                }
                i3 = -16777216 | (i << 16) | (i2 << 8) | (i10 + i11);
                iArr[i7] = i3;
                i7++;
            }
            i3 = i6 | (i4 << 16) | (i5 << 8) | i8;
            iArr[i7] = i3;
            i7++;
        } while (i7 < 256);
        return iArr;
    }

    public C162007qz(int i, int i2) {
        Paint paint = new Paint();
        this.A02 = paint;
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        C86634Kw.A18(paint, PorterDuff.Mode.SRC);
        paint.setPathEffect((PathEffect) null);
        Paint paint2 = new Paint();
        this.A03 = paint2;
        paint2.setStyle(Paint.Style.FILL);
        C86634Kw.A18(paint2, PorterDuff.Mode.DST_OVER);
        paint2.setPathEffect((PathEffect) null);
        this.A06 = new C150097Pd(i, i2);
    }
}
