package X;

import android.net.UrlQuerySanitizer;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.net.URL;
import java.util.Set;

/* renamed from: X.2oE  reason: invalid class name and case insensitive filesystem */
public class C54132oE {
    public final C55682qk A00;
    public final C69263Wi A01;
    public final C56972sr A02;
    public final C56492s4 A03;
    public final C56612sH A04;
    public final C54292oU A05;
    public final AnonymousClass33p A06;
    public final C620733j A07;
    public final AnonymousClass1VX A08;
    public final AnonymousClass4FV A09;
    public final AnonymousClass33K A0A;
    public final C49912hI A0B;
    public final C55132pq A0C;
    public final C52682ls A0D;
    public final AnonymousClass3FI A0E;

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x001e, code lost:
        if (r4.A00.A0F() == false) goto L_0x0020;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C50612iT A00(X.C84644Dd r8, java.lang.String r9) {
        /*
            r7 = this;
            X.2ls r4 = r7.A0D
            X.33p r0 = r4.A02
            android.content.SharedPreferences r1 = X.AnonymousClass0x2.A0F(r0)
            java.lang.String r0 = "sticker_store_backoff_time"
            long r5 = X.AnonymousClass0x2.A0B(r1, r0)
            long r1 = java.lang.System.currentTimeMillis()
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x0020
            X.1ip r0 = r4.A00
            boolean r1 = r0.A0F()
            r0 = 1
            if (r1 != 0) goto L_0x0021
        L_0x0020:
            r0 = 0
        L_0x0021:
            r3 = 0
            if (r0 != 0) goto L_0x002a
            java.lang.String r0 = "StickerPackNetworkProvider/getStickerPackById skipped due to backoff time"
            com.whatsapp.util.Log.i((java.lang.String) r0)
        L_0x0029:
            return r3
        L_0x002a:
            java.lang.StringBuilder r5 = X.AnonymousClass001.A0o()     // Catch:{ 3f4 -> 0x006e }
            java.lang.String r0 = "https://static.whatsapp.net/sticker?id="
            r5.append(r0)     // Catch:{ 3f4 -> 0x006e }
            r5.append(r9)     // Catch:{ 3f4 -> 0x006e }
            java.lang.String r0 = "&lg="
            r5.append(r0)     // Catch:{ 3f4 -> 0x006e }
            X.33j r0 = r7.A07     // Catch:{ 3f4 -> 0x006e }
            java.util.Locale r0 = X.C620733j.A02(r0)     // Catch:{ 3f4 -> 0x006e }
            java.lang.String r0 = r0.toLanguageTag()     // Catch:{ 3f4 -> 0x006e }
            r5.append(r0)     // Catch:{ 3f4 -> 0x006e }
            X.1VX r2 = r7.A08     // Catch:{ 3f4 -> 0x006e }
            r1 = 6785(0x1a81, float:9.508E-42)
            X.2vE r0 = X.C58422vE.A02     // Catch:{ 3f4 -> 0x006e }
            java.lang.String r0 = r2.A0R(r0, r1)     // Catch:{ 3f4 -> 0x006e }
            java.lang.String r1 = X.AnonymousClass000.A0X(r0, r5)     // Catch:{ 3f4 -> 0x006e }
            X.2hI r0 = r7.A0B     // Catch:{ 3f4 -> 0x006e }
            java.lang.String r0 = r0.A00(r1)     // Catch:{ 3f4 -> 0x006e }
            X.2MG r0 = r7.A01(r8, r0, r3)     // Catch:{ 3f4 -> 0x006e }
            r4.A00()     // Catch:{ 3f4 -> 0x006e }
            if (r0 == 0) goto L_0x0029
            java.util.List r0 = r0.A01     // Catch:{ 3f4 -> 0x006e }
            java.lang.Object r0 = X.C18290x4.A0k(r0)     // Catch:{ 3f4 -> 0x006e }
            X.2iT r0 = (X.C50612iT) r0     // Catch:{ 3f4 -> 0x006e }
            return r0
        L_0x006e:
            r1 = move-exception
            r4.A01()
            java.lang.String r0 = "StickerPackNetworkProvider/getStickerPackById failed"
            com.whatsapp.util.Log.e(r0, r1)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C54132oE.A00(X.4Dd, java.lang.String):X.2iT");
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:67:0x011f */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x0135  */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:57:0x0106=Splitter:B:57:0x0106, B:67:0x011f=Splitter:B:67:0x011f} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.AnonymousClass2MG A01(X.C84644Dd r22, java.lang.String r23, java.lang.String r24) {
        /*
            r21 = this;
            java.lang.String r3 = ", reason: "
            java.lang.String r2 = "StickerPackNetworkProvider/getStickerPacks/StickerError/connection is not 200, result code: "
            r15 = r21
            X.2sH r7 = r15.A04
            long r4 = r7.A0H()
            r0 = 9
            r1 = 1
            r10 = 0
            android.net.TrafficStats.setThreadStatsTag(r0)     // Catch:{ EOFException -> 0x011e, IOException -> 0x0115, IllegalArgumentException -> 0x0104 }
            r6 = r23
            java.net.URLConnection r0 = X.C18300x5.A0q(r6)     // Catch:{ EOFException -> 0x011e, IOException -> 0x0115, IllegalArgumentException -> 0x0104 }
            javax.net.ssl.HttpsURLConnection r0 = (javax.net.ssl.HttpsURLConnection) r0     // Catch:{ EOFException -> 0x011e, IOException -> 0x0115, IllegalArgumentException -> 0x0104 }
            X.2pq r8 = r15.A0C     // Catch:{ EOFException -> 0x011e, IOException -> 0x0115, IllegalArgumentException -> 0x0104 }
            X.1r8 r8 = r8.A02()     // Catch:{ EOFException -> 0x011e, IOException -> 0x0115, IllegalArgumentException -> 0x0104 }
            r0.setSSLSocketFactory(r8)     // Catch:{ EOFException -> 0x011e, IOException -> 0x0115, IllegalArgumentException -> 0x0104 }
            X.3FI r8 = r15.A0E     // Catch:{ EOFException -> 0x011e, IOException -> 0x0115, IllegalArgumentException -> 0x0104 }
            X.C18280x3.A0z(r8, r0)     // Catch:{ EOFException -> 0x011e, IOException -> 0x0115, IllegalArgumentException -> 0x0104 }
            X.C18270x1.A1J(r0)     // Catch:{ EOFException -> 0x011e, IOException -> 0x0115, IllegalArgumentException -> 0x0104 }
            java.lang.String r8 = "GET"
            r0.setRequestMethod(r8)     // Catch:{ EOFException -> 0x011e, IOException -> 0x0115, IllegalArgumentException -> 0x0104 }
            X.1VX r9 = r15.A08     // Catch:{ EOFException -> 0x011e, IOException -> 0x0115, IllegalArgumentException -> 0x0104 }
            java.lang.String r11 = "sticker_store"
            java.lang.String r12 = "document"
            java.lang.String r13 = "manual"
            X.C162457s7.A0J(r9, r1)     // Catch:{ EOFException -> 0x011e, IOException -> 0x0115, IllegalArgumentException -> 0x0104 }
            r14 = 0
            X.2cG r8 = new X.2cG     // Catch:{ EOFException -> 0x011e, IOException -> 0x0115, IllegalArgumentException -> 0x0104 }
            r8.<init>(r9, r10, r11, r12, r13, r14)     // Catch:{ EOFException -> 0x011e, IOException -> 0x0115, IllegalArgumentException -> 0x0104 }
            java.lang.String r9 = r8.A00()     // Catch:{ EOFException -> 0x011e, IOException -> 0x0115, IllegalArgumentException -> 0x0104 }
            java.lang.String r8 = "X-FB-Request-Analytics-Tags"
            r0.setRequestProperty(r8, r9)     // Catch:{ EOFException -> 0x011e, IOException -> 0x0115, IllegalArgumentException -> 0x0104 }
            r9 = r24
            if (r24 == 0) goto L_0x0055
            java.lang.String r8 = "If-None-Match"
            r0.setRequestProperty(r8, r9)     // Catch:{ EOFException -> 0x011f, IOException -> 0x0101, IllegalArgumentException -> 0x00ff }
        L_0x0055:
            int r8 = r0.getResponseCode()     // Catch:{ EOFException -> 0x011f, IOException -> 0x0101, IllegalArgumentException -> 0x00ff }
            long r19 = X.C56612sH.A03(r7, r4)     // Catch:{ EOFException -> 0x011f, IOException -> 0x0101, IllegalArgumentException -> 0x00ff }
            java.net.URL r16 = r0.getURL()     // Catch:{ EOFException -> 0x011f, IOException -> 0x0101, IllegalArgumentException -> 0x00ff }
            long r4 = (long) r8     // Catch:{ EOFException -> 0x011f, IOException -> 0x0101, IllegalArgumentException -> 0x00ff }
            r17 = r4
            r15.A02(r16, r17, r19)     // Catch:{ EOFException -> 0x011f, IOException -> 0x0101, IllegalArgumentException -> 0x00ff }
            r4 = 200(0xc8, float:2.8E-43)
            if (r8 == r4) goto L_0x00c2
            r4 = 304(0x130, float:4.26E-43)
            if (r8 == r4) goto L_0x00b2
            r4 = 404(0x194, float:5.66E-43)
            if (r8 != r4) goto L_0x008a
            r5 = r22
            if (r22 == 0) goto L_0x008a
            X.3Wi r4 = r15.A01     // Catch:{ EOFException -> 0x011f, IOException -> 0x0101, IllegalArgumentException -> 0x00ff }
            r3 = 23
            X.5sF r2 = new X.5sF     // Catch:{ EOFException -> 0x011f, IOException -> 0x0101, IllegalArgumentException -> 0x00ff }
            r2.<init>(r5, r3)     // Catch:{ EOFException -> 0x011f, IOException -> 0x0101, IllegalArgumentException -> 0x00ff }
            r4.A0S(r2)     // Catch:{ EOFException -> 0x011f, IOException -> 0x0101, IllegalArgumentException -> 0x00ff }
            r0.disconnect()
            android.net.TrafficStats.clearThreadStatsTag()
            return r10
        L_0x008a:
            java.lang.StringBuilder r5 = X.C18270x1.A0W(r8, r2)     // Catch:{ EOFException -> 0x011f, IOException -> 0x0101, IllegalArgumentException -> 0x00ff }
            r5.append(r3)     // Catch:{ EOFException -> 0x011f, IOException -> 0x0101, IllegalArgumentException -> 0x00ff }
            java.lang.String r4 = r0.getResponseMessage()     // Catch:{ EOFException -> 0x011f, IOException -> 0x0101, IllegalArgumentException -> 0x00ff }
            r5.append(r4)     // Catch:{ EOFException -> 0x011f, IOException -> 0x0101, IllegalArgumentException -> 0x00ff }
            java.lang.String r4 = ", url: "
            X.C18260x0.A0r(r4, r6, r5)     // Catch:{ EOFException -> 0x011f, IOException -> 0x0101, IllegalArgumentException -> 0x00ff }
            java.lang.StringBuilder r4 = X.C18270x1.A0W(r8, r2)     // Catch:{ EOFException -> 0x011f, IOException -> 0x0101, IllegalArgumentException -> 0x00ff }
            r4.append(r3)     // Catch:{ EOFException -> 0x011f, IOException -> 0x0101, IllegalArgumentException -> 0x00ff }
            java.lang.String r2 = r0.getResponseMessage()     // Catch:{ EOFException -> 0x011f, IOException -> 0x0101, IllegalArgumentException -> 0x00ff }
            java.lang.String r3 = X.AnonymousClass000.A0X(r2, r4)     // Catch:{ EOFException -> 0x011f, IOException -> 0x0101, IllegalArgumentException -> 0x00ff }
            X.3f4 r2 = new X.3f4     // Catch:{ EOFException -> 0x011f, IOException -> 0x0101, IllegalArgumentException -> 0x00ff }
            r2.<init>(r3)     // Catch:{ EOFException -> 0x011f, IOException -> 0x0101, IllegalArgumentException -> 0x00ff }
            throw r2     // Catch:{ EOFException -> 0x011f, IOException -> 0x0101, IllegalArgumentException -> 0x00ff }
        L_0x00b2:
            java.lang.StringBuilder r3 = X.AnonymousClass001.A0o()     // Catch:{ EOFException -> 0x011f, IOException -> 0x0101, IllegalArgumentException -> 0x00ff }
            java.lang.String r2 = "StickerPackNetworkProvider/getStickerPacks/result code: 304,url: "
            X.C18260x0.A0q(r2, r6, r3)     // Catch:{ EOFException -> 0x011f, IOException -> 0x0101, IllegalArgumentException -> 0x00ff }
            r0.disconnect()
            android.net.TrafficStats.clearThreadStatsTag()
            return r10
        L_0x00c2:
            java.lang.String r2 = "ETag"
            java.lang.String r4 = r0.getHeaderField(r2)     // Catch:{ EOFException -> 0x011f, IOException -> 0x0101, IllegalArgumentException -> 0x00ff }
            X.2s4 r3 = r15.A03     // Catch:{ IOException -> 0x00f6, JSONException -> 0x00ed }
            r2 = 26
            X.1zz r2 = X.C36851zz.A01(r3, r0, r2)     // Catch:{ IOException -> 0x00f6, JSONException -> 0x00ed }
            java.util.List r3 = X.C387428y.A00(r2)     // Catch:{ all -> 0x00e3 }
            r2.close()     // Catch:{ IOException -> 0x00f6, JSONException -> 0x00ed }
            X.2MG r2 = new X.2MG     // Catch:{ EOFException -> 0x011f, IOException -> 0x0101, IllegalArgumentException -> 0x00ff }
            r2.<init>(r4, r3)     // Catch:{ EOFException -> 0x011f, IOException -> 0x0101, IllegalArgumentException -> 0x00ff }
            r0.disconnect()
            android.net.TrafficStats.clearThreadStatsTag()
            return r2
        L_0x00e3:
            r3 = move-exception
            r2.close()     // Catch:{ all -> 0x00e8 }
            goto L_0x00ec
        L_0x00e8:
            r2 = move-exception
            r3.addSuppressed(r2)     // Catch:{ IOException -> 0x00f6, JSONException -> 0x00ed }
        L_0x00ec:
            throw r3     // Catch:{ IOException -> 0x00f6, JSONException -> 0x00ed }
        L_0x00ed:
            r4 = move-exception
            java.lang.String r3 = "StickerPackNetworkProvider/getStickerPacks/JSONException/error parsing json data"
            X.3f4 r2 = new X.3f4     // Catch:{ EOFException -> 0x011f, IOException -> 0x0101, IllegalArgumentException -> 0x00ff }
            r2.<init>(r3, r4)     // Catch:{ EOFException -> 0x011f, IOException -> 0x0101, IllegalArgumentException -> 0x00ff }
            throw r2     // Catch:{ EOFException -> 0x011f, IOException -> 0x0101, IllegalArgumentException -> 0x00ff }
        L_0x00f6:
            r4 = move-exception
            java.lang.String r3 = "StickerPackNetworkProvider/getStickerPacks/IOException/error parsing sticker pack json"
            X.3f4 r2 = new X.3f4     // Catch:{ EOFException -> 0x011f, IOException -> 0x0101, IllegalArgumentException -> 0x00ff }
            r2.<init>(r3, r4)     // Catch:{ EOFException -> 0x011f, IOException -> 0x0101, IllegalArgumentException -> 0x00ff }
            throw r2     // Catch:{ EOFException -> 0x011f, IOException -> 0x0101, IllegalArgumentException -> 0x00ff }
        L_0x00ff:
            r4 = move-exception
            goto L_0x0106
        L_0x0101:
            r2 = move-exception
            r10 = r0
            goto L_0x0116
        L_0x0104:
            r4 = move-exception
            r0 = r10
        L_0x0106:
            X.2qk r3 = r15.A00     // Catch:{ all -> 0x012f }
            java.lang.String r2 = "StickerPackNetworkProvider/error fetching sticker pack json"
            r3.A0A(r2, r1, r10)     // Catch:{ all -> 0x012f }
            java.lang.String r2 = "StickerPackNetworkProvider/getStickerPacks/IllegalArgumentException/error fetching sticker pack json"
            X.3f4 r1 = new X.3f4     // Catch:{ all -> 0x012f }
            r1.<init>(r2, r4)     // Catch:{ all -> 0x012f }
            throw r1     // Catch:{ all -> 0x012f }
        L_0x0115:
            r2 = move-exception
        L_0x0116:
            java.lang.String r1 = "StickerPackNetworkProvider/getStickerPacks/IOException/error fetching sticker pack json"
            X.3f4 r0 = new X.3f4     // Catch:{ all -> 0x0132 }
            r0.<init>(r1, r2)     // Catch:{ all -> 0x0132 }
            throw r0     // Catch:{ all -> 0x0132 }
        L_0x011e:
            r0 = r10
        L_0x011f:
            X.2qk r3 = r15.A00     // Catch:{ all -> 0x012f }
            java.lang.String r2 = "StickerPackNetworkProvider/getStickerPacks/EOFException"
            r3.A0A(r2, r1, r10)     // Catch:{ all -> 0x012f }
            if (r0 == 0) goto L_0x012b
            r0.disconnect()
        L_0x012b:
            android.net.TrafficStats.clearThreadStatsTag()
            return r10
        L_0x012f:
            r1 = move-exception
            r10 = r0
            goto L_0x0133
        L_0x0132:
            r1 = move-exception
        L_0x0133:
            if (r10 == 0) goto L_0x0138
            r10.disconnect()
        L_0x0138:
            android.net.TrafficStats.clearThreadStatsTag()
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C54132oE.A01(X.4Dd, java.lang.String, java.lang.String):X.2MG");
    }

    public C54132oE(C55682qk r1, C69263Wi r2, C56972sr r3, C56492s4 r4, C56612sH r5, C54292oU r6, AnonymousClass33p r7, C620733j r8, AnonymousClass1VX r9, AnonymousClass4FV r10, AnonymousClass33K r11, C49912hI r12, C55132pq r13, C52682ls r14, AnonymousClass3FI r15) {
        this.A05 = r6;
        this.A04 = r5;
        this.A08 = r9;
        this.A01 = r2;
        this.A00 = r1;
        this.A02 = r3;
        this.A0E = r15;
        this.A03 = r4;
        this.A09 = r10;
        this.A0A = r11;
        this.A07 = r8;
        this.A0C = r13;
        this.A06 = r7;
        this.A0B = r12;
        this.A0D = r14;
    }

    public void A02(URL url, long j, long j2) {
        int i;
        Set<String> parameterSet = new UrlQuerySanitizer(url.toString()).getParameterSet();
        if (parameterSet.contains("cat")) {
            i = 0;
        } else if (parameterSet.contains(PublicKeyCredentialControllerUtility.JSON_KEY_ID)) {
            i = 2;
        } else {
            i = 1;
            if (!parameterSet.contains("img")) {
                StringBuilder A0o = AnonymousClass001.A0o();
                A0o.append("StickerPackNetworkProvider/log query type ");
                A0o.append(-1);
                C18260x0.A1Q(A0o, "is not supported: ", url);
                return;
            }
        }
        AnonymousClass1ZB r1 = new AnonymousClass1ZB();
        r1.A01 = Long.valueOf(j);
        r1.A03 = url.getQuery();
        r1.A00 = Integer.valueOf(i);
        r1.A02 = Long.valueOf(j2);
        this.A09.BhD(r1);
    }
}
