package X;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.google.android.material.tabs.TabLayout;

/* renamed from: X.5WN  reason: invalid class name */
public class AnonymousClass5WN {
    public static RectF A00(View view, TabLayout tabLayout) {
        float left;
        float top;
        float right;
        float bottom;
        if (view == null) {
            return AnonymousClass002.A07();
        }
        if (tabLayout.A0Y || !(view instanceof AnonymousClass4Qc)) {
            left = (float) view.getLeft();
            top = (float) view.getTop();
            right = (float) view.getRight();
            bottom = (float) view.getBottom();
        } else {
            AnonymousClass4Qc r5 = (AnonymousClass4Qc) view;
            int contentWidth = r5.getContentWidth();
            int contentHeight = r5.getContentHeight();
            int A00 = (int) C159337lf.A00(r5.getContext(), 24);
            if (contentWidth < A00) {
                contentWidth = A00;
            }
            int left2 = (r5.getLeft() + r5.getRight()) / 2;
            int top2 = (r5.getTop() + r5.getBottom()) / 2;
            int i = contentWidth / 2;
            int i2 = left2 - i;
            int i3 = i + left2;
            left = (float) i2;
            top = (float) (top2 - (contentHeight / 2));
            right = (float) i3;
            bottom = (float) (top2 + (left2 / 2));
        }
        return AnonymousClass4L0.A09(left, top, right, bottom);
    }

    public void A01(Drawable drawable, View view, View view2, TabLayout tabLayout, float f) {
        float sin;
        double cos;
        float f2 = f;
        if (this instanceof C88714ad) {
            RectF A00 = A00(view, tabLayout);
            RectF A002 = A00(view2, tabLayout);
            float f3 = A00.left;
            float f4 = A002.left;
            double d = (((double) f2) * 3.141592653589793d) / 2.0d;
            if (f3 < f4) {
                sin = (float) (1.0d - Math.cos(d));
                cos = Math.sin(d);
            } else {
                sin = (float) Math.sin(d);
                cos = 1.0d - Math.cos(d);
            }
            int i = (int) f3;
            int A07 = i + AnonymousClass001.A07(sin, (float) (((int) f4) - i));
            int i2 = drawable.getBounds().top;
            int i3 = (int) A00.right;
            drawable.setBounds(A07, i2, i3 + AnonymousClass001.A07((float) cos, (float) (((int) A002.right) - i3)), drawable.getBounds().bottom);
            return;
        }
        RectF A003 = A00(view, tabLayout);
        RectF A004 = A00(view2, tabLayout);
        int i4 = (int) A003.left;
        int A072 = i4 + AnonymousClass001.A07(f2, (float) (((int) A004.left) - i4));
        int i5 = drawable.getBounds().top;
        int i6 = (int) A003.right;
        drawable.setBounds(A072, i5, i6 + AnonymousClass001.A07(f2, (float) (((int) A004.right) - i6)), drawable.getBounds().bottom);
    }
}
