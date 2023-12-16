package com.whatsapp.events;

import X.AnonymousClass29z;
import X.AnonymousClass2C4;
import X.AnonymousClass46A;
import X.AnonymousClass487;
import X.C1002059z;
import X.C107695bk;
import X.C18270x1;
import X.C18320x8;
import X.C28071fd;
import X.C45942ap;
import X.C615931l;
import X.C64333Db;
import X.C88854au;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import com.whatsapp.base.WaFragment;

public abstract class Hilt_EventCreationFragment extends WaFragment {
    public ContextWrapper A00;
    public boolean A01;
    public boolean A02 = false;

    public void A1H() {
        if (!this.A02) {
            this.A02 = true;
            EventCreationFragment eventCreationFragment = (EventCreationFragment) this;
            C64333Db r3 = ((C88854au) C18320x8.A0E(this)).A1B;
            C107695bk r2 = r3.A00;
            C1002059z.A00(eventCreationFragment, r2.ANI());
            eventCreationFragment.A0F = C64333Db.A4B(r3);
            eventCreationFragment.A0B = C64333Db.A39(r3);
            eventCreationFragment.A0E = (C45942ap) r2.A44.get();
            eventCreationFragment.A0D = C64333Db.A3o(r3);
            eventCreationFragment.A0G = (C28071fd) r3.AJC.get();
            eventCreationFragment.A0A = C64333Db.A2t(r3);
            eventCreationFragment.A09 = C64333Db.A2o(r3);
            eventCreationFragment.A0H = C64333Db.A74(r3);
            AnonymousClass46A r0 = AnonymousClass2C4.A03;
            C615931l.A00(r0);
            eventCreationFragment.A0O = r0;
            eventCreationFragment.A0C = (AnonymousClass487) r2.A9c.get();
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
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.events.Hilt_EventCreationFragment.A1F(android.app.Activity):void");
    }

    public void A1G(Context context) {
        super.A1G(context);
        A1I();
        A1H();
    }
}
