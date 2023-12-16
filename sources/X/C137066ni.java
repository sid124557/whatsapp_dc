package X;

import java.util.Map;

/* renamed from: X.6ni  reason: invalid class name and case insensitive filesystem */
public final class C137066ni extends AnonymousClass7SR {
    public final C157187ht A00;
    public final Object A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final Map A06;
    public final Map A07;
    public final Map A08;

    public final String A00() {
        return AnonymousClass0x2.A0e(this.A01, AnonymousClass000.A0l(this.A02), ':');
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0026, code lost:
        if (r1 == null) goto L_0x0028;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.Map A01(java.util.Map r6, java.util.Map r7) {
        /*
            r5 = this;
            if (r6 != 0) goto L_0x0006
            java.util.Map r6 = X.C73813g7.A0A()
        L_0x0006:
            java.util.Map r0 = r5.A06
            java.util.Map r4 = X.C160977ol.A02(r6, r0)
            java.lang.String r3 = r5.A05
            if (r7 != 0) goto L_0x0014
            java.util.Map r7 = X.C73813g7.A0A()
        L_0x0014:
            java.util.Map r0 = r5.A08
            X.7I6 r2 = new X.7I6
            r2.<init>(r7)
            if (r0 == 0) goto L_0x0028
            java.lang.Object r1 = X.C160977ol.A00(r2, r0)
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.Any"
            X.C162457s7.A0K(r1, r0)
            if (r1 != 0) goto L_0x002a
        L_0x0028:
            java.util.Map r1 = r2.A01
        L_0x002a:
            java.util.Map r1 = (java.util.Map) r1
            java.util.Map r0 = X.C160977ol.A01(r3, r4, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C137066ni.A01(java.util.Map, java.util.Map):java.util.Map");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C137066ni(C157187ht r2, Object obj, String str, String str2, String str3, String str4, String str5, String str6, Map map, Map map2, Map map3) {
        super(str2, str5);
        C18260x0.A0S(str2, str3);
        C162457s7.A0J(str6, 10);
        this.A02 = str;
        this.A04 = str3;
        this.A06 = map;
        this.A07 = map2;
        this.A08 = map3;
        this.A05 = str4;
        this.A00 = r2;
        this.A03 = str6;
        this.A01 = obj;
    }
}
