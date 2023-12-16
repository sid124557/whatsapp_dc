package X;

/* renamed from: X.5rQ  reason: invalid class name and case insensitive filesystem */
public class C117125rQ implements Runnable {
    public Object A00;
    public final int A01;

    public C117125rQ(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:118:0x02bd, code lost:
        X.C18280x3.A14(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x02c0, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:155:0x0346, code lost:
        if (r2 != Integer.MAX_VALUE) goto L_0x0349;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:172:0x03a1, code lost:
        if (r2 != null) goto L_0x03a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:208:0x0481, code lost:
        if (r1 != null) goto L_0x0483;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:210:0x0489, code lost:
        if (r0 == null) goto L_0x048b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:216:0x049f, code lost:
        if (r1 != null) goto L_0x04a1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:218:0x04a7, code lost:
        if (r0 != null) goto L_0x04a9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:219:0x04a9, code lost:
        r3.A04(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:220:0x04ac, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:253:0x0597, code lost:
        r1.A0I(java.lang.Integer.valueOf(r0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:254:0x059e, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:294:0x0659, code lost:
        r1.A0H(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:295:0x065c, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x020c, code lost:
        r1.BaR(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x020f, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x024c, code lost:
        if (r3.A00 == 3) goto L_0x024e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r9 = this;
            int r0 = r9.A01
            switch(r0) {
                case 0: goto L_0x05e7;
                case 1: goto L_0x05db;
                case 2: goto L_0x01f6;
                case 3: goto L_0x01cd;
                case 4: goto L_0x05cb;
                case 5: goto L_0x05bb;
                case 6: goto L_0x05af;
                case 7: goto L_0x05a7;
                case 8: goto L_0x059f;
                case 9: goto L_0x0590;
                case 10: goto L_0x0588;
                case 11: goto L_0x057c;
                case 12: goto L_0x0641;
                case 13: goto L_0x01a4;
                case 14: goto L_0x0537;
                case 15: goto L_0x0529;
                case 16: goto L_0x051c;
                case 17: goto L_0x04f9;
                case 18: goto L_0x04e8;
                case 19: goto L_0x04dd;
                case 20: goto L_0x04c0;
                case 21: goto L_0x04b3;
                case 22: goto L_0x040f;
                case 23: goto L_0x0175;
                case 24: goto L_0x0167;
                case 25: goto L_0x00f3;
                case 26: goto L_0x00d4;
                case 27: goto L_0x0403;
                case 28: goto L_0x03e9;
                case 29: goto L_0x00ba;
                case 30: goto L_0x03d3;
                case 31: goto L_0x038d;
                case 32: goto L_0x007b;
                case 33: goto L_0x0376;
                case 34: goto L_0x036e;
                case 35: goto L_0x005e;
                case 36: goto L_0x0030;
                case 37: goto L_0x035d;
                case 38: goto L_0x0355;
                case 39: goto L_0x034d;
                case 40: goto L_0x02cf;
                case 41: goto L_0x02c1;
                case 42: goto L_0x02a3;
                case 43: goto L_0x0282;
                case 44: goto L_0x025e;
                case 45: goto L_0x0240;
                case 46: goto L_0x021c;
                case 47: goto L_0x0210;
                case 48: goto L_0x0018;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r0 = r9.A00
            X.4xk r0 = (X.C97174xk) r0
            java.util.Set r1 = r0.A0F
            r0 = 0
            com.whatsapp.jid.UserJid[] r0 = new com.whatsapp.jid.UserJid[r0]
            java.lang.Object[] r0 = r1.toArray(r0)
            com.whatsapp.jid.UserJid[] r0 = (com.whatsapp.jid.UserJid[]) r0
            com.whatsapp.voipcalling.Voip.updateParticipantsRxSubscription(r0)
        L_0x0017:
            return
        L_0x0018:
            java.lang.Object r1 = r9.A00
            X.5HR r1 = (X.AnonymousClass5HR) r1
            X.4C6 r0 = r1.A01
            com.whatsapp.calling.avatar.viewmodel.CallAvatarViewModel r6 = r1.A00
            boolean r0 = X.AnonymousClass349.A04(r0)
            if (r0 == 0) goto L_0x0017
            java.lang.String r0 = "voip/CallAvatarViewModel/enableEffect Effect initialized"
            com.whatsapp.util.Log.d((java.lang.String) r0)
            X.5ZG r4 = r6.A08
            monitor-enter(r4)
            goto L_0x05f5
        L_0x0030:
            java.lang.Object r4 = r9.A00
            com.whatsapp.businessupsell.BusinessProfileEducation r4 = (com.whatsapp.businessupsell.BusinessProfileEducation) r4
            android.content.Intent r2 = r4.getIntent()
            java.lang.String r1 = "key_extra_verified_level"
            r0 = -1
            int r0 = r2.getIntExtra(r1, r0)
            r3 = 3
            boolean r0 = X.AnonymousClass000.A1U(r0, r3)
            if (r0 == 0) goto L_0x0017
            X.7SX r2 = r4.A02
            android.content.Intent r1 = r4.getIntent()
            java.lang.String r0 = "key_extra_business_jid"
            java.lang.String r1 = r1.getStringExtra(r0)
            r0 = 0
            X.C162457s7.A0J(r1, r0)
            java.lang.Integer r0 = X.C18280x3.A0S()
            r2.A00(r0, r1, r3, r3)
            return
        L_0x005e:
            java.lang.Object r2 = r9.A00
            X.5U8 r2 = (X.AnonymousClass5U8) r2
            r2.A00()
            boolean r0 = r2.A03()
            if (r0 == 0) goto L_0x0017
            X.4UC r1 = r2.A06
            r0 = 0
            X.C06270Wx.A04(r1, r0)
            android.os.Handler r3 = r2.A01
            java.lang.Runnable r2 = r2.A08
            r0 = 20000(0x4e20, double:9.8813E-320)
            r3.postDelayed(r2, r0)
            return
        L_0x007b:
            java.lang.Object r3 = r9.A00
            X.5Xb r3 = (X.C105955Xb) r3
            X.7WI r2 = r3.A05
            r2.A01()
            X.08M r1 = r3.A00
            java.util.List r0 = r2.A00()
            r1.A0G(r0)
            java.util.List r1 = r2.A00()
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x0017
            X.5iG r2 = r3.A04
            X.5Tn r0 = r3.A06
            java.lang.Integer r3 = r0.A03()
            java.lang.Integer r4 = X.AnonymousClass001.A0f()
            java.lang.Integer r1 = X.AnonymousClass0x9.A0l(r1)
            java.util.LinkedHashMap r5 = X.C18320x8.A0r()
            if (r1 == 0) goto L_0x00b2
            java.lang.String r0 = "recent_search_count"
            r5.put(r0, r1)
        L_0x00b2:
            r6 = 1
            r7 = 8
            r8 = 2
            r2.A09(r3, r4, r5, r6, r7, r8)
            return
        L_0x00ba:
            java.lang.Object r1 = r9.A00
            X.4i8 r1 = (X.C90724i8) r1
            X.4U8 r0 = r1.A74()
            X.4UC r0 = r0.A0b
            java.lang.Number r0 = X.C86654Ky.A0i(r0)
            if (r0 == 0) goto L_0x0017
            int r0 = r0.intValue()
            if (r0 != 0) goto L_0x0017
            r1.A75()
            return
        L_0x00d4:
            java.lang.Object r1 = r9.A00
            com.whatsapp.businessdirectory.view.activity.BusinessDirectoryMapViewActivity r1 = (com.whatsapp.businessdirectory.view.activity.BusinessDirectoryMapViewActivity) r1
            X.4U2 r0 = r1.A0N
            if (r0 != 0) goto L_0x00e1
            java.lang.RuntimeException r0 = X.C86604Kt.A0j()
            throw r0
        L_0x00e1:
            X.4UC r0 = r0.A0i
            java.lang.Number r0 = X.C86654Ky.A0i(r0)
            if (r0 == 0) goto L_0x0017
            int r0 = r0.intValue()
            if (r0 != 0) goto L_0x0017
            r1.A74()
            return
        L_0x00f3:
            java.lang.Object r0 = r9.A00
            X.8Tt r0 = (X.C174308Tt) r0
            com.whatsapp.businessdirectory.view.activity.BusinessDirectoryActivity r3 = r0.A00
            X.4zS r0 = r3.A05
            if (r0 == 0) goto L_0x0017
            X.5O3 r4 = r3.A03
            boolean r2 = r4.A02
            java.util.Locale r0 = java.util.Locale.getDefault()
            java.lang.String r0 = r0.getLanguage()
            java.lang.String r1 = "pt"
            boolean r0 = r0.equals(r1)
            if (r2 == r0) goto L_0x0125
            java.util.Locale r0 = java.util.Locale.getDefault()
            java.lang.String r0 = r0.getLanguage()
            boolean r0 = r0.equals(r1)
            r4.A02 = r0
            java.util.List r0 = r4.A00()
            r4.A01 = r0
        L_0x0125:
            java.util.List r1 = r4.A01
            int r0 = r4.A00
            java.lang.String r2 = X.AnonymousClass001.A0n(r1, r0)
            int r0 = r4.A00
            int r1 = r0 + 1
            java.util.List r0 = r4.A01
            int r0 = r0.size()
            int r1 = r1 % r0
            r4.A00 = r1
            java.lang.String r0 = X.C97904zS.A0H
            X.C97904zS.A0F = r0
            java.lang.String r0 = X.C97904zS.A0G
            X.C97904zS.A0H = r0
            X.C97904zS.A0G = r2
            X.4zS r1 = r3.A05
            androidx.appcompat.widget.SearchView r0 = r1.A06
            if (r0 == 0) goto L_0x0017
            androidx.appcompat.widget.SearchView$SearchAutoComplete r0 = r0.A0k
            boolean r0 = X.C86634Kw.A1X(r0)
            if (r0 == 0) goto L_0x0017
            android.animation.ObjectAnimator r0 = r1.A02
            r0.start()
            android.animation.ObjectAnimator r0 = r1.A03
            r0.start()
            android.animation.ObjectAnimator r0 = r1.A01
            r0.start()
            android.animation.ObjectAnimator r0 = r1.A00
            r0.start()
            return
        L_0x0167:
            java.lang.Object r1 = r9.A00
            X.5T3 r1 = (X.AnonymousClass5T3) r1
            boolean r0 = r1.A00
            if (r0 != 0) goto L_0x0017
            X.8nc r0 = r1.A03
            r0.BZM()
            return
        L_0x0175:
            java.lang.Object r0 = r9.A00
            X.5OI r0 = (X.AnonymousClass5OI) r0
            java.lang.ref.WeakReference r0 = r0.A00
            if (r0 == 0) goto L_0x0017
            java.lang.Object r1 = r0.get()
            X.8rQ r1 = (X.C184208rQ) r1
            if (r1 == 0) goto L_0x0017
            X.6B1 r1 = (X.AnonymousClass6B1) r1
            int r0 = r1.A02
            if (r0 == 0) goto L_0x0677
            java.lang.Object r5 = r1.A01
            com.whatsapp.businessdirectory.util.DirectoryGPSLocationManager r5 = (com.whatsapp.businessdirectory.util.DirectoryGPSLocationManager) r5
            r4 = 0
            java.lang.Object r3 = r1.A00
            X.3Wi r2 = r5.A06
            r1 = 20
            X.5sN r0 = new X.5sN
            r0.<init>(r5, r3, r4, r1)
            r2.A0S(r0)
            java.lang.String r0 = "Geocoding address timed out"
            r5.A05(r0)
            return
        L_0x01a4:
            java.lang.Object r3 = r9.A00
            X.1VS r3 = (X.AnonymousClass1VS) r3
            X.2qG r2 = r3.A04
            X.21j r1 = r2.A01()
            X.21j r0 = X.C372121j.IN_WAITLIST
            if (r1 != r0) goto L_0x0017
            r2.A04()
            X.21j r1 = r2.A01()
            X.21j r0 = X.C372121j.AI_AVAILABLE
            if (r1 != r0) goto L_0x0017
            X.2sS r0 = r3.A03
            X.2m4 r0 = r0.A01
            boolean r0 = r0.A01()
            if (r0 == 0) goto L_0x0017
            X.2Xc r0 = r3.A05
            r0.A00()
            return
        L_0x01cd:
            java.lang.Object r2 = r9.A00
            X.2oF r2 = (X.C54142oF) r2
            boolean r0 = r2.A0G
            if (r0 == 0) goto L_0x01de
            X.3Wi r1 = r2.A03
            android.app.Activity r0 = r2.A01
            X.4FU r0 = (X.AnonymousClass4FU) r0
            r1.A0K(r0)
        L_0x01de:
            boolean r0 = r2.A00
            if (r0 == 0) goto L_0x01ef
            X.1in r1 = r2.A08
            X.2Tn r0 = r2.A06
            com.whatsapp.jid.UserJid r0 = r0.A04
            java.util.List r0 = java.util.Collections.singletonList(r0)
            r1.A0C(r0)
        L_0x01ef:
            X.49C r1 = r2.A04
            if (r1 == 0) goto L_0x0017
            boolean r0 = r2.A00
            goto L_0x020c
        L_0x01f6:
            java.lang.Object r2 = r9.A00
            X.2oF r2 = (X.C54142oF) r2
            boolean r0 = r2.A0G
            if (r0 == 0) goto L_0x0207
            X.3Wi r1 = r2.A03
            android.app.Activity r0 = r2.A01
            X.4FU r0 = (X.AnonymousClass4FU) r0
            r1.A0K(r0)
        L_0x0207:
            X.49C r1 = r2.A04
            if (r1 == 0) goto L_0x0017
            r0 = 0
        L_0x020c:
            r1.BaR(r0)
            return
        L_0x0210:
            java.lang.Object r0 = r9.A00
            X.3SH r0 = (X.AnonymousClass3SH) r0
            X.5WT r1 = r0.A01
            java.util.List r0 = X.AnonymousClass5WT.A02
            r1.A00(r0)
            return
        L_0x021c:
            java.lang.Object r2 = r9.A00
            X.3SH r2 = (X.AnonymousClass3SH) r2
            X.5WT r1 = r2.A01
            java.util.List r0 = X.AnonymousClass5WT.A02
            r1.A00(r0)
            java.util.List r0 = X.AnonymousClass5WT.A01
            r1.A00(r0)
            X.5Mx r0 = r2.A00
            X.66R r0 = r0.A01
            android.content.SharedPreferences$Editor r1 = X.C18270x1.A04(r0)
            java.lang.String r0 = "pref_last_avatar_calling_use_time"
            android.content.SharedPreferences$Editor r1 = r1.remove(r0)
            java.lang.String r0 = "pref_last_upsell_banner_shown_time"
            X.C18270x1.A0g(r1, r0)
            return
        L_0x0240:
            java.lang.Object r3 = r9.A00
            X.5pi r3 = (X.C116085pi) r3
            boolean r0 = r3.A06
            if (r0 != 0) goto L_0x024e
            int r2 = r3.A00
            r0 = 3
            r1 = 0
            if (r2 != r0) goto L_0x024f
        L_0x024e:
            r1 = 1
        L_0x024f:
            r3.A06 = r1
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "voip/audio_route/rememberBluetoothState "
            r2.append(r0)
            r2.append(r1)
            goto L_0x02bd
        L_0x025e:
            java.lang.Object r5 = r9.A00
            X.5pi r5 = (X.C116085pi) r5
            int r1 = r5.A00
            r0 = 2
            r4 = 0
            boolean r3 = X.AnonymousClass001.A1X(r1, r0)
            com.whatsapp.voipcalling.CallInfo r2 = com.whatsapp.voipcalling.Voip.getCallInfo()
            if (r3 == 0) goto L_0x027c
            int r1 = r5.A00
            r0 = 3
            if (r1 != r0) goto L_0x027c
            boolean r0 = r5.A05
            if (r0 != 0) goto L_0x027c
            r5.A0B(r2, r4)
        L_0x027c:
            r0 = r3 ^ 1
            r5.A0C(r2, r0)
            return
        L_0x0282:
            java.lang.Object r5 = r9.A00
            X.5pi r5 = (X.C116085pi) r5
            int r0 = r5.A00
            r4 = 0
            r3 = 1
            if (r0 != r3) goto L_0x028d
            r3 = 0
        L_0x028d:
            com.whatsapp.voipcalling.CallInfo r2 = com.whatsapp.voipcalling.Voip.getCallInfo()
            if (r3 == 0) goto L_0x029f
            int r1 = r5.A00
            r0 = 3
            if (r1 != r0) goto L_0x029f
            boolean r0 = r5.A05
            if (r0 != 0) goto L_0x029f
            r5.A0B(r2, r4)
        L_0x029f:
            r5.A0C(r2, r3)
            return
        L_0x02a3:
            java.lang.Object r3 = r9.A00
            android.media.AudioManager r3 = (android.media.AudioManager) r3
            java.lang.Object r2 = X.C116085pi.A0K
            android.media.AudioManager$OnAudioFocusChangeListener r2 = (android.media.AudioManager.OnAudioFocusChangeListener) r2
            r1 = 0
            r0 = 2
            int r1 = r3.requestAudioFocus(r2, r1, r0)
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "result of audio focus for voice call: "
            r2.append(r0)
            r2.append(r1)
        L_0x02bd:
            X.C18280x3.A14(r2)
            return
        L_0x02c1:
            java.lang.Object r0 = r9.A00
            X.5kA r0 = (X.C112705kA) r0
            X.1ip r0 = r0.A01
            boolean r0 = r0.A0G()
            com.whatsapp.voipcalling.Voip.updateNetworkRestrictions(r0)
            return
        L_0x02cf:
            java.lang.Object r0 = r9.A00
            X.5kA r0 = (X.C112705kA) r0
            X.1ip r0 = r0.A01
            r4 = 1
            int r0 = r0.A08(r4)
            if (r0 != 0) goto L_0x02e1
            r4 = 3
        L_0x02dd:
            r3 = 2147483647(0x7fffffff, float:NaN)
            goto L_0x02e5
        L_0x02e1:
            if (r0 != r4) goto L_0x02dd
            r4 = 2
            goto L_0x02dd
        L_0x02e5:
            java.util.Enumeration r0 = java.net.NetworkInterface.getNetworkInterfaces()     // Catch:{ Exception -> 0x033d }
            java.util.ArrayList r1 = java.util.Collections.list(r0)     // Catch:{ Exception -> 0x033d }
            r0 = 3
            if (r4 == r0) goto L_0x0348
            java.util.Iterator r6 = r1.iterator()     // Catch:{ Exception -> 0x033d }
            r2 = 2147483647(0x7fffffff, float:NaN)
        L_0x02f7:
            boolean r0 = r6.hasNext()     // Catch:{ Exception -> 0x0342 }
            if (r0 == 0) goto L_0x0346
            java.lang.Object r5 = r6.next()     // Catch:{ Exception -> 0x0342 }
            java.net.NetworkInterface r5 = (java.net.NetworkInterface) r5     // Catch:{ Exception -> 0x0342 }
            boolean r0 = r5.isUp()     // Catch:{ Exception -> 0x0342 }
            if (r0 == 0) goto L_0x02f7
            boolean r0 = r5.isLoopback()     // Catch:{ Exception -> 0x0342 }
            if (r0 != 0) goto L_0x02f7
            boolean r0 = r5.isVirtual()     // Catch:{ Exception -> 0x0342 }
            if (r0 != 0) goto L_0x02f7
            java.lang.String r0 = r5.getName()     // Catch:{ Exception -> 0x0342 }
            if (r0 == 0) goto L_0x02f7
            java.lang.String r1 = r5.getName()     // Catch:{ Exception -> 0x0342 }
            java.util.Locale r0 = java.util.Locale.US     // Catch:{ Exception -> 0x0342 }
            java.lang.String r1 = r1.toLowerCase(r0)     // Catch:{ Exception -> 0x0342 }
            java.lang.String r0 = "wlan"
            boolean r0 = r1.startsWith(r0)     // Catch:{ Exception -> 0x0342 }
            if (r0 == 0) goto L_0x0331
            r0 = 2
            if (r4 == r0) goto L_0x0334
            goto L_0x02f7
        L_0x0331:
            r0 = 1
            if (r4 != r0) goto L_0x02f7
        L_0x0334:
            int r0 = r5.getMTU()     // Catch:{ Exception -> 0x0342 }
            int r2 = java.lang.Math.min(r2, r0)     // Catch:{ Exception -> 0x0342 }
            goto L_0x02f7
        L_0x033d:
            r0 = move-exception
            r2 = 2147483647(0x7fffffff, float:NaN)
            goto L_0x0343
        L_0x0342:
            r0 = move-exception
        L_0x0343:
            com.whatsapp.util.Log.e((java.lang.Throwable) r0)
        L_0x0346:
            if (r2 != r3) goto L_0x0349
        L_0x0348:
            r2 = 0
        L_0x0349:
            com.whatsapp.voipcalling.Voip.updateNetworkMedium(r4, r2)
            return
        L_0x034d:
            java.lang.Object r0 = r9.A00
            X.35O r0 = (X.AnonymousClass35O) r0
            X.AnonymousClass35O.A00(r0)
            return
        L_0x0355:
            java.lang.Object r0 = r9.A00
            X.35O r0 = (X.AnonymousClass35O) r0
            X.AnonymousClass35O.A01(r0)
            return
        L_0x035d:
            java.lang.Object r1 = r9.A00
            X.1Mr r1 = (X.C22341Mr) r1
            r0 = 0
            r1.A02 = r0
            r0 = 59000(0xe678, float:8.2677E-41)
            r1.A05(r0)
            r1.A0A()
            return
        L_0x036e:
            java.lang.Object r0 = r9.A00
            X.5U8 r0 = (X.AnonymousClass5U8) r0
            r0.A01()
            return
        L_0x0376:
            java.lang.Object r3 = r9.A00
            com.whatsapp.businessdirectory.viewmodel.BusinessDirectoryContextualSearchViewModel r3 = (com.whatsapp.businessdirectory.viewmodel.BusinessDirectoryContextualSearchViewModel) r3
            java.util.List r2 = r3.A0H()
            r1 = 1
            X.6lv r0 = new X.6lv
            r0.<init>(r1)
            r2.add(r0)
            X.08J r0 = r3.A0F
            r0.A0G(r2)
            return
        L_0x038d:
            java.lang.Object r4 = r9.A00
            X.4UB r4 = (X.AnonymousClass4UB) r4
            X.5Tn r3 = r4.A04
            X.5TO r1 = r4.A05
            X.5Up r0 = r3.A06
            boolean r0 = r0.A06()
            if (r0 != 0) goto L_0x03aa
            X.5ZO r2 = r3.A02()
        L_0x03a1:
            if (r2 == 0) goto L_0x03cf
        L_0x03a3:
            r4.A0M(r2)
            r4.A0L()
            return
        L_0x03aa:
            X.5ZO r2 = r3.A01()
            if (r2 != 0) goto L_0x03b4
            X.5ZO r2 = r1.A00()
        L_0x03b4:
            java.util.concurrent.atomic.AtomicBoolean r1 = r3.A07
            boolean r0 = r1.get()
            if (r0 != 0) goto L_0x03a1
            boolean r0 = r2.A0A()
            if (r0 == 0) goto L_0x03cb
            java.lang.String r0 = r2.A08
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x03cb
            goto L_0x03a3
        L_0x03cb:
            r0 = 1
            r1.set(r0)
        L_0x03cf:
            r4.A0K()
            return
        L_0x03d3:
            java.lang.Object r2 = r9.A00
            X.4UB r2 = (X.AnonymousClass4UB) r2
            r0 = 3
            r2.A00 = r0
            android.os.Handler r1 = r2.A02
            java.lang.Runnable r0 = r2.A0B
            r1.removeCallbacks(r0)
            X.6lz r0 = r2.A0J()
            r2.A0G(r0)
            return
        L_0x03e9:
            java.lang.Object r1 = r9.A00
            com.whatsapp.businessdirectory.view.activity.BusinessDirectorySERPMapViewActivity r1 = (com.whatsapp.businessdirectory.view.activity.BusinessDirectorySERPMapViewActivity) r1
            r0 = 0
            X.C162457s7.A0J(r1, r0)
            android.widget.ImageView r1 = r1.A00
            if (r1 != 0) goto L_0x03fc
            java.lang.String r0 = "myLocationBtn"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x03fc:
            r0 = 2131232906(0x7f08088a, float:1.8081934E38)
            r1.setImageResource(r0)
            return
        L_0x0403:
            java.lang.Object r1 = r9.A00
            com.whatsapp.businessdirectory.view.activity.BusinessDirectoryMapViewActivity r1 = (com.whatsapp.businessdirectory.view.activity.BusinessDirectoryMapViewActivity) r1
            r0 = 0
            X.C162457s7.A0J(r1, r0)
            r1.A75()
            return
        L_0x040f:
            java.lang.Object r3 = r9.A00
            com.whatsapp.businessdirectory.util.DirectoryGPSLocationManager r3 = (com.whatsapp.businessdirectory.util.DirectoryGPSLocationManager) r3
            java.lang.String r0 = "System location services LocationManager timed out"
            r3.A05(r0)
            X.6Qc r2 = r3.A01
            if (r2 == 0) goto L_0x0444
            r0 = 0
            X.7iN r1 = new X.7iN
            r1.<init>(r0)
            X.89R r0 = new X.89R
            r0.<init>(r2)
            r1.A01 = r0
            r0 = 2414(0x96e, float:3.383E-42)
            r1.A00 = r0
            X.7Sp r1 = r1.A00()
            r0 = 0
            com.google.android.gms.tasks.Task r4 = r2.A02(r1, r0)
            X.8Xt r2 = new X.8Xt
            r2.<init>(r3)
            r1 = 0
            X.93X r0 = new X.93X
            r0.<init>(r2, r1)
            r4.addOnSuccessListener(r0)
        L_0x0444:
            X.6Qc r2 = r3.A01
            if (r2 == 0) goto L_0x046b
            r0 = 0
            X.7iN r1 = new X.7iN
            r1.<init>(r0)
            X.89R r0 = new X.89R
            r0.<init>(r2)
            r1.A01 = r0
            r0 = 2414(0x96e, float:3.383E-42)
            r1.A00 = r0
            X.7Sp r1 = r1.A00()
            r0 = 0
            com.google.android.gms.tasks.Task r2 = r2.A02(r1, r0)
            r1 = 1
            X.91z r0 = new X.91z
            r0.<init>(r3, r1)
            r2.addOnFailureListener(r0)
        L_0x046b:
            X.5ZR r2 = r3.A0C
            java.lang.String r0 = "android.permission.ACCESS_FINE_LOCATION"
            int r0 = r2.A02(r0)
            if (r0 != 0) goto L_0x048b
            android.location.LocationManager r1 = r3.A00
            if (r1 != 0) goto L_0x0483
            X.33i r0 = r3.A0A
            android.location.LocationManager r1 = r0.A0F()
            r3.A00 = r1
            if (r1 == 0) goto L_0x048b
        L_0x0483:
            java.lang.String r0 = "gps"
            android.location.Location r0 = r1.getLastKnownLocation(r0)
            if (r0 != 0) goto L_0x04a9
        L_0x048b:
            java.lang.String r0 = "android.permission.ACCESS_COARSE_LOCATION"
            int r0 = r2.A02(r0)
            if (r0 != 0) goto L_0x04ad
            android.location.LocationManager r1 = r3.A00
            if (r1 != 0) goto L_0x04a1
            X.33i r0 = r3.A0A
            android.location.LocationManager r1 = r0.A0F()
            r3.A00 = r1
            if (r1 == 0) goto L_0x04ad
        L_0x04a1:
            java.lang.String r0 = "network"
            android.location.Location r0 = r1.getLastKnownLocation(r0)
            if (r0 == 0) goto L_0x04ad
        L_0x04a9:
            r3.A04(r0)
            return
        L_0x04ad:
            java.lang.String r0 = "Unable to fetch last known location from location services"
            r3.A05(r0)
            return
        L_0x04b3:
            java.lang.Object r1 = r9.A00
            com.whatsapp.businessdirectory.util.DirectoryGPSLocationManager r1 = (com.whatsapp.businessdirectory.util.DirectoryGPSLocationManager) r1
            r1.A02()
            java.lang.String r0 = "FusedLocationProvider timed out"
            r1.A05(r0)
            return
        L_0x04c0:
            java.lang.Object r0 = r9.A00
            X.67k r0 = (X.C1231767k) r0
            java.lang.Object r0 = r0.A00
            X.4hu r0 = (X.C90604hu) r0
            X.4Tr r5 = r0.A0H
            com.whatsapp.jid.UserJid r4 = r0.A0N
            java.lang.String r3 = r0.A0S
            int r1 = r0.A00
            r0 = -1
            boolean r2 = X.AnonymousClass001.A1X(r1, r0)
            X.5Y9 r1 = r5.A04
            int r0 = r5.A00
            r1.A02(r0, r4, r3, r2)
            return
        L_0x04dd:
            java.lang.Object r0 = r9.A00
            com.whatsapp.businessapisearch.view.fragment.BusinessApiHomeFragment r0 = (com.whatsapp.businessapisearch.view.fragment.BusinessApiHomeFragment) r0
            androidx.recyclerview.widget.RecyclerView r1 = r0.A00
            r0 = 0
            r1.A0Z(r0)
            return
        L_0x04e8:
            java.lang.Object r1 = r9.A00
            X.4CV r1 = (X.AnonymousClass4CV) r1
            r0 = 0
            X.C162457s7.A0J(r1, r0)
            com.whatsapp.bridge.wfs.ui.LinkedUsersActivity r1 = (com.whatsapp.bridge.wfs.ui.LinkedUsersActivity) r1
            r1.BjL()
            r1.A7L()
            return
        L_0x04f9:
            java.lang.Object r2 = r9.A00
            X.4CV r2 = (X.AnonymousClass4CV) r2
            r0 = 0
            X.C162457s7.A0J(r2, r0)
            com.whatsapp.bridge.wfs.ui.LinkedUsersActivity r2 = (com.whatsapp.bridge.wfs.ui.LinkedUsersActivity) r2
            X.5Mp r0 = r2.A01
            if (r0 == 0) goto L_0x0515
            X.5J0 r1 = r0.A01()
            X.C626936e.A06(r1)
            r0 = 1
            r1.A00 = r0
            r2.A7L()
            return
        L_0x0515:
            java.lang.String r0 = "wfsBridgeFactory"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x051c:
            java.lang.Object r0 = r9.A00
            X.4CV r0 = (X.AnonymousClass4CV) r0
            com.whatsapp.bridge.wfs.ui.LinkedUsersActivity r0 = (com.whatsapp.bridge.wfs.ui.LinkedUsersActivity) r0
            r0.BjL()
            r0.A7L()
            return
        L_0x0529:
            java.lang.Object r1 = r9.A00
            X.4CV r1 = (X.AnonymousClass4CV) r1
            android.content.Context r1 = (android.content.Context) r1
            android.content.Intent r0 = X.C627736r.A05(r1)
            r1.startActivity(r0)
            return
        L_0x0537:
            java.lang.Object r0 = r9.A00
            X.5lV r0 = (X.C113485lV) r0
            X.2xL r5 = r0.A03
            X.5jM r4 = new X.5jM
            r4.<init>(r0)
            X.2qG r0 = r5.A03
            X.21j r1 = r0.A01()
            X.21j r0 = X.C372121j.IN_WAITLIST
            if (r1 != r0) goto L_0x0576
            X.2sH r0 = r5.A04
            long r6 = r0.A0H()
            X.7KQ r0 = r5.A00
            X.33p r0 = r0.A00
            java.lang.String r1 = "bonsai_last_waitlist_update_ms"
            android.content.SharedPreferences r0 = X.AnonymousClass0x2.A0F(r0)
            long r2 = X.AnonymousClass0x2.A0B(r0, r1)
            X.1VX r1 = r5.A05
            r0 = 5413(0x1525, float:7.585E-42)
            long r0 = X.C56952sp.A04(r1, r0)
            long r2 = r2 + r0
            int r0 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r0 <= 0) goto L_0x0576
            java.lang.String r0 = "bonsaiwaitlistsyncmanager/sync"
            com.whatsapp.util.Log.d((java.lang.String) r0)
            r5.A01(r4)
            return
        L_0x0576:
            java.lang.String r0 = "bonsaiwaitlistsyncmanager/don't sync"
            com.whatsapp.util.Log.d((java.lang.String) r0)
            return
        L_0x057c:
            java.lang.Object r1 = r9.A00
            X.4GP r1 = (X.AnonymousClass4GP) r1
            r0 = 0
            X.C162457s7.A0J(r1, r0)
            r1.invoke()
            return
        L_0x0588:
            java.lang.Object r0 = r9.A00
            com.whatsapp.bonsai.embodiment.BotEmbodimentViewModel r0 = (com.whatsapp.bonsai.embodiment.BotEmbodimentViewModel) r0
            X.107 r1 = r0.A07
            r0 = 2
            goto L_0x0597
        L_0x0590:
            java.lang.Object r0 = r9.A00
            com.whatsapp.bonsai.embodiment.BotEmbodimentViewModel r0 = (com.whatsapp.bonsai.embodiment.BotEmbodimentViewModel) r0
            X.107 r1 = r0.A07
            r0 = 1
        L_0x0597:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.A0I(r0)
            return
        L_0x059f:
            java.lang.Object r0 = r9.A00
            com.whatsapp.bonsai.discovery.BonsaiDiscoveryViewModel r0 = (com.whatsapp.bonsai.discovery.BonsaiDiscoveryViewModel) r0
            r0.A0D()
            return
        L_0x05a7:
            java.lang.Object r0 = r9.A00
            X.33R r0 = (X.AnonymousClass33R) r0
            r0.A03()
            return
        L_0x05af:
            java.lang.Object r0 = r9.A00
            com.whatsapp.bonsai.BonsaiConversationTitleViewModel r0 = (com.whatsapp.bonsai.BonsaiConversationTitleViewModel) r0
            X.08M r1 = r0.A03
            X.57j r0 = X.C996257j.AI
            r1.A0H(r0)
            return
        L_0x05bb:
            java.lang.Object r0 = r9.A00
            X.4m9 r0 = (X.C92134m9) r0
            com.whatsapp.bonsai.BonsaiConversationTitleViewModel r1 = X.C89884fR.A00(r0)
            X.57i r0 = X.C996157i.END
            r1.A00 = r0
            r1.A0D()
            return
        L_0x05cb:
            java.lang.Object r0 = r9.A00
            com.whatsapp.blockui.BlockConfirmationDialogFragment r0 = (com.whatsapp.blockui.BlockConfirmationDialogFragment) r0
            X.2nM r2 = r0.A04
            java.lang.String r1 = "about-blocking-reporting"
            X.03q r0 = r0.A0R()
            r2.A01(r0, r1)
            return
        L_0x05db:
            java.lang.Object r0 = r9.A00
            X.2sq r0 = (X.C56962sq) r0
            X.1in r1 = r0.A0E
            X.3d3 r0 = X.C72023d3.A00
            r1.A0C(r0)
            return
        L_0x05e7:
            java.lang.Object r0 = r9.A00
            X.2sq r0 = (X.C56962sq) r0
            X.1v9 r1 = r0.A0C
            java.util.Set r0 = r0.A05()
            r1.A00(r0)
            return
        L_0x05f5:
            X.4sm r5 = r4.A01     // Catch:{ all -> 0x0674 }
            if (r5 != 0) goto L_0x05ff
            java.lang.String r0 = "CallAvatarLogger/onEffectInitialized No session"
            com.whatsapp.util.Log.d((java.lang.String) r0)     // Catch:{ all -> 0x0674 }
            goto L_0x063b
        L_0x05ff:
            X.594 r0 = X.AnonymousClass594.EFFECT_INITIALIZED     // Catch:{ all -> 0x0674 }
            boolean r0 = r4.A06(r0, r5)     // Catch:{ all -> 0x0674 }
            if (r0 != 0) goto L_0x060d
            java.lang.String r0 = "CallAvatarLogger/onEffectInitialized Session has unexpected fields"
            com.whatsapp.util.Log.d((java.lang.String) r0)     // Catch:{ all -> 0x0674 }
            goto L_0x063b
        L_0x060d:
            X.2sH r0 = r4.A02     // Catch:{ all -> 0x0674 }
            long r2 = r0.A0H()     // Catch:{ all -> 0x0674 }
            java.lang.Long r0 = r5.A0F     // Catch:{ all -> 0x0674 }
            if (r0 == 0) goto L_0x066a
            long r0 = r0.longValue()     // Catch:{ all -> 0x0674 }
            long r2 = r2 - r0
            java.lang.Long r0 = java.lang.Long.valueOf(r2)     // Catch:{ all -> 0x0674 }
            r5.A0E = r0     // Catch:{ all -> 0x0674 }
            if (r0 == 0) goto L_0x0665
            java.lang.Long r0 = r5.A0B     // Catch:{ all -> 0x0674 }
            if (r0 == 0) goto L_0x0660
            long r0 = r0.longValue()     // Catch:{ all -> 0x0674 }
            long r2 = r2 - r0
            java.lang.Long r0 = r5.A09     // Catch:{ all -> 0x0674 }
            if (r0 == 0) goto L_0x066f
            long r0 = r0.longValue()     // Catch:{ all -> 0x0674 }
            java.lang.Long r0 = X.C18310x6.A0f(r2, r0)     // Catch:{ all -> 0x0674 }
            r5.A0A = r0     // Catch:{ all -> 0x0674 }
        L_0x063b:
            monitor-exit(r4)
            X.107 r1 = r6.A0K
            X.4ix r0 = X.C91124ix.A00
            goto L_0x0659
        L_0x0641:
            java.lang.Object r2 = r9.A00
            X.4V1 r2 = (X.AnonymousClass4V1) r2
            X.107 r1 = r2.A0B
            boolean r0 = r2.A04
            if (r0 != 0) goto L_0x065d
            boolean r0 = r2.A03
            if (r0 != 0) goto L_0x065d
            java.lang.String r0 = r2.A01
            int r0 = r0.length()
            if (r0 > 0) goto L_0x065d
            java.util.List r0 = r2.A02
        L_0x0659:
            r1.A0H(r0)
            return
        L_0x065d:
            X.3d3 r0 = X.C72023d3.A00
            goto L_0x0659
        L_0x0660:
            java.lang.IllegalStateException r0 = X.C18290x4.A0Y()     // Catch:{ all -> 0x0674 }
            goto L_0x0673
        L_0x0665:
            java.lang.IllegalStateException r0 = X.C18290x4.A0Y()     // Catch:{ all -> 0x0674 }
            goto L_0x0673
        L_0x066a:
            java.lang.IllegalStateException r0 = X.C18290x4.A0Y()     // Catch:{ all -> 0x0674 }
            goto L_0x0673
        L_0x066f:
            java.lang.IllegalStateException r0 = X.C18290x4.A0Y()     // Catch:{ all -> 0x0674 }
        L_0x0673:
            throw r0     // Catch:{ all -> 0x0674 }
        L_0x0674:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        L_0x0677:
            java.lang.Object r1 = r1.A01
            X.5TO r1 = (X.AnonymousClass5TO) r1
            X.5ZI r0 = r1.A0C
            r0.A03()
            X.2qk r3 = r1.A01
            java.lang.String r2 = "Approx location could not be generated"
            r1 = 0
            java.lang.String r0 = "directory_geocoder_timed_out"
            r3.A0A(r0, r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C117125rQ.run():void");
    }
}
