package com.whatsapp.messaging;

import X.AnonymousClass29z;
import X.AnonymousClass3DY;
import X.AnonymousClass5R7;
import X.C107695bk;
import X.C18270x1;
import X.C18320x8;
import X.C57502tk;
import X.C64333Db;
import X.C86604Kt;
import X.C88854au;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import com.whatsapp.base.WaFragment;

public abstract class Hilt_BaseViewOnceMessageViewerFragment extends WaFragment {
    public ContextWrapper A00;
    public boolean A01;
    public boolean A02 = false;

    private void A00() {
        if (this.A00 == null) {
            this.A00 = C18320x8.A0T(super.A1D(), this);
            this.A01 = AnonymousClass29z.A00(super.A1D());
        }
    }

    public void A1H() {
        if (this instanceof Hilt_ViewOnceTextFragment) {
            Hilt_ViewOnceTextFragment hilt_ViewOnceTextFragment = (Hilt_ViewOnceTextFragment) this;
            if (!hilt_ViewOnceTextFragment.A02) {
                hilt_ViewOnceTextFragment.A02 = true;
                C64333Db r2 = ((C88854au) C18320x8.A0E(hilt_ViewOnceTextFragment)).A1B;
                C107695bk r1 = r2.A00;
                C107695bk.AFP(r1, hilt_ViewOnceTextFragment);
                hilt_ViewOnceTextFragment.A01 = r2.Aog();
                hilt_ViewOnceTextFragment.A03 = C64333Db.A8F(r2);
                hilt_ViewOnceTextFragment.A00 = (AnonymousClass5R7) r1.A2p.get();
            }
        } else if (this instanceof Hilt_ViewOnceAudioFragment) {
            Hilt_ViewOnceAudioFragment hilt_ViewOnceAudioFragment = (Hilt_ViewOnceAudioFragment) this;
            if (!hilt_ViewOnceAudioFragment.A02) {
                hilt_ViewOnceAudioFragment.A02 = true;
                AnonymousClass3DY A0E = C18320x8.A0E(hilt_ViewOnceAudioFragment);
                ViewOnceAudioFragment viewOnceAudioFragment = (ViewOnceAudioFragment) hilt_ViewOnceAudioFragment;
                C64333Db r22 = ((C88854au) A0E).A1B;
                C107695bk r12 = r22.A00;
                C107695bk.AFP(r12, viewOnceAudioFragment);
                viewOnceAudioFragment.A01 = r22.Aog();
                viewOnceAudioFragment.A03 = C64333Db.A8F(r22);
                viewOnceAudioFragment.A00 = (AnonymousClass5R7) r12.A2p.get();
                viewOnceAudioFragment.A02 = C107695bk.A17(r12);
                viewOnceAudioFragment.A03 = C86604Kt.A0U(r22);
                viewOnceAudioFragment.A04 = (C57502tk) r12.A6u.get();
                viewOnceAudioFragment.A01 = C64333Db.A29(r22);
            }
        } else if (!this.A02) {
            this.A02 = true;
            BaseViewOnceMessageViewerFragment baseViewOnceMessageViewerFragment = (BaseViewOnceMessageViewerFragment) this;
            C64333Db r23 = ((C88854au) C18320x8.A0E(this)).A1B;
            C107695bk r13 = r23.A00;
            C107695bk.AFP(r13, baseViewOnceMessageViewerFragment);
            baseViewOnceMessageViewerFragment.A01 = r23.Aog();
            baseViewOnceMessageViewerFragment.A03 = C64333Db.A8F(r23);
            baseViewOnceMessageViewerFragment.A00 = (AnonymousClass5R7) r13.A2p.get();
        }
    }

    public Context A1D() {
        if (super.A1D() == null && !this.A01) {
            return null;
        }
        A00();
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
            r2.A00()
            r2.A1H()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.messaging.Hilt_BaseViewOnceMessageViewerFragment.A1F(android.app.Activity):void");
    }

    public void A1G(Context context) {
        super.A1G(context);
        A00();
        A1H();
    }
}
