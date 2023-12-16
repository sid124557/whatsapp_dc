package X;

import android.content.Context;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* renamed from: X.7YZ  reason: invalid class name */
public final class AnonymousClass7YZ {
    public AnonymousClass2VJ A00;
    public C69263Wi A01;
    public AnonymousClass4FS A02;

    public final List A00(Context context, String str) {
        C162457s7.A0J(str, 1);
        ArrayList A0s = AnonymousClass001.A0s();
        try {
            AnonymousClass2VJ r1 = this.A00;
            if (r1 != null) {
                List<C48802fV> A012 = r1.A00("wa_android_bloks_native_auth", new AnonymousClass8PU(), false).A01(context.getApplicationContext(), new C174168Tf(str), false);
                C162457s7.A0H(A012);
                for (C48802fV r0 : A012) {
                    C160417nb r12 = r0.A01;
                    String str2 = r12.A02.A02;
                    String str3 = r12.A00;
                    HashMap A0t = AnonymousClass001.A0t();
                    A0t.put("user_id", str2);
                    A0t.put("auth_token", str3);
                    A0t.put("account_type", str);
                    A0t.put("app_source", str);
                    A0t.put("account_source", "active_account");
                    A0s.add(A0t);
                }
                return A0s;
            }
            throw C18270x1.A0S("ssoProviderRepositoryFactory");
        } catch (Throwable unused) {
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0030 A[Catch:{ all -> 0x01b2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x01ab  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List A01(android.content.Context r27, java.lang.String r28) {
        /*
            r26 = this;
            java.lang.String r4 = "wa_android_bloks_native_auth"
            r3 = 0
            r0 = 1
            r10 = r28
            X.C162457s7.A0J(r10, r0)
            java.util.ArrayList r9 = X.AnonymousClass001.A0s()
            java.util.ArrayList r2 = X.AnonymousClass001.A0s()
            java.lang.String r0 = "Facebook"
            boolean r0 = r10.equals(r0)
            if (r0 == 0) goto L_0x001f
            X.6xj r0 = X.C142766xj.A01
        L_0x001b:
            r2.add(r0)
            goto L_0x002a
        L_0x001f:
            java.lang.String r0 = "Instagram"
            boolean r0 = r10.equals(r0)
            if (r0 == 0) goto L_0x002a
            X.6xj r0 = X.C142766xj.A04
            goto L_0x001b
        L_0x002a:
            r0 = r26
            X.2VJ r1 = r0.A00     // Catch:{ all -> 0x01b2 }
            if (r1 == 0) goto L_0x01ab
            X.8PU r0 = new X.8PU     // Catch:{ all -> 0x01b2 }
            r0.<init>()     // Catch:{ all -> 0x01b2 }
            X.7X6 r8 = r1.A00(r4, r0, r3)     // Catch:{ all -> 0x01b2 }
            android.content.Context r13 = r27.getApplicationContext()     // Catch:{ all -> 0x01b2 }
            X.8vF r7 = r8.A06     // Catch:{ all -> 0x01b2 }
            r7.Bc5()     // Catch:{ all -> 0x01b2 }
            r7.BMU(r2)     // Catch:{ all -> 0x01b2 }
            java.util.ArrayList r12 = X.AnonymousClass001.A0s()     // Catch:{ all -> 0x01b2 }
            java.util.Iterator r17 = r2.iterator()     // Catch:{ all -> 0x01b2 }
        L_0x004d:
            boolean r0 = r17.hasNext()     // Catch:{ all -> 0x01b2 }
            if (r0 == 0) goto L_0x0172
            java.lang.Object r4 = r17.next()     // Catch:{ all -> 0x01b2 }
            X.6xj r4 = (X.C142766xj) r4     // Catch:{ all -> 0x01b2 }
            java.util.ArrayList r3 = X.AnonymousClass001.A0s()     // Catch:{ all -> 0x01b2 }
            java.util.List r0 = X.C1462379g.A09     // Catch:{ all -> 0x01b2 }
            java.util.Iterator r2 = X.AnonymousClass6C7.A0u(r0)     // Catch:{ all -> 0x01b2 }
        L_0x0063:
            boolean r0 = r2.hasNext()     // Catch:{ all -> 0x01b2 }
            if (r0 == 0) goto L_0x0077
            java.lang.Object r1 = r2.next()     // Catch:{ all -> 0x01b2 }
            X.7Wu r1 = (X.C151917Wu) r1     // Catch:{ all -> 0x01b2 }
            X.6xj r0 = r1.A04     // Catch:{ all -> 0x01b2 }
            if (r4 != r0) goto L_0x0063
            r3.add(r1)     // Catch:{ all -> 0x01b2 }
            goto L_0x0063
        L_0x0077:
            java.util.Iterator r16 = r3.iterator()     // Catch:{ all -> 0x01b2 }
        L_0x007b:
            boolean r0 = r16.hasNext()     // Catch:{ all -> 0x01b2 }
            if (r0 == 0) goto L_0x004d
            java.lang.Object r6 = r16.next()     // Catch:{ all -> 0x01b2 }
            X.7Wu r6 = (X.C151917Wu) r6     // Catch:{ all -> 0x01b2 }
            r7.BMw(r6)     // Catch:{ all -> 0x01b2 }
            android.content.ContentProviderClient r1 = r8.A00(r13, r6)     // Catch:{ all -> 0x01b2 }
            if (r1 == 0) goto L_0x016c
            r7.Bc1(r6)     // Catch:{ all -> 0x01b2 }
            X.7mz r5 = r8.A05     // Catch:{ RemoteException -> 0x0166 }
            X.6xj r4 = r6.A04     // Catch:{ RemoteException -> 0x0166 }
            X.6xj r0 = X.C142766xj.A04     // Catch:{ RemoteException -> 0x0166 }
            if (r4 != r0) goto L_0x00d0
            X.6xA r11 = X.C142416xA.INACTIVE_LOGGED_IN_ACCOUNTS     // Catch:{ RemoteException -> 0x0166 }
            android.database.Cursor r3 = X.C160077mz.A00(r1, r6, r7)     // Catch:{ RemoteException -> 0x0166 }
            if (r3 == 0) goto L_0x00ca
            java.util.ArrayList r2 = X.AnonymousClass001.A0s()     // Catch:{ RemoteException -> 0x0166 }
            X.7Ev r0 = r5.A01     // Catch:{ RemoteException -> 0x0166 }
            java.util.Map r0 = r0.A00     // Catch:{ RemoteException -> 0x0166 }
            java.lang.Object r1 = r0.get(r4)     // Catch:{ RemoteException -> 0x0166 }
            X.8tD r1 = (X.C185178tD) r1     // Catch:{ RemoteException -> 0x0166 }
            if (r1 == 0) goto L_0x00ca
        L_0x00b3:
            boolean r0 = r3.moveToNext()     // Catch:{ 8RZ -> 0x00c3 }
            if (r0 == 0) goto L_0x015b
            X.7X5 r0 = r1.Br4(r3, r11)     // Catch:{ 8RZ -> 0x00c3 }
            if (r0 == 0) goto L_0x00b3
            r2.add(r0)     // Catch:{ 8RZ -> 0x00c3 }
            goto L_0x00b3
        L_0x00c3:
            r0 = move-exception
            r7.Bec(r6, r0)     // Catch:{ all -> 0x0156 }
            r3.close()     // Catch:{ RemoteException -> 0x0166 }
        L_0x00ca:
            java.util.ArrayList r2 = X.AnonymousClass001.A0s()     // Catch:{ RemoteException -> 0x0166 }
            goto L_0x015e
        L_0x00d0:
            android.database.Cursor r3 = X.C160077mz.A00(r1, r6, r7)     // Catch:{ RemoteException -> 0x0166 }
            java.util.ArrayList r2 = X.AnonymousClass001.A0s()     // Catch:{ RemoteException -> 0x0166 }
            if (r3 == 0) goto L_0x015e
            boolean r0 = r3.moveToNext()     // Catch:{ RemoteException -> 0x0166 }
            if (r0 == 0) goto L_0x015e
            r0 = 1
            java.lang.String r0 = r3.getString(r0)     // Catch:{ JSONException -> 0x0151 }
            java.util.ArrayList r14 = X.AnonymousClass001.A0s()     // Catch:{ JSONException -> 0x0151 }
            if (r0 == 0) goto L_0x0101
            org.json.JSONArray r11 = new org.json.JSONArray     // Catch:{ JSONException -> 0x0151 }
            r11.<init>(r0)     // Catch:{ JSONException -> 0x0151 }
            r1 = 0
        L_0x00f1:
            int r0 = r11.length()     // Catch:{ JSONException -> 0x0151 }
            if (r1 >= r0) goto L_0x0101
            java.lang.Object r0 = r11.get(r1)     // Catch:{ JSONException -> 0x0151 }
            X.AnonymousClass0x7.A1D(r0, r14)     // Catch:{ JSONException -> 0x0151 }
            int r1 = r1 + 1
            goto L_0x00f1
        L_0x0101:
            java.util.Iterator r15 = r14.iterator()     // Catch:{ JSONException -> 0x0151 }
        L_0x0105:
            boolean r0 = r15.hasNext()     // Catch:{ JSONException -> 0x0151 }
            if (r0 == 0) goto L_0x015b
            java.lang.String r0 = X.AnonymousClass001.A0m(r15)     // Catch:{ JSONException -> 0x0151 }
            org.json.JSONObject r11 = X.AnonymousClass0x9.A1H(r0)     // Catch:{ JSONException -> 0x0151 }
            java.lang.String r0 = "profile"
            org.json.JSONObject r0 = r11.getJSONObject(r0)     // Catch:{ JSONException -> 0x0151 }
            X.2wn r14 = r5.A00     // Catch:{ JSONException -> 0x0151 }
            java.lang.String r1 = "session_cookies"
            org.json.JSONArray r1 = r11.optJSONArray(r1)     // Catch:{ JSONException -> 0x0151 }
            java.util.List r22 = r14.A00(r1)     // Catch:{ JSONException -> 0x0151 }
            java.lang.String r1 = "uid"
            java.lang.String r19 = r0.getString(r1)     // Catch:{ JSONException -> 0x0151 }
            java.lang.String r1 = "access_token"
            java.lang.String r20 = r11.getString(r1)     // Catch:{ JSONException -> 0x0151 }
            java.lang.String r21 = "FACEBOOK"
            java.util.Map r1 = X.C160077mz.A02     // Catch:{ JSONException -> 0x0151 }
            java.lang.Object r1 = r1.get(r4)     // Catch:{ JSONException -> 0x0151 }
            X.6xd r1 = (X.C142706xd) r1     // Catch:{ JSONException -> 0x0151 }
            X.6xA r25 = X.C142416xA.SAVED_ACCOUNTS     // Catch:{ JSONException -> 0x0151 }
            X.8TS r11 = new X.8TS     // Catch:{ JSONException -> 0x0151 }
            r11.<init>(r5, r0)     // Catch:{ JSONException -> 0x0151 }
            X.7X5 r0 = new X.7X5     // Catch:{ JSONException -> 0x0151 }
            r18 = r0
            r23 = r11
            r24 = r1
            r18.<init>(r19, r20, r21, r22, r23, r24, r25)     // Catch:{ JSONException -> 0x0151 }
            r2.add(r0)     // Catch:{ JSONException -> 0x0151 }
            goto L_0x0105
        L_0x0151:
            r0 = move-exception
            r7.Bbw(r0, r6)     // Catch:{ all -> 0x0156 }
            goto L_0x015b
        L_0x0156:
            r0 = move-exception
            r3.close()     // Catch:{ RemoteException -> 0x0166 }
            throw r0     // Catch:{ RemoteException -> 0x0166 }
        L_0x015b:
            r3.close()     // Catch:{ RemoteException -> 0x0166 }
        L_0x015e:
            r12.addAll(r2)     // Catch:{ RemoteException -> 0x0166 }
            r7.Bby(r6)     // Catch:{ RemoteException -> 0x0166 }
            goto L_0x007b
        L_0x0166:
            r0 = move-exception
            r7.Bbw(r0, r6)     // Catch:{ all -> 0x01b2 }
            goto L_0x007b
        L_0x016c:
            r0 = 0
            r7.Bc0(r0, r6)     // Catch:{ all -> 0x01b2 }
            goto L_0x007b
        L_0x0172:
            java.util.Iterator r5 = r12.iterator()
        L_0x0176:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x01b2
            java.lang.Object r0 = r5.next()
            X.7X5 r0 = (X.AnonymousClass7X5) r0
            if (r0 == 0) goto L_0x0176
            java.lang.String r4 = r0.A02
            java.lang.String r3 = r0.A01
            java.lang.String r2 = "inactive_logged_in_accounts"
            java.util.HashMap r1 = X.AnonymousClass001.A0t()
            java.lang.String r0 = "user_id"
            r1.put(r0, r4)
            java.lang.String r0 = "auth_token"
            r1.put(r0, r3)
            java.lang.String r0 = "account_type"
            r1.put(r0, r10)
            java.lang.String r0 = "app_source"
            r1.put(r0, r10)
            java.lang.String r0 = "account_source"
            r1.put(r0, r2)
            r9.add(r1)
            goto L_0x0176
        L_0x01ab:
            java.lang.String r0 = "ssoProviderRepositoryFactory"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)     // Catch:{ all -> 0x01b2 }
            throw r0     // Catch:{ all -> 0x01b2 }
        L_0x01b2:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7YZ.A01(android.content.Context, java.lang.String):java.util.List");
    }

    public final List A02(Context context, String str, String str2) {
        if (C162457s7.A0P(str2, "active_account")) {
            return A00(context, str);
        }
        if (C162457s7.A0P(str2, "inactive_logged_in_accounts")) {
            return A01(context, str);
        }
        ArrayList A0s = AnonymousClass001.A0s();
        A0s.addAll(A00(context, str));
        A0s.addAll(A01(context, str));
        return A0s;
    }
}
