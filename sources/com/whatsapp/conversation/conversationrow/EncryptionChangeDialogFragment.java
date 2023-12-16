package com.whatsapp.conversation.conversationrow;

import X.AnonymousClass3LP;
import X.AnonymousClass4FV;
import X.AnonymousClass5Y0;
import X.AnonymousClass5ZU;
import X.C111095hX;
import X.C24851Yz;
import X.C48952fk;
import X.C53202mi;
import X.C56422rx;
import X.C56892sj;
import X.C56972sr;
import X.C64773Ex;
import X.C66433Lk;
import android.content.DialogInterface;

public class EncryptionChangeDialogFragment extends Hilt_EncryptionChangeDialogFragment {
    public C111095hX A00;
    public C56972sr A01;
    public C64773Ex A02;
    public C56422rx A03;
    public AnonymousClass5ZU A04;
    public C48952fk A05;
    public C56892sj A06;
    public AnonymousClass5Y0 A07;
    public AnonymousClass3LP A08;
    public AnonymousClass4FV A09;
    public C24851Yz A0A;
    public C53202mi A0B;
    public C66433Lk A0C;

    public void onCancel(DialogInterface dialogInterface) {
        C24851Yz r1 = this.A0A;
        if (r1 != null) {
            r1.A01 = 0;
            this.A09.BhD(r1);
        }
        super.onCancel(dialogInterface);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0076, code lost:
        if (r5 == 17) goto L_0x0078;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x01ae, code lost:
        if (r10.A02.A0Y(X.C58422vE.A02, 1967) == false) goto L_0x01b0;
     */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x01fc  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x0205  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0207  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.app.Dialog A1J(android.os.Bundle r11) {
        /*
            r10 = this;
            android.os.Bundle r3 = r10.A0H()
            java.lang.String r0 = "jid"
            java.lang.String r2 = r3.getString(r0)
            java.lang.String r1 = "provider_category"
            r0 = 0
            int r9 = r3.getInt(r1, r0)
            java.lang.String r1 = "business_state_id"
            r0 = -1
            int r5 = r3.getInt(r1, r0)
            X.4uZ r4 = X.C18310x6.A0S(r2)
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "Invalid jid="
            java.lang.String r0 = X.AnonymousClass000.A0V(r0, r2, r1)
            X.C626936e.A07(r4, r0)
            r8 = -1
            boolean r0 = X.AnonymousClass000.A1U(r5, r8)
            r3 = 1
            if (r0 == 0) goto L_0x0194
            X.3Ex r0 = r10.A02
            X.3ZH r2 = r0.A0A(r4)
            if (r9 == 0) goto L_0x00e2
            X.3LP r7 = r10.A08
            android.content.Context r6 = r10.A0G()
            X.3Ex r0 = r10.A02
            X.5ZU r1 = r10.A04
            X.3ZH r0 = r0.A0A(r4)
            java.lang.String r2 = r1.A0R(r0, r8, r3)
            switch(r9) {
                case 1: goto L_0x00d9;
                case 2: goto L_0x00cc;
                case 3: goto L_0x00cc;
                case 4: goto L_0x00d9;
                case 5: goto L_0x00cc;
                case 6: goto L_0x00cc;
                default: goto L_0x004f;
            }
        L_0x004f:
            r0 = 2131888999(0x7f120b67, float:1.941265E38)
            java.lang.String r4 = r6.getString(r0)
        L_0x0056:
            X.3Lk r2 = r10.A0C
            java.lang.String r1 = "security-and-privacy"
            java.lang.String r0 = "end-to-end-encryption-for-business-messages"
            android.net.Uri r0 = r2.A04(r1, r0)
        L_0x0061:
            X.0PJ r2 = X.AnonymousClass0x9.A0G(r4, r0)
        L_0x0065:
            java.lang.Object r7 = r2.A00
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Object r4 = r2.A01
            X.0zH r2 = X.C18280x3.A0K(r10)
            r0 = 16
            if (r5 == r0) goto L_0x0078
            r0 = 17
            r6 = 0
            if (r5 != r0) goto L_0x0079
        L_0x0078:
            r6 = 1
        L_0x0079:
            android.content.Context r1 = r10.A0G()
            if (r6 == 0) goto L_0x00c2
            android.widget.TextView r5 = new android.widget.TextView
            r5.<init>(r1)
            r0 = 2131887808(0x7f1206c0, float:1.9410234E38)
            r5.setText(r0)
            android.content.res.Resources r0 = X.C08310eF.A09(r10)
            android.util.DisplayMetrics r1 = r0.getDisplayMetrics()
            r0 = 1103101952(0x41c00000, float:24.0)
            float r0 = android.util.TypedValue.applyDimension(r3, r0, r1)
            int r0 = (int) r0
            r5.setPadding(r0, r0, r0, r0)
            r0 = 5
            r5.setTextAlignment(r0)
            r2.setView(r5)
        L_0x00a3:
            r2.A0R(r3)
            if (r6 != 0) goto L_0x00b5
            r0 = 9
            X.4I8 r1 = new X.4I8
            r1.<init>(r4, r0, r10)
            r0 = 2131895973(0x7f1226a5, float:1.9426794E38)
            r2.A0X(r1, r0)
        L_0x00b5:
            r1 = 2131891392(0x7f1214c0, float:1.9417503E38)
            r0 = 53
            X.C85804Hr.A00(r2, r10, r0, r1)
            X.043 r0 = r2.create()
            return r0
        L_0x00c2:
            X.5Y0 r0 = r10.A07
            java.lang.CharSequence r0 = X.C107345b9.A05(r1, r0, r7)
            r2.A0Q(r0)
            goto L_0x00a3
        L_0x00cc:
            boolean r0 = X.C615031a.A01(r7, r4)
            r1 = 2131886843(0x7f1202fb, float:1.9408276E38)
            if (r0 == 0) goto L_0x00dc
            r1 = 2131888149(0x7f120815, float:1.9410925E38)
            goto L_0x00dc
        L_0x00d9:
            r1 = 2131886841(0x7f1202f9, float:1.9408272E38)
        L_0x00dc:
            java.lang.String r4 = X.AnonymousClass0x2.A0X(r6, r2, r3, r1)
            goto L_0x0056
        L_0x00e2:
            X.2mi r0 = r10.A0B
            boolean r0 = r0.A02(r4)
            if (r0 == 0) goto L_0x00ff
            r1 = 2131888151(0x7f120817, float:1.941093E38)
            android.content.res.Resources r0 = X.C08310eF.A09(r10)
            java.lang.String r4 = r0.getString(r1)
            X.3Lk r1 = r10.A0C
            java.lang.String r0 = "about-safely-communicating-with-whatsapp-support"
        L_0x00f9:
            android.net.Uri r0 = X.C66433Lk.A00(r1, r0)
            goto L_0x0061
        L_0x00ff:
            X.1VX r0 = r10.A02
            boolean r0 = X.C616831v.A00(r0, r4)
            if (r0 == 0) goto L_0x011c
            android.content.Context r6 = r10.A0G()
            r4 = 2131892745(0x7f121a09, float:1.9420247E38)
            java.lang.Object[] r2 = new java.lang.Object[r3]
            r1 = 0
            java.lang.String r0 = "WhatsApp Surveys"
            java.lang.String r4 = X.AnonymousClass002.A0F(r6, r0, r2, r1, r4)
            X.3Lk r1 = r10.A0C
            java.lang.String r0 = "https://faq.whatsapp.com/general/about-whatsapp-surveys"
            goto L_0x00f9
        L_0x011c:
            X.3LP r0 = r10.A08
            boolean r0 = X.C57362tW.A00(r0, r4)
            if (r0 == 0) goto L_0x0134
            android.content.Context r1 = r10.A0G()
            r0 = 2131895463(0x7f1224a7, float:1.942576E38)
            java.lang.String r4 = X.AnonymousClass1RT.A00(r1, r0)
            X.3Lk r1 = r10.A0C
            java.lang.String r0 = "https://faq.whatsapp.com/general/chats/about-the-official-whatsapp-chat-account"
            goto L_0x00f9
        L_0x0134:
            com.whatsapp.jid.UserJid r1 = X.AnonymousClass32Y.A03(r4)
            if (r1 == 0) goto L_0x0192
            boolean r0 = r2.A0R()
            if (r0 == 0) goto L_0x0192
            X.2rx r0 = r10.A03
            boolean r2 = r0.A03(r1)
        L_0x0146:
            X.3LP r0 = r10.A08
            boolean r0 = X.C615031a.A01(r0, r4)
            r1 = 2131888999(0x7f120b67, float:1.941265E38)
            if (r0 == 0) goto L_0x0154
            r1 = 2131895431(0x7f122487, float:1.9425695E38)
        L_0x0154:
            android.content.res.Resources r0 = X.C08310eF.A09(r10)
            java.lang.String r4 = r0.getString(r1)
            if (r2 == 0) goto L_0x0170
            X.3Lk r1 = r10.A0C
            java.lang.String r0 = "26000103"
            android.net.Uri r0 = X.C66433Lk.A00(r1, r0)
            java.lang.String r0 = r0.toString()
        L_0x016a:
            android.net.Uri r0 = android.net.Uri.parse(r0)
            goto L_0x0061
        L_0x0170:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "https://www.whatsapp.com/security?lg="
            r1.append(r0)
            X.33j r0 = r10.A01
            java.lang.String r0 = r0.A07()
            r1.append(r0)
            java.lang.String r0 = "&lc="
            r1.append(r0)
            X.33j r0 = r10.A01
            java.lang.String r0 = r0.A06()
            java.lang.String r0 = X.AnonymousClass000.A0X(r0, r1)
            goto L_0x016a
        L_0x0192:
            r2 = 0
            goto L_0x0146
        L_0x0194:
            X.1Yz r0 = new X.1Yz
            r0.<init>()
            r10.A0A = r0
            X.2sr r0 = r10.A01
            boolean r0 = r0.A0a(r4)
            if (r0 == 0) goto L_0x01b0
            X.1VX r2 = r10.A02
            r1 = 1967(0x7af, float:2.756E-42)
            X.2vE r0 = X.C58422vE.A02
            boolean r0 = r2.A0Y(r0, r1)
            r2 = 1
            if (r0 != 0) goto L_0x01b1
        L_0x01b0:
            r2 = 0
        L_0x01b1:
            X.2mi r0 = r10.A0B
            boolean r0 = r0.A02(r4)
            if (r0 == 0) goto L_0x021a
            r1 = 2131892744(0x7f121a08, float:1.9420245E38)
            android.content.res.Resources r0 = X.C08310eF.A09(r10)
            java.lang.String r2 = r0.getString(r1)
            X.3Lk r1 = r10.A0C
            java.lang.String r0 = "about-safely-communicating-with-whatsapp-support"
            android.net.Uri r0 = X.C66433Lk.A00(r1, r0)
        L_0x01cc:
            X.0PJ r2 = X.AnonymousClass0x9.A0G(r2, r0)
            X.1Yz r6 = r10.A0A
            boolean r0 = r4 instanceof X.C28011fL
            if (r0 == 0) goto L_0x0209
            boolean r0 = X.C627336j.A0K(r4)
            if (r0 == 0) goto L_0x0209
            X.2sj r0 = r10.A06
            X.1fL r4 = (X.C28011fL) r4
            X.33h r0 = r0.A09
            int r0 = r0.A03(r4)
            int r0 = X.AnonymousClass36M.A01(r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r6.A02 = r0
            r1 = 2
        L_0x01f1:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            r6.A00 = r0
        L_0x01f7:
            X.1Yz r1 = r10.A0A
            switch(r5) {
                case 5: goto L_0x0205;
                case 6: goto L_0x0205;
                case 7: goto L_0x0207;
                case 8: goto L_0x0207;
                case 9: goto L_0x0205;
                case 10: goto L_0x0205;
                case 11: goto L_0x01fc;
                case 12: goto L_0x01fc;
                case 13: goto L_0x01fc;
                case 14: goto L_0x01fc;
                case 15: goto L_0x0205;
                case 16: goto L_0x0205;
                case 17: goto L_0x0205;
                default: goto L_0x01fc;
            }
        L_0x01fc:
            r0 = 0
        L_0x01fd:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.A03 = r0
            goto L_0x0065
        L_0x0205:
            r0 = 2
            goto L_0x01fd
        L_0x0207:
            r0 = 1
            goto L_0x01fd
        L_0x0209:
            boolean r0 = r4 instanceof com.whatsapp.jid.UserJid
            if (r0 == 0) goto L_0x01f7
            X.3Ex r0 = r10.A02
            com.whatsapp.jid.UserJid r4 = (com.whatsapp.jid.UserJid) r4
            boolean r0 = r0.A0l(r4)
            r1 = 1
            if (r0 == 0) goto L_0x01f1
            r1 = 0
            goto L_0x01f1
        L_0x021a:
            X.1VX r0 = r10.A02
            boolean r0 = X.C616831v.A00(r0, r4)
            if (r0 == 0) goto L_0x0239
            android.content.Context r7 = r10.A0G()
            r6 = 2131892745(0x7f121a09, float:1.9420247E38)
            java.lang.Object[] r2 = new java.lang.Object[r3]
            r1 = 0
            java.lang.String r0 = "WhatsApp Surveys"
            java.lang.String r2 = X.AnonymousClass002.A0F(r7, r0, r2, r1, r6)
            java.lang.String r0 = "https://faq.whatsapp.com/general/about-whatsapp-surveys"
        L_0x0234:
            android.net.Uri r0 = android.net.Uri.parse(r0)
            goto L_0x01cc
        L_0x0239:
            X.3LP r0 = r10.A08
            boolean r0 = X.C57362tW.A00(r0, r4)
            android.content.Context r1 = r10.A0G()
            if (r0 == 0) goto L_0x024f
            r0 = 2131895463(0x7f1224a7, float:1.942576E38)
            java.lang.String r2 = X.AnonymousClass1RT.A00(r1, r0)
            java.lang.String r0 = "https://faq.whatsapp.com/general/chats/about-the-official-whatsapp-chat-account"
            goto L_0x0234
        L_0x024f:
            switch(r5) {
                case 0: goto L_0x0263;
                case 1: goto L_0x0263;
                case 2: goto L_0x0263;
                case 3: goto L_0x0263;
                case 4: goto L_0x0263;
                case 5: goto L_0x026c;
                case 6: goto L_0x026c;
                case 7: goto L_0x0270;
                case 8: goto L_0x0270;
                case 9: goto L_0x026c;
                case 10: goto L_0x026c;
                case 11: goto L_0x0252;
                case 12: goto L_0x0252;
                case 13: goto L_0x0252;
                case 14: goto L_0x0252;
                case 15: goto L_0x026c;
                case 16: goto L_0x0274;
                case 17: goto L_0x0278;
                default: goto L_0x0252;
            }
        L_0x0252:
            r2 = 0
        L_0x0253:
            if (r5 == 0) goto L_0x0280
            if (r5 == r3) goto L_0x0280
            r0 = 2
            if (r5 == r0) goto L_0x0280
            r0 = 3
            if (r5 == r0) goto L_0x0280
            r0 = 4
            if (r5 == r0) goto L_0x0280
            java.lang.String r0 = "https://faq.whatsapp.com/1148840052398648"
            goto L_0x0234
        L_0x0263:
            r0 = 2131892742(0x7f121a06, float:1.942024E38)
            if (r2 == 0) goto L_0x027b
            r0 = 2131890782(0x7f12125e, float:1.9416266E38)
            goto L_0x027b
        L_0x026c:
            r0 = 2131892743(0x7f121a07, float:1.9420243E38)
            goto L_0x027b
        L_0x0270:
            r0 = 2131892740(0x7f121a04, float:1.9420237E38)
            goto L_0x027b
        L_0x0274:
            r0 = 2131896246(0x7f1227b6, float:1.9427348E38)
            goto L_0x027b
        L_0x0278:
            r0 = 2131896247(0x7f1227b7, float:1.942735E38)
        L_0x027b:
            java.lang.String r2 = r1.getString(r0)
            goto L_0x0253
        L_0x0280:
            java.lang.String r0 = "https://www.whatsapp.com/security"
            goto L_0x0234
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.conversation.conversationrow.EncryptionChangeDialogFragment.A1J(android.os.Bundle):android.app.Dialog");
    }
}
