package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import java.util.Collections;
import java.util.List;

/* renamed from: X.6Ek  reason: invalid class name and case insensitive filesystem */
public final class C124916Ek extends View implements C180758la {
    public float A00 = 0.08f;
    public float A01 = 0.0533f;
    public C156877hM A02 = C156877hM.A06;
    public List A03 = Collections.emptyList();
    public final List A04 = AnonymousClass001.A0s();

    public void BrX(C156877hM r4, List list, float f, float f2, int i) {
        this.A03 = list;
        this.A02 = r4;
        this.A01 = f;
        this.A00 = f2;
        while (true) {
            List list2 = this.A04;
            if (list2.size() < list.size()) {
                list2.add(new AnonymousClass7QV(getContext()));
            } else {
                invalidate();
                return;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x009e, code lost:
        if (r4 != 2) goto L_0x00a0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x017f, code lost:
        if (r16 == false) goto L_0x049f;
     */
    /* JADX WARNING: Removed duplicated region for block: B:100:0x01f5  */
    /* JADX WARNING: Removed duplicated region for block: B:194:0x0490  */
    /* JADX WARNING: Removed duplicated region for block: B:198:0x04b5  */
    /* JADX WARNING: Removed duplicated region for block: B:203:0x04c5  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00b7  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x019e  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x01cb  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void dispatchDraw(android.graphics.Canvas r43) {
        /*
            r42 = this;
            r41 = r42
            r0 = r41
            java.util.List r0 = r0.A03
            r40 = r0
            boolean r0 = r40.isEmpty()
            if (r0 != 0) goto L_0x04db
            int r18 = r41.getHeight()
            int r20 = r41.getPaddingLeft()
            int r19 = r41.getPaddingTop()
            int r10 = r41.getWidth()
            int r0 = r41.getPaddingRight()
            int r10 = r10 - r0
            int r0 = r41.getPaddingBottom()
            int r14 = r18 - r0
            r0 = r19
            if (r14 <= r0) goto L_0x04db
            r0 = r20
            if (r10 <= r0) goto L_0x04db
            int r1 = r14 - r19
            r0 = r41
            float r9 = r0.A01
            r0 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            int r0 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r0 == 0) goto L_0x04db
            float r0 = (float) r1
            r21 = r0
            float r9 = r9 * r0
            r0 = 0
            int r0 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x04db
            int r22 = r40.size()
            r8 = 0
        L_0x004c:
            r0 = r22
            if (r8 >= r0) goto L_0x04db
            r0 = r40
            java.lang.Object r2 = r0.get(r8)
            X.7hc r2 = (X.C157037hc) r2
            int r0 = r2.A0A
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 == r1) goto L_0x0088
            X.7ip r4 = new X.7ip
            r4.<init>(r2)
            r0 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            r4.A02 = r0
            r4.A08 = r1
            r0 = 0
            r4.A0D = r0
            int r1 = r2.A07
            r3 = 0
            r5 = 1065353216(0x3f800000, float:1.0)
            float r0 = r2.A01
            if (r1 != 0) goto L_0x04d2
            float r5 = r5 - r0
            r4.A01 = r5
            r4.A07 = r3
        L_0x007b:
            int r1 = r2.A06
            r0 = 2
            if (r1 == 0) goto L_0x04ce
            if (r1 != r0) goto L_0x0084
            r4.A06 = r3
        L_0x0084:
            X.7hc r2 = r4.A00()
        L_0x0088:
            int r4 = r2.A09
            float r1 = r2.A05
            r0 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 == 0) goto L_0x00a0
            r0 = r21
            if (r4 == 0) goto L_0x04cb
            r3 = 1
            r0 = r18
            float r0 = (float) r0
            if (r4 == r3) goto L_0x04cb
            r0 = 2
            if (r4 == r0) goto L_0x00a3
        L_0x00a0:
            r1 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
        L_0x00a3:
            r0 = r41
            java.util.List r0 = r0.A04
            java.lang.Object r7 = r0.get(r8)
            X.7QV r7 = (X.AnonymousClass7QV) r7
            r0 = r41
            X.7hM r4 = r0.A02
            float r5 = r0.A00
            android.graphics.Bitmap r12 = r2.A0C
            if (r12 != 0) goto L_0x04c5
            r16 = 1
            java.lang.CharSequence r0 = r2.A0E
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x01f1
            boolean r0 = r2.A0F
            if (r0 == 0) goto L_0x04c1
            int r3 = r2.A0B
        L_0x00c7:
            java.lang.CharSequence r0 = r7.A0R
            java.lang.CharSequence r13 = r2.A0E
            r11 = r43
            if (r0 == r13) goto L_0x00d7
            if (r0 == 0) goto L_0x0225
            boolean r0 = r0.equals(r13)
            if (r0 == 0) goto L_0x0225
        L_0x00d7:
            android.text.Layout$Alignment r6 = r7.A0O
            android.text.Layout$Alignment r0 = r2.A0D
            boolean r0 = X.C162387ry.A0D(r6, r0)
            if (r0 == 0) goto L_0x0225
            android.graphics.Bitmap r0 = r7.A0M
            if (r0 != r12) goto L_0x0225
            float r6 = r7.A02
            float r0 = r2.A01
            int r0 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r0 != 0) goto L_0x0225
            int r6 = r7.A09
            int r0 = r2.A07
            if (r6 != r0) goto L_0x0225
            int r0 = r7.A08
            java.lang.Integer r6 = java.lang.Integer.valueOf(r0)
            int r0 = r2.A06
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            boolean r0 = X.C162387ry.A0D(r6, r0)
            if (r0 == 0) goto L_0x0225
            float r6 = r7.A03
            float r0 = r2.A02
            int r0 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r0 != 0) goto L_0x0225
            int r0 = r7.A0A
            java.lang.Integer r6 = java.lang.Integer.valueOf(r0)
            int r0 = r2.A08
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            boolean r0 = X.C162387ry.A0D(r6, r0)
            if (r0 == 0) goto L_0x0225
            float r6 = r7.A04
            float r0 = r2.A04
            int r0 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r0 != 0) goto L_0x0225
            float r6 = r7.A01
            float r0 = r2.A00
            int r0 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r0 != 0) goto L_0x0225
            int r6 = r7.A0D
            int r0 = r4.A03
            if (r6 != r0) goto L_0x0225
            int r6 = r7.A07
            int r0 = r4.A00
            if (r6 != r0) goto L_0x0225
            int r0 = r7.A0L
            if (r0 != r3) goto L_0x0225
            int r6 = r7.A0C
            int r0 = r4.A02
            if (r6 != r0) goto L_0x0225
            int r6 = r7.A0B
            int r0 = r4.A01
            if (r6 != r0) goto L_0x0225
            android.text.TextPaint r6 = r7.A0Z
            android.graphics.Typeface r15 = r6.getTypeface()
            android.graphics.Typeface r0 = r4.A05
            boolean r0 = X.C162387ry.A0D(r15, r0)
            if (r0 == 0) goto L_0x0225
            float r0 = r7.A06
            int r0 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1))
            if (r0 != 0) goto L_0x0225
            float r0 = r7.A05
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x0225
            float r0 = r7.A00
            int r0 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r0 != 0) goto L_0x0225
            int r15 = r7.A0F
            r0 = r20
            if (r15 != r0) goto L_0x0225
            int r15 = r7.A0H
            r0 = r19
            if (r15 != r0) goto L_0x0225
            int r0 = r7.A0G
            if (r0 != r10) goto L_0x0225
            int r0 = r7.A0E
            if (r0 != r14) goto L_0x0225
            if (r16 == 0) goto L_0x049f
        L_0x0181:
            android.text.StaticLayout r13 = r7.A0Q
            android.text.StaticLayout r12 = r7.A0P
            if (r13 == 0) goto L_0x01f1
            if (r12 == 0) goto L_0x01f1
            int r5 = r11.save()
            int r0 = r7.A0I
            float r1 = (float) r0
            int r0 = r7.A0K
            float r0 = (float) r0
            r11.translate(r1, r0)
            int r0 = r7.A0L
            int r0 = android.graphics.Color.alpha(r0)
            if (r0 <= 0) goto L_0x01c5
            android.graphics.Paint r3 = r7.A0Y
            int r0 = r7.A0L
            r3.setColor(r0)
            int r0 = r7.A0J
            int r0 = -r0
            float r2 = (float) r0
            r25 = 0
            int r1 = r13.getWidth()
            int r0 = r7.A0J
            int r1 = r1 + r0
            float r1 = (float) r1
            int r0 = r13.getHeight()
            float r0 = (float) r0
            r23 = r11
            r24 = r2
            r26 = r1
            r27 = r0
            r28 = r3
            r23.drawRect(r24, r25, r26, r27, r28)
        L_0x01c5:
            int r1 = r7.A0C
            r15 = 0
            r0 = 1
            if (r1 != r0) goto L_0x01f5
            android.graphics.Paint$Join r0 = android.graphics.Paint.Join.ROUND
            r6.setStrokeJoin(r0)
            float r0 = r7.A0S
            r6.setStrokeWidth(r0)
            int r0 = r7.A0B
            r6.setColor(r0)
            android.graphics.Paint$Style r0 = android.graphics.Paint.Style.FILL_AND_STROKE
            r6.setStyle(r0)
            r12.draw(r11)
        L_0x01e2:
            int r0 = r7.A0D
            X.C86604Kt.A0u(r0, r6)
            r13.draw(r11)
            r0 = 0
            r6.setShadowLayer(r0, r0, r0, r15)
            r11.restoreToCount(r5)
        L_0x01f1:
            int r8 = r8 + 1
            goto L_0x004c
        L_0x01f5:
            r0 = 2
            if (r1 != r0) goto L_0x0202
            float r2 = r7.A0U
            float r1 = r7.A0T
            int r0 = r7.A0B
            r6.setShadowLayer(r2, r1, r1, r0)
            goto L_0x01e2
        L_0x0202:
            r0 = 3
            if (r1 == r0) goto L_0x0221
            r0 = 4
            if (r1 != r0) goto L_0x01e2
            r4 = -1
            int r3 = r7.A0B
        L_0x020b:
            float r2 = r7.A0U
            r0 = 1073741824(0x40000000, float:2.0)
            float r1 = r2 / r0
            int r0 = r7.A0D
            X.C86604Kt.A0u(r0, r6)
            float r0 = -r1
            r6.setShadowLayer(r2, r0, r0, r3)
            r12.draw(r11)
            r6.setShadowLayer(r2, r1, r1, r4)
            goto L_0x01e2
        L_0x0221:
            r3 = -1
            int r4 = r7.A0B
            goto L_0x020b
        L_0x0225:
            r7.A0R = r13
            android.text.Layout$Alignment r0 = r2.A0D
            r7.A0O = r0
            r7.A0M = r12
            float r0 = r2.A01
            r7.A02 = r0
            int r0 = r2.A07
            r7.A09 = r0
            int r0 = r2.A06
            r7.A08 = r0
            float r0 = r2.A02
            r7.A03 = r0
            int r0 = r2.A08
            r7.A0A = r0
            float r0 = r2.A04
            r7.A04 = r0
            float r0 = r2.A00
            r7.A01 = r0
            int r0 = r4.A03
            r7.A0D = r0
            int r0 = r4.A00
            r7.A07 = r0
            r7.A0L = r3
            int r0 = r4.A02
            r7.A0C = r0
            int r0 = r4.A01
            r7.A0B = r0
            android.text.TextPaint r6 = r7.A0Z
            android.graphics.Typeface r0 = r4.A05
            r6.setTypeface(r0)
            r7.A06 = r9
            r7.A05 = r1
            r7.A00 = r5
            r0 = r20
            r7.A0F = r0
            r0 = r19
            r7.A0H = r0
            r7.A0G = r10
            r7.A0E = r14
            if (r16 == 0) goto L_0x0444
            java.lang.CharSequence r0 = r7.A0R
            r0.getClass()
            java.lang.CharSequence r1 = r7.A0R
            boolean r0 = r1 instanceof android.text.SpannableStringBuilder
            if (r0 == 0) goto L_0x03bc
            r12 = r1
            android.text.SpannableStringBuilder r12 = (android.text.SpannableStringBuilder) r12
        L_0x0284:
            int r5 = r7.A0G
            int r0 = r7.A0F
            int r5 = r5 - r0
            int r4 = r7.A0E
            int r0 = r7.A0H
            int r4 = r4 - r0
            float r0 = r7.A06
            r6.setTextSize(r0)
            float r0 = r7.A06
            r1 = 1040187392(0x3e000000, float:0.125)
            float r0 = r0 * r1
            r1 = 1056964608(0x3f000000, float:0.5)
            float r0 = r0 + r1
            int r0 = (int) r0
            r31 = r0
            int r30 = r0 * 2
            int r13 = r5 - r30
            float r1 = r7.A04
            r29 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            int r0 = (r1 > r29 ? 1 : (r1 == r29 ? 0 : -1))
            if (r0 == 0) goto L_0x02ae
            float r0 = (float) r13
            float r0 = r0 * r1
            int r13 = (int) r0
        L_0x02ae:
            java.lang.String r28 = "SubtitlePainter"
            if (r13 > 0) goto L_0x02bb
            java.lang.String r1 = "Skipped drawing subtitle cue (insufficient space)"
        L_0x02b4:
            r0 = r28
            android.util.Log.w(r0, r1)
            goto L_0x0181
        L_0x02bb:
            float r0 = r7.A05
            r27 = 0
            r3 = 0
            int r1 = (r0 > r27 ? 1 : (r0 == r27 ? 0 : -1))
            if (r1 <= 0) goto L_0x02d3
            int r0 = (int) r0
            android.text.style.AbsoluteSizeSpan r2 = new android.text.style.AbsoluteSizeSpan
            r2.<init>(r0)
            int r1 = r12.length()
            r0 = 16711680(0xff0000, float:2.3418052E-38)
            r12.setSpan(r2, r3, r1, r0)
        L_0x02d3:
            android.text.SpannableStringBuilder r2 = new android.text.SpannableStringBuilder
            r2.<init>(r12)
            int r1 = r7.A0C
            r0 = 1
            if (r1 != r0) goto L_0x02f9
            int r1 = r2.length()
            java.lang.Class<android.text.style.ForegroundColorSpan> r0 = android.text.style.ForegroundColorSpan.class
            java.lang.Object[] r1 = r2.getSpans(r3, r1, r0)
            android.text.style.ForegroundColorSpan[] r1 = (android.text.style.ForegroundColorSpan[]) r1
            int r0 = r1.length
            r16 = r0
            r15 = 0
        L_0x02ed:
            r0 = r16
            if (r15 >= r0) goto L_0x02f9
            r0 = r1[r15]
            r2.removeSpan(r0)
            int r15 = r15 + 1
            goto L_0x02ed
        L_0x02f9:
            int r0 = r7.A07
            int r0 = android.graphics.Color.alpha(r0)
            r1 = 2
            if (r0 <= 0) goto L_0x0318
            int r0 = r7.A0C
            if (r0 == 0) goto L_0x0363
            if (r0 == r1) goto L_0x0363
            int r0 = r7.A07
            android.text.style.BackgroundColorSpan r15 = new android.text.style.BackgroundColorSpan
            r15.<init>(r0)
            int r1 = r2.length()
            r0 = 16711680(0xff0000, float:2.3418052E-38)
            r2.setSpan(r15, r3, r1, r0)
        L_0x0318:
            android.text.Layout$Alignment r0 = r7.A0O
            r26 = r0
            if (r0 != 0) goto L_0x0320
            android.text.Layout$Alignment r26 = android.text.Layout.Alignment.ALIGN_CENTER
        L_0x0320:
            float r0 = r7.A0W
            r37 = r0
            float r0 = r7.A0V
            r38 = r0
            android.text.StaticLayout r0 = new android.text.StaticLayout
            r25 = 1
            r32 = r0
            r33 = r12
            r34 = r6
            r35 = r13
            r36 = r26
            r39 = r25
            r32.<init>(r33, r34, r35, r36, r37, r38, r39)
            r7.A0Q = r0
            int r24 = r0.getHeight()
            android.text.StaticLayout r0 = r7.A0Q
            int r23 = r0.getLineCount()
            r17 = 0
        L_0x0349:
            r0 = r23
            if (r3 >= r0) goto L_0x0374
            android.text.StaticLayout r0 = r7.A0Q
            float r0 = r0.getLineWidth(r3)
            double r0 = (double) r0
            r15 = r0
            double r15 = java.lang.Math.ceil(r15)
            int r15 = (int) r15
            r0 = r17
            int r17 = java.lang.Math.max(r15, r0)
            int r3 = r3 + 1
            goto L_0x0349
        L_0x0363:
            int r0 = r7.A07
            android.text.style.BackgroundColorSpan r15 = new android.text.style.BackgroundColorSpan
            r15.<init>(r0)
            int r1 = r12.length()
            r0 = 16711680(0xff0000, float:2.3418052E-38)
            r12.setSpan(r15, r3, r1, r0)
            goto L_0x0318
        L_0x0374:
            float r0 = r7.A04
            int r0 = (r0 > r29 ? 1 : (r0 == r29 ? 0 : -1))
            if (r0 == 0) goto L_0x03b9
            r0 = r17
            if (r0 >= r13) goto L_0x03b9
        L_0x037e:
            int r13 = r13 + r30
            float r1 = r7.A03
            int r0 = (r1 > r29 ? 1 : (r1 == r29 ? 0 : -1))
            if (r0 == 0) goto L_0x03b0
            float r0 = (float) r5
            int r3 = X.AnonymousClass001.A07(r0, r1)
            int r15 = r7.A0F
            int r3 = r3 + r15
            int r5 = r7.A0A
            r1 = 2
            r0 = r25
            if (r5 == r0) goto L_0x03ab
            if (r5 != r1) goto L_0x0398
            int r3 = r3 - r13
        L_0x0398:
            int r5 = java.lang.Math.max(r3, r15)
            int r13 = r13 + r5
            int r0 = r7.A0G
            int r35 = java.lang.Math.min(r13, r0)
        L_0x03a3:
            int r35 = r35 - r5
            if (r35 > 0) goto L_0x03c3
            java.lang.String r1 = "Skipped drawing subtitle cue (invalid horizontal positioning)"
            goto L_0x02b4
        L_0x03ab:
            int r3 = r3 * 2
            int r3 = r3 - r13
            int r3 = r3 / r1
            goto L_0x0398
        L_0x03b0:
            r1 = 2
            int r5 = r5 - r13
            int r5 = r5 / r1
            int r0 = r7.A0F
            int r5 = r5 + r0
            int r35 = r5 + r13
            goto L_0x03a3
        L_0x03b9:
            r13 = r17
            goto L_0x037e
        L_0x03bc:
            android.text.SpannableStringBuilder r12 = new android.text.SpannableStringBuilder
            r12.<init>(r1)
            goto L_0x0284
        L_0x03c3:
            float r3 = r7.A02
            int r0 = (r3 > r29 ? 1 : (r3 == r29 ? 0 : -1))
            if (r0 == 0) goto L_0x0439
            int r0 = r7.A09
            if (r0 != 0) goto L_0x040e
            float r0 = (float) r4
            int r3 = X.AnonymousClass001.A07(r0, r3)
            int r0 = r7.A0H
            int r3 = r3 + r0
            int r4 = r7.A08
            if (r4 == r1) goto L_0x0436
            r0 = r25
            if (r4 != r0) goto L_0x03e2
            int r3 = r3 * 2
            int r3 = r3 - r24
            int r3 = r3 / r1
        L_0x03e2:
            int r1 = r3 + r24
            int r0 = r7.A0E
            if (r1 <= r0) goto L_0x0408
            int r3 = r0 - r24
        L_0x03ea:
            android.text.StaticLayout r0 = new android.text.StaticLayout
            r32 = r0
            r32.<init>(r33, r34, r35, r36, r37, r38, r39)
            r7.A0Q = r0
            android.text.StaticLayout r0 = new android.text.StaticLayout
            r32 = r0
            r33 = r2
            r32.<init>(r33, r34, r35, r36, r37, r38, r39)
            r7.A0P = r0
            r7.A0I = r5
            r7.A0K = r3
            r0 = r31
            r7.A0J = r0
            goto L_0x0181
        L_0x0408:
            int r0 = r7.A0H
            if (r3 >= r0) goto L_0x03ea
            r3 = r0
            goto L_0x03ea
        L_0x040e:
            android.text.StaticLayout r0 = r7.A0Q
            r1 = 0
            int r3 = r0.getLineBottom(r1)
            android.text.StaticLayout r0 = r7.A0Q
            int r0 = r0.getLineTop(r1)
            int r3 = r3 - r0
            float r1 = r7.A02
            int r0 = (r1 > r27 ? 1 : (r1 == r27 ? 0 : -1))
            if (r0 < 0) goto L_0x042b
            float r0 = (float) r3
            int r3 = X.AnonymousClass001.A07(r1, r0)
            int r0 = r7.A0H
            int r3 = r3 + r0
            goto L_0x03e2
        L_0x042b:
            r0 = 1065353216(0x3f800000, float:1.0)
            float r1 = r1 + r0
            float r0 = (float) r3
            int r3 = X.AnonymousClass001.A07(r1, r0)
            int r0 = r7.A0E
            int r3 = r3 + r0
        L_0x0436:
            int r3 = r3 - r24
            goto L_0x03e2
        L_0x0439:
            int r3 = r7.A0E
            int r3 = r3 - r24
            float r1 = (float) r4
            float r0 = r7.A00
            float r1 = r1 * r0
            int r0 = (int) r1
            int r3 = r3 - r0
            goto L_0x03ea
        L_0x0444:
            android.graphics.Bitmap r0 = r7.A0M
            r0.getClass()
            android.graphics.Bitmap r6 = r7.A0M
            int r1 = r7.A0G
            int r0 = r7.A0F
            int r1 = r1 - r0
            int r5 = r7.A0E
            int r2 = r7.A0H
            int r5 = r5 - r2
            float r4 = (float) r0
            float r1 = (float) r1
            float r0 = r7.A03
            float r0 = r0 * r1
            float r4 = r4 + r0
            float r3 = (float) r2
            float r5 = (float) r5
            float r0 = r7.A02
            float r0 = r0 * r5
            float r3 = r3 + r0
            float r0 = r7.A04
            int r2 = X.AnonymousClass001.A07(r1, r0)
            float r1 = r7.A01
            r0 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 != 0) goto L_0x047c
            float r5 = (float) r2
            int r0 = r6.getHeight()
            float r1 = (float) r0
            int r0 = r6.getWidth()
            float r0 = (float) r0
            float r1 = r1 / r0
        L_0x047c:
            int r5 = X.AnonymousClass001.A07(r5, r1)
            int r0 = r7.A0A
            r6 = 1
            r1 = 2
            if (r0 != r1) goto L_0x04bb
            float r0 = (float) r2
        L_0x0487:
            float r4 = r4 - r0
        L_0x0488:
            int r4 = java.lang.Math.round(r4)
            int r0 = r7.A08
            if (r0 != r1) goto L_0x04b5
            float r0 = (float) r5
        L_0x0491:
            float r3 = r3 - r0
        L_0x0492:
            int r1 = java.lang.Math.round(r3)
            int r2 = r2 + r4
            int r5 = r5 + r1
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>(r4, r1, r2, r5)
            r7.A0N = r0
        L_0x049f:
            android.graphics.Rect r0 = r7.A0N
            r0.getClass()
            android.graphics.Bitmap r0 = r7.A0M
            r0.getClass()
            android.graphics.Bitmap r3 = r7.A0M
            android.graphics.Rect r2 = r7.A0N
            android.graphics.Paint r1 = r7.A0X
            r0 = 0
            r11.drawBitmap(r3, r0, r2, r1)
            goto L_0x01f1
        L_0x04b5:
            if (r0 != r6) goto L_0x0492
            int r0 = r5 / 2
            float r0 = (float) r0
            goto L_0x0491
        L_0x04bb:
            if (r0 != r6) goto L_0x0488
            int r0 = r2 / 2
            float r0 = (float) r0
            goto L_0x0487
        L_0x04c1:
            int r3 = r4.A04
            goto L_0x00c7
        L_0x04c5:
            r16 = 0
            r3 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            goto L_0x00c7
        L_0x04cb:
            float r1 = r1 * r0
            goto L_0x00a3
        L_0x04ce:
            r4.A06 = r0
            goto L_0x0084
        L_0x04d2:
            float r1 = -r0
            float r1 = r1 - r5
            r0 = 1
            r4.A01 = r1
            r4.A07 = r0
            goto L_0x007b
        L_0x04db:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C124916Ek.dispatchDraw(android.graphics.Canvas):void");
    }

    public C124916Ek(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
