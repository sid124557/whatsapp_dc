package X;

import android.net.TrafficStats;
import java.io.InputStream;
import java.util.zip.GZIPInputStream;

/* renamed from: X.3Pj  reason: invalid class name and case insensitive filesystem */
public class C67463Pj implements AnonymousClass4ES {
    public final C56492s4 A00;
    public final C57162tC A01;
    public final C67523Pp A02;
    public final C58632vZ A03;
    public final AnonymousClass33K A04;
    public final C55132pq A05;

    /* JADX WARNING: Removed duplicated region for block: B:94:0x014c A[ADDED_TO_REGION, Catch:{ all -> 0x0161, all -> 0x016b }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean BF3(java.io.InputStream r14, java.lang.Integer r15, long r16) {
        /*
            r13 = this;
            r4 = 0
            android.util.JsonReader r12 = X.C18300x5.A0D(r14)     // Catch:{ IOException -> 0x0175 }
            r12.beginObject()     // Catch:{ all -> 0x016b }
        L_0x0008:
            r11 = 1
        L_0x0009:
            boolean r0 = r12.hasNext()     // Catch:{ all -> 0x016b }
            if (r0 == 0) goto L_0x0164
            java.lang.String r2 = r12.nextName()     // Catch:{ all -> 0x016b }
            int r1 = r2.hashCode()     // Catch:{ all -> 0x016b }
            r0 = -265173948(0xfffffffff031c444, float:-2.2006447E29)
            if (r1 == r0) goto L_0x00d6
            r0 = 1518327835(0x5a7fd81b, float:1.80034324E16)
            if (r1 != r0) goto L_0x0153
            java.lang.String r0 = "languages"
            boolean r0 = r2.equals(r0)     // Catch:{ all -> 0x016b }
            if (r0 == 0) goto L_0x0153
            X.3Pp r3 = r13.A02     // Catch:{ all -> 0x016b }
            monitor-enter(r3)     // Catch:{ all -> 0x016b }
            X.1R8 r0 = r3.A03     // Catch:{ IOException | IllegalStateException -> 0x00ca }
            X.4Fq r10 = r0.A0C()     // Catch:{ IOException | IllegalStateException -> 0x00ca }
            X.3Yo r9 = r10.Axl()     // Catch:{ all -> 0x00c0 }
            r0 = r10
            X.3H0 r0 = (X.AnonymousClass3H0) r0     // Catch:{ all -> 0x00b6 }
            X.2sg r8 = r0.A03     // Catch:{ all -> 0x00b6 }
            X.C67523Pp.A00(r8)     // Catch:{ all -> 0x00b6 }
            r12.beginObject()     // Catch:{ all -> 0x00b6 }
        L_0x0041:
            boolean r0 = r12.hasNext()     // Catch:{ all -> 0x00b6 }
            if (r0 == 0) goto L_0x00a7
            r12.nextName()     // Catch:{ all -> 0x00b6 }
            r12.beginObject()     // Catch:{ all -> 0x00b6 }
        L_0x004d:
            boolean r0 = r12.hasNext()     // Catch:{ all -> 0x00b6 }
            if (r0 == 0) goto L_0x00a3
            java.lang.String r7 = r12.nextName()     // Catch:{ all -> 0x00b6 }
            java.util.HashSet r1 = X.AnonymousClass002.A0K()     // Catch:{ all -> 0x00b6 }
            r12.beginArray()     // Catch:{ all -> 0x00b6 }
        L_0x005e:
            boolean r0 = r12.hasNext()     // Catch:{ all -> 0x00b6 }
            if (r0 == 0) goto L_0x0070
            java.lang.String r0 = r12.nextString()     // Catch:{ all -> 0x00b6 }
            java.lang.String r0 = X.C107575bX.A07(r0)     // Catch:{ all -> 0x00b6 }
            r1.add(r0)     // Catch:{ all -> 0x00b6 }
            goto L_0x005e
        L_0x0070:
            r12.endArray()     // Catch:{ all -> 0x00b6 }
            java.util.Iterator r6 = r1.iterator()     // Catch:{ all -> 0x00b6 }
        L_0x0077:
            boolean r0 = r6.hasNext()     // Catch:{ all -> 0x00b6 }
            if (r0 == 0) goto L_0x004d
            java.lang.String r5 = X.AnonymousClass001.A0m(r6)     // Catch:{ all -> 0x00b6 }
            android.content.ContentValues r2 = X.AnonymousClass0x9.A06()     // Catch:{ all -> 0x00b6 }
            java.lang.Integer r1 = X.AnonymousClass001.A0f()     // Catch:{ all -> 0x00b6 }
            java.lang.String r0 = "type"
            r2.put(r0, r1)     // Catch:{ all -> 0x00b6 }
            java.lang.String r0 = "symbol"
            r2.put(r0, r7)     // Catch:{ all -> 0x00b6 }
            java.lang.String r0 = "tag"
            r2.put(r0, r5)     // Catch:{ all -> 0x00b6 }
            java.lang.String r1 = "insertEmojiTags/REPLACE_EMOJI_SEARCH_TAG"
            java.lang.String r0 = "emoji_search_tag"
            r8.A0A(r0, r1, r2)     // Catch:{ all -> 0x00b6 }
            goto L_0x0077
        L_0x00a3:
            r12.endObject()     // Catch:{ all -> 0x00b6 }
            goto L_0x0041
        L_0x00a7:
            r12.endObject()     // Catch:{ all -> 0x00b6 }
            r9.A00()     // Catch:{ all -> 0x00b6 }
            r9.close()     // Catch:{ all -> 0x00c0 }
            r10.close()     // Catch:{ IOException | IllegalStateException -> 0x00ca }
            monitor-exit(r3)     // Catch:{ all -> 0x016b }
            goto L_0x0149
        L_0x00b6:
            r1 = move-exception
            r9.close()     // Catch:{ all -> 0x00bb }
            goto L_0x00bf
        L_0x00bb:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x00c0 }
        L_0x00bf:
            throw r1     // Catch:{ all -> 0x00c0 }
        L_0x00c0:
            r1 = move-exception
            r10.close()     // Catch:{ all -> 0x00c5 }
            goto L_0x00c9
        L_0x00c5:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ IOException | IllegalStateException -> 0x00ca }
        L_0x00c9:
            throw r1     // Catch:{ IOException | IllegalStateException -> 0x00ca }
        L_0x00ca:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0161 }
            java.lang.String r0 = "emojidictionarystore/populatedb/failed "
            X.C18260x0.A1Q(r1, r0, r2)     // Catch:{ all -> 0x0161 }
            monitor-exit(r3)     // Catch:{ all -> 0x016b }
            goto L_0x0147
        L_0x00d6:
            java.lang.String r0 = "fb-top-50"
            boolean r0 = r2.equals(r0)     // Catch:{ all -> 0x016b }
            if (r0 == 0) goto L_0x0153
            X.2vZ r5 = r13.A03     // Catch:{ all -> 0x016b }
            monitor-enter(r5)     // Catch:{ all -> 0x016b }
            java.util.ArrayList r1 = X.AnonymousClass001.A0s()     // Catch:{ IOException -> 0x013f, IllegalStateException -> 0x012e }
            r12.beginArray()     // Catch:{ IOException -> 0x013f, IllegalStateException -> 0x012e }
        L_0x00e8:
            boolean r0 = r12.hasNext()     // Catch:{ IOException -> 0x013f, IllegalStateException -> 0x012e }
            if (r0 == 0) goto L_0x00f6
            java.lang.String r0 = r12.nextString()     // Catch:{ IOException -> 0x013f, IllegalStateException -> 0x012e }
            r1.add(r0)     // Catch:{ IOException -> 0x013f, IllegalStateException -> 0x012e }
            goto L_0x00e8
        L_0x00f6:
            r12.endArray()     // Catch:{ IOException -> 0x013f, IllegalStateException -> 0x012e }
            org.json.JSONArray r2 = X.AnonymousClass0x9.A1F()     // Catch:{ IOException -> 0x013f, IllegalStateException -> 0x012e }
            java.util.ArrayList r3 = X.AnonymousClass001.A0s()     // Catch:{ IOException -> 0x013f, IllegalStateException -> 0x012e }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ IOException -> 0x013f, IllegalStateException -> 0x012e }
        L_0x0105:
            boolean r0 = r1.hasNext()     // Catch:{ IOException -> 0x013f, IllegalStateException -> 0x012e }
            if (r0 == 0) goto L_0x011a
            java.lang.String r0 = X.AnonymousClass001.A0m(r1)     // Catch:{ IOException -> 0x013f, IllegalStateException -> 0x012e }
            r2.put(r0)     // Catch:{ IOException -> 0x013f, IllegalStateException -> 0x012e }
            X.5Zv r0 = X.C106655Zv.A00(r0)     // Catch:{ IOException -> 0x013f, IllegalStateException -> 0x012e }
            r3.add(r0)     // Catch:{ IOException -> 0x013f, IllegalStateException -> 0x012e }
            goto L_0x0105
        L_0x011a:
            X.33p r0 = r5.A02     // Catch:{ IOException -> 0x013f, IllegalStateException -> 0x012e }
            java.lang.String r2 = r2.toString()     // Catch:{ IOException -> 0x013f, IllegalStateException -> 0x012e }
            android.content.SharedPreferences$Editor r1 = X.C18270x1.A03(r0)     // Catch:{ IOException -> 0x013f, IllegalStateException -> 0x012e }
            java.lang.String r0 = "top_emojis"
            X.C18270x1.A0j(r1, r0, r2)     // Catch:{ IOException -> 0x013f, IllegalStateException -> 0x012e }
            r5.A00 = r3     // Catch:{ IOException -> 0x013f, IllegalStateException -> 0x012e }
            monitor-exit(r5)     // Catch:{ all -> 0x016b }
            goto L_0x0149
        L_0x012e:
            r3 = move-exception
            X.2qk r2 = r5.A01     // Catch:{ all -> 0x015e }
            java.lang.String r1 = "topemojis/populate error"
            r0 = 0
            r2.A0A(r1, r4, r0)     // Catch:{ all -> 0x015e }
            java.lang.String r0 = "topemojisstore/populate-top-emojis/failed"
            com.whatsapp.util.Log.e(r0, r3)     // Catch:{ all -> 0x015e }
            goto L_0x0146
        L_0x013f:
            r1 = move-exception
            java.lang.String r0 = "topemojisstore/populate-top-emojis/failed"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x015e }
        L_0x0146:
            monitor-exit(r5)     // Catch:{ all -> 0x016b }
        L_0x0147:
            r0 = 0
            goto L_0x014a
        L_0x0149:
            r0 = 1
        L_0x014a:
            if (r11 == 0) goto L_0x0150
            if (r0 == 0) goto L_0x0150
            goto L_0x0008
        L_0x0150:
            r11 = 0
            goto L_0x0009
        L_0x0153:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x016b }
            java.lang.String r0 = "emojidictionarynetworkclient/handle-network-response/unhandled field: "
            X.C18260x0.A0r(r0, r2, r1)     // Catch:{ all -> 0x016b }
            goto L_0x0009
        L_0x015e:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x016b }
            goto L_0x0163
        L_0x0161:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x016b }
        L_0x0163:
            throw r0     // Catch:{ all -> 0x016b }
        L_0x0164:
            r12.endObject()     // Catch:{ all -> 0x016b }
            r12.close()     // Catch:{ IOException -> 0x0175 }
            return r11
        L_0x016b:
            r1 = move-exception
            r12.close()     // Catch:{ all -> 0x0170 }
            goto L_0x0174
        L_0x0170:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ IOException -> 0x0175 }
        L_0x0174:
            throw r1     // Catch:{ IOException -> 0x0175 }
        L_0x0175:
            r1 = move-exception
            java.lang.String r0 = "emojidictionarynetworkclient/handle-network-response/failed"
            com.whatsapp.util.Log.e(r0, r1)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C67463Pj.BF3(java.io.InputStream, java.lang.Integer, long):boolean");
    }

    public InputStream B8P(AnonymousClass4GL r4, Integer num) {
        InputStream A0b = C18310x6.A0b(this.A00, r4, C18290x4.A0Z(), 12);
        if ("gzip".equals(((AnonymousClass3PZ) r4).A01.getHeaderField("Content-Encoding"))) {
            return new GZIPInputStream(A0b);
        }
        return A0b;
    }

    public C67463Pj(C56492s4 r1, C57162tC r2, C67523Pp r3, C58632vZ r4, AnonymousClass33K r5, C55132pq r6) {
        this.A00 = r1;
        this.A03 = r4;
        this.A05 = r6;
        this.A04 = r5;
        this.A02 = r3;
        this.A01 = r2;
    }

    public AnonymousClass4GL AzU(String str, String str2) {
        C18260x0.A0s("emojidictionarynetworkclient/connect/language=", str2, AnonymousClass001.A0o());
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("https://static.whatsapp.net/emoji?lgs=");
        A0o.append(str2);
        String A0X = AnonymousClass000.A0X("&top=1", A0o);
        try {
            TrafficStats.setThreadStatsTag(8);
            return this.A04.A01(this.A05, A0X, str);
        } finally {
            TrafficStats.clearThreadStatsTag();
        }
    }
}
