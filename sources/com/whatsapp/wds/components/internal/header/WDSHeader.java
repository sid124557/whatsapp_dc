package com.whatsapp.wds.components.internal.header;

import X.AnonymousClass0Y9;
import X.AnonymousClass4GJ;
import X.AnonymousClass7ZQ;
import X.C106895aL;
import X.C116855qy;
import X.C141616vr;
import X.C158547k9;
import X.C162457s7;
import X.C18280x3;
import X.C18290x4;
import X.C378924l;
import X.C86604Kt;
import X.C86624Kv;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.whatsapp.R;
import com.whatsapp.WaImageView;
import com.whatsapp.WaTextView;

public final class WDSHeader extends LinearLayout implements AnonymousClass4GJ {
    public C116855qy A00;
    public boolean A01;
    public final WaImageView A02;
    public final WaTextView A03;
    public final WaTextView A04;

    public final void setViewState(AnonymousClass7ZQ r3) {
        C162457s7.A0J(r3, 0);
        Drawable drawable = r3.A00;
        WaImageView waImageView = this.A02;
        C106895aL.A02(waImageView, drawable);
        waImageView.setImageDrawable(drawable);
        this.A04.setText(r3.A03);
        CharSequence charSequence = r3.A02;
        WaTextView waTextView = this.A03;
        C106895aL.A02(waTextView, charSequence);
        waTextView.setText(charSequence);
        setSize(r3.A01);
    }

    public final Object generatedComponent() {
        C116855qy r0 = this.A00;
        if (r0 == null) {
            r0 = C116855qy.A00(this);
            this.A00 = r0;
        }
        return r0.generatedComponent();
    }

    public final void setHeaderImageMarginEnabled(boolean z) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        int i;
        int i2;
        int i3;
        ViewGroup.MarginLayoutParams marginLayoutParams2;
        ViewGroup.MarginLayoutParams marginLayoutParams3;
        WaImageView waImageView = this.A02;
        ViewGroup.LayoutParams layoutParams = waImageView.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        } else {
            marginLayoutParams = null;
        }
        int i4 = 0;
        if (marginLayoutParams != null) {
            i = marginLayoutParams.leftMargin;
        } else {
            i = 0;
        }
        if (z) {
            i2 = C18290x4.A0G(this).getDimensionPixelOffset(R.dimen.f6nameremoved);
        } else {
            i2 = 0;
        }
        ViewGroup.LayoutParams layoutParams2 = waImageView.getLayoutParams();
        if (!(layoutParams2 instanceof ViewGroup.MarginLayoutParams) || (marginLayoutParams3 = (ViewGroup.MarginLayoutParams) layoutParams2) == null) {
            i3 = 0;
        } else {
            i3 = marginLayoutParams3.rightMargin;
        }
        ViewGroup.LayoutParams layoutParams3 = waImageView.getLayoutParams();
        if ((layoutParams3 instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams3) != null) {
            i4 = marginLayoutParams2.bottomMargin;
        }
        C106895aL.A01(waImageView, new C158547k9(i, i2, i3, i4));
    }

    public final void setHeaderTextGravity(int i) {
        this.A04.setGravity(i);
        this.A03.setGravity(i);
    }

    public WDSHeader(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        if (!this.A01) {
            this.A01 = true;
            generatedComponent();
        }
    }

    private final void setSize(C141616vr r3) {
        WaTextView waTextView;
        int i;
        int ordinal = r3.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                waTextView = this.A04;
                i = R.style.f12nameremoved;
            }
            AnonymousClass0Y9.A06(this.A03, R.style.f12nameremoved);
        }
        waTextView = this.A04;
        i = R.style.f12nameremoved;
        AnonymousClass0Y9.A06(waTextView, i);
        AnonymousClass0Y9.A06(this.A03, R.style.f12nameremoved);
    }

    public /* synthetic */ WDSHeader(Context context, AttributeSet attributeSet, int i, C378924l r5) {
        this(context, C86624Kv.A09(attributeSet, i));
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public WDSHeader(Context context) {
        this(context, (AttributeSet) null);
        C162457s7.A0J(context, 1);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public WDSHeader(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C162457s7.A0J(context, 1);
        if (!this.A01) {
            this.A01 = true;
            generatedComponent();
        }
        setOrientation(1);
        View.inflate(context, R.layout.f8nameremoved, this);
        this.A02 = (WaImageView) C18280x3.A0E(this, R.id.icon);
        this.A04 = C86604Kt.A0O(this, R.id.headline);
        this.A03 = C86604Kt.A0O(this, R.id.description);
    }
}
