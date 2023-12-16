package X;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.99L  reason: invalid class name */
public final class AnonymousClass99L extends AnonymousClass1S4 {
    public static final Parcelable.Creator CREATOR = new C204589pb(16);
    public int A00;
    public int A01 = 0;
    public int A02 = 0;
    public int A03 = 1;
    public long A04;
    public long A05 = -1;
    public AnonymousClass39L A06;
    public C166557yt A07;
    public C166557yt A08;
    public C166557yt A09;
    public C166557yt A0A;
    public C166557yt A0B;
    public C166557yt A0C;
    public C166557yt A0D;
    public AnonymousClass9XY A0E;
    public AnonymousClass9V2 A0F;
    public AnonymousClass9W2 A0G;
    public C196499aw A0H;
    public Boolean A0I = null;
    public String A0J;
    public String A0K;
    public String A0L;
    public String A0M;
    public String A0N;
    public String A0O;
    public String A0P;
    public String A0Q;
    public String A0R;
    public String A0S;
    public String A0T;
    public String A0U;
    public String A0V;
    public List A0W;
    public boolean A0X;

    public void A04(C617332a r6, AnonymousClass36K r7, int i) {
        AnonymousClass36K A0l;
        AnonymousClass9XY r0;
        Log.d("PAY: IndiaUpiTransactionMetadata fromNetwork");
        String A0r = r7.A0r("seq-no", (String) null);
        if (!TextUtils.isEmpty(A0r)) {
            this.A0S = A0r;
        }
        String A0r2 = r7.A0r("ref-url", (String) null);
        if (!TextUtils.isEmpty(A0r2)) {
            this.A0V = A0r2;
        }
        String A0r3 = r7.A0r("sync-status", (String) null);
        if (!TextUtils.isEmpty(A0r3)) {
            this.A0T = A0r3;
        }
        String A0r4 = r7.A0r("upi-bank-info", (String) null);
        Class<String> cls = String.class;
        if (A0r4 != null) {
            this.A0C = C1899693i.A0F(AnonymousClass3QD.A00(), cls, A0r4, "bankInfo");
        }
        String A0r5 = r7.A0r("sender-name", (String) null);
        if (A0r5 != null) {
            this.A0B = C1899593h.A0C(A0r5, "legalName");
        }
        String A0r6 = r7.A0r("receiver-name", (String) null);
        if (A0r6 != null) {
            this.A0A = C1899593h.A0C(A0r6, "legalName");
        }
        AnonymousClass36K A0l2 = r7.A0l("mandate");
        if (A0l2 != null) {
            this.A0G = new AnonymousClass9W2(r6, A0l2);
        }
        String A0r7 = r7.A0r("is-complaint-eligible", (String) null);
        AnonymousClass36K A0l3 = r7.A0l("complaint");
        if (!(A0r7 == null && A0l3 == null)) {
            this.A0H = new C196499aw(A0l3, A0r7);
        }
        AnonymousClass36K A0l4 = r7.A0l("international-transaction-detail");
        if (A0l4 != null) {
            this.A0F = new AnonymousClass9V2(A0l4);
        }
        String A0r8 = r7.A0r("mandate-transaction-id", (String) null);
        if (!TextUtils.isEmpty(A0r8)) {
            this.A0L = A0r8;
        }
        String A0r9 = r7.A0r("mcc", (String) null);
        if (!TextUtils.isEmpty(A0r9)) {
            this.A0M = A0r9;
        }
        String A0r10 = r7.A0r("is_p2m_hybrid", (String) null);
        if (!TextUtils.isEmpty(A0r10)) {
            this.A0X = C1899693i.A0y(A0r10);
        }
        String A0r11 = r7.A0r("payment_instrument_type", (String) null);
        if (!TextUtils.isEmpty(A0r11)) {
            this.A08 = C1899693i.A0F(AnonymousClass3QD.A00(), cls, A0r11, "paymentInstrumentType");
        }
        String A0r12 = r7.A0r("psp_transaction_id", (String) null);
        if (!TextUtils.isEmpty(A0r12)) {
            this.A09 = C1899693i.A0F(AnonymousClass3QD.A00(), cls, A0r12, "pspTransactionId");
        }
        AnonymousClass36K A0l5 = r7.A0l("external_payment_method");
        if (A0l5 != null) {
            try {
                r0 = new AnonymousClass9XY(A0l5.A0q(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE), A0l5.A0q(PublicKeyCredentialControllerUtility.JSON_KEY_NAME));
            } catch (AnonymousClass24Y e) {
                Log.e((Throwable) e);
                r0 = null;
            }
            this.A0E = r0;
        }
        this.A0W = AnonymousClass001.A0s();
        Iterator A0M2 = AnonymousClass36K.A0M(r7, "offer");
        while (A0M2.hasNext()) {
            AnonymousClass36K r1 = (AnonymousClass36K) A0M2.next();
            C162457s7.A0J(r1, 0);
            try {
                this.A0W.add(new C195299Xa(r1.A0q(PublicKeyCredentialControllerUtility.JSON_KEY_ID)));
            } catch (AnonymousClass24Y e2) {
                Log.w("PAY: IndiaUpiTransactionOfferData/fromProtocolNode threw: ", e2);
            }
        }
        AnonymousClass36K A0l6 = r7.A0l("offer_amount");
        if (A0l6 != null && (A0l = A0l6.A0l("money")) != null) {
            this.A06 = C192809Lq.A00(r6, A0l);
        }
    }

