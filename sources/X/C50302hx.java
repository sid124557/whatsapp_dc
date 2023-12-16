package X;

import com.whatsapp.stickers.WebpUtils;
import java.util.Locale;

/* renamed from: X.2hx  reason: invalid class name and case insensitive filesystem */
public final class C50302hx {
    public String A00;
    public boolean A01;
    public final C56492s4 A02;
    public final C56612sH A03;
    public final C620733j A04;
    public final C52512lb A05;
    public final WebpUtils A06;
    public final C59452ww A07;
    public final AnonymousClass3FI A08;

    /* JADX WARNING: Can't wrap try/catch for region: R(6:76|77|78|79|80|(9:82|(1:84)|86|87|(1:89)(1:90)|91|(3:93|(1:95)|96)|97|155)(1:154)) */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x0278, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:?, code lost:
        X.AnonymousClass2A8.A00(r20, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x027e, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x01a5, code lost:
        if (r19.length() == 0) goto L_0x01a7;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:79:0x017b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.AnonymousClass0PJ A00(java.lang.String r35) {
        /*
            r34 = this;
            java.lang.String r12 = " processed in "
            java.lang.String r11 = "GiphyStickerProvider/executeRequest/data at "
            r10 = r34
            X.2sH r9 = r10.A03
            long r2 = r9.A0H()
            r0 = 9
            r8 = 0
            r13 = r35
            android.net.TrafficStats.setThreadStatsTag(r0)     // Catch:{ Exception -> 0x027f }
            java.net.URLConnection r14 = X.C18300x5.A0q(r13)     // Catch:{ Exception -> 0x027f }
            java.lang.String r0 = "null cannot be cast to non-null type javax.net.ssl.HttpsURLConnection"
            X.C162457s7.A0K(r14, r0)     // Catch:{ Exception -> 0x027f }
            javax.net.ssl.HttpsURLConnection r14 = (javax.net.ssl.HttpsURLConnection) r14     // Catch:{ Exception -> 0x027f }
            X.3FI r0 = r10.A08     // Catch:{ Exception -> 0x027f }
            X.C18280x3.A0z(r0, r14)     // Catch:{ Exception -> 0x027f }
            X.C18270x1.A1J(r14)     // Catch:{ Exception -> 0x027f }
            java.lang.String r0 = "GET"
            r14.setRequestMethod(r0)     // Catch:{ Exception -> 0x027f }
            r14.connect()     // Catch:{ Exception -> 0x027f }
            int r4 = r14.getResponseCode()     // Catch:{ Exception -> 0x027f }
            r0 = 200(0xc8, float:2.8E-43)
            if (r4 == r0) goto L_0x004c
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ Exception -> 0x027f }
            java.lang.String r0 = "GiphyStickerProvider/executeRequest/failed "
            X.C18260x0.A0x(r0, r1, r4)     // Catch:{ Exception -> 0x027f }
            java.lang.StringBuilder r0 = X.AnonymousClass000.A0m(r11, r13)
            X.C56612sH.A0A(r9, r12, r0, r2)
            android.net.TrafficStats.clearThreadStatsTag()
            return r8
        L_0x004c:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0m(r11, r13)     // Catch:{ Exception -> 0x027f }
            java.lang.String r0 = " loaded in "
            X.C56612sH.A0A(r9, r0, r1, r2)     // Catch:{ Exception -> 0x027f }
            r7 = 0
            r6 = 0
            r5 = 0
            X.2s4 r0 = r10.A02     // Catch:{ Exception -> 0x027f }
            r4 = 0
            X.1zz r0 = X.C36851zz.A01(r0, r14, r4)     // Catch:{ Exception -> 0x027f }
            android.util.JsonReader r20 = X.C18300x5.A0D(r0)     // Catch:{ Exception -> 0x027f }
            r20.beginObject()     // Catch:{ all -> 0x0276 }
        L_0x0066:
            boolean r0 = r20.hasNext()     // Catch:{ all -> 0x0276 }
            if (r0 == 0) goto L_0x020d
            java.lang.String r14 = r20.nextName()     // Catch:{ all -> 0x0276 }
            if (r14 == 0) goto L_0x01ff
            int r1 = r14.hashCode()     // Catch:{ all -> 0x0276 }
            r0 = 3076010(0x2eefaa, float:4.310408E-39)
            if (r1 == r0) goto L_0x00a1
            r0 = 3347973(0x331605, float:4.69151E-39)
            if (r1 == r0) goto L_0x0093
            r0 = 1297692570(0x4d59379a, float:2.27768736E8)
            if (r1 != r0) goto L_0x01ff
            java.lang.String r0 = "pagination"
            boolean r0 = r14.equals(r0)     // Catch:{ all -> 0x0276 }
            if (r0 == 0) goto L_0x01ff
            java.lang.String r6 = X.AnonymousClass35I.A02(r20)     // Catch:{ all -> 0x0276 }
            goto L_0x0066
        L_0x0093:
            java.lang.String r0 = "meta"
            boolean r0 = r14.equals(r0)     // Catch:{ all -> 0x0276 }
            if (r0 == 0) goto L_0x01ff
            X.0PJ r7 = X.AnonymousClass35I.A00(r20)     // Catch:{ all -> 0x0276 }
            goto L_0x0066
        L_0x00a1:
            java.lang.String r0 = "data"
            boolean r0 = r14.equals(r0)     // Catch:{ all -> 0x0276 }
            if (r0 == 0) goto L_0x01ff
            java.util.ArrayList r5 = X.AnonymousClass001.A0s()     // Catch:{ all -> 0x0276 }
            r20.beginArray()     // Catch:{ all -> 0x0276 }
        L_0x00b0:
            boolean r0 = r20.hasNext()     // Catch:{ all -> 0x0276 }
            if (r0 == 0) goto L_0x01fa
            r20.beginObject()     // Catch:{ all -> 0x0276 }
            r15 = 0
            r19 = r8
        L_0x00bc:
            boolean r0 = r20.hasNext()     // Catch:{ all -> 0x0276 }
            if (r0 == 0) goto L_0x0166
            java.lang.String r1 = r20.nextName()     // Catch:{ all -> 0x0276 }
            java.lang.String r0 = "username"
            boolean r0 = X.C162457s7.A0P(r1, r0)     // Catch:{ all -> 0x0276 }
            if (r0 == 0) goto L_0x00d4
            java.lang.String r19 = r20.nextString()     // Catch:{ all -> 0x0276 }
            goto L_0x00bc
        L_0x00d4:
            java.lang.String r0 = "images"
            boolean r0 = X.C162457s7.A0P(r1, r0)     // Catch:{ all -> 0x0276 }
            if (r0 == 0) goto L_0x0161
            r20.beginObject()     // Catch:{ all -> 0x0276 }
        L_0x00df:
            boolean r0 = r20.hasNext()     // Catch:{ all -> 0x0276 }
            if (r0 == 0) goto L_0x015c
            java.lang.String r1 = r20.nextName()     // Catch:{ all -> 0x0276 }
            java.lang.String r0 = "fixed_height"
            boolean r0 = X.C162457s7.A0P(r1, r0)     // Catch:{ all -> 0x0276 }
            if (r0 == 0) goto L_0x0158
            r20.beginObject()     // Catch:{ all -> 0x0276 }
            r15 = 0
            r18 = -1
            r17 = r8
            r16 = -1
        L_0x00fb:
            boolean r0 = r20.hasNext()     // Catch:{ all -> 0x0276 }
            if (r0 == 0) goto L_0x0147
            java.lang.String r14 = r20.nextName()     // Catch:{ all -> 0x0276 }
            if (r14 == 0) goto L_0x0143
            int r1 = r14.hashCode()     // Catch:{ all -> 0x0276 }
            r0 = -1221029593(0xffffffffb7389127, float:-1.1001051E-5)
            if (r1 == r0) goto L_0x0136
            r0 = 3645340(0x379f9c, float:5.10821E-39)
            if (r1 == r0) goto L_0x0128
            r0 = 113126854(0x6be2dc6, float:7.1537315E-35)
            if (r1 != r0) goto L_0x0143
            java.lang.String r0 = "width"
            boolean r0 = r14.equals(r0)     // Catch:{ all -> 0x0276 }
            if (r0 == 0) goto L_0x0143
            int r18 = X.C18290x4.A02(r20)     // Catch:{ all -> 0x0276 }
            goto L_0x00fb
        L_0x0128:
            java.lang.String r0 = "webp"
            boolean r0 = r14.equals(r0)     // Catch:{ all -> 0x0276 }
            if (r0 == 0) goto L_0x0143
            java.lang.String r17 = r20.nextString()     // Catch:{ all -> 0x0276 }
            goto L_0x00fb
        L_0x0136:
            java.lang.String r0 = "height"
            boolean r0 = r14.equals(r0)     // Catch:{ all -> 0x0276 }
            if (r0 == 0) goto L_0x0143
            int r16 = X.C18290x4.A02(r20)     // Catch:{ all -> 0x0276 }
            goto L_0x00fb
        L_0x0143:
            r20.skipValue()     // Catch:{ all -> 0x0276 }
            goto L_0x00fb
        L_0x0147:
            r20.endObject()     // Catch:{ all -> 0x0276 }
            if (r17 == 0) goto L_0x00df
            X.7y8 r15 = new X.7y8     // Catch:{ all -> 0x0276 }
            r14 = r17
            r1 = r18
            r0 = r16
            r15.<init>(r14, r1, r0)     // Catch:{ all -> 0x0276 }
            goto L_0x00df
        L_0x0158:
            r20.skipValue()     // Catch:{ all -> 0x0276 }
            goto L_0x00df
        L_0x015c:
            r20.endObject()     // Catch:{ all -> 0x0276 }
            goto L_0x00bc
        L_0x0161:
            r20.skipValue()     // Catch:{ all -> 0x0276 }
            goto L_0x00bc
        L_0x0166:
            r20.endObject()     // Catch:{ all -> 0x0276 }
            if (r15 == 0) goto L_0x00b0
            int r1 = r15.A01     // Catch:{ all -> 0x0276 }
            int r0 = r15.A00     // Catch:{ all -> 0x0276 }
            if (r1 != r0) goto L_0x00b0
            java.lang.String r15 = r15.A02     // Catch:{ all -> 0x0276 }
            r1 = 0
            X.2ww r0 = r10.A07     // Catch:{ Exception -> 0x017b }
            X.39M r1 = r0.A01(r15, r4)     // Catch:{ Exception -> 0x017b }
            goto L_0x0184
        L_0x017b:
            java.lang.StringBuilder r14 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0276 }
            java.lang.String r0 = "BaseStickerProvider/getStickerFromUrl/error loading "
            X.C18260x0.A0r(r0, r15, r14)     // Catch:{ all -> 0x0276 }
        L_0x0184:
            if (r1 == 0) goto L_0x00b0
            java.lang.StringBuilder r14 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0276 }
            java.lang.String r0 = "GiphyStickerProvider/getStickerFromUrl/success url:"
            r14.append(r0)     // Catch:{ all -> 0x0276 }
            java.lang.String r0 = r1.A0G     // Catch:{ all -> 0x0276 }
            r14.append(r0)     // Catch:{ all -> 0x0276 }
            java.lang.String r0 = " size:"
            r14.append(r0)     // Catch:{ all -> 0x0276 }
            int r0 = r1.A00     // Catch:{ all -> 0x0276 }
            X.C18260x0.A1F(r14, r0)     // Catch:{ all -> 0x0276 }
            if (r19 == 0) goto L_0x01a7
            int r14 = r19.length()     // Catch:{ all -> 0x0276 }
            r0 = 0
            if (r14 != 0) goto L_0x01a8
        L_0x01a7:
            r0 = 1
        L_0x01a8:
            r16 = 0
            if (r0 == 0) goto L_0x01af
            r23 = r8
            goto L_0x01bb
        L_0x01af:
            java.lang.StringBuilder r14 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0276 }
            r0 = 64
            r15 = r19
            java.lang.String r23 = X.AnonymousClass0x2.A0e(r15, r14, r0)     // Catch:{ all -> 0x0276 }
        L_0x01bb:
            java.lang.String r24 = "Giphy"
            X.330 r0 = new X.330     // Catch:{ all -> 0x0276 }
            r25 = r8
            r26 = r8
            r27 = r8
            r28 = r8
            r30 = r4
            r31 = r4
            r32 = r4
            r33 = r4
            r22 = r8
            r29 = r4
            r21 = r0
            r21.<init>(r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33)     // Catch:{ all -> 0x0276 }
            r1.A04 = r0     // Catch:{ all -> 0x0276 }
            java.lang.String r14 = r1.A09     // Catch:{ all -> 0x0276 }
            if (r14 == 0) goto L_0x01f5
            com.whatsapp.stickers.WebpUtils r0 = r10.A06     // Catch:{ all -> 0x0276 }
            r17 = r0
            java.io.File r15 = X.AnonymousClass002.A0B(r14)     // Catch:{ all -> 0x0276 }
            X.330 r0 = r1.A04     // Catch:{ all -> 0x0276 }
            if (r0 == 0) goto L_0x01ee
            byte[] r16 = r0.A02()     // Catch:{ all -> 0x0276 }
        L_0x01ee:
            r14 = r17
            r0 = r16
            r14.A03(r15, r0)     // Catch:{ all -> 0x0276 }
        L_0x01f5:
            r5.add(r1)     // Catch:{ all -> 0x0276 }
            goto L_0x00b0
        L_0x01fa:
            r20.endArray()     // Catch:{ all -> 0x0276 }
            goto L_0x0066
        L_0x01ff:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0276 }
            java.lang.String r0 = "GiphyStickerProvider/executeRequest/unexpected key - "
            X.C18260x0.A0t(r0, r14, r1)     // Catch:{ all -> 0x0276 }
            r20.skipValue()     // Catch:{ all -> 0x0276 }
            goto L_0x0066
        L_0x020d:
            r20.endObject()     // Catch:{ all -> 0x0276 }
            r20.close()     // Catch:{ Exception -> 0x027f }
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ Exception -> 0x027f }
            java.lang.String r0 = "GiphyStickerProvider/executeRequest/next: "
            X.C18260x0.A0t(r0, r6, r1)     // Catch:{ Exception -> 0x027f }
            if (r7 == 0) goto L_0x022d
            java.lang.Object r0 = r7.A00     // Catch:{ Exception -> 0x027f }
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ Exception -> 0x027f }
            if (r0 == 0) goto L_0x022d
            int r1 = r0.intValue()     // Catch:{ Exception -> 0x027f }
            r0 = 200(0xc8, float:2.8E-43)
            if (r0 != r1) goto L_0x022d
            r4 = 1
        L_0x022d:
            if (r4 != 0) goto L_0x025f
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ Exception -> 0x027f }
            if (r7 == 0) goto L_0x0242
            java.lang.Object r0 = r7.A00     // Catch:{ Exception -> 0x027f }
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ Exception -> 0x027f }
        L_0x0239:
            r1.append(r0)     // Catch:{ Exception -> 0x027f }
            r0 = 40
            r1.append(r0)     // Catch:{ Exception -> 0x027f }
            goto L_0x0244
        L_0x0242:
            r0 = r8
            goto L_0x0239
        L_0x0244:
            if (r7 == 0) goto L_0x0247
            goto L_0x0249
        L_0x0247:
            r0 = r8
            goto L_0x024d
        L_0x0249:
            java.lang.Object r0 = r7.A01     // Catch:{ Exception -> 0x027f }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ Exception -> 0x027f }
        L_0x024d:
            java.lang.String r4 = X.C18260x0.A07(r0, r1)     // Catch:{ Exception -> 0x027f }
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ Exception -> 0x027f }
            java.lang.String r0 = "GiphyStickerProvider/executeRequest/got error: "
            X.C18260x0.A0t(r0, r4, r1)     // Catch:{ Exception -> 0x027f }
            java.lang.StringBuilder r0 = X.AnonymousClass001.A0o()
            goto L_0x0287
        L_0x025f:
            if (r5 == 0) goto L_0x0266
            X.0PJ r1 = X.AnonymousClass0x9.A0G(r6, r5)     // Catch:{ Exception -> 0x027f }
            goto L_0x026b
        L_0x0266:
            X.0PJ r1 = new X.0PJ     // Catch:{ Exception -> 0x027f }
            r1.<init>(r8, r8)     // Catch:{ Exception -> 0x027f }
        L_0x026b:
            java.lang.StringBuilder r0 = X.AnonymousClass000.A0m(r11, r13)
            X.C56612sH.A0A(r9, r12, r0, r2)
            android.net.TrafficStats.clearThreadStatsTag()
            return r1
        L_0x0276:
            r4 = move-exception
            throw r4     // Catch:{ all -> 0x0278 }
        L_0x0278:
            r1 = move-exception
            r0 = r20
            X.AnonymousClass2A8.A00(r0, r4)     // Catch:{ Exception -> 0x027f }
            throw r1     // Catch:{ Exception -> 0x027f }
        L_0x027f:
            r0 = move-exception
            com.whatsapp.util.Log.e((java.lang.Throwable) r0)     // Catch:{ all -> 0x0294 }
            java.lang.StringBuilder r0 = X.AnonymousClass001.A0o()
        L_0x0287:
            r0.append(r11)
            r0.append(r13)
            X.C56612sH.A0A(r9, r12, r0, r2)
            android.net.TrafficStats.clearThreadStatsTag()
            return r8
        L_0x0294:
            r1 = move-exception
            java.lang.StringBuilder r0 = X.AnonymousClass000.A0m(r11, r13)
            X.C56612sH.A0A(r9, r12, r0, r2)
            android.net.TrafficStats.clearThreadStatsTag()
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C50302hx.A00(java.lang.String):X.0PJ");
    }

    public final String A01(CharSequence charSequence, String str) {
        Locale A002 = this.A05.A00();
        String[] strArr = new String[10];
        strArr[0] = "api_key";
        strArr[1] = C58172up.A0H;
        strArr[2] = "q";
        AnonymousClass0x7.A1E(charSequence, strArr, 3);
        strArr[4] = "lang";
        strArr[5] = AnonymousClass35I.A00.A03(this.A04, A002);
        strArr[6] = "rating";
        strArr[7] = "pg-13";
        strArr[8] = "limit";
        strArr[9] = "50";
        String A003 = AnonymousClass5B3.A00("https://api.giphy.com/v1/stickers/search", strArr);
        if (str == null || str.length() == 0) {
            return A003;
        }
        return AnonymousClass5B3.A00(A003, "offset", str);
    }

    public C50302hx(C56492s4 r1, C56612sH r2, C620733j r3, C52512lb r4, WebpUtils webpUtils, C59452ww r6, AnonymousClass3FI r7) {
        C18260x0.A0d(r7, webpUtils, r2, r1);
        C18260x0.A0U(r3, r4);
        this.A08 = r7;
        this.A06 = webpUtils;
        this.A07 = r6;
        this.A03 = r2;
        this.A02 = r1;
        this.A04 = r3;
        this.A05 = r4;
    }
}
