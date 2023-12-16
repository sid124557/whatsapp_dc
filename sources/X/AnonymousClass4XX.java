package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.4XX  reason: invalid class name */
public class AnonymousClass4XX extends C04580Ov {
    public final int A00;
    public final int A01;
    public final Paint A02;
    public final AnonymousClass4XH A03;

    public final boolean A04(View view) {
        int i;
        if (view != null) {
            int A002 = RecyclerView.A00(view);
            AnonymousClass4XH r1 = this.A03;
            if (A002 != -1) {
                C118295tJ r2 = r1.A0z;
                if (Integer.valueOf(r2.A00(A002)) != null && (i = A002 + 1) > 0 && i < r2.size()) {
                    int A003 = r2.A00(i);
                    if (Integer.valueOf(A003) == null) {
                        return false;
                    }
                    if (A003 == 22 || A003 == 23 || A003 == 100) {
                        return true;
                    }
                    return false;
                }
            }
        }
        return false;
    }

    public void A01(Canvas canvas, AnonymousClass0Q1 r16, RecyclerView recyclerView) {
        RecyclerView recyclerView2 = recyclerView;
        int childCount = recyclerView2.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = recyclerView2.getChildAt(i);
            if (A04(childAt)) {
                int bottom = childAt.getBottom() + AnonymousClass001.A0T(childAt).bottomMargin;
                int left = recyclerView2.getLeft();
                int width = recyclerView2.getWidth();
                Paint paint = this.A02;
                paint.setColor(this.A00);
                canvas.drawRect((float) left, (float) bottom, (float) width, (float) (this.A01 + bottom), paint);
            }
        }
    }

    public AnonymousClass4XX(AnonymousClass4XH r3, int i, int i2) {
        this.A03 = r3;
        this.A01 = i2;
        this.A00 = i;
        Paint A0Z = C86664Kz.A0Z();
        this.A02 = A0Z;
        A0Z.setAntiAlias(true);
    }

    public void A03(Rect rect, View view, AnonymousClass0Q1 r4, RecyclerView recyclerView) {
        if (A04(view)) {
            rect.bottom = this.A01;
        }
    }
}
