package com.whatsapp.gallery;

import X.AnonymousClass29z;
import X.AnonymousClass2Y1;
import X.AnonymousClass3DY;
import X.AnonymousClass3UW;
import X.AnonymousClass3UX;
import X.C106065Xm;
import X.C107695bk;
import X.C114635nM;
import X.C18270x1;
import X.C18320x8;
import X.C48042eF;
import X.C56922sm;
import X.C60202yA;
import X.C64333Db;
import X.C66533Lu;
import X.C86614Ku;
import X.C86634Kw;
import X.C86654Ky;
import X.C88854au;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import com.whatsapp.base.WaFragment;

public abstract class Hilt_GalleryFragmentBase extends WaFragment {
    public ContextWrapper A00;
    public boolean A01;
    public boolean A02 = false;

    public void A1H() {
        if (this instanceof Hilt_LinksGalleryFragment) {
            Hilt_LinksGalleryFragment hilt_LinksGalleryFragment = (Hilt_LinksGalleryFragment) this;
            if (!hilt_LinksGalleryFragment.A02) {
                hilt_LinksGalleryFragment.A02 = true;
                AnonymousClass3DY A0E = C18320x8.A0E(hilt_LinksGalleryFragment);
                LinksGalleryFragment linksGalleryFragment = (LinksGalleryFragment) hilt_LinksGalleryFragment;
                C64333Db r1 = ((C88854au) A0E).A1B;
                C107695bk r2 = r1.A00;
                C107695bk.AFF(r1, r2, linksGalleryFragment);
                linksGalleryFragment.A06 = C86634Kw.A0m(r1);
                linksGalleryFragment.A05 = C64333Db.A3o(r1);
                linksGalleryFragment.A00 = C64333Db.A00(r1);
                linksGalleryFragment.A02 = (C66533Lu) r1.AFp.get();
                linksGalleryFragment.A04 = (C114635nM) r1.AQW.get();
                linksGalleryFragment.A03 = (C106065Xm) r2.A6m.get();
                linksGalleryFragment.A08 = C86654Ky.A0e(r1);
                linksGalleryFragment.A07 = new AnonymousClass3UX((C56922sm) r1.A58.get(), (C66533Lu) r1.AFp.get(), (C60202yA) r1.AJ3.get(), C86614Ku.A0a(r1));
            }
        } else if (this instanceof Hilt_DocumentsGalleryFragment) {
            Hilt_DocumentsGalleryFragment hilt_DocumentsGalleryFragment = (Hilt_DocumentsGalleryFragment) this;
            if (!hilt_DocumentsGalleryFragment.A02) {
                hilt_DocumentsGalleryFragment.A02 = true;
                AnonymousClass3DY A0E2 = C18320x8.A0E(hilt_DocumentsGalleryFragment);
                DocumentsGalleryFragment documentsGalleryFragment = (DocumentsGalleryFragment) hilt_DocumentsGalleryFragment;
                C64333Db r5 = ((C88854au) A0E2).A1B;
                C107695bk r12 = r5.A00;
                C107695bk.AFF(r5, r12, documentsGalleryFragment);
                documentsGalleryFragment.A07 = C86614Ku.A0j(r5);
                documentsGalleryFragment.A02 = C64333Db.A04(r5);
                documentsGalleryFragment.A01 = C64333Db.A01(r5);
                documentsGalleryFragment.A00 = C64333Db.A00(r5);
                documentsGalleryFragment.A05 = (C106065Xm) r12.A6m.get();
                documentsGalleryFragment.A06 = (C48042eF) r5.AVm.get();
                documentsGalleryFragment.A03 = (AnonymousClass2Y1) r12.A3i.get();
                documentsGalleryFragment.A04 = new AnonymousClass3UW((C56922sm) r5.A58.get(), (C66533Lu) r5.AFp.get(), C86614Ku.A0a(r5));
                documentsGalleryFragment.A08 = C86614Ku.A0o(r5);
            }
        } else if (!this.A02) {
            this.A02 = true;
            C64333Db r13 = ((C88854au) C18320x8.A0E(this)).A1B;
            C107695bk.AFF(r13, r13.A00, (GalleryFragmentBase) this);
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
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.gallery.Hilt_GalleryFragmentBase.A1F(android.app.Activity):void");
    }

    public void A1G(Context context) {
        super.A1G(context);
        A1I();
        A1H();
    }
}
