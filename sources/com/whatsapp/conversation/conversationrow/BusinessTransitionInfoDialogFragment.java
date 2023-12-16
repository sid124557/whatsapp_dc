package com.whatsapp.conversation.conversationrow;

import X.AnonymousClass4FV;
import X.AnonymousClass5Y0;
import X.C111095hX;
import X.C24851Yz;
import X.C56892sj;
import X.C64773Ex;
import X.C66433Lk;
import android.content.DialogInterface;

public class BusinessTransitionInfoDialogFragment extends Hilt_BusinessTransitionInfoDialogFragment {
    public C111095hX A00;
    public C64773Ex A01;
    public C56892sj A02;
    public AnonymousClass5Y0 A03;
    public AnonymousClass4FV A04;
    public C24851Yz A05;
    public C66433Lk A06;

    public void onCancel(DialogInterface dialogInterface) {
        C24851Yz r1 = this.A05;
        if (r1 != null) {
            r1.A01 = 0;
            this.A04.BhD(r1);
        }
        super.onCancel(dialogInterface);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0060, code lost:
        if (r4 == 4) goto L_0x0062;
     */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x005a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.app.Dialog A1J(android.os.Bundle r7) {
        /*
            r6 = this;
            android.os.Bundle r2 = r6.A0H()
            java.lang.String r0 = "jid"
            java.lang.String r0 = r2.getString(r0)
            X.4uZ r3 = X.C18310x6.A0S(r0)
            java.lang.String r0 = "message"
            java.lang.String r5 = r2.getString(r0)
            java.lang.String r0 = "transitionId"
            int r4 = r2.getInt(r0)
            java.lang.String r1 = "systemAction"
            r0 = -1
            int r1 = r2.getInt(r1, r0)
            r0 = 69
            if (r1 != r0) goto L_0x0069
            if (r3 == 0) goto L_0x0069
            X.1Yz r2 = new X.1Yz
            r2.<init>()
            r6.A05 = r2
            boolean r0 = r3 instanceof X.C28011fL
            if (r0 == 0) goto L_0x0097
            boolean r0 = X.C627336j.A0K(r3)
            if (r0 == 0) goto L_0x0097
            X.2sj r0 = r6.A02
            X.1fL r3 = (X.C28011fL) r3
            X.33h r0 = r0.A09
            int r0 = r0.A03(r3)
            int r0 = X.AnonymousClass36M.A01(r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2.A02 = r0
            r1 = 2
        L_0x004f:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            r2.A00 = r0
        L_0x0055:
            X.1Yz r2 = r6.A05
            r0 = 2
            if (r4 == r0) goto L_0x0062
            r0 = 3
            r1 = 1
            if (r4 == r0) goto L_0x0063
            r0 = 4
            r1 = 0
            if (r4 != r0) goto L_0x0063
        L_0x0062:
            r1 = 2
        L_0x0063:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            r2.A03 = r0
        L_0x0069:
            X.0zH r3 = X.C18300x5.A0L(r6)
            android.content.Context r1 = r6.A1D()
            X.5Y0 r0 = r6.A03
            java.lang.CharSequence r0 = X.C107345b9.A05(r1, r0, r5)
            r3.A0g(r0)
            r0 = 1
            r3.A0i(r0)
            r2 = 2131895973(0x7f1226a5, float:1.9426794E38)
            r1 = 4
            X.4I4 r0 = new X.4I4
            r0.<init>(r6, r4, r1)
            r3.A0X(r0, r2)
            r1 = 2131891392(0x7f1214c0, float:1.9417503E38)
            r0 = 52
            X.C19340zH.A07(r3, r6, r0, r1)
            X.043 r0 = r3.create()
            return r0
        L_0x0097:
            boolean r0 = r3 instanceof com.whatsapp.jid.UserJid
            if (r0 == 0) goto L_0x0055
            X.3Ex r0 = r6.A01
            com.whatsapp.jid.UserJid r3 = (com.whatsapp.jid.UserJid) r3
            boolean r0 = r0.A0l(r3)
            r1 = 1
            if (r0 == 0) goto L_0x004f
            r1 = 0
            goto L_0x004f
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.conversation.conversationrow.BusinessTransitionInfoDialogFragment.A1J(android.os.Bundle):android.app.Dialog");
    }
}
