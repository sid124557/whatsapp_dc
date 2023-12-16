package X;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: X.02g  reason: invalid class name and case insensitive filesystem */
public class C002102g extends ViewGroup.MarginLayoutParams {
    public C05570Ua A00;
    public boolean A01 = true;
    public boolean A02 = false;
    public final Rect A03 = AnonymousClass001.A0N();

    public int A01() {
        return AnonymousClass001.A0J(this.A00);
    }

    public C002102g(int i, int i2) {
        super(i, i2);
    }

    public static Rect A00(View view) {
        return ((C002102g) view.getLayoutParams()).A03;
    }

    public C002102g(C002102g r2) {
        super(r2);
    }

    public C002102g(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
    }

    public C002102g(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public C002102g(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
    }
}
