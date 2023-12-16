package X;

import java.util.List;

/* renamed from: X.6PT  reason: invalid class name */
public final class AnonymousClass6PT extends C126516Og {
    public final C162007qz A00;

    public AnonymousClass6PT(List list) {
        super("DvbDecoder");
        C161467pi r0 = new C161467pi((byte[]) C18290x4.A0k(list));
        this.A00 = new C162007qz(r0.A0F(), r0.A0F());
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v4, resolved type: X.7MA} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v13, resolved type: X.7Pn} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v19, resolved type: X.7MA} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v22, resolved type: X.7M9} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v24, resolved type: X.7MA} */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x01c8, code lost:
        r3.put(r1, r10);
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C185358tW A04(byte[] r27, int r28, boolean r29) {
        /*
            r26 = this;
            r2 = r26
            if (r29 == 0) goto L_0x0026
            X.7qz r0 = r2.A00
            X.7Pd r1 = r0.A06
            android.util.SparseArray r0 = r1.A08
            r0.clear()
            android.util.SparseArray r0 = r1.A06
            r0.clear()
            android.util.SparseArray r0 = r1.A07
            r0.clear()
            android.util.SparseArray r0 = r1.A04
            r0.clear()
            android.util.SparseArray r0 = r1.A05
            r0.clear()
            r0 = 0
            r1.A00 = r0
            r1.A01 = r0
        L_0x0026:
            X.7qz r2 = r2.A00
            X.7oL r0 = new X.7oL
            r3 = r27
            r1 = r28
            r0.<init>(r3, r1)
        L_0x0031:
            int r4 = r0.A01
            int r1 = r0.A02
            int r1 = r4 - r1
            int r3 = r1 * 8
            int r1 = r0.A00
            int r3 = r3 - r1
            r1 = 48
            if (r3 < r1) goto L_0x0212
            r1 = 8
            int r3 = r0.A04(r1)
            r1 = 15
            if (r3 != r1) goto L_0x0212
            X.7Pd r1 = r2.A06
            r3 = 8
            int r9 = r0.A04(r3)
            r3 = 16
            int r5 = r0.A04(r3)
            int r6 = r0.A04(r3)
            int r3 = r0.A00
            boolean r3 = X.AnonymousClass000.A1T(r3)
            X.C161487pm.A04(r3)
            int r3 = r0.A02
            int r7 = r3 + r6
            int r8 = r6 * 8
            int r4 = r4 - r3
            int r4 = r4 * 8
            int r3 = r0.A00
            int r4 = r4 - r3
            if (r8 <= r4) goto L_0x0082
            java.lang.String r3 = "DvbParser"
            java.lang.String r1 = "Data field length exceeds limit"
            android.util.Log.w(r3, r1)
            int r1 = X.C160807oL.A00(r0)
            r0.A09(r1)
            goto L_0x0031
        L_0x0082:
            switch(r9) {
                case 16: goto L_0x0095;
                case 17: goto L_0x00f6;
                case 18: goto L_0x01a4;
                case 19: goto L_0x01bc;
                case 20: goto L_0x01d8;
                default: goto L_0x0085;
            }
        L_0x0085:
            int r1 = r0.A00
            boolean r1 = X.AnonymousClass000.A1T(r1)
            X.C161487pm.A04(r1)
            int r1 = r0.A02
            int r7 = r7 - r1
            r0.A0A(r7)
            goto L_0x0031
        L_0x0095:
            int r3 = r1.A03
            if (r5 != r3) goto L_0x0085
            X.7Jf r11 = r1.A01
            r13 = 8
            r0.A04(r13)
            r3 = 4
            int r12 = r0.A04(r3)
            r3 = 2
            int r10 = r0.A04(r3)
            r0.A09(r3)
            int r6 = r6 - r3
            android.util.SparseArray r9 = X.AnonymousClass6CA.A0I()
        L_0x00b2:
            if (r6 <= 0) goto L_0x00d0
            int r8 = r0.A04(r13)
            r0.A09(r13)
            r3 = 16
            int r5 = r0.A04(r3)
            int r4 = r0.A04(r3)
            int r6 = r6 + -6
            X.7G6 r3 = new X.7G6
            r3.<init>(r5, r4)
            r9.put(r8, r3)
            goto L_0x00b2
        L_0x00d0:
            X.7Jf r5 = new X.7Jf
            r5.<init>(r9, r12, r10)
            int r3 = r5.A00
            if (r3 == 0) goto L_0x00eb
            r1.A01 = r5
            android.util.SparseArray r3 = r1.A08
            r3.clear()
            android.util.SparseArray r3 = r1.A06
            r3.clear()
            android.util.SparseArray r1 = r1.A07
            r1.clear()
            goto L_0x0085
        L_0x00eb:
            if (r11 == 0) goto L_0x0085
            int r4 = r11.A01
            int r3 = r5.A01
            if (r4 == r3) goto L_0x0085
            r1.A01 = r5
            goto L_0x0085
        L_0x00f6:
            X.7Jf r4 = r1.A01
            int r3 = r1.A03
            if (r5 != r3) goto L_0x0085
            if (r4 == 0) goto L_0x0085
            r9 = 8
            int r12 = r0.A04(r9)
            r8 = 4
            r0.A09(r8)
            boolean r20 = r0.A0D()
            r3 = 3
            r0.A09(r3)
            r5 = 16
            int r13 = r0.A04(r5)
            int r14 = r0.A04(r5)
            r0.A04(r3)
            int r15 = r0.A04(r3)
            r3 = 2
            int r16 = X.C160807oL.A01(r0, r3, r9)
            int r17 = r0.A04(r9)
            int r18 = r0.A04(r8)
            int r19 = r0.A04(r3)
            r0.A09(r3)
            int r10 = r6 + -10
            android.util.SparseArray r11 = X.AnonymousClass6CA.A0I()
        L_0x013b:
            if (r10 <= 0) goto L_0x0171
            int r9 = r0.A04(r5)
            int r5 = r0.A04(r3)
            r0.A04(r3)
            r3 = 12
            int r8 = r0.A04(r3)
            r6 = 4
            int r6 = X.C160807oL.A01(r0, r6, r3)
            int r10 = r10 + -6
            r3 = 1
            if (r5 == r3) goto L_0x015b
            r3 = 2
            if (r5 != r3) goto L_0x0165
        L_0x015b:
            r3 = 8
            r0.A04(r3)
            r0.A04(r3)
            int r10 = r10 + -2
        L_0x0165:
            X.7G7 r3 = new X.7G7
            r3.<init>(r8, r6)
            r11.put(r9, r3)
            r3 = 2
            r5 = 16
            goto L_0x013b
        L_0x0171:
            X.7Pn r10 = new X.7Pn
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            int r3 = r4.A00
            if (r3 != 0) goto L_0x019f
            android.util.SparseArray r4 = r1.A08
            int r3 = r10.A03
            java.lang.Object r3 = r4.get(r3)
            X.7Pn r3 = (X.AnonymousClass7Pn) r3
            if (r3 == 0) goto L_0x019f
            android.util.SparseArray r8 = r3.A08
            r6 = 0
        L_0x0189:
            int r3 = r8.size()
            if (r6 >= r3) goto L_0x019f
            android.util.SparseArray r5 = r10.A08
            int r4 = r8.keyAt(r6)
            java.lang.Object r3 = r8.valueAt(r6)
            r5.put(r4, r3)
            int r6 = r6 + 1
            goto L_0x0189
        L_0x019f:
            android.util.SparseArray r3 = r1.A08
            int r1 = r10.A03
            goto L_0x01c8
        L_0x01a4:
            int r3 = r1.A03
            if (r5 != r3) goto L_0x01b1
            X.7M9 r10 = X.C162007qz.A00(r0, r6)
            android.util.SparseArray r3 = r1.A06
        L_0x01ae:
            int r1 = r10.A00
            goto L_0x01c8
        L_0x01b1:
            int r3 = r1.A02
            if (r5 != r3) goto L_0x0085
            X.7M9 r10 = X.C162007qz.A00(r0, r6)
            android.util.SparseArray r3 = r1.A04
            goto L_0x01ae
        L_0x01bc:
            int r3 = r1.A03
            if (r5 != r3) goto L_0x01cd
            X.7MA r10 = X.C162007qz.A01(r0)
            android.util.SparseArray r3 = r1.A07
        L_0x01c6:
            int r1 = r10.A00
        L_0x01c8:
            r3.put(r1, r10)
            goto L_0x0085
        L_0x01cd:
            int r3 = r1.A02
            if (r5 != r3) goto L_0x0085
            X.7MA r10 = X.C162007qz.A01(r0)
            android.util.SparseArray r3 = r1.A05
            goto L_0x01c6
        L_0x01d8:
            int r3 = r1.A03
            if (r5 != r3) goto L_0x0085
            r3 = 4
            r0.A09(r3)
            boolean r4 = r0.A0D()
            r3 = 3
            r0.A09(r3)
            r3 = 16
            int r9 = r0.A04(r3)
            int r10 = r0.A04(r3)
            if (r4 == 0) goto L_0x020d
            int r11 = r0.A04(r3)
            int r12 = r0.A04(r3)
            int r13 = r0.A04(r3)
            int r14 = r0.A04(r3)
        L_0x0204:
            X.7OT r8 = new X.7OT
            r8.<init>(r9, r10, r11, r12, r13, r14)
            r1.A00 = r8
            goto L_0x0085
        L_0x020d:
            r12 = r9
            r14 = r10
            r11 = 0
            r13 = 0
            goto L_0x0204
        L_0x0212:
            X.7Pd r13 = r2.A06
            X.7Jf r3 = r13.A01
            if (r3 != 0) goto L_0x0222
            java.util.List r1 = java.util.Collections.emptyList()
        L_0x021c:
            X.88G r0 = new X.88G
            r0.<init>(r1)
            return r0
        L_0x0222:
            X.7OT r12 = r13.A00
            if (r12 != 0) goto L_0x0228
            X.7OT r12 = r2.A05
        L_0x0228:
            android.graphics.Bitmap r4 = r2.A00
            if (r4 == 0) goto L_0x0242
            int r0 = r12.A05
            int r1 = r0 + 1
            int r0 = r4.getWidth()
            if (r1 != r0) goto L_0x0242
            int r0 = r12.A00
            int r1 = r0 + 1
            android.graphics.Bitmap r0 = r2.A00
            int r0 = r0.getHeight()
            if (r1 == r0) goto L_0x0255
        L_0x0242:
            int r0 = r12.A05
            int r1 = r0 + 1
            int r0 = r12.A00
            int r0 = r0 + 1
            android.graphics.Bitmap r1 = X.C86664Kz.A0Y(r1, r0)
            r2.A00 = r1
            android.graphics.Canvas r0 = r2.A01
            r0.setBitmap(r1)
        L_0x0255:
            java.util.ArrayList r17 = X.AnonymousClass001.A0s()
            android.util.SparseArray r0 = r3.A02
            r25 = r0
            r11 = 0
            r10 = 0
        L_0x025f:
            int r0 = r25.size()
            if (r10 >= r0) goto L_0x039b
            android.graphics.Canvas r0 = r2.A01
            r18 = r0
            r18.save()
            r0 = r25
            java.lang.Object r3 = r0.valueAt(r10)
            X.7G6 r3 = (X.AnonymousClass7G6) r3
            int r1 = r0.keyAt(r10)
            android.util.SparseArray r0 = r13.A08
            java.lang.Object r9 = r0.get(r1)
            X.7Pn r9 = (X.AnonymousClass7Pn) r9
            int r8 = r3.A00
            int r0 = r12.A02
            int r8 = r8 + r0
            int r7 = r3.A01
            int r0 = r12.A04
            int r7 = r7 + r0
            int r1 = r9.A07
            int r1 = r1 + r8
            int r0 = r12.A01
            int r3 = java.lang.Math.min(r1, r0)
            int r1 = r9.A02
            int r1 = r1 + r7
            int r0 = r12.A03
            int r1 = java.lang.Math.min(r1, r0)
            r0 = r18
            r0.clipRect(r8, r7, r3, r1)
            android.util.SparseArray r1 = r13.A06
            int r0 = r9.A00
            java.lang.Object r6 = r1.get(r0)
            X.7M9 r6 = (X.AnonymousClass7M9) r6
            if (r6 != 0) goto L_0x02bb
            android.util.SparseArray r1 = r13.A04
            int r0 = r9.A00
            java.lang.Object r6 = r1.get(r0)
            X.7M9 r6 = (X.AnonymousClass7M9) r6
            if (r6 != 0) goto L_0x02bb
            X.7M9 r6 = r2.A04
        L_0x02bb:
            android.util.SparseArray r15 = r9.A08
            r5 = 0
        L_0x02be:
            int r0 = r15.size()
            if (r5 >= r0) goto L_0x031f
            int r3 = r15.keyAt(r5)
            java.lang.Object r1 = r15.valueAt(r5)
            X.7G7 r1 = (X.AnonymousClass7G7) r1
            android.util.SparseArray r0 = r13.A07
            java.lang.Object r14 = r0.get(r3)
            X.7MA r14 = (X.AnonymousClass7MA) r14
            if (r14 != 0) goto L_0x02e2
            android.util.SparseArray r0 = r13.A05
            java.lang.Object r14 = r0.get(r3)
            X.7MA r14 = (X.AnonymousClass7MA) r14
            if (r14 == 0) goto L_0x030e
        L_0x02e2:
            boolean r0 = r14.A01
            if (r0 == 0) goto L_0x031a
            r16 = 0
        L_0x02e8:
            int r4 = r9.A01
            int r3 = r1.A00
            int r3 = r3 + r8
            int r0 = r1.A01
            int r24 = r7 + r0
            r0 = 3
            if (r4 != r0) goto L_0x0311
            int[] r1 = r6.A03
        L_0x02f6:
            byte[] r0 = r14.A03
            r19 = r16
            r20 = r0
            r21 = r1
            r22 = r4
            r23 = r3
            X.C162007qz.A02(r18, r19, r20, r21, r22, r23, r24)
            byte[] r0 = r14.A02
            int r24 = r24 + 1
            r20 = r0
            X.C162007qz.A02(r18, r19, r20, r21, r22, r23, r24)
        L_0x030e:
            int r5 = r5 + 1
            goto L_0x02be
        L_0x0311:
            r0 = 2
            if (r4 != r0) goto L_0x0317
            int[] r1 = r6.A02
            goto L_0x02f6
        L_0x0317:
            int[] r1 = r6.A01
            goto L_0x02f6
        L_0x031a:
            android.graphics.Paint r0 = r2.A02
            r16 = r0
            goto L_0x02e8
        L_0x031f:
            boolean r0 = r9.A09
            if (r0 == 0) goto L_0x034a
            int r1 = r9.A01
            r0 = 3
            if (r1 != r0) goto L_0x038e
            int[] r1 = r6.A03
            int r0 = r9.A06
        L_0x032c:
            r0 = r1[r0]
            android.graphics.Paint r5 = r2.A03
            r5.setColor(r0)
            float r4 = (float) r8
            float r3 = (float) r7
            int r0 = r9.A07
            int r0 = r0 + r8
            float r1 = (float) r0
            int r0 = r9.A02
            int r0 = r0 + r7
            float r0 = (float) r0
            r19 = r4
            r20 = r3
            r21 = r1
            r22 = r0
            r23 = r5
            r18.drawRect(r19, r20, r21, r22, r23)
        L_0x034a:
            X.7ip r5 = new X.7ip
            r5.<init>()
            android.graphics.Bitmap r0 = r2.A00
            int r14 = r9.A07
            int r6 = r9.A02
            android.graphics.Bitmap r0 = android.graphics.Bitmap.createBitmap(r0, r8, r7, r14, r6)
            r5.A0C = r0
            float r1 = (float) r8
            int r0 = r12.A05
            float r4 = (float) r0
            float r1 = r1 / r4
            r5.A02 = r1
            r5.A08 = r11
            float r3 = (float) r7
            int r0 = r12.A00
            float r1 = (float) r0
            float r3 = r3 / r1
            r5.A01 = r3
            r5.A07 = r11
            r5.A06 = r11
            float r0 = (float) r14
            float r0 = r0 / r4
            r5.A04 = r0
            float r0 = (float) r6
            float r0 = r0 / r1
            r5.A00 = r0
            X.7hc r1 = r5.A00()
            r0 = r17
            r0.add(r1)
            android.graphics.PorterDuff$Mode r1 = android.graphics.PorterDuff.Mode.CLEAR
            r0 = r18
            r0.drawColor(r11, r1)
            r18.restore()
            int r10 = r10 + 1
            goto L_0x025f
        L_0x038e:
            r0 = 2
            if (r1 != r0) goto L_0x0396
            int[] r1 = r6.A02
            int r0 = r9.A05
            goto L_0x032c
        L_0x0396:
            int[] r1 = r6.A01
            int r0 = r9.A04
            goto L_0x032c
        L_0x039b:
            java.util.List r1 = java.util.Collections.unmodifiableList(r17)
            goto L_0x021c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6PT.A04(byte[], int, boolean):X.8tW");
    }
}
