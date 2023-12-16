package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.util.Log;
import java.util.Arrays;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.9W2  reason: invalid class name */
public class AnonymousClass9W2 {
    public int A00;
    public long A01;
    public long A02;
    public long A03;
    public long A04;
    public AnonymousClass39L A05;
    public C166557yt A06;
    public C166557yt A07;
    public C166557yt A08;
    @Deprecated
    public C166557yt A09;
    public C166557yt A0A;
    public C195059Vs A0B;
    public C195109Vz A0C;
    public String A0D;
    public String A0E;
    public String A0F;
    public String A0G;
    public String A0H;
    public String A0I;
    public String A0J;
    public String A0K;
    public String A0L;
    public boolean A0M;
    public boolean A0N;
    public boolean A0O;
    public AnonymousClass9V3[] A0P;

    /* JADX WARNING: Code restructure failed: missing block: B:72:0x01a0, code lost:
        if (r7.equals(r1) == false) goto L_0x01a2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass9W2(X.C617332a r18, X.AnonymousClass36K r19) {
        /*
            r17 = this;
            r4 = r17
            r4.<init>()
            r2 = 1
            r4.A0M = r2
            java.lang.String r0 = "mandate-no"
            r8 = 0
            r5 = r19
            java.lang.String r3 = r5.A0r(r0, r8)
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            java.lang.Class<java.lang.String> r7 = java.lang.String.class
            if (r0 != 0) goto L_0x0025
            X.3QD r1 = X.AnonymousClass3QD.A00()
            java.lang.String r0 = "mandateNo"
            X.7yt r0 = X.C1899693i.A0F(r1, r7, r3, r0)
            r4.A08 = r0
        L_0x0025:
            java.lang.String r0 = "amount-rule"
            java.lang.String r1 = r5.A0r(r0, r8)
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L_0x0033
            r4.A0G = r1
        L_0x0033:
            java.lang.String r0 = "is-revocable"
            java.lang.String r0 = r5.A0r(r0, r8)
            r9 = 0
            if (r0 == 0) goto L_0x0045
            int r0 = X.C615531h.A01(r0, r9)
            if (r0 == r2) goto L_0x0043
            r2 = 0
        L_0x0043:
            r4.A0N = r2
        L_0x0045:
            java.lang.String r0 = "mandate-name"
            java.lang.String r2 = r5.A0r(r0, r8)
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 != 0) goto L_0x005d
            X.3QD r1 = X.AnonymousClass3QD.A00()
            java.lang.String r0 = "mandateName"
            X.7yt r0 = X.C1899693i.A0F(r1, r7, r2, r0)
            r4.A07 = r0
        L_0x005d:
            java.lang.String r0 = "purpose-code"
            java.lang.String r2 = r5.A0r(r0, r8)
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 != 0) goto L_0x0075
            X.3QD r1 = X.AnonymousClass3QD.A00()
            java.lang.String r0 = "upiPurposeCode"
            X.7yt r0 = X.C1899693i.A0F(r1, r7, r2, r0)
            r4.A0A = r0
        L_0x0075:
            java.lang.String r0 = "start-ts"
            java.lang.String r2 = r5.A0r(r0, r8)
            r10 = 1000(0x3e8, double:4.94E-321)
            r0 = 0
            if (r2 == 0) goto L_0x0088
            long r2 = X.C615531h.A04(r2, r0)
            long r2 = r2 * r10
            r4.A02 = r2
        L_0x0088:
            java.lang.String r2 = "end-ts"
            java.lang.String r2 = r5.A0r(r2, r8)
            if (r2 == 0) goto L_0x0097
            long r2 = X.C615531h.A04(r2, r0)
            long r2 = r2 * r10
            r4.A01 = r2
        L_0x0097:
            java.lang.String r2 = "debit-ts"
            java.lang.String r2 = r5.A0r(r2, r8)
            if (r2 == 0) goto L_0x00a1
            r4.A0D = r2
        L_0x00a1:
            java.lang.String r2 = "next-payment-ts"
            java.lang.String r2 = r5.A0r(r2, r8)
            if (r2 == 0) goto L_0x00b0
            long r2 = X.C615531h.A04(r2, r0)
            long r2 = r2 * r10
            r4.A04 = r2
        L_0x00b0:
            java.lang.String r2 = "next-payment-end-ts"
            java.lang.String r2 = r5.A0r(r2, r8)
            if (r2 == 0) goto L_0x00bf
            long r0 = X.C615531h.A04(r2, r0)
            long r0 = r0 * r10
            r4.A03 = r0
        L_0x00bf:
            java.lang.String r0 = "error-code"
            java.lang.String r0 = r5.A0r(r0, r8)
            if (r0 == 0) goto L_0x00c9
            r4.A0H = r0
        L_0x00c9:
            java.lang.String r0 = "original-amount"
            X.36K r1 = r5.A0l(r0)
            java.lang.String r2 = "moneyStringValue"
            r6 = r18
            if (r1 != 0) goto L_0x00e2
            java.lang.String r0 = r5.A0r(r0, r8)
            if (r0 == 0) goto L_0x0108
            X.7yt r0 = X.C1899593h.A0C(r0, r2)
            r4.A09 = r0
            goto L_0x0108
        L_0x00e2:
            java.lang.String r0 = "money"
            X.36K r0 = r1.A0l(r0)
            if (r0 == 0) goto L_0x0108
            X.39L r0 = X.C192809Lq.A00(r6, r0)
            r4.A05 = r0     // Catch:{ Exception -> 0x0103 }
            X.3QD r1 = X.AnonymousClass3QD.A00()     // Catch:{ Exception -> 0x0103 }
            X.39Q r0 = r0.A02     // Catch:{ Exception -> 0x0103 }
            java.math.BigDecimal r0 = r0.A00     // Catch:{ Exception -> 0x0103 }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x0103 }
            X.7yt r0 = X.C1899693i.A0F(r1, r7, r0, r2)     // Catch:{ Exception -> 0x0103 }
            r4.A09 = r0     // Catch:{ Exception -> 0x0103 }
            goto L_0x0108
        L_0x0103:
            java.lang.String r0 = "PAY: IndiaUpiMandateMetadata - and error occured while parsing the money node"
            com.whatsapp.util.Log.e((java.lang.String) r0)
        L_0x0108:
            java.lang.String r0 = "total-expected-txns"
            int r0 = r5.A0b(r0, r9)     // Catch:{ 24Y -> 0x0147 }
            r4.A00 = r0     // Catch:{ 24Y -> 0x0147 }
            java.lang.String r0 = "pause-resume-status-details"
            X.36K r1 = r5.A0l(r0)     // Catch:{ 24Y -> 0x0147 }
            if (r1 == 0) goto L_0x011f
            X.9Vs r0 = new X.9Vs     // Catch:{ 24Y -> 0x0147 }
            r0.<init>((X.AnonymousClass36K) r1)     // Catch:{ 24Y -> 0x0147 }
            r4.A0B = r0     // Catch:{ 24Y -> 0x0147 }
        L_0x011f:
            java.lang.String r0 = "transaction"
            java.util.List r8 = r5.A0s(r0)     // Catch:{ 24Y -> 0x0147 }
            boolean r0 = r8.isEmpty()     // Catch:{ 24Y -> 0x0147 }
            if (r0 != 0) goto L_0x014c
            int r3 = r8.size()     // Catch:{ 24Y -> 0x0147 }
            X.9V3[] r0 = new X.AnonymousClass9V3[r3]     // Catch:{ 24Y -> 0x0147 }
            r4.A0P = r0     // Catch:{ 24Y -> 0x0147 }
        L_0x0133:
            if (r9 >= r3) goto L_0x014c
            X.9V3[] r2 = r4.A0P     // Catch:{ 24Y -> 0x0147 }
            java.lang.Object r1 = r8.get(r9)     // Catch:{ 24Y -> 0x0147 }
            X.36K r1 = (X.AnonymousClass36K) r1     // Catch:{ 24Y -> 0x0147 }
            X.9V3 r0 = new X.9V3     // Catch:{ 24Y -> 0x0147 }
            r0.<init>((X.AnonymousClass36K) r1)     // Catch:{ 24Y -> 0x0147 }
            r2[r9] = r0     // Catch:{ 24Y -> 0x0147 }
            int r9 = r9 + 1
            goto L_0x0133
        L_0x0147:
            java.lang.String r0 = "PAY: IndiaUpiMandateMetadata - and error occurred while parsing recurring mandate info"
            com.whatsapp.util.Log.e((java.lang.String) r0)
        L_0x014c:
            java.lang.String r0 = "mandate-info"
            r3 = 0
            java.lang.String r2 = r5.A0r(r0, r3)
            if (r2 == 0) goto L_0x0161
            X.3QD r1 = X.AnonymousClass3QD.A00()
            java.lang.String r0 = "mandateInfo"
            X.7yt r0 = X.C1899693i.A0F(r1, r7, r2, r0)
            r4.A06 = r0
        L_0x0161:
            java.lang.String r0 = "frequency-rule"
            java.lang.String r0 = r5.A0r(r0, r3)
            java.lang.String r2 = "UNKNOWN"
            if (r0 == 0) goto L_0x0186
            int r16 = r0.hashCode()
            java.lang.String r15 = "MONTHLY"
            java.lang.String r14 = "ASPRESENTED"
            java.lang.String r13 = "QUARTERLY"
            java.lang.String r12 = "BIMONTHLY"
            java.lang.String r11 = "FORTNIGHTLY"
            java.lang.String r10 = "HALFYEARLY"
            java.lang.String r9 = "DAILY"
            java.lang.String r8 = "ONETIME"
            java.lang.String r7 = "YEARLY"
            java.lang.String r1 = "WEEKLY"
            switch(r16) {
                case -1738378111: goto L_0x01c6;
                case -1681232246: goto L_0x01ce;
                case -602281453: goto L_0x01d6;
                case 64808441: goto L_0x01de;
                case 1134556285: goto L_0x01e6;
                case 1271097434: goto L_0x01ee;
                case 1297843654: goto L_0x01f6;
                case 1720567065: goto L_0x01fe;
                case 1896178312: goto L_0x0206;
                case 1954618349: goto L_0x020f;
                default: goto L_0x0186;
            }
        L_0x0186:
            r4.A0E = r2
            java.lang.String r0 = "recurrence-rule"
            java.lang.String r7 = r5.A0r(r0, r3)
            java.lang.String r2 = "ON"
            if (r7 == 0) goto L_0x01a2
            java.lang.String r1 = "AFTER"
            boolean r0 = r7.equals(r1)
            if (r0 != 0) goto L_0x01c4
            java.lang.String r1 = "BEFORE"
            boolean r0 = r7.equals(r1)
            if (r0 != 0) goto L_0x01c4
        L_0x01a2:
            r4.A0K = r2
            java.lang.String r0 = "recurrence-day"
            java.lang.String r0 = r5.A0r(r0, r3)
            r4.A0J = r0
            java.lang.String r0 = "ref-id"
            java.lang.String r0 = r5.A0r(r0, r3)
            r4.A0L = r0
            java.lang.String r0 = "mandate-update"
            X.36K r1 = r5.A0l(r0)
            if (r1 == 0) goto L_0x01c3
            X.9Vz r0 = new X.9Vz
            r0.<init>(r6, r1)
            r4.A0C = r0
        L_0x01c3:
            return
        L_0x01c4:
            r2 = r1
            goto L_0x01a2
        L_0x01c6:
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0186
            r2 = r1
            goto L_0x0186
        L_0x01ce:
            boolean r0 = r0.equals(r7)
            if (r0 == 0) goto L_0x0186
            r2 = r7
            goto L_0x0186
        L_0x01d6:
            boolean r0 = r0.equals(r8)
            if (r0 == 0) goto L_0x0186
            r2 = r8
            goto L_0x0186
        L_0x01de:
            boolean r0 = r0.equals(r9)
            if (r0 == 0) goto L_0x0186
            r2 = r9
            goto L_0x0186
        L_0x01e6:
            boolean r0 = r0.equals(r10)
            if (r0 == 0) goto L_0x0186
            r2 = r10
            goto L_0x0186
        L_0x01ee:
            boolean r0 = r0.equals(r11)
            if (r0 == 0) goto L_0x0186
            r2 = r11
            goto L_0x0186
        L_0x01f6:
            boolean r0 = r0.equals(r12)
            if (r0 == 0) goto L_0x0186
            r2 = r12
            goto L_0x0186
        L_0x01fe:
            boolean r0 = r0.equals(r13)
            if (r0 == 0) goto L_0x0186
            r2 = r13
            goto L_0x0186
        L_0x0206:
            boolean r0 = r0.equals(r14)
            if (r0 == 0) goto L_0x0186
            r2 = r14
            goto L_0x0186
        L_0x020f:
            boolean r0 = r0.equals(r15)
            if (r0 == 0) goto L_0x0186
            r2 = r15
            goto L_0x0186
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass9W2.<init>(X.32a, X.36K):void");
    }

    public int A00() {
        C195059Vs r7 = this.A0B;
        if (r7 != null) {
            String str = r7.A02;
            if (!str.equals("RESUME")) {
                if (str.equals("PAUSE")) {
                    String str2 = r7.A03;
                    switch (str2.hashCode()) {
                        case -1149187101:
                            if (str2.equals("SUCCESS")) {
                                return 2;
                            }
                            break;
                        case -368591510:
                            if (str2.equals("FAILURE")) {
                                return 3;
                            }
                            break;
                        case 35394935:
                            if (str2.equals("PENDING")) {
                                return 1;
                            }
                            break;
                    }
                }
            }
            String str3 = r7.A03;
            switch (str3.hashCode()) {
                case -1149187101:
                    if (str3.equals("SUCCESS")) {
                        return 5;
                    }
                    break;
                case -368591510:
                    if (str3.equals("FAILURE")) {
                        return 6;
                    }
                    break;
                case 35394935:
                    if (str3.equals("PENDING")) {
                        return 4;
                    }
                    break;
            }
        }
        return 0;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof AnonymousClass9W2)) {
            return false;
        }
        return A01().equals(((AnonymousClass9W2) obj).A01());
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.A0M), Boolean.valueOf(this.A0N), Boolean.valueOf(this.A0O), Long.valueOf(this.A02), Long.valueOf(this.A01), this.A0D, this.A0I, Long.valueOf(this.A04), Long.valueOf(this.A03), Integer.valueOf(this.A00), this.A0G, this.A08, this.A07, this.A0A, this.A0H, this.A05, this.A09, this.A06, this.A0E, this.A0K, this.A0J, this.A0L, this.A0B, this.A0P, this.A0C, this.A0F});
    }

    public String toString() {
        String obj;
        C195109Vz r0 = this.A0C;
        String str = "null";
        if (r0 == null) {
            obj = str;
        } else {
            obj = r0.toString();
        }
        C195059Vs r02 = this.A0B;
        if (r02 != null) {
            str = r02.toString();
        }
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("[ ");
        AnonymousClass9V3[] r6 = this.A0P;
        if (r6 != null) {
            for (AnonymousClass9V3 A1B : r6) {
                AnonymousClass000.A1B(A1B, A0o);
            }
        }
        StringBuilder A0w = C18290x4.A0w(" ]", A0o);
        A0w.append("[ mandateNo: ");
        A0w.append(this.A08);
        A0w.append(" mandateErrorCode: ");
        A0w.append(this.A0H);
        A0w.append(" isMandate : ");
        A0w.append(this.A0M);
        A0w.append(" mandateName : ");
        A0w.append(this.A07);
        A0w.append(" upiPurposeCode : ");
        A0w.append(this.A0A);
        StringBuilder A0w2 = C18290x4.A0w(" mandateStartTs: ", A0w);
        A0w2.append(this.A02);
        C195009Vm.A04(A0w2, A0w);
        StringBuilder A0w3 = C18290x4.A0w(" mandateEndTs: ", A0w);
        A0w3.append(this.A01);
        C195009Vm.A04(A0w3, A0w);
        StringBuilder A0w4 = C18290x4.A0w(" debitTs: ", A0w);
        A0w4.append(this.A0D);
        C195009Vm.A04(A0w4, A0w);
        StringBuilder A0w5 = C18290x4.A0w(" previousDebitTs: ", A0w);
        A0w5.append(this.A0I);
        C195009Vm.A04(A0w5, A0w);
        StringBuilder A0w6 = C18290x4.A0w(" nextPaymentTs: ", A0w);
        A0w6.append(this.A04);
        C195009Vm.A04(A0w6, A0w);
        StringBuilder A0w7 = C18290x4.A0w(" nextPaymentEndTs: ", A0w);
        A0w7.append(this.A03);
        C195009Vm.A04(A0w7, A0w);
        StringBuilder A0w8 = C18290x4.A0w(" totalRecurringTxnCount: ", A0w);
        A0w8.append(this.A00);
        C195009Vm.A04(A0w8, A0w);
        StringBuilder A0w9 = C18290x4.A0w(" initiationMode: ", A0w);
        A0w9.append(this.A0F);
        C195009Vm.A04(A0w9, A0w);
        A0w.append(" mandateInfo: ");
        A0w.append(this.A06);
        A0w.append(" pendingMandateUpdate: {");
        A0w.append(obj);
        A0w.append("}  pauseResumeStatusDetails: {");
        A0w.append(str);
        C18270x1.A1H(A0w, "}  instanceTransactions: {", A0o);
        return AnonymousClass000.A0X("} ]", A0w);
    }

    public String A01() {
        String str;
        Object obj;
        String str2;
        String str3;
        Object obj2;
        Object obj3;
        try {
            JSONObject A1G = AnonymousClass0x9.A1G();
            A1G.put("isMandate", this.A0M);
            A1G.put("isRevocable", this.A0N);
            A1G.put("isShareToPayee", this.A0O);
            long j = this.A02;
            if (j > 0) {
                A1G.put("mandateStartTs", j);
            }
            long j2 = this.A01;
            if (j2 > 0) {
                A1G.put("mandateEndTs", j2);
            }
            String str4 = this.A0G;
            if (str4 != null) {
                A1G.put("mandateAmountRule", str4);
            }
            C166557yt r1 = this.A08;
            if (r1 != null) {
                C1899693i.A0r(r1, "mandateNo", A1G);
            }
            C166557yt r12 = this.A07;
            if (r12 != null) {
                C1899693i.A0r(r12, "mandateName", A1G);
            }
            C166557yt r13 = this.A0A;
            if (r13 != null) {
                C1899693i.A0r(r13, "upiPurposeCode", A1G);
            }
            String str5 = this.A0H;
            if (str5 != null) {
                A1G.put("mandateErrorCode", str5);
            }
            C166557yt r14 = this.A09;
            if (!C161527pr.A03(r14)) {
                C1899693i.A0r(r14, "originalAmount", A1G);
            }
            AnonymousClass39L r0 = this.A05;
            if (r0 != null) {
                A1G.put("originalMoney", r0.A01());
            }
            C195109Vz r2 = this.A0C;
            if (r2 != null) {
                try {
                    JSONObject A1G2 = AnonymousClass0x9.A1G();
                    C166557yt r15 = r2.A03;
                    if (r15 != null) {
                        C1899693i.A0r(r15, "pendingAmount", A1G2);
                    }
                    AnonymousClass39L r02 = r2.A01;
                    if (r02 != null) {
                        A1G2.put("pendingMoney", r02.A01());
                    }
                    String str6 = r2.A06;
                    if (str6 != null) {
                        A1G2.put("isRevocable", str6);
                    }
                    long j3 = r2.A00;
                    if (j3 > 0) {
                        A1G2.put("mandateEndTs", j3);
                    }
                    String str7 = r2.A07;
                    if (str7 != null) {
                        A1G2.put("mandateAmountRule", str7);
                    }
                    C166557yt r6 = r2.A04;
                    if (!C161527pr.A03(r6)) {
                        if (r6 == null) {
                            obj3 = null;
                        } else {
                            obj3 = r6.A00;
                        }
                        A1G2.put("seqNum", obj3);
                    }
                    String str8 = r2.A05;
                    if (str8 != null) {
                        A1G2.put("errorCode", str8);
                    }
                    String str9 = r2.A09;
                    if (str9 != null) {
                        A1G2.put("mandateUpdateStatus", str9);
                    }
                    String str10 = r2.A08;
                    if (str10 != null) {
                        A1G2.put("mandateUpdateAction", str10);
                    }
                    C166557yt r22 = r2.A02;
                    if (!C161527pr.A03(r22)) {
                        if (r22 == null) {
                            obj2 = null;
                        } else {
                            obj2 = r22.A00;
                        }
                        A1G2.put("mandateUpdateInfo", obj2);
                    }
                    str3 = A1G2.toString();
                } catch (JSONException e) {
                    Log.w("PAY: IndiaUpiTransactionPendingUpdateMetadata toJsonString threw: ", e);
                    str3 = null;
                }
                A1G.put("pendingMandateUpdate", str3);
            }
            C166557yt r16 = this.A06;
            if (r16 != null) {
                C1899693i.A0r(r16, "mandateInfo", A1G);
            }
            String str11 = this.A0E;
            if (str11 != null) {
                A1G.put("frequencyRule", str11);
            }
            String str12 = this.A0K;
            if (str12 != null) {
                A1G.put("recurrenceRule", str12);
            }
            String str13 = this.A0J;
            if (str13 != null) {
                A1G.put("recurrenceDay", str13);
            }
            String str14 = this.A0L;
            if (str14 != null) {
                A1G.put("refId", str14);
            }
            int i = this.A00;
            if (i > 0) {
                A1G.put("totalRecurringTxnCount", i);
            }
            String str15 = this.A0D;
            if (str15 != null) {
                A1G.put("debitTs", str15);
            }
            String str16 = this.A0I;
            if (str16 != null) {
                A1G.put("previousDebitTs", str16);
            }
            long j4 = this.A04;
            if (j4 > 0) {
                A1G.put("nextPaymentTs", j4);
            }
            long j5 = this.A03;
            if (j5 > 0) {
                A1G.put("nextPaymentEndTs", j5);
            }
            C195059Vs r62 = this.A0B;
            if (r62 != null) {
                JSONObject A1G3 = AnonymousClass0x9.A1G();
                try {
                    A1G3.put("action", r62.A02);
                    A1G3.put("status", r62.A03);
                    A1G3.put("pauseStartTs", r62.A01);
                    A1G3.put("pauseEndTs", r62.A00);
                    str2 = A1G3.toString();
                } catch (JSONException e2) {
                    Log.w("PAY: IndiaUpiMandateMetadata:PauseResumeStatusDetails toJsonString threw: ", e2);
                    str2 = null;
                }
                A1G.put("pauseResumeStatusDetails", str2);
            }
            AnonymousClass9V3[] r03 = this.A0P;
            if (r03 != null && r03.length > 0) {
                JSONArray jSONArray = new JSONArray();
                for (AnonymousClass9V3 r3 : this.A0P) {
                    JSONObject A1G4 = AnonymousClass0x9.A1G();
                    try {
                        C166557yt r04 = r3.A00;
                        if (r04 == null) {
                            obj = null;
                        } else {
                            obj = r04.A00;
                        }
                        A1G4.put(PublicKeyCredentialControllerUtility.JSON_KEY_ID, obj);
                        str = AnonymousClass0x9.A0y(r3.A01, "status", A1G4);
                    } catch (JSONException e3) {
                        Log.w("PAY: IndiaUpiMandateMetadata:InstanceTransaction toJsonString threw: ", e3);
                        str = null;
                    }
                    jSONArray.put(str);
                }
                A1G.put("instanceTransactions", jSONArray);
            }
            String str17 = this.A0F;
            if (str17 != null) {
                A1G.put("initiationMode", str17);
            }
            return A1G.toString();
        } catch (JSONException e4) {
            Log.w("PAY: IndiaUpiTransactionMetadata toDBString threw: ", e4);
            return null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0174, code lost:
        r6 = new org.json.JSONArray(r2.optString("instanceTransactions", "[]"));
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass9W2(java.lang.String r15) {
        /*
            r14 = this;
            java.lang.String r11 = "instanceTransactions"
            java.lang.String r10 = "pauseResumeStatusDetails"
            java.lang.String r9 = "pendingMandateUpdate"
            java.lang.String r8 = "mandateInfo"
            java.lang.String r7 = "upiPurposeCode"
            java.lang.String r6 = "mandateName"
            java.lang.String r5 = "mandateNo"
            java.lang.String r4 = "originalMoney"
            java.lang.Class<java.lang.String> r3 = java.lang.String.class
            r14.<init>()
            boolean r0 = android.text.TextUtils.isEmpty(r15)
            if (r0 != 0) goto L_0x01af
            org.json.JSONObject r2 = X.AnonymousClass0x9.A1H(r15)     // Catch:{ JSONException -> 0x01a9 }
            java.lang.String r0 = "isMandate"
            r1 = 0
            boolean r0 = r2.optBoolean(r0, r1)     // Catch:{ JSONException -> 0x01a9 }
            r14.A0M = r0     // Catch:{ JSONException -> 0x01a9 }
            java.lang.String r0 = "isRevocable"
            boolean r0 = r2.optBoolean(r0, r1)     // Catch:{ JSONException -> 0x01a9 }
            r14.A0N = r0     // Catch:{ JSONException -> 0x01a9 }
            java.lang.String r0 = "isShareToPayee"
            boolean r0 = r2.optBoolean(r0, r1)     // Catch:{ JSONException -> 0x01a9 }
            r14.A0O = r0     // Catch:{ JSONException -> 0x01a9 }
            java.lang.String r12 = "mandateStartTs"
            long r0 = r14.A02     // Catch:{ JSONException -> 0x01a9 }
            long r0 = r2.optLong(r12, r0)     // Catch:{ JSONException -> 0x01a9 }
            r14.A02 = r0     // Catch:{ JSONException -> 0x01a9 }
            java.lang.String r12 = "mandateEndTs"
            long r0 = r14.A01     // Catch:{ JSONException -> 0x01a9 }
            long r0 = r2.optLong(r12, r0)     // Catch:{ JSONException -> 0x01a9 }
            r14.A01 = r0     // Catch:{ JSONException -> 0x01a9 }
            java.lang.String r1 = "debitTs"
            java.lang.String r0 = r14.A0D     // Catch:{ JSONException -> 0x01a9 }
            java.lang.String r0 = r2.optString(r1, r0)     // Catch:{ JSONException -> 0x01a9 }
            r14.A0D = r0     // Catch:{ JSONException -> 0x01a9 }
            java.lang.String r1 = "previousDebitTs"
            java.lang.String r0 = r14.A0I     // Catch:{ JSONException -> 0x01a9 }
            java.lang.String r0 = r2.optString(r1, r0)     // Catch:{ JSONException -> 0x01a9 }
            r14.A0I = r0     // Catch:{ JSONException -> 0x01a9 }
            java.lang.String r12 = "nextPaymentTs"
            long r0 = r14.A04     // Catch:{ JSONException -> 0x01a9 }
            long r0 = r2.optLong(r12, r0)     // Catch:{ JSONException -> 0x01a9 }
            r14.A04 = r0     // Catch:{ JSONException -> 0x01a9 }
            java.lang.String r12 = "nextPaymentEndTs"
            long r0 = r14.A03     // Catch:{ JSONException -> 0x01a9 }
            long r0 = r2.optLong(r12, r0)     // Catch:{ JSONException -> 0x01a9 }
            r14.A03 = r0     // Catch:{ JSONException -> 0x01a9 }
            java.lang.String r1 = "totalRecurringTxnCount"
            int r0 = r14.A00     // Catch:{ JSONException -> 0x01a9 }
            int r0 = r2.optInt(r1, r0)     // Catch:{ JSONException -> 0x01a9 }
            r14.A00 = r0     // Catch:{ JSONException -> 0x01a9 }
            java.lang.String r1 = "mandateAmountRule"
            java.lang.String r0 = r14.A0G     // Catch:{ JSONException -> 0x01a9 }
            java.lang.String r0 = r2.optString(r1, r0)     // Catch:{ JSONException -> 0x01a9 }
            r14.A0G = r0     // Catch:{ JSONException -> 0x01a9 }
            java.lang.String r12 = "moneyStringValue"
            X.3QD r1 = X.AnonymousClass3QD.A00()     // Catch:{ JSONException -> 0x01a9 }
            java.lang.String r13 = "originalAmount"
            X.7yt r0 = r14.A09     // Catch:{ JSONException -> 0x01a9 }
            if (r0 != 0) goto L_0x0096
            r0 = 0
            goto L_0x0098
        L_0x0096:
            java.lang.Object r0 = r0.A00     // Catch:{ JSONException -> 0x01a9 }
        L_0x0098:
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ JSONException -> 0x01a9 }
            java.lang.String r0 = r2.optString(r13, r0)     // Catch:{ JSONException -> 0x01a9 }
            X.7yt r0 = X.C1899693i.A0F(r1, r3, r0, r12)     // Catch:{ JSONException -> 0x01a9 }
            r14.A09 = r0     // Catch:{ JSONException -> 0x01a9 }
            boolean r0 = r2.has(r4)     // Catch:{ JSONException -> 0x01a9 }
            if (r0 == 0) goto L_0x00b9
            org.json.JSONObject r1 = r2.optJSONObject(r4)     // Catch:{ JSONException -> 0x01a9 }
            X.2xu r0 = new X.2xu     // Catch:{ JSONException -> 0x01a9 }
            r0.<init>(r1)     // Catch:{ JSONException -> 0x01a9 }
            X.39L r0 = r0.A01()     // Catch:{ JSONException -> 0x01a9 }
            r14.A05 = r0     // Catch:{ JSONException -> 0x01a9 }
        L_0x00b9:
            X.3QD r1 = X.AnonymousClass3QD.A00()     // Catch:{ JSONException -> 0x01a9 }
            X.7yt r0 = r14.A08     // Catch:{ JSONException -> 0x01a9 }
            if (r0 != 0) goto L_0x00c3
            r0 = 0
            goto L_0x00c5
        L_0x00c3:
            java.lang.Object r0 = r0.A00     // Catch:{ JSONException -> 0x01a9 }
        L_0x00c5:
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ JSONException -> 0x01a9 }
            java.lang.String r0 = r2.optString(r5, r0)     // Catch:{ JSONException -> 0x01a9 }
            X.7yt r0 = X.C1899693i.A0F(r1, r3, r0, r5)     // Catch:{ JSONException -> 0x01a9 }
            r14.A08 = r0     // Catch:{ JSONException -> 0x01a9 }
            X.3QD r1 = X.AnonymousClass3QD.A00()     // Catch:{ JSONException -> 0x01a9 }
            X.7yt r0 = r14.A07     // Catch:{ JSONException -> 0x01a9 }
            if (r0 != 0) goto L_0x00db
            r0 = 0
            goto L_0x00dd
        L_0x00db:
            java.lang.Object r0 = r0.A00     // Catch:{ JSONException -> 0x01a9 }
        L_0x00dd:
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ JSONException -> 0x01a9 }
            java.lang.String r0 = r2.optString(r6, r0)     // Catch:{ JSONException -> 0x01a9 }
            X.7yt r0 = X.C1899693i.A0F(r1, r3, r0, r6)     // Catch:{ JSONException -> 0x01a9 }
            r14.A07 = r0     // Catch:{ JSONException -> 0x01a9 }
            X.3QD r1 = X.AnonymousClass3QD.A00()     // Catch:{ JSONException -> 0x01a9 }
            X.7yt r0 = r14.A0A     // Catch:{ JSONException -> 0x01a9 }
            if (r0 != 0) goto L_0x00f3
            r0 = 0
            goto L_0x00f5
        L_0x00f3:
            java.lang.Object r0 = r0.A00     // Catch:{ JSONException -> 0x01a9 }
        L_0x00f5:
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ JSONException -> 0x01a9 }
            java.lang.String r0 = r2.optString(r7, r0)     // Catch:{ JSONException -> 0x01a9 }
            X.7yt r0 = X.C1899693i.A0F(r1, r3, r0, r7)     // Catch:{ JSONException -> 0x01a9 }
            r14.A0A = r0     // Catch:{ JSONException -> 0x01a9 }
            java.lang.String r1 = "mandateErrorCode"
            java.lang.String r0 = r14.A0H     // Catch:{ JSONException -> 0x01a9 }
            java.lang.String r0 = r2.optString(r1, r0)     // Catch:{ JSONException -> 0x01a9 }
            r14.A0H = r0     // Catch:{ JSONException -> 0x01a9 }
            X.3QD r1 = X.AnonymousClass3QD.A00()     // Catch:{ JSONException -> 0x01a9 }
            X.7yt r0 = r14.A06     // Catch:{ JSONException -> 0x01a9 }
            if (r0 != 0) goto L_0x0115
            r0 = 0
            goto L_0x0117
        L_0x0115:
            java.lang.Object r0 = r0.A00     // Catch:{ JSONException -> 0x01a9 }
        L_0x0117:
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ JSONException -> 0x01a9 }
            java.lang.String r0 = r2.optString(r8, r0)     // Catch:{ JSONException -> 0x01a9 }
            X.7yt r0 = X.C1899693i.A0F(r1, r3, r0, r8)     // Catch:{ JSONException -> 0x01a9 }
            r14.A06 = r0     // Catch:{ JSONException -> 0x01a9 }
            java.lang.String r1 = "frequencyRule"
            java.lang.String r0 = r14.A0E     // Catch:{ JSONException -> 0x01a9 }
            java.lang.String r0 = r2.optString(r1, r0)     // Catch:{ JSONException -> 0x01a9 }
            r14.A0E = r0     // Catch:{ JSONException -> 0x01a9 }
            java.lang.String r1 = "recurrenceRule"
            java.lang.String r0 = r14.A0K     // Catch:{ JSONException -> 0x01a9 }
            java.lang.String r0 = r2.optString(r1, r0)     // Catch:{ JSONException -> 0x01a9 }
            r14.A0K = r0     // Catch:{ JSONException -> 0x01a9 }
            java.lang.String r1 = "recurrenceDay"
            java.lang.String r0 = r14.A0J     // Catch:{ JSONException -> 0x01a9 }
            java.lang.String r0 = r2.optString(r1, r0)     // Catch:{ JSONException -> 0x01a9 }
            r14.A0J = r0     // Catch:{ JSONException -> 0x01a9 }
            java.lang.String r1 = "refId"
            java.lang.String r0 = r14.A0L     // Catch:{ JSONException -> 0x01a9 }
            java.lang.String r0 = r2.optString(r1, r0)     // Catch:{ JSONException -> 0x01a9 }
            r14.A0L = r0     // Catch:{ JSONException -> 0x01a9 }
            boolean r0 = r2.has(r9)     // Catch:{ JSONException -> 0x01a9 }
            r3 = 0
            if (r0 == 0) goto L_0x015d
            java.lang.String r1 = r2.optString(r9, r3)     // Catch:{ JSONException -> 0x01a9 }
            X.9Vz r0 = new X.9Vz     // Catch:{ JSONException -> 0x01a9 }
            r0.<init>(r1)     // Catch:{ JSONException -> 0x01a9 }
            r14.A0C = r0     // Catch:{ JSONException -> 0x01a9 }
        L_0x015d:
            boolean r0 = r2.has(r10)     // Catch:{ JSONException -> 0x01a9 }
            if (r0 == 0) goto L_0x016e
            java.lang.String r1 = r2.optString(r10, r3)     // Catch:{ JSONException -> 0x01a9 }
            X.9Vs r0 = new X.9Vs     // Catch:{ JSONException -> 0x01a9 }
            r0.<init>((java.lang.String) r1)     // Catch:{ JSONException -> 0x01a9 }
            r14.A0B = r0     // Catch:{ JSONException -> 0x01a9 }
        L_0x016e:
            boolean r0 = r2.has(r11)     // Catch:{ JSONException -> 0x01a9 }
            if (r0 == 0) goto L_0x01a0
            java.lang.String r0 = "[]"
            java.lang.String r0 = r2.optString(r11, r0)     // Catch:{ JSONException -> 0x01a9 }
            org.json.JSONArray r6 = new org.json.JSONArray     // Catch:{ JSONException -> 0x01a9 }
            r6.<init>(r0)     // Catch:{ JSONException -> 0x01a9 }
            int r5 = r6.length()     // Catch:{ JSONException -> 0x01a9 }
            if (r5 <= 0) goto L_0x01a0
            X.9V3[] r0 = new X.AnonymousClass9V3[r5]     // Catch:{ JSONException -> 0x01a9 }
            r14.A0P = r0     // Catch:{ JSONException -> 0x01a9 }
            r4 = 0
        L_0x018a:
            X.9V3[] r3 = r14.A0P     // Catch:{ JSONException -> 0x01a9 }
            java.lang.Object r0 = r6.get(r4)     // Catch:{ JSONException -> 0x01a9 }
            java.lang.String r1 = r0.toString()     // Catch:{ JSONException -> 0x01a9 }
            X.9V3 r0 = new X.9V3     // Catch:{ JSONException -> 0x01a9 }
            r0.<init>((java.lang.String) r1)     // Catch:{ JSONException -> 0x01a9 }
            r3[r4] = r0     // Catch:{ JSONException -> 0x01a9 }
            int r4 = r4 + 1
            if (r4 >= r5) goto L_0x01a0
            goto L_0x018a
        L_0x01a0:
            java.lang.String r0 = "initiationMode"
            java.lang.String r0 = r2.optString(r0)     // Catch:{ JSONException -> 0x01a9 }
            r14.A0F = r0     // Catch:{ JSONException -> 0x01a9 }
            return
        L_0x01a9:
            r1 = move-exception
            java.lang.String r0 = "PAY: IndiaUpiTransactionPendingUpdateMetadata threw: "
            com.whatsapp.util.Log.w(r0, r1)
        L_0x01af:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass9W2.<init>(java.lang.String):void");
    }

    public AnonymousClass9W2(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, long j, long j2, boolean z, boolean z2) {
        C166557yt r0;
        C166557yt r02;
        C166557yt r03;
        this.A0M = true;
        this.A0N = z;
        this.A0O = z2;
        this.A02 = j;
        this.A01 = j2;
        this.A0G = str;
        C166557yt r3 = null;
        if (str2 != null) {
            r0 = C161527pr.A00(str2, "mandateNo");
        } else {
            r0 = null;
        }
        this.A08 = r0;
        Class<String> cls = String.class;
        if (str3 != null) {
            r02 = C1899693i.A0F(AnonymousClass3QD.A00(), cls, str3, "mandateName");
        } else {
            r02 = null;
        }
        this.A07 = r02;
        if (str4 != null) {
            r03 = C1899693i.A0F(AnonymousClass3QD.A00(), cls, str4, "upiPurposeCode");
        } else {
            r03 = null;
        }
        this.A0A = r03;
        this.A09 = str5 != null ? C1899693i.A0F(AnonymousClass3QD.A00(), cls, str5, "moneyStringValue") : r3;
        this.A0E = str6;
        this.A0K = str7;
        this.A0J = str8;
        this.A0L = str9;
        this.A0F = str10;
    }
}
