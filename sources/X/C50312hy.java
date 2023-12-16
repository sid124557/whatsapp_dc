package X;

import com.whatsapp.jid.Jid;

/* renamed from: X.2hy  reason: invalid class name and case insensitive filesystem */
public final class C50312hy {
    public final C48032eE A00;
    public final AnonymousClass2O2 A01;
    public final AnonymousClass2YC A02;
    public final C53822nj A03;
    public final C56162rW A04;
    public final AnonymousClass1VX A05;
    public final AnonymousClass4FV A06;
    public final AnonymousClass2WM A07;
    public final AnonymousClass4FS A08;

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0010, code lost:
        if (r1 == null) goto L_0x0012;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A00(X.C50662iZ r28, com.whatsapp.jid.Jid r29, X.C624134x r30, java.lang.Integer r31, java.lang.Integer r32, java.lang.String r33, java.lang.String r34, org.json.JSONObject r35, int r36) {
        /*
            r27 = this;
            r3 = 0
            r7 = r27
            r0 = r30
            if (r30 == 0) goto L_0x00e3
            X.2eE r2 = r7.A00
            long r0 = r0.A1L
            X.2k2 r1 = r2.A00(r0)
            r0 = 1
            if (r1 != 0) goto L_0x0013
        L_0x0012:
            r0 = 0
        L_0x0013:
            java.lang.String r10 = "is_template"
            r8 = r35
            r8.put(r10, r0)
            if (r1 == 0) goto L_0x001e
            java.lang.String r3 = r1.A00
        L_0x001e:
            java.lang.String r9 = "hsm_tag"
            r8.put(r9, r3)
            r0 = 1
            r12 = r36
            if (r12 == r0) goto L_0x00d8
            r0 = 2
            if (r12 == r0) goto L_0x00d8
            r0 = 3
            if (r12 == r0) goto L_0x00d8
        L_0x002e:
            r13 = 0
            X.1an r11 = new X.1an
            r11.<init>()
            java.lang.Integer r6 = X.C18290x4.A0b()
            r11.A03 = r6
            java.lang.Integer r3 = X.AnonymousClass001.A0f()
            r11.A05 = r3
            java.lang.Integer r2 = java.lang.Integer.valueOf(r12)
            r11.A04 = r2
            java.lang.String r0 = r8.toString()
            r11.A09 = r0
            if (r31 == 0) goto L_0x0058
            int r0 = r31.intValue()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r11.A00 = r0
        L_0x0058:
            r5 = r29
            if (r29 == 0) goto L_0x0064
            X.2WM r0 = r7.A07
            java.lang.String r0 = r0.A00(r5)
            r11.A06 = r0
        L_0x0064:
            X.1VX r14 = r7.A05
            r0 = 6381(0x18ed, float:8.942E-42)
            X.2vE r1 = X.C58422vE.A02
            boolean r0 = r14.A0Y(r1, r0)
            r15 = r33
            r4 = r34
            if (r0 == 0) goto L_0x007c
            r11.A08 = r15
            r11.A07 = r4
            r0 = r32
            r11.A01 = r0
        L_0x007c:
            r0 = 6551(0x1997, float:9.18E-42)
            boolean r0 = r14.A0Y(r1, r0)
            r14 = r28
            if (r0 == 0) goto L_0x008e
            if (r28 == 0) goto L_0x008c
            java.lang.Integer r13 = X.C18290x4.A0Z()
        L_0x008c:
            r11.A02 = r13
        L_0x008e:
            X.4FV r1 = r7.A06
            r1.BhA(r11)
            X.1aF r11 = new X.1aF
            r11.<init>()
            r11.A01 = r6
            r11.A03 = r3
            r11.A02 = r2
            java.lang.String r0 = r8.toString()
            r11.A05 = r0
            if (r31 == 0) goto L_0x00b0
            int r0 = r31.intValue()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r11.A00 = r0
        L_0x00b0:
            if (r29 == 0) goto L_0x00ba
            X.2WM r0 = r7.A07
            java.lang.String r0 = r0.A00(r5)
            r11.A04 = r0
        L_0x00ba:
            r1.BhA(r11)
            r0 = 0
            r6 = 1
            if (r36 == 0) goto L_0x00f6
            r1 = 2
            if (r12 == r1) goto L_0x00ee
            r1 = 3
            if (r12 == r1) goto L_0x00e6
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "Cannot initialize screen progress reporter. Interaction type unknown ("
            r1.append(r0)
            java.lang.String r0 = X.C18260x0.A09(r1, r12)
            com.whatsapp.util.Log.w((java.lang.String) r0)
            return
        L_0x00d8:
            X.2nj r0 = r7.A03
            java.lang.String r1 = r0.A02
            java.lang.String r0 = "last_screen_id"
            r8.put(r0, r1)
            goto L_0x002e
        L_0x00e3:
            r1 = r3
            goto L_0x0012
        L_0x00e6:
            X.2nj r2 = r7.A03
            java.lang.String r1 = "flow_error"
            r2.A02(r1, r0)
            return
        L_0x00ee:
            X.2nj r1 = r7.A03
            java.lang.String r0 = "flow_success"
            r1.A02(r0, r6)
            return
        L_0x00f6:
            if (r31 == 0) goto L_0x016a
            if (r29 == 0) goto L_0x016a
            java.lang.String r1 = "flow_id"
            java.lang.String r3 = r8.optString(r1)     // Catch:{ JSONException -> 0x0163 }
            java.lang.String r1 = "session_id"
            java.lang.String r2 = r8.optString(r1)     // Catch:{ JSONException -> 0x0163 }
            java.lang.String r1 = "extensions_message_id"
            java.lang.String r17 = X.C18300x5.A0l(r1, r8)     // Catch:{ JSONException -> 0x0163 }
            int r10 = r8.optInt(r10)     // Catch:{ JSONException -> 0x0163 }
            java.lang.String r20 = X.C18300x5.A0l(r9, r8)     // Catch:{ JSONException -> 0x0163 }
            java.lang.String r1 = "extension_restored_from_cache"
            int r1 = r8.optInt(r1, r0)     // Catch:{ JSONException -> 0x0163 }
            java.lang.String r0 = "categories"
            org.json.JSONArray r0 = r8.optJSONArray(r0)     // Catch:{ JSONException -> 0x0163 }
            if (r0 == 0) goto L_0x0130
            java.lang.String r19 = r0.toString()     // Catch:{ JSONException -> 0x0163 }
        L_0x0127:
            java.lang.String r0 = "extension_status"
            java.lang.String r21 = r8.optString(r0)     // Catch:{ JSONException -> 0x0163 }
            X.2nj r0 = r7.A03     // Catch:{ JSONException -> 0x0163 }
            goto L_0x0133
        L_0x0130:
            r19 = 0
            goto L_0x0127
        L_0x0133:
            boolean r25 = X.AnonymousClass000.A1S(r10)
            boolean r26 = X.AnonymousClass000.A1U(r1, r6)
            int r24 = r31.intValue()     // Catch:{ JSONException -> 0x0163 }
            X.C162457s7.A0H(r3)     // Catch:{ JSONException -> 0x0163 }
            X.C162457s7.A0H(r2)     // Catch:{ JSONException -> 0x0163 }
            r1 = 2
            X.C18270x1.A11(r3, r1, r2)     // Catch:{ JSONException -> 0x0163 }
            X.2oA r1 = r0.A01     // Catch:{ JSONException -> 0x0163 }
            if (r1 == 0) goto L_0x0152
            java.lang.String r1 = "Initializing new extension session but previous metadata has not been reset. Most likely `reportExtensionExit()` has not been called."
            com.whatsapp.util.Log.w((java.lang.String) r1)     // Catch:{ JSONException -> 0x0163 }
        L_0x0152:
            X.2oA r13 = new X.2oA     // Catch:{ JSONException -> 0x0163 }
            r22 = r15
            r23 = r4
            r15 = r5
            r16 = r3
            r18 = r2
            r13.<init>(r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)     // Catch:{ JSONException -> 0x0163 }
            r0.A01 = r13     // Catch:{ JSONException -> 0x0163 }
            return
        L_0x0163:
            r1 = move-exception
            java.lang.String r0 = "Failed to initialize screen progress reporter"
            com.whatsapp.util.Log.e(r0, r1)
            return
        L_0x016a:
            java.lang.String r0 = "Cannot log extension screen progress without metadata."
            com.whatsapp.util.Log.e((java.lang.String) r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C50312hy.A00(X.2iZ, com.whatsapp.jid.Jid, X.34x, java.lang.Integer, java.lang.Integer, java.lang.String, java.lang.String, org.json.JSONObject, int):void");
    }

    public final void A01(Jid jid, C624134x r13, Integer num, String str, String str2, String str3, String str4, int i) {
        C162457s7.A0J(str, 1);
        String str5 = str4;
        C162457s7.A0J(str5, 7);
        this.A08.BkM(new C71043bT(this, jid, r13, num, str, str5, str2, str3, i));
    }

    public C50312hy(C48032eE r2, AnonymousClass2O2 r3, AnonymousClass2YC r4, C53822nj r5, C56162rW r6, AnonymousClass1VX r7, AnonymousClass4FV r8, AnonymousClass2WM r9, AnonymousClass4FS r10) {
        C18260x0.A0d(r10, r8, r5, r2);
        AnonymousClass0x2.A1B(r4, r7);
        C162457s7.A0J(r3, 9);
        this.A08 = r10;
        this.A06 = r8;
        this.A07 = r9;
        this.A03 = r5;
        this.A00 = r2;
        this.A04 = r6;
        this.A02 = r4;
        this.A05 = r7;
        this.A01 = r3;
    }
}
