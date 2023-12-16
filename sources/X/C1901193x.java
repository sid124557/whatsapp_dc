package X;

import android.os.Handler;
import android.os.Looper;

/* renamed from: X.93x  reason: invalid class name and case insensitive filesystem */
public class C1901193x extends Handler {
    public final AnonymousClass99H A00;
    public final AnonymousClass9U1 A01;
    public final C196629bS A02;
    public final C194259Se A03;
    public final String A04;
    public final /* synthetic */ AnonymousClass9VD A05;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C1901193x(Looper looper, AnonymousClass99H r2, AnonymousClass9U1 r3, C196629bS r4, AnonymousClass9VD r5, C194259Se r6, String str) {
        super(looper);
        this.A05 = r5;
        this.A03 = r6;
        this.A01 = r3;
        this.A02 = r4;
        this.A04 = str;
        this.A00 = r2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x005c, code lost:
        if (r1 != null) goto L_0x005e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0050  */
    /* JADX WARNING: Removed duplicated region for block: B:66:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void handleMessage(android.os.Message r24) {
        /*
            r23 = this;
            r4 = r23
            X.9bS r3 = r4.A02
            java.lang.String r9 = r4.A04
            monitor-enter(r3)
            X.C626936e.A06(r9)     // Catch:{ all -> 0x017c }
            r8 = 0
            X.33l r0 = r3.A03     // Catch:{ JSONException -> 0x0041 }
            java.lang.String r1 = r0.A06()     // Catch:{ JSONException -> 0x0041 }
            boolean r0 = android.text.TextUtils.isEmpty(r1)     // Catch:{ JSONException -> 0x0041 }
            if (r0 != 0) goto L_0x0049
            org.json.JSONObject r5 = X.AnonymousClass0x9.A1H(r1)     // Catch:{ JSONException -> 0x0041 }
            java.lang.String r0 = "smsVerifDataSentToPsp"
            org.json.JSONObject r0 = r5.optJSONObject(r0)     // Catch:{ JSONException -> 0x0041 }
            if (r0 == 0) goto L_0x0030
            org.json.JSONObject r1 = r0.optJSONObject(r9)     // Catch:{ JSONException -> 0x0041 }
            if (r1 == 0) goto L_0x0030
            java.lang.String r0 = "smsVerifData"
            java.lang.String r2 = r1.optString(r0, r8)     // Catch:{ JSONException -> 0x0041 }
            goto L_0x0031
        L_0x0030:
            r2 = r8
        L_0x0031:
            boolean r0 = android.text.TextUtils.isEmpty(r2)     // Catch:{ JSONException -> 0x003e }
            if (r0 == 0) goto L_0x0048
            java.lang.String r0 = "smsVerifData"
            java.lang.String r8 = r5.optString(r0, r8)     // Catch:{ JSONException -> 0x003e }
            goto L_0x0049
        L_0x003e:
            r1 = move-exception
            r8 = r2
            goto L_0x0042
        L_0x0041:
            r1 = move-exception
        L_0x0042:
            java.lang.String r0 = "PAY: IndiaUpiPaymentSharedPrefs readSmsVerificationDataSent threw: "
            com.whatsapp.util.Log.w(r0, r1)     // Catch:{ all -> 0x017c }
            goto L_0x0049
        L_0x0048:
            r8 = r2
        L_0x0049:
            monitor-exit(r3)
            boolean r0 = android.text.TextUtils.isEmpty(r8)
            if (r0 != 0) goto L_0x015e
            X.9Se r0 = r4.A03
            X.9RX r1 = r0.A00
            if (r1 != 0) goto L_0x005e
            X.9RX r1 = r0.A00()
            r0.A00 = r1
            if (r1 == 0) goto L_0x008b
        L_0x005e:
            X.7oG r6 = r1.A03
            java.lang.String r0 = "PaymentDeviceId: try to upgrade algorithm ..."
            r6.A04(r0)
            X.33l r5 = r1.A02
            android.content.SharedPreferences r0 = r5.A03()
            java.lang.String r2 = "payments_device_id_algorithm"
            int r1 = X.C18280x3.A02(r0, r2)
            r0 = 2
            if (r1 >= r0) goto L_0x008b
            java.lang.String r0 = "PaymentDeviceId: algorithm upgraded!"
            r6.A04(r0)
            r1 = 2
            android.content.SharedPreferences r0 = r5.A03()
            X.C86604Kt.A15(r0, r2, r1)
            r2 = 0
            android.content.SharedPreferences$Editor r1 = X.C620933l.A00(r5)
            java.lang.String r0 = "payments_device_id"
            X.C18270x1.A0j(r1, r0, r2)
        L_0x008b:
            monitor-enter(r3)
            r10 = 0
            X.33l r0 = r3.A03     // Catch:{ JSONException -> 0x00a4 }
            java.lang.String r1 = r0.A06()     // Catch:{ JSONException -> 0x00a4 }
            boolean r0 = android.text.TextUtils.isEmpty(r1)     // Catch:{ JSONException -> 0x00a4 }
            if (r0 != 0) goto L_0x00aa
            org.json.JSONObject r1 = X.AnonymousClass0x9.A1H(r1)     // Catch:{ JSONException -> 0x00a4 }
            java.lang.String r0 = "smsVerifDataGateway"
            java.lang.String r10 = r1.optString(r0, r10)     // Catch:{ JSONException -> 0x00a4 }
            goto L_0x00aa
        L_0x00a4:
            r1 = move-exception
            java.lang.String r0 = "PAY: IndiaUpiPaymentSharedPrefs readSmsGateway threw: "
            com.whatsapp.util.Log.w(r0, r1)     // Catch:{ all -> 0x017c }
        L_0x00aa:
            monitor-exit(r3)
            if (r10 != 0) goto L_0x00b8
            X.9U1 r3 = r4.A01
            X.99H r0 = r4.A00
            java.util.ArrayList r2 = r3.A08(r0)
            if (r2 != 0) goto L_0x0166
            r10 = 0
        L_0x00b8:
            X.9VD r5 = r4.A05
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "PAY: sendDeviceBindingIq called with psp: "
            r1.append(r0)
            r1.append(r9)
            java.lang.String r0 = " verificationData: "
            r1.append(r0)
            java.lang.String r0 = X.C195009Vm.A00(r8)
            X.C18260x0.A1L(r1, r0)
            X.9ca r4 = r5.A0F
            r1 = 0
            r0 = 20
            r3 = 0
            r4.A08(r3, r0, r1)
            X.7bd r2 = r5.A0D
            java.lang.String r0 = "upi-bind-device"
            r2.A03(r0)
            X.31C r7 = r5.A09
            java.lang.String r6 = r7.A03()
            long r0 = (long) r1
            X.9Se r11 = r5.A0I
            java.lang.String r17 = r11.A01()
            r15 = 0
            r13 = 0
            long[] r12 = X.AnonymousClass9VD.A0K
            int r11 = r12.length
            if (r13 >= r11) goto L_0x0161
            r13 = r12[r13]
        L_0x00f9:
            long r15 = r15 + r13
            java.lang.Long r15 = java.lang.Long.valueOf(r15)
            java.lang.Long r16 = java.lang.Long.valueOf(r0)
            X.9bS r0 = r5.A0B
            boolean r0 = r0.A0P()
            java.lang.String r21 = X.C1899693i.A0Z(r0)
            X.9IP r1 = new X.9IP
            r1.<init>(r6)
            X.9Ip r0 = new X.9Ip
            r18 = r8
            r19 = r9
            r20 = r10
            r13 = r0
            r14 = r1
            r13.<init>(r14, r15, r16, r17, r18, r19, r20, r21)
            X.1VX r8 = r5.A08
            r1 = 2227(0x8b3, float:3.12E-42)
            boolean r10 = r8.A0X(r1)
            java.lang.String r8 = "in_upi_device_binding_tag"
            if (r10 == 0) goto L_0x0132
            X.9B3 r9 = r5.A0G
            r1 = 185476608(0xb0e2600, float:2.7376793E-32)
            r9.A02(r1, r8)
        L_0x0132:
            r20 = 204(0xcc, float:2.86E-43)
            X.36K r1 = r0.A00
            X.2oU r0 = r5.A06
            android.content.Context r11 = r0.A00
            X.3Wi r12 = r5.A05
            X.2Ha r13 = r5.A0C
            if (r10 == 0) goto L_0x015f
            X.9B3 r3 = r5.A0G
        L_0x0142:
            r19 = 2
            X.9oW r10 = new X.9oW
            r17 = r3
            r18 = r8
            r16 = r4
            r15 = r5
            r14 = r2
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18, r19)
            r21 = 0
            r16 = r7
            r17 = r10
            r18 = r1
            r19 = r6
            r16.A0D(r17, r18, r19, r20, r21)
        L_0x015e:
            return
        L_0x015f:
            r8 = r3
            goto L_0x0142
        L_0x0161:
            r11 = 5
            long r13 = r0 * r11
            goto L_0x00f9
        L_0x0166:
            java.lang.String r0 = ""
            X.C626936e.A09(r0, r2)
            int r1 = r2.size()
            r3.A00 = r1
            int r0 = r3.A02
            int r0 = r0 % r1
            java.lang.Object r10 = r2.get(r0)
            java.lang.String r10 = (java.lang.String) r10
            goto L_0x00b8
        L_0x017c:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1901193x.handleMessage(android.os.Message):void");
    }
}
