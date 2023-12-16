package com.whatsapp.newsletter.ui.multiadmin;

import X.AnonymousClass29z;
import X.AnonymousClass5QK;
import X.C103615Nr;
import X.C107695bk;
import X.C18270x1;
import X.C18310x6;
import X.C18320x8;
import X.C56662sM;
import X.C64333Db;
import X.C88854au;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import com.whatsapp.wds.components.bottomsheet.WDSBottomSheetDialogFragment;

public abstract class Hilt_NewsletterRevokeAdminInviteSheet extends WDSBottomSheetDialogFragment {
    public ContextWrapper A00;
    public boolean A01;
    public boolean A02 = false;

    private void A00() {
        if (this.A00 == null) {
            this.A00 = C18320x8.A0T(super.A1D(), this);
            this.A01 = AnonymousClass29z.A00(super.A1D());
        }
    }

    public void A1R() {
        if (!this.A02) {
            this.A02 = true;
            NewsletterRevokeAdminInviteSheet newsletterRevokeAdminInviteSheet = (NewsletterRevokeAdminInviteSheet) this;
            C64333Db r2 = ((C88854au) C18310x6.A0O(this)).A1B;
            C107695bk r1 = r2.A00;
            C107695bk.AFg(r1, newsletterRevokeAdminInviteSheet);
            newsletterRevokeAdminInviteSheet.A08 = C64333Db.A2p(r2);
            newsletterRevokeAdminInviteSheet.A0A = (AnonymousClass5QK) r1.A7w.get();
            newsletterRevokeAdminInviteSheet.A00 = C64333Db.A04(r2);
            newsletterRevokeAdminInviteSheet.A06 = C64333Db.A28(r2);
            newsletterRevokeAdminInviteSheet.A05 = C64333Db.A26(r2);
            newsletterRevokeAdminInviteSheet.A09 = (C56662sM) r2.AaX.get();
            newsletterRevokeAdminInviteSheet.A07 = C64333Db.A2o(r2);
            newsletterRevokeAdminInviteSheet.A0B = (C103615Nr) r1.A7y.get();
        }
    }

    public Context A1D() {
        if (super.A1D() == null && !this.A01) {
            return null;
        }
        A00();
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
            r2.A00()
            r2.A1R()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.newsletter.ui.multiadmin.Hilt_NewsletterRevokeAdminInviteSheet.A1F(android.app.Activity):void");
    }

    public void A1G(Context context) {
        super.A1G(context);
        A00();
        A1R();
    }
}
