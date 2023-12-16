package X;

import java.util.Map;

/* renamed from: X.6nh  reason: invalid class name and case insensitive filesystem */
public final class C137056nh extends AnonymousClass7SR {
    public Map A00;
    public final AnonymousClass2VM A01;
    public final C157187ht A02;
    public final C44522Wj A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final Map A08;
    public final Map A09;
    public final Map A0A;

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0056, code lost:
        if (r1 == null) goto L_0x0058;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A00(X.C150577Ri r7, X.C60752z6 r8, java.util.Map r9, java.util.Map r10) {
        /*
            r6 = this;
            if (r8 == 0) goto L_0x002e
            java.lang.String r1 = r8.A02
            X.7ht r0 = r6.A02
            if (r0 == 0) goto L_0x000e
            java.lang.String r5 = r0.A00(r1)
            if (r5 != 0) goto L_0x0030
        L_0x000e:
            X.7lA r2 = r7.A00
            X.7Zw r1 = r2.A07
            if (r1 == 0) goto L_0x002a
            X.7Tw r0 = r2.A01
            if (r0 != 0) goto L_0x001f
            java.lang.String r0 = "flowManager"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x001f:
            java.util.Stack r0 = r0.A03
            java.lang.Object r0 = X.C162457s7.A03(r0)
            java.lang.String r0 = (java.lang.String) r0
            r1.A01(r0)
        L_0x002a:
            r2.A08(r8, r10)
            return
        L_0x002e:
            java.lang.String r5 = r6.A00
        L_0x0030:
            if (r9 != 0) goto L_0x0036
            java.util.Map r9 = X.C73813g7.A0A()
        L_0x0036:
            java.util.Map r0 = r6.A08
            java.util.Map r4 = X.C160977ol.A02(r9, r0)
            java.lang.String r3 = r6.A06
            if (r10 != 0) goto L_0x0044
            java.util.Map r10 = X.C73813g7.A0A()
        L_0x0044:
            java.util.Map r0 = r6.A0A
            X.7I6 r2 = new X.7I6
            r2.<init>(r10)
            if (r0 == 0) goto L_0x0058
            java.lang.Object r1 = X.C160977ol.A00(r2, r0)
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.Any"
            X.C162457s7.A0K(r1, r0)
            if (r1 != 0) goto L_0x005a
        L_0x0058:
            java.util.Map r1 = r2.A01
        L_0x005a:
            java.util.Map r1 = (java.util.Map) r1
            java.util.Map r0 = X.C160977ol.A01(r3, r4, r1)
            r7.A00(r5, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C137056nh.A00(X.7Ri, X.2z6, java.util.Map, java.util.Map):void");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C137056nh(AnonymousClass2VM r2, C157187ht r3, C44522Wj r4, String str, String str2, String str3, String str4, String str5, String str6, Map map, Map map2, Map map3) {
        super(str, str2);
        C18260x0.A0V(r4, r2, str);
        C162457s7.A0J(str4, 10);
        C18270x1.A13(str5, str6);
        this.A03 = r4;
        this.A01 = r2;
        this.A08 = map;
        this.A09 = map2;
        this.A0A = map3;
        this.A06 = str3;
        this.A02 = r3;
        this.A05 = str4;
        this.A07 = str5;
        this.A04 = str6;
    }
}
