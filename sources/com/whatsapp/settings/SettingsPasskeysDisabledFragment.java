package com.whatsapp.settings;

import X.AnonymousClass0x9;
import X.AnonymousClass66R;
import X.AnonymousClass8PJ;
import X.C1001059l;
import X.C162457s7;
import X.C18270x1;
import X.C18290x4;
import X.C18330xA;
import X.C46142b9;
import X.C634139d;
import X.C79543wn;
import X.C79553wo;
import X.C81153zQ;
import X.C85474Gj;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;

public final class SettingsPasskeysDisabledFragment extends Hilt_SettingsPasskeysDisabledFragment {
    public C46142b9 A00;
    public C85474Gj A01;
    public final AnonymousClass66R A02;

    public View A0K(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C162457s7.A0J(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.f8nameremoved, viewGroup, false);
        C162457s7.A0H(inflate);
        TextEmojiLabel textEmojiLabel = (TextEmojiLabel) C18290x4.A0M(inflate, R.id.passkey_create_screen_info_text);
        C46142b9 r1 = this.A00;
        if (r1 != null) {
            r1.A00(A0G(), textEmojiLabel);
            C634139d.A00(C18290x4.A0M(inflate, R.id.passkey_create_screen_create_button), this, 10);
            if (C1001059l.A04) {
                inflate.findViewById(R.id.passkey_create_screen_wrapper).setVisibility(8);
                inflate.findViewById(R.id.passkey_create_screen_passkeys_alt).setVisibility(0);
            }
            return inflate;
        }
        throw C18270x1.A0S("descriptionHelper");
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x002e  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0034  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0050  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0058  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A1I(X.C84814Du r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof X.C74303gu
            if (r0 == 0) goto L_0x0085
            r5 = r7
            X.3gu r5 = (X.C74303gu) r5
            int r2 = r5.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0085
            int r2 = r2 - r1
            r5.label = r2
        L_0x0012:
            java.lang.Object r4 = r5.result
            X.218 r3 = X.AnonymousClass218.COROUTINE_SUSPENDED
            int r0 = r5.label
            r2 = 1
            if (r0 == 0) goto L_0x0058
            if (r0 != r2) goto L_0x008b
            java.lang.Object r1 = r5.L$0
            X.C57682u2.A01(r4)
        L_0x0022:
            X.58d r4 = (X.C997758d) r4
            int r0 = r4.ordinal()
            switch(r0) {
                case 0: goto L_0x003b;
                case 1: goto L_0x0034;
                case 2: goto L_0x0034;
                case 3: goto L_0x0034;
                case 4: goto L_0x002e;
                case 5: goto L_0x0034;
                default: goto L_0x002b;
            }
        L_0x002b:
            X.2wD r0 = X.C59022wD.A00
            return r0
        L_0x002e:
            java.lang.String r0 = "SettingsPasskeys/createPasskey/canceled"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            goto L_0x002b
        L_0x0034:
            java.lang.String r0 = "SettingsPasskeys/createPasskey/failed"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r0 = 3
            goto L_0x0041
        L_0x003b:
            java.lang.String r0 = "SettingsPasskeys/createPasskey/success"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r0 = 2
        L_0x0041:
            X.3bs r2 = new X.3bs
            r2.<init>((java.lang.Object) r1, (int) r0)
            boolean r0 = X.C161827qc.A04()
            if (r0 == 0) goto L_0x0050
            r2.run()
            goto L_0x002b
        L_0x0050:
            android.os.Handler r0 = X.C161827qc.A00()
            r0.post(r2)
            goto L_0x002b
        L_0x0058:
            X.C57682u2.A01(r4)
            java.lang.String r0 = "SettingsPasskeys/createPasskey"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.03q r1 = r6.A0Q()
            if (r1 != 0) goto L_0x006b
            java.lang.String r0 = "SettingsPasskeys/no activity bound"
            com.whatsapp.util.Log.e((java.lang.String) r0)
        L_0x006b:
            X.AnonymousClass0x9.A1L(r1)
            X.07r r1 = (X.C009707r) r1
            if (r1 == 0) goto L_0x002b
            X.66R r0 = r6.A02
            java.lang.Object r0 = r0.getValue()
            com.whatsapp.settings.SettingsPasskeysViewModel r0 = (com.whatsapp.settings.SettingsPasskeysViewModel) r0
            r5.L$0 = r1
            r5.label = r2
            java.lang.Object r4 = r0.A0D(r1, r5)
            if (r4 != r3) goto L_0x0022
            return r3
        L_0x0085:
            X.3gu r5 = new X.3gu
            r5.<init>(r6, r7)
            goto L_0x0012
        L_0x008b:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0d()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.settings.SettingsPasskeysDisabledFragment.A1I(X.4Du):java.lang.Object");
    }

    public SettingsPasskeysDisabledFragment() {
        AnonymousClass8PJ A1E = AnonymousClass0x9.A1E(SettingsPasskeysViewModel.class);
        this.A02 = C18330xA.A02(new C79543wn(this), new C79553wo(this), new C81153zQ(this), A1E);
    }
}
