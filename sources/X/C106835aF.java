package X;

import android.content.Context;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import android.text.Layout;
import android.text.TextUtils;
import com.whatsapp.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: X.5aF  reason: invalid class name and case insensitive filesystem */
public class C106835aF {
    public static List A00(Context context, Layout layout, float f) {
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.f6nameremoved);
        float f2 = (float) dimensionPixelSize;
        float dimensionPixelSize2 = (float) context.getResources().getDimensionPixelSize(R.dimen.f6nameremoved);
        return A03(A02(layout), f2, f2, dimensionPixelSize2, dimensionPixelSize2, f);
    }

    public static List A01(Context context, Layout layout, float f) {
        return A03(A02(layout), (float) context.getResources().getDimensionPixelSize(R.dimen.f6nameremoved), (float) context.getResources().getDimensionPixelSize(R.dimen.f6nameremoved), (float) context.getResources().getDimensionPixelSize(R.dimen.f6nameremoved), (float) context.getResources().getDimensionPixelSize(R.dimen.f6nameremoved), f);
    }

    public static List A02(Layout layout) {
        ArrayList A0s = AnonymousClass001.A0s();
        ArrayList A0s2 = AnonymousClass001.A0s();
        for (int i = 0; i < layout.getLineCount(); i++) {
            RectF A09 = AnonymousClass4L0.A09(layout.getLineLeft(i), (float) layout.getLineTop(i), layout.getLineRight(i), (float) layout.getLineBottom(i));
            String charSequence = layout.getText().subSequence(layout.getLineStart(i), layout.getLineEnd(i)).toString();
            if (A09.width() > 0.0f && !TextUtils.isEmpty(charSequence.replace("\n", ""))) {
                A0s2.add(A09);
            } else if (!A0s2.isEmpty()) {
                A0s.add(A0s2);
                A0s2 = AnonymousClass001.A0s();
            }
        }
        if (!A0s2.isEmpty()) {
            A0s.add(A0s2);
        }
        return A0s;
    }

    public static List A03(List list, float f, float f2, float f3, float f4, float f5) {
        ArrayList A0s = AnonymousClass001.A0s();
        for (int i = 0; i < list.size(); i++) {
            List list2 = (List) list.get(i);
            Path A06 = AnonymousClass002.A06();
            A0s.add(A06);
            int size = list2.size();
            int i2 = size * 2;
            PointF[] pointFArr = new PointF[i2];
            PointF[] pointFArr2 = new PointF[i2];
            for (int i3 = 0; i3 <= size - 1; i3++) {
                RectF rectF = (RectF) list2.get(i3);
                int i4 = i3 * 2;
                int i5 = i4 + 1;
                pointFArr2[i4] = AnonymousClass4L0.A08(rectF.right + f2, rectF.top - f3);
                pointFArr2[i5] = AnonymousClass4L0.A08(rectF.right + f2, rectF.bottom + f4);
                pointFArr[i4] = AnonymousClass4L0.A08(rectF.left - f, rectF.top - f3);
                pointFArr[i5] = AnonymousClass4L0.A08(rectF.left - f, rectF.bottom + f4);
            }
            for (int i6 = 1; i6 < pointFArr2.length; i6++) {
                PointF pointF = pointFArr2[i6];
                PointF pointF2 = pointFArr2[i6 - 1];
                float f6 = pointF.x;
                float f7 = pointF2.x;
                if (f6 > f7) {
                    pointF2.y = pointF.y;
                } else if (f6 < f7) {
                    pointF.y = pointF2.y;
                }
            }
            for (int i7 = 1; i7 < pointFArr.length; i7++) {
                PointF pointF3 = pointFArr[i7];
                PointF pointF4 = pointFArr[i7 - 1];
                float f8 = pointF3.x;
                float f9 = pointF4.x;
                if (f8 > f9) {
                    pointF3.y = pointF4.y;
                } else if (f8 < f9) {
                    pointF4.y = pointF3.y;
                }
            }
            float f10 = f5;
            List A04 = A04(pointFArr2, f10, true);
            List A042 = A04(pointFArr, f10, false);
            A06.moveTo(((PointF) A04.get(0)).x, ((PointF) A04.get(0)).y);
            for (int i8 = 1; i8 < A04.size(); i8++) {
                C86614Ku.A1A(A06, A04, i8);
            }
            for (int A043 = AnonymousClass002.A04(A042, 1); A043 >= 0; A043--) {
                C86614Ku.A1A(A06, A042, A043);
            }
            A06.close();
        }
        return A0s;
    }

    public static List A04(PointF[] pointFArr, float f, boolean z) {
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
