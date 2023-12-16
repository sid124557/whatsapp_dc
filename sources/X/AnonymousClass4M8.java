package X;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.view.View;

/* renamed from: X.4M8  reason: invalid class name */
public final class AnonymousClass4M8 extends InsetDrawable {
    public int A00;
    public final Drawable A01;

    public void setTint(int i) {
        AnonymousClass0YG.A06(this.A01, i);
    }

    public void setTintList(ColorStateList colorStateList) {
        AnonymousClass0YG.A01(colorStateList, this.A01);
    }

    public void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.A01;
        if (mode == null) {
            mode = PorterDuff.Mode.SRC_IN;
        }
        AnonymousClass0YG.A04(mode, drawable);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass4M8(android.graphics.drawable.Drawable r3) {
        /*
            r2 = this;
            android.graphics.drawable.Drawable r1 = X.C06130Wj.A01(r3)
            r0 = 0
            r2.<init>(r1, r0)
            r2.A01 = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4M8.<init>(android.graphics.drawable.Drawable):void");
    }

    public static void A00(Drawable drawable, View view) {
        int paddingLeft = view.getPaddingLeft();
        int paddingRight = view.getPaddingRight();
        view.setBackground(drawable);
        view.setPadding(paddingLeft, 0, paddingRight, 0);
    }

    public void draw(Canvas canvas) {
        Rect bounds = getBounds();
        Drawable drawable = this.A01;
        drawable.setBounds(bounds.left, bounds.top + this.A00, bounds.right, bounds.bottom);
        drawable.draw(canvas);
    }
}
