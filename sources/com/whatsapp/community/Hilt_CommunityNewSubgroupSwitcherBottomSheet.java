package com.whatsapp.community;

import X.AnonymousClass29z;
import X.C103145Ls;
import X.C107695bk;
import X.C18270x1;
import X.C18310x6;
import X.C18320x8;
import X.C29331ie;
import X.C39542Cj;
import X.C44092Uq;
import X.C64333Db;
import X.C86604Kt;
import X.C86614Ku;
import X.C86624Kv;
import X.C86634Kw;
import X.C86654Ky;
import X.C86664Kz;
import X.C88834as;
import X.C88854au;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import com.whatsapp.RoundedBottomSheetDialogFragment;

public abstract class Hilt_CommunityNewSubgroupSwitcherBottomSheet extends RoundedBottomSheetDialogFragment {
    public ContextWrapper A00;
    public boolean A01;
    public boolean A02 = false;

    public void A1R() {
        if (!this.A02) {
            this.A02 = true;
            CommunityNewSubgroupSwitcherBottomSheet communityNewSubgroupSwitcherBottomSheet = (CommunityNewSubgroupSwitcherBottomSheet) this;
            C88854au r1 = (C88854au) C18310x6.A0O(this);
            C64333Db r3 = r1.A1B;
            C107695bk r0 = r3.A00;
            C107695bk.AFL(r0, r0, communityNewSubgroupSwitcherBottomSheet);
            communityNewSubgroupSwitcherBottomSheet.A0F = C64333Db.A39(r3);
            communityNewSubgroupSwitcherBottomSheet.A0C = C64333Db.A29(r3);
            communityNewSubgroupSwitcherBottomSheet.A08 = C64333Db.A26(r3);
            communityNewSubgroupSwitcherBottomSheet.A0A = C64333Db.A28(r3);
            communityNewSubgroupSwitcherBottomSheet.A09 = C86614Ku.A0S(r3);
            communityNewSubgroupSwitcherBottomSheet.A06 = C86654Ky.A0X(r3);
            communityNewSubgroupSwitcherBottomSheet.A04 = C86624Kv.A0N(r3);
            communityNewSubgroupSwitcherBottomSheet.A05 = C64333Db.A1k(r3);
            communityNewSubgroupSwitcherBottomSheet.A0K = (C29331ie) r3.AP8.get();
            communityNewSubgroupSwitcherBottomSheet.A0G = C86614Ku.A0Y(r3);
            C88834as r12 = r1.A18;
            communityNewSubgroupSwitcherBottomSheet.A00 = (C44092Uq) r12.A0Z.get();
            communityNewSubgroupSwitcherBottomSheet.A03 = C86654Ky.A0S(r3);
            communityNewSubgroupSwitcherBottomSheet.A0H = C64333Db.A3G(r3);
            communityNewSubgroupSwitcherBottomSheet.A0I = C86664Kz.A1A(r3);
            communityNewSubgroupSwitcherBottomSheet.A0J = C86624Kv.A0T(r3);
            communityNewSubgroupSwitcherBottomSheet.A02 = (C39542Cj) r12.A3V.get();
            communityNewSubgroupSwitcherBottomSheet.A01 = (C103145Ls) r12.A0a.get();
            communityNewSubgroupSwitcherBottomSheet.A0L = C86604Kt.A0f(r3);
            communityNewSubgroupSwitcherBottomSheet.A0E = C86634Kw.A0e(r3);
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
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.community.Hilt_CommunityNewSubgroupSwitcherBottomSheet.A1F(android.app.Activity):void");
    }

    public void A1G(Context context) {
        super.A1G(context);
        A1Z();
        A1R();
    }
}
