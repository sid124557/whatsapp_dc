package com.whatsapp.backup.encryptedbackup;

import X.AnonymousClass29z;
import X.C116885r1;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;

public abstract class Hilt_EncryptionKeyInfoFragment extends EncryptionKeyDisplayFragment {
    public ContextWrapper A00;
    public boolean A01;
    public boolean A02 = false;

    public void A1H() {
        if (!this.A02) {
            this.A02 = true;
            ((EncryptionKeyInfoFragment_GeneratedInjector) generatedComponent()).BGN((EncryptionKeyInfoFragment) this);
        }
    }

    public final void A1J() {
        if (this.A00 == null) {
            this.A00 = C116885r1.A01(super.A1D(), this);
            this.A01 = AnonymousClass29z.A00(super.A1D());
        }
    }

    public Context A1D() {
        if (super.A1D() == null && !this.A01) {
            return null;
        }
        A1J();
        return this.A00;
    }

    public LayoutInflater A1E(Bundle bundle) {
        LayoutInflater A1E = super.A1E(bundle);
        return A1E.cloneInContext(C116885r1.A02(A1E, this));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000d, code lost:
        if (X.C116885r1.A00(r0) == r5) goto L_0x000f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A1F(android.app.Activity r5) {
        /*
            r4 = this;
            super.A1F(r5)
            android.content.ContextWrapper r0 = r4.A00
            r3 = 0
            if (r0 == 0) goto L_0x000f
            android.content.Context r0 = X.C116885r1.A00(r0)
            r2 = 0
            if (r0 != r5) goto L_0x0010
        L_0x000f:
            r2 = 1
        L_0x0010:
            java.lang.String r1 = "onAttach called multiple times with different Context! Hilt Fragments should not be retained."
            java.lang.Object[] r0 = new java.lang.Object[r3]
            X.AnonymousClass2A2.A00(r1, r0, r2)
            r4.A1J()
            r4.A1H()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.backup.encryptedbackup.Hilt_EncryptionKeyInfoFragment.A1F(android.app.Activity):void");
    }

    public void A1G(Context context) {
        super.A1G(context);
        A1J();
        A1H();
    }
}
