package com.whatsapp.wds.components.search;

import X.AnonymousClass0RP;
import X.AnonymousClass0Y9;
import X.AnonymousClass0YY;
import X.AnonymousClass4GJ;
import X.AnonymousClass4GQ;
import X.AnonymousClass5Q8;
import X.AnonymousClass636;
import X.AnonymousClass68Y;
import X.AnonymousClass6C1;
import X.AnonymousClass75T;
import X.C116855qy;
import X.C140036t3;
import X.C140046t4;
import X.C140056t5;
import X.C141366vS;
import X.C1462679k;
import X.C147557Et;
import X.C162457s7;
import X.C18270x1;
import X.C18290x4;
import X.C18300x5;
import X.C183518qA;
import X.C1892090k;
import X.C1896892g;
import X.C620633i;
import X.C64333Db;
import X.C86634Kw;
import X.C86644Kx;
import X.C86664Kz;
import X.C88864av;
import android.content.Context;
import android.content.res.TypedArray;
import android.text.Editable;
import android.util.AttributeSet;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import com.whatsapp.R;
import com.whatsapp.WaEditText;
import com.whatsapp.WaImageButton;

public final class WDSSearchView extends FrameLayout implements AnonymousClass4GJ {
    public C620633i A00;
    public C147557Et A01;
    public AnonymousClass5Q8 A02;
    public C141366vS A03;
    public C116855qy A04;
    public String A05;
    public boolean A06;
    public final ImageButton A07;
    public final LinearLayout A08;
    public final WaEditText A09;
    public final WaImageButton A0A;

    public static final void setUpTrailingButtonIcon$lambda$4$lambda$3(WDSSearchView wDSSearchView, View view) {
        C162457s7.A0J(wDSSearchView, 0);
        C147557Et r1 = wDSSearchView.A01;
        if (C162457s7.A0P(r1, C140036t3.A00)) {
            C86634Kw.A1I(wDSSearchView.A09);
            return;
        }
        C140056t5 r2 = C140056t5.A00;
        boolean A0P = C162457s7.A0P(r1, r2);
        WaEditText waEditText = wDSSearchView.A09;
        if (A0P) {
            waEditText.setInputType(1);
            wDSSearchView.setTrailingButtonIcon(C140046t4.A00);
            return;
        }
        waEditText.setInputType(3);
        wDSSearchView.setTrailingButtonIcon(r2);
    }

    public final void setOnQueryTextSubmitListener(AnonymousClass4GQ r4) {
        C162457s7.A0J(r4, 0);
        WaEditText waEditText = this.A09;
        waEditText.setImeOptions(3);
        waEditText.setOnEditorActionListener(new AnonymousClass68Y(r4, 7));
    }

    public final void setTrailingButtonIconWithEnumIndex$wds_consumerBeta(int i) {
        C147557Et r0;
        if (i != -1) {
            if (i == 0) {
                r0 = C140036t3.A00;
            } else if (i == 1) {
                r0 = C140046t4.A00;
            } else if (i == 2) {
                r0 = C140056t5.A00;
            }
            setTrailingButtonIcon(r0);
        }
        r0 = null;
        setTrailingButtonIcon(r0);
    }

    public final void setVariant(C141366vS r2) {
        C162457s7.A0J(r2, 0);
        boolean A1W = C18300x5.A1W(this.A03, r2);
        this.A03 = r2;
        if (A1W) {
            A00();
        }
    }

    public final void A01() {
        InputMethodManager A0Q;
        C620633i r0 = this.A00;
        if (r0 != null && (A0Q = r0.A0Q()) != null && !A0Q.isFullscreenMode()) {
            WaEditText waEditText = this.A09;
            if (A0Q.isActive(waEditText)) {
                A0Q.showSoftInput(waEditText, 0);
            } else {
                waEditText.requestFocus();
            }
        }
    }

    public final Object generatedComponent() {
        C116855qy r0 = this.A04;
        if (r0 == null) {
            r0 = C116855qy.A00(this);
            this.A04 = r0;
        }
        return r0.generatedComponent();
    }

    public final ImageButton getBackButton() {
        return this.A07;
    }

    public final C620633i getSystemServices() {
        return this.A00;
    }

    public final Editable getText() {
        return this.A09.getText();
    }

    public final C147557Et getTrailingButtonIcon() {
        return this.A01;
    }

    public final C141366vS getVariant() {
        return this.A03;
    }

    public final void setBackImageDrawableRes(int i) {
        ImageButton imageButton = this.A07;
        AnonymousClass5Q8 r1 = this.A02;
        if (r1 == null) {
            throw C18270x1.A0S("style");
        }
        imageButton.setImageDrawable(r1.A00(C86644Kx.A0C(this, i)));
    }

    public final void setHint(int i) {
        this.A09.setHint(i);
    }

    public final void setOnQueryTextChangeListener(C183518qA r5) {
        this.A09.addTextChangedListener(new C1896892g(new AnonymousClass636(r5, this), 2));
    }

