package X;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.whatsapp.util.Log;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.99M  reason: invalid class name */
public class AnonymousClass99M extends AnonymousClass1S4 {
    public static final Parcelable.Creator CREATOR = new C204589pb(22);
    public long A00;
    public C195319Xg A01;
    public Boolean A02;
    public String A03;
    public String A04;
    public String A05;
    public String A06;
    public String A07;

    public static final AnonymousClass39L A00(C617332a r7, AnonymousClass36K r8) {
        if (r8 != null) {
            C60042xu r5 = new C60042xu();
            r5.A02 = AnonymousClass1S3.A06;
            AnonymousClass39L A012 = r5.A01();
            AnonymousClass36K A0l = r8.A0l("money");
            if (A0l == null) {
                C18260x0.A1K(AnonymousClass000.A0l("PAY: BrazilTransactionCountryData :: extractAmountFromNode"), " :: money node is null");
            } else {
                try {
                    String A0q = A0l.A0q("value");
                    String A0q2 = A0l.A0q("offset");
                    C85204Fi A013 = r7.A01(A0l.A0q("currency"));
                    C162457s7.A0D(A013);
                    r5.A01 = Long.parseLong(A0q);
                    r5.A00 = Integer.parseInt(A0q2);
                    r5.A02 = A013;
                    return r5.A01();
                } catch (Exception e) {
                    C18260x0.A16(" :: an error occurred while parsing the money node :: e = ", AnonymousClass000.A0l("PAY: BrazilTransactionCountryData :: extractAmountFromNode"), e);
                    return A012;
                }
            }
        }
        return null;
    }

    public void A04(C617332a r7, AnonymousClass36K r8, int i) {
        C195319Xg r0;
        if (r8 != null) {
            this.A06 = AnonymousClass36K.A0L(r8, "psp_transaction_id");
            if (r8.A0l("installment") != null) {
                AnonymousClass36K A0l = r8.A0l("installment");
                C162457s7.A0J(A0l, 0);
                C162457s7.A0J(r7, 1);
                try {
                    int A0b = A0l.A0b("max_count", 0);
                    int A0b2 = A0l.A0b("selected_count", 0);
                    AnonymousClass39L A002 = A00(r7, A0l.A0l("due_amount"));
                    AnonymousClass39L A003 = A00(r7, A0l.A0l("interest"));
                    if (!(A002 == null || A003 == null)) {
                        r0 = new C195319Xg(A002, A003, A0b, A0b2);
                        this.A01 = r0;
                    }
                } catch (AnonymousClass24Y e) {
                    Log.e((Throwable) e);
                }
                r0 = null;
                this.A01 = r0;
            }
        }
    }

    public void A05(String str) {
        C195319Xg r1;
        try {
            super.A05(str);
            JSONObject A1H = AnonymousClass0x9.A1H(str);
            this.A00 = A1H.optLong("expiryTs", this.A00);
            this.A05 = A1H.optString("nonce", this.A05);
            this.A04 = A1H.optString("deviceId", this.A04);
            this.A03 = A1H.optString("amount", this.A03);
            this.A07 = A1H.optString("sender-alias", this.A07);
            if (A1H.has("isFirstSend")) {
                this.A02 = Boolean.valueOf(A1H.optBoolean("isFirstSend", false));
            }
            if (A1H.has("pspTransactionId")) {
                this.A06 = A1H.optString("pspTransactionId", this.A06);
            }
            if (A1H.has("installment")) {
                JSONObject jSONObject = A1H.getJSONObject("installment");
                if (jSONObject == null) {
                    r1 = null;
                } else {
                    int i = jSONObject.getInt("max_count");
                    int i2 = jSONObject.getInt("selected_count");
                    JSONObject optJSONObject = jSONObject.optJSONObject("due_amount_obj");
                    C60042xu r0 = new C60042xu();
                    C85204Fi r4 = AnonymousClass1S3.A06;
                    r0.A02 = r4;
                    r0.A01();
                    AnonymousClass39L A012 = new C60042xu(optJSONObject).A01();
                    C162457s7.A0K(A012, "null cannot be cast to non-null type com.whatsapp.data.payments.PaymentMoney");
                    JSONObject optJSONObject2 = jSONObject.optJSONObject("interest_obj");
                    C60042xu r02 = new C60042xu();
                    r02.A02 = r4;
                    r02.A01();
                    AnonymousClass39L A013 = new C60042xu(optJSONObject2).A01();
                    C162457s7.A0K(A013, "null cannot be cast to non-null type com.whatsapp.data.payments.PaymentMoney");
                    r1 = new C195319Xg(A012, A013, i, i2);
                }
                this.A01 = r1;
            }
        } catch (JSONException e) {
            Log.w("PAY: BrazilTransactionCountryData fromDBString threw: ", e);
        }
    }

