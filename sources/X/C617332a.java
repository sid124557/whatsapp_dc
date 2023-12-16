package X;

import android.os.Parcel;

/* renamed from: X.32a  reason: invalid class name and case insensitive filesystem */
public class C617332a {
    public static final C85204Fi[] A01 = {AnonymousClass1S3.A06, AnonymousClass1S3.A05, AnonymousClass1S3.A04};
    public final C42382Nw A00;

    /* JADX WARNING: Can't wrap try/catch for region: R(12:27|28|29|30|31|32|33|36|37|58|38|25) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:36:0x0089 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C85204Fi A01(java.lang.String r20) {
        /*
            r19 = this;
            r2 = r20
            if (r20 == 0) goto L_0x00f7
            X.4Fi[] r5 = A01
            int r4 = r5.length
            r3 = 0
        L_0x0008:
            if (r3 >= r4) goto L_0x001b
            r1 = r5[r3]
            r0 = r1
            X.3H6 r0 = (X.AnonymousClass3H6) r0
            java.lang.String r0 = r0.A04
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0018
            return r1
        L_0x0018:
            int r3 = r3 + 1
            goto L_0x0008
        L_0x001b:
            r0 = r19
            X.2Nw r1 = r0.A00
            monitor-enter(r1)
            boolean r0 = r1.A01     // Catch:{ all -> 0x00f4 }
            if (r0 != 0) goto L_0x00e8
            java.util.LinkedHashMap r0 = X.C18320x8.A0r()     // Catch:{ all -> 0x00f4 }
            r1.A00 = r0     // Catch:{ all -> 0x00f4 }
            X.2oU r0 = r1.A02     // Catch:{ all -> 0x00f4 }
            android.content.Context r0 = r0.A00     // Catch:{ all -> 0x00f4 }
            java.lang.String r3 = "currency_metadata.json"
            java.io.ByteArrayOutputStream r6 = X.AnonymousClass0x9.A0e()     // Catch:{ Exception -> 0x00d1 }
            android.content.res.AssetManager r0 = r0.getAssets()     // Catch:{ Exception -> 0x00d1 }
            java.io.InputStream r5 = r0.open(r3)     // Catch:{ Exception -> 0x00d1 }
            r0 = 4096(0x1000, float:5.74E-42)
            byte[] r4 = new byte[r0]     // Catch:{ Exception -> 0x00d1 }
        L_0x0040:
            int r3 = r5.read(r4)     // Catch:{ Exception -> 0x00d1 }
            r0 = -1
            if (r3 == r0) goto L_0x004c
            r0 = 0
            r6.write(r4, r0, r3)     // Catch:{ Exception -> 0x00d1 }
            goto L_0x0040
        L_0x004c:
            r6.close()     // Catch:{ Exception -> 0x00d1 }
            r5.close()     // Catch:{ Exception -> 0x00d1 }
            byte[] r3 = r6.toByteArray()     // Catch:{ Exception -> 0x00d1 }
            if (r3 == 0) goto L_0x00e5
            java.lang.String r0 = new java.lang.String     // Catch:{ all -> 0x00f4 }
            r0.<init>(r3)     // Catch:{ all -> 0x00f4 }
            org.json.JSONObject r3 = X.AnonymousClass0x9.A1H(r0)     // Catch:{ JSONException -> 0x00cf }
            java.lang.String r0 = "fiat_currencies"
            org.json.JSONArray r4 = r3.getJSONArray(r0)     // Catch:{ JSONException -> 0x00cf }
            java.lang.String r7 = "@"
            r3 = 0
        L_0x006a:
            int r0 = r4.length()     // Catch:{ JSONException -> 0x00cf }
            if (r3 >= r0) goto L_0x00e5
            org.json.JSONObject r5 = r4.getJSONObject(r3)     // Catch:{ JSONException -> 0x00cf }
            java.lang.String r0 = "code"
            java.lang.String r9 = r5.getString(r0)     // Catch:{ JSONException -> 0x00cf }
            java.lang.String r0 = "icon"
            java.lang.String r11 = r5.getString(r0)     // Catch:{ JSONException -> 0x0088 }
            java.lang.String r0 = "requestIcon"
            java.lang.String r12 = r5.getString(r0)     // Catch:{ JSONException -> 0x0089 }
            goto L_0x009b
        L_0x0088:
            r11 = r7
        L_0x0089:
            java.lang.StringBuilder r6 = X.AnonymousClass001.A0o()     // Catch:{ JSONException -> 0x00cf }
            java.lang.String r0 = "PAY: PaymentCurrencyProvider/loadFiatCurrencies: No IconText for "
            r6.append(r0)     // Catch:{ JSONException -> 0x00cf }
            r6.append(r9)     // Catch:{ JSONException -> 0x00cf }
            java.lang.String r0 = " and using default icon"
            X.C18260x0.A1K(r6, r0)     // Catch:{ JSONException -> 0x00cf }
            r12 = r7
        L_0x009b:
            r15 = 0
            java.lang.String r0 = "symbol"
            java.lang.String r10 = r5.getString(r0)     // Catch:{ JSONException -> 0x00cf }
            java.lang.String r0 = "offset"
            int r16 = r5.getInt(r0)     // Catch:{ JSONException -> 0x00cf }
            java.lang.String r0 = "displayExponent"
            int r17 = r5.getInt(r0)     // Catch:{ JSONException -> 0x00cf }
            java.lang.String r0 = "weight"
            int r18 = r5.getInt(r0)     // Catch:{ JSONException -> 0x00cf }
            r5 = 10000000(0x989680, double:4.9406565E-317)
            java.math.BigDecimal r13 = java.math.BigDecimal.valueOf(r5)     // Catch:{ JSONException -> 0x00cf }
            java.math.BigDecimal r14 = X.AnonymousClass1S3.A07     // Catch:{ JSONException -> 0x00cf }
            X.1S3 r8 = new X.1S3     // Catch:{ JSONException -> 0x00cf }
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)     // Catch:{ JSONException -> 0x00cf }
            java.util.Map r5 = r1.A00     // Catch:{ JSONException -> 0x00cf }
            java.lang.String r0 = r8.A04     // Catch:{ JSONException -> 0x00cf }
            r5.put(r0, r8)     // Catch:{ JSONException -> 0x00cf }
            int r3 = r3 + 1
            goto L_0x006a
        L_0x00cf:
            r4 = move-exception
            goto L_0x00dc
        L_0x00d1:
            r4 = move-exception
            java.lang.StringBuilder r3 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x00f4 }
            java.lang.String r0 = "PAY: PaymentCurrencyProvider/getAssetFileAsByte"
            X.C18260x0.A1Q(r3, r0, r4)     // Catch:{ all -> 0x00f4 }
            goto L_0x00e5
        L_0x00dc:
            java.lang.StringBuilder r3 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x00f4 }
            java.lang.String r0 = "PAY: PaymentCurrencyProvider/load"
            X.C18260x0.A1Q(r3, r0, r4)     // Catch:{ all -> 0x00f4 }
        L_0x00e5:
            r0 = 1
            r1.A01 = r0     // Catch:{ all -> 0x00f4 }
        L_0x00e8:
            monitor-exit(r1)
            java.util.Map r0 = r1.A00
            java.lang.Object r0 = r0.get(r2)
            X.4Fi r0 = (X.C85204Fi) r0
            if (r0 == 0) goto L_0x00f7
            return r0
        L_0x00f4:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        L_0x00f7:
            X.4Fi r0 = X.AnonymousClass1S3.A06
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C617332a.A01(java.lang.String):X.4Fi");
    }

    public C617332a(C42382Nw r1) {
        this.A00 = r1;
    }

    public static C85204Fi A00(Parcel parcel) {
        if (parcel.readInt() != 0) {
            return AnonymousClass1S3.A06;
        }
        return new AnonymousClass1S3(parcel);
    }
}
