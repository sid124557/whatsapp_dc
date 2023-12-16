package X;

import android.content.Context;

/* renamed from: X.1pN  reason: invalid class name and case insensitive filesystem */
public class C32011pN extends AnonymousClass315 {
    public final AnonymousClass1VX A00;
    public final C51992ki A01;
    public final C54472om A02;
    public final C50222hp A03;

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001b, code lost:
        if (r2.A05 == null) goto L_0x001d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String A07() {
        /*
            r7 = this;
            java.lang.String r5 = ""
            java.lang.String r1 = super.A07()
            boolean r0 = X.C107575bX.A0F(r1)
            if (r0 == 0) goto L_0x000d
            return r1
        L_0x000d:
            java.lang.StringBuilder r4 = X.C18330xA.A0A(r1)
            X.39W r2 = r7.A02
            int r1 = r2.A00
            r0 = 7
            if (r1 != r0) goto L_0x001d
            X.38e r1 = r2.A05
            r0 = 1
            if (r1 != 0) goto L_0x001e
        L_0x001d:
            r0 = 0
        L_0x001e:
            if (r0 == 0) goto L_0x0086
            X.38e r0 = r2.A05
            java.util.List r0 = r0.A00
            java.util.Iterator r6 = r0.iterator()
        L_0x0028:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x0086
            java.lang.Object r2 = r6.next()
            X.39W r2 = (X.AnonymousClass39W) r2
            X.2hp r0 = r7.A03
            X.315 r0 = r0.A00(r2)
            java.lang.String r1 = r0.A07()
            java.lang.String r0 = "\n"
            X.AnonymousClass315.A02(r1, r0, r4)
            boolean r0 = r2.A04()
            if (r0 == 0) goto L_0x0028
            X.39P r0 = r2.A03
            java.util.List r0 = r0.A03
            if (r0 == 0) goto L_0x0028
            java.util.Iterator r3 = r0.iterator()
        L_0x0053:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0028
            java.lang.Object r0 = r3.next()
            X.395 r0 = (X.AnonymousClass395) r0
            X.398 r0 = r0.A01
            if (r0 == 0) goto L_0x0053
            java.lang.String r2 = r0.A01
            boolean r0 = X.C107575bX.A0F(r2)
            if (r0 != 0) goto L_0x0053
            org.json.JSONObject r1 = X.AnonymousClass0x9.A1H(r2)     // Catch:{ JSONException -> 0x0076 }
            java.lang.String r0 = "display_text"
            java.lang.String r1 = r1.optString(r0, r5)     // Catch:{ JSONException -> 0x0076 }
            goto L_0x0080
        L_0x0076:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "CarouselMessageCustomizer/getEmailExportText: Failed to create json object from button params json = "
            X.C18260x0.A0r(r0, r2, r1)
            r1 = r5
        L_0x0080:
            java.lang.String r0 = "\n "
            X.AnonymousClass315.A02(r1, r0, r4)
            goto L_0x0053
        L_0x0086:
            java.lang.String r0 = r4.toString()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C32011pN.A07():java.lang.String");
    }

    public String A0B(Context context) {
        if (!this.A00.A0Y(C58422vE.A02, 4668)) {
            return null;
        }
        return super.A0B(context);
    }

    public C32011pN(AnonymousClass1VX r1, AnonymousClass39W r2, C51992ki r3, C54472om r4, C41882Ly r5, C50222hp r6) {
        super(r2, r5);
        this.A00 = r1;
        this.A03 = r6;
        this.A01 = r3;
        this.A02 = r4;
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x00c8  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00ce A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0C(X.C55032pg r13, X.C624134x r14) {
        /*
            r12 = this;
            super.A0C(r13, r14)
            boolean r0 = X.AnonymousClass36V.A07(r14)
            if (r0 == 0) goto L_0x0113
            X.1n7 r14 = (X.C30791n7) r14
            java.util.List r5 = r14.A01
            X.1A4 r3 = r13.A00
            X.6c9 r4 = X.AnonymousClass1A4.A01(r3)
            X.6cX r2 = r4.A00
            X.1ER r2 = (X.AnonymousClass1ER) r2
            int r1 = r2.interactiveMessageCase_
            r0 = 7
            if (r1 != r0) goto L_0x00ff
            java.lang.Object r0 = r2.interactiveMessage_
            X.6cX r0 = (X.C130786cX) r0
        L_0x0020:
            X.6c9 r6 = r0.A0H()
            if (r5 == 0) goto L_0x0103
            java.util.Iterator r11 = r5.iterator()
        L_0x002a:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L_0x0103
            X.34x r9 = X.C18300x5.A0T(r11)
            boolean r2 = r9 instanceof X.AnonymousClass4DV
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "CarouselMessageCustomizer/buildCardMessage: message type is not supported "
            X.C18260x0.A0l(r9, r0, r1, r2)
            X.1A4 r0 = X.C18300x5.A0R()
            X.2cu r1 = X.C47222cu.A00(r0)
            r0 = 1
            r1.A02 = r0
            X.2pg r8 = r1.A01()
            X.2hp r1 = r12.A03
            r0 = r9
            X.4DV r0 = (X.AnonymousClass4DV) r0
            X.315 r0 = r1.A01(r0)
            r0.A0C(r8, r9)
            X.1A4 r0 = r8.A00
            X.6c9 r7 = X.AnonymousClass1A4.A01(r0)
            X.6cX r0 = r7.A00
            X.1ER r0 = (X.AnonymousClass1ER) r0
            X.1DR r0 = r0.header_
            if (r0 != 0) goto L_0x006a
            X.1DR r0 = X.AnonymousClass1DR.DEFAULT_INSTANCE
        L_0x006a:
            X.6c9 r5 = r0.A0H()
            X.19w r5 = (X.C209319w) r5
            boolean r0 = r9 instanceof X.AnonymousClass1n1
            if (r0 == 0) goto L_0x00d6
            X.2ki r10 = r12.A01
            X.1nA r9 = (X.AnonymousClass1nA) r9
            X.6cX r2 = r5.A00
            X.1DR r2 = (X.AnonymousClass1DR) r2
            int r1 = r2.mediaCase_
            r0 = 4
            if (r1 != r0) goto L_0x00d3
            java.lang.Object r0 = r2.media_
            X.6cX r0 = (X.C130786cX) r0
        L_0x0085:
            X.6c9 r0 = r0.A0H()
            X.19b r0 = (X.C207219b) r0
            X.19b r0 = r10.A01(r8, r0, r9)
            if (r0 == 0) goto L_0x0098
            X.1DR r1 = X.C18310x6.A0V(r5, r0)
            r0 = 4
        L_0x0096:
            r1.mediaCase_ = r0
        L_0x0098:
            r5.A09()
        L_0x009b:
            X.6cX r1 = X.C18320x8.A0C(r7)
            X.1ER r1 = (X.AnonymousClass1ER) r1
            X.6cX r0 = r5.A06()
            X.1DR r0 = (X.AnonymousClass1DR) r0
            r0.getClass()
            r1.header_ = r0
            int r0 = r1.bitField0_
            r0 = r0 | 1
            r1.bitField0_ = r0
            X.6cX r5 = X.C18320x8.A0C(r6)
            X.1BG r5 = (X.AnonymousClass1BG) r5
            X.6cX r2 = r7.A06()
            r2.getClass()
            X.8ya r1 = r5.cards_
            r0 = r1
            X.8T6 r0 = (X.AnonymousClass8T6) r0
            boolean r0 = r0.A00
            if (r0 != 0) goto L_0x00ce
            X.8ya r1 = X.C130786cX.A07(r1)
            r5.cards_ = r1
        L_0x00ce:
            r1.add(r2)
            goto L_0x002a
        L_0x00d3:
            X.1EE r0 = X.AnonymousClass1EE.DEFAULT_INSTANCE
            goto L_0x0085
        L_0x00d6:
            boolean r0 = r9 instanceof X.C31941p8
            if (r0 == 0) goto L_0x009b
            X.6cX r2 = r5.A00
            X.1DR r2 = (X.AnonymousClass1DR) r2
            int r1 = r2.mediaCase_
            r0 = 7
            if (r1 != r0) goto L_0x00fc
            java.lang.Object r0 = r2.media_
            X.6cX r0 = (X.C130786cX) r0
        L_0x00e7:
            X.6c9 r1 = r0.A0H()
            X.19y r1 = (X.C209519y) r1
            X.2om r0 = r12.A02
            X.1nB r9 = (X.AnonymousClass1nB) r9
            r0.A02(r8, r1, r9)
            if (r1 == 0) goto L_0x0098
            X.1DR r1 = X.C18310x6.A0V(r5, r1)
            r0 = 7
            goto L_0x0096
        L_0x00fc:
            X.1ED r0 = X.AnonymousClass1ED.DEFAULT_INSTANCE
            goto L_0x00e7
        L_0x00ff:
            X.1BG r0 = X.AnonymousClass1BG.DEFAULT_INSTANCE
            goto L_0x0020
        L_0x0103:
            X.1ER r1 = X.AnonymousClass315.A01(r4, r6)
            r0 = 7
            r1.interactiveMessageCase_ = r0
            X.6cX r0 = r4.A06()
            X.1ER r0 = (X.AnonymousClass1ER) r0
            r3.A0C(r0)
        L_0x0113:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C32011pN.A0C(X.2pg, X.34x):void");
    }
}
