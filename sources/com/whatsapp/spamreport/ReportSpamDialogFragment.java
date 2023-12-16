package com.whatsapp.spamreport;

import X.AnonymousClass001;
import X.AnonymousClass0IT;
import X.AnonymousClass0x2;
import X.AnonymousClass0x9;
import X.AnonymousClass20D;
import X.AnonymousClass2C4;
import X.AnonymousClass2LD;
import X.AnonymousClass30W;
import X.AnonymousClass33p;
import X.AnonymousClass3ZH;
import X.AnonymousClass4A1;
import X.AnonymousClass4FV;
import X.AnonymousClass5ZU;
import X.AnonymousClass65Z;
import X.AnonymousClass66R;
import X.C08310eF;
import X.C113945mF;
import X.C120185yB;
import X.C120195yC;
import X.C120205yD;
import X.C120215yE;
import X.C120225yF;
import X.C120235yG;
import X.C154517dI;
import X.C162457s7;
import X.C18270x1;
import X.C18280x3;
import X.C18310x6;
import X.C24171Wj;
import X.C27991fJ;
import X.C47922e3;
import X.C54292oU;
import X.C54682p7;
import X.C55682qk;
import X.C55832qz;
import X.C56892sj;
import X.C56942so;
import X.C56982ss;
import X.C616131n;
import X.C64773Ex;
import X.C69263Wi;
import X.C84814Du;
import X.C85494Gl;
import X.C86664Kz;
import X.C95814uZ;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import com.whatsapp.R;
import java.lang.ref.WeakReference;