    public void A05(String str) {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        AnonymousClass9XY r0;
        Class<String> cls = String.class;
        String str2 = str;
        try {
            super.A05(str2);
            JSONObject A1H = AnonymousClass0x9.A1H(str2);
            this.A03 = A1H.optInt("v", 1);
            this.A0S = A1H.optString("seqNum", this.A0S);
            this.A00 = A1H.optInt("counter", 0);
            this.A0J = A1H.optString("deviceId", this.A0J);
            this.A0Q = A1H.optString("senderVpa", this.A0Q);
            this.A0R = A1H.optString("senderVpaId", this.A0R);
            AnonymousClass3QD A002 = AnonymousClass3QD.A00();
            C166557yt r02 = this.A0B;
            if (r02 == null) {
                obj = null;
            } else {
                obj = r02.A00;
            }
            this.A0B = C1899693i.A0F(A002, cls, A1H.optString("senderName", (String) obj), "legalName");
            this.A0O = A1H.optString("receiverVpa", this.A0O);
            this.A0P = A1H.optString("receiverVpaId", this.A0P);
            AnonymousClass3QD A003 = AnonymousClass3QD.A00();
            C166557yt r03 = this.A0A;
            if (r03 == null) {
                obj2 = null;
            } else {
                obj2 = r03.A00;
            }
            this.A0A = C1899693i.A0F(A003, cls, A1H.optString("receiverName", (String) obj2), "legalName");
            AnonymousClass3QD A004 = AnonymousClass3QD.A00();
            C166557yt r04 = this.A0D;
            if (r04 == null) {
                obj3 = null;
            } else {
                obj3 = r04.A00;
            }
            this.A0D = C1899693i.A0F(A004, cls, A1H.optString("blob", (String) obj3), "pin");
            this.A0U = A1H.optString("token", this.A0U);
            this.A04 = A1H.optLong("expiryTs", this.A04);
            this.A01 = A1H.optInt("previousStatus", this.A01);
            this.A02 = A1H.optInt("previousType", this.A02);
            this.A0V = A1H.optString("url", this.A0V);
            AnonymousClass3QD A005 = AnonymousClass3QD.A00();
            C166557yt r05 = this.A0C;
            if (r05 == null) {
                obj4 = null;
            } else {
                obj4 = r05.A00;
            }
            this.A0C = C1899693i.A0F(A005, cls, A1H.optString("upiBankInfo", (String) obj4), "bankInfo");
            this.A0T = A1H.optString("syncStatus", this.A0T);
            this.A0M = A1H.optString("mcc", this.A0M);
            this.A0N = A1H.optString("purposeCode", this.A0N);
            ArrayList arrayList = null;
            if (A1H.has("indiaUpiMandateMetadata")) {
                this.A0G = new AnonymousClass9W2(A1H.optString("indiaUpiMandateMetadata", (String) null));
            }
            if (A1H.has("isFirstSend")) {
                this.A0I = Boolean.valueOf(A1H.optBoolean("isFirstSend", false));
            }
            if (A1H.has("indiaUpiTransactionComplaintData")) {
                this.A0H = new C196499aw(A1H.optString("indiaUpiTransactionComplaintData", (String) null));
            }
            if (A1H.has("indiaUpiInternationalTransactionDetailData")) {
                this.A0F = new AnonymousClass9V2(A1H.optString("indiaUpiInternationalTransactionDetailData", (String) null));
            }
            this.A0L = A1H.optString("mandateTransactionId", this.A0L);
            AnonymousClass3QD A006 = AnonymousClass3QD.A00();
            C166557yt r06 = this.A07;
            if (r06 == null) {
                obj5 = null;
            } else {
                obj5 = r06.A00;
            }
            this.A07 = C1899693i.A0F(A006, cls, A1H.optString("note", (String) obj5), "interopNote");
            this.A0X = A1H.optBoolean("isP2mHybrid", false);
            String optString = A1H.optString("paymentInstrumentType");
            if (!C107575bX.A0F(optString)) {
                this.A08 = C1899593h.A0C(optString, "paymentInstrumentType");
            }
            String optString2 = A1H.optString("pspTransactionId");
            if (!C107575bX.A0F(optString2)) {
                this.A09 = C1899593h.A0C(optString2, "pspTransactionId");
            }
            if (A1H.has("externalPaymentMethod")) {
                JSONObject jSONObject = A1H.getJSONObject("externalPaymentMethod");
                if (jSONObject != null) {
                    String string = jSONObject.getString(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE);
                    C162457s7.A0D(string);
                    String string2 = jSONObject.getString(PublicKeyCredentialControllerUtility.JSON_KEY_NAME);
                    C162457s7.A0D(string2);
                    r0 = new AnonymousClass9XY(string, string2);
                } else {
                    r0 = null;
                }
                this.A0E = r0;
            }
            if (A1H.has("offers")) {
                JSONArray jSONArray = A1H.getJSONArray("offers");
                if (jSONArray != null) {
                    arrayList = AnonymousClass001.A0s();
                    int length = jSONArray.length();
                    for (int i = 0; i < length; i++) {
                        JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                        if (jSONObject2 != null) {
                            String string3 = jSONObject2.getString(PublicKeyCredentialControllerUtility.JSON_KEY_ID);
                            C162457s7.A0D(string3);
                            arrayList.add(new C195299Xa(string3));
                        }
                    }
                }
                this.A0W = arrayList;
            }
            if (A1H.has("offerAmount")) {
                C60042xu r1 = new C60042xu();
                r1.A02 = AnonymousClass1S3.A05;
                r1.A01();
                this.A06 = new C60042xu(A1H.getJSONObject("offerAmount")).A01();
            }
        } catch (JSONException e) {
            Log.w("PAY: IndiaUpiTransactionMetadata fromDBString threw: ", e);
        }
    }

