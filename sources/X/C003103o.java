package X;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.ToggleButton;

/* renamed from: X.03o  reason: invalid class name and case insensitive filesystem */
public class C003103o extends ToggleButton implements C15000qc {
    public final C04780Qq A00;
    public final AnonymousClass0WJ A01;

    public ColorStateList getSupportBackgroundTintList() {
        C04780Qq r0 = this.A00;
        if (r0 != null) {
            return C04780Qq.A00(r0);
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C04780Qq r0 = this.A00;
        if (r0 != null) {
            return C04780Qq.A01(r0);
        }
        return null;
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C04780Qq r0 = this.A00;
        if (r0 != null) {
            r0.A05(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C04780Qq r0 = this.A00;
        if (r0 != null) {
            r0.A06(mode);
        }
    }

    public C003103o(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 16842827);
        AnonymousClass0XB.A04(this);
        C04780Qq r0 = new C04780Qq(this);
        this.A00 = r0;
        r0.A07(attributeSet, 16842827);
        AnonymousClass0WJ r02 = new AnonymousClass0WJ(this);
        this.A01 = r02;
        r02.A0B(attributeSet, 16842827);
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        C04780Qq r0 = this.A00;
        if (r0 != null) {
            r0.A02();
        }
        AnonymousClass0WJ r02 = this.A01;
        if (r02 != null) {
            r02.A03();
        }
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C04780Qq r0 = this.A00;
        if (r0 != null) {
            r0.A03();
        }
    }

    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C04780Qq r0 = this.A00;
        if (r0 != null) {
            r0.A04(i);
        }
    }
}
