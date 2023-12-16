package X;

import android.database.Cursor;
import java.util.List;

/* renamed from: X.8PV  reason: invalid class name */
public class AnonymousClass8PV implements C185178tD {
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0034, code lost:
        if (r1 != null) goto L_0x0039;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C160417nb Br2(android.database.Cursor r14) {
        /*
            r13 = this;
            java.lang.String r0 = "COL_USERNAME"
            int r2 = r14.getColumnIndex(r0)
            java.lang.String r0 = "COL_FULL_NAME"
            int r7 = r14.getColumnIndex(r0)
            java.lang.String r0 = "COL_PROFILE_PHOTO_URL"
            int r6 = r14.getColumnIndex(r0)
            java.lang.String r0 = "COL_SESSION_ID"
            int r5 = r14.getColumnIndex(r0)
            java.lang.String r0 = "COL_SSO_SETTINGS_CACHE"
            int r1 = r14.getColumnIndex(r0)
            r0 = -1
            if (r2 == r0) goto L_0x0105
            if (r7 == r0) goto L_0x0105
            if (r6 == r0) goto L_0x0105
            if (r5 == r0) goto L_0x0105
            java.lang.String r2 = r14.getString(r2)
            r2.getClass()
            if (r1 == r0) goto L_0x0037
            java.lang.String r1 = r14.getString(r1)
            if (r1 == 0) goto L_0x00c0
            goto L_0x0039
        L_0x0037:
            java.lang.String r1 = ""
        L_0x0039:
            boolean r0 = r1.isEmpty()     // Catch:{ JSONException -> 0x00fe }
            if (r0 != 0) goto L_0x00c0
            org.json.JSONObject r9 = X.AnonymousClass0x9.A1H(r1)     // Catch:{ JSONException -> 0x00fe }
            long r3 = java.lang.System.currentTimeMillis()     // Catch:{ JSONException -> 0x00fe }
            java.lang.Long r12 = java.lang.Long.valueOf(r3)     // Catch:{ JSONException -> 0x00fe }
            java.lang.String r0 = "timestamp"
            long r10 = r9.optLong(r0, r3)     // Catch:{ JSONException -> 0x00fe }
            java.lang.Long r8 = java.lang.Long.valueOf(r10)     // Catch:{ JSONException -> 0x00fe }
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ JSONException -> 0x00fe }
            java.lang.String r0 = "Current Time: "
            r1.append(r0)     // Catch:{ JSONException -> 0x00fe }
            r1.append(r12)     // Catch:{ JSONException -> 0x00fe }
            java.lang.String r0 = ", last updated timestamp: "
            java.lang.String r1 = X.AnonymousClass000.A0P(r8, r0, r1)     // Catch:{ JSONException -> 0x00fe }
            java.lang.String r0 = "InstagramSSOTransformer"
            android.util.Log.d(r0, r1)     // Catch:{ JSONException -> 0x00fe }
            long r3 = r3 - r10
            java.util.concurrent.TimeUnit r8 = java.util.concurrent.TimeUnit.DAYS     // Catch:{ JSONException -> 0x00fe }
            r0 = 45
            long r10 = r8.toMillis(r0)     // Catch:{ JSONException -> 0x00fe }
            int r0 = (r3 > r10 ? 1 : (r3 == r10 ? 0 : -1))
            if (r0 > 0) goto L_0x00bc
            java.lang.String r0 = "sso_eligibility"
            org.json.JSONObject r3 = r9.optJSONObject(r0)     // Catch:{ JSONException -> 0x00fe }
            if (r3 == 0) goto L_0x00b8
            X.6ui r0 = X.C140906ui.A00     // Catch:{ JSONException -> 0x00fe }
            int r0 = r0.value     // Catch:{ JSONException -> 0x00fe }
            java.lang.String r1 = java.lang.String.valueOf(r0)     // Catch:{ JSONException -> 0x00fe }
            X.6xB r8 = X.C142426xB.FXAccountItemEligibilityNoData     // Catch:{ JSONException -> 0x00fe }
            int r0 = r8.value     // Catch:{ JSONException -> 0x00fe }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ JSONException -> 0x00fe }
            java.lang.String r0 = r3.optString(r1, r0)     // Catch:{ JSONException -> 0x00fe }
            X.6xB r3 = X.C142426xB.valueOf(r0)     // Catch:{ JSONException -> 0x00fe }
        L_0x0099:
            java.lang.String r0 = "nta_eligibility"
            org.json.JSONObject r4 = r9.optJSONObject(r0)     // Catch:{ JSONException -> 0x00fe }
            if (r4 == 0) goto L_0x00c3
            X.6ui r0 = X.C140906ui.A00     // Catch:{ JSONException -> 0x00fe }
            int r0 = r0.value     // Catch:{ JSONException -> 0x00fe }
            java.lang.String r1 = java.lang.String.valueOf(r0)     // Catch:{ JSONException -> 0x00fe }
            int r0 = r8.value     // Catch:{ JSONException -> 0x00fe }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ JSONException -> 0x00fe }
            java.lang.String r0 = r4.optString(r1, r0)     // Catch:{ JSONException -> 0x00fe }
            X.6xB r8 = X.C142426xB.valueOf(r0)     // Catch:{ JSONException -> 0x00fe }
            goto L_0x00c3
        L_0x00b8:
            X.6xB r3 = X.C142426xB.FXAccountItemEligibilityNoData     // Catch:{ JSONException -> 0x00fe }
            r8 = r3
            goto L_0x0099
        L_0x00bc:
            X.6xB r3 = X.C142426xB.FXAccountItemEligibilityNoData     // Catch:{ JSONException -> 0x00fe }
            r8 = r3
            goto L_0x0099
        L_0x00c0:
            X.6xB r3 = X.C142426xB.FXAccountItemEligibilityNoData     // Catch:{ JSONException -> 0x00fe }
            r8 = r3
        L_0x00c3:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "SSO Eligibility: "
            r1.append(r0)
            int r0 = r3.value
            r1.append(r0)
            java.lang.String r0 = ", NTA Eligibility: "
            r1.append(r0)
            int r0 = r8.value
            java.lang.String r1 = X.AnonymousClass000.A0h(r1, r0)
            java.lang.String r0 = "InstagramSSOTransformer"
            android.util.Log.d(r0, r1)
            X.7Id r4 = new X.7Id
            r4.<init>(r3, r8)
            java.lang.String r1 = r14.getString(r7)
            java.lang.String r0 = r14.getString(r6)
            X.7jO r3 = new X.7jO
            r3.<init>(r2, r1, r0)
            java.lang.String r2 = r14.getString(r5)
            r1 = 0
            X.7nb r0 = new X.7nb
            r0.<init>(r2, r1, r3, r4)
            return r0
        L_0x00fe:
            r1 = move-exception
            X.8RZ r0 = new X.8RZ
            r0.<init>(r1)
            throw r0
        L_0x0105:
            X.8RZ r0 = new X.8RZ
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass8PV.Br2(android.database.Cursor):X.7nb");
    }

    public /* synthetic */ C160417nb Br3(Cursor cursor) {
        return null;
    }

    public AnonymousClass7X5 Br4(Cursor cursor, C142416xA r13) {
        int columnIndex = cursor.getColumnIndex("COL_USERNAME");
        int columnIndex2 = cursor.getColumnIndex("COL_FULL_NAME");
        int columnIndex3 = cursor.getColumnIndex("COL_PROFILE_PHOTO_URL");
        int columnIndex4 = cursor.getColumnIndex("COL_SESSION_ID");
        if (columnIndex == -1 || columnIndex2 == -1 || columnIndex3 == -1 || columnIndex4 == -1) {
            throw new AnonymousClass8RZ();
        }
        String string = cursor.getString(columnIndex);
        string.getClass();
        return new AnonymousClass7X5(string, cursor.getString(columnIndex4), "INSTAGRAM", (List) null, new AnonymousClass8TW(cursor, this, columnIndex2, columnIndex3), C142706xd.INSTAGRAM, r13);
    }
}