    public void A06(List list, int i) {
        if (!C161527pr.A02(this.A0D)) {
            C1899593h.A1R("mpin", (String) C1899593h.A0X(this.A0D), list);
        }
        if (!TextUtils.isEmpty(this.A0S)) {
            C1899593h.A1R("seq-no", this.A0S, list);
        }
        if (!TextUtils.isEmpty(this.A0Q)) {
            C1899593h.A1R("sender-vpa", this.A0Q, list);
        }
        if (!TextUtils.isEmpty(this.A0R)) {
            C1899593h.A1R("sender-vpa-id", this.A0R, list);
        }
        if (!TextUtils.isEmpty(this.A0O)) {
            C1899593h.A1R("receiver-vpa", this.A0O, list);
        }
        if (!TextUtils.isEmpty(this.A0P)) {
            C1899593h.A1R("receiver-vpa-id", this.A0P, list);
        }
        if (!C161527pr.A02(this.A0A)) {
            C1899593h.A1R("receiver-name", (String) this.A0A.A00, list);
        }
        if (!C161527pr.A02(this.A0B)) {
            C1899593h.A1R("sender-name", (String) this.A0B.A00, list);
        }
        if (!TextUtils.isEmpty(this.A0J)) {
            C1899593h.A1R("device-id", this.A0J, list);
        }
        if (!C161527pr.A02(this.A0C)) {
            C1899593h.A1R("upi-bank-info", (String) C1899593h.A0X(this.A0C), list);
        }
        if (!TextUtils.isEmpty(this.A0M)) {
            C1899593h.A1R("mcc", this.A0M, list);
        }
        Boolean bool = this.A0I;
        if (bool != null) {
            C1899593h.A1R("is_first_send", C1899693i.A0Z(bool.booleanValue() ? 1 : 0), list);
        }
        AnonymousClass39U r0 = this.A02;
        if (r0 != null) {
            C1899593h.A1R("ref-id", r0.A01, list);
        }
        if (!TextUtils.isEmpty(this.A0N)) {
            C1899593h.A1R("purpose-code", this.A0N, list);
        }
        if (!TextUtils.isEmpty(this.A0L)) {
            C1899593h.A1R("mandate-transaction-id", this.A0L, list);
        }
    }

    public C21421Bt A0I() {
        C130546c9 A0G2 = AnonymousClass1DZ.DEFAULT_INSTANCE.A0G();
        String str = this.A0Q;
        AnonymousClass1DZ r1 = (AnonymousClass1DZ) C18320x8.A0C(A0G2);
        str.getClass();
        r1.bitField0_ |= 4;
        r1.senderHandle_ = str;
        String str2 = this.A0O;
        AnonymousClass1DZ r12 = (AnonymousClass1DZ) C18320x8.A0C(A0G2);
        str2.getClass();
        r12.bitField0_ |= 2;
        r12.receiverHandle_ = str2;
        long j = this.A05;
        AnonymousClass1DZ r13 = (AnonymousClass1DZ) C18320x8.A0C(A0G2);
        r13.bitField0_ |= 1;
        r13.startTimestamp_ = j;
        C130546c9 A0G3 = C21421Bt.DEFAULT_INSTANCE.A0G();
        C130786cX A062 = A0G2.A06();
        C21421Bt r14 = (C21421Bt) C18320x8.A0C(A0G3);
        A062.getClass();
        r14.metadataValue_ = A062;
        r14.metadataValueCase_ = 1;
        return (C21421Bt) A0G3.A06();
    }

