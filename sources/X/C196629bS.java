package X;

import android.text.TextUtils;
import android.util.Base64;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.9bS  reason: invalid class name and case insensitive filesystem */
public class C196629bS implements C185728u9 {
    public final C56612sH A00;
    public final AnonymousClass1VX A01;
    public final C1906899l A02;
    public final C620933l A03;

    public synchronized int A03() {
        try {
            String A06 = this.A03.A06();
            if (!TextUtils.isEmpty(A06)) {
                return AnonymousClass0x9.A1H(A06).optInt("device_binding_sim_subscripiton_id", -1);
            }
        } catch (JSONException e) {
            Log.w("PAY: IndiaUpiPaymentSharedPrefs getSimIndex threw: ", e);
        }
        return 0;
    }

    public synchronized C166557yt A04() {
        String str;
        str = null;
        try {
            String A06 = this.A03.A06();
            if (!TextUtils.isEmpty(A06)) {
                str = AnonymousClass0x9.A1H(A06).optString("vpa", (String) null);
            }
        } catch (JSONException e) {
            Log.w("PAY: IndiaUpiPaymentSharedPrefs readAccountHandle threw: ", e);
        }
        return C1899693i.A0G(AnonymousClass3QD.A00(), str, "upiHandle");
    }

    public synchronized C166557yt A05() {
        C166557yt A0F;
        synchronized (this) {
            byte[] bArr = null;
            try {
                String A06 = this.A03.A06();
                if (!TextUtils.isEmpty(A06)) {
                    JSONObject A1H = AnonymousClass0x9.A1H(A06);
                    String optString = A1H.optString("token", (String) null);
                    long optLong = A1H.optLong("tokenTs", 0);
                    long millis = TimeUnit.DAYS.toMillis(20);
                    if (!TextUtils.isEmpty(optString) && this.A00.A0H() - optLong < millis) {
                        bArr = Base64.decode(optString, 0);
                    }
                }
            } catch (JSONException e) {
                Log.w("PAY: IndiaUpiPaymentSharedPrefs readToken threw: ", e);
            }
            A0F = C1899693i.A0F(AnonymousClass3QD.A00(), byte[].class, bArr, "sessionToken");
        }
        return A0F;
    }

    public String A07() {
        try {
            String A06 = this.A03.A06();
            if (!TextUtils.isEmpty(A06)) {
                return AnonymousClass0x9.A1H(A06).optString("psp", (String) null);
            }
        } catch (JSONException e) {
            Log.w("PAY: IndiaUpiPaymentSharedPrefs getPsp threw: ", e);
        }
        return null;
    }

    public synchronized String A08() {
        return C18280x3.A0Z(this.A03.A03(), "payments_upi_aliases");
    }

    public synchronized String A09() {
        String[] A0U;
        A0U = A0U("device_binding_sim_iccid");
        if (A0U[0] == null) {
            A0U = A0U("device_binding_sim_id");
        }
        return A0U[0];
    }

