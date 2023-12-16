package X;

import android.view.View;
import android.view.ViewGroup;

/* renamed from: X.0wS  reason: invalid class name and case insensitive filesystem */
public class C17920wS implements C16970uK {
    public Object A00;
    public final int A01;

    public C17920wS(C06440Xs r1, int i) {
        this.A01 = i;
        this.A00 = r1;
    }

    public int B5S(View view) {
        int right;
        int i;
        int i2 = this.A01;
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

    public int B5T(View view) {
        int left;
        int i;
        int i2 = this.A01;
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
}
