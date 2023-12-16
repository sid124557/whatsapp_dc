package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.util.AttributeSet;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.R;

/* renamed from: X.4XY  reason: invalid class name */
public class AnonymousClass4XY extends C04580Ov {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public Drawable A04;
    public boolean A05;
    public final Rect A06 = AnonymousClass001.A0N();

    public AnonymousClass4XY(Context context) {
        TypedArray A002 = C161837qd.A00(context, (AttributeSet) null, C1463179t.A0N, new int[0], R.attr.f3nameremoved, R.style.f12nameremoved);
        this.A00 = C160917of.A00(context, A002, 0).getDefaultColor();
        this.A03 = C86634Kw.A05(context.getResources(), A002, R.dimen.f6nameremoved, 3);
        this.A02 = A002.getDimensionPixelOffset(2, 0);
        this.A01 = A002.getDimensionPixelOffset(1, 0);
        this.A05 = A002.getBoolean(4, true);
        A002.recycle();
        ShapeDrawable shapeDrawable = new ShapeDrawable();
        this.A04 = shapeDrawable;
        int i = this.A00;
        this.A00 = i;
        Drawable A012 = C06130Wj.A01(shapeDrawable);
        this.A04 = A012;
        AnonymousClass0YG.A06(A012, i);
    }

    public void A03(Rect rect, View view, AnonymousClass0Q1 r6, RecyclerView recyclerView) {
        rect.set(0, 0, 0, 0);
        int A002 = RecyclerView.A00(view);
        AnonymousClass0R6 r0 = recyclerView.A0N;
        boolean z = true;
        if (r0 == null || A002 != r0.A0G() - 1) {
            z = false;
        }
        if (A002 == -1) {
            return;
        }
        if (!z || this.A05) {
            rect.bottom = this.A03;
        }
    }

    public void A01(Canvas canvas, AnonymousClass0Q1 r10, RecyclerView recyclerView) {
        int width;
        int i;
        int i2;
        int i3;
        if (recyclerView.getLayoutManager() != null) {
            canvas.save();
            if (recyclerView.A0d) {
                i = recyclerView.getPaddingLeft();
                width = AnonymousClass001.A0I(recyclerView);
                canvas.clipRect(i, recyclerView.getPaddingTop(), width, AnonymousClass001.A0H(recyclerView));
            } else {
                width = recyclerView.getWidth();
                i = 0;
            }
            boolean z = true;
            if (AnonymousClass0YH.A01(recyclerView) == 1) {
                i2 = this.A01;
            } else {
                z = false;
                i2 = this.A02;
            }
            int i4 = i + i2;
            if (z) {
                i3 = this.A02;
            } else {
                i3 = this.A01;
            }
            int i5 = width - i3;
            int childCount = recyclerView.getChildCount();
            for (int i6 = 0; i6 < childCount; i6++) {
                View childAt = recyclerView.getChildAt(i6);
                int A002 = RecyclerView.A00(childAt);
                AnonymousClass0R6 r0 = recyclerView.A0N;
                boolean z2 = true;
                if (r0 == null || A002 != r0.A0G() - 1) {
                    z2 = false;
                }
                if (A002 != -1 && (!z2 || this.A05)) {
                    Rect rect = this.A06;
                    RecyclerView.A05(childAt, rect);
                    int round = rect.bottom + Math.round(childAt.getTranslationY());
                    this.A04.setBounds(i4, round - this.A03, i5, round);
                    this.A04.draw(canvas);
                }
            }
            canvas.restore();
        }
    }
}
