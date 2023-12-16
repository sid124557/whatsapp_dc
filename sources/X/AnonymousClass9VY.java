package X;

import android.content.Context;
import android.os.Build;
import android.telephony.SmsManager;
import android.telephony.TelephonyManager;
import com.whatsapp.util.Log;
import java.lang.reflect.Method;
import java.util.List;

/* renamed from: X.9VY  reason: invalid class name */
public class AnonymousClass9VY {
    public AnonymousClass9WI A00;
    public final C106175Xx A01;
    public final C56972sr A02;
    public final C66663Mh A03;
    public final C620633i A04;
    public final C56612sH A05;
    public final C54292oU A06;
    public final AnonymousClass1VX A07;
    public final AnonymousClass31C A08;
    public final AnonymousClass9U1 A09;
    public final C196629bS A0A;
    public final AnonymousClass9U5 A0B;
    public final C197109ca A0C;
    public final C160757oG A0D;
    public final AnonymousClass28X A0E;

    public String A03() {
        int i;
        try {
            Context context = this.A06.A00;
            if (AnonymousClass0Y8.A05(context, "android.permission.READ_PHONE_STATE") != 0 || ((i = Build.VERSION.SDK_INT) >= 30 && AnonymousClass0Y8.A05(context, "android.permission.READ_PHONE_NUMBERS") != 0)) {
                return null;
            }
            C56972sr r0 = this.A02;
            r0.A0P();
            String A022 = AnonymousClass36P.A02(r0.A01);
            if (i >= 22) {
                return this.A00.A04(A022);
            }
            TelephonyManager A0N = this.A04.A0N();
            String line1Number = A0N.getLine1Number();
            C106175Xx r2 = this.A01;
            C197109ca r1 = this.A0C;
            if (A00(r2, r1, line1Number, A022)) {
                this.A0D.A04("store first iccid");
                return A0N.getSimSerialNumber();
            } else if (A00(r2, r1, A04("getLine1Number"), A022)) {
                this.A0D.A04("store second iccid");
                return A04("getSimSerialNumber");
            } else {
                if (A0N.getSimSerialNumber() != null) {
                    return A0N.getSimSerialNumber();
                }
                return null;
            }
        } catch (Exception e) {
            this.A0D.A0A("Unable to get device bind ICCID", e);
        }
    }

