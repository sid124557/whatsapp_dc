package com.whatsapp.stickers.store;

import X.AnonymousClass29z;
import X.AnonymousClass3DY;
import X.AnonymousClass5ZD;
import X.C107695bk;
import X.C18270x1;
import X.C18320x8;
import X.C55862r2;
import X.C64333Db;
import X.C88834as;
import X.C88854au;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import com.whatsapp.base.WaFragment;

public abstract class Hilt_StickerStoreTabFragment extends WaFragment {
    public ContextWrapper A00;
    public boolean A01;
    public boolean A02 = false;

    public void A1H() {
        if (this instanceof Hilt_StickerStoreMyTabFragment) {
            Hilt_StickerStoreMyTabFragment hilt_StickerStoreMyTabFragment = (Hilt_StickerStoreMyTabFragment) this;
            if (!hilt_StickerStoreMyTabFragment.A02) {
                hilt_StickerStoreMyTabFragment.A02 = true;
                AnonymousClass3DY A0E = C18320x8.A0E(hilt_StickerStoreMyTabFragment);
                StickerStoreMyTabFragment stickerStoreMyTabFragment = (StickerStoreMyTabFragment) hilt_StickerStoreMyTabFragment;
                C88854au r2 = (C88854au) A0E;
                C64333Db r1 = r2.A1B;
                C107695bk.AFJ(r1, r1.A00, stickerStoreMyTabFragment);
                stickerStoreMyTabFragment.A05 = C64333Db.A8y(r1);
                C88834as r12 = r2.A18;
                stickerStoreMyTabFragment.A02 = r12.ACR();
                stickerStoreMyTabFragment.A03 = (AnonymousClass5ZD) r12.A04.get();
            }
        } else if (this instanceof Hilt_StickerStoreFeaturedTabFragment) {
            Hilt_StickerStoreFeaturedTabFragment hilt_StickerStoreFeaturedTabFragment = (Hilt_StickerStoreFeaturedTabFragment) this;
            if (!hilt_StickerStoreFeaturedTabFragment.A02) {
                hilt_StickerStoreFeaturedTabFragment.A02 = true;
                AnonymousClass3DY A0E2 = C18320x8.A0E(hilt_StickerStoreFeaturedTabFragment);
                StickerStoreFeaturedTabFragment stickerStoreFeaturedTabFragment = (StickerStoreFeaturedTabFragment) hilt_StickerStoreFeaturedTabFragment;
                C64333Db r22 = ((C88854au) A0E2).A1B;
                C107695bk r13 = r22.A00;
                C107695bk.AFJ(r22, r13, stickerStoreFeaturedTabFragment);
                stickerStoreFeaturedTabFragment.A03 = C64333Db.A04(r22);
                stickerStoreFeaturedTabFragment.A04 = C64333Db.A4H(r22);
                stickerStoreFeaturedTabFragment.A05 = (C55862r2) r22.A1T.get();
                stickerStoreFeaturedTabFragment.A02 = C64333Db.A00(r22);
                stickerStoreFeaturedTabFragment.A06 = r13.APf();
            }
        } else if (!this.A02) {
            this.A02 = true;
            C64333Db r14 = ((C88854au) C18320x8.A0E(this)).A1B;
            C107695bk.AFJ(r14, r14.A00, (StickerStoreTabFragment) this);
        }
    }

    public final void A1I() {
        if (this.A00 == null) {
            this.A00 = C18320x8.A0T(super.A1D(), this);
            this.A01 = AnonymousClass29z.A00(super.A1D());
        }
    }

    public Context A1D() {
        if (super.A1D() == null && !this.A01) {
            return null;
        }
        A1I();
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
            r2.A1I()
            r2.A1H()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.stickers.store.Hilt_StickerStoreTabFragment.A1F(android.app.Activity):void");
    }

    public void A1G(Context context) {
        super.A1G(context);
        A1I();
        A1H();
    }
}
