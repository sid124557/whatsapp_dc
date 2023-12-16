package X;

import android.content.ContentValues;
import android.util.Base64;
import com.whatsapp.util.Log;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.32t  reason: invalid class name and case insensitive filesystem */
public final class C619132t {
    public final AnonymousClass2KZ A00;

    public C619132t(AnonymousClass2KZ r2) {
        C162457s7.A0J(r2, 1);
        this.A00 = r2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:111:0x02d1  */
    /* JADX WARNING: Removed duplicated region for block: B:132:0x02d6 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List A02(java.lang.String r59, int r60) {
        /*
            r58 = this;
            r0 = 1
            r2 = r59
            X.C162457s7.A0J(r2, r0)
            r0 = r58
            X.2KZ r1 = r0.A00
            java.lang.Integer r0 = java.lang.Integer.valueOf(r60)
            java.lang.String[] r4 = X.AnonymousClass0x9.A1Z()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            X.AnonymousClass000.A16(r0, r2, r4)
            X.1RI r0 = r1.A01
            X.4GK r3 = r0.get()
            r0 = r3
            X.3H0 r0 = (X.AnonymousClass3H0) r0     // Catch:{ all -> 0x02e7 }
            X.2sg r2 = r0.A03     // Catch:{ all -> 0x02e7 }
            java.lang.String r1 = "SELECT qp_details FROM quick_promotion_payload WHERE surface_id =? AND trigger_id =?"
            java.lang.String r0 = "SELECT_QUICK_PROMOTION_PAYLOAD"
            android.database.Cursor r2 = r2.A0E(r1, r0, r4)     // Catch:{ all -> 0x02e7 }
            boolean r0 = r2.moveToNext()     // Catch:{ all -> 0x02db }
            if (r0 == 0) goto L_0x003a
            java.lang.String r0 = "qp_details"
            java.lang.String r1 = X.AnonymousClass0x2.A0Z(r2, r0)     // Catch:{ all -> 0x02db }
            goto L_0x003b
        L_0x003a:
            r1 = 0
        L_0x003b:
            r2.close()     // Catch:{ all -> 0x02e7 }
            java.util.ArrayList r22 = X.C18320x8.A0n(r3)
            if (r1 == 0) goto L_0x02da
            org.json.JSONArray r21 = new org.json.JSONArray
            r0 = r21
            r0.<init>(r1)
            int r20 = r21.length()
            r11 = 0
        L_0x0050:
            r0 = r20
            if (r11 >= r0) goto L_0x02da
            r0 = r21
            org.json.JSONObject r1 = r0.getJSONObject(r11)
            if (r1 == 0) goto L_0x02d6
            java.lang.String r19 = "contentAttributes"
            java.lang.String r18 = "instanceId"
            java.lang.String r15 = "impressionCooldown"
            java.lang.String r14 = "experimentKey"
            java.lang.String r13 = "surfaceDelayTime"
            java.lang.String r12 = "dismissable"
            java.lang.String r9 = "booleanFilter"
            java.lang.String r0 = "primaryCreative"
            java.lang.String r2 = "promotionId"
            java.lang.String r30 = X.AnonymousClass355.A01(r2, r1)     // Catch:{ Exception -> 0x02c7 }
            java.util.HashSet r17 = X.AnonymousClass002.A0K()     // Catch:{ Exception -> 0x02c7 }
            java.lang.String r2 = "triggers"
            org.json.JSONArray r6 = r1.getJSONArray(r2)     // Catch:{ Exception -> 0x02c7 }
            int r5 = r6.length()     // Catch:{ Exception -> 0x02c7 }
            r4 = 0
        L_0x0085:
            if (r4 >= r5) goto L_0x0093
            java.lang.String r3 = r6.getString(r4)     // Catch:{ Exception -> 0x02c7 }
            r2 = r17
            r2.add(r3)     // Catch:{ Exception -> 0x02c7 }
            int r4 = r4 + 1
            goto L_0x0085
        L_0x0093:
            java.lang.String r2 = "isServerForcePass"
            boolean r46 = r1.getBoolean(r2)     // Catch:{ Exception -> 0x02c7 }
            java.lang.String r2 = "startTimeEpochSeconds"
            long r38 = r1.getLong(r2)     // Catch:{ Exception -> 0x02c7 }
            java.lang.String r2 = "endTimeEpochSeconds"
            long r40 = r1.getLong(r2)     // Catch:{ Exception -> 0x02c7 }
            java.lang.String r2 = "clientTtlSeconds"
            long r42 = r1.getLong(r2)     // Catch:{ Exception -> 0x02c7 }
            java.lang.String r2 = "isUncancelable"
            boolean r47 = r1.getBoolean(r2)     // Catch:{ Exception -> 0x02c7 }
            java.lang.String r2 = "isBypassSurfaceDelay"
            boolean r48 = r1.getBoolean(r2)     // Catch:{ Exception -> 0x02c7 }
            java.lang.String r2 = "isExposureHoldout"
            boolean r49 = r1.getBoolean(r2)     // Catch:{ Exception -> 0x02c7 }
            java.lang.String r2 = "maxImpressions"
            int r36 = r1.getInt(r2)     // Catch:{ Exception -> 0x02c7 }
            boolean r2 = r1.has(r0)     // Catch:{ Exception -> 0x02c7 }
            if (r2 == 0) goto L_0x028a
            org.json.JSONObject r0 = r1.getJSONObject(r0)     // Catch:{ Exception -> 0x02c7 }
            X.C18280x3.A12(r0)     // Catch:{ Exception -> 0x02c7 }
            java.lang.String r3 = "title"
            boolean r2 = r0.has(r3)     // Catch:{ Exception -> 0x02c7 }
            r7 = 0
            if (r2 == 0) goto L_0x0286
            java.lang.String r56 = X.AnonymousClass355.A01(r3, r0)     // Catch:{ Exception -> 0x02c7 }
        L_0x00df:
            java.lang.String r2 = "content"
            boolean r4 = r0.has(r2)     // Catch:{ Exception -> 0x02c7 }
            if (r4 == 0) goto L_0x0282
            java.lang.String r57 = X.AnonymousClass355.A01(r2, r0)     // Catch:{ Exception -> 0x02c7 }
        L_0x00eb:
            java.lang.String r2 = "primaryAction"
            boolean r4 = r0.has(r2)     // Catch:{ Exception -> 0x02c7 }
            if (r4 == 0) goto L_0x027e
            org.json.JSONObject r2 = r0.getJSONObject(r2)     // Catch:{ Exception -> 0x02c7 }
            X.C162457s7.A0D(r2)     // Catch:{ Exception -> 0x02c7 }
            X.2Ru r51 = A00(r2)     // Catch:{ Exception -> 0x02c7 }
        L_0x00ff:
            java.lang.String r2 = "secondaryAction"
            boolean r4 = r0.has(r2)     // Catch:{ Exception -> 0x02c7 }
            if (r4 == 0) goto L_0x027a
            org.json.JSONObject r2 = r0.getJSONObject(r2)     // Catch:{ Exception -> 0x02c7 }
            X.C162457s7.A0D(r2)     // Catch:{ Exception -> 0x02c7 }
            X.2Ru r52 = A00(r2)     // Catch:{ Exception -> 0x02c7 }
        L_0x0113:
            java.lang.String r2 = "dismissPromotion"
            boolean r4 = r0.has(r2)     // Catch:{ Exception -> 0x02c7 }
            if (r4 == 0) goto L_0x0276
            org.json.JSONObject r2 = r0.getJSONObject(r2)     // Catch:{ Exception -> 0x02c7 }
            X.C162457s7.A0D(r2)     // Catch:{ Exception -> 0x02c7 }
            X.2Ru r53 = A00(r2)     // Catch:{ Exception -> 0x02c7 }
        L_0x0126:
            java.lang.String r2 = "image"
            boolean r4 = r0.has(r2)     // Catch:{ Exception -> 0x02c7 }
            if (r4 == 0) goto L_0x0273
            org.json.JSONObject r2 = r0.getJSONObject(r2)     // Catch:{ Exception -> 0x02c7 }
            X.C162457s7.A0D(r2)     // Catch:{ Exception -> 0x02c7 }
            java.lang.String r4 = "description"
            boolean r5 = r2.has(r4)     // Catch:{ Exception -> 0x02c7 }
            r6 = 0
            if (r5 == 0) goto L_0x0270
            java.lang.String r10 = X.AnonymousClass355.A01(r4, r2)     // Catch:{ Exception -> 0x02c7 }
        L_0x0142:
            java.lang.String r4 = "lightDataValue"
            boolean r8 = r2.has(r4)     // Catch:{ Exception -> 0x02c7 }
            r5 = 2
            if (r8 == 0) goto L_0x026d
            java.lang.String r4 = X.AnonymousClass355.A01(r4, r2)     // Catch:{ Exception -> 0x02c7 }
            byte[] r8 = android.util.Base64.decode(r4, r5)     // Catch:{ Exception -> 0x02c7 }
        L_0x0153:
            java.lang.String r4 = "darkDataValue"
            boolean r16 = r2.has(r4)     // Catch:{ Exception -> 0x02c7 }
            if (r16 == 0) goto L_0x0163
            java.lang.String r2 = X.AnonymousClass355.A01(r4, r2)     // Catch:{ Exception -> 0x02c7 }
            byte[] r6 = android.util.Base64.decode(r2, r5)     // Catch:{ Exception -> 0x02c7 }
        L_0x0163:
            X.2PK r4 = new X.2PK     // Catch:{ Exception -> 0x02c7 }
            r4.<init>(r10, r8, r6)     // Catch:{ Exception -> 0x02c7 }
        L_0x0168:
            java.lang.String r2 = "header"
            boolean r5 = r0.has(r2)     // Catch:{ Exception -> 0x02c7 }
            if (r5 == 0) goto L_0x0186
            org.json.JSONObject r0 = r0.getJSONObject(r2)     // Catch:{ Exception -> 0x02c7 }
            X.C162457s7.A0D(r0)     // Catch:{ Exception -> 0x02c7 }
            boolean r2 = r0.has(r3)     // Catch:{ Exception -> 0x02c7 }
            if (r2 == 0) goto L_0x026a
            java.lang.String r0 = X.AnonymousClass355.A01(r3, r0)     // Catch:{ Exception -> 0x02c7 }
        L_0x0181:
            X.2Iv r7 = new X.2Iv     // Catch:{ Exception -> 0x02c7 }
            r7.<init>(r0)     // Catch:{ Exception -> 0x02c7 }
        L_0x0186:
            X.2TD r25 = new X.2TD     // Catch:{ Exception -> 0x02c7 }
            r50 = r25
            r54 = r7
            r55 = r4
            r50.<init>(r51, r52, r53, r54, r55, r56, r57)     // Catch:{ Exception -> 0x02c7 }
        L_0x0191:
            X.21H r2 = X.AnonymousClass21H.UNKNOWN     // Catch:{ Exception -> 0x02c7 }
            java.util.ArrayList r4 = X.AnonymousClass001.A0s()     // Catch:{ Exception -> 0x02c7 }
            java.util.ArrayList r3 = X.AnonymousClass001.A0s()     // Catch:{ Exception -> 0x02c7 }
            X.2ve r0 = new X.2ve     // Catch:{ Exception -> 0x02c7 }
            r0.<init>(r2, r4, r3)     // Catch:{ Exception -> 0x02c7 }
            X.2Iz r4 = new X.2Iz     // Catch:{ Exception -> 0x02c7 }
            r4.<init>(r0)     // Catch:{ Exception -> 0x02c7 }
            boolean r0 = r1.has(r9)     // Catch:{ Exception -> 0x02c7 }
            if (r0 == 0) goto L_0x01ca
            org.json.JSONObject r3 = r1.getJSONObject(r9)     // Catch:{ Exception -> 0x02c7 }
            X.2dn r0 = X.C58682ve.A03     // Catch:{ Exception -> 0x02c7 }
            java.lang.String r4 = r3.toString()     // Catch:{ Exception -> 0x02c7 }
            if (r4 == 0) goto L_0x025b
            int r3 = r4.length()     // Catch:{ Exception -> 0x02c7 }
            if (r3 == 0) goto L_0x025b
            org.json.JSONObject r2 = X.AnonymousClass0x9.A1H(r4)     // Catch:{ Exception -> 0x02c7 }
            X.2ve r0 = r0.A00(r2)     // Catch:{ Exception -> 0x02c7 }
        L_0x01c5:
            X.2Iz r4 = new X.2Iz     // Catch:{ Exception -> 0x02c7 }
            r4.<init>(r0)     // Catch:{ Exception -> 0x02c7 }
        L_0x01ca:
            java.lang.String r0 = "hasNativeTemplate"
            boolean r50 = r1.getBoolean(r0)     // Catch:{ Exception -> 0x02c7 }
            java.lang.String r0 = "hasBloks"
            boolean r51 = r1.getBoolean(r0)     // Catch:{ Exception -> 0x02c7 }
            java.lang.String r0 = "skipsContentValidation"
            boolean r52 = r1.getBoolean(r0)     // Catch:{ Exception -> 0x02c7 }
            java.lang.String r0 = "priority"
            long r44 = r1.getLong(r0)     // Catch:{ Exception -> 0x02c7 }
            java.lang.String r0 = "instanceLogData"
            java.lang.String r31 = X.AnonymousClass355.A01(r0, r1)     // Catch:{ Exception -> 0x02c7 }
            java.lang.String r0 = "templateName"
            java.lang.String r32 = X.AnonymousClass355.A01(r0, r1)     // Catch:{ Exception -> 0x02c7 }
            java.lang.String r0 = "eligibilityDurationAfterImpressionMs"
            int r37 = r1.getInt(r0)     // Catch:{ Exception -> 0x02c7 }
            boolean r0 = r1.has(r12)     // Catch:{ Exception -> 0x02c7 }
            if (r0 == 0) goto L_0x0258
            boolean r0 = r1.getBoolean(r12)     // Catch:{ Exception -> 0x02c7 }
            java.lang.Boolean r27 = java.lang.Boolean.valueOf(r0)     // Catch:{ Exception -> 0x02c7 }
        L_0x0205:
            boolean r0 = r1.has(r13)     // Catch:{ Exception -> 0x02c7 }
            if (r0 == 0) goto L_0x0255
            int r0 = r1.getInt(r13)     // Catch:{ Exception -> 0x02c7 }
            java.lang.Integer r28 = java.lang.Integer.valueOf(r0)     // Catch:{ Exception -> 0x02c7 }
        L_0x0213:
            boolean r0 = r1.has(r14)     // Catch:{ Exception -> 0x02c7 }
            if (r0 == 0) goto L_0x0252
            java.lang.String r33 = X.AnonymousClass355.A01(r14, r1)     // Catch:{ Exception -> 0x02c7 }
        L_0x021d:
            boolean r0 = r1.has(r15)     // Catch:{ Exception -> 0x02c7 }
            if (r0 == 0) goto L_0x024f
            int r0 = r1.getInt(r15)     // Catch:{ Exception -> 0x02c7 }
            java.lang.Integer r29 = java.lang.Integer.valueOf(r0)     // Catch:{ Exception -> 0x02c7 }
        L_0x022b:
            r0 = r18
            boolean r0 = r1.has(r0)     // Catch:{ Exception -> 0x02c7 }
            if (r0 == 0) goto L_0x024c
            r0 = r18
            java.lang.String r34 = r1.getString(r0)     // Catch:{ Exception -> 0x02c7 }
        L_0x0239:
            r0 = r19
            boolean r0 = r1.has(r0)     // Catch:{ Exception -> 0x02c7 }
            if (r0 == 0) goto L_0x02ac
            r0 = r19
            org.json.JSONObject r2 = r1.getJSONObject(r0)     // Catch:{ Exception -> 0x02c7 }
            java.util.HashMap r3 = X.AnonymousClass001.A0t()     // Catch:{ Exception -> 0x02c7 }
            goto L_0x028e
        L_0x024c:
            r34 = 0
            goto L_0x0239
        L_0x024f:
            r29 = 0
            goto L_0x022b
        L_0x0252:
            r33 = 0
            goto L_0x021d
        L_0x0255:
            r28 = 0
            goto L_0x0213
        L_0x0258:
            r27 = 0
            goto L_0x0205
        L_0x025b:
            java.util.ArrayList r4 = X.AnonymousClass001.A0s()     // Catch:{ Exception -> 0x02c7 }
            java.util.ArrayList r3 = X.AnonymousClass001.A0s()     // Catch:{ Exception -> 0x02c7 }
            X.2ve r0 = new X.2ve     // Catch:{ Exception -> 0x02c7 }
            r0.<init>(r2, r4, r3)     // Catch:{ Exception -> 0x02c7 }
            goto L_0x01c5
        L_0x026a:
            r0 = 0
            goto L_0x0181
        L_0x026d:
            r8 = r7
            goto L_0x0153
        L_0x0270:
            r10 = r7
            goto L_0x0142
        L_0x0273:
            r4 = r7
            goto L_0x0168
        L_0x0276:
            r53 = r7
            goto L_0x0126
        L_0x027a:
            r52 = r7
            goto L_0x0113
        L_0x027e:
            r51 = r7
            goto L_0x00ff
        L_0x0282:
            r57 = r7
            goto L_0x00eb
        L_0x0286:
            r56 = r7
            goto L_0x00df
        L_0x028a:
            r25 = 0
            goto L_0x0191
        L_0x028e:
            if (r2 == 0) goto L_0x02ac
            java.util.Iterator r6 = r2.keys()     // Catch:{ Exception -> 0x02c7 }
        L_0x0294:
            boolean r0 = r6.hasNext()     // Catch:{ Exception -> 0x02c7 }
            if (r0 == 0) goto L_0x02ae
            java.lang.String r0 = X.AnonymousClass001.A0m(r6)     // Catch:{ Exception -> 0x02c7 }
            java.lang.String r5 = r2.getString(r0)     // Catch:{ Exception -> 0x02c7 }
            X.C162457s7.A0H(r0)     // Catch:{ Exception -> 0x02c7 }
            X.C162457s7.A0H(r5)     // Catch:{ Exception -> 0x02c7 }
            r3.put(r0, r5)     // Catch:{ Exception -> 0x02c7 }
            goto L_0x0294
        L_0x02ac:
            r2 = 0
            goto L_0x02b3
        L_0x02ae:
            X.2Iu r2 = new X.2Iu     // Catch:{ Exception -> 0x02c7 }
            r2.<init>(r3)     // Catch:{ Exception -> 0x02c7 }
        L_0x02b3:
            java.lang.String r0 = "logEligibilityWaterfall"
            boolean r53 = r1.optBoolean(r0)     // Catch:{ Exception -> 0x02c7 }
            X.3YL r0 = new X.3YL     // Catch:{ Exception -> 0x02c7 }
            r26 = r4
            r35 = r17
            r23 = r0
            r24 = r2
            r23.<init>(r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r40, r42, r44, r46, r47, r48, r49, r50, r51, r52, r53)     // Catch:{ Exception -> 0x02c7 }
            goto L_0x02cf
        L_0x02c7:
            r1 = move-exception
            java.lang.String r0 = "waquickpromotionclient/WAQuickPromotion/Error parsing FromJson."
            com.whatsapp.util.Log.e(r0, r1)
            r0 = 0
        L_0x02cf:
            if (r0 == 0) goto L_0x02d6
            r1 = r22
            r1.add(r0)
        L_0x02d6:
            int r11 = r11 + 1
            goto L_0x0050
        L_0x02da:
            return r22
        L_0x02db:
            r1 = move-exception
            if (r2 == 0) goto L_0x02e6
            r2.close()     // Catch:{ all -> 0x02e2 }
            goto L_0x02e6
        L_0x02e2:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x02e7 }
        L_0x02e6:
            throw r1     // Catch:{ all -> 0x02e7 }
        L_0x02e7:
            r1 = move-exception
            r3.close()     // Catch:{ all -> 0x02ec }
            throw r1
        L_0x02ec:
            r0 = move-exception
            r1.addSuppressed(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C619132t.A02(java.lang.String, int):java.util.List");
    }

    public final void A03(C41932Md r21) {
        JSONObject jSONObject;
        JSONObject jSONObject2;
        JSONObject jSONObject3;
        JSONObject jSONObject4;
        JSONObject jSONObject5;
        C41932Md r2 = r21;
        C162457s7.A0J(r2, 0);
        int parseInt = Integer.parseInt(r2.A00);
        Map map = r2.A01;
        AnonymousClass2KZ r0 = this.A00;
        Integer valueOf = Integer.valueOf(parseInt);
        AnonymousClass1RI r19 = r0.A01;
        C85284Fq A0C = r19.A0C();
        try {
            String[] strArr = new String[1];
            AnonymousClass3H0.A04(String.valueOf(valueOf), A0C, strArr, 0).A07("quick_promotion_payload", "surface_id = ? ", "DELETE_QUICK_PROMOTION_PAYLOAD_WITH_SURFACE_ID", strArr);
            A0C.close();
            Iterator A0q = AnonymousClass000.A0q(map);
            while (A0q.hasNext()) {
                Map.Entry A0w = AnonymousClass001.A0w(A0q);
                String A0q2 = C18310x6.A0q(A0w);
                List<AnonymousClass3YL> A0H = C73723fy.A0H((Iterable) A0w.getValue(), 42);
                JSONArray A1F = AnonymousClass0x9.A1F();
                for (AnonymousClass3YL r4 : A0H) {
                    JSONObject A0l = AnonymousClass0x2.A0l(r4);
                    try {
                        A0l.put("promotionId", r4.A0F);
                        A0l.put("triggers", new JSONArray(r4.A0H));
                        A0l.put("isServerForcePass", r4.A0M);
                        A0l.put("startTimeEpochSeconds", r4.A05);
                        A0l.put("endTimeEpochSeconds", r4.A03);
                        A0l.put("clientTtlSeconds", r4.A02);
                        A0l.put("isUncancelable", r4.A0N);
                        A0l.put("isBypassSurfaceDelay", r4.A0K);
                        A0l.put("isExposureHoldout", r4.A0L);
                        A0l.put("maxImpressions", r4.A01);
                        AnonymousClass2TD r13 = r4.A07;
                        if (r13 != null) {
                            JSONObject A1G = AnonymousClass0x9.A1G();
                            A1G.putOpt("title", r13.A06);
                            A1G.putOpt("content", r13.A05);
                            C43352Ru r02 = r13.A01;
                            JSONObject jSONObject6 = null;
                            if (r02 != null) {
                                jSONObject2 = A01(r02);
                            } else {
                                jSONObject2 = null;
                            }
                            A1G.putOpt("primaryAction", jSONObject2);
                            C43352Ru r03 = r13.A02;
                            if (r03 != null) {
                                jSONObject3 = A01(r03);
                            } else {
                                jSONObject3 = null;
                            }
                            A1G.putOpt("secondaryAction", jSONObject3);
                            C43352Ru r04 = r13.A00;
                            if (r04 != null) {
                                jSONObject4 = A01(r04);
                            } else {
                                jSONObject4 = null;
                            }
                            A1G.putOpt("dismissPromotion", jSONObject4);
                            AnonymousClass2PK r15 = r13.A04;
                            if (r15 != null) {
                                jSONObject5 = AnonymousClass0x9.A1G();
                                jSONObject5.putOpt("description", r15.A00);
                                byte[] bArr = r15.A02;
                                if (bArr != null) {
                                    jSONObject5.putOpt("lightDataValue", Base64.encodeToString(bArr, 2));
                                }
                                byte[] bArr2 = r15.A01;
                                if (bArr2 != null) {
                                    jSONObject5.putOpt("darkDataValue", Base64.encodeToString(bArr2, 2));
                                }
                            } else {
                                jSONObject5 = null;
                            }
                            A1G.putOpt("image", jSONObject5);
                            C41072Iv r05 = r13.A03;
                            if (r05 != null) {
                                jSONObject6 = AnonymousClass0x9.A1G();
                                jSONObject6.putOpt("title", r05.A00);
                            }
                            A1G.putOpt("header", jSONObject6);
                            A0l.putOpt("primaryCreative", A1G);
                        }
                        A0l.putOpt("booleanFilter", C58682ve.A03.A01(r4.A08.A00));
                        A0l.put("hasNativeTemplate", r4.A0J);
                        A0l.put("hasBloks", r4.A0I);
                        A0l.put("skipsContentValidation", r4.A0P);
                        A0l.put("priority", r4.A04);
                        A0l.put("instanceLogData", r4.A0E);
                        A0l.put("templateName", r4.A0G);
                        A0l.put("eligibilityDurationAfterImpressionMs", r4.A00);
                        A0l.putOpt("dismissable", r4.A09);
                        A0l.putOpt("surfaceDelayTime", r4.A0B);
                        A0l.putOpt("experimentKey", r4.A0C);
                        A0l.putOpt("impressionCooldown", r4.A0A);
                        A0l.putOpt("instanceId", r4.A0D);
                        C41062Iu r06 = r4.A06;
                        if (r06 == null) {
                            jSONObject = null;
                        } else {
                            jSONObject = new JSONObject(r06.A00);
                        }
                        A0l.putOpt("contentAttributes", jSONObject);
                        A0l.putOpt("logEligibilityWaterfall", Boolean.valueOf(r4.A0O));
                    } catch (Exception e) {
                        Log.e("waquickpromotionclient/WAQuickPromotion/Error parsing toJson.", e);
                        A0l = null;
                    }
                    A1F.put(A0l);
                }
                String obj = A1F.toString();
                A0C = r19.A0C();
                long currentTimeMillis = System.currentTimeMillis();
                ContentValues A07 = AnonymousClass0x9.A07(5);
                A07.put("surface_id", valueOf);
                A07.put("trigger_id", A0q2);
                A07.put("trigger_context", (String) null);
                A07.put("qp_details", obj);
                AnonymousClass3H0.A02(A07, A0C, "insertion_time", currentTimeMillis).A0C("quick_promotion_payload", "INSERT_WITH_ON_CONFLICT_QUICK_PROMOTION_PAYLOAD", A07, 5);
                A0C.close();
            }
        } catch (Throwable th) {
            th.addSuppressed(th);
            throw th;
        }
    }

    public static final C43352Ru A00(JSONObject jSONObject) {
        String str;
        String str2;
        String str3 = null;
        if (jSONObject.has("title")) {
            str = AnonymousClass355.A01("title", jSONObject);
        } else {
            str = null;
        }
        if (jSONObject.has("url")) {
            str2 = AnonymousClass355.A01("url", jSONObject);
        } else {
            str2 = null;
        }
        if (jSONObject.has("fallBackUrl")) {
            str3 = AnonymousClass355.A01("fallBackUrl", jSONObject);
        }
        return new C43352Ru(str, str2, str3, jSONObject.getInt("limit"), jSONObject.getBoolean("dismissPromotion"));
    }

    public static final JSONObject A01(C43352Ru r3) {
        JSONObject A1G = AnonymousClass0x9.A1G();
        A1G.putOpt("title", r3.A02);
        A1G.putOpt("url", r3.A03);
        A1G.putOpt("fallBackUrl", r3.A01);
        A1G.put("limit", r3.A00);
        A1G.put("dismissPromotion", r3.A04);
        return A1G;
    }
}
