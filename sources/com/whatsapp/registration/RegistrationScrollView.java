package com.whatsapp.registration;

import X.AnonymousClass4GJ;
import X.AnonymousClass5CP;
import X.AnonymousClass698;
import X.C110025fZ;
import X.C116855qy;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import com.whatsapp.WaTextView;

public class RegistrationScrollView extends ScrollView implements AnonymousClass4GJ {
    public View A00;
    public View A01;
    public ViewTreeObserver.OnGlobalLayoutListener A02;
    public LinearLayout A03;
    public WaTextView A04;
    public C116855qy A05;
    public boolean A06;
    public boolean A07;
    public final float A08;
    public final ViewTreeObserver.OnScrollChangedListener A09;

    public void setTopAndBottomScrollingElevation(LinearLayout linearLayout, WaTextView waTextView, View view, View view2) {
        this.A03 = linearLayout;
        this.A04 = waTextView;
        this.A01 = view;
        View view3 = view2;
        this.A00 = view2;
        this.A02 = new C110025fZ(view3, view, linearLayout, waTextView, this);
        getViewTreeObserver().addOnGlobalLayoutListener(this.A02);
    }

    public final Object generatedComponent() {
        C116855qy r0 = this.A05;
        if (r0 == null) {
            r0 = C116855qy.A00(this);
            this.A05 = r0;
        }
        return r0.generatedComponent();
    }

    public RegistrationScrollView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        if (!this.A07) {
            this.A07 = true;
            generatedComponent();
        }
        this.A08 = AnonymousClass5CP.A00(getContext());
        this.A09 = new AnonymousClass698(this, 3);
    }

    public RegistrationScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (!this.A07) {
            this.A07 = true;
            generatedComponent();
        }
        this.A08 = AnonymousClass5CP.A00(getContext());
        this.A09 = new AnonymousClass698(this, 3);
    }

    public RegistrationScrollView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet);
        if (!this.A07) {
            this.A07 = true;
            generatedComponent();
        }
    }

    public RegistrationScrollView(Context context) {
        super(context);
        if (!this.A07) {
            this.A07 = true;
            generatedComponent();
        }
        this.A08 = AnonymousClass5CP.A00(getContext());
        this.A09 = new AnonymousClass698(this, 3);
    }
}
