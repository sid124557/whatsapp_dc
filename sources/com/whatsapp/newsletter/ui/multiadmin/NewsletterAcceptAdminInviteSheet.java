package com.whatsapp.newsletter.ui.multiadmin;

import X.AnonymousClass001;
import X.AnonymousClass0x2;
import X.AnonymousClass0x7;
import X.AnonymousClass0x9;
import X.AnonymousClass21J;
import X.AnonymousClass340;
import X.AnonymousClass495;
import X.AnonymousClass58H;
import X.AnonymousClass5BO;
import X.AnonymousClass5QK;
import X.AnonymousClass66R;
import X.AnonymousClass68S;
import X.C103605Nq;
import X.C103615Nr;
import X.C124186Bh;
import X.C136696n7;
import X.C154517dI;
import X.C162457s7;
import X.C18260x0;
import X.C18270x1;
import X.C18290x4;
import X.C18300x5;
import X.C56612sH;
import X.C56972sr;
import X.C69263Wi;
import X.C80883yx;
import X.C84004Aq;
import X.C86654Ky;
import X.C95804uY;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.R;
import com.whatsapp.WaImageView;
import com.whatsapp.WaTextView;
import com.whatsapp.newsletter.NewsletterLinkLauncher;
import com.whatsapp.wds.components.button.WDSButton;
import java.util.List;

public final class NewsletterAcceptAdminInviteSheet extends Hilt_NewsletterAcceptAdminInviteSheet implements C84004Aq {
    public C69263Wi A00;
    public C56972sr A01;
    public WaImageView A02;
    public WaImageView A03;
    public WaTextView A04;
    public WaTextView A05;
    public C56612sH A06;
    public NewsletterLinkLauncher A07;
    public AnonymousClass5QK A08;
    public C103615Nr A09;
    public WDSButton A0A;
    public WDSButton A0B;
    public final AnonymousClass66R A0C = AnonymousClass340.A01(this, "invite_expiration_ts");
    public final AnonymousClass66R A0D = AnonymousClass340.A00(this, "from_tos_accepted");
    public final AnonymousClass66R A0E = C154517dI.A00(AnonymousClass58H.NONE, new C80883yx(this));
    public final AnonymousClass66R A0F = AnonymousClass340.A02(this, "newsletter_name");

    public View A0K(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C162457s7.A0J(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.f8nameremoved, viewGroup);
        this.A03 = AnonymousClass0x9.A0L(inflate, R.id.nl_image);
        this.A05 = AnonymousClass0x7.A0L(inflate, R.id.admin_invite_title);
        this.A04 = AnonymousClass0x7.A0L(inflate, R.id.expire_text);
        this.A0A = C86654Ky.A0f(inflate, R.id.primary_button);
        this.A0B = C86654Ky.A0f(inflate, R.id.view_newsletter_button);
        this.A02 = AnonymousClass0x9.A0L(inflate, R.id.close_button);
        return inflate;
    }

    public void A0c() {
        this.A05 = null;
        this.A04 = null;
        this.A0A = null;
        this.A0B = null;
        this.A02 = null;
        super.A0c();
    }

    public void A0w(Bundle bundle, View view) {
        C162457s7.A0J(view, 0);
        super.A0w(bundle, view);
        WaTextView waTextView = this.A05;
        if (waTextView != null) {
            waTextView.setText(AnonymousClass0x9.A13(this.A0F));
        }
        WaTextView waTextView2 = this.A04;
        if (waTextView2 != null) {
            C56612sH r2 = this.A06;
            if (r2 != null) {
                AnonymousClass5BO.A00(waTextView2, r2, C18290x4.A0D(this.A0C));
            } else {
                throw C18270x1.A0S("time");
            }
        }
        AnonymousClass66R r22 = this.A0D;
        if (!C18270x1.A1V(r22)) {
            AnonymousClass0x2.A0M(view, R.id.hidden_additional_nux_bullets).A04().setVisibility(0);
        }
        WDSButton wDSButton = this.A0A;
        if (wDSButton != null) {
            wDSButton.setText(R.string.f11nameremoved);
            C18300x5.A19(wDSButton, this, 32);
        }
        WDSButton wDSButton2 = this.A0B;
        if (wDSButton2 != null) {
            wDSButton2.setVisibility(0);
            C18300x5.A19(wDSButton2, this, 33);
        }
        WaImageView waImageView = this.A02;
        if (waImageView != null) {
            C18300x5.A19(waImageView, this, 34);
        }
        C103615Nr r1 = this.A09;
        if (r1 != null) {
            C95804uY r4 = (C95804uY) this.A0E.getValue();
            WaImageView waImageView2 = this.A03;
            if (!(r4 == null || waImageView2 == null)) {
                r1.A03.A00(r4, new C124186Bh(waImageView2, 1, r1), (String) null, true, true);
            }
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("NewsletterAcceptAdminInviteSheet/fromTosAccepted: ");
            C18260x0.A1U(A0o, C18270x1.A1V(r22));
            return;
        }
        throw C18270x1.A0S("newsletterAdminInviteSheetPhotoLoader");
    }

    public void Bek(AnonymousClass21J r2, String str, List list) {
        C162457s7.A0J(r2, 1);
        if (r2 == AnonymousClass21J.ACCEPT_INVITE) {
            A1Y();
        }
    }

    public final C69263Wi A1X() {
        C69263Wi r0 = this.A00;
        if (r0 != null) {
            return r0;
        }
        throw C18270x1.A0S("globalUI");
    }

    public final void A1Y() {
        C136696n7 r1;
        C95804uY r6 = (C95804uY) this.A0E.getValue();
        if (r6 != null) {
            AnonymousClass5QK r5 = this.A08;
            if (r5 != null) {
                AnonymousClass68S r4 = new AnonymousClass68S(r6, 1, this);
                AnonymousClass495 r0 = r5.A00;
                if (r0 != null) {
                    r0.cancel();
                }
                r5.A01.A0G(R.string.f11nameremoved, R.string.f11nameremoved);
                C103605Nq r3 = r5.A03;
                C124186Bh r2 = new C124186Bh(r4, 0, r5);
                if (!C18300x5.A1S(r3.A03)) {
                    r1 = null;
                } else {
                    r1 = new C136696n7(r6, r2);
                    r3.A01.A02(r1);
                }
                r5.A00 = r1;
                return;
            }
            throw C18270x1.A0S("newsletterAdminInvitationHandler");
        }
    }
}
