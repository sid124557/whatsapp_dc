package com.whatsapp;

import X.AnonymousClass002;
import X.C106165Xw;
import X.C111095hX;
import X.C1230066r;
import X.C44852Xs;
import X.C56972sr;
import X.C64223Cq;
import X.C64773Ex;
import X.C69263Wi;
import X.C85244Fm;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import com.whatsapp.jid.UserJid;

public class PhoneHyperLinkDialogFragment extends Hilt_PhoneHyperLinkDialogFragment {
    public static final String A0F = PhoneHyperLinkDialogFragment.class.getSimpleName();
    public C111095hX A00;
    public C69263Wi A01;
    public C85244Fm A02;
    public C56972sr A03;
    public C1230066r A04;
    public C64773Ex A05;
    public C64223Cq A06;
    public C44852Xs A07;
    public UserJid A08;
    public C106165Xw A09;
    public String A0A;
    public String A0B;
    public boolean A0C;
    public boolean A0D;
    public boolean A0E;

    public static PhoneHyperLinkDialogFragment A00(UserJid userJid, String str, String str2, boolean z, boolean z2, boolean z3) {
        PhoneHyperLinkDialogFragment phoneHyperLinkDialogFragment = new PhoneHyperLinkDialogFragment();
        Bundle A082 = AnonymousClass002.A08();
        A082.putBoolean("isSyncFailure", z);
        A082.putBoolean("isWAAccount", z2);
        A082.putBoolean("isPhoneNumberOwner", z3);
        A082.putString("phoneNumber", str);
        A082.putParcelable("jid", userJid);
        A082.putString("url", str2);
        phoneHyperLinkDialogFragment.A0u(A082);
        return phoneHyperLinkDialogFragment;
    }

    public void A0k(int i, int i2, Intent intent) {
        if (i == 1000) {
            this.A06.A08();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x00aa  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.app.Dialog A1J(android.os.Bundle r8) {
        /*
            r7 = this;
            android.os.Bundle r2 = r7.A0H()
            java.lang.String r0 = "isSyncFailure"
            boolean r0 = r2.getBoolean(r0)
            r7.A0D = r0
            java.lang.String r0 = "isWAAccount"
            boolean r0 = r2.getBoolean(r0)
            r7.A0E = r0
            java.lang.String r0 = "isPhoneNumberOwner"
            boolean r0 = r2.getBoolean(r0)
            r7.A0C = r0
            X.33j r1 = r7.A01
            java.lang.String r0 = "phoneNumber"
            java.lang.String r0 = r2.getString(r0)
            X.C626936e.A06(r0)
            java.lang.String r0 = r1.A0I(r0)
            r7.A0A = r0
            java.lang.String r0 = "jid"
            android.os.Parcelable r0 = r2.getParcelable(r0)
            com.whatsapp.jid.UserJid r0 = (com.whatsapp.jid.UserJid) r0
            r7.A08 = r0
            java.lang.String r0 = "url"
            java.lang.String r0 = r2.getString(r0)
            X.C626936e.A06(r0)
            r7.A0B = r0
            X.0zH r5 = X.C18280x3.A0K(r7)
            android.view.LayoutInflater r1 = r7.A0I()
            r0 = 2131625738(0x7f0e070a, float:1.8878692E38)
            android.view.View r2 = X.C18310x6.A0H(r1, r0)
            android.widget.TextView r2 = (android.widget.TextView) r2
            boolean r0 = r7.A0D
            if (r0 != 0) goto L_0x0067
            boolean r1 = r7.A0E
            r0 = 2131892536(0x7f121938, float:1.9419823E38)
            if (r1 == 0) goto L_0x0061
            r0 = 2131892537(0x7f121939, float:1.9419825E38)
        L_0x0061:
            r2.setText(r0)
            r5.A0P(r2)
        L_0x0067:
            java.util.ArrayList r4 = X.AnonymousClass001.A0s()
            boolean r0 = r7.A0E
            r3 = 0
            r6 = 1
            if (r0 == 0) goto L_0x00d7
            r2 = 2131887743(0x7f12067f, float:1.9410102E38)
            java.lang.Object[] r1 = new java.lang.Object[r6]
            java.lang.String r0 = r7.A0A
            java.lang.String r1 = X.AnonymousClass0x7.A0n(r7, r0, r1, r3, r2)
            X.5Mr r0 = new X.5Mr
            r0.<init>(r1, r6)
            r4.add(r0)
            X.2sr r1 = r7.A03
            com.whatsapp.jid.UserJid r0 = r7.A08
            boolean r0 = r1.A0a(r0)
            if (r0 != 0) goto L_0x00a2
            r1 = 2131887373(0x7f12050d, float:1.9409351E38)
            android.content.res.Resources r0 = X.C08310eF.A09(r7)
            java.lang.String r2 = r0.getString(r1)
            r1 = 4
        L_0x009a:
            X.5Mr r0 = new X.5Mr
            r0.<init>(r2, r1)
            r4.add(r0)
        L_0x00a2:
            X.2sr r0 = r7.A03
            boolean r0 = X.C86664Kz.A1W(r0)
            if (r0 == 0) goto L_0x00be
            r1 = 2131886374(0x7f120126, float:1.9407325E38)
            android.content.res.Resources r0 = X.C08310eF.A09(r7)
            java.lang.String r2 = r0.getString(r1)
            r1 = 3
            X.5Mr r0 = new X.5Mr
            r0.<init>(r2, r1)
            r4.add(r0)
        L_0x00be:
            android.content.Context r2 = r7.A0G()
            r0 = 2131625737(0x7f0e0709, float:1.887869E38)
            android.widget.ArrayAdapter r1 = new android.widget.ArrayAdapter
            r1.<init>(r2, r0, r4)
            X.69T r0 = new X.69T
            r0.<init>(r7, r3, r4)
            r5.A0E(r0, r1)
            X.043 r0 = r5.create()
            return r0
        L_0x00d7:
            r2 = 2131888635(0x7f1209fb, float:1.941191E38)
            java.lang.Object[] r1 = new java.lang.Object[r6]
            java.lang.String r0 = r7.A0A
            java.lang.String r2 = X.AnonymousClass0x7.A0n(r7, r0, r1, r3, r2)
            r1 = 2
            goto L_0x009a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.PhoneHyperLinkDialogFragment.A1J(android.os.Bundle):android.app.Dialog");
    }

    public void onCancel(DialogInterface dialogInterface) {
        super.onCancel(dialogInterface);
        this.A07.A00(Boolean.valueOf(this.A0C), Boolean.valueOf(this.A0E), 8);
    }
}
