package com.whatsapp.newsletter.multiadmin;

import X.AnonymousClass29z;
import X.AnonymousClass5M3;
import X.C107695bk;
import X.C18270x1;
import X.C18320x8;
import X.C56662sM;
import X.C64333Db;
import X.C86614Ku;
import X.C88854au;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import com.whatsapp.base.WaFragment;

public abstract class Hilt_NewsletterInvitedAdminsFragment extends WaFragment {
    public ContextWrapper A00;
    public boolean A01;
    public boolean A02 = false;

    public void A1H() {
        if (!this.A02) {
            this.A02 = true;
            NewsletterInvitedAdminsFragment newsletterInvitedAdminsFragment = (NewsletterInvitedAdminsFragment) this;
            C88854au r3 = (C88854au) C18320x8.A0E(this);
            C64333Db r1 = r3.A1B;
            C107695bk.AFP(r1.A00, newsletterInvitedAdminsFragment);
            newsletterInvitedAdminsFragment.A04 = C64333Db.A29(r1);
            newsletterInvitedAdminsFragment.A03 = C64333Db.A28(r1);
            newsletterInvitedAdminsFragment.A05 = C64333Db.A2t(r1);
            newsletterInvitedAdminsFragment.A01 = C86614Ku.A0N(r1);
            newsletterInvitedAdminsFragment.A00 = (AnonymousClass5M3) r3.A18.A3y.get();
            newsletterInvitedAdminsFragment.A06 = (C56662sM) r1.AaX.get();
            newsletterInvitedAdminsFragment.A02 = C64333Db.A26(r1);
        }
    }

    public final void A1I() {
        if (this.A00 == null) {
            this.A00 = C18320x8.A0T(super.A1D(), this);
            this.A01 = AnonymousClass29z.A00(super.A1D());
        }
    }

    public Context A1D() {
        if (super.A1D() == null && !this.A01) {
            return null;
        }
        A1I();
        return this.A00;
    }

    public LayoutInflater A1E(Bundle bundle) {
        return C18270x1.A06(super.A1E(bundle), this);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000c, code lost:
        if (r1 == r3) goto L_0x000e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A1F(android.app.Activity r3) {
        /*
            r2 = this;
            super.A1F(r3)
            android.content.ContextWrapper r0 = r2.A00
            if (r0 == 0) goto L_0x000e
            android.content.Context r1 = X.C116885r1.A00(r0)
            r0 = 0
            if (r1 != r3) goto L_0x000f
        L_0x000e:
            r0 = 1
        L_0x000f:
            X.AnonymousClass2A2.A01(r0)
            r2.A1I()
            r2.A1H()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.newsletter.multiadmin.Hilt_NewsletterInvitedAdminsFragment.A1F(android.app.Activity):void");
    }

    public void A1G(Context context) {
        super.A1G(context);
        A1I();
        A1H();
    }
}
