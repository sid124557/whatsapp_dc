package X;

import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.2WN  reason: invalid class name */
public abstract class AnonymousClass2WN {
    public Object A00;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: X.1d4} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v0, resolved type: X.2z1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v8, resolved type: X.1d0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v9, resolved type: X.1d1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v31, resolved type: X.1d4} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v32, resolved type: X.1M8} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v33, resolved type: X.1d4} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v34, resolved type: X.1d4} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v35, resolved type: X.1d6} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v48, resolved type: X.2z1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v49, resolved type: X.2z1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v50, resolved type: X.2MU} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v51, resolved type: X.2MU} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v52, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v36, resolved type: X.1d2} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v37, resolved type: X.1d3} */
    /* JADX WARNING: Code restructure failed: missing block: B:312:0x0758, code lost:
        if (r1 != null) goto L_0x075a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:314:0x0761, code lost:
        if (r19 == null) goto L_0x0763;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:315:0x0763, code lost:
        r19 = "";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:316:0x0765, code lost:
        if (r1 == null) goto L_0x076f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:317:0x0767, code lost:
        r20 = r1.getString("favorites_empty_state_template_id");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:318:0x076d, code lost:
        if (r20 != null) goto L_0x0771;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:319:0x076f, code lost:
        r20 = "";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:320:0x0771, code lost:
        r1 = r5.opt("sticker_pack_dynamic_icon");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:321:0x077a, code lost:
        if ((r1 instanceof org.json.JSONObject) == false) goto L_0x0784;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:322:0x077c, code lost:
        r1 = (org.json.JSONObject) r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:323:0x077e, code lost:
        if (r1 == null) goto L_0x0784;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:324:0x0780, code lost:
        r11 = r0.A03(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:325:0x0784, code lost:
        r8 = r5.getJSONArray("stickers");
        r7 = X.AnonymousClass001.A0s();
        r5 = r8.length();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:326:0x0790, code lost:
        if (r4 >= r5) goto L_0x07a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:327:0x0792, code lost:
        r1 = r8.getJSONObject(r4);
        X.C162457s7.A0D(r1);
        r7.add(r0.A03(r1));
        r4 = r4 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:328:0x07a3, code lost:
        X.C162457s7.A0H(r12);
        X.C162457s7.A0H(r13);
        r0.A00 = new X.C633538x(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, X.AnonymousClass002.A0J(r7));
        r1 = X.C59022wD.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0160, code lost:
        if (r1 == 0) goto L_0x0162;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:367:0x08b8  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A02(org.json.JSONObject r36, long r37) {
        /*
            r35 = this;
            r0 = r35
            boolean r1 = r0 instanceof X.C26961d3
            r4 = r36
            if (r1 == 0) goto L_0x00cf
            X.1d3 r0 = (X.C26961d3) r0
            r10 = 0
            X.C162457s7.A0J(r4, r10)
            java.lang.String r1 = "whatsapp_crossposting_eligibility"
            org.json.JSONObject r2 = r4.getJSONObject(r1)
            java.lang.String r1 = "whatsapp_status_unique_fbids"
            org.json.JSONArray r8 = r2.getJSONArray(r1)
            java.lang.String r1 = "purpose_public_keys"
            org.json.JSONObject r5 = r2.getJSONObject(r1)
            java.lang.String r1 = "whatsapp_status_has_crossposted_state"
            org.json.JSONArray r9 = r2.getJSONArray(r1)
            int r2 = r9.length()
            r1 = 1
            if (r2 != r1) goto L_0x00c7
            java.util.ArrayList r4 = X.AnonymousClass001.A0s()
            int r6 = r8.length()
            r7 = 0
            r3 = 0
        L_0x003b:
            if (r3 >= r6) goto L_0x0050
            java.lang.String r2 = r8.getString(r3)
            X.C162457s7.A0H(r2)
            X.2gK r1 = r0.A00
            X.5dj r1 = X.AnonymousClass36X.A01(r1, r2)
            r4.add(r1)
            int r3 = r3 + 1
            goto L_0x003b
        L_0x0050:
            org.json.JSONObject r2 = r9.getJSONObject(r10)
            java.lang.String r1 = "waffle_hcbc"
            org.json.JSONArray r6 = r2.getJSONArray(r1)
            int r2 = r6.length()
            int r1 = r8.length()
            if (r2 != r1) goto L_0x00bf
            java.util.ArrayList r3 = X.AnonymousClass001.A0s()
            int r2 = r6.length()
        L_0x006d:
            if (r7 >= r2) goto L_0x007d
            boolean r1 = r6.getBoolean(r7)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            r3.add(r1)
            int r7 = r7 + 1
            goto L_0x006d
        L_0x007d:
            java.lang.String r1 = "purpose_public_ek"
            java.lang.String r1 = r5.getString(r1)
            r2 = 8
            byte[] r8 = android.util.Base64.decode(r1, r2)
            java.lang.String r1 = "purpose_public_ik"
            byte[] r9 = X.AnonymousClass0x9.A1S(r1, r5, r2)
            java.lang.String r1 = "purpose_public_ik_sig"
            java.lang.String r6 = r5.getString(r1)
            java.lang.String r1 = "purpose_public_ik_enc_certificate"
            java.lang.String r7 = r5.getString(r1)
            java.lang.String r1 = "purpose_dummy_ciphertext"
            byte[] r10 = X.AnonymousClass0x9.A1S(r1, r5, r2)
            java.lang.String r1 = "purpose_dummy_nonce"
            byte[] r11 = X.AnonymousClass0x9.A1S(r1, r5, r2)
            X.C18280x3.A16(r8, r9, r6)
            X.C18280x3.A16(r7, r10, r11)
            X.2no r5 = new X.2no
            r5.<init>(r6, r7, r8, r9, r10, r11)
            X.2ly r1 = new X.2ly
            r1.<init>(r5, r4, r3)
            goto L_0x0b9b
        L_0x00bf:
            java.lang.String r1 = "Error: unexpected hasCrosspostBeenCreated length"
            org.json.JSONException r0 = new org.json.JSONException
            r0.<init>(r1)
            throw r0
        L_0x00c7:
            java.lang.String r1 = "Error: unexpected crossposted state length"
            org.json.JSONException r0 = new org.json.JSONException
            r0.<init>(r1)
            throw r0
        L_0x00cf:
            boolean r1 = r0 instanceof X.C26951d2
            if (r1 == 0) goto L_0x0145
            X.1d2 r0 = (X.C26951d2) r0
            r1 = 0
            X.C162457s7.A0J(r4, r1)
            java.lang.String r1 = "xfb_whatsapp_crossposting"
            org.json.JSONObject r2 = r4.getJSONObject(r1)
            java.lang.String r1 = "status_crosspost_results"
            org.json.JSONArray r9 = r2.getJSONArray(r1)
            java.util.ArrayList r8 = X.AnonymousClass001.A0s()
            java.util.ArrayList r7 = X.AnonymousClass001.A0s()
            java.util.ArrayList r6 = X.AnonymousClass001.A0s()
            java.util.ArrayList r5 = X.AnonymousClass001.A0s()
            int r4 = r9.length()
            r3 = 0
        L_0x00fc:
            if (r3 >= r4) goto L_0x0b96
            org.json.JSONObject r2 = r9.getJSONObject(r3)
            java.lang.String r1 = "wa_status_id"
            java.lang.String r11 = r2.getString(r1)
            java.lang.String r1 = "response_code"
            int r10 = r2.getInt(r1)
            if (r10 == 0) goto L_0x0138
            r1 = 2
            if (r10 == r1) goto L_0x012b
            r2 = 3
            X.C162457s7.A0H(r11)
            X.2gK r1 = r0.A00
            X.5dj r1 = X.AnonymousClass36X.A01(r1, r11)
            if (r10 == r2) goto L_0x0127
            r7.add(r1)
        L_0x0124:
            int r3 = r3 + 1
            goto L_0x00fc
        L_0x0127:
            r5.add(r1)
            goto L_0x0124
        L_0x012b:
            X.C162457s7.A0H(r11)
            X.2gK r1 = r0.A00
            X.5dj r1 = X.AnonymousClass36X.A01(r1, r11)
            r6.add(r1)
            goto L_0x0124
        L_0x0138:
            X.C162457s7.A0H(r11)
            X.2gK r1 = r0.A00
            X.5dj r1 = X.AnonymousClass36X.A01(r1, r11)
            r8.add(r1)
            goto L_0x0124
        L_0x0145:
            boolean r1 = r0 instanceof X.C26921cz
            if (r1 == 0) goto L_0x016a
            r1 = 0
            X.C162457s7.A0J(r4, r1)
            java.lang.String r1 = "xfb_web_auth_linking_access_token_exchange"
            org.json.JSONObject r2 = r4.getJSONObject(r1)
            java.lang.String r1 = "access_token"
            java.lang.String r5 = r2.getString(r1)
            if (r5 == 0) goto L_0x0162
            int r1 = r5.length()
            if (r1 != 0) goto L_0x0250
        L_0x0162:
            java.lang.String r1 = "WebAuthAccessTokenFetchGraphQLDataProcessor/missing return access token"
            org.json.JSONException r0 = new org.json.JSONException
            r0.<init>(r1)
            throw r0
        L_0x016a:
            boolean r1 = r0 instanceof X.C26911cy
            if (r1 == 0) goto L_0x019b
            r1 = 0
            X.C162457s7.A0J(r4, r1)
            java.lang.String r1 = "xfb_whatsapp_xfamily_access_token_exchange"
            org.json.JSONObject r2 = r4.getJSONObject(r1)
            java.lang.String r1 = "access_token"
            java.lang.String r4 = r2.getString(r1)
            if (r4 == 0) goto L_0x0586
            int r1 = r4.length()
            if (r1 == 0) goto L_0x0586
            X.3QD r3 = X.AnonymousClass3QD.A00()
            java.lang.Class<java.lang.String> r2 = java.lang.String.class
            java.lang.String r1 = "XFamilyFbAccessTokenForCrossposting"
            X.5dj r1 = X.AnonymousClass0x7.A0a(r3, r2, r4, r1)
            X.2jJ r3 = new X.2jJ
            r3.<init>(r1)
        L_0x0198:
            r0.A00 = r3
            return
        L_0x019b:
            boolean r1 = r0 instanceof X.C26901cx
            if (r1 != 0) goto L_0x0b9d
            boolean r1 = r0 instanceof X.C26891cw
            if (r1 == 0) goto L_0x022e
            r14 = 0
            X.C162457s7.A0J(r4, r14)
            java.lang.String r1 = "waffle_xe_root"
            org.json.JSONObject r7 = r4.getJSONObject(r1)
            java.lang.String r1 = "waffle_d"
            org.json.JSONArray r9 = r7.getJSONArray(r1)
            int r1 = r9.length()
            if (r1 == 0) goto L_0x0680
            java.util.ArrayList r15 = X.AnonymousClass001.A0s()
            int r8 = r9.length()
            r6 = 0
        L_0x01c4:
            java.lang.String r11 = "I"
            java.lang.String r10 = "S"
            java.lang.String r12 = "F"
            java.lang.String r3 = "waffle_xs"
            java.lang.String r5 = "waffle_xan"
            java.lang.String r13 = "waffle_xas"
            java.lang.String r4 = "Error: unexpected response"
            if (r6 >= r8) goto L_0x0599
            org.json.JSONObject r1 = r9.getJSONObject(r6)
            java.lang.String r2 = "waffle_di"
            java.lang.String r2 = r1.getString(r2)
            org.json.JSONObject r1 = r1.getJSONObject(r13)
            java.lang.String r5 = r1.getString(r5)
            java.lang.String r3 = r1.getString(r3)
            boolean r1 = X.C162457s7.A0P(r5, r12)
            if (r1 != 0) goto L_0x01fa
            boolean r1 = X.C162457s7.A0P(r5, r11)
            if (r1 == 0) goto L_0x0593
        L_0x01fa:
            boolean r1 = X.C162457s7.A0P(r3, r10)
            if (r1 == 0) goto L_0x0593
            if (r2 == 0) goto L_0x0680
            int r1 = r2.length()
            if (r1 == 0) goto L_0x0680
            X.C162457s7.A0H(r5)
            X.C162457s7.A0J(r5, r14)
            X.223[] r11 = X.AnonymousClass223.values()
            int r10 = r11.length
            r4 = 0
        L_0x0214:
            if (r4 >= r10) goto L_0x058e
            r3 = r11[r4]
            java.lang.String r1 = r3.gqlValue
            boolean r1 = X.C162457s7.A0P(r1, r5)
            if (r1 == 0) goto L_0x022b
            X.2kq r1 = new X.2kq
            r1.<init>(r3, r2)
            r15.add(r1)
            int r6 = r6 + 1
            goto L_0x01c4
        L_0x022b:
            int r4 = r4 + 1
            goto L_0x0214
        L_0x022e:
            boolean r1 = r0 instanceof X.C26881cv
            if (r1 == 0) goto L_0x025a
            r1 = 0
            X.C162457s7.A0J(r4, r1)
            java.lang.String r1 = "fx_native_auth_secure_nonce"
            org.json.JSONObject r3 = r4.optJSONObject(r1)
            if (r3 == 0) goto L_0x0253
            java.lang.String r1 = "nonce"
            java.lang.String r2 = r3.optString(r1)
            java.lang.String r1 = "account_id"
            java.lang.String r1 = r3.optString(r1)
            X.2MU r5 = new X.2MU
            r5.<init>(r2, r1)
        L_0x0250:
            r0.A00 = r5
            return
        L_0x0253:
            r1 = 0
            X.2MU r5 = new X.2MU
            r5.<init>(r1, r1)
            goto L_0x0250
        L_0x025a:
            boolean r1 = r0 instanceof X.C26871cu
            if (r1 == 0) goto L_0x027a
            r1 = 0
            X.C162457s7.A0J(r4, r1)
            java.lang.String r1 = "fx_waffle_unpause_nonce"
            org.json.JSONObject r2 = r4.optJSONObject(r1)
            if (r2 == 0) goto L_0x0277
            java.lang.String r1 = "auth_blob"
            java.lang.String r1 = X.C18300x5.A0l(r1, r2)
        L_0x0270:
            X.2jI r3 = new X.2jI
            r3.<init>(r1)
            goto L_0x0198
        L_0x0277:
            java.lang.String r1 = ""
            goto L_0x0270
        L_0x027a:
            boolean r1 = r0 instanceof X.C26861ct
            if (r1 == 0) goto L_0x0304
            r1 = 0
            X.C162457s7.A0J(r4, r1)
            java.lang.String r1 = "waffle_fx_service_data"
            org.json.JSONObject r2 = r4.optJSONObject(r1)
            r3 = 0
            if (r2 == 0) goto L_0x02f7
            java.lang.String r1 = "services"
            org.json.JSONObject r2 = r2.optJSONObject(r1)
            if (r2 == 0) goto L_0x02f7
            java.lang.String r1 = "waffle_sxs"
            org.json.JSONArray r9 = r2.optJSONArray(r1)
            if (r9 == 0) goto L_0x02f7
            int r8 = r9.length()
            r4 = r3
            r7 = 0
            r6 = 0
            r5 = 0
        L_0x02a6:
            if (r7 >= r8) goto L_0x02eb
            org.json.JSONObject r1 = r9.getJSONObject(r7)
            java.lang.String r10 = "waffle_da"
            java.lang.String r2 = r1.getString(r10)
            java.lang.String r1 = "I"
            boolean r1 = X.C162457s7.A0P(r2, r1)
            if (r1 == 0) goto L_0x02cc
            X.3Z6 r2 = A00(r9, r7)
            java.lang.Object r1 = r2.first
            boolean r5 = X.AnonymousClass001.A1Z(r1)
            java.lang.Object r4 = r2.second
            java.lang.String r4 = (java.lang.String) r4
        L_0x02c9:
            int r7 = r7 + 1
            goto L_0x02a6
        L_0x02cc:
            org.json.JSONObject r1 = r9.getJSONObject(r7)
            java.lang.String r2 = r1.getString(r10)
            java.lang.String r1 = "F"
            boolean r1 = X.C162457s7.A0P(r2, r1)
            if (r1 == 0) goto L_0x02c9
            X.3Z6 r2 = A00(r9, r7)
            java.lang.Object r1 = r2.first
            boolean r6 = X.AnonymousClass001.A1Z(r1)
            java.lang.Object r3 = r2.second
            java.lang.String r3 = (java.lang.String) r3
            goto L_0x02c9
        L_0x02eb:
            X.2ye r1 = new X.2ye
            r1.<init>(r6, r5)
            X.2z1 r5 = new X.2z1
            r5.<init>(r1, r3, r4)
            goto L_0x0250
        L_0x02f7:
            r2 = 0
            X.2ye r1 = new X.2ye
            r1.<init>(r2, r2)
            X.2z1 r5 = new X.2z1
            r5.<init>(r1, r3, r3)
            goto L_0x0250
        L_0x0304:
            boolean r1 = r0 instanceof X.C26851cs
            if (r1 == 0) goto L_0x031c
            r1 = 0
            X.C162457s7.A0J(r4, r1)
            java.lang.String r1 = "xwa_product_catalog_get_product_list_by_retailer_id"
            org.json.JSONObject r2 = r4.getJSONObject(r1)
            java.lang.String r1 = "product_list"
        L_0x0316:
            java.lang.String r3 = r2.getString(r1)
            goto L_0x0198
        L_0x031c:
            boolean r1 = r0 instanceof X.C26991d6
            if (r1 == 0) goto L_0x0333
            X.1d6 r0 = (X.C26991d6) r0
            boolean r1 = r0 instanceof X.C32981s6
            if (r1 == 0) goto L_0x032f
            java.lang.String r1 = "whatsapp_support_process_ban_appeal_request"
        L_0x0329:
            org.json.JSONObject r1 = r4.getJSONObject(r1)
            goto L_0x0b9b
        L_0x032f:
            java.lang.String r1 = "whatsapp_support_ban_appeal_status"
            goto L_0x0329
        L_0x0333:
            boolean r1 = r0 instanceof X.C26841cr
            if (r1 == 0) goto L_0x0362
            java.lang.String r1 = "whatsapp_commerce_message_type_getmetadata"
            org.json.JSONObject r2 = r4.getJSONObject(r1)
            java.lang.String r1 = "title"
            java.lang.String r5 = r2.getString(r1)
            java.lang.String r1 = "subtitle"
            java.lang.String r6 = r2.getString(r1)
            java.lang.String r1 = "stitched_image_url"
            java.lang.String r7 = r2.getString(r1)
            java.lang.String r1 = "stitched_image_bytes"
            java.lang.String r8 = r2.getString(r1)
            r4 = 0
            X.5dg r3 = new X.5dg
            r3.<init>(r4, r5, r6, r7, r8)
            goto L_0x0198
        L_0x0362:
            boolean r1 = r0 instanceof X.C26831cq
            if (r1 == 0) goto L_0x040d
            r1 = 0
            X.C162457s7.A0J(r4, r1)
            java.lang.String r1 = "whatsapp_biz_integrity_p2b_report"
            org.json.JSONObject r6 = r4.getJSONObject(r1)
            java.lang.String r1 = "status"
            java.lang.String r5 = r6.optString(r1)
            int r1 = X.AnonymousClass0x7.A06(r5)
            boolean r1 = X.AnonymousClass000.A1T(r1)
            r3 = 0
            java.lang.String r2 = "INVALID"
            if (r1 != 0) goto L_0x0407
            boolean r1 = r2.equals(r5)
            if (r1 != 0) goto L_0x0407
            java.lang.String r1 = "NOT_FOUND"
            boolean r1 = r1.equals(r5)
            if (r1 != 0) goto L_0x0407
            java.lang.String r4 = "PENDING"
            boolean r1 = r4.equals(r5)
            if (r1 == 0) goto L_0x03a3
            X.7IF r5 = new X.7IF
            r5.<init>(r3, r4)
        L_0x03a0:
            r0.A00 = r5
            return
        L_0x03a3:
            java.lang.String r1 = "detail"
            org.json.JSONObject r4 = r6.optJSONObject(r1)
            if (r4 == 0) goto L_0x0407
            java.lang.String r1 = "report_url"
            java.lang.String r5 = r4.optString(r1)
            java.lang.String r1 = "file_name"
            java.lang.String r6 = r4.optString(r1)
            java.lang.String r1 = "media_key"
            java.lang.String r7 = r4.optString(r1)
            java.lang.String r1 = "file_sha256"
            java.lang.String r9 = r4.optString(r1)
            java.lang.String r1 = "encrypted_file_sha256"
            java.lang.String r10 = r4.optString(r1)
            java.lang.String r1 = "direct_path"
            java.lang.String r11 = r4.optString(r1)
            java.lang.String r1 = "file_size_bytes"
            int r8 = r4.optInt(r1)
            int r1 = X.AnonymousClass0x7.A06(r5)
            if (r1 == 0) goto L_0x0407
            int r1 = X.AnonymousClass0x7.A06(r6)
            if (r1 == 0) goto L_0x0407
            int r1 = X.AnonymousClass0x7.A06(r7)
            if (r1 == 0) goto L_0x0407
            int r1 = X.AnonymousClass0x7.A06(r9)
            if (r1 == 0) goto L_0x0407
            int r1 = X.AnonymousClass0x7.A06(r10)
            if (r1 == 0) goto L_0x0407
            int r1 = X.AnonymousClass0x7.A06(r11)
            if (r1 == 0) goto L_0x0407
            X.7PF r4 = new X.7PF
            r4.<init>(r5, r6, r7, r8, r9, r10, r11)
            java.lang.String r1 = "AVAILABLE"
            X.7IF r5 = new X.7IF
            r5.<init>(r4, r1)
            goto L_0x03a0
        L_0x0407:
            X.7IF r5 = new X.7IF
            r5.<init>(r3, r2)
            goto L_0x03a0
        L_0x040d:
            boolean r1 = r0 instanceof X.C26821cp
            if (r1 == 0) goto L_0x0420
            r1 = 0
            X.C162457s7.A0J(r4, r1)
            java.lang.String r1 = "whatsapp_biz_integrity_delete_p2b_report"
            org.json.JSONObject r2 = r4.getJSONObject(r1)
            java.lang.String r1 = "message"
            goto L_0x0316
        L_0x0420:
            boolean r1 = r0 instanceof X.C26981d5
            if (r1 == 0) goto L_0x043c
            X.1d5 r0 = (X.C26981d5) r0
            java.lang.String r10 = "revision_id"
            java.lang.String r7 = "stickers"
            java.lang.String r11 = "sticker_pack_id"
            java.lang.String r5 = "fetch__WAAvatar"
            java.lang.String r8 = "id"
            java.lang.String r3 = "invalid_json_response"
            r6 = 41
            r2 = 1
            if (r36 != 0) goto L_0x0696
            goto L_0x068d
        L_0x043c:
            boolean r1 = r0 instanceof X.C26941d1
            if (r1 == 0) goto L_0x047e
            X.1d1 r0 = (X.C26941d1) r0
            if (r36 == 0) goto L_0x0b9d
            java.lang.String r2 = "fetch__WAAvatar"
            boolean r1 = r4.has(r2)
            java.lang.String r6 = "malformed_profile_pictures_json_response"
            r5 = 1
            if (r1 != 0) goto L_0x0458
            X.2r2 r1 = r0.A00
            java.lang.String r0 = "missing envelope (fetch__WAAvatar)"
        L_0x0454:
            r1.A02(r5, r6, r0)
            return
        L_0x0458:
            org.json.JSONObject r3 = r4.getJSONObject(r2)
            java.lang.String r2 = "wa_stickers_v2"
            boolean r1 = r3.has(r2)
            if (r1 != 0) goto L_0x046b
            X.2r2 r1 = r0.A00
            java.lang.String r0 = "missing key (wa_stickers)"
            goto L_0x0454
        L_0x046b:
            org.json.JSONObject r3 = r3.getJSONObject(r2)
            java.lang.String r2 = "stickers"
            boolean r1 = r3.has(r2)
            if (r1 != 0) goto L_0x081d
            X.2r2 r1 = r0.A00
            java.lang.String r0 = "missing key (stickers)"
            goto L_0x0454
        L_0x047e:
            boolean r1 = r0 instanceof X.C26811co
            if (r1 == 0) goto L_0x04b1
            if (r36 == 0) goto L_0x0b9d
            java.lang.String r2 = "fetch__WAAvatar"
            boolean r1 = r4.has(r2)
            if (r1 == 0) goto L_0x0b9d
            org.json.JSONObject r3 = r4.getJSONObject(r2)
            java.lang.String r2 = "wa_full_preview"
            boolean r1 = r3.has(r2)
            if (r1 == 0) goto L_0x0b9d
            org.json.JSONObject r3 = r3.getJSONObject(r2)
            java.lang.String r2 = "url"
            boolean r1 = r3.has(r2)
            if (r1 == 0) goto L_0x0b9d
            java.lang.String r1 = r3.getString(r2)
            X.38W r3 = new X.38W
            r3.<init>(r1)
            goto L_0x0198
        L_0x04b1:
            boolean r1 = r0 instanceof X.C26801cn
            if (r1 == 0) goto L_0x04c8
            if (r36 == 0) goto L_0x04c6
            java.lang.String r1 = "avatar_static_config"
            boolean r1 = r4.isNull(r1)
            r1 = r1 ^ 1
        L_0x04bf:
            X.38c r3 = new X.38c
            r3.<init>(r1)
            goto L_0x0198
        L_0x04c6:
            r1 = 0
            goto L_0x04bf
        L_0x04c8:
            boolean r1 = r0 instanceof X.C26791cm
            if (r1 == 0) goto L_0x04e3
            if (r36 == 0) goto L_0x04e0
            java.lang.String r1 = "xfb_whatsapp_smb_order_education_video"
            org.json.JSONObject r2 = r4.getJSONObject(r1)
            if (r2 == 0) goto L_0x04e0
            java.lang.String r1 = "video_uri"
            java.lang.String r3 = r2.optString(r1)
            goto L_0x0198
        L_0x04e0:
            r3 = 0
            goto L_0x0198
        L_0x04e3:
            boolean r1 = r0 instanceof X.C26931d0
            r2 = r37
            if (r1 == 0) goto L_0x04f3
            X.1d0 r0 = (X.C26931d0) r0
            X.4AO r1 = r0.A00
            java.lang.Object r1 = r1.Azj(r4, r2)
            goto L_0x0b9b
        L_0x04f3:
            boolean r1 = r0 instanceof X.C26781cl
            if (r1 == 0) goto L_0x0517
            java.lang.String r3 = "metadata"
            if (r36 == 0) goto L_0x0b9d
            java.lang.String r2 = "xwa_ai_stickers"
            boolean r1 = r4.has(r2)
            if (r1 == 0) goto L_0x0b9d
            java.util.ArrayList r5 = X.AnonymousClass001.A0s()
            org.json.JSONObject r2 = r4.getJSONObject(r2)
            java.lang.String r1 = "stickers"
            org.json.JSONArray r4 = r2.getJSONArray(r1)
            r13 = 0
            goto L_0x0880
        L_0x0517:
            boolean r1 = r0 instanceof X.C26771ck
            if (r1 == 0) goto L_0x0567
            r6 = 0
            X.C162457s7.A0J(r4, r6)
            java.lang.String r1 = "xwa_extensions_get_flow_data"
            org.json.JSONObject r5 = r4.getJSONObject(r1)
            X.C162457s7.A0H(r5)
            X.C162457s7.A0J(r5, r6)
            java.lang.String r1 = "extensions_flow_data"
            org.json.JSONArray r3 = r5.getJSONArray(r1)
            java.util.ArrayList r4 = X.AnonymousClass001.A0s()
            int r2 = r3.length()
        L_0x053a:
            if (r6 >= r2) goto L_0x054c
            org.json.JSONObject r1 = r3.optJSONObject(r6)
            if (r1 == 0) goto L_0x0549
            X.2nk r1 = X.AnonymousClass26k.A00(r1)
            r4.add(r1)
        L_0x0549:
            int r6 = r6 + 1
            goto L_0x053a
        L_0x054c:
            java.lang.String r1 = "compatibility"
            org.json.JSONObject r3 = r5.optJSONObject(r1)
            java.util.List r2 = X.C73723fy.A0F(r4)
            if (r3 == 0) goto L_0x0565
            X.2xZ r1 = X.C60742z5.A03
            X.2z5 r1 = r1.A01(r3)
        L_0x055e:
            X.2kD r3 = new X.2kD
            r3.<init>(r1, r2)
            goto L_0x0198
        L_0x0565:
            r1 = 0
            goto L_0x055e
        L_0x0567:
            boolean r1 = r0 instanceof X.C26761cj
            if (r1 == 0) goto L_0x0925
            r1 = 0
            X.C162457s7.A0J(r4, r1)
            java.lang.String r1 = "whatsapp_extensions_assets_getpubkeys"
            org.json.JSONObject r1 = r4.optJSONObject(r1)
            if (r1 == 0) goto L_0x091d
            X.2UX r2 = X.C60732z4.A03
            java.lang.String r1 = r1.toString()
            X.2z4 r3 = r2.A00(r1)
            if (r3 == 0) goto L_0x091d
            goto L_0x0198
        L_0x0586:
            java.lang.String r1 = "NativeAuthTokenExchangeDataProcessor/missing return access token"
            org.json.JSONException r0 = new org.json.JSONException
            r0.<init>(r1)
            throw r0
        L_0x058e:
            java.util.NoSuchElementException r0 = X.C18320x8.A0t()
            throw r0
        L_0x0593:
            org.json.JSONException r0 = new org.json.JSONException
            r0.<init>(r4)
            throw r0
        L_0x0599:
            java.lang.String r1 = "waffle_unique_ids"
            org.json.JSONArray r8 = r7.getJSONArray(r1)
            int r1 = r8.length()
            if (r1 == 0) goto L_0x067a
            java.util.ArrayList r2 = X.AnonymousClass001.A0s()
            int r9 = r8.length()
            r6 = 0
        L_0x05af:
            if (r6 >= r9) goto L_0x05be
            java.lang.String r1 = r8.getString(r6)
            X.C162457s7.A0D(r1)
            r2.add(r1)
            int r6 = r6 + 1
            goto L_0x05af
        L_0x05be:
            java.lang.String r1 = "waffle_xps"
            org.json.JSONArray r9 = r7.getJSONArray(r1)
            int r1 = r9.length()
            if (r1 == 0) goto L_0x0674
            r6 = 0
            org.json.JSONObject r9 = r9.getJSONObject(r14)
            org.json.JSONObject r1 = r9.getJSONObject(r13)
            java.lang.String r5 = r1.getString(r5)
            java.lang.String r3 = r1.getString(r3)
            boolean r1 = X.C162457s7.A0P(r5, r12)
            if (r1 != 0) goto L_0x05e8
            boolean r1 = X.C162457s7.A0P(r5, r11)
            if (r1 == 0) goto L_0x066e
        L_0x05e8:
            boolean r1 = X.C162457s7.A0P(r3, r10)
            if (r1 == 0) goto L_0x066e
            java.lang.String r1 = "waffle_hcbc"
            org.json.JSONArray r5 = r9.getJSONArray(r1)
            int r3 = r5.length()
            int r1 = r8.length()
            if (r3 != r1) goto L_0x0668
            java.util.ArrayList r3 = X.AnonymousClass001.A0s()
            int r4 = r5.length()
        L_0x0607:
            if (r6 >= r4) goto L_0x0617
            boolean r1 = r5.getBoolean(r6)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            r3.add(r1)
            int r6 = r6 + 1
            goto L_0x0607
        L_0x0617:
            java.lang.String r1 = "purpose_public_keys"
            org.json.JSONObject r5 = r7.getJSONObject(r1)
            java.lang.String r1 = "purpose_public_ik"
            java.lang.String r1 = r5.getString(r1)
            r4 = 8
            byte[] r9 = android.util.Base64.decode(r1, r4)
            java.lang.String r1 = "purpose_public_ik_sig"
            java.lang.String r6 = r5.getString(r1)
            java.lang.String r1 = "purpose_public_ik_enc_certificate"
            java.lang.String r7 = r5.getString(r1)
            java.lang.String r1 = "purpose_public_ek"
            byte[] r8 = X.AnonymousClass0x9.A1S(r1, r5, r4)
            java.lang.String r1 = "purpose_dummy_ciphertext"
            byte[] r10 = X.AnonymousClass0x9.A1S(r1, r5, r4)
            java.lang.String r1 = "purpose_dummy_nonce"
            byte[] r11 = X.AnonymousClass0x9.A1S(r1, r5, r4)
            r18 = 1
            X.C18280x3.A16(r8, r9, r6)
            X.C18280x3.A16(r7, r10, r11)
            X.2nn r5 = new X.2nn
            r5.<init>(r6, r7, r8, r9, r10, r11)
            X.2mx r13 = new X.2mx
            r14 = r5
            r16 = r3
            r17 = r2
            r13.<init>(r14, r15, r16, r17, r18)
            r0.A00 = r13
            return
        L_0x0668:
            org.json.JSONException r0 = new org.json.JSONException
            r0.<init>(r4)
            throw r0
        L_0x066e:
            org.json.JSONException r0 = new org.json.JSONException
            r0.<init>(r4)
            throw r0
        L_0x0674:
            org.json.JSONException r0 = new org.json.JSONException
            r0.<init>(r4)
            throw r0
        L_0x067a:
            org.json.JSONException r0 = new org.json.JSONException
            r0.<init>(r4)
            throw r0
        L_0x0680:
            X.3d3 r11 = X.C72023d3.A00
            r10 = 0
            X.2mx r9 = new X.2mx
            r13 = r11
            r12 = r11
            r9.<init>(r10, r11, r12, r13, r14)
            r0.A00 = r9
            return
        L_0x068d:
            X.2r2 r4 = r0.A00     // Catch:{ all -> 0x07fc }
            java.lang.String r1 = "received null JSON"
            r4.A02(r2, r3, r1)     // Catch:{ all -> 0x07fc }
            return
        L_0x0696:
            boolean r1 = r4.has(r5)     // Catch:{ all -> 0x07fc }
            if (r1 != 0) goto L_0x06a5
            X.2r2 r4 = r0.A00     // Catch:{ all -> 0x07fc }
            java.lang.String r1 = "missing envelope (fetch__WAAvatar)"
            r4.A02(r2, r3, r1)     // Catch:{ all -> 0x07fc }
            return
        L_0x06a5:
            org.json.JSONObject r5 = r4.getJSONObject(r5)     // Catch:{ all -> 0x07fc }
            boolean r1 = r5.has(r8)     // Catch:{ all -> 0x07fc }
            java.lang.String r4 = "wa_stickers_v2"
            if (r1 == 0) goto L_0x07d5
            boolean r1 = r5.has(r4)     // Catch:{ all -> 0x07fc }
            if (r1 == 0) goto L_0x07d5
            java.lang.String r12 = r5.getString(r8)     // Catch:{ all -> 0x07fc }
            org.json.JSONObject r5 = r5.getJSONObject(r4)     // Catch:{ all -> 0x07fc }
            java.lang.String[] r1 = new java.lang.String[]{r11, r7, r10}     // Catch:{ all -> 0x07fc }
            java.util.List r9 = X.AnonymousClass8UF.A0o(r1)     // Catch:{ all -> 0x07fc }
            boolean r1 = r9 instanceof java.util.Collection     // Catch:{ all -> 0x07fc }
            r4 = 0
            if (r1 == 0) goto L_0x06de
            boolean r1 = r9.isEmpty()     // Catch:{ all -> 0x07fc }
            if (r1 == 0) goto L_0x06de
        L_0x06d3:
            X.C162457s7.A0H(r5)     // Catch:{ all -> 0x07fc }
            X.C162457s7.A0J(r5, r4)     // Catch:{ all -> 0x07fc }
            java.lang.String r14 = X.C57282tO.A00(r11, r5, r4)     // Catch:{ all -> 0x07fc }
            goto L_0x0711
        L_0x06de:
            java.util.Iterator r8 = r9.iterator()     // Catch:{ all -> 0x07fc }
        L_0x06e2:
            boolean r1 = r8.hasNext()     // Catch:{ all -> 0x07fc }
            if (r1 == 0) goto L_0x06d3
            java.lang.String r1 = X.AnonymousClass001.A0m(r8)     // Catch:{ all -> 0x07fc }
            boolean r1 = r5.has(r1)     // Catch:{ all -> 0x07fc }
            if (r1 != 0) goto L_0x06e2
            java.util.ArrayList r8 = X.AnonymousClass001.A0s()     // Catch:{ all -> 0x07fc }
            java.util.Iterator r7 = r9.iterator()     // Catch:{ all -> 0x07fc }
        L_0x06fa:
            boolean r1 = r7.hasNext()     // Catch:{ all -> 0x07fc }
            if (r1 == 0) goto L_0x07b7
            java.lang.Object r4 = r7.next()     // Catch:{ all -> 0x07fc }
            r1 = r4
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ all -> 0x07fc }
            boolean r1 = r5.has(r1)     // Catch:{ all -> 0x07fc }
            if (r1 != 0) goto L_0x06fa
            r8.add(r4)     // Catch:{ all -> 0x07fc }
            goto L_0x06fa
        L_0x0711:
            if (r14 != 0) goto L_0x0716
            java.lang.String r14 = "meta-avatar"
        L_0x0716:
            java.lang.String r13 = r5.getString(r10)     // Catch:{ all -> 0x07fc }
            java.lang.String r1 = "sticker_pack_description"
            java.lang.String r15 = X.C57282tO.A00(r1, r5, r4)     // Catch:{ all -> 0x07fc }
            java.lang.String r9 = ""
            if (r15 != 0) goto L_0x0726
            r15 = r9
        L_0x0726:
            java.lang.String r1 = "sticker_pack_publisher"
            java.lang.String r17 = X.C57282tO.A00(r1, r5, r4)     // Catch:{ all -> 0x07fc }
            if (r17 != 0) goto L_0x0731
            java.lang.String r17 = "Meta"
        L_0x0731:
            java.lang.String r1 = "sticker_pack_name"
            java.lang.String r16 = X.C57282tO.A00(r1, r5, r4)     // Catch:{ all -> 0x07fc }
            if (r16 != 0) goto L_0x073c
            java.lang.String r16 = "Avatars"
        L_0x073c:
            java.lang.String r1 = "default_templates_info"
            java.lang.Object r1 = r5.opt(r1)     // Catch:{ all -> 0x07fc }
            boolean r8 = r1 instanceof org.json.JSONObject     // Catch:{ all -> 0x07fc }
            r11 = 0
            if (r8 == 0) goto L_0x0755
            org.json.JSONObject r1 = (org.json.JSONObject) r1     // Catch:{ all -> 0x07fc }
            if (r1 == 0) goto L_0x0756
            java.lang.String r8 = "sticker_pack_tray_icon_template_id"
            java.lang.String r18 = r1.getString(r8)     // Catch:{ all -> 0x07fc }
            if (r18 != 0) goto L_0x075a
            goto L_0x0756
        L_0x0755:
            r1 = r11
        L_0x0756:
            r18 = r9
            if (r1 == 0) goto L_0x0763
        L_0x075a:
            java.lang.String r8 = "recents_empty_state_template_id"
            java.lang.String r19 = r1.getString(r8)     // Catch:{ all -> 0x07fc }
            if (r19 != 0) goto L_0x0767
        L_0x0763:
            r19 = r9
            if (r1 == 0) goto L_0x076f
        L_0x0767:
            java.lang.String r8 = "favorites_empty_state_template_id"
            java.lang.String r20 = r1.getString(r8)     // Catch:{ all -> 0x07fc }
            if (r20 != 0) goto L_0x0771
        L_0x076f:
            r20 = r9
        L_0x0771:
            java.lang.String r1 = "sticker_pack_dynamic_icon"
            java.lang.Object r1 = r5.opt(r1)     // Catch:{ all -> 0x07fc }
            boolean r8 = r1 instanceof org.json.JSONObject     // Catch:{ all -> 0x07fc }
            if (r8 == 0) goto L_0x0784
            org.json.JSONObject r1 = (org.json.JSONObject) r1     // Catch:{ all -> 0x07fc }
            if (r1 == 0) goto L_0x0784
            X.38w r11 = r0.A03(r1)     // Catch:{ all -> 0x07fc }
        L_0x0784:
            org.json.JSONArray r8 = r5.getJSONArray(r7)     // Catch:{ all -> 0x07fc }
            java.util.ArrayList r7 = X.AnonymousClass001.A0s()     // Catch:{ all -> 0x07fc }
            int r5 = r8.length()     // Catch:{ all -> 0x07fc }
        L_0x0790:
            if (r4 >= r5) goto L_0x07a3
            org.json.JSONObject r1 = r8.getJSONObject(r4)     // Catch:{ all -> 0x07fc }
            X.C162457s7.A0D(r1)     // Catch:{ all -> 0x07fc }
            X.38w r1 = r0.A03(r1)     // Catch:{ all -> 0x07fc }
            r7.add(r1)     // Catch:{ all -> 0x07fc }
            int r4 = r4 + 1
            goto L_0x0790
        L_0x07a3:
            X.C162457s7.A0H(r12)     // Catch:{ all -> 0x07fc }
            X.C162457s7.A0H(r13)     // Catch:{ all -> 0x07fc }
            java.util.ArrayList r21 = X.AnonymousClass002.A0J(r7)     // Catch:{ all -> 0x07fc }
            X.38x r10 = new X.38x     // Catch:{ all -> 0x07fc }
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)     // Catch:{ all -> 0x07fc }
            r0.A00 = r10     // Catch:{ all -> 0x07fc }
            X.2wD r1 = X.C59022wD.A00     // Catch:{ all -> 0x07fc }
            goto L_0x0801
        L_0x07b7:
            r4 = 0
            java.lang.String r1 = ", "
            java.lang.String r7 = X.C73723fy.A0A(r1, r8, r4)     // Catch:{ all -> 0x07fc }
            X.2r2 r5 = r0.A00     // Catch:{ all -> 0x07fc }
            java.lang.StringBuilder r4 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x07fc }
            java.lang.String r1 = "missing mandatory fields ("
            r4.append(r1)     // Catch:{ all -> 0x07fc }
            r4.append(r7)     // Catch:{ all -> 0x07fc }
            java.lang.String r1 = X.AnonymousClass001.A0j(r4, r6)     // Catch:{ all -> 0x07fc }
            r5.A02(r2, r3, r1)     // Catch:{ all -> 0x07fc }
            return
        L_0x07d5:
            boolean r8 = r5.has(r8)     // Catch:{ all -> 0x07fc }
            boolean r7 = r5.has(r4)     // Catch:{ all -> 0x07fc }
            X.2r2 r5 = r0.A00     // Catch:{ all -> 0x07fc }
            java.lang.StringBuilder r4 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x07fc }
            java.lang.String r1 = "missing envelope (has id: "
            r4.append(r1)     // Catch:{ all -> 0x07fc }
            r4.append(r8)     // Catch:{ all -> 0x07fc }
            java.lang.String r1 = " , has stickerpack: "
            r4.append(r1)     // Catch:{ all -> 0x07fc }
            r4.append(r7)     // Catch:{ all -> 0x07fc }
            java.lang.String r1 = X.AnonymousClass001.A0j(r4, r6)     // Catch:{ all -> 0x07fc }
            r5.A02(r2, r3, r1)     // Catch:{ all -> 0x07fc }
            return
        L_0x07fc:
            r1 = move-exception
            X.3Z0 r1 = X.AnonymousClass3Z0.A01(r1)
        L_0x0801:
            java.lang.Throwable r5 = X.AnonymousClass3Z9.A00(r1)
            if (r5 == 0) goto L_0x0b9d
            X.2r2 r4 = r0.A00
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "error caught parsing JSON ("
            r1.append(r0)
            X.C18320x8.A1N(r1, r5)
            java.lang.String r0 = X.AnonymousClass001.A0j(r1, r6)
            r4.A02(r2, r3, r0)
            throw r5
        L_0x081d:
            org.json.JSONArray r10 = r3.getJSONArray(r2)
            int r1 = r10.length()
            if (r1 != 0) goto L_0x0831
            X.2r2 r2 = r0.A00
            java.lang.String r1 = "empty_profile_pictures_response"
            java.lang.String r0 = "Empty profile picture sticker list"
            r2.A02(r5, r1, r0)
            return
        L_0x0831:
            java.util.ArrayList r9 = X.AnonymousClass001.A0s()
            int r8 = r10.length()
            r7 = 0
        L_0x083a:
            if (r7 >= r8) goto L_0x0879
            org.json.JSONObject r2 = r10.getJSONObject(r7)
            java.lang.String r1 = "url"
            java.lang.String r6 = X.C18290x4.A0r(r1, r2)
            java.lang.String r1 = "emojis"
            org.json.JSONArray r5 = r2.getJSONArray(r1)
            java.util.ArrayList r4 = X.AnonymousClass001.A0s()
            int r3 = r5.length()
            r2 = 0
        L_0x0856:
            if (r2 >= r3) goto L_0x0865
            java.lang.String r1 = r5.getString(r2)
            X.C162457s7.A0D(r1)
            r4.add(r1)
            int r2 = r2 + 1
            goto L_0x0856
        L_0x0865:
            java.lang.String r1 = " "
            java.lang.String r2 = android.text.TextUtils.join(r1, r4)
            X.C162457s7.A0D(r2)
            X.38j r1 = new X.38j
            r1.<init>(r6, r2)
            r9.add(r1)
            int r7 = r7 + 1
            goto L_0x083a
        L_0x0879:
            X.38d r1 = new X.38d
            r1.<init>(r9)
            goto L_0x0b9b
        L_0x0880:
            boolean r1 = r2.has(r3)     // Catch:{ Exception -> 0x08a7 }
            if (r1 == 0) goto L_0x08b0
            boolean r1 = r2.isNull(r3)     // Catch:{ Exception -> 0x08a7 }
            if (r1 != 0) goto L_0x08b0
            org.json.JSONObject r6 = r2.getJSONObject(r3)     // Catch:{ Exception -> 0x08a7 }
            java.lang.String r1 = "step1_d"
            long r1 = r6.getLong(r1)     // Catch:{ Exception -> 0x08a7 }
            java.lang.Long r3 = java.lang.Long.valueOf(r1)     // Catch:{ Exception -> 0x08a7 }
            java.lang.String r1 = "step2_d"
            long r1 = r6.getLong(r1)     // Catch:{ Exception -> 0x08a8 }
            java.lang.Long r13 = java.lang.Long.valueOf(r1)     // Catch:{ Exception -> 0x08a8 }
            goto L_0x08ad
        L_0x08a7:
            r3 = r13
        L_0x08a8:
            java.lang.String r1 = "FunStickerDataProcessor/processResponse/metadata/FAIL"
            com.whatsapp.util.Log.d((java.lang.String) r1)
        L_0x08ad:
            r14 = r13
            r13 = r3
            goto L_0x08b1
        L_0x08b0:
            r14 = r13
        L_0x08b1:
            int r3 = r4.length()
            r2 = 0
        L_0x08b6:
            if (r2 >= r3) goto L_0x091a
            org.json.JSONObject r7 = r4.getJSONObject(r2)
            X.C162457s7.A0H(r7)
            java.lang.String r9 = "prompt"
            java.lang.String r6 = "integrity_image_key"
            java.lang.String r12 = "image_uri"
            java.lang.String r11 = "request_id"
            java.lang.String r10 = "response_id"
            java.lang.String[] r1 = new java.lang.String[]{r12, r11, r10, r9, r6}
            java.util.List r8 = X.AnonymousClass8UF.A0o(r1)
            boolean r1 = r8 instanceof java.util.Collection
            if (r1 == 0) goto L_0x0905
            boolean r1 = r8.isEmpty()
            if (r1 == 0) goto L_0x0905
        L_0x08de:
            java.lang.String r17 = r7.getString(r12)
            java.lang.String r20 = r7.getString(r11)
            java.lang.String r21 = r7.getString(r10)
            java.lang.String r16 = r7.getString(r9)
            java.lang.String r1 = "media_type"
            java.lang.String r15 = r7.getString(r1)
            java.lang.String r18 = r7.getString(r6)
            r19 = 0
            X.39D r12 = new X.39D
            r12.<init>(r13, r14, r15, r16, r17, r18, r19, r20, r21)
            r5.add(r12)
        L_0x0902:
            int r2 = r2 + 1
            goto L_0x08b6
        L_0x0905:
            java.util.Iterator r8 = r8.iterator()
        L_0x0909:
            boolean r1 = r8.hasNext()
            if (r1 == 0) goto L_0x08de
            java.lang.String r1 = X.AnonymousClass001.A0m(r8)
            boolean r1 = r7.has(r1)
            if (r1 != 0) goto L_0x0909
            goto L_0x0902
        L_0x091a:
            r0.A00 = r5
            return
        L_0x091d:
            java.lang.String r1 = "Asset verification response is not in expected format."
            org.json.JSONException r0 = new org.json.JSONException
            r0.<init>(r1)
            throw r0
        L_0x0925:
            boolean r1 = r0 instanceof X.C26751ci
            if (r1 == 0) goto L_0x0a5f
            r1 = 0
            X.C162457s7.A0J(r4, r1)
            java.lang.String r1 = "ar_effect_collection"
            org.json.JSONArray r20 = r4.getJSONArray(r1)     // Catch:{ JSONException -> 0x0a54 }
            X.C162457s7.A0H(r20)     // Catch:{ JSONException -> 0x0a54 }
            java.util.ArrayList r12 = X.AnonymousClass001.A0s()     // Catch:{ JSONException -> 0x0a54 }
            int r19 = r20.length()     // Catch:{ JSONException -> 0x0a54 }
            r2 = 0
        L_0x093f:
            r1 = r19
            if (r2 >= r1) goto L_0x0a4c
            r1 = r20
            org.json.JSONObject r3 = r1.getJSONObject(r2)     // Catch:{ JSONException -> 0x0a54 }
            java.lang.String r1 = "ar_effects"
            org.json.JSONObject r11 = r3.getJSONObject(r1)     // Catch:{ JSONException -> 0x0a54 }
            java.lang.String r1 = "nodes"
            org.json.JSONArray r18 = r11.getJSONArray(r1)     // Catch:{ JSONException -> 0x0a54 }
            java.util.ArrayList r6 = X.AnonymousClass001.A0s()     // Catch:{ JSONException -> 0x0a54 }
            int r17 = r18.length()     // Catch:{ JSONException -> 0x0a54 }
            r1 = 0
        L_0x095f:
            r3 = r17
            if (r1 >= r3) goto L_0x0a29
            r3 = r18
            org.json.JSONObject r8 = r3.getJSONObject(r1)     // Catch:{ JSONException -> 0x0a54 }
            X.C162457s7.A0D(r8)     // Catch:{ JSONException -> 0x0a54 }
            java.lang.String r3 = "best_instance"
            org.json.JSONObject r3 = r8.getJSONObject(r3)     // Catch:{ JSONException -> 0x0a54 }
            java.lang.String r4 = "thumbnail"
            org.json.JSONObject r16 = r8.getJSONObject(r4)     // Catch:{ JSONException -> 0x0a54 }
            java.lang.String r4 = "packaged_file"
            org.json.JSONObject r5 = r3.getJSONObject(r4)     // Catch:{ JSONException -> 0x0a54 }
            java.lang.String r4 = "capabilities_min_version_models"
            org.json.JSONArray r15 = r3.getJSONArray(r4)     // Catch:{ JSONException -> 0x0a54 }
            java.lang.String r7 = "id"
            java.lang.String r14 = X.C18290x4.A0r(r7, r8)     // Catch:{ JSONException -> 0x0a54 }
            java.lang.String r4 = "name"
            java.lang.String r13 = X.C18290x4.A0r(r4, r8)     // Catch:{ JSONException -> 0x0a54 }
            java.lang.String r30 = X.C18290x4.A0r(r7, r3)     // Catch:{ JSONException -> 0x0a54 }
            java.lang.String r31 = X.C18290x4.A0r(r4, r3)     // Catch:{ JSONException -> 0x0a54 }
            java.lang.String r4 = "required_sdk_version"
            java.lang.String r32 = X.C18290x4.A0r(r4, r3)     // Catch:{ JSONException -> 0x0a54 }
            java.lang.String r22 = X.C18290x4.A0r(r7, r5)     // Catch:{ JSONException -> 0x0a54 }
            java.lang.String r4 = "filename"
            java.lang.String r23 = X.C18290x4.A0r(r4, r5)     // Catch:{ JSONException -> 0x0a54 }
            java.lang.String r4 = "uri"
            java.lang.String r24 = X.C18290x4.A0r(r4, r5)     // Catch:{ JSONException -> 0x0a54 }
            java.lang.String r7 = "md5_hash"
            java.lang.String r25 = X.C18290x4.A0r(r7, r5)     // Catch:{ JSONException -> 0x0a54 }
            java.lang.String r7 = "filesize_bytes"
            int r28 = r5.getInt(r7)     // Catch:{ JSONException -> 0x0a54 }
            java.lang.String r7 = "uncompressed_filesize_bytes"
            int r29 = r5.optInt(r7)     // Catch:{ JSONException -> 0x0a54 }
            java.lang.String r7 = "compression_type"
            java.lang.String r26 = X.C18290x4.A0r(r7, r5)     // Catch:{ JSONException -> 0x0a54 }
            java.lang.String r7 = "cache_key"
            java.lang.String r27 = X.C18290x4.A0r(r7, r5)     // Catch:{ JSONException -> 0x0a54 }
            X.2ne r21 = new X.2ne     // Catch:{ JSONException -> 0x0a54 }
            r21.<init>(r22, r23, r24, r25, r26, r27, r28, r29)     // Catch:{ JSONException -> 0x0a54 }
            java.lang.String r5 = "manifest_json"
            java.lang.String r33 = X.C18290x4.A0r(r5, r3)     // Catch:{ JSONException -> 0x0a54 }
            X.C162457s7.A0H(r15)     // Catch:{ JSONException -> 0x0a54 }
            java.util.ArrayList r10 = X.AnonymousClass001.A0s()     // Catch:{ JSONException -> 0x0a54 }
            int r9 = r15.length()     // Catch:{ JSONException -> 0x0a54 }
            r8 = 0
        L_0x09e9:
            if (r8 >= r9) goto L_0x0a07
            org.json.JSONObject r5 = r15.getJSONObject(r8)     // Catch:{ JSONException -> 0x0a54 }
            java.lang.String r3 = "capability_name"
            java.lang.String r7 = X.C18290x4.A0r(r3, r5)     // Catch:{ JSONException -> 0x0a54 }
            java.lang.String r3 = "min_version"
            int r5 = r5.getInt(r3)     // Catch:{ JSONException -> 0x0a54 }
            X.2jW r3 = new X.2jW     // Catch:{ JSONException -> 0x0a54 }
            r3.<init>(r7, r5)     // Catch:{ JSONException -> 0x0a54 }
            r10.add(r3)     // Catch:{ JSONException -> 0x0a54 }
            int r8 = r8 + 1
            goto L_0x09e9
        L_0x0a07:
            X.2n1 r3 = new X.2n1     // Catch:{ JSONException -> 0x0a54 }
            r28 = r3
            r29 = r21
            r34 = r10
            r28.<init>(r29, r30, r31, r32, r33, r34)     // Catch:{ JSONException -> 0x0a54 }
            r5 = r16
            java.lang.String r4 = X.C18290x4.A0r(r4, r5)     // Catch:{ JSONException -> 0x0a54 }
            X.2ik r5 = new X.2ik     // Catch:{ JSONException -> 0x0a54 }
            r5.<init>(r4)     // Catch:{ JSONException -> 0x0a54 }
            X.305 r4 = new X.305     // Catch:{ JSONException -> 0x0a54 }
            r4.<init>(r5, r3, r14, r13)     // Catch:{ JSONException -> 0x0a54 }
            r6.add(r4)     // Catch:{ JSONException -> 0x0a54 }
            int r1 = r1 + 1
            goto L_0x095f
        L_0x0a29:
            java.lang.String r1 = "page_info"
            org.json.JSONObject r3 = r11.getJSONObject(r1)     // Catch:{ JSONException -> 0x0a54 }
            java.lang.String r1 = "end_cursor"
            java.lang.String r3 = X.C18290x4.A0r(r1, r3)     // Catch:{ JSONException -> 0x0a54 }
            X.2in r1 = new X.2in     // Catch:{ JSONException -> 0x0a54 }
            r1.<init>(r3)     // Catch:{ JSONException -> 0x0a54 }
            X.2jY r3 = new X.2jY     // Catch:{ JSONException -> 0x0a54 }
            r3.<init>(r1, r6)     // Catch:{ JSONException -> 0x0a54 }
            X.2io r1 = new X.2io     // Catch:{ JSONException -> 0x0a54 }
            r1.<init>(r3)     // Catch:{ JSONException -> 0x0a54 }
            r12.add(r1)     // Catch:{ JSONException -> 0x0a54 }
            int r2 = r2 + 1
            goto L_0x093f
        L_0x0a4c:
            X.2ip r1 = new X.2ip     // Catch:{ JSONException -> 0x0a54 }
            r1.<init>(r12)     // Catch:{ JSONException -> 0x0a54 }
            r0.A00 = r1     // Catch:{ JSONException -> 0x0a54 }
            return
        L_0x0a54:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "PersonalizedAvatarGetMetadataDataProcessor/processResponse failed to parse parameters json: "
            X.C18260x0.A1Q(r1, r0, r2)
            return
        L_0x0a5f:
            boolean r1 = r0 instanceof X.C26741ch
            if (r1 == 0) goto L_0x0a8d
            r1 = 0
            X.C162457s7.A0J(r4, r1)
            java.lang.String r1 = "xwa_delete__WAAvatarArtifacts"
            org.json.JSONObject r2 = r4.getJSONObject(r1)     // Catch:{ JSONException -> 0x0a82 }
            java.lang.String r1 = "avatar_id"
            java.lang.String r3 = r2.getString(r1)     // Catch:{ JSONException -> 0x0a82 }
            java.lang.String r1 = "deletion_detail"
            java.lang.String r2 = r2.optString(r1)     // Catch:{ JSONException -> 0x0a82 }
            X.2jX r1 = new X.2jX     // Catch:{ JSONException -> 0x0a82 }
            r1.<init>(r3, r2)     // Catch:{ JSONException -> 0x0a82 }
            r0.A00 = r1     // Catch:{ JSONException -> 0x0a82 }
            return
        L_0x0a82:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "PersonalizedAvatarDeleteEffectDataProcessor/processResponse failed to parse parameters json: "
            X.C18260x0.A1Q(r1, r0, r2)
            return
        L_0x0a8d:
            boolean r1 = r0 instanceof X.C26731cg
            if (r1 == 0) goto L_0x0acf
            r1 = 0
            X.C162457s7.A0J(r4, r1)
            java.lang.String r1 = "arclass_lookup"
            org.json.JSONObject r2 = r4.getJSONObject(r1)     // Catch:{ JSONException -> 0x0ac4 }
            java.lang.String r1 = "values"
            org.json.JSONArray r5 = r2.getJSONArray(r1)     // Catch:{ JSONException -> 0x0ac4 }
            java.util.ArrayList r4 = X.AnonymousClass001.A0s()     // Catch:{ JSONException -> 0x0ac4 }
            int r3 = r5.length()     // Catch:{ JSONException -> 0x0ac4 }
            r2 = 0
        L_0x0aab:
            if (r2 >= r3) goto L_0x0ab7
            int r1 = r5.getInt(r2)     // Catch:{ JSONException -> 0x0ac4 }
            X.C18270x1.A1K(r4, r1)     // Catch:{ JSONException -> 0x0ac4 }
            int r2 = r2 + 1
            goto L_0x0aab
        L_0x0ab7:
            X.2il r2 = new X.2il     // Catch:{ JSONException -> 0x0ac4 }
            r2.<init>(r4)     // Catch:{ JSONException -> 0x0ac4 }
            X.2im r1 = new X.2im     // Catch:{ JSONException -> 0x0ac4 }
            r1.<init>(r2)     // Catch:{ JSONException -> 0x0ac4 }
            r0.A00 = r1     // Catch:{ JSONException -> 0x0ac4 }
            return
        L_0x0ac4:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "PersonalizedAvatarGetARClassDataProcessor/processResponse Failed to process response: "
            X.C18260x0.A1Q(r1, r0, r2)
            return
        L_0x0acf:
            boolean r1 = r0 instanceof X.C26721cf
            if (r1 == 0) goto L_0x0b60
            r2 = 0
            X.C162457s7.A0J(r4, r2)
            java.lang.String r1 = "fx_foa_to_waffle_data"
            org.json.JSONObject r4 = r4.optJSONObject(r1)
            java.lang.String r10 = ""
            if (r4 == 0) goto L_0x0b4f
            java.lang.String r1 = "password_certificate"
            org.json.JSONObject r5 = r4.optJSONObject(r1)
            if (r5 != 0) goto L_0x0b36
            X.2Jp r5 = new X.2Jp
            r5.<init>(r2, r10)
        L_0x0aef:
            java.lang.String r1 = "account_id"
            java.lang.String r6 = X.C18300x5.A0l(r1, r4)
            java.lang.String r1 = "auth_blob"
            java.lang.String r7 = X.C18300x5.A0l(r1, r4)
            java.lang.String r1 = "phone_number"
            java.lang.String r8 = X.C18300x5.A0l(r1, r4)
            java.lang.String r2 = "profile_pic_url"
            java.lang.String r1 = r4.optString(r2)
            java.lang.String r3 = "null"
            boolean r1 = r3.equals(r1)
            if (r1 == 0) goto L_0x0b31
            r9 = r10
        L_0x0b13:
            X.C162457s7.A0H(r9)
            java.lang.String r2 = "foa_profile_name"
            java.lang.String r1 = r4.optString(r2)
            boolean r1 = r3.equals(r1)
            if (r1 != 0) goto L_0x0b26
            java.lang.String r10 = r4.optString(r2)
        L_0x0b26:
            X.C162457s7.A0H(r10)
            X.2S0 r4 = new X.2S0
            r4.<init>(r5, r6, r7, r8, r9, r10)
            r0.A00 = r4
            return
        L_0x0b31:
            java.lang.String r9 = r4.optString(r2)
            goto L_0x0b13
        L_0x0b36:
            java.lang.String r1 = "key_id"
            int r3 = r5.optInt(r1)
            java.lang.String r1 = "public_key_pem"
            java.lang.String r2 = X.C18300x5.A0l(r1, r5)
            java.lang.String r1 = "ttl"
            r5.optInt(r1)
            X.2Jp r5 = new X.2Jp
            r5.<init>(r3, r2)
            goto L_0x0aef
        L_0x0b4f:
            X.2Jp r9 = new X.2Jp
            r9.<init>(r2, r10)
            X.2S0 r8 = new X.2S0
            r12 = r10
            r13 = r10
            r14 = r10
            r11 = r10
            r8.<init>(r9, r10, r11, r12, r13, r14)
            r0.A00 = r8
            return
        L_0x0b60:
            X.1d4 r0 = (X.C26971d4) r0
            boolean r1 = r0 instanceof X.AnonymousClass1M8
            if (r1 == 0) goto L_0x0b86
            X.1M8 r0 = (X.AnonymousClass1M8) r0
            java.lang.String r1 = "whatsapp_galaxy_forward_flow_data_response"
            org.json.JSONObject r4 = r4.getJSONObject(r1)
            java.lang.String r1 = "status_code"
            int r3 = r4.optInt(r1)
            r2 = 200(0xc8, float:2.8E-43)
            r1 = 1
            if (r3 != r2) goto L_0x0b7c
            r1 = 0
        L_0x0b7c:
            r0.A00 = r1
            java.lang.String r1 = "payload"
            java.lang.String r1 = r4.getString(r1)
            goto L_0x0b9b
        L_0x0b86:
            java.lang.String r1 = r0.A03(r2)
            org.json.JSONObject r2 = r4.getJSONObject(r1)
            java.lang.String r1 = "payload"
            java.lang.String r1 = r2.getString(r1)
            goto L_0x0b9b
        L_0x0b96:
            X.2mY r1 = new X.2mY
            r1.<init>(r8, r7, r6, r5)
        L_0x0b9b:
            r0.A00 = r1
        L_0x0b9d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass2WN.A02(org.json.JSONObject, long):void");
    }

    public static AnonymousClass3Z6 A00(JSONArray jSONArray, int i) {
        JSONObject jSONObject = jSONArray.getJSONObject(i);
        C162457s7.A0D(jSONObject);
        return new AnonymousClass3Z6(Boolean.valueOf(jSONObject.getJSONArray("waffle_xss").getJSONObject(0).getBoolean("waffle_iaxe")), jSONObject.getString("waffle_di"));
    }
}
