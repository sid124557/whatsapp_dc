package com.whatsapp.quickactionbar;

import X.AnonymousClass0RP;
import X.AnonymousClass0Y8;
import X.AnonymousClass0x2;
import X.AnonymousClass7SW;
import X.AnonymousClass7YQ;
import X.C100905Cs;
import X.C137566ot;
import X.C137576ou;
import X.C137586ov;
import X.C137596ow;
import X.C162457s7;
import X.C18270x1;
import X.C18290x4;
import X.C18310x6;
import X.C18320x8;
import X.C86624Kv;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import com.whatsapp.R;
import com.whatsapp.WaImageView;
import com.whatsapp.WaTextView;

public final class WaQuickActionChip extends LinearLayout {
    public WaImageView A00;
    public AnonymousClass7SW A01;
    public final WaImageView A02;
    public final WaTextView A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public WaQuickActionChip(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        AnonymousClass7SW r2;
        C162457s7.A0J(context, 1);
        View inflate = LayoutInflater.from(context).inflate(R.layout.f8nameremoved, this, true);
        WaTextView waTextView = (WaTextView) C18290x4.A0M(inflate, R.id.label);
        this.A03 = waTextView;
        this.A02 = (WaImageView) C18290x4.A0M(inflate, R.id.icon);
        waTextView.setMaxLines(1);
        AnonymousClass0x2.A0q(context, waTextView, R.color.f5nameremoved);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C100905Cs.A0U, 0, 0);
            C162457s7.A0D(obtainStyledAttributes);
            int i = obtainStyledAttributes.getInt(0, 0);
            if (i == 0) {
                r2 = new C137576ou(AnonymousClass7YQ.A00(obtainStyledAttributes, 4, 5, R.color.f5nameremoved));
            } else if (i == 1) {
                r2 = new C137566ot(AnonymousClass7YQ.A00(obtainStyledAttributes, 1, 2, R.color.f5nameremoved));
            } else if (i == 2) {
                r2 = new C137586ov(AnonymousClass7YQ.A00(obtainStyledAttributes, 4, 5, R.color.f5nameremoved), AnonymousClass7YQ.A00(obtainStyledAttributes, 1, 2, R.color.f5nameremoved));
            } else if (i == 3) {
                r2 = C137596ow.A00;
            } else {
                throw C18320x8.A0m();
            }
            this.A01 = r2;
            A02(r2);
            waTextView.setFilters(new InputFilter.LengthFilter[]{new InputFilter.LengthFilter(obtainStyledAttributes.getInt(3, 20))});
            obtainStyledAttributes.recycle();
        }
    }

    public final Drawable A00(Integer num, int i) {
        int intValue;
        Drawable A002;
        if (num == null || (intValue = num.intValue()) == 0 || (A002 = AnonymousClass0RP.A00(getContext(), intValue)) == null) {
            return null;
        }
        A002.setBounds(0, 0, 50, 50);
        A002.setTint(AnonymousClass0Y8.A04(getContext(), i));
        A002.setTintMode(PorterDuff.Mode.SRC_IN);
        return A002;
    }

    public final void setChipVariant(AnonymousClass7SW r2) {
        C162457s7.A0J(r2, 0);
        this.A01 = r2;
        A02(r2);
        invalidate();
    }

    public final void setIconsForChip(AnonymousClass7YQ r4, AnonymousClass7YQ r5) {
        Drawable drawable;
        C162457s7.A0J(r4, 0);
        Drawable A002 = A00(r4.A01, r4.A00);
        if (r5 != null) {
            drawable = A00(r5.A01, r5.A00);
        } else {
            drawable = null;
        }
        setIconDawableForChip(A002, drawable);
    }

    public final void setLabel(String str) {
        C162457s7.A0J(str, 0);
        WaTextView waTextView = this.A03;
        waTextView.setText(str);
        waTextView.setVisibility(0);
    }

    public final void A02(AnonymousClass7SW r5) {
        Drawable drawable = null;
        if (r5 instanceof C137576ou) {
            A01();
            AnonymousClass7YQ r2 = ((C137576ou) r5).A00;
            if (r2 != null) {
                drawable = A00(Integer.valueOf(C18310x6.A06(r2.A01)), r2.A00);
            }
            this.A02.setImageDrawable(drawable);
        } else if (r5 instanceof C137586ov) {
            A01();
            C137586ov r52 = (C137586ov) r5;
            AnonymousClass7YQ r0 = r52.A00;
            Drawable A002 = A00(r0.A01, r0.A00);
            AnonymousClass7YQ r02 = r52.A01;
            setIconDawableForChip(A002, A00(r02.A01, r02.A00));
        } else if (r5 instanceof C137566ot) {
            A01();
            AnonymousClass7YQ r03 = ((C137566ot) r5).A00;
            setIconDawableForChip((Drawable) null, A00(r03.A01, r03.A00));
        } else if (r5 instanceof C137596ow) {
            int dimensionPixelOffset = getResources().getDimensionPixelOffset(R.dimen.f6nameremoved);
            C86624Kv.A0w(this, dimensionPixelOffset);
            getLayoutParams().width = dimensionPixelOffset;
            this.A03.setVisibility(0);
            AnonymousClass7YQ r04 = r5.A00;
            if (r04 != null) {
                this.A02.setImageDrawable(A00(r04.A01, r04.A00));
            }
        }
    }

    public final void setIconDawableForChip(Drawable drawable, Drawable drawable2) {
        this.A02.setImageDrawable(drawable);
        if (drawable2 != null) {
            if (this.A00 == null) {
                WaImageView waImageView = new WaImageView(getContext());
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                layoutParams.setMargins(waImageView.getResources().getDimensionPixelSize(R.dimen.f6nameremoved), 0, 0, 0);
                waImageView.setLayoutParams(layoutParams);
                this.A00 = waImageView;
                addView(waImageView);
            }
            WaImageView waImageView2 = this.A00;
            if (waImageView2 == null) {
                throw C18270x1.A0S("endIconView");
            }
            waImageView2.setImageDrawable(drawable2);
            WaImageView waImageView3 = this.A00;
            if (waImageView3 == null) {
                throw C18270x1.A0S("endIconView");
            }
            waImageView3.setVisibility(0);
        }
    }

    public final void A01() {
        int dimensionPixelOffset = getResources().getDimensionPixelOffset(R.dimen.f6nameremoved);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        setMinimumHeight(dimensionPixelOffset);
        layoutParams.gravity = 16;
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.f6nameremoved);
        setPaddingRelative(dimensionPixelSize, 0, dimensionPixelSize, 0);
        setLayoutParams(layoutParams);
    }

    public final void setLabel(int i) {
        WaTextView waTextView = this.A03;
        waTextView.setText(i);
        waTextView.setVisibility(0);
    }
}
