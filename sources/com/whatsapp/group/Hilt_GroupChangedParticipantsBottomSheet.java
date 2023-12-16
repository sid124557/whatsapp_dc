package com.whatsapp.group;

import X.AnonymousClass29z;
import X.AnonymousClass64J;
import X.C18270x1;
import X.C18310x6;
import X.C18320x8;
import X.C64333Db;
import X.C88854au;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import com.whatsapp.wds.components.bottomsheet.WDSBottomSheetDialogFragment;

public abstract class Hilt_GroupChangedParticipantsBottomSheet extends WDSBottomSheetDialogFragment {
    public ContextWrapper A00;
    public boolean A01;
    public boolean A02 = false;

    public void A1R() {
        if (!this.A02) {
            this.A02 = true;
            GroupChangedParticipantsBottomSheet groupChangedParticipantsBottomSheet = (GroupChangedParticipantsBottomSheet) this;
            C64333Db r1 = ((C88854au) C18310x6.A0O(this)).A1B;
            C64333Db.AdM(r1, groupChangedParticipantsBottomSheet);
            groupChangedParticipantsBottomSheet.A0D = C64333Db.A8y(r1);
            groupChangedParticipantsBottomSheet.A09 = C64333Db.A29(r1);
            groupChangedParticipantsBottomSheet.A06 = C64333Db.A26(r1);
            groupChangedParticipantsBottomSheet.A07 = C64333Db.A28(r1);
            groupChangedParticipantsBottomSheet.A0A = C64333Db.A2t(r1);
            groupChangedParticipantsBottomSheet.A04 = (AnonymousClass64J) r1.AEN.get();
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
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.group.Hilt_GroupChangedParticipantsBottomSheet.A1F(android.app.Activity):void");
    }

    public void A1G(Context context) {
        super.A1G(context);
        A1X();
        A1R();
    }
}
