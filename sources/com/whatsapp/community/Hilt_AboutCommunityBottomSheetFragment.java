package com.whatsapp.community;

import X.AnonymousClass29z;
import X.AnonymousClass7CJ;
import X.C107695bk;
import X.C18270x1;
import X.C18280x3;
import X.C18310x6;
import X.C18320x8;
import X.C64333Db;
import X.C86604Kt;
import X.C86654Ky;
import X.C88854au;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import com.whatsapp.RoundedBottomSheetDialogFragment;

public abstract class Hilt_AboutCommunityBottomSheetFragment extends RoundedBottomSheetDialogFragment {
    public ContextWrapper A00;
    public boolean A01;
    public boolean A02 = false;

    public void A1R() {
        if (!this.A02) {
            this.A02 = true;
            AboutCommunityBottomSheetFragment aboutCommunityBottomSheetFragment = (AboutCommunityBottomSheetFragment) this;
            C88854au r4 = (C88854au) C18310x6.A0O(this);
            C64333Db r2 = r4.A1B;
            C107695bk r1 = r2.A00;
            C107695bk.AFL(r1, r1, aboutCommunityBottomSheetFragment);
            aboutCommunityBottomSheetFragment.A03 = C64333Db.A4B(r2);
            aboutCommunityBottomSheetFragment.A06 = C18280x3.A0Q(r1);
            aboutCommunityBottomSheetFragment.A05 = C86604Kt.A0e(r2);
            aboutCommunityBottomSheetFragment.A02 = C64333Db.A2o(r2);
            aboutCommunityBottomSheetFragment.A01 = C86654Ky.A0X(r2);
            aboutCommunityBottomSheetFragment.A00 = (AnonymousClass7CJ) r4.A0c.get();
        }
    }

    public final void A1Z() {
        if (this.A00 == null) {
            this.A00 = C18320x8.A0T(super.A1D(), this);
            this.A01 = AnonymousClass29z.A00(super.A1D());
        }
    }

    public Context A1D() {
        if (super.A1D() == null && !this.A01) {
            return null;
        }
        A1Z();
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
            r2.A1Z()
            r2.A1R()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.community.Hilt_AboutCommunityBottomSheetFragment.A1F(android.app.Activity):void");
    }

    public void A1G(Context context) {
        super.A1G(context);
        A1Z();
        A1R();
    }
}
