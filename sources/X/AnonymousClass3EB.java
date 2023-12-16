package X;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.whatsapp.jid.Jid;

/* renamed from: X.3EB  reason: invalid class name */
public final class AnonymousClass3EB implements AnonymousClass4E0 {
    public final C59062wH A00;
    public final C69263Wi A01;
    public final C60032xt A02;
    public final C40292Fg A03;
    public final C66543Lv A04;
    public final C57262tM A05;
    public final AnonymousClass1VX A06;
    public final AnonymousClass4FS A07;
    public final C49702gx A08;

    public String B5N(Activity activity) {
        Bundle extras;
        String string;
        C162457s7.A0J(activity, 0);
        Intent intent = activity.getIntent();
        if (intent != null && (extras = intent.getExtras()) != null && (string = extras.getString("chat_id")) != null && string.length() != 0) {
            return string;
        }
        Jid jid = (Jid) this.A03.A00.get("chat_jid");
        if (jid != null) {
            return jid.getRawString();
        }
        return null;
    }

    public String B9r(Activity activity) {
        Bundle extras;
        String string;
        C162457s7.A0J(activity, 0);
        Intent intent = activity.getIntent();
        if (intent == null || (extras = intent.getExtras()) == null || (string = extras.getString("message_id")) == null || string.length() == 0) {
            return C18320x8.A0e("key_msg_id", this.A03.A00);
        }
        return string;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v8, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v12, resolved type: java.lang.String} */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x009d, code lost:
        if ("100".equalsIgnoreCase(r2) != false) goto L_0x009f;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00f2  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00ff  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0160  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0163  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void BlQ(android.app.Activity r39, X.AnonymousClass2ZN r40, java.util.Map r41) {
        /*
            r38 = this;
            r17 = r39
            if (r39 == 0) goto L_0x006c
            android.content.Intent r0 = r17.getIntent()
            if (r0 == 0) goto L_0x006c
            android.os.Bundle r9 = r0.getExtras()
            if (r9 == 0) goto L_0x006c
            java.lang.String r0 = "chat_id"
            java.lang.String r11 = r9.getString(r0)
            com.whatsapp.jid.UserJid r7 = X.AnonymousClass32Y.A08(r11)
            java.lang.String r5 = "flow_token"
            java.lang.String r1 = r9.getString(r5)
            java.lang.String r0 = "flow_message_version"
            java.lang.String r6 = r9.getString(r0)
            javax.crypto.SecretKey r15 = X.C18290x4.A15()
            r13 = 16
            byte[] r34 = X.AnonymousClass29O.A01(r13)
            X.C162457s7.A0H(r15)
            r8 = 0
            r14 = 1
            X.C162457s7.A0J(r15, r14)
            java.lang.String r4 = "user_locale"
            java.lang.String r3 = r9.getString(r4)
            java.lang.String r0 = "1"
            boolean r0 = X.C162457s7.A0P(r6, r0)
            r2 = 0
            if (r0 == 0) goto L_0x006d
            java.lang.String r0 = "flow_data_endpoint"
            java.lang.String r0 = r9.getString(r0)
            X.3Z6 r0 = X.AnonymousClass3Z6.A02(r0, r8)
        L_0x0052:
            java.lang.Object r10 = r0.first
            java.lang.String r10 = (java.lang.String) r10
            java.lang.Object r9 = r0.second
            java.lang.String r9 = (java.lang.String) r9
            if (r6 == 0) goto L_0x006c
            if (r11 == 0) goto L_0x006c
            if (r7 == 0) goto L_0x006c
            if (r1 == 0) goto L_0x006c
            if (r3 == 0) goto L_0x006c
            r12 = r41
            if (r41 == 0) goto L_0x006c
            if (r10 != 0) goto L_0x0078
            if (r9 != 0) goto L_0x0078
        L_0x006c:
            return
        L_0x006d:
            java.lang.String r0 = "flow_id"
            java.lang.String r0 = r9.getString(r0)
            X.3Z6 r0 = X.AnonymousClass3Z6.A02(r8, r0)
            goto L_0x0052
        L_0x0078:
            r12.put(r5, r1)
            r11 = r38
            X.1VX r8 = r11.A06
            r1 = 5374(0x14fe, float:7.53E-42)
            X.2vE r0 = X.C58422vE.A02
            boolean r0 = r8.A0Y(r0, r1)
            java.lang.String r5 = "version"
            if (r0 == 0) goto L_0x009f
            java.lang.Object r1 = r12.get(r5)
            boolean r0 = r1 instanceof java.lang.String
            if (r0 == 0) goto L_0x0097
            r2 = r1
            java.lang.String r2 = (java.lang.String) r2
        L_0x0097:
            java.lang.String r0 = "100"
            boolean r0 = r0.equalsIgnoreCase(r2)
            if (r0 == 0) goto L_0x00a2
        L_0x009f:
            r12.put(r4, r3)
        L_0x00a2:
            r0 = 3945(0xf69, float:5.528E-42)
            java.lang.String r0 = X.C56952sp.A08(r8, r0)
            org.json.JSONObject r1 = X.AnonymousClass0x9.A1H(r0)     // Catch:{ JSONException -> 0x00e1 }
            java.lang.String r0 = "jids"
            org.json.JSONArray r4 = r1.getJSONArray(r0)     // Catch:{ JSONException -> 0x00e1 }
            int r3 = r4.length()     // Catch:{ JSONException -> 0x00e1 }
            r2 = 0
        L_0x00b7:
            if (r2 >= r3) goto L_0x00e7
            java.lang.String r1 = r4.getString(r2)     // Catch:{ JSONException -> 0x00e1 }
            java.lang.String r0 = r7.user     // Catch:{ JSONException -> 0x00e1 }
            if (r1 != 0) goto L_0x00c2
            goto L_0x00c9
        L_0x00c2:
            boolean r0 = r1.equalsIgnoreCase(r0)     // Catch:{ JSONException -> 0x00e1 }
            if (r0 == 0) goto L_0x00de
            goto L_0x00cb
        L_0x00c9:
            if (r0 != 0) goto L_0x00de
        L_0x00cb:
            r0 = 200(0xc8, float:2.8E-43)
            X.C18280x3.A1D(r5, r12, r0)
            byte[] r1 = new byte[r13]
            r2 = 0
        L_0x00d3:
            byte r0 = r34[r2]
            int r0 = ~r0
            byte r0 = (byte) r0
            r1[r2] = r0
            int r2 = r2 + 1
            if (r2 >= r13) goto L_0x00e9
            goto L_0x00d3
        L_0x00de:
            int r2 = r2 + 1
            goto L_0x00b7
        L_0x00e1:
            r1 = move-exception
            java.lang.String r0 = "ExtensionsLogger/isMitigatedAlphaPartner()"
            com.whatsapp.util.Log.e(r0, r1)
        L_0x00e7:
            r1 = r34
        L_0x00e9:
            java.lang.String r3 = "show_loading"
            boolean r0 = r12.containsKey(r3)
            if (r0 == 0) goto L_0x0163
            boolean r2 = X.C18280x3.A1Y(r12, r3)
        L_0x00f6:
            java.lang.String r0 = "show_full_screen_error"
            boolean r4 = r12.containsKey(r0)
            if (r4 == 0) goto L_0x0160
            boolean r33 = X.C18280x3.A1Y(r12, r0)
        L_0x0103:
            r12.remove(r3)
            r12.remove(r0)
            r0 = r17
            X.4Dm r0 = (X.C84734Dm) r0
            r0.Bnc(r2)
            org.json.JSONObject r2 = new org.json.JSONObject
            r2.<init>(r12)
            java.lang.String r29 = X.C18290x4.A0o(r2)
            X.2gx r13 = r11.A08
            X.2wH r12 = r11.A00
            X.3Wi r5 = r11.A01
            X.4FS r3 = r11.A07
            X.3Lv r0 = r11.A04
            X.2xt r4 = r11.A02
            X.3ME r16 = new X.3ME
            r20 = r40
            r23 = r8
            r24 = r3
            r25 = r13
            r26 = r6
            r27 = r10
            r28 = r9
            r30 = r15
            r31 = r1
            r32 = r14
            r18 = r12
            r19 = r5
            r21 = r4
            r22 = r0
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33)
            java.lang.String r30 = X.C18290x4.A0o(r2)
            r35 = 0
            java.lang.String r32 = "UNKNOWN"
            r37 = r35
            r27 = r13
            r28 = r16
            r29 = r7
            r31 = r6
            r33 = r15
            r36 = r35
            r27.A01(r28, r29, r30, r31, r32, r33, r34, r35, r36, r37)
            return
        L_0x0160:
            r33 = 0
            goto L_0x0103
        L_0x0163:
            r2 = 0
            goto L_0x00f6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3EB.BlQ(android.app.Activity, X.2ZN, java.util.Map):void");
    }

    public AnonymousClass3EB(C59062wH r2, C69263Wi r3, C60032xt r4, C40292Fg r5, C66543Lv r6, C57262tM r7, AnonymousClass1VX r8, AnonymousClass4FS r9, C49702gx r10) {
        C18260x0.A0f(r9, r6, r3, r5, r2);
        C18300x5.A1J(r8, 7, r7);
        this.A07 = r9;
        this.A04 = r6;
        this.A01 = r3;
        this.A03 = r5;
        this.A00 = r2;
        this.A08 = r10;
        this.A06 = r8;
        this.A02 = r4;
        this.A05 = r7;
    }
}
