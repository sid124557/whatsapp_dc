package com.whatsapp.contact;

import X.AnonymousClass001;
import X.AnonymousClass4GJ;
import X.AnonymousClass5Yj;
import X.C100905Cs;
import X.C102805Ki;
import X.C106895aL;
import X.C111685iW;
import X.C116855qy;
import X.C158547k9;
import X.C162457s7;
import X.C18270x1;
import X.C18280x3;
import X.C18290x4;
import X.C18300x5;
import X.C378924l;
import X.C620733j;
import X.C86614Ku;
import X.C86624Kv;
import X.C86634Kw;
import X.C88864av;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.whatsapp.R;
import com.whatsapp.WaImageView;
import com.whatsapp.components.button.ThumbnailButton;
import java.util.List;

public class FacepileView extends LinearLayout implements AnonymousClass4GJ {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public C620733j A05;
    public C116855qy A06;
    public boolean A07;
    public final List A08;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FacepileView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C162457s7.A0J(context, 1);
        if (!this.A07) {
            this.A07 = true;
            this.A05 = C88864av.A02((C111685iW) generatedComponent());
        }
        this.A08 = AnonymousClass001.A0s();
        Resources A0G = C18290x4.A0G(this);
        C162457s7.A0D(A0G);
        this.A04 = A0G.getDimensionPixelSize(R.dimen.f6nameremoved);
        Resources A0G2 = C18290x4.A0G(this);
        C162457s7.A0D(A0G2);
        this.A01 = A0G2.getDimensionPixelSize(R.dimen.f6nameremoved);
        Resources A0G3 = C18290x4.A0G(this);
        C162457s7.A0D(A0G3);
        this.A02 = A0G3.getDimensionPixelSize(R.dimen.f6nameremoved);
        this.A00 = C18300x5.A03(context, R.attr.f3nameremoved, R.color.f5nameremoved);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = C86614Ku.A0C(this).obtainStyledAttributes(attributeSet, C100905Cs.A09, 0, 0);
            C162457s7.A0D(obtainStyledAttributes);
            try {
                Resources A0G4 = C18290x4.A0G(this);
                C162457s7.A0D(A0G4);
                setOverlapSize(C86634Kw.A05(A0G4, obtainStyledAttributes, R.dimen.f6nameremoved, 4));
                Resources A0G5 = C18290x4.A0G(this);
                C162457s7.A0D(A0G5);
                setContactIconSize(C86634Kw.A05(A0G5, obtainStyledAttributes, R.dimen.f6nameremoved, 2));
                setContactBorderColor(obtainStyledAttributes.getColor(0, AnonymousClass5Yj.A03(getContext(), getContext(), R.attr.f3nameremoved, R.color.f5nameremoved)));
                Resources A0G6 = C18290x4.A0G(this);
                C162457s7.A0D(A0G6);
                setContactBorderSize(C86634Kw.A05(A0G6, obtainStyledAttributes, R.dimen.f6nameremoved, 1));
                setContactsSize(obtainStyledAttributes.getInt(3, 0));
            } finally {
                obtainStyledAttributes.recycle();
            }
        }
        A02();
        A01();
    }

    public final void A01() {
        setClipToPadding(false);
        setClipChildren(false);
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        boolean A002 = C102805Ki.A00(getWaLocale());
        int i = this.A04;
        if (A002) {
            if (paddingRight < i) {
                paddingRight = i;
            }
        } else if (paddingLeft < i) {
            paddingLeft = i;
        }
        C86624Kv.A0y(this, paddingLeft, paddingRight);
        for (ThumbnailButton thumbnailButton : this.A08) {
            thumbnailButton.A01 = (float) this.A01;
            thumbnailButton.A03 = this.A00;
            thumbnailButton.getLayoutParams().width = this.A02;
            ViewGroup.LayoutParams layoutParams = thumbnailButton.getLayoutParams();
            int i2 = this.A02;
            layoutParams.height = i2;
            thumbnailButton.A02 = (float) (i2 / 2);
            setupOverlap(thumbnailButton);
        }
    }

    public int getChildDrawingOrder(int i, int i2) {
        return (i - i2) - 1;
    }

    public final void setWaLocale(C620733j r2) {
        C162457s7.A0J(r2, 0);
        this.A05 = r2;
    }

    private final void setContactBorderColor(int i) {
        this.A00 = i;
        A01();
    }

    public final void A02() {
        List list = this.A08;
        list.clear();
        if (this.A03 < getChildCount()) {
            int childCount = getChildCount();
            while (true) {
                childCount--;
                if (childCount < this.A03) {
                    break;
                }
                removeViewAt(childCount);
            }
        }
        int i = this.A03;
        for (int i2 = 0; i2 < i; i2++) {
            if (getChildCount() <= i2) {
                C18280x3.A0D(this).inflate(R.layout.f8nameremoved, this, true);
            }
            View childAt = getChildAt(i2);
            C162457s7.A0K(childAt, "null cannot be cast to non-null type com.whatsapp.components.button.ThumbnailButton");
            list.add(childAt);
        }
    }

    public final Object generatedComponent() {
        C116855qy r0 = this.A06;
        if (r0 == null) {
            r0 = C116855qy.A00(this);
            this.A06 = r0;
        }
        return r0.generatedComponent();
    }

    public final int getContactBorderSize() {
        return this.A01;
    }

    public final int getContactIconSize() {
        return this.A02;
    }

    public final int getContactsSize() {
        return this.A03;
    }

    public final int getOverlapSize() {
        return this.A04;
    }

    public final C620733j getWaLocale() {
        C620733j r0 = this.A05;
        if (r0 != null) {
            return r0;
        }
        throw C18270x1.A0S("waLocale");
    }

    public boolean isChildrenDrawingOrderEnabled() {
        return true;
    }

    public final void setContactBorderSize(int i) {
        this.A01 = i;
        A01();
    }

    public final void setContactIconSize(int i) {
        this.A02 = i;
        A01();
    }

    public final void setContactsSize(int i) {
        this.A03 = i;
        A02();
        A01();
    }

    public final void setOverlapSize(int i) {
        this.A04 = i;
        A01();
    }

    private final void setupOverlap(ThumbnailButton thumbnailButton) {
        int i;
        int i2;
        int i3;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        ViewGroup.MarginLayoutParams marginLayoutParams2;
        int i4 = 0;
        if (C102805Ki.A00(getWaLocale())) {
            i = 0;
        } else {
            i = -this.A04;
        }
        if (C102805Ki.A00(getWaLocale())) {
            i2 = -this.A04;
        } else {
            i2 = 0;
        }
        ViewGroup.LayoutParams layoutParams = thumbnailButton.getLayoutParams();
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams) || (marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams) == null) {
            i3 = 0;
        } else {
            i3 = marginLayoutParams2.topMargin;
        }
        ViewGroup.LayoutParams layoutParams2 = thumbnailButton.getLayoutParams();
        if ((layoutParams2 instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams2) != null) {
            i4 = marginLayoutParams.bottomMargin;
        }
        C106895aL.A01(thumbnailButton, new C158547k9(i, i3, i2, i4));
    }

    public final WaImageView A00(int i) {
        if (i < getChildCount()) {
            return (WaImageView) this.A08.get(i);
        }
        return null;
    }

    public final Resources getRes() {
        Resources A0G = C18290x4.A0G(this);
        C162457s7.A0D(A0G);
        return A0G;
    }

    public int getLayout() {
        return R.layout.f8nameremoved;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public FacepileView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C162457s7.A0J(context, 1);
    }

    public /* synthetic */ FacepileView(Context context, AttributeSet attributeSet, int i, int i2, C378924l r7) {
        this(context, C86624Kv.A09(attributeSet, i2), C86634Kw.A02(i2, i));
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public FacepileView(Context context) {
        this(context, (AttributeSet) null, 0);
        C162457s7.A0J(context, 1);
    }
}
