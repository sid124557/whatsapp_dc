package com.whatsapp.spamreport;

import X.AnonymousClass002;
import X.AnonymousClass0x2;
import X.AnonymousClass1VX;
import X.AnonymousClass2z0;
import X.AnonymousClass30W;
import X.AnonymousClass33p;
import X.AnonymousClass4A1;
import X.AnonymousClass4FS;
import X.AnonymousClass4FV;
import X.AnonymousClass5ZU;
import X.AnonymousClass65Z;
import X.C08310eF;
import X.C106405Yw;
import X.C107395bF;
import X.C113945mF;
import X.C18280x3;
import X.C24171Wj;
import X.C47922e3;
import X.C54292oU;
import X.C54682p7;
import X.C55682qk;
import X.C55832qz;
import X.C56892sj;
import X.C56942so;
import X.C56982ss;
import X.C624134x;
import X.C626936e;
import X.C64773Ex;
import X.C66663Mh;
import X.C69263Wi;
import X.C95814uZ;
import android.content.DialogInterface;
import android.os.Bundle;
import com.whatsapp.jid.UserJid;

public class ReportSpamDialogFragmentOld extends Hilt_ReportSpamDialogFragmentOld {
    public C55682qk A00;
    public C69263Wi A01;
    public C66663Mh A02;
    public C56942so A03;
    public C113945mF A04;
    public C64773Ex A05;
    public AnonymousClass5ZU A06;
    public AnonymousClass30W A07;
    public C54292oU A08;
    public AnonymousClass33p A09;
    public C47922e3 A0A;
    public C56982ss A0B;
    public C56892sj A0C;
    public AnonymousClass1VX A0D;
    public AnonymousClass4FV A0E;
    public C54682p7 A0F;
    public C624134x A0G;
    public AnonymousClass65Z A0H;
    public C55832qz A0I;
    public AnonymousClass4FS A0J;
    public boolean A0K = false;
    public boolean A0L = false;

