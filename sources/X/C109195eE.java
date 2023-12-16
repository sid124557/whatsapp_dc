package X;

import android.graphics.Canvas;
import android.graphics.CornerPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import android.text.Layout;
import android.text.TextUtils;
import android.text.style.LineBackgroundSpan;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: X.5eE  reason: invalid class name and case insensitive filesystem */
public class C109195eE implements LineBackgroundSpan {
    public final Paint A00;
    public final List A01;

    public void drawBackground(Canvas canvas, Paint paint, int i, int i2, int i3, int i4, int i5, CharSequence charSequence, int i6, int i7, int i8) {
        for (Path drawPath : this.A01) {
            canvas.drawPath(drawPath, this.A00);
        }
    }

    public C109195eE(Layout layout, float f, float f2, float f3, float f4, float f5, int i) {
        ArrayList A0s = AnonymousClass001.A0s();
        ArrayList A0s2 = AnonymousClass001.A0s();
        int i2 = 0;
        while (true) {
            Layout layout2 = layout;
            if (i2 >= layout2.getLineCount()) {
                break;
            }
            RectF A09 = AnonymousClass4L0.A09(layout2.getLineLeft(i2), (float) layout2.getLineTop(i2), layout2.getLineRight(i2), (float) layout2.getLineBottom(i2));
            String charSequence = layout2.getText().subSequence(layout2.getLineStart(i2), layout2.getLineEnd(i2)).toString();
            if (A09.width() > 0.0f && !TextUtils.isEmpty(charSequence.replace("\n", ""))) {
                A0s2.add(A09);
            } else if (!A0s2.isEmpty()) {
                A0s.add(A0s2);
                A0s2 = AnonymousClass001.A0s();
            }
            i2++;
        }
        if (!A0s2.isEmpty()) {
            A0s.add(A0s2);
        }
        ArrayList A0s3 = AnonymousClass001.A0s();
        int i3 = 0;
        while (true) {
            float f6 = f5;
            if (i3 < A0s.size()) {
                List list = (List) A0s.get(i3);
                Path A06 = AnonymousClass002.A06();
                A0s3.add(A06);
                int size = list.size();
                int i4 = size * 2;
                PointF[] pointFArr = new PointF[i4];
                PointF[] pointFArr2 = new PointF[i4];
                for (int i5 = 0; i5 <= size - 1; i5++) {
                    RectF rectF = (RectF) list.get(i5);
                    int i6 = i5 * 2;
                    int i7 = i6 + 1;
                    pointFArr2[i6] = AnonymousClass4L0.A08(rectF.right + f2, rectF.top - f3);
                    pointFArr2[i7] = AnonymousClass4L0.A08(rectF.right + f2, rectF.bottom + f4);
                    pointFArr[i6] = AnonymousClass4L0.A08(rectF.left - f, rectF.top - f3);
                    pointFArr[i7] = AnonymousClass4L0.A08(rectF.left - f, rectF.bottom + f4);
                }
                for (int i8 = 1; i8 < pointFArr2.length; i8++) {
                    PointF pointF = pointFArr2[i8];
                    PointF pointF2 = pointFArr2[i8 - 1];
                    float f7 = pointF.x;
                    float f8 = pointF2.x;
                    if (f7 > f8) {
                        pointF2.y = pointF.y;
                    } else if (f7 < f8) {
                        pointF.y = pointF2.y;
                    }
                }
                for (int i9 = 1; i9 < pointFArr.length; i9++) {
                    PointF pointF3 = pointFArr[i9];
                    PointF pointF4 = pointFArr[i9 - 1];
                    float f9 = pointF3.x;
                    float f10 = pointF4.x;
                    if (f9 > f10) {
                        pointF3.y = pointF4.y;
                    } else if (f9 < f10) {
                        pointF4.y = pointF3.y;
                    }
                }
                List A002 = A00(pointFArr2, f6, true);
                List A003 = A00(pointFArr, f6, false);
                A06.moveTo(((PointF) A002.get(0)).x, ((PointF) A002.get(0)).y);
                for (int i10 = 1; i10 < A002.size(); i10++) {
                    C86614Ku.A1A(A06, A002, i10);
                }
                for (int A04 = AnonymousClass002.A04(A003, 1); A04 >= 0; A04--) {
                    C86614Ku.A1A(A06, A003, A04);
                }
                A06.close();
                i3++;
            } else {
                this.A01 = A0s3;
                Paint A0B = C86604Kt.A0B();
                this.A00 = A0B;
                A0B.setColor(i);
                A0B.setStyle(Paint.Style.FILL_AND_STROKE);
                A0B.setPathEffect(new CornerPathEffect(f6));
                return;
            }
        }
    }

    public static List A00(PointF[] pointFArr, float f, boolean z) {
        float min;
        ArrayList A0s = AnonymousClass001.A0s();
        Collections.addAll(A0s, pointFArr);
        int i = 0;
        while (i < (A0s.size() / 2) - 1) {
            int i2 = i * 2;
            PointF pointF = (PointF) A0s.get(i2);
            PointF pointF2 = (PointF) A0s.get(i2 + 1);
            PointF pointF3 = (PointF) A0s.get(i2 + 2);
            PointF pointF4 = (PointF) A0s.get(i2 + 3);
            if (AnonymousClass002.A00(pointF2.x, pointF3.x) < f) {
                A0s.remove(pointF2);
                A0s.remove(pointF3);
                float f2 = pointF.x;
                float f3 = pointF4.x;
                if (z) {
                    min = Math.max(f2, f3);
                } else {
                    min = Math.min(f2, f3);
                }
                pointF4.x = min;
                pointF.x = min;
                i--;
            }
            i++;
        }
        return A0s;
    }
}
