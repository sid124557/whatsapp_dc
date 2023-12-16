package X;

import com.whatsapp.util.Log;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.3Of  reason: invalid class name and case insensitive filesystem */
public abstract class C67163Of implements AnonymousClass4AO {
    public static final List A00(AnonymousClass4AO r4, JSONArray jSONArray, long j) {
        Object Azj;
        C162457s7.A0J(jSONArray, 1);
        AnonymousClass8U9 r3 = new AnonymousClass8U9();
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            JSONObject optJSONObject = jSONArray.optJSONObject(i);
            if (!(optJSONObject == null || (Azj = r4.Azj(optJSONObject, j)) == null)) {
                r3.add(Azj);
            }
        }
        return C159507lx.A0h(r3);
    }

    public Object Azj(JSONObject jSONObject, long j) {
        C162457s7.A0J(jSONObject, 0);
        try {
            return A02(jSONObject, j);
        } catch (Exception e) {
            Log.e("BaseGraphQLResponseConverter/convert/Could not convert GraphQL response", e);
            return null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:149:0x02e4, code lost:
        if (r8 == null) goto L_0x02e6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0014, code lost:
        r2 = X.C57332tT.A00("price", r1);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object A02(org.json.JSONObject r21, long r22) {
        /*
            r20 = this;
            r0 = r20
            boolean r2 = r0 instanceof X.AnonymousClass1Lk
            r1 = r21
            if (r2 == 0) goto L_0x0058
            X.1Lk r0 = (X.AnonymousClass1Lk) r0
            java.lang.String r3 = "price"
            boolean r2 = X.C57332tT.A01(r3, r1)
            r6 = 0
            if (r2 == 0) goto L_0x037d
            java.lang.String r2 = X.C57332tT.A00(r3, r1)
            X.7ny r5 = r0.A01
            java.math.BigDecimal r4 = r0.A03(r5, r2)
            if (r4 == 0) goto L_0x037d
            java.lang.String r2 = "start_date"
            boolean r0 = r1.has(r2)
            if (r0 == 0) goto L_0x0035
            java.lang.String r0 = X.C57332tT.A00(r2, r1)
            r3 = 0
            if (r0 == 0) goto L_0x003b
            java.util.Date r3 = X.C154227cp.A00(r0)     // Catch:{ Exception -> 0x0037 }
            goto L_0x003b
        L_0x0035:
            r3 = r6
            goto L_0x003b
        L_0x0037:
            r0 = move-exception
            com.whatsapp.util.Log.e((java.lang.Throwable) r0)
        L_0x003b:
            java.lang.String r2 = "end_date"
            boolean r0 = r1.has(r2)
            if (r0 == 0) goto L_0x0052
            java.lang.String r0 = X.C57332tT.A00(r2, r1)
            if (r0 == 0) goto L_0x0052
            java.util.Date r6 = X.C154227cp.A00(r0)     // Catch:{ Exception -> 0x004e }
            goto L_0x0052
        L_0x004e:
            r0 = move-exception
            com.whatsapp.util.Log.e((java.lang.Throwable) r0)
        L_0x0052:
            X.5dU r0 = new X.5dU
            r0.<init>(r5, r4, r3, r6)
            return r0
        L_0x0058:
            boolean r4 = r0 instanceof X.AnonymousClass1Lj
            r2 = r22
            if (r4 == 0) goto L_0x0136
            X.1Lj r0 = (X.AnonymousClass1Lj) r0
            r9 = 0
            java.lang.String r7 = "promotion_id"
            java.lang.String r6 = "name"
            java.lang.String r5 = "discount"
            java.lang.String[] r4 = new java.lang.String[]{r7, r6, r5}
            boolean r4 = X.C57332tT.A03(r1, r4)
            r10 = 0
            if (r4 == 0) goto L_0x0135
            java.lang.String r14 = r1.getString(r5)
            X.C162457s7.A0H(r14)
            X.C162457s7.A0J(r14, r9)
            int r8 = r14.length()
            if (r8 <= 0) goto L_0x00c6
            int r4 = r8 + -1
            char r5 = r14.charAt(r4)
            r4 = 37
            if (r5 != r4) goto L_0x00c6
            r4 = 1
            int r4 = r8 - r4
            if (r4 < 0) goto L_0x00b3
            if (r4 <= r8) goto L_0x0096
            r4 = r8
        L_0x0096:
            java.lang.String r14 = r14.substring(r9, r4)
            X.C162457s7.A0D(r14)
            r19 = 2
            r5 = 0
            X.5rB r4 = X.C39192Ba.A00     // Catch:{ NumberFormatException -> 0x00cf }
            java.util.regex.Pattern r4 = r4.nativePattern     // Catch:{ NumberFormatException -> 0x00cf }
            boolean r4 = X.C18280x3.A1X(r14, r4)     // Catch:{ NumberFormatException -> 0x00cf }
            if (r4 == 0) goto L_0x0135
            float r4 = java.lang.Float.parseFloat(r14)     // Catch:{ NumberFormatException -> 0x00cf }
            java.lang.Float r5 = java.lang.Float.valueOf(r4)     // Catch:{ NumberFormatException -> 0x00cf }
            goto L_0x00cf
        L_0x00b3:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "Requested character count "
            r1.append(r0)
            r1.append(r4)
            java.lang.String r0 = " is less than zero."
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0F(r0, r1)
            throw r0
        L_0x00c6:
            r19 = 1
            java.lang.Long r4 = X.C829745q.A07(r14)
            if (r4 != 0) goto L_0x00d1
            return r10
        L_0x00cf:
            if (r5 == 0) goto L_0x0135
        L_0x00d1:
            java.lang.String r12 = X.C18290x4.A0r(r7, r1)
            java.lang.String r13 = X.C18290x4.A0r(r6, r1)
            java.lang.String r4 = "start_date"
            java.lang.String r4 = X.C57332tT.A00(r4, r1)
            r17 = 0
            if (r4 == 0) goto L_0x00ed
            java.util.Date r17 = X.C154227cp.A00(r4)     // Catch:{ ParseException -> 0x00e9 }
            goto L_0x00ed
        L_0x00e9:
            r4 = move-exception
            com.whatsapp.util.Log.e((java.lang.Throwable) r4)
        L_0x00ed:
            java.lang.String r4 = "end_date"
            java.lang.String r4 = X.C57332tT.A00(r4, r1)
            r18 = 0
            if (r4 == 0) goto L_0x0100
            java.util.Date r18 = X.C154227cp.A00(r4)     // Catch:{ ParseException -> 0x00fc }
            goto L_0x0100
        L_0x00fc:
            r4 = move-exception
            com.whatsapp.util.Log.e((java.lang.Throwable) r4)
        L_0x0100:
            java.lang.String r4 = "description"
            java.lang.String r15 = X.C57332tT.A00(r4, r1)
            java.lang.String r16 = ""
            if (r15 != 0) goto L_0x010c
            r15 = r16
        L_0x010c:
            java.lang.String r4 = "more_info"
            java.lang.String r4 = X.C57332tT.A00(r4, r1)
            if (r4 == 0) goto L_0x0117
            r16 = r4
        L_0x0117:
            java.lang.String r4 = "media"
            org.json.JSONObject r4 = r1.optJSONObject(r4)
            if (r4 == 0) goto L_0x012f
            java.lang.String r1 = "image"
            org.json.JSONObject r1 = r4.optJSONObject(r1)
            if (r1 == 0) goto L_0x012f
            X.4AO r0 = r0.A01
            java.lang.Object r10 = r0.Azj(r1, r2)
            X.5db r10 = (X.C108815db) r10
        L_0x012f:
            r11 = r10
            X.5TF r10 = new X.5TF
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18, r19)
        L_0x0135:
            return r10
        L_0x0136:
            boolean r4 = r0 instanceof X.AnonymousClass1Lf
            if (r4 == 0) goto L_0x016a
            java.lang.String r3 = "status"
            java.lang.String r2 = "can_appeal"
            java.lang.String[] r0 = new java.lang.String[]{r3, r2}
            boolean r0 = X.C57332tT.A03(r1, r0)
            if (r0 == 0) goto L_0x033b
            java.lang.String r0 = X.C57332tT.A00(r3, r1)
            int r6 = X.AnonymousClass255.A00(r0)
            boolean r7 = r1.optBoolean(r2)
            X.3d3 r5 = X.C72023d3.A00
            java.lang.String r0 = "reject_reason"
            java.lang.String r3 = X.C57332tT.A00(r0, r1)
            java.lang.String r0 = "commerce_url"
            java.lang.String r4 = X.C57332tT.A00(r0, r1)
            X.38u r2 = new X.38u
            r2.<init>(r3, r4, r5, r6, r7)
        L_0x0169:
            return r2
        L_0x016a:
            boolean r4 = r0 instanceof X.AnonymousClass1La
            if (r4 == 0) goto L_0x01b1
            java.lang.String r5 = "id"
            boolean r0 = X.C57332tT.A01(r5, r1)
            r6 = 0
            if (r0 == 0) goto L_0x037d
            java.lang.String r0 = "original_dimensions"
            org.json.JSONObject r4 = r1.optJSONObject(r0)
            if (r4 == 0) goto L_0x037d
            java.lang.String r3 = "height"
            java.lang.String r2 = "width"
            java.lang.String[] r0 = new java.lang.String[]{r3, r2}
            boolean r0 = X.C57332tT.A03(r4, r0)
            if (r0 == 0) goto L_0x037d
            java.lang.String r7 = X.C57332tT.A00(r5, r1)
            if (r7 == 0) goto L_0x0237
            java.lang.String r0 = "original_image_url"
            java.lang.String r8 = X.C57332tT.A00(r0, r1)
            java.lang.String r0 = "request_image_url"
            java.lang.String r9 = X.C57332tT.A00(r0, r1)
            int r11 = r4.optInt(r3)
            int r10 = r4.optInt(r2)
            X.5db r6 = new X.5db
            r6.<init>(r7, r8, r9, r10, r11)
            return r6
        L_0x01b1:
            boolean r4 = r0 instanceof X.AnonymousClass1Li
            if (r4 == 0) goto L_0x01e2
            X.1Li r0 = (X.AnonymousClass1Li) r0
            java.lang.String r4 = "xwa_product_catalog_get_single_collection"
            org.json.JSONObject r5 = r1.optJSONObject(r4)
            r6 = 0
            if (r5 == 0) goto L_0x01e1
            java.lang.String r1 = "collection"
            org.json.JSONObject r4 = r5.optJSONObject(r1)
            if (r4 == 0) goto L_0x01e1
            X.4AO r1 = r0.A01
            java.lang.Object r2 = r1.Azj(r4, r2)
            X.2gz r2 = (X.C49722gz) r2
            if (r2 == 0) goto L_0x01e1
            X.7Gs r1 = r0.A01(r5)
            X.3Dw r6 = new X.3Dw
            r6.<init>(r1, r2)
            X.2XR r0 = r0.A00
            r0.A00(r6, r4)
        L_0x01e1:
            return r6
        L_0x01e2:
            boolean r4 = r0 instanceof X.AnonymousClass1Le
            if (r4 == 0) goto L_0x020a
            X.1Le r0 = (X.AnonymousClass1Le) r0
            java.lang.String r4 = "xwa_product_catalog_get_collections"
            org.json.JSONObject r5 = r1.optJSONObject(r4)
            r6 = 0
            if (r5 == 0) goto L_0x01e1
            java.lang.String r1 = "collections"
            org.json.JSONArray r4 = r5.optJSONArray(r1)
            if (r4 == 0) goto L_0x01e1
            X.4AO r1 = r0.A00
            java.util.List r1 = A00(r1, r4, r2)
            X.7Gs r0 = r0.A01(r5)
            X.7Gr r6 = new X.7Gr
            r6.<init>(r0, r1)
            return r6
        L_0x020a:
            boolean r4 = r0 instanceof X.AnonymousClass1Lh
            if (r4 == 0) goto L_0x023c
            X.1Lh r0 = (X.AnonymousClass1Lh) r0
            java.lang.String r4 = "xwa_product_catalog_get_categories"
            org.json.JSONObject r5 = r1.optJSONObject(r4)
            if (r5 == 0) goto L_0x0234
            java.lang.String r1 = "categories"
            org.json.JSONArray r4 = r5.optJSONArray(r1)
            if (r4 == 0) goto L_0x0234
            X.3Of r1 = r0.A01
            java.util.List r1 = A00(r1, r4, r2)
        L_0x0227:
            X.3Dy r2 = new X.3Dy
            r2.<init>(r1)
            if (r5 == 0) goto L_0x0169
            X.2XR r0 = r0.A00
            r0.A00(r2, r5)
            return r2
        L_0x0234:
            X.3d3 r1 = X.C72023d3.A00
            goto L_0x0227
        L_0x0237:
            java.lang.IllegalStateException r0 = X.C18290x4.A0Y()
            throw r0
        L_0x023c:
            boolean r4 = r0 instanceof X.AnonymousClass1Ld
            if (r4 == 0) goto L_0x0265
            X.1Ld r0 = (X.AnonymousClass1Ld) r0
            java.lang.String r5 = "xwa_product_catalog_get_promotions"
            boolean r4 = X.C57332tT.A01(r5, r1)
            if (r4 == 0) goto L_0x033b
            org.json.JSONObject r4 = r1.getJSONObject(r5)
            java.lang.String r1 = "promotions"
            org.json.JSONArray r1 = r4.getJSONArray(r1)
            X.4AO r0 = r0.A00
            X.C162457s7.A0H(r1)
            java.util.List r0 = A00(r0, r1, r2)
            X.2ih r2 = new X.2ih
            r2.<init>(r0)
            return r2
        L_0x0265:
            boolean r4 = r0 instanceof X.AnonymousClass1LZ
            if (r4 == 0) goto L_0x02a5
            java.lang.String r0 = "status"
            java.lang.String r2 = X.C57332tT.A00(r0, r1)
            r4 = 0
            if (r2 == 0) goto L_0x028c
            boolean r0 = X.C175738Zn.A0V(r2)
            if (r0 != 0) goto L_0x028c
            java.lang.String r0 = "approved"
            boolean r0 = r0.equalsIgnoreCase(r2)
            if (r0 != 0) goto L_0x028c
            java.lang.String r0 = "rejected"
            boolean r0 = r0.equalsIgnoreCase(r2)
            int r4 = X.C18280x3.A00(r0)
        L_0x028c:
            java.lang.String r0 = "can_appeal"
            boolean r3 = r1.optBoolean(r0)
            java.lang.String r0 = "reject_reason"
            java.lang.String r2 = X.C57332tT.A00(r0, r1)
            java.lang.String r0 = "commerce_url"
            java.lang.String r1 = X.C57332tT.A00(r0, r1)
            X.2gP r0 = new X.2gP
            r0.<init>(r2, r1, r4, r3)
            return r0
        L_0x02a5:
            boolean r4 = r0 instanceof X.AnonymousClass1Lg
            if (r4 == 0) goto L_0x030d
            X.1Lg r0 = (X.AnonymousClass1Lg) r0
            java.lang.String r6 = "id"
            java.lang.String r5 = "name"
            java.lang.String[] r4 = new java.lang.String[]{r6, r5}
            boolean r4 = X.C57332tT.A03(r1, r4)
            r7 = 0
            if (r4 == 0) goto L_0x02e6
            java.lang.String r10 = X.C57332tT.A00(r6, r1)
            if (r10 == 0) goto L_0x02e6
            java.lang.String r4 = X.C57332tT.A00(r5, r1)
            if (r4 == 0) goto L_0x02e6
            java.lang.String r6 = " "
            java.util.List r5 = X.AnonymousClass2AB.A01(r4, r6)
            X.44X r4 = X.AnonymousClass44X.A00
            java.lang.String r11 = X.C73723fy.A0A(r6, r5, r4)
            java.lang.String r4 = "status_info"
            org.json.JSONObject r5 = r1.optJSONObject(r4)
            if (r5 == 0) goto L_0x02e7
            X.4AO r4 = r0.A01
            java.lang.Object r8 = r4.Azj(r5, r2)
            X.2gP r8 = (X.C49362gP) r8
            if (r8 != 0) goto L_0x02ed
        L_0x02e6:
            return r7
        L_0x02e7:
            r4 = 0
            X.2gP r8 = new X.2gP
            r8.<init>(r7, r7, r4, r4)
        L_0x02ed:
            java.lang.String r4 = "products"
            org.json.JSONArray r1 = r1.optJSONArray(r4)
            if (r1 == 0) goto L_0x030a
            X.4AO r0 = r0.A00
            java.util.List r0 = A00(r0, r1, r2)
        L_0x02fc:
            java.util.ArrayList r12 = X.AnonymousClass002.A0J(r0)
            java.lang.Integer r9 = X.AnonymousClass0x9.A0l(r12)
            X.2gz r7 = new X.2gz
            r7.<init>(r8, r9, r10, r11, r12)
            return r7
        L_0x030a:
            X.3d3 r0 = X.C72023d3.A00
            goto L_0x02fc
        L_0x030d:
            boolean r4 = r0 instanceof X.AnonymousClass1Lc
            if (r4 == 0) goto L_0x033d
            X.1Lc r0 = (X.AnonymousClass1Lc) r0
            java.lang.String r4 = "category"
            org.json.JSONObject r4 = r1.optJSONObject(r4)
            if (r4 == 0) goto L_0x033b
            X.3Of r5 = r0.A00
            java.lang.Object r4 = r5.Azj(r4, r2)
            X.2Qq r4 = (X.C43072Qq) r4
            if (r4 == 0) goto L_0x033b
            java.lang.String r0 = "sub_categories"
            org.json.JSONArray r0 = r1.optJSONArray(r0)
            if (r0 == 0) goto L_0x0338
            java.util.List r0 = A00(r5, r0, r2)
        L_0x0332:
            X.2XS r2 = new X.2XS
            r2.<init>(r4, r0)
            return r2
        L_0x0338:
            X.3d3 r0 = X.C72023d3.A00
            goto L_0x0332
        L_0x033b:
            r2 = 0
            return r2
        L_0x033d:
            X.1Lb r0 = (X.AnonymousClass1Lb) r0
            java.lang.String r4 = "category_id"
            java.lang.String r8 = X.C57332tT.A00(r4, r1)
            java.lang.String r4 = "name"
            java.lang.String r9 = X.C57332tT.A00(r4, r1)
            java.lang.String r4 = "media"
            org.json.JSONObject r5 = r1.optJSONObject(r4)
            r6 = 0
            if (r5 == 0) goto L_0x037b
            java.lang.String r4 = "image"
            org.json.JSONObject r4 = r5.optJSONObject(r4)
            if (r4 == 0) goto L_0x037b
            X.4AO r0 = r0.A00
            java.lang.Object r7 = r0.Azj(r4, r2)
            X.5db r7 = (X.C108815db) r7
        L_0x0365:
            if (r8 == 0) goto L_0x037d
            if (r9 == 0) goto L_0x037d
            if (r7 == 0) goto L_0x037d
            java.lang.String r0 = "is_last_level"
            boolean r11 = r1.optBoolean(r0)
            java.util.ArrayList r10 = X.AnonymousClass001.A0s()
            X.2Qq r6 = new X.2Qq
            r6.<init>(r7, r8, r9, r10, r11)
            return r6
        L_0x037b:
            r7 = r6
            goto L_0x0365
        L_0x037d:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C67163Of.A02(org.json.JSONObject, long):java.lang.Object");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0012, code lost:
        if (r1 != 0) goto L_0x0014;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.math.BigDecimal A03(X.C160617ny r3, java.lang.String r4) {
        /*
            r2 = this;
            if (r4 == 0) goto L_0x0024
            if (r3 == 0) goto L_0x0024
            r1 = 1
            java.lang.Float r0 = X.C615531h.A05(r4, r1)     // Catch:{ NumberFormatException -> 0x0018 }
            if (r0 == 0) goto L_0x0014
            float r0 = r0.floatValue()     // Catch:{ NumberFormatException -> 0x0018 }
            int r1 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            r0 = 1
            if (r1 == 0) goto L_0x0015
        L_0x0014:
            r0 = 0
        L_0x0015:
            r0 = r0 ^ 1
            goto L_0x0019
        L_0x0018:
            r0 = 0
        L_0x0019:
            if (r0 == 0) goto L_0x0024
            long r0 = java.lang.Long.parseLong(r4)
            java.math.BigDecimal r0 = X.C57952uT.A00(r3, r0)
            return r0
        L_0x0024:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C67163Of.A03(X.7ny, java.lang.String):java.math.BigDecimal");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x001f, code lost:
        if (r3.length() == 0) goto L_0x0021;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C148047Gs A01(org.json.JSONObject r5) {
        /*
            r4 = this;
            java.lang.String r0 = "paging"
            java.lang.String r1 = "after"
            r2 = 0
            org.json.JSONObject r0 = r5.optJSONObject(r0)
            if (r0 != 0) goto L_0x0013
            r1 = 0
            X.7Gs r0 = new X.7Gs
            r0.<init>(r2, r1)
            return r0
        L_0x0013:
            java.lang.String r3 = X.C57332tT.A00(r1, r0)
            r2 = 1
            if (r3 == 0) goto L_0x0021
            int r1 = r3.length()
            r0 = 0
            if (r1 != 0) goto L_0x0022
        L_0x0021:
            r0 = 1
        L_0x0022:
            r2 = r2 ^ r0
            X.7Gs r0 = new X.7Gs
            r0.<init>(r2, r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C67163Of.A01(org.json.JSONObject):X.7Gs");
    }
}
