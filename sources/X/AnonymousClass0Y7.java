package X;

import android.accounts.Account;
import android.content.Context;
import android.net.TrafficStats;
import android.net.Uri;
import android.text.TextUtils;
import android.util.JsonWriter;
import android.util.Pair;
import com.google.android.gms.auth.UserRecoverableAuthException;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocketFactory;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.0Y7  reason: invalid class name */
public class AnonymousClass0Y7 {
    public String A00;
    public boolean A01 = false;
    public boolean A02 = true;
    public final Context A03;
    public final C55682qk A04;
    public final C56492s4 A05;
    public final AnonymousClass0U8 A06;
    public final AnonymousClass0WN A07;
    public final C13790nk A08;
    public final AnonymousClass0QR A09;
    public final C29441ip A0A;
    public final AnonymousClass310 A0B;
    public final AnonymousClass5ZR A0C;
    public final AnonymousClass1VX A0D;
    public final AnonymousClass306 A0E;
    public final AnonymousClass4FS A0F;
    public final String A0G;
    public final String A0H;
    public final String A0I;
    public final AtomicInteger A0J = new AtomicInteger(0);
    public final SSLSocketFactory A0K;

    public synchronized void A0E() {
        Log.i("GoogleBackupApi/cancel");
        this.A01 = true;
        A0G(false);
    }

    public synchronized void A0G(boolean z) {
        String str;
        if (this.A02 != z) {
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("GoogleBackupApi/");
            if (z) {
                str = "enabled";
            } else {
                str = "disabled";
            }
            Log.i(AnonymousClass000.A0X(str, A0o));
            this.A02 = z;
        }
    }

    public synchronized boolean A0I() {
        return !this.A02;
    }

    public static void A02(C55682qk r3, String str, int i) {
        if (i >= 400 && i < 500) {
            r3.A0A(AnonymousClass000.A0V("GoogleBackupApi/unhandled/error/", str, AnonymousClass001.A0o()), false, AnonymousClass000.A0Y("status-code = ", AnonymousClass001.A0o(), i));
        }
    }

    public static final void A03(AnonymousClass0UI r5, File file) {
        String str;
        long j = r5.A01;
        if (j <= 0) {
            str = AnonymousClass000.A0Z("GoogleBackupApi/set-local-creation-date-from-remote-file remote file update time is:", AnonymousClass001.A0o(), j);
        } else if (!file.setLastModified(j)) {
            str = "GoogleBackupApi/set-local-creation-date-from-remote-file/set-last-modified time failed";
        } else {
            return;
        }
        Log.i(str);
    }

