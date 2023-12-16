package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;

/* renamed from: X.7aQ  reason: invalid class name and case insensitive filesystem */
public class C152947aQ {
    public final Paint A00;
    public final C158637kJ A01;
    public final C180398ky A02;
    public final boolean A03;

    public final boolean A02(int i) {
        if (i != 0) {
            AnonymousClass7OK[] r0 = this.A01.A0B;
            AnonymousClass7OK r3 = r0[i];
            AnonymousClass7OK r2 = r0[i - 1];
            if (r3.A04 != C141216vD.NO_BLEND || !A03(r3)) {
                return r2.A05 == C141386vU.DISPOSE_TO_BACKGROUND && A03(r2);
            }
        }
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:75:0x0177  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x0180  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x01c5  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A00(int r16, android.graphics.Bitmap r17) {
        /*
            r15 = this;
            boolean r0 = r15.A03
            r6 = r16
            r1 = r17
            if (r0 == 0) goto L_0x0143
            android.graphics.Canvas r7 = new android.graphics.Canvas
            r7.<init>(r1)
            X.7kJ r5 = r15.A01
            X.8v8 r1 = r5.A06
            X.8uG r4 = r1.getFrame(r6)
            X.7OK r10 = r1.getFrameInfo(r6)
            if (r16 != 0) goto L_0x001d
            r3 = 0
            goto L_0x0023
        L_0x001d:
            int r0 = r16 + -1
            X.7OK r3 = r1.getFrameInfo(r0)
        L_0x0023:
            int r0 = r4.getWidth()     // Catch:{ all -> 0x013e }
            if (r0 <= 0) goto L_0x013a
            int r0 = r4.getHeight()     // Catch:{ all -> 0x013e }
            if (r0 <= 0) goto L_0x013a
            boolean r0 = r1.doesRenderSupportScaling()     // Catch:{ all -> 0x013e }
            if (r0 == 0) goto L_0x00d7
            int r11 = r1.getWidth()     // Catch:{ all -> 0x013e }
            int r1 = r1.getHeight()     // Catch:{ all -> 0x013e }
            float r6 = (float) r11     // Catch:{ all -> 0x013e }
            float r2 = (float) r1     // Catch:{ all -> 0x013e }
            int r9 = r4.getWidth()     // Catch:{ all -> 0x013e }
            int r8 = r4.getHeight()     // Catch:{ all -> 0x013e }
            int r14 = r4.getXOffset()     // Catch:{ all -> 0x013e }
            int r13 = r4.getYOffset()     // Catch:{ all -> 0x013e }
            int r0 = r7.getWidth()     // Catch:{ all -> 0x013e }
            float r0 = (float) r0     // Catch:{ all -> 0x013e }
            int r0 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r0 > 0) goto L_0x0066
            int r0 = r7.getHeight()     // Catch:{ all -> 0x013e }
            float r0 = (float) r0     // Catch:{ all -> 0x013e }
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 > 0) goto L_0x0066
            r12 = 1065353216(0x3f800000, float:1.0)
            r11 = 1065353216(0x3f800000, float:1.0)
            goto L_0x00a7
        L_0x0066:
            int r0 = r7.getWidth()     // Catch:{ all -> 0x013e }
            int r8 = java.lang.Math.min(r0, r11)     // Catch:{ all -> 0x013e }
            int r0 = r7.getHeight()     // Catch:{ all -> 0x013e }
            int r1 = java.lang.Math.min(r0, r1)     // Catch:{ all -> 0x013e }
            float r0 = r6 / r2
            if (r8 <= r1) goto L_0x007e
            float r12 = (float) r8     // Catch:{ all -> 0x013e }
            float r11 = r12 / r0
            goto L_0x0081
        L_0x007e:
            float r11 = (float) r1     // Catch:{ all -> 0x013e }
            float r12 = r11 * r0
        L_0x0081:
            float r12 = r12 / r6
            float r11 = r11 / r2
            int r0 = r4.getWidth()     // Catch:{ all -> 0x013e }
            float r0 = (float) r0     // Catch:{ all -> 0x013e }
            int r9 = X.AnonymousClass6C9.A04(r0, r12)     // Catch:{ all -> 0x013e }
            int r0 = r4.getHeight()     // Catch:{ all -> 0x013e }
            float r0 = (float) r0     // Catch:{ all -> 0x013e }
            int r8 = X.AnonymousClass6C9.A04(r0, r11)     // Catch:{ all -> 0x013e }
            int r0 = r4.getXOffset()     // Catch:{ all -> 0x013e }
            float r0 = (float) r0     // Catch:{ all -> 0x013e }
            int r14 = X.AnonymousClass6C9.A04(r0, r12)     // Catch:{ all -> 0x013e }
            int r0 = r4.getYOffset()     // Catch:{ all -> 0x013e }
            float r0 = (float) r0     // Catch:{ all -> 0x013e }
            int r13 = X.AnonymousClass6C9.A04(r0, r11)     // Catch:{ all -> 0x013e }
        L_0x00a7:
            r0 = 0
            android.graphics.Rect r6 = new android.graphics.Rect     // Catch:{ all -> 0x013e }
            r6.<init>(r0, r0, r9, r8)     // Catch:{ all -> 0x013e }
            int r1 = r14 + r9
            int r0 = r13 + r8
            android.graphics.Rect r2 = new android.graphics.Rect     // Catch:{ all -> 0x013e }
            r2.<init>(r14, r13, r1, r0)     // Catch:{ all -> 0x013e }
            if (r3 == 0) goto L_0x00bb
            r5.A03(r7, r3, r12, r11)     // Catch:{ all -> 0x013e }
        L_0x00bb:
            X.6vD r1 = r10.A04     // Catch:{ all -> 0x013e }
            X.6vD r0 = X.C141216vD.NO_BLEND     // Catch:{ all -> 0x013e }
            if (r1 != r0) goto L_0x00c6
            android.graphics.Paint r0 = r5.A02     // Catch:{ all -> 0x013e }
            r7.drawRect(r2, r0)     // Catch:{ all -> 0x013e }
        L_0x00c6:
            monitor-enter(r5)     // Catch:{ all -> 0x013e }
            android.graphics.Bitmap r1 = r5.A01(r9, r8)     // Catch:{ all -> 0x00d4 }
            r4.renderFrame(r9, r8, r1)     // Catch:{ all -> 0x00d4 }
            r0 = 0
            r7.drawBitmap(r1, r6, r2, r0)     // Catch:{ all -> 0x00d4 }
            monitor-exit(r5)     // Catch:{ all -> 0x00d4 }
            goto L_0x013a
        L_0x00d4:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x00d4 }
            goto L_0x0139
        L_0x00d7:
            android.graphics.Rect r1 = r5.A05     // Catch:{ all -> 0x013e }
            int r0 = r1.width()     // Catch:{ all -> 0x013e }
            if (r0 <= 0) goto L_0x013a
            int r0 = r1.height()     // Catch:{ all -> 0x013e }
            if (r0 <= 0) goto L_0x013a
            int r0 = r7.getWidth()     // Catch:{ all -> 0x013e }
            float r2 = (float) r0     // Catch:{ all -> 0x013e }
            int r0 = r1.width()     // Catch:{ all -> 0x013e }
            float r0 = (float) r0     // Catch:{ all -> 0x013e }
            float r2 = r2 / r0
            if (r3 == 0) goto L_0x00f5
            r5.A03(r7, r3, r2, r2)     // Catch:{ all -> 0x013e }
        L_0x00f5:
            int r8 = r4.getWidth()     // Catch:{ all -> 0x013e }
            int r6 = r4.getHeight()     // Catch:{ all -> 0x013e }
            r0 = 0
            android.graphics.Rect r3 = new android.graphics.Rect     // Catch:{ all -> 0x013e }
            r3.<init>(r0, r0, r8, r6)     // Catch:{ all -> 0x013e }
            float r0 = (float) r8     // Catch:{ all -> 0x013e }
            float r0 = r0 * r2
            int r11 = (int) r0     // Catch:{ all -> 0x013e }
            float r0 = (float) r6     // Catch:{ all -> 0x013e }
            float r0 = r0 * r2
            int r9 = (int) r0     // Catch:{ all -> 0x013e }
            int r0 = r4.getXOffset()     // Catch:{ all -> 0x013e }
            float r0 = (float) r0     // Catch:{ all -> 0x013e }
            float r0 = r0 * r2
            int r1 = (int) r0     // Catch:{ all -> 0x013e }
            int r0 = r4.getYOffset()     // Catch:{ all -> 0x013e }
            float r0 = (float) r0     // Catch:{ all -> 0x013e }
            float r0 = r0 * r2
            int r0 = (int) r0     // Catch:{ all -> 0x013e }
            int r11 = r11 + r1
            int r9 = r9 + r0
            android.graphics.Rect r2 = new android.graphics.Rect     // Catch:{ all -> 0x013e }
            r2.<init>(r1, r0, r11, r9)     // Catch:{ all -> 0x013e }
            X.6vD r1 = r10.A04     // Catch:{ all -> 0x013e }
            X.6vD r0 = X.C141216vD.NO_BLEND     // Catch:{ all -> 0x013e }
            if (r1 != r0) goto L_0x0129
            android.graphics.Paint r0 = r5.A02     // Catch:{ all -> 0x013e }
            r7.drawRect(r2, r0)     // Catch:{ all -> 0x013e }
        L_0x0129:
            monitor-enter(r5)     // Catch:{ all -> 0x013e }
            android.graphics.Bitmap r1 = r5.A01(r8, r6)     // Catch:{ all -> 0x0137 }
            r4.renderFrame(r8, r6, r1)     // Catch:{ all -> 0x0137 }
            r0 = 0
            r7.drawBitmap(r1, r3, r2, r0)     // Catch:{ all -> 0x0137 }
            monitor-exit(r5)     // Catch:{ all -> 0x0137 }
            goto L_0x013a
        L_0x0137:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x0137 }
        L_0x0139:
            throw r0     // Catch:{ all -> 0x013e }
        L_0x013a:
            r4.dispose()
            return
        L_0x013e:
            r0 = move-exception
            r4.dispose()
            throw r0
        L_0x0143:
            android.graphics.Canvas r5 = new android.graphics.Canvas
            r5.<init>(r1)
            r2 = 0
            android.graphics.PorterDuff$Mode r0 = android.graphics.PorterDuff.Mode.SRC
            r5.drawColor(r2, r0)
            boolean r0 = r15.A02(r6)
            r7 = r6
            if (r0 != 0) goto L_0x01c3
            int r7 = r16 + -1
        L_0x0157:
            if (r7 < 0) goto L_0x01bb
            X.7kJ r0 = r15.A01
            X.7OK[] r4 = r0.A0B
            r3 = r4[r7]
            X.6vU r1 = r3.A05
            X.6vU r0 = X.C141386vU.DISPOSE_DO_NOT
            if (r1 == r0) goto L_0x01b8
            X.6vU r0 = X.C141386vU.DISPOSE_TO_BACKGROUND
            if (r1 != r0) goto L_0x01ae
            boolean r0 = r15.A03(r3)
            if (r0 == 0) goto L_0x01b8
            X.6uv r0 = X.C141036uv.NOT_REQUIRED
        L_0x0171:
            int r1 = r0.ordinal()
            if (r1 == r2) goto L_0x0180
            r0 = 1
            if (r1 == r0) goto L_0x01e4
            r0 = 3
            if (r1 == r0) goto L_0x01c3
        L_0x017d:
            int r7 = r7 + -1
            goto L_0x0157
        L_0x0180:
            r4 = r4[r7]
            X.8ky r1 = r15.A02
            X.91O r1 = (X.AnonymousClass91O) r1
            int r0 = r1.A01
            if (r0 != 0) goto L_0x01bd
            java.lang.Object r0 = r1.A00
            X.7Ti r0 = (X.C151077Ti) r0
            X.8ut r0 = r0.A02
            X.8Kh r3 = r0.B54(r7)
            if (r3 == 0) goto L_0x01bd
            android.graphics.Bitmap r2 = X.C172258Kh.A00(r3)     // Catch:{ all -> 0x01e7 }
            r1 = 0
            r0 = 0
            r5.drawBitmap(r2, r0, r0, r1)     // Catch:{ all -> 0x01e7 }
            X.6vU r1 = r4.A05     // Catch:{ all -> 0x01e7 }
            X.6vU r0 = X.C141386vU.DISPOSE_TO_BACKGROUND     // Catch:{ all -> 0x01e7 }
            if (r1 != r0) goto L_0x01a8
            r15.A01(r5, r4)     // Catch:{ all -> 0x01e7 }
        L_0x01a8:
            int r7 = r7 + 1
            r3.close()
            goto L_0x01c3
        L_0x01ae:
            X.6vU r0 = X.C141386vU.DISPOSE_TO_PREVIOUS
            if (r1 != r0) goto L_0x01b5
            X.6uv r0 = X.C141036uv.SKIP
            goto L_0x0171
        L_0x01b5:
            X.6uv r0 = X.C141036uv.ABORT
            goto L_0x0171
        L_0x01b8:
            X.6uv r0 = X.C141036uv.REQUIRED
            goto L_0x0171
        L_0x01bb:
            r7 = 0
            goto L_0x01c3
        L_0x01bd:
            boolean r0 = r15.A02(r7)
            if (r0 == 0) goto L_0x017d
        L_0x01c3:
            if (r7 >= r6) goto L_0x01ec
            X.7kJ r4 = r15.A01
            X.7OK[] r0 = r4.A0B
            r3 = r0[r7]
            X.6vU r2 = r3.A05
            X.6vU r0 = X.C141386vU.DISPOSE_TO_PREVIOUS
            if (r2 == r0) goto L_0x01e4
            X.6vD r1 = r3.A04
            X.6vD r0 = X.C141216vD.NO_BLEND
            if (r1 != r0) goto L_0x01da
            r15.A01(r5, r3)
        L_0x01da:
            r4.A02(r5, r7)
            X.6vU r0 = X.C141386vU.DISPOSE_TO_BACKGROUND
            if (r2 != r0) goto L_0x01e4
            r15.A01(r5, r3)
        L_0x01e4:
            int r7 = r7 + 1
            goto L_0x01c3
        L_0x01e7:
            r0 = move-exception
            r3.close()
            throw r0
        L_0x01ec:
            X.7kJ r3 = r15.A01
            X.7OK[] r0 = r3.A0B
            r2 = r0[r16]
            X.6vD r1 = r2.A04
            X.6vD r0 = X.C141216vD.NO_BLEND
            if (r1 != r0) goto L_0x01fb
            r15.A01(r5, r2)
        L_0x01fb:
            r3.A02(r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C152947aQ.A00(int, android.graphics.Bitmap):void");
    }

    public final void A01(Canvas canvas, AnonymousClass7OK r10) {
        int i = r10.A02;
        int i2 = r10.A03;
        canvas.drawRect((float) i, (float) i2, (float) (i + r10.A01), (float) (i2 + r10.A00), this.A00);
    }

    public final boolean A03(AnonymousClass7OK r4) {
        if (r4.A02 == 0 && r4.A03 == 0) {
            int i = r4.A01;
            Rect rect = this.A01.A05;
            if (i == rect.width() && r4.A00 == rect.height()) {
                return true;
            }
            return false;
        }
        return false;
    }

    public C152947aQ(C158637kJ r3, C180398ky r4, boolean z) {
        this.A01 = r3;
        this.A02 = r4;
        this.A03 = z;
        Paint paint = new Paint();
        this.A00 = paint;
        C86604Kt.A0u(0, paint);
        C86634Kw.A18(paint, PorterDuff.Mode.SRC);
    }
}
