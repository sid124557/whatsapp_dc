package X;

/* renamed from: X.4hC  reason: invalid class name and case insensitive filesystem */
public final class C90364hC extends C67163Of {
    public final C39952Dy A00;
    public final C39962Dz A01;
    public final AnonymousClass2E0 A02;
    public final AnonymousClass2XR A03;
    public final AnonymousClass258 A04;
    public final AnonymousClass4AO A05;
    public final AnonymousClass4AO A06;

    public C90364hC(C39952Dy r2, C39962Dz r3, AnonymousClass2E0 r4, AnonymousClass2XR r5, AnonymousClass258 r6, AnonymousClass4AO r7, AnonymousClass4AO r8) {
        C162457s7.A0J(r2, 4);
        C18260x0.A0T(r3, r4);
        this.A06 = r7;
        this.A05 = r8;
        this.A04 = r6;
        this.A00 = r2;
        this.A01 = r3;
        this.A02 = r4;
        this.A03 = r5;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v0, resolved type: X.7yH} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v1, resolved type: X.7yH} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v2, resolved type: X.7y0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v4, resolved type: X.7yH} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v5, resolved type: X.7yH} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v6, resolved type: X.7y0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v7, resolved type: X.7y0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r31v1, resolved type: X.7yH} */
    /* JADX WARNING: type inference failed for: r1v33, types: [X.7y0] */
    /* JADX WARNING: type inference failed for: r11v2, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ java.lang.Object A02(org.json.JSONObject r39, long r40) {
        /*
            r38 = this;
            java.lang.String r3 = "id"
            java.lang.String r2 = "name"
            java.lang.String r4 = "media"
            java.lang.String[] r0 = new java.lang.String[]{r3, r2, r4}
            java.util.HashSet r1 = X.AnonymousClass002.A0K()
            java.util.Collections.addAll(r1, r0)
            r0 = r39
            boolean r1 = X.C57332tT.A02(r1, r0)
            r12 = 0
            if (r1 == 0) goto L_0x01b5
            java.lang.String r18 = X.C57332tT.A00(r3, r0)
            X.C626936e.A06(r18)
            java.lang.String r19 = X.C57332tT.A00(r2, r0)
            X.C626936e.A06(r19)
            java.lang.String r1 = "description"
            java.lang.String r20 = X.C57332tT.A00(r1, r0)
            java.lang.String r2 = "currency"
            boolean r1 = r0.has(r2)
            if (r1 == 0) goto L_0x00cd
            java.lang.String r3 = X.C57332tT.A00(r2, r0)
            if (r3 == 0) goto L_0x00cd
            int r2 = r3.length()
            r1 = 3
            if (r2 != r1) goto L_0x00cd
            X.7ny r2 = new X.7ny
            r2.<init>(r3)
        L_0x0048:
            java.lang.String r3 = "price"
            boolean r1 = r0.has(r3)
            if (r1 == 0) goto L_0x00cb
            java.lang.String r1 = X.C57332tT.A00(r3, r0)
            if (r1 == 0) goto L_0x00cb
            java.lang.String r1 = X.C57332tT.A00(r3, r0)
        L_0x005a:
            r10 = r38
            java.math.BigDecimal r24 = r10.A03(r2, r1)
            java.lang.String r1 = "sale_price"
            org.json.JSONObject r5 = r0.optJSONObject(r1)
            r8 = r40
            if (r2 == 0) goto L_0x00c9
            if (r5 == 0) goto L_0x00c9
            X.7cp r3 = new X.7cp
            r3.<init>()
            X.1Lk r1 = new X.1Lk
            r1.<init>(r3, r2)
            java.lang.Object r15 = r1.Azj(r5, r8)
            X.5dU r15 = (X.C108745dU) r15
        L_0x007c:
            java.lang.String r1 = "url"
            java.lang.String r21 = X.C57332tT.A00(r1, r0)
            java.lang.String r1 = "retailer_id"
            java.lang.String r22 = X.C57332tT.A00(r1, r0)
            org.json.JSONObject r1 = r0.optJSONObject(r4)
            java.lang.String r3 = "status_info"
            org.json.JSONObject r5 = r0.optJSONObject(r3)
            java.lang.String r6 = "max_available"
            r3 = 99
            long r27 = r0.optLong(r6, r3)
            if (r1 == 0) goto L_0x00d0
            java.util.ArrayList r11 = X.AnonymousClass001.A0s()
            java.lang.String r3 = "images"
            boolean r4 = X.C57332tT.A01(r3, r1)
            if (r4 == 0) goto L_0x00d2
            org.json.JSONArray r4 = r1.optJSONArray(r3)
            if (r4 == 0) goto L_0x00d2
            int r7 = r4.length()
            r3 = 0
        L_0x00b3:
            if (r3 >= r7) goto L_0x00d2
            org.json.JSONObject r1 = r4.optJSONObject(r3)
            if (r1 == 0) goto L_0x00c6
            X.4AO r6 = r10.A05
            java.lang.Object r1 = r6.Azj(r1, r8)
            if (r1 == 0) goto L_0x00c6
            r11.add(r1)
        L_0x00c6:
            int r3 = r3 + 1
            goto L_0x00b3
        L_0x00c9:
            r15 = 0
            goto L_0x007c
        L_0x00cb:
            r1 = 0
            goto L_0x005a
        L_0x00cd:
            r2 = 0
            goto L_0x0048
        L_0x00d0:
            X.3d3 r11 = X.C72023d3.A00
        L_0x00d2:
            if (r5 == 0) goto L_0x01ad
            X.4AO r1 = r10.A06
            java.lang.Object r14 = r1.Azj(r5, r8)
            X.38u r14 = (X.C633238u) r14
        L_0x00dc:
            java.lang.String r1 = "image_fetch_status"
            java.lang.String r23 = X.C57332tT.A00(r1, r0)
            java.lang.String r1 = "product_availability"
            java.lang.String r1 = X.C57332tT.A00(r1, r0)
            java.lang.String r3 = "OUT_OF_STOCK"
            r26 = 1
            boolean r3 = r3.equalsIgnoreCase(r1)
            if (r3 != 0) goto L_0x00fc
            java.lang.String r3 = "AVAILABLE_FOR_ANOTHER_POSTCODE"
            boolean r1 = r3.equalsIgnoreCase(r1)
            int r26 = X.C18310x6.A02(r1)
        L_0x00fc:
            java.lang.String r1 = "is_hidden"
            java.lang.String r3 = X.C57332tT.A00(r1, r0)
            java.lang.String r1 = "ISHIDDEN_TRUE"
            boolean r30 = r1.equalsIgnoreCase(r3)
            java.lang.String r1 = "compliance_category"
            java.lang.String r6 = X.C57332tT.A00(r1, r0)
            java.lang.String r1 = "compliance_info"
            org.json.JSONObject r1 = r0.optJSONObject(r1)
            r13 = 0
            if (r1 == 0) goto L_0x015c
            java.lang.String r3 = "country_code_origin"
            java.lang.String r5 = X.C57332tT.A00(r3, r1)
            java.lang.String r3 = "importer_name"
            java.lang.String r4 = X.C57332tT.A00(r3, r1)
            java.lang.String r3 = "importer_address"
            org.json.JSONObject r1 = r1.optJSONObject(r3)
            if (r1 == 0) goto L_0x0156
            java.lang.String r3 = "street1"
            java.lang.String r32 = X.C57332tT.A00(r3, r1)
            java.lang.String r3 = "street2"
            java.lang.String r33 = X.C57332tT.A00(r3, r1)
            java.lang.String r3 = "postal_code"
            java.lang.String r34 = X.C57332tT.A00(r3, r1)
            java.lang.String r3 = "city"
            java.lang.String r35 = X.C57332tT.A00(r3, r1)
            java.lang.String r3 = "region"
            java.lang.String r36 = X.C57332tT.A00(r3, r1)
            java.lang.String r3 = "country_code"
            java.lang.String r37 = X.C57332tT.A00(r3, r1)
            X.7yH r13 = new X.7yH
            r31 = r13
            r31.<init>(r32, r33, r34, r35, r36, r37)
        L_0x0156:
            X.7y0 r1 = new X.7y0
            r1.<init>(r13, r5, r4)
            r13 = r1
        L_0x015c:
            java.lang.String r1 = "COMPLIANCECATEGORY_COUNTRYORIGINEXEMPT"
            boolean r1 = r1.equalsIgnoreCase(r6)
            if (r1 == 0) goto L_0x016b
            java.lang.String r1 = "N/A"
            X.7y0 r13 = new X.7y0
            r13.<init>(r12, r1, r12)
        L_0x016b:
            java.lang.String r1 = "variant_info"
            org.json.JSONObject r4 = r0.optJSONObject(r1)
            X.6ew r3 = new X.6ew
            r3.<init>(r2)
            X.4hA r6 = X.C64333Db.A0n()
            X.4h9 r5 = new X.4h9
            r5.<init>()
            X.4hB r1 = new X.4hB
            r1.<init>(r6, r5, r3)
            if (r4 == 0) goto L_0x01ab
            java.lang.Object r1 = r1.Azj(r4, r8)
            X.5dV r1 = (X.C108755dV) r1
        L_0x018c:
            r29 = 1
            X.5dw r12 = new X.5dw
            r25 = r11
            r17 = r2
            r16 = r1
            r12.<init>(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r29, r30)
            java.lang.String r1 = "belongsTo"
            java.lang.String r1 = X.C57332tT.A00(r1, r0)
            if (r1 == 0) goto L_0x01b0
            boolean r1 = java.lang.Boolean.parseBoolean(r1)
            X.4h8 r0 = new X.4h8
            r0.<init>(r12, r1)
            return r0
        L_0x01ab:
            r1 = 0
            goto L_0x018c
        L_0x01ad:
            r14 = 0
            goto L_0x00dc
        L_0x01b0:
            X.2XR r1 = r10.A03
            r1.A00(r12, r0)
        L_0x01b5:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C90364hC.A02(org.json.JSONObject, long):java.lang.Object");
    }
}
