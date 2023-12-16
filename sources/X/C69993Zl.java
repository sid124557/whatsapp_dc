package X;

/* renamed from: X.3Zl  reason: invalid class name and case insensitive filesystem */
public class C69993Zl implements Runnable {
    public Object A00;
    public final int A01;

    public C69993Zl(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public static void A00(AnonymousClass4FS r1, Object obj, int i) {
        r1.BkM(new C69993Zl(obj, i));
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:199|200|201) */
    /* JADX WARNING: Code restructure failed: missing block: B:187:0x0446, code lost:
        r6 = r3.A00;
        r2 = r7.A02;
        r5 = r2.A06(r6.BDW());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:188:0x0452, code lost:
        if (r5 != null) goto L_0x0461;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:190:?, code lost:
        r4 = r6.BJk();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:191:0x0459, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:192:0x045a, code lost:
        com.whatsapp.util.Log.e("mediathumbloader/bitmapLoader error ", r1);
        r4 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:193:0x0461, code lost:
        r4 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:287:0x05fb, code lost:
        r4.A04(new X.C69993Zl(r5, r1), r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:288:0x0603, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:299:0x067c, code lost:
        r0.apply();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:300:0x067f, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:305:0x0693, code lost:
        r1.A0D(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:306:0x0696, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0158, code lost:
        r3.postDelayed(new X.C69993Zl(r4, r0), (long) (((float) 300) * r4.A01()));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0169, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x018d, code lost:
        r1.A00 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x018f, code lost:
        return;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:201:0x048a */
    /* JADX WARNING: Removed duplicated region for block: B:151:0x034e A[LOOP:3: B:149:0x0348->B:151:0x034e, LOOP_END] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r11 = this;
            int r0 = r11.A01
            switch(r0) {
                case 0: goto L_0x06ac;
                case 1: goto L_0x0697;
                case 2: goto L_0x0005;
                case 3: goto L_0x0005;
                case 4: goto L_0x0005;
                case 5: goto L_0x0197;
                case 6: goto L_0x0144;
                case 7: goto L_0x068e;
                case 8: goto L_0x0135;
                case 9: goto L_0x0686;
                case 10: goto L_0x0686;
                case 11: goto L_0x0126;
                case 12: goto L_0x0114;
                case 13: goto L_0x00fd;
                case 14: goto L_0x00de;
                case 15: goto L_0x0680;
                case 16: goto L_0x0665;
                case 17: goto L_0x065d;
                case 18: goto L_0x064c;
                case 19: goto L_0x00af;
                case 20: goto L_0x0097;
                case 21: goto L_0x0604;
                case 22: goto L_0x0080;
                case 23: goto L_0x005a;
                case 24: goto L_0x05bc;
                case 25: goto L_0x055e;
                case 26: goto L_0x0555;
                case 27: goto L_0x0530;
                case 28: goto L_0x0527;
                case 29: goto L_0x04ae;
                case 30: goto L_0x04a6;
                case 31: goto L_0x04a6;
                case 32: goto L_0x0498;
                case 33: goto L_0x0490;
                case 34: goto L_0x0426;
                case 35: goto L_0x0418;
                case 36: goto L_0x002b;
                case 37: goto L_0x000d;
                case 38: goto L_0x0410;
                case 39: goto L_0x03fc;
                case 40: goto L_0x03e3;
                case 41: goto L_0x03d9;
                case 42: goto L_0x03b8;
                case 43: goto L_0x03b0;
                case 44: goto L_0x0272;
                case 45: goto L_0x022d;
                case 46: goto L_0x01e4;
                case 47: goto L_0x01d3;
                case 48: goto L_0x01c1;
                case 49: goto L_0x01b9;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r0 = r11.A00
            androidx.fragment.app.DialogFragment r0 = (androidx.fragment.app.DialogFragment) r0
            r0.A1K()
        L_0x000c:
            return
        L_0x000d:
            java.lang.Object r2 = r11.A00
            com.whatsapp.gifsearch.GifSearchContainer r2 = (com.whatsapp.gifsearch.GifSearchContainer) r2
            java.lang.CharSequence r0 = r2.A0K
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = r2.A0L
            boolean r0 = X.C162457s7.A0P(r1, r0)
            if (r0 != 0) goto L_0x000c
            int r0 = r2.getVisibility()
            if (r0 != 0) goto L_0x000c
            java.lang.CharSequence r0 = r2.A0K
            r2.A02(r0)
            return
        L_0x002b:
            java.lang.Object r2 = r11.A00
            X.1sW r2 = (X.C33151sW) r2
            X.C626936e.A00()
            java.io.File r5 = r2.A05()
            if (r5 == 0) goto L_0x000c
            X.1Mq r0 = r2.A06
            X.0zQ r0 = r0.A02
            java.util.Map r0 = r0.A06()
            java.util.ArrayList r3 = X.C18290x4.A0z(r0)
            java.util.Iterator r1 = X.AnonymousClass001.A0v(r0)
        L_0x0048:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x06b6
            java.lang.Object r0 = r1.next()
            X.2Jq r0 = (X.C41282Jq) r0
            java.lang.Object r0 = r0.A01
            r3.add(r0)
            goto L_0x0048
        L_0x005a:
            java.lang.Object r3 = r11.A00
            X.3Mn r3 = (X.C66723Mn) r3
            X.33p r0 = r3.A0D
            r2 = 1
            android.content.SharedPreferences$Editor r1 = X.C18270x1.A03(r0)
            java.lang.String r0 = "wam_is_current_buffer_real_time"
            X.C18270x1.A0l(r1, r0, r2)
            boolean r0 = r3.A09()
            if (r0 == 0) goto L_0x000c
            X.8qC r0 = r3.A08
            java.lang.Object r2 = r0.get()
            X.4Ct r2 = (X.C84544Ct) r2
            X.2rX r1 = r3.A01
            r0 = 0
            r2.BlE(r1, r0)
            return
        L_0x0080:
            java.lang.Object r2 = r11.A00
            X.2sp r2 = (X.C56952sp) r2
            X.4FV r1 = r2.A02
            if (r1 == 0) goto L_0x000c
            X.1Vd r0 = new X.1Vd
            r0.<init>()
            r1.BhD(r0)
            X.4FV r1 = r2.A02
            r0 = 1
            r1.BlF(r0)
            return
        L_0x0097:
            java.lang.Object r5 = r11.A00
            X.1Us r5 = (X.AnonymousClass1Us) r5
            java.lang.String r0 = r5.A02
            java.util.Map r4 = X.C1452674v.A00(r0)
            if (r4 == 0) goto L_0x000c
            X.2xG r3 = r5.A00
            java.lang.String r2 = r5.A04
            java.lang.String r1 = r5.A05
            java.lang.String r0 = r5.A03
            r3.A01(r2, r1, r0, r4)
            return
        L_0x00af:
            java.lang.Object r4 = r11.A00
            com.whatsapp.extensions.webview.WaFlowsWebViewBottomsheetModalActivity r4 = (com.whatsapp.extensions.webview.WaFlowsWebViewBottomsheetModalActivity) r4
            X.1VX r2 = r4.A0D
            r1 = 6715(0x1a3b, float:9.41E-42)
            X.2vE r0 = X.C58422vE.A02
            boolean r0 = r2.A0Y(r0, r1)
            if (r0 == 0) goto L_0x000c
            X.5Yw r2 = X.C95814uZ.A00
            android.content.Intent r1 = r4.getIntent()
            java.lang.String r0 = "chat_id"
            java.lang.String r0 = r1.getStringExtra(r0)
            X.4uZ r3 = r2.A05(r0)
            boolean r2 = r3 instanceof X.C95804uY
            X.30V r1 = r4.A00
            if (r1 == 0) goto L_0x0743
            r0 = 4
            if (r2 == 0) goto L_0x00da
            r0 = 26
        L_0x00da:
            r1.A03(r3, r0)
            return
        L_0x00de:
            java.lang.Object r4 = r11.A00
            X.5YE r4 = (X.AnonymousClass5YE) r4
            r4.A06()
            boolean r0 = r4.A0E()
            if (r0 == 0) goto L_0x00f6
            X.4TE r1 = r4.A0G
            if (r1 == 0) goto L_0x00f6
            X.3uH r0 = new X.3uH
            r0.<init>(r4)
            goto L_0x018d
        L_0x00f6:
            com.whatsapp.KeyboardPopupLayout r3 = r4.A09
            if (r3 == 0) goto L_0x000c
            r0 = 13
            goto L_0x0158
        L_0x00fd:
            java.lang.Object r2 = r11.A00
            X.5YE r2 = (X.AnonymousClass5YE) r2
            com.google.android.material.bottomsheet.BottomSheetBehavior r0 = r2.A07
            if (r0 == 0) goto L_0x000c
            int r1 = r0.A0O
            com.whatsapp.expressionstray.conversation.ExpressionsBottomSheetView r0 = r2.A0F
            if (r0 == 0) goto L_0x010e
            r0.A0C(r1)
        L_0x010e:
            com.whatsapp.expressionstray.conversation.ExpressionsBottomSheetView r0 = r2.A0F
            r2.A0B(r0)
            return
        L_0x0114:
            java.lang.Object r2 = r11.A00
            X.5YE r2 = (X.AnonymousClass5YE) r2
            com.google.android.material.bottomsheet.BottomSheetBehavior r0 = r2.A07
            if (r0 == 0) goto L_0x000c
            int r1 = r0.A0O
            com.whatsapp.expressionstray.conversation.ExpressionsBottomSheetView r0 = r2.A0F
            if (r0 == 0) goto L_0x000c
            r0.A0C(r1)
            return
        L_0x0126:
            java.lang.Object r0 = r11.A00
            X.5YE r0 = (X.AnonymousClass5YE) r0
            com.whatsapp.KeyboardPopupLayout r1 = r0.A09
            if (r1 == 0) goto L_0x000c
            r0 = 0
            r1.A07 = r0
            r1.requestLayout()
            return
        L_0x0135:
            java.lang.Object r1 = r11.A00
            X.5YE r1 = (X.AnonymousClass5YE) r1
            r0 = 0
            r1.A0L = r0
            boolean r0 = r1.A0H
            if (r0 != 0) goto L_0x000c
            r1.A08()
            return
        L_0x0144:
            java.lang.Object r4 = r11.A00
            X.5YE r4 = (X.AnonymousClass5YE) r4
            com.whatsapp.KeyboardPopupLayout r0 = r4.A09
            if (r0 == 0) goto L_0x016a
            boolean r0 = X.C105895Wv.A00(r0)
            if (r0 == 0) goto L_0x016a
            com.whatsapp.KeyboardPopupLayout r3 = r4.A09
            if (r3 == 0) goto L_0x000c
            r0 = 9
        L_0x0158:
            X.3Zl r2 = new X.3Zl
            r2.<init>(r4, r0)
            r0 = 300(0x12c, float:4.2E-43)
            float r1 = (float) r0
            float r0 = r4.A01()
            float r1 = r1 * r0
            long r0 = (long) r1
            r3.postDelayed(r2, r0)
            return
        L_0x016a:
            com.whatsapp.WaEditText r0 = r4.A0A
            if (r0 == 0) goto L_0x0171
            r0.A06()
        L_0x0171:
            boolean r0 = r4.A0E()
            if (r0 == 0) goto L_0x0190
            X.4TE r0 = r4.A0G
            if (r0 == 0) goto L_0x0190
            float r1 = r4.A01()
            r0 = 0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 == 0) goto L_0x0190
            X.4TE r1 = r4.A0G
            if (r1 == 0) goto L_0x000c
            X.3uI r0 = new X.3uI
            r0.<init>(r4)
        L_0x018d:
            r1.A00 = r0
            return
        L_0x0190:
            com.whatsapp.KeyboardPopupLayout r3 = r4.A09
            if (r3 == 0) goto L_0x000c
            r0 = 10
            goto L_0x0158
        L_0x0197:
            java.lang.Object r1 = r11.A00
            X.2pb r1 = (X.C54982pb) r1
            X.2sr r0 = r1.A00
            com.whatsapp.jid.PhoneUserJid r2 = X.C56972sr.A04(r0)
            if (r2 == 0) goto L_0x000c
            X.1in r0 = r1.A06
            java.util.Iterator r1 = X.C61102zi.A03(r0)
        L_0x01a9:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x000c
            java.lang.Object r0 = r1.next()
            X.2sG r0 = (X.C56602sG) r0
            r0.A07(r2)
            goto L_0x01a9
        L_0x01b9:
            java.lang.Object r0 = r11.A00
            com.whatsapp.group.GroupChatInfoActivity r0 = (com.whatsapp.group.GroupChatInfoActivity) r0
            r0.A7U()
            return
        L_0x01c1:
            java.lang.Object r0 = r11.A00
            X.4Hw r0 = (X.C85854Hw) r0
            java.lang.Object r0 = r0.A00
            com.whatsapp.group.GroupChatInfoActivity r0 = (com.whatsapp.group.GroupChatInfoActivity) r0
            X.2iC r2 = r0.A0Q
            X.1fJ r1 = r0.A1h
            X.21R r0 = X.AnonymousClass21R.CONTACT_INFO
            r2.A00(r1, r0)
            return
        L_0x01d3:
            java.lang.Object r0 = r11.A00
            X.4IC r0 = (X.AnonymousClass4IC) r0
            java.lang.Object r0 = r0.A00
            com.whatsapp.group.GroupChatInfoActivity r0 = (com.whatsapp.group.GroupChatInfoActivity) r0
            r0.A7Q()
            X.5XG r0 = r0.A0g
            r0.A00()
            return
        L_0x01e4:
            java.lang.Object r6 = r11.A00
            com.whatsapp.group.GroupChatInfoActivity r6 = (com.whatsapp.group.GroupChatInfoActivity) r6
            X.33h r1 = r6.A17
            X.1fJ r0 = r6.A1h
            X.33k r2 = r1.A07(r0)
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "GroupChatInfoActivity/onCreate call getParticipantsUserHash for group of size: "
            r1.append(r0)
            java.util.Map r0 = r2.A09
            int r0 = r0.size()
            X.C18260x0.A1F(r1, r0)
            java.lang.String r5 = r2.A0C()
            X.3Lr r4 = r6.A1Y
            X.1fJ r3 = r6.A1h
            X.5ZU r2 = r6.A0t
            X.3ZH r1 = r6.A19
            r0 = -1
            boolean r0 = r2.A0e(r1, r0)
            if (r0 != 0) goto L_0x022b
            X.3ZH r0 = r6.A19
            java.lang.String r0 = r0.A0V
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x022b
            java.lang.String r2 = "interactive"
        L_0x0221:
            r1 = 0
            X.334 r0 = new X.334
            r0.<init>(r2, r1, r5)
            r4.A08(r0, r3)
            return
        L_0x022b:
            r2 = 0
            goto L_0x0221
        L_0x022d:
            java.lang.Object r4 = r11.A00
            com.whatsapp.group.GroupChatInfoActivity r4 = (com.whatsapp.group.GroupChatInfoActivity) r4
            X.3Lq r6 = r4.A1T
            X.1fJ r5 = r4.A7G()
            r3 = 0
            if (r5 == 0) goto L_0x0265
            X.2so r0 = r6.A0A
            X.1fJ r2 = r0.A01(r5)
            X.2rN r0 = r6.A1B
            boolean r0 = r0.A01()
            if (r0 == 0) goto L_0x0265
            X.2ss r0 = r6.A0S
            int r1 = r0.A06(r5)
            r0 = 2
            if (r1 == r0) goto L_0x0254
            r0 = 6
            if (r1 != r0) goto L_0x0265
        L_0x0254:
            if (r2 == 0) goto L_0x0265
            X.2sj r1 = r6.A0b
            boolean r0 = r1.A0D(r2)
            if (r0 != 0) goto L_0x0264
            boolean r0 = r1.A0D(r5)
            if (r0 == 0) goto L_0x0265
        L_0x0264:
            r3 = 1
        L_0x0265:
            X.3Wi r2 = r4.A05
            r1 = 38
            X.3cX r0 = new X.3cX
            r0.<init>((int) r1, (java.lang.Object) r4, (boolean) r3)
            r2.A0S(r0)
            return
        L_0x0272:
            java.lang.Object r6 = r11.A00
            X.11N r6 = (X.AnonymousClass11N) r6
            X.3Ex r0 = r6.A0L
            X.1fJ r7 = r6.A03
            X.3ZH r0 = r0.A0A(r7)
            r6.A02 = r0
            X.2sj r5 = r6.A0R
            X.1fJ r0 = X.AnonymousClass34R.A01(r7)
            int r0 = r5.A02(r0)
            int r1 = r0 + -1
            X.33h r2 = r5.A09
            int r0 = r2.A03(r7)
            int r1 = r1 - r0
            r6.A01 = r1
            X.2oj r0 = r6.A0Q
            int r0 = r0.A00(r7)
            r6.A00 = r0
            X.2rN r0 = r6.A0e
            boolean r1 = r0.A05(r7)
            X.08M r0 = r6.A07
            java.lang.Boolean r1 = X.C18320x8.A0V(r1)
            r0.A0G(r1)
            X.08M r0 = r6.A0H
            r3 = 1
            r0.A0G(r1)
            X.08M r1 = r6.A0F
            X.3Lq r0 = r6.A0V
            boolean r0 = r0.A0g(r7)
            X.C06270Wx.A05(r1, r0)
            X.08M r8 = r6.A0E
            X.2eb r1 = r6.A0b
            X.3ZH r9 = r6.A02
            r0 = 0
            X.C162457s7.A0J(r9, r0)
            X.1VX r1 = r1.A00
            r0 = 3695(0xe6f, float:5.178E-42)
            X.2vE r4 = X.C58422vE.A02
            boolean r0 = r1.A0Y(r4, r0)
            if (r0 == 0) goto L_0x035a
            boolean r0 = r9.A0e
            if (r0 != 0) goto L_0x035a
            boolean r0 = r9.A0q
            if (r0 != 0) goto L_0x02e3
            r0 = 3696(0xe70, float:5.179E-42)
            boolean r0 = r1.A0Y(r4, r0)
            if (r0 == 0) goto L_0x035a
        L_0x02e3:
            r0 = 1
        L_0x02e4:
            X.C06270Wx.A05(r8, r0)
            X.08M r1 = r6.A0C
            X.3ZH r0 = r6.A02
            boolean r0 = X.AnonymousClass31Y.A02(r0)
            X.C06270Wx.A05(r1, r0)
            X.08M r1 = r6.A0B
            X.3ZH r0 = r6.A02
            boolean r0 = r0.A13
            X.C06270Wx.A05(r1, r0)
            X.08M r9 = r6.A05
            X.2ss r0 = r6.A0O
            int r1 = r0.A06(r7)
            r0 = 3
            if (r1 == r0) goto L_0x0358
            boolean r0 = r5.A0D(r7)
            if (r0 == 0) goto L_0x0358
            X.8Nf r10 = X.C620533h.A01(r2, r7)
        L_0x0310:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L_0x0358
            X.2zG r8 = X.C18320x8.A0G(r10)
            X.2sr r1 = r6.A0J
            com.whatsapp.jid.UserJid r0 = r8.A03
            boolean r0 = r1.A0a(r0)
            if (r0 != 0) goto L_0x0310
            int r1 = r8.A01
            r0 = 2
            if (r1 == r0) goto L_0x0310
            r0 = 1
        L_0x032a:
            X.C06270Wx.A05(r9, r0)
            X.08M r1 = r6.A0D
            X.3ZH r0 = r6.A02
            boolean r0 = r0.A0q
            X.C06270Wx.A05(r1, r0)
            X.08M r9 = r6.A04
            X.33k r0 = r2.A07(r7)
            java.util.ArrayList r0 = r0.A0D()
            java.util.ArrayList r10 = X.AnonymousClass001.A0s()
            java.util.Iterator r1 = r0.iterator()
        L_0x0348:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x035c
            X.2zG r0 = X.C18320x8.A0G(r1)
            com.whatsapp.jid.UserJid r0 = r0.A03
            r10.add(r0)
            goto L_0x0348
        L_0x0358:
            r0 = 0
            goto L_0x032a
        L_0x035a:
            r0 = 0
            goto L_0x02e4
        L_0x035c:
            X.5ZU r8 = r6.A0M
            java.util.HashSet r2 = X.AnonymousClass002.A0K()
            boolean r1 = r8.A0g(r10, r2)
            r0 = -1
            java.util.List r0 = r8.A0Z(r2, r0, r1)
            r9.A0G(r0)
            X.08M r1 = r6.A0G
            X.3ZH r0 = r6.A02
            boolean r0 = r0.A0e
            r0 = r0 ^ 1
            X.C06270Wx.A05(r1, r0)
            X.08M r1 = r6.A06
            X.3ZH r0 = r6.A02
            boolean r0 = r0.A14
            r0 = r0 ^ 1
            X.C06270Wx.A05(r1, r0)
            X.08M r1 = r6.A0A
            X.3ZH r0 = r6.A02
            boolean r0 = r0.A0j
            r0 = r0 ^ 1
            X.C06270Wx.A05(r1, r0)
            X.08M r1 = r6.A08
            X.3ZH r0 = r6.A02
            boolean r0 = r0.A0i
            X.C06270Wx.A05(r1, r0)
            X.08M r2 = r6.A09
            boolean r0 = r5.A0D(r7)
            if (r0 == 0) goto L_0x03ae
            X.1VX r1 = r6.A0S
            r0 = 5191(0x1447, float:7.274E-42)
            boolean r0 = r1.A0Y(r4, r0)
            if (r0 == 0) goto L_0x03ae
        L_0x03aa:
            X.C06270Wx.A05(r2, r3)
            return
        L_0x03ae:
            r3 = 0
            goto L_0x03aa
        L_0x03b0:
            java.lang.Object r0 = r11.A00
            X.4GP r0 = (X.AnonymousClass4GP) r0
            r0.invoke()
            return
        L_0x03b8:
            java.lang.Object r1 = r11.A00
            X.2dW r1 = (X.C47602dW) r1
            X.4ea r0 = r1.A05
            android.view.View r2 = r0.A00
            X.C162457s7.A0D(r2)
            android.content.Context r0 = r1.A03
            android.content.res.Resources r1 = r0.getResources()
            r0 = 2131891662(0x7f1215ce, float:1.941805E38)
            java.lang.String r1 = r1.getString(r0)
            r0 = -1
            X.4ab r0 = X.C88694ab.A01(r2, r1, r0)
            r0.A05()
            return
        L_0x03d9:
            java.lang.Object r0 = r11.A00
            X.2dW r0 = (X.C47602dW) r0
            X.3Wi r0 = r0.A06
            r0.A0D()
            return
        L_0x03e3:
            java.lang.Object r1 = r11.A00
            android.os.Looper.prepare()
            android.os.Handler r3 = new android.os.Handler
            r3.<init>()
            r0 = 0
            X.3Zx r2 = new X.3Zx
            r2.<init>(r1, r0, r3)
            r0 = 30000(0x7530, double:1.4822E-319)
            r3.postDelayed(r2, r0)
            android.os.Looper.loop()
            return
        L_0x03fc:
            java.lang.Object r0 = r11.A00
            X.6pr r0 = (X.C138156pr) r0
            X.8E7 r0 = r0.A01
            X.8rk r3 = r0.A04
            r2 = 0
            r0 = 3
            X.7T4 r1 = new X.7T4
            r1.<init>(r2, r2, r0)
            r0 = 1
            r3.BSO(r1, r0)
            return
        L_0x0410:
            java.lang.Object r0 = r11.A00
            android.view.View r0 = (android.view.View) r0
            r0.requestLayout()
            return
        L_0x0418:
            java.lang.Object r0 = r11.A00
            X.2OC r0 = (X.AnonymousClass2OC) r0
            java.lang.String r0 = r0.A00
            java.io.File r0 = X.AnonymousClass002.A0B(r0)
            X.C627536m.A0O(r0)
            return
        L_0x0426:
            r0 = 10
            android.os.Process.setThreadPriority(r0)
        L_0x042b:
            java.lang.Object r7 = r11.A00
            X.2nB r7 = (X.C53492nB) r7
            java.util.ArrayList r1 = r7.A05
            monitor-enter(r1)
            boolean r0 = r7.A00     // Catch:{ all -> 0x048d }
            if (r0 == 0) goto L_0x0438
            monitor-exit(r1)     // Catch:{ all -> 0x048d }
            goto L_0x048c
        L_0x0438:
            boolean r0 = r1.isEmpty()     // Catch:{ all -> 0x048d }
            if (r0 != 0) goto L_0x0487
            r0 = 0
            java.lang.Object r3 = r1.remove(r0)     // Catch:{ all -> 0x048d }
            X.2Kx r3 = (X.C41612Kx) r3     // Catch:{ all -> 0x048d }
            monitor-exit(r1)     // Catch:{ all -> 0x048d }
            X.4Cx r6 = r3.A00
            X.1sU r2 = r7.A02
            java.lang.String r0 = r6.BDW()
            java.lang.Object r5 = r2.A06(r0)
            if (r5 != 0) goto L_0x0461
            android.graphics.Bitmap r4 = r6.BJk()     // Catch:{ Exception -> 0x0459 }
            goto L_0x0462
        L_0x0459:
            r1 = move-exception
            java.lang.String r0 = "mediathumbloader/bitmapLoader error "
            com.whatsapp.util.Log.e(r0, r1)
            r4 = 0
            goto L_0x0462
        L_0x0461:
            r4 = r5
        L_0x0462:
            X.4EM r3 = r3.A01
            if (r4 == 0) goto L_0x047a
            java.lang.String r0 = r6.BDW()
            r2.A09(r0, r4)
            android.os.Handler r2 = r7.A01
            r0 = 24
            X.3aL r1 = new X.3aL
            r1.<init>(r3, r4, r5, r0)
        L_0x0476:
            r2.post(r1)
            goto L_0x042b
        L_0x047a:
            android.os.Handler r2 = r7.A01
            java.util.Objects.requireNonNull(r3)
            r0 = 33
            X.3Zl r1 = new X.3Zl
            r1.<init>(r3, r0)
            goto L_0x0476
        L_0x0487:
            r1.wait()     // Catch:{ InterruptedException -> 0x048a }
        L_0x048a:
            monitor-exit(r1)     // Catch:{ all -> 0x048d }
            goto L_0x042b
        L_0x048c:
            return
        L_0x048d:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x048d }
            throw r0
        L_0x0490:
            java.lang.Object r0 = r11.A00
            X.4EM r0 = (X.AnonymousClass4EM) r0
            r0.BSk()
            return
        L_0x0498:
            java.lang.Object r1 = r11.A00
            com.whatsapp.gallerypicker.MediaPickerFragment r1 = (com.whatsapp.gallerypicker.MediaPickerFragment) r1
            java.util.HashSet r0 = r1.A0L
            int r0 = r0.size()
            r1.A1R(r0)
            return
        L_0x04a6:
            java.lang.Object r0 = r11.A00
            com.whatsapp.gallery.MediaGalleryFragmentBase r0 = (com.whatsapp.gallery.MediaGalleryFragmentBase) r0
            r0.A1P()
            return
        L_0x04ae:
            java.lang.Object r8 = r11.A00
            X.2as r8 = (X.C45972as) r8
            java.util.concurrent.locks.Lock r7 = r8.A03
            r7.lock()
            boolean r0 = r8.A00     // Catch:{ all -> 0x0522 }
            if (r0 != 0) goto L_0x051e
            X.2gw r1 = r8.A01     // Catch:{ all -> 0x0522 }
            java.io.File r3 = r1.A03     // Catch:{ all -> 0x0522 }
            boolean r0 = r3.exists()     // Catch:{ all -> 0x0522 }
            if (r0 == 0) goto L_0x051e
            r7.lock()     // Catch:{ all -> 0x0522 }
            r0 = 1
            r8.A00 = r0     // Catch:{ all -> 0x0522 }
            r1.A01()     // Catch:{ all -> 0x0522 }
            r6 = 0
            java.io.File[] r9 = r3.listFiles()     // Catch:{ OutOfMemoryError -> 0x0503 }
            if (r9 == 0) goto L_0x0511
            monitor-enter(r1)     // Catch:{ all -> 0x0517 }
            java.io.File r5 = r1.A00     // Catch:{ all -> 0x0500 }
            monitor-exit(r1)     // Catch:{ all -> 0x0517 }
            int r4 = r9.length     // Catch:{ all -> 0x0517 }
            r3 = 0
        L_0x04db:
            if (r3 >= r4) goto L_0x0511
            r2 = r9[r3]     // Catch:{ all -> 0x0517 }
            if (r5 == 0) goto L_0x04ef
            java.lang.String r1 = r2.getName()     // Catch:{ all -> 0x0517 }
            java.lang.String r0 = r5.getName()     // Catch:{ all -> 0x0517 }
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x0517 }
            if (r0 != 0) goto L_0x04f8
        L_0x04ef:
            r7.unlock()     // Catch:{ all -> 0x0517 }
            X.C627536m.A0P(r2)     // Catch:{ all -> 0x04fb }
            r7.lock()     // Catch:{ all -> 0x0517 }
        L_0x04f8:
            int r3 = r3 + 1
            goto L_0x04db
        L_0x04fb:
            r0 = move-exception
            r7.lock()     // Catch:{ all -> 0x0517 }
            goto L_0x0502
        L_0x0500:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0517 }
        L_0x0502:
            throw r0     // Catch:{ all -> 0x0517 }
        L_0x0503:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0517 }
            java.lang.String r0 = "trash/empty-trash/out-of-memory "
            X.AnonymousClass000.A10(r3, r0, r1)     // Catch:{ all -> 0x0517 }
            X.C18280x3.A1C(r1, r2)     // Catch:{ all -> 0x0517 }
        L_0x0511:
            r8.A00 = r6     // Catch:{ all -> 0x0522 }
            r7.unlock()     // Catch:{ all -> 0x0522 }
            goto L_0x051e
        L_0x0517:
            r0 = move-exception
            r8.A00 = r6     // Catch:{ all -> 0x0522 }
            r7.unlock()     // Catch:{ all -> 0x0522 }
            throw r0     // Catch:{ all -> 0x0522 }
        L_0x051e:
            r7.unlock()
            return
        L_0x0522:
            r0 = move-exception
            r7.unlock()
            throw r0
        L_0x0527:
            java.lang.Object r1 = r11.A00
            X.2ry r1 = (X.C56432ry) r1
            r0 = 1
            r1.A04(r0)
            return
        L_0x0530:
            java.lang.Object r2 = r11.A00
            X.2ry r2 = (X.C56432ry) r2
            long r0 = android.os.SystemClock.elapsedRealtime()
            r2.A0B = r0
            X.1im r0 = r2.A02
            int r1 = r0.A04
            r0 = 2
            boolean r0 = X.AnonymousClass000.A1U(r1, r0)
            if (r0 == 0) goto L_0x0550
            X.3TG r1 = r2.A06
            byte[] r0 = r2.A0F
            java.lang.String r0 = r1.A00(r0)
            r2.A0C = r0
            return
        L_0x0550:
            r0 = 5
            r2.A03(r0)
            return
        L_0x0555:
            java.lang.Object r1 = r11.A00
            X.2ry r1 = (X.C56432ry) r1
            r0 = 1
            r1.A05(r0)
            return
        L_0x055e:
            java.lang.Object r5 = r11.A00
            X.3Mn r5 = (X.C66723Mn) r5
            java.lang.String r0 = "wamruntime/pingPrivateStats"
            com.whatsapp.util.Log.d((java.lang.String) r0)
            boolean r0 = r5.A0A()
            if (r0 == 0) goto L_0x0593
            r3 = 1
            int r0 = r5.A0O
            if (r0 <= 0) goto L_0x05ad
            java.util.Random r1 = X.AnonymousClass0x9.A1C()
            int r0 = r5.A0O
            int r0 = r1.nextInt(r0)
            int r6 = r0 + 10
            if (r6 <= 0) goto L_0x05ad
            X.2O6 r0 = r5.A0K
            X.3dI r4 = r0.A02
            long r2 = X.C18290x4.A0A(r6)
            r1 = 31
            X.5sM r0 = new X.5sM
            r0.<init>((java.lang.Object) r5, (int) r6, (int) r1)
            r4.A04(r0, r2)
        L_0x0593:
            java.util.Random r1 = X.AnonymousClass0x9.A1C()
            r0 = 45
            int r0 = r1.nextInt(r0)
            int r1 = 305 - r0
            X.2O6 r0 = r5.A0K
            X.3dI r4 = r0.A02
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.SECONDS
            long r0 = (long) r1
            long r2 = r2.toMillis(r0)
            r1 = 25
            goto L_0x05fb
        L_0x05ad:
            X.8qC r0 = r5.A07
            java.lang.Object r2 = r0.get()
            X.4Ct r2 = (X.C84544Ct) r2
            X.2rX r1 = r5.A02
            r0 = 0
            r2.BlG(r1, r0, r0, r3)
            goto L_0x0593
        L_0x05bc:
            java.lang.Object r5 = r11.A00
            X.3Mn r5 = (X.C66723Mn) r5
            java.lang.String r0 = "wamruntime/ping"
            com.whatsapp.util.Log.d((java.lang.String) r0)
            boolean r0 = r5.A0B()
            r2 = 0
            if (r0 == 0) goto L_0x05da
            X.8qC r0 = r5.A08
            java.lang.Object r1 = r0.get()
            X.4Ct r1 = (X.C84544Ct) r1
            X.2rX r0 = r5.A03
            r1.BlE(r0, r2)
        L_0x05da:
            boolean r0 = r5.A09()
            if (r0 == 0) goto L_0x05ed
            X.8qC r0 = r5.A08
            java.lang.Object r1 = r0.get()
            X.4Ct r1 = (X.C84544Ct) r1
            X.2rX r0 = r5.A01
            r1.BlE(r0, r2)
        L_0x05ed:
            X.2O6 r0 = r5.A0K
            X.3dI r4 = r0.A01
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.SECONDS
            r0 = 300(0x12c, double:1.48E-321)
            long r2 = r2.toMillis(r0)
            r1 = 24
        L_0x05fb:
            X.3Zl r0 = new X.3Zl
            r0.<init>(r5, r1)
            r4.A04(r0, r2)
            return
        L_0x0604:
            java.lang.Object r5 = r11.A00
            X.1VV r5 = (X.AnonymousClass1VV) r5
            X.8qC r0 = r5.A05
            android.content.SharedPreferences r0 = X.C18300x5.A0B(r0)
            java.util.Map r3 = r0.getAll()
            java.util.Set r2 = r3.keySet()
            r1 = 2
            X.4KE r0 = new X.4KE
            r0.<init>(r1)
            X.AnonymousClass367.A01(r0, r2)
            java.lang.String r1 = X.C57622tw.A00(r3)
            X.8qC r0 = r5.A06
            android.content.SharedPreferences$Editor r4 = X.AnonymousClass0x2.A0E(r0)
            java.lang.String r3 = "ab_props:hash_v2"
            X.2iY r2 = r5.A02
            java.nio.charset.Charset r0 = X.AnonymousClass1VV.A08
            byte[] r1 = r1.getBytes(r0)
            java.lang.String r0 = X.C58172up.A00
            X.2bZ r0 = r2.A00(r0, r1)
            if (r0 != 0) goto L_0x0647
            r0 = 0
        L_0x063c:
            android.content.SharedPreferences$Editor r1 = r4.putString(r3, r0)
            java.lang.String r0 = "ab_props:hash"
            android.content.SharedPreferences$Editor r0 = r1.remove(r0)
            goto L_0x067c
        L_0x0647:
            java.lang.String r0 = r0.A00()
            goto L_0x063c
        L_0x064c:
            java.lang.Object r0 = r11.A00
            X.12c r0 = (X.C196712c) r0
            com.facebook.shimmer.ShimmerFrameLayout r1 = r0.A02
            r0 = 8
            r1.setVisibility(r0)
            r0 = 1065353216(0x3f800000, float:1.0)
            r1.setAlpha(r0)
            return
        L_0x065d:
            java.lang.Object r0 = r11.A00
            X.0Th r0 = (X.C05430Th) r0
            r0.A00()
            return
        L_0x0665:
            java.lang.Object r1 = r11.A00
            com.whatsapp.expressionstray.stickers.StickerExpressionsViewModel r1 = (com.whatsapp.expressionstray.stickers.StickerExpressionsViewModel) r1
            java.lang.String r0 = "StickerExpressionsViewModel/downloadInitialStickerPackIfNecessary/successfully downloaded the first sticker pack"
            com.whatsapp.util.Log.d((java.lang.String) r0)
            X.33p r0 = r1.A0A
            r2 = 1
            android.content.SharedPreferences$Editor r1 = X.C18270x1.A03(r0)
            java.lang.String r0 = "sticker_picker_initial_download"
            android.content.SharedPreferences$Editor r0 = r1.putBoolean(r0, r2)
        L_0x067c:
            r0.apply()
            return
        L_0x0680:
            java.lang.Object r1 = r11.A00
            X.5YE r1 = (X.AnonymousClass5YE) r1
            r0 = 1
            goto L_0x0693
        L_0x0686:
            java.lang.Object r0 = r11.A00
            X.5YE r0 = (X.AnonymousClass5YE) r0
            r0.A09()
            return
        L_0x068e:
            java.lang.Object r1 = r11.A00
            X.5YE r1 = (X.AnonymousClass5YE) r1
            r0 = 0
        L_0x0693:
            r1.A0D(r0)
            return
        L_0x0697:
            java.lang.Object r2 = r11.A00
            X.5Qu r2 = (X.C104395Qu) r2
            java.lang.Integer r0 = X.C18290x4.A0b()
            X.1b6 r1 = new X.1b6
            r1.<init>()
            r1.A04 = r0
            X.4FV r0 = r2.A06
            r0.BhD(r1)
            return
        L_0x06ac:
            java.lang.Object r0 = r11.A00
            X.5S9 r0 = (X.AnonymousClass5S9) r0
            X.4c7 r0 = r0.A01
            r0.A09()
            return
        L_0x06b6:
            java.util.ArrayList r1 = X.AnonymousClass002.A0J(r3)
            java.io.FileWriter r4 = new java.io.FileWriter     // Catch:{ IOException -> 0x0730 }
            r4.<init>(r5)     // Catch:{ IOException -> 0x0730 }
            java.io.BufferedWriter r6 = new java.io.BufferedWriter     // Catch:{ all -> 0x0726 }
            r6.<init>(r4)     // Catch:{ all -> 0x0726 }
            android.util.JsonWriter r7 = new android.util.JsonWriter     // Catch:{ all -> 0x071c }
            r7.<init>(r6)     // Catch:{ all -> 0x071c }
            r7.beginObject()     // Catch:{ all -> 0x0712 }
            java.lang.String r0 = "mappings"
            r7.name(r0)     // Catch:{ all -> 0x0712 }
            r7.beginArray()     // Catch:{ all -> 0x0712 }
            java.util.Iterator r5 = r1.iterator()     // Catch:{ all -> 0x0712 }
        L_0x06d8:
            boolean r0 = r5.hasNext()     // Catch:{ all -> 0x0712 }
            if (r0 == 0) goto L_0x0702
            java.lang.Object r3 = r5.next()     // Catch:{ all -> 0x0712 }
            X.2OC r3 = (X.AnonymousClass2OC) r3     // Catch:{ all -> 0x0712 }
            r7.beginObject()     // Catch:{ all -> 0x0712 }
            java.lang.String r0 = "url"
            android.util.JsonWriter r1 = r7.name(r0)     // Catch:{ all -> 0x0712 }
            java.lang.String r0 = r3.A01     // Catch:{ all -> 0x0712 }
            r1.value(r0)     // Catch:{ all -> 0x0712 }
            java.lang.String r0 = "file"
            android.util.JsonWriter r1 = r7.name(r0)     // Catch:{ all -> 0x0712 }
            java.lang.String r0 = r3.A00     // Catch:{ all -> 0x0712 }
            r1.value(r0)     // Catch:{ all -> 0x0712 }
            r7.endObject()     // Catch:{ all -> 0x0712 }
            goto L_0x06d8
        L_0x0702:
            r7.endArray()     // Catch:{ all -> 0x0712 }
            r7.endObject()     // Catch:{ all -> 0x0712 }
            r7.close()     // Catch:{ all -> 0x071c }
            r6.close()     // Catch:{ all -> 0x0726 }
            r4.close()     // Catch:{ IOException -> 0x0730 }
            return
        L_0x0712:
            r1 = move-exception
            r7.close()     // Catch:{ all -> 0x0717 }
            goto L_0x071b
        L_0x0717:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x071c }
        L_0x071b:
            throw r1     // Catch:{ all -> 0x071c }
        L_0x071c:
            r1 = move-exception
            r6.close()     // Catch:{ all -> 0x0721 }
            goto L_0x0725
        L_0x0721:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x0726 }
        L_0x0725:
            throw r1     // Catch:{ all -> 0x0726 }
        L_0x0726:
            r1 = move-exception
            r4.close()     // Catch:{ all -> 0x072b }
            goto L_0x072f
        L_0x072b:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ IOException -> 0x0730 }
        L_0x072f:
            throw r1     // Catch:{ IOException -> 0x0730 }
        L_0x0730:
            r1 = move-exception
            java.lang.String r0 = "diskbackedgifcache/persistcache/error"
            com.whatsapp.util.Log.e(r0, r1)
            X.2qk r3 = r2.A02
            java.lang.String r2 = r1.toString()
            r1 = 0
            java.lang.String r0 = "disk-backed-gif-cache/save-error"
            r3.A0A(r0, r1, r2)
            return
        L_0x0743:
            java.lang.String r0 = "navigationTimeSpentManager"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C69993Zl.run():void");
    }
}
