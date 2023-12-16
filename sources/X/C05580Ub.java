package X;

import android.net.TrafficStats;
import android.text.TextUtils;
import android.text.format.Time;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.util.Log;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.0Ub  reason: invalid class name and case insensitive filesystem */
public final class C05580Ub {
    public String A00;
    public String A01;
    public JSONObject A02;
    public boolean A03;
    public final long A04;
    public final long A05;
    public final C55682qk A06;
    public final AnonymousClass0U8 A07;
    public final AnonymousClass0WN A08;
    public final AnonymousClass0Y7 A09;
    public final AnonymousClass1VX A0A;
    public final String A0B;
    public final JSONObject A0C;

    public static C05580Ub A00(C55682qk r19, AnonymousClass0U8 r20, AnonymousClass0WN r21, AnonymousClass0Y7 r22, AnonymousClass1VX r23, InputStream inputStream, String str) {
        JSONObject jSONObject;
        try {
            String A002 = C624535b.A00(inputStream);
            if (TextUtils.isEmpty(A002)) {
                Log.e("gdrive-api-v2/backup/empty input");
                return null;
            }
            JSONObject jSONObject2 = new JSONObject(A002);
            String A022 = AnonymousClass355.A02(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, jSONObject2);
            String A023 = AnonymousClass355.A02("updateTime", jSONObject2);
            if (TextUtils.isEmpty(A023)) {
                Log.e("gdrive-api-v2/backup/no updateTime provided. malformed stream?");
                return null;
            }
            Time time = new Time();
            time.parse3339(A023);
            long millis = time.toMillis(true);
            long optLong = jSONObject2.optLong("sizeBytes", -1);
            String A024 = AnonymousClass355.A02("activeTransactionId", jSONObject2);
            String A025 = AnonymousClass355.A02("metadata", jSONObject2);
            if (!TextUtils.isEmpty(A025)) {
                jSONObject = new JSONObject(A025);
            } else {
                jSONObject = null;
            }
            if (A022 != null && millis > 0) {
                return new C05580Ub(r19, r20, r21, r22, r23, str, A022, A024, jSONObject, millis, optLong);
            }
            return null;
        } catch (IOException | JSONException e) {
            Log.e("gdrive-api-v2/backup/unable to read stream", e);
        }
    }

