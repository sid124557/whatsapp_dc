package X;

import android.content.Intent;
import android.os.Handler;
import android.os.RemoteException;
import android.util.Log;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.R;
import com.whatsapp.payments.ui.IndiaUpiPaymentsAccountSetupActivity;
import java.util.Locale;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.8I0  reason: invalid class name */
public final class AnonymousClass8I0 implements C185478tk {
    public final C55682qk A00;
    public final C56972sr A01;
    public final C620733j A02;
    public final AnonymousClass1VX A03;
    public final AnonymousClass4FV A04;
    public final AnonymousClass9U1 A05;
    public final C196629bS A06;
    public final C620933l A07;
    public final C197109ca A08;
    public final C160757oG A09 = C160757oG.A00("IndiaUpiPinManagerClLatest", "payment-settings", "IN");
    public final C46092b4 A0A;
    public final C194259Se A0B;
    public final C186568vZ A0C;
    public final String A0D;
    public final Map A0E;

    public AnonymousClass8I0(C55682qk r18, C56972sr r19, C620733j r20, AnonymousClass1VX r21, AnonymousClass4FV r22, AnonymousClass9U1 r23, C196629bS r24, C620933l r25, C197109ca r26, C46092b4 r27, C194259Se r28, C186568vZ r29) {
        AnonymousClass1VX r13 = r21;
        C162457s7.A0J(r13, 1);
        C46092b4 r0 = r27;
        C162457s7.A0J(r0, 2);
        C56972sr r15 = r19;
        C162457s7.A0J(r15, 3);
        C55682qk r16 = r18;
        C162457s7.A0J(r16, 4);
        AnonymousClass4FV r12 = r22;
        C162457s7.A0J(r12, 5);
        C194259Se r7 = r28;
        C620733j r14 = r20;
        C18260x0.A0U(r14, r7);
        C620933l r9 = r25;
        C162457s7.A0J(r9, 8);
        C186568vZ r6 = r29;
        AnonymousClass9U1 r11 = r23;
        C18280x3.A15(r11, r6);
        C197109ca r8 = r26;
        C196629bS r10 = r24;
        C18270x1.A13(r8, r10);
        this.A03 = r13;
        this.A0A = r0;
        this.A01 = r15;
        this.A00 = r16;
        this.A04 = r12;
        this.A02 = r14;
        this.A0B = r7;
        this.A07 = r9;
        this.A05 = r11;
        this.A0C = r6;
        this.A08 = r8;
        this.A06 = r10;
        this.A0D = r7.A01();
        AnonymousClass3Z6[] r4 = new AnonymousClass3Z6[2];
        AnonymousClass3Z6.A04("karur vysya bank", 8, r4);
        AnonymousClass3Z6.A09("dena bank", 4, r4, 1);
        this.A0E = C73813g7.A0G(r4);
    }

    public void Bpn(C89654ea r16, C166557yt r17, C182818p2 r18, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i) {
        String str9 = str8;
        this.A0A.A00(new C171928Iy(r16, r17, r18, this, str2, str3, str9, str4, str6, str7, str, str5, i));
    }

    public static final String A00(int i) {
        switch (i) {
            case 1:
                return "setMpin";
            case 2:
                return "changeMpin";
            case 3:
            case 6:
                return "pay";
            case 4:
                return "reqBalChk";
            case 5:
                return "collect";
            default:
                return "mandate";
        }
    }