    public boolean A0b() {
        C166557yt r0;
        if (!this.A0X || (r0 = this.A08) == null) {
            return false;
        }
        if (!"upi".equalsIgnoreCase((String) r0.A00) || TextUtils.isEmpty(this.A0Q)) {
            return true;
        }
        return false;
    }

    public boolean A0d() {
        return "MISSING_FIELD_NOT_PARTIAL".equals(this.A0T);
    }

    public boolean A0e(AnonymousClass1S4 r3) {
        AnonymousClass99L r32 = (AnonymousClass99L) r3;
        if (r32 == null) {
            return false;
        }
        return !AnonymousClass75J.A00(this.A0G, r32.A0G);
    }

    public boolean A0f(C624034w r3) {
        if (!this.A0X && (TextUtils.isEmpty(this.A0Q) || TextUtils.isEmpty(this.A0O))) {
            return true;
        }
        if ("FULL".equals(this.A0T) || !r3.A0G() || !TextUtils.isEmpty(r3.A0F)) {
            return false;
        }
        return true;
    }

    public String toString() {
        String obj;
        String obj2;
        String obj3;
        String str;
        String str2;
        Object valueOf;
        String str3;
        String str4;
        AnonymousClass9W2 r0 = this.A0G;
        String str5 = "null";
        if (r0 == null) {
            obj = str5;
        } else {
            obj = r0.toString();
        }
        C196499aw r02 = this.A0H;
        if (r02 == null) {
            obj2 = str5;
        } else {
            obj2 = r02.toString();
        }
        AnonymousClass9V2 r03 = this.A0F;
        if (r03 == null) {
            obj3 = str5;
        } else {
            obj3 = r03.toString();
        }
        AnonymousClass39U r2 = this.A02;
        String str6 = "order = [";
        if (r2 != null) {
            StringBuilder A0l = AnonymousClass000.A0l(str6);
            A0l.append("id: ");
            StringBuilder A0l2 = AnonymousClass000.A0l(AnonymousClass000.A0X(C195009Vm.A00(r2.A01), A0l));
            A0l2.append("expiryTsInSec:");
            AnonymousClass39U r22 = this.A02;
            A0l2.append(r22.A00);
            StringBuilder A0l3 = AnonymousClass000.A0l(A0l2.toString());
            A0l3.append("messageId:");
            str6 = AnonymousClass000.A0X(C195009Vm.A00(r22.A02), A0l3);
        }
        String A0X2 = AnonymousClass000.A0X("]", AnonymousClass000.A0l(str6));
        AnonymousClass9XY r04 = this.A0E;
        if (r04 != null) {
            str5 = r04.toString();
        }
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("[ seq-no: ");
        C195009Vm.A03(A0o, this.A0S);
        A0o.append(" timestamp: ");
        A0o.append(this.A05);
        A0o.append(" deviceId: ");
        A0o.append(this.A0J);
        A0o.append(" sender: ");
        A0o.append(C195009Vm.A02(this.A0Q));
        A0o.append(" senderVpaId: ");
        A0o.append(this.A0R);
        A0o.append(" senderName: ");
        C166557yt r05 = this.A0B;
        String str7 = null;
        if (r05 != null) {
            str = r05.toString();
        } else {
            str = null;
        }
        C195009Vm.A03(A0o, str);
        A0o.append(" receiver: ");
        A0o.append(C195009Vm.A02(this.A0O));
        A0o.append(" receiverVpaId: ");
        A0o.append(C195009Vm.A02(this.A0P));
        A0o.append(" receiverName : ");
        C166557yt r06 = this.A0A;
        if (r06 != null) {
            str2 = r06.toString();
        } else {
            str2 = null;
        }
        C195009Vm.A03(A0o, str2);
        A0o.append(" encryptedKeyLength: ");
        C166557yt r5 = this.A0D;
        if (C161527pr.A03(r5)) {
            valueOf = "0";
        } else {
            valueOf = Integer.valueOf(((String) r5.A00).length());
        }
        A0o.append(valueOf);
        A0o.append(" previousType: ");
        A0o.append(this.A02);
        A0o.append(" previousStatus: ");
        A0o.append(this.A01);
        A0o.append(" token: ");
        C195009Vm.A03(A0o, this.A0U);
        A0o.append(" url: ");
        C195009Vm.A03(A0o, this.A0V);
        A0o.append(" upiBankInfo: ");
        A0o.append(this.A0C);
        A0o.append(" order : ");
        A0o.append(A0X2);
        A0o.append(" mcc: ");
        C195009Vm.A03(A0o, this.A0M);
        A0o.append(" purposeCode: ");
        C195009Vm.A03(A0o, this.A0N);
        A0o.append(" isFirstSend: ");
        A0o.append(this.A0I);
        A0o.append(" indiaUpiMandateMetadata: {");
        A0o.append(obj);
        A0o.append("} ] indiaUpiTransactionComplaintData: {");
        A0o.append(obj2);
        A0o.append("}  indiaUpiInternationalTransactionDetailData: {");
        A0o.append(obj3);
        A0o.append("}  mandateTransactionId: ");
        C195009Vm.A03(A0o, this.A0L);
        A0o.append(" note : ");
        C166557yt r07 = this.A07;
        if (r07 != null) {
            str3 = r07.toString();
        } else {
            str3 = null;
        }
        C195009Vm.A03(A0o, str3);
        A0o.append(" isPendingRequestViewed: ");
        A0o.append(this.A03);
        A0o.append(" isP2mHybrid: ");
        A0o.append(this.A0X);
        A0o.append(" paymentInstrumentType: ");
        C166557yt r08 = this.A08;
        if (r08 != null) {
            str4 = r08.toString();
        } else {
            str4 = null;
        }
        C195009Vm.A03(A0o, str4);
        A0o.append(" pspTransactionId: ");
        C166557yt r09 = this.A09;
        if (r09 != null) {
            str7 = r09.toString();
        }
        C195009Vm.A03(A0o, str7);
        A0o.append(" externalPaymentMethodData: ");
        return AnonymousClass000.A0V(str5, "]", A0o);
    }

