package X;

import org.json.JSONObject;

/* renamed from: X.9AG  reason: invalid class name */
public class AnonymousClass9AG extends AnonymousClass9OC {
    public JSONObject A00;
    public JSONObject A01;
    public JSONObject A02;
    public JSONObject A03;
    public final C56612sH A04;
    public final AnonymousClass1VX A05;
    public final AnonymousClass31C A06;

    public AnonymousClass9AG(C56612sH r2, AnonymousClass1VX r3, AnonymousClass31C r4, AnonymousClass9U1 r5, AnonymousClass9U5 r6) {
        super(r5.A04, r6);
        this.A04 = r2;
        this.A05 = r3;
        this.A06 = r4;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00e8, code lost:
        if (r4.A03.equals(r2.A01.getString(r9)) == false) goto L_0x00fa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00ea, code lost:
        r3 = "Matches";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00ec, code lost:
        r5.put(r6, X.AnonymousClass000.A0X(" in salt and request params", X.AnonymousClass000.A0l(r3)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00fa, code lost:
        r3 = "Mismatches";
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A00(java.lang.String r23, java.util.List r24) {
        /*
            r22 = this;
            r2 = r22
            X.1VX r1 = r2.A05
            r0 = 635(0x27b, float:8.9E-43)
            boolean r0 = r1.A0X(r0)
            if (r0 == 0) goto L_0x0015
            r1 = r23
            int r0 = r1.hashCode()
            switch(r0) {
                case -120834421: goto L_0x0016;
                case 83413: goto L_0x0033;
                case 1282366491: goto L_0x0040;
                default: goto L_0x0015;
            }
        L_0x0015:
            return
        L_0x0016:
            java.lang.String r3 = "SKIPPED_DEVICE_BINDING"
            boolean r0 = r1.equals(r3)
            if (r0 == 0) goto L_0x0015
            java.util.ArrayList r5 = X.AnonymousClass001.A0s()
            java.lang.String r1 = "action"
            java.lang.String r0 = "upi-log-event"
            X.AnonymousClass39V.A03(r1, r0, r5)
            java.lang.String r0 = "event-id"
            X.AnonymousClass39V.A03(r0, r3, r5)
            long r3 = java.lang.System.currentTimeMillis()
            goto L_0x0060
        L_0x0033:
            java.lang.String r10 = "U66"
            boolean r0 = r1.equals(r10)
            if (r0 == 0) goto L_0x0015
            org.json.JSONObject r0 = r2.A01
            if (r0 == 0) goto L_0x0015
            goto L_0x008b
        L_0x0040:
            java.lang.String r3 = "SIM_SWAP"
            boolean r0 = r1.equals(r3)
            if (r0 == 0) goto L_0x0015
            java.lang.String r6 = "event-ts"
            java.util.ArrayList r5 = X.AnonymousClass001.A0s()
            java.lang.String r1 = "action"
            java.lang.String r0 = "upi-log-event"
            X.AnonymousClass39V.A03(r1, r0, r5)
            java.lang.String r0 = "event-id"
            X.AnonymousClass39V.A03(r0, r3, r5)
            long r3 = java.lang.System.currentTimeMillis()
            goto L_0x01a9
        L_0x0060:
            org.json.JSONObject r1 = r2.A00     // Catch:{ JSONException -> 0x0068 }
            java.lang.String r0 = "event-ts"
            r1.put(r0, r3)     // Catch:{ JSONException -> 0x0068 }
            goto L_0x006c
        L_0x0068:
            r0 = move-exception
            r0.printStackTrace()
        L_0x006c:
            org.json.JSONObject r0 = r2.A00
            java.lang.String r1 = r0.toString()
            java.lang.String r0 = "event-info"
            X.AnonymousClass39V.A03(r0, r1, r5)
            org.json.JSONObject r0 = r2.A00
            java.lang.String r1 = r0.toString()
            java.lang.String r0 = "event-dl-info"
            X.AnonymousClass39V.A03(r0, r1, r5)
            X.9U5 r4 = r2.A01
            X.36K r7 = X.C1899593h.A0T(r5)
            r0 = 1
            goto L_0x01d5
        L_0x008b:
            X.31C r12 = r2.A06     // Catch:{ JSONException -> 0x01a3 }
            java.lang.String r15 = r12.A03()     // Catch:{ JSONException -> 0x01a3 }
            long r0 = java.lang.System.currentTimeMillis()     // Catch:{ JSONException -> 0x01a3 }
            org.json.JSONObject r7 = X.AnonymousClass0x9.A1G()     // Catch:{ JSONException -> 0x01a3 }
            java.lang.String r8 = "event-ts"
            r7.put(r8, r0)     // Catch:{ JSONException -> 0x01a3 }
            org.json.JSONObject r5 = X.AnonymousClass0x9.A1G()     // Catch:{ JSONException -> 0x01a3 }
            java.util.Iterator r11 = r24.iterator()     // Catch:{ JSONException -> 0x01a3 }
        L_0x00a6:
            boolean r3 = r11.hasNext()     // Catch:{ JSONException -> 0x01a3 }
            if (r3 == 0) goto L_0x00fd
            java.lang.Object r4 = r11.next()     // Catch:{ JSONException -> 0x01a3 }
            X.39V r4 = (X.AnonymousClass39V) r4     // Catch:{ JSONException -> 0x01a3 }
            java.lang.String r6 = r4.A02     // Catch:{ JSONException -> 0x01a3 }
            int r3 = r6.hashCode()     // Catch:{ JSONException -> 0x01a3 }
            switch(r3) {
                case -1413853096: goto L_0x00bc;
                case -756180983: goto L_0x00c7;
                case 996422991: goto L_0x00d2;
                default: goto L_0x00bb;
            }     // Catch:{ JSONException -> 0x01a3 }
        L_0x00bb:
            goto L_0x00a6
        L_0x00bc:
            java.lang.String r3 = "amount"
            boolean r3 = r6.equals(r3)     // Catch:{ JSONException -> 0x01a3 }
            if (r3 == 0) goto L_0x00a6
            java.lang.String r9 = "txnAmount"
            goto L_0x00dc
        L_0x00c7:
            java.lang.String r3 = "receiver-vpa"
            boolean r3 = r6.equals(r3)     // Catch:{ JSONException -> 0x01a3 }
            if (r3 == 0) goto L_0x00a6
            java.lang.String r9 = "payeeAddr"
            goto L_0x00dc
        L_0x00d2:
            java.lang.String r3 = "sender-vpa"
            boolean r3 = r6.equals(r3)     // Catch:{ JSONException -> 0x01a3 }
            if (r3 == 0) goto L_0x00a6
            java.lang.String r9 = "payerAddr"
        L_0x00dc:
            java.lang.String r4 = r4.A03     // Catch:{ JSONException -> 0x01a3 }
            org.json.JSONObject r3 = r2.A01     // Catch:{ JSONException -> 0x01a3 }
            java.lang.String r3 = r3.getString(r9)     // Catch:{ JSONException -> 0x01a3 }
            boolean r3 = r4.equals(r3)     // Catch:{ JSONException -> 0x01a3 }
            if (r3 == 0) goto L_0x00fa
            java.lang.String r3 = "Matches"
        L_0x00ec:
            java.lang.StringBuilder r4 = X.AnonymousClass000.A0l(r3)     // Catch:{ JSONException -> 0x01a3 }
            java.lang.String r3 = " in salt and request params"
            java.lang.String r3 = X.AnonymousClass000.A0X(r3, r4)     // Catch:{ JSONException -> 0x01a3 }
            r5.put(r6, r3)     // Catch:{ JSONException -> 0x01a3 }
            goto L_0x00a6
        L_0x00fa:
            java.lang.String r3 = "Mismatches"
            goto L_0x00ec
        L_0x00fd:
            java.lang.String r6 = "request-params"
            org.json.JSONObject r5 = X.C18300x5.A0z(r5, r6, r7)     // Catch:{ JSONException -> 0x01a3 }
            r5.put(r8, r0)     // Catch:{ JSONException -> 0x01a3 }
            org.json.JSONObject r4 = X.AnonymousClass0x9.A1G()     // Catch:{ JSONException -> 0x01a3 }
            org.json.JSONObject r0 = r2.A01     // Catch:{ JSONException -> 0x01a3 }
            java.util.Iterator r3 = r0.keys()     // Catch:{ JSONException -> 0x01a3 }
        L_0x0110:
            boolean r0 = r3.hasNext()     // Catch:{ JSONException -> 0x01a3 }
            if (r0 == 0) goto L_0x0124
            java.lang.String r1 = X.AnonymousClass001.A0m(r3)     // Catch:{ JSONException -> 0x01a3 }
            org.json.JSONObject r0 = r2.A01     // Catch:{ JSONException -> 0x01a3 }
            java.lang.Object r0 = r0.get(r1)     // Catch:{ JSONException -> 0x01a3 }
            X.C18300x5.A1L(r0, r1, r4)     // Catch:{ JSONException -> 0x01a3 }
            goto L_0x0110
        L_0x0124:
            java.lang.String r0 = "salt-params"
            org.json.JSONObject r4 = X.C18300x5.A0z(r4, r0, r5)     // Catch:{ JSONException -> 0x01a3 }
            java.util.Iterator r3 = r24.iterator()     // Catch:{ JSONException -> 0x01a3 }
        L_0x012e:
            boolean r0 = r3.hasNext()     // Catch:{ JSONException -> 0x01a3 }
            if (r0 == 0) goto L_0x0142
            java.lang.Object r0 = r3.next()     // Catch:{ JSONException -> 0x01a3 }
            X.39V r0 = (X.AnonymousClass39V) r0     // Catch:{ JSONException -> 0x01a3 }
            java.lang.String r1 = r0.A02     // Catch:{ JSONException -> 0x01a3 }
            java.lang.String r0 = r0.A03     // Catch:{ JSONException -> 0x01a3 }
            r4.put(r1, r0)     // Catch:{ JSONException -> 0x01a3 }
            goto L_0x012e
        L_0x0142:
            r5.put(r6, r4)     // Catch:{ JSONException -> 0x01a3 }
            java.lang.String r9 = r7.toString()     // Catch:{ JSONException -> 0x01a3 }
            java.lang.String r8 = r5.toString()     // Catch:{ JSONException -> 0x01a3 }
            X.9IP r7 = new X.9IP     // Catch:{ JSONException -> 0x01a3 }
            r7.<init>(r15)     // Catch:{ JSONException -> 0x01a3 }
            X.2rL r6 = X.C56052rL.A01()     // Catch:{ JSONException -> 0x01a3 }
            X.C1899593h.A1M(r6)     // Catch:{ JSONException -> 0x01a3 }
            X.2rL r5 = X.C1899593h.A0U()     // Catch:{ JSONException -> 0x01a3 }
            java.lang.String r1 = "action"
            java.lang.String r0 = "upi-log-event"
            X.C56052rL.A0D(r5, r1, r0)     // Catch:{ JSONException -> 0x01a3 }
            r4 = 0
            r0 = 1
            boolean r3 = X.C1899593h.A1Y(r10, r0, r4)     // Catch:{ JSONException -> 0x01a3 }
            if (r3 == 0) goto L_0x0172
            java.lang.String r3 = "event-id"
            X.C56052rL.A0D(r5, r3, r10)     // Catch:{ JSONException -> 0x01a3 }
        L_0x0172:
            r19 = 10000(0x2710, double:4.9407E-320)
            r16 = r9
            r17 = r0
            r21 = r4
            boolean r3 = X.C626836d.A0M(r16, r17, r19, r21)     // Catch:{ JSONException -> 0x01a3 }
            if (r3 == 0) goto L_0x0185
            java.lang.String r3 = "event-info"
            X.C56052rL.A0D(r5, r3, r9)     // Catch:{ JSONException -> 0x01a3 }
        L_0x0185:
            r16 = r8
            boolean r0 = X.C626836d.A0M(r16, r17, r19, r21)     // Catch:{ JSONException -> 0x01a3 }
            if (r0 == 0) goto L_0x0192
            java.lang.String r0 = "event-dl-info"
            X.C56052rL.A0D(r5, r0, r8)     // Catch:{ JSONException -> 0x01a3 }
        L_0x0192:
            X.36K r14 = X.C41032Ir.A03(r5, r6, r7)     // Catch:{ JSONException -> 0x01a3 }
            r16 = 204(0xcc, float:2.86E-43)
            X.9qU r13 = new X.9qU     // Catch:{ JSONException -> 0x01a3 }
            r13.<init>(r2, r4)     // Catch:{ JSONException -> 0x01a3 }
            r17 = 0
            r12.A0D(r13, r14, r15, r16, r17)     // Catch:{ JSONException -> 0x01a3 }
            return
        L_0x01a3:
            java.lang.String r0 = "PAY: IndiaUpiLogEventAction: exception while creating collecting U66 event info"
            com.whatsapp.util.Log.w((java.lang.String) r0)
            return
        L_0x01a9:
            org.json.JSONObject r0 = r2.A03     // Catch:{ JSONException -> 0x01b4 }
            r0.put(r6, r3)     // Catch:{ JSONException -> 0x01b4 }
            org.json.JSONObject r0 = r2.A02     // Catch:{ JSONException -> 0x01b4 }
            r0.put(r6, r3)     // Catch:{ JSONException -> 0x01b4 }
            goto L_0x01b8
        L_0x01b4:
            r0 = move-exception
            r0.printStackTrace()
        L_0x01b8:
            org.json.JSONObject r0 = r2.A03
            java.lang.String r1 = r0.toString()
            java.lang.String r0 = "event-info"
            X.AnonymousClass39V.A03(r0, r1, r5)
            org.json.JSONObject r0 = r2.A02
            java.lang.String r1 = r0.toString()
            java.lang.String r0 = "event-dl-info"
            X.AnonymousClass39V.A03(r0, r1, r5)
            X.9U5 r4 = r2.A01
            X.36K r7 = X.C1899593h.A0T(r5)
            r0 = 0
        L_0x01d5:
            X.9Kv r5 = new X.9Kv
            r5.<init>(r2, r0)
            java.lang.String r8 = "set"
            r10 = 30000(0x7530, double:1.4822E-319)
            java.lang.String r9 = "w:pay"
            X.2oU r0 = r4.A04
            android.content.Context r1 = r0.A00
            X.3Wi r3 = r4.A00
            X.2Ha r2 = r4.A0A
            r6 = 3
            X.9oU r0 = new X.9oU
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r5 = r4
            r6 = r0
            r5.A0H(r6, r7, r8, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass9AG.A00(java.lang.String, java.util.List):void");
    }

    public void A01(JSONObject jSONObject) {
        this.A01 = jSONObject;
    }
}
