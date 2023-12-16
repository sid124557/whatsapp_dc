package com.whatsapp.biz.catalog.view;

import X.AnonymousClass000;
import X.AnonymousClass4L0;
import X.AnonymousClass4Lq;
import X.AnonymousClass6B0;
import X.C06560Yg;
import X.C117165rU;
import X.C120685yz;
import X.C1460478j;
import X.C162457s7;
import X.C18270x1;
import X.C378924l;
import X.C59862xc;
import X.C86624Kv;
import X.C86634Kw;
import X.C86644Kx;
import X.C86654Ky;
import X.C89774eu;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import com.whatsapp.R;

public final class AvailabilityStateImageView extends C89774eu {
    public AnonymousClass4Lq A00;
    public C59862xc A01;
    public boolean A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AvailabilityStateImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C162457s7.A0J(context, 1);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1460478j.A00, i, 0);
        C162457s7.A0D(obtainStyledAttributes);
        try {
            setAvailable(obtainStyledAttributes.getBoolean(0, this.A02));
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public static final void setImageDrawable$lambda$0(AvailabilityStateImageView availabilityStateImageView, Drawable drawable) {
        C162457s7.A0J(availabilityStateImageView, 0);
        availabilityStateImageView.setImageDrawableInternal(drawable);
    }

    private final void setImageDrawableInternal(Drawable drawable) {
        Drawable drawable2 = null;
        if (drawable != null) {
            C86644Kx.A1A(this);
            C59862xc r2 = this.A01;
            if (r2 == null) {
                throw C18270x1.A0S("helper");
            }
            drawable2 = C86654Ky.A0F(drawable, new AnonymousClass6B0(0), r2);
        }
        super.setImageDrawable(drawable2);
    }

    public final void A07(AnonymousClass4Lq r3, C59862xc r4) {
        C162457s7.A0J(r4, 0);
        if (!getAreDependenciesInjected()) {
            this.A01 = r4;
            this.A00 = r3;
            r3.setCallback(this);
            boolean z = this.A02;
            if (r3.A00 != z) {
                r3.A00 = z;
                r3.A00(C86644Kx.A01(r3));
                r3.invalidateSelf();
            }
        }
    }

    public void onDraw(Canvas canvas) {
        C162457s7.A0J(canvas, 0);
        Drawable drawable = getDrawable();
        if (drawable == null || drawable.getBounds() == null) {
            super.onDraw(canvas);
        } else {
            canvas.save();
            canvas.scale(0.8f, 0.8f, (((float) AnonymousClass000.A06(this, getWidth())) * 0.5f) + ((float) getPaddingLeft()), (((float) AnonymousClass000.A05(this, getHeight())) * 0.5f) + ((float) getPaddingTop()));
            super.onDraw(canvas);
            canvas.restore();
        }
        AnonymousClass4Lq r0 = this.A00;
        if (r0 == null) {
            throw C18270x1.A0S("frameDrawable");
        }
        r0.draw(canvas);
    }

    public boolean verifyDrawable(Drawable drawable) {
        C162457s7.A0J(drawable, 0);
        if (!super.verifyDrawable(drawable)) {
            AnonymousClass4Lq r1 = this.A00;
            if (r1 == null) {
                throw C18270x1.A0S("frameDrawable");
            } else if (drawable == r1) {
                return true;
            } else {
                return false;
            }
        }
        return true;
    }

    private final boolean getAreDependenciesInjected() {
        if (this.A01 == null || this.A00 == null) {
            return false;
        }
        return true;
    }

    public final void setAvailable(boolean z) {
        this.A02 = z;
        int i = R.string.f11nameremoved;
        if (z) {
            i = R.string.f11nameremoved;
        }
        C06560Yg.A0S(this, C86624Kv.A0a(getResources(), i));
        C120685yz r1 = new C120685yz(this, z);
        if (getAreDependenciesInjected()) {
            r1.invoke();
        }
    }

    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        AnonymousClass4Lq r4 = this.A00;
        if (r4 == null) {
            throw C18270x1.A0S("frameDrawable");
        }
        r4.setBounds(getPaddingLeft(), getPaddingTop(), AnonymousClass4L0.A03(this, i), i2 - getPaddingBottom());
    }

    public void setImageBitmap(Bitmap bitmap) {
        setImageDrawable(new BitmapDrawable(getResources(), bitmap));
    }

    public void setImageDrawable(Drawable drawable) {
        if (getAreDependenciesInjected()) {
            setImageDrawableInternal(drawable);
        } else {
            post(new C117165rU(this, 44, drawable));
        }
    }

    public void setSelected(boolean z) {
        super.setSelected(z);
        AnonymousClass4Lq r1 = this.A00;
        if (r1 == null) {
            throw C18270x1.A0S("frameDrawable");
        }
        r1.setState(getDrawableState());
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public AvailabilityStateImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C162457s7.A0J(context, 1);
    }

    public /* synthetic */ AvailabilityStateImageView(Context context, AttributeSet attributeSet, int i, int i2, C378924l r7) {
        this(context, C86624Kv.A09(attributeSet, i2), C86634Kw.A02(i2, i));
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public AvailabilityStateImageView(Context context) {
        this(context, (AttributeSet) null, 0);
        C162457s7.A0J(context, 1);
    }
}
