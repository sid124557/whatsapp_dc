package X;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.HashMap;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.7Ug  reason: invalid class name and case insensitive filesystem */
public class C151317Ug {
    public int A00 = 2;
    public Bundle A01;
    public Boolean A02 = Boolean.FALSE;
    public Boolean A03 = null;
    public String A04 = "en_US";
    public String A05;
    public String A06;
    public HashMap A07;
    public JSONArray A08 = null;
    public JSONArray A09 = null;
    public JSONArray A0A;
    public JSONArray A0B;
    public JSONObject A0C = null;
    public JSONObject A0D = null;
    public JSONObject A0E = null;
    public JSONObject A0F;
    public AnonymousClass7XH A0G;
    public AnonymousClass7Q1 A0H;
    public boolean A0I;
    public boolean A0J;
    public boolean A0K;
    public boolean A0L;

    /* JADX WARNING: Removed duplicated region for block: B:124:0x0266 A[Catch:{ Exception -> 0x02e3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x0274 A[Catch:{ Exception -> 0x02e3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0073 A[Catch:{ Exception -> 0x02e3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:140:0x02cd A[Catch:{ Exception -> 0x02e3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x008f A[Catch:{ Exception -> 0x02e3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x00a5 A[Catch:{ Exception -> 0x02e3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00ba A[Catch:{ Exception -> 0x02e3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00ca A[Catch:{ Exception -> 0x02e3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00da A[Catch:{ Exception -> 0x02e3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00ea A[Catch:{ Exception -> 0x02e3 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C151317Ug(android.os.Bundle r18) {
        /*
            r17 = this;
            java.lang.String r1 = "payerBankName"
            java.lang.String r2 = "forgotUpiPINEnabled"
            java.lang.String r7 = "captureCardDetails"
            java.lang.String r8 = "issuerResendOTPLimit"
            java.lang.String r9 = "aadhaarResendOTPLimit"
            java.lang.String r10 = "resendIssuerOTPFeature"
            java.lang.String r14 = "resendAadhaarOTPFeature"
            r3 = r17
            r3.<init>()
            r4 = 0
            r3.A0C = r4
            r3.A0D = r4
            r3.A08 = r4
            r3.A0E = r4
            r3.A09 = r4
            java.lang.String r0 = "en_US"
            r3.A04 = r0
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            r3.A02 = r0
            r3.A03 = r4
            r0 = 2
            r3.A00 = r0
            r6 = 0
            r3.A0I = r6
            r3.A0J = r6
            r3.A0K = r6
            r3.A0L = r6
            java.lang.String r4 = ""
            r3.A05 = r4
            r3.A06 = r4
            java.util.HashMap r0 = X.AnonymousClass001.A0t()
            r3.A07 = r0
            org.json.JSONObject r0 = X.AnonymousClass0x9.A1G()
            r3.A0F = r0
            r5 = r18
            if (r18 == 0) goto L_0x02e3
            r3.A01 = r5
            java.lang.String r0 = "configuration"
            java.lang.String r0 = r5.getString(r0)     // Catch:{ Exception -> 0x02e3 }
            if (r0 == 0) goto L_0x005a
            org.json.JSONObject r0 = X.AnonymousClass0x9.A1H(r0)     // Catch:{ Exception -> 0x02e3 }
            r3.A0C = r0     // Catch:{ Exception -> 0x02e3 }
        L_0x005a:
            org.json.JSONObject r0 = r3.A0C     // Catch:{ Exception -> 0x02e3 }
            boolean r0 = r0.has(r14)     // Catch:{ Exception -> 0x02e3 }
            if (r0 == 0) goto L_0x0080
            org.json.JSONObject r0 = r3.A0C     // Catch:{ Exception -> 0x02e3 }
            boolean r0 = r0.getBoolean(r14)     // Catch:{ Exception -> 0x02e3 }
        L_0x0068:
            r3.A0I = r0     // Catch:{ Exception -> 0x02e3 }
        L_0x006a:
            org.json.JSONObject r0 = r3.A0C     // Catch:{ Exception -> 0x02e3 }
            boolean r0 = r0.has(r9)     // Catch:{ Exception -> 0x02e3 }
            r11 = 3
            if (r0 == 0) goto L_0x008f
            org.json.JSONObject r0 = r3.A0C     // Catch:{ Exception -> 0x02e3 }
            java.lang.String r0 = r0.getString(r9)     // Catch:{ Exception -> 0x02e3 }
            int r8 = java.lang.Integer.parseInt(r0)     // Catch:{ Exception -> 0x02e3 }
            r3.A00 = r8     // Catch:{ Exception -> 0x02e3 }
            goto L_0x00a3
        L_0x0080:
            org.json.JSONObject r0 = r3.A0C     // Catch:{ Exception -> 0x02e3 }
            boolean r0 = r0.has(r10)     // Catch:{ Exception -> 0x02e3 }
            if (r0 == 0) goto L_0x006a
            org.json.JSONObject r0 = r3.A0C     // Catch:{ Exception -> 0x02e3 }
            boolean r0 = r0.getBoolean(r10)     // Catch:{ Exception -> 0x02e3 }
            goto L_0x0068
        L_0x008f:
            org.json.JSONObject r0 = r3.A0C     // Catch:{ Exception -> 0x02e3 }
            boolean r0 = r0.has(r8)     // Catch:{ Exception -> 0x02e3 }
            if (r0 == 0) goto L_0x00a9
            org.json.JSONObject r0 = r3.A0C     // Catch:{ Exception -> 0x02e3 }
            java.lang.String r0 = r0.getString(r8)     // Catch:{ Exception -> 0x02e3 }
            int r8 = java.lang.Integer.parseInt(r0)     // Catch:{ Exception -> 0x02e3 }
            r3.A00 = r8     // Catch:{ Exception -> 0x02e3 }
        L_0x00a3:
            if (r8 <= r11) goto L_0x00aa
            r3.A00 = r11     // Catch:{ Exception -> 0x02e3 }
            r8 = 3
            goto L_0x00aa
        L_0x00a9:
            r8 = 2
        L_0x00aa:
            boolean r0 = r3.A0I     // Catch:{ Exception -> 0x02e3 }
            if (r0 == 0) goto L_0x00b2
            if (r8 > 0) goto L_0x00b2
            r3.A0I = r6     // Catch:{ Exception -> 0x02e3 }
        L_0x00b2:
            org.json.JSONObject r0 = r3.A0C     // Catch:{ Exception -> 0x02e3 }
            boolean r0 = r0.has(r7)     // Catch:{ Exception -> 0x02e3 }
            if (r0 == 0) goto L_0x00c2
            org.json.JSONObject r0 = r3.A0C     // Catch:{ Exception -> 0x02e3 }
            boolean r0 = r0.getBoolean(r7)     // Catch:{ Exception -> 0x02e3 }
            r3.A0J = r0     // Catch:{ Exception -> 0x02e3 }
        L_0x00c2:
            org.json.JSONObject r0 = r3.A0C     // Catch:{ Exception -> 0x02e3 }
            boolean r0 = r0.has(r2)     // Catch:{ Exception -> 0x02e3 }
            if (r0 == 0) goto L_0x00d2
            org.json.JSONObject r0 = r3.A0C     // Catch:{ Exception -> 0x02e3 }
            boolean r0 = r0.getBoolean(r2)     // Catch:{ Exception -> 0x02e3 }
            r3.A0K = r0     // Catch:{ Exception -> 0x02e3 }
        L_0x00d2:
            org.json.JSONObject r0 = r3.A0C     // Catch:{ Exception -> 0x02e3 }
            boolean r0 = r0.has(r1)     // Catch:{ Exception -> 0x02e3 }
            if (r0 == 0) goto L_0x00e2
            org.json.JSONObject r0 = r3.A0C     // Catch:{ Exception -> 0x02e3 }
            java.lang.String r0 = r0.getString(r1)     // Catch:{ Exception -> 0x02e3 }
            r3.A05 = r0     // Catch:{ Exception -> 0x02e3 }
        L_0x00e2:
            java.lang.String r0 = "controls"
            java.lang.String r0 = r5.getString(r0)     // Catch:{ Exception -> 0x02e3 }
            if (r0 == 0) goto L_0x025e
            org.json.JSONObject r1 = X.AnonymousClass0x9.A1H(r0)     // Catch:{ Exception -> 0x02e3 }
            r3.A0D = r1     // Catch:{ Exception -> 0x02e3 }
            java.lang.String r0 = "CredAllowed"
            java.lang.String r1 = r1.getString(r0)     // Catch:{ Exception -> 0x02e3 }
            if (r1 == 0) goto L_0x025e
            org.json.JSONArray r0 = new org.json.JSONArray     // Catch:{ Exception -> 0x02e3 }
            r0.<init>(r1)     // Catch:{ Exception -> 0x02e3 }
            r3.A08 = r0     // Catch:{ Exception -> 0x02e3 }
            java.util.ArrayList r2 = X.AnonymousClass001.A0s()     // Catch:{ Exception -> 0x02e3 }
            r12 = 0
            r10 = r12
            r8 = r12
            r16 = r12
            r1 = r12
            r9 = r12
            r7 = r12
            r13 = 0
        L_0x010c:
            org.json.JSONArray r0 = r3.A08     // Catch:{ Exception -> 0x02e3 }
            int r0 = r0.length()     // Catch:{ Exception -> 0x02e3 }
            if (r13 >= r0) goto L_0x0192
            org.json.JSONArray r0 = r3.A08     // Catch:{ Exception -> 0x018e }
            java.lang.Object r15 = r0.get(r13)     // Catch:{ Exception -> 0x018e }
            org.json.JSONObject r15 = (org.json.JSONObject) r15     // Catch:{ Exception -> 0x018e }
            java.lang.String r0 = "subtype"
            java.lang.String r15 = r15.optString(r0, r4)     // Catch:{ Exception -> 0x018e }
            java.lang.String r0 = "ATM"
            boolean r0 = r15.equals(r0)     // Catch:{ Exception -> 0x018e }
            if (r0 == 0) goto L_0x0130
            org.json.JSONArray r0 = r3.A08     // Catch:{ Exception -> 0x018e }
            org.json.JSONObject r12 = r0.getJSONObject(r13)     // Catch:{ Exception -> 0x018e }
        L_0x0130:
            java.lang.String r0 = "ATMPIN"
            boolean r0 = r15.equals(r0)     // Catch:{ Exception -> 0x018e }
            if (r0 == 0) goto L_0x013e
            org.json.JSONArray r0 = r3.A08     // Catch:{ Exception -> 0x018e }
            org.json.JSONObject r16 = r0.getJSONObject(r13)     // Catch:{ Exception -> 0x018e }
        L_0x013e:
            java.lang.String r0 = "OTP|SMS|HOTP|TOTP"
            boolean r0 = r15.matches(r0)     // Catch:{ Exception -> 0x018e }
            if (r0 == 0) goto L_0x014c
            org.json.JSONArray r0 = r3.A08     // Catch:{ Exception -> 0x018e }
            org.json.JSONObject r10 = r0.getJSONObject(r13)     // Catch:{ Exception -> 0x018e }
        L_0x014c:
            java.lang.String r0 = "MPIN"
            boolean r0 = r15.equals(r0)     // Catch:{ Exception -> 0x018e }
            if (r0 == 0) goto L_0x015a
            org.json.JSONArray r0 = r3.A08     // Catch:{ Exception -> 0x018e }
            org.json.JSONObject r8 = r0.getJSONObject(r13)     // Catch:{ Exception -> 0x018e }
        L_0x015a:
            java.lang.String r0 = "NMPIN"
            boolean r0 = r15.equals(r0)     // Catch:{ Exception -> 0x018e }
            if (r0 == 0) goto L_0x0168
            org.json.JSONArray r0 = r3.A08     // Catch:{ Exception -> 0x018e }
            org.json.JSONObject r9 = r0.getJSONObject(r13)     // Catch:{ Exception -> 0x018e }
        L_0x0168:
            java.lang.String r0 = "AADHAAR"
            boolean r0 = r15.equals(r0)     // Catch:{ Exception -> 0x018e }
            if (r0 == 0) goto L_0x0180
            org.json.JSONArray r0 = r3.A08     // Catch:{ Exception -> 0x018e }
            org.json.JSONObject r1 = r0.getJSONObject(r13)     // Catch:{ Exception -> 0x018e }
            org.json.JSONObject r0 = r3.A0C     // Catch:{ Exception -> 0x018e }
            boolean r0 = r0.has(r14)     // Catch:{ Exception -> 0x018e }
            if (r0 != 0) goto L_0x0180
            r3.A0I = r6     // Catch:{ Exception -> 0x018e }
        L_0x0180:
            java.lang.String r0 = "SIGNATURE"
            boolean r0 = r15.equals(r0)     // Catch:{ Exception -> 0x018e }
            if (r0 == 0) goto L_0x018e
            org.json.JSONArray r0 = r3.A08     // Catch:{ Exception -> 0x018e }
            org.json.JSONObject r7 = r0.getJSONObject(r13)     // Catch:{ Exception -> 0x018e }
        L_0x018e:
            int r13 = r13 + 1
            goto L_0x010c
        L_0x0192:
            org.json.JSONArray r0 = r3.A08     // Catch:{ Exception -> 0x02e3 }
            int r0 = r0.length()     // Catch:{ Exception -> 0x02e3 }
            if (r0 != r11) goto L_0x01a9
            if (r12 == 0) goto L_0x01a9
            if (r10 == 0) goto L_0x01a9
            if (r8 == 0) goto L_0x01a9
            r2.add(r10)     // Catch:{ Exception -> 0x02e3 }
            r2.add(r12)     // Catch:{ Exception -> 0x02e3 }
            r2.add(r8)     // Catch:{ Exception -> 0x02e3 }
        L_0x01a9:
            org.json.JSONArray r0 = r3.A08     // Catch:{ Exception -> 0x02e3 }
            int r0 = r0.length()     // Catch:{ Exception -> 0x02e3 }
            if (r0 != r11) goto L_0x01c2
            if (r16 == 0) goto L_0x01c2
            if (r10 == 0) goto L_0x01c2
            if (r8 == 0) goto L_0x01c2
            r2.add(r10)     // Catch:{ Exception -> 0x02e3 }
            r0 = r16
            r2.add(r0)     // Catch:{ Exception -> 0x02e3 }
            r2.add(r8)     // Catch:{ Exception -> 0x02e3 }
        L_0x01c2:
            org.json.JSONArray r0 = r3.A08     // Catch:{ Exception -> 0x02e3 }
            int r0 = r0.length()     // Catch:{ Exception -> 0x02e3 }
            if (r0 != r11) goto L_0x01d9
            if (r1 == 0) goto L_0x01d9
            if (r10 == 0) goto L_0x01d9
            if (r8 == 0) goto L_0x01d9
            r2.add(r1)     // Catch:{ Exception -> 0x02e3 }
            r2.add(r10)     // Catch:{ Exception -> 0x02e3 }
            r2.add(r8)     // Catch:{ Exception -> 0x02e3 }
        L_0x01d9:
            org.json.JSONArray r0 = r3.A08     // Catch:{ Exception -> 0x02e3 }
            int r0 = r0.length()     // Catch:{ Exception -> 0x02e3 }
            r1 = 2
            if (r0 != r1) goto L_0x01ec
            if (r10 == 0) goto L_0x01ec
            if (r8 == 0) goto L_0x01ec
            r2.add(r10)     // Catch:{ Exception -> 0x02e3 }
            r2.add(r8)     // Catch:{ Exception -> 0x02e3 }
        L_0x01ec:
            org.json.JSONArray r0 = r3.A08     // Catch:{ Exception -> 0x02e3 }
            int r0 = r0.length()     // Catch:{ Exception -> 0x02e3 }
            if (r0 != r1) goto L_0x01fe
            if (r8 == 0) goto L_0x01fe
            if (r9 == 0) goto L_0x01fe
            r2.add(r8)     // Catch:{ Exception -> 0x02e3 }
            r2.add(r9)     // Catch:{ Exception -> 0x02e3 }
        L_0x01fe:
            org.json.JSONArray r0 = r3.A08     // Catch:{ Exception -> 0x02e3 }
            int r0 = r0.length()     // Catch:{ Exception -> 0x02e3 }
            if (r0 != r1) goto L_0x0210
            if (r8 == 0) goto L_0x0210
            if (r7 == 0) goto L_0x0210
            r2.add(r8)     // Catch:{ Exception -> 0x02e3 }
            r2.add(r7)     // Catch:{ Exception -> 0x02e3 }
        L_0x0210:
            int r0 = r2.size()     // Catch:{ Exception -> 0x02e3 }
            if (r0 <= 0) goto L_0x021d
            org.json.JSONArray r0 = new org.json.JSONArray     // Catch:{ Exception -> 0x02e3 }
            r0.<init>(r2)     // Catch:{ Exception -> 0x02e3 }
            r3.A08 = r0     // Catch:{ Exception -> 0x02e3 }
        L_0x021d:
            org.json.JSONArray r0 = r3.A08     // Catch:{ Exception -> 0x02e3 }
            org.json.JSONObject r0 = r0.optJSONObject(r6)     // Catch:{ Exception -> 0x02e3 }
            java.lang.String r7 = "subtype"
            if (r0 == 0) goto L_0x0237
            java.lang.String r1 = r0.optString(r7, r4)     // Catch:{ Exception -> 0x02e3 }
            java.lang.String r0 = "MPIN"
            boolean r0 = r1.equals(r0)     // Catch:{ Exception -> 0x02e3 }
            if (r0 == 0) goto L_0x0237
            java.lang.Boolean r0 = java.lang.Boolean.TRUE     // Catch:{ Exception -> 0x02e3 }
            r3.A02 = r0     // Catch:{ Exception -> 0x02e3 }
        L_0x0237:
            org.json.JSONArray r0 = r3.A08     // Catch:{ Exception -> 0x02e3 }
            int r0 = r0.length()     // Catch:{ Exception -> 0x02e3 }
            r2 = 1
            if (r0 != r2) goto L_0x025e
            org.json.JSONArray r0 = r3.A08     // Catch:{ Exception -> 0x02e3 }
            org.json.JSONObject r0 = r0.getJSONObject(r6)     // Catch:{ Exception -> 0x02e3 }
            java.lang.String r1 = r0.getString(r7)     // Catch:{ Exception -> 0x02e3 }
            if (r1 == 0) goto L_0x0254
            java.lang.String r0 = "IDENTITY"
            boolean r0 = r1.equals(r0)     // Catch:{ Exception -> 0x02e3 }
            if (r0 != 0) goto L_0x025c
        L_0x0254:
            java.lang.String r0 = "SIGNATURE"
            boolean r0 = r1.equals(r0)     // Catch:{ Exception -> 0x02e3 }
            if (r0 == 0) goto L_0x025e
        L_0x025c:
            r3.A0L = r2     // Catch:{ Exception -> 0x02e3 }
        L_0x025e:
            java.lang.String r0 = "salt"
            java.lang.String r0 = r5.getString(r0)     // Catch:{ Exception -> 0x02e3 }
            if (r0 == 0) goto L_0x026c
            org.json.JSONObject r0 = X.AnonymousClass0x9.A1H(r0)     // Catch:{ Exception -> 0x02e3 }
            r3.A0E = r0     // Catch:{ Exception -> 0x02e3 }
        L_0x026c:
            java.lang.String r0 = "payInfo"
            java.lang.String r1 = r5.getString(r0)     // Catch:{ Exception -> 0x02e3 }
            if (r1 == 0) goto L_0x02c5
            org.json.JSONArray r0 = new org.json.JSONArray     // Catch:{ Exception -> 0x02e3 }
            r0.<init>(r1)     // Catch:{ Exception -> 0x02e3 }
            r3.A09 = r0     // Catch:{ Exception -> 0x02e3 }
        L_0x027b:
            org.json.JSONArray r0 = r3.A09     // Catch:{ Exception -> 0x02e3 }
            int r0 = r0.length()     // Catch:{ Exception -> 0x02e3 }
            if (r6 >= r0) goto L_0x02c5
            org.json.JSONArray r0 = r3.A09     // Catch:{ Exception -> 0x02c2 }
            java.lang.Object r1 = r0.get(r6)     // Catch:{ Exception -> 0x02c2 }
            org.json.JSONObject r1 = (org.json.JSONObject) r1     // Catch:{ Exception -> 0x02c2 }
            java.lang.String r0 = "name"
            java.lang.String r1 = r1.optString(r0, r4)     // Catch:{ Exception -> 0x02c2 }
            X.6wu r0 = X.C142266wu.account     // Catch:{ Exception -> 0x02c2 }
            boolean r0 = r1.equals(r0)     // Catch:{ Exception -> 0x02c2 }
            if (r0 == 0) goto L_0x02c2
            org.json.JSONArray r0 = r3.A09     // Catch:{ Exception -> 0x02c2 }
            java.lang.Object r1 = r0.get(r6)     // Catch:{ Exception -> 0x02c2 }
            org.json.JSONObject r1 = (org.json.JSONObject) r1     // Catch:{ Exception -> 0x02c2 }
            java.lang.String r0 = "value"
            java.lang.String r2 = r1.optString(r0, r4)     // Catch:{ Exception -> 0x02c2 }
            r3.A06 = r2     // Catch:{ Exception -> 0x02c2 }
            int r1 = r2.length()     // Catch:{ Exception -> 0x02c2 }
            int r0 = r1 + -4
            java.lang.String r2 = r2.substring(r0, r1)     // Catch:{ Exception -> 0x02c2 }
            r3.A06 = r2     // Catch:{ Exception -> 0x02c2 }
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ Exception -> 0x02c2 }
            java.lang.String r0 = "XXXX"
            java.lang.String r0 = X.AnonymousClass000.A0V(r0, r2, r1)     // Catch:{ Exception -> 0x02c2 }
            r3.A06 = r0     // Catch:{ Exception -> 0x02c2 }
            goto L_0x02c5
        L_0x02c2:
            int r6 = r6 + 1
            goto L_0x027b
        L_0x02c5:
            java.lang.String r0 = "languagePref"
            java.lang.String r0 = r5.getString(r0)     // Catch:{ Exception -> 0x02e3 }
            if (r0 == 0) goto L_0x02cf
            r3.A04 = r0     // Catch:{ Exception -> 0x02e3 }
        L_0x02cf:
            org.json.JSONObject r1 = r3.A0E     // Catch:{ Exception -> 0x02e3 }
            java.lang.String r0 = "credType"
            org.json.JSONArray r0 = r1.getJSONArray(r0)     // Catch:{ Exception -> 0x02e3 }
            r3.A0A = r0     // Catch:{ Exception -> 0x02e3 }
            org.json.JSONObject r1 = r3.A0E     // Catch:{ Exception -> 0x02e3 }
            java.lang.String r0 = "txnId"
            org.json.JSONArray r0 = r1.getJSONArray(r0)     // Catch:{ Exception -> 0x02e3 }
            r3.A0B = r0     // Catch:{ Exception -> 0x02e3 }
        L_0x02e3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C151317Ug.<init>(android.os.Bundle):void");
    }

    public boolean A00() {
        Boolean bool = this.A03;
        if (bool == null) {
            if (this.A08 != null) {
                ArrayList A0s = AnonymousClass001.A0s();
                for (int i = 0; i < this.A08.length(); i++) {
                    try {
                        String string = this.A08.getJSONObject(i).getString("subtype");
                        if (string != null) {
                            A0s.add(string);
                        }
                    } catch (Exception unused) {
                    }
                }
                if (A0s.contains("OTP") || A0s.contains("SMS") || A0s.contains("EMAIL") || A0s.contains("HOTP") || A0s.contains("AADHAAR") || (A0s.contains("TOTP") && A0s.contains("MPIN"))) {
                    bool = Boolean.TRUE;
                    this.A03 = bool;
                }
            }
            bool = Boolean.FALSE;
            this.A03 = bool;
        }
        return bool.booleanValue();
    }
}
