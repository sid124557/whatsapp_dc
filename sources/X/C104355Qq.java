package X;

/* renamed from: X.5Qq  reason: invalid class name and case insensitive filesystem */
public class C104355Qq {
    public final C69263Wi A00;
    public final C66663Mh A01;
    public final AnonymousClass33p A02;
    public final C55622qe A03;
    public final C29041iB A04;
    public final AnonymousClass5Y0 A05;
    public final AnonymousClass1VX A06;
    public final C66653Mg A07;
    public final AnonymousClass4FS A08;

    public void A01(C95814uZ r5, AnonymousClass66M r6) {
        C993555k r1 = new C993555k(this.A03, r5, r6);
        C18270x1.A0w(r1, this.A08);
        this.A00.A0T(new C71573cK(r1, 44, r6), 500);
    }

    public C104355Qq(C69263Wi r1, C66663Mh r2, AnonymousClass33p r3, C55622qe r4, C29041iB r5, AnonymousClass5Y0 r6, AnonymousClass1VX r7, C66653Mg r8, AnonymousClass4FS r9) {
        this.A06 = r7;
        this.A00 = r1;
        this.A08 = r9;
        this.A05 = r6;
        this.A01 = r2;
        this.A07 = r8;
        this.A03 = r4;
        this.A02 = r3;
        this.A04 = r5;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00a2, code lost:
        if (r5 > 1) goto L_0x00a4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00dd, code lost:
        if (r5 > 1) goto L_0x00df;
     */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0098  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00d8  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.AnonymousClass0Uj A00(android.content.Context r15, X.AnonymousClass66L r16, int r17, int r18, int r19, boolean r20) {
        /*
            r14 = this;
            android.view.LayoutInflater r1 = android.view.LayoutInflater.from(r15)
            r0 = 2131624757(0x7f0e0335, float:1.8876703E38)
            android.view.View r7 = X.C18310x6.A0H(r1, r0)
            r0 = 2131429369(0x7f0b07f9, float:1.8480409E38)
            android.view.View r3 = X.C06560Yg.A02(r7, r0)
            r0 = 2131429387(0x7f0b080b, float:1.8480445E38)
            android.view.View r2 = X.C06560Yg.A02(r7, r0)
            r0 = 2131429367(0x7f0b07f7, float:1.8480405E38)
            android.view.View r8 = X.C06560Yg.A02(r7, r0)
            android.widget.CheckBox r8 = (android.widget.CheckBox) r8
            r0 = 2131429368(0x7f0b07f8, float:1.8480407E38)
            android.widget.TextView r6 = X.C18300x5.A0G(r7, r0)
            r11 = r14
            X.33p r0 = r14.A02
            android.content.SharedPreferences r1 = X.AnonymousClass0x2.A0F(r0)
            java.lang.String r0 = "pref_media_delete_per_conversation"
            boolean r13 = X.C18280x3.A1W(r1, r0)
            r0 = 2131429386(0x7f0b080a, float:1.8480443E38)
            android.view.View r9 = X.C06560Yg.A02(r7, r0)
            android.widget.CheckBox r9 = (android.widget.CheckBox) r9
            r1 = 1
            r12 = r19
            if (r19 == 0) goto L_0x0049
            r0 = 1
            r1 = 0
            if (r12 == r0) goto L_0x0049
            r1 = r13
        L_0x0049:
            r8.setChecked(r1)
            r4 = -1
            r1 = 2131888514(0x7f120982, float:1.9411665E38)
            r5 = r17
            if (r5 == r4) goto L_0x005d
            r0 = 1
            r1 = 2131888549(0x7f1209a5, float:1.9411736E38)
            if (r5 != r0) goto L_0x005d
            r1 = 2131888550(0x7f1209a6, float:1.9411738E38)
        L_0x005d:
            java.lang.String r0 = r15.getString(r1)
            r6.setText(r0)
            int r0 = X.AnonymousClass001.A08(r20)
            r2.setVisibility(r0)
            r0 = 29
            X.C109395eY.A00(r3, r8, r0)
            r0 = 30
            X.C109395eY.A00(r2, r9, r0)
            r2 = 0
            r3 = 1
            r6 = r18
            if (r18 == 0) goto L_0x00fb
            if (r6 == r3) goto L_0x00ef
            r0 = 2
            if (r6 == r0) goto L_0x00e3
            r0 = 2131887798(0x7f1206b6, float:1.9410213E38)
            if (r5 != r4) goto L_0x0088
            r0 = 2131887787(0x7f1206ab, float:1.941019E38)
        L_0x0088:
            java.lang.String r0 = r15.getString(r0)
        L_0x008c:
            X.0zH r2 = X.AnonymousClass5V0.A00(r15)
            r2.A0h(r0)
            r2.A0a(r7)
            if (r18 == 0) goto L_0x00d8
            if (r6 == r3) goto L_0x00cc
            r0 = 2
            if (r6 == r0) goto L_0x00c0
            if (r5 == r4) goto L_0x00a4
            r0 = 2131887796(0x7f1206b4, float:1.941021E38)
            if (r5 <= r3) goto L_0x00a7
        L_0x00a4:
            r0 = 2131887795(0x7f1206b3, float:1.9410207E38)
        L_0x00a7:
            java.lang.String r1 = r15.getString(r0)
            X.5cJ r7 = new X.5cJ
            r10 = r16
            r7.<init>(r8, r9, r10, r11, r12, r13)
            X.0Uj r0 = r2.A00
            r0.A0I(r7, r1)
            r1 = 2131895731(0x7f1225b3, float:1.9426303E38)
            r0 = 134(0x86, float:1.88E-43)
            X.C1235268t.A04(r2, r10, r0, r1)
            return r2
        L_0x00c0:
            if (r5 == r3) goto L_0x00c3
            r3 = 0
        L_0x00c3:
            java.lang.String r0 = "Use DELETE_GROUP_CHAT only for single group deletion"
            X.C626936e.A0D(r3, r0)
            r0 = 2131888538(0x7f12099a, float:1.9411714E38)
            goto L_0x00a7
        L_0x00cc:
            if (r5 == r3) goto L_0x00cf
            r3 = 0
        L_0x00cf:
            java.lang.String r0 = "Use DELETE_BROADCAST_LIST only for single broadcast deletion"
            X.C626936e.A0D(r3, r0)
            r0 = 2131888522(0x7f12098a, float:1.9411682E38)
            goto L_0x00a7
        L_0x00d8:
            if (r5 == r4) goto L_0x00df
            r0 = 2131888567(0x7f1209b7, float:1.9411773E38)
            if (r5 <= r3) goto L_0x00a7
        L_0x00df:
            r0 = 2131888551(0x7f1209a7, float:1.941174E38)
            goto L_0x00a7
        L_0x00e3:
            if (r5 != r3) goto L_0x00e6
            r2 = 1
        L_0x00e6:
            java.lang.String r0 = "Use DELETE_SINGLE_GROUP_CHAT only for single broadcast deletion"
            X.C626936e.A0F(r2, r0)
            r0 = 2131888541(0x7f12099d, float:1.941172E38)
            goto L_0x0088
        L_0x00ef:
            if (r5 != r3) goto L_0x00f2
            r2 = 1
        L_0x00f2:
            java.lang.String r0 = "Use DELETE_SINGLE_BROADCAST_LIST only for single broadcast deletion"
            X.C626936e.A0F(r2, r0)
            r0 = 2131888523(0x7f12098b, float:1.9411684E38)
            goto L_0x0088
        L_0x00fb:
            if (r5 != r4) goto L_0x0101
            r0 = 2131888512(0x7f120980, float:1.9411661E38)
            goto L_0x0088
        L_0x0101:
            android.content.res.Resources r1 = r15.getResources()
            r0 = 2131755062(0x7f100036, float:1.9140993E38)
            java.lang.String r0 = X.AnonymousClass0x2.A0Y(r1, r5, r2, r0)
            goto L_0x008c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C104355Qq.A00(android.content.Context, X.66L, int, int, int, boolean):X.0Uj");
    }
}