    public synchronized String A02() {
        return this.A00;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0039, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x003b, code lost:
        return null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized org.json.JSONObject A05() {
        /*
            r3 = this;
            monitor-enter(r3)
            boolean r0 = r3.A03     // Catch:{ all -> 0x003c }
            if (r0 == 0) goto L_0x0008
            org.json.JSONObject r0 = r3.A02     // Catch:{ all -> 0x003c }
            goto L_0x0038
        L_0x0008:
            org.json.JSONObject r1 = r3.A0C     // Catch:{ all -> 0x003c }
            r2 = 0
            if (r1 == 0) goto L_0x003a
            r0 = 1
            r3.A03 = r0     // Catch:{ all -> 0x003c }
            java.lang.String r0 = "encryptedData"
            java.lang.String r1 = r1.optString(r0)     // Catch:{ all -> 0x003c }
            boolean r0 = android.text.TextUtils.isEmpty(r1)     // Catch:{ all -> 0x003c }
            if (r0 != 0) goto L_0x003a
            X.0WN r0 = r3.A08     // Catch:{ all -> 0x003c }
            java.lang.String r1 = r0.A02(r1)     // Catch:{ all -> 0x003c }
            boolean r0 = android.text.TextUtils.isEmpty(r1)     // Catch:{ all -> 0x003c }
            if (r0 != 0) goto L_0x003a
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0030 }
            r0.<init>(r1)     // Catch:{ JSONException -> 0x0030 }
            r3.A02 = r0     // Catch:{ JSONException -> 0x0030 }
            goto L_0x0036
        L_0x0030:
            r1 = move-exception
            java.lang.String r0 = "gdrive-api-v2/backup/failed to parse decrypted metadata"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x003c }
        L_0x0036:
            org.json.JSONObject r0 = r3.A02     // Catch:{ all -> 0x003c }
        L_0x0038:
            monitor-exit(r3)
            return r0
        L_0x003a:
            monitor-exit(r3)
            return r2
        L_0x003c:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C05580Ub.A05():org.json.JSONObject");
    }

    public int A01() {
        JSONObject jSONObject = this.A0C;
        if (jSONObject != null) {
            return jSONObject.optInt("backupVersion", 1);
        }
        Log.e("gdrive-api-v2/backup-version metadata is null.");
        return 1;
    }

    public JSONObject A03() {
        JSONObject jSONObject = this.A0C;
        if (jSONObject != null) {
            String optString = jSONObject.optString("backupExpiry");
            if (!TextUtils.isEmpty(optString)) {
                try {
                    return new JSONObject(optString);
                } catch (JSONException e) {
                    Log.w("gdrive-api-v2/get-backup-supported/failed to parse", e);
                }
            }
        }
        return null;
    }

    public JSONObject A04() {
        JSONObject jSONObject = this.A0C;
        if (jSONObject == null || !jSONObject.has("localSettings")) {
            JSONObject A052 = A05();
            if (A052 != null && A052.has("localSettings")) {
                return A052.getJSONObject("localSettings");
            }
            Log.w("gdrive-api-v2/backup/get-local-settings/localSettings-is-missing");
            return null;
        }
        try {
            return jSONObject.getJSONObject("localSettings");
        } catch (JSONException e) {
            Log.e("gdrive-api-v2/backup/get-local-settings/failed to parse", e);
            return null;
        }
    }

    public boolean A06(int i, long j, long j2) {
        AnonymousClass0Y7 r10 = this.A09;
        if (r10.A0I()) {
            return false;
        }
        if (A02() != null) {
            return true;
        }
        TrafficStats.setThreadStatsTag(13);
        HttpsURLConnection httpsURLConnection = null;
        try {
            StringBuilder A0q = AnonymousClass001.A0q();
            A0q.append(this.A0B);
            httpsURLConnection = r10.A0C("POST", AnonymousClass000.A0X(":beginTransaction", A0q), "application/json; charset=UTF-8", (Map) null, true);
            OutputStream outputStream = httpsURLConnection.getOutputStream();
            try {
                StringBuilder A0o = AnonymousClass001.A0o();
                A0o.append(",\"axolotlMode\":\"");
                AnonymousClass1VX r5 = this.A0A;
                A0o.append(AnonymousClass000.A1S(C06520Ya.A09(this.A07, r5) ? 1 : 0) ? 1 : 0);
                String A0X = AnonymousClass000.A0X("\"", A0o);
                Log.i(AnonymousClass000.A0V("gdrive-api-v2/beginTransaction/extraOptions: ", A0X, AnonymousClass001.A0o()));
                StringBuilder A0o2 = AnonymousClass001.A0o();
                A0o2.append("{\"options\":{\"mode\":\"READ_WRITE\",");
                A0o2.append("\"estimatedDeltaBytes\":\"");
                A0o2.append(j2);
                A0o2.append("\"");
                A0o2.append(A0X);
                A0o2.append("},");
                A0o2.append("\"retryCount\":\"");
                A0o2.append(i);
                A0o2.append("\",");
                A0o2.append("\"deadline\":\"");
                A0o2.append(Math.max(j, 0));
                A0o2.append("s\"");
                outputStream.write(AnonymousClass000.A0g(A0o2).getBytes(C58152un.A0B));
                outputStream.close();
                int responseCode = httpsURLConnection.getResponseCode();
                if (responseCode != 200) {
                    if (responseCode == 403) {
                        th = new AnonymousClass0EL();
                    } else if (responseCode == 429) {
                        C06380Xl.A03("begin-transaction", httpsURLConnection, C06520Ya.A0G(r5));
                        th = AnonymousClass000.A0L();
                    } else if (responseCode != 400) {
                        if (responseCode != 401) {
                            Log.e(AnonymousClass000.A0h(AnonymousClass000.A0l("gdrive-api-v2/backup/begin-transaction/failed "), httpsURLConnection.getResponseCode()));
                            Log.e(AnonymousClass000.A0X(C624535b.A00(httpsURLConnection.getErrorStream()), AnonymousClass000.A0l("gdrive-api-v2/backup/begin-transaction/failed ")));
                        } else {
                            r10.A0H();
                        }
                        httpsURLConnection.disconnect();
                        TrafficStats.clearThreadStatsTag();
                        return false;
                    } else {
                        String A002 = C624535b.A00(httpsURLConnection.getErrorStream());
                        this.A06.A0A("gdrive-api-v2/backup/begin-transaction", true, A002);
                        th = new AnonymousClass0EJ(A002);
                    }
                    throw th;
                }
                String A022 = AnonymousClass355.A02(PublicKeyCredentialControllerUtility.JSON_KEY_ID, C624535b.A02(httpsURLConnection.getInputStream()));
                synchronized (this) {
                    this.A00 = A022;
                }
                synchronized (this) {
                }
                httpsURLConnection.disconnect();
                TrafficStats.clearThreadStatsTag();
                return true;
            } catch (Throwable th) {
                th.addSuppressed(th);
            }
        } catch (IOException | JSONException e) {
            try {
                Log.e("gdrive-api-v2/backup/beginTransaction failed with exception", e);
                throw AnonymousClass0EU.A00(e);
            } catch (Throwable th2) {
                if (httpsURLConnection != null) {
                    httpsURLConnection.disconnect();
                }
                TrafficStats.clearThreadStatsTag();
                throw th2;
            }
        }
    }

    public boolean A07(String str) {
        Throwable th;
        AnonymousClass0Y7 r7 = this.A09;
        if (r7.A0I()) {
            Log.i("gdrive-api-v2/rename-backup/api disabled");
            return false;
        }
        TrafficStats.setThreadStatsTag(13);
        HttpsURLConnection httpsURLConnection = null;
        try {
            StringBuilder A0q = AnonymousClass001.A0q();
            A0q.append(this.A0B);
            httpsURLConnection = r7.A0C("POST", AnonymousClass000.A0X(":rename", A0q), "application/json; charset=UTF-8", (Map) null, true);
            OutputStream outputStream = httpsURLConnection.getOutputStream();
            try {
                StringBuilder A0o = AnonymousClass001.A0o();
                A0o.append("{\"newName\": \"clients/wa/backups/");
                A0o.append(str);
                outputStream.write(AnonymousClass000.A0X("\"}", A0o).getBytes(C58152un.A0B));
                outputStream.close();
                int responseCode = httpsURLConnection.getResponseCode();
                if (responseCode != 200) {
                    if (responseCode != 409) {
                        if (responseCode == 429) {
                            C06380Xl.A04("rename-backup", httpsURLConnection, C06520Ya.A0G(this.A0A));
                            th = AnonymousClass000.A0L();
                            throw th;
                        } else if (responseCode != 400) {
                            if (responseCode != 401) {
                                if (responseCode == 403) {
                                    th = new AnonymousClass0EL();
                                } else if (responseCode != 404) {
                                    String A002 = C624535b.A00(httpsURLConnection.getErrorStream());
                                    StringBuilder A0o2 = AnonymousClass001.A0o();
                                    A0o2.append("gdrive-api-v2/backup/rename weird status code: ");
                                    A0o2.append(responseCode);
                                    Log.e(AnonymousClass000.A0V(" ", A002, A0o2));
                                    th = new AnonymousClass0EU(A002, -1);
                                } else {
                                    th = new AnonymousClass0EY(AnonymousClass000.A0P(this, "Failed to find backup ", AnonymousClass001.A0o()));
                                }
                                throw th;
                            }
                            r7.A0H();
                            httpsURLConnection.disconnect();
                            TrafficStats.clearThreadStatsTag();
                            return false;
                        }
                    }
                    String A003 = C624535b.A00(httpsURLConnection.getErrorStream());
                    this.A06.A0A("gdrive-api-v2/rename-backup", true, A003);
                    th = new AnonymousClass0EJ(A003);
                    throw th;
                }
                JSONObject A022 = C624535b.A02(httpsURLConnection.getInputStream());
                if (A022.has("backup")) {
                    JSONObject jSONObject = A022.getJSONObject("backup");
                    if (jSONObject.has(PublicKeyCredentialControllerUtility.JSON_KEY_NAME)) {
                        String string = jSONObject.getString(PublicKeyCredentialControllerUtility.JSON_KEY_NAME);
                        C626936e.A06(string);
                        this.A01 = string;
                        httpsURLConnection.disconnect();
                        TrafficStats.clearThreadStatsTag();
                        return true;
                    }
                }
                Log.e("gdrive-api-v2/backup/rename failed");
                th = new AnonymousClass0EU("unable to get new name", -1);
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
        } catch (IOException | JSONException e) {
            Log.e("gdrive-api-v2/backup/rename failed with exception", e);
            throw AnonymousClass0EU.A00(e);
        } catch (Throwable th3) {
            if (httpsURLConnection != null) {
                httpsURLConnection.disconnect();
            }
            TrafficStats.clearThreadStatsTag();
            throw th3;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:76:0x0134  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A08(java.util.Map r15) {
        /*
            r14 = this;
            java.lang.String r7 = "gdrive-api-v2/commit-transaction/failed "
            java.lang.String r5 = "metadata"
            X.0Y7 r8 = r14.A09
            boolean r0 = r8.A0I()
            r6 = 0
            if (r0 != 0) goto L_0x0142
            java.lang.String r0 = r14.A02()
            if (r0 == 0) goto L_0x013b
            r0 = 13
            android.net.TrafficStats.setThreadStatsTag(r0)
            r12 = 0
            java.lang.String r9 = "POST"
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0q()     // Catch:{ IOException -> 0x0125 }
            java.lang.String r0 = r14.A0B     // Catch:{ IOException -> 0x0125 }
            r1.append(r0)     // Catch:{ IOException -> 0x0125 }
            java.lang.String r0 = ":commit"
            java.lang.String r10 = X.AnonymousClass000.A0X(r0, r1)     // Catch:{ IOException -> 0x0125 }
            java.lang.String r11 = "application/json; charset=UTF-8"
            r13 = 1
            javax.net.ssl.HttpsURLConnection r3 = r8.A0C(r9, r10, r11, r12, r13)     // Catch:{ IOException -> 0x0125 }
            java.io.OutputStream r2 = r3.getOutputStream()     // Catch:{ IOException -> 0x0122, all -> 0x0130 }
            java.lang.String r1 = X.C58152un.A0B     // Catch:{ all -> 0x0106 }
            java.io.OutputStreamWriter r0 = new java.io.OutputStreamWriter     // Catch:{ all -> 0x0106 }
            r0.<init>(r2, r1)     // Catch:{ all -> 0x0106 }
            android.util.JsonWriter r4 = new android.util.JsonWriter     // Catch:{ all -> 0x0106 }
            r4.<init>(r0)     // Catch:{ all -> 0x0106 }
            android.util.JsonWriter r1 = r4.beginObject()     // Catch:{ all -> 0x00fc }
            java.lang.String r0 = "transactionId"
            android.util.JsonWriter r1 = r1.name(r0)     // Catch:{ all -> 0x00fc }
            java.lang.String r0 = r14.A02()     // Catch:{ all -> 0x00fc }
            r1.value(r0)     // Catch:{ all -> 0x00fc }
            if (r15 == 0) goto L_0x0077
            java.lang.String r0 = "updateMask"
            android.util.JsonWriter r0 = r4.name(r0)     // Catch:{ all -> 0x00fc }
            android.util.JsonWriter r1 = r0.value(r5)     // Catch:{ all -> 0x00fc }
            java.lang.String r0 = "backup"
            android.util.JsonWriter r0 = r1.name(r0)     // Catch:{ all -> 0x00fc }
            android.util.JsonWriter r0 = r0.beginObject()     // Catch:{ all -> 0x00fc }
            android.util.JsonWriter r1 = r0.name(r5)     // Catch:{ all -> 0x00fc }
            java.lang.String r0 = X.C06520Ya.A03(r15)     // Catch:{ all -> 0x00fc }
            android.util.JsonWriter r0 = r1.value(r0)     // Catch:{ all -> 0x00fc }
            r0.endObject()     // Catch:{ all -> 0x00fc }
        L_0x0077:
            android.util.JsonWriter r0 = r4.endObject()     // Catch:{ all -> 0x00fc }
            r0.flush()     // Catch:{ all -> 0x00fc }
            r4.close()     // Catch:{ all -> 0x0106 }
            if (r2 == 0) goto L_0x0086
            r2.close()     // Catch:{ IOException -> 0x0122, all -> 0x0130 }
        L_0x0086:
            int r1 = r3.getResponseCode()     // Catch:{ IOException -> 0x0122, all -> 0x0130 }
            r0 = 200(0xc8, float:2.8E-43)
            if (r1 == r0) goto L_0x00e6
            r0 = 403(0x193, float:5.65E-43)
            if (r1 == r0) goto L_0x00e0
            r0 = 429(0x1ad, float:6.01E-43)
            if (r1 == r0) goto L_0x0112
            r0 = 400(0x190, float:5.6E-43)
            if (r1 == r0) goto L_0x00cb
            r0 = 401(0x191, float:5.62E-43)
            if (r1 == r0) goto L_0x00c1
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0l(r7)     // Catch:{ IOException -> 0x0122, all -> 0x0130 }
            int r0 = r3.getResponseCode()     // Catch:{ IOException -> 0x0122, all -> 0x0130 }
            java.lang.String r0 = X.AnonymousClass000.A0h(r1, r0)     // Catch:{ IOException -> 0x0122, all -> 0x0130 }
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ IOException -> 0x0122, all -> 0x0130 }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0l(r7)     // Catch:{ IOException -> 0x0122, all -> 0x0130 }
            java.io.InputStream r0 = r3.getErrorStream()     // Catch:{ IOException -> 0x0122, all -> 0x0130 }
            java.lang.String r0 = X.C624535b.A00(r0)     // Catch:{ IOException -> 0x0122, all -> 0x0130 }
            java.lang.String r0 = X.AnonymousClass000.A0X(r0, r1)     // Catch:{ IOException -> 0x0122, all -> 0x0130 }
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ IOException -> 0x0122, all -> 0x0130 }
            goto L_0x00c4
        L_0x00c1:
            r8.A0H()     // Catch:{ IOException -> 0x0122, all -> 0x0130 }
        L_0x00c4:
            r3.disconnect()
            android.net.TrafficStats.clearThreadStatsTag()
            return r6
        L_0x00cb:
            java.io.InputStream r0 = r3.getErrorStream()     // Catch:{ IOException -> 0x0122, all -> 0x0130 }
            java.lang.String r2 = X.C624535b.A00(r0)     // Catch:{ IOException -> 0x0122, all -> 0x0130 }
            X.2qk r1 = r14.A06     // Catch:{ IOException -> 0x0122, all -> 0x0130 }
            java.lang.String r0 = "gdrive-api-v2/backup/commit-transaction"
            r1.A0A(r0, r13, r2)     // Catch:{ IOException -> 0x0122, all -> 0x0130 }
            X.0EJ r1 = new X.0EJ     // Catch:{ IOException -> 0x0122, all -> 0x0130 }
            r1.<init>(r2)     // Catch:{ IOException -> 0x0122, all -> 0x0130 }
            goto L_0x0121
        L_0x00e0:
            X.0EL r1 = new X.0EL     // Catch:{ IOException -> 0x0122, all -> 0x0130 }
            r1.<init>()     // Catch:{ IOException -> 0x0122, all -> 0x0130 }
            goto L_0x0121
        L_0x00e6:
            java.io.InputStream r0 = r3.getInputStream()     // Catch:{ IOException -> 0x0122, all -> 0x0130 }
            X.C624535b.A00(r0)     // Catch:{ IOException -> 0x0122, all -> 0x0130 }
            r1 = r14
            monitor-enter(r1)     // Catch:{ IOException -> 0x0122, all -> 0x0130 }
            r14.A00 = r12     // Catch:{ all -> 0x00f9 }
            monitor-exit(r1)     // Catch:{ IOException -> 0x0122, all -> 0x0130 }
            r3.disconnect()
            android.net.TrafficStats.clearThreadStatsTag()
            return r13
        L_0x00f9:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ IOException -> 0x0122, all -> 0x0130 }
            throw r0     // Catch:{ IOException -> 0x0122, all -> 0x0130 }
        L_0x00fc:
            r1 = move-exception
            r4.close()     // Catch:{ all -> 0x0101 }
            goto L_0x0105
        L_0x0101:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x0106 }
        L_0x0105:
            throw r1     // Catch:{ all -> 0x0106 }
        L_0x0106:
            r1 = move-exception
            if (r2 == 0) goto L_0x0121
            r2.close()     // Catch:{ all -> 0x010d }
            goto L_0x0121
        L_0x010d:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ IOException -> 0x0122, all -> 0x0130 }
            goto L_0x0121
        L_0x0112:
            X.1VX r0 = r14.A0A     // Catch:{ IOException -> 0x0122, all -> 0x0130 }
            boolean r1 = X.C06520Ya.A0G(r0)     // Catch:{ IOException -> 0x0122, all -> 0x0130 }
            java.lang.String r0 = "commit-transaction"
            X.C06380Xl.A03(r0, r3, r1)     // Catch:{ IOException -> 0x0122, all -> 0x0130 }
            java.lang.RuntimeException r1 = X.AnonymousClass000.A0L()     // Catch:{ IOException -> 0x0122, all -> 0x0130 }
        L_0x0121:
            throw r1     // Catch:{ IOException -> 0x0122, all -> 0x0130 }
        L_0x0122:
            r0 = move-exception
            r12 = r3
            goto L_0x0126
        L_0x0125:
            r0 = move-exception
        L_0x0126:
            com.whatsapp.util.Log.e((java.lang.Throwable) r0)     // Catch:{ all -> 0x012e }
            X.0EU r0 = X.AnonymousClass0EU.A00(r0)     // Catch:{ all -> 0x012e }
            throw r0     // Catch:{ all -> 0x012e }
        L_0x012e:
            r0 = move-exception
            goto L_0x0132
        L_0x0130:
            r0 = move-exception
            r12 = r3
        L_0x0132:
            if (r12 == 0) goto L_0x0137
            r12.disconnect()
        L_0x0137:
            android.net.TrafficStats.clearThreadStatsTag()
            throw r0
        L_0x013b:
            java.lang.String r0 = "No transaction to commit"
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0e(r0)
            throw r0
        L_0x0142:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C05580Ub.A08(java.util.Map):boolean");
    }

    public C05580Ub(C55682qk r1, AnonymousClass0U8 r2, AnonymousClass0WN r3, AnonymousClass0Y7 r4, AnonymousClass1VX r5, String str, String str2, String str3, JSONObject jSONObject, long j, long j2) {
        this.A0A = r5;
        this.A06 = r1;
        this.A08 = r3;
        this.A07 = r2;
        this.A09 = r4;
        this.A0B = str;
        this.A01 = str2;
        this.A05 = j;
        this.A04 = j2;
        this.A00 = str3;
        this.A0C = jSONObject;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("Backup{jidUser='");
        A0o.append(this.A0B);
        A0o.append('\'');
        A0o.append(", name='");
        A0o.append(this.A01);
        A0o.append('\'');
        A0o.append(", updateTime=");
        A0o.append(this.A05);
        A0o.append(", sizeBytes=");
        A0o.append(this.A04);
        A0o.append(", activeTransactionId='");
        A0o.append(A02());
        A0o.append('\'');
        A0o.append(", clientMetadata=");
        return AnonymousClass000.A0Q(this.A0C, A0o);
    }
}
