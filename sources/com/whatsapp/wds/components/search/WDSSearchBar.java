package com.whatsapp.wds.components.search;

import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass0Y8;
import X.AnonymousClass4GJ;
import X.AnonymousClass5CQ;
import X.AnonymousClass5Q8;
import X.AnonymousClass67L;
import X.AnonymousClass75T;
import X.C107385bE;
import X.C107405bG;
import X.C111685iW;
import X.C116855qy;
import X.C141366vS;
import X.C1462679k;
import X.C162457s7;
import X.C18270x1;
import X.C18290x4;
import X.C18300x5;
import X.C18320x8;
import X.C620633i;
import X.C620733j;
import X.C86604Kt;
import X.C86644Kx;
import X.C86654Ky;
import X.C86664Kz;
import X.C88864av;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import android.widget.FrameLayout;
import androidx.appcompat.widget.Toolbar;
import com.whatsapp.R;
import com.whatsapp.WaEditText;

public final class WDSSearchBar extends FrameLayout implements AnonymousClass4GJ {
    public int A00;
    public C620733j A01;
    public AnonymousClass5Q8 A02;
    public C141366vS A03;
    public C116855qy A04;
    public boolean A05;
    public final Toolbar A06;
    public final WDSSearchView A07;

    public final void setVariant(C141366vS r4) {
        C162457s7.A0J(r4, 0);
        boolean A1W = C18300x5.A1W(this.A03, r4);
        this.A03 = r4;
        if (A1W) {
            this.A02 = new AnonymousClass5Q8(C18290x4.A0F(this), this.A03);
            this.A07.setVariant(this.A03);
        }
    }

    public final void setWhatsAppLocale(C620733j r2) {
        C162457s7.A0J(r2, 0);
        this.A01 = r2;
    }

    public final void A02(boolean z) {
        int i;
        InputMethodManager A0Q;
        this.A06.setVisibility(0);
        WDSSearchView wDSSearchView = this.A07;
        wDSSearchView.setText((CharSequence) "");
        WaEditText waEditText = wDSSearchView.A09;
        C620633i r0 = wDSSearchView.A00;
        if (!(r0 == null || (A0Q = r0.A0Q()) == null)) {
            C86644Kx.A14(waEditText, A0Q);
        }
        if (!z || !isAttachedToWindow()) {
            wDSSearchView.setVisibility(4);
        } else {
            int i2 = this.A00;
            int width = wDSSearchView.getWidth();
            int i3 = this.A00;
            int A0C = AnonymousClass001.A0C(width, i3, i2);
            if (i3 == 0) {
                this.A00 = C86664Kz.A0B(wDSSearchView);
            }
            if (C620733j.A04(getWhatsAppLocale())) {
                i = wDSSearchView.getWidth() - this.A00;
            } else {
                i = this.A00;
            }
            AnonymousClass67L.A00(C86654Ky.A0A(wDSSearchView, i, C86654Ky.A04(this), (float) A0C, 0.0f), this, 32);
        }
        A00();
    }

    public final boolean A03() {
        return C86604Kt.A1Y(this.A07);
    }

    public final Object generatedComponent() {
        C116855qy r0 = this.A04;
        if (r0 == null) {
            r0 = C116855qy.A00(this);
            this.A04 = r0;
        }
        return r0.generatedComponent();
    }

    public final WDSSearchView getSearchView() {
        return this.A07;
    }

    public final AnonymousClass5Q8 getStyle() {
        AnonymousClass5Q8 r0 = this.A02;
        if (r0 != null) {
            return r0;
        }
        throw C18270x1.A0S("style");
    }

    public final Toolbar getToolbar() {
        return this.A06;
    }

    public final C141366vS getVariant() {
        return this.A03;
    }

