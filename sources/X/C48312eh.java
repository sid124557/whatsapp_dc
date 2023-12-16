package X;

import android.content.Context;

/* renamed from: X.2eh  reason: invalid class name and case insensitive filesystem */
public class C48312eh {
    public Context A00;

    /* JADX WARNING: Code restructure failed: missing block: B:22:?, code lost:
        r2.put("Latitude", "");
        r2.put("Longitude", "");
        r2.put("Provider", "");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0087, code lost:
        return r2;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x007e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final org.json.JSONObject A01() {
        /*
            r10 = this;
            java.lang.String r9 = ""
            android.content.Context r1 = r10.A00
            if (r1 != 0) goto L_0x0008
            r0 = 0
            return r0
        L_0x0008:
            java.lang.String r0 = "location"
            java.lang.Object r4 = r1.getSystemService(r0)
            android.location.LocationManager r4 = (android.location.LocationManager) r4
            java.util.List r3 = r4.getAllProviders()
            android.content.pm.PackageManager r5 = r1.getPackageManager()
            java.lang.String r1 = r1.getPackageName()
            java.lang.String r0 = "android.permission.ACCESS_COARSE_LOCATION"
            int r2 = r5.checkPermission(r0, r1)
            java.lang.String r0 = "android.permission.ACCESS_FINE_LOCATION"
            int r1 = r5.checkPermission(r0, r1)
            org.json.JSONObject r8 = X.AnonymousClass0x9.A1G()
            java.lang.String r0 = "Latitude"
            r8.put(r0, r9)     // Catch:{ JSONException -> 0x003b }
            java.lang.String r0 = "Longitude"
            r8.put(r0, r9)     // Catch:{ JSONException -> 0x003b }
            java.lang.String r0 = "Provider"
            r8.put(r0, r9)     // Catch:{ JSONException -> 0x003b }
        L_0x003b:
            if (r2 == 0) goto L_0x003f
            if (r1 != 0) goto L_0x0088
        L_0x003f:
            int r2 = r3.size()     // Catch:{ Exception -> 0x0088 }
        L_0x0043:
            int r2 = r2 + -1
            if (r2 < 0) goto L_0x0088
            java.lang.String r1 = X.AnonymousClass001.A0n(r3, r2)     // Catch:{ Exception -> 0x0088 }
            java.lang.String r0 = "network"
            boolean r0 = r1.equals(r0)     // Catch:{ Exception -> 0x0088 }
            if (r0 == 0) goto L_0x0043
            java.lang.String r0 = X.AnonymousClass001.A0n(r3, r2)     // Catch:{ Exception -> 0x0088 }
            android.location.Location r7 = r4.getLastKnownLocation(r0)     // Catch:{ Exception -> 0x0088 }
            if (r7 == 0) goto L_0x0043
            java.lang.String r6 = X.AnonymousClass001.A0n(r3, r2)     // Catch:{ Exception -> 0x0088 }
            java.lang.String r5 = "Provider"
            java.lang.String r4 = "Longitude"
            java.lang.String r3 = "Latitude"
            org.json.JSONObject r2 = X.AnonymousClass0x9.A1G()     // Catch:{ Exception -> 0x0088 }
            double r0 = r7.getLatitude()     // Catch:{ Exception -> 0x007e }
            r2.put(r3, r0)     // Catch:{ Exception -> 0x007e }
            double r0 = r7.getLongitude()     // Catch:{ Exception -> 0x007e }
            r2.put(r4, r0)     // Catch:{ Exception -> 0x007e }
            r2.put(r5, r6)     // Catch:{ Exception -> 0x007e }
            return r2
        L_0x007e:
            r2.put(r3, r9)     // Catch:{ JSONException -> 0x0087 }
            r2.put(r4, r9)     // Catch:{ JSONException -> 0x0087 }
            r2.put(r5, r9)     // Catch:{ JSONException -> 0x0087 }
        L_0x0087:
            return r2
        L_0x0088:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C48312eh.A01():org.json.JSONObject");
    }

    public C48312eh(Context context) {
        this.A00 = context;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(122:0|1|2|3|4|5|6|7|8|9|(2:10|(2:12|(2:13|(3:15|(3:17|18|(1:193)(0))(1:192)|190)(1:191)))(2:189|20))|21|22|23|24|25|26|27|28|29|30|31|32|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|48|49|50|51|52|(4:53|54|55|56)|59|(2:61|62)(2:63|(1:65)(3:66|(1:69)|70))|73|74|75|(2:77|(2:79|(2:81|(1:83))(1:84))(1:85))(1:86)|87|88|89|90|91|92|93|94|95|96|97|98|99|100|101|102|103|104|105|106|107|108|109|110|111|112|113|114|115|116|117|(2:118|119)|122|123|124|(2:125|126)|129|130|131|(2:132|133)|136|137|(4:138|139|(1:149)(2:143|(3:145|(2:148|146)|194))|(2:151|152))|153|155|156|(1:158)|159|160|161|162|163|164|165|166|167|168|169|170|171|172|173|174|175|176|(1:178)|179|(2:180|181)|184|185|186|188) */
    /* JADX WARNING: Code restructure failed: missing block: B:72:?, code lost:
        r0 = 1;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:103:0x0239 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:107:0x024e */
    /* JADX WARNING: Missing exception handler attribute for start block: B:111:0x0263 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:115:0x0278 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:159:0x0328 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:166:0x039a */
    /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x00cb */
    /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x00fd */
    /* JADX WARNING: Missing exception handler attribute for start block: B:30:0x0111 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:35:0x0124 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:40:0x0138 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:45:0x014c */
    /* JADX WARNING: Missing exception handler attribute for start block: B:50:0x0160 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:6:0x006e */
    /* JADX WARNING: Missing exception handler attribute for start block: B:71:0x01ca */
    /* JADX WARNING: Missing exception handler attribute for start block: B:87:0x01f5 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:91:0x0206 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:95:0x0217 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:99:0x0228 */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0095 A[Catch:{ Exception -> 0x00cb }] */
    /* JADX WARNING: Removed duplicated region for block: B:143:0x02d4 A[Catch:{ Exception -> 0x0313 }] */
    /* JADX WARNING: Removed duplicated region for block: B:149:0x030c A[Catch:{ Exception -> 0x0313 }] */
    /* JADX WARNING: Removed duplicated region for block: B:151:0x030f A[SYNTHETIC, Splitter:B:151:0x030f] */
    /* JADX WARNING: Removed duplicated region for block: B:158:0x0320 A[Catch:{ Exception -> 0x0328 }] */
    /* JADX WARNING: Removed duplicated region for block: B:178:0x0409 A[Catch:{ JSONException -> 0x0450 }] */
    /* JADX WARNING: Removed duplicated region for block: B:189:0x00ca A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x018d A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x019c A[Catch:{ Exception -> 0x01ca }] */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x01e1 A[Catch:{ Exception -> 0x01f5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x01f3 A[Catch:{ Exception -> 0x01f5 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String A00() {
        /*
            r11 = this;
            org.json.JSONObject r5 = X.AnonymousClass0x9.A1G()
            java.lang.String r1 = "platform"
            java.lang.String r0 = "ANDROID"
            r5.put(r1, r0)     // Catch:{ JSONException -> 0x0450 }
            java.lang.String r1 = "deviceModel"
            java.lang.String r0 = android.os.Build.MODEL     // Catch:{ JSONException -> 0x0450 }
            r5.put(r1, r0)     // Catch:{ JSONException -> 0x0450 }
            java.lang.String r0 = "os"
            java.lang.String r2 = android.os.Build.VERSION.RELEASE     // Catch:{ JSONException -> 0x0450 }
            r5.put(r0, r2)     // Catch:{ JSONException -> 0x0450 }
            java.lang.String r1 = "osName"
            int r0 = android.os.Build.VERSION.SDK_INT     // Catch:{ JSONException -> 0x0450 }
            r5.put(r1, r0)     // Catch:{ JSONException -> 0x0450 }
            java.lang.String r1 = "locale"
            android.content.Context r3 = r11.A00     // Catch:{ JSONException -> 0x0450 }
            android.content.res.Configuration r0 = X.AnonymousClass001.A0M(r3)     // Catch:{ JSONException -> 0x0450 }
            java.util.Locale r0 = r0.locale     // Catch:{ JSONException -> 0x0450 }
            r5.put(r1, r0)     // Catch:{ JSONException -> 0x0450 }
            java.lang.String r1 = "timeZone"
            java.util.TimeZone r0 = java.util.TimeZone.getDefault()     // Catch:{ JSONException -> 0x0450 }
            java.lang.String r0 = r0.getID()     // Catch:{ JSONException -> 0x0450 }
            r5.put(r1, r0)     // Catch:{ JSONException -> 0x0450 }
            java.lang.String r0 = "advertisingId"
            java.lang.String r10 = ""
            r5.put(r0, r10)     // Catch:{ JSONException -> 0x0450 }
            java.lang.String r7 = "screenResolution"
            android.util.DisplayMetrics r6 = new android.util.DisplayMetrics     // Catch:{ JSONException -> 0x0450 }
            r6.<init>()     // Catch:{ JSONException -> 0x0450 }
            r0 = r3
            android.app.Activity r0 = (android.app.Activity) r0     // Catch:{ JSONException -> 0x0450 }
            android.view.WindowManager r0 = r0.getWindowManager()     // Catch:{ JSONException -> 0x0450 }
            android.view.Display r0 = r0.getDefaultDisplay()     // Catch:{ JSONException -> 0x0450 }
            r0.getMetrics(r6)     // Catch:{ JSONException -> 0x0450 }
            org.json.JSONObject r4 = X.AnonymousClass0x9.A1G()     // Catch:{ JSONException -> 0x0450 }
            java.lang.String r1 = "width"
            int r0 = r6.widthPixels     // Catch:{ Exception -> 0x006e }
            r4.put(r1, r0)     // Catch:{ Exception -> 0x006e }
            java.lang.String r1 = "height"
            int r0 = r6.heightPixels     // Catch:{ Exception -> 0x006e }
            r4.put(r1, r0)     // Catch:{ Exception -> 0x006e }
        L_0x006e:
            X.C18300x5.A1L(r4, r7, r5)     // Catch:{ JSONException -> 0x0450 }
            java.lang.String r4 = "deviceName"
            android.content.ContentResolver r1 = r3.getContentResolver()     // Catch:{ JSONException -> 0x0450 }
            java.lang.String r0 = "device_name"
            java.lang.String r0 = android.provider.Settings.System.getString(r1, r0)     // Catch:{ JSONException -> 0x0450 }
            r5.put(r4, r0)     // Catch:{ JSONException -> 0x0450 }
            java.lang.String r7 = "ipAddress"
            r6 = r10
            java.util.Enumeration r0 = java.net.NetworkInterface.getNetworkInterfaces()     // Catch:{ Exception -> 0x00cb }
            java.util.ArrayList r0 = java.util.Collections.list(r0)     // Catch:{ Exception -> 0x00cb }
            java.util.Iterator r8 = r0.iterator()     // Catch:{ Exception -> 0x00cb }
        L_0x008f:
            boolean r0 = r8.hasNext()     // Catch:{ Exception -> 0x00cb }
            if (r0 == 0) goto L_0x00ca
            java.lang.Object r0 = r8.next()     // Catch:{ Exception -> 0x00cb }
            java.net.NetworkInterface r0 = (java.net.NetworkInterface) r0     // Catch:{ Exception -> 0x00cb }
            java.util.Enumeration r0 = r0.getInetAddresses()     // Catch:{ Exception -> 0x00cb }
            java.util.ArrayList r0 = java.util.Collections.list(r0)     // Catch:{ Exception -> 0x00cb }
            java.util.Iterator r4 = r0.iterator()     // Catch:{ Exception -> 0x00cb }
        L_0x00a7:
            boolean r0 = r4.hasNext()     // Catch:{ Exception -> 0x00cb }
            if (r0 == 0) goto L_0x008f
            java.lang.Object r1 = r4.next()     // Catch:{ Exception -> 0x00cb }
            java.net.InetAddress r1 = (java.net.InetAddress) r1     // Catch:{ Exception -> 0x00cb }
            boolean r0 = r1.isLoopbackAddress()     // Catch:{ Exception -> 0x00cb }
            if (r0 != 0) goto L_0x00a7
            java.lang.String r6 = r1.getHostAddress()     // Catch:{ Exception -> 0x00cb }
            r0 = 58
            int r0 = r6.indexOf(r0)     // Catch:{ Exception -> 0x00cb }
            boolean r0 = X.AnonymousClass001.A1V(r0)
            if (r0 == 0) goto L_0x00a7
            goto L_0x00cb
        L_0x00ca:
            r6 = r10
        L_0x00cb:
            r5.put(r7, r6)     // Catch:{ JSONException -> 0x0450 }
            java.lang.String r4 = "latitude"
            org.json.JSONObject r1 = r11.A01()     // Catch:{ JSONException -> 0x0450 }
            java.lang.String r0 = "Latitude"
            java.lang.Object r0 = r1.get(r0)     // Catch:{ JSONException -> 0x0450 }
            r5.put(r4, r0)     // Catch:{ JSONException -> 0x0450 }
            java.lang.String r4 = "longitude"
            org.json.JSONObject r1 = r11.A01()     // Catch:{ JSONException -> 0x0450 }
            java.lang.String r0 = "Longitude"
            java.lang.Object r0 = r1.get(r0)     // Catch:{ JSONException -> 0x0450 }
            r5.put(r4, r0)     // Catch:{ JSONException -> 0x0450 }
            java.lang.String r6 = "deviceId"
            r4 = 0
            android.content.Context r0 = r3.getApplicationContext()     // Catch:{ Exception -> 0x00fd }
            android.content.ContentResolver r1 = r0.getContentResolver()     // Catch:{ Exception -> 0x00fd }
            java.lang.String r0 = "android_id"
            java.lang.String r4 = android.provider.Settings.Secure.getString(r1, r0)     // Catch:{ Exception -> 0x00fd }
        L_0x00fd:
            r5.put(r6, r4)     // Catch:{ JSONException -> 0x0450 }
            java.lang.String r4 = "subscriberId"
            r1 = 0
            java.lang.String r0 = "phone"
            java.lang.Object r0 = r3.getSystemService(r0)     // Catch:{ Exception -> 0x0111 }
            android.telephony.TelephonyManager r0 = (android.telephony.TelephonyManager) r0     // Catch:{ Exception -> 0x0111 }
            java.lang.String r1 = r0.getDeviceId()     // Catch:{ Exception -> 0x0111 }
        L_0x0111:
            r5.put(r4, r1)     // Catch:{ JSONException -> 0x0450 }
            java.lang.String r4 = "imie"
            r1 = 0
            java.lang.String r0 = "phone"
            java.lang.Object r0 = r3.getSystemService(r0)     // Catch:{ Exception -> 0x0124 }
            android.telephony.TelephonyManager r0 = (android.telephony.TelephonyManager) r0     // Catch:{ Exception -> 0x0124 }
            java.lang.String r1 = r0.getDeviceId()     // Catch:{ Exception -> 0x0124 }
        L_0x0124:
            r5.put(r4, r1)     // Catch:{ JSONException -> 0x0450 }
            java.lang.String r4 = "networkCountryISO"
            r1 = 0
            java.lang.String r0 = "phone"
            java.lang.Object r0 = r3.getSystemService(r0)     // Catch:{ Exception -> 0x0138 }
            android.telephony.TelephonyManager r0 = (android.telephony.TelephonyManager) r0     // Catch:{ Exception -> 0x0138 }
            java.lang.String r1 = r0.getNetworkCountryIso()     // Catch:{ Exception -> 0x0138 }
        L_0x0138:
            r5.put(r4, r1)     // Catch:{ JSONException -> 0x0450 }
            java.lang.String r4 = "networkOperator"
            r1 = 0
            java.lang.String r0 = "phone"
            java.lang.Object r0 = r3.getSystemService(r0)     // Catch:{ Exception -> 0x014c }
            android.telephony.TelephonyManager r0 = (android.telephony.TelephonyManager) r0     // Catch:{ Exception -> 0x014c }
            java.lang.String r1 = r0.getNetworkOperator()     // Catch:{ Exception -> 0x014c }
        L_0x014c:
            r5.put(r4, r1)     // Catch:{ JSONException -> 0x0450 }
            java.lang.String r4 = "networkOperatorName"
            r1 = 0
            java.lang.String r0 = "phone"
            java.lang.Object r0 = r3.getSystemService(r0)     // Catch:{ Exception -> 0x0160 }
            android.telephony.TelephonyManager r0 = (android.telephony.TelephonyManager) r0     // Catch:{ Exception -> 0x0160 }
            java.lang.String r1 = r0.getNetworkOperatorName()     // Catch:{ Exception -> 0x0160 }
        L_0x0160:
            r5.put(r4, r1)     // Catch:{ JSONException -> 0x0450 }
            java.lang.String r4 = "networkType"
            r1 = 0
            java.lang.String r0 = "phone"
            java.lang.Object r0 = r3.getSystemService(r0)     // Catch:{ Exception -> 0x0179 }
            android.telephony.TelephonyManager r0 = (android.telephony.TelephonyManager) r0     // Catch:{ Exception -> 0x0179 }
            int r0 = r0.getNetworkType()     // Catch:{ Exception -> 0x0179 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ JSONException -> 0x0450 }
            goto L_0x017d
        L_0x0179:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)     // Catch:{ JSONException -> 0x0450 }
        L_0x017d:
            r5.put(r4, r0)     // Catch:{ JSONException -> 0x0450 }
            java.lang.String r7 = "phoneCount"
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch:{ JSONException -> 0x0450 }
            r0 = 23
            java.lang.String r6 = "phone"
            r8 = 1
            if (r1 < r0) goto L_0x019c
            java.lang.Object r0 = r3.getSystemService(r6)     // Catch:{ Exception -> 0x01ca }
            android.telephony.TelephonyManager r0 = (android.telephony.TelephonyManager) r0     // Catch:{ Exception -> 0x01ca }
            int r8 = r0.getPhoneCount()     // Catch:{ Exception -> 0x01ca }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r8)     // Catch:{ Exception -> 0x01ca }
            goto L_0x01ce
        L_0x019c:
            r0 = 22
            if (r1 < r0) goto L_0x01b1
            android.telephony.SubscriptionManager r0 = android.telephony.SubscriptionManager.from(r3)     // Catch:{ Exception -> 0x01ca }
            java.util.List r0 = r0.getActiveSubscriptionInfoList()     // Catch:{ Exception -> 0x01ca }
            int r8 = r0.size()     // Catch:{ Exception -> 0x01ca }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r8)     // Catch:{ Exception -> 0x01ca }
            goto L_0x01ce
        L_0x01b1:
            java.lang.Object r4 = r3.getSystemService(r6)     // Catch:{ Exception -> 0x01ca }
            android.telephony.TelephonyManager r4 = (android.telephony.TelephonyManager) r4     // Catch:{ Exception -> 0x01ca }
            r0 = 0
            java.lang.String r1 = r4.getDeviceId(r0)     // Catch:{ Exception -> 0x01ca }
            java.lang.String r0 = r4.getDeviceId(r8)     // Catch:{ Exception -> 0x01ca }
            if (r1 == 0) goto L_0x01c5
            if (r0 == 0) goto L_0x01c5
            r8 = 2
        L_0x01c5:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r8)     // Catch:{ Exception -> 0x01ca }
            goto L_0x01ce
        L_0x01ca:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r8)     // Catch:{ JSONException -> 0x0450 }
        L_0x01ce:
            r5.put(r7, r0)     // Catch:{ JSONException -> 0x0450 }
            java.lang.String r7 = "phoneType"
            r4 = r10
            java.lang.Object r0 = r3.getSystemService(r6)     // Catch:{ Exception -> 0x01f5 }
            android.telephony.TelephonyManager r0 = (android.telephony.TelephonyManager) r0     // Catch:{ Exception -> 0x01f5 }
            int r1 = r0.getPhoneType()     // Catch:{ Exception -> 0x01f5 }
            if (r1 == 0) goto L_0x01f3
            r0 = 1
            if (r1 == r0) goto L_0x01f0
            r0 = 2
            if (r1 == r0) goto L_0x01ed
            r0 = 3
            if (r1 != r0) goto L_0x01f5
            java.lang.String r4 = "SIP"
            goto L_0x01f5
        L_0x01ed:
            java.lang.String r4 = "CDMA"
            goto L_0x01f5
        L_0x01f0:
            java.lang.String r4 = "GSM"
            goto L_0x01f5
        L_0x01f3:
            java.lang.String r4 = "NONE"
        L_0x01f5:
            r5.put(r7, r4)     // Catch:{ JSONException -> 0x0450 }
            java.lang.String r4 = "simCountryISO"
            r1 = 0
            java.lang.Object r0 = r3.getSystemService(r6)     // Catch:{ Exception -> 0x0206 }
            android.telephony.TelephonyManager r0 = (android.telephony.TelephonyManager) r0     // Catch:{ Exception -> 0x0206 }
            java.lang.String r1 = r0.getSimCountryIso()     // Catch:{ Exception -> 0x0206 }
        L_0x0206:
            r5.put(r4, r1)     // Catch:{ JSONException -> 0x0450 }
            java.lang.String r4 = "simOperator"
            r1 = 0
            java.lang.Object r0 = r3.getSystemService(r6)     // Catch:{ Exception -> 0x0217 }
            android.telephony.TelephonyManager r0 = (android.telephony.TelephonyManager) r0     // Catch:{ Exception -> 0x0217 }
            java.lang.String r1 = r0.getSimOperator()     // Catch:{ Exception -> 0x0217 }
        L_0x0217:
            r5.put(r4, r1)     // Catch:{ JSONException -> 0x0450 }
            java.lang.String r4 = "simOperatorName"
            r1 = 0
            java.lang.Object r0 = r3.getSystemService(r6)     // Catch:{ Exception -> 0x0228 }
            android.telephony.TelephonyManager r0 = (android.telephony.TelephonyManager) r0     // Catch:{ Exception -> 0x0228 }
            java.lang.String r1 = r0.getSimOperatorName()     // Catch:{ Exception -> 0x0228 }
        L_0x0228:
            r5.put(r4, r1)     // Catch:{ JSONException -> 0x0450 }
            java.lang.String r4 = "simSerialNumber"
            r1 = 0
            java.lang.Object r0 = r3.getSystemService(r6)     // Catch:{ Exception -> 0x0239 }
            android.telephony.TelephonyManager r0 = (android.telephony.TelephonyManager) r0     // Catch:{ Exception -> 0x0239 }
            java.lang.String r1 = r0.getSimSerialNumber()     // Catch:{ Exception -> 0x0239 }
        L_0x0239:
            r5.put(r4, r1)     // Catch:{ JSONException -> 0x0450 }
            java.lang.String r4 = "simState"
            r1 = 0
            java.lang.Object r0 = r3.getSystemService(r6)     // Catch:{ Exception -> 0x024e }
            android.telephony.TelephonyManager r0 = (android.telephony.TelephonyManager) r0     // Catch:{ Exception -> 0x024e }
            int r0 = r0.getSimState()     // Catch:{ Exception -> 0x024e }
            java.lang.String r1 = java.lang.String.valueOf(r0)     // Catch:{ Exception -> 0x024e }
        L_0x024e:
            r5.put(r4, r1)     // Catch:{ JSONException -> 0x0450 }
            java.lang.String r4 = "isNetworkRoaming"
            java.lang.Boolean r1 = java.lang.Boolean.FALSE     // Catch:{ JSONException -> 0x0450 }
            java.lang.Object r0 = r3.getSystemService(r6)     // Catch:{ Exception -> 0x0263 }
            android.telephony.TelephonyManager r0 = (android.telephony.TelephonyManager) r0     // Catch:{ Exception -> 0x0263 }
            boolean r0 = r0.isNetworkRoaming()     // Catch:{ Exception -> 0x0263 }
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)     // Catch:{ Exception -> 0x0263 }
        L_0x0263:
            r5.put(r4, r1)     // Catch:{ JSONException -> 0x0450 }
            java.lang.String r4 = "isSmsCapable"
            java.lang.Boolean r1 = java.lang.Boolean.FALSE     // Catch:{ JSONException -> 0x0450 }
            java.lang.Object r0 = r3.getSystemService(r6)     // Catch:{ Exception -> 0x0278 }
            android.telephony.TelephonyManager r0 = (android.telephony.TelephonyManager) r0     // Catch:{ Exception -> 0x0278 }
            boolean r0 = r0.isSmsCapable()     // Catch:{ Exception -> 0x0278 }
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)     // Catch:{ Exception -> 0x0278 }
        L_0x0278:
            r5.put(r4, r1)     // Catch:{ JSONException -> 0x0450 }
            java.lang.String r1 = "wifiMacAddress"
            java.lang.String r0 = "wifi"
            java.lang.Object r0 = r3.getSystemService(r0)     // Catch:{ Exception -> 0x0290 }
            android.net.wifi.WifiManager r0 = (android.net.wifi.WifiManager) r0     // Catch:{ Exception -> 0x0290 }
            android.net.wifi.WifiInfo r0 = r0.getConnectionInfo()     // Catch:{ Exception -> 0x0290 }
            java.lang.String r0 = r0.getMacAddress()     // Catch:{ Exception -> 0x0290 }
            goto L_0x0291
        L_0x0290:
            r0 = 0
        L_0x0291:
            r5.put(r1, r0)     // Catch:{ JSONException -> 0x0450 }
            java.lang.String r1 = "bssid"
            java.lang.String r0 = "wifi"
            java.lang.Object r0 = r3.getSystemService(r0)     // Catch:{ Exception -> 0x02a8 }
            android.net.wifi.WifiManager r0 = (android.net.wifi.WifiManager) r0     // Catch:{ Exception -> 0x02a8 }
            android.net.wifi.WifiInfo r0 = r0.getConnectionInfo()     // Catch:{ Exception -> 0x02a8 }
            java.lang.String r0 = r0.getBSSID()     // Catch:{ Exception -> 0x02a8 }
            goto L_0x02a9
        L_0x02a8:
            r0 = 0
        L_0x02a9:
            r5.put(r1, r0)     // Catch:{ JSONException -> 0x0450 }
            java.lang.String r1 = "ssid"
            java.lang.String r0 = "wifi"
            java.lang.Object r0 = r3.getSystemService(r0)     // Catch:{ Exception -> 0x02c1 }
            android.net.wifi.WifiManager r0 = (android.net.wifi.WifiManager) r0     // Catch:{ Exception -> 0x02c1 }
            android.net.wifi.WifiInfo r0 = r0.getConnectionInfo()     // Catch:{ Exception -> 0x02c1 }
            java.lang.String r0 = r0.getSSID()     // Catch:{ Exception -> 0x02c1 }
            goto L_0x02c2
        L_0x02c1:
            r0 = 0
        L_0x02c2:
            r5.put(r1, r0)     // Catch:{ JSONException -> 0x0450 }
            java.lang.String r9 = "bondedDevice"
            android.bluetooth.BluetoothAdapter r1 = android.bluetooth.BluetoothAdapter.getDefaultAdapter()     // Catch:{ Exception -> 0x0313 }
            r8 = 0
            if (r1 == 0) goto L_0x030c
            boolean r0 = r1.isEnabled()     // Catch:{ Exception -> 0x0313 }
            if (r0 == 0) goto L_0x030c
            java.util.Set r1 = r1.getBondedDevices()     // Catch:{ Exception -> 0x0313 }
            org.json.JSONArray r7 = X.AnonymousClass0x9.A1F()     // Catch:{ Exception -> 0x0313 }
            int r0 = r1.size()     // Catch:{ Exception -> 0x0313 }
            if (r0 <= 0) goto L_0x030d
            java.util.Iterator r6 = r1.iterator()     // Catch:{ Exception -> 0x0313 }
        L_0x02e6:
            boolean r0 = r6.hasNext()     // Catch:{ Exception -> 0x0313 }
            if (r0 == 0) goto L_0x030d
            java.lang.Object r4 = r6.next()     // Catch:{ Exception -> 0x0313 }
            android.bluetooth.BluetoothDevice r4 = (android.bluetooth.BluetoothDevice) r4     // Catch:{ Exception -> 0x0313 }
            org.json.JSONObject r8 = X.AnonymousClass0x9.A1G()     // Catch:{ Exception -> 0x0313 }
            java.lang.String r1 = "bluetoothName"
            java.lang.String r0 = r4.getName()     // Catch:{ Exception -> 0x0313 }
            r8.put(r1, r0)     // Catch:{ Exception -> 0x0313 }
            java.lang.String r1 = "bluetoothMacAddress"
            java.lang.String r0 = r4.getAddress()     // Catch:{ Exception -> 0x0313 }
            r8.put(r1, r0)     // Catch:{ Exception -> 0x0313 }
            r7.put(r8)     // Catch:{ Exception -> 0x0313 }
            goto L_0x02e6
        L_0x030c:
            r7 = r8
        L_0x030d:
            if (r8 == 0) goto L_0x0313
            java.lang.String r10 = r7.toString()     // Catch:{ JSONException -> 0x0450 }
        L_0x0313:
            r5.put(r9, r10)     // Catch:{ JSONException -> 0x0450 }
            java.lang.String r4 = "bluetoothIsEnabled"
            java.lang.Boolean r1 = java.lang.Boolean.FALSE     // Catch:{ JSONException -> 0x0450 }
            android.bluetooth.BluetoothAdapter r0 = android.bluetooth.BluetoothAdapter.getDefaultAdapter()     // Catch:{ Exception -> 0x0328 }
            if (r0 == 0) goto L_0x0328
            boolean r0 = r0.isEnabled()     // Catch:{ Exception -> 0x0328 }
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)     // Catch:{ Exception -> 0x0328 }
        L_0x0328:
            r5.put(r4, r1)     // Catch:{ JSONException -> 0x0450 }
            java.lang.String r1 = "fingerprint"
            java.lang.String r0 = android.os.Build.FINGERPRINT     // Catch:{ JSONException -> 0x0450 }
            r5.put(r1, r0)     // Catch:{ JSONException -> 0x0450 }
            java.lang.String r1 = "hardware"
            java.lang.String r0 = android.os.Build.HARDWARE     // Catch:{ JSONException -> 0x0450 }
            r5.put(r1, r0)     // Catch:{ JSONException -> 0x0450 }
            java.lang.String r1 = "id"
            java.lang.String r0 = android.os.Build.ID     // Catch:{ JSONException -> 0x0450 }
            r5.put(r1, r0)     // Catch:{ JSONException -> 0x0450 }
            java.lang.String r1 = "manufacturer"
            java.lang.String r0 = android.os.Build.MANUFACTURER     // Catch:{ JSONException -> 0x0450 }
            r5.put(r1, r0)     // Catch:{ JSONException -> 0x0450 }
            java.lang.String r1 = "product"
            java.lang.String r0 = android.os.Build.PRODUCT     // Catch:{ JSONException -> 0x0450 }
            r5.put(r1, r0)     // Catch:{ JSONException -> 0x0450 }
            java.lang.String r1 = "radio"
            java.lang.String r0 = android.os.Build.RADIO     // Catch:{ JSONException -> 0x0450 }
            r5.put(r1, r0)     // Catch:{ JSONException -> 0x0450 }
            java.lang.String r1 = "serial"
            java.lang.String r0 = android.os.Build.SERIAL     // Catch:{ JSONException -> 0x0450 }
            r5.put(r1, r0)     // Catch:{ JSONException -> 0x0450 }
            java.lang.String r1 = "user"
            java.lang.String r0 = android.os.Build.USER     // Catch:{ JSONException -> 0x0450 }
            r5.put(r1, r0)     // Catch:{ JSONException -> 0x0450 }
            java.lang.String r0 = "version"
            r5.put(r0, r2)     // Catch:{ JSONException -> 0x0450 }
            java.lang.String r1 = "securityPatch"
            java.lang.String r0 = android.os.Build.VERSION.SECURITY_PATCH     // Catch:{ JSONException -> 0x0450 }
            r5.put(r1, r0)     // Catch:{ JSONException -> 0x0450 }
            java.lang.String r2 = "androidID"
            android.content.ContentResolver r1 = r3.getContentResolver()     // Catch:{ JSONException -> 0x0450 }
            java.lang.String r0 = "android_id"
            java.lang.String r0 = android.provider.Settings.Secure.getString(r1, r0)     // Catch:{ JSONException -> 0x0450 }
            r5.put(r2, r0)     // Catch:{ JSONException -> 0x0450 }
            java.lang.String r4 = "isDataRoaming"
            java.lang.Boolean r2 = java.lang.Boolean.FALSE     // Catch:{ JSONException -> 0x0450 }
            android.content.ContentResolver r1 = r3.getContentResolver()     // Catch:{ Exception -> 0x039a }
            java.lang.String r0 = "data_roaming"
            int r0 = android.provider.Settings.Secure.getInt(r1, r0)     // Catch:{ Exception -> 0x039a }
            boolean r0 = X.AnonymousClass001.A1T(r0)
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r0)     // Catch:{ Exception -> 0x039a }
        L_0x039a:
            r5.put(r4, r2)     // Catch:{ JSONException -> 0x0450 }
            java.lang.String r2 = "autoTime"
            android.content.ContentResolver r1 = r3.getContentResolver()     // Catch:{ JSONException -> 0x0450 }
            java.lang.String r0 = "auto_time"
            java.lang.String r0 = android.provider.Settings.Global.getString(r1, r0)     // Catch:{ JSONException -> 0x0450 }
            r6 = 1
            java.lang.String r4 = "1"
            boolean r0 = X.AnonymousClass000.A1Y(r0, r4)
            r5.put(r2, r0)     // Catch:{ JSONException -> 0x0450 }
            java.lang.String r2 = "autoTimeZone"
            android.content.ContentResolver r1 = r3.getContentResolver()     // Catch:{ JSONException -> 0x0450 }
            java.lang.String r0 = "auto_time_zone"
            java.lang.String r0 = android.provider.Settings.Global.getString(r1, r0)     // Catch:{ JSONException -> 0x0450 }
            boolean r0 = X.AnonymousClass000.A1Y(r0, r4)
            r5.put(r2, r0)     // Catch:{ JSONException -> 0x0450 }
            java.lang.String r2 = "developmentSettingsEnabled"
            android.content.ContentResolver r1 = r3.getContentResolver()     // Catch:{ JSONException -> 0x0450 }
            java.lang.String r0 = "development_settings_enabled"
            java.lang.String r0 = android.provider.Settings.Secure.getString(r1, r0)     // Catch:{ JSONException -> 0x0450 }
            boolean r0 = X.AnonymousClass000.A1Y(r0, r4)
            r5.put(r2, r0)     // Catch:{ JSONException -> 0x0450 }
            java.lang.String r2 = "httpProxy"
            android.content.ContentResolver r1 = r3.getContentResolver()     // Catch:{ JSONException -> 0x0450 }
            java.lang.String r0 = "http_proxy"
            java.lang.String r0 = android.provider.Settings.System.getString(r1, r0)     // Catch:{ JSONException -> 0x0450 }
            r5.put(r2, r0)     // Catch:{ JSONException -> 0x0450 }
            java.lang.String r2 = "networkPreference"
            android.content.ContentResolver r1 = r3.getContentResolver()     // Catch:{ JSONException -> 0x0450 }
            java.lang.String r0 = "network_preference"
            java.lang.String r0 = android.provider.Settings.System.getString(r1, r0)     // Catch:{ JSONException -> 0x0450 }
            r5.put(r2, r0)     // Catch:{ JSONException -> 0x0450 }
            java.lang.String r2 = "usbMassStorageEnabled"
            android.content.ContentResolver r1 = r3.getContentResolver()     // Catch:{ JSONException -> 0x0450 }
            java.lang.String r0 = "usb_mass_storage_enabled"
            java.lang.String r0 = android.provider.Settings.Secure.getString(r1, r0)     // Catch:{ JSONException -> 0x0450 }
            if (r0 == r4) goto L_0x040a
            r6 = 0
        L_0x040a:
            r5.put(r2, r6)     // Catch:{ JSONException -> 0x0450 }
            java.lang.String r1 = "is24HoursFormat"
            boolean r0 = android.text.format.DateFormat.is24HourFormat(r3)     // Catch:{ JSONException -> 0x0450 }
            r5.put(r1, r0)     // Catch:{ JSONException -> 0x0450 }
            java.lang.String r1 = "isSafeMode"
            android.content.pm.PackageManager r0 = r3.getPackageManager()     // Catch:{ JSONException -> 0x0450 }
            boolean r0 = r0.isSafeMode()     // Catch:{ JSONException -> 0x0450 }
            r5.put(r1, r0)     // Catch:{ JSONException -> 0x0450 }
            java.lang.String r1 = "systemAvailableFeature"
            android.content.pm.PackageManager r0 = r3.getPackageManager()     // Catch:{ JSONException -> 0x0450 }
            android.content.pm.FeatureInfo[] r0 = r0.getSystemAvailableFeatures()     // Catch:{ JSONException -> 0x0450 }
            r5.put(r1, r0)     // Catch:{ JSONException -> 0x0450 }
            java.lang.String r4 = "totalBytes"
            java.io.File r0 = android.os.Environment.getRootDirectory()     // Catch:{ Exception -> 0x044b }
            java.lang.String r1 = r0.getAbsolutePath()     // Catch:{ Exception -> 0x044b }
            android.os.StatFs r0 = new android.os.StatFs     // Catch:{ Exception -> 0x044b }
            r0.<init>(r1)     // Catch:{ Exception -> 0x044b }
            long r2 = r0.getBlockSizeLong()     // Catch:{ Exception -> 0x044b }
            long r0 = r0.getBlockCountLong()     // Catch:{ Exception -> 0x044b }
            long r0 = r0 * r2
            goto L_0x044d
        L_0x044b:
            r0 = -1
        L_0x044d:
            r5.put(r4, r0)     // Catch:{ JSONException -> 0x0450 }
        L_0x0450:
            java.lang.String r0 = java.lang.String.valueOf(r5)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C48312eh.A00():java.lang.String");
    }
}
