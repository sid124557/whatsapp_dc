package com.whatsapp.gallery;

import X.AnonymousClass29z;
import X.AnonymousClass319;
import X.AnonymousClass3DY;
import X.C105115Tq;
import X.C105995Xf;
import X.C107695bk;
import X.C18270x1;
import X.C18320x8;
import X.C48042eF;
import X.C48682fI;
import X.C58392vB;
import X.C64333Db;
import X.C86614Ku;
import X.C86654Ky;
import X.C88834as;
import X.C88854au;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import com.whatsapp.base.WaFragment;
import com.whatsapp.gallerypicker.Hilt_MediaPickerFragment;
import com.whatsapp.gallerypicker.MediaPickerFragment;
import com.whatsapp.storage.Hilt_StorageUsageMediaGalleryFragment;
import com.whatsapp.storage.StorageUsageMediaGalleryFragment;

public abstract class Hilt_MediaGalleryFragmentBase extends WaFragment {
    public ContextWrapper A00;
    public boolean A01;
    public boolean A02 = false;

    public void A1H() {
        if (this instanceof Hilt_StorageUsageMediaGalleryFragment) {
            Hilt_StorageUsageMediaGalleryFragment hilt_StorageUsageMediaGalleryFragment = (Hilt_StorageUsageMediaGalleryFragment) this;
            if (!hilt_StorageUsageMediaGalleryFragment.A02) {
                hilt_StorageUsageMediaGalleryFragment.A02 = true;
                AnonymousClass3DY A0E = C18320x8.A0E(hilt_StorageUsageMediaGalleryFragment);
                StorageUsageMediaGalleryFragment storageUsageMediaGalleryFragment = (StorageUsageMediaGalleryFragment) hilt_StorageUsageMediaGalleryFragment;
                C88854au r4 = (C88854au) A0E;
                C64333Db r2 = r4.A1B;
                C107695bk r3 = r2.A00;
                C107695bk.AFP(r3, storageUsageMediaGalleryFragment);
                C88834as.A56(r4, r2, r3, storageUsageMediaGalleryFragment, r2.A07.get());
                storageUsageMediaGalleryFragment.A09 = C86614Ku.A0j(r2);
                storageUsageMediaGalleryFragment.A02 = C64333Db.A01(r2);
                storageUsageMediaGalleryFragment.A01 = C64333Db.A00(r2);
                storageUsageMediaGalleryFragment.A03 = C86614Ku.A0Z(r2);
                storageUsageMediaGalleryFragment.A08 = C64333Db.A8F(r2);
                storageUsageMediaGalleryFragment.A04 = (AnonymousClass319) r2.AJv.get();
                storageUsageMediaGalleryFragment.A0A = C86654Ky.A0e(r2);
                storageUsageMediaGalleryFragment.A06 = (C48042eF) r2.AVm.get();
                storageUsageMediaGalleryFragment.A05 = C64333Db.A3K(r2);
                storageUsageMediaGalleryFragment.A0B = C86614Ku.A0o(r2);
            }
        } else if (this instanceof Hilt_MediaPickerFragment) {
            Hilt_MediaPickerFragment hilt_MediaPickerFragment = (Hilt_MediaPickerFragment) this;
            if (hilt_MediaPickerFragment instanceof Hilt_NewMediaPickerFragment) {
                Hilt_NewMediaPickerFragment hilt_NewMediaPickerFragment = (Hilt_NewMediaPickerFragment) hilt_MediaPickerFragment;
                if (!hilt_NewMediaPickerFragment.A02) {
                    hilt_NewMediaPickerFragment.A02 = true;
                    C88854au r42 = (C88854au) C18320x8.A0E(hilt_NewMediaPickerFragment);
                    C64333Db r22 = r42.A1B;
                    C107695bk r1 = r22.A00;
                    C107695bk.AFP(r1, hilt_NewMediaPickerFragment);
                    C88834as.A56(r42, r22, r1, hilt_NewMediaPickerFragment, r22.A07.get());
                    hilt_NewMediaPickerFragment.A08 = C64333Db.A2p(r22);
                    hilt_NewMediaPickerFragment.A0B = (C48682fI) r22.AKH.get();
                    hilt_NewMediaPickerFragment.A0C = (C58392vB) r22.AQV.get();
                    hilt_NewMediaPickerFragment.A07 = C86614Ku.A0T(r22);
                    hilt_NewMediaPickerFragment.A0D = (C105115Tq) r1.AAN.get();
                    hilt_NewMediaPickerFragment.A06 = (C105995Xf) r1.A2D.get();
                }
            } else if (!hilt_MediaPickerFragment.A02) {
                hilt_MediaPickerFragment.A02 = true;
                AnonymousClass3DY A0E2 = C18320x8.A0E(hilt_MediaPickerFragment);
                MediaPickerFragment mediaPickerFragment = (MediaPickerFragment) hilt_MediaPickerFragment;
                C88854au r43 = (C88854au) A0E2;
                C64333Db r23 = r43.A1B;
                C107695bk r12 = r23.A00;
                C107695bk.AFP(r12, mediaPickerFragment);
                C88834as.A56(r43, r23, r12, mediaPickerFragment, r23.A07.get());
                mediaPickerFragment.A08 = C64333Db.A2p(r23);
                mediaPickerFragment.A0B = (C48682fI) r23.AKH.get();
                mediaPickerFragment.A0C = (C58392vB) r23.AQV.get();
                mediaPickerFragment.A07 = C86614Ku.A0T(r23);
                mediaPickerFragment.A0D = (C105115Tq) r12.AAN.get();
                mediaPickerFragment.A06 = (C105995Xf) r12.A2D.get();
            }
        } else if (this instanceof Hilt_MediaGalleryFragment) {
            Hilt_MediaGalleryFragment hilt_MediaGalleryFragment = (Hilt_MediaGalleryFragment) this;
            if (!hilt_MediaGalleryFragment.A02) {
                hilt_MediaGalleryFragment.A02 = true;
                AnonymousClass3DY A0E3 = C18320x8.A0E(hilt_MediaGalleryFragment);
                MediaGalleryFragment mediaGalleryFragment = (MediaGalleryFragment) hilt_MediaGalleryFragment;
                C88854au r32 = (C88854au) A0E3;
                C64333Db r24 = r32.A1B;
                C107695bk r13 = r24.A00;
                C107695bk.AFP(r13, mediaGalleryFragment);
                C88834as.A56(r32, r24, r13, mediaGalleryFragment, r24.A07.get());
                mediaGalleryFragment.A00 = C86614Ku.A0Z(r24);
                mediaGalleryFragment.A04 = C64333Db.A8F(r24);
                mediaGalleryFragment.A01 = (AnonymousClass319) r24.AJv.get();
                mediaGalleryFragment.A05 = C86654Ky.A0e(r24);
                mediaGalleryFragment.A02 = C64333Db.A3K(r24);
            }
        } else if (this instanceof Hilt_GalleryRecentsFragment) {
            Hilt_GalleryRecentsFragment hilt_GalleryRecentsFragment = (Hilt_GalleryRecentsFragment) this;
            if (!hilt_GalleryRecentsFragment.A02) {
                hilt_GalleryRecentsFragment.A02 = true;
                AnonymousClass3DY A0E4 = C18320x8.A0E(hilt_GalleryRecentsFragment);
                GalleryRecentsFragment galleryRecentsFragment = (GalleryRecentsFragment) hilt_GalleryRecentsFragment;
                C88854au r33 = (C88854au) A0E4;
                C64333Db r25 = r33.A1B;
                C107695bk r14 = r25.A00;
                C107695bk.AFP(r14, galleryRecentsFragment);
                C88834as.A56(r33, r25, r14, galleryRecentsFragment, r25.A07.get());
                galleryRecentsFragment.A02 = C64333Db.A2p(r25);
                galleryRecentsFragment.A05 = (C58392vB) r25.AQV.get();
            }
        } else if (!this.A02) {
            this.A02 = true;
            MediaGalleryFragmentBase mediaGalleryFragmentBase = (MediaGalleryFragmentBase) this;
            C88854au r44 = (C88854au) C18320x8.A0E(this);
            C64333Db r26 = r44.A1B;
            C107695bk r15 = r26.A00;
            C107695bk.AFP(r15, mediaGalleryFragmentBase);
            C88834as.A56(r44, r26, r15, mediaGalleryFragmentBase, r26.A07.get());
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
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.gallery.Hilt_MediaGalleryFragmentBase.A1F(android.app.Activity):void");
    }

    public void A1G(Context context) {
        super.A1G(context);
        A1I();
        A1H();
    }
}
