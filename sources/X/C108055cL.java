package X;

import android.content.DialogInterface;
import android.widget.CheckBox;
import com.whatsapp.spamreport.ReportSpamDialogFragmentOld;

/* renamed from: X.5cL  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C108055cL implements DialogInterface.OnClickListener {
    public final /* synthetic */ int A00;
    public final /* synthetic */ CheckBox A01;
    public final /* synthetic */ AnonymousClass3ZH A02;
    public final /* synthetic */ AnonymousClass3ZH A03;
    public final /* synthetic */ ReportSpamDialogFragmentOld A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ boolean A06;
    public final /* synthetic */ boolean A07;

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00c4, code lost:
        if (r8.A0D.A0X(3995) == false) goto L_0x00c6;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.content.DialogInterface r23, int r24) {
        /*
            r22 = this;
            r0 = r22
            com.whatsapp.spamreport.ReportSpamDialogFragmentOld r8 = r0.A04
            java.lang.String r9 = r0.A05
            android.widget.CheckBox r4 = r0.A01
            X.3ZH r5 = r0.A02
            X.3ZH r6 = r0.A03
            int r10 = r0.A00
            boolean r13 = r0.A06
            boolean r2 = r0.A07
            r0 = -1
            r1 = r24
            if (r1 != r0) goto L_0x00ea
            r3 = 1
            r8.A0L = r3
            java.lang.String r0 = "status_post_report"
            boolean r0 = r9.equals(r0)
            if (r0 == 0) goto L_0x0039
            X.1Wj r1 = new X.1Wj
            r1.<init>()
            boolean r0 = r4.isChecked()
            if (r0 == 0) goto L_0x002e
            r3 = 3
        L_0x002e:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)
            r1.A00 = r0
            X.4FV r0 = r8.A0E
            r0.BhD(r1)
        L_0x0039:
            boolean r11 = r4.isChecked()
            X.30W r1 = r8.A07
            android.content.Context r0 = r8.A1D()
            boolean r0 = r1.A05(r0)
            if (r0 == 0) goto L_0x0099
            X.1VX r1 = r8.A0D
            r0 = 3369(0xd29, float:4.721E-42)
            boolean r0 = r1.A0X(r0)
            if (r0 == 0) goto L_0x009a
            if (r11 == 0) goto L_0x009a
            boolean r0 = r5.A0R()
            if (r0 == 0) goto L_0x009a
            r12 = 1
            android.content.Context r14 = r8.A1D()
            X.4uZ r0 = r5.A0H
            com.whatsapp.jid.UserJid r15 = X.AnonymousClass32Y.A03(r0)
            r18 = 0
            r21 = r18
            r16 = r9
            r17 = r12
            r19 = r18
            r20 = r13
            android.content.Intent r1 = X.C627736r.A0m(r14, r15, r16, r17, r18, r19, r20, r21)
        L_0x0076:
            r8.A0m(r1)
        L_0x0079:
            X.3Wi r2 = r8.A01
            r1 = 2131893130(0x7f121b8a, float:1.9421028E38)
            r0 = 2131892992(0x7f121b00, float:1.9420748E38)
            r2.A0G(r1, r0)
            X.3Wi r2 = r8.A01
            X.2oU r1 = r8.A08
            X.5ZU r0 = r8.A06
            X.5kb r7 = new X.5kb
            r7.<init>(r2, r0, r1)
            X.4FS r0 = r8.A0J
            X.3bW r4 = new X.3bW
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13)
            r0.BkM(r4)
        L_0x0099:
            return
        L_0x009a:
            r12 = 0
            if (r2 == 0) goto L_0x0079
            X.33p r0 = r8.A09
            java.lang.String r1 = "privacy_groupadd"
            android.content.SharedPreferences r0 = X.AnonymousClass0x2.A0F(r0)
            int r1 = r0.getInt(r1, r12)
            boolean r0 = r5.A0U()
            if (r0 == 0) goto L_0x00c6
            if (r1 != 0) goto L_0x00c6
            X.1VX r1 = r8.A0D
            r0 = 4314(0x10da, float:6.045E-42)
            boolean r0 = r1.A0X(r0)
            if (r0 != 0) goto L_0x00c6
            X.1VX r1 = r8.A0D
            r0 = 3995(0xf9b, float:5.598E-42)
            boolean r0 = r1.A0X(r0)
            r1 = 1
            if (r0 != 0) goto L_0x00c7
        L_0x00c6:
            r1 = 0
        L_0x00c7:
            r8.A0K = r1
            android.content.Context r0 = r8.A1D()
            if (r1 == 0) goto L_0x00e5
            android.content.Intent r1 = X.C18300x5.A07(r0)
            java.lang.String r0 = "com.whatsapp.intent.action.REPORT_PRIVACY_TIP_DIALOG"
            android.content.Intent r1 = r1.setAction(r0)
            java.lang.String r0 = "report_and_exit_group"
            android.content.Intent r1 = r1.putExtra(r0, r11)
        L_0x00df:
            r0 = 603979776(0x24000000, float:2.7755576E-17)
            r1.addFlags(r0)
            goto L_0x0076
        L_0x00e5:
            android.content.Intent r1 = X.C627736r.A02(r0)
            goto L_0x00df
        L_0x00ea:
            r0 = -2
            if (r1 != r0) goto L_0x0099
            X.2p7 r1 = r8.A0F
            X.4uZ r0 = r5.A0H
            X.C626936e.A06(r0)
            r1.A00(r0, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C108055cL.onClick(android.content.DialogInterface, int):void");
    }

    public /* synthetic */ C108055cL(CheckBox checkBox, AnonymousClass3ZH r2, AnonymousClass3ZH r3, ReportSpamDialogFragmentOld reportSpamDialogFragmentOld, String str, int i, boolean z, boolean z2) {
        this.A04 = reportSpamDialogFragmentOld;
        this.A05 = str;
        this.A01 = checkBox;
        this.A02 = r2;
        this.A03 = r3;
        this.A00 = i;
        this.A06 = z;
        this.A07 = z2;
    }
}
