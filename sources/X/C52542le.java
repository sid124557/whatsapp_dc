package X;

import android.util.JsonWriter;
import com.whatsapp.util.Log;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.2le  reason: invalid class name and case insensitive filesystem */
public class C52542le {
    public final C55682qk A00;
    public final C56612sH A01;
    public final C54292oU A02;

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x00a5, code lost:
        if (r1 < 0) goto L_0x00a7;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized java.util.ArrayList A00() {
        /*
            r13 = this;
            monitor-enter(r13)
            X.C626936e.A00()     // Catch:{ all -> 0x00dd }
            X.2oU r0 = r13.A02     // Catch:{ all -> 0x00dd }
            android.content.Context r4 = r0.A00     // Catch:{ all -> 0x00dd }
            java.io.File r0 = r4.getFilesDir()     // Catch:{ all -> 0x00dd }
            java.lang.String r3 = "fbips"
            java.io.File r0 = X.AnonymousClass002.A0A(r0, r3)     // Catch:{ all -> 0x00dd }
            boolean r0 = r0.canRead()     // Catch:{ all -> 0x00dd }
            if (r0 == 0) goto L_0x00d7
            java.io.File r0 = r4.getFilesDir()     // Catch:{ IOException | JSONException -> 0x00c5 }
            java.io.File r0 = X.AnonymousClass002.A0A(r0, r3)     // Catch:{ IOException | JSONException -> 0x00c5 }
            byte[] r1 = X.C382926u.A00(r0)     // Catch:{ IOException | JSONException -> 0x00c5 }
            java.util.ArrayList r2 = X.AnonymousClass001.A0s()     // Catch:{ IOException | JSONException -> 0x00c5 }
            java.lang.String r0 = new java.lang.String     // Catch:{ IOException | JSONException -> 0x00c5 }
            r0.<init>(r1)     // Catch:{ IOException | JSONException -> 0x00c5 }
            org.json.JSONObject r0 = X.AnonymousClass0x9.A1H(r0)     // Catch:{ IOException | JSONException -> 0x00c5 }
            org.json.JSONArray r5 = r0.getJSONArray(r3)     // Catch:{ IOException | JSONException -> 0x00c5 }
            r1 = 0
        L_0x0036:
            int r0 = r5.length()     // Catch:{ IOException | JSONException -> 0x00c5 }
            if (r1 >= r0) goto L_0x0080
            org.json.JSONObject r6 = r5.getJSONObject(r1)     // Catch:{ IOException | JSONException -> 0x00c5 }
            java.lang.String r0 = "exp"
            long r7 = r6.getLong(r0)     // Catch:{ IOException | JSONException -> 0x00c5 }
            java.lang.Long r7 = java.lang.Long.valueOf(r7)     // Catch:{ IOException | JSONException -> 0x00c5 }
            java.lang.String r0 = "ip"
            java.lang.String r0 = r6.getString(r0)     // Catch:{ IOException | JSONException -> 0x00c5 }
            java.net.InetAddress r9 = java.net.InetAddress.getByName(r0)     // Catch:{ IOException | JSONException -> 0x00c5 }
            java.lang.String r0 = "port"
            int r0 = r6.getInt(r0)     // Catch:{ IOException | JSONException -> 0x00c5 }
            short r0 = (short) r0     // Catch:{ IOException | JSONException -> 0x00c5 }
            java.lang.Short r8 = java.lang.Short.valueOf(r0)     // Catch:{ IOException | JSONException -> 0x00c5 }
            java.lang.String r0 = "secure"
            boolean r11 = r6.getBoolean(r0)     // Catch:{ IOException | JSONException -> 0x00c5 }
            java.lang.String r0 = "override"
            boolean r12 = r6.getBoolean(r0)     // Catch:{ IOException | JSONException -> 0x00c5 }
            java.lang.String r0 = "resolver"
            int r10 = r6.getInt(r0)     // Catch:{ IOException | JSONException -> 0x00c5 }
            X.2n7 r6 = new X.2n7     // Catch:{ IOException | JSONException -> 0x00c5 }
            r6.<init>(r7, r8, r9, r10, r11, r12)     // Catch:{ IOException | JSONException -> 0x00c5 }
            r2.add(r6)     // Catch:{ IOException | JSONException -> 0x00c5 }
            int r1 = r1 + 1
            goto L_0x0036
        L_0x0080:
            java.util.HashSet r10 = X.AnonymousClass002.A0K()     // Catch:{ IOException | JSONException -> 0x00c5 }
            java.util.Iterator r11 = r2.iterator()     // Catch:{ IOException | JSONException -> 0x00c5 }
        L_0x0088:
            boolean r0 = r11.hasNext()     // Catch:{ IOException | JSONException -> 0x00c5 }
            if (r0 == 0) goto L_0x00ae
            java.lang.Object r9 = r11.next()     // Catch:{ IOException | JSONException -> 0x00c5 }
            X.2n7 r9 = (X.C53452n7) r9     // Catch:{ IOException | JSONException -> 0x00c5 }
            X.2sH r1 = r13.A01     // Catch:{ IOException | JSONException -> 0x00c5 }
            java.lang.Long r0 = r9.A01     // Catch:{ IOException | JSONException -> 0x00c5 }
            if (r0 == 0) goto L_0x00a7
            long r7 = r1.A0H()     // Catch:{ IOException | JSONException -> 0x00c5 }
            long r5 = r0.longValue()     // Catch:{ IOException | JSONException -> 0x00c5 }
            int r1 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            r0 = 1
            if (r1 >= 0) goto L_0x00a8
        L_0x00a7:
            r0 = 0
        L_0x00a8:
            if (r0 == 0) goto L_0x0088
            r10.add(r9)     // Catch:{ IOException | JSONException -> 0x00c5 }
            goto L_0x0088
        L_0x00ae:
            boolean r0 = r10.isEmpty()     // Catch:{ IOException | JSONException -> 0x00c5 }
            if (r0 != 0) goto L_0x00db
            r2.removeAll(r10)     // Catch:{ IOException | JSONException -> 0x00c5 }
            boolean r0 = r2.isEmpty()     // Catch:{ IOException | JSONException -> 0x00c5 }
            if (r0 == 0) goto L_0x00c1
            r4.deleteFile(r3)     // Catch:{ IOException | JSONException -> 0x00c5 }
            goto L_0x00db
        L_0x00c1:
            r13.A01(r2)     // Catch:{ IOException | JSONException -> 0x00c5 }
            goto L_0x00db
        L_0x00c5:
            r1 = move-exception
            java.lang.String r0 = "FallbackManager/getFallbackIps"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x00dd }
            X.2qk r3 = r13.A00     // Catch:{ all -> 0x00dd }
            java.lang.String r2 = "fallback-manager/load-error"
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x00dd }
            r0 = 0
            r3.A0A(r2, r0, r1)     // Catch:{ all -> 0x00dd }
        L_0x00d7:
            java.util.ArrayList r2 = X.AnonymousClass001.A0s()     // Catch:{ all -> 0x00dd }
        L_0x00db:
            monitor-exit(r13)
            return r2
        L_0x00dd:
            r0 = move-exception
            monitor-exit(r13)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C52542le.A00():java.util.ArrayList");
    }

    public final void A01(List list) {
        JsonWriter jsonWriter = new JsonWriter(new BufferedWriter(new FileWriter(AnonymousClass002.A0A(C54292oU.A03(this.A02), "fbips"))));
        try {
            jsonWriter.beginObject();
            jsonWriter.name("fbips");
            jsonWriter.beginArray();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C53452n7 r4 = (C53452n7) it.next();
                jsonWriter.beginObject();
                jsonWriter.name("ip").value(r4.A03.getHostAddress());
                jsonWriter.name("port").value(r4.A02);
                jsonWriter.name("exp").value(r4.A01);
                jsonWriter.name("secure").value(r4.A05);
                jsonWriter.name("override").value(r4.A04);
                jsonWriter.name("resolver").value((long) r4.A00);
                jsonWriter.endObject();
            }
            jsonWriter.endArray();
            jsonWriter.endObject();
            jsonWriter.close();
        } catch (Throwable th) {
            th.addSuppressed(th);
            throw th;
        }
    }

    public synchronized void A02(String[] strArr) {
        synchronized (this) {
            C626936e.A00();
            if (r6 != 1 || !strArr[0].equalsIgnoreCase("CLEAR")) {
                ArrayList A0s = AnonymousClass001.A0s();
                for (String str : strArr) {
                    if (str != null) {
                        String[] split = str.split("\\|", 6);
                        if (split.length != 6) {
                            C18260x0.A0r("DnsCacheEntry/parseFallbackIpString/", str, AnonymousClass001.A0o());
                        } else {
                            try {
                                InetAddress byName = InetAddress.getByName(split[0]);
                                short parseShort = Short.parseShort(split[1]);
                                long parseLong = Long.parseLong(split[2]);
                                C53452n7 r13 = new C53452n7(Long.valueOf((Long.parseLong(split[3]) + parseLong) * 1000), Short.valueOf(parseShort), byName, 4, Boolean.parseBoolean(split[4]), Boolean.parseBoolean(split[5]));
                                C18260x0.A1P(AnonymousClass001.A0o(), "FallbackManager/getDnsCacheEntries/good/", r13);
                                A0s.add(r13);
                            } catch (NumberFormatException | UnknownHostException e) {
                                C18260x0.A0u("DnsCacheEntry/parseFallbackIpString/", str, AnonymousClass001.A0o(), e);
                            }
                        }
                    }
                    C18260x0.A0q("FallbackManager/getDnsCacheEntries/bad/", str, AnonymousClass001.A0o());
                }
                try {
                    A01(A0s);
                } catch (IOException e2) {
                    Log.e("FallbackManager/saveFallbacks", e2);
                    this.A00.A0A("fallback-manager/save-error", false, e2.toString());
                }
            } else {
                this.A02.A00.deleteFile("fbips");
            }
        }
        return;
    }

    public C52542le(C55682qk r1, C56612sH r2, C54292oU r3) {
        this.A01 = r2;
        this.A02 = r3;
        this.A00 = r1;
    }
}
