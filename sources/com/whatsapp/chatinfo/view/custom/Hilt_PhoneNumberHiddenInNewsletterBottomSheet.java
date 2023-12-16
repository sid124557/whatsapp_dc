package com.whatsapp.chatinfo.view.custom;

import X.AnonymousClass29z;
import X.AnonymousClass3DY;
import X.C107695bk;
import X.C18270x1;
import X.C18310x6;
import X.C18320x8;
import X.C64333Db;
import X.C86604Kt;
import X.C88854au;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;

public abstract class Hilt_PhoneNumberHiddenInNewsletterBottomSheet extends PnhWithBulletsBottomSheet {
    public ContextWrapper A00;
    public boolean A01;
    public boolean A02 = false;

    public void A1R() {
        if (this instanceof Hilt_CreatorPrivacyNewsletterBottomSheet) {
            Hilt_CreatorPrivacyNewsletterBottomSheet hilt_CreatorPrivacyNewsletterBottomSheet = (Hilt_CreatorPrivacyNewsletterBottomSheet) this;
            if (!hilt_CreatorPrivacyNewsletterBottomSheet.A02) {
                hilt_CreatorPrivacyNewsletterBottomSheet.A02 = true;
                AnonymousClass3DY A0O = C18310x6.A0O(hilt_CreatorPrivacyNewsletterBottomSheet);
                CreatorPrivacyNewsletterBottomSheet creatorPrivacyNewsletterBottomSheet = (CreatorPrivacyNewsletterBottomSheet) hilt_CreatorPrivacyNewsletterBottomSheet;
                C64333Db r2 = ((C88854au) A0O).A1B;
                C107695bk r1 = r2.A00;
                C107695bk.AFg(r1, creatorPrivacyNewsletterBottomSheet);
                creatorPrivacyNewsletterBottomSheet.A01 = C64333Db.A06(r2);
                creatorPrivacyNewsletterBottomSheet.A00 = C64333Db.A00(r2);
                creatorPrivacyNewsletterBottomSheet.A02 = C86604Kt.A0e(r2);
                creatorPrivacyNewsletterBottomSheet.A03 = C64333Db.A39(r2);
                creatorPrivacyNewsletterBottomSheet.A02 = C64333Db.A29(r2);
                creatorPrivacyNewsletterBottomSheet.A04 = r1.APv();
            }
        } else if (!this.A02) {
            this.A02 = true;
            PhoneNumberHiddenInNewsletterBottomSheet phoneNumberHiddenInNewsletterBottomSheet = (PhoneNumberHiddenInNewsletterBottomSheet) this;
            C64333Db r12 = ((C88854au) C18310x6.A0O(this)).A1B;
            C107695bk.AFg(r12.A00, phoneNumberHiddenInNewsletterBottomSheet);
            phoneNumberHiddenInNewsletterBottomSheet.A01 = C64333Db.A06(r12);
            phoneNumberHiddenInNewsletterBottomSheet.A00 = C64333Db.A00(r12);
            phoneNumberHiddenInNewsletterBottomSheet.A02 = C86604Kt.A0e(r12);
        }
    }

    public final void A1X() {
        if (this.A00 == null) {
            this.A00 = C18320x8.A0T(super.A1D(), this);
            this.A01 = AnonymousClass29z.A00(super.A1D());
        }
    }

    public Context A1D() {
        if (super.A1D() == null && !this.A01) {
            return null;
        }
        A1X();
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
            r2.A1X()
            r2.A1R()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.chatinfo.view.custom.Hilt_PhoneNumberHiddenInNewsletterBottomSheet.A1F(android.app.Activity):void");
    }

    public void A1G(Context context) {
        super.A1G(context);
        A1X();
        A1R();
    }
}
