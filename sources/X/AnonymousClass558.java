package X;

import android.content.Context;
import android.location.Location;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.whatsapp.R;
import com.whatsapp.location.LocationPicker;
import com.whatsapp.location.LocationPicker2;
import com.whatsapp.location.PlaceInfo;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.558  reason: invalid class name */
public class AnonymousClass558 extends AnonymousClass5ZM {
    public int A00;
    public Location A01;
    public String A02;
    public boolean A03;
    public boolean A04;
    public final /* synthetic */ C108145cU A05;

    public AnonymousClass558(Location location, C108145cU r2, String str, int i, boolean z, boolean z2) {
        this.A05 = r2;
        this.A01 = location;
        this.A02 = str;
        this.A00 = i;
        this.A04 = z;
        this.A03 = z2;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(17:27|28|(1:30)|31|32|33|34|(1:36)|37|(3:39|40|(1:42))|43|44|(3:46|(12:49|50|51|(1:55)|56|(9:58|(1:60)|62|63|(3:65|(1:69)|70)|71|(3:75|(1:79)|80)|81|(3:85|(1:89)|90))|91|(2:93|(1:(2:95|(1:100)(3:156|99|101))(1:157)))|108|155|113|47)|153)(1:114)|115|116|117|(1:119)) */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x02ab, code lost:
        if (r12 != null) goto L_0x02ad;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x02ad, code lost:
        r1 = r12.optJSONObject(androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility.JSON_KEY_ICON);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x02b3, code lost:
        if (r1 == null) goto L_0x02cb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x02b5, code lost:
        r0 = r1.optString("prefix");
        r10.A05 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x02bd, code lost:
        if (r0 == null) goto L_0x02cb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x02bf, code lost:
        r10.A05 = X.AnonymousClass000.A0X("64.png", X.AnonymousClass000.A0l(r0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x021a, code lost:
        if (r1.length() == 0) goto L_0x021c;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:43:0x0179 */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x02db A[Catch:{ JSONException -> 0x02d1, all -> 0x031a }] */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x0313 A[Catch:{ all -> 0x031f, JSONException -> 0x0324, IOException -> 0x0338 }] */
    /* JADX WARNING: Removed duplicated region for block: B:134:0x0364  */
    /* JADX WARNING: Removed duplicated region for block: B:150:0x007a A[EDGE_INSN: B:150:0x007a->B:13:0x007a ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0086  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x00a1  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0181 A[Catch:{ JSONException -> 0x02d1, all -> 0x031a }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ java.lang.Object A08(java.lang.Object[] r25) {
        /*
            r24 = this;
            r1 = r24
            X.5cU r0 = r1.A05
            X.5OZ r8 = r0.A1P
            android.location.Location r7 = r1.A01
            int r6 = r1.A00
            java.lang.String r5 = r1.A02
            if (r5 != 0) goto L_0x0010
            java.lang.String r5 = ""
        L_0x0010:
            java.lang.String r0 = "placelist/getplaces"
            com.whatsapp.util.Log.d((java.lang.String) r0)
            java.util.ArrayList r14 = r8.A05
            java.util.Iterator r12 = r14.iterator()
        L_0x001b:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L_0x00c6
            java.lang.Object r4 = r12.next()
            X.5dv r4 = (X.C109005dv) r4
            java.lang.String r0 = r4.A0E
            boolean r0 = r0.equalsIgnoreCase(r5)
            if (r0 == 0) goto L_0x001b
            android.location.Location r0 = r4.A00()
            X.C626936e.A06(r0)
            float r0 = r0.distanceTo(r7)
            double r0 = (double) r0
            int r11 = r4.A0C
            int r2 = r11 + r6
            double r2 = (double) r2
            r9 = 4596373779694328218(0x3fc999999999999a, double:0.2)
            double r2 = r2 * r9
            r9 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r2 = r2 / r9
            int r9 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r9 >= 0) goto L_0x001b
            int r0 = X.AnonymousClass001.A0A(r11, r6)
            double r0 = (double) r0
            int r9 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r9 >= 0) goto L_0x001b
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "placelist/getplaces/cached/size:"
            r1.append(r0)
            java.util.List r0 = r4.A0F
            int r0 = r0.size()
            X.C18260x0.A1F(r1, r0)
            r0 = 1
            r4.A09 = r0
            java.lang.String r0 = r8.A04
            r4.A07 = r0
            java.util.concurrent.atomic.AtomicInteger r0 = r8.A06
            int r0 = r0.getAndIncrement()
            r4.A00 = r0
            r8.A00(r4)
        L_0x007a:
            X.C626936e.A06(r4)
            java.lang.Integer r0 = r4.A02
            int r1 = r0.intValue()
            r0 = 1
            if (r1 != r0) goto L_0x0095
            r14.add(r4)
            int r1 = r14.size()
            r0 = 12
            if (r1 <= r0) goto L_0x0095
            r0 = 0
            r14.remove(r0)
        L_0x0095:
            java.util.List r6 = r4.A0F
            java.util.Iterator r5 = r6.iterator()
        L_0x009b:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x0375
            java.lang.Object r3 = r5.next()
            com.whatsapp.location.PlaceInfo r3 = (com.whatsapp.location.PlaceInfo) r3
            android.location.Location r2 = r3.A0C
            if (r2 != 0) goto L_0x00be
            java.lang.String r0 = ""
            android.location.Location r2 = new android.location.Location
            r2.<init>(r0)
            double r0 = r3.A01
            r2.setLatitude(r0)
            double r0 = r3.A02
            r2.setLongitude(r0)
            r3.A0C = r2
        L_0x00be:
            float r0 = r2.distanceTo(r7)
            double r0 = (double) r0
            r3.A00 = r0
            goto L_0x009b
        L_0x00c6:
            r22 = 1
            r2 = 0
        L_0x00c9:
            r21 = 3
            r20 = 4
            long r18 = android.os.SystemClock.uptimeMillis()     // Catch:{ JSONException -> 0x0324, IOException -> 0x0338 }
            X.5dv r4 = new X.5dv     // Catch:{ JSONException -> 0x0324, IOException -> 0x0338 }
            r4.<init>(r7, r5, r6)     // Catch:{ JSONException -> 0x0324, IOException -> 0x0338 }
            android.net.Uri$Builder r3 = new android.net.Uri$Builder     // Catch:{ JSONException -> 0x0324, IOException -> 0x0338 }
            r3.<init>()     // Catch:{ JSONException -> 0x0324, IOException -> 0x0338 }
            java.lang.String r0 = X.C58172up.A0C     // Catch:{ JSONException -> 0x0324, IOException -> 0x0338 }
            r3.encodedPath(r0)     // Catch:{ JSONException -> 0x0324, IOException -> 0x0338 }
            java.lang.String r1 = "client_secret"
            java.lang.String r0 = X.C58172up.A0E     // Catch:{ JSONException -> 0x0324, IOException -> 0x0338 }
            r3.appendQueryParameter(r1, r0)     // Catch:{ JSONException -> 0x0324, IOException -> 0x0338 }
            java.lang.String r1 = "client_id"
            java.lang.String r0 = X.C58172up.A0D     // Catch:{ JSONException -> 0x0324, IOException -> 0x0338 }
            r3.appendQueryParameter(r1, r0)     // Catch:{ JSONException -> 0x0324, IOException -> 0x0338 }
            java.lang.String r1 = "v"
            java.lang.String r0 = X.C58172up.A0F     // Catch:{ JSONException -> 0x0324, IOException -> 0x0338 }
            r3.appendQueryParameter(r1, r0)     // Catch:{ JSONException -> 0x0324, IOException -> 0x0338 }
            java.lang.StringBuilder r9 = X.AnonymousClass001.A0o()     // Catch:{ JSONException -> 0x0324, IOException -> 0x0338 }
            double r0 = r7.getLatitude()     // Catch:{ JSONException -> 0x0324, IOException -> 0x0338 }
            r9.append(r0)     // Catch:{ JSONException -> 0x0324, IOException -> 0x0338 }
            java.lang.String r0 = ","
            r9.append(r0)     // Catch:{ JSONException -> 0x0324, IOException -> 0x0338 }
            double r0 = r7.getLongitude()     // Catch:{ JSONException -> 0x0324, IOException -> 0x0338 }
            r9.append(r0)     // Catch:{ JSONException -> 0x0324, IOException -> 0x0338 }
            java.lang.String r1 = r9.toString()     // Catch:{ JSONException -> 0x0324, IOException -> 0x0338 }
            java.lang.String r0 = "ll"
            r3.appendQueryParameter(r0, r1)     // Catch:{ JSONException -> 0x0324, IOException -> 0x0338 }
            r0 = 99999(0x1869f, float:1.40128E-40)
            int r0 = java.lang.Math.min(r6, r0)     // Catch:{ JSONException -> 0x0324, IOException -> 0x0338 }
            java.lang.String r1 = java.lang.Integer.toString(r0)     // Catch:{ JSONException -> 0x0324, IOException -> 0x0338 }
            java.lang.String r0 = "radius"
            r3.appendQueryParameter(r0, r1)     // Catch:{ JSONException -> 0x0324, IOException -> 0x0338 }
            boolean r0 = android.text.TextUtils.isEmpty(r5)     // Catch:{ JSONException -> 0x0324, IOException -> 0x0338 }
            if (r0 != 0) goto L_0x0130
            java.lang.String r0 = "query"
            r3.appendQueryParameter(r0, r5)     // Catch:{ JSONException -> 0x0324, IOException -> 0x0338 }
        L_0x0130:
            android.net.Uri r0 = r3.build()     // Catch:{ JSONException -> 0x0324, IOException -> 0x0338 }
            java.lang.String r1 = r0.toString()     // Catch:{ JSONException -> 0x0324, IOException -> 0x0338 }
            X.33K r0 = r8.A03     // Catch:{ JSONException -> 0x0324, IOException -> 0x0338 }
            X.4GL r11 = r0.A04(r1)     // Catch:{ JSONException -> 0x0324, IOException -> 0x0338 }
            java.lang.String r1 = "X-RateLimit-Limit"
            r0 = r11
            X.3PZ r0 = (X.AnonymousClass3PZ) r0     // Catch:{ all -> 0x031a }
            java.net.HttpURLConnection r3 = r0.A01     // Catch:{ all -> 0x031a }
            java.lang.String r9 = r3.getHeaderField(r1)     // Catch:{ all -> 0x031a }
            if (r9 == 0) goto L_0x0154
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x031a }
            java.lang.String r0 = "placelist/getplaces/foursquare/X-RateLimit-Limit:"
            X.C18260x0.A0s(r0, r9, r1)     // Catch:{ all -> 0x031a }
        L_0x0154:
            java.lang.String r0 = "X-RateLimit-Remaining"
            java.lang.String r9 = r3.getHeaderField(r0)     // Catch:{ all -> 0x031a }
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x031a }
            java.lang.String r0 = "placelist/getplaces/foursquare/X-RateLimit-Remaining:"
            X.C18260x0.A0s(r0, r9, r1)     // Catch:{ all -> 0x031a }
            boolean r0 = android.text.TextUtils.isEmpty(r9)     // Catch:{ all -> 0x031a }
            if (r0 != 0) goto L_0x0179
            int r0 = java.lang.Integer.parseInt(r9)     // Catch:{ NumberFormatException -> 0x0179 }
            if (r0 != 0) goto L_0x0179
            java.lang.Integer r0 = java.lang.Integer.valueOf(r21)     // Catch:{ NumberFormatException -> 0x0179 }
            r4.A02 = r0     // Catch:{ NumberFormatException -> 0x0179 }
            java.lang.String r0 = "error_out_of_quota"
            r4.A06 = r0     // Catch:{ NumberFormatException -> 0x0179 }
        L_0x0179:
            int r1 = r3.getResponseCode()     // Catch:{ all -> 0x031a }
            r0 = 200(0xc8, float:2.8E-43)
            if (r1 != r0) goto L_0x02db
            X.2s4 r3 = r8.A01     // Catch:{ all -> 0x031a }
            r0 = 24
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x031a }
            r0 = 0
            java.io.InputStream r0 = r11.B47(r3, r0, r1)     // Catch:{ all -> 0x031a }
            org.json.JSONObject r1 = X.C624535b.A02(r0)     // Catch:{ all -> 0x031a }
            java.util.List r0 = r4.A0F     // Catch:{ all -> 0x031a }
            r23 = r0
            java.lang.String r0 = "response"
            org.json.JSONObject r1 = r1.getJSONObject(r0)     // Catch:{ all -> 0x031a }
            java.lang.String r0 = "venues"
            org.json.JSONArray r17 = r1.getJSONArray(r0)     // Catch:{ all -> 0x031a }
            r13 = 0
        L_0x01a3:
            int r0 = r17.length()     // Catch:{ all -> 0x031a }
            if (r13 >= r0) goto L_0x02f4
            r0 = r17
            org.json.JSONObject r12 = r0.getJSONObject(r13)     // Catch:{ JSONException -> 0x02d1 }
            com.whatsapp.location.PlaceInfo r10 = new com.whatsapp.location.PlaceInfo     // Catch:{ JSONException -> 0x02d1 }
            r10.<init>()     // Catch:{ JSONException -> 0x02d1 }
            r0 = 0
            X.C162457s7.A0J(r12, r0)     // Catch:{ JSONException -> 0x02d1 }
            r0 = r21
            r10.A03 = r0     // Catch:{ JSONException -> 0x02d1 }
            java.lang.String r0 = "name"
            java.lang.String r0 = r12.getString(r0)     // Catch:{ JSONException -> 0x02d1 }
            r10.A06 = r0     // Catch:{ JSONException -> 0x02d1 }
            java.lang.String r0 = "url"
            java.lang.String r0 = r12.optString(r0)     // Catch:{ JSONException -> 0x02d1 }
            r10.A0A = r0     // Catch:{ JSONException -> 0x02d1 }
            java.lang.String r0 = "id"
            java.lang.String r3 = r12.optString(r0)     // Catch:{ JSONException -> 0x02d1 }
            r10.A08 = r3     // Catch:{ JSONException -> 0x02d1 }
            java.lang.String r0 = r10.A0A     // Catch:{ JSONException -> 0x02d1 }
            r9 = 0
            if (r0 == 0) goto L_0x01df
            int r0 = r0.length()     // Catch:{ JSONException -> 0x02d1 }
            if (r0 != 0) goto L_0x01eb
        L_0x01df:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ JSONException -> 0x02d1 }
            java.lang.String r0 = "https://foursquare.com/v/"
            java.lang.String r0 = X.AnonymousClass000.A0V(r0, r3, r1)     // Catch:{ JSONException -> 0x02d1 }
            r10.A0A = r0     // Catch:{ JSONException -> 0x02d1 }
        L_0x01eb:
            java.lang.String r0 = "location"
            org.json.JSONObject r3 = r12.getJSONObject(r0)     // Catch:{ JSONException -> 0x02d1 }
            if (r3 == 0) goto L_0x0285
            java.lang.String r0 = "lat"
            double r0 = r3.optDouble(r0)     // Catch:{ JSONException -> 0x02d1 }
            r10.A01 = r0     // Catch:{ JSONException -> 0x02d1 }
            java.lang.String r0 = "lng"
            double r0 = r3.optDouble(r0)     // Catch:{ JSONException -> 0x02d1 }
            r10.A02 = r0     // Catch:{ JSONException -> 0x02d1 }
            java.lang.String r0 = "address"
            java.lang.String r0 = r3.optString(r0)     // Catch:{ JSONException -> 0x02d1 }
            r10.A04 = r0     // Catch:{ JSONException -> 0x02d1 }
            r10.A0B = r0     // Catch:{ JSONException -> 0x02d1 }
            java.lang.String r0 = "city"
            java.lang.String r1 = r3.optString(r0)     // Catch:{ JSONException -> 0x02d1 }
            if (r1 == 0) goto L_0x021c
            int r15 = r1.length()     // Catch:{ JSONException -> 0x02d1 }
            r0 = 0
            if (r15 != 0) goto L_0x021d
        L_0x021c:
            r0 = 1
        L_0x021d:
            java.lang.String r15 = ", "
            if (r0 != 0) goto L_0x0237
            java.lang.String r0 = r10.A04     // Catch:{ JSONException -> 0x02d1 }
            if (r0 == 0) goto L_0x0231
            int r16 = r0.length()     // Catch:{ JSONException -> 0x02d1 }
            if (r16 == 0) goto L_0x0231
            java.lang.String r0 = X.AnonymousClass000.A0T(r0, r15)     // Catch:{ JSONException -> 0x02d1 }
            r10.A04 = r0     // Catch:{ JSONException -> 0x02d1 }
        L_0x0231:
            java.lang.String r0 = X.AnonymousClass000.A0T(r0, r1)     // Catch:{ JSONException -> 0x02d1 }
            r10.A04 = r0     // Catch:{ JSONException -> 0x02d1 }
        L_0x0237:
            java.lang.String r0 = "state"
            java.lang.String r1 = r3.optString(r0)     // Catch:{ JSONException -> 0x02d1 }
            if (r1 == 0) goto L_0x025b
            int r0 = r1.length()     // Catch:{ JSONException -> 0x02d1 }
            if (r0 == 0) goto L_0x025b
            java.lang.String r0 = r10.A04     // Catch:{ JSONException -> 0x02d1 }
            if (r0 == 0) goto L_0x0255
            int r16 = r0.length()     // Catch:{ JSONException -> 0x02d1 }
            if (r16 == 0) goto L_0x0255
            java.lang.String r0 = X.AnonymousClass000.A0T(r0, r15)     // Catch:{ JSONException -> 0x02d1 }
            r10.A04 = r0     // Catch:{ JSONException -> 0x02d1 }
        L_0x0255:
            java.lang.String r0 = X.AnonymousClass000.A0T(r0, r1)     // Catch:{ JSONException -> 0x02d1 }
            r10.A04 = r0     // Catch:{ JSONException -> 0x02d1 }
        L_0x025b:
            java.lang.String r0 = "postalCode"
            java.lang.String r3 = r3.optString(r0)     // Catch:{ JSONException -> 0x02d1 }
            if (r3 == 0) goto L_0x0285
            int r0 = r3.length()     // Catch:{ JSONException -> 0x02d1 }
            if (r0 == 0) goto L_0x0285
            java.lang.String r1 = r10.A04     // Catch:{ JSONException -> 0x02d1 }
            if (r1 == 0) goto L_0x027f
            int r0 = r1.length()     // Catch:{ JSONException -> 0x02d1 }
            if (r0 == 0) goto L_0x027f
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0l(r1)     // Catch:{ JSONException -> 0x02d1 }
            r0 = 32
            java.lang.String r1 = X.AnonymousClass001.A0j(r1, r0)     // Catch:{ JSONException -> 0x02d1 }
            r10.A04 = r1     // Catch:{ JSONException -> 0x02d1 }
        L_0x027f:
            java.lang.String r0 = X.AnonymousClass000.A0T(r1, r3)     // Catch:{ JSONException -> 0x02d1 }
            r10.A04 = r0     // Catch:{ JSONException -> 0x02d1 }
        L_0x0285:
            java.lang.String r0 = "categories"
            org.json.JSONArray r15 = r12.optJSONArray(r0)     // Catch:{ JSONException -> 0x02d1 }
            if (r15 == 0) goto L_0x02cb
            org.json.JSONObject r12 = r15.optJSONObject(r9)     // Catch:{ JSONException -> 0x02d1 }
            int r3 = r15.length()     // Catch:{ JSONException -> 0x02d1 }
        L_0x0295:
            if (r9 >= r3) goto L_0x02ab
            org.json.JSONObject r1 = r15.optJSONObject(r9)     // Catch:{ JSONException -> 0x02d1 }
            if (r1 == 0) goto L_0x02a6
            java.lang.String r0 = "primary"
            boolean r0 = r1.optBoolean(r0)     // Catch:{ JSONException -> 0x02d1 }
            if (r0 == 0) goto L_0x02a6
            goto L_0x02a9
        L_0x02a6:
            int r9 = r9 + 1
            goto L_0x0295
        L_0x02a9:
            r12 = r1
            goto L_0x02ad
        L_0x02ab:
            if (r12 == 0) goto L_0x02cb
        L_0x02ad:
            java.lang.String r0 = "icon"
            org.json.JSONObject r1 = r12.optJSONObject(r0)     // Catch:{ JSONException -> 0x02d1 }
            if (r1 == 0) goto L_0x02cb
            java.lang.String r0 = "prefix"
            java.lang.String r0 = r1.optString(r0)     // Catch:{ JSONException -> 0x02d1 }
            r10.A05 = r0     // Catch:{ JSONException -> 0x02d1 }
            if (r0 == 0) goto L_0x02cb
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0l(r0)     // Catch:{ JSONException -> 0x02d1 }
            java.lang.String r0 = "64.png"
            java.lang.String r0 = X.AnonymousClass000.A0X(r0, r1)     // Catch:{ JSONException -> 0x02d1 }
            r10.A05 = r0     // Catch:{ JSONException -> 0x02d1 }
        L_0x02cb:
            r0 = r23
            r0.add(r10)     // Catch:{ JSONException -> 0x02d1 }
            goto L_0x02d7
        L_0x02d1:
            r1 = move-exception
            java.lang.String r0 = "placelist/getplaces/foursquare/json-exception"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x031a }
        L_0x02d7:
            int r13 = r13 + 1
            goto L_0x01a3
        L_0x02db:
            java.lang.Integer r0 = X.C18290x4.A0c()     // Catch:{ all -> 0x031a }
            r4.A02 = r0     // Catch:{ all -> 0x031a }
            int r0 = r3.getResponseCode()     // Catch:{ all -> 0x031a }
            java.lang.String r3 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x031a }
            r4.A06 = r3     // Catch:{ all -> 0x031a }
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x031a }
            java.lang.String r0 = "placelist/getplaces/foursquare/error-status:"
            X.C18260x0.A0r(r0, r3, r1)     // Catch:{ all -> 0x031a }
        L_0x02f4:
            long r0 = X.C18310x6.A0A(r18)     // Catch:{ all -> 0x031a }
            r4.A01 = r0     // Catch:{ all -> 0x031a }
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x031a }
            java.lang.String r0 = "placelist/getplaces/foursquare/count:"
            r1.append(r0)     // Catch:{ all -> 0x031a }
            java.util.List r0 = r4.A0F     // Catch:{ all -> 0x031a }
            int r0 = r0.size()     // Catch:{ all -> 0x031a }
            X.C18260x0.A1F(r1, r0)     // Catch:{ all -> 0x031a }
            r11.close()     // Catch:{ JSONException -> 0x0324, IOException -> 0x0338 }
            java.lang.Integer r0 = r4.A02     // Catch:{ JSONException -> 0x0324, IOException -> 0x0338 }
            if (r0 != 0) goto L_0x034d
            java.lang.Integer r0 = java.lang.Integer.valueOf(r22)     // Catch:{ JSONException -> 0x0324, IOException -> 0x0338 }
            r4.A02 = r0     // Catch:{ JSONException -> 0x0324, IOException -> 0x0338 }
            goto L_0x034d
        L_0x031a:
            r1 = move-exception
            r11.close()     // Catch:{ all -> 0x031f }
            goto L_0x0323
        L_0x031f:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ JSONException -> 0x0324, IOException -> 0x0338 }
        L_0x0323:
            throw r1     // Catch:{ JSONException -> 0x0324, IOException -> 0x0338 }
        L_0x0324:
            r1 = move-exception
            java.lang.String r0 = "placelist/getplaces/json-exception"
            com.whatsapp.util.Log.e(r0, r1)
            X.5dv r4 = new X.5dv
            r4.<init>(r7, r5, r6)
            java.lang.Integer r0 = X.C18290x4.A0c()
            r4.A02 = r0
            java.lang.String r0 = "error_json"
            goto L_0x034b
        L_0x0338:
            r1 = move-exception
            java.lang.String r0 = "placelist/getplaces/io-exception"
            com.whatsapp.util.Log.e(r0, r1)
            X.5dv r4 = new X.5dv
            r4.<init>(r7, r5, r6)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r20)
            r4.A02 = r0
            java.lang.String r0 = "error_communication"
        L_0x034b:
            r4.A06 = r0
        L_0x034d:
            java.lang.String r0 = r8.A04
            r4.A07 = r0
            java.util.concurrent.atomic.AtomicInteger r0 = r8.A06
            int r0 = r0.getAndIncrement()
            r4.A00 = r0
            r8.A00(r4)
            java.util.List r0 = r4.A0F
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x007a
            java.lang.Integer r0 = r4.A02
            int r1 = r0.intValue()
            r0 = r20
            if (r1 == r0) goto L_0x007a
            int r2 = r2 + 1
            r0 = 2
            if (r2 >= r0) goto L_0x007a
            goto L_0x00c9
        L_0x0375:
            r0 = 39
            X.C86614Ku.A1U(r6, r0)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass558.A08(java.lang.Object[]):java.lang.Object");
    }

    public /* bridge */ /* synthetic */ void A0C(Object obj) {
        AnonymousClass7UM r1;
        C109005dv r12 = (C109005dv) obj;
        if (!C18320x8.A1T(this)) {
            C108145cU r9 = this.A05;
            r9.A0g = r12;
            r9.A0U.setVisibility(8);
            r9.A0V.setVisibility(8);
            boolean z = false;
            if (r9.A0g.A0F.isEmpty()) {
                r9.A0z.A0H(R.string.f11nameremoved, 1);
                C18280x3.A0r(r9.A0X, R.id.places_empty, 0);
            } else {
                C18280x3.A0r(r9.A0X, R.id.places_empty, 8);
            }
            r9.A09();
            r9.A0B();
            r9.A0D();
            if (this.A04 && !r9.A0g.A0F.isEmpty()) {
                ArrayList A0s = AnonymousClass001.A0s();
                for (PlaceInfo placeInfo : r9.A0g.A0F) {
                    A0s.add(AnonymousClass4L0.A0H(placeInfo.A01, placeInfo.A02));
                }
                if (r9.A0g.A0F.size() <= 1) {
                    z = true;
                }
                AnonymousClass5Q9 r122 = new AnonymousClass5Q9();
                Iterator it = A0s.iterator();
                while (it.hasNext()) {
                    r122.A01((LatLng) it.next());
                }
                LatLngBounds A002 = r122.A00();
                LatLng latLng = A002.A00;
                double d = latLng.A00;
                LatLng latLng2 = A002.A01;
                double d2 = latLng2.A00;
                double d3 = latLng.A01;
                double d4 = latLng2.A01;
                double d5 = (d - d2) / 10.0d;
                double d6 = (d3 - d4) / 10.0d;
                r122.A01(AnonymousClass4L0.A0H(d + d5, d3 + d6));
                r122.A01(AnonymousClass4L0.A0H(d2 - d5, d4 - d6));
                LatLngBounds A003 = r122.A00();
                AnonymousClass68A r13 = (AnonymousClass68A) r9;
                if (r13.A02 != 0) {
                    LocationPicker2 locationPicker2 = (LocationPicker2) r13.A01;
                    AnonymousClass7E1 r14 = locationPicker2.A0V;
                    if (r14 != null) {
                        Context context = locationPicker2.A00.getContext();
                        if (z) {
                            C105415Uv r11 = r14.A00;
                            LatLng latLng3 = A003.A01;
                            double d7 = latLng3.A00;
                            LatLng latLng4 = A003.A00;
                            double d8 = (d7 + latLng4.A00) / 2.0d;
                            double d9 = latLng4.A01;
                            double d10 = latLng3.A01;
                            if (d10 > d9) {
                                d9 += 360.0d;
                            }
                            r11.A09(C106555Zl.A02(AnonymousClass4L0.A0H(d8, (d9 + d10) / 2.0d), 15.0f));
                        } else {
                            r14.A00.A09(C106555Zl.A03(A003, context.getResources().getDimensionPixelSize(R.dimen.f6nameremoved)));
                        }
                    }
                } else {
                    LocationPicker locationPicker = (LocationPicker) r13.A01;
                    if (locationPicker.A03 != null) {
                        C108995du r3 = new C108995du(C108975ds.A02(A003.A01), C108975ds.A02(A003.A00));
                        C110885hC r2 = locationPicker.A03;
                        if (z) {
                            r1 = C153847c7.A01(r3.A00(), 15.0f);
                        } else {
                            int dimensionPixelSize = locationPicker.getResources().getDimensionPixelSize(R.dimen.f6nameremoved);
                            r1 = new AnonymousClass7UM();
                            r1.A07 = r3;
                            r1.A05 = dimensionPixelSize;
                        }
                        r2.A09(r1);
                    }
                }
            }
            if (this.A03 && r9.A0p) {
                r9.A0p = false;
                r9.A0P(Float.valueOf(-0.5f), true);
            }
        }
    }
}
