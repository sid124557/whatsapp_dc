package X;

/* renamed from: X.1QK  reason: invalid class name */
public final class AnonymousClass1QK extends C56692sP {
    public final AnonymousClass66R A00;
    public final AnonymousClass66R A01;
    public final AnonymousClass66R A02;
    public final AnonymousClass66R A03;

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0019, code lost:
        if (X.C175738Zn.A0V(r3) != false) goto L_0x001b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String A0C(java.lang.String r7) {
        /*
            r6 = this;
            java.lang.String r4 = "ViewCatalogAction/extractBizPhone"
            r5 = 0
            if (r7 == 0) goto L_0x0010
            org.json.JSONObject r1 = X.AnonymousClass0x9.A1H(r7)     // Catch:{ JSONException -> 0x002c }
            java.lang.String r0 = "business_phone_number"
            java.lang.String r3 = r1.getString(r0)     // Catch:{ JSONException -> 0x002c }
            goto L_0x0011
        L_0x0010:
            r3 = r5
        L_0x0011:
            r2 = 0
            if (r3 == 0) goto L_0x001b
            boolean r1 = X.C175738Zn.A0V(r3)     // Catch:{ JSONException -> 0x002c }
            r0 = 0
            if (r1 == 0) goto L_0x001c
        L_0x001b:
            r0 = 1
        L_0x001c:
            if (r0 == 0) goto L_0x003b
            X.66R r0 = r6.A01     // Catch:{ JSONException -> 0x002c }
            java.lang.Object r1 = r0.getValue()     // Catch:{ JSONException -> 0x002c }
            X.2qk r1 = (X.C55682qk) r1     // Catch:{ JSONException -> 0x002c }
            java.lang.String r0 = "business_phone_number in params json is either null or incorrect phone number"
            r1.A0A(r4, r2, r0)     // Catch:{ JSONException -> 0x002c }
            return r3
        L_0x002c:
            r2 = move-exception
            X.66R r0 = r6.A01
            java.lang.Object r1 = r0.getValue()
            X.2qk r1 = (X.C55682qk) r1
            java.lang.String r0 = "action param is invalid json"
            r1.A09(r4, r0, r2)
            return r5
        L_0x003b:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1QK.A0C(java.lang.String):java.lang.String");
    }

    public AnonymousClass1QK(C183538qC r3, C183538qC r4, C183538qC r5, C183538qC r6) {
        C18260x0.A0c(r3, r4, r5, r6);
        this.A02 = C154517dI.A01(new AnonymousClass27G(r3, 6));
        this.A01 = C154517dI.A01(new AnonymousClass27G(r4, 5));
        this.A00 = C154517dI.A01(new AnonymousClass27G(r5, 4));
        this.A03 = C154517dI.A01(new AnonymousClass27G(r6, 7));
    }
}
