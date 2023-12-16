package com.whatsapp.settings;

import X.AnonymousClass0x9;
import X.AnonymousClass66R;
import X.AnonymousClass8PJ;
import X.C162457s7;
import X.C18270x1;
import X.C18290x4;
import X.C18330xA;
import X.C46142b9;
import X.C634139d;
import X.C79563wp;
import X.C79573wq;
import X.C81163zR;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;

public final class SettingsPasskeysEnabledFragment extends Hilt_SettingsPasskeysEnabledFragment {
    public C46142b9 A00;
    public final AnonymousClass66R A01;

    public View A0K(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C162457s7.A0J(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.f8nameremoved, viewGroup, false);
        C162457s7.A0H(inflate);
        TextEmojiLabel textEmojiLabel = (TextEmojiLabel) C18290x4.A0M(inflate, R.id.passkey_create_screen_info_text);
        C46142b9 r1 = this.A00;
        if (r1 != null) {
            r1.A00(A0G(), textEmojiLabel);
            C634139d.A00(C18290x4.A0M(inflate, R.id.settings_passkeys_box_revoke_button), this, 11);
            return inflate;
        }
        throw C18270x1.A0S("descriptionHelper");
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x002c  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0043  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0051  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A1I(X.C84814Du r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof X.C74483hC
            if (r0 == 0) goto L_0x0098
            r6 = r8
            X.3hC r6 = (X.C74483hC) r6
            int r2 = r6.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0098
            int r2 = r2 - r1
            r6.label = r2
        L_0x0012:
            java.lang.Object r1 = r6.result
            X.218 r5 = X.AnonymousClass218.COROUTINE_SUSPENDED
            int r0 = r6.label
            r4 = 1
            if (r0 == 0) goto L_0x0067
            if (r0 != r4) goto L_0x009f
            java.lang.Object r3 = r6.L$1
            java.lang.Object r2 = r6.L$0
            X.5OE r2 = (X.AnonymousClass5OE) r2
            X.C57682u2.A01(r1)
        L_0x0026:
            X.5Bj r1 = (X.C100555Bj) r1
            boolean r0 = r1 instanceof X.C97714z7
            if (r0 == 0) goto L_0x0051
            java.lang.String r0 = "SettingsPasskeys/revokePasskey/success"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r1 = 0
            r0 = 15
            r2.A00(r1, r0)
            r0 = 4
        L_0x0038:
            X.3bs r1 = new X.3bs
            r1.<init>((java.lang.Object) r3, (int) r0)
            boolean r0 = X.C161827qc.A04()
            if (r0 == 0) goto L_0x0049
            r1.run()
        L_0x0046:
            X.2wD r0 = X.C59022wD.A00
            return r0
        L_0x0049:
            android.os.Handler r0 = X.C161827qc.A00()
            r0.post(r1)
            goto L_0x0046
        L_0x0051:
            boolean r0 = r1 instanceof X.C97704z6
            if (r0 == 0) goto L_0x0046
            X.4z6 r1 = (X.C97704z6) r1
            java.lang.Object r1 = r1.A00
            java.lang.Throwable r1 = (java.lang.Throwable) r1
            java.lang.String r0 = "SettingsPasskeys/revokePasskey/error"
            com.whatsapp.util.Log.e(r0, r1)
            r0 = 16
            r2.A00(r1, r0)
            r0 = 5
            goto L_0x0038
        L_0x0067:
            X.C57682u2.A01(r1)
            java.lang.String r0 = "SettingsPasskeys/revokePasskey"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.66R r1 = r7.A01
            X.5OE r2 = X.C18300x5.A0V(r1)
            X.03q r3 = r7.A0Q()
            if (r3 != 0) goto L_0x0080
            java.lang.String r0 = "SettingsPasskeys/no activity bound"
            com.whatsapp.util.Log.e((java.lang.String) r0)
        L_0x0080:
            X.AnonymousClass0x9.A1L(r3)
            if (r3 == 0) goto L_0x0046
            java.lang.Object r0 = r1.getValue()
            com.whatsapp.settings.SettingsPasskeysViewModel r0 = (com.whatsapp.settings.SettingsPasskeysViewModel) r0
            r6.L$0 = r2
            r6.L$1 = r3
            r6.label = r4
            java.lang.Object r1 = r0.A0E(r6)
            if (r1 != r5) goto L_0x0026
            return r5
        L_0x0098:
            X.3hC r6 = new X.3hC
            r6.<init>(r7, r8)
            goto L_0x0012
        L_0x009f:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0d()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.settings.SettingsPasskeysEnabledFragment.A1I(X.4Du):java.lang.Object");
    }

    public SettingsPasskeysEnabledFragment() {
        AnonymousClass8PJ A1E = AnonymousClass0x9.A1E(SettingsPasskeysViewModel.class);
        this.A01 = C18330xA.A02(new C79563wp(this), new C79573wq(this), new C81163zR(this), A1E);
    }
}
