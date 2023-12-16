package com.whatsapp.newsletter.ui.multiadmin;

import X.AnonymousClass0x7;
import X.AnonymousClass0x9;
import X.AnonymousClass21J;
import X.AnonymousClass340;
import X.AnonymousClass58H;
import X.AnonymousClass5BO;
import X.AnonymousClass5QK;
import X.AnonymousClass5ZU;
import X.AnonymousClass66R;
import X.AnonymousClass68T;
import X.C103615Nr;
import X.C124186Bh;
import X.C141996wT;
import X.C154517dI;
import X.C162457s7;
import X.C18270x1;
import X.C18290x4;
import X.C18300x5;
import X.C56612sH;
import X.C56662sM;
import X.C620633i;
import X.C64773Ex;
import X.C69263Wi;
import X.C80893yy;
import X.C80903yz;
import X.C84004Aq;
import X.C84024As;
import X.C86654Ky;
import X.C95804uY;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.R;
import com.whatsapp.WaImageView;
import com.whatsapp.WaTextView;
import com.whatsapp.jid.UserJid;
import com.whatsapp.wds.components.button.WDSButton;
import java.util.List;

public final class NewsletterRevokeAdminInviteSheet extends Hilt_NewsletterRevokeAdminInviteSheet implements C84004Aq, C84024As {
    public C69263Wi A00;
    public WaImageView A01;
    public WaImageView A02;
    public WaTextView A03;
    public WaTextView A04;
    public C64773Ex A05;
    public AnonymousClass5ZU A06;
    public C620633i A07;
    public C56612sH A08;
    public C56662sM A09;
    public AnonymousClass5QK A0A;
    public C103615Nr A0B;
    public WDSButton A0C;
    public WDSButton A0D;
    public final AnonymousClass66R A0E;
    public final AnonymousClass66R A0F = AnonymousClass340.A01(this, "invite_expiration_ts");
    public final AnonymousClass66R A0G;
    public final AnonymousClass66R A0H = AnonymousClass340.A02(this, "newsletter_name");

    public View A0K(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C162457s7.A0J(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.f8nameremoved, viewGroup);
        this.A02 = AnonymousClass0x9.A0L(inflate, R.id.nl_image);
        this.A04 = AnonymousClass0x7.A0L(inflate, R.id.admin_invite_title);
        this.A03 = AnonymousClass0x7.A0L(inflate, R.id.expire_text);
        this.A0C = C86654Ky.A0f(inflate, R.id.primary_button);
        this.A0D = C86654Ky.A0f(inflate, R.id.view_newsletter_button);
        this.A01 = AnonymousClass0x9.A0L(inflate, R.id.close_button);
        return inflate;
    }

    public void A0c() {
        this.A04 = null;
        this.A03 = null;
        this.A01 = null;
        super.A0c();
    }

    public void A0w(Bundle bundle, View view) {
        C162457s7.A0J(view, 0);
        super.A0w(bundle, view);
        WaTextView waTextView = this.A04;
        if (waTextView != null) {
            waTextView.setText(AnonymousClass0x9.A13(this.A0H));
        }
        WaTextView waTextView2 = this.A03;
        if (waTextView2 != null) {
            C56612sH r2 = this.A08;
            if (r2 != null) {
                AnonymousClass5BO.A00(waTextView2, r2, C18290x4.A0D(this.A0F));
            } else {
                throw C18270x1.A0S("time");
            }
        }
        WDSButton wDSButton = this.A0C;
        if (wDSButton != null) {
            wDSButton.setText(R.string.f11nameremoved);
            wDSButton.setAction(C141996wT.DESTRUCTIVE);
            C18300x5.A19(wDSButton, this, 35);
        }
        WaImageView waImageView = this.A01;
        if (waImageView != null) {
            C18300x5.A19(waImageView, this, 36);
        }
        C103615Nr r1 = this.A0B;
        if (r1 != null) {
            C95804uY r3 = (C95804uY) this.A0G.getValue();
            WaImageView waImageView2 = this.A02;
            if (r3 != null && waImageView2 != null) {
                r1.A03.A00(r3, new C124186Bh(waImageView2, 1, r1), (String) null, true, true);
                return;
            }
            return;
        }
        throw C18270x1.A0S("newsletterAdminInviteSheetPhotoLoader");
    }

    public void Bae(UserJid userJid) {
        C162457s7.A0J(userJid, 0);
        C95804uY r3 = (C95804uY) this.A0G.getValue();
        if (r3 != null) {
            AnonymousClass5QK r2 = this.A0A;
            if (r2 != null) {
                r2.A00(r3, userJid, new AnonymousClass68T(this, 1));
                return;
            }
            throw C18270x1.A0S("newsletterAdminInvitationHandler");
        }
    }

    public void Bek(AnonymousClass21J r3, String str, List list) {
        C18270x1.A14(list, r3);
        if (r3 == AnonymousClass21J.REVOKE) {
            Bae((UserJid) list.get(0));
        }
    }

    public NewsletterRevokeAdminInviteSheet() {
        AnonymousClass58H r1 = AnonymousClass58H.NONE;
        this.A0G = C154517dI.A00(r1, new C80893yy(this));
        this.A0E = C154517dI.A00(r1, new C80903yz(this));
    }
}