    public static ReportSpamDialogFragmentOld A00(C95814uZ r3, UserJid userJid, AnonymousClass2z0 r5, AnonymousClass65Z r6, String str, int i, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        ReportSpamDialogFragmentOld reportSpamDialogFragmentOld = new ReportSpamDialogFragmentOld();
        Bundle A082 = AnonymousClass002.A08();
        AnonymousClass0x2.A0v(A082, r3, "jid");
        if (userJid != null) {
            AnonymousClass0x2.A0v(A082, userJid, "userJid");
        }
        A082.putString("flow", str);
        A082.putBoolean("hasLoggedInPairedDevices", z);
        A082.putInt("upsellAction", i);
        A082.putBoolean("upsellCheckboxActionDefault", z2);
        A082.putBoolean("shouldDeleteChatOnBlock", z3);
        A082.putBoolean("shouldOpenHomeScreenAction", z4);
        A082.putBoolean("shouldDisplayUpsellCheckbox", z5);
        A082.putBoolean("notifyObservableDialogHost", z6);
        if (r5 != null) {
            C107395bF.A07(A082, r5);
        }
        reportSpamDialogFragmentOld.A0H = r6;
        reportSpamDialogFragmentOld.A0u(A082);
        return reportSpamDialogFragmentOld;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0197, code lost:
        if (r0 == false) goto L_0x0199;
     */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x013c  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0151  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0161  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x019d  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x01ba  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x01be  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.app.Dialog A1J(android.os.Bundle r30) {
        /*
            r29 = this;
            r6 = r29
            X.03q r1 = r6.A0Q()
            android.os.Bundle r2 = r6.A0H()
            java.lang.String r0 = "jid"
            X.4uZ r8 = X.C106405Yw.A02(r2, r0)
            X.C626936e.A06(r8)
            android.os.Bundle r2 = r6.A0H()
            java.lang.String r0 = "userJid"
            com.whatsapp.jid.UserJid r7 = X.C86634Kw.A0l(r2, r0)
            android.os.Bundle r2 = r6.A0H()
            java.lang.String r0 = "flow"
            java.lang.String r5 = r2.getString(r0)
            android.os.Bundle r2 = r6.A0H()
            java.lang.String r0 = "hasLoggedInPairedDevices"
            boolean r12 = r2.getBoolean(r0)
            android.os.Bundle r2 = r6.A0H()
            java.lang.String r0 = "upsellCheckboxActionDefault"
            boolean r9 = r2.getBoolean(r0)
            android.os.Bundle r2 = r6.A0H()
            java.lang.String r0 = "shouldDeleteChatOnBlock"
            boolean r20 = r2.getBoolean(r0)
            android.os.Bundle r2 = r6.A0H()
            java.lang.String r0 = "shouldOpenHomeScreenAction"
            boolean r21 = r2.getBoolean(r0)
            android.os.Bundle r2 = r6.A0H()
            java.lang.String r0 = "upsellAction"
            int r4 = r2.getInt(r0)
            android.os.Bundle r2 = r6.A0H()
            java.lang.String r0 = "shouldDisplayUpsellCheckbox"
            boolean r11 = r2.getBoolean(r0)
            android.os.Bundle r2 = r6.A0H()
            java.lang.String r0 = "notifyObservableDialogHost"
            boolean r10 = r2.getBoolean(r0)
            android.os.Bundle r2 = r6.A0H()
            java.lang.String r0 = ""
            X.2z0 r2 = X.C107395bF.A03(r2, r0)
            if (r2 == 0) goto L_0x008d
            X.2qz r0 = r6.A0I     // Catch:{ all -> 0x0080 }
            X.34x r0 = r0.A05(r2)     // Catch:{ all -> 0x0080 }
            goto L_0x0082
        L_0x0080:
            r0 = move-exception
            throw r0
        L_0x0082:
            r6.A0G = r0
            if (r0 != 0) goto L_0x008d
            X.2e3 r2 = r6.A0A
            X.22M r0 = X.AnonymousClass22M.A0P
            r2.A01(r0, r5)
        L_0x008d:
            r3 = 1
            if (r10 == 0) goto L_0x009b
            X.0eF r2 = r6.A0E
            boolean r0 = r2 instanceof X.AnonymousClass4A1
            if (r0 == 0) goto L_0x009b
            X.4A1 r2 = (X.AnonymousClass4A1) r2
            r2.BR7(r6, r3)
        L_0x009b:
            X.3Ex r0 = r6.A05
            X.3ZH r15 = r0.A0A(r8)
            r10 = 0
            if (r7 == 0) goto L_0x027a
            X.3Ex r0 = r6.A05
            X.3ZH r2 = r0.A0A(r7)
        L_0x00aa:
            X.2p7 r0 = r6.A0F
            r7 = 0
            X.C162457s7.A0J(r5, r7)
            X.C162457s7.A0J(r8, r3)
            r0.A01(r8, r5, r7)
            android.content.Context r0 = r6.A1D()
            android.view.LayoutInflater r8 = android.view.LayoutInflater.from(r0)
            r0 = 2131624764(0x7f0e033c, float:1.8876717E38)
            android.view.View r0 = r8.inflate(r0, r10)
            r8 = 2131428020(0x7f0b02b4, float:1.8477673E38)
            android.view.View r14 = r0.findViewById(r8)
            android.widget.CheckBox r14 = (android.widget.CheckBox) r14
            r14.setChecked(r9)
            X.4uZ r8 = r15.A0H
            boolean r8 = r8 instanceof X.C27991fJ
            if (r8 == 0) goto L_0x00ef
            X.4FS r9 = r6.A0J
            r28 = 9
            X.3cO r8 = new X.3cO
            r22 = r8
            r23 = r6
            r24 = r15
            r25 = r0
            r26 = r14
            r27 = r5
            r22.<init>(r23, r24, r25, r26, r27, r28)
            r9.BkM(r8)
        L_0x00ef:
            if (r11 != 0) goto L_0x00fa
            r8 = 2131428028(0x7f0b02bc, float:1.8477689E38)
            X.C86604Kt.A1B(r0, r8)
            r14.setChecked(r7)
        L_0x00fa:
            X.5cL r13 = new X.5cL
            r19 = r4
            r18 = r5
            r17 = r6
            r16 = r2
            r13.<init>(r14, r15, r16, r17, r18, r19, r20, r21)
            r8 = 2131428021(0x7f0b02b5, float:1.8477675E38)
            android.widget.TextView r9 = X.AnonymousClass002.A09(r0, r8)
            r8 = 2131433035(0x7f0b164b, float:1.8487844E38)
            android.widget.TextView r8 = X.AnonymousClass002.A09(r0, r8)
            X.C626936e.A06(r1)
            X.0zH r1 = X.AnonymousClass5V0.A02(r1, r0)
            X.34x r0 = r6.A0G
            if (r0 == 0) goto L_0x024e
            if (r2 == 0) goto L_0x024e
            r11 = 2131893128(0x7f121b88, float:1.9421024E38)
            java.lang.Object[] r10 = new java.lang.Object[r3]
            X.5ZU r0 = r6.A06
            java.lang.String r0 = X.C18300x5.A0h(r0, r2)
        L_0x012d:
            java.lang.String r0 = X.AnonymousClass0x7.A0n(r6, r0, r10, r7, r11)
            r1.setTitle(r0)
        L_0x0134:
            java.lang.String r0 = "status_post_report"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x01be
            boolean r0 = r2.A0R()
            r5 = 2131893123(0x7f121b83, float:1.9421014E38)
            if (r0 == 0) goto L_0x0148
            r5 = 2131893124(0x7f121b84, float:1.9421016E38)
        L_0x0148:
            r8.setText(r5)
            boolean r0 = r15.A0U()
            if (r0 == 0) goto L_0x019d
            if (r4 != 0) goto L_0x0180
            if (r2 == 0) goto L_0x0180
            boolean r0 = r2.A0R()
            if (r0 == 0) goto L_0x01b5
            boolean r0 = r2.A0T()
        L_0x015f:
            if (r0 != 0) goto L_0x01b5
            r2 = 2131893069(0x7f121b4d, float:1.9420904E38)
            if (r20 == 0) goto L_0x0169
            r2 = 2131893068(0x7f121b4c, float:1.9420902E38)
        L_0x0169:
            r9.setText(r2)
            r0 = 2131893093(0x7f121b65, float:1.9420953E38)
            r1.setPositiveButton(r0, r13)
            r0 = 2131895731(0x7f1225b3, float:1.9426303E38)
            r1.setNegativeButton(r0, r13)
            X.043 r0 = r1.create()
            r0.setCanceledOnTouchOutside(r3)
            return r0
        L_0x0180:
            com.whatsapp.jid.GroupJid r2 = X.C86664Kz.A1C(r15)
            X.2ss r0 = r6.A0B
            boolean r0 = r0.A0N(r2)
            if (r0 == 0) goto L_0x0199
            if (r2 == 0) goto L_0x0199
            X.2sj r0 = r6.A0C
            boolean r0 = r0.A0C(r2)
            r2 = 2131889196(0x7f120c2c, float:1.9413049E38)
            if (r0 != 0) goto L_0x0169
        L_0x0199:
            r2 = 2131893079(0x7f121b57, float:1.9420924E38)
            goto L_0x0169
        L_0x019d:
            X.4uZ r0 = r15.A0H
            boolean r0 = r0 instanceof X.C95804uY
            if (r0 == 0) goto L_0x01aa
            r0 = 2
            if (r4 != r0) goto L_0x01aa
            r2 = 2131893109(0x7f121b75, float:1.9420985E38)
            goto L_0x0169
        L_0x01aa:
            boolean r0 = r15.A0R()
            if (r0 == 0) goto L_0x01b5
            boolean r0 = r15.A0T()
            goto L_0x015f
        L_0x01b5:
            r2 = 2131893067(0x7f121b4b, float:1.94209E38)
            if (r20 == 0) goto L_0x0169
            r2 = 2131896264(0x7f1227c8, float:1.9427384E38)
            goto L_0x0169
        L_0x01be:
            X.34x r0 = r6.A0G
            if (r0 == 0) goto L_0x01e6
            if (r2 == 0) goto L_0x01e6
            boolean r10 = r2.A0R()
            X.30W r7 = r6.A07
            X.34x r0 = r6.A0G
            boolean r0 = r7.A06(r0, r5)
            if (r0 == 0) goto L_0x01dc
            r5 = 2131893121(0x7f121b81, float:1.942101E38)
            if (r10 == 0) goto L_0x0148
            r5 = 2131893122(0x7f121b82, float:1.9421012E38)
            goto L_0x0148
        L_0x01dc:
            r5 = 2131893126(0x7f121b86, float:1.942102E38)
            if (r10 == 0) goto L_0x0148
            r5 = 2131893125(0x7f121b85, float:1.9421018E38)
            goto L_0x0148
        L_0x01e6:
            boolean r0 = r15.A0U()
            if (r0 == 0) goto L_0x0205
            if (r12 == 0) goto L_0x0200
            X.3Mh r5 = r6.A02
            X.1Ei r0 = X.C66663Mh.A0V
            boolean r0 = r5.A08(r0)
            r5 = 2131893118(0x7f121b7e, float:1.9421003E38)
            if (r0 == 0) goto L_0x0148
            r5 = 2131893119(0x7f121b7f, float:1.9421006E38)
            goto L_0x0148
        L_0x0200:
            r5 = 2131893120(0x7f121b80, float:1.9421008E38)
            goto L_0x0148
        L_0x0205:
            X.4uZ r0 = r15.A0H
            boolean r0 = r0 instanceof X.C95804uY
            if (r0 == 0) goto L_0x0210
            r5 = 2131893127(0x7f121b87, float:1.9421022E38)
            goto L_0x0148
        L_0x0210:
            boolean r0 = r15.A0R()
            if (r0 == 0) goto L_0x0235
            boolean r0 = r15.A0T()
            if (r0 != 0) goto L_0x0235
            if (r12 == 0) goto L_0x0230
            X.3Mh r5 = r6.A02
            X.1Ei r0 = X.C66663Mh.A0V
            boolean r0 = r5.A08(r0)
            r5 = 2131893113(0x7f121b79, float:1.9420993E38)
            if (r0 == 0) goto L_0x0148
            r5 = 2131893114(0x7f121b7a, float:1.9420995E38)
            goto L_0x0148
        L_0x0230:
            r5 = 2131893115(0x7f121b7b, float:1.9420997E38)
            goto L_0x0148
        L_0x0235:
            if (r12 == 0) goto L_0x0249
            X.3Mh r5 = r6.A02
            X.1Ei r0 = X.C66663Mh.A0V
            boolean r0 = r5.A08(r0)
            r5 = 2131893110(0x7f121b76, float:1.9420987E38)
            if (r0 == 0) goto L_0x0148
            r5 = 2131893111(0x7f121b77, float:1.942099E38)
            goto L_0x0148
        L_0x0249:
            r5 = 2131893112(0x7f121b78, float:1.9420991E38)
            goto L_0x0148
        L_0x024e:
            boolean r0 = r15.A0U()
            if (r0 == 0) goto L_0x025c
            r7 = 2131893081(0x7f121b59, float:1.9420928E38)
        L_0x0257:
            r1.A0B(r7)
            goto L_0x0134
        L_0x025c:
            X.4uZ r0 = r15.A0H
            boolean r0 = r0 instanceof X.C95804uY
            if (r0 == 0) goto L_0x026d
            X.34x r0 = r6.A0G
            r7 = 2131893083(0x7f121b5b, float:1.9420933E38)
            if (r0 == 0) goto L_0x0257
            r7 = 2131893084(0x7f121b5c, float:1.9420935E38)
            goto L_0x0257
        L_0x026d:
            r11 = 2131893128(0x7f121b88, float:1.9421024E38)
            java.lang.Object[] r10 = new java.lang.Object[r3]
            X.5ZU r0 = r6.A06
            java.lang.String r0 = X.C18300x5.A0h(r0, r15)
            goto L_0x012d
        L_0x027a:
            r2 = r10
            goto L_0x00aa
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.spamreport.ReportSpamDialogFragmentOld.A1J(android.os.Bundle):android.app.Dialog");
    }

    public void onCancel(DialogInterface dialogInterface) {
        super.onCancel(dialogInterface);
        String string = A0H().getString("flow");
        C95814uZ A022 = C106405Yw.A02(A0H(), "jid");
        C626936e.A06(A022);
        this.A0F.A00(A022, string);
    }

    public void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        String string = A0H().getString("flow");
        if (A0H().getBoolean("notifyObservableDialogHost")) {
            C08310eF r1 = this.A0E;
            if (r1 instanceof AnonymousClass4A1) {
                ((AnonymousClass4A1) r1).BR7(this, false);
            }
        }
        if (string.equals("status_post_report") && !this.A0L) {
            C24171Wj r12 = new C24171Wj();
            r12.A00 = C18280x3.A0S();
            this.A0E.BhD(r12);
        }
    }
}
