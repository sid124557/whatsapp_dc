package X;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.4XW  reason: invalid class name */
public abstract class AnonymousClass4XW extends C04580Ov {
    public final Rect A00 = AnonymousClass001.A0N();
    public final Drawable A01;

    public abstract boolean A04(int i, int i2);

    public AnonymousClass4XW(Drawable drawable) {
        this.A01 = drawable;
    }

    public void A01(Canvas canvas, AnonymousClass0Q1 r11, RecyclerView recyclerView) {
        int width;
        int i;
        View childAt;
        canvas.save();
        if (recyclerView.A0d) {
            i = recyclerView.getPaddingLeft();
            width = AnonymousClass001.A0I(recyclerView);
            canvas.clipRect(i, recyclerView.getPaddingTop(), width, AnonymousClass001.A0H(recyclerView));
        } else {
            width = recyclerView.getWidth();
            i = 0;
        }
        int childCount = recyclerView.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt2 = recyclerView.getChildAt(i2);
            if (i2 == childCount - 1) {
                childAt = null;
            } else {
                childAt = recyclerView.getChildAt(i2 + 1);
            }
            if (A04(recyclerView.A0N.getItemViewType(RecyclerView.A00(childAt2)), recyclerView.A0N.getItemViewType(RecyclerView.A00(childAt)))) {
                Rect rect = this.A00;
                RecyclerView.A05(childAt2, rect);
                int round = rect.bottom + Math.round(childAt2.getTranslationY());
                Drawable drawable = this.A01;
                drawable.setBounds(i, AnonymousClass4L0.A02(drawable, round), width, round);
                drawable.draw(canvas);
            }
        }
        canvas.restore();
    }

    public void A03(Rect rect, View view, AnonymousClass0Q1 r7, RecyclerView recyclerView) {
        int A002 = RecyclerView.A00(view);
        if (A04(recyclerView.A0N.getItemViewType(A002), recyclerView.A0N.getItemViewType(A002 + 1))) {
            rect.set(0, 0, 0, this.A01.getIntrinsicHeight());
        } else {
            rect.setEmpty();
        }
    }
}