    public String A0N() {
        Object obj;
        Object obj2;
        Object obj3;
        try {
            JSONObject A0P2 = A0P();
            A0P2.put("v", this.A03);
            String str = this.A0S;
            if (str != null) {
                A0P2.put("seqNum", str);
            }
            String str2 = this.A0J;
            if (str2 != null) {
                A0P2.put("deviceId", str2);
            }
            long j = this.A04;
            if (j > 0) {
                A0P2.put("expiryTs", j);
            }
            int i = this.A01;
            if (i > 0) {
                A0P2.put("previousStatus", i);
            }
            String str3 = this.A0O;
            if (str3 != null) {
                A0P2.put("receiverVpa", str3);
            }
            String str4 = this.A0P;
            if (str4 != null) {
                A0P2.put("receiverVpaId", str4);
            }
            C166557yt r1 = this.A0A;
            if (!C161527pr.A03(r1)) {
                C1899693i.A0r(r1, "receiverName", A0P2);
            }
            String str5 = this.A0Q;
            if (str5 != null) {
                A0P2.put("senderVpa", str5);
            }
            String str6 = this.A0R;
            if (str6 != null) {
                A0P2.put("senderVpaId", str6);
            }
            C166557yt r12 = this.A0B;
            if (!C161527pr.A03(r12)) {
                C1899693i.A0r(r12, "senderName", A0P2);
            }
            int i2 = this.A00;
            if (i2 > 0) {
                A0P2.put("counter", i2);
            }
            int i3 = this.A02;
            if (i3 > 0) {
                A0P2.put("previousType", i3);
            }
            String str7 = this.A0V;
            if (str7 != null) {
                A0P2.put("url", str7);
            }
            String str8 = this.A0T;
            if (str8 != null) {
                A0P2.put("syncStatus", str8);
            }
            C166557yt r2 = this.A0C;
            if (!C161527pr.A03(r2)) {
                if (r2 == null) {
                    obj3 = null;
                } else {
                    obj3 = r2.A00;
                }
                A0P2.put("upiBankInfo", obj3);
            }
            String str9 = this.A0M;
            if (str9 != null) {
                A0P2.put("mcc", str9);
            }
            String str10 = this.A0N;
            if (str10 != null) {
                A0P2.put("purposeCode", str10);
            }
            AnonymousClass9W2 r0 = this.A0G;
            if (r0 != null) {
                A0P2.put("indiaUpiMandateMetadata", r0.A01());
            }
            Boolean bool = this.A0I;
            if (bool != null) {
                A0P2.put("isFirstSend", bool);
            }
            C196499aw r02 = this.A0H;
            if (r02 != null) {
                A0P2.put("indiaUpiTransactionComplaintData", r02.A00());
            }
            AnonymousClass9V2 r03 = this.A0F;
            if (r03 != null) {
                A0P2.put("indiaUpiInternationalTransactionDetailData", r03.A00());
            }
            String str11 = this.A0L;
            if (str11 != null) {
                A0P2.put("mandateTransactionId", str11);
            }
            if (!C161527pr.A02(this.A07)) {
                C1899693i.A0r(this.A07, "note", A0P2);
            }
            Boolean bool2 = this.A03;
            if (bool2 != null) {
                A0P2.put("isPendingRequestViewed", bool2);
            }
            A0P2.put("isP2mHybrid", this.A0X);
            if (!C161527pr.A02(this.A08)) {
                C166557yt r04 = this.A08;
                if (r04 == null) {
                    obj2 = null;
                } else {
                    obj2 = r04.A00;
                }
                A0P2.put("paymentInstrumentType", obj2);
            }
            if (!C161527pr.A02(this.A09)) {
                C166557yt r05 = this.A09;
                if (r05 == null) {
                    obj = null;
                } else {
                    obj = r05.A00;
                }
                A0P2.put("pspTransactionId", obj);
            }
            AnonymousClass9XY r4 = this.A0E;
            if (r4 != null) {
                JSONObject A1G = AnonymousClass0x9.A1G();
                A1G.put(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, r4.A01);
                A1G.put(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, r4.A00);
                A0P2.put("externalPaymentMethod", A1G);
            }
            List list = this.A0W;
            if (list != null) {
                A0P2.put("offers", C195299Xa.A01.A00(list));
            }
            AnonymousClass39L r06 = this.A06;
            if (r06 != null) {
                A0P2.put("offerAmount", r06.A01());
            }
            return A0P2.toString();
        } catch (JSONException e) {
            Log.w("PAY: IndiaUpiTransactionMetadata toDBString threw: ", e);
            return null;
        }
    }

