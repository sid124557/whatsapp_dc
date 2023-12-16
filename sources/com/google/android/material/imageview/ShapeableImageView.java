package com.google.android.material.imageview;

import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass0VX;
import X.AnonymousClass4L0;
import X.AnonymousClass6D7;
import X.AnonymousClass772;
import X.AnonymousClass7XF;
import X.C105515Vh;
import X.C125006Eu;
import X.C1463179t;
import X.C160917of;
import X.C161877ql;
import X.C178898iH;
import X.C181238mQ;
import X.C86614Ku;
import X.C86634Kw;
import X.C86664Kz;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.RectF;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatImageView;
import com.whatsapp.R;

public class ShapeableImageView extends AppCompatImageView implements C181238mQ {
    public float A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public ColorStateList A07;
    public Path A08;
    public AnonymousClass6D7 A09;
    public C161877ql A0A;
    public boolean A0B;
    public final Paint A0C;
    public final Paint A0D;
    public final Path A0E;
    public final RectF A0F;
    public final RectF A0G;
    public final AnonymousClass7XF A0H;

    public final void A00(int i, int i2) {
        RectF rectF = this.A0F;
        rectF.set((float) getPaddingLeft(), (float) getPaddingTop(), (float) AnonymousClass4L0.A03(this, i), (float) (i2 - getPaddingBottom()));
        AnonymousClass7XF r2 = this.A0H;
        C161877ql r5 = this.A0A;
        Path path = this.A0E;
        r2.A00(path, rectF, r5, (C178898iH) null, 1.0f);
        Path path2 = this.A08;
        path2.rewind();
        path2.addPath(path);
        RectF rectF2 = this.A0G;
        rectF2.set(0.0f, 0.0f, (float) i, (float) i2);
        path2.addRect(rectF2, Path.Direction.CCW);
    }

    public int getContentPaddingBottom() {
        return this.A01;
    }

    public final int getContentPaddingEnd() {
        int i = this.A02;
        if (i != Integer.MIN_VALUE) {
            return i;
        }
        if (getLayoutDirection() == 1) {
            return this.A03;
        }
        return this.A04;
    }

    public int getContentPaddingLeft() {
        int i;
        int i2 = this.A05;
        if (!(i2 == Integer.MIN_VALUE && this.A02 == Integer.MIN_VALUE)) {
            if (AnonymousClass001.A1T(getLayoutDirection()) && (i = this.A02) != Integer.MIN_VALUE) {
                return i;
            }
            if (getLayoutDirection() != 1) {
                int i3 = i2;
                if (i2 != Integer.MIN_VALUE) {
                    return i3;
                }
            }
        }
        return this.A03;
    }

    public int getContentPaddingRight() {
        int i;
        int i2 = this.A05;
        if (!(i2 == Integer.MIN_VALUE && this.A02 == Integer.MIN_VALUE)) {
            if (AnonymousClass001.A1T(getLayoutDirection()) && i2 != Integer.MIN_VALUE) {
                return i2;
            }
            if (!(getLayoutDirection() == 1 || (i = this.A02) == Integer.MIN_VALUE)) {
                return i;
            }
        }
        return this.A04;
    }

    public final int getContentPaddingStart() {
        int i = this.A05;
        if (i != Integer.MIN_VALUE) {
            return i;
        }
        if (getLayoutDirection() == 1) {
            return this.A04;
        }
        return this.A03;
    }

    public int getContentPaddingTop() {
        return this.A06;
    }

    public C161877ql getShapeAppearanceModel() {
        return this.A0A;
    }

    public ColorStateList getStrokeColor() {
        return this.A07;
    }

    public float getStrokeWidth() {
        return this.A00;
    }

    public void setShapeAppearanceModel(C161877ql r3) {
        this.A0A = r3;
        AnonymousClass6D7 r0 = this.A09;
        if (r0 != null) {
            r0.setShapeAppearanceModel(r3);
        }
        A00(getWidth(), getHeight());
        invalidate();
        invalidateOutline();
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        this.A07 = colorStateList;
        invalidate();
    }

    public void setStrokeWidth(float f) {
        if (this.A00 != f) {
            this.A00 = f;
            invalidate();
        }
    }

