package com.whatsapp.settings;

import X.AnonymousClass08M;
import X.AnonymousClass3Z6;
import X.C05550Ty;
import X.C162457s7;
import X.C60442yZ;
import X.C60962zS;

public final class SettingsSetupUserProxyViewModel extends C05550Ty {
    public C60962zS A00;
    public C60962zS A01;
    public final AnonymousClass08M A02 = AnonymousClass08M.A01();
    public final C60442yZ A03;

    public SettingsSetupUserProxyViewModel(C60442yZ r2) {
        C162457s7.A0J(r2, 1);
        this.A03 = r2;
    }

    public final C60962zS A0D() {
        C60962zS r0;
        AnonymousClass3Z6 r02 = (AnonymousClass3Z6) this.A02.A07();
        if (r02 == null || (r0 = (C60962zS) r02.second) == null) {
            return new C60962zS((String) null, (String) null, 443, 587, true);
        }
        return r0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001d, code lost:
        if (X.C100515Bf.A00(r3) != false) goto L_0x001f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0E(X.C60962zS r3) {
        /*
            r2 = this;
            X.2zS r0 = r2.A01
            if (r0 != 0) goto L_0x0012
            X.2yZ r0 = r2.A03
            X.2rm r1 = r0.A00
            java.lang.String r0 = r1.A00()
            X.2zS r0 = X.C385528d.A00(r1, r0)
            r2.A01 = r0
        L_0x0012:
            boolean r0 = X.C162457s7.A0P(r0, r3)
            if (r0 != 0) goto L_0x001f
            boolean r1 = X.C100515Bf.A00(r3)
            r0 = 0
            if (r1 == 0) goto L_0x0020
        L_0x001f:
            r0 = 2
        L_0x0020:
            X.08M r1 = r2.A02
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            X.3Z6 r0 = X.AnonymousClass3Z6.A02(r0, r3)
            r1.A0H(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.settings.SettingsSetupUserProxyViewModel.A0E(X.2zS):void");
    }
}
