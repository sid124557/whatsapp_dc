package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.R;

/* renamed from: X.6Hy  reason: invalid class name and case insensitive filesystem */
public class C125416Hy extends C04580Ov {
    public final int A00;
    public final int A01;
    public final int A02;
    public final Paint A03;

    public static final int A00(View view, RecyclerView recyclerView) {
        if (view != null) {
            int A002 = RecyclerView.A00(view);
            C125246Hb r4 = (C125246Hb) recyclerView.A0N;
            if (!(r4 == null || A002 == -1 || A002 == r4.A01.size() - 1)) {
                int i = A002 + 1;
                int itemViewType = r4.getItemViewType(A002);
                if (i > 0 && i < r4.A01.size() && r4.getItemViewType(i) == 0) {
                    return 1;
                }
                if (itemViewType == 2) {
                    return 2;
                }
            }
        }
        return 0;
    }

    public C125416Hy(int i, int i2, int i3) {
        this.A00 = i2;
        this.A02 = i3;
        this.A01 = i;
        Paint paint = new Paint();
        this.A03 = paint;
        paint.setAntiAlias(true);
    }

    public void A01(Canvas canvas, AnonymousClass0Q1 r13, RecyclerView recyclerView) {
        int i;
        int childCount = recyclerView.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = recyclerView.getChildAt(i2);
            int A002 = A00(childAt, recyclerView);
            if (A002 != 0) {
                int bottom = childAt.getBottom() + AnonymousClass001.A0T(childAt).bottomMargin;
                if (A002 != 1) {
                    i = this.A00;
                } else {
                    i = this.A02;
                }
                int i3 = i + bottom;
                int paddingLeft = recyclerView.getPaddingLeft() + recyclerView.getResources().getDimensionPixelSize(R.dimen.f6nameremoved);
                int width = recyclerView.getWidth() - recyclerView.getPaddingRight();
                if (A002 == 2) {
                    Paint paint = this.A03;
                    paint.setColor(this.A01);
                    float f = (float) i3;
                    canvas.drawRect((float) paddingLeft, (float) bottom, (float) width, f, paint);
                }
            }
        }
    }

    public void A03(Rect rect, View view, AnonymousClass0Q1 r5, RecyclerView recyclerView) {
        int i;
        int A002 = A00(view, recyclerView);
        if (A002 != 0) {
            if (A002 != 1) {
                i = this.A00;
            } else {
                i = this.A02;
            }
            rect.bottom = i;
        }
    }
}
