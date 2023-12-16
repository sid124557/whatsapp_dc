package com.whatsapp.camera.mode;

import X.AnonymousClass001;
import X.AnonymousClass0YH;
import X.AnonymousClass4GJ;
import X.AnonymousClass4Qc;
import X.AnonymousClass5T2;
import X.AnonymousClass6C2;
import X.C111685iW;
import X.C116855qy;
import X.C162457s7;
import X.C179188ik;
import X.C18270x1;
import X.C18280x3;
import X.C620633i;
import X.C620733j;
import X.C86664Kz;
import X.C88864av;
import android.content.Context;
import android.util.AttributeSet;
import com.google.android.material.tabs.TabLayout;
import com.whatsapp.R;

public final class CameraModeTabLayout extends TabLayout implements AnonymousClass4GJ {
    public C179188ik A00;
    public C620633i A01;
    public C620733j A02;
    public C116855qy A03;
    public boolean A04;
    public final AnonymousClass5T2 A05;
    public final AnonymousClass5T2 A06;

    public final void setSystemServices(C620633i r2) {
        C162457s7.A0J(r2, 0);
        this.A01 = r2;
    }

    public final void setWhatsAppLocale(C620733j r2) {
        C162457s7.A0J(r2, 0);
        this.A02 = r2;
    }

    public final Object generatedComponent() {
        C116855qy r0 = this.A03;
        if (r0 == null) {
            r0 = C116855qy.A00(this);
            this.A03 = r0;
        }
        return r0.generatedComponent();
    }

    public final C179188ik getCameraModeTabLayoutListener() {
        return this.A00;
    }

    public final AnonymousClass5T2 getPhotoModeTab() {
        return this.A05;
    }

    public final C620633i getSystemServices() {
        C620633i r0 = this.A01;
        if (r0 != null) {
            return r0;
        }
        throw C18270x1.A0S("systemServices");
    }

    public final AnonymousClass5T2 getVideoModeTab() {
        return this.A06;
    }

    public final C620733j getWhatsAppLocale() {
        C620733j r0 = this.A02;
        if (r0 != null) {
            return r0;
        }
        throw C18270x1.A0S("whatsAppLocale");
    }

    public CameraModeTabLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        if (!this.A04) {
            this.A04 = true;
            ((C88864av) ((C111685iW) generatedComponent())).A4T(this);
        }
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        super.onLayout(z, i, i2, i3, i4);
        AnonymousClass5T2 A052 = A05(0);
        C162457s7.A0H(A052);
        AnonymousClass4Qc r2 = A052.A02;
        C162457s7.A0C(r2);
        AnonymousClass5T2 A053 = A05(C86664Kz.A0M(this.A0k));
        C162457s7.A0H(A053);
        AnonymousClass4Qc r4 = A053.A02;
        C162457s7.A0C(r4);
        AnonymousClass0YH.A07(getChildAt(0), (getWidth() - r2.getWidth()) / 2, 0, (getWidth() - r4.getWidth()) / 2, 0);
        AnonymousClass5T2 r22 = this.A05;
        TabLayout tabLayout = r22.A03;
        if (tabLayout != null) {
            int selectedTabPosition = tabLayout.getSelectedTabPosition();
            if (selectedTabPosition != -1 && selectedTabPosition == (i5 = r22.A00)) {
                A0A(0.0f, i5, false, true);
                return;
            }
            return;
        }
        throw AnonymousClass001.A0c("Tab not attached to a TabLayout");
    }

    public final void setCameraModeTabLayoutListener(C179188ik r1) {
        this.A00 = r1;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CameraModeTabLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C162457s7.A0J(context, 1);
        if (!this.A04) {
            this.A04 = true;
            ((C88864av) ((C111685iW) generatedComponent())).A4T(this);
        }
        AnonymousClass5T2 A042 = A04();
        A042.A01(R.string.f11nameremoved);
        A042.A06 = C18280x3.A0S();
        this.A06 = A042;
        AnonymousClass5T2 A043 = A04();
        A043.A01(R.string.f11nameremoved);
        A043.A06 = 1;
        this.A05 = A043;
        A0E(A042);
        A0F(A043, this.A0k.size(), true);
        A0D(new AnonymousClass6C2(this, 1));
    }
}