    public String A0O() {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        try {
            JSONObject A1G = AnonymousClass0x9.A1G();
            A1G.put("v", this.A03);
            C166557yt r2 = this.A0D;
            if (!C161527pr.A03(r2)) {
                if (r2 == null) {
                    obj4 = null;
                } else {
                    obj4 = r2.A00;
                }
                A1G.put("blob", obj4);
            }
            if (!TextUtils.isEmpty(this.A0U)) {
                A1G.put("token", this.A0U);
            }
            String str = this.A0Q;
            if (str != null) {
                A1G.put("senderVpa", str);
            }
            String str2 = this.A0R;
            if (str2 != null) {
                A1G.put("senderVpaId", str2);
            }
            C166557yt r1 = this.A0B;
            if (!C161527pr.A03(r1)) {
                C1899693i.A0r(r1, "senderName", A1G);
            }
            String str3 = this.A0O;
            if (str3 != null) {
                A1G.put("receiverVpa", str3);
            }
            String str4 = this.A0P;
            if (str4 != null) {
                A1G.put("receiverVpaId", str4);
            }
            C166557yt r12 = this.A0A;
            if (!C161527pr.A03(r12)) {
                C1899693i.A0r(r12, "receiverName", A1G);
            }
            String str5 = this.A0J;
            if (str5 != null) {
                A1G.put("deviceId", str5);
            }
            C166557yt r22 = this.A0C;
            if (!C161527pr.A03(r22)) {
                if (r22 == null) {
                    obj3 = null;
                } else {
                    obj3 = r22.A00;
                }
                A1G.put("upiBankInfo", obj3);
            }
            if (!C161527pr.A02(this.A07)) {
                C1899693i.A0r(this.A07, "note", A1G);
            }
            A1G.put("isP2mHybrid", this.A0X);
            if (!C161527pr.A02(this.A08)) {
                C166557yt r0 = this.A08;
                if (r0 == null) {
                    obj2 = null;
                } else {
                    obj2 = r0.A00;
                }
                A1G.put("paymentInstrumentType", obj2);
            }
            if (!C161527pr.A02(this.A09)) {
                C166557yt r02 = this.A09;
                if (r02 == null) {
                    obj = null;
                } else {
                    obj = r02.A00;
                }
                A1G.put("pspTransactionId", obj);
            }
            AnonymousClass9XY r4 = this.A0E;
            if (r4 != null) {
                JSONObject A1G2 = AnonymousClass0x9.A1G();
                A1G2.put(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, r4.A01);
                A1G2.put(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, r4.A00);
                A1G.put("externalPaymentMethod", A1G2);
            }
            List list = this.A0W;
            if (list != null) {
                A1G.put("offers", C195299Xa.A01.A00(list));
            }
            AnonymousClass39L r03 = this.A06;
            if (r03 != null) {
                A1G.put("offerAmount", r03.A01());
            }
            return A1G.toString();
        } catch (JSONException e) {
            Log.w("PAY: IndiaUpiTransactionMetadata toDBString threw: ", e);
            return null;
        }
    }

