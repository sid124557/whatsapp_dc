package X;

/* renamed from: X.69h  reason: invalid class name and case insensitive filesystem */
public class C1236669h implements C15590rc {
    public Object A00;
    public final int A01;

    public C1236669h(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:72:0x01e6, code lost:
        if (r4 != 5) goto L_0x01e8;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onMenuItemClick(android.view.MenuItem r10) {
        /*
            r9 = this;
            int r0 = r9.A01
            if (r0 == 0) goto L_0x01b1
            java.lang.Object r2 = r9.A00
            com.whatsapp.status.playback.fragment.StatusPlaybackBaseFragment r2 = (com.whatsapp.status.playback.fragment.StatusPlaybackBaseFragment) r2
            com.whatsapp.status.playback.fragment.StatusPlaybackContactFragment r2 = (com.whatsapp.status.playback.fragment.StatusPlaybackContactFragment) r2
            X.03q r3 = r2.A0Q()
            r5 = 0
            if (r3 == 0) goto L_0x020d
            java.util.List r1 = r2.A0o
            int r0 = r2.A00
            X.34x r0 = X.C18320x8.A0R(r1, r0)
            X.5Uh r4 = r2.A1R(r0)
            boolean r0 = r2.A0r
            if (r0 == 0) goto L_0x00a3
            boolean r0 = r4 instanceof X.AnonymousClass51v
            if (r0 == 0) goto L_0x00a3
            X.51v r4 = (X.AnonymousClass51v) r4
            boolean r0 = r4.A0S
            if (r0 == 0) goto L_0x020d
            int r1 = r10.getItemId()
            r0 = 2131431441(0x7f0b1011, float:1.8484611E38)
            r6 = 1
            if (r1 != r0) goto L_0x003e
            X.5SJ r1 = r4.A0T
            X.34x r0 = r4.A06
            r1.A00(r0)
        L_0x003c:
            r0 = 1
            return r0
        L_0x003e:
            int r1 = r10.getItemId()
            r0 = 2131431473(0x7f0b1031, float:1.8484676E38)
            if (r1 != r0) goto L_0x0051
            X.5SJ r0 = r4.A0T
            com.whatsapp.status.playback.fragment.StatusPlaybackContactFragment r0 = r0.A02
            com.whatsapp.bridge.wfal.WfalManager r0 = r0.A08
            r0.A02()
            goto L_0x003c
        L_0x0051:
            int r1 = r10.getItemId()
            r0 = 2131431475(0x7f0b1033, float:1.848468E38)
            r3 = 7
            if (r1 != r0) goto L_0x0067
            X.5SJ r2 = r4.A0T
            X.34x r1 = r4.A06
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)
            r2.A01(r1, r0, r6, r5)
            goto L_0x003c
        L_0x0067:
            int r1 = r10.getItemId()
            r0 = 2131431476(0x7f0b1034, float:1.8484682E38)
            if (r1 != r0) goto L_0x007c
            X.5SJ r2 = r4.A0T
            X.34x r1 = r4.A06
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)
            r2.A01(r1, r0, r5, r6)
            goto L_0x003c
        L_0x007c:
            int r1 = r10.getItemId()
            r0 = 2131431437(0x7f0b100d, float:1.8484603E38)
            if (r1 != r0) goto L_0x020d
            X.5SJ r1 = r4.A0T
            X.34x r0 = r4.A06
            com.whatsapp.status.playback.fragment.StatusPlaybackContactFragment r3 = r1.A02
            X.2z0 r2 = r0.A1J
            X.C162457s7.A0J(r2, r5)
            com.whatsapp.status.StatusDeleteDialogFragment r1 = new com.whatsapp.status.StatusDeleteDialogFragment
            r1.<init>()
            android.os.Bundle r0 = X.AnonymousClass002.A08()
            X.C107395bF.A07(r0, r2)
            r1.A0u(r0)
            X.C57052sz.A01(r1, r3)
            goto L_0x003c
        L_0x00a3:
            int r1 = r10.getItemId()
            java.util.List r4 = r2.A0o
            int r0 = r2.A00
            X.34x r4 = X.C18320x8.A0R(r4, r0)
            r0 = 262144(0x40000, float:3.67342E-40)
            boolean r8 = r4.A1s(r0)
            r0 = 2131431430(0x7f0b1006, float:1.8484589E38)
            r7 = 0
            r6 = 1
            if (r1 != r0) goto L_0x00df
            com.whatsapp.jid.UserJid r3 = r2.A0R
            java.util.List r1 = r2.A0o
            if (r1 == 0) goto L_0x00dd
            int r0 = r2.A00
            X.34x r0 = X.C18320x8.A0R(r1, r0)
            X.2z0 r0 = r0.A1J
            java.lang.String r5 = r0.A01
        L_0x00cc:
            int r0 = r2.A00
            java.lang.Long r4 = X.AnonymousClass0x9.A0m(r0)
            java.lang.String r6 = r2.A0n
            com.whatsapp.status.StatusConfirmUnmuteDialogFragment r0 = X.C387028u.A00(r3, r4, r5, r6, r7, r8)
        L_0x00d8:
            X.C57052sz.A01(r0, r2)
            goto L_0x003c
        L_0x00dd:
            r5 = r7
            goto L_0x00cc
        L_0x00df:
            r0 = 2131431421(0x7f0b0ffd, float:1.848457E38)
            if (r1 != r0) goto L_0x0103
            com.whatsapp.jid.UserJid r3 = r2.A0R
            java.util.List r1 = r2.A0o
            if (r1 == 0) goto L_0x0101
            int r0 = r2.A00
            X.34x r0 = X.C18320x8.A0R(r1, r0)
            X.2z0 r0 = r0.A1J
            java.lang.String r5 = r0.A01
        L_0x00f4:
            int r0 = r2.A00
            java.lang.Long r4 = X.AnonymousClass0x9.A0m(r0)
            java.lang.String r6 = r2.A0n
            com.whatsapp.status.StatusConfirmMuteDialogFragment r0 = X.C386928t.A00(r3, r4, r5, r6, r7, r8)
            goto L_0x00d8
        L_0x0101:
            r5 = r7
            goto L_0x00f4
        L_0x0103:
            r0 = 2131431433(0x7f0b1009, float:1.8484595E38)
            r4 = 22
            if (r1 != r0) goto L_0x0119
            X.3Ex r1 = r2.A0C
            com.whatsapp.jid.UserJid r0 = r2.A0R
            X.3ZH r1 = r1.A0A(r0)
            X.66r r0 = r2.A09
            r0.Bpk(r3, r1, r4, r5)
            goto L_0x003c
        L_0x0119:
            r0 = 2131431432(0x7f0b1008, float:1.8484593E38)
            if (r1 != r0) goto L_0x012d
            X.3Ex r1 = r2.A0C
            com.whatsapp.jid.UserJid r0 = r2.A0R
            X.3ZH r1 = r1.A0A(r0)
            X.66r r0 = r2.A09
            r0.Bpk(r3, r1, r4, r6)
            goto L_0x003c
        L_0x012d:
            r0 = 2131431412(0x7f0b0ff4, float:1.8484552E38)
            if (r1 != r0) goto L_0x0143
            X.5LT r3 = X.C86654Ky.A0c(r2)
            X.3Ex r1 = r2.A0C
            com.whatsapp.jid.UserJid r0 = r2.A0R
            X.3ZH r0 = r1.A0A(r0)
            r2.A1X(r0, r3)
            goto L_0x003c
        L_0x0143:
            r0 = 2131431420(0x7f0b0ffc, float:1.8484569E38)
            if (r1 != r0) goto L_0x016b
            X.36r r3 = X.C86664Kz.A1B()
            android.content.Context r1 = r2.A1D()
            com.whatsapp.jid.UserJid r0 = r2.A0R
            android.content.Intent r3 = r3.A1O(r1, r0, r5)
            X.5aW r1 = r2.A0B
            com.whatsapp.jid.UserJid r0 = r2.A0R
            boolean r0 = r1.A0I(r0)
            if (r0 == 0) goto L_0x0166
            java.lang.String r1 = "chatlockEntryPoint"
            r0 = 3
            r3.putExtra(r1, r0)
        L_0x0166:
            X.C57052sz.A00(r3, r2)
            goto L_0x003c
        L_0x016b:
            r0 = 2131431464(0x7f0b1028, float:1.8484658E38)
            if (r1 != r0) goto L_0x003c
            X.1Wj r1 = new X.1Wj
            r1.<init>()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r5)
            r1.A00 = r0
            X.4FV r0 = r2.A0O
            r0.BhD(r1)
            X.6kE r4 = X.C135166kE.A00
            X.1VX r1 = r2.A03
            java.lang.String r0 = "status_post_report"
            X.5XI r3 = new X.5XI
            r3.<init>(r1, r4, r0, r5)
            r3.A00 = r5
            r3.A04 = r6
            X.1VX r1 = r2.A03
            r0 = 3988(0xf94, float:5.588E-42)
            boolean r0 = r1.A0X(r0)
            r3.A06 = r0
            r3.A05 = r5
            com.whatsapp.jid.UserJid r0 = r2.A0R
            r3.A01 = r0
            java.util.List r1 = r2.A0o
            int r0 = r2.A00
            X.34x r0 = X.C18320x8.A0R(r1, r0)
            X.2z0 r0 = r0.A1J
            r3.A02 = r0
            androidx.fragment.app.DialogFragment r0 = r3.A00()
            goto L_0x00d8
        L_0x01b1:
            java.lang.Object r6 = r9.A00
            X.5UG r6 = (X.AnonymousClass5UG) r6
            java.lang.ref.WeakReference r0 = r6.A0F
            java.lang.Object r2 = r0.get()
            X.03q r2 = (X.C003203q) r2
            r5 = 1
            if (r2 == 0) goto L_0x0206
            boolean r0 = r2.isFinishing()
            if (r0 != 0) goto L_0x0206
            int r4 = r10.getItemId()
            r0 = 2
            if (r4 == r0) goto L_0x01e1
            r0 = 4
            if (r4 == r0) goto L_0x01e1
            r0 = 5
            if (r4 != r0) goto L_0x01e4
            r3 = 0
        L_0x01d4:
            X.4uZ r1 = r6.A0E
            int r0 = r6.A04
            com.whatsapp.calling.schedulecall.ScheduleCallFragment r0 = com.whatsapp.calling.schedulecall.ScheduleCallFragment.A00(r1, r3, r0)
            X.C86644Kx.A1C(r0, r2)
            goto L_0x003c
        L_0x01e1:
            java.lang.Boolean r3 = java.lang.Boolean.TRUE
            goto L_0x01e8
        L_0x01e4:
            java.lang.Boolean r3 = java.lang.Boolean.FALSE
            if (r4 == r0) goto L_0x01d4
        L_0x01e8:
            r0 = 4
            if (r4 == r0) goto L_0x01d4
            r0 = 3
            if (r4 == r0) goto L_0x01d4
            r0 = 6
            X.65z r2 = r6.A06
            X.3ZH r1 = r6.A0C
            if (r4 != r0) goto L_0x01fa
            r2.Bpa(r1)
            goto L_0x003c
        L_0x01fa:
            X.C626936e.A06(r3)
            boolean r0 = r3.booleanValue()
            r2.BhP(r1, r0, r5)
            goto L_0x003c
        L_0x0206:
            java.lang.String r0 = "GroupCallMenuHelper/onPopupMenuEventListener activity is finished/finishing"
            com.whatsapp.util.Log.w((java.lang.String) r0)
            goto L_0x003c
        L_0x020d:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1236669h.onMenuItemClick(android.view.MenuItem):boolean");
    }
}
