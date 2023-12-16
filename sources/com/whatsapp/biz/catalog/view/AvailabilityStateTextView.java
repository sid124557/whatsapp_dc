package com.whatsapp.biz.catalog.view;

import X.AnonymousClass000;
import X.AnonymousClass0Y8;
import X.C06560Yg;
import X.C1460478j;
import X.C162457s7;
import X.C378924l;
import X.C86624Kv;
import X.C86634Kw;
import X.C86794Lv;
import X.C89814fA;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import com.whatsapp.R;

public final class AvailabilityStateTextView extends C89814fA {
    public boolean A00;

    /* JADX INFO: finally extract failed */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AvailabilityStateTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C162457s7.A0J(context, 1);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1460478j.A01, i, 0);
        C162457s7.A0D(obtainStyledAttributes);
        try {
            setAvailable(obtainStyledAttributes.getBoolean(0, this.A00));
            obtainStyledAttributes.recycle();
            super.setGravity(17);
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    public final void A0D() {
        int A04;
        if (!this.A00 || !isSelected()) {
            boolean z = this.A00;
            Context context = getContext();
            int i = R.color.f5nameremoved;
            if (z) {
                i = R.color.f5nameremoved;
            }
            A04 = AnonymousClass0Y8.A04(context, i);
        } else {
            A04 = -1;
        }
        setTextColor(A04);
    }

    public final void A0E(C86794Lv r3) {
        boolean z = this.A00;
        if (r3.A00 != z) {
            r3.A00 = z;
            r3.A00();
            r3.invalidateSelf();
        }
        boolean A1U = AnonymousClass000.A1U(C86634Kw.A0E(this).uiMode & 48, 32);
        if (r3.A01 != A1U) {
            r3.A01 = A1U;
            r3.A00();
            r3.invalidateSelf();
        }
        super.setBackground(r3);
    }

    public final void setAvailable(boolean z) {
        this.A00 = z;
        C86794Lv backgroundDrawable = getBackgroundDrawable();
        if (!(backgroundDrawable == null || backgroundDrawable.A00 == z)) {
            backgroundDrawable.A00 = z;
            backgroundDrawable.A00();
            backgroundDrawable.invalidateSelf();
        }
        boolean z2 = this.A00;
        int i = R.string.f11nameremoved;
        if (z2) {
            i = R.string.f11nameremoved;
        }
        C06560Yg.A0S(this, C86624Kv.A0a(getResources(), i));
        A0D();
    }

    private final C86794Lv getBackgroundDrawable() {
        Drawable background = getBackground();
        if (background instanceof C86794Lv) {
            return (C86794Lv) background;
        }
        return null;
    }

    public void onConfigurationChanged(Configuration configuration) {
        boolean A1U;
        super.onConfigurationChanged(configuration);
        C86794Lv backgroundDrawable = getBackgroundDrawable();
        if (backgroundDrawable != null && backgroundDrawable.A01 != (A1U = AnonymousClass000.A1U(C86634Kw.A0E(this).uiMode & 48, 32))) {
            backgroundDrawable.A01 = A1U;
            backgroundDrawable.A00();
            backgroundDrawable.invalidateSelf();
        }
    }

    public void setSelected(boolean z) {
        super.setSelected(z);
        A0D();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public AvailabilityStateTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C162457s7.A0J(context, 1);
    }

    public /* synthetic */ AvailabilityStateTextView(Context context, AttributeSet attributeSet, int i, int i2, C378924l r7) {
        this(context, C86624Kv.A09(attributeSet, i2), C86634Kw.A02(i2, i));
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public AvailabilityStateTextView(Context context) {
        this(context, (AttributeSet) null, 0);
        C162457s7.A0J(context, 1);
    }
}
