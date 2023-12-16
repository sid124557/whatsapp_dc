package com.whatsapp.registration;

import X.AnonymousClass0x9;
import X.AnonymousClass1Ha;
import X.AnonymousClass4HY;
import X.AnonymousClass9U4;
import X.C106715a2;
import X.C116985rC;
import X.C162457s7;
import X.C18270x1;
import X.C1907099n;
import X.C40532Gt;
import X.C88834as;
import X.C89644eZ;
import android.content.res.Configuration;
import android.view.View;
import android.widget.ScrollView;

public final class ChangeNumberOverview extends C89644eZ {
    public int A00;
    public View A01;
    public ScrollView A02;
    public C116985rC A03;
    public C40532Gt A04;
    public C1907099n A05;
    public AnonymousClass9U4 A06;
    public C106715a2 A07;
    public boolean A08;

    public void onConfigurationChanged(Configuration configuration) {
        C162457s7.A0J(configuration, 0);
        super.onConfigurationChanged(configuration);
        ScrollView scrollView = this.A02;
        if (scrollView == null) {
            throw C18270x1.A0S("scrollView");
        }
        AnonymousClass1Ha.A1y(scrollView.getViewTreeObserver(), this, 3);
    }

    public void A5r() {
        if (!this.A08) {
            this.A08 = true;
            ((C88834as) AnonymousClass0x9.A0K(this)).ADo(this);
        }
    }

    public final void A74() {
        float f;
        ScrollView scrollView = this.A02;
        if (scrollView == null) {
            throw C18270x1.A0S("scrollView");
        }
        boolean canScrollVertically = scrollView.canScrollVertically(1);
        View view = this.A01;
        if (canScrollVertically) {
            if (view == null) {
                throw C18270x1.A0S("bottomButtonContainer");
            }
            f = (float) this.A00;
        } else if (view == null) {
            throw C18270x1.A0S("bottomButtonContainer");
        } else {
            f = 0.0f;
        }
        view.setElevation(f);
    }

    public ChangeNumberOverview(int i) {
        this.A08 = false;
        AnonymousClass4HY.A00(this, 103);
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x00ba  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x00ce  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r5) {
        /*
            r4 = this;
            super.onCreate(r5)
            r0 = 2131887595(0x7f1205eb, float:1.9409802E38)
            X.0R8 r1 = X.AnonymousClass1Ha.A1l(r4, r0)
            X.C626936e.A06(r1)
            r0 = 1
            r1.A0N(r0)
            r1.A0O(r0)
            r0 = 2131624334(0x7f0e018e, float:1.8875845E38)
            r4.setContentView((int) r0)
            android.view.View r1 = r4.A00
            r0 = 2131433256(0x7f0b1728, float:1.8488293E38)
            android.view.View r0 = X.C18280x3.A0E(r1, r0)
            android.widget.ScrollView r0 = (android.widget.ScrollView) r0
            r4.A02 = r0
            android.view.View r1 = r4.A00
            r0 = 2131428112(0x7f0b0310, float:1.847786E38)
            android.view.View r0 = X.C18280x3.A0E(r1, r0)
            r4.A01 = r0
            X.99n r0 = r4.A05
            if (r0 == 0) goto L_0x00f8
            boolean r3 = r0.A02()
            if (r3 == 0) goto L_0x00c2
            X.99n r0 = r4.A05
            if (r0 == 0) goto L_0x00f0
            boolean r0 = r0.A09()
            if (r0 == 0) goto L_0x00c2
            r0 = 2131428664(0x7f0b0538, float:1.8478979E38)
            android.view.View r0 = r4.findViewById(r0)
            r2 = 0
            r0.setVisibility(r2)
            r0 = 2131428663(0x7f0b0537, float:1.8478977E38)
            X.AnonymousClass1Ha.A20(r4, r0)
            r0 = 2131428661(0x7f0b0535, float:1.8478973E38)
            android.view.View r1 = X.C18290x4.A0N(r4, r0)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r0 = 2131887580(0x7f1205dc, float:1.9409771E38)
            java.lang.String r0 = X.C18290x4.A0l(r4, r0)
            X.AnonymousClass1Ha.A1v(r4, r1, r0)
            r0 = 2131428662(0x7f0b0536, float:1.8478975E38)
            android.widget.TextView r1 = X.C18310x6.A0L(r4, r0)
            r1.setVisibility(r2)
            r0 = 2131887581(0x7f1205dd, float:1.9409773E38)
            java.lang.String r0 = X.C18290x4.A0l(r4, r0)
            X.AnonymousClass1Ha.A1v(r4, r1, r0)
            r0 = 2131428665(0x7f0b0539, float:1.847898E38)
            android.view.View r1 = X.C18290x4.A0N(r4, r0)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r0 = 2131887554(0x7f1205c2, float:1.9409718E38)
            java.lang.String r0 = X.C18290x4.A0l(r4, r0)
            X.AnonymousClass1Ha.A1v(r4, r1, r0)
            r0 = 2131428666(0x7f0b053a, float:1.8478983E38)
            android.view.View r1 = X.C18290x4.A0N(r4, r0)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r0 = 2131887555(0x7f1205c3, float:1.940972E38)
            java.lang.String r0 = X.C18290x4.A0l(r4, r0)
            X.AnonymousClass1Ha.A1v(r4, r1, r0)
        L_0x00a4:
            r0 = 2131431813(0x7f0b1185, float:1.8485366E38)
            android.view.View r1 = r4.findViewById(r0)
            r0 = 20
            X.AnonymousClass0x2.A0y(r1, r4, r0)
            int r0 = X.AnonymousClass1Ha.A1i(r4)
            r4.A00 = r0
            android.widget.ScrollView r0 = r4.A02
            if (r0 != 0) goto L_0x00ce
            java.lang.String r0 = "scrollView"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x00c2:
            X.4FS r2 = r4.A04
            r1 = 7
            X.3bz r0 = new X.3bz
            r0.<init>(r1, r4, r3)
            r2.BkM(r0)
            goto L_0x00a4
        L_0x00ce:
            android.view.ViewTreeObserver r2 = r0.getViewTreeObserver()
            r1 = 4
            X.4Hy r0 = new X.4Hy
            r0.<init>(r4, r1)
            r2.addOnScrollChangedListener(r0)
            android.widget.ScrollView r0 = r4.A02
            if (r0 != 0) goto L_0x00e7
            java.lang.String r0 = "scrollView"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x00e7:
            android.view.ViewTreeObserver r1 = r0.getViewTreeObserver()
            r0 = 3
            X.AnonymousClass1Ha.A1y(r1, r4, r0)
            return
        L_0x00f0:
            java.lang.String r0 = "paymentsGatingManager"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x00f8:
            java.lang.String r0 = "paymentsGatingManager"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.registration.ChangeNumberOverview.onCreate(android.os.Bundle):void");
    }

    public ChangeNumberOverview() {
        this(0);
    }
}
