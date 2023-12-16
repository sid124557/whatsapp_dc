package com.whatsapp.newsletter.multiadmin;

import X.AnonymousClass0x9;
import X.AnonymousClass3LQ;
import X.AnonymousClass58H;
import X.AnonymousClass66R;
import X.C06560Yg;
import X.C154517dI;
import X.C162457s7;
import X.C18270x1;
import X.C18280x3;
import X.C18300x5;
import X.C64773Ex;
import X.C80863yv;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.R;
import com.whatsapp.WaImageView;
import com.whatsapp.wds.components.button.WDSButton;

public final class NewsletterSendAdminInviteSheet extends Hilt_NewsletterSendAdminInviteSheet {
    public WaImageView A00;
    public C64773Ex A01;
    public AnonymousClass3LQ A02;
    public WDSButton A03;
    public WDSButton A04;
    public final AnonymousClass66R A05 = C154517dI.A00(AnonymousClass58H.NONE, new C80863yv(this));

    public View A0K(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C162457s7.A0J(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.f8nameremoved, viewGroup);
        this.A04 = (WDSButton) C06560Yg.A02(inflate, R.id.primary_button);
        this.A03 = (WDSButton) C06560Yg.A02(inflate, R.id.learn_more_button);
        this.A00 = AnonymousClass0x9.A0L(inflate, R.id.close_button);
        return inflate;
    }

    public void A0c() {
        this.A04 = null;
        this.A03 = null;
        this.A00 = null;
        super.A0c();
    }

    public void A0w(Bundle bundle, View view) {
        C162457s7.A0J(view, 0);
        super.A0w(bundle, view);
        WDSButton wDSButton = this.A04;
        if (wDSButton != null) {
            C18300x5.A19(wDSButton, this, 25);
        }
        WDSButton wDSButton2 = this.A03;
        if (wDSButton2 != null) {
            C18300x5.A19(wDSButton2, this, 26);
        }
        WaImageView waImageView = this.A00;
        if (waImageView != null) {
            C18300x5.A19(waImageView, this, 27);
        }
        C06560Yg.A02(C18280x3.A0E(view, R.id.nux_bullets), R.id.bullet_3).setVisibility(8);
    }

    public void A1K() {
        AnonymousClass3LQ r0 = this.A02;
        if (r0 != null) {
            r0.A00.A01("newsletter_multi_admin", (Object) null);
            super.A1K();
            return;
        }
        throw C18270x1.A0S("nuxManager");
    }
}
