package com.whatsapp.checkbox;

import X.AnonymousClass6DA;
import X.C102805Ki;
import X.C389229y;
import X.C620733j;
import X.C86644Kx;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatCheckBox;

public class RtlCheckBox extends AppCompatCheckBox {
    public int A00;
    public Drawable A01;
    public C620733j A02;

    public final void A00() {
        if (this.A02 == null) {
            this.A02 = C389229y.A01(getContext()).BsW();
        }
        if (!isInEditMode() && C102805Ki.A00(this.A02)) {
            setBackgroundDrawable((Drawable) null);
            this.A00 = getPaddingLeft();
            C86644Kx.A0z(this, Math.min(this.A00, getPaddingRight()));
        }
    }

    public void setButtonDrawable(Drawable drawable) {
        if (this.A02 == null) {
            this.A02 = C389229y.A01(getContext()).BsW();
        }
        if (!isInEditMode() && !C620733j.A04(this.A02)) {
            this.A01 = drawable;
            drawable = new AnonymousClass6DA(drawable, this);
        }
        super.setButtonDrawable(drawable);
    }

    public RtlCheckBox(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A00();
    }

    public int getCompoundPaddingLeft() {
        if (isInEditMode() || C620733j.A04(this.A02)) {
            return super.getCompoundPaddingLeft();
        }
        return super.getPaddingLeft();
    }

    public int getCompoundPaddingRight() {
        if (isInEditMode() || C620733j.A04(this.A02)) {
            return super.getCompoundPaddingRight();
        }
        int paddingRight = super.getPaddingRight();
        Drawable drawable = this.A01;
        if (drawable != null) {
            return paddingRight + Math.max(this.A00, drawable.getIntrinsicWidth());
        }
        return paddingRight;
    }

    public void onDraw(Canvas canvas) {
        int height;
        super.onDraw(canvas);
        if (!isInEditMode() && C102805Ki.A00(this.A02) && this.A01 != null) {
            int gravity = getGravity() & 112;
            int intrinsicHeight = this.A01.getIntrinsicHeight();
            int intrinsicWidth = this.A01.getIntrinsicWidth();
            if (gravity == 16) {
                height = (getHeight() - intrinsicHeight) / 2;
            } else if (gravity != 80) {
                height = 0;
            } else {
                height = getHeight() - intrinsicHeight;
            }
            int width = getWidth() - intrinsicWidth;
            int width2 = getWidth();
            this.A01.setBounds(width, height, width2, intrinsicHeight + height);
            this.A01.draw(canvas);
        }
    }

    public RtlCheckBox(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A00();
    }

    public RtlCheckBox(Context context) {
        this(context, (AttributeSet) null);
    }
}
