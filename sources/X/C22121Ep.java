package X;

import android.os.Build;
import android.os.Handler;
import java.io.File;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.1Ep  reason: invalid class name and case insensitive filesystem */
public class C22121Ep extends C55682qk implements AnonymousClass66U {
    public AnonymousClass49Y A00;
    public final Handler A01 = AnonymousClass000.A0A();
    public final C43482Sh A02;
    public final C56972sr A03;
    public final C56492s4 A04;
    public final C29441ip A05;
    public final C620633i A06;
    public final C54292oU A07;
    public final AnonymousClass33p A08;
    public final AnonymousClass4FV A09;
    public final C48092eK A0A;
    public final C55132pq A0B;
    public final AnonymousClass3FI A0C;
    public final AnonymousClass4FS A0D;

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0036, code lost:
        r1 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0037, code lost:
        r3 = null;
        r5 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0054, code lost:
        if (r5 == null) goto L_0x005e;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0040 A[SYNTHETIC, Splitter:B:33:0x0040] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x004a A[SYNTHETIC, Splitter:B:38:0x004a] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.io.File A00(java.io.File r7, java.io.File r8) {
        /*
            java.lang.String r4 = "app/CrashLogs/copyFileToCache: Could not close stream"
            r6 = 0
            java.io.FileInputStream r5 = X.AnonymousClass0x9.A0g(r7)     // Catch:{ IOException -> 0x0036, all -> 0x0034 }
            java.io.FileOutputStream r3 = X.AnonymousClass0x9.A0h(r8)     // Catch:{ IOException -> 0x0031, all -> 0x002e }
            r0 = 1024(0x400, float:1.435E-42)
            byte[] r2 = new byte[r0]     // Catch:{ IOException -> 0x002c }
        L_0x000f:
            int r1 = r5.read(r2)     // Catch:{ IOException -> 0x002c }
            if (r1 <= 0) goto L_0x001a
            r0 = 0
            r3.write(r2, r0, r1)     // Catch:{ IOException -> 0x002c }
            goto L_0x000f
        L_0x001a:
            r5.close()     // Catch:{ IOException -> 0x001e }
            goto L_0x0022
        L_0x001e:
            r0 = move-exception
            com.whatsapp.util.Log.w(r4, r0)
        L_0x0022:
            r3.close()     // Catch:{ IOException -> 0x0026 }
            goto L_0x002b
        L_0x0026:
            r0 = move-exception
            com.whatsapp.util.Log.w(r4, r0)
            return r8
        L_0x002b:
            return r8
        L_0x002c:
            r1 = move-exception
            goto L_0x0039
        L_0x002e:
            r1 = move-exception
            r3 = r6
            goto L_0x0056
        L_0x0031:
            r1 = move-exception
            r3 = r6
            goto L_0x0039
        L_0x0034:
            r1 = move-exception
            throw r1
        L_0x0036:
            r1 = move-exception
            r3 = r6
            r5 = r6
        L_0x0039:
            java.lang.String r0 = "app/CrashLogs/copyFileToCache: Could not copy file"
            com.whatsapp.util.Log.w(r0, r1)     // Catch:{ all -> 0x0053 }
            if (r5 == 0) goto L_0x0048
            r5.close()     // Catch:{ IOException -> 0x0044 }
            goto L_0x0048
        L_0x0044:
            r0 = move-exception
            com.whatsapp.util.Log.w(r4, r0)
        L_0x0048:
            if (r3 == 0) goto L_0x0052
            r3.close()     // Catch:{ IOException -> 0x004e }
            return r6
        L_0x004e:
            r0 = move-exception
            com.whatsapp.util.Log.w(r4, r0)
        L_0x0052:
            return r6
        L_0x0053:
            r1 = move-exception
            if (r5 == 0) goto L_0x005e
        L_0x0056:
            r5.close()     // Catch:{ IOException -> 0x005a }
            goto L_0x005e
        L_0x005a:
            r0 = move-exception
            com.whatsapp.util.Log.w(r4, r0)
        L_0x005e:
            if (r3 == 0) goto L_0x0068
            r3.close()     // Catch:{ IOException -> 0x0064 }
            throw r1
        L_0x0064:
            r0 = move-exception
            com.whatsapp.util.Log.w(r4, r0)
        L_0x0068:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C22121Ep.A00(java.io.File, java.io.File):java.io.File");
    }

    public static String A01(String str, int i) {
        JSONObject A1G = AnonymousClass0x9.A1G();
        try {
            A1G.put("app_version_code", 232614005);
            A1G.put("brand", Build.BRAND);
            A1G.put("memclass", i);
            A1G.put("model", Build.MODEL);
            A1G.put("android_version", Build.VERSION.RELEASE);
            A1G.put("app_version_name", "2.23.26.14");
            A1G.put("app", "Whatsapp");
            A1G.put("process_name", "Main Process");
            A1G.put("uid", "1");
            A1G.putOpt("dump_cause", str);
            return AnonymousClass0x9.A0y(AnonymousClass321.A02(), "platform_abi", A1G);
        } catch (JSONException e) {
            Locale locale = Locale.US;
            Object[] A0L = AnonymousClass002.A0L();
            A0L[0] = e.getMessage();
            return String.format(locale, "{ 'error' : '%s' }", A0L);
        }
    }

    public final File A0C(File file, long j) {
        File A0e = AnonymousClass0x7.A0e(C54292oU.A02(this.A07), "Crashes");
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append(j);
        return A00(file, C18270x1.A0A(A0e, ".log", A0o));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:80:0x01d1, code lost:
        if (r8.A06.nextInt(r6.A00) == 0) goto L_0x01d3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0E(X.C73173f3 r19, java.lang.String r20, java.lang.String r21, java.util.Map r22, boolean r23) {
        /*
            r18 = this;
            X.1YE r1 = new X.1YE
            r1.<init>()
            r7 = r20
            r1.A02 = r7
            r0 = r21
            r1.A01 = r0
            r17 = r19
            if (r23 == 0) goto L_0x0017
            java.lang.String r0 = X.C615631i.A00(r17)
            r1.A00 = r0
        L_0x0017:
            r3 = r18
            X.4FV r0 = r3.A09
            r0.BhA(r1)
            X.2Sh r8 = r3.A02
            java.lang.String r0 = "AppMessagingXmppHandler/onLogNotification"
            boolean r0 = r0.equals(r7)
            r11 = 1
            if (r0 != 0) goto L_0x01d3
            monitor-enter(r8)
            android.content.SharedPreferences r4 = r8.A00     // Catch:{ all -> 0x024c }
            if (r4 != 0) goto L_0x0038
            X.2y5 r1 = r8.A05     // Catch:{ all -> 0x024c }
            java.lang.String r0 = "critical_event_client_prefs"
            android.content.SharedPreferences r4 = r1.A03(r0)     // Catch:{ all -> 0x024c }
            r8.A00 = r4     // Catch:{ all -> 0x024c }
        L_0x0038:
            java.util.Set r0 = r8.A02     // Catch:{ all -> 0x024c }
            if (r0 != 0) goto L_0x01a1
            r2 = 232614005(0xddd6875, float:1.3645324E-30)
            X.C626936e.A06(r4)     // Catch:{ all -> 0x024c }
            r0 = -1
            java.lang.String r1 = "build_version"
            int r0 = r4.getInt(r1, r0)     // Catch:{ all -> 0x024c }
            java.lang.String r5 = "critical_event_client_config"
            if (r2 == r0) goto L_0x0064
            android.content.SharedPreferences r0 = r8.A00     // Catch:{ all -> 0x024c }
            android.content.SharedPreferences$Editor r0 = X.C18310x6.A0E(r0, r5)     // Catch:{ all -> 0x024c }
            android.content.SharedPreferences$Editor r0 = r0.putInt(r1, r2)     // Catch:{ all -> 0x024c }
            boolean r2 = r0.commit()     // Catch:{ all -> 0x024c }
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x024c }
            java.lang.String r0 = "CriticalEventConfigManager/updateConfigFromAbProp/clearing client config due to app upgrade "
            X.C18260x0.A1E(r0, r1, r2)     // Catch:{ all -> 0x024c }
        L_0x0064:
            X.1VX r2 = r8.A04     // Catch:{ all -> 0x024c }
            r1 = 414(0x19e, float:5.8E-43)
            X.2vE r0 = X.C58422vE.A02     // Catch:{ all -> 0x024c }
            java.lang.String r1 = r2.A0R(r0, r1)     // Catch:{ all -> 0x024c }
            android.content.SharedPreferences r0 = r8.A00     // Catch:{ all -> 0x024c }
            java.lang.String r15 = X.AnonymousClass0x9.A0v(r0, r5)     // Catch:{ all -> 0x024c }
            java.util.HashSet r4 = X.AnonymousClass002.A0K()     // Catch:{ all -> 0x024c }
            java.lang.String r14 = ";"
            java.lang.String[] r13 = r1.split(r14)     // Catch:{ all -> 0x024c }
            int r12 = r13.length     // Catch:{ all -> 0x024c }
            if (r12 <= 0) goto L_0x00bf
            long r0 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x024c }
            r9 = 604800000(0x240c8400, double:2.988109026E-315)
            long r0 = r0 + r9
            r10 = 0
        L_0x008a:
            r6 = r13[r10]     // Catch:{ all -> 0x024c }
            java.lang.String r2 = ":"
            java.lang.String[] r6 = r6.split(r2)     // Catch:{ all -> 0x024c }
            int r9 = r6.length     // Catch:{ all -> 0x024c }
            r2 = 2
            if (r9 != r2) goto L_0x00ba
            r9 = 0
            r2 = r6[r9]     // Catch:{ all -> 0x024c }
            boolean r2 = android.text.TextUtils.isEmpty(r2)     // Catch:{ all -> 0x024c }
            if (r2 != 0) goto L_0x00ba
            r2 = r6[r11]     // Catch:{ all -> 0x024c }
            boolean r2 = android.text.TextUtils.isEmpty(r2)     // Catch:{ all -> 0x024c }
            if (r2 != 0) goto L_0x00ba
            r9 = r6[r9]     // Catch:{ all -> 0x024c }
            r6 = r6[r11]     // Catch:{ all -> 0x024c }
            r2 = -1
            int r6 = X.C615531h.A01(r6, r2)     // Catch:{ all -> 0x024c }
            if (r6 < r11) goto L_0x00ba
            X.2ky r2 = new X.2ky     // Catch:{ all -> 0x024c }
            r2.<init>(r9, r6, r0)     // Catch:{ all -> 0x024c }
            r4.add(r2)     // Catch:{ all -> 0x024c }
        L_0x00ba:
            int r10 = r10 + 1
            if (r10 >= r12) goto L_0x00bf
            goto L_0x008a
        L_0x00bf:
            java.util.HashSet r2 = X.AnonymousClass002.A0K()     // Catch:{ all -> 0x024c }
            java.lang.String[] r13 = r15.split(r14)     // Catch:{ all -> 0x024c }
            int r12 = r13.length     // Catch:{ all -> 0x024c }
            if (r12 <= 0) goto L_0x0117
            r10 = 0
        L_0x00cb:
            r1 = r13[r10]     // Catch:{ all -> 0x024c }
            java.lang.String r0 = ":"
            java.lang.String[] r14 = r1.split(r0)     // Catch:{ all -> 0x024c }
            int r1 = r14.length     // Catch:{ all -> 0x024c }
            r0 = 3
            if (r1 != r0) goto L_0x0112
            r1 = 0
            r0 = r14[r1]     // Catch:{ all -> 0x024c }
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch:{ all -> 0x024c }
            if (r0 != 0) goto L_0x0112
            r0 = r14[r11]     // Catch:{ all -> 0x024c }
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch:{ all -> 0x024c }
            if (r0 != 0) goto L_0x0112
            r15 = 2
            r0 = r14[r15]     // Catch:{ all -> 0x024c }
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch:{ all -> 0x024c }
            if (r0 != 0) goto L_0x0112
            r9 = r14[r1]     // Catch:{ all -> 0x024c }
            r1 = r14[r11]     // Catch:{ all -> 0x024c }
            r0 = -1
            int r6 = X.C615531h.A01(r1, r0)     // Catch:{ all -> 0x024c }
            if (r6 < r11) goto L_0x0112
            r14 = r14[r15]     // Catch:{ all -> 0x024c }
            r0 = -1
            long r0 = X.C615531h.A04(r14, r0)     // Catch:{ all -> 0x024c }
            r15 = 1
            int r14 = (r0 > r15 ? 1 : (r0 == r15 ? 0 : -1))
            if (r14 < 0) goto L_0x0112
            X.2ky r14 = new X.2ky     // Catch:{ all -> 0x024c }
            r14.<init>(r9, r6, r0)     // Catch:{ all -> 0x024c }
            r2.add(r14)     // Catch:{ all -> 0x024c }
        L_0x0112:
            int r10 = r10 + 1
            if (r10 >= r12) goto L_0x0117
            goto L_0x00cb
        L_0x0117:
            java.util.HashSet r10 = X.AnonymousClass002.A0K()     // Catch:{ all -> 0x024c }
            r8.A02 = r10     // Catch:{ all -> 0x024c }
            java.util.HashSet r12 = X.AnonymousClass002.A0K()     // Catch:{ all -> 0x024c }
            java.util.Iterator r1 = r4.iterator()     // Catch:{ all -> 0x024c }
        L_0x0125:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x024c }
            if (r0 == 0) goto L_0x0137
            java.lang.Object r0 = r1.next()     // Catch:{ all -> 0x024c }
            X.2ky r0 = (X.C52152ky) r0     // Catch:{ all -> 0x024c }
            java.lang.String r0 = r0.A02     // Catch:{ all -> 0x024c }
            r12.add(r0)     // Catch:{ all -> 0x024c }
            goto L_0x0125
        L_0x0137:
            java.util.HashSet r9 = X.AnonymousClass002.A0K()     // Catch:{ all -> 0x024c }
            java.util.HashSet r6 = X.AnonymousClass002.A0K()     // Catch:{ all -> 0x024c }
            java.util.Iterator r11 = r2.iterator()     // Catch:{ all -> 0x024c }
        L_0x0143:
            boolean r0 = r11.hasNext()     // Catch:{ all -> 0x024c }
            if (r0 == 0) goto L_0x015e
            java.lang.Object r2 = r11.next()     // Catch:{ all -> 0x024c }
            X.2ky r2 = (X.C52152ky) r2     // Catch:{ all -> 0x024c }
            java.lang.String r1 = r2.A02     // Catch:{ all -> 0x024c }
            boolean r0 = r12.contains(r1)     // Catch:{ all -> 0x024c }
            if (r0 == 0) goto L_0x0143
            r6.add(r2)     // Catch:{ all -> 0x024c }
            r9.add(r1)     // Catch:{ all -> 0x024c }
            goto L_0x0143
        L_0x015e:
            java.util.Iterator r4 = r4.iterator()     // Catch:{ all -> 0x024c }
        L_0x0162:
            boolean r0 = r4.hasNext()     // Catch:{ all -> 0x024c }
            if (r0 == 0) goto L_0x017d
            java.lang.Object r2 = r4.next()     // Catch:{ all -> 0x024c }
            X.2ky r2 = (X.C52152ky) r2     // Catch:{ all -> 0x024c }
            java.lang.String r1 = r2.A02     // Catch:{ all -> 0x024c }
            boolean r0 = r9.contains(r1)     // Catch:{ all -> 0x024c }
            if (r0 != 0) goto L_0x0162
            r6.add(r2)     // Catch:{ all -> 0x024c }
            r9.add(r1)     // Catch:{ all -> 0x024c }
            goto L_0x0162
        L_0x017d:
            r10.addAll(r6)     // Catch:{ all -> 0x024c }
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x024c }
            java.util.Set r0 = r8.A02     // Catch:{ all -> 0x024c }
            java.util.Iterator r1 = r0.iterator()     // Catch:{ all -> 0x024c }
        L_0x018a:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x024c }
            if (r0 == 0) goto L_0x0198
            java.lang.Object r0 = r1.next()     // Catch:{ all -> 0x024c }
            r2.append(r0)     // Catch:{ all -> 0x024c }
            goto L_0x018a
        L_0x0198:
            android.content.SharedPreferences r0 = r8.A00     // Catch:{ all -> 0x024c }
            android.content.SharedPreferences$Editor r0 = r0.edit()     // Catch:{ all -> 0x024c }
            X.C18270x1.A0e(r0, r2, r5)     // Catch:{ all -> 0x024c }
        L_0x01a1:
            java.util.Set r0 = r8.A02     // Catch:{ all -> 0x024c }
            X.C626936e.A06(r0)     // Catch:{ all -> 0x024c }
            monitor-exit(r8)
            java.util.Iterator r9 = r0.iterator()
        L_0x01ab:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x024f
            java.lang.Object r6 = r9.next()
            X.2ky r6 = (X.C52152ky) r6
            java.lang.String r0 = r6.A02
            boolean r0 = r7.contains(r0)
            if (r0 == 0) goto L_0x01ab
            long r4 = java.lang.System.currentTimeMillis()
            long r1 = r6.A01
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x01ab
            java.util.Random r1 = r8.A06
            int r0 = r6.A00
            int r0 = r1.nextInt(r0)
            if (r0 != 0) goto L_0x024f
        L_0x01d3:
            java.lang.String r1 = "UNCAUGHT EXCEPTION"
            r0 = r17
            com.whatsapp.util.Log.e(r1, r0)
            X.C615631i.A01()
            java.lang.String r6 = r17.getMessage()
            monitor-enter(r8)
            java.util.Set r7 = r8.A01     // Catch:{ all -> 0x024c }
            if (r7 != 0) goto L_0x020e
            X.1VX r2 = r8.A04     // Catch:{ all -> 0x024c }
            r1 = 426(0x1aa, float:5.97E-43)
            X.2vE r0 = X.C58422vE.A02     // Catch:{ all -> 0x024c }
            java.lang.String r1 = r2.A0R(r0, r1)     // Catch:{ all -> 0x024c }
            java.util.HashSet r7 = X.AnonymousClass002.A0K()     // Catch:{ all -> 0x024c }
            java.lang.String r0 = ";"
            java.lang.String[] r5 = r1.split(r0)     // Catch:{ all -> 0x024c }
            int r4 = r5.length     // Catch:{ all -> 0x024c }
            r2 = 0
        L_0x01fc:
            if (r2 >= r4) goto L_0x020c
            r1 = r5[r2]     // Catch:{ all -> 0x024c }
            int r0 = r1.length()     // Catch:{ all -> 0x024c }
            if (r0 <= 0) goto L_0x0209
            r7.add(r1)     // Catch:{ all -> 0x024c }
        L_0x0209:
            int r2 = r2 + 1
            goto L_0x01fc
        L_0x020c:
            r8.A01 = r7     // Catch:{ all -> 0x024c }
        L_0x020e:
            X.C626936e.A06(r7)     // Catch:{ all -> 0x024c }
            monitor-exit(r8)
            java.util.Iterator r1 = r7.iterator()
        L_0x0216:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0227
            java.lang.String r0 = X.AnonymousClass001.A0m(r1)
            boolean r0 = r6.contains(r0)
            if (r0 == 0) goto L_0x0216
            return
        L_0x0227:
            X.4FS r2 = r3.A0D     // Catch:{ Exception -> 0x0236 }
            r1 = 39
            X.5rT r0 = new X.5rT     // Catch:{ Exception -> 0x0236 }
            r4 = r22
            r0.<init>(r3, r1, r4)     // Catch:{ Exception -> 0x0236 }
            r2.BkM(r0)     // Catch:{ Exception -> 0x0236 }
            return
        L_0x0236:
            r2 = move-exception
            java.lang.String r0 = "crashlogs/upload/failed"
            com.whatsapp.util.Log.e(r0, r2)
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "wa-worker-error-"
            java.lang.String r1 = X.AnonymousClass000.A0a(r0, r1, r2)
            r0 = 1
            r3.A0G(r0, r1)
            return
        L_0x024c:
            r0 = move-exception
            monitor-exit(r8)
            throw r0
        L_0x024f:
            java.lang.String r0 = "strict-mode-violation"
            boolean r0 = r0.equals(r7)
            if (r0 != 0) goto L_0x025f
            java.lang.String r1 = "CRITICAL EVENT"
            r0 = r17
            com.whatsapp.util.Log.e(r1, r0)
        L_0x025f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C22121Ep.A0E(X.3f3, java.lang.String, java.lang.String, java.util.Map, boolean):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00a9, code lost:
        if (r7 == null) goto L_0x00b3;
     */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x009f A[SYNTHETIC, Splitter:B:20:0x009f] */
    /* JADX WARNING: Removed duplicated region for block: B:35:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0F(X.C43572Sq r9) {
        /*
            r8 = this;
            X.2oU r0 = r8.A07
            java.io.File r1 = X.C54292oU.A02(r0)
            java.lang.String r0 = "Crashes"
            java.io.File r4 = X.AnonymousClass0x7.A0e(r1, r0)
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            long r2 = r9.A00
            r1.append(r2)
            java.lang.String r0 = ".crash"
            java.io.File r1 = X.C18270x1.A0A(r4, r0, r1)
            java.lang.String r5 = "app/CrashLogs/serializeCrashData: Could not close stream"
            r7 = 0
            r0 = 0
            java.io.FileOutputStream r6 = new java.io.FileOutputStream     // Catch:{ Exception -> 0x008f }
            r6.<init>(r1, r0)     // Catch:{ Exception -> 0x008f }
            org.json.JSONObject r7 = X.AnonymousClass0x9.A1G()     // Catch:{ Exception -> 0x008c, all -> 0x0089 }
            java.util.Map r0 = r9.A04     // Catch:{ Exception -> 0x008c, all -> 0x0089 }
            java.util.Iterator r4 = X.AnonymousClass000.A0q(r0)     // Catch:{ Exception -> 0x008c, all -> 0x0089 }
        L_0x002e:
            boolean r0 = r4.hasNext()     // Catch:{ Exception -> 0x008c, all -> 0x0089 }
            if (r0 == 0) goto L_0x0044
            java.util.Map$Entry r0 = X.AnonymousClass001.A0w(r4)     // Catch:{ Exception -> 0x008c, all -> 0x0089 }
            java.lang.String r1 = X.C18310x6.A0q(r0)     // Catch:{ Exception -> 0x008c, all -> 0x0089 }
            java.lang.Object r0 = r0.getValue()     // Catch:{ Exception -> 0x008c, all -> 0x0089 }
            r7.put(r1, r0)     // Catch:{ Exception -> 0x008c, all -> 0x0089 }
            goto L_0x002e
        L_0x0044:
            org.json.JSONObject r4 = X.AnonymousClass0x9.A1G()     // Catch:{ Exception -> 0x008c, all -> 0x0089 }
            java.lang.String r1 = "logFilePath"
            java.lang.String r0 = r9.A02     // Catch:{ Exception -> 0x008c, all -> 0x0089 }
            org.json.JSONObject r4 = r4.put(r1, r0)     // Catch:{ Exception -> 0x008c, all -> 0x0089 }
            java.lang.String r1 = "fromParam"
            java.lang.String r0 = r9.A01     // Catch:{ Exception -> 0x008c, all -> 0x0089 }
            org.json.JSONObject r4 = r4.put(r1, r0)     // Catch:{ Exception -> 0x008c, all -> 0x0089 }
            java.lang.String r1 = "forcedUpload"
            boolean r0 = r9.A06     // Catch:{ Exception -> 0x008c, all -> 0x0089 }
            org.json.JSONObject r4 = r4.put(r1, r0)     // Catch:{ Exception -> 0x008c, all -> 0x0089 }
            java.lang.String r1 = "detailedException"
            boolean r0 = r9.A05     // Catch:{ Exception -> 0x008c, all -> 0x0089 }
            org.json.JSONObject r4 = r4.put(r1, r0)     // Catch:{ Exception -> 0x008c, all -> 0x0089 }
            java.lang.String r1 = "tagsString"
            java.lang.String r0 = r9.A03     // Catch:{ Exception -> 0x008c, all -> 0x0089 }
            org.json.JSONObject r1 = r4.put(r1, r0)     // Catch:{ Exception -> 0x008c, all -> 0x0089 }
            java.lang.String r0 = "attachments"
            org.json.JSONObject r1 = r1.put(r0, r7)     // Catch:{ Exception -> 0x008c, all -> 0x0089 }
            java.lang.String r0 = "timeMillis"
            org.json.JSONObject r0 = r1.put(r0, r2)     // Catch:{ Exception -> 0x008c, all -> 0x0089 }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x008c, all -> 0x0089 }
            X.AnonymousClass0x2.A1L(r0, r6)     // Catch:{ Exception -> 0x008c, all -> 0x0089 }
            r6.close()     // Catch:{ IOException -> 0x00a3 }
            return
        L_0x0089:
            r1 = move-exception
            r7 = r6
            goto L_0x00ab
        L_0x008c:
            r4 = move-exception
            r7 = r6
            goto L_0x0090
        L_0x008f:
            r4 = move-exception
        L_0x0090:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x00a8 }
            java.lang.String r0 = "app/CrashLogs/serializeCrashData: could not serialize crash data at time: "
            java.lang.String r0 = X.AnonymousClass000.A0Z(r0, r1, r2)     // Catch:{ all -> 0x00a8 }
            com.whatsapp.util.Log.w(r0, r4)     // Catch:{ all -> 0x00a8 }
            if (r7 == 0) goto L_0x00a7
            r7.close()     // Catch:{ IOException -> 0x00a3 }
            return
        L_0x00a3:
            r0 = move-exception
            com.whatsapp.util.Log.w(r5, r0)
        L_0x00a7:
            return
        L_0x00a8:
            r1 = move-exception
            if (r7 == 0) goto L_0x00b3
        L_0x00ab:
            r7.close()     // Catch:{ IOException -> 0x00af }
            throw r1
        L_0x00af:
            r0 = move-exception
            com.whatsapp.util.Log.w(r5, r0)
        L_0x00b3:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C22121Ep.A0F(X.2Sq):void");
    }

    public final void A0G(boolean z, String str) {
        if (z) {
            AnonymousClass1YE r1 = new AnonymousClass1YE();
            r1.A02 = "crash-log-upload-failure";
            r1.A01 = str;
            this.A09.BhA(r1);
        }
    }

    public void BMd() {
        C69983Zk.A01(this.A01, this, 2);
    }

    public C22121Ep(C43482Sh r2, C56972sr r3, C56492s4 r4, C29441ip r5, C620633i r6, C54292oU r7, AnonymousClass33p r8, AnonymousClass4FV r9, C48092eK r10, C55132pq r11, AnonymousClass3FI r12, AnonymousClass4FS r13) {
        this.A07 = r7;
        this.A03 = r3;
        this.A0C = r12;
        this.A0D = r13;
        this.A04 = r4;
        this.A09 = r9;
        this.A06 = r6;
        this.A0B = r11;
        this.A08 = r8;
        this.A05 = r5;
        this.A02 = r2;
        this.A0A = r10;
    }

    public static String A02(HashSet hashSet) {
        StringBuilder A0o = AnonymousClass001.A0o();
        if (!hashSet.isEmpty()) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                A0o.append(AnonymousClass001.A0m(it));
                A0o.append(',');
            }
            A0o.setLength(A0o.length() - 1);
        }
        return A0o.toString();
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x004a A[Catch:{ IOException -> 0x0081 }] */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x007a A[Catch:{ IOException -> 0x0081 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.Map A0D(java.util.Map r9) {
        /*
            r8 = this;
            boolean r0 = r9.isEmpty()
            if (r0 == 0) goto L_0x0007
            return r9
        L_0x0007:
            java.util.HashMap r4 = X.AnonymousClass001.A0t()
            X.2oU r7 = r8.A07     // Catch:{ IOException -> 0x0081 }
            java.io.File r0 = X.C54292oU.A02(r7)     // Catch:{ IOException -> 0x0081 }
            java.lang.String r6 = "Crashes"
            java.io.File r1 = X.AnonymousClass0x7.A0e(r0, r6)     // Catch:{ IOException -> 0x0081 }
            java.lang.String r0 = X.C18280x3.A0Y()     // Catch:{ IOException -> 0x0081 }
            r3 = 24
            java.lang.String r0 = r0.substring(r3)     // Catch:{ IOException -> 0x0081 }
            java.io.File r5 = X.AnonymousClass002.A0A(r1, r0)     // Catch:{ IOException -> 0x0081 }
            r0 = 0
        L_0x0026:
            int r2 = r0 + 1
            r1 = 10
            if (r0 >= r1) goto L_0x0048
            boolean r0 = r5.mkdirs()     // Catch:{ IOException -> 0x0081 }
            if (r0 != 0) goto L_0x0048
            java.io.File r0 = X.C54292oU.A02(r7)     // Catch:{ IOException -> 0x0081 }
            java.io.File r1 = X.AnonymousClass0x7.A0e(r0, r6)     // Catch:{ IOException -> 0x0081 }
            java.lang.String r0 = X.C18280x3.A0Y()     // Catch:{ IOException -> 0x0081 }
            java.lang.String r0 = r0.substring(r3)     // Catch:{ IOException -> 0x0081 }
            java.io.File r5 = X.AnonymousClass002.A0A(r1, r0)     // Catch:{ IOException -> 0x0081 }
            r0 = r2
            goto L_0x0026
        L_0x0048:
            if (r2 > r1) goto L_0x007a
            java.util.Iterator r3 = X.AnonymousClass000.A0q(r9)     // Catch:{ IOException -> 0x0081 }
        L_0x004e:
            boolean r0 = r3.hasNext()     // Catch:{ IOException -> 0x0081 }
            if (r0 == 0) goto L_0x0081
            java.util.Map$Entry r0 = X.AnonymousClass001.A0w(r3)     // Catch:{ IOException -> 0x0081 }
            java.lang.Object r2 = r0.getKey()     // Catch:{ IOException -> 0x0081 }
            java.lang.String r0 = X.AnonymousClass0x9.A12(r0)     // Catch:{ IOException -> 0x0081 }
            java.io.File r1 = X.AnonymousClass002.A0B(r0)     // Catch:{ IOException -> 0x0081 }
            java.lang.String r0 = r1.getName()     // Catch:{ IOException -> 0x0081 }
            java.io.File r0 = X.AnonymousClass002.A0A(r5, r0)     // Catch:{ IOException -> 0x0081 }
            java.io.File r0 = A00(r1, r0)     // Catch:{ IOException -> 0x0081 }
            if (r0 == 0) goto L_0x004e
            java.lang.String r0 = r0.getAbsolutePath()     // Catch:{ IOException -> 0x0081 }
            r4.put(r2, r0)     // Catch:{ IOException -> 0x0081 }
            goto L_0x004e
        L_0x007a:
            java.lang.String r0 = "max retries reached while creating attachment temp directory"
            java.io.IOException r0 = X.AnonymousClass002.A0C(r0)     // Catch:{ IOException -> 0x0081 }
            throw r0     // Catch:{ IOException -> 0x0081 }
        L_0x0081:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C22121Ep.A0D(java.util.Map):java.util.Map");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x001b, code lost:
        if ("log_files_upload".equals(r8) != false) goto L_0x001d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x01b6 A[Catch:{ IOException -> 0x01ef }] */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x01be A[Catch:{ IOException -> 0x01ef }] */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x01de A[Catch:{ IOException -> 0x01ef }, RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x01df A[Catch:{ IOException -> 0x01ef }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A0H(java.lang.String r26, java.lang.String r27, java.lang.String r28, java.util.Map r29, boolean r30, boolean r31) {
        /*
            r25 = this;
            java.lang.String r6 = "report_source"
            r5 = 0
            r4 = r25
            r7 = r30
            java.lang.String r0 = "mp4_failure"
            r8 = r28
            boolean r0 = r0.equals(r8)     // Catch:{ IOException -> 0x01ef }
            r13 = 1
            if (r0 != 0) goto L_0x001d
            java.lang.String r0 = "log_files_upload"
            boolean r0 = r0.equals(r8)     // Catch:{ IOException -> 0x01ef }
            r1 = 1
            if (r0 == 0) goto L_0x001e
        L_0x001d:
            r1 = 0
        L_0x001e:
            java.lang.String r0 = "crashlog"
            r9 = r27
            java.lang.String r3 = r4.A08(r9, r0, r1)     // Catch:{ IOException -> 0x01ef }
            java.lang.String r0 = "no_upload"
            boolean r0 = r0.equals(r3)     // Catch:{ IOException -> 0x01ef }
            if (r0 == 0) goto L_0x0032
            if (r30 != 0) goto L_0x0032
            return r5
        L_0x0032:
            X.3Pa r2 = new X.3Pa     // Catch:{ IOException -> 0x01ef }
            r2.<init>(r4, r7)     // Catch:{ IOException -> 0x01ef }
            X.2pq r10 = r4.A0B     // Catch:{ IOException -> 0x01ef }
            java.lang.String r18 = "https://crashlogs.whatsapp.net/wa_clb_data"
            X.3FI r1 = r4.A0C     // Catch:{ IOException -> 0x01ef }
            java.lang.String r19 = r1.A00()     // Catch:{ IOException -> 0x01ef }
            X.2s4 r15 = r4.A04     // Catch:{ IOException -> 0x01ef }
            r0 = 0
            r21 = 6
            X.30q r14 = new X.30q     // Catch:{ IOException -> 0x01ef }
            r23 = r5
            r24 = r5
            r20 = r0
            r22 = r5
            r16 = r2
            r17 = r10
            r14.<init>(r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)     // Catch:{ IOException -> 0x01ef }
            java.lang.String r10 = "access_token"
            java.lang.String r2 = "1063127757113399|745146ffa34413f9dbb5469f5370b7af"
            r14.A08(r10, r2)     // Catch:{ IOException -> 0x01ef }
            java.lang.String r2 = "exception_and_logs"
            boolean r2 = r2.equals(r3)     // Catch:{ IOException -> 0x01ef }
            if (r2 == 0) goto L_0x0073
            java.io.File r11 = X.AnonymousClass002.A0B(r26)     // Catch:{ IOException -> 0x01ef }
            java.io.FileInputStream r10 = X.AnonymousClass0x9.A0g(r11)     // Catch:{ IOException -> 0x01ef }
            java.lang.String r2 = "file"
            X.C614230q.A01(r14, r11, r10, r2)     // Catch:{ IOException -> 0x01ef }
        L_0x0073:
            java.util.Iterator r12 = X.AnonymousClass000.A0q(r29)     // Catch:{ IOException -> 0x01ef }
        L_0x0077:
            boolean r2 = r12.hasNext()     // Catch:{ IOException -> 0x01ef }
            if (r2 == 0) goto L_0x0095
            java.util.Map$Entry r2 = X.AnonymousClass001.A0w(r12)     // Catch:{ IOException -> 0x01ef }
            java.lang.String r11 = X.C18310x6.A0q(r2)     // Catch:{ IOException -> 0x01ef }
            java.lang.String r2 = X.AnonymousClass0x9.A12(r2)     // Catch:{ IOException -> 0x01ef }
            java.io.File r10 = X.AnonymousClass002.A0B(r2)     // Catch:{ IOException -> 0x01ef }
            java.io.FileInputStream r2 = X.AnonymousClass0x9.A0g(r10)     // Catch:{ IOException -> 0x01ef }
            X.C614230q.A01(r14, r10, r2, r11)     // Catch:{ IOException -> 0x01ef }
            goto L_0x0077
        L_0x0095:
            java.lang.String r2 = "from_jid"
            r14.A09(r2, r9)     // Catch:{ IOException -> 0x01ef }
            boolean r2 = r8.isEmpty()     // Catch:{ IOException -> 0x01ef }
            if (r2 != 0) goto L_0x00a6
            java.lang.String r2 = "tags"
            r14.A09(r2, r8)     // Catch:{ IOException -> 0x01ef }
        L_0x00a6:
            java.lang.String r9 = "true"
            if (r30 == 0) goto L_0x00b0
            java.lang.String r2 = "forced"
            r14.A09(r2, r9)     // Catch:{ IOException -> 0x01ef }
        L_0x00b0:
            if (r31 == 0) goto L_0x00b7
            java.lang.String r2 = "detailed"
            r14.A09(r2, r9)     // Catch:{ IOException -> 0x01ef }
        L_0x00b7:
            X.33p r10 = r4.A08     // Catch:{ IOException -> 0x01ef }
            X.8qC r12 = r10.A01     // Catch:{ IOException -> 0x01ef }
            android.content.SharedPreferences r11 = X.C18300x5.A0B(r12)     // Catch:{ IOException -> 0x01ef }
            java.lang.String r2 = "voip_call_id"
            java.lang.String r8 = r11.getString(r2, r0)     // Catch:{ IOException -> 0x01ef }
            java.lang.String r2 = "session_id_for_voip_call_id"
            java.lang.String r2 = r11.getString(r2, r0)     // Catch:{ IOException -> 0x01ef }
            X.0PJ r2 = X.AnonymousClass0x9.A0G(r8, r2)     // Catch:{ IOException -> 0x01ef }
            java.lang.Object r11 = r2.A00     // Catch:{ IOException -> 0x01ef }
            java.lang.String r11 = (java.lang.String) r11     // Catch:{ IOException -> 0x01ef }
            java.lang.Object r8 = r2.A01     // Catch:{ IOException -> 0x01ef }
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ IOException -> 0x01ef }
            java.lang.String r2 = X.C106965aS.A08     // Catch:{ IOException -> 0x01ef }
            boolean r2 = android.text.TextUtils.equals(r8, r2)     // Catch:{ IOException -> 0x01ef }
            if (r2 != 0) goto L_0x00fa
            if (r11 == 0) goto L_0x00e8
            java.lang.String r2 = "call_id"
            r14.A09(r2, r11)     // Catch:{ IOException -> 0x01ef }
        L_0x00e8:
            android.content.SharedPreferences r8 = X.C18300x5.A0B(r12)     // Catch:{ IOException -> 0x01ef }
            java.lang.String r2 = "voip_call_ab_test_bucket"
            java.lang.String r8 = r8.getString(r2, r0)     // Catch:{ IOException -> 0x01ef }
            if (r8 == 0) goto L_0x00fa
            java.lang.String r2 = "abtest_bucket"
            r14.A09(r2, r8)     // Catch:{ IOException -> 0x01ef }
        L_0x00fa:
            boolean r2 = r10.A2B()     // Catch:{ IOException -> 0x01ef }
            if (r2 == 0) goto L_0x0105
            java.lang.String r2 = "md_opt_in"
            r14.A09(r2, r9)     // Catch:{ IOException -> 0x01ef }
        L_0x0105:
            java.lang.String r2 = "exception_only"
            boolean r2 = r2.equals(r3)     // Catch:{ IOException -> 0x01ef }
            if (r2 == 0) goto L_0x0112
            java.lang.String r2 = "exception_only_upload"
            r14.A09(r2, r9)     // Catch:{ IOException -> 0x01ef }
        L_0x0112:
            java.lang.String r8 = "build_id"
            r2 = 546598543(0x20946e8f, double:2.70055562E-315)
            java.lang.String r2 = java.lang.String.valueOf(r2)     // Catch:{ IOException -> 0x01ef }
            r14.A09(r8, r2)     // Catch:{ IOException -> 0x01ef }
            java.lang.String r2 = "fb.running_sapienz"
            java.lang.String r2 = X.C627236i.A03(r2)     // Catch:{ IOException -> 0x01ef }
            boolean r2 = r2.equals(r9)     // Catch:{ IOException -> 0x01ef }
            if (r2 == 0) goto L_0x01ae
            java.lang.String r2 = "fb.report_source"
            java.lang.String r2 = X.C627236i.A03(r2)     // Catch:{ IOException -> 0x01ef }
            r14.A09(r6, r2)     // Catch:{ IOException -> 0x01ef }
            X.2oU r2 = r4.A07     // Catch:{ IOException -> 0x01ef }
            android.content.Context r3 = r2.A00     // Catch:{ IOException -> 0x01ef }
            java.lang.String r2 = "errorreporting"
            java.io.File r3 = r3.getDir(r2, r5)     // Catch:{ IOException -> 0x01ef }
            boolean r2 = r3.exists()     // Catch:{ IOException -> 0x01ef }
            if (r2 == 0) goto L_0x01ae
            java.io.File r3 = X.AnonymousClass002.A0A(r3, r6)     // Catch:{ IOException -> 0x01ef }
            boolean r2 = r3.exists()     // Catch:{ IOException -> 0x01ef }
            if (r2 == 0) goto L_0x01ae
            java.lang.String r2 = "report_source_ref.txt"
            java.io.File r10 = X.AnonymousClass002.A0A(r3, r2)     // Catch:{ IOException -> 0x01ef }
            boolean r2 = r10.exists()     // Catch:{ IOException -> 0x01ef }
            if (r2 == 0) goto L_0x01ae
            long r8 = r10.length()     // Catch:{ IOException -> 0x01a8, NumberFormatException -> 0x01a4 }
            r2 = 1024(0x400, double:5.06E-321)
            long r8 = r8 / r2
            java.lang.String r2 = java.lang.String.valueOf(r8)     // Catch:{ IOException -> 0x01a8, NumberFormatException -> 0x01a4 }
            int r6 = java.lang.Integer.parseInt(r2)     // Catch:{ IOException -> 0x01a8, NumberFormatException -> 0x01a4 }
            r2 = 100
            if (r6 <= r2) goto L_0x017f
            java.lang.StringBuilder r3 = X.AnonymousClass001.A0o()     // Catch:{ IOException -> 0x01a8, NumberFormatException -> 0x01a4 }
            java.lang.String r2 = "FileUtils/readFile/File size is too big to read into string "
            r3.append(r2)     // Catch:{ IOException -> 0x01a8, NumberFormatException -> 0x01a4 }
            r3.append(r6)     // Catch:{ IOException -> 0x01a8, NumberFormatException -> 0x01a4 }
            java.lang.String r2 = "KB. Max allowed is 100KB"
            X.C18260x0.A1K(r3, r2)     // Catch:{ IOException -> 0x01a8, NumberFormatException -> 0x01a4 }
            goto L_0x01ae
        L_0x017f:
            byte[] r2 = X.C382926u.A00(r10)     // Catch:{ IOException -> 0x01a8, NumberFormatException -> 0x01a4 }
            java.lang.String r6 = new java.lang.String     // Catch:{ IOException -> 0x01a8, NumberFormatException -> 0x01a4 }
            r6.<init>(r2)     // Catch:{ IOException -> 0x01a8, NumberFormatException -> 0x01a4 }
            boolean r2 = r6.isEmpty()     // Catch:{ IOException -> 0x01ef }
            if (r2 != 0) goto L_0x01ae
            java.lang.String r2 = "report_source_ref="
            boolean r2 = r6.startsWith(r2)     // Catch:{ IOException -> 0x01ef }
            java.lang.String r3 = "report_source_ref"
            if (r2 == 0) goto L_0x01a0
            r2 = 18
            java.lang.String r6 = r6.substring(r2)     // Catch:{ IOException -> 0x01ef }
        L_0x01a0:
            r14.A09(r3, r6)     // Catch:{ IOException -> 0x01ef }
            goto L_0x01ae
        L_0x01a4:
            r3 = move-exception
            java.lang.String r2 = "FileUtils/readFile/error in getting file size"
            goto L_0x01ab
        L_0x01a8:
            r3 = move-exception
            java.lang.String r2 = "FileUtils/readFile/ioerror"
        L_0x01ab:
            com.whatsapp.util.Log.e(r2, r3)     // Catch:{ IOException -> 0x01ef }
        L_0x01ae:
            X.33i r2 = r4.A06     // Catch:{ IOException -> 0x01ef }
            android.app.ActivityManager r2 = r2.A06()     // Catch:{ IOException -> 0x01ef }
            if (r2 != 0) goto L_0x01be
            java.lang.String r2 = "memorydumpuploadservice/get-upload-params am=null"
            com.whatsapp.util.Log.w((java.lang.String) r2)     // Catch:{ IOException -> 0x01ef }
            r6 = 16
            goto L_0x01c2
        L_0x01be:
            int r6 = r2.getMemoryClass()     // Catch:{ IOException -> 0x01ef }
        L_0x01c2:
            X.2oU r3 = r4.A07     // Catch:{ IOException -> 0x01ef }
            java.lang.String r2 = X.AnonymousClass5V3.A00()     // Catch:{ IOException -> 0x01ef }
            r1.A03(r3, r2, r5)     // Catch:{ IOException -> 0x01ef }
            java.lang.String r2 = "android_hprof_extras"
            java.lang.String r1 = A01(r0, r6)     // Catch:{ IOException -> 0x01ef }
            r14.A09(r2, r1)     // Catch:{ IOException -> 0x01ef }
            int r2 = r14.A03(r0)     // Catch:{ IOException -> 0x01ef }
            if (r2 <= 0) goto L_0x01df
            r0 = 400(0x190, float:5.6E-43)
            if (r2 >= r0) goto L_0x01df
            return r13
        L_0x01df:
            r13 = 0
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ IOException -> 0x01ef }
            java.lang.String r0 = "upload-response-"
            java.lang.String r0 = X.AnonymousClass000.A0Y(r0, r1, r2)     // Catch:{ IOException -> 0x01ef }
            r4.A0G(r7, r0)     // Catch:{ IOException -> 0x01ef }
            return r13
        L_0x01ef:
            r1 = move-exception
            java.lang.String r0 = "app/CrashLogs/uploadCrashData: could not upload crash data"
            com.whatsapp.util.Log.w(r0, r1)
            java.lang.String r0 = "io-error"
            r4.A0G(r7, r0)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C22121Ep.A0H(java.lang.String, java.lang.String, java.lang.String, java.util.Map, boolean, boolean):boolean");
    }

    public String BDW() {
        return "CrashLogsImpl";
    }

    public /* synthetic */ void BMe() {
    }
}