public final class ReportSpamDialogFragment extends Hilt_ReportSpamDialogFragment {
    public C55682qk A00;
    public C69263Wi A01;
    public C56942so A02;
    public C113945mF A03;
    public C64773Ex A04;
    public AnonymousClass5ZU A05;
    public AnonymousClass30W A06;
    public C54292oU A07;
    public AnonymousClass33p A08;
    public C47922e3 A09;
    public C56982ss A0A;
    public C56892sj A0B;
    public AnonymousClass4FV A0C;
    public C54682p7 A0D;
    public AnonymousClass2LD A0E;
    public AnonymousClass65Z A0F;
    public C55832qz A0G;
    public WeakReference A0H;
    public WeakReference A0I;
    public boolean A0J;
    public boolean A0K;
    public final AnonymousClass66R A0L = C154517dI.A01(new C120185yB(this));
    public final AnonymousClass66R A0M = C154517dI.A01(new C120195yC(this));
    public final AnonymousClass66R A0N = C154517dI.A01(new C120205yD(this));
    public final AnonymousClass66R A0O = C154517dI.A01(new C120215yE(this));
    public final AnonymousClass66R A0P = C154517dI.A01(new C120225yF(this));
    public final AnonymousClass66R A0Q = C154517dI.A01(new C120235yG(this));

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x003e, code lost:
        if (r0 == false) goto L_0x0040;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00fb, code lost:
        if (r0 == false) goto L_0x00fd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0152, code lost:
        if (r13.A02.A0X(5141) == false) goto L_0x0154;
     */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0063  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00b0  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00c7  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0108  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final /* synthetic */ void A00(X.AnonymousClass3ZH r10, X.AnonymousClass3ZH r11, X.C624134x r12, com.whatsapp.spamreport.ReportSpamDialogFragment r13, boolean r14) {
        /*
            r9 = r13
            java.lang.ref.WeakReference r0 = r13.A0H
            if (r0 == 0) goto L_0x0211
            android.view.View r4 = X.C86664Kz.A0j(r0)
            if (r4 == 0) goto L_0x0211
            r5 = r10
            boolean r0 = r10.A0U()
            if (r0 == 0) goto L_0x01af
            r1 = 2131893081(0x7f121b59, float:1.9420928E38)
            android.content.res.Resources r0 = X.C08310eF.A09(r13)
            java.lang.String r1 = r0.getString(r1)
        L_0x001d:
            X.C162457s7.A0D(r1)
        L_0x0020:
            r0 = 2131433037(0x7f0b164d, float:1.8487848E38)
            X.C86624Kv.A17(r4, r1, r0)
            X.66R r3 = r13.A0M
            java.lang.Object r1 = r3.getValue()
            java.lang.String r0 = "status_post_report"
            boolean r0 = X.C162457s7.A0P(r1, r0)
            r6 = 0
            if (r0 == 0) goto L_0x0108
            if (r11 == 0) goto L_0x0040
            boolean r0 = r11.A0R()
            r1 = 2131893124(0x7f121b84, float:1.9421016E38)
            if (r0 != 0) goto L_0x0043
        L_0x0040:
            r1 = 2131893123(0x7f121b83, float:1.9421014E38)
        L_0x0043:
            android.content.res.Resources r0 = X.C08310eF.A09(r13)
            java.lang.String r1 = r0.getString(r1)
        L_0x004b:
            X.C162457s7.A0H(r1)
            r0 = 2131433035(0x7f0b164b, float:1.8487844E38)
            X.C86624Kv.A17(r4, r1, r0)
            X.4uZ r0 = r10.A0H
            boolean r0 = r0 instanceof X.C95804uY
            if (r0 == 0) goto L_0x00c7
            X.66R r0 = r13.A0Q
            int r1 = X.AnonymousClass0x2.A09(r0)
            r0 = 2
            if (r1 != r0) goto L_0x00c7
            r1 = 2131893109(0x7f121b75, float:1.9420985E38)
        L_0x0066:
            r0 = 2131428021(0x7f0b02b5, float:1.8477675E38)
            android.widget.TextView r0 = X.AnonymousClass002.A09(r4, r0)
            r0.setText(r1)
            if (r14 == 0) goto L_0x00b0
            java.lang.ref.WeakReference r0 = r13.A0H
            if (r0 == 0) goto L_0x01e4
            android.view.View r1 = X.C86664Kz.A0j(r0)
            if (r1 == 0) goto L_0x01e4
            r0 = 2131428028(0x7f0b02bc, float:1.8477689E38)
            android.view.View r2 = r1.findViewById(r0)
            r0 = 2131428020(0x7f0b02b4, float:1.8477673E38)
            android.view.View r1 = r1.findViewById(r0)
            android.widget.CompoundButton r1 = (android.widget.CompoundButton) r1
            r0 = 8
            r2.setVisibility(r0)
            r1.setChecked(r6)
        L_0x0094:
            r0 = 2131433032(0x7f0b1648, float:1.8487838E38)
            android.view.View r0 = r4.findViewById(r0)
            X.C109495ei.A00(r0, r13, r10, r6)
            r0 = 2131433036(0x7f0b164c, float:1.8487846E38)
            android.view.View r0 = r4.findViewById(r0)
            r13 = 11
            X.5ep r8 = new X.5ep
            r8.<init>(r9, r10, r11, r12, r13)
            r0.setOnClickListener(r8)
            return
        L_0x00b0:
            android.os.Bundle r1 = r13.A0H()
            java.lang.String r0 = "upsellCheckboxActionDefault"
            boolean r1 = r1.getBoolean(r0)
            r0 = 2131428020(0x7f0b02b4, float:1.8477673E38)
            android.view.View r0 = r4.findViewById(r0)
            android.widget.CompoundButton r0 = (android.widget.CompoundButton) r0
            r0.setChecked(r1)
            goto L_0x0094
        L_0x00c7:
            boolean r0 = r10.A0U()
            if (r0 == 0) goto L_0x0102
            if (r11 == 0) goto L_0x00dc
            X.66R r0 = r13.A0Q
            int r0 = X.AnonymousClass0x2.A09(r0)
            if (r0 != 0) goto L_0x00dc
            int r1 = r13.A1V(r11)
            goto L_0x0066
        L_0x00dc:
            java.lang.Class<com.whatsapp.jid.GroupJid> r0 = com.whatsapp.jid.GroupJid.class
            com.whatsapp.jid.Jid r1 = r10.A0I(r0)
            if (r1 == 0) goto L_0x01f7
            com.whatsapp.jid.GroupJid r1 = (com.whatsapp.jid.GroupJid) r1
            X.2ss r0 = r13.A0A
            if (r0 == 0) goto L_0x01f0
            boolean r0 = r0.A0N(r1)
            if (r0 == 0) goto L_0x00fd
            X.2sj r0 = r13.A0B
            if (r0 == 0) goto L_0x01e9
            boolean r0 = r0.A0C(r1)
            r1 = 2131889196(0x7f120c2c, float:1.9413049E38)
            if (r0 != 0) goto L_0x0066
        L_0x00fd:
            r1 = 2131893079(0x7f121b57, float:1.9420924E38)
            goto L_0x0066
        L_0x0102:
            int r1 = r13.A1V(r10)
            goto L_0x0066
        L_0x0108:
            if (r12 == 0) goto L_0x0132
            if (r11 == 0) goto L_0x0132
            boolean r2 = r11.A0R()
            X.30W r1 = r13.A06
            if (r1 == 0) goto L_0x01fc
            java.lang.String r0 = X.AnonymousClass0x9.A13(r3)
            boolean r0 = r1.A06(r12, r0)
            if (r0 == 0) goto L_0x0128
            r1 = 2131893121(0x7f121b81, float:1.942101E38)
            if (r2 == 0) goto L_0x0043
            r1 = 2131893122(0x7f121b82, float:1.9421012E38)
            goto L_0x0043
        L_0x0128:
            r1 = 2131893126(0x7f121b86, float:1.942102E38)
            if (r2 == 0) goto L_0x0043
            r1 = 2131893125(0x7f121b85, float:1.9421018E38)
            goto L_0x0043
        L_0x0132:
            android.os.Bundle r1 = r13.A0H()
            java.lang.String r0 = "hasLoggedInPairedDevices"
            boolean r3 = r1.getBoolean(r0)
            X.2ss r1 = r13.A0A
            if (r1 == 0) goto L_0x0203
            X.4uZ r0 = r10.A0H
            boolean r0 = r1.A0N(r0)
            r8 = 1
            if (r0 == 0) goto L_0x0154
            X.1VX r1 = r13.A02
            r0 = 5141(0x1415, float:7.204E-42)
            boolean r0 = r1.A0X(r0)
            r2 = 1
            if (r0 != 0) goto L_0x0155
        L_0x0154:
            r2 = 0
        L_0x0155:
            boolean r0 = r10.A0U()
            if (r0 == 0) goto L_0x0184
            r7 = 5
            r0 = 5
            if (r3 == 0) goto L_0x0172
            if (r2 == 0) goto L_0x017a
            X.33j r5 = r13.A01
            r3 = 2131755296(0x7f100120, float:1.9141467E38)
        L_0x0167:
            java.lang.Object[] r2 = new java.lang.Object[r8]
            X.AnonymousClass000.A1P(r2, r7, r6)
            java.lang.String r1 = r5.A0L(r2, r3, r0)
            goto L_0x004b
        L_0x0172:
            if (r2 == 0) goto L_0x017f
            X.33j r5 = r13.A01
            r3 = 2131755297(0x7f100121, float:1.914147E38)
            goto L_0x0167
        L_0x017a:
            r1 = 2131893119(0x7f121b7f, float:1.9421006E38)
            goto L_0x0043
        L_0x017f:
            r1 = 2131893120(0x7f121b80, float:1.9421008E38)
            goto L_0x0043
        L_0x0184:
            X.4uZ r0 = r10.A0H
            boolean r0 = r0 instanceof X.C95804uY
            if (r0 == 0) goto L_0x018f
            r1 = 2131893127(0x7f121b87, float:1.9421022E38)
            goto L_0x0043
        L_0x018f:
            boolean r0 = r10.A0R()
            if (r0 == 0) goto L_0x01a5
            boolean r0 = r10.A0T()
            if (r0 != 0) goto L_0x01a5
            r1 = 2131893115(0x7f121b7b, float:1.9420997E38)
            if (r3 == 0) goto L_0x0043
            r1 = 2131893114(0x7f121b7a, float:1.9420995E38)
            goto L_0x0043
        L_0x01a5:
            r1 = 2131893112(0x7f121b78, float:1.9420991E38)
            if (r3 == 0) goto L_0x0043
            r1 = 2131893111(0x7f121b77, float:1.942099E38)
            goto L_0x0043
        L_0x01af:
            X.4uZ r0 = r10.A0H
            boolean r0 = r0 instanceof X.C95804uY
            if (r0 == 0) goto L_0x01ca
            r1 = 2131893083(0x7f121b5b, float:1.9420933E38)
            if (r12 == 0) goto L_0x01bd
            r1 = 2131893084(0x7f121b5c, float:1.9420935E38)
        L_0x01bd:
            android.content.res.Resources r0 = X.C08310eF.A09(r13)
            java.lang.String r1 = r0.getString(r1)
            X.C162457s7.A0H(r1)
            goto L_0x0020
        L_0x01ca:
            if (r12 == 0) goto L_0x01cf
            if (r11 == 0) goto L_0x01cf
            r5 = r11
        L_0x01cf:
            r3 = 0
            r0 = 1
            r2 = 2131893128(0x7f121b88, float:1.9421024E38)
            java.lang.Object[] r1 = new java.lang.Object[r0]
            X.5ZU r0 = r13.A05
            if (r0 == 0) goto L_0x020a
            java.lang.String r0 = X.C18300x5.A0h(r0, r5)
            java.lang.String r1 = X.AnonymousClass0x7.A0n(r13, r0, r1, r3, r2)
            goto L_0x001d
        L_0x01e4:
            java.lang.IllegalArgumentException r0 = X.C18300x5.A0X()
            throw r0
        L_0x01e9:
            java.lang.String r0 = "groupParticipantsManager"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x01f0:
            java.lang.String r0 = "chatsCache"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x01f7:
            java.lang.IllegalArgumentException r0 = X.C18300x5.A0X()
            throw r0
        L_0x01fc:
            java.lang.String r0 = "spamReportManager"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x0203:
            java.lang.String r0 = "chatsCache"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x020a:
            java.lang.String r0 = "waContactNames"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x0211:
            java.lang.IllegalArgumentException r0 = X.C18300x5.A0X()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.spamreport.ReportSpamDialogFragment.A00(X.3ZH, X.3ZH, X.34x, com.whatsapp.spamreport.ReportSpamDialogFragment, boolean):void");
    }

    public View A0K(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        Window window;
        C162457s7.A0J(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.f8nameremoved, viewGroup, false);
        Dialog dialog = this.A03;
        if (!(dialog == null || (window = dialog.getWindow()) == null)) {
            C18310x6.A0x(A0G(), window, R.color.f5nameremoved);
        }
        C162457s7.A0H(inflate);
        return inflate;
    }

    public void A0w(Bundle bundle, View view) {
        AnonymousClass4A1 r1;
        C162457s7.A0J(view, 0);
        this.A0I = AnonymousClass0x9.A14(view.findViewById(R.id.report_spam_dialog_loading));
        this.A0H = AnonymousClass0x9.A14(view.findViewById(R.id.report_spam_dialog_content));
        if (C18270x1.A1V(this.A0N)) {
            C08310eF r12 = this.A0E;
            if ((r12 instanceof AnonymousClass4A1) && (r1 = (AnonymousClass4A1) r12) != null) {
                r1.BR7(this, true);
            }
        }
        C616131n.A02((C85494Gl) null, new ReportSpamDialogFragment$onViewCreated$1(this, (C84814Du) null), AnonymousClass0IT.A00(this), (AnonymousClass20D) null, 3);
    }

    public void onCancel(DialogInterface dialogInterface) {
        C162457s7.A0J(dialogInterface, 0);
        super.onCancel(dialogInterface);
        C54682p7 A1Y = A1Y();
        String A13 = AnonymousClass0x9.A13(this.A0M);
        C162457s7.A0D(A13);
        A1Y.A00((C95814uZ) this.A0L.getValue(), A13);
    }

    public void onDismiss(DialogInterface dialogInterface) {
        AnonymousClass4A1 r1;
        C162457s7.A0J(dialogInterface, 0);
        super.onDismiss(dialogInterface);
        if (C18270x1.A1V(this.A0N)) {
            C08310eF r12 = this.A0E;
            if ((r12 instanceof AnonymousClass4A1) && (r1 = (AnonymousClass4A1) r12) != null) {
                r1.BR7(this, false);
            }
        }
        if (!this.A0K && C162457s7.A0P(this.A0M.getValue(), "status_post_report")) {
            C24171Wj r13 = new C24171Wj();
            r13.A00 = C18280x3.A0S();
            AnonymousClass4FV r0 = this.A0C;
            if (r0 != null) {
                r0.BhD(r13);
                return;
            }
            throw C18270x1.A0S("wamRuntime");
        }
    }

    public final C69263Wi A1W() {
        C69263Wi r0 = this.A01;
        if (r0 != null) {
            return r0;
        }
        throw C18270x1.A0S("globalUI");
    }

    public final C56942so A1X() {
        C56942so r0 = this.A02;
        if (r0 != null) {
            return r0;
        }
        throw C18270x1.A0S("communityChatManager");
    }

    public final C54682p7 A1Y() {
        C54682p7 r0 = this.A0D;
        if (r0 != null) {
            return r0;
        }
        throw C18270x1.A0S("reportFunnelLogger");
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0024  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A1a(X.C95814uZ r7, X.C84814Du r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof X.C118565tk
            if (r0 == 0) goto L_0x0038
            r5 = r8
            X.5tk r5 = (X.C118565tk) r5
            int r2 = r5.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0038
            int r2 = r2 - r1
            r5.label = r2
        L_0x0012:
            java.lang.Object r1 = r5.result
            X.218 r4 = X.AnonymousClass218.COROUTINE_SUSPENDED
            int r0 = r5.label
            r3 = 1
            if (r0 == 0) goto L_0x0024
            if (r0 != r3) goto L_0x003e
            X.C57682u2.A01(r1)
        L_0x0020:
            X.C162457s7.A0G(r1)
            return r1
        L_0x0024:
            X.C57682u2.A01(r1)
            X.46Q r2 = X.AnonymousClass2C4.A01
            r1 = 0
            com.whatsapp.spamreport.ReportSpamDialogFragment$getContact$2 r0 = new com.whatsapp.spamreport.ReportSpamDialogFragment$getContact$2
            r0.<init>(r7, r6, r1)
            r5.label = r3
            java.lang.Object r1 = X.C616131n.A00(r5, r2, r0)
            if (r1 != r4) goto L_0x0020
            return r4
        L_0x0038:
            X.5tk r5 = new X.5tk
            r5.<init>(r6, r8)
            goto L_0x0012
        L_0x003e:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0d()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.spamreport.ReportSpamDialogFragment.A1a(X.4uZ, X.4Du):java.lang.Object");
    }

    public final void A1b(boolean z) {
        View A0j;
        WeakReference weakReference = this.A0I;
        View view = null;
        if (weakReference != null) {
            view = C86664Kz.A0j(weakReference);
        }
        int i = 0;
        if (view != null) {
            view.setVisibility(AnonymousClass001.A08(z ? 1 : 0));
        }
        WeakReference weakReference2 = this.A0H;
        if (weakReference2 != null && (A0j = C86664Kz.A0j(weakReference2)) != null) {
            if (!(!z)) {
                i = 8;
            }
            A0j.setVisibility(i);
        }
    }

    public final boolean A1c(AnonymousClass3ZH r4) {
        AnonymousClass33p r0 = this.A08;
        if (r0 != null) {
            int i = AnonymousClass0x2.A0F(r0).getInt("privacy_groupadd", 0);
            if (!r4.A0U() || i != 0 || this.A02.A0X(4314) || !this.A02.A0X(3995)) {
                return false;
            }
            return true;
        }
        throw C18270x1.A0S("waSharedPreferences");
    }

    public final int A1V(AnonymousClass3ZH r3) {
        if (!r3.A0R() || r3.A0T()) {
            if (C18270x1.A1V(this.A0O)) {
                return R.string.f11nameremoved;
            }
            return R.string.f11nameremoved;
        } else if (C18270x1.A1V(this.A0O)) {
            return R.string.f11nameremoved;
        } else {
            return R.string.f11nameremoved;
        }
    }

    public final Object A1Z(AnonymousClass3ZH r5, C84814Du r6) {
        boolean z;
        C27991fJ r3;
        if (!A0H().getBoolean("shouldDisplayUpsellCheckbox")) {
            z = true;
        } else {
            C95814uZ r32 = r5.A0H;
            if ((r32 instanceof C27991fJ) && (r3 = (C27991fJ) r32) != null) {
                return C616131n.A00(r6, AnonymousClass2C4.A01, new ReportSpamDialogFragment$shouldHideCheckBoxContainer$2(r5, r3, this, (C84814Du) null));
            }
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
