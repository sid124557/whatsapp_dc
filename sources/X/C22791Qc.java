package X;

import java.util.List;

/* renamed from: X.1Qc  reason: invalid class name and case insensitive filesystem */
public class C22791Qc extends AnonymousClass2UV {
    public long A00;
    public Long A01;
    public String A02;
    public String A03;
    public List A04;

    public C22791Qc(long j, String str, String str2) {
        this.A00 = j;
        this.A03 = str;
        this.A02 = str2;
        this.A01 = AnonymousClass0x2.A0T();
        this.A04 = AnonymousClass001.A0s();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0061, code lost:
        r1 = new X.AnonymousClass1QX();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x006a, code lost:
        if (r1.A04(r4) == false) goto L_0x00c0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00a7, code lost:
        if (r1.equals("template_hsm") != false) goto L_0x00a9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00a9, code lost:
        r1 = new X.AnonymousClass1QZ();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00b2, code lost:
        if (r1.A04(r4) == false) goto L_0x00c0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:?, code lost:
        r8.A04.add(r1);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A04(java.lang.String r9) {
        /*
            r8 = this;
            java.lang.String r7 = "undefined"
            r6 = 0
            org.json.JSONObject r5 = X.AnonymousClass0x9.A1H(r9)     // Catch:{ JSONException -> 0x00cf }
            java.lang.String r0 = "start_ts"
            r1 = -1
            long r3 = r5.optLong(r0, r1)     // Catch:{ JSONException -> 0x00cf }
            r8.A00 = r3     // Catch:{ JSONException -> 0x00cf }
            java.lang.String r0 = "conversation_id"
            java.lang.String r0 = r5.optString(r0, r7)     // Catch:{ JSONException -> 0x00cf }
            r8.A02 = r0     // Catch:{ JSONException -> 0x00cf }
            java.lang.String r0 = "business_jid"
            java.lang.String r0 = r5.optString(r0, r7)     // Catch:{ JSONException -> 0x00cf }
            r8.A03 = r0     // Catch:{ JSONException -> 0x00cf }
            java.lang.String r0 = "msgs_skipped_count"
            long r0 = r5.optLong(r0, r1)     // Catch:{ JSONException -> 0x00cf }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ JSONException -> 0x00cf }
            r8.A01 = r0     // Catch:{ JSONException -> 0x00cf }
            java.lang.String r0 = "msg_events"
            org.json.JSONArray r3 = r5.optJSONArray(r0)     // Catch:{ JSONException -> 0x00cf }
            java.util.ArrayList r0 = X.AnonymousClass001.A0s()     // Catch:{ JSONException -> 0x00cf }
            r8.A04 = r0     // Catch:{ JSONException -> 0x00cf }
            r2 = 0
            if (r3 == 0) goto L_0x00cd
        L_0x0040:
            int r0 = r3.length()     // Catch:{ JSONException -> 0x00cf }
            if (r2 >= r0) goto L_0x00cd
            java.lang.Object r4 = r3.get(r2)     // Catch:{ JSONException -> 0x00cf }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ JSONException -> 0x00cf }
            org.json.JSONObject r5 = X.AnonymousClass0x9.A1H(r4)     // Catch:{ JSONException -> 0x00ba }
            java.lang.String r1 = "message_type"
            java.lang.String r0 = "unknown"
            java.lang.String r1 = r5.optString(r1, r0)     // Catch:{ JSONException -> 0x00ba }
            int r0 = r1.hashCode()     // Catch:{ JSONException -> 0x00ba }
            switch(r0) {
                case -975649923: goto L_0x00a0;
                case -537401432: goto L_0x0096;
                case 3556653: goto L_0x0081;
                case 1844104930: goto L_0x006d;
                default: goto L_0x0061;
            }     // Catch:{ JSONException -> 0x00ba }
        L_0x0061:
            X.1QX r1 = new X.1QX     // Catch:{ JSONException -> 0x00ba }
            r1.<init>()     // Catch:{ JSONException -> 0x00ba }
            boolean r0 = r1.A04(r4)     // Catch:{ JSONException -> 0x00ba }
            if (r0 == 0) goto L_0x00c0
            goto L_0x00b4
        L_0x006d:
            java.lang.String r0 = "interactive"
            boolean r0 = r1.equals(r0)     // Catch:{ JSONException -> 0x00ba }
            if (r0 == 0) goto L_0x0061
            X.1Qa r1 = new X.1Qa     // Catch:{ JSONException -> 0x00ba }
            r1.<init>()     // Catch:{ JSONException -> 0x00ba }
            boolean r0 = r1.A04(r4)     // Catch:{ JSONException -> 0x00ba }
            if (r0 == 0) goto L_0x00c0
            goto L_0x00b4
        L_0x0081:
            java.lang.String r0 = "text"
            boolean r0 = r1.equals(r0)     // Catch:{ JSONException -> 0x00ba }
            if (r0 == 0) goto L_0x0061
            X.1QY r1 = new X.1QY     // Catch:{ JSONException -> 0x00ba }
            r1.<init>()     // Catch:{ JSONException -> 0x00ba }
            boolean r0 = r1.A04(r4)     // Catch:{ JSONException -> 0x00ba }
            if (r0 == 0) goto L_0x00c0
            goto L_0x00b4
        L_0x0096:
            java.lang.String r0 = "template_hsm_reply"
            boolean r0 = r1.equals(r0)     // Catch:{ JSONException -> 0x00ba }
            if (r0 == 0) goto L_0x0061
            goto L_0x00a9
        L_0x00a0:
            java.lang.String r0 = "template_hsm"
            boolean r0 = r1.equals(r0)     // Catch:{ JSONException -> 0x00ba }
            if (r0 == 0) goto L_0x0061
        L_0x00a9:
            X.1QZ r1 = new X.1QZ     // Catch:{ JSONException -> 0x00ba }
            r1.<init>()     // Catch:{ JSONException -> 0x00ba }
            boolean r0 = r1.A04(r4)     // Catch:{ JSONException -> 0x00ba }
            if (r0 == 0) goto L_0x00c0
        L_0x00b4:
            java.util.List r0 = r8.A04     // Catch:{ JSONException -> 0x00cf }
            r0.add(r1)     // Catch:{ JSONException -> 0x00cf }
            goto L_0x00c9
        L_0x00ba:
            r1 = move-exception
            java.lang.String r0 = "ConversationSketchEvent: getEventFromJsonString threw: "
            com.whatsapp.util.Log.w(r0, r1)     // Catch:{ JSONException -> 0x00cf }
        L_0x00c0:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ JSONException -> 0x00cf }
            java.lang.String r0 = "ConversationSketchConversation: unable to read conversation: "
            X.C18260x0.A0r(r0, r4, r1)     // Catch:{ JSONException -> 0x00cf }
        L_0x00c9:
            int r2 = r2 + 1
            goto L_0x0040
        L_0x00cd:
            r0 = 1
            return r0
        L_0x00cf:
            r1 = move-exception
            java.lang.String r0 = "ConversationSketchConversation: fromJsonString threw: "
            com.whatsapp.util.Log.w(r0, r1)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C22791Qc.A04(java.lang.String):boolean");
    }

    public C22791Qc() {
        this.A00 = 0;
        this.A03 = "undefined";
        this.A02 = "undefined";
        this.A01 = -1L;
        this.A04 = AnonymousClass001.A0s();
    }
}
