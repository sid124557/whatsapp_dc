package X;

import android.text.TextUtils;
import com.whatsapp.util.Log;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.9Vz  reason: invalid class name and case insensitive filesystem */
public class C195109Vz {
    public long A00;
    public AnonymousClass39L A01;
    public C166557yt A02;
    @Deprecated
    public C166557yt A03;
    public C166557yt A04;
    public String A05;
    public String A06;
    public String A07;
    public String A08;
    public String A09;

    public AnonymousClass39Q A00() {
        C166557yt r1 = this.A03;
        if (C161527pr.A03(r1)) {
            return null;
        }
        return C1899693i.A0B(AnonymousClass1S3.A05, (String) r1.A00);
    }

    public boolean A01() {
        String str;
        String str2;
        String str3 = this.A08;
        if (!str3.equals("UNKNOWN")) {
            if (str3.equals("ACCEPT")) {
                str = this.A09;
                str2 = "PENDING";
            }
            return false;
        }
        str = this.A09;
        str2 = "INIT";
        if (str.equals(str2)) {
            return true;
        }
        return false;
    }

    public C195109Vz(C617332a r8, AnonymousClass36K r9) {
        AnonymousClass36K A0l = r9.A0l("amount");
        Class<String> cls = String.class;
        if (A0l == null) {
            String A0L = AnonymousClass36K.A0L(r9, "amount");
            if (A0L != null) {
                this.A03 = C1899593h.A0C(A0L, "moneyStringValue");
            }
        } else {
            AnonymousClass36K A0l2 = A0l.A0l("money");
            if (A0l2 != null) {
                try {
                    C85204Fi A012 = r8.A01(AnonymousClass36K.A0L(A0l2, "currency"));
                    C60042xu r2 = new C60042xu();
                    r2.A01 = A0l2.A0d("value");
                    r2.A00 = A0l2.A0a("offset");
                    r2.A02 = A012;
                    AnonymousClass39L A013 = r2.A01();
                    this.A01 = A013;
                    this.A03 = C1899693i.A0F(AnonymousClass3QD.A00(), cls, A013.A02.toString(), "moneyStringValue");
                } catch (Exception unused) {
                    Log.e("PAY: IndiaUpiMandateMetadata - and error occured while parsing the money node");
                }
            }
        }
        String A0r = r9.A0r("amount-rule", (String) null);
        if (!TextUtils.isEmpty(A0r)) {
            this.A07 = A0r;
        }
        String A0r2 = r9.A0r("is-revocable", (String) null);
        if (A0r2 != null) {
            this.A06 = A0r2;
        }
        String A0r3 = r9.A0r("end-ts", (String) null);
        if (A0r3 != null) {
            this.A00 = C615531h.A03(A0r3) * 1000;
        }
        String A0r4 = r9.A0r("seq-no", (String) null);
        if (A0r4 != null) {
            this.A04 = C1899693i.A0F(AnonymousClass3QD.A00(), cls, A0r4, "upiSequenceNumber");
        }
        String A0r5 = r9.A0r("error-code", (String) null);
        if (A0r5 != null) {
            this.A05 = A0r5;
        }
        String A0r6 = r9.A0r("mandate-update-info", (String) null);
        if (A0r6 != null) {
            this.A02 = C1899693i.A0F(AnonymousClass3QD.A00(), cls, A0r6, "upiMandateUpdateInfo");
        }
        String A0r7 = r9.A0r("status", (String) null);
        this.A09 = A0r7 == null ? "INIT" : A0r7;
        String A0r8 = r9.A0r("action", (String) null);
        this.A08 = A0r8 == null ? "UNKNOWN" : A0r8;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("[ pendingAmount: ");
        C166557yt r2 = this.A03;
        if (AnonymousClass000.A0R(r2, A0o) == null) {
            return "";
        }
        StringBuilder A0o2 = AnonymousClass001.A0o();
        C195009Vm.A03(A0o2, r2.toString());
        A0o2.append(" errorCode: ");
        A0o2.append(this.A05);
        A0o2.append(" seqNum: ");
        A0o2.append(this.A04);
        A0o2.append(" mandateUpdateInfo: ");
        A0o2.append(this.A02);
        A0o2.append(" mandateUpdateAction: ");
        A0o2.append(this.A08);
        A0o2.append(" mandateUpdateStatus: ");
        A0o2.append(this.A09);
        return AnonymousClass000.A0X("]", A0o2);
    }

    public C195109Vz(String str) {
        Object obj;
        Object obj2;
        Object obj3;
        Class<String> cls = String.class;
        if (!TextUtils.isEmpty(str)) {
            try {
                JSONObject A1H = AnonymousClass0x9.A1H(str);
                AnonymousClass3QD A002 = AnonymousClass3QD.A00();
                C166557yt r0 = this.A03;
                if (r0 == null) {
                    obj = null;
                } else {
                    obj = r0.A00;
                }
                this.A03 = C1899693i.A0F(A002, cls, A1H.optString("pendingAmount", (String) obj), "moneyStringValue");
                if (A1H.optJSONObject("pendingMoney") != null) {
                    this.A01 = new C60042xu(A1H.optJSONObject("pendingMoney")).A01();
                }
                this.A06 = A1H.optString("isRevocable", this.A06);
                this.A00 = A1H.optLong("mandateEndTs", this.A00);
                this.A07 = A1H.optString("mandateAmountRule", this.A07);
                AnonymousClass3QD A003 = AnonymousClass3QD.A00();
                C166557yt r02 = this.A04;
                if (r02 == null) {
                    obj2 = null;
                } else {
                    obj2 = r02.A00;
                }
                this.A04 = C1899693i.A0F(A003, cls, A1H.optString("seqNum", (String) obj2), "upiMandateUpdateInfo");
                this.A05 = A1H.optString("errorCode", this.A05);
                this.A09 = A1H.optString("mandateUpdateStatus", this.A09);
                this.A08 = A1H.optString("mandateUpdateAction", this.A08);
                AnonymousClass3QD A004 = AnonymousClass3QD.A00();
                C166557yt r03 = this.A02;
                if (r03 == null) {
                    obj3 = null;
                } else {
                    obj3 = r03.A00;
                }
                this.A02 = C1899693i.A0F(A004, cls, A1H.optString("mandateUpdateInfo", (String) obj3), "upiMandateUpdateInfo");
            } catch (JSONException e) {
                Log.w("PAY: IndiaUpiTransactionPendingUpdateMetadata threw: ", e);
            }
        }
    }

    public C195109Vz(AnonymousClass39L r2, C166557yt r3, long j) {
        this.A03 = r3;
        this.A01 = r2;
        this.A00 = j;
        this.A08 = "UNKNOWN";
        this.A09 = "INIT";
    }
}
