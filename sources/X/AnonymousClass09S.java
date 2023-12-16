package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.09S  reason: invalid class name */
public class AnonymousClass09S extends C04580Ov {
    public static final int[] A02 = {16843284};
    public Drawable A00;
    public final Rect A01 = AnonymousClass001.A0N();

    public void A03(Rect rect, View view, AnonymousClass0Q1 r5, RecyclerView recyclerView) {
        Drawable drawable = this.A00;
        if (drawable == null) {
            rect.set(0, 0, 0, 0);
        } else {
            rect.set(0, 0, 0, drawable.getIntrinsicHeight());
        }
    }

    public AnonymousClass09S(Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(A02);
        Drawable drawable = obtainStyledAttributes.getDrawable(0);
        this.A00 = drawable;
        if (drawable == null) {
            Log.w("DividerItem", "@android:attr/listDivider was not set in the theme used for this DividerItemDecoration. Please set that attribute all call setDrawable()");
        }
        obtainStyledAttributes.recycle();
    }

    public void A01(Canvas canvas, AnonymousClass0Q1 r9, RecyclerView recyclerView) {
        int width;
        int i;
        if (recyclerView.getLayoutManager() != null && this.A00 != null) {
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
                View childAt = recyclerView.getChildAt(i2);
                Rect rect = this.A01;
                RecyclerView.A05(childAt, rect);
                int round = rect.bottom + Math.round(childAt.getTranslationY());
                this.A00.setBounds(i, round - this.A00.getIntrinsicHeight(), width, round);
                this.A00.draw(canvas);
            }
            canvas.restore();
        }
    }
}
