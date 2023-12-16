package X;

/* renamed from: X.542  reason: invalid class name */
public class AnonymousClass542 extends C109665ez {
    public Object A00;
    public boolean A01;
    public final int A02;

    public AnonymousClass542(int i, Object obj, boolean z) {
        this.A02 = i;
        this.A00 = obj;
        this.A01 = z;
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x00b4  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00be  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00c2  */
    /* JADX WARNING: Removed duplicated region for block: B:60:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A07(android.view.View r11) {
        /*
            r10 = this;
            int r0 = r10.A02
            switch(r0) {
                case 0: goto L_0x00d6;
                case 1: goto L_0x006a;
                case 2: goto L_0x014f;
                case 3: goto L_0x011a;
                case 4: goto L_0x003a;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r4 = r10.A00
            X.51j r4 = (X.C985651j) r4
            r4.A05()
            java.lang.Integer r0 = X.AnonymousClass001.A0f()
            r4.A02 = r0
            java.lang.String r5 = r4.A04
            if (r5 == 0) goto L_0x0039
            boolean r8 = r10.A01
            android.content.Context r2 = r4.A03()
            X.1mW r0 = r4.A0C
            X.2z0 r0 = r0.A1J
            java.lang.String r6 = r0.A01
            X.C162457s7.A0C(r6)
            X.8ss r3 = r4.A00
            r7 = 0
            X.36Y r1 = r4.A09
            android.net.Uri r0 = android.net.Uri.parse(r5)
            int r0 = r1.A0B(r0, r7)
            r9 = 1
            if (r0 != r9) goto L_0x0036
            r9 = 0
        L_0x0036:
            X.AnonymousClass5VM.A00(r2, r3, r4, r5, r6, r7, r8, r9)
        L_0x0039:
            return
        L_0x003a:
            java.lang.Object r5 = r10.A00
            com.whatsapp.quickcontact.QuickContactActivity r5 = (com.whatsapp.quickcontact.QuickContactActivity) r5
            X.33p r2 = r5.A09
            X.3ZH r1 = r5.A0Z
            boolean r9 = r10.A01
            java.lang.Integer r0 = X.AnonymousClass0x7.A0g()
            boolean r0 = com.whatsapp.calling.fragment.CallConfirmationFragment.A02(r5, r2, r1, r0, r9)
            if (r0 != 0) goto L_0x0039
            X.66r r4 = r5.A0F
            X.3ZH r3 = r5.A0Z
            X.2sj r2 = r5.A0W
            X.2sr r1 = r5.A01
            X.3Ex r0 = r5.A0M
            java.util.List r7 = X.AnonymousClass36T.A03(r1, r0, r2, r3)
            r8 = 7
            X.1fJ r6 = r5.A0h
            int r0 = r4.Bpm(r5, r6, r7, r8, r9)
            if (r0 != 0) goto L_0x0039
            r0 = 0
            r5.A76(r0)
            return
        L_0x006a:
            java.lang.Object r4 = r10.A00
            com.whatsapp.calling.callhistory.CallLogActivity r4 = (com.whatsapp.calling.callhistory.CallLogActivity) r4
            X.3ZH r3 = r4.A0V
            X.2sj r2 = r4.A0S
            X.2sr r1 = r4.A01
            X.3Ex r0 = r4.A0J
            java.util.List r6 = X.AnonymousClass36T.A03(r1, r0, r2, r3)
            X.3ZH r0 = r4.A0V
            if (r0 == 0) goto L_0x00d4
            X.4uZ r0 = r0.A0H
            com.whatsapp.jid.GroupJid r1 = X.AnonymousClass32V.A00(r0)
        L_0x0084:
            boolean r0 = r4.A0f
            if (r0 == 0) goto L_0x00d2
            if (r1 == 0) goto L_0x00d2
            X.1VX r3 = r4.A0D
            X.2sr r2 = r4.A01
            X.2sj r0 = r4.A0S
            int r1 = X.C86664Kz.A0H(r0, r1)
            boolean r0 = X.C627436k.A0C(r2, r3, r1)
            if (r0 == 0) goto L_0x00d2
            boolean r0 = X.C627436k.A0B(r2, r3, r1)
            if (r0 != 0) goto L_0x00d2
            r3 = 1
        L_0x00a1:
            boolean r8 = r10.A01
            if (r8 != 0) goto L_0x00c2
            X.66r r2 = r4.A0D
            X.4uZ r0 = r4.A0Y
            X.1fJ r1 = X.AnonymousClass34R.A01(r0)
            r0 = 4
            boolean r0 = r2.BKz(r4, r1, r6, r0)
            if (r0 == 0) goto L_0x00c2
            X.1VX r1 = r4.A0D
            r0 = 5429(0x1535, float:7.608E-42)
            int r0 = r1.A0N(r0)
        L_0x00bc:
            if (r0 != 0) goto L_0x0039
            r4.finish()
            return
        L_0x00c2:
            if (r3 != 0) goto L_0x0039
            X.66r r3 = r4.A0D
            r7 = 4
            X.4uZ r0 = r4.A0Y
            com.whatsapp.jid.GroupJid r5 = X.AnonymousClass32V.A00(r0)
            int r0 = r3.Bpm(r4, r5, r6, r7, r8)
            goto L_0x00bc
        L_0x00d2:
            r3 = 0
            goto L_0x00a1
        L_0x00d4:
            r1 = 0
            goto L_0x0084
        L_0x00d6:
            java.lang.String r0 = "UserNoticeBanner/update/banner dismissed"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            boolean r0 = r10.A01
            if (r0 != 0) goto L_0x00e8
            java.lang.Object r0 = r10.A00
            X.5hi r0 = (X.C111205hi) r0
            X.33X r0 = r0.A05
            r0.A05()
        L_0x00e8:
            java.lang.Object r3 = r10.A00
            X.5hi r3 = (X.C111205hi) r3
            X.2kb r1 = r3.A04
            java.lang.Integer r0 = X.AnonymousClass0x7.A0h()
            r1.A01(r0)
            android.view.View r0 = r3.A00
            X.C626936e.A04(r0)
            android.view.View r1 = r3.A00
            r0 = 8
            r1.setVisibility(r0)
            X.33X r0 = r3.A05
            r0.A04()
            X.4C1 r2 = r3.A06
            java.lang.Object r0 = r2.get()
            if (r0 == 0) goto L_0x0039
            X.4Pc r1 = r3.A01
            java.lang.Object r0 = r2.get()
            X.5K6 r0 = (X.AnonymousClass5K6) r0
            r1.A02(r0)
            return
        L_0x011a:
            java.lang.Object r1 = r10.A00
            X.5Oz r1 = (X.C103935Oz) r1
            X.4GP r0 = r1.A0B
            r0.invoke()
            boolean r0 = r10.A01
            if (r0 == 0) goto L_0x0140
            android.content.Context r2 = r1.A00
            X.33m r4 = r1.A04
            X.4ea r0 = r1.A03
            android.view.View r3 = r0.A00
            X.4uZ r5 = r1.A09
            java.lang.Integer r6 = X.C18280x3.A0S()
            r0 = 2131886459(0x7f12017b, float:1.9407497E38)
            java.lang.String r7 = r2.getString(r0)
            X.C622334f.A00(r2, r3, r4, r5, r6, r7)
            return
        L_0x0140:
            X.4ea r2 = r1.A03
            X.4uZ r1 = r1.A09
            X.21R r0 = X.AnonymousClass21R.CONTACT_INFO
            com.whatsapp.mute.ui.MuteDialogFragment r1 = X.C57402ta.A00(r1, r0)
            r0 = 0
            r2.Bon(r1, r0)
            return
        L_0x014f:
            boolean r0 = r10.A01
            java.lang.Object r2 = r10.A00
            com.whatsapp.calling.views.PermissionDialogFragment r2 = (com.whatsapp.calling.views.PermissionDialogFragment) r2
            if (r0 == 0) goto L_0x0162
            r0 = 1
            r2.A0B = r0
            X.03q r0 = r2.A0R()
            X.C107395bF.A05(r0)
            return
        L_0x0162:
            android.app.Dialog r0 = r2.A01
            r0.dismiss()
            X.33p r1 = r2.A08
            java.lang.String[] r0 = r2.A0E
            com.whatsapp.RequestPermissionActivity.A0k(r2, r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass542.A07(android.view.View):void");
    }
}
