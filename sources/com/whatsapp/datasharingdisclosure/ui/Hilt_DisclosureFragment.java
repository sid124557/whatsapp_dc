package com.whatsapp.datasharingdisclosure.ui;

import X.AnonymousClass29z;
import X.AnonymousClass3DY;
import X.AnonymousClass4FV;
import X.AnonymousClass5X8;
import X.C18270x1;
import X.C18310x6;
import X.C18320x8;
import X.C49202g9;
import X.C55312q9;
import X.C58272uz;
import X.C64333Db;
import X.C88854au;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import com.whatsapp.wds.components.bottomsheet.WDSBottomSheetDialogFragment;

public abstract class Hilt_DisclosureFragment extends WDSBottomSheetDialogFragment {
    public ContextWrapper A00;
    public boolean A01;
    public boolean A02 = false;

    public void A1R() {
        if (this instanceof Hilt_ConsumerMarketingDisclosureFragment) {
            Hilt_ConsumerMarketingDisclosureFragment hilt_ConsumerMarketingDisclosureFragment = (Hilt_ConsumerMarketingDisclosureFragment) this;
            if (!hilt_ConsumerMarketingDisclosureFragment.A02) {
                hilt_ConsumerMarketingDisclosureFragment.A02 = true;
                AnonymousClass3DY A0O = C18310x6.A0O(hilt_ConsumerMarketingDisclosureFragment);
                ConsumerMarketingDisclosureFragment consumerMarketingDisclosureFragment = (ConsumerMarketingDisclosureFragment) hilt_ConsumerMarketingDisclosureFragment;
                C64333Db r1 = ((C88854au) A0O).A1B;
                C64333Db.AdM(r1, consumerMarketingDisclosureFragment);
                consumerMarketingDisclosureFragment.A02 = (AnonymousClass5X8) r1.Aac.get();
                consumerMarketingDisclosureFragment.A03 = C64333Db.A2t(r1);
                consumerMarketingDisclosureFragment.A00 = C64333Db.A00(r1);
                consumerMarketingDisclosureFragment.A01 = (C55312q9) r1.A6F.get();
            }
        } else if (this instanceof Hilt_ConsumerDisclosureFragment) {
            Hilt_ConsumerDisclosureFragment hilt_ConsumerDisclosureFragment = (Hilt_ConsumerDisclosureFragment) this;
            if (!hilt_ConsumerDisclosureFragment.A02) {
                hilt_ConsumerDisclosureFragment.A02 = true;
                AnonymousClass3DY A0O2 = C18310x6.A0O(hilt_ConsumerDisclosureFragment);
                ConsumerDisclosureFragment consumerDisclosureFragment = (ConsumerDisclosureFragment) hilt_ConsumerDisclosureFragment;
                C88854au r12 = (C88854au) A0O2;
                C64333Db r2 = r12.A1B;
                C64333Db.AdM(r2, consumerDisclosureFragment);
                consumerDisclosureFragment.A02 = (AnonymousClass5X8) r2.Aac.get();
                consumerDisclosureFragment.A03 = C64333Db.A2t(r2);
                consumerDisclosureFragment.A01 = new C58272uz((AnonymousClass4FV) r12.A18.A4Z.ASY.get());
                consumerDisclosureFragment.A00 = (C49202g9) r2.A6C.get();
            }
        } else if (!this.A02) {
            this.A02 = true;
            DisclosureFragment disclosureFragment = (DisclosureFragment) this;
            C64333Db r13 = ((C88854au) C18310x6.A0O(this)).A1B;
            C64333Db.AdM(r13, disclosureFragment);
            disclosureFragment.A02 = (AnonymousClass5X8) r13.Aac.get();
            disclosureFragment.A03 = C64333Db.A2t(r13);
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
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.datasharingdisclosure.ui.Hilt_DisclosureFragment.A1F(android.app.Activity):void");
    }

    public void A1G(Context context) {
        super.A1G(context);
        A1X();
        A1R();
    }
}
