package com.whatsapp.mediacomposer.bottomsheet;

import X.AnonymousClass29z;
import X.AnonymousClass2OS;
import X.AnonymousClass3DY;
import X.C107695bk;
import X.C162287rd;
import X.C18270x1;
import X.C18310x6;
import X.C18320x8;
import X.C64333Db;
import X.C88854au;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import com.whatsapp.wds.components.bottomsheet.WDSBottomSheetDialogFragment;

public abstract class Hilt_MediaQualitySettingsBottomSheetFragment extends WDSBottomSheetDialogFragment {
    public ContextWrapper A00;
    public boolean A01;
    public boolean A02 = false;

    public void A1R() {
        if (this instanceof Hilt_VideoQualitySettingsBottomSheetFragment) {
            Hilt_VideoQualitySettingsBottomSheetFragment hilt_VideoQualitySettingsBottomSheetFragment = (Hilt_VideoQualitySettingsBottomSheetFragment) this;
            if (!hilt_VideoQualitySettingsBottomSheetFragment.A02) {
                hilt_VideoQualitySettingsBottomSheetFragment.A02 = true;
                AnonymousClass3DY A0O = C18310x6.A0O(hilt_VideoQualitySettingsBottomSheetFragment);
                VideoQualitySettingsBottomSheetFragment videoQualitySettingsBottomSheetFragment = (VideoQualitySettingsBottomSheetFragment) hilt_VideoQualitySettingsBottomSheetFragment;
                C64333Db r1 = ((C88854au) A0O).A1B;
                C107695bk.AFI(r1, r1.A00, videoQualitySettingsBottomSheetFragment);
                videoQualitySettingsBottomSheetFragment.A00 = (C162287rd) r1.AZ1.get();
            }
        } else if (this instanceof Hilt_ImageQualitySettingsBottomSheetFragment) {
            Hilt_ImageQualitySettingsBottomSheetFragment hilt_ImageQualitySettingsBottomSheetFragment = (Hilt_ImageQualitySettingsBottomSheetFragment) this;
            if (!hilt_ImageQualitySettingsBottomSheetFragment.A02) {
                hilt_ImageQualitySettingsBottomSheetFragment.A02 = true;
                AnonymousClass3DY A0O2 = C18310x6.A0O(hilt_ImageQualitySettingsBottomSheetFragment);
                ImageQualitySettingsBottomSheetFragment imageQualitySettingsBottomSheetFragment = (ImageQualitySettingsBottomSheetFragment) hilt_ImageQualitySettingsBottomSheetFragment;
                C64333Db r12 = ((C88854au) A0O2).A1B;
                C107695bk r0 = r12.A00;
                C107695bk.AFI(r12, r0, imageQualitySettingsBottomSheetFragment);
                imageQualitySettingsBottomSheetFragment.A01 = (AnonymousClass2OS) r0.A68.get();
                imageQualitySettingsBottomSheetFragment.A00 = C64333Db.A01(r12);
            }
        } else if (!this.A02) {
            this.A02 = true;
            C64333Db r13 = ((C88854au) C18310x6.A0O(this)).A1B;
            C107695bk.AFI(r13, r13.A00, (MediaQualitySettingsBottomSheetFragment) this);
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
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.mediacomposer.bottomsheet.Hilt_MediaQualitySettingsBottomSheetFragment.A1F(android.app.Activity):void");
    }

    public void A1G(Context context) {
        super.A1G(context);
        A1X();
        A1R();
    }
}
