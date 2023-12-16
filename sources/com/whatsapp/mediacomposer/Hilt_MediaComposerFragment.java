package com.whatsapp.mediacomposer;

import X.AnonymousClass29z;
import X.AnonymousClass3DY;
import X.C107695bk;
import X.C133846i2;
import X.C162287rd;
import X.C18270x1;
import X.C18320x8;
import X.C27831ek;
import X.C52532ld;
import X.C64333Db;
import X.C64393Dh;
import X.C86604Kt;
import X.C86614Ku;
import X.C86624Kv;
import X.C88844at;
import X.C88854au;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import com.whatsapp.base.WaFragment;

public abstract class Hilt_MediaComposerFragment extends WaFragment {
    public ContextWrapper A00;
    public boolean A01;
    public boolean A02 = false;

    public void A1H() {
        if (this instanceof Hilt_VideoComposerFragment) {
            Hilt_VideoComposerFragment hilt_VideoComposerFragment = (Hilt_VideoComposerFragment) this;
            if (!hilt_VideoComposerFragment.A02) {
                hilt_VideoComposerFragment.A02 = true;
                AnonymousClass3DY A0E = C18320x8.A0E(hilt_VideoComposerFragment);
                VideoComposerFragment videoComposerFragment = (VideoComposerFragment) hilt_VideoComposerFragment;
                C88854au r3 = (C88854au) A0E;
                C64333Db r2 = r3.A1B;
                C107695bk r1 = r2.A00;
                C107695bk.AFG(r2, r1, videoComposerFragment);
                C107695bk.AFH(r2, r1, videoComposerFragment, (C27831ek) r1.AA2.get());
                C88844at.A02(r3, r2, r1, videoComposerFragment);
                videoComposerFragment.A0L = C64333Db.A2p(r2);
                videoComposerFragment.A0T = C86614Ku.A0j(r2);
                videoComposerFragment.A0M = C64333Db.A4H(r2);
                videoComposerFragment.A0Q = (C52532ld) r2.AZr.get();
                videoComposerFragment.A0P = (C162287rd) r2.AZ1.get();
                videoComposerFragment.A0K = C86604Kt.A0U(r2);
            }
        } else if (this instanceof Hilt_ImageComposerFragment) {
            Hilt_ImageComposerFragment hilt_ImageComposerFragment = (Hilt_ImageComposerFragment) this;
            if (!hilt_ImageComposerFragment.A02) {
                hilt_ImageComposerFragment.A02 = true;
                AnonymousClass3DY A0E2 = C18320x8.A0E(hilt_ImageComposerFragment);
                ImageComposerFragment imageComposerFragment = (ImageComposerFragment) hilt_ImageComposerFragment;
                C88854au r32 = (C88854au) A0E2;
                C64333Db r22 = r32.A1B;
                C107695bk r12 = r22.A00;
                C107695bk.AFG(r22, r12, imageComposerFragment);
                C107695bk.AFH(r22, r12, imageComposerFragment, (C27831ek) r12.AA2.get());
                C88844at.A02(r32, r22, r12, imageComposerFragment);
                imageComposerFragment.A02 = C86624Kv.A0M(r22);
                imageComposerFragment.A01 = (C64393Dh) r22.AS1.get();
                imageComposerFragment.A03 = (C133846i2) r12.A5A.get();
            }
        } else if (this instanceof Hilt_GifComposerFragment) {
            Hilt_GifComposerFragment hilt_GifComposerFragment = (Hilt_GifComposerFragment) this;
            if (!hilt_GifComposerFragment.A02) {
                hilt_GifComposerFragment.A02 = true;
                C88854au r33 = (C88854au) C18320x8.A0E(hilt_GifComposerFragment);
                C64333Db r23 = r33.A1B;
                C107695bk r13 = r23.A00;
                C107695bk.AFG(r23, r13, hilt_GifComposerFragment);
                C107695bk.AFH(r23, r13, hilt_GifComposerFragment, (C27831ek) r13.AA2.get());
                C88844at.A02(r33, r23, r13, hilt_GifComposerFragment);
            }
        } else if (!this.A02) {
            this.A02 = true;
            MediaComposerFragment mediaComposerFragment = (MediaComposerFragment) this;
            C88854au r4 = (C88854au) C18320x8.A0E(this);
            C64333Db r24 = r4.A1B;
            C107695bk r14 = r24.A00;
            C107695bk.AFG(r24, r14, mediaComposerFragment);
            C107695bk.AFH(r24, r14, mediaComposerFragment, (C27831ek) r14.AA2.get());
            C88844at.A02(r4, r24, r14, mediaComposerFragment);
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
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.mediacomposer.Hilt_MediaComposerFragment.A1F(android.app.Activity):void");
    }

    public void A1G(Context context) {
        super.A1G(context);
        A1I();
        A1H();
    }
}