    public final void A04(C89654ea r15, C182818p2 r16, String str, String str2, String str3, JSONArray jSONArray, JSONObject jSONObject, JSONObject jSONObject2) {
        int i;
        int i2;
        if (this.A07.A03().getBoolean("payment_account_recovered", false)) {
            C196629bS r1 = this.A06;
            if (!r1.A0S(r1.A07())) {
                r15.A6T(new Intent(r15, IndiaUpiPaymentsAccountSetupActivity.class), true);
                AnonymousClass9U1 r3 = this.A05;
                r3.A03().A07.add("done");
                C160757oG r2 = this.A09;
                StringBuilder A0o = AnonymousClass001.A0o();
                A0o.append("clearStates: ");
                r2.A06(AnonymousClass000.A0R(r3.A03(), A0o));
                r3.A0A();
                return;
            }
        }
        if (AnonymousClass9UE.A00(this.A03, this.A04, this.A0C, "pinEntry")) {
            i = R.string.f11nameremoved;
            i2 = R.string.f11nameremoved;
        } else if (AnonymousClass280.A00()) {
            this.A08.BKB(0, (Integer) null, "upi_payments_unavailable_on_legacy_android_dialog", "new_payment");
            i = R.string.f11nameremoved;
            i2 = R.string.f11nameremoved;
        } else {
            AnonymousClass6CU r32 = new AnonymousClass6CU(new C188698zL(new Handler(), r16, this));
            String valueOf = String.valueOf(jSONObject);
            String A0o2 = C18290x4.A0o(jSONObject2);
            String A0o3 = C18290x4.A0o(jSONArray);
            String A0o4 = C18290x4.A0o(C620733j.A02(this.A02));
            C156697h3 r22 = this.A0A.A00;
            if (r22 != null) {
                Log.d(C156697h3.class.getName(), "Get Credential called");
                try {
                    r22.A03.B6F("NPCI", str, str2, valueOf, A0o2, A0o3, str3, A0o4, C124606De.A01(r32.A00));
                    return;
                } catch (RemoteException unused) {
                    Log.e("CLServices", "Remote Exception in getCredential");
                    return;
                }
            } else {
                return;
            }
        }
        r15.Box(new Object[0], i, i2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0077, code lost:
        if (X.AnonymousClass001.A1W(r13.length()) != true) goto L_0x0079;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x008d, code lost:
        if (X.AnonymousClass001.A1W(r12.length()) != true) goto L_0x008f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00a3, code lost:
        if (X.AnonymousClass001.A1W(r11.length()) != true) goto L_0x00a5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00b9, code lost:
        if (X.AnonymousClass001.A1W(r10.length()) != true) goto L_0x00bb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00cf, code lost:
        if (X.AnonymousClass001.A1W(r9.length()) != true) goto L_0x00d1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00e5, code lost:
        if (X.AnonymousClass001.A1W(r8.length()) != true) goto L_0x00e7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x00fb, code lost:
        if (X.AnonymousClass001.A1W(r7.length()) != true) goto L_0x00fd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x005f, code lost:
        if (X.AnonymousClass001.A1W(r14.length()) != true) goto L_0x0061;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.String A01(X.C166557yt r16, java.lang.String r17) {
        /*
            org.json.JSONObject r1 = X.AnonymousClass0x9.A1H(r17)
            java.lang.String r0 = "txnId"
            org.json.JSONArray r0 = r1.getJSONArray(r0)
            X.C162457s7.A0D(r0)
            r2 = 0
            java.lang.String r13 = r0.optString(r2)
            java.lang.String r0 = "credType"
            org.json.JSONArray r0 = r1.getJSONArray(r0)
            X.C162457s7.A0D(r0)
            java.lang.String r14 = r0.optString(r2)
            java.lang.String r0 = "txnAmount"
            java.lang.String r7 = r1.optString(r0)
            java.lang.String r0 = "appId"
            java.lang.String r12 = r1.optString(r0)
            java.lang.String r0 = "deviceId"
            java.lang.String r10 = r1.optString(r0)
            java.lang.String r0 = "mobileNumber"
            java.lang.String r11 = r1.optString(r0)
            java.lang.String r0 = "payerAddr"
            java.lang.String r9 = r1.optString(r0)
            java.lang.String r0 = "payeeAddr"
            java.lang.String r8 = r1.optString(r0)
            java.lang.String r0 = "random"
            java.lang.String r3 = r1.optString(r0)
            X.C162457s7.A0D(r3)
            r15 = 0
            r0 = 150(0x96, float:2.1E-43)
            java.lang.StringBuilder r4 = X.AnonymousClass6CA.A0Y(r0)     // Catch:{ Exception -> 0x0139 }
            r5 = 1
            if (r14 == 0) goto L_0x0061
            int r0 = r14.length()     // Catch:{ Exception -> 0x0139 }
            boolean r1 = X.AnonymousClass001.A1W(r0)
            r0 = 1
            if (r1 == r5) goto L_0x0062
        L_0x0061:
            r0 = 0
        L_0x0062:
            java.lang.String r6 = "|"
            if (r0 == 0) goto L_0x006c
            r4.append(r14)     // Catch:{ Exception -> 0x0139 }
            r4.append(r6)     // Catch:{ Exception -> 0x0139 }
        L_0x006c:
            if (r13 == 0) goto L_0x0079
            int r0 = r13.length()     // Catch:{ Exception -> 0x0139 }
            boolean r1 = X.AnonymousClass001.A1W(r0)
            r0 = 1
            if (r1 == r5) goto L_0x007a
        L_0x0079:
            r0 = 0
        L_0x007a:
            if (r0 == 0) goto L_0x0082
            r4.append(r13)     // Catch:{ Exception -> 0x0139 }
            r4.append(r6)     // Catch:{ Exception -> 0x0139 }
        L_0x0082:
            if (r12 == 0) goto L_0x008f
            int r0 = r12.length()     // Catch:{ Exception -> 0x0139 }
            boolean r1 = X.AnonymousClass001.A1W(r0)
            r0 = 1
            if (r1 == r5) goto L_0x0090
        L_0x008f:
            r0 = 0
        L_0x0090:
            if (r0 == 0) goto L_0x0098
            r4.append(r12)     // Catch:{ Exception -> 0x0139 }
            r4.append(r6)     // Catch:{ Exception -> 0x0139 }
        L_0x0098:
            if (r11 == 0) goto L_0x00a5
            int r0 = r11.length()     // Catch:{ Exception -> 0x0139 }
            boolean r1 = X.AnonymousClass001.A1W(r0)
            r0 = 1
            if (r1 == r5) goto L_0x00a6
        L_0x00a5:
            r0 = 0
        L_0x00a6:
            if (r0 == 0) goto L_0x00ae
            r4.append(r11)     // Catch:{ Exception -> 0x0139 }
            r4.append(r6)     // Catch:{ Exception -> 0x0139 }
        L_0x00ae:
            if (r10 == 0) goto L_0x00bb
            int r0 = r10.length()     // Catch:{ Exception -> 0x0139 }
            boolean r1 = X.AnonymousClass001.A1W(r0)
            r0 = 1
            if (r1 == r5) goto L_0x00bc
        L_0x00bb:
            r0 = 0
        L_0x00bc:
            if (r0 == 0) goto L_0x00c4
            r4.append(r10)     // Catch:{ Exception -> 0x0139 }
            r4.append(r6)     // Catch:{ Exception -> 0x0139 }
        L_0x00c4:
            if (r9 == 0) goto L_0x00d1
            int r0 = r9.length()     // Catch:{ Exception -> 0x0139 }
            boolean r1 = X.AnonymousClass001.A1W(r0)
            r0 = 1
            if (r1 == r5) goto L_0x00d2
        L_0x00d1:
            r0 = 0
        L_0x00d2:
            if (r0 == 0) goto L_0x00da
            r4.append(r9)     // Catch:{ Exception -> 0x0139 }
            r4.append(r6)     // Catch:{ Exception -> 0x0139 }
        L_0x00da:
            if (r8 == 0) goto L_0x00e7
            int r0 = r8.length()     // Catch:{ Exception -> 0x0139 }
            boolean r1 = X.AnonymousClass001.A1W(r0)
            r0 = 1
            if (r1 == r5) goto L_0x00e8
        L_0x00e7:
            r0 = 0
        L_0x00e8:
            if (r0 == 0) goto L_0x00f0
            r4.append(r8)     // Catch:{ Exception -> 0x0139 }
            r4.append(r6)     // Catch:{ Exception -> 0x0139 }
        L_0x00f0:
            if (r7 == 0) goto L_0x00fd
            int r0 = r7.length()     // Catch:{ Exception -> 0x0139 }
            boolean r1 = X.AnonymousClass001.A1W(r0)
            r0 = 1
            if (r1 == r5) goto L_0x00fe
        L_0x00fd:
            r0 = 0
        L_0x00fe:
            if (r0 == 0) goto L_0x0106
            r4.append(r7)     // Catch:{ Exception -> 0x0139 }
            r4.append(r6)     // Catch:{ Exception -> 0x0139 }
        L_0x0106:
            int r1 = r4.lastIndexOf(r6)     // Catch:{ Exception -> 0x0139 }
            r0 = -1
            if (r1 == r0) goto L_0x0117
            int r0 = r4.length()     // Catch:{ Exception -> 0x0139 }
            int r0 = r0 - r5
            if (r1 != r0) goto L_0x0117
            r4.deleteCharAt(r1)     // Catch:{ Exception -> 0x0139 }
        L_0x0117:
            r0 = r16
            java.lang.Object r1 = r0.A00     // Catch:{ Exception -> 0x0132 }
            byte[] r1 = (byte[]) r1     // Catch:{ Exception -> 0x0132 }
            if (r1 == 0) goto L_0x0130
            java.lang.String r0 = X.C18290x4.A0o(r4)     // Catch:{ Exception -> 0x0132 }
            byte[] r0 = X.C57422tc.A00(r0, r3)     // Catch:{ Exception -> 0x0132 }
            byte[] r0 = X.C57422tc.A01(r3, r0, r1)     // Catch:{ Exception -> 0x0132 }
        L_0x012b:
            java.lang.String r0 = android.util.Base64.encodeToString(r0, r2)     // Catch:{ Exception -> 0x0132 }
            return r0
        L_0x0130:
            r0 = r15
            goto L_0x012b
        L_0x0132:
            r1 = move-exception
            java.lang.String r0 = "CryptoUtils exception on CreateTrust Base64.encodeToString"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ Exception -> 0x0139 }
            throw r1     // Catch:{ Exception -> 0x0139 }
        L_0x0139:
            java.lang.String r0 = "CryptoUtils exception on CreateTrust"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass8I0.A01(X.7yt, java.lang.String):java.lang.String");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0048, code lost:
        if (r13.length() == 0) goto L_0x004a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x007c, code lost:
        if (r12.length() == 0) goto L_0x007e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x009e, code lost:
        if (r14.length() == 0) goto L_0x00a0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000c, code lost:
        if (r10.length() == 0) goto L_0x000e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final org.json.JSONArray A02(android.content.Context r8, X.AnonymousClass39Q r9, java.lang.String r10, java.lang.String r11, java.lang.String r12, java.lang.String r13, java.lang.String r14, int r15) {
        /*
            r7 = this;
            org.json.JSONArray r3 = X.AnonymousClass0x9.A1F()
            r6 = 0
            if (r10 == 0) goto L_0x000e
            int r1 = r10.length()     // Catch:{ JSONException -> 0x00ed }
            r0 = 0
            if (r1 != 0) goto L_0x000f
        L_0x000e:
            r0 = 1
        L_0x000f:
            java.lang.String r4 = "value"
            java.lang.String r5 = "name"
            if (r0 != 0) goto L_0x0026
            org.json.JSONObject r1 = X.AnonymousClass0x9.A1G()     // Catch:{ JSONException -> 0x00ed }
            java.lang.String r0 = "payeeName"
            org.json.JSONObject r0 = r1.putOpt(r5, r0)     // Catch:{ JSONException -> 0x00ed }
            org.json.JSONObject r0 = r0.putOpt(r4, r10)     // Catch:{ JSONException -> 0x00ed }
            r3.put(r0)     // Catch:{ JSONException -> 0x00ed }
        L_0x0026:
            int r0 = r11.length()     // Catch:{ JSONException -> 0x00ed }
            boolean r0 = X.AnonymousClass001.A1W(r0)
            if (r0 == 0) goto L_0x0041
            org.json.JSONObject r1 = X.AnonymousClass0x9.A1G()     // Catch:{ JSONException -> 0x00ed }
            java.lang.String r0 = "account"
            org.json.JSONObject r0 = r1.putOpt(r5, r0)     // Catch:{ JSONException -> 0x00ed }
            org.json.JSONObject r0 = r0.putOpt(r4, r11)     // Catch:{ JSONException -> 0x00ed }
            r3.put(r0)     // Catch:{ JSONException -> 0x00ed }
        L_0x0041:
            if (r13 == 0) goto L_0x004a
            int r1 = r13.length()     // Catch:{ JSONException -> 0x00ed }
            r0 = 0
            if (r1 != 0) goto L_0x004b
        L_0x004a:
            r0 = 1
        L_0x004b:
            if (r0 != 0) goto L_0x005e
            org.json.JSONObject r1 = X.AnonymousClass0x9.A1G()     // Catch:{ JSONException -> 0x00ed }
            java.lang.String r0 = "refId"
            org.json.JSONObject r0 = r1.putOpt(r5, r0)     // Catch:{ JSONException -> 0x00ed }
            org.json.JSONObject r0 = r0.putOpt(r4, r13)     // Catch:{ JSONException -> 0x00ed }
            r3.put(r0)     // Catch:{ JSONException -> 0x00ed }
        L_0x005e:
            if (r9 == 0) goto L_0x0075
            org.json.JSONObject r1 = X.AnonymousClass0x9.A1G()     // Catch:{ JSONException -> 0x00ed }
            java.lang.String r0 = "txnAmount"
            org.json.JSONObject r1 = r1.putOpt(r5, r0)     // Catch:{ JSONException -> 0x00ed }
            java.lang.String r0 = r9.toString()     // Catch:{ JSONException -> 0x00ed }
            org.json.JSONObject r0 = r1.putOpt(r4, r0)     // Catch:{ JSONException -> 0x00ed }
            r3.put(r0)     // Catch:{ JSONException -> 0x00ed }
        L_0x0075:
            if (r12 == 0) goto L_0x007e
            int r1 = r12.length()     // Catch:{ JSONException -> 0x00ed }
            r0 = 0
            if (r1 != 0) goto L_0x007f
        L_0x007e:
            r0 = 1
        L_0x007f:
            if (r0 != 0) goto L_0x0097
            org.json.JSONObject r1 = X.AnonymousClass0x9.A1G()     // Catch:{ JSONException -> 0x00ed }
            r0 = 2131896231(0x7f1227a7, float:1.9427317E38)
            java.lang.String r0 = r8.getString(r0)     // Catch:{ JSONException -> 0x00ed }
            org.json.JSONObject r0 = r1.putOpt(r5, r0)     // Catch:{ JSONException -> 0x00ed }
            org.json.JSONObject r0 = r0.putOpt(r4, r12)     // Catch:{ JSONException -> 0x00ed }
            r3.put(r0)     // Catch:{ JSONException -> 0x00ed }
        L_0x0097:
            if (r14 == 0) goto L_0x00a0
            int r1 = r14.length()     // Catch:{ JSONException -> 0x00ed }
            r0 = 0
            if (r1 != 0) goto L_0x00a1
        L_0x00a0:
            r0 = 1
        L_0x00a1:
            if (r0 != 0) goto L_0x00b9
            org.json.JSONObject r1 = X.AnonymousClass0x9.A1G()     // Catch:{ JSONException -> 0x00ed }
            r0 = 2131891687(0x7f1215e7, float:1.9418101E38)
            java.lang.String r0 = r8.getString(r0)     // Catch:{ JSONException -> 0x00ed }
            org.json.JSONObject r0 = r1.putOpt(r5, r0)     // Catch:{ JSONException -> 0x00ed }
            org.json.JSONObject r0 = r0.putOpt(r4, r14)     // Catch:{ JSONException -> 0x00ed }
            r3.put(r0)     // Catch:{ JSONException -> 0x00ed }
        L_0x00b9:
            switch(r15) {
                case 7: goto L_0x00cf;
                case 8: goto L_0x00cc;
                case 9: goto L_0x00c9;
                case 10: goto L_0x00c6;
                case 11: goto L_0x00c3;
                case 12: goto L_0x00c0;
                default: goto L_0x00bc;
            }     // Catch:{ JSONException -> 0x00ed }
        L_0x00bc:
            r2 = 0
        L_0x00bd:
            if (r2 == 0) goto L_0x00d8
            goto L_0x00d2
        L_0x00c0:
            java.lang.String r2 = "unpause"
            goto L_0x00bd
        L_0x00c3:
            java.lang.String r2 = "pause"
            goto L_0x00bd
        L_0x00c6:
            java.lang.String r2 = "revoke"
            goto L_0x00bd
        L_0x00c9:
            java.lang.String r2 = "modify"
            goto L_0x00bd
        L_0x00cc:
            java.lang.String r2 = "create"
            goto L_0x00bd
        L_0x00cf:
            java.lang.String r2 = "register"
            goto L_0x00bd
        L_0x00d2:
            int r0 = r2.length()     // Catch:{ JSONException -> 0x00ed }
            if (r0 != 0) goto L_0x00d9
        L_0x00d8:
            r6 = 1
        L_0x00d9:
            if (r6 != 0) goto L_0x00ec
            org.json.JSONObject r1 = X.AnonymousClass0x9.A1G()     // Catch:{ JSONException -> 0x00ed }
            java.lang.String r0 = "mandateSubType"
            org.json.JSONObject r0 = r1.putOpt(r5, r0)     // Catch:{ JSONException -> 0x00ed }
            org.json.JSONObject r0 = r0.putOpt(r4, r2)     // Catch:{ JSONException -> 0x00ed }
            r3.put(r0)     // Catch:{ JSONException -> 0x00ed }
        L_0x00ec:
            return r3
        L_0x00ed:
            r0 = move-exception
            java.lang.RuntimeException r0 = X.C18330xA.A09(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass8I0.A02(android.content.Context, X.39Q, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int):org.json.JSONArray");
    }

    public final JSONObject A03(String str, boolean z, boolean z2) {
        JSONObject A1G = AnonymousClass0x9.A1G();
        try {
            A1G.put("payerBankName", str);
            A1G.put("backgroundColor", "#FFFFFF");
            A1G.put("color", "#00FF00");
            if (z) {
                A1G.put("resendOTPFeature", "true");
            }
            if (z2) {
                A1G.put("verifiedMerchant", "true");
                return A1G;
            }
        } catch (JSONException e) {
            this.A09.A0A("getKeyConfig threw: ", e);
        }
        return A1G;
    }

    public String B0V(int i) {
        try {
            JSONObject A1G = AnonymousClass0x9.A1G();
            JSONArray A1F = AnonymousClass0x9.A1F();
            if (i <= 0) {
                i = 4;
            }
            JSONObject A1G2 = AnonymousClass0x9.A1G();
            A1G2.put(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "PIN");
            A1G2.put("subtype", "MPIN");
            A1G2.put("dType", "NUM");
            A1G2.put("dLength", i);
            A1F.put(A1G2);
            return AnonymousClass0x9.A0y(A1F, "CredAllowed", A1G);
        } catch (JSONException e) {
            this.A09.A0A("createCredRequired threw: ", e);
            return null;
        }
    }

    public String B6E(AnonymousClass99H r14, int i, boolean z) {
        Number number;
        int i2;
        Number A0Z = C18290x4.A0Z();
        switch (i) {
            case 1:
                C166557yt r4 = r14.A07;
                C166557yt r11 = r14.A08;
                C166557yt r2 = r14.A04;
                try {
                    JSONObject A1G = AnonymousClass0x9.A1G();
                    JSONArray A1F = AnonymousClass0x9.A1F();
                    Number number2 = (Number) r14.A07.A00;
                    if (number2 != null && number2.intValue() == 0) {
                        String optString = AnonymousClass0x9.A1H(C166557yt.A00(r14.A06)).optString("bank_name");
                        if (optString != null) {
                            Map map = this.A0E;
                            String lowerCase = optString.toLowerCase(Locale.ROOT);
                            C162457s7.A0D(lowerCase);
                            number = (Number) map.get(lowerCase);
                        } else {
                            number = null;
                        }
                        AnonymousClass3QD A002 = AnonymousClass3QD.A00();
                        Class cls = Integer.TYPE;
                        if (number != null) {
                            i2 = number.intValue();
                        } else {
                            i2 = 6;
                        }
                        r4 = new C166557yt(A002, cls, Integer.valueOf(i2), "otpLength");
                        this.A09.A06(AnonymousClass000.A0P(r4, "createCredRequired otpLength override: ", AnonymousClass001.A0o()));
                    }
                    C626936e.A06(r4);
                    Object obj = r4.A00;
                    C626936e.A06(obj);
                    C162457s7.A0D(obj);
                    if (AnonymousClass001.A0K(obj) > 0) {
                        JSONObject A1G2 = AnonymousClass0x9.A1G();
                        A1G2.put(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "OTP");
                        A1G2.put("subtype", "SMS");
                        A1G2.put("dType", "NUM");
                        A1G2.put("dLength", obj);
                        A1F.put(A1G2);
                        if (z) {
                            JSONObject A1G3 = AnonymousClass0x9.A1G();
                            A1G3.put(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "OTP");
                            A1G3.put("subtype", "AADHAAR");
                            A1G3.put("dType", "NUM");
                            A1G3.put("dLength", obj);
                            A1F.put(A1G3);
                        }
                    }
                    C626936e.A06(r11);
                    Object obj2 = r11.A00;
                    C626936e.A06(obj2);
                    C162457s7.A0D(obj2);
                    if (AnonymousClass001.A0K(obj2) <= 0) {
                        obj2 = C18290x4.A0b();
                    }
                    C626936e.A06(obj2);
                    C162457s7.A0D(obj2);
                    if (AnonymousClass001.A0K(obj2) > 0) {
                        JSONObject A1G4 = AnonymousClass0x9.A1G();
                        A1G4.put(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "PIN");
                        A1G4.put("subtype", "MPIN");
                        A1G4.put("dType", "NUM");
                        A1G4.put("dLength", obj2);
                        A1F.put(A1G4);
                    }
                    if (r14.A01 == 2) {
                        Object obj3 = r2.A00;
                        C626936e.A06(obj3);
                        C162457s7.A0D(obj3);
                        if (AnonymousClass001.A0K(obj3) > 0) {
                            JSONObject A1G5 = AnonymousClass0x9.A1G();
                            A1G5.put(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "PIN");
                            A1G5.put("subtype", "ATMPIN");
                            A1G5.put("dType", "NUM");
                            A1G5.put("dLength", obj3);
                            A1F.put(A1G5);
                        }
                    }
                    return AnonymousClass0x9.A0y(A1F, "CredAllowed", A1G);
                } catch (JSONException e) {
                    this.A09.A0A("createCredRequired threw: ", e);
                    return null;
                }
            case 2:
                Number number3 = (Number) r14.A08.A00;
                if (number3 != null) {
                    A0Z = number3;
                }
                int intValue = A0Z.intValue();
                JSONObject A1G6 = AnonymousClass0x9.A1G();
                JSONArray A1F2 = AnonymousClass0x9.A1F();
                if (intValue <= 0) {
                    intValue = 4;
                }
                JSONObject A1G7 = AnonymousClass0x9.A1G();
                A1G7.put(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "PIN");
                A1G7.put("subtype", "MPIN");
                A1G7.put("dType", "NUM");
                A1G7.put("dLength", intValue);
                A1F2.put(A1G7);
                JSONObject A1G8 = AnonymousClass0x9.A1G();
                A1G8.put(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "PIN");
                A1G8.put("subtype", "NMPIN");
                A1G8.put("dType", "NUM");
                A1G8.put("dLength", intValue);
                A1F2.put(A1G8);
                return AnonymousClass0x9.A0y(A1F2, "CredAllowed", A1G6);
            default:
                Number number4 = (Number) r14.A08.A00;
                if (number4 != null) {
                    A0Z = number4;
                }
                return B0V(A0Z.intValue());
        }
        this.A09.A0A("createCredRequired threw: ", e);
        return null;
    }

    public void Bpo(C89654ea r23, AnonymousClass39Q r24, C166557yt r25, AnonymousClass9AG r26, C182818p2 r27, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, int i, boolean z) {
        String str13 = str3;
        String str14 = str2;
        C182818p2 r6 = r27;
        String str15 = str12;
        AnonymousClass9AG r5 = r26;
        String str16 = str11;
        C166557yt r4 = r25;
        String str17 = str10;
        AnonymousClass39Q r3 = r24;
        String str18 = str9;
        C89654ea r2 = r23;
        String str19 = str8;
        this.A0A.A00(new C171938Iz(r2, r3, r4, r5, r6, this, str14, str5, str13, str4, str18, str7, str6, str19, str16, str15, str, str17, i, z));
    }
}
