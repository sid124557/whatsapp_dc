package com.whatsapp.conversation;

import X.AnonymousClass29z;
import X.AnonymousClass2C4;
import X.AnonymousClass2CS;
import X.AnonymousClass46A;
import X.AnonymousClass46Q;
import X.AnonymousClass487;
import X.C107695bk;
import X.C18270x1;
import X.C18280x3;
import X.C18300x5;
import X.C18310x6;
import X.C18320x8;
import X.C39622Cr;
import X.C56662sM;
import X.C615931l;
import X.C64333Db;
import X.C66473Lo;
import X.C88834as;
import X.C88854au;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import com.whatsapp.wds.components.bottomsheet.WDSBottomSheetDialogFragment;

public abstract class Hilt_CommentsBottomSheet extends WDSBottomSheetDialogFragment {
    public ContextWrapper A00;
    public boolean A01;
    public boolean A02 = false;

    public void A1R() {
        if (!this.A02) {
            this.A02 = true;
            CommentsBottomSheet commentsBottomSheet = (CommentsBottomSheet) this;
            C88854au r5 = (C88854au) C18310x6.A0O(this);
            C64333Db r3 = r5.A1B;
            C107695bk r4 = r3.A00;
            C18300x5.A1D(r4, commentsBottomSheet);
            commentsBottomSheet.A0A = C64333Db.A2p(r3);
            commentsBottomSheet.A0I = C64333Db.A4B(r3);
            commentsBottomSheet.A02 = C64333Db.A04(r3);
            commentsBottomSheet.A0M = C18280x3.A0Q(r4);
            commentsBottomSheet.A03 = C64333Db.A06(r3);
            commentsBottomSheet.A0N = C64333Db.A8y(r3);
            commentsBottomSheet.A0H = C64333Db.A3o(r3);
            commentsBottomSheet.A05 = C64333Db.A29(r3);
            commentsBottomSheet.A04 = C64333Db.A26(r3);
            commentsBottomSheet.A09 = C64333Db.A2o(r3);
            commentsBottomSheet.A0C = C64333Db.A2t(r3);
            commentsBottomSheet.A0E = C64333Db.A3D(r3);
            commentsBottomSheet.A0J = C64333Db.A5A(r3);
            commentsBottomSheet.A0F = (C56662sM) r3.AaX.get();
            commentsBottomSheet.A0L = r3.Apy();
            AnonymousClass46Q r0 = AnonymousClass2C4.A01;
            C615931l.A00(r0);
            commentsBottomSheet.A0P = r0;
            AnonymousClass46A r02 = AnonymousClass2C4.A03;
            C615931l.A00(r02);
            commentsBottomSheet.A0Q = r02;
            commentsBottomSheet.A06 = C18280x3.A0L(r4);
            C88834as r1 = r5.A18;
            commentsBottomSheet.A00 = (AnonymousClass2CS) r1.A3p.get();
            commentsBottomSheet.A0K = C64333Db.A74(r3);
            commentsBottomSheet.A0O = r1.ADK();
            commentsBottomSheet.A0D = (C66473Lo) r3.A6p.get();
            commentsBottomSheet.A01 = (C39622Cr) r5.A0i.get();
            commentsBottomSheet.A0G = (AnonymousClass487) r4.A9c.get();
            commentsBottomSheet.A0B = C64333Db.A2s(r3);
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
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.conversation.Hilt_CommentsBottomSheet.A1F(android.app.Activity):void");
    }

    public void A1G(Context context) {
        super.A1G(context);
        A1X();
        A1R();
    }
}
