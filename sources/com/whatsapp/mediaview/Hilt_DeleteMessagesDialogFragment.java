package com.whatsapp.mediaview;

import X.AnonymousClass29z;
import X.AnonymousClass30N;
import X.AnonymousClass36Y;
import X.C107695bk;
import X.C18270x1;
import X.C18310x6;
import X.C18320x8;
import X.C47052cd;
import X.C50222hp;
import X.C64333Db;
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
import com.whatsapp.base.WaDialogFragment;

public abstract class Hilt_DeleteMessagesDialogFragment extends WaDialogFragment {
    public ContextWrapper A00;
    public boolean A01;
    public boolean A02 = false;

    public void A1R() {
        if (!this.A02) {
            this.A02 = true;
            DeleteMessagesDialogFragment deleteMessagesDialogFragment = (DeleteMessagesDialogFragment) this;
            C64333Db r2 = ((C88854au) C18310x6.A0N(this)).A1B;
            C64333Db.Ad6(r2, deleteMessagesDialogFragment);
            C107695bk r3 = r2.A00;
            C107695bk.AFO(r3, deleteMessagesDialogFragment);
            deleteMessagesDialogFragment.A09 = C64333Db.A2p(r2);
            deleteMessagesDialogFragment.A03 = C64333Db.A04(r2);
            deleteMessagesDialogFragment.A0O = C64333Db.A8y(r2);
            deleteMessagesDialogFragment.A0F = C64333Db.A4H(r2);
            deleteMessagesDialogFragment.A0B = C64333Db.A39(r2);
            deleteMessagesDialogFragment.A0E = C64333Db.A3o(r2);
            deleteMessagesDialogFragment.A04 = C64333Db.A08(r2);
            deleteMessagesDialogFragment.A05 = C64333Db.A26(r2);
            deleteMessagesDialogFragment.A0D = (AnonymousClass36Y) r2.A7u.get();
            deleteMessagesDialogFragment.A07 = C64333Db.A28(r2);
            deleteMessagesDialogFragment.A0H = C64333Db.A5A(r2);
            deleteMessagesDialogFragment.A0N = C64333Db.A8F(r2);
            deleteMessagesDialogFragment.A08 = C86664Kz.A17(r2);
            deleteMessagesDialogFragment.A0I = C86644Kx.A0W(r2);
            deleteMessagesDialogFragment.A0J = C86654Ky.A0Z(r2);
            deleteMessagesDialogFragment.A0G = (AnonymousClass30N) r2.AbE.get();
            deleteMessagesDialogFragment.A00 = C88734ai.A00(r2.A3B);
            deleteMessagesDialogFragment.A06 = C86614Ku.A0T(r2);
            deleteMessagesDialogFragment.A0A = C64333Db.A2s(r2);
            deleteMessagesDialogFragment.A0C = C64333Db.A3G(r2);
            deleteMessagesDialogFragment.A0K = (C47052cd) r3.A7Z.get();
            deleteMessagesDialogFragment.A0L = (C50222hp) r2.AIA.get();
            deleteMessagesDialogFragment.A0M = r2.Aq9();
        }
    }

    public final void A1U() {
        if (this.A00 == null) {
            this.A00 = C18320x8.A0T(super.A1D(), this);
            this.A01 = AnonymousClass29z.A00(super.A1D());
        }
    }

    public Context A1D() {
        if (super.A1D() == null && !this.A01) {
            return null;
        }
        A1U();
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
            r2.A1U()
            r2.A1R()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.mediaview.Hilt_DeleteMessagesDialogFragment.A1F(android.app.Activity):void");
    }

    public void A1G(Context context) {
        super.A1G(context);
        A1U();
        A1R();
    }
}
