package X;

import android.view.View;

/* renamed from: X.5ei  reason: invalid class name and case insensitive filesystem */
public class C109495ei implements View.OnClickListener {
    public Object A00;
    public Object A01;
    public final int A02;

    public C109495ei(Object obj, int i, Object obj2) {
        this.A02 = i;
        this.A00 = obj;
        this.A01 = obj2;
    }

    public static void A00(View view, Object obj, Object obj2, int i) {
        view.setOnClickListener(new C109495ei(obj, i, obj2));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:112:0x0311, code lost:
        if (0 != 0) goto L_0x0313;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x03e4, code lost:
        r2 = r3.A0N;
        r1 = r4 instanceof X.C987953g;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x03e8, code lost:
        if (r1 == false) goto L_0x03ee;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x03ea, code lost:
        r2.A00(2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x03ee, code lost:
        r2.A01(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:0x03f3, code lost:
        if ((r4 instanceof X.C988153i) == false) goto L_0x0401;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:147:0x03f5, code lost:
        r3.A0L.A1Q(5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:148:0x03fb, code lost:
        r3.A0K(r3.A00);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:149:0x0400, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:151:0x0403, code lost:
        if ((r4 instanceof X.C988053h) == false) goto L_0x0413;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:152:0x0405, code lost:
        r1 = r3.A0L;
        r1.A0m(X.C627736r.A07(r1.A0G()));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:153:0x0413, code lost:
        if (r1 == false) goto L_0x03fb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x0415, code lost:
        X.AnonymousClass344.A00(new com.whatsapp.status.archive.StatusArchiveSettingsBottomSheetDialog(), r3.A0L.A0T());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:270:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0103, code lost:
        if (r1 != 0) goto L_0x0105;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0116, code lost:
        if (r1 != 0) goto L_0x0118;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x01c7, code lost:
        r1 = r1.A04;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x01d8, code lost:
        if (r1 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x01da, code lost:
        r1.A04(r2, true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x01de, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x0296, code lost:
        r1.setVisibility(8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x029b, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.view.View r37) {
        /*
            r36 = this;
            r2 = r36
            int r0 = r2.A02
            r5 = r37
            switch(r0) {
                case 0: goto L_0x0621;
                case 1: goto L_0x01df;
                case 2: goto L_0x060b;
                case 3: goto L_0x05f5;
                case 4: goto L_0x064a;
                case 5: goto L_0x05e6;
                case 6: goto L_0x01ca;
                case 7: goto L_0x01ca;
                case 8: goto L_0x01b9;
                case 9: goto L_0x01aa;
                case 10: goto L_0x019b;
                case 11: goto L_0x018a;
                case 12: goto L_0x05ba;
                case 13: goto L_0x04e9;
                case 14: goto L_0x04db;
                case 15: goto L_0x0460;
                case 16: goto L_0x044b;
                case 17: goto L_0x0436;
                case 18: goto L_0x022a;
                case 19: goto L_0x0216;
                case 20: goto L_0x0424;
                case 21: goto L_0x03da;
                case 22: goto L_0x03b9;
                case 23: goto L_0x03ae;
                case 24: goto L_0x0144;
                case 25: goto L_0x011d;
                case 26: goto L_0x033f;
                case 27: goto L_0x032c;
                case 28: goto L_0x02cb;
                case 29: goto L_0x029c;
                case 30: goto L_0x00ee;
                case 31: goto L_0x0284;
                case 32: goto L_0x0067;
                case 33: goto L_0x026e;
                case 34: goto L_0x0243;
                case 35: goto L_0x0040;
                case 36: goto L_0x023e;
                default: goto L_0x0009;
            }
        L_0x0009:
            java.lang.Object r4 = r2.A00
            X.6Fq r4 = (X.C125126Fq) r4
            org.npci.upi.security.pinactivitycomponent.widget.FormItemEditText r0 = r4.A0G
            X.C86634Kw.A1I(r0)
            java.lang.Object r0 = r2.A01
            X.3bt r0 = (X.C71303bt) r0
            java.lang.Object r1 = r0.A00
            org.npci.upi.security.pinactivitycomponent.s r1 = (org.npci.upi.security.pinactivitycomponent.s) r1
            int r0 = r1.A01
            int r0 = r0 + -1
            r1.A01 = r0
            r1.A1L(r4)
            android.os.Bundle r3 = X.AnonymousClass002.A08()
            java.lang.String r1 = "action"
            java.lang.String r0 = "TRIGGER_OTP"
            r3.putString(r1, r0)
            java.lang.String r1 = r4.A0F
            java.lang.String r0 = "AADHAAR"
            boolean r2 = r1.equals(r0)
            android.os.ResultReceiver r1 = X.AnonymousClass7Q1.A0B
            r0 = 2
            if (r2 == 0) goto L_0x003c
            r0 = 4
        L_0x003c:
            r1.send(r0, r3)
        L_0x003f:
            return
        L_0x0040:
            java.lang.Object r4 = r2.A00
            X.15O r4 = (X.AnonymousClass15O) r4
            java.lang.Object r3 = r2.A01
            android.webkit.WebView r3 = (android.webkit.WebView) r3
            if (r37 == 0) goto L_0x005a
            X.4FT r2 = r4.A04
            android.content.Context r1 = r5.getContext()
            r0 = 2131895559(0x7f122507, float:1.9425954E38)
            java.lang.String r0 = X.C18290x4.A0l(r1, r0)
            r2.Bs3(r0)
        L_0x005a:
            X.4FT r1 = r4.A04
            java.lang.String r0 = ""
            r1.Bs4(r0)
            if (r3 == 0) goto L_0x003f
            r3.reload()
            return
        L_0x0067:
            java.lang.Object r5 = r2.A00
            com.whatsapp.voipcalling.VoipActivityV2 r5 = (com.whatsapp.voipcalling.VoipActivityV2) r5
            java.lang.Object r3 = r2.A01
            com.whatsapp.voipcalling.CallInfo r3 = (com.whatsapp.voipcalling.CallInfo) r3
            android.view.ViewGroup r0 = r5.A0Q
            X.C626936e.A04(r0)
            android.view.ViewGroup r1 = r5.A0Q
            r0 = 1
            X.C162457s7.A0J(r1, r0)
            java.lang.String r0 = "CallFailedScreenCoordinator hide"
            com.whatsapp.util.Log.d((java.lang.String) r0)
            r0 = 8
            r1.setVisibility(r0)
            X.7Ta r1 = r5.A1H
            java.lang.Integer r0 = X.C18290x4.A0b()
            r1.A02 = r0
            r1.A00()
            java.lang.String r0 = "VoipActivityV2 vm call back onclick"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            java.util.ArrayList r7 = X.AnonymousClass001.A0s()
            java.util.ArrayList r4 = X.AnonymousClass001.A0s()
            java.util.Map r0 = r3.participants
            java.util.Iterator r2 = X.AnonymousClass001.A0v(r0)
        L_0x00a2:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x00b6
            X.5Lb r1 = X.C86664Kz.A13(r2)
            boolean r0 = r1.A0J
            if (r0 != 0) goto L_0x00a2
            com.whatsapp.jid.UserJid r0 = r1.A08
            r4.add(r0)
            goto L_0x00a2
        L_0x00b6:
            java.util.Iterator r2 = r4.iterator()
        L_0x00ba:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x00d0
            X.4uZ r1 = X.C18300x5.A0P(r2)
            X.3Ex r0 = r5.A1I
            X.3ZH r0 = r0.A07(r1)
            if (r0 == 0) goto L_0x00ba
            r7.add(r0)
            goto L_0x00ba
        L_0x00d0:
            boolean r0 = r7.isEmpty()
            if (r0 != 0) goto L_0x003f
            X.5qe r0 = r5.A1C
            r0.A02()
            android.os.Handler r1 = r5.A0D
            r0 = 9
            r1.removeMessages(r0)
            X.66r r4 = r5.A0z
            r8 = 30
            boolean r9 = r3.videoEnabled
            com.whatsapp.jid.GroupJid r6 = r3.groupJid
            r4.Bpm(r5, r6, r7, r8, r9)
            return
        L_0x00ee:
            java.lang.Object r4 = r2.A00
            com.whatsapp.voipcalling.VoipActivityV2 r4 = (com.whatsapp.voipcalling.VoipActivityV2) r4
            java.lang.Object r3 = r2.A01
            com.whatsapp.calling.views.VoipCallFooter r3 = (com.whatsapp.calling.views.VoipCallFooter) r3
            com.whatsapp.voipcalling.VoipCallControlBottomSheetV2 r2 = r4.A1t
            if (r2 == 0) goto L_0x003f
            X.5UY r0 = r2.A0d
            if (r0 == 0) goto L_0x0105
            int r1 = r0.A03()
            r0 = 1
            if (r1 == 0) goto L_0x0106
        L_0x0105:
            r0 = 0
        L_0x0106:
            r0 = r0 ^ 1
            r2.A1b(r0)
            com.whatsapp.voipcalling.VoipCallControlBottomSheetV2 r0 = r4.A1t
            X.5UY r0 = r0.A0d
            if (r0 == 0) goto L_0x0118
            int r1 = r0.A03()
            r0 = 1
            if (r1 == 0) goto L_0x0119
        L_0x0118:
            r0 = 0
        L_0x0119:
            r3.setDialpadBtnSelected(r0)
            return
        L_0x011d:
            java.lang.Object r3 = r2.A00
            X.563 r3 = (X.AnonymousClass563) r3
            java.lang.Object r2 = r2.A01
            X.5YG r2 = (X.AnonymousClass5YG) r2
            boolean r0 = r3.A0Q
            if (r0 == 0) goto L_0x0136
            r1 = 0
            r3.A0Q = r1
            r0 = 1
            r3.A0R = r0
            r3.A0E()
            r2.A0P(r1)
            return
        L_0x0136:
            boolean r0 = r3.A0K
            if (r0 != 0) goto L_0x003f
            boolean r0 = r2.A0a()
            if (r0 == 0) goto L_0x0676
            r3.A00()
            return
        L_0x0144:
            java.lang.Object r0 = r2.A00
            X.53U r0 = (X.AnonymousClass53U) r0
            java.lang.Object r2 = r2.A01
            com.whatsapp.updates.ui.UpdatesFragment r0 = r0.A02
            com.whatsapp.updates.viewmodels.UpdatesViewModel r1 = r0.A0q
            if (r1 == 0) goto L_0x003f
            X.03q r6 = r0.A0Q()
            X.AnonymousClass0x9.A1L(r6)
            X.4ea r6 = (X.C89654ea) r6
            r0 = 0
            X.C162457s7.A0J(r6, r0)
            X.66R r0 = r1.A0r
            java.lang.Object r5 = X.C18300x5.A0d(r0)
            com.whatsapp.updates.viewmodels.SearchUsecase r5 = (com.whatsapp.updates.viewmodels.SearchUsecase) r5
            X.4C6 r4 = X.AnonymousClass0IV.A00(r1)
            r0 = 2
            X.C162457s7.A0J(r4, r0)
            boolean r0 = r2 instanceof X.AnonymousClass53A
            if (r0 != 0) goto L_0x067a
            boolean r0 = r2 instanceof X.AnonymousClass53B
            if (r0 != 0) goto L_0x067a
            boolean r0 = r2 instanceof X.AnonymousClass53E
            if (r0 != 0) goto L_0x017d
            boolean r0 = r2 instanceof X.AnonymousClass53C
            if (r0 == 0) goto L_0x003f
        L_0x017d:
            X.3gB r3 = r5.A0C
            r2 = 0
            com.whatsapp.updates.viewmodels.SearchUsecase$launchRemoteSearch$1 r1 = new com.whatsapp.updates.viewmodels.SearchUsecase$launchRemoteSearch$1
            r1.<init>(r5, r2)
            r0 = 2
            X.C616131n.A02(r3, r1, r4, r2, r0)
            return
        L_0x018a:
            java.lang.Object r0 = r2.A00
            X.6Hc r0 = (X.C125256Hc) r0
            java.lang.Object r1 = r2.A01
            X.7V0 r1 = (X.AnonymousClass7V0) r1
            X.8J4 r0 = r0.A01
            int r2 = r1.A00()
            X.7aj r1 = r0.A01
            goto L_0x01d8
        L_0x019b:
            java.lang.Object r1 = r2.A00
            X.6Hi r1 = (X.C125316Hi) r1
            java.lang.Object r0 = r2.A01
            X.7i7 r0 = (X.C157327i7) r0
            X.8J5 r1 = r1.A02
            int r0 = r0.A00
            int r2 = r0 + 3
            goto L_0x01c7
        L_0x01aa:
            java.lang.Object r1 = r2.A00
            X.6Hi r1 = (X.C125316Hi) r1
            java.lang.Object r0 = r2.A01
            X.7i7 r0 = (X.C157327i7) r0
            X.8J5 r1 = r1.A02
            int r0 = r0.A00
            int r2 = r0 + 2
            goto L_0x01c7
        L_0x01b9:
            java.lang.Object r1 = r2.A00
            X.6Hi r1 = (X.C125316Hi) r1
            java.lang.Object r0 = r2.A01
            X.7i7 r0 = (X.C157327i7) r0
            X.8J5 r1 = r1.A02
            int r0 = r0.A00
            int r2 = r0 + 1
        L_0x01c7:
            X.7aj r1 = r1.A04
            goto L_0x01d8
        L_0x01ca:
            java.lang.Object r0 = r2.A00
            X.6Hi r0 = (X.C125316Hi) r0
            java.lang.Object r1 = r2.A01
            X.7i7 r1 = (X.C157327i7) r1
            X.8J5 r0 = r0.A02
            int r2 = r1.A00
            X.7aj r1 = r0.A04
        L_0x01d8:
            if (r1 == 0) goto L_0x003f
            r0 = 1
            r1.A04(r2, r0)
            return
        L_0x01df:
            java.lang.Object r0 = r2.A00
            X.5pF r0 = (X.C115795pF) r0
            java.lang.Object r4 = r2.A01
            android.widget.ImageView r4 = (android.widget.ImageView) r4
            com.whatsapp.status.StatusesFragment r3 = r0.A01
            android.animation.AnimatorSet r0 = r3.A00
            if (r0 != 0) goto L_0x003f
            boolean r0 = r3.A1N
            r2 = r0 ^ 1
            r3.A1N = r2
            android.content.res.Resources r1 = X.C08310eF.A09(r3)
            r0 = 2131232108(0x7f08056c, float:1.8080316E38)
            if (r2 == 0) goto L_0x01ff
            r0 = 2131232106(0x7f08056a, float:1.8080312E38)
        L_0x01ff:
            android.graphics.drawable.Drawable r0 = r1.getDrawable(r0)
            r4.setImageDrawable(r0)
            boolean r0 = r3.A1N
            if (r0 == 0) goto L_0x0691
            r0 = 20
            X.67L r1 = new X.67L
            r1.<init>(r3, r0)
            r0 = 0
            r3.A1R(r1, r0)
            return
        L_0x0216:
            java.lang.Object r1 = r2.A00
            X.53W r1 = (X.AnonymousClass53W) r1
            java.lang.Object r0 = r2.A01
            X.52u r0 = (X.C986752u) r0
            com.whatsapp.updates.ui.UpdatesFragment r1 = r1.A02
            X.57s r0 = r0.A00
            r1.A1S(r0)
            java.lang.RuntimeException r0 = X.AnonymousClass000.A0L()
            throw r0
        L_0x022a:
            java.lang.Object r1 = r2.A00
            X.53X r1 = (X.AnonymousClass53X) r1
            java.lang.Object r0 = r2.A01
            X.52u r0 = (X.C986752u) r0
            com.whatsapp.updates.ui.UpdatesFragment r1 = r1.A04
            X.57s r0 = r0.A00
            r1.A1S(r0)
            java.lang.RuntimeException r0 = X.AnonymousClass000.A0L()
            throw r0
        L_0x023e:
            java.lang.Object r1 = r2.A00
            android.view.View r1 = (android.view.View) r1
            goto L_0x0296
        L_0x0243:
            java.lang.Object r1 = r2.A00
            X.5Q7 r1 = (X.AnonymousClass5Q7) r1
            java.lang.Object r3 = r2.A01
            X.07r r3 = (X.C009707r) r3
            X.8qC r0 = r1.A02
            java.lang.Object r2 = r0.get()
            X.5TE r2 = (X.AnonymousClass5TE) r2
            java.lang.String r8 = "settings"
            X.2sr r0 = r1.A01
            java.lang.String r9 = X.C56972sr.A06(r0)
            r0 = 1
            X.69v r4 = new X.69v
            r4.<init>(r3, r0, r1)
            r5 = 0
            X.C18260x0.A0P(r3, r9)
            java.lang.String r6 = "com.bloks.www.fxcal.settings.async"
            java.lang.String r7 = "wa_settings"
            r10 = r5
            r2.A01(r3, r4, r5, r6, r7, r8, r9, r10)
            return
        L_0x026e:
            java.lang.Object r0 = r2.A00
            X.3XK r0 = (X.AnonymousClass3XK) r0
            java.lang.Object r2 = r2.A01
            android.content.Context r2 = (android.content.Context) r2
            X.2oU r0 = r0.A00
            android.content.Context r1 = r0.A00
            java.lang.String r0 = "maiba-learn-more"
            android.content.Intent r0 = X.C627736r.A0s(r1, r0)
            r2.startActivity(r0)
            return
        L_0x0284:
            java.lang.Object r1 = r2.A00
            com.whatsapp.voipcalling.VoipActivityV2 r1 = (com.whatsapp.voipcalling.VoipActivityV2) r1
            java.lang.Object r0 = r2.A01
            android.view.View$OnClickListener r0 = (android.view.View.OnClickListener) r0
            r0.onClick(r5)
            android.widget.TextView r0 = r1.A0W
            X.C86634Kw.A1I(r0)
            android.view.View r1 = r1.A0L
        L_0x0296:
            r0 = 8
            r1.setVisibility(r0)
            return
        L_0x029c:
            java.lang.Object r4 = r2.A00
            com.whatsapp.voipcalling.VoipActivityV2 r4 = (com.whatsapp.voipcalling.VoipActivityV2) r4
            java.lang.Object r3 = r2.A01
            X.4uZ r3 = (X.C95814uZ) r3
            java.lang.String r0 = "VoipActivityV2 launching conversation activity"
            com.whatsapp.util.Log.d((java.lang.String) r0)
            X.5hX r2 = r4.A00
            X.36r r1 = X.C86664Kz.A1B()
            X.3Ex r0 = r4.A1I
            X.3ZH r0 = r0.A0A(r3)
            android.content.Intent r0 = r1.A1L(r4, r0)
            r2.A0B(r4, r0)
            X.7Ta r1 = r4.A1H
            java.lang.Integer r0 = X.C18290x4.A0a()
            r1.A02 = r0
            r1.A00()
            r4.finish()
            return
        L_0x02cb:
            java.lang.Object r4 = r2.A00
            com.whatsapp.voipcalling.VoipActivityV2 r4 = (com.whatsapp.voipcalling.VoipActivityV2) r4
            java.lang.Object r3 = r2.A01
            com.whatsapp.voipcalling.CallInfo r3 = (com.whatsapp.voipcalling.CallInfo) r3
            com.whatsapp.voipcalling.CallInfo r2 = r4.A7D()
            X.2rx r0 = r4.A1L
            boolean r1 = X.AnonymousClass36T.A08(r0, r2)
            boolean r0 = r4.A81()
            if (r0 == 0) goto L_0x02f6
            X.1VX r0 = r4.A0D
            boolean r0 = X.C627436k.A0E(r0)
            if (r0 == 0) goto L_0x02f6
            com.whatsapp.voipcalling.WASecuredDialogFragment r1 = new com.whatsapp.voipcalling.WASecuredDialogFragment
            r1.<init>()
            java.lang.String r0 = "WASecuredDialogFragment"
            r4.A7A(r1, r0)
            return
        L_0x02f6:
            if (r1 == 0) goto L_0x0308
            X.1VX r0 = r4.A0D
            boolean r0 = X.C627436k.A0E(r0)
            if (r0 == 0) goto L_0x0308
            X.4FS r1 = r4.A04
            r0 = 13
            X.C86624Kv.A1N(r1, r4, r2, r0)
            return
        L_0x0308:
            if (r3 == 0) goto L_0x030e
            boolean r0 = r3.videoEnabled
            if (r0 != 0) goto L_0x0313
        L_0x030e:
            r0 = 0
            r3 = 10
            if (r0 == 0) goto L_0x0315
        L_0x0313:
            r3 = 11
        L_0x0315:
            com.whatsapp.voipcalling.VoipActivityV2$E2EEInfoDialogFragment r2 = new com.whatsapp.voipcalling.VoipActivityV2$E2EEInfoDialogFragment
            r2.<init>()
            android.os.Bundle r1 = X.AnonymousClass002.A08()
            java.lang.String r0 = "entry_point"
            r1.putInt(r0, r3)
            r2.A0u(r1)
            java.lang.String r0 = "E2EEInfoDialogFragment"
            r4.A7A(r2, r0)
            return
        L_0x032c:
            java.lang.Object r0 = r2.A00
            X.4Wj r0 = (X.C87854Wj) r0
            java.lang.Object r4 = r2.A01
            X.3ZH r4 = (X.AnonymousClass3ZH) r4
            com.whatsapp.viewsharedcontacts.ViewSharedContactArrayActivity r3 = r0.A01
            X.66r r2 = r3.A02
            r1 = 15
            r0 = 1
            r2.Bpk(r3, r4, r1, r0)
            return
        L_0x033f:
            java.lang.Object r3 = r2.A00
            X.4Wj r3 = (X.C87854Wj) r3
            java.lang.Object r6 = r2.A01
            X.5a1 r6 = (X.C106705a1) r6
            byte[] r2 = r6.A0B
            r8 = 0
            if (r2 == 0) goto L_0x0385
            int r1 = r2.length
            if (r1 <= 0) goto L_0x0385
            r0 = 0
            android.graphics.Bitmap r5 = android.graphics.BitmapFactory.decodeByteArray(r2, r0, r1)
        L_0x0354:
            com.whatsapp.viewsharedcontacts.ViewSharedContactArrayActivity r4 = r3.A01
            r4.A0J = r6
            java.util.List r7 = r4.A0P
            r7.clear()
            java.util.ArrayList r3 = r4.A0O
            r3.clear()
            java.util.List r0 = r6.A06
            if (r0 == 0) goto L_0x0387
            java.util.Iterator r2 = r0.iterator()
        L_0x036a:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0387
            X.7OD r1 = X.AnonymousClass4L0.A0R(r2)
            java.lang.String r0 = r1.A02
            r3.add(r0)
            com.whatsapp.jid.UserJid r0 = r1.A01
            if (r0 == 0) goto L_0x0381
            r7.add(r0)
            goto L_0x036a
        L_0x0381:
            r7.add(r8)
            goto L_0x036a
        L_0x0385:
            r5 = r8
            goto L_0x0354
        L_0x0387:
            X.0zH r3 = X.AnonymousClass5V0.A00(r4)
            r0 = 2131886336(0x7f120100, float:1.9407248E38)
            r3.A0T(r0)
            r2 = 2131890950(0x7f121306, float:1.9416606E38)
            r1 = 7
            X.68x r0 = new X.68x
            r0.<init>(r6, r5, r4, r1)
            r3.A0Y(r0, r2)
            r2 = 2131889187(0x7f120c23, float:1.941303E38)
            r1 = 8
            X.68x r0 = new X.68x
            r0.<init>(r6, r5, r4, r1)
            r3.A0W(r0, r2)
            X.C18280x3.A0q(r3)
            return
        L_0x03ae:
            java.lang.Object r0 = r2.A00
            X.53R r0 = (X.AnonymousClass53R) r0
            java.lang.Object r4 = r2.A01
            X.5RK r4 = (X.AnonymousClass5RK) r4
            com.whatsapp.updates.ui.adapter.UpdatesAdapter r3 = r0.A00
            goto L_0x03e4
        L_0x03b9:
            java.lang.Object r0 = r2.A00
            X.53Y r0 = (X.AnonymousClass53Y) r0
            java.lang.Object r3 = r2.A01
            X.5RK r3 = (X.AnonymousClass5RK) r3
            com.whatsapp.updates.ui.adapter.UpdatesAdapter r2 = r0.A03
            r0 = 0
            X.C162457s7.A0J(r3, r0)
            X.5T1 r1 = r2.A0N
            boolean r0 = r3 instanceof X.C987953g
            if (r0 == 0) goto L_0x03d1
            r0 = 3
            r1.A00(r0)
        L_0x03d1:
            r1.A01(r3)
            X.5TL r0 = r2.A00
            r2.A0K(r0)
            return
        L_0x03da:
            java.lang.Object r0 = r2.A00
            X.53Y r0 = (X.AnonymousClass53Y) r0
            java.lang.Object r4 = r2.A01
            X.5RK r4 = (X.AnonymousClass5RK) r4
            com.whatsapp.updates.ui.adapter.UpdatesAdapter r3 = r0.A03
        L_0x03e4:
            X.5T1 r2 = r3.A0N
            boolean r1 = r4 instanceof X.C987953g
            if (r1 == 0) goto L_0x03ee
            r0 = 2
            r2.A00(r0)
        L_0x03ee:
            r2.A01(r4)
            boolean r0 = r4 instanceof X.C988153i
            if (r0 == 0) goto L_0x0401
            com.whatsapp.updates.ui.UpdatesFragment r1 = r3.A0L
            r0 = 5
            r1.A1Q(r0)
        L_0x03fb:
            X.5TL r0 = r3.A00
            r3.A0K(r0)
            return
        L_0x0401:
            boolean r0 = r4 instanceof X.C988053h
            if (r0 == 0) goto L_0x0413
            com.whatsapp.updates.ui.UpdatesFragment r1 = r3.A0L
            android.content.Context r0 = r1.A0G()
            android.content.Intent r0 = X.C627736r.A07(r0)
            r1.A0m(r0)
            goto L_0x03fb
        L_0x0413:
            if (r1 == 0) goto L_0x03fb
            com.whatsapp.updates.ui.UpdatesFragment r0 = r3.A0L
            X.0df r1 = r0.A0T()
            com.whatsapp.status.archive.StatusArchiveSettingsBottomSheetDialog r0 = new com.whatsapp.status.archive.StatusArchiveSettingsBottomSheetDialog
            r0.<init>()
            X.AnonymousClass344.A00(r0, r1)
            goto L_0x03fb
        L_0x0424:
            java.lang.Object r0 = r2.A00
            X.53b r0 = (X.C987453b) r0
            java.lang.Object r1 = r2.A01
            X.536 r1 = (X.AnonymousClass536) r1
            com.whatsapp.updates.ui.adapter.UpdatesAdapter r0 = r0.A0C
            X.1RL r1 = r1.A03
            com.whatsapp.updates.ui.UpdatesFragment r0 = r0.A0L
            r0.A1R(r1)
            return
        L_0x0436:
            java.lang.Object r1 = r2.A00
            X.53H r1 = (X.AnonymousClass53H) r1
            java.lang.Object r0 = r2.A01
            X.52r r0 = (X.C986452r) r0
            X.66J r1 = r1.A07
            X.34r r0 = r0.A01
            com.whatsapp.jid.UserJid r0 = r0.A0A
            X.C162457s7.A0D(r0)
            r1.BcR(r0)
            return
        L_0x044b:
            java.lang.Object r1 = r2.A00
            X.53G r1 = (X.AnonymousClass53G) r1
            java.lang.Object r0 = r2.A01
            X.52r r0 = (X.C986452r) r0
            X.66a r1 = r1.A06
            X.34r r0 = r0.A01
            com.whatsapp.jid.UserJid r0 = r0.A0A
            X.C162457s7.A0D(r0)
            r1.BcR(r0)
            return
        L_0x0460:
            java.lang.Object r3 = r2.A00
            X.5Gt r3 = (X.C101915Gt) r3
            java.lang.Object r1 = r2.A01
            X.4YZ r1 = (X.AnonymousClass4YZ) r1
            com.whatsapp.TextEmojiLabel r0 = r1.A00
            java.lang.String r5 = X.C86664Kz.A1K(r0)
            java.lang.String r4 = r1.A03
            com.whatsapp.textstatus.AddTextStatusActivity r3 = r3.A00
            r0 = 1
            r3.A0F = r0
            java.lang.String r2 = "textEntry"
            if (r5 == 0) goto L_0x0493
            com.whatsapp.WaEditText r1 = r3.A01
            if (r1 != 0) goto L_0x0482
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r2)
            throw r0
        L_0x0482:
            X.4Mm r0 = new X.4Mm
            r0.<init>(r5)
            r1.setText(r0)
            com.whatsapp.WaEditText r0 = r3.A01
            if (r0 != 0) goto L_0x04a0
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r2)
            throw r0
        L_0x0493:
            com.whatsapp.WaEditText r0 = r3.A01
            if (r0 != 0) goto L_0x049c
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r2)
            throw r0
        L_0x049c:
            X.C86634Kw.A1I(r0)
            goto L_0x04a3
        L_0x04a0:
            X.C86654Ky.A1D(r0, r5)
        L_0x04a3:
            if (r4 == 0) goto L_0x04bc
            X.4FS r2 = r3.A04
            r1 = 15
            X.3c0 r0 = new X.3c0
            r0.<init>(r1, r4, r3)
            r2.BkP(r0)
        L_0x04b1:
            X.4WZ r1 = r3.A0C
            java.lang.String r0 = "adapter"
            if (r1 != 0) goto L_0x04ce
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x04bc:
            android.content.Context r2 = r3.getApplicationContext()
            r1 = 2131231686(0x7f0803c6, float:1.807946E38)
            r0 = 2131101258(0x7f06064a, float:1.781492E38)
            android.graphics.drawable.Drawable r0 = X.C107335b8.A03(r2, r1, r0)
            r3.A05.A0S(new X.C71573cK(r3, 39, r0))
            goto L_0x04b1
        L_0x04ce:
            r1.A01 = r5
            r3.A0D = r4
            r1.A00 = r4
            r1.A05()
            r3.A74()
            return
        L_0x04db:
            java.lang.Object r0 = r2.A00
            X.4OI r0 = (X.AnonymousClass4OI) r0
            java.lang.Object r1 = r2.A01
            X.5JW r1 = (X.AnonymousClass5JW) r1
            com.whatsapp.support.faq.SearchFAQ r0 = r0.A00
            r0.A76(r1)
            return
        L_0x04e9:
            java.lang.Object r12 = r2.A00
            com.whatsapp.support.DescribeProblemActivity r12 = (com.whatsapp.support.DescribeProblemActivity) r12
            java.lang.Object r5 = r2.A01
            android.widget.TextView r5 = (android.widget.TextView) r5
            java.lang.String r4 = r12.A74()
            byte[] r0 = r4.getBytes()
            int r3 = r0.length
            java.lang.String r0 = r12.A0N
            boolean r1 = X.AnonymousClass2BI.A00(r0)
            boolean r0 = r12.A0P
            r2 = 0
            if (r0 != 0) goto L_0x0522
            boolean r0 = com.whatsapp.support.DescribeProblemActivity.A0L(r4, r1)
            if (r0 == 0) goto L_0x0522
            android.widget.EditText r1 = r12.A02
            r0 = 2131231370(0x7f08028a, float:1.807882E38)
            X.C86614Ku.A11(r12, r1, r0)
            r0 = 2131888586(0x7f1209ca, float:1.9411812E38)
            if (r3 != 0) goto L_0x051b
            r0 = 2131888585(0x7f1209c9, float:1.941181E38)
        L_0x051b:
            r5.setText(r0)
            r5.setVisibility(r2)
            return
        L_0x0522:
            android.widget.EditText r1 = r12.A02
            r0 = 2131231372(0x7f08028c, float:1.8078823E38)
            X.C86614Ku.A11(r12, r1, r0)
            r0 = 8
            r5.setVisibility(r0)
            int r1 = r12.A00
            r0 = 2
            if (r1 == r0) goto L_0x05b6
            r0 = 3
            if (r1 == r0) goto L_0x05b6
            java.lang.String r1 = "voip-dev@whatsapp.com"
            java.lang.String r0 = r12.A0M
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x05b6
            java.lang.String r0 = r12.A0N
            boolean r0 = X.AnonymousClass2BI.A00(r0)
            if (r0 != 0) goto L_0x05b6
            X.4FS r11 = r12.A04
            X.1tv r0 = r12.A0C
            if (r0 == 0) goto L_0x055b
            int r1 = r0.A06()
            r0 = 1
            if (r1 != r0) goto L_0x055b
            X.1tv r0 = r12.A0C
            r0.A0D(r2)
        L_0x055b:
            X.2s4 r0 = r12.A05
            r17 = r0
            X.5Zy r15 = r12.A0K
            X.2zf r14 = r12.A07
            X.3Lk r13 = r12.A0I
            X.33j r10 = r12.A00
            X.34j r9 = r12.A0J
            X.2s6 r8 = r12.A06
            X.2mi r7 = r12.A09
            X.33p r6 = r12.A09
            X.2d8 r5 = r12.A0G
            java.lang.String r4 = r12.A0N
            java.lang.String r3 = r12.A0O
            X.8tj r0 = r12.A0E
            if (r0 == 0) goto L_0x05b3
            java.util.List r34 = r0.BAg()
        L_0x057d:
            java.lang.String r33 = r12.A74()
            android.net.Uri[] r2 = r12.A0Q
            r22 = 0
            X.2oX r1 = r12.A0A
            X.1tv r0 = new X.1tv
            r16 = r12
            r26 = r22
            r30 = r15
            r31 = r4
            r32 = r3
            r35 = r2
            r27 = r5
            r28 = r13
            r29 = r9
            r23 = r7
            r24 = r1
            r25 = r12
            r20 = r10
            r21 = r14
            r18 = r8
            r19 = r6
            r15 = r0
            r15.<init>(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35)
            r12.A0C = r0
            X.AnonymousClass0x7.A1B(r0, r11)
            return
        L_0x05b3:
            r34 = 0
            goto L_0x057d
        L_0x05b6:
            r12.A75()
            return
        L_0x05ba:
            java.lang.Object r1 = r2.A00
            X.4YT r1 = (X.AnonymousClass4YT) r1
            java.lang.Object r5 = r2.A01
            X.0Wx r5 = (X.C06270Wx) r5
            android.content.Context r0 = X.C86664Kz.A0T(r1)
            java.lang.String r4 = r1.A02
            r3 = 6
            android.content.Intent r2 = X.C18320x8.A07()
            java.lang.String r1 = r0.getPackageName()
            java.lang.String r0 = "com.whatsapp.dmsetting.DisappearingMessagesSettingActivity"
            r2.setClassName(r1, r0)
            java.lang.String r0 = "entry_point"
            r2.putExtra(r0, r3)
            if (r4 == 0) goto L_0x05e2
            java.lang.String r0 = "search_result_key"
            r2.putExtra(r0, r4)
        L_0x05e2:
            r5.A0H(r2)
            return
        L_0x05e6:
            java.lang.Object r1 = r2.A00
            com.whatsapp.status.seeall.StatusSeeAllActivity r1 = (com.whatsapp.status.seeall.StatusSeeAllActivity) r1
            java.lang.Object r0 = r2.A01
            android.view.MenuItem r0 = (android.view.MenuItem) r0
            X.C162457s7.A0H(r0)
            r1.onOptionsItemSelected(r0)
            return
        L_0x05f5:
            java.lang.Object r0 = r2.A00
            X.4S6 r0 = (X.AnonymousClass4S6) r0
            java.lang.Object r2 = r2.A01
            com.whatsapp.status.privacy.StatusPrivacyBottomSheetDialogFragment r2 = (com.whatsapp.status.privacy.StatusPrivacyBottomSheetDialogFragment) r2
            r1 = 1
            r0.A00()
            android.widget.RadioButton r0 = r0.A03
            r0.setChecked(r1)
            r0 = 2
            r2.A1b(r0)
            return
        L_0x060b:
            java.lang.Object r0 = r2.A00
            X.4S6 r0 = (X.AnonymousClass4S6) r0
            java.lang.Object r3 = r2.A01
            com.whatsapp.status.privacy.StatusPrivacyBottomSheetDialogFragment r3 = (com.whatsapp.status.privacy.StatusPrivacyBottomSheetDialogFragment) r3
            r2 = 0
            r1 = 1
            r0.A00()
            android.widget.RadioButton r0 = r0.A04
            r0.setChecked(r1)
            r3.A1b(r2)
            return
        L_0x0621:
            java.lang.Object r4 = r2.A00
            com.whatsapp.spamreport.ReportSpamDialogFragment r4 = (com.whatsapp.spamreport.ReportSpamDialogFragment) r4
            java.lang.Object r3 = r2.A01
            X.3ZH r3 = (X.AnonymousClass3ZH) r3
            r0 = 1
            X.C162457s7.A0J(r3, r0)
            X.2p7 r2 = r4.A1Y()
            X.66R r0 = r4.A0M
            java.lang.String r1 = X.AnonymousClass0x9.A13(r0)
            X.C162457s7.A0D(r1)
            X.4uZ r0 = r3.A0H
            if (r0 == 0) goto L_0x0645
            r2.A00(r0, r1)
            r4.A1K()
            return
        L_0x0645:
            java.lang.IllegalArgumentException r0 = X.C18300x5.A0X()
            throw r0
        L_0x064a:
            java.lang.Object r0 = r2.A00
            X.4S6 r0 = (X.AnonymousClass4S6) r0
            java.lang.Object r2 = r2.A01
            com.whatsapp.status.privacy.StatusPrivacyBottomSheetDialogFragment r2 = (com.whatsapp.status.privacy.StatusPrivacyBottomSheetDialogFragment) r2
            r1 = 1
            r0.A00()
            android.widget.RadioButton r0 = r0.A02
            r0.setChecked(r1)
            X.5de r0 = r2.A03
            if (r0 != 0) goto L_0x0666
            java.lang.String r0 = "statusDistributionInfo"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x0666:
            java.util.List r0 = r0.A01
            int r0 = r0.size()
            if (r0 != 0) goto L_0x0672
            r2.A1a()
            return
        L_0x0672:
            r2.A1b(r1)
            return
        L_0x0676:
            r3.A08()
            return
        L_0x067a:
            X.5YD r1 = r5.A09
            r0 = 7
            r1.A04(r0)
            X.5Um r4 = r5.A0A
            r3 = 0
            java.lang.ref.WeakReference r2 = X.AnonymousClass0x9.A14(r6)
            r1 = 0
            X.622 r0 = new X.622
            r0.<init>(r2)
            r4.A04(r6, r1, r0, r3)
            return
        L_0x0691:
            java.util.List r1 = r3.A1K
            java.util.List r0 = r3.A1L
            r1.addAll(r0)
            X.4Oi r0 = r3.A0q
            r0.notifyDataSetChanged()
            r3.A1H()
            android.widget.ListView r0 = r3.A04
            android.view.ViewTreeObserver r1 = r0.getViewTreeObserver()
            r0 = 7
            X.AnonymousClass6AE.A00(r1, r3, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C109495ei.onClick(android.view.View):void");
    }
}