    public void A0W(AnonymousClass1S4 r8) {
        super.A0W(r8);
        AnonymousClass99L r82 = (AnonymousClass99L) r8;
        String str = r82.A0S;
        if (str != null) {
            this.A0S = str;
        }
        String str2 = r82.A0J;
        if (str2 != null) {
            this.A0J = str2;
        }
        String str3 = r82.A0O;
        if (str3 != null) {
            this.A0O = str3;
        }
        String str4 = r82.A0P;
        if (str4 != null) {
            this.A0P = str4;
        }
        C166557yt r0 = r82.A0A;
        if (r0 != null) {
            this.A0A = r0;
        }
        String str5 = r82.A0Q;
        if (str5 != null) {
            this.A0Q = str5;
        }
        String str6 = r82.A0R;
        if (str6 != null) {
            this.A0R = str6;
        }
        C166557yt r1 = r82.A0B;
        if (!C161527pr.A03(r1)) {
            this.A0B = r1;
        }
        long j = r82.A04;
        if (j > 0) {
            this.A04 = j;
        }
        int i = r82.A01;
        if (i > 0) {
            this.A01 = i;
        }
        int i2 = r82.A00;
        if (i2 > 0) {
            this.A00 = i2;
        }
        int i3 = r82.A02;
        if (i3 > 0) {
            this.A02 = i3;
        }
        String str7 = r82.A0V;
        if (str7 != null) {
            this.A0V = str7;
        }
        C166557yt r12 = r82.A0C;
        if (!C161527pr.A03(r12)) {
            this.A0C = r12;
        }
        String str8 = r82.A0T;
        if (str8 != null) {
            this.A0T = str8;
        }
        String str9 = r82.A0M;
        if (str9 != null) {
            this.A0M = str9;
        }
        String str10 = r82.A0N;
        if (str10 != null) {
            this.A0N = str10;
        }
        AnonymousClass9W2 r2 = r82.A0G;
        if (r2 != null) {
            AnonymousClass9W2 r13 = this.A0G;
            C166557yt r02 = r2.A08;
            if (r02 != null) {
                r13.A08 = r02;
            }
            C166557yt r03 = r2.A07;
            if (r03 != null) {
                r13.A07 = r03;
            }
            C166557yt r04 = r2.A0A;
            if (r04 != null) {
                r13.A0A = r04;
            }
            r13.A0H = r2.A0H;
            String str11 = r2.A0G;
            if (str11 != null) {
                r13.A0G = str11;
            }
            r13.A0M = r2.A0M;
            r13.A0N = r2.A0N;
            r13.A0O = r2.A0O;
            long j2 = r2.A02;
            if (j2 > 0) {
                r13.A02 = j2;
            }
            long j3 = r2.A01;
            if (j3 > 0) {
                r13.A01 = j3;
            }
            String str12 = r2.A0D;
            if (str12 != null) {
                r13.A0D = str12;
            }
            String str13 = r2.A0I;
            if (str13 != null) {
                r13.A0I = str13;
            }
            long j4 = r2.A04;
            if (j4 > 0) {
                r13.A04 = j4;
            }
            long j5 = r2.A03;
            if (j5 > 0) {
                r13.A03 = j5;
            }
            int i4 = r2.A00;
            if (i4 > 0) {
                r13.A00 = i4;
            }
            C166557yt r05 = r2.A09;
            if (r05 != null) {
                r13.A09 = r05;
            }
            AnonymousClass39L r06 = r2.A05;
            if (r06 != null) {
                r13.A05 = r06;
            }
            C166557yt r07 = r2.A06;
            if (r07 != null) {
                r13.A06 = r07;
            }
            String str14 = r2.A0E;
            if (str14 != null) {
                r13.A0E = str14;
            }
            String str15 = r2.A0K;
            if (str15 != null) {
                r13.A0K = str15;
            }
            String str16 = r2.A0J;
            if (str16 != null) {
                r13.A0J = str16;
            }
            String str17 = r2.A0L;
            if (str17 != null) {
                r13.A0L = str17;
            }
            String str18 = r2.A0F;
            if (str18 != null) {
                r13.A0F = str18;
            }
            r13.A0C = r2.A0C;
            r13.A0P = r2.A0P;
            r13.A0B = r2.A0B;
        }
        Boolean bool = r82.A0I;
        if (bool != null) {
            this.A0I = bool;
        }
        C196499aw r6 = r82.A0H;
        if (r6 != null) {
            C196499aw r5 = this.A0H;
            if (r5 == null) {
                this.A0H = new C196499aw(r6.A00());
            } else {
                r5.A03 = r6.A03;
                long j6 = r6.A00;
                if (j6 > 0) {
                    r5.A00 = j6;
                }
                long j7 = r6.A01;
                if (j7 > 0) {
                    r5.A01 = j7;
                }
                String str19 = r6.A02;
                if (str19 != null) {
                    r5.A02 = str19;
                }
            }
        }
        AnonymousClass9V2 r22 = r82.A0F;
        if (r22 != null) {
            AnonymousClass9V2 r14 = this.A0F;
            if (r14 == null) {
                this.A0F = new AnonymousClass9V2(r22.A00());
            } else {
                String str20 = r22.A01;
                if (str20 != null) {
                    r14.A01 = str20;
                }
                r14.A00 = r22.A00;
            }
        }
        String str21 = r82.A0L;
        if (str21 != null) {
            this.A0L = str21;
        }
        C166557yt r15 = r82.A07;
        if (!C161527pr.A03(r15)) {
            this.A07 = r15;
        }
        this.A0X = r82.A0X;
        C166557yt r16 = r82.A08;
        if (!C161527pr.A03(r16)) {
            this.A08 = r16;
        }
        C166557yt r17 = r82.A09;
        if (!C161527pr.A03(r17)) {
            this.A09 = r17;
        }
        AnonymousClass9XY r08 = r82.A0E;
        if (r08 != null) {
            this.A0E = r08;
        }
        List list = r82.A0W;
        if (list != null) {
            this.A0W = list;
        }
        AnonymousClass39L r09 = r82.A06;
        if (r09 != null) {
            this.A06 = r09;
        }
    }

