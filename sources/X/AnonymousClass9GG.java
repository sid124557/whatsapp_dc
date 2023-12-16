package X;

import org.json.JSONObject;

/* renamed from: X.9GG  reason: invalid class name */
public class AnonymousClass9GG extends AnonymousClass98q {
    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass9GG(X.C56492s4 r20, X.AnonymousClass33p r21, X.AnonymousClass1VX r22, X.AnonymousClass28T r23, X.AnonymousClass3FI r24, X.C183538qC r25, java.lang.String r26, java.lang.String r27, X.AnonymousClass4C1 r28, X.AnonymousClass4C1 r29, long r30) {
        /*
            r19 = this;
            r7 = r21
            java.lang.String r0 = r7.A0Z()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            int r1 = r0.intValue()
            android.util.SparseArray r0 = X.AnonymousClass79A.A01
            java.lang.Object r6 = r0.get(r1)
            if (r6 == 0) goto L_0x0059
            org.json.JSONObject r5 = X.AnonymousClass0x9.A1G()     // Catch:{ JSONException -> 0x0052 }
            java.lang.String r4 = "params"
            org.json.JSONObject r3 = X.AnonymousClass0x9.A1G()     // Catch:{ JSONException -> 0x0052 }
            java.lang.String r2 = "server_params"
            org.json.JSONObject r1 = X.AnonymousClass0x9.A1G()     // Catch:{ JSONException -> 0x0052 }
            java.lang.String r0 = "country_iso_graphql"
            org.json.JSONObject r0 = r1.put(r0, r6)     // Catch:{ JSONException -> 0x0052 }
            org.json.JSONObject r0 = r3.put(r2, r0)     // Catch:{ JSONException -> 0x0052 }
            org.json.JSONObject r0 = r5.put(r4, r0)     // Catch:{ JSONException -> 0x0052 }
            java.lang.String r14 = r0.toString()     // Catch:{ JSONException -> 0x0052 }
            r5 = r19
            r6 = r20
            r8 = r22
            r9 = r23
            r10 = r24
            r11 = r25
            r12 = r26
            r13 = r27
            r15 = r28
            r16 = r29
            r17 = r30
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            return
        L_0x0052:
            r1 = move-exception
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r1)
            throw r0
        L_0x0059:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass9GG.<init>(X.2s4, X.33p, X.1VX, X.28T, X.3FI, X.8qC, java.lang.String, java.lang.String, X.4C1, X.4C1, long):void");
    }

    public void A09(JSONObject jSONObject) {
        super.A09(jSONObject);
        jSONObject.put("country_iso_graphql", AnonymousClass79A.A01.get(Integer.valueOf(this.A03.A0Z()).intValue()));
    }
}