    public final String A04(String str) {
        TelephonyManager A0N = this.A04.A0N();
        try {
            Method method = Class.forName(A0N.getClass().getName()).getMethod(str, new Class[]{Integer.TYPE});
            Object[] objArr = new Object[1];
            AnonymousClass000.A1P(objArr, 1, 0);
            Object invoke = method.invoke(A0N, objArr);
            if (invoke != null) {
                return invoke.toString();
            }
        } catch (Exception e) {
            Log.e("IndiaUpiSimSwapDetectionUtils/getDeviceInfoBySlot device info exception: ", e);
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0090, code lost:
        r5 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0091, code lost:
        com.whatsapp.util.Log.w("PAY: IndiaUpiPaymentSharedPrefs logDeviceBindingStatus threw: ", r5);
        r1 = "";
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int A01() {
        /*
            r13 = this;
            X.3Mh r1 = r13.A03
            X.1Ei r0 = X.C66663Mh.A0k
            boolean r0 = r1.A08(r0)
            r4 = 0
            if (r0 == 0) goto L_0x00d6
            X.2sr r0 = r13.A02
            r0.A0P()
            X.1RR r0 = r0.A01
            java.lang.String r3 = X.AnonymousClass36P.A02(r0)
            X.7oG r2 = r13.A0D
            java.lang.StringBuilder r7 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "checkSimWithWaRegisteredNumberIsInstalled : device binding status: "
            r7.append(r0)
            X.9bS r0 = r13.A0A
            java.lang.String r5 = "device_binding_sim_id"
            java.lang.String r9 = "device_binding_sim_iccid"
            org.json.JSONObject r8 = X.AnonymousClass0x9.A1G()     // Catch:{ JSONException -> 0x0090 }
            java.lang.String r11 = "skipDevBinding"
            monitor-enter(r0)     // Catch:{ JSONException -> 0x0090 }
            r10 = 0
            X.33l r1 = r0.A03     // Catch:{ JSONException -> 0x0044 }
            java.lang.String r6 = r1.A06()     // Catch:{ JSONException -> 0x0044 }
            boolean r1 = android.text.TextUtils.isEmpty(r6)     // Catch:{ JSONException -> 0x0044 }
            if (r1 != 0) goto L_0x004a
            org.json.JSONObject r1 = X.AnonymousClass0x9.A1H(r6)     // Catch:{ JSONException -> 0x0044 }
            boolean r10 = r1.optBoolean(r11, r4)     // Catch:{ JSONException -> 0x0044 }
            goto L_0x004a
        L_0x0044:
            r6 = move-exception
            java.lang.String r1 = "PAY: IndiaUpiPaymentSharedPrefs readDeviceBinding threw: "
            com.whatsapp.util.Log.w(r1, r6)     // Catch:{ all -> 0x008d }
        L_0x004a:
            monitor-exit(r0)     // Catch:{ JSONException -> 0x0090 }
            r8.put(r11, r10)     // Catch:{ JSONException -> 0x0090 }
            java.lang.String[] r1 = new java.lang.String[]{r9}     // Catch:{ JSONException -> 0x0090 }
            java.lang.String[] r1 = r0.A0U(r1)     // Catch:{ JSONException -> 0x0090 }
            r1 = r1[r4]     // Catch:{ JSONException -> 0x0090 }
            java.lang.String r1 = X.C195009Vm.A01(r1)     // Catch:{ JSONException -> 0x0090 }
            r8.put(r9, r1)     // Catch:{ JSONException -> 0x0090 }
            java.lang.String[] r1 = new java.lang.String[]{r5}     // Catch:{ JSONException -> 0x0090 }
            java.lang.String[] r1 = r0.A0U(r1)     // Catch:{ JSONException -> 0x0090 }
            r1 = r1[r4]     // Catch:{ JSONException -> 0x0090 }
            java.lang.String r1 = X.C195009Vm.A01(r1)     // Catch:{ JSONException -> 0x0090 }
            r8.put(r5, r1)     // Catch:{ JSONException -> 0x0090 }
            java.lang.String r6 = r0.A07()     // Catch:{ JSONException -> 0x0090 }
            boolean r1 = android.text.TextUtils.isEmpty(r6)     // Catch:{ JSONException -> 0x0090 }
            if (r1 != 0) goto L_0x0088
            java.lang.String r1 = "psp"
            r8.put(r1, r6)     // Catch:{ JSONException -> 0x0090 }
            java.lang.String r5 = "devBinding"
            boolean r1 = r0.A0T(r6)     // Catch:{ JSONException -> 0x0090 }
            r8.put(r5, r1)     // Catch:{ JSONException -> 0x0090 }
        L_0x0088:
            java.lang.String r1 = r8.toString()     // Catch:{ JSONException -> 0x0090 }
            goto L_0x0098
        L_0x008d:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ JSONException -> 0x0090 }
            throw r1     // Catch:{ JSONException -> 0x0090 }
        L_0x0090:
            r5 = move-exception
            java.lang.String r1 = "PAY: IndiaUpiPaymentSharedPrefs logDeviceBindingStatus threw: "
            com.whatsapp.util.Log.w(r1, r5)
            java.lang.String r1 = ""
        L_0x0098:
            X.C1899593h.A1J(r2, r1, r7)
            X.2sH r7 = r13.A05
            X.1VX r8 = r13.A07
            X.31C r9 = r13.A08
            X.9U1 r10 = r13.A09
            X.9U5 r11 = r13.A0B
            X.9AG r6 = new X.9AG
            r6.<init>(r7, r8, r9, r10, r11)
            int r5 = android.os.Build.VERSION.SDK_INT
            r1 = 22
            if (r5 < r1) goto L_0x00b7
            X.9WI r0 = r13.A00
            int r0 = r0.A03(r6, r3)
            return r0
        L_0x00b7:
            r12 = 1
            java.lang.String r1 = "Check sim on version < 22"
            r2.A06(r1)
            X.33i r1 = r13.A04
            android.telephony.TelephonyManager r6 = r1.A0N()
            java.lang.String r9 = r6.getLine1Number()
            X.5Xx r11 = r13.A01
            X.9ca r10 = r13.A0C
            boolean r1 = A00(r11, r10, r9, r3)
            if (r1 == 0) goto L_0x00d7
            java.lang.String r0 = "Phone 1 matched"
        L_0x00d3:
            r2.A06(r0)
        L_0x00d6:
            return r4
        L_0x00d7:
            java.lang.StringBuilder r5 = X.AnonymousClass001.A0o()
            java.lang.String r1 = "checkSimWithWaRegisteredNumberIsInstalled Phone 1 not matched | sim number : "
            r5.append(r1)
            r5.append(r9)
            java.lang.String r8 = " | waNumber : "
            r5.append(r8)
            X.C1899593h.A1J(r2, r3, r5)
            java.lang.String r5 = r6.getSimSerialNumber()
            java.lang.String r6 = r0.A09()
            boolean r0 = android.text.TextUtils.equals(r5, r6)
            if (r0 == 0) goto L_0x00fc
            java.lang.String r0 = "ICCID 1 matched"
            goto L_0x00d3
        L_0x00fc:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "checkSimWithWaRegisteredNumberIsInstalled ICCID 1 not matched simId : "
            r1.append(r0)
            java.lang.String r0 = X.C195009Vm.A01(r5)
            r1.append(r0)
            java.lang.String r5 = " | storedId : "
            r1.append(r5)
            java.lang.String r0 = X.C195009Vm.A01(r6)
            X.C1899593h.A1J(r2, r0, r1)
            java.lang.String r0 = "getLine1Number"
            java.lang.String r7 = r13.A04(r0)
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "Phone "
            r1.append(r0)
            r1.append(r7)
            java.lang.String r0 = " phone2 "
            r1.append(r0)
            X.C1899593h.A1J(r2, r7, r1)
            boolean r0 = A00(r11, r10, r7, r3)
            if (r0 == 0) goto L_0x013b
            java.lang.String r0 = "Phone 2 matched"
            goto L_0x00d3
        L_0x013b:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "checkSimWithWaRegisteredNumberIsInstalled Phone 2 not matched | sim number : "
            X.C18260x0.A0p(r0, r9, r8, r3, r1)
            X.C1899593h.A1F(r2, r1)
            java.lang.String r0 = "getSimSerialNumber"
            java.lang.String r3 = r13.A04(r0)
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "ID"
            r1.append(r0)
            r1.append(r6)
            java.lang.String r0 = " ID2 "
            java.lang.String r0 = X.AnonymousClass000.A0V(r0, r3, r1)
            r2.A04(r0)
            boolean r0 = android.text.TextUtils.equals(r6, r3)
            if (r0 == 0) goto L_0x016c
            java.lang.String r0 = "ICCID 2 matched"
            goto L_0x00d3
        L_0x016c:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "checkSimWithWaRegisteredNumberIsInstalled ICCID 2 not matched simId : "
            r1.append(r0)
            java.lang.String r0 = X.C195009Vm.A01(r3)
            r1.append(r0)
            r1.append(r5)
            java.lang.String r0 = X.C195009Vm.A01(r6)
            X.C1899593h.A1J(r2, r0, r1)
            java.lang.String r0 = "IndiaUpiSimSwapDetectionUtils : No ICCID matched on API 22 or lower"
            r2.A06(r0)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass9VY.A01():int");
    }

    public AnonymousClass9VY(C106175Xx r8, C56972sr r9, C66663Mh r10, C620633i r11, C56612sH r12, C54292oU r13, AnonymousClass1VX r14, AnonymousClass31C r15, AnonymousClass9U1 r16, C196629bS r17, AnonymousClass9U5 r18, C197109ca r19, AnonymousClass28X r20) {
        C160757oG A002 = C160757oG.A00("IndiaUpiSimSwapDetectionUtils", "payment", "IN");
        this.A0D = A002;
        this.A06 = r13;
        this.A05 = r12;
        this.A07 = r14;
        this.A02 = r9;
        this.A03 = r10;
        this.A08 = r15;
        C620633i r2 = r11;
        this.A04 = r11;
        C106175Xx r4 = r8;
        this.A01 = r8;
        this.A0E = r20;
        this.A09 = r16;
        this.A0B = r18;
        C197109ca r5 = r19;
        this.A0C = r5;
        C196629bS r6 = r17;
        this.A0A = r6;
        if (Build.VERSION.SDK_INT >= 22) {
            this.A00 = new AnonymousClass9WI(r2, A002, r4, r5, r6);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0034, code lost:
        if (r4 > 10) goto L_0x0036;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean A00(X.C106175Xx r7, X.C197109ca r8, java.lang.String r9, java.lang.String r10) {
        /*
            boolean r0 = android.text.TextUtils.isEmpty(r9)
            r2 = 0
            if (r0 == 0) goto L_0x0008
            return r2
        L_0x0008:
            java.lang.String r1 = X.C107195ar.A03(r9)
            java.lang.String r6 = X.C107195ar.A03(r10)
            java.lang.String r0 = X.C621333r.A02(r6)
            java.lang.String r5 = X.C107195ar.A02(r7, r0, r1)
            int r4 = r5.length()
            r0 = 12
            java.lang.String r3 = "91"
            if (r4 == r0) goto L_0x0036
            boolean r0 = r5.startsWith(r3)
            if (r0 == 0) goto L_0x0032
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.String r1 = "incorrect_country_prefix_validation"
            r0 = 0
            r8.BKB(r2, r0, r1, r0)
        L_0x0032:
            r0 = 10
            if (r4 <= r0) goto L_0x0041
        L_0x0036:
            boolean r0 = r5.startsWith(r3)
            if (r0 == 0) goto L_0x0041
            boolean r0 = android.text.TextUtils.equals(r5, r6)
            return r0
        L_0x0041:
            java.lang.String r0 = ""
            java.lang.String r0 = r6.replaceFirst(r3, r0)
            boolean r0 = android.text.TextUtils.equals(r5, r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass9VY.A00(X.5Xx, X.9ca, java.lang.String, java.lang.String):boolean");
    }

    public SmsManager A02(int i) {
        return AnonymousClass9WI.A00(i);
    }

    public List A05(Context context) {
        return AnonymousClass9WI.A02(context);
    }
}
