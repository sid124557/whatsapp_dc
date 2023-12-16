package X;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: X.0vq  reason: invalid class name and case insensitive filesystem */
public class C17600vq extends C05590Uc {
    public final int A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C17600vq(C06440Xs r1, int i) {
        super(r1);
        this.A00 = i;
    }

    public int A01() {
        int i = this.A00;
        C06440Xs r0 = this.A02;
        if (i != 0) {
            return r0.A00;
        }
        return r0.A03;
    }

    public int A02() {
        int i;
        int A0C;
        int i2 = this.A00;
        C06440Xs r0 = this.A02;
        if (i2 != 0) {
            i = r0.A00;
            A0C = r0.A0A();
        } else {
            i = r0.A03;
            A0C = r0.A0C();
        }
        return i - A0C;
    }

    public int A03() {
        int i = this.A00;
        C06440Xs r0 = this.A02;
        if (i != 0) {
            return r0.A01;
        }
        return r0.A04;
    }

    public int A04() {
        int i = this.A00;
        C06440Xs r0 = this.A02;
        if (i != 0) {
            return r0.A0D();
        }
        return r0.A0B();
    }

    public int A05() {
        int A0B;
        int A0C;
        int i = this.A00;
        C06440Xs r2 = this.A02;
        if (i != 0) {
            A0B = r2.A00 - r2.A0D();
            A0C = r2.A0A();
        } else {
            A0B = r2.A03 - r2.A0B();
            A0C = r2.A0C();
        }
        return A0B - A0C;
    }

    public int A06(View view) {
        int right;
        int i;
        int i2 = this.A00;
        ViewGroup.MarginLayoutParams A0T = AnonymousClass001.A0T(view);
        if (i2 != 0) {
            right = view.getBottom() + C002102g.A00(view).bottom;
            i = A0T.bottomMargin;
        } else {
            right = view.getRight() + C002102g.A00(view).right;
            i = A0T.rightMargin;
        }
        return right + i;
    }

    public int A07(View view) {
        int measuredWidth;
        int i;
        int i2 = this.A00;
        ViewGroup.MarginLayoutParams A0T = AnonymousClass001.A0T(view);
        Rect A002 = C002102g.A00(view);
        if (i2 != 0) {
            measuredWidth = view.getMeasuredHeight() + A002.top + A002.bottom + A0T.topMargin;
            i = A0T.bottomMargin;
        } else {
            measuredWidth = view.getMeasuredWidth() + A002.left + A002.right + A0T.leftMargin;
            i = A0T.rightMargin;
        }
        return measuredWidth + i;
    }

    public int A08(View view) {
        int measuredHeight;
        int i;
        int i2 = this.A00;
        ViewGroup.MarginLayoutParams A0T = AnonymousClass001.A0T(view);
        Rect A002 = C002102g.A00(view);
        if (i2 != 0) {
            measuredHeight = view.getMeasuredWidth() + A002.left + A002.right + A0T.leftMargin;
            i = A0T.rightMargin;
        } else {
            measuredHeight = view.getMeasuredHeight() + A002.top + A002.bottom + A0T.topMargin;
            i = A0T.bottomMargin;
        }
        return measuredHeight + i;
    }

    public int A09(View view) {
        int left;
        int i;
        int i2 = this.A00;
        ViewGroup.MarginLayoutParams A0T = AnonymousClass001.A0T(view);
        if (i2 != 0) {
            left = view.getTop() - C002102g.A00(view).top;
            i = A0T.topMargin;
        } else {
            left = view.getLeft() - C002102g.A00(view).left;
            i = A0T.leftMargin;
        }
        return left - i;
    }

    public int A0A(View view) {
        int i = this.A00;
        C06440Xs r1 = this.A02;
        Rect rect = this.A01;
        if (i != 0) {
            r1.A0d(rect, view);
            return rect.bottom;
        }
        r1.A0d(rect, view);
        return rect.right;
    }

    public int A0B(View view) {
        int i = this.A00;
        C06440Xs r1 = this.A02;
        Rect rect = this.A01;
        if (i != 0) {
            r1.A0d(rect, view);
            return rect.top;
        }
        r1.A0d(rect, view);
        return rect.left;
    }

    public void A0C(int i) {
        int i2 = this.A00;
        C06440Xs r0 = this.A02;
        if (i2 != 0) {
            r0.A0X(i);
        } else {
            r0.A0W(i);
        }
    }
}
