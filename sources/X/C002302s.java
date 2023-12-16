package X;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import com.whatsapp.R;

/* renamed from: X.02s  reason: invalid class name and case insensitive filesystem */
public class C002302s extends ViewGroup implements C16690to {
    public int A00;
    public Matrix A01;
    public View A02;
    public ViewGroup A03;
    public final View A04;
    public final ViewTreeObserver.OnPreDrawListener A05 = new C07260aa(this);

    public static void A00(View view, View view2) {
        int left = view2.getLeft();
        int top = view2.getTop();
        int left2 = view2.getLeft() + view.getWidth();
        int top2 = view2.getTop() + view.getHeight();
        AnonymousClass0VZ.A02.A06(view2, left, top, left2, top2);
    }

    public void onDraw(Canvas canvas) {
        AnonymousClass0K0.A00(canvas, true);
        canvas.setMatrix(this.A01);
        View view = this.A04;
        C04720Qj r1 = AnonymousClass0VZ.A02;
        r1.A05(view, 0);
        view.invalidate();
        r1.A05(view, 4);
        drawChild(canvas, view, getDrawingTime());
        AnonymousClass0K0.A00(canvas, false);
    }

    public void Bjt(View view, ViewGroup viewGroup) {
        this.A03 = viewGroup;
        this.A02 = view;
    }

    public void onDetachedFromWindow() {
        View view = this.A04;
        view.getViewTreeObserver().removeOnPreDrawListener(this.A05);
        AnonymousClass0VZ.A02.A05(view, 0);
        setGhostView(view, (C002302s) null);
        if (view.getParent() != null) {
            ((View) view.getParent()).invalidate();
        }
        super.onDetachedFromWindow();
    }

    public C002302s(View view) {
        super(view.getContext());
        this.A04 = view;
        setWillNotDraw(false);
        setClipChildren(false);
        setLayerType(2, (Paint) null);
    }

    public static void setGhostView(View view, C002302s r2) {
        view.setTag(R.id.ghost_view, r2);
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        View view = this.A04;
        setGhostView(view, this);
        view.getViewTreeObserver().addOnPreDrawListener(this.A05);
        AnonymousClass0VZ.A02.A05(view, 4);
        if (view.getParent() != null) {
            ((View) view.getParent()).invalidate();
        }
    }

    public void setVisibility(int i) {
        super.setVisibility(i);
        View view = this.A04;
        if (view.getTag(R.id.ghost_view) == this) {
            int i2 = 0;
            if (i == 0) {
                i2 = 4;
            }
            AnonymousClass0VZ.A02.A05(view, i2);
        }
    }

    public void setMatrix(Matrix matrix) {
        this.A01 = matrix;
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }
}