    public static final boolean A04(AnonymousClass0UI r7, File file) {
        StringBuilder A0o;
        String absolutePath;
        String A0X;
        file.getAbsolutePath();
        if (r7.A00 < 0) {
            A0X = "restore>GoogleBackupApi/save-file/check size cannot be negative, exiting.";
        } else {
            if (!file.exists() || !file.isDirectory()) {
                File parentFile = file.getParentFile();
                if (parentFile == null || parentFile.exists() || parentFile.mkdirs()) {
                    return true;
                }
                A0o = AnonymousClass001.A0o();
                A0o.append("restore>GoogleBackupApi/save-file/check failed to create ");
                absolutePath = parentFile.getAbsolutePath();
            } else {
                A0o = AnonymousClass000.A0k(file, "restore>GoogleBackupApi/save-file/check ");
                absolutePath = " exists and is a directory, cannot proceed further.";
            }
            A0X = AnonymousClass000.A0X(absolutePath, A0o);
        }
        Log.e(A0X);
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:45:0x00da  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.util.Pair A07(java.lang.String r13, java.lang.String r14, java.lang.String r15, int r16) {
        /*
            r12 = this;
            java.lang.String r3 = " transaction="
            r6 = r12
            boolean r0 = r12.A0I()
            r2 = 0
            if (r0 == 0) goto L_0x001b
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "GoogleBackupApi/list-files/api is disabled for "
            r1.append(r0)
            java.lang.String r0 = X.AnonymousClass000.A0U(r13, r3, r15, r1)
            com.whatsapp.util.Log.w((java.lang.String) r0)
            return r2
        L_0x001b:
            r0 = 13
            android.net.TrafficStats.setThreadStatsTag(r0)
            java.util.HashMap r10 = X.AnonymousClass001.A0t()     // Catch:{ IOException -> 0x00cc }
            java.lang.String r1 = "pageSize"
            java.lang.String r0 = java.lang.Integer.toString(r16)     // Catch:{ IOException -> 0x00cc }
            r10.put(r1, r0)     // Catch:{ IOException -> 0x00cc }
            boolean r0 = android.text.TextUtils.isEmpty(r15)     // Catch:{ IOException -> 0x00cc }
            if (r0 != 0) goto L_0x0038
            java.lang.String r0 = "transaction_id"
            r10.put(r0, r15)     // Catch:{ IOException -> 0x00cc }
        L_0x0038:
            boolean r0 = android.text.TextUtils.isEmpty(r14)     // Catch:{ IOException -> 0x00cc }
            if (r0 != 0) goto L_0x0043
            java.lang.String r0 = "pageToken"
            r10.put(r0, r14)     // Catch:{ IOException -> 0x00cc }
        L_0x0043:
            java.lang.String r7 = "GET"
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0q()     // Catch:{ IOException -> 0x00cc }
            r1.append(r13)     // Catch:{ IOException -> 0x00cc }
            java.lang.String r0 = "/files"
            java.lang.String r8 = X.AnonymousClass000.A0X(r0, r1)     // Catch:{ IOException -> 0x00cc }
            java.lang.String r9 = "application/json; charset=UTF-8"
            r11 = 0
            javax.net.ssl.HttpsURLConnection r3 = r6.A0C(r7, r8, r9, r10, r11)     // Catch:{ IOException -> 0x00cc }
            int r5 = r3.getResponseCode()     // Catch:{ IOException -> 0x00c9, all -> 0x00c6 }
            r0 = 200(0xc8, float:2.8E-43)
            if (r5 == r0) goto L_0x00b7
            r0 = 401(0x191, float:5.62E-43)
            if (r5 == r0) goto L_0x00ad
            r0 = 403(0x193, float:5.65E-43)
            if (r5 == r0) goto L_0x0099
            r0 = 429(0x1ad, float:6.01E-43)
            java.lang.String r4 = "list-files"
            if (r5 != r0) goto L_0x0070
            goto L_0x009f
        L_0x0070:
            java.io.InputStream r0 = r3.getErrorStream()     // Catch:{ IOException -> 0x00c9, all -> 0x00c6 }
            java.lang.String r2 = X.C624535b.A00(r0)     // Catch:{ IOException -> 0x00c9, all -> 0x00c6 }
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ IOException -> 0x00c9, all -> 0x00c6 }
            java.lang.String r0 = "GoogleBackupApi/list-files weird status code: "
            r1.append(r0)     // Catch:{ IOException -> 0x00c9, all -> 0x00c6 }
            r1.append(r5)     // Catch:{ IOException -> 0x00c9, all -> 0x00c6 }
            java.lang.String r0 = " "
            java.lang.String r0 = X.AnonymousClass000.A0V(r0, r2, r1)     // Catch:{ IOException -> 0x00c9, all -> 0x00c6 }
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ IOException -> 0x00c9, all -> 0x00c6 }
            X.2qk r0 = r12.A04     // Catch:{ IOException -> 0x00c9, all -> 0x00c6 }
            A02(r0, r4, r5)     // Catch:{ IOException -> 0x00c9, all -> 0x00c6 }
            r0 = -1
            X.0EU r1 = new X.0EU     // Catch:{ IOException -> 0x00c9, all -> 0x00c6 }
            r1.<init>(r2, r0)     // Catch:{ IOException -> 0x00c9, all -> 0x00c6 }
            goto L_0x00ac
        L_0x0099:
            X.0EL r1 = new X.0EL     // Catch:{ IOException -> 0x00c9, all -> 0x00c6 }
            r1.<init>()     // Catch:{ IOException -> 0x00c9, all -> 0x00c6 }
            goto L_0x00ac
        L_0x009f:
            X.1VX r0 = r12.A0D     // Catch:{ IOException -> 0x00c9, all -> 0x00c6 }
            boolean r0 = X.C06520Ya.A0G(r0)     // Catch:{ IOException -> 0x00c9, all -> 0x00c6 }
            X.C06380Xl.A04(r4, r3, r0)     // Catch:{ IOException -> 0x00c9, all -> 0x00c6 }
            java.lang.RuntimeException r1 = X.AnonymousClass000.A0L()     // Catch:{ IOException -> 0x00c9, all -> 0x00c6 }
        L_0x00ac:
            throw r1     // Catch:{ IOException -> 0x00c9, all -> 0x00c6 }
        L_0x00ad:
            r12.A0H()     // Catch:{ IOException -> 0x00c9, all -> 0x00c6 }
            r3.disconnect()
            android.net.TrafficStats.clearThreadStatsTag()
            return r2
        L_0x00b7:
            java.io.InputStream r0 = r3.getInputStream()     // Catch:{ IOException -> 0x00c9, all -> 0x00c6 }
            android.util.Pair r0 = r12.A06(r0, r13)     // Catch:{ IOException -> 0x00c9, all -> 0x00c6 }
            r3.disconnect()
            android.net.TrafficStats.clearThreadStatsTag()
            return r0
        L_0x00c6:
            r0 = move-exception
            r2 = r3
            goto L_0x00d8
        L_0x00c9:
            r1 = move-exception
            r2 = r3
            goto L_0x00cd
        L_0x00cc:
            r1 = move-exception
        L_0x00cd:
            java.lang.String r0 = "GoogleBackupApi/list-files failed with exception"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x00d7 }
            X.0EU r0 = X.AnonymousClass0EU.A00(r1)     // Catch:{ all -> 0x00d7 }
            throw r0     // Catch:{ all -> 0x00d7 }
        L_0x00d7:
            r0 = move-exception
        L_0x00d8:
            if (r2 == 0) goto L_0x00dd
            r2.disconnect()
        L_0x00dd:
            android.net.TrafficStats.clearThreadStatsTag()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0Y7.A07(java.lang.String, java.lang.String, java.lang.String, int):android.util.Pair");
    }

    /* JADX WARNING: Removed duplicated region for block: B:47:0x00cc  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C05580Ub A08(java.lang.String r19) {
        /*
            r18 = this;
            java.lang.String r2 = "GoogleBackupApi/create-backup/failed "
            r8 = r18
            boolean r0 = r8.A0I()
            r15 = 0
            if (r0 == 0) goto L_0x0011
            java.lang.String r0 = "GoogleBackupApi/create-backup/api disabled"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            return r15
        L_0x0011:
            r0 = 13
            android.net.TrafficStats.setThreadStatsTag(r0)
            java.util.HashMap r1 = X.AnonymousClass001.A0t()     // Catch:{ IOException -> 0x00c3 }
            java.lang.String r0 = "backupId"
            r11 = r19
            r1.put(r0, r11)     // Catch:{ IOException -> 0x00c3 }
            java.lang.String r13 = "POST"
            java.lang.String r14 = "clients/wa/backups"
            r17 = 0
            r12 = r8
            r16 = r1
            javax.net.ssl.HttpsURLConnection r4 = r12.A0C(r13, r14, r15, r16, r17)     // Catch:{ IOException -> 0x00c3 }
            int r1 = r4.getResponseCode()     // Catch:{ IOException -> 0x00c0, all -> 0x00bd }
            r0 = 200(0xc8, float:2.8E-43)
            if (r1 == r0) goto L_0x00a6
            r0 = 403(0x193, float:5.65E-43)
            if (r1 == r0) goto L_0x008a
            r0 = 409(0x199, float:5.73E-43)
            if (r1 == r0) goto L_0x0079
            r0 = 400(0x190, float:5.6E-43)
            if (r1 == r0) goto L_0x0090
            r0 = 401(0x191, float:5.62E-43)
            if (r1 == r0) goto L_0x006f
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0l(r2)     // Catch:{ IOException -> 0x00c0, all -> 0x00bd }
            int r0 = r4.getResponseCode()     // Catch:{ IOException -> 0x00c0, all -> 0x00bd }
            java.lang.String r0 = X.AnonymousClass000.A0h(r1, r0)     // Catch:{ IOException -> 0x00c0, all -> 0x00bd }
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ IOException -> 0x00c0, all -> 0x00bd }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0l(r2)     // Catch:{ IOException -> 0x00c0, all -> 0x00bd }
            java.io.InputStream r0 = r4.getErrorStream()     // Catch:{ IOException -> 0x00c0, all -> 0x00bd }
            java.lang.String r0 = X.C624535b.A00(r0)     // Catch:{ IOException -> 0x00c0, all -> 0x00bd }
            java.lang.String r0 = X.AnonymousClass000.A0X(r0, r1)     // Catch:{ IOException -> 0x00c0, all -> 0x00bd }
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ IOException -> 0x00c0, all -> 0x00bd }
            r4.disconnect()
            android.net.TrafficStats.clearThreadStatsTag()
            return r15
        L_0x006f:
            r8.A0H()     // Catch:{ IOException -> 0x00c0, all -> 0x00bd }
            r4.disconnect()
            android.net.TrafficStats.clearThreadStatsTag()
            return r15
        L_0x0079:
            X.0Ub r0 = r8.A09(r11)     // Catch:{ 0EI -> 0x007e }
            goto L_0x00b6
        L_0x007e:
            r1 = move-exception
            java.lang.String r0 = "GoogleBackupApi/create-backup/failed to get one"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ IOException -> 0x00c0, all -> 0x00bd }
            X.0EW r0 = new X.0EW     // Catch:{ IOException -> 0x00c0, all -> 0x00bd }
            r0.<init>(r1)     // Catch:{ IOException -> 0x00c0, all -> 0x00bd }
            goto L_0x00a5
        L_0x008a:
            X.0EL r0 = new X.0EL     // Catch:{ IOException -> 0x00c0, all -> 0x00bd }
            r0.<init>()     // Catch:{ IOException -> 0x00c0, all -> 0x00bd }
            goto L_0x00a5
        L_0x0090:
            java.io.InputStream r0 = r4.getErrorStream()     // Catch:{ IOException -> 0x00c0, all -> 0x00bd }
            java.lang.String r3 = X.C624535b.A00(r0)     // Catch:{ IOException -> 0x00c0, all -> 0x00bd }
            X.2qk r2 = r8.A04     // Catch:{ IOException -> 0x00c0, all -> 0x00bd }
            java.lang.String r1 = "GoogleBackupApi/create-backup"
            r0 = 1
            r2.A0A(r1, r0, r3)     // Catch:{ IOException -> 0x00c0, all -> 0x00bd }
            X.0EJ r0 = new X.0EJ     // Catch:{ IOException -> 0x00c0, all -> 0x00bd }
            r0.<init>(r3)     // Catch:{ IOException -> 0x00c0, all -> 0x00bd }
        L_0x00a5:
            throw r0     // Catch:{ IOException -> 0x00c0, all -> 0x00bd }
        L_0x00a6:
            X.1VX r9 = r8.A0D     // Catch:{ IOException -> 0x00c0, all -> 0x00bd }
            X.2qk r5 = r8.A04     // Catch:{ IOException -> 0x00c0, all -> 0x00bd }
            X.0WN r7 = r8.A07     // Catch:{ IOException -> 0x00c0, all -> 0x00bd }
            X.0U8 r6 = r8.A06     // Catch:{ IOException -> 0x00c0, all -> 0x00bd }
            java.io.InputStream r10 = r4.getInputStream()     // Catch:{ IOException -> 0x00c0, all -> 0x00bd }
            X.0Ub r0 = X.C05580Ub.A00(r5, r6, r7, r8, r9, r10, r11)     // Catch:{ IOException -> 0x00c0, all -> 0x00bd }
        L_0x00b6:
            r4.disconnect()
            android.net.TrafficStats.clearThreadStatsTag()
            return r0
        L_0x00bd:
            r0 = move-exception
            r15 = r4
            goto L_0x00ca
        L_0x00c0:
            r0 = move-exception
            r15 = r4
            goto L_0x00c4
        L_0x00c3:
            r0 = move-exception
        L_0x00c4:
            X.0EU r0 = X.AnonymousClass0EU.A00(r0)     // Catch:{ all -> 0x00c9 }
            throw r0     // Catch:{ all -> 0x00c9 }
        L_0x00c9:
            r0 = move-exception
        L_0x00ca:
            if (r15 == 0) goto L_0x00cf
            r15.disconnect()
        L_0x00cf:
            android.net.TrafficStats.clearThreadStatsTag()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0Y7.A08(java.lang.String):X.0Ub");
    }

    /* JADX WARNING: Removed duplicated region for block: B:41:0x00b4  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C05580Ub A09(java.lang.String r17) {
        /*
            r16 = this;
            java.lang.String r4 = "GoogleBackupApi/get-backup/failed "
            r6 = r16
            boolean r0 = r6.A0I()
            r13 = 0
            if (r0 == 0) goto L_0x0011
            java.lang.String r0 = "GoogleBackupApi/get-backup/api disabled"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            return r13
        L_0x0011:
            r0 = 13
            android.net.TrafficStats.setThreadStatsTag(r0)
            java.lang.String r11 = "GET"
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ IOException -> 0x00a8 }
            java.lang.String r0 = "clients/wa/backups/"
            r9 = r17
            java.lang.String r12 = X.AnonymousClass000.A0V(r0, r9, r1)     // Catch:{ IOException -> 0x00a8 }
            r15 = 0
            r10 = r6
            r14 = r13
            javax.net.ssl.HttpsURLConnection r2 = r10.A0C(r11, r12, r13, r14, r15)     // Catch:{ IOException -> 0x00a8 }
            int r1 = r2.getResponseCode()     // Catch:{ IOException -> 0x00a5, all -> 0x00a2 }
            r0 = 200(0xc8, float:2.8E-43)
            if (r1 == r0) goto L_0x008b
            r0 = 401(0x191, float:5.62E-43)
            if (r1 == r0) goto L_0x0081
            r0 = 429(0x1ad, float:6.01E-43)
            if (r1 == r0) goto L_0x0058
            r0 = 403(0x193, float:5.65E-43)
            if (r1 == r0) goto L_0x0052
            r0 = 404(0x194, float:5.66E-43)
            if (r1 == r0) goto L_0x0044
            goto L_0x0068
        L_0x0044:
            java.io.InputStream r0 = r2.getErrorStream()     // Catch:{ IOException -> 0x00a5, all -> 0x00a2 }
            java.lang.String r0 = X.C624535b.A00(r0)     // Catch:{ IOException -> 0x00a5, all -> 0x00a2 }
            X.0EI r1 = new X.0EI     // Catch:{ IOException -> 0x00a5, all -> 0x00a2 }
            r1.<init>(r0)     // Catch:{ IOException -> 0x00a5, all -> 0x00a2 }
            goto L_0x0080
        L_0x0052:
            X.0EL r1 = new X.0EL     // Catch:{ IOException -> 0x00a5, all -> 0x00a2 }
            r1.<init>()     // Catch:{ IOException -> 0x00a5, all -> 0x00a2 }
            goto L_0x0080
        L_0x0058:
            X.1VX r0 = r6.A0D     // Catch:{ IOException -> 0x00a5, all -> 0x00a2 }
            boolean r1 = X.C06520Ya.A0G(r0)     // Catch:{ IOException -> 0x00a5, all -> 0x00a2 }
            java.lang.String r0 = "get-backup"
            X.C06380Xl.A04(r0, r2, r1)     // Catch:{ IOException -> 0x00a5, all -> 0x00a2 }
            java.lang.RuntimeException r1 = X.AnonymousClass000.A0L()     // Catch:{ IOException -> 0x00a5, all -> 0x00a2 }
            goto L_0x0080
        L_0x0068:
            r2.getURL()     // Catch:{ IOException -> 0x00a5, all -> 0x00a2 }
            java.io.InputStream r0 = r2.getErrorStream()     // Catch:{ IOException -> 0x00a5, all -> 0x00a2 }
            java.lang.String r3 = X.C624535b.A00(r0)     // Catch:{ IOException -> 0x00a5, all -> 0x00a2 }
            java.lang.String r0 = X.AnonymousClass000.A0T(r4, r3)     // Catch:{ IOException -> 0x00a5, all -> 0x00a2 }
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ IOException -> 0x00a5, all -> 0x00a2 }
            r0 = -1
            X.0EU r1 = new X.0EU     // Catch:{ IOException -> 0x00a5, all -> 0x00a2 }
            r1.<init>(r3, r0)     // Catch:{ IOException -> 0x00a5, all -> 0x00a2 }
        L_0x0080:
            throw r1     // Catch:{ IOException -> 0x00a5, all -> 0x00a2 }
        L_0x0081:
            r6.A0H()     // Catch:{ IOException -> 0x00a5, all -> 0x00a2 }
            r2.disconnect()
            android.net.TrafficStats.clearThreadStatsTag()
            return r13
        L_0x008b:
            X.1VX r7 = r6.A0D     // Catch:{ IOException -> 0x00a5, all -> 0x00a2 }
            X.2qk r3 = r6.A04     // Catch:{ IOException -> 0x00a5, all -> 0x00a2 }
            X.0WN r5 = r6.A07     // Catch:{ IOException -> 0x00a5, all -> 0x00a2 }
            X.0U8 r4 = r6.A06     // Catch:{ IOException -> 0x00a5, all -> 0x00a2 }
            java.io.InputStream r8 = r2.getInputStream()     // Catch:{ IOException -> 0x00a5, all -> 0x00a2 }
            X.0Ub r0 = X.C05580Ub.A00(r3, r4, r5, r6, r7, r8, r9)     // Catch:{ IOException -> 0x00a5, all -> 0x00a2 }
            r2.disconnect()
            android.net.TrafficStats.clearThreadStatsTag()
            return r0
        L_0x00a2:
            r0 = move-exception
            r13 = r2
            goto L_0x00b2
        L_0x00a5:
            r0 = move-exception
            r13 = r2
            goto L_0x00a9
        L_0x00a8:
            r0 = move-exception
        L_0x00a9:
            com.whatsapp.util.Log.e((java.lang.Throwable) r0)     // Catch:{ all -> 0x00b1 }
            X.0EU r0 = X.AnonymousClass0EU.A00(r0)     // Catch:{ all -> 0x00b1 }
            throw r0     // Catch:{ all -> 0x00b1 }
        L_0x00b1:
            r0 = move-exception
        L_0x00b2:
            if (r13 == 0) goto L_0x00b7
            r13.disconnect()
        L_0x00b7:
            android.net.TrafficStats.clearThreadStatsTag()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0Y7.A09(java.lang.String):X.0Ub");
    }

    public AnonymousClass0UI A0A(C16410tE r16, C04710Qi r17, C05580Ub r18, AnonymousClass0UO r19, int i) {
        TrafficStats.setThreadStatsTag(13);
        try {
            AnonymousClass1VX r12 = this.A0D;
            C55682qk r1 = this.A04;
            AnonymousClass310 r10 = this.A0B;
            return new AnonymousClass0YT(r1, this.A07, r16, this.A09, r17, r18, this, r19, this.A0A, r10, this.A0C, r12, this.A0F, i).A0C();
        } finally {
            TrafficStats.clearThreadStatsTag();
        }
    }

    public final String A0B(String str, Map map) {
        String str2 = this.A0H;
        if (str2 != null) {
            if (map == null) {
                map = new HashMap(1);
            }
            C626936e.A0D(true ^ map.containsKey("mode"), "mode param should not be included in params");
            map.put("mode", str2);
        } else if (map == null) {
            return str;
        }
        if (map.isEmpty()) {
            return str;
        }
        Uri.Builder buildUpon = Uri.parse(str).buildUpon();
        Iterator A0q = AnonymousClass000.A0q(map);
        while (A0q.hasNext()) {
            Map.Entry A0w = AnonymousClass001.A0w(A0q);
            buildUpon.appendQueryParameter((String) A0w.getKey(), (String) A0w.getValue());
        }
        return buildUpon.build().toString();
    }

    public HttpsURLConnection A0C(String str, String str2, String str3, Map map, boolean z) {
        try {
            return A0D(str, new URI("https", (String) null, "backup.googleapis.com", -1, AnonymousClass000.A0V("/v1/", str2, AnonymousClass001.A0o()), (String) null, (String) null).toASCIIString(), str3, map, z);
        } catch (URISyntaxException e) {
            throw new IOException(e);
        }
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [java.net.HttpURLConnection, java.lang.String] */
    public void A0F(String str) {
        Throwable th;
        Log.i("GoogleBackupApi/notify-gpb-enabled/");
        if (!A0I()) {
            TrafficStats.setThreadStatsTag(13);
            ? r5 = 0;
            try {
                StringBuilder A0q = AnonymousClass001.A0q();
                A0q.append(str);
                HttpsURLConnection A0C2 = A0C("POST", AnonymousClass000.A0X(":notifyAxolotlAnnouncement", A0q), r5, r5, false);
                int responseCode = A0C2.getResponseCode();
                if (responseCode != 200) {
                    if (responseCode == 401) {
                        th = new AnonymousClass0EX();
                    } else if (responseCode != 403) {
                        StringBuilder A0o = AnonymousClass001.A0o();
                        A0o.append("GoogleBackupApi/notify-gpb-enabled/failed ");
                        A0o.append(A0C2.getResponseCode());
                        A0o.append(" : ");
                        Log.e(AnonymousClass000.A0X(C624535b.A00(A0C2.getErrorStream()), A0o));
                        StringBuilder A0o2 = AnonymousClass001.A0o();
                        A0o2.append("Unhandled response code for notify-gpb-enabled: ");
                        th = new AnonymousClass0EJ(AnonymousClass000.A0h(A0o2, A0C2.getResponseCode()));
                    } else {
                        th = new AnonymousClass0EL();
                    }
                    throw th;
                }
                A0C2.disconnect();
                TrafficStats.clearThreadStatsTag();
            } catch (IOException e) {
                throw AnonymousClass0EU.A00(e);
            } catch (Throwable th2) {
                if (r5 != 0) {
                    r5.disconnect();
                }
                TrafficStats.clearThreadStatsTag();
                throw th2;
            }
        } else {
            Log.i("GoogleBackupApi/notify-gpb-enabled/api disabled");
            throw new AnonymousClass0EL();
        }
    }

    public boolean A0H() {
        String str = this.A0G;
        try {
            Log.i(AnonymousClass0YV.A0B("GoogleBackupApi/auth-request asking GoogleAuthUtil for auth token: ", str, AnonymousClass001.A0o()));
            String str2 = this.A00;
            if (str2 != null) {
                C162297re.A07(this.A03, str2);
            }
            this.A00 = C162297re.A03(new Account(str, "com.google"), this.A03);
            Log.i("GoogleBackupApi/auth-request/received-auth-token");
            return true;
        } catch (C126936Px e) {
            Log.e("GoogleBackupApi/auth-request Google Play services is unavailable, if it was unavailable from the beginning code would not have reached here, so, most likely it became unavailable while the backup/restore was in progress");
            Log.e("GoogleBackupApi/auth-request", e);
            this.A00 = null;
            throw new AnonymousClass0EX(e);
        } catch (UserRecoverableAuthException e2) {
            StringBuilder A0o = AnonymousClass001.A0o();
            AnonymousClass0YV.A0E("GoogleBackupApi/auth-request permission to access Google Drive for ", str, A0o);
            Log.i(AnonymousClass000.A0X(" is not available and we cannot ask user for permission either.", A0o));
            throw new AnonymousClass0EX(e2);
        } catch (C126926Pw e3) {
            Log.i("GoogleBackupApi/auth-request user recoverable exception happened and notification was published by the system to resolve it.");
            throw new AnonymousClass0EX(e3);
        } catch (IOException e4) {
            Log.d("GoogleBackupApi/auth-request IOException while trying to fetch auth token");
            Log.e("GoogleBackupApi/auth-request", e4);
            this.A00 = null;
            return false;
        } catch (C143906zf e5) {
            Log.e("GoogleBackupApi/auth-request", e5);
            if ("BadUsername".equals(e5.getMessage())) {
                throw new AnonymousClass0EW(e5);
            } else if ("ServiceUnavailable".equals(e5.getMessage())) {
                return false;
            } else {
                this.A00 = null;
                throw new AnonymousClass0EX(e5);
            }
        } catch (SecurityException e6) {
            Log.e("GoogleBackupApi/auth-request", e6);
            this.A00 = null;
            throw new AnonymousClass0EX(e6);
        } catch (NullPointerException e7) {
            Log.e(AnonymousClass0YV.A0B("GoogleBackupApi/auth-request unexpected NullPointerException while trying to get  auth token for the account ", str, AnonymousClass001.A0o()));
            Log.e("GoogleBackupApi/auth-request", e7);
            this.A00 = null;
            throw new AnonymousClass0EX(e7);
        }
    }

    public boolean A0J(C16400tD r37, C04710Qi r38, AnonymousClass0UI r39, File file) {
        Throwable r2;
        Throwable th;
        String str;
        if (A0I()) {
            str = "restore>GoogleBackupApi/save-file/api disabled";
        } else {
            AnonymousClass0UI r6 = r39;
            File file2 = file;
            if (A04(r6, file2)) {
                File parentFile = file2.getParentFile();
                StringBuilder A0o = AnonymousClass001.A0o();
                A0o.append(file2.getName());
                File A0A2 = AnonymousClass002.A0A(parentFile, AnonymousClass000.A0X(".incomplete", A0o));
                if (A0L(r6, A0A2)) {
                    A0A2.length();
                } else if (A05(A0A2)) {
                    A0A2.getAbsolutePath();
                } else {
                    A0A2.getAbsolutePath();
                    return false;
                }
                long length = A0A2.length();
                long j = r6.A00;
                C16400tD r9 = r37;
                if (length == j) {
                    A03(r6, A0A2);
                    if (A0M(A0A2, file2)) {
                        r9.BQd(length);
                        return true;
                    }
                    throw new AnonymousClass0ES(file2.getName());
                }
                r9.BQd(length);
                C04710Qi r31 = r38;
                if (!r31.A06()) {
                    str = "restore>GoogleBackupApi/save-file/failed-waiting-for-suitable-conditions";
                } else {
                    TrafficStats.setThreadStatsTag(13);
                    try {
                        HashMap A0t = AnonymousClass001.A0t();
                        A0t.put("alt", "media");
                        HttpsURLConnection A0D2 = A0D("GET", new URI("https", (String) null, "backup.googleapis.com", -1, AnonymousClass000.A0V("/v1/", r6.A05, AnonymousClass001.A0o()), (String) null, (String) null).toASCIIString().replaceAll("\\+", "%2B"), (String) null, A0t, false);
                        A0D2.getURL();
                        A0D2.getRequestMethod();
                        if (length > 0) {
                            Locale locale = Locale.ENGLISH;
                            Object[] objArr = new Object[1];
                            AnonymousClass000.A1Q(objArr, 0, length);
                            A0D2.setRequestProperty("Range", String.format(locale, "bytes=%d-", objArr));
                            A0D2.getRequestProperty("Range");
                        }
                        try {
                            int responseCode = A0D2.getResponseCode();
                            if (responseCode == 200 || responseCode == 206) {
                                A0A2.getAbsolutePath();
                                A0D2.getHeaderField("Content-Length");
                                C06540Yd.A06(r9, r31, this.A0A, this.A0F, A0A2, A0D2);
                                A0A2.getAbsolutePath();
                                A0A2.length();
                                if (A0A2.length() < j) {
                                    StringBuilder A0o2 = AnonymousClass001.A0o();
                                    A0o2.append("restore>GoogleBackupApi/");
                                    Locale locale2 = Locale.ENGLISH;
                                    Object[] A0M = AnonymousClass002.A0M();
                                    AnonymousClass000.A1Q(A0M, 0, j);
                                    AnonymousClass000.A1Q(A0M, 1, A0A2.length());
                                    Log.i(AnonymousClass000.A0X(String.format(locale2, "save-file/incomplete download, expected: %d bytes, received: %d bytes", A0M), A0o2));
                                } else {
                                    if (!A0N(A0A2, r6.A03, A0A2.length())) {
                                        A05(A0A2);
                                    } else {
                                        A03(r6, A0A2);
                                        if (A0M(A0A2, file2)) {
                                            r9.BQd(length * -1);
                                            A0D2.disconnect();
                                            TrafficStats.clearThreadStatsTag();
                                            return true;
                                        }
                                        th = new AnonymousClass0ES(file2.getName());
                                    }
                                }
                                r9.BQd(length * -1);
                                A0D2.disconnect();
                                TrafficStats.clearThreadStatsTag();
                                return false;
                            } else if (responseCode == 401) {
                                A0D2.getResponseMessage();
                                A0H();
                                r9.BQd(length * -1);
                                A0D2.disconnect();
                                TrafficStats.clearThreadStatsTag();
                                return false;
                            } else if (responseCode != 403) {
                                StringBuilder A0l = AnonymousClass000.A0l("restore>GoogleBackupApi/save-file status of the response is ");
                                A0l.append(responseCode);
                                A0l.append(" statusLine ");
                                Log.e(AnonymousClass000.A0X(A0D2.getResponseMessage(), A0l));
                                String A002 = C624535b.A00(A0D2.getErrorStream());
                                Log.e(AnonymousClass000.A0V("restore>GoogleBackupApi/save-file ", A002, AnonymousClass001.A0o()));
                                if (responseCode == 404) {
                                    th = new AnonymousClass0EY();
                                } else if (responseCode == 429) {
                                    C06380Xl.A04("save-file", A0D2, C06520Ya.A0G(this.A0D));
                                    th = AnonymousClass000.A0L();
                                } else {
                                    A02(this.A04, "save-file", responseCode);
                                    th = new AnonymousClass0EU(A002, -1);
                                }
                            } else {
                                th = new AnonymousClass0EL();
                            }
                            throw th;
                        } catch (UnknownHostException e) {
                            StringBuilder A0o3 = AnonymousClass001.A0o();
                            A0o3.append("restore>GoogleBackupApi/save-file unable to access ");
                            Log.e(AnonymousClass000.A0R(A0D2.getURL(), A0o3), e);
                        } catch (IOException e2) {
                            Log.e(AnonymousClass000.A0P(file2, "restore>GoogleBackupApi/save-file error while downloading file ", AnonymousClass001.A0o()), e2);
                            String message = e2.getMessage();
                            if (message != null) {
                                if (message.contains("ENOSPC")) {
                                    Log.e("restore>GoogleBackupApi/save-file no space left on the device.");
                                    r2 = new AnonymousClass0EP();
                                } else if (message.contains("ENAMETOOLONG") || message.contains("(File name too long)")) {
                                    Log.e("restore>GoogleBackupApi/save-file name too long");
                                    r2 = new AnonymousClass0EY(message);
                                }
                                throw r2;
                            }
                            if (this.A0B.A0C(file2) && this.A0C.A0H()) {
                                r2 = new AnonymousClass0EV(e2);
                                throw r2;
                            } else if (message != null) {
                                if (message.contains("EACCES")) {
                                    Log.e("restore>GoogleBackupApi/save-file EACCES");
                                    r2 = new AnonymousClass0EV(e2);
                                } else if (message.contains("EPERM")) {
                                    Log.e("restore>GoogleBackupApi/save-file EPERM");
                                    r2 = new AnonymousClass0ER(e2);
                                }
                                throw r2;
                            }
                        } catch (Throwable th2) {
                            r9.BQd(length * -1);
                            A0D2.disconnect();
                            TrafficStats.clearThreadStatsTag();
                            throw th2;
                        }
                    } catch (URISyntaxException e3) {
                        throw new IOException(e3);
                    } catch (IOException e4) {
                        Log.e("restore>GoogleBackupApi/save-file", e4);
                        return false;
                    }
                }
            }
            return false;
        }
        Log.i(str);
        return false;
    }

    public boolean A0K(C05580Ub r14, Collection collection) {
        JsonWriter jsonWriter;
        if (collection.isEmpty()) {
            return true;
        }
        if (collection.size() <= 2500) {
            TrafficStats.setThreadStatsTag(13);
            HttpsURLConnection httpsURLConnection = null;
            try {
                StringBuilder A0q = AnonymousClass001.A0q();
                A0q.append(r14.A0B);
                httpsURLConnection = A0C("POST", AnonymousClass000.A0X(":batchDeleteFiles", A0q), "application/json; charset=UTF-8", (Map) null, true);
                OutputStream outputStream = httpsURLConnection.getOutputStream();
                try {
                    jsonWriter = new JsonWriter(new OutputStreamWriter(outputStream, C58152un.A0B));
                    jsonWriter.beginObject().name("transactionId").value(r14.A02()).name("fileIds").beginArray();
                    Iterator it = collection.iterator();
                    while (it.hasNext()) {
                        jsonWriter.value(((AnonymousClass0UI) it.next()).A06);
                    }
                    jsonWriter.endArray().endObject().flush();
                    jsonWriter.close();
                    if (outputStream != null) {
                        outputStream.close();
                    }
                    int responseCode = httpsURLConnection.getResponseCode();
                    if (responseCode == 200) {
                        String A002 = A00(httpsURLConnection);
                        if (TextUtils.isEmpty(A002)) {
                            Log.w("GoogleBackupApi/delete-files empty response");
                        } else {
                            try {
                                JSONObject jSONObject = new JSONObject(A002);
                                if (jSONObject.has("status")) {
                                    JSONObject jSONObject2 = jSONObject.getJSONObject("status");
                                    Iterator it2 = collection.iterator();
                                    while (it2.hasNext()) {
                                        String str = ((AnonymousClass0UI) it2.next()).A06;
                                        if (!jSONObject2.has(str)) {
                                            Log.w(AnonymousClass000.A0V("GoogleBackupApi/delete-files no status for ", str, AnonymousClass001.A0o()));
                                        } else if (!"OK".equals(jSONObject2.getString(str))) {
                                            StringBuilder A0o = AnonymousClass001.A0o();
                                            A0o.append("GoogleBackupApi/delete-files failed to delete ");
                                            A0o.append(str);
                                            Log.w(AnonymousClass000.A0P(jSONObject2, " status ", A0o));
                                        }
                                    }
                                    httpsURLConnection.disconnect();
                                    TrafficStats.clearThreadStatsTag();
                                    return true;
                                }
                            } catch (JSONException e) {
                                Log.e(AnonymousClass000.A0V("GoogleBackupApi/delete-files malformed response", A002, AnonymousClass001.A0o()), e);
                            }
                        }
                    } else if (responseCode != 401) {
                        if (responseCode == 403) {
                            th = new AnonymousClass0EL();
                        } else if (responseCode != 429) {
                            StringBuilder A0o2 = AnonymousClass001.A0o();
                            A0o2.append("GoogleBackupApi/delete-files status of the response is ");
                            A0o2.append(responseCode);
                            A0o2.append(" statusLine ");
                            Log.e(AnonymousClass000.A0X(httpsURLConnection.getResponseMessage(), A0o2));
                            String A003 = C624535b.A00(httpsURLConnection.getErrorStream());
                            Log.i(AnonymousClass000.A0T("GoogleBackupApi/delete-files ", A003));
                            A02(this.A04, "delete-files", responseCode);
                            th = new AnonymousClass0EU(A003, -1);
                        } else {
                            C06380Xl.A04("delete-files", httpsURLConnection, C06520Ya.A0G(this.A0D));
                            throw AnonymousClass000.A0L();
                        }
                        throw th;
                    } else {
                        A0H();
                    }
                    httpsURLConnection.disconnect();
                    TrafficStats.clearThreadStatsTag();
                    return false;
                } catch (Throwable th) {
                    th = th;
                    if (outputStream != null) {
                        try {
                            outputStream.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                    }
                }
            } catch (IOException e2) {
                throw AnonymousClass0EU.A00(e2);
            } catch (Throwable th3) {
                if (httpsURLConnection != null) {
                    httpsURLConnection.disconnect();
                }
                TrafficStats.clearThreadStatsTag();
                throw th3;
            }
        } else {
            StringBuilder A0o3 = AnonymousClass001.A0o();
            A0o3.append("Batch too big ");
            A0o3.append(collection.size());
            throw AnonymousClass000.A0G(" max allowed ", A0o3, 2500);
        }
        throw th;
    }

    public final boolean A0N(File file, String str, long j) {
        String A082 = AnonymousClass0YV.A08(this.A0B, this.A0C, file, j);
        if (str.equals(A082)) {
            return true;
        }
        StringBuilder A0o = AnonymousClass001.A0o();
        AnonymousClass000.A10(file, "restore>GoogleBackupApi/save-file/check-md5 ", A0o);
        A0o.append(" downloaded but its MD5(");
        A0o.append(A082);
        A0o.append(") does not match remote md5(");
        A0o.append(str);
        Log.e(AnonymousClass000.A0X(").", A0o));
        return false;
    }

    public static String A00(HttpsURLConnection httpsURLConnection) {
        try {
            return C624535b.A00(httpsURLConnection.getInputStream());
        } catch (IOException unused) {
            return null;
        }
    }

    public static final boolean A05(File file) {
        if (file.delete()) {
            return true;
        }
        StringBuilder A0o = AnonymousClass001.A0o();
        AnonymousClass000.A10(file, "restore>GoogleBackupApi/delete-local-file/failed ", A0o);
        Log.e(A0o.toString());
        return false;
    }

    public final Pair A06(InputStream inputStream, String str) {
        try {
            JSONObject A022 = C624535b.A02(inputStream);
            JSONArray optJSONArray = A022.optJSONArray("files");
            if (optJSONArray == null) {
                return Pair.create(Collections.emptyList(), (Object) null);
            }
            StringBuilder A0q = AnonymousClass001.A0q();
            A0q.append(str);
            String A0X = AnonymousClass000.A0X("/files/", A0q);
            ArrayList A0I2 = AnonymousClass002.A0I(optJSONArray.length());
            for (int i = 0; i < optJSONArray.length(); i++) {
                JSONObject jSONObject = optJSONArray.getJSONObject(i);
                AnonymousClass0UI A002 = AnonymousClass0UI.A00(this.A07, A0X, (String) null, jSONObject, -1);
                if (A002 != null) {
                    A0I2.add(A002);
                } else {
                    Log.e(AnonymousClass000.A0P(jSONObject, "GoogleBackupApi/list-files/missing some attrs ", AnonymousClass001.A0o()));
                }
            }
            return Pair.create(A0I2, A022.optString("nextPageToken", (String) null));
        } catch (JSONException e) {
            Log.e("GoogleBackupApi/list-files/invalid stream", e);
            throw AnonymousClass0EU.A00(e);
        }
    }

    public HttpsURLConnection A0D(String str, String str2, String str3, Map map, boolean z) {
        HttpsURLConnection httpsURLConnection = (HttpsURLConnection) new URL(A0B(str2, map)).openConnection();
        httpsURLConnection.setSSLSocketFactory(this.A0K);
        httpsURLConnection.setRequestProperty("Host", "backup.googleapis.com");
        httpsURLConnection.setHostnameVerifier(C06540Yd.A04());
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("Bearer ");
        httpsURLConnection.setRequestProperty("Authorization", AnonymousClass000.A0X(this.A00, A0o));
        httpsURLConnection.setRequestProperty("User-Agent", this.A0I);
        httpsURLConnection.setConnectTimeout(15000);
        httpsURLConnection.setReadTimeout(30000);
        httpsURLConnection.setRequestMethod(str);
        if (str3 != null) {
            httpsURLConnection.setRequestProperty("Content-Type", str3);
        }
        httpsURLConnection.setDoOutput(z);
        this.A0J.incrementAndGet();
        return httpsURLConnection;
    }

    public final boolean A0L(AnonymousClass0UI r8, File file) {
        if (!file.exists()) {
            file.getAbsolutePath();
        } else {
            long length = file.length();
            int i = (length > r8.A00 ? 1 : (length == r8.A00 ? 0 : -1));
            if (i > 0) {
                StringBuilder A0o = AnonymousClass001.A0o();
                A0o.append("restore>GoogleBackupApi/is-invalid-download-file/true size of a file (");
                A0o.append(length);
                Log.i(AnonymousClass000.A0P(r8, ") is more than size of remote file ", A0o));
                file.getAbsolutePath();
                return false;
            } else if (i == 0) {
                if (!A0N(file, r8.A03, file.length())) {
                    return false;
                }
            }
        }
        return true;
    }

    public final boolean A0M(File file, File file2) {
        if (file.renameTo(file2)) {
            return true;
        }
        StringBuilder A0o = AnonymousClass001.A0o();
        AnonymousClass000.A10(file, "restore>GoogleBackupApi/rename-local/file/failed copying and deleting:", A0o);
        AnonymousClass000.A10(file2, " -> ", A0o);
        Log.w(A0o.toString());
        try {
            C627536m.A0C(this.A0E, file, file2);
            if (C627536m.A0O(file)) {
                return true;
            }
            Log.e("restore>GoogleBackupApi/rename-local/file/failed to delete file after copy");
            return false;
        } catch (IOException | SecurityException e) {
            Log.e("restore>GoogleBackupApi/rename-local/file/failed with exception", e);
            return false;
        }
    }

    public boolean A0O(String str) {
        Log.i(AnonymousClass000.A0V("GoogleBackupApi/delete-backup/", str, AnonymousClass001.A0o()));
        boolean z = false;
        if (A0I()) {
            Log.i("GoogleBackupApi/delete-backup/api disabled");
            return false;
        }
        TrafficStats.setThreadStatsTag(13);
        HttpsURLConnection httpsURLConnection = null;
        try {
            httpsURLConnection = A0C("DELETE", AnonymousClass000.A0V("clients/wa/backups/", str, AnonymousClass001.A0o()), (String) null, (Map) null, false);
            int responseCode = httpsURLConnection.getResponseCode();
            Log.i(AnonymousClass000.A0Y("GoogleBackupApi/delete-backup/", AnonymousClass001.A0o(), responseCode));
            if (responseCode != 403) {
                if (responseCode == 200) {
                    z = true;
                }
                httpsURLConnection.disconnect();
                TrafficStats.clearThreadStatsTag();
                return z;
            }
            throw new AnonymousClass0EL();
        } catch (IOException e) {
            Log.e((Throwable) e);
            if (httpsURLConnection != null) {
            }
        } catch (Throwable th) {
            if (httpsURLConnection != null) {
                httpsURLConnection.disconnect();
            }
            TrafficStats.clearThreadStatsTag();
            throw th;
        }
    }

    public AnonymousClass0Y7(Context context, C55682qk r4, C56492s4 r5, AnonymousClass0U8 r6, AnonymousClass0WN r7, AnonymousClass0QR r8, C29441ip r9, AnonymousClass310 r10, AnonymousClass5ZR r11, AnonymousClass1VX r12, AnonymousClass306 r13, AnonymousClass3FI r14, AnonymousClass4FS r15, String str, String str2) {
        this.A03 = context;
        this.A0D = r12;
        this.A04 = r4;
        this.A05 = r5;
        this.A0B = r10;
        this.A07 = r7;
        this.A09 = r8;
        this.A0C = r11;
        this.A0E = r13;
        this.A06 = r6;
        this.A0G = str;
        this.A0A = r9;
        this.A0F = r15;
        this.A0I = r14.A01();
        this.A0K = new C73573fj(r5);
        this.A08 = new C13790nk(r5);
        this.A0H = str2;
    }
}
