package X;

/* renamed from: X.4Iq  reason: invalid class name and case insensitive filesystem */
public class C86054Iq implements AnonymousClass4C9 {
    public Object A00;
    public final int A01;

    public C86054Iq(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    /* JADX WARNING: Removed duplicated region for block: B:120:0x023f  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x0158  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x017f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static /* bridge */ /* synthetic */ java.lang.Object A00(X.C86054Iq r9, java.lang.Object r10) {
        /*
            X.2ym r10 = (X.C60572ym) r10
            X.1mU r5 = r10.A00
            if (r5 == 0) goto L_0x0193
            java.lang.Object r4 = r9.A00
            com.whatsapp.events.EventInfoFragment r4 = (com.whatsapp.events.EventInfoFragment) r4
            X.30V r2 = r4.A0I
            if (r2 == 0) goto L_0x0299
            X.2z0 r3 = r5.A1J
            X.4uZ r1 = r3.A00
            r0 = 56
            r2.A02(r1, r0)
            com.whatsapp.WaTextView r7 = r4.A07
            if (r7 == 0) goto L_0x0034
            java.lang.String r0 = r5.A04
            android.text.SpannableStringBuilder r6 = X.C18330xA.A00(r0)
            android.content.Context r2 = r7.getContext()
            android.text.TextPaint r1 = r7.getPaint()
            X.5Y0 r0 = r4.A0D
            if (r0 == 0) goto L_0x0292
            java.lang.CharSequence r0 = X.C107345b9.A03(r2, r1, r0, r6)
            r7.setText(r0)
        L_0x0034:
            X.2sH r6 = r4.A0A
            if (r6 == 0) goto L_0x028a
            X.33j r2 = r4.A0B
            if (r2 == 0) goto L_0x0282
            long r0 = r5.A00
            java.lang.CharSequence r8 = X.C107565bW.A01(r6, r2, r0)
            X.C162457s7.A0D(r8)
            X.33j r2 = r4.A0B
            if (r2 == 0) goto L_0x027a
            long r0 = r5.A00
            java.lang.String r7 = X.C107145am.A00(r2, r0)
            com.whatsapp.WaTextView r6 = r4.A06
            if (r6 == 0) goto L_0x006b
            android.content.Context r2 = r4.A1D()
            r0 = 0
            if (r2 == 0) goto L_0x0068
            r1 = 2131889157(0x7f120c05, float:1.941297E38)
            java.lang.Object[] r0 = X.AnonymousClass002.A0M()
            X.AnonymousClass000.A16(r8, r7, r0)
            java.lang.String r0 = r2.getString(r1, r0)
        L_0x0068:
            r6.setText(r0)
        L_0x006b:
            com.whatsapp.WaTextView r2 = r4.A05
            if (r2 == 0) goto L_0x0078
            r1 = 7
            X.54E r0 = new X.54E
            r0.<init>(r4, r1, r5)
            r2.setOnClickListener(r0)
        L_0x0078:
            java.lang.String r0 = r5.A02
            r8 = 0
            if (r0 == 0) goto L_0x00df
            int r0 = r0.length()
            if (r0 == 0) goto L_0x00df
            X.5UY r0 = r4.A0L
            if (r0 == 0) goto L_0x00df
            android.view.View r0 = r0.A04()
            if (r0 == 0) goto L_0x00df
            X.5UY r0 = r4.A0L
            if (r0 == 0) goto L_0x00df
            android.view.View r7 = r0.A04()
            com.whatsapp.text.ReadMoreTextView r7 = (com.whatsapp.text.ReadMoreTextView) r7
            if (r7 == 0) goto L_0x00df
            r0 = 5
            r7.setLinesLimit(r0)
            X.33i r0 = r4.A09
            if (r0 == 0) goto L_0x0272
            X.AnonymousClass0x2.A12(r7, r0)
            X.33i r6 = r4.A09
            if (r6 == 0) goto L_0x026a
            X.2y5 r2 = r4.A0H
            if (r2 == 0) goto L_0x0262
            java.lang.String r1 = r5.A02
            android.text.TextPaint r0 = r7.getPaint()
            float r0 = r0.getTextSize()
            java.lang.CharSequence r0 = X.C107635bd.A08(r6, r2, r1, r0)
            android.text.SpannableStringBuilder r6 = X.C18330xA.A00(r0)
            X.5a2 r1 = r4.A0J
            if (r1 == 0) goto L_0x025b
            android.content.Context r0 = r7.getContext()
            r1.A07(r0, r6)
            android.content.Context r2 = r7.getContext()
            android.text.TextPaint r1 = r7.getPaint()
            X.5Y0 r0 = r4.A0D
            if (r0 == 0) goto L_0x0254
            java.lang.CharSequence r0 = X.C107345b9.A03(r2, r1, r0, r6)
            r7.setText(r0)
            r7.setVisibility(r8)
        L_0x00df:
            X.2lS r0 = r5.A01
            if (r0 == 0) goto L_0x011a
            java.lang.String r8 = r0.A02
            if (r8 == 0) goto L_0x011a
            X.5UY r7 = r4.A0M
            if (r7 == 0) goto L_0x011a
            android.view.View r1 = r7.A04()
            r0 = 2131429929(0x7f0b0a29, float:1.8481545E38)
            android.widget.TextView r2 = X.AnonymousClass0x2.A0I(r1, r0)
            android.view.View r1 = r7.A04()
            r0 = 2131429957(0x7f0b0a45, float:1.8481601E38)
            android.view.View r6 = X.C18280x3.A0E(r1, r0)
            r2.setText(r8)
            r0 = 0
            r7.A06(r0)
            X.2lS r0 = r5.A01
            if (r0 == 0) goto L_0x021c
            X.2k9 r2 = r0.A00
            if (r2 == 0) goto L_0x021c
            r1 = 19
            X.547 r0 = new X.547
            r0.<init>(r4, r2, r5, r1)
            r6.setOnClickListener(r0)
        L_0x011a:
            boolean r0 = r3.A02
            if (r0 != 0) goto L_0x020d
            X.2pV r0 = r4.A0E
            if (r0 == 0) goto L_0x024d
            long r1 = r5.A00
            X.2sH r0 = r0.A01
            long r6 = r0.A0D()
            int r0 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            boolean r0 = X.AnonymousClass001.A1V(r0)
            if (r0 != 0) goto L_0x020d
            X.2pV r0 = r4.A0E
            if (r0 == 0) goto L_0x0246
            X.1mi r0 = r0.A00(r5)
            if (r0 == 0) goto L_0x0204
            X.21m r0 = r0.A01
            if (r0 == 0) goto L_0x0204
            int r1 = r0.ordinal()
            r0 = 1
            if (r1 == r0) goto L_0x01fb
            r0 = 2
            if (r1 != r0) goto L_0x0204
            com.whatsapp.wds.components.button.WDSButton r1 = r4.A0N
            if (r1 == 0) goto L_0x0154
            r0 = 2131889170(0x7f120c12, float:1.9412996E38)
        L_0x0151:
            r1.setText(r0)
        L_0x0154:
            com.whatsapp.wds.components.button.WDSButton r2 = r4.A0N
            if (r2 == 0) goto L_0x0161
            r1 = 6
            X.54E r0 = new X.54E
            r0.<init>(r4, r1, r5)
            r2.setOnClickListener(r0)
        L_0x0161:
            java.lang.String r2 = r5.A03
            r6 = 0
            if (r2 == 0) goto L_0x0193
            int r0 = r2.length()
            if (r0 == 0) goto L_0x0193
            X.5UY r3 = r4.A0K
            if (r3 == 0) goto L_0x0193
            android.view.View r1 = r3.A04()
            r0 = 2131429932(0x7f0b0a2c, float:1.848155E38)
            android.view.View r8 = X.C18280x3.A0E(r1, r0)
            X.36Y r1 = r4.A0C
            if (r1 == 0) goto L_0x023f
            java.lang.String r0 = r5.A03
            boolean r0 = r1.A0I(r0)
            if (r0 == 0) goto L_0x01a4
            r1 = 7
            X.5ee r0 = new X.5ee
            r0.<init>(r1, r2, r4)
            r8.setOnClickListener(r0)
        L_0x0190:
            r3.A06(r6)
        L_0x0193:
            java.lang.Object r0 = r9.A00
            com.whatsapp.events.EventInfoFragment r0 = (com.whatsapp.events.EventInfoFragment) r0
            java.util.List r3 = r10.A01
            X.11v r2 = r0.A0F
            if (r2 != 0) goto L_0x0223
            java.lang.String r0 = "adapter"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x01a4:
            android.view.View r1 = r3.A04()
            r0 = 2131429933(0x7f0b0a2d, float:1.8481553E38)
            android.view.View r5 = X.C18280x3.A0E(r1, r0)
            android.widget.ImageView r5 = (android.widget.ImageView) r5
            android.view.View r1 = r3.A04()
            r0 = 2131429934(0x7f0b0a2e, float:1.8481555E38)
            android.view.View r7 = X.C18280x3.A0E(r1, r0)
            com.whatsapp.TextEmojiLabel r7 = (com.whatsapp.TextEmojiLabel) r7
            X.33i r0 = r4.A09
            if (r0 == 0) goto L_0x0237
            X.AnonymousClass0x2.A12(r7, r0)
            android.text.SpannableStringBuilder r2 = X.C18330xA.A00(r2)
            X.5a2 r1 = r4.A0J
            if (r1 == 0) goto L_0x0230
            android.content.Context r0 = r7.getContext()
            r1.A07(r0, r2)
            r7.A0I(r2)
            r0 = 8
            r8.setVisibility(r0)
            android.content.Context r1 = r4.A0G()
            r0 = 2131232380(0x7f08067c, float:1.8080868E38)
            android.graphics.drawable.Drawable r2 = X.AnonymousClass0RP.A00(r1, r0)
            if (r2 == 0) goto L_0x0193
            android.content.Context r1 = r4.A0G()
            r0 = 2131101268(0x7f060654, float:1.781494E38)
            int r0 = X.AnonymousClass0Y8.A04(r1, r0)
            X.AnonymousClass0YG.A06(r2, r0)
            r5.setImageDrawable(r2)
            goto L_0x0190
        L_0x01fb:
            com.whatsapp.wds.components.button.WDSButton r1 = r4.A0N
            if (r1 == 0) goto L_0x0154
            r0 = 2131889159(0x7f120c07, float:1.9412974E38)
            goto L_0x0151
        L_0x0204:
            com.whatsapp.wds.components.button.WDSButton r1 = r4.A0N
            if (r1 == 0) goto L_0x0154
            r0 = 2131889173(0x7f120c15, float:1.9413002E38)
            goto L_0x0151
        L_0x020d:
            com.whatsapp.wds.components.button.WDSButton r0 = r4.A0N
            int r1 = X.C18290x4.A05(r0)
            android.view.View r0 = r4.A00
            if (r0 == 0) goto L_0x0161
            r0.setVisibility(r1)
            goto L_0x0161
        L_0x021c:
            r0 = 8
            r6.setVisibility(r0)
            goto L_0x011a
        L_0x0223:
            java.util.List r1 = r2.A00
            X.11T r0 = new X.11T
            r0.<init>(r1, r3)
            X.C18280x3.A0s(r0, r2, r3, r1)
            X.2wD r0 = X.C59022wD.A00
            return r0
        L_0x0230:
            java.lang.String r0 = "linkifier"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x0237:
            java.lang.String r0 = "systemServices"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x023f:
            java.lang.String r0 = "deepLinkHelper"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x0246:
            java.lang.String r0 = "eventMessageManager"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x024d:
            java.lang.String r0 = "eventMessageManager"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x0254:
            java.lang.String r0 = "emojiLoader"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x025b:
            java.lang.String r0 = "linkifier"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x0262:
            java.lang.String r0 = "sharedPreferencesFactory"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x026a:
            java.lang.String r0 = "systemServices"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x0272:
            java.lang.String r0 = "systemServices"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x027a:
            java.lang.String r0 = "whatsAppLocale"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x0282:
            java.lang.String r0 = "whatsAppLocale"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x028a:
            java.lang.String r0 = "time"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x0292:
            java.lang.String r0 = "emojiLoader"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x0299:
            java.lang.String r0 = "navigationTimeSpentManager"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C86054Iq.A00(X.4Iq, java.lang.Object):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0023  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A01(X.C84814Du r6, X.AnonymousClass4C8 r7) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof X.C74043gU
            if (r0 == 0) goto L_0x0037
            r4 = r6
            X.3gU r4 = (X.C74043gU) r4
            int r2 = r4.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0037
            int r2 = r2 - r1
            r4.label = r2
        L_0x0012:
            java.lang.Object r3 = r4.result
            X.218 r2 = X.AnonymousClass218.COROUTINE_SUSPENDED
            int r0 = r4.label
            r1 = 1
            if (r0 == 0) goto L_0x0023
            if (r0 != r1) goto L_0x003d
            X.C57682u2.A01(r3)
        L_0x0020:
            X.2wD r0 = X.C59022wD.A00
            return r0
        L_0x0023:
            X.C57682u2.A01(r3)
            java.lang.Object r0 = r5.A00
            X.4C9 r0 = (X.AnonymousClass4C9) r0
            r4.label = r1
            java.lang.Object r0 = r7.Az8(r4, r0)
            if (r0 == r2) goto L_0x0036
            X.2wD r0 = X.C59022wD.A00
            if (r0 != r2) goto L_0x0020
        L_0x0036:
            return r2
        L_0x0037:
            X.3gU r4 = new X.3gU
            r4.<init>(r5, r6)
            goto L_0x0012
        L_0x003d:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0d()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C86054Iq.A01(X.4Du, X.4C8):java.lang.Object");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:173:0x02e7, code lost:
        if ((r12 instanceof X.AnonymousClass1TE) != false) goto L_0x02e9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:238:0x0409, code lost:
        if ((r12 instanceof X.C30141lv) != false) goto L_0x040b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:255:0x044b, code lost:
        r1.A05 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x006d, code lost:
        X.C57682u2.A01(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:318:0x055c, code lost:
        if (r1 == null) goto L_0x0a3a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:319:0x055e, code lost:
        X.C88694ab.A00(r1, r2, 0).A05();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:335:0x05d2, code lost:
        r0 = java.lang.Integer.valueOf(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:336:0x05d6, code lost:
        if (r0 == null) goto L_0x05e9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:337:0x05d8, code lost:
        r1 = r0.intValue();
        r0 = X.C18280x3.A0K(r2);
        r0.A0T(r1);
        X.C19340zH.A02(r2, r0);
        r0.A0S();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:338:0x05e9, code lost:
        r2.A1M();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:356:0x061e, code lost:
        r3.setText(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:504:0x0992, code lost:
        X.C57682u2.A01(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:510:0x09b3, code lost:
        if (r0 != r5) goto L_0x0a3a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:511:0x09b5, code lost:
        return r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:542:0x0a3c, code lost:
        return X.C59022wD.A00;
     */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x002d  */
    /* JADX WARNING: Removed duplicated region for block: B:231:0x03ee  */
    /* JADX WARNING: Removed duplicated region for block: B:235:0x03fb  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:500:0x0985  */
    /* JADX WARNING: Removed duplicated region for block: B:505:0x0997  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0020  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ java.lang.Object B2K(java.lang.Object r12, X.C84814Du r13) {
        /*
            r11 = this;
            int r0 = r11.A01
            switch(r0) {
                case 0: goto L_0x0a09;
                case 1: goto L_0x09f2;
                case 2: goto L_0x09da;
                case 3: goto L_0x096a;
                case 4: goto L_0x094b;
                case 5: goto L_0x08b9;
                case 6: goto L_0x07b5;
                case 7: goto L_0x075f;
                case 8: goto L_0x0750;
                case 9: goto L_0x0734;
                case 10: goto L_0x0717;
                case 11: goto L_0x06ca;
                case 12: goto L_0x0669;
                case 13: goto L_0x056d;
                case 14: goto L_0x0568;
                case 15: goto L_0x054f;
                case 16: goto L_0x0418;
                case 17: goto L_0x03d3;
                case 18: goto L_0x02f5;
                case 19: goto L_0x0279;
                case 20: goto L_0x0233;
                case 21: goto L_0x0224;
                case 22: goto L_0x00df;
                case 23: goto L_0x009b;
                case 24: goto L_0x0085;
                case 25: goto L_0x0045;
                case 26: goto L_0x003e;
                default: goto L_0x0005;
            }
        L_0x0005:
            boolean r0 = r13 instanceof X.C74053gV
            if (r0 == 0) goto L_0x0027
            r3 = r13
            X.3gV r3 = (X.C74053gV) r3
            int r2 = r3.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0027
            int r2 = r2 - r1
            r3.label = r2
        L_0x0017:
            java.lang.Object r2 = r3.result
            X.218 r5 = X.AnonymousClass218.COROUTINE_SUSPENDED
            int r0 = r3.label
            r1 = 1
            if (r0 == 0) goto L_0x002d
            if (r0 == r1) goto L_0x006d
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0d()
            throw r0
        L_0x0027:
            X.3gV r3 = new X.3gV
            r3.<init>(r11, r13)
            goto L_0x0017
        L_0x002d:
            X.C57682u2.A01(r2)
            java.lang.Object r0 = r11.A00
            X.4C9 r0 = (X.AnonymousClass4C9) r0
            if (r12 == 0) goto L_0x0a3a
            r3.label = r1
            java.lang.Object r0 = r0.B2K(r12, r3)
            goto L_0x09b3
        L_0x003e:
            X.4C8 r12 = (X.AnonymousClass4C8) r12
            java.lang.Object r5 = r11.A01(r13, r12)
            return r5
        L_0x0045:
            boolean r0 = r13 instanceof X.C74023gS
            if (r0 == 0) goto L_0x0067
            r3 = r13
            X.3gS r3 = (X.C74023gS) r3
            int r2 = r3.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0067
            int r2 = r2 - r1
            r3.label = r2
        L_0x0057:
            java.lang.Object r2 = r3.result
            X.218 r5 = X.AnonymousClass218.COROUTINE_SUSPENDED
            int r0 = r3.label
            r1 = 1
            if (r0 == 0) goto L_0x0072
            if (r0 == r1) goto L_0x006d
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0d()
            throw r0
        L_0x0067:
            X.3gS r3 = new X.3gS
            r3.<init>(r11, r13)
            goto L_0x0057
        L_0x006d:
            X.C57682u2.A01(r2)
            goto L_0x0a3a
        L_0x0072:
            X.C57682u2.A01(r2)
            java.lang.Object r0 = r11.A00
            X.4FB r0 = (X.AnonymousClass4FB) r0
            if (r12 != 0) goto L_0x007d
            X.2XH r12 = X.AnonymousClass2C3.A01
        L_0x007d:
            r3.label = r1
            java.lang.Object r0 = r0.BlD(r12, r3)
            goto L_0x09b3
        L_0x0085:
            X.2kG r12 = (X.C51712kG) r12
            java.lang.Object r0 = r11.A00
            com.whatsapp.group.HistorySettingActivity r0 = (com.whatsapp.group.HistorySettingActivity) r0
            androidx.appcompat.widget.SwitchCompat r1 = r0.A00
            if (r1 == 0) goto L_0x0a3a
            boolean r0 = r12.A00
            r1.setChecked(r0)
            boolean r0 = r12.A01
            r1.setEnabled(r0)
            goto L_0x0a3a
        L_0x009b:
            X.1e5 r0 = X.C27541e5.A00
            boolean r0 = X.C162457s7.A0P(r12, r0)
            if (r0 == 0) goto L_0x00ba
            r0 = 2131888104(0x7f1207e8, float:1.9410834E38)
        L_0x00a6:
            java.lang.Integer r1 = X.AnonymousClass0x9.A0k(r0)
            java.lang.Object r0 = r11.A00
            X.4ea r0 = (X.C89654ea) r0
            int r2 = r1.intValue()
            X.3Wi r1 = r0.A05
            r0 = 0
            r1.A0H(r2, r0)
            goto L_0x0a3a
        L_0x00ba:
            X.1e6 r0 = X.C27551e6.A00
            boolean r0 = X.C162457s7.A0P(r12, r0)
            if (r0 == 0) goto L_0x00c6
            r0 = 2131889083(0x7f120bbb, float:1.941282E38)
            goto L_0x00a6
        L_0x00c6:
            X.1e7 r0 = X.C27561e7.A00
            boolean r0 = X.C162457s7.A0P(r12, r0)
            if (r0 == 0) goto L_0x00d2
            r0 = 2131893926(0x7f121ea6, float:1.9422642E38)
            goto L_0x00a6
        L_0x00d2:
            X.1e8 r0 = X.C27571e8.A00
            boolean r0 = X.C162457s7.A0P(r12, r0)
            if (r0 != 0) goto L_0x0a3a
            X.3f1 r0 = X.C73153f1.A00()
            throw r0
        L_0x00df:
            X.26a r12 = (X.C381826a) r12
            boolean r0 = r12 instanceof X.AnonymousClass1UB
            if (r0 == 0) goto L_0x0102
            java.lang.Object r2 = r11.A00
            com.whatsapp.expressionstray.stickers.StickerExpressionsFragment r2 = (com.whatsapp.expressionstray.stickers.StickerExpressionsFragment) r2
            android.view.View r0 = r2.A00
            int r1 = X.C18290x4.A05(r0)
            android.view.View r0 = r2.A01
            if (r0 == 0) goto L_0x00f6
            r0.setVisibility(r1)
        L_0x00f6:
            java.lang.Object r0 = r11.A00
            com.whatsapp.expressionstray.stickers.StickerExpressionsFragment r0 = (com.whatsapp.expressionstray.stickers.StickerExpressionsFragment) r0
            com.whatsapp.expressionstray.ExpressionsSearchViewModel r1 = r0.A08
            if (r1 == 0) goto L_0x0a3a
            boolean r0 = r12 instanceof X.AnonymousClass1U9
            goto L_0x044b
        L_0x0102:
            boolean r0 = r12 instanceof X.AnonymousClass1U8
            if (r0 == 0) goto L_0x018c
            java.lang.Object r3 = r11.A00
            com.whatsapp.expressionstray.stickers.StickerExpressionsFragment r3 = (com.whatsapp.expressionstray.stickers.StickerExpressionsFragment) r3
            r6 = r12
            X.1U8 r6 = (X.AnonymousClass1U8) r6
            android.view.View r0 = r3.A00
            int r1 = X.C18290x4.A05(r0)
            android.view.View r0 = r3.A01
            if (r0 == 0) goto L_0x011a
            r0.setVisibility(r1)
        L_0x011a:
            com.whatsapp.AutoFitGridRecyclerView r0 = r3.A06
            if (r0 == 0) goto L_0x0125
            X.0ON r0 = r0.getRecycledViewPool()
            r0.A01()
        L_0x0125:
            X.11m r1 = r3.A09
            if (r1 == 0) goto L_0x012e
            java.util.List r0 = r6.A01
            r1.A0L(r0)
        L_0x012e:
            X.11j r1 = r3.A0D
            if (r1 == 0) goto L_0x0137
            java.util.List r0 = r6.A02
            r1.A0L(r0)
        L_0x0137:
            java.util.List r5 = r6.A02
            java.util.Iterator r4 = r5.iterator()
            r2 = 0
        L_0x013e:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x0163
            java.lang.Object r1 = r4.next()
            X.2ix r1 = (X.C50902ix) r1
            boolean r0 = r1.A01()
            if (r0 != 0) goto L_0x0164
            X.2UW r0 = r1.A00()
            java.lang.String r1 = r0.A00()
            java.lang.String r0 = r6.A00
            boolean r0 = X.C162457s7.A0P(r1, r0)
            if (r0 != 0) goto L_0x0164
            int r2 = r2 + 1
            goto L_0x013e
        L_0x0163:
            r2 = -1
        L_0x0164:
            X.11j r0 = r3.A0D
            if (r0 == 0) goto L_0x018a
            int r0 = r0.A0G()
        L_0x016c:
            if (r2 < 0) goto L_0x00f6
            if (r2 >= r0) goto L_0x00f6
            java.lang.String r0 = r6.A00
            if (r0 == 0) goto L_0x0181
            java.lang.Object r0 = r5.get(r2)
            X.2ix r0 = (X.C50902ix) r0
            X.2UW r0 = r0.A00()
            r3.A1V(r0)
        L_0x0181:
            androidx.recyclerview.widget.RecyclerView r0 = r3.A05
            if (r0 == 0) goto L_0x00f6
            r0.A0Z(r2)
            goto L_0x00f6
        L_0x018a:
            r0 = 0
            goto L_0x016c
        L_0x018c:
            boolean r0 = r12 instanceof X.AnonymousClass1U6
            if (r0 == 0) goto L_0x01b8
            java.lang.Object r3 = r11.A00
            com.whatsapp.expressionstray.stickers.StickerExpressionsFragment r3 = (com.whatsapp.expressionstray.stickers.StickerExpressionsFragment) r3
            r0 = r12
            X.1U6 r0 = (X.AnonymousClass1U6) r0
            java.util.List r2 = r0.A00
        L_0x0199:
            android.view.View r0 = r3.A00
            int r1 = X.C18290x4.A05(r0)
            android.view.View r0 = r3.A01
            if (r0 == 0) goto L_0x01a6
            r0.setVisibility(r1)
        L_0x01a6:
            X.11m r0 = r3.A09
            if (r0 == 0) goto L_0x01ad
            r0.A0L(r2)
        L_0x01ad:
            X.11j r1 = r3.A0D
            if (r1 == 0) goto L_0x00f6
            X.3d3 r0 = X.C72023d3.A00
            r1.A0L(r0)
            goto L_0x00f6
        L_0x01b8:
            boolean r0 = r12 instanceof X.AnonymousClass1U7
            if (r0 == 0) goto L_0x01c6
            java.lang.Object r3 = r11.A00
            com.whatsapp.expressionstray.stickers.StickerExpressionsFragment r3 = (com.whatsapp.expressionstray.stickers.StickerExpressionsFragment) r3
            r0 = r12
            X.1U7 r0 = (X.AnonymousClass1U7) r0
            java.util.List r2 = r0.A00
            goto L_0x0199
        L_0x01c6:
            boolean r0 = r12 instanceof X.AnonymousClass1U9
            if (r0 == 0) goto L_0x01f7
            java.lang.Object r2 = r11.A00
            com.whatsapp.expressionstray.stickers.StickerExpressionsFragment r2 = (com.whatsapp.expressionstray.stickers.StickerExpressionsFragment) r2
            com.whatsapp.AutoFitGridRecyclerView r0 = r2.A06
            if (r0 == 0) goto L_0x01d9
            X.0ON r0 = r0.getRecycledViewPool()
            r0.A01()
        L_0x01d9:
            X.11m r1 = r2.A09
            if (r1 == 0) goto L_0x01e2
            X.3d3 r0 = X.C72023d3.A00
            r1.A0L(r0)
        L_0x01e2:
            X.11j r1 = r2.A0D
            if (r1 == 0) goto L_0x01eb
            X.3d3 r0 = X.C72023d3.A00
            r1.A0L(r0)
        L_0x01eb:
            android.view.View r0 = r2.A01
            X.C18270x1.A0p(r0)
            android.view.View r0 = r2.A00
        L_0x01f2:
            X.AnonymousClass0x2.A0x(r0)
            goto L_0x00f6
        L_0x01f7:
            boolean r0 = r12 instanceof X.AnonymousClass1UA
            if (r0 == 0) goto L_0x00f6
            java.lang.Object r2 = r11.A00
            com.whatsapp.expressionstray.stickers.StickerExpressionsFragment r2 = (com.whatsapp.expressionstray.stickers.StickerExpressionsFragment) r2
            com.whatsapp.AutoFitGridRecyclerView r0 = r2.A06
            if (r0 == 0) goto L_0x020a
            X.0ON r0 = r0.getRecycledViewPool()
            r0.A01()
        L_0x020a:
            X.11m r1 = r2.A09
            if (r1 == 0) goto L_0x0213
            X.3d3 r0 = X.C72023d3.A00
            r1.A0L(r0)
        L_0x0213:
            X.11j r1 = r2.A0D
            if (r1 == 0) goto L_0x021c
            X.3d3 r0 = X.C72023d3.A00
            r1.A0L(r0)
        L_0x021c:
            android.view.View r0 = r2.A00
            X.C18270x1.A0p(r0)
            android.view.View r0 = r2.A01
            goto L_0x01f2
        L_0x0224:
            java.lang.Object r1 = r11.A00
            com.whatsapp.expressionstray.stickers.StickerExpressionsFragment r1 = (com.whatsapp.expressionstray.stickers.StickerExpressionsFragment) r1
            boolean r0 = r12 instanceof X.C32821rg
            if (r0 == 0) goto L_0x0a3a
            r2 = 2131889338(0x7f120cba, float:1.9413337E38)
            androidx.coordinatorlayout.widget.CoordinatorLayout r1 = r1.A03
            goto L_0x055c
        L_0x0233:
            X.26Z r12 = (X.AnonymousClass26Z) r12
            boolean r0 = r12 instanceof X.AnonymousClass1U5
            if (r0 == 0) goto L_0x0a3a
            java.lang.Object r7 = r11.A00
            com.whatsapp.expressionstray.stickers.StickerExpressionsFragment r7 = (com.whatsapp.expressionstray.stickers.StickerExpressionsFragment) r7
            X.1U5 r12 = (X.AnonymousClass1U5) r12
            java.lang.String r6 = r12.A00
            if (r6 == 0) goto L_0x0a3a
            X.11m r5 = r7.A09
            if (r5 == 0) goto L_0x0273
            int r4 = r5.A0G()
            r3 = 0
        L_0x024c:
            if (r3 >= r4) goto L_0x0273
            java.lang.Object r1 = r5.A0K(r3)
            boolean r0 = r1 instanceof X.C23491Tl
            if (r0 == 0) goto L_0x0270
            X.1Tl r1 = (X.C23491Tl) r1
            if (r1 == 0) goto L_0x0270
            X.2UW r2 = r1.A00
            java.lang.String r0 = r2.A00()
            boolean r0 = X.C162457s7.A0P(r0, r6)
            if (r0 == 0) goto L_0x0270
        L_0x0266:
            com.whatsapp.expressionstray.stickers.StickerExpressionsViewModel r1 = X.C18300x5.A0N(r7)
            r0 = 1
            r1.A0M(r2, r0)
            goto L_0x0a3a
        L_0x0270:
            int r3 = r3 + 1
            goto L_0x024c
        L_0x0273:
            X.1Tq r2 = new X.1Tq
            r2.<init>(r6)
            goto L_0x0266
        L_0x0279:
            X.26S r12 = (X.AnonymousClass26S) r12
            java.lang.Object r3 = r11.A00
            com.whatsapp.expressionstray.conversation.ExpressionsKeyboardSearchBottomSheet r3 = (com.whatsapp.expressionstray.conversation.ExpressionsKeyboardSearchBottomSheet) r3
            boolean r0 = r12 instanceof X.AnonymousClass1TN
            if (r0 == 0) goto L_0x02a8
            X.1TN r12 = (X.AnonymousClass1TN) r12
            java.lang.String r2 = r12.A00
            X.8qC r0 = r3.A0I
            if (r0 == 0) goto L_0x02a1
            java.lang.Object r1 = X.C18300x5.A0b(r0)
            X.5ZD r1 = (X.AnonymousClass5ZD) r1
            X.03q r0 = r3.A0R()
            X.AnonymousClass0x9.A1L(r0)
            java.lang.ref.WeakReference r0 = X.AnonymousClass0x9.A14(r0)
            r1.A04(r2, r0)
            goto L_0x0a3a
        L_0x02a1:
            java.lang.String r0 = "avatarEditorLauncherLazy"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x02a8:
            X.1TI r0 = X.AnonymousClass1TI.A00
            boolean r0 = X.C162457s7.A0P(r12, r0)
            if (r0 != 0) goto L_0x02e9
            X.1TH r0 = X.AnonymousClass1TH.A00
            boolean r0 = X.C162457s7.A0P(r12, r0)
            if (r0 == 0) goto L_0x02c7
            com.whatsapp.WaEditText r0 = r3.A0A
            if (r0 == 0) goto L_0x02c2
            r0.A05()
            r0.clearFocus()
        L_0x02c2:
            r3.A1K()
            goto L_0x0a3a
        L_0x02c7:
            X.1TM r0 = X.AnonymousClass1TM.A00
            boolean r0 = X.C162457s7.A0P(r12, r0)
            if (r0 == 0) goto L_0x02e5
            android.content.Context r0 = r3.A1D()
            android.content.Intent r2 = X.C18320x8.A07()
            java.lang.String r1 = r0.getPackageName()
            java.lang.String r0 = "com.whatsapp.stickers.store.StickerStoreActivity"
            r2.setClassName(r1, r0)
            r3.A0m(r2)
            goto L_0x0a3a
        L_0x02e5:
            boolean r0 = r12 instanceof X.AnonymousClass1TE
            if (r0 == 0) goto L_0x0a3a
        L_0x02e9:
            com.whatsapp.WaEditText r0 = r3.A0A
            if (r0 == 0) goto L_0x0a3a
            r0.A05()
            r0.clearFocus()
            goto L_0x0a3a
        L_0x02f5:
            X.26S r12 = (X.AnonymousClass26S) r12
            java.lang.Object r1 = r11.A00
            com.whatsapp.expressionstray.conversation.ExpressionsBottomSheetView r1 = (com.whatsapp.expressionstray.conversation.ExpressionsBottomSheetView) r1
            boolean r0 = r12 instanceof X.AnonymousClass1TN
            if (r0 == 0) goto L_0x0321
            X.1TN r12 = (X.AnonymousClass1TN) r12
            java.lang.String r3 = r12.A00
            X.8qC r0 = r1.getAvatarEditorLauncherLazy()
            java.lang.Object r2 = X.C18300x5.A0b(r0)
            X.5ZD r2 = (X.AnonymousClass5ZD) r2
            android.content.Context r0 = r1.getContext()
            android.content.Context r0 = X.C116885r1.A00(r0)
            X.AnonymousClass0x9.A1L(r0)
            java.lang.ref.WeakReference r0 = X.AnonymousClass0x9.A14(r0)
            r2.A04(r3, r0)
            goto L_0x0a3a
        L_0x0321:
            X.1TI r0 = X.AnonymousClass1TI.A00
            boolean r0 = X.C162457s7.A0P(r12, r0)
            if (r0 != 0) goto L_0x0a3a
            X.1TH r0 = X.AnonymousClass1TH.A00
            boolean r0 = X.C162457s7.A0P(r12, r0)
            if (r0 != 0) goto L_0x0a3a
            X.1TM r0 = X.AnonymousClass1TM.A00
            boolean r0 = X.C162457s7.A0P(r12, r0)
            if (r0 == 0) goto L_0x0353
            android.content.Context r3 = r1.getContext()
            android.content.Context r0 = r1.getContext()
            android.content.Intent r2 = X.C18320x8.A07()
            java.lang.String r1 = r0.getPackageName()
            java.lang.String r0 = "com.whatsapp.stickers.store.StickerStoreActivity"
            r2.setClassName(r1, r0)
            r3.startActivity(r2)
            goto L_0x0a3a
        L_0x0353:
            boolean r0 = r12 instanceof X.AnonymousClass1TG
            if (r0 == 0) goto L_0x0368
            X.4BP r3 = r1.A0I
            if (r3 == 0) goto L_0x0a3a
            X.1TG r12 = (X.AnonymousClass1TG) r12
            X.39M r2 = r12.A01
            java.lang.Integer r1 = r12.A02
            int r0 = r12.A00
            r3.Bci(r2, r1, r0)
            goto L_0x0a3a
        L_0x0368:
            boolean r0 = r12 instanceof X.AnonymousClass1TE
            if (r0 == 0) goto L_0x0379
            X.4AK r1 = r1.A0H
            if (r1 == 0) goto L_0x0a3a
            X.1TE r12 = (X.AnonymousClass1TE) r12
            X.7yG r0 = r12.A00
            r1.BU5(r0)
            goto L_0x0a3a
        L_0x0379:
            X.1TJ r0 = X.AnonymousClass1TJ.A00
            boolean r0 = X.C162457s7.A0P(r12, r0)
            if (r0 == 0) goto L_0x038a
            X.4CE r0 = r1.A03
            if (r0 == 0) goto L_0x0a3a
            r0.BNH()
            goto L_0x0a3a
        L_0x038a:
            boolean r0 = r12 instanceof X.AnonymousClass1TD
            if (r0 == 0) goto L_0x039b
            X.4CE r1 = r1.A03
            if (r1 == 0) goto L_0x0a3a
            X.1TD r12 = (X.AnonymousClass1TD) r12
            int[] r0 = r12.A00
            r1.BRo(r0)
            goto L_0x0a3a
        L_0x039b:
            X.1TK r0 = X.AnonymousClass1TK.A00
            boolean r0 = X.C162457s7.A0P(r12, r0)
            if (r0 == 0) goto L_0x03ac
            X.4Cs r0 = r1.A0B
            if (r0 == 0) goto L_0x0a3a
            r0.BgM()
            goto L_0x0a3a
        L_0x03ac:
            X.1TL r0 = X.AnonymousClass1TL.A00
            boolean r0 = X.C162457s7.A0P(r12, r0)
            if (r0 == 0) goto L_0x03bd
            X.4Cs r0 = r1.A0B
            if (r0 == 0) goto L_0x0a3a
            r0.Bpc()
            goto L_0x0a3a
        L_0x03bd:
            boolean r0 = r12 instanceof X.AnonymousClass1TF
            if (r0 == 0) goto L_0x03ce
            X.4GQ r1 = r1.A0N
            if (r1 == 0) goto L_0x0a3a
            X.1TF r12 = (X.AnonymousClass1TF) r12
            X.5Uw r0 = r12.A00
            r1.invoke(r0)
            goto L_0x0a3a
        L_0x03ce:
            X.3f1 r0 = X.C73153f1.A00()
            throw r0
        L_0x03d3:
            boolean r0 = r13 instanceof X.C74153gf
            if (r0 == 0) goto L_0x03f5
            r4 = r13
            X.3gf r4 = (X.C74153gf) r4
            int r2 = r4.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x03f5
            int r2 = r2 - r1
            r4.label = r2
        L_0x03e5:
            java.lang.Object r1 = r4.result
            X.218 r5 = X.AnonymousClass218.COROUTINE_SUSPENDED
            int r0 = r4.label
            r3 = 1
            if (r0 == 0) goto L_0x03fb
            if (r0 == r3) goto L_0x0992
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0d()
            throw r0
        L_0x03f5:
            X.3gf r4 = new X.3gf
            r4.<init>(r11, r13)
            goto L_0x03e5
        L_0x03fb:
            X.C57682u2.A01(r1)
            java.lang.Object r2 = r11.A00
            X.4C9 r2 = (X.AnonymousClass4C9) r2
            boolean r0 = r12 instanceof X.C30131lu
            if (r0 != 0) goto L_0x040b
            boolean r1 = r12 instanceof X.C30141lv
            r0 = 0
            if (r1 == 0) goto L_0x040c
        L_0x040b:
            r0 = 1
        L_0x040c:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r4.label = r3
            java.lang.Object r0 = r2.B2K(r0, r4)
            goto L_0x09b3
        L_0x0418:
            X.26V r12 = (X.AnonymousClass26V) r12
            X.1TV r0 = X.AnonymousClass1TV.A00
            boolean r0 = X.C162457s7.A0P(r12, r0)
            if (r0 == 0) goto L_0x044f
            java.lang.Object r2 = r11.A00
            com.whatsapp.expressionstray.avatars.AvatarExpressionsFragment r2 = (com.whatsapp.expressionstray.avatars.AvatarExpressionsFragment) r2
            android.view.View r0 = r2.A00
            int r1 = X.C18290x4.A05(r0)
            android.view.View r0 = r2.A03
            if (r0 == 0) goto L_0x0433
            r0.setVisibility(r1)
        L_0x0433:
            androidx.recyclerview.widget.RecyclerView r0 = r2.A08
            if (r0 == 0) goto L_0x043a
            r0.setVisibility(r1)
        L_0x043a:
            android.view.ViewStub r0 = r2.A04
            if (r0 == 0) goto L_0x0441
            r0.setVisibility(r1)
        L_0x0441:
            java.lang.Object r0 = r11.A00
            com.whatsapp.expressionstray.avatars.AvatarExpressionsFragment r0 = (com.whatsapp.expressionstray.avatars.AvatarExpressionsFragment) r0
            com.whatsapp.expressionstray.ExpressionsSearchViewModel r1 = r0.A0D
            if (r1 == 0) goto L_0x0a3a
            boolean r0 = r12 instanceof X.AnonymousClass1TS
        L_0x044b:
            r1.A05 = r0
            goto L_0x0a3a
        L_0x044f:
            X.1TW r0 = X.AnonymousClass1TW.A00
            boolean r0 = X.C162457s7.A0P(r12, r0)
            if (r0 == 0) goto L_0x0481
            java.lang.Object r3 = r11.A00
            com.whatsapp.expressionstray.avatars.AvatarExpressionsFragment r3 = (com.whatsapp.expressionstray.avatars.AvatarExpressionsFragment) r3
            android.view.View r0 = r3.A00
            int r1 = X.C18290x4.A05(r0)
            android.view.View r0 = r3.A03
            if (r0 == 0) goto L_0x0468
            r0.setVisibility(r1)
        L_0x0468:
            androidx.recyclerview.widget.RecyclerView r0 = r3.A08
            if (r0 == 0) goto L_0x046f
            r0.setVisibility(r1)
        L_0x046f:
            X.1VX r2 = r3.A02
            r1 = 4890(0x131a, float:6.852E-42)
            X.2vE r0 = X.C58422vE.A02
            boolean r0 = r2.A0Y(r0, r1)
            if (r0 == 0) goto L_0x0441
            android.view.ViewStub r0 = r3.A04
            X.AnonymousClass0x2.A0x(r0)
            goto L_0x0441
        L_0x0481:
            boolean r0 = r12 instanceof X.AnonymousClass1TT
            if (r0 == 0) goto L_0x04af
            java.lang.Object r3 = r11.A00
            com.whatsapp.expressionstray.avatars.AvatarExpressionsFragment r3 = (com.whatsapp.expressionstray.avatars.AvatarExpressionsFragment) r3
            r2 = r12
            X.1TT r2 = (X.AnonymousClass1TT) r2
            android.view.View r0 = r3.A03
            int r1 = X.C18290x4.A05(r0)
            androidx.recyclerview.widget.RecyclerView r0 = r3.A08
            X.AnonymousClass0x2.A0x(r0)
            android.view.View r0 = r3.A00
            if (r0 == 0) goto L_0x049e
            r0.setVisibility(r1)
        L_0x049e:
            android.view.ViewStub r0 = r3.A04
            if (r0 == 0) goto L_0x04a5
            r0.setVisibility(r1)
        L_0x04a5:
            X.11m r1 = r3.A0F
            if (r1 == 0) goto L_0x0441
            java.util.List r0 = r2.A00
            r1.A0L(r0)
            goto L_0x0441
        L_0x04af:
            boolean r0 = r12 instanceof X.AnonymousClass1TS
            if (r0 == 0) goto L_0x04fc
            java.lang.Object r2 = r11.A00
            com.whatsapp.expressionstray.avatars.AvatarExpressionsFragment r2 = (com.whatsapp.expressionstray.avatars.AvatarExpressionsFragment) r2
            r0 = r12
            X.1TS r0 = (X.AnonymousClass1TS) r0
            X.39M r4 = r0.A00
            android.view.View r0 = r2.A03
            int r1 = X.C18290x4.A05(r0)
            androidx.recyclerview.widget.RecyclerView r0 = r2.A08
            if (r0 == 0) goto L_0x04c9
            r0.setVisibility(r1)
        L_0x04c9:
            android.view.ViewStub r0 = r2.A04
            if (r0 == 0) goto L_0x04d0
            r0.setVisibility(r1)
        L_0x04d0:
            android.view.View r0 = r2.A00
            X.AnonymousClass0x2.A0x(r0)
            android.content.Context r0 = r2.A1D()
            if (r0 == 0) goto L_0x0441
            android.content.res.Resources r1 = r0.getResources()
            if (r1 == 0) goto L_0x0441
            r0 = 2131166339(0x7f070483, float:1.794692E38)
            int r7 = r1.getDimensionPixelSize(r0)
            com.whatsapp.WaImageView r3 = r2.A0B
            if (r3 == 0) goto L_0x0441
            if (r4 == 0) goto L_0x0441
            X.33O r2 = r2.A0I
            if (r2 == 0) goto L_0x0547
            r6 = 0
            r9 = 1
            r5 = 0
            r8 = r7
            r10 = r9
            r2.A05(r3, r4, r5, r6, r7, r8, r9, r10)
            goto L_0x0441
        L_0x04fc:
            boolean r0 = r12 instanceof X.AnonymousClass1TU
            if (r0 == 0) goto L_0x0441
            java.lang.Object r2 = r11.A00
            com.whatsapp.expressionstray.avatars.AvatarExpressionsFragment r2 = (com.whatsapp.expressionstray.avatars.AvatarExpressionsFragment) r2
            r3 = r12
            X.1TU r3 = (X.AnonymousClass1TU) r3
            android.view.View r0 = r2.A03
            X.AnonymousClass0x2.A0x(r0)
            android.view.View r0 = r2.A00
            int r1 = X.C18290x4.A05(r0)
            androidx.recyclerview.widget.RecyclerView r0 = r2.A08
            if (r0 == 0) goto L_0x0519
            r0.setVisibility(r1)
        L_0x0519:
            android.view.ViewStub r0 = r2.A04
            if (r0 == 0) goto L_0x0520
            r0.setVisibility(r1)
        L_0x0520:
            X.11m r1 = r2.A0F
            if (r1 == 0) goto L_0x0529
            java.util.List r0 = r3.A01
            r1.A0L(r0)
        L_0x0529:
            com.whatsapp.expressionstray.avatars.AvatarStickersCategoriesView r1 = r2.A0E
            if (r1 == 0) goto L_0x053c
            boolean r0 = r3.A03
            r1.setRecentEnabled(r0)
            boolean r0 = r3.A04
            r1.setStarredEnabled(r0)
            X.2Uc r0 = r3.A00
            r1.setSelectedCategory(r0)
        L_0x053c:
            boolean r0 = r3.A02
            if (r0 == 0) goto L_0x0441
            X.2Uc r0 = r3.A00
            r2.BOc(r0)
            goto L_0x0441
        L_0x0547:
            java.lang.String r0 = "stickerImageFileLoader"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x054f:
            java.lang.Object r1 = r11.A00
            com.whatsapp.expressionstray.avatars.AvatarExpressionsFragment r1 = (com.whatsapp.expressionstray.avatars.AvatarExpressionsFragment) r1
            boolean r0 = r12 instanceof X.C32811rf
            if (r0 == 0) goto L_0x0a3a
            r2 = 2131889338(0x7f120cba, float:1.9413337E38)
            androidx.coordinatorlayout.widget.CoordinatorLayout r1 = r1.A06
        L_0x055c:
            if (r1 == 0) goto L_0x0a3a
            r0 = 0
            X.4ab r0 = X.C88694ab.A00(r1, r2, r0)
            r0.A05()
            goto L_0x0a3a
        L_0x0568:
            java.lang.Object r5 = A00(r11, r12)
            return r5
        L_0x056d:
            X.2yk r12 = (X.C60552yk) r12
            java.lang.Object r2 = r11.A00
            com.whatsapp.events.EventCreationFragment r2 = (com.whatsapp.events.EventCreationFragment) r2
            X.5UY r0 = r2.A0L
            r4 = 0
            if (r0 == 0) goto L_0x0633
            android.view.View r1 = r0.A04()
            if (r1 == 0) goto L_0x0633
            r0 = 2131429909(0x7f0b0a15, float:1.8481504E38)
            android.view.View r3 = X.C06560Yg.A02(r1, r0)
            r0 = 2131429908(0x7f0b0a14, float:1.8481502E38)
            android.view.View r7 = X.C18280x3.A0E(r1, r0)
            android.widget.ImageView r7 = (android.widget.ImageView) r7
            android.content.Context r1 = r2.A0G()
            r0 = 2131231274(0x7f08022a, float:1.8078624E38)
            android.graphics.drawable.Drawable r6 = X.AnonymousClass0RP.A00(r1, r0)
            if (r6 == 0) goto L_0x0a3a
            android.content.Context r5 = r2.A0G()
            r1 = 2130971129(0x7f0409f9, float:1.7550988E38)
            r0 = 2131102939(0x7f060cdb, float:1.781833E38)
            int r0 = X.C18300x5.A03(r5, r1, r0)
            X.AnonymousClass0YG.A06(r6, r0)
            X.33j r1 = r2.A1J()
            X.6dx r0 = new X.6dx
            r0.<init>(r6, r1)
            r7.setImageDrawable(r0)
        L_0x05b8:
            X.21P r0 = r12.A00
            int r0 = r0.ordinal()
            r1 = 0
            switch(r0) {
                case 0: goto L_0x05ee;
                case 1: goto L_0x05f9;
                case 2: goto L_0x0647;
                case 3: goto L_0x0635;
                case 4: goto L_0x0622;
                default: goto L_0x05c2;
            }
        L_0x05c2:
            r2.A1L()
            android.widget.TextView r3 = (android.widget.TextView) r3
            if (r3 == 0) goto L_0x05cf
            r0 = 2131889169(0x7f120c11, float:1.9412994E38)
            r3.setText(r0)
        L_0x05cf:
            r0 = 2131887259(0x7f12049b, float:1.940912E38)
        L_0x05d2:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            if (r0 == 0) goto L_0x05e9
            int r1 = r0.intValue()
            X.0zH r0 = X.C18280x3.A0K(r2)
            r0.A0T(r1)
            X.C19340zH.A02(r2, r0)
            r0.A0S()
        L_0x05e9:
            r2.A1M()
            goto L_0x0a3a
        L_0x05ee:
            r2.A1L()
            android.widget.TextView r3 = (android.widget.TextView) r3
            if (r3 == 0) goto L_0x05e9
            r0 = 2131889169(0x7f120c11, float:1.9412994E38)
            goto L_0x061e
        L_0x05f9:
            X.5UY r0 = r2.A0I
            if (r0 == 0) goto L_0x0600
            r0.A06(r1)
        L_0x0600:
            X.5UY r0 = r2.A0I
            if (r0 == 0) goto L_0x060d
            android.view.View r0 = r0.A04()
            if (r0 == 0) goto L_0x060d
            r0.requestFocus()
        L_0x060d:
            com.whatsapp.WaImageView r1 = r2.A06
            if (r1 == 0) goto L_0x0617
            r0 = 2131232380(0x7f08067c, float:1.8080868E38)
            r1.setImageResource(r0)
        L_0x0617:
            android.widget.TextView r3 = (android.widget.TextView) r3
            if (r3 == 0) goto L_0x05e9
            r0 = 2131889163(0x7f120c0b, float:1.9412982E38)
        L_0x061e:
            r3.setText(r0)
            goto L_0x05e9
        L_0x0622:
            r2.A1L()
            android.widget.TextView r3 = (android.widget.TextView) r3
            if (r3 == 0) goto L_0x062f
            r0 = 2131889169(0x7f120c11, float:1.9412994E38)
            r3.setText(r0)
        L_0x062f:
            r0 = 2131889154(0x7f120c02, float:1.9412964E38)
            goto L_0x05d2
        L_0x0633:
            r3 = r4
            goto L_0x05b8
        L_0x0635:
            r2.A1L()
            r2.A1M()
            android.widget.TextView r3 = (android.widget.TextView) r3
            if (r3 == 0) goto L_0x0a3a
            r0 = 2131889183(0x7f120c1f, float:1.9413022E38)
            r3.setText(r0)
            goto L_0x0a3a
        L_0x0647:
            r2.A1L()
            X.5UY r0 = r2.A0M
            if (r0 == 0) goto L_0x0651
            r0.A06(r1)
        L_0x0651:
            X.5UY r0 = r2.A0L
            X.C18300x5.A1H(r0)
            com.whatsapp.WaTextView r1 = r2.A08
            if (r1 == 0) goto L_0x0660
            r0 = 2131889155(0x7f120c03, float:1.9412966E38)
            r1.setText(r0)
        L_0x0660:
            android.widget.LinearLayout r0 = r2.A01
            if (r0 == 0) goto L_0x0a3a
            r0.setOnClickListener(r4)
            goto L_0x0a3a
        L_0x0669:
            X.2yl r12 = (X.C60562yl) r12
            java.lang.Object r4 = r11.A00
            com.whatsapp.events.EventCreationFragment r4 = (com.whatsapp.events.EventCreationFragment) r4
            com.whatsapp.location.PlaceInfo r5 = r12.A01
            r3 = 8
            com.whatsapp.WaTextView r1 = r4.A07
            if (r5 == 0) goto L_0x06b2
            if (r1 == 0) goto L_0x067e
            java.lang.String r0 = r5.A06
            r1.setText(r0)
        L_0x067e:
            java.lang.String r0 = r5.A0B
            r2 = 0
            if (r0 == 0) goto L_0x06aa
            int r0 = r0.length()
            if (r0 == 0) goto L_0x06aa
            X.5UY r0 = r4.A0J
            if (r0 == 0) goto L_0x069a
            android.view.View r1 = r0.A04()
            android.widget.TextView r1 = (android.widget.TextView) r1
            if (r1 == 0) goto L_0x069a
            java.lang.String r0 = r5.A0B
            r1.setText(r0)
        L_0x069a:
            X.5UY r0 = r4.A0J
            if (r0 == 0) goto L_0x06a1
            r0.A06(r2)
        L_0x06a1:
            X.5UY r0 = r4.A0K
            if (r0 == 0) goto L_0x0a3a
            r0.A06(r2)
            goto L_0x0a3a
        L_0x06aa:
            X.5UY r0 = r4.A0J
            if (r0 == 0) goto L_0x06a1
            r0.A06(r3)
            goto L_0x06a1
        L_0x06b2:
            if (r1 == 0) goto L_0x06ba
            r0 = 2131889151(0x7f120bff, float:1.9412957E38)
            r1.setText(r0)
        L_0x06ba:
            X.5UY r0 = r4.A0K
            if (r0 == 0) goto L_0x06c1
            r0.A06(r3)
        L_0x06c1:
            X.5UY r0 = r4.A0J
            if (r0 == 0) goto L_0x0a3a
            r0.A06(r3)
            goto L_0x0a3a
        L_0x06ca:
            X.2yl r12 = (X.C60562yl) r12
            java.lang.Object r2 = r11.A00
            com.whatsapp.events.EventCreationBottomSheet r2 = (com.whatsapp.events.EventCreationBottomSheet) r2
            X.20W r0 = r12.A00
            int r1 = r0.ordinal()
            r0 = 0
            if (r1 == r0) goto L_0x06e1
            r0 = 1
            if (r1 != r0) goto L_0x0a3a
            r2.A1K()
            goto L_0x0a3a
        L_0x06e1:
            X.0df r0 = r2.A0T()
            X.0dc r4 = new X.0dc
            r4.<init>(r0)
            r3 = 2131429054(0x7f0b06be, float:1.847977E38)
            X.66R r0 = r2.A05
            java.lang.Object r2 = r0.getValue()
            com.whatsapp.jid.Jid r2 = (com.whatsapp.jid.Jid) r2
            r0 = 0
            X.C162457s7.A0J(r2, r0)
            android.os.Bundle r1 = X.AnonymousClass002.A08()
            java.lang.String r0 = "jid"
            X.AnonymousClass0x2.A0v(r1, r2, r0)
            com.whatsapp.events.EventCreationFragment r0 = new com.whatsapp.events.EventCreationFragment
            r0.<init>()
            r0.A0u(r1)
            r4.A0A(r0, r3)
            java.lang.String r0 = "EVENT_CREATION_FRAGMENT"
            r4.A0I(r0)
            r4.A01()
            goto L_0x0a3a
        L_0x0717:
            X.34x r12 = (X.C624134x) r12
            if (r12 == 0) goto L_0x0a3a
            java.lang.Object r4 = r11.A00
            X.10y r4 = (X.C194510y) r4
            X.7Dc r3 = r4.A0E(r12)
            X.3gB r2 = r4.A0M
            r1 = 0
            com.whatsapp.conversation.viewmodel.CommentsBottomSheetViewModel$1$5$1$1 r0 = new com.whatsapp.conversation.viewmodel.CommentsBottomSheetViewModel$1$5$1$1
            r0.<init>(r3, r4, r1)
            java.lang.Object r5 = X.C616131n.A00(r13, r2, r0)
            X.218 r0 = X.AnonymousClass218.COROUTINE_SUSPENDED
            if (r5 != r0) goto L_0x0a3a
            return r5
        L_0x0734:
            X.2yU r12 = (X.C60392yU) r12
            android.graphics.Bitmap r2 = r12.A00
            if (r2 == 0) goto L_0x0a3a
            java.lang.Object r0 = r11.A00
            com.whatsapp.conversation.CustomStickerConfirmationDialog r0 = (com.whatsapp.conversation.CustomStickerConfirmationDialog) r0
            android.view.View r1 = r0.A00
            if (r1 == 0) goto L_0x0a3a
            r0 = 2131429253(0x7f0b0785, float:1.8480174E38)
            android.view.View r0 = X.C18280x3.A0E(r1, r0)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r0.setImageBitmap(r2)
            goto L_0x0a3a
        L_0x0750:
            X.3Z6 r12 = (X.AnonymousClass3Z6) r12
            java.lang.Object r2 = r11.A00
            java.util.Map r2 = (java.util.Map) r2
            java.lang.Object r1 = r12.first
            java.lang.Object r0 = r12.second
            r2.put(r1, r0)
            goto L_0x0a3a
        L_0x075f:
            java.util.Collection r12 = (java.util.Collection) r12
            java.lang.Object r5 = r11.A00
            com.whatsapp.community.membersuggestedgroups.MemberSuggestedGroupsManagementActivity r5 = (com.whatsapp.community.membersuggestedgroups.MemberSuggestedGroupsManagementActivity) r5
            X.11y r3 = r5.A06
            java.util.ArrayList r2 = X.C18300x5.A0r(r12)
            r2.addAll(r12)
            java.util.List r1 = r3.A00
            X.11S r0 = new X.11S
            r0.<init>(r1, r2)
            X.C18280x3.A0s(r0, r3, r2, r1)
            com.whatsapp.community.membersuggestedgroups.MemberSuggestedGroupsManagementViewModel r2 = r5.A74()
            X.4Gt r0 = r2.A0O
            java.lang.Object r1 = r0.getValue()
            X.20T r0 = X.AnonymousClass20T.ADMIN
            if (r1 != r0) goto L_0x0a3a
            X.1VX r2 = r2.A08
            r1 = 5078(0x13d6, float:7.116E-42)
            X.2vE r0 = X.C58422vE.A02
            boolean r0 = r2.A0Y(r0, r1)
            if (r0 == 0) goto L_0x0a3a
            com.whatsapp.community.membersuggestedgroups.MemberSuggestedGroupsManagementViewModel r0 = r5.A74()
            int r4 = r0.A00
            if (r4 <= 0) goto L_0x0a3a
            androidx.appcompat.widget.Toolbar r3 = r5.A02
            if (r3 == 0) goto L_0x0a3a
            android.content.res.Resources r2 = r5.getResources()
            r1 = 2131755187(0x7f1000b3, float:1.9141246E38)
            java.lang.Object[] r0 = X.AnonymousClass002.A0L()
            X.C18270x1.A1Q(r0, r4)
            java.lang.String r0 = r2.getQuantityString(r1, r4, r0)
            r3.setSubtitle((java.lang.CharSequence) r0)
            goto L_0x0a3a
        L_0x07b5:
            X.25O r12 = (X.AnonymousClass25O) r12
            java.lang.Object r5 = r11.A00
            com.whatsapp.community.membersuggestedgroups.MemberSuggestedGroupsManagementActivity r5 = (com.whatsapp.community.membersuggestedgroups.MemberSuggestedGroupsManagementActivity) r5
            boolean r0 = r12 instanceof X.AnonymousClass1OG
            if (r0 == 0) goto L_0x07de
            X.4ab r1 = r5.A01
            if (r1 == 0) goto L_0x07c7
            r0 = 3
            r1.A08(r0)
        L_0x07c7:
            X.043 r0 = r5.A00
            if (r0 == 0) goto L_0x07ce
            r0.dismiss()
        L_0x07ce:
            X.0ni r3 = X.AnonymousClass0IT.A00(r5)
            r2 = 0
            com.whatsapp.community.membersuggestedgroups.MemberSuggestedGroupsManagementActivity$onNotification$1 r1 = new com.whatsapp.community.membersuggestedgroups.MemberSuggestedGroupsManagementActivity$onNotification$1
            r1.<init>(r5, r2)
            r0 = 3
            X.C616131n.A02(r2, r1, r3, r2, r0)
            goto L_0x0a3a
        L_0x07de:
            boolean r0 = r12 instanceof X.AnonymousClass1OF
            if (r0 == 0) goto L_0x07f6
            r0 = 2131890926(0x7f1212ee, float:1.9416558E38)
        L_0x07e5:
            java.lang.String r2 = X.C18290x4.A0l(r5, r0)
            android.view.View r1 = r5.A00
            r0 = 0
            X.4ab r0 = X.C88694ab.A01(r1, r2, r0)
        L_0x07f0:
            r0.A05()
            r5.A01 = r0
            goto L_0x07ce
        L_0x07f6:
            boolean r0 = r12 instanceof X.AnonymousClass1OD
            if (r0 == 0) goto L_0x0821
            X.0zH r6 = X.AnonymousClass5V0.A00(r5)
            r0 = 2131890854(0x7f1212a6, float:1.9416412E38)
            r6.A0U(r0)
            r0 = 2131890853(0x7f1212a5, float:1.941641E38)
            r6.A0T(r0)
            r1 = 2131895753(0x7f1225c9, float:1.9426348E38)
            r0 = 50
            X.C19340zH.A03(r5, r6, r0, r1)
            r1 = 2131890581(0x7f121195, float:1.9415858E38)
            r0 = 51
            X.C19340zH.A04(r5, r6, r0, r1)
        L_0x081a:
            X.043 r0 = r6.A0S()
            r5.A00 = r0
            goto L_0x07ce
        L_0x0821:
            boolean r0 = r12 instanceof X.AnonymousClass1OC
            if (r0 == 0) goto L_0x0866
            X.1OC r12 = (X.AnonymousClass1OC) r12
            X.0zH r6 = X.AnonymousClass5V0.A00(r5)
            r0 = 2131890854(0x7f1212a6, float:1.9416412E38)
            r6.A0U(r0)
            android.content.res.Resources r4 = r5.getResources()
            r3 = 2131755200(0x7f1000c0, float:1.9141273E38)
            int r2 = r12.A01
            java.lang.Object[] r1 = X.AnonymousClass002.A0M()
            int r0 = r12.A00
            X.AnonymousClass000.A1L(r1, r0)
            X.AnonymousClass000.A1M(r1, r2)
            java.lang.String r0 = r4.getQuantityString(r3, r2, r1)
            r6.A0g(r0)
            r1 = 2131895753(0x7f1225c9, float:1.9426348E38)
            r0 = 52
            X.C19340zH.A03(r5, r6, r0, r1)
            r0 = 2131890848(0x7f1212a0, float:1.94164E38)
            java.lang.String r2 = r5.getString(r0)
            r1 = 0
            X.4K7 r0 = new X.4K7
            r0.<init>(r12, r1, r5)
            r6.A0f(r5, r0, r2)
            goto L_0x081a
        L_0x0866:
            boolean r0 = r12 instanceof X.AnonymousClass1OH
            if (r0 == 0) goto L_0x08a0
            r4 = 2131755201(0x7f1000c1, float:1.9141275E38)
        L_0x086d:
            X.1OB r12 = (X.AnonymousClass1OB) r12
            android.content.res.Resources r3 = r5.getResources()
            boolean r0 = r12 instanceof X.AnonymousClass1OJ
            if (r0 == 0) goto L_0x0892
            X.1OJ r12 = (X.AnonymousClass1OJ) r12
            int r1 = r12.A00
        L_0x087b:
            java.lang.Object[] r0 = X.AnonymousClass002.A0L()
            boolean r2 = X.C18300x5.A1Y(r0, r1)
            java.lang.String r1 = r3.getQuantityString(r4, r1, r0)
            X.C162457s7.A0D(r1)
            android.view.View r0 = r5.A00
            X.4ab r0 = X.C88694ab.A01(r0, r1, r2)
            goto L_0x07f0
        L_0x0892:
            boolean r0 = r12 instanceof X.AnonymousClass1OI
            if (r0 == 0) goto L_0x089b
            X.1OI r12 = (X.AnonymousClass1OI) r12
            int r1 = r12.A00
            goto L_0x087b
        L_0x089b:
            X.1OH r12 = (X.AnonymousClass1OH) r12
            int r1 = r12.A00
            goto L_0x087b
        L_0x08a0:
            boolean r0 = r12 instanceof X.AnonymousClass1OJ
            if (r0 == 0) goto L_0x08a8
            r4 = 2131755203(0x7f1000c3, float:1.9141279E38)
            goto L_0x086d
        L_0x08a8:
            boolean r0 = r12 instanceof X.AnonymousClass1OI
            if (r0 == 0) goto L_0x08b0
            r4 = 2131755202(0x7f1000c2, float:1.9141277E38)
            goto L_0x086d
        L_0x08b0:
            boolean r0 = r12 instanceof X.AnonymousClass1OE
            if (r0 == 0) goto L_0x07ce
            r0 = 2131889642(0x7f120dea, float:1.9413953E38)
            goto L_0x07e5
        L_0x08b9:
            X.3Z6 r12 = (X.AnonymousClass3Z6) r12
            java.lang.Object r4 = r11.A00
            com.whatsapp.community.membersuggestedgroups.MemberSuggestedGroupsManagementActivity r4 = (com.whatsapp.community.membersuggestedgroups.MemberSuggestedGroupsManagementActivity) r4
            X.66R r0 = r4.A0A
            r0.getValue()
            java.lang.Object r8 = r12.first
            X.3Z6 r8 = (X.AnonymousClass3Z6) r8
            java.lang.Object r2 = r12.second
            X.20T r0 = X.AnonymousClass20T.MEMBER
            r1 = 8
            if (r2 == r0) goto L_0x0946
            int r0 = X.AnonymousClass3Z6.A00(r8)
            float r7 = (float) r0
            java.lang.Object r0 = r8.second
            int r0 = X.AnonymousClass001.A0K(r0)
            float r0 = (float) r0
            float r7 = r7 / r0
            double r2 = (double) r7
            r5 = 4605380978949069210(0x3fe999999999999a, double:0.8)
            int r0 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r0 < 0) goto L_0x0946
            r1 = 0
            int r0 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r0 < 0) goto L_0x0930
            r0 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r0 >= 0) goto L_0x0930
            r4.A75(r1)
            X.66R r0 = r4.A09
            java.lang.Object r6 = X.C18300x5.A0d(r0)
            com.whatsapp.WaTextView r6 = (com.whatsapp.WaTextView) r6
            r7 = 2131890851(0x7f1212a3, float:1.9416405E38)
        L_0x0900:
            X.5a2 r5 = r4.A04
            if (r5 == 0) goto L_0x093f
            android.content.Context r3 = r6.getContext()
            java.lang.Object[] r2 = X.AnonymousClass002.A0M()
            java.lang.Object r1 = r8.first
            r0 = 0
            r2[r0] = r1
            r1 = 1
            java.lang.Object r0 = r8.second
            java.lang.String r2 = X.AnonymousClass002.A0F(r4, r0, r2, r1, r7)
            r0 = 27
            X.3bu r1 = X.C71313bu.A00(r4, r0)
            java.lang.String r0 = "manage_groups_link"
            android.text.SpannableStringBuilder r0 = r5.A05(r3, r1, r2, r0)
            r6.setText(r0)
            X.1VX r0 = r6.getAbProps()
            X.AnonymousClass1Hf.A2C(r6, r4, r0)
            goto L_0x0a3a
        L_0x0930:
            r4.A75(r1)
            X.66R r0 = r4.A09
            java.lang.Object r6 = X.C18300x5.A0d(r0)
            com.whatsapp.WaTextView r6 = (com.whatsapp.WaTextView) r6
            r7 = 2131890852(0x7f1212a4, float:1.9416408E38)
            goto L_0x0900
        L_0x093f:
            java.lang.String r0 = "linkifier"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x0946:
            r4.A75(r1)
            goto L_0x0a3a
        L_0x094b:
            X.20T r12 = (X.AnonymousClass20T) r12
            java.lang.Object r0 = r11.A00
            com.whatsapp.community.membersuggestedgroups.MemberSuggestedGroupsManagementActivity r0 = (com.whatsapp.community.membersuggestedgroups.MemberSuggestedGroupsManagementActivity) r0
            X.66R r0 = r0.A07
            java.lang.Object r2 = X.C18300x5.A0d(r0)
            android.view.View r2 = (android.view.View) r2
            int r1 = r12.ordinal()
            r0 = 0
            if (r1 == r0) goto L_0x0965
            r0 = 1
            if (r1 != r0) goto L_0x0a3a
            r0 = 8
        L_0x0965:
            r2.setVisibility(r0)
            goto L_0x0a3a
        L_0x096a:
            boolean r0 = r13 instanceof X.C74113gb
            if (r0 == 0) goto L_0x098c
            r6 = r13
            X.3gb r6 = (X.C74113gb) r6
            int r2 = r6.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x098c
            int r2 = r2 - r1
            r6.label = r2
        L_0x097c:
            java.lang.Object r1 = r6.result
            X.218 r5 = X.AnonymousClass218.COROUTINE_SUSPENDED
            int r0 = r6.label
            r7 = 1
            if (r0 == 0) goto L_0x0997
            if (r0 == r7) goto L_0x0992
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0d()
            throw r0
        L_0x098c:
            X.3gb r6 = new X.3gb
            r6.<init>(r11, r13)
            goto L_0x097c
        L_0x0992:
            X.C57682u2.A01(r1)
            goto L_0x0a3a
        L_0x0997:
            X.C57682u2.A01(r1)
            java.lang.Object r4 = r11.A00
            X.4C9 r4 = (X.AnonymousClass4C9) r4
            java.util.Collection r12 = (java.util.Collection) r12
            r3 = 0
            if (r12 == 0) goto L_0x09b6
            boolean r0 = r12.isEmpty()
            if (r0 == 0) goto L_0x09b6
        L_0x09a9:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r3)
            r6.label = r7
            java.lang.Object r0 = r4.B2K(r0, r6)
        L_0x09b3:
            if (r0 != r5) goto L_0x0a3a
            return r5
        L_0x09b6:
            java.util.Iterator r2 = r12.iterator()
        L_0x09ba:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x09a9
            java.lang.Object r1 = r2.next()
            X.2jj r1 = (X.C51382jj) r1
            int r0 = r1.A00
            if (r0 != r7) goto L_0x09ba
            java.lang.Object r1 = r1.A01
            boolean r0 = r1 instanceof X.C53402n2
            if (r0 == 0) goto L_0x09ba
            X.2n2 r1 = (X.C53402n2) r1
            if (r1 == 0) goto L_0x09ba
            int r0 = r1.A00
            if (r0 != 0) goto L_0x09ba
            r3 = 1
            goto L_0x09a9
        L_0x09da:
            boolean r2 = X.AnonymousClass001.A1Z(r12)
            java.lang.Object r0 = r11.A00
            com.whatsapp.community.membersuggestedgroups.MemberSuggestedGroupsManagementActivity r0 = (com.whatsapp.community.membersuggestedgroups.MemberSuggestedGroupsManagementActivity) r0
            X.66R r0 = r0.A07
            java.lang.Object r1 = X.C18300x5.A0d(r0)
            android.view.View r1 = (android.view.View) r1
            int r0 = X.AnonymousClass001.A08(r2)
            r1.setVisibility(r0)
            goto L_0x0a3a
        L_0x09f2:
            X.2yT r12 = (X.C60382yT) r12
            java.lang.Object r0 = r11.A00
            com.whatsapp.chatinfo.EventsActivity r0 = (com.whatsapp.chatinfo.EventsActivity) r0
            java.util.List r3 = r12.A00
            if (r3 == 0) goto L_0x0a3a
            X.11u r2 = r0.A04
            java.util.List r1 = r2.A00
            X.11Q r0 = new X.11Q
            r0.<init>(r1, r3)
            X.C18280x3.A0s(r0, r2, r3, r1)
            goto L_0x0a3a
        L_0x0a09:
            X.2yf r12 = (X.C60502yf) r12
            java.lang.Object r2 = r11.A00
            com.whatsapp.calling.psa.view.GroupCallPsaBottomSheet r2 = (com.whatsapp.calling.psa.view.GroupCallPsaBottomSheet) r2
            android.widget.TextView r1 = r2.A00
            if (r1 == 0) goto L_0x0a1c
            int r0 = r12.A00
            int r0 = X.AnonymousClass001.A08(r0)
            r1.setVisibility(r0)
        L_0x0a1c:
            android.widget.TextView r0 = r2.A00
            if (r0 == 0) goto L_0x0a2f
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L_0x0a2f
            android.widget.TextView r1 = r2.A00
            if (r1 == 0) goto L_0x0a2f
            int r0 = r12.A00
            r1.setText(r0)
        L_0x0a2f:
            X.11w r1 = r2.A02
            if (r1 == 0) goto L_0x0a3d
            java.util.List r0 = r12.A01
            r1.A01 = r0
            r1.A05()
        L_0x0a3a:
            X.2wD r5 = X.C59022wD.A00
            return r5
        L_0x0a3d:
            java.lang.String r0 = "adapter"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C86054Iq.B2K(java.lang.Object, X.4Du):java.lang.Object");
    }
}