    public final C620733j getWhatsAppLocale() {
        C620733j r0 = this.A01;
        if (r0 != null) {
            return r0;
        }
        throw C18270x1.A0S("whatsAppLocale");
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            CharSequence charSequence = bundle.getCharSequence("search_text");
            if (!(charSequence == null || charSequence.length() == 0)) {
                A01();
                this.A00 = bundle.getInt("search_button_x_pos");
                this.A07.setText(charSequence);
            }
            parcelable = bundle.getParcelable("superState");
        }
        super.onRestoreInstanceState(parcelable);
    }

    public WDSSearchBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        if (!this.A05) {
            this.A05 = true;
            this.A01 = C88864av.A02((C111685iW) generatedComponent());
        }
    }

    private final Activity getActivity() {
        for (Context context = getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof Activity) {
                return (Activity) context;
            }
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0059  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A00() {
        /*
            r6 = this;
            android.app.Activity r0 = r6.getActivity()
            if (r0 == 0) goto L_0x005d
            android.view.Window r4 = r0.getWindow()
            android.content.Context r5 = r4.getContext()
            X.C162457s7.A0H(r5)
            r3 = 2130970918(0x7f040926, float:1.755056E38)
            r0 = 0
            X.C162457s7.A0J(r5, r0)
            android.util.TypedValue r2 = X.AnonymousClass4L0.A0B()     // Catch:{ Exception -> 0x002f }
            android.content.res.Resources$Theme r1 = r5.getTheme()     // Catch:{ Exception -> 0x002f }
            if (r1 == 0) goto L_0x0026
            r0 = 1
            r1.resolveAttribute(r3, r2, r0)     // Catch:{ Exception -> 0x002f }
        L_0x0026:
            int r3 = r2.resourceId     // Catch:{ Exception -> 0x002f }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)     // Catch:{ Exception -> 0x002f }
            if (r0 == 0) goto L_0x002f
            goto L_0x0039
        L_0x002f:
            r1 = 2130971100(0x7f0409dc, float:1.7550929E38)
            r0 = 2131102840(0x7f060c78, float:1.781813E38)
            int r3 = X.AnonymousClass5Yj.A02(r5, r1, r0)
        L_0x0039:
            androidx.appcompat.widget.Toolbar r1 = r6.A06
            boolean r0 = r1 instanceof X.AnonymousClass578
            r2 = 0
            if (r0 == 0) goto L_0x0059
            X.578 r1 = (X.AnonymousClass578) r1
            X.5Z7 r0 = r1.A08
            X.5IC r1 = r0.A00
            if (r1 == 0) goto L_0x0059
            X.579 r0 = X.AnonymousClass579.A00
            boolean r0 = r1.equals(r0)
            X.C107405bG.A0C(r4, r0)
        L_0x0051:
            int r0 = X.AnonymousClass0Y8.A04(r5, r3)
            X.AnonymousClass5CQ.A00(r4, r0, r2)
            return
        L_0x0059:
            X.C107405bG.A0C(r4, r2)
            goto L_0x0051
        L_0x005d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.wds.components.search.WDSSearchBar.A00():void");
    }

    public final void A01() {
        int A0B;
        int i;
        if (isAttachedToWindow()) {
            WDSSearchView wDSSearchView = this.A07;
            wDSSearchView.setVisibility(0);
            wDSSearchView.A01();
            View findViewById = this.A06.findViewById(R.id.menuitem_search);
            if (findViewById != null) {
                int[] iArr = new int[2];
                findViewById.getLocationInWindow(iArr);
                if (C620733j.A04(getWhatsAppLocale())) {
                    A0B = (getWidth() - iArr[0]) - C86664Kz.A0E(findViewById, 2);
                } else {
                    A0B = iArr[0] + C86664Kz.A0E(findViewById, 2);
                }
            } else {
                A0B = C86664Kz.A0B(this);
            }
            this.A00 = A0B;
            int A0C = AnonymousClass001.A0C(wDSSearchView.getWidth(), this.A00, A0B);
            if (C620733j.A04(getWhatsAppLocale())) {
                i = wDSSearchView.getWidth() - this.A00;
            } else {
                i = this.A00;
            }
            AnonymousClass67L.A00(C86654Ky.A0A(wDSSearchView, i, getHeight() / 2, 0.0f, (float) A0C), this, 33);
            Activity activity = getActivity();
            if (activity != null) {
                Window window = activity.getWindow();
                Context context = window.getContext();
                int i2 = getStyle().A00;
                if (C107385bE.A02()) {
                    C107405bG.A0A(context, window, i2);
                } else {
                    AnonymousClass5CQ.A00(window, AnonymousClass0Y8.A04(context, i2), false);
                }
            }
        }
    }

    public Parcelable onSaveInstanceState() {
        Bundle A08 = AnonymousClass002.A08();
        A08.putCharSequence("search_text", this.A07.A09.getText());
        A08.putInt("search_button_x_pos", this.A00);
        A08.putParcelable("superState", super.onSaveInstanceState());
        return A08;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public WDSSearchBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C162457s7.A0J(context, 1);
        if (!this.A05) {
            this.A05 = true;
            this.A01 = C88864av.A02((C111685iW) generatedComponent());
        }
        this.A03 = C141366vS.NORMAL;
        View.inflate(context, R.layout.f8nameremoved, this);
        WDSSearchView wDSSearchView = (WDSSearchView) C18290x4.A0M(this, R.id.wds_search_view);
        this.A07 = wDSSearchView;
        this.A06 = (Toolbar) C18290x4.A0M(this, R.id.toolbar);
        if (attributeSet != null) {
            TypedArray A0X = C86664Kz.A0X(context, attributeSet, C1462679k.A0A);
            if (A0X.getResourceId(0, 0) != 0) {
                wDSSearchView.setHint((CharSequence) A0X.getString(1));
            }
            setVariant(AnonymousClass75T.A00(A0X.getInt(4, 0)));
            this.A02 = new AnonymousClass5Q8(C18290x4.A0F(this), this.A03);
            this.A07.setVariant(this.A03);
            wDSSearchView.setTrailingButtonIconWithEnumIndex$wds_consumerBeta(A0X.getInt(3, -1));
            A0X.recycle();
        }
        C18320x8.A14(wDSSearchView.A07, this, 20);
        if (!C86604Kt.A1Y(this.A07)) {
            A00();
        }
    }
}
