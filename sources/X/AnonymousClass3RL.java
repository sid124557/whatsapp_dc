package X;

/* renamed from: X.3RL  reason: invalid class name */
public final class AnonymousClass3RL implements AnonymousClass4DH {
    public final C47112cj A00;
    public final AnonymousClass4DH A01;

    /* JADX WARNING: Removed duplicated region for block: B:16:0x00dc  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x00e7  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void BiS(java.lang.String r11, java.util.List r12) {
        /*
            r10 = this;
            r7 = 0
            X.2cj r4 = r10.A00
            X.2g1 r0 = r4.A05
            java.lang.String r6 = r0.A00()
            org.json.JSONArray r5 = X.AnonymousClass0x9.A1F()     // Catch:{ all -> 0x00d5 }
            java.util.Iterator r9 = r12.iterator()     // Catch:{ all -> 0x00d5 }
        L_0x0011:
            boolean r0 = r9.hasNext()     // Catch:{ all -> 0x00d5 }
            if (r0 == 0) goto L_0x009a
            java.lang.Object r3 = r9.next()     // Catch:{ all -> 0x00d5 }
            X.1RL r3 = (X.AnonymousClass1RL) r3     // Catch:{ all -> 0x00d5 }
            org.json.JSONObject r2 = X.AnonymousClass0x9.A1G()     // Catch:{ all -> 0x00d5 }
            long r0 = r3.A0O     // Catch:{ all -> 0x00d5 }
            java.lang.String r8 = "creation"
            r2.put(r8, r0)     // Catch:{ all -> 0x00d5 }
            java.lang.String r1 = "desc"
            java.lang.String r0 = r3.A0E     // Catch:{ all -> 0x00d5 }
            r2.put(r1, r0)     // Catch:{ all -> 0x00d5 }
            java.lang.String r8 = "desc_id"
            long r0 = r3.A01     // Catch:{ all -> 0x00d5 }
            r2.put(r8, r0)     // Catch:{ all -> 0x00d5 }
            java.lang.String r8 = "subscribers"
            long r0 = r3.A05     // Catch:{ all -> 0x00d5 }
            r2.put(r8, r0)     // Catch:{ all -> 0x00d5 }
            java.lang.String r1 = "invite_code"
            java.lang.String r0 = r3.A0G     // Catch:{ all -> 0x00d5 }
            r2.put(r1, r0)     // Catch:{ all -> 0x00d5 }
            X.4uZ r0 = r3.A05()     // Catch:{ all -> 0x00d5 }
            java.lang.String r1 = r0.getRawString()     // Catch:{ all -> 0x00d5 }
            java.lang.String r0 = "jid"
            r2.put(r0, r1)     // Catch:{ all -> 0x00d5 }
            X.21q r0 = r3.A07     // Catch:{ all -> 0x00d5 }
            int r1 = r0.value     // Catch:{ all -> 0x00d5 }
            java.lang.String r0 = "membership"
            r2.put(r0, r1)     // Catch:{ all -> 0x00d5 }
            java.lang.String r1 = "name"
            java.lang.String r0 = r3.A0H     // Catch:{ all -> 0x00d5 }
            r2.put(r1, r0)     // Catch:{ all -> 0x00d5 }
            java.lang.String r8 = "name_id"
            long r0 = r3.A02     // Catch:{ all -> 0x00d5 }
            r2.put(r8, r0)     // Catch:{ all -> 0x00d5 }
            java.lang.String r8 = "pic_id"
            long r0 = r3.A03     // Catch:{ all -> 0x00d5 }
            r2.put(r8, r0)     // Catch:{ all -> 0x00d5 }
            java.lang.String r1 = "pic_preview"
            java.lang.String r0 = r3.A0I     // Catch:{ all -> 0x00d5 }
            r2.put(r1, r0)     // Catch:{ all -> 0x00d5 }
            java.lang.String r8 = "pic_preview_id"
            long r0 = r3.A04     // Catch:{ all -> 0x00d5 }
            r2.put(r8, r0)     // Catch:{ all -> 0x00d5 }
            java.lang.String r1 = "pic"
            java.lang.String r0 = r3.A0J     // Catch:{ all -> 0x00d5 }
            r2.put(r1, r0)     // Catch:{ all -> 0x00d5 }
            X.21e r0 = r3.A0C     // Catch:{ all -> 0x00d5 }
            int r1 = r0.value     // Catch:{ all -> 0x00d5 }
            java.lang.String r0 = "verified"
            r2.put(r0, r1)     // Catch:{ all -> 0x00d5 }
            r5.put(r2)     // Catch:{ all -> 0x00d5 }
            goto L_0x0011
        L_0x009a:
            java.lang.String r3 = r5.toString()     // Catch:{ all -> 0x00d5 }
            if (r3 == 0) goto L_0x00d5
            X.2YW r1 = r4.A06     // Catch:{ all -> 0x00cf }
            r0 = 0
            X.C162457s7.A0J(r6, r0)     // Catch:{ all -> 0x00cf }
            X.2sH r0 = r1.A00     // Catch:{ all -> 0x00cf }
            long r8 = r0.A0D()     // Catch:{ all -> 0x00cf }
            X.2iu r2 = r1.A01     // Catch:{ all -> 0x00cf }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0l(r6)     // Catch:{ all -> 0x00cf }
            java.lang.String r0 = "_timestamp"
            java.lang.String r1 = X.AnonymousClass000.A0X(r0, r1)     // Catch:{ all -> 0x00cf }
            java.lang.String r0 = java.lang.String.valueOf(r8)     // Catch:{ all -> 0x00cf }
            r2.A02(r1, r0)     // Catch:{ all -> 0x00cf }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0l(r6)     // Catch:{ all -> 0x00cf }
            java.lang.String r0 = "_data"
            java.lang.String r0 = X.AnonymousClass000.A0X(r0, r1)     // Catch:{ all -> 0x00cf }
            r2.A02(r0, r3)     // Catch:{ all -> 0x00cf }
            X.2wD r1 = X.C59022wD.A00     // Catch:{ all -> 0x00cf }
            goto L_0x00d6
        L_0x00cf:
            r0 = move-exception
            X.3Z0 r1 = X.AnonymousClass3Z0.A01(r0)
            goto L_0x00d6
        L_0x00d5:
            r1 = 0
        L_0x00d6:
            boolean r0 = r1 instanceof X.AnonymousClass3Z0
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x00e1
            java.lang.String r0 = "RecommendedCache Serialized successfully"
            com.whatsapp.util.Log.d((java.lang.String) r0)
        L_0x00e1:
            java.lang.Throwable r1 = X.AnonymousClass3Z9.A00(r1)
            if (r1 == 0) goto L_0x00ec
            java.lang.String r0 = "RecommendedCache Failed to serialize"
            com.whatsapp.util.Log.e(r0, r1)
        L_0x00ec:
            X.4DH r1 = r10.A01
            java.util.List r0 = r4.A00(r12)
            r1.BiS(r7, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3RL.BiS(java.lang.String, java.util.List):void");
    }

    public void BS5(AnonymousClass8SE r2) {
        this.A01.BS5(r2);
    }

    public AnonymousClass3RL(C47112cj r1, AnonymousClass4DH r2) {
        this.A01 = r2;
        this.A00 = r1;
    }
}