    public void A06(List list, int i) {
        if (!TextUtils.isEmpty(this.A05)) {
            C1899593h.A1R("nonce", this.A05, list);
        }
        if (!TextUtils.isEmpty(this.A04)) {
            C1899593h.A1R("device-id", this.A04, list);
        }
        Boolean bool = this.A02;
        if (bool != null) {
            C1899593h.A1R("is_first_send", C1899693i.A0Z(bool.booleanValue() ? 1 : 0), list);
        }
        if (!TextUtils.isEmpty(this.A06)) {
            C1899593h.A1R("psp_transaction_id", this.A06, list);
        }
    }

    public C21421Bt A0I() {
        C130546c9 A0G = AnonymousClass1AX.DEFAULT_INSTANCE.A0G();
        C130546c9 A0G2 = C21421Bt.DEFAULT_INSTANCE.A0G();
        C130786cX A062 = A0G.A06();
        C21421Bt r1 = (C21421Bt) C18320x8.A0C(A0G2);
        A062.getClass();
        r1.metadataValue_ = A062;
        r1.metadataValueCase_ = 2;
        return (C21421Bt) A0G2.A06();
    }

    public String A0N() {
        try {
            JSONObject A0P = A0P();
            long j = this.A00;
            if (j > 0) {
                A0P.put("expiryTs", j);
            }
            String str = this.A05;
            if (str != null) {
                A0P.put("nonce", str);
            }
            String str2 = this.A03;
            if (str2 != null) {
                A0P.put("amount", str2);
            }
            String str3 = this.A04;
            if (str3 != null) {
                A0P.put("deviceId", str3);
            }
            String str4 = this.A07;
            if (str4 != null) {
                A0P.put("sender-alias", str4);
            }
            Boolean bool = this.A02;
            if (bool != null) {
                A0P.put("isFirstSend", bool);
            }
            String str5 = this.A06;
            if (str5 != null) {
                A0P.put("pspTransactionId", str5);
            }
            C195319Xg r4 = this.A01;
            if (r4 != null) {
                JSONObject A1G = AnonymousClass0x9.A1G();
                A1G.put("max_count", r4.A00);
                A1G.put("selected_count", r4.A01);
                AnonymousClass39L r0 = r4.A02;
                C626936e.A06(r0);
                A1G.put("due_amount_obj", r0.A01());
                AnonymousClass39L r02 = r4.A03;
                C626936e.A06(r02);
                A1G.put("interest_obj", r02.A01());
                A0P.put("installment", A1G);
            }
            return A0P.toString();
        } catch (JSONException e) {
            Log.w("PAY: BrazilTransactionCountryData toDBString threw: ", e);
            return null;
        }
    }

    public void A0W(AnonymousClass1S4 r6) {
        super.A0W(r6);
        AnonymousClass99M r62 = (AnonymousClass99M) r6;
        long j = r62.A00;
        if (j > 0) {
            this.A00 = j;
        }
        String str = r62.A05;
        if (str != null) {
            this.A05 = str;
        }
        String str2 = r62.A04;
        if (str2 != null) {
            this.A04 = str2;
        }
        String str3 = r62.A03;
        if (str3 != null) {
            this.A03 = str3;
        }
        String str4 = r62.A07;
        if (str4 != null) {
            this.A07 = str4;
        }
        Boolean bool = r62.A02;
        if (bool != null) {
            this.A02 = bool;
        }
        String str5 = r62.A06;
        if (str5 != null) {
            this.A06 = str5;
        }
        C195319Xg r0 = r62.A01;
        if (r0 != null) {
            this.A01 = r0;
        }
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.A05);
        parcel.writeString(this.A04);
        parcel.writeString(this.A03);
        parcel.writeSerializable(this.A02);
        parcel.writeString(this.A06);
        parcel.writeParcelable(this.A01, 0);
    }

    public String A03() {
        return null;
    }

    public int A07() {
        return 0;
    }

    public int A08() {
        return 0;
    }

    public int A09() {
        return 0;
    }

    public long A0B() {
        return this.A00;
    }

    public C195319Xg A0D() {
        return this.A01;
    }

    public String A0J() {
        return this.A06;
    }

    public String A0K() {
        return null;
    }

    public String A0L() {
        return null;
    }

    public String A0M() {
        return this.A07;
    }

    public String A0O() {
        return null;
    }

    public void A0Q(int i) {
    }

    public void A0R(int i) {
    }

    public void A0S(int i) {
    }

    public void A0U(long j) {
        this.A00 = j;
    }

    public void A0Y(String str) {
    }

    public void A0Z(String str) {
    }

    public void A0a(String str) {
        this.A07 = str;
    }
}
