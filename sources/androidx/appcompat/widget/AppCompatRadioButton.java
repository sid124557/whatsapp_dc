package androidx.appcompat.widget;

import X.AnonymousClass0WJ;
import X.AnonymousClass0XB;
import X.AnonymousClass0XW;
import X.C04420Od;
import X.C04780Qq;
import X.C15000qc;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.RadioButton;
import com.whatsapp.R;

public class AppCompatRadioButton extends RadioButton implements C15000qc {
    public final C04780Qq A00;
    public final C04420Od A01;
    public final AnonymousClass0WJ A02;

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

    public ColorStateList getSupportButtonTintList() {
        C04420Od r0 = this.A01;
        if (r0 != null) {
            return r0.A00;
        }
        return null;
    }

    public PorterDuff.Mode getSupportButtonTintMode() {
        C04420Od r0 = this.A01;
        if (r0 != null) {
            return r0.A01;
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

    public void setSupportButtonTintList(ColorStateList colorStateList) {
        C04420Od r1 = this.A01;
        if (r1 != null) {
            r1.A00 = colorStateList;
            r1.A02 = true;
            r1.A00();
        }
    }

    public void setSupportButtonTintMode(PorterDuff.Mode mode) {
        C04420Od r1 = this.A01;
        if (r1 != null) {
            r1.A01 = mode;
            r1.A03 = true;
            r1.A00();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AppCompatRadioButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getResources();
        context.getResources();
        AnonymousClass0XB.A04(this);
        C04420Od r0 = new C04420Od(this);
        this.A01 = r0;
        r0.A01(attributeSet, i);
        C04780Qq r02 = new C04780Qq(this);
        this.A00 = r02;
        r02.A07(attributeSet, i);
        AnonymousClass0WJ r03 = new AnonymousClass0WJ(this);
        this.A02 = r03;
        r03.A0B(attributeSet, i);
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        C04780Qq r0 = this.A00;
        if (r0 != null) {
            r0.A02();
        }
        AnonymousClass0WJ r02 = this.A02;
        if (r02 != null) {
            r02.A03();
        }
    }

    public int getCompoundPaddingLeft() {
        return super.getCompoundPaddingLeft();
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

    public void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        C04420Od r1 = this.A01;
        if (r1 == null) {
            return;
        }
        if (r1.A04) {
            r1.A04 = false;
            return;
        }
        r1.A04 = true;
        r1.A00();
    }

    public AppCompatRadioButton(Context context) {
        this(context, (AttributeSet) null);
    }

    public void setButtonDrawable(int i) {
        setButtonDrawable(AnonymousClass0XW.A02(this, i));
    }

    public AppCompatRadioButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.f3nameremoved);
    }
}
