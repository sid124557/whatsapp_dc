package com.whatsapp.ui.media;

import X.AnonymousClass001;
import X.AnonymousClass0x2;
import X.AnonymousClass4OT;
import X.AnonymousClass52i;
import X.C111685iW;
import X.C162457s7;
import X.C18270x1;
import X.C18280x3;
import X.C378924l;
import X.C620633i;
import X.C86624Kv;
import X.C86634Kw;
import X.C88864av;
import android.content.Context;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewStub;
import android.widget.GridView;
import com.whatsapp.R;
import java.util.ArrayList;

public final class MediaCardGrid extends AnonymousClass52i {
    public GridView A00;
    public AnonymousClass4OT A01;
    public ArrayList A02;
    public boolean A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MediaCardGrid(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C162457s7.A0J(context, 1);
        A01();
        this.A02 = AnonymousClass001.A0s();
    }

    public void A01() {
        if (!this.A03) {
            this.A03 = true;
            this.A0B = C88864av.A02((C111685iW) generatedComponent());
        }
    }

    public int getThumbnailPixelSize() {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        C620633i.A01(getContext()).getDefaultDisplay().getMetrics(displayMetrics);
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.f6nameremoved) * 2;
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(R.dimen.f6nameremoved) * 2;
        int i = displayMetrics.widthPixels;
        int i2 = displayMetrics.heightPixels;
        if (i > i2) {
            i = i2;
        }
        return ((i - dimensionPixelSize) - dimensionPixelSize2) / 3;
    }

    public void A04() {
        super.A04();
        C18270x1.A0p(this.A00);
    }

    public void A05() {
        super.A05();
        AnonymousClass0x2.A0x(this.A00);
    }

    public void A07(AttributeSet attributeSet) {
        super.A07(attributeSet);
        View A0M = C86634Kw.A0M((ViewStub) C18280x3.A0E(this, R.id.media_card_grid_stub), R.layout.f8nameremoved);
        C162457s7.A0K(A0M, "null cannot be cast to non-null type android.widget.GridView");
        this.A00 = (GridView) A0M;
    }

    public String getError() {
        return super.getError();
    }

    public void setError(String str) {
        super.setError(str);
        C18270x1.A0p(this.A00);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public MediaCardGrid(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C162457s7.A0J(context, 1);
    }

    public /* synthetic */ MediaCardGrid(Context context, AttributeSet attributeSet, int i, int i2, C378924l r7) {
        this(context, C86624Kv.A09(attributeSet, i2), C86634Kw.A02(i2, i));
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public MediaCardGrid(Context context) {
        this(context, (AttributeSet) null, 0);
        C162457s7.A0J(context, 1);
    }
}