    public void A0X(String str) {
        this.A07 = C1899693i.A0F(AnonymousClass3QD.A00(), String.class, str, "interopNote");
    }

    public void A0h(String str) {
        this.A0A = C1899693i.A0F(AnonymousClass3QD.A00(), String.class, str, "legalName");
    }

    public void writeToParcel(Parcel parcel, int i) {
        String A012;
        int A1S;
        String A002;
        String A003;
        super.writeToParcel(parcel, i);
        parcel.writeParcelable(this.A0D, i);
        parcel.writeString(this.A0U);
        parcel.writeString(this.A0S);
        parcel.writeString(this.A0Q);
        parcel.writeString(this.A0R);
        parcel.writeString((String) C1899593h.A0X(this.A0B));
        parcel.writeString(this.A0O);
        parcel.writeString(this.A0P);
        parcel.writeString((String) C1899593h.A0X(this.A0A));
        parcel.writeLong(this.A05);
        parcel.writeString(this.A0J);
        parcel.writeLong(this.A04);
        parcel.writeInt(this.A01);
        parcel.writeInt(this.A00);
        parcel.writeInt(this.A02);
        parcel.writeString(this.A0V);
        parcel.writeParcelable(this.A0C, i);
        parcel.writeString(this.A0K);
        parcel.writeString(this.A0T);
        parcel.writeString(this.A0M);
        parcel.writeString(this.A0N);
        AnonymousClass9W2 r0 = this.A0G;
        String str = null;
        if (r0 == null) {
            A012 = null;
        } else {
            A012 = r0.A01();
        }
        parcel.writeString(A012);
        Boolean bool = this.A0I;
        if (bool == null) {
            A1S = -1;
        } else {
            A1S = AnonymousClass000.A1S(bool.booleanValue() ? 1 : 0);
        }
        parcel.writeInt(A1S);
        C196499aw r02 = this.A0H;
        if (r02 == null) {
            A002 = null;
        } else {
            A002 = r02.A00();
        }
        parcel.writeString(A002);
        AnonymousClass9V2 r03 = this.A0F;
        if (r03 == null) {
            A003 = null;
        } else {
            A003 = r03.A00();
        }
        parcel.writeString(A003);
        parcel.writeString(this.A0L);
        parcel.writeParcelable(this.A07, i);
        parcel.writeInt(this.A0X ? 1 : 0);
        parcel.writeParcelable(this.A08, i);
        parcel.writeParcelable(this.A09, i);
        parcel.writeParcelable(this.A0E, i);
        List list = this.A0W;
        if (list != null) {
            str = C195299Xa.A01.A00(list).toString();
        }
        parcel.writeString(str);
        parcel.writeParcelable(this.A06, i);
    }

    public String A03() {
        return null;
    }

    public int A07() {
        return this.A00;
    }

    public int A08() {
        return this.A01;
    }

    public int A09() {
        return this.A02;
    }

    public long A0A() {
        return this.A05;
    }

    public long A0B() {
        return this.A04;
    }

    public C85194Fh A0C() {
        return this.A0H;
    }

    public AnonymousClass39L A0E() {
        return this.A06;
    }

    public C166557yt A0F() {
        return this.A07;
    }

    public C166557yt A0G() {
        return this.A0A;
    }

    public C166557yt A0H() {
        return this.A0B;
    }

    public String A0K() {
        return this.A0S;
    }

    public String A0L() {
        return this.A0O;
    }

    public String A0M() {
        return this.A0Q;
    }

    public boolean A0c() {
        return this.A0X;
    }

    public void A0Q(int i) {
        this.A00 = i;
    }

    public void A0R(int i) {
        this.A01 = i;
    }

    public void A0S(int i) {
        this.A02 = i;
    }

    public void A0T(long j) {
        this.A05 = j;
    }

    public void A0U(long j) {
        this.A04 = j;
    }

    public void A0Y(String str) {
        this.A0S = str;
    }

    public void A0Z(String str) {
        this.A0O = str;
    }

    public void A0a(String str) {
        this.A0Q = str;
    }

    public void A0g(Boolean bool) {
        this.A0I = bool;
    }
}
