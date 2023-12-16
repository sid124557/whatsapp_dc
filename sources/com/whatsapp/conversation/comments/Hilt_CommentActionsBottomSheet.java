package com.whatsapp.conversation.comments;

import X.AnonymousClass29z;
import X.AnonymousClass2C4;
import X.AnonymousClass30N;
import X.AnonymousClass36Y;
import X.AnonymousClass46Q;
import X.C106195Xz;
import X.C107695bk;
import X.C18270x1;
import X.C18310x6;
import X.C18320x8;
import X.C47052cd;
import X.C50222hp;
import X.C56662sM;
import X.C615931l;
import X.C64333Db;
import X.C69723Yd;
import X.C86614Ku;
import X.C86644Kx;
import X.C86654Ky;
import X.C86664Kz;
import X.C88734ai;
import X.C88854au;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import com.whatsapp.wds.components.bottomsheet.WDSBottomSheetDialogFragment;

public abstract class Hilt_CommentActionsBottomSheet extends WDSBottomSheetDialogFragment {
    public ContextWrapper A00;
    public boolean A01;
    public boolean A02 = false;

    public void A1R() {
        if (!this.A02) {
            this.A02 = true;
            CommentActionsBottomSheet commentActionsBottomSheet = (CommentActionsBottomSheet) this;
            C64333Db r2 = ((C88854au) C18310x6.A0O(this)).A1B;
            C107695bk r3 = r2.A00;
            C107695bk.AFg(r3, commentActionsBottomSheet);
            commentActionsBottomSheet.A0E = C64333Db.A2p(r2);
            commentActionsBottomSheet.A0N = C64333Db.A4B(r2);
            commentActionsBottomSheet.A01 = C64333Db.A04(r2);
            commentActionsBottomSheet.A0S = (C106195Xz) r2.AKJ.get();
            commentActionsBottomSheet.A06 = C64333Db.A06(r2);
            commentActionsBottomSheet.A0Z = C64333Db.A8y(r2);
            commentActionsBottomSheet.A0H = C64333Db.A39(r2);
            commentActionsBottomSheet.A0O = C64333Db.A4H(r2);
            commentActionsBottomSheet.A0M = C64333Db.A3o(r2);
            commentActionsBottomSheet.A07 = C64333Db.A08(r2);
            commentActionsBottomSheet.A0D = C64333Db.A2o(r2);
            commentActionsBottomSheet.A09 = C64333Db.A26(r2);
            commentActionsBottomSheet.A0L = (AnonymousClass36Y) r2.A7u.get();
            commentActionsBottomSheet.A0B = C64333Db.A28(r2);
            commentActionsBottomSheet.A0G = C64333Db.A2t(r2);
            commentActionsBottomSheet.A0Y = C64333Db.A8F(r2);
            commentActionsBottomSheet.A0J = (C56662sM) r2.AaX.get();
            commentActionsBottomSheet.A0C = C86664Kz.A17(r2);
            commentActionsBottomSheet.A0Q = C86644Kx.A0W(r2);
            commentActionsBottomSheet.A08 = r2.AhT();
            commentActionsBottomSheet.A0R = C86654Ky.A0Z(r2);
            commentActionsBottomSheet.A0P = (AnonymousClass30N) r2.AbE.get();
            commentActionsBottomSheet.A0A = C86614Ku.A0T(r2);
            commentActionsBottomSheet.A0F = C64333Db.A2s(r2);
            commentActionsBottomSheet.A00 = C88734ai.A00(r2.A3B);
            commentActionsBottomSheet.A0K = C64333Db.A3S(r2);
            AnonymousClass46Q r0 = AnonymousClass2C4.A01;
            C615931l.A00(r0);
            commentActionsBottomSheet.A0a = r0;
            commentActionsBottomSheet.A0b = C69723Yd.A00();
            commentActionsBottomSheet.A0I = C64333Db.A3G(r2);
            commentActionsBottomSheet.A0U = C64333Db.A74(r2);
            commentActionsBottomSheet.A0T = (C47052cd) r3.A7Z.get();
            commentActionsBottomSheet.A0W = (C50222hp) r2.AIA.get();
            commentActionsBottomSheet.A0X = r2.Aq9();
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
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.conversation.comments.Hilt_CommentActionsBottomSheet.A1F(android.app.Activity):void");
    }

    public void A1G(Context context) {
        super.A1G(context);
        A1X();
        A1R();
    }
}