    public synchronized String A0A() {
        return C18280x3.A0Z(this.A03.A03(), "payments_upi_international_status");
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0044 A[Catch:{ JSONException -> 0x003a }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized java.lang.String A0B() {
        /*
            r11 = this;
            r10 = r11
            monitor-enter(r10)
            r8 = 0
            X.33l r0 = r11.A03     // Catch:{ JSONException -> 0x003a }
            java.lang.String r1 = r0.A06()     // Catch:{ JSONException -> 0x003a }
            boolean r0 = android.text.TextUtils.isEmpty(r1)     // Catch:{ JSONException -> 0x003a }
            if (r0 != 0) goto L_0x0045
            org.json.JSONObject r3 = X.AnonymousClass0x9.A1H(r1)     // Catch:{ JSONException -> 0x003a }
            java.lang.String r0 = "listKeys"
            java.lang.String r9 = r3.optString(r0, r8)     // Catch:{ JSONException -> 0x003a }
            java.lang.String r2 = "listKeysTs"
            r0 = 0
            long r6 = r3.optLong(r2, r0)     // Catch:{ JSONException -> 0x003a }
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.DAYS     // Catch:{ JSONException -> 0x003a }
            long r4 = X.C86654Ky.A09(r0)     // Catch:{ JSONException -> 0x003a }
            boolean r0 = android.text.TextUtils.isEmpty(r9)     // Catch:{ JSONException -> 0x003a }
            if (r0 != 0) goto L_0x0041
            X.2sH r0 = r11.A00     // Catch:{ JSONException -> 0x003a }
            long r2 = r0.A0H()     // Catch:{ JSONException -> 0x003a }
            long r2 = r2 - r6
            int r1 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            r0 = 1
            if (r1 < 0) goto L_0x0042
            goto L_0x0041
        L_0x003a:
            r1 = move-exception
            java.lang.String r0 = "PAY: IndiaUpiPaymentSharedPrefs readListKeys threw: "
            com.whatsapp.util.Log.w(r0, r1)     // Catch:{ all -> 0x0047 }
            goto L_0x0045
        L_0x0041:
            r0 = 0
        L_0x0042:
            if (r0 == 0) goto L_0x0045
            r8 = r9
        L_0x0045:
            monitor-exit(r10)
            return r8
        L_0x0047:
            r0 = move-exception
            monitor-exit(r10)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C196629bS.A0B():java.lang.String");
    }

    public synchronized String A0C() {
        String str;
        str = null;
        try {
            String A06 = this.A03.A06();
            if (!TextUtils.isEmpty(A06)) {
                str = AnonymousClass0x9.A1H(A06).optString("vpaId", (String) null);
            }
        } catch (JSONException e) {
            Log.w("PAY: IndiaUpiPaymentSharedPrefs readVpaId threw: ", e);
        }
        return str;
    }

    public synchronized void A0D() {
        try {
            C620933l r2 = this.A03;
            JSONObject A012 = A01(r2);
            A012.remove("listKeys");
            A012.remove("listKeysTs");
            C1899593h.A1D(r2, A012);
        } catch (JSONException e) {
            Log.w("PAY: IndiaUpiPaymentSharedPrefs deleteTokenAndKeys threw: ", e);
        }
        return;
    }

    public synchronized void A0E() {
        try {
            C620933l r2 = this.A03;
            JSONObject A012 = A01(r2);
            A012.remove("token");
            A012.remove("tokenTs");
            A012.remove("listKeys");
            A012.remove("listKeysTs");
            C1899593h.A1D(r2, A012);
        } catch (JSONException e) {
            Log.w("PAY: IndiaUpiPaymentSharedPrefs deleteTokenAndKeys threw: ", e);
        }
        return;
    }

    public synchronized void A0F(int i) {
        try {
            C620933l r2 = this.A03;
            JSONObject A012 = A01(r2);
            A012.put("device_binding_sim_subscripiton_id", i);
            C1899593h.A1D(r2, A012);
        } catch (JSONException e) {
            Log.w("PAY: IndiaUpiPaymentSharedPrefs setSimIndex threw: ", e);
        }
        return;
    }

    public synchronized void A0G(C166557yt r3, String str) {
        try {
            C620933l r1 = this.A03;
            JSONObject A012 = A01(r1);
            A0H(r3, str, A012);
            C1899593h.A1D(r1, A012);
        } catch (JSONException e) {
            Log.w("PAY: IndiaUpiPaymentSharedPrefs storeVpaHandle threw: ", e);
        }
        return;
    }

    public final synchronized void A0H(C166557yt r4, String str, JSONObject jSONObject) {
        jSONObject.put("v", "2");
        if (!C161527pr.A02(r4)) {
            Object obj = r4.A00;
            C626936e.A06(obj);
            jSONObject.put("vpa", obj);
        }
        if (!TextUtils.isEmpty(str)) {
            jSONObject.put("vpaId", str);
        }
        jSONObject.put("vpaTs", this.A00.A0H());
    }

    public synchronized void A0I(String str) {
        JSONObject A1H;
        try {
            C620933l r5 = this.A03;
            String A06 = r5.A06();
            long A0H = this.A00.A0H();
            if (TextUtils.isEmpty(A06)) {
                A1H = AnonymousClass0x9.A1G();
            } else {
                A1H = AnonymousClass0x9.A1H(A06);
            }
            A1H.put("v", "2");
            A1H.put("listKeys", str);
            A1H.put("listKeysTs", A0H);
            C1899593h.A1D(r5, A1H);
            C18260x0.A12("PAY: IndiaUpiPaymentSharedPrefs storeListKeys at timestamp: ", AnonymousClass001.A0o(), A0H);
        } catch (JSONException e) {
            Log.w("PAY: IndiaUpiPaymentSharedPrefs storeListKeys threw: ", e);
        }
        return;
    }

    public synchronized void A0J(String str, String str2, String str3) {
        try {
            C620933l r2 = this.A03;
            JSONObject A0g = C1899593h.A0g(r2);
            A0K(str, str2, A0g);
            if (!TextUtils.isEmpty(str3)) {
                A0g.put("device_binding_sim_id", str3);
            }
            A0g.remove("device_binding_sim_subscripiton_id");
            C1899593h.A1D(r2, A0g);
        } catch (JSONException e) {
            Log.w("PAY: IndiaUpiPaymentSharedPrefs storeDeviceBinding threw: ", e);
        }
        return;
    }

    public final synchronized void A0K(String str, String str2, JSONObject jSONObject) {
        jSONObject.put("v", "2");
        jSONObject.put("psp", str);
        jSONObject.put("sequenceNumberPrefix", str2);
        try {
            JSONObject optJSONObject = jSONObject.optJSONObject("devBindingByPsp");
            if (optJSONObject == null) {
                optJSONObject = AnonymousClass0x9.A1G();
                jSONObject.put("devBindingByPsp", optJSONObject);
            }
            JSONObject optJSONObject2 = optJSONObject.optJSONObject(str);
            if (optJSONObject2 == null) {
                optJSONObject2 = AnonymousClass0x9.A1G();
                optJSONObject.put(str, optJSONObject2);
            }
            optJSONObject2.put("devBinding", true);
        } catch (JSONException e) {
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("PAY: IndiaUpiPaymentSharedPrefs getOrInsertFieldByPsP for field: ");
            A0o.append("devBindingByPsp");
            Log.w(AnonymousClass000.A0X(" threw: ", A0o), e);
        }
    }

    public synchronized void A0L(JSONArray jSONArray) {
        C620933l r0 = this.A03;
        C18270x1.A0j(C620933l.A00(r0), "payments_upi_aliases", jSONArray.toString());
    }

    public synchronized void A0M(JSONArray jSONArray) {
        C620933l r0 = this.A03;
        C18270x1.A0j(C620933l.A00(r0), "payments_upi_international_status", jSONArray.toString());
    }

    public synchronized void A0N(boolean z) {
        C18270x1.A0l(C620933l.A00(this.A03), "is_payment_account_created", z);
    }

    public synchronized boolean A0O() {
        return C18280x3.A1W(this.A03.A03(), "is_payment_account_created");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0018, code lost:
        if (r2.A01.A0X(1644) == false) goto L_0x001a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized boolean A0P() {
        /*
            r2 = this;
            monitor-enter(r2)
            X.33l r0 = r2.A03     // Catch:{ all -> 0x001d }
            android.content.SharedPreferences r1 = r0.A03()     // Catch:{ all -> 0x001d }
            java.lang.String r0 = "payment_account_recovered"
            boolean r0 = X.C18280x3.A1W(r1, r0)     // Catch:{ all -> 0x001d }
            if (r0 == 0) goto L_0x001a
            X.1VX r1 = r2.A01     // Catch:{ all -> 0x001d }
            r0 = 1644(0x66c, float:2.304E-42)
            boolean r1 = r1.A0X(r0)     // Catch:{ all -> 0x001d }
            r0 = 1
            if (r1 != 0) goto L_0x001b
        L_0x001a:
            r0 = 0
        L_0x001b:
            monitor-exit(r2)
            return r0
        L_0x001d:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C196629bS.A0P():boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0010, code lost:
        if (A0S(A07()) != false) goto L_0x0012;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized boolean A0Q() {
        /*
            r2 = this;
            monitor-enter(r2)
            boolean r0 = r2.A0P()     // Catch:{ all -> 0x0015 }
            if (r0 == 0) goto L_0x0012
            java.lang.String r0 = r2.A07()     // Catch:{ all -> 0x0015 }
            boolean r1 = r2.A0S(r0)     // Catch:{ all -> 0x0015 }
            r0 = 1
            if (r1 == 0) goto L_0x0013
        L_0x0012:
            r0 = 0
        L_0x0013:
            monitor-exit(r2)
            return r0
        L_0x0015:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C196629bS.A0Q():boolean");
    }

    public boolean A0R(AnonymousClass99H r7, C197109ca r8, String str) {
        ArrayList arrayList;
        if (TextUtils.isEmpty(str) || !A0T(str)) {
            return false;
        }
        if (!this.A01.A0X(1661)) {
            return true;
        }
        if (r7 == null || (arrayList = r7.A0G) == null) {
            return false;
        }
        boolean contains = arrayList.contains(str);
        if (!contains) {
            C134246ig r2 = new C134246ig();
            r2.A0b = "redo_device_binding";
            C1899593h.A1B(r2, 0);
            r2.A01 = Boolean.valueOf(this.A02.A0G("add_bank"));
            r8.BKA(r2);
            B1N(str, true);
        }
        return contains;
    }

    public boolean A0S(String str) {
        return !TextUtils.isEmpty(str) && A0T(str);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0020, code lost:
        r0 = (r1 = r0.optJSONObject(r5)).optBoolean("devBinding", false);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean A0T(java.lang.String r5) {
        /*
            r4 = this;
            monitor-enter(r4)
            r3 = 0
            X.33l r0 = r4.A03     // Catch:{ JSONException -> 0x0030 }
            java.lang.String r1 = r0.A06()     // Catch:{ JSONException -> 0x0030 }
            boolean r0 = android.text.TextUtils.isEmpty(r1)     // Catch:{ JSONException -> 0x0030 }
            if (r0 != 0) goto L_0x0038
            org.json.JSONObject r2 = X.AnonymousClass0x9.A1H(r1)     // Catch:{ JSONException -> 0x0030 }
            java.lang.String r0 = "devBindingByPsp"
            org.json.JSONObject r0 = r2.optJSONObject(r0)     // Catch:{ JSONException -> 0x0030 }
            if (r0 == 0) goto L_0x0029
            org.json.JSONObject r1 = r0.optJSONObject(r5)     // Catch:{ JSONException -> 0x0030 }
            if (r1 == 0) goto L_0x0029
            java.lang.String r0 = "devBinding"
            boolean r0 = r1.optBoolean(r0, r3)     // Catch:{ JSONException -> 0x0030 }
            if (r0 == 0) goto L_0x0029
            goto L_0x0037
        L_0x0029:
            java.lang.String r0 = "devBinding"
            boolean r3 = r2.optBoolean(r0, r3)     // Catch:{ JSONException -> 0x0030 }
            goto L_0x0038
        L_0x0030:
            r1 = move-exception
            java.lang.String r0 = "PAY: IndiaUpiPaymentSharedPrefs readDeviceBinding threw: "
            com.whatsapp.util.Log.w(r0, r1)     // Catch:{ all -> 0x003a }
            goto L_0x0038
        L_0x0037:
            r3 = r0
        L_0x0038:
            monitor-exit(r4)
            return r3
        L_0x003a:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C196629bS.A0T(java.lang.String):boolean");
    }

    public synchronized boolean B1N(String str, boolean z) {
        try {
            C620933l r2 = this.A03;
            String A06 = r2.A06();
            if (!TextUtils.isEmpty(A06)) {
                JSONObject A1H = AnonymousClass0x9.A1H(A06);
                if (TextUtils.isEmpty(str)) {
                    A1H.remove("smsVerifDataSentToPsp");
                    A1H.remove("devBindingByPsp");
                } else {
                    JSONObject optJSONObject = A1H.optJSONObject("smsVerifDataSentToPsp");
                    if (optJSONObject != null) {
                        optJSONObject.remove(str);
                    }
                    JSONObject optJSONObject2 = A1H.optJSONObject("devBindingByPsp");
                    if (optJSONObject2 != null) {
                        optJSONObject2.remove(str);
                    }
                }
                if (z) {
                    A1H.remove("psp");
                }
                A1H.remove("sequenceNumberPrefix");
                A1H.remove("skipDevBinding");
                A1H.remove("smsVerifData");
                A1H.remove("smsVerifDataGateway");
                A1H.remove("devBinding");
                A1H.remove("smsVerifDataGen");
                A1H.remove("device_binding_sim_iccid");
                A1H.remove("device_binding_sim_id");
                A1H.remove("device_binding_sim_subscripiton_id");
                C1899593h.A1D(r2, A1H);
            }
        } catch (JSONException e) {
            Log.w("PAY: IndiaUpiPaymentSharedPrefs deleteDeviceBinding threw: ", e);
            return false;
        }
        return true;
    }

    public synchronized boolean BrZ(long j, boolean z) {
        this.A02.A09("tos_no_wallet");
        C18270x1.A0l(C620933l.A00(this.A03), "payment_account_recovered", true);
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0036, code lost:
        return false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized boolean Brs(X.C133796hx r6) {
        /*
            r5 = this;
            r4 = r5
            monitor-enter(r4)
            if (r6 == 0) goto L_0x0035
            boolean r0 = r6 instanceof X.AnonymousClass99H     // Catch:{ all -> 0x0032 }
            if (r0 == 0) goto L_0x0035
            X.99H r6 = (X.AnonymousClass99H) r6     // Catch:{ all -> 0x0032 }
            X.7yt r1 = r6.A09     // Catch:{ all -> 0x0032 }
            java.lang.String r0 = r6.A0F     // Catch:{ all -> 0x0032 }
            r5.A0G(r1, r0)     // Catch:{ all -> 0x0032 }
            java.lang.String r3 = r6.A0A     // Catch:{ all -> 0x0032 }
            X.33l r2 = r5.A03     // Catch:{ JSONException -> 0x0028 }
            org.json.JSONObject r1 = X.C1899593h.A0g(r2)     // Catch:{ JSONException -> 0x0028 }
            boolean r0 = android.text.TextUtils.isEmpty(r3)     // Catch:{ JSONException -> 0x0028 }
            if (r0 != 0) goto L_0x0024
            java.lang.String r0 = "psp"
            r1.put(r0, r3)     // Catch:{ JSONException -> 0x0028 }
        L_0x0024:
            X.C1899593h.A1D(r2, r1)     // Catch:{ JSONException -> 0x0028 }
            goto L_0x002d
        L_0x0028:
            java.lang.String r0 = "PAY: IndiaUpiPaymentSharedPrefs storePsp threw"
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ all -> 0x0030 }
        L_0x002d:
            monitor-exit(r4)
            r0 = 1
            return r0
        L_0x0030:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0032 }
        L_0x0032:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        L_0x0035:
            monitor-exit(r4)
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C196629bS.Brs(X.6hx):boolean");
    }

    public String A06() {
        try {
            String A06 = this.A03.A06();
            if (!TextUtils.isEmpty(A06)) {
                return AnonymousClass0x9.A1H(A06).optString("sequenceNumberPrefix", "ICIWC");
            }
        } catch (JSONException e) {
            Log.w("PAY: IndiaUpiPaymentSharedPrefs getPaymentSequenceNumberPrefix threw: ", e);
        }
        return "ICIWC";
    }

    public final String[] A0U(String... strArr) {
        try {
            String A06 = this.A03.A06();
            if (!TextUtils.isEmpty(A06)) {
                JSONObject A1H = AnonymousClass0x9.A1H(A06);
                int length = strArr.length;
                String[] strArr2 = new String[length];
                for (int i = 0; i < length; i++) {
                    strArr2[i] = A1H.optString(strArr[i], (String) null);
                }
                return strArr2;
            }
        } catch (JSONException e) {
            Log.w("PAY: IndiaUpiPaymentSharedPrefs readFromPaymentInfo for keys threw: ", e);
        }
        return new String[strArr.length];
    }

    public void B1M() {
        C620933l r2 = this.A03;
        C620933l.A00(r2).remove("payments_upi_aliases").apply();
        try {
            JSONObject A0g = C1899593h.A0g(r2);
            A0g.remove("token");
            A0g.remove("tokenTs");
            A0g.remove("vpa");
            A0g.remove("vpaId");
            A0g.remove("vpaTs");
            A0g.remove("listKeys");
            A0g.remove("listKeysTs");
            A0g.remove("skipDevBinding");
            A0g.remove("devBindingByPsp");
            A0g.remove("psp");
            A0g.remove("sequenceNumberPrefix");
            A0g.remove("devBinding");
            A0g.remove("signedQrCode");
            A0g.remove("signedQrCodeTs");
            C1899593h.A1D(r2, A0g);
        } catch (JSONException e) {
            Log.w("PAY: IndiaUpiPaymentSharedPrefs deleteTokenAndKeys threw: ", e);
        }
    }

    public boolean Bo1(AnonymousClass1S4 r3) {
        if (this.A02.A0E() || !A04().A01()) {
            return false;
        }
        return true;
    }

    public String toString() {
        String str;
        try {
            JSONObject A0g = C1899593h.A0g(this.A03);
            if (!TextUtils.isEmpty(A0g.optString("listKeys"))) {
                str = "[keys exist]";
            } else {
                str = "[no keys]";
            }
            A0g.put("listKeys", str);
            String optString = A0g.optString("vpa");
            if (!TextUtils.isEmpty(optString)) {
                A0g.put("vpa", C195009Vm.A02(optString));
            }
            String optString2 = A0g.optString("smsVerifDataGateway");
            if (!TextUtils.isEmpty(optString2)) {
                A0g.put("smsVerifDataGateway", optString2);
            }
            A02("smsVerifDataGen", A0g);
            A02("smsVerifData", A0g);
            A02("token", A0g);
            JSONObject optJSONObject = A0g.optJSONObject("smsVerifDataSentToPsp");
            if (optJSONObject != null) {
                Iterator<String> keys = optJSONObject.keys();
                while (keys.hasNext()) {
                    JSONObject optJSONObject2 = optJSONObject.optJSONObject(AnonymousClass001.A0m(keys));
                    if (optJSONObject2 != null) {
                        A02("smsVerifData", optJSONObject2);
                    }
                }
            }
            return A0g.toString();
        } catch (JSONException e) {
            Log.w("PAY: IndiaUpiPaymentSharedPrefs toString threw: ", e);
            return "";
        }
    }

    public C196629bS(C56612sH r1, AnonymousClass1VX r2, C1906899l r3, C620933l r4) {
        this.A00 = r1;
        this.A01 = r2;
        this.A03 = r4;
        this.A02 = r3;
    }

    public static String A00(C196629bS r0) {
        return (String) r0.A04().A00;
    }

    public static JSONObject A01(C620933l r1) {
        String A06 = r1.A06();
        if (TextUtils.isEmpty(A06)) {
            return new JSONObject();
        }
        return new JSONObject(A06);
    }

    public static void A02(String str, JSONObject jSONObject) {
        String optString = jSONObject.optString(str);
        if (!TextUtils.isEmpty(optString)) {
            jSONObject.put(str, C195009Vm.A00(optString));
        }
    }
}
