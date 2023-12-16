package X;

/* renamed from: X.3Xt  reason: invalid class name and case insensitive filesystem */
public class C69623Xt implements C84974El {
    public final /* synthetic */ C32171pg A00;

    public C69623Xt(C32171pg r1) {
        this.A00 = r1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x003c, code lost:
        if (r0 > 0) goto L_0x003e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0154, code lost:
        r3 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0155, code lost:
        r12 = r2.A00;
        r12.A02.A00.A09("StatusGraphql", "exception in handle iq response", r3);
        r12.A01(r13, 200, 417, (java.lang.String) null, 0, true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x0175, code lost:
        return;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:53:? A[ExcHandler: IllegalAccessException | NoSuchMethodException (unused java.lang.Throwable), SYNTHETIC, Splitter:B:21:0x006c] */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0154 A[ExcHandler: NullPointerException | JSONException (r3v0 'e' java.lang.Throwable A[CUSTOM_DECLARE]), Splitter:B:1:0x0008] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void BEp(X.C35781xQ r21) {
        /*
            r20 = this;
            r0 = r21
            X.36K r13 = r0.A00
            r4 = 200(0xc8, float:2.8E-43)
            r2 = r20
            java.lang.String r0 = r0.A01     // Catch:{ NullPointerException | JSONException -> 0x0154, all -> 0x014d }
            org.json.JSONObject r7 = X.AnonymousClass0x9.A1H(r0)     // Catch:{ NullPointerException | JSONException -> 0x0154, all -> 0x014d }
            java.lang.String r0 = "errors"
            org.json.JSONArray r1 = r7.optJSONArray(r0)     // Catch:{ NullPointerException | JSONException -> 0x0154, all -> 0x014d }
            java.lang.String r6 = "data"
            org.json.JSONObject r0 = r7.optJSONObject(r6)     // Catch:{ NullPointerException | JSONException -> 0x0154, all -> 0x014d }
            if (r1 != 0) goto L_0x0021
            if (r0 == 0) goto L_0x0059
            r0 = 200(0xc8, float:2.8E-43)
            goto L_0x003e
        L_0x0021:
            int r0 = r1.length()     // Catch:{ NullPointerException | JSONException -> 0x0154, all -> 0x014d }
            if (r0 <= 0) goto L_0x0059
            r0 = 0
            org.json.JSONObject r1 = r1.optJSONObject(r0)     // Catch:{ NullPointerException | JSONException -> 0x0154, all -> 0x014d }
            if (r1 == 0) goto L_0x0059
            java.lang.String r0 = "extensions"
            org.json.JSONObject r1 = r1.optJSONObject(r0)     // Catch:{ NullPointerException | JSONException -> 0x0154, all -> 0x014d }
            if (r1 == 0) goto L_0x0059
            java.lang.String r0 = "error_code"
            int r0 = r1.optInt(r0)     // Catch:{ NullPointerException | JSONException -> 0x0154, all -> 0x014d }
            if (r0 <= 0) goto L_0x0059
        L_0x003e:
            java.lang.Integer r15 = java.lang.Integer.valueOf(r0)     // Catch:{ NullPointerException | JSONException -> 0x0154, all -> 0x014d }
            r3 = 1
            if (r0 != r4) goto L_0x009d
            r3 = 0
            r0 = 0
            org.json.JSONObject r6 = r7.getJSONObject(r6)     // Catch:{ NullPointerException | JSONException -> 0x0154, all -> 0x014d }
            r8 = 0
            java.lang.String r5 = "xwa2_users_updates_since"
            java.lang.Class<com.whatsapp.infra.graphql.generated.mex.UpdateUserStatusResponseImpl$Xwa2UsersUpdatesSince> r7 = com.whatsapp.infra.graphql.generated.mex.UpdateUserStatusResponseImpl.Xwa2UsersUpdatesSince.class
            org.json.JSONArray r12 = r6.optJSONArray(r5)     // Catch:{ NullPointerException | JSONException -> 0x0154, all -> 0x014d }
            if (r12 == 0) goto L_0x0111
            goto L_0x006b
        L_0x0059:
            X.1pg r0 = r2.A00     // Catch:{ NullPointerException | JSONException -> 0x0154, all -> 0x014d }
            X.2T9 r0 = r0.A02     // Catch:{ NullPointerException | JSONException -> 0x0154, all -> 0x014d }
            X.2qk r5 = r0.A00     // Catch:{ NullPointerException | JSONException -> 0x0154, all -> 0x014d }
            java.lang.String r3 = "response object is null"
            r1 = 1
            java.lang.String r0 = "StatusGraphql"
            r5.A0A(r0, r1, r3)     // Catch:{ NullPointerException | JSONException -> 0x0154, all -> 0x014d }
            r0 = 417(0x1a1, float:5.84E-43)
            goto L_0x003e
        L_0x006b:
            r11 = 1
            java.lang.Class[] r6 = new java.lang.Class[r11]     // Catch:{ IllegalAccessException | NoSuchMethodException -> 0x0111, NullPointerException | JSONException -> 0x0154 }
            java.lang.Class<org.json.JSONObject> r5 = org.json.JSONObject.class
            r6[r3] = r5     // Catch:{ IllegalAccessException | NoSuchMethodException -> 0x0111, NullPointerException | JSONException -> 0x0154 }
            java.lang.reflect.Constructor r10 = r7.getConstructor(r6)     // Catch:{ IllegalAccessException | NoSuchMethodException -> 0x0111, NullPointerException | JSONException -> 0x0154 }
            X.6aO r9 = new X.6aO     // Catch:{ IllegalAccessException | NoSuchMethodException -> 0x0111, NullPointerException | JSONException -> 0x0154 }
            r9.<init>()     // Catch:{ IllegalAccessException | NoSuchMethodException -> 0x0111, NullPointerException | JSONException -> 0x0154 }
            r7 = 0
        L_0x007c:
            int r5 = r12.length()     // Catch:{ IllegalAccessException | NoSuchMethodException -> 0x0111, NullPointerException | JSONException -> 0x0154 }
            if (r7 >= r5) goto L_0x0096
            org.json.JSONObject r6 = r12.optJSONObject(r7)     // Catch:{ IllegalAccessException | NoSuchMethodException -> 0x0111, NullPointerException | JSONException -> 0x0154 }
            if (r6 == 0) goto L_0x0093
            java.lang.Object[] r5 = new java.lang.Object[r11]     // Catch:{ InstantiationException | InvocationTargetException -> 0x0093, IllegalAccessException | NoSuchMethodException -> 0x0111 }
            r5[r3] = r6     // Catch:{ InstantiationException | InvocationTargetException -> 0x0093, IllegalAccessException | NoSuchMethodException -> 0x0111 }
            java.lang.Object r5 = r10.newInstance(r5)     // Catch:{ InstantiationException | InvocationTargetException -> 0x0093, IllegalAccessException | NoSuchMethodException -> 0x0111 }
            r9.add((java.lang.Object) r5)     // Catch:{ InstantiationException | InvocationTargetException -> 0x0093, IllegalAccessException | NoSuchMethodException -> 0x0111 }
        L_0x0093:
            int r7 = r7 + 1
            goto L_0x007c
        L_0x0096:
            X.6aY r8 = r9.build()     // Catch:{ IllegalAccessException | NoSuchMethodException -> 0x0111, NullPointerException | JSONException -> 0x0154 }
            if (r8 == 0) goto L_0x0111
            goto L_0x00a2
        L_0x009d:
            r16 = 0
            r17 = 0
            goto L_0x0105
        L_0x00a2:
            int r5 = r8.size()     // Catch:{ NullPointerException | JSONException -> 0x0154, all -> 0x014d }
            if (r5 <= r3) goto L_0x0111
            java.lang.Object r7 = r8.get(r3)     // Catch:{ NullPointerException | JSONException -> 0x0154, all -> 0x014d }
            com.whatsapp.infra.graphql.generated.mex.UpdateUserStatusResponseImpl$Xwa2UsersUpdatesSince r7 = (com.whatsapp.infra.graphql.generated.mex.UpdateUserStatusResponseImpl.Xwa2UsersUpdatesSince) r7     // Catch:{ NullPointerException | JSONException -> 0x0154, all -> 0x014d }
            java.lang.String r6 = "updates"
            java.lang.Class<com.whatsapp.infra.graphql.generated.mex.UpdateUserStatusResponseImpl$Xwa2UsersUpdatesSince$Updates> r5 = com.whatsapp.infra.graphql.generated.mex.UpdateUserStatusResponseImpl.Xwa2UsersUpdatesSince.Updates.class
            X.6aY r6 = r7.A02(r5, r6)     // Catch:{ NullPointerException | JSONException -> 0x0154, all -> 0x014d }
            if (r6 == 0) goto L_0x009d
            int r5 = r6.size()     // Catch:{ NullPointerException | JSONException -> 0x0154, all -> 0x014d }
            if (r5 <= r3) goto L_0x009d
            java.lang.Object r5 = r6.get(r3)     // Catch:{ NullPointerException | JSONException -> 0x0154, all -> 0x014d }
            com.whatsapp.infra.graphql.generated.mex.UpdateUserStatusResponseImpl$Xwa2UsersUpdatesSince$Updates r5 = (com.whatsapp.infra.graphql.generated.mex.UpdateUserStatusResponseImpl.Xwa2UsersUpdatesSince.Updates) r5     // Catch:{ NullPointerException | JSONException -> 0x0154, all -> 0x014d }
            if (r5 == 0) goto L_0x0111
            org.json.JSONObject r7 = r5.A00     // Catch:{ NullPointerException | JSONException -> 0x0154, all -> 0x014d }
            java.lang.String r5 = "__typename"
            java.lang.String r5 = r7.optString(r5)     // Catch:{ NullPointerException | JSONException -> 0x0154, all -> 0x014d }
            int r6 = r5.hashCode()     // Catch:{ NullPointerException | JSONException -> 0x0154, all -> 0x014d }
            r5 = 1315213878(0x4e649236, float:9.5869683E8)
            if (r6 != r5) goto L_0x009d
            com.whatsapp.infra.graphql.generated.mex.UpdateUserStatusResponseImpl$Xwa2UsersUpdatesSince$Updates$InlineXWA2UserStatusUpdate r6 = new com.whatsapp.infra.graphql.generated.mex.UpdateUserStatusResponseImpl$Xwa2UsersUpdatesSince$Updates$InlineXWA2UserStatusUpdate     // Catch:{ NullPointerException | JSONException -> 0x0154, all -> 0x014d }
            r6.<init>(r7)     // Catch:{ NullPointerException | JSONException -> 0x0154, all -> 0x014d }
            java.lang.String r5 = "dhash"
            java.lang.String r5 = r6.A04(r5)     // Catch:{ NullPointerException | JSONException -> 0x0154, all -> 0x014d }
            long r17 = X.C615531h.A04(r5, r0)     // Catch:{ NullPointerException | JSONException -> 0x0154, all -> 0x014d }
            java.lang.String r0 = "text"
            java.lang.String r16 = r6.A04(r0)     // Catch:{ NullPointerException | JSONException -> 0x0154, all -> 0x014d }
            boolean r0 = android.text.TextUtils.isEmpty(r16)     // Catch:{ NullPointerException | JSONException -> 0x0154, all -> 0x014d }
            if (r0 == 0) goto L_0x0105
            X.1pg r0 = r2.A00     // Catch:{ NullPointerException | JSONException -> 0x0154, all -> 0x014d }
            X.2T9 r0 = r0.A02     // Catch:{ NullPointerException | JSONException -> 0x0154, all -> 0x014d }
            X.2oU r0 = r0.A01     // Catch:{ NullPointerException | JSONException -> 0x0154, all -> 0x014d }
            android.content.res.Resources r1 = X.C54292oU.A00(r0)     // Catch:{ NullPointerException | JSONException -> 0x0154, all -> 0x014d }
            r0 = 2131888466(0x7f120952, float:1.9411568E38)
            java.lang.String r16 = r1.getString(r0)     // Catch:{ NullPointerException | JSONException -> 0x0154, all -> 0x014d }
        L_0x0105:
            X.1pg r12 = r2.A00     // Catch:{ NullPointerException | JSONException -> 0x0154, all -> 0x014d }
            java.lang.Integer r14 = java.lang.Integer.valueOf(r4)     // Catch:{ NullPointerException | JSONException -> 0x0154, all -> 0x014d }
            r19 = r3
            r12.A01(r13, r14, r15, r16, r17, r19)     // Catch:{ NullPointerException | JSONException -> 0x0154, all -> 0x014d }
            return
        L_0x0111:
            java.lang.StringBuilder r5 = X.AnonymousClass001.A0o()     // Catch:{ NullPointerException | JSONException -> 0x0154, all -> 0x014d }
            java.lang.String r0 = "Unable to find status update at ("
            r5.append(r0)     // Catch:{ NullPointerException | JSONException -> 0x0154, all -> 0x014d }
            r5.append(r3)     // Catch:{ NullPointerException | JSONException -> 0x0154, all -> 0x014d }
            X.C18320x8.A1K(r5)     // Catch:{ NullPointerException | JSONException -> 0x0154, all -> 0x014d }
            r5.append(r3)     // Catch:{ NullPointerException | JSONException -> 0x0154, all -> 0x014d }
            java.lang.String r0 = ") in response data. "
            r5.append(r0)     // Catch:{ NullPointerException | JSONException -> 0x0154, all -> 0x014d }
            if (r8 == 0) goto L_0x012b
            goto L_0x012f
        L_0x012b:
            java.lang.String r0 = "updateSince object is null."
            goto L_0x0137
        L_0x012f:
            int r0 = r8.size()     // Catch:{ NullPointerException | JSONException -> 0x0154, all -> 0x014d }
            if (r0 <= r3) goto L_0x0141
            java.lang.String r0 = ""
        L_0x0137:
            java.lang.String r1 = X.AnonymousClass000.A0X(r0, r5)     // Catch:{ NullPointerException | JSONException -> 0x0154, all -> 0x014d }
            org.json.JSONException r0 = new org.json.JSONException     // Catch:{ NullPointerException | JSONException -> 0x0154, all -> 0x014d }
            r0.<init>(r1)     // Catch:{ NullPointerException | JSONException -> 0x0154, all -> 0x014d }
            throw r0     // Catch:{ NullPointerException | JSONException -> 0x0154, all -> 0x014d }
        L_0x0141:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ NullPointerException | JSONException -> 0x0154, all -> 0x014d }
            java.lang.String r0 = "updateSince list size <= "
            java.lang.String r0 = X.AnonymousClass000.A0Y(r0, r1, r3)     // Catch:{ NullPointerException | JSONException -> 0x0154, all -> 0x014d }
            goto L_0x0137
        L_0x014d:
            r1 = move-exception
            X.24Y r0 = new X.24Y
            r0.<init>((java.lang.Throwable) r1)
            throw r0
        L_0x0154:
            r3 = move-exception
            X.1pg r12 = r2.A00
            X.2T9 r0 = r12.A02
            X.2qk r2 = r0.A00
            java.lang.String r1 = "StatusGraphql"
            java.lang.String r0 = "exception in handle iq response"
            r2.A09(r1, r0, r3)
            r19 = 1
            java.lang.Integer r14 = java.lang.Integer.valueOf(r4)
            r0 = 417(0x1a1, float:5.84E-43)
            java.lang.Integer r15 = java.lang.Integer.valueOf(r0)
            r16 = 0
            r17 = 0
            r12.A01(r13, r14, r15, r16, r17, r19)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C69623Xt.BEp(X.1xQ):void");
    }

    public void BEq(C139776sb r4) {
        this.A00.A00(r4.A00, C57492tj.A01(r4.A00));
    }

    public void BEr(C139726sW r4) {
        this.A00.A00(r4.A00, C57492tj.A01(r4.A00));
    }
}
