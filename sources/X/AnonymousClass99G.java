package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.99G  reason: invalid class name */
public class AnonymousClass99G extends C133766hu {
    public static final Parcelable.Creator CREATOR = new C204589pb(17);
    public int A00;
    public int A01 = 1;
    public String A02;
    public String A03;
    public boolean A04;

    public void A04(C617332a r4, AnonymousClass36K r5, int i) {
        this.A05 = r5.A0r("country", (String) null);
        this.A06 = r5.A0r("credential-id", (String) null);
        this.A02 = C161527pr.A01(r5.A0r("account-number", (String) null), "bankAccountNumber");
        this.A01 = C161527pr.A01(r5.A0r("bank-name", (String) null), "bankName");
        String A0r = r5.A0r("code", (String) null);
        this.A02 = A0r;
        if (A0r == null) {
            this.A02 = r5.A0r("bank-code", (String) null);
        }
        this.A00 = C166587yw.A04(r5.A0r("verification-status", (String) null));
        this.A03 = r5.A0r("short-name", (String) null);
        this.A03 = r5.A0r("bank-image", (String) null);
        this.A04 = C1899693i.A0y(r5.A0r("accept-savings", (String) null));
    }

    public void A05(String str) {
        if (str != null) {
            try {
                JSONObject A1H = AnonymousClass0x9.A1H(str);
                this.A03 = A1H.optString("bankImageURL", (String) null);
                this.A04 = A1H.optString("bankPhoneNumber", (String) null);
                this.A01 = A1H.optInt("v", 1);
                this.A01 = C161527pr.A00(A1H.optString("bankName"), "bankName");
                this.A02 = A1H.optString("bankCode");
                this.A00 = A1H.optInt("verificationStatus");
            } catch (JSONException e) {
                C18260x0.A1S(AnonymousClass001.A0o(), "PAY: BrazilBankAccountMethodData fromDBString threw: ", e);
            }
        }
    }

    public void A06(List list, int i) {
        throw AnonymousClass002.A0G("PAY: BrazilBankAccountMethodData toNetwork unsupported");
    }

    public C166587yw A07() {
        C161357pU A002 = C161357pU.A00("BR");
        if (A002 == null) {
            return null;
        }
        String str = this.A06;
        C133686hm r4 = new C133686hm(A002, 0, 0, this.A00, -1);
        r4.A0A = str;
        r4.A0D("");
        r4.A0B = (String) C1899593h.A0X(this.A01);
        r4.A0D = null;
        r4.A08 = this;
        r4.A04 = this.A00;
        return r4;
    }

    public LinkedHashSet A0A() {
        return new LinkedHashSet(Collections.singletonList(AnonymousClass1S3.A04));
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.A01, i);
        parcel.writeString(this.A02);
        parcel.writeInt(this.A00);
        parcel.writeString(this.A03);
        parcel.writeString(this.A03);
        parcel.writeInt(this.A04 ? 1 : 0);
        parcel.writeString(this.A05);
        parcel.writeString(this.A06);
        parcel.writeParcelable(this.A02, i);
        parcel.writeLong(this.A00);
    }

    public String A03() {
        Object obj;
        try {
            JSONObject A0D = A0D();
            A0D.put("v", this.A01);
            C166557yt r0 = this.A01;
            if (r0 == null || C161527pr.A02(r0)) {
                obj = "";
            } else {
                obj = this.A01.A00;
            }
            A0D.put("bankName", obj);
            A0D.put("bankCode", this.A02);
            A0D.put("verificationStatus", this.A00);
            return A0D.toString();
        } catch (JSONException e) {
            C18260x0.A1S(AnonymousClass001.A0o(), "PAY: BrazilBankAccountMethodData toDBString threw: ", e);
            return null;
        }
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("[ credentialId: ");
        A0o.append(this.A06);
        A0o.append("maskedAccountNumber: ");
        A0o.append(this.A02);
        A0o.append(" bankName: ");
        A0o.append(this.A01);
        A0o.append(" bankCode: ");
        A0o.append(this.A02);
        A0o.append(" verificationStatus: ");
        A0o.append(this.A00);
        A0o.append(" bankShortName: ");
        A0o.append(this.A03);
        A0o.append(" acceptSavings: ");
        A0o.append(this.A04);
        return AnonymousClass000.A0X("]", A0o);
    }

    public C166557yt A08() {
        return null;
    }

    public int describeContents() {
        return 0;
    }
}