    public final void setText(int i) {
        this.A09.setText(i);
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0040  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x005d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void setTrailingButtonIcon(X.C147557Et r5) {
        /*
            r4 = this;
            r4.A01 = r5
            if (r5 == 0) goto L_0x0074
            X.6t3 r0 = X.C140036t3.A00
            boolean r0 = r5.equals(r0)
            r2 = 1
            r1 = 0
            if (r0 == 0) goto L_0x005a
            com.whatsapp.WaEditText r0 = r4.A09
            android.text.Editable r0 = r0.getText()
            if (r0 == 0) goto L_0x001c
            int r0 = r0.length()
            if (r0 != 0) goto L_0x005a
        L_0x001c:
            com.whatsapp.WaImageButton r3 = r4.A0A
            r1 = 4
        L_0x001f:
            r3.setVisibility(r1)
            X.7Et r1 = r4.A01
            X.6t5 r0 = X.C140056t5.A00
            boolean r0 = X.C162457s7.A0P(r1, r0)
            if (r0 == 0) goto L_0x0047
            com.whatsapp.WaEditText r1 = r4.A09
            r0 = 3
            r1.setInputType(r0)
            r1 = 2131886125(0x7f12002d, float:1.940682E38)
        L_0x0035:
            android.content.Context r0 = r3.getContext()
            X.C18300x5.A13(r0, r3, r1)
        L_0x003c:
            X.5Q8 r2 = r4.A02
            if (r2 != 0) goto L_0x005d
            java.lang.String r0 = "style"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x0047:
            X.7Et r1 = r4.A01
            X.6t4 r0 = X.C140046t4.A00
            boolean r0 = X.C162457s7.A0P(r1, r0)
            if (r0 == 0) goto L_0x003c
            com.whatsapp.WaEditText r0 = r4.A09
            r0.setInputType(r2)
            r1 = 2131886124(0x7f12002c, float:1.9406818E38)
            goto L_0x0035
        L_0x005a:
            com.whatsapp.WaImageButton r3 = r4.A0A
            goto L_0x001f
        L_0x005d:
            android.content.Context r1 = r4.getContext()
            int r0 = r5.A00
            android.graphics.drawable.Drawable r0 = X.AnonymousClass0VX.A01(r1, r0)
            android.graphics.drawable.Drawable r0 = r2.A00(r0)
            r3.setImageDrawable(r0)
            r0 = 21
            X.C18320x8.A14(r3, r4, r0)
            return
        L_0x0074:
            com.whatsapp.WaImageButton r1 = r4.A0A
            r0 = 8
            r1.setVisibility(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.wds.components.search.WDSSearchView.setTrailingButtonIcon(X.7Et):void");
    }

    public WDSSearchView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        if (!this.A06) {
            this.A06 = true;
            this.A00 = C64333Db.A2o(C88864av.A00(generatedComponent()));
        }
    }

    public final void A00() {
        AnonymousClass5Q8 r0 = new AnonymousClass5Q8(C18290x4.A0F(this), this.A03);
        this.A02 = r0;
        AnonymousClass0YY.A04(AnonymousClass0RP.A00(r0.A02, r0.A00), this);
        LinearLayout linearLayout = this.A08;
        AnonymousClass5Q8 r02 = this.A02;
        if (r02 == null) {
            throw C18270x1.A0S("style");
        }
        AnonymousClass0YY.A04(r02.A01(), linearLayout);
    }

    public final void setSystemServices(C620633i r1) {
        this.A00 = r1;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public WDSSearchView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C162457s7.A0J(context, 1);
        if (!this.A06) {
            this.A06 = true;
            this.A00 = C64333Db.A2o(C88864av.A00(generatedComponent()));
        }
        this.A05 = "";
        this.A03 = C141366vS.NORMAL;
        View.inflate(context, R.layout.f8nameremoved, this);
        this.A0A = (WaImageButton) C18290x4.A0M(this, R.id.trailing_button);
        this.A09 = (WaEditText) C18290x4.A0M(this, R.id.search_src_text);
        ImageButton imageButton = (ImageButton) C18290x4.A0M(this, R.id.back);
        this.A07 = imageButton;
        this.A08 = (LinearLayout) C18290x4.A0M(this, R.id.backgroundHolder);
        if (attributeSet != null) {
            TypedArray A0X = C86664Kz.A0X(context, attributeSet, C1462679k.A0B);
            if (A0X.getResourceId(1, 0) != 0) {
                setHint((CharSequence) A0X.getString(1));
            }
            if (A0X.getResourceId(0, 0) != 0) {
                setText((CharSequence) A0X.getString(1));
            }
            setTrailingButtonIconWithEnumIndex$wds_consumerBeta(A0X.getInt(2, -1));
            setVariant(AnonymousClass75T.A00(A0X.getInt(3, 0)));
            A0X.recycle();
        }
        A00();
        WaEditText waEditText = this.A09;
        if (this.A02 == null) {
            throw C18270x1.A0S("style");
        }
        AnonymousClass0Y9.A06(waEditText, R.style.f12nameremoved);
        waEditText.addTextChangedListener(new AnonymousClass6C1(this, 4));
        waEditText.setOnFocusChangeListener(new C1892090k(this, 8));
        AnonymousClass5Q8 r1 = this.A02;
        if (r1 == null) {
            throw C18270x1.A0S("style");
        }
        imageButton.setImageDrawable(r1.A00(AnonymousClass0RP.A00(context, R.drawable.ic_back)));
    }

    public final void setHint(CharSequence charSequence) {
        this.A09.setHint(charSequence);
    }

    public final void setText(CharSequence charSequence) {
        this.A09.setText(charSequence);
    }
}
