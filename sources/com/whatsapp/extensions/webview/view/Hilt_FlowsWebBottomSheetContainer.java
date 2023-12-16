package com.whatsapp.extensions.webview.view;

import X.AnonymousClass29z;
import X.C107695bk;
import X.C18270x1;
import X.C18280x3;
import X.C18300x5;
import X.C18310x6;
import X.C18320x8;
import X.C50312hy;
import X.C56422rx;
import X.C64333Db;
import X.C88854au;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import com.whatsapp.wds.components.bottomsheet.WDSBottomSheetDialogFragment;

public abstract class Hilt_FlowsWebBottomSheetContainer extends WDSBottomSheetDialogFragment {
    public ContextWrapper A00;
    public boolean A01;
    public boolean A02 = false;

    public void A1R() {
        if (!this.A02) {
            this.A02 = true;
            FlowsWebBottomSheetContainer flowsWebBottomSheetContainer = (FlowsWebBottomSheetContainer) this;
            C88854au r4 = (C88854au) C18310x6.A0O(this);
            C64333Db r3 = r4.A1B;
            C107695bk r2 = r3.A00;
            C18300x5.A1D(r2, flowsWebBottomSheetContainer);
            flowsWebBottomSheetContainer.A0F = C64333Db.A4B(r3);
            flowsWebBottomSheetContainer.A03 = C64333Db.A00(r3);
            flowsWebBottomSheetContainer.A0H = C64333Db.A8X(r3);
            flowsWebBottomSheetContainer.A0A = C64333Db.A3D(r3);
            flowsWebBottomSheetContainer.A08 = r3.AjR();
            flowsWebBottomSheetContainer.A06 = (C56422rx) r3.AZn.get();
            flowsWebBottomSheetContainer.A0B = C64333Db.A3S(r3);
            flowsWebBottomSheetContainer.A04 = r4.A77();
            flowsWebBottomSheetContainer.A07 = C18280x3.A0L(r2);
            flowsWebBottomSheetContainer.A05 = C64333Db.A24(r3);
            flowsWebBottomSheetContainer.A09 = C64333Db.A2t(r3);
            flowsWebBottomSheetContainer.A0D = (C50312hy) r3.Ab8.get();
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
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.extensions.webview.view.Hilt_FlowsWebBottomSheetContainer.A1F(android.app.Activity):void");
    }

    public void A1G(Context context) {
        super.A1G(context);
        A1X();
        A1R();
    }
}
