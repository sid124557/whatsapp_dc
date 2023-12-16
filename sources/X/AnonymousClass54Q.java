package X;

/* renamed from: X.54Q  reason: invalid class name */
public class AnonymousClass54Q extends AnonymousClass5ZM {
    public final /* synthetic */ AnonymousClass4OV A00;

    public AnonymousClass54Q(AnonymousClass4OV r1) {
        this.A00 = r1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:121:0x0234, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:?, code lost:
        r1.addSuppressed(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x0239, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x023a, code lost:
        com.whatsapp.util.Log.e(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x023e, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00d5, code lost:
        r0 = e;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:77:0x013e */
    /* JADX WARNING: Missing exception handler attribute for start block: B:96:0x01de */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x0239 A[ExcHandler: IOException | JSONException (r0v0 'e' java.lang.Throwable A[CUSTOM_DECLARE]), Splitter:B:0:0x0000] */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x0129 A[Catch:{ all -> 0x0234, IOException | JSONException -> 0x0239 }] */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x01d6 A[Catch:{ JSONException -> 0x01f4, IOException | JSONException -> 0x0239 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ java.lang.Object A08(java.lang.Object[] r11) {
        /*
            r10 = this;
            X.4OV r0 = r10.A00     // Catch:{ IOException | JSONException -> 0x0239 }
            com.whatsapp.profile.WebImagePicker r0 = r0.A02     // Catch:{ IOException | JSONException -> 0x0239 }
            X.7PX r2 = r0.A0E     // Catch:{ IOException | JSONException -> 0x0239 }
            java.util.ArrayList r0 = X.AnonymousClass001.A0s()     // Catch:{ IOException | JSONException -> 0x0239 }
            r2.A03 = r0     // Catch:{ IOException | JSONException -> 0x0239 }
            android.net.Uri$Builder r4 = new android.net.Uri$Builder     // Catch:{ IOException | JSONException -> 0x0239 }
            r4.<init>()     // Catch:{ IOException | JSONException -> 0x0239 }
            java.lang.String r0 = X.C58172up.A01     // Catch:{ IOException | JSONException -> 0x0239 }
            r4.encodedPath(r0)     // Catch:{ IOException | JSONException -> 0x0239 }
            java.lang.String r1 = "SafeSearch"
            java.lang.String r0 = X.C58172up.A04     // Catch:{ IOException | JSONException -> 0x0239 }
            r4.appendQueryParameter(r1, r0)     // Catch:{ IOException | JSONException -> 0x0239 }
            java.lang.String r1 = "appid"
            java.lang.String r0 = X.C58172up.A02     // Catch:{ IOException | JSONException -> 0x0239 }
            r4.appendQueryParameter(r1, r0)     // Catch:{ IOException | JSONException -> 0x0239 }
            java.lang.String r1 = "aspect"
            java.lang.String r0 = X.C58172up.A03     // Catch:{ IOException | JSONException -> 0x0239 }
            r4.appendQueryParameter(r1, r0)     // Catch:{ IOException | JSONException -> 0x0239 }
            java.lang.String r0 = r2.A02     // Catch:{ IOException | JSONException -> 0x0239 }
            java.lang.String r1 = r0.trim()     // Catch:{ IOException | JSONException -> 0x0239 }
            java.lang.String r0 = "q"
            r4.appendQueryParameter(r0, r1)     // Catch:{ IOException | JSONException -> 0x0239 }
            java.util.Locale r0 = java.util.Locale.getDefault()     // Catch:{ IOException | JSONException -> 0x0239 }
            java.lang.String r1 = r0.getLanguage()     // Catch:{ IOException | JSONException -> 0x0239 }
            java.util.Locale r0 = java.util.Locale.getDefault()     // Catch:{ IOException | JSONException -> 0x0239 }
            java.lang.String r3 = r0.getCountry()     // Catch:{ IOException | JSONException -> 0x0239 }
            boolean r0 = r3.isEmpty()     // Catch:{ IOException | JSONException -> 0x0239 }
            if (r0 != 0) goto L_0x0056
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0l(r1)     // Catch:{ IOException | JSONException -> 0x0239 }
            java.lang.String r0 = "-"
            java.lang.String r1 = X.AnonymousClass000.A0V(r0, r3, r1)     // Catch:{ IOException | JSONException -> 0x0239 }
        L_0x0056:
            java.util.List r0 = r2.A07     // Catch:{ IOException | JSONException -> 0x0239 }
            boolean r0 = r0.contains(r1)     // Catch:{ IOException | JSONException -> 0x0239 }
            if (r0 != 0) goto L_0x0060
            java.lang.String r1 = "en-US"
        L_0x0060:
            java.lang.String r0 = "mkt"
            r4.appendQueryParameter(r0, r1)     // Catch:{ IOException | JSONException -> 0x0239 }
            int r0 = r2.A00     // Catch:{ IOException | JSONException -> 0x0239 }
            java.lang.String r1 = java.lang.Integer.toString(r0)     // Catch:{ IOException | JSONException -> 0x0239 }
            java.lang.String r0 = "offset"
            r4.appendQueryParameter(r0, r1)     // Catch:{ IOException | JSONException -> 0x0239 }
            r0 = 50
            java.lang.String r1 = java.lang.Integer.toString(r0)     // Catch:{ IOException | JSONException -> 0x0239 }
            java.lang.String r0 = "count"
            r4.appendQueryParameter(r0, r1)     // Catch:{ IOException | JSONException -> 0x0239 }
            android.net.Uri r0 = r4.build()     // Catch:{ IOException | JSONException -> 0x0239 }
            java.lang.String r9 = r0.toString()     // Catch:{ IOException | JSONException -> 0x0239 }
            java.lang.String r1 = X.C627236i.A04(r9)     // Catch:{ IOException | JSONException -> 0x0239 }
            java.io.File r0 = r2.A06     // Catch:{ IOException | JSONException -> 0x0239 }
            java.io.File r6 = X.AnonymousClass002.A0A(r0, r1)     // Catch:{ IOException | JSONException -> 0x0239 }
            boolean r0 = r6.exists()     // Catch:{ IOException | JSONException -> 0x0239 }
            r5 = 0
            if (r0 == 0) goto L_0x00da
            long r7 = r6.lastModified()     // Catch:{ IOException | JSONException -> 0x0239 }
            r0 = 86400000(0x5265c00, double:4.2687272E-316)
            long r7 = r7 + r0
            long r3 = java.lang.System.currentTimeMillis()     // Catch:{ IOException | JSONException -> 0x0239 }
            int r0 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r0 <= 0) goto L_0x00da
            java.io.FileInputStream r4 = new java.io.FileInputStream     // Catch:{ IOException | ClassNotFoundException -> 0x00d5, IOException | JSONException -> 0x0239 }
            r4.<init>(r6)     // Catch:{ IOException | ClassNotFoundException -> 0x00d5, IOException | JSONException -> 0x0239 }
            java.io.ObjectInputStream r0 = new java.io.ObjectInputStream     // Catch:{ all -> 0x00cb }
            r0.<init>(r4)     // Catch:{ all -> 0x00cb }
            java.lang.Object r3 = r0.readObject()     // Catch:{ all -> 0x00c1 }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ all -> 0x00c1 }
            r0.close()     // Catch:{ all -> 0x00be }
            r4.close()     // Catch:{ IOException | ClassNotFoundException -> 0x00bb, IOException | JSONException -> 0x0239 }
            goto L_0x0127
        L_0x00bb:
            r0 = move-exception
            r5 = r3
            goto L_0x00d6
        L_0x00be:
            r1 = move-exception
            r5 = r3
            goto L_0x00cc
        L_0x00c1:
            r1 = move-exception
            r0.close()     // Catch:{ all -> 0x00c6 }
            goto L_0x00ca
        L_0x00c6:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x00cb }
        L_0x00ca:
            throw r1     // Catch:{ all -> 0x00cb }
        L_0x00cb:
            r1 = move-exception
        L_0x00cc:
            r4.close()     // Catch:{ all -> 0x00d0 }
            goto L_0x00d4
        L_0x00d0:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ IOException | ClassNotFoundException -> 0x00d5, IOException | JSONException -> 0x0239 }
        L_0x00d4:
            throw r1     // Catch:{ IOException | ClassNotFoundException -> 0x00d5, IOException | JSONException -> 0x0239 }
        L_0x00d5:
            r0 = move-exception
        L_0x00d6:
            com.whatsapp.util.Log.e((java.lang.Throwable) r0)     // Catch:{ IOException | JSONException -> 0x0239 }
            goto L_0x0126
        L_0x00da:
            r6.delete()     // Catch:{ IOException | JSONException -> 0x0239 }
            X.33K r0 = r2.A05     // Catch:{ IOException | JSONException -> 0x0239 }
            X.4GL r4 = r0.A04(r9)     // Catch:{ IOException | JSONException -> 0x0239 }
            r0 = r4
            X.3PZ r0 = (X.AnonymousClass3PZ) r0     // Catch:{ all -> 0x022f }
            java.net.HttpURLConnection r0 = r0.A01     // Catch:{ all -> 0x022f }
            int r3 = r0.getResponseCode()     // Catch:{ all -> 0x022f }
            r0 = 200(0xc8, float:2.8E-43)
            if (r3 != r0) goto L_0x0220
            X.2s4 r1 = r2.A04     // Catch:{ all -> 0x022f }
            r0 = 25
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x022f }
            java.io.InputStream r3 = r4.B47(r1, r5, r0)     // Catch:{ all -> 0x022f }
            java.lang.String r5 = X.C624535b.A00(r3)     // Catch:{ all -> 0x0216 }
            java.io.FileOutputStream r1 = X.AnonymousClass0x9.A0h(r6)     // Catch:{ IOException -> 0x011a }
            java.io.ObjectOutputStream r0 = new java.io.ObjectOutputStream     // Catch:{ IOException -> 0x011a }
            r0.<init>(r1)     // Catch:{ IOException -> 0x011a }
            r0.writeObject(r5)     // Catch:{ all -> 0x0110 }
            r0.close()     // Catch:{ IOException -> 0x011a }
            goto L_0x0120
        L_0x0110:
            r1 = move-exception
            r0.close()     // Catch:{ all -> 0x0115 }
            goto L_0x0119
        L_0x0115:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ IOException -> 0x011a }
        L_0x0119:
            throw r1     // Catch:{ IOException -> 0x011a }
        L_0x011a:
            r1 = move-exception
            java.lang.String r0 = "WebImageSearcher/next"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x0216 }
        L_0x0120:
            r3.close()     // Catch:{ all -> 0x022f }
            r4.close()     // Catch:{ IOException | JSONException -> 0x0239 }
        L_0x0126:
            r3 = r5
        L_0x0127:
            if (r3 == 0) goto L_0x0213
            org.json.JSONObject r1 = X.AnonymousClass0x9.A1H(r3)     // Catch:{ IOException | JSONException -> 0x0239 }
            r5 = 0
            r4 = 0
            java.lang.String r0 = "value"
            org.json.JSONArray r4 = r1.getJSONArray(r0)     // Catch:{ JSONException -> 0x013e, IOException | JSONException -> 0x0239 }
            java.lang.String r0 = "totalEstimatedMatches"
            int r0 = r1.getInt(r0)     // Catch:{ JSONException -> 0x013e, IOException | JSONException -> 0x0239 }
            r2.A01 = r0     // Catch:{ JSONException -> 0x013e, IOException | JSONException -> 0x0239 }
            goto L_0x0140
        L_0x013e:
            r2.A01 = r5     // Catch:{ IOException | JSONException -> 0x0239 }
        L_0x0140:
            if (r4 == 0) goto L_0x0213
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ IOException | JSONException -> 0x0239 }
            java.lang.String r0 = "results.length() = "
            r1.append(r0)     // Catch:{ IOException | JSONException -> 0x0239 }
            int r0 = r4.length()     // Catch:{ IOException | JSONException -> 0x0239 }
            r1.append(r0)     // Catch:{ IOException | JSONException -> 0x0239 }
            java.lang.String r0 = ", total:"
            r1.append(r0)     // Catch:{ IOException | JSONException -> 0x0239 }
            int r0 = r2.A01     // Catch:{ IOException | JSONException -> 0x0239 }
            X.C18260x0.A1G(r1, r0)     // Catch:{ IOException | JSONException -> 0x0239 }
        L_0x015c:
            int r0 = r4.length()     // Catch:{ IOException | JSONException -> 0x0239 }
            if (r5 >= r0) goto L_0x01f8
            X.7X8 r3 = new X.7X8     // Catch:{ JSONException -> 0x01f4, IOException | JSONException -> 0x0239 }
            r3.<init>()     // Catch:{ JSONException -> 0x01f4, IOException | JSONException -> 0x0239 }
            org.json.JSONObject r6 = r4.getJSONObject(r5)     // Catch:{ JSONException -> 0x01f4, IOException | JSONException -> 0x0239 }
            java.lang.String r0 = "contentUrl"
            java.lang.String r0 = r6.getString(r0)     // Catch:{ JSONException -> 0x01f4, IOException | JSONException -> 0x0239 }
            r3.A05 = r0     // Catch:{ JSONException -> 0x01f4, IOException | JSONException -> 0x0239 }
            java.lang.String r0 = "hostPageUrl"
            java.lang.String r0 = r6.getString(r0)     // Catch:{ JSONException -> 0x01f4, IOException | JSONException -> 0x0239 }
            r3.A06 = r0     // Catch:{ JSONException -> 0x01f4, IOException | JSONException -> 0x0239 }
            java.lang.String r0 = "contentSize"
            java.lang.String r0 = r6.getString(r0)     // Catch:{ JSONException -> 0x01f4, IOException | JSONException -> 0x0239 }
            java.util.Scanner r1 = new java.util.Scanner     // Catch:{ JSONException -> 0x01f4, IOException | JSONException -> 0x0239 }
            r1.<init>(r0)     // Catch:{ JSONException -> 0x01f4, IOException | JSONException -> 0x0239 }
            int r0 = r1.nextInt()     // Catch:{ JSONException -> 0x01f4, IOException | JSONException -> 0x0239 }
            r3.A02 = r0     // Catch:{ JSONException -> 0x01f4, IOException | JSONException -> 0x0239 }
            java.lang.String r1 = r1.next()     // Catch:{ JSONException -> 0x01f4, IOException | JSONException -> 0x0239 }
            java.lang.String r0 = "KB"
            boolean r0 = r1.equals(r0)     // Catch:{ JSONException -> 0x01f4, IOException | JSONException -> 0x0239 }
            if (r0 == 0) goto L_0x01c5
            int r0 = r3.A02     // Catch:{ JSONException -> 0x01f4, IOException | JSONException -> 0x0239 }
            int r1 = r0 * 1000
        L_0x019c:
            r3.A02 = r1     // Catch:{ JSONException -> 0x01f4, IOException | JSONException -> 0x0239 }
        L_0x019e:
            java.lang.String r0 = "width"
            int r0 = r6.getInt(r0)     // Catch:{ JSONException -> 0x01f4, IOException | JSONException -> 0x0239 }
            r3.A03 = r0     // Catch:{ JSONException -> 0x01f4, IOException | JSONException -> 0x0239 }
            java.lang.String r0 = "height"
            int r0 = r6.getInt(r0)     // Catch:{ JSONException -> 0x01f4, IOException | JSONException -> 0x0239 }
            r3.A01 = r0     // Catch:{ JSONException -> 0x01f4, IOException | JSONException -> 0x0239 }
            java.lang.String r0 = "thumbnailUrl"
            java.lang.String r0 = r6.getString(r0)     // Catch:{ JSONException -> 0x01f4, IOException | JSONException -> 0x0239 }
            r3.A07 = r0     // Catch:{ JSONException -> 0x01f4, IOException | JSONException -> 0x0239 }
            java.lang.String r0 = "name"
            java.lang.String r0 = r6.optString(r0)     // Catch:{ JSONException -> 0x01f4, IOException | JSONException -> 0x0239 }
            r3.A04 = r0     // Catch:{ JSONException -> 0x01f4, IOException | JSONException -> 0x0239 }
            java.lang.String r0 = "accentColor"
            java.lang.String r1 = r6.optString(r0)     // Catch:{ JSONException -> 0x01f4, IOException | JSONException -> 0x0239 }
            goto L_0x01d4
        L_0x01c5:
            java.lang.String r0 = "MB"
            boolean r0 = r1.equals(r0)     // Catch:{ JSONException -> 0x01f4, IOException | JSONException -> 0x0239 }
            if (r0 == 0) goto L_0x019e
            int r1 = r3.A02     // Catch:{ JSONException -> 0x01f4, IOException | JSONException -> 0x0239 }
            r0 = 1000000(0xf4240, float:1.401298E-39)
            int r1 = r1 * r0
            goto L_0x019c
        L_0x01d4:
            if (r1 == 0) goto L_0x01de
            r0 = 16
            int r0 = java.lang.Integer.parseInt(r1, r0)     // Catch:{ NumberFormatException -> 0x01de }
            r3.A00 = r0     // Catch:{ NumberFormatException -> 0x01de }
        L_0x01de:
            int r0 = r3.A03     // Catch:{ JSONException -> 0x01f4, IOException | JSONException -> 0x0239 }
            r1 = 300(0x12c, float:4.2E-43)
            if (r0 < r1) goto L_0x01f4
            int r0 = r3.A01     // Catch:{ JSONException -> 0x01f4, IOException | JSONException -> 0x0239 }
            if (r0 < r1) goto L_0x01f4
            int r1 = r3.A02     // Catch:{ JSONException -> 0x01f4, IOException | JSONException -> 0x0239 }
            r0 = 512000(0x7d000, float:7.17465E-40)
            if (r1 > r0) goto L_0x01f4
            java.util.ArrayList r0 = r2.A03     // Catch:{ JSONException -> 0x01f4, IOException | JSONException -> 0x0239 }
            r0.add(r3)     // Catch:{ JSONException -> 0x01f4, IOException | JSONException -> 0x0239 }
        L_0x01f4:
            int r5 = r5 + 1
            goto L_0x015c
        L_0x01f8:
            int r1 = r2.A00     // Catch:{ IOException | JSONException -> 0x0239 }
            int r0 = r4.length()     // Catch:{ IOException | JSONException -> 0x0239 }
            int r1 = r1 + r0
            r2.A00 = r1     // Catch:{ IOException | JSONException -> 0x0239 }
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ IOException | JSONException -> 0x0239 }
            java.util.ArrayList r0 = r2.A03     // Catch:{ IOException | JSONException -> 0x0239 }
            int r0 = r0.size()     // Catch:{ IOException | JSONException -> 0x0239 }
            r1.append(r0)     // Catch:{ IOException | JSONException -> 0x0239 }
            java.lang.String r0 = " images"
            X.C18260x0.A1L(r1, r0)     // Catch:{ IOException | JSONException -> 0x0239 }
        L_0x0213:
            java.util.ArrayList r0 = r2.A03     // Catch:{ IOException | JSONException -> 0x0239 }
            return r0
        L_0x0216:
            r1 = move-exception
            r3.close()     // Catch:{ all -> 0x021b }
            goto L_0x022e
        L_0x021b:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x022f }
            goto L_0x022e
        L_0x0220:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x022f }
            java.lang.String r0 = "Communication failed, status="
            java.lang.String r0 = X.AnonymousClass000.A0Y(r0, r1, r3)     // Catch:{ all -> 0x022f }
            java.io.IOException r1 = X.AnonymousClass002.A0C(r0)     // Catch:{ all -> 0x022f }
        L_0x022e:
            throw r1     // Catch:{ all -> 0x022f }
        L_0x022f:
            r1 = move-exception
            r4.close()     // Catch:{ all -> 0x0234 }
            goto L_0x0238
        L_0x0234:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ IOException | JSONException -> 0x0239 }
        L_0x0238:
            throw r1     // Catch:{ IOException | JSONException -> 0x0239 }
        L_0x0239:
            r0 = move-exception
            com.whatsapp.util.Log.e((java.lang.Throwable) r0)
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass54Q.A08(java.lang.Object[]):java.lang.Object");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0024, code lost:
        if (r6.A0K.size() >= 100) goto L_0x0026;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ void A0C(java.lang.Object r9) {
        /*
            r8 = this;
            java.util.List r9 = (java.util.List) r9
            X.4OV r5 = r8.A00
            com.whatsapp.profile.WebImagePicker r6 = r5.A02
            android.widget.ProgressBar r0 = r6.A06
            r7 = 8
            r0.setVisibility(r7)
            X.7PX r0 = r6.A0E
            int r1 = r0.A01
            int r0 = r0.A00
            boolean r0 = X.C86624Kv.A1W(r1, r0)
            r1 = 1
            r4 = 0
            if (r0 == 0) goto L_0x0026
            java.util.ArrayList r0 = r6.A0K
            int r3 = r0.size()
            r0 = 100
            r2 = 1
            if (r3 < r0) goto L_0x0027
        L_0x0026:
            r2 = 0
        L_0x0027:
            r5.A01 = r2
            android.view.View r0 = r6.A04
            if (r2 == 0) goto L_0x006f
            r0.setVisibility(r7)
            android.view.View r0 = r6.A05
            r0.setVisibility(r4)
        L_0x0035:
            r0 = 0
            r5.A00 = r0
            if (r9 == 0) goto L_0x0042
            java.util.ArrayList r0 = r6.A0K
            r9.removeAll(r0)
            r0.addAll(r9)
        L_0x0042:
            java.util.ArrayList r0 = r6.A0K
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x005c
            android.widget.ListView r0 = r6.getListView()
            android.view.View r3 = r0.getEmptyView()
            android.widget.TextView r3 = (android.widget.TextView) r3
            if (r9 != 0) goto L_0x0060
            r0 = 2131892576(0x7f121960, float:1.9419904E38)
            r3.setText(r0)
        L_0x005c:
            r5.notifyDataSetChanged()
            return
        L_0x0060:
            r2 = 2131892566(0x7f121956, float:1.9419884E38)
            java.lang.Object[] r1 = new java.lang.Object[r1]
            X.7PX r0 = r6.A0E
            java.lang.String r0 = r0.A02
            r1[r4] = r0
            X.AnonymousClass001.A0y(r6, r3, r1, r2)
            goto L_0x005c
        L_0x006f:
            r0.setVisibility(r4)
            android.view.View r0 = r6.A05
            r0.setVisibility(r7)
            goto L_0x0035
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass54Q.A0C(java.lang.Object):void");
    }
}
