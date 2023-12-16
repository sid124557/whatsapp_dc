package X;

import com.whatsapp.jid.UserJid;
import org.json.JSONObject;

/* renamed from: X.2xt  reason: invalid class name and case insensitive filesystem */
public final class C60032xt {
    public final C55682qk A00;
    public final C53412n3 A01;
    public final AnonymousClass1VX A02;

    /* JADX WARNING: type inference failed for: r3v1, types: [X.3Z0] */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0014, code lost:
        if (r3.length() == 0) goto L_0x0016;
     */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.String A00(java.lang.String r5) {
        /*
            r4 = 0
            if (r5 == 0) goto L_0x0036
            org.json.JSONObject r1 = X.AnonymousClass0x9.A1H(r5)     // Catch:{ all -> 0x001b }
            java.lang.String r0 = "error_msg"
            java.lang.String r3 = r1.optString(r0)     // Catch:{ all -> 0x001b }
            if (r3 == 0) goto L_0x0016
            int r1 = r3.length()     // Catch:{ all -> 0x001b }
            r0 = 0
            if (r1 != 0) goto L_0x0017
        L_0x0016:
            r0 = 1
        L_0x0017:
            if (r0 == 0) goto L_0x0020
            r3 = r4
            goto L_0x0020
        L_0x001b:
            r0 = move-exception
            X.3Z0 r3 = X.AnonymousClass3Z0.A01(r0)
        L_0x0020:
            java.lang.Throwable r2 = X.AnonymousClass3Z9.A00(r3)
            if (r2 == 0) goto L_0x002f
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "ExtensionsLogger/ExtensionsDataUtil/processErrorPayload() - null payload "
            X.C18260x0.A17(r0, r1, r2)
        L_0x002f:
            boolean r0 = r3 instanceof X.AnonymousClass3Z0
            if (r0 != 0) goto L_0x0034
            r4 = r3
        L_0x0034:
            java.lang.String r4 = (java.lang.String) r4
        L_0x0036:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C60032xt.A00(java.lang.String):java.lang.String");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0078, code lost:
        if (r13 != null) goto L_0x0058;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x007c, code lost:
        if (r13 != null) goto L_0x001b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0080, code lost:
        if (r13 != null) goto L_0x002d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0051  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0077  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A01(android.app.Activity r13, X.C56422rx r14, X.C66543Lv r15, X.C50312hy r16, java.lang.String r17, java.lang.String r18) {
        /*
            r12 = this;
            r0 = 1
            r10 = r17
            X.C162457s7.A0J(r10, r0)
            r9 = 0
            if (r13 == 0) goto L_0x007b
            android.content.Intent r0 = r13.getIntent()
            if (r0 == 0) goto L_0x007b
            android.os.Bundle r1 = r0.getExtras()
            if (r1 == 0) goto L_0x007b
            java.lang.String r0 = "action_name"
            java.lang.String r6 = r1.getString(r0)
        L_0x001b:
            android.content.Intent r0 = r13.getIntent()
            if (r0 == 0) goto L_0x007f
            android.os.Bundle r1 = r0.getExtras()
            if (r1 == 0) goto L_0x007f
            java.lang.String r0 = "flow_id"
            java.lang.String r7 = r1.getString(r0)
        L_0x002d:
            android.content.Intent r0 = r13.getIntent()
            if (r0 == 0) goto L_0x0083
            android.os.Bundle r1 = r0.getExtras()
            if (r1 == 0) goto L_0x0083
            java.lang.String r0 = "chat_id"
            java.lang.String r0 = r1.getString(r0)
        L_0x003f:
            X.4uZ r4 = X.C18310x6.A0S(r0)
            if (r13 == 0) goto L_0x0077
            android.content.Intent r0 = r13.getIntent()
            if (r0 == 0) goto L_0x0077
            android.os.Bundle r1 = r0.getExtras()
            if (r1 == 0) goto L_0x0077
            java.lang.String r0 = "message_id"
            java.lang.String r8 = r1.getString(r0)
        L_0x0058:
            android.content.Intent r0 = r13.getIntent()
            if (r0 == 0) goto L_0x006b
            android.os.Bundle r1 = r0.getExtras()
            if (r1 == 0) goto L_0x006b
            java.lang.String r0 = "session_id"
            java.lang.String r9 = r1.getString(r0)
        L_0x006b:
            r5 = 0
            r0 = r12
            r1 = r14
            r2 = r15
            r3 = r16
            r11 = r18
            r0.A02(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            return
        L_0x0077:
            r8 = r9
            if (r13 == 0) goto L_0x006b
            goto L_0x0058
        L_0x007b:
            r6 = r9
            if (r13 == 0) goto L_0x007f
            goto L_0x001b
        L_0x007f:
            r7 = r9
            if (r13 == 0) goto L_0x0083
            goto L_0x002d
        L_0x0083:
            r0 = r9
            goto L_0x003f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C60032xt.A01(android.app.Activity, X.2rx, X.3Lv, X.2hy, java.lang.String, java.lang.String):void");
    }

    public final void A02(C56422rx r14, C66543Lv r15, C50312hy r16, C95814uZ r17, Boolean bool, String str, String str2, String str3, String str4, String str5, String str6) {
        C624134x r6;
        String str7;
        UserJid userJid;
        Integer num;
        C55012pe r0;
        String str8;
        String str9 = str3;
        C95814uZ r5 = r17;
        String str10 = str5;
        C162457s7.A0J(str10, 5);
        JSONObject A1G = AnonymousClass0x9.A1G();
        String str11 = null;
        if (str3 != null) {
            r6 = C55832qz.A00(r15, AnonymousClass2z0.A05(r5, str9, false));
            A1G.put("extensions_message_id", C57142tA.A00(str9));
        } else {
            r6 = null;
        }
        A1G.put("cta", str);
        A1G.put("flow_id", str2);
        A1G.put("error_type", str10);
        if (str4 != null) {
            str7 = C57142tA.A00(str4);
        } else {
            str7 = null;
        }
        A1G.put("session_id", str7);
        if (bool != null) {
            A1G.put("extension_restored_from_cache", bool.booleanValue() ? 1 : 0);
        }
        if (r5 instanceof UserJid) {
            userJid = (UserJid) r5;
            if (userJid != null) {
                num = Integer.valueOf(AnonymousClass30C.A00(r14.A00(userJid)));
            }
            num = null;
        } else {
            userJid = null;
            num = null;
        }
        if (r6 != null) {
            C627636p.A0p(r6);
        }
        if (userJid != null) {
            r0 = this.A01.A01.A01(userJid);
        } else {
            r0 = null;
        }
        String A0o = C18290x4.A0o(A1G);
        if (r0 != null) {
            str8 = r0.A06;
            str11 = r0.A05;
        } else {
            str8 = null;
        }
        if (str3 == null) {
            str9 = "";
        }
        r16.A01(userJid, r6, num, A0o, str8, str11, str9, 3);
        if (this.A02.A0Y(C58422vE.A02, 3178)) {
            this.A00.A0A(str10, false, str6);
        }
    }

    public C60032xt(C55682qk r1, C53412n3 r2, AnonymousClass1VX r3) {
        C18260x0.A0V(r1, r3, r2);
        this.A00 = r1;
        this.A02 = r3;
        this.A01 = r2;
    }
}
