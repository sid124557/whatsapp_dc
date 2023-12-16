package X;

/* renamed from: X.1QJ  reason: invalid class name */
public final class AnonymousClass1QJ extends C56692sP {
    public final C111095hX A00;
    public final C55682qk A01;
    public final AnonymousClass4FV A02;

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001a, code lost:
        if (X.C175738Zn.A0V(r3) != false) goto L_0x001c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String A0C(java.lang.String r7) {
        /*
            r6 = this;
            java.lang.String r5 = "LandLineCallAction/extractPhoneNumber"
            r4 = 0
            if (r7 == 0) goto L_0x0011
            org.json.JSONObject r1 = X.AnonymousClass0x9.A1H(r7)     // Catch:{ JSONException -> 0x0028 }
            java.lang.String r0 = "number"
            java.lang.String r3 = r1.getString(r0)     // Catch:{ JSONException -> 0x0028 }
            goto L_0x0012
        L_0x0011:
            r3 = r4
        L_0x0012:
            r2 = 0
            if (r3 == 0) goto L_0x001c
            boolean r1 = X.C175738Zn.A0V(r3)     // Catch:{ JSONException -> 0x0028 }
            r0 = 0
            if (r1 == 0) goto L_0x001d
        L_0x001c:
            r0 = 1
        L_0x001d:
            if (r0 == 0) goto L_0x0031
            X.2qk r1 = r6.A01     // Catch:{ JSONException -> 0x0028 }
            java.lang.String r0 = "number in params json is either null or incorrect phone number"
            r1.A0A(r5, r2, r0)     // Catch:{ JSONException -> 0x0028 }
            return r3
        L_0x0028:
            r2 = move-exception
            X.2qk r1 = r6.A01
            java.lang.String r0 = "action param is invalid json"
            r1.A09(r5, r0, r2)
            return r4
        L_0x0031:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1QJ.A0C(java.lang.String):java.lang.String");
    }

    public AnonymousClass1QJ(C111095hX r1, C55682qk r2, AnonymousClass4FV r3) {
        C18260x0.A0V(r1, r2, r3);
        this.A00 = r1;
        this.A01 = r2;
        this.A02 = r3;
    }
}
