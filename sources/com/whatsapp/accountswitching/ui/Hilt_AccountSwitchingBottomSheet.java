package com.whatsapp.accountswitching.ui;

import X.AnonymousClass29z;
import X.AnonymousClass5XC;
import X.C107695bk;
import X.C18270x1;
import X.C18310x6;
import X.C18320x8;
import X.C45052Ym;
import X.C45472a4;
import X.C53542nG;
import X.C613630k;
import X.C64333Db;
import X.C86614Ku;
import X.C86624Kv;
import X.C88854au;
import X.C97024xV;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import com.whatsapp.wds.components.bottomsheet.WDSBottomSheetDialogFragment;

public abstract class Hilt_AccountSwitchingBottomSheet extends WDSBottomSheetDialogFragment {
    public ContextWrapper A00;
    public boolean A01;
    public boolean A02 = false;

    public void A1R() {
        if (!this.A02) {
            this.A02 = true;
            AccountSwitchingBottomSheet accountSwitchingBottomSheet = (AccountSwitchingBottomSheet) this;
            C88854au r4 = (C88854au) C18310x6.A0O(this);
            C64333Db r3 = r4.A1B;
            C107695bk r2 = r3.A00;
            C107695bk.AFg(r2, accountSwitchingBottomSheet);
            accountSwitchingBottomSheet.A05 = C64333Db.A04(r3);
            accountSwitchingBottomSheet.A04 = C64333Db.A01(r3);
            accountSwitchingBottomSheet.A06 = C64333Db.A06(r3);
            accountSwitchingBottomSheet.A0I = C64333Db.A8y(r3);
            accountSwitchingBottomSheet.A0E = C64333Db.A2t(r3);
            accountSwitchingBottomSheet.A07 = C86614Ku.A0O(r3);
            accountSwitchingBottomSheet.A0H = (C45472a4) r3.ASi.get();
            accountSwitchingBottomSheet.A0D = C64333Db.A2s(r3);
            accountSwitchingBottomSheet.A0G = (C53542nG) r2.A9u.get();
            accountSwitchingBottomSheet.A09 = (AnonymousClass5XC) r3.A0U.get();
            accountSwitchingBottomSheet.A08 = (C613630k) r3.A0S.get();
            accountSwitchingBottomSheet.A0F = (C45052Ym) r4.A14.get();
            accountSwitchingBottomSheet.A0C = C86624Kv.A0P(r3);
            accountSwitchingBottomSheet.A0B = (C97024xV) r2.A6B.get();
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
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.accountswitching.ui.Hilt_AccountSwitchingBottomSheet.A1F(android.app.Activity):void");
    }

    public void A1G(Context context) {
        super.A1G(context);
        A1X();
        A1R();
    }
}