    public ShapeableImageView(Context context, AttributeSet attributeSet, int i) {
        super(C105515Vh.A00(context, attributeSet, i, R.style.f12nameremoved), attributeSet, i);
        this.A0H = AnonymousClass772.A00;
        this.A0E = AnonymousClass002.A06();
        this.A0B = false;
        Context context2 = getContext();
        Paint A0Z = C86664Kz.A0Z();
        this.A0D = A0Z;
        A0Z.setAntiAlias(true);
        A0Z.setColor(-1);
        C86634Kw.A18(A0Z, PorterDuff.Mode.DST_OUT);
        this.A0F = AnonymousClass002.A07();
        this.A0G = AnonymousClass002.A07();
        this.A08 = AnonymousClass002.A06();
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, C1463179t.A0Z, i, R.style.f12nameremoved);
        setLayerType(2, (Paint) null);
        this.A07 = C160917of.A00(context2, obtainStyledAttributes, 9);
        this.A00 = (float) obtainStyledAttributes.getDimensionPixelSize(10, 0);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.A03 = dimensionPixelSize;
        this.A06 = dimensionPixelSize;
        this.A04 = dimensionPixelSize;
        this.A01 = dimensionPixelSize;
        this.A03 = obtainStyledAttributes.getDimensionPixelSize(3, dimensionPixelSize);
        this.A06 = obtainStyledAttributes.getDimensionPixelSize(6, dimensionPixelSize);
        this.A04 = obtainStyledAttributes.getDimensionPixelSize(4, dimensionPixelSize);
        this.A01 = obtainStyledAttributes.getDimensionPixelSize(1, dimensionPixelSize);
        this.A05 = obtainStyledAttributes.getDimensionPixelSize(5, Integer.MIN_VALUE);
        this.A02 = obtainStyledAttributes.getDimensionPixelSize(2, Integer.MIN_VALUE);
        obtainStyledAttributes.recycle();
        Paint A0Z2 = C86664Kz.A0Z();
        this.A0C = A0Z2;
        C86634Kw.A17(A0Z2);
        A0Z2.setAntiAlias(true);
        this.A0A = new C161877ql(C161877ql.A01(context2, attributeSet, i, R.style.f12nameremoved));
        setOutlineProvider(new C125006Eu(this));
    }

    public int getPaddingBottom() {
        return super.getPaddingBottom() - this.A01;
    }

    public int getPaddingEnd() {
        return super.getPaddingEnd() - getContentPaddingEnd();
    }

    public int getPaddingLeft() {
        return super.getPaddingLeft() - getContentPaddingLeft();
    }

    public int getPaddingRight() {
        return super.getPaddingRight() - getContentPaddingRight();
    }

    public int getPaddingStart() {
        return super.getPaddingStart() - getContentPaddingStart();
    }

    public int getPaddingTop() {
        return super.getPaddingTop() - this.A06;
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawPath(this.A08, this.A0D);
        if (this.A07 != null) {
            Paint paint = this.A0C;
            paint.setStrokeWidth(this.A00);
            int colorForState = this.A07.getColorForState(getDrawableState(), this.A07.getDefaultColor());
            if (this.A00 > 0.0f && colorForState != 0) {
                paint.setColor(colorForState);
                canvas.drawPath(this.A0E, paint);
            }
        }
    }

    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (!this.A0B && isLayoutDirectionResolved()) {
            this.A0B = true;
            if (!isPaddingRelative() && this.A05 == Integer.MIN_VALUE && this.A02 == Integer.MIN_VALUE) {
                setPadding(super.getPaddingLeft(), super.getPaddingTop(), super.getPaddingRight(), super.getPaddingBottom());
            } else {
                setPaddingRelative(super.getPaddingStart(), super.getPaddingTop(), super.getPaddingEnd(), super.getPaddingBottom());
            }
        }
    }

    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        A00(i, i2);
    }

    public void setPadding(int i, int i2, int i3, int i4) {
        super.setPadding(i + getContentPaddingLeft(), i2 + this.A06, i3 + getContentPaddingRight(), i4 + this.A01);
    }

    public void setPaddingRelative(int i, int i2, int i3, int i4) {
        super.setPaddingRelative(i + getContentPaddingStart(), i2 + this.A06, i3 + getContentPaddingEnd(), i4 + this.A01);
    }

    public void setStrokeColorResource(int i) {
        setStrokeColor(AnonymousClass0VX.A00(getContext(), i));
    }

    public void setStrokeWidthResource(int i) {
        setStrokeWidth((float) C86614Ku.A05(this, i));
    }

    public ShapeableImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ShapeableImageView(Context context) {
        this(context, (AttributeSet) null, 0);
    }
}
