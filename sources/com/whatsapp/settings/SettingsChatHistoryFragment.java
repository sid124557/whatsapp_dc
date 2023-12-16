package com.whatsapp.settings;

import X.AnonymousClass09Q;
import X.AnonymousClass1VX;
import X.AnonymousClass314;
import X.AnonymousClass4FS;
import X.C104355Qq;
import X.C104905Su;
import X.C106405Yw;
import X.C56512s6;
import X.C56972sr;
import X.C61072zf;
import X.C621033m;
import X.C626936e;
import X.C64773Ex;
import X.C66663Mh;
import X.C69263Wi;
import X.C89114bZ;
import X.C95814uZ;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import androidx.preference.PreferenceFragmentCompat;

public class SettingsChatHistoryFragment extends Hilt_SettingsChatHistoryFragment {
    public C69263Wi A00;
    public C56972sr A01;
    public C66663Mh A02;
    public C621033m A03;
    public C64773Ex A04;
    public AnonymousClass314 A05;
    public C104905Su A06;
    public C56512s6 A07;
    public C61072zf A08;
    public AnonymousClass1VX A09;
    public C95814uZ A0A;
    public C104355Qq A0B;
    public AnonymousClass4FS A0C;
    public boolean A0D = false;

    public void A0k(int i, int i2, Intent intent) {
        if (i == 10 && i2 == -1) {
            C95814uZ A012 = C106405Yw.A01(intent, "contact");
            C626936e.A07(A012, intent.getStringExtra("contact"));
            this.A0A = A012;
            C89114bZ r2 = this.A00;
            if (r2 != null) {
                this.A06.A01(r2, r2, this.A04.A07(A012), A012);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0081, code lost:
        if (r1 == 0) goto L_0x0083;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A1H(java.lang.String r7, android.os.Bundle r8) {
        /*
            r6 = this;
            X.4bZ r0 = r6.A00
            if (r0 == 0) goto L_0x00a5
            X.03q r1 = r6.A0R()
            r0 = 2131893594(0x7f121d5a, float:1.9421969E38)
            java.lang.String r1 = r1.getString(r0)
            X.4bZ r0 = r6.A00
            if (r0 == 0) goto L_0x0016
            r0.setTitle(r1)
        L_0x0016:
            r0 = 2132279304(0x7f180008, float:2.0204282E38)
            r6.A1K(r0)
            X.1VX r0 = r6.A09
            boolean r0 = X.C86634Kw.A1b(r0)
            r6.A0D = r0
            X.3Mh r1 = r6.A02
            X.1Ei r0 = X.C66663Mh.A0J
            boolean r0 = r1.A08(r0)
            java.lang.String r2 = "email_chat_history"
            if (r0 == 0) goto L_0x00a6
            X.2sr r0 = r6.A01
            boolean r0 = r0.A0Y()
            if (r0 != 0) goto L_0x00a6
            androidx.preference.Preference r2 = r6.B3I(r2)
            r1 = 0
            X.69S r0 = new X.69S
            r0.<init>(r6, r1)
            r2.A0B = r0
            boolean r0 = r6.A0D
            if (r0 == 0) goto L_0x004e
            r0 = 2131232668(0x7f08079c, float:1.8081452E38)
            r2.A0C(r0)
        L_0x004e:
            java.lang.String r0 = "msgstore_delete_all_chats"
            androidx.preference.Preference r5 = r6.B3I(r0)
            r1 = 1
            X.69S r0 = new X.69S
            r0.<init>(r6, r1)
            r5.A0B = r0
            java.lang.String r0 = "msgstore_clear_all_chats"
            androidx.preference.Preference r2 = r6.B3I(r0)
            r1 = 2
            X.69S r0 = new X.69S
            r0.<init>(r6, r1)
            r2.A0B = r0
            java.lang.String r4 = "msgstore_archive_all_chats"
            androidx.preference.Preference r3 = r6.B3I(r4)
            X.314 r0 = r6.A05
            int r2 = r0.A03()
            X.314 r0 = r6.A05
            int r1 = r0.A02()
            if (r2 > 0) goto L_0x0083
            r0 = 2131894554(0x7f12211a, float:1.9423916E38)
            if (r1 != 0) goto L_0x0086
        L_0x0083:
            r0 = 2131895674(0x7f12257a, float:1.9426188E38)
        L_0x0086:
            r3.A0D(r0)
            androidx.preference.Preference r2 = r6.B3I(r4)
            r1 = 3
            X.69S r0 = new X.69S
            r0.<init>(r6, r1)
            r2.A0B = r0
            boolean r0 = r6.A0D
            if (r0 == 0) goto L_0x00a5
            r0 = 2131232666(0x7f08079a, float:1.8081448E38)
            r3.A0C(r0)
            r0 = 2131232606(0x7f08075e, float:1.8081326E38)
            r5.A0C(r0)
        L_0x00a5:
            return
        L_0x00a6:
            X.0Pz r0 = r6.A02
            androidx.preference.PreferenceScreen r1 = r0.A07
            if (r1 == 0) goto L_0x004e
            androidx.preference.Preference r0 = r6.B3I(r2)
            if (r0 == 0) goto L_0x004e
            r1.A0X(r0)
            r1.A07()
            goto L_0x004e
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.settings.SettingsChatHistoryFragment.A1H(java.lang.String, android.os.Bundle):void");
    }

    public void A0w(Bundle bundle, View view) {
        super.A0w(bundle, view);
        ColorDrawable colorDrawable = new ColorDrawable(0);
        AnonymousClass09Q r2 = this.A06;
        r2.A00 = colorDrawable.getIntrinsicHeight();
        r2.A01 = colorDrawable;
        PreferenceFragmentCompat preferenceFragmentCompat = r2.A03;
        preferenceFragmentCompat.A03.A0P();
        r2.A00 = 0;
        preferenceFragmentCompat.A03.A0P();
    }
}
