package com.whatsapp.gallery;

import X.AnonymousClass29z;
import X.AnonymousClass5MZ;
import X.C107695bk;
import X.C113975mI;
import X.C18270x1;
import X.C18320x8;
import X.C64333Db;
import X.C86614Ku;
import X.C86624Kv;
import X.C88854au;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import com.whatsapp.base.WaFragment;

public abstract class Hilt_GalleryTabHostFragment extends WaFragment {
    public ContextWrapper A00;
    public boolean A01;
    public boolean A02 = false;

    public void A1H() {
        if (!this.A02) {
            this.A02 = true;
            GalleryTabHostFragment galleryTabHostFragment = (GalleryTabHostFragment) this;
            C64333Db r2 = ((C88854au) C18320x8.A0E(this)).A1B;
            C107695bk r1 = r2.A00;
            C107695bk.AFP(r1, galleryTabHostFragment);
            galleryTabHostFragment.A09 = C64333Db.A2p(r2);
            galleryTabHostFragment.A0C = C64333Db.A4B(r2);
            galleryTabHostFragment.A06 = C86624Kv.A0M(r2);
            galleryTabHostFragment.A0A = C64333Db.A2q(r2);
            galleryTabHostFragment.A0F = C64333Db.A8y(r2);
            galleryTabHostFragment.A0E = (C113975mI) r1.A7K.get();
            galleryTabHostFragment.A0B = C64333Db.A2t(r2);
            galleryTabHostFragment.A08 = C64333Db.A2o(r2);
            galleryTabHostFragment.A07 = C86614Ku.A0T(r2);
            galleryTabHostFragment.A0D = (AnonymousClass5MZ) r1.A7L.get();
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
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.gallery.Hilt_GalleryTabHostFragment.A1F(android.app.Activity):void");
    }

    public void A1G(Context context) {
        super.A1G(context);
        A1I();
        A1H();
    }
}
