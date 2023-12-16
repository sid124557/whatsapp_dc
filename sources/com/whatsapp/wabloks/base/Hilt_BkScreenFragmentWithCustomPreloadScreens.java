package com.whatsapp.wabloks.base;

import X.AnonymousClass002;
import X.AnonymousClass29z;
import X.AnonymousClass3DY;
import X.AnonymousClass4GJ;
import X.AnonymousClass5VY;
import X.C116885r1;
import X.C17190ui;
import X.C18270x1;
import X.C18320x8;
import X.C88854au;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;

public abstract class Hilt_BkScreenFragmentWithCustomPreloadScreens extends BkFragment implements AnonymousClass4GJ {
    public ContextWrapper A00;
    public boolean A01;
    public boolean A02 = false;
    public final Object A03 = AnonymousClass002.A0D();
    public volatile C116885r1 A04;

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000c, code lost:
        if (r1 == r4) goto L_0x000e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A1F(android.app.Activity r4) {
        /*
            r3 = this;
            r2 = 1
            r3.A0X = r2
            android.content.ContextWrapper r0 = r3.A00
            if (r0 == 0) goto L_0x000e
            android.content.Context r1 = X.C116885r1.A00(r0)
            r0 = 0
            if (r1 != r4) goto L_0x000f
        L_0x000e:
            r0 = 1
        L_0x000f:
            X.AnonymousClass2A2.A01(r0)
            r3.A00()
            boolean r0 = r3.A02
            if (r0 != 0) goto L_0x0029
            r3.A02 = r2
            java.lang.Object r1 = r3.generatedComponent()
            X.3DY r1 = (X.AnonymousClass3DY) r1
            r0 = r3
            com.whatsapp.wabloks.base.BkScreenFragmentWithCustomPreloadScreens r0 = (com.whatsapp.wabloks.base.BkScreenFragmentWithCustomPreloadScreens) r0
            X.4au r1 = (X.C88854au) r1
            r1.A8F(r0)
        L_0x0029:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.wabloks.base.Hilt_BkScreenFragmentWithCustomPreloadScreens.A1F(android.app.Activity):void");
    }

    private void A00() {
        if (this.A00 == null) {
            this.A00 = C18320x8.A0T(super.A1D(), this);
            this.A01 = AnonymousClass29z.A00(super.A1D());
        }
    }

    public final Object generatedComponent() {
        if (this.A04 == null) {
            synchronized (this.A03) {
                if (this.A04 == null) {
                    this.A04 = new C116885r1(this);
                }
            }
        }
        return this.A04.generatedComponent();
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

    public void A1G(Context context) {
        super.A1G(context);
        A00();
        if (!this.A02) {
            this.A02 = true;
            ((C88854au) ((AnonymousClass3DY) generatedComponent())).A8F((BkScreenFragmentWithCustomPreloadScreens) this);
        }
    }

    public C17190ui B6u() {
        return AnonymousClass5VY.A01(this, super.B6u());
    }
}
