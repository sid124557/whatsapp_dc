package X;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.99J  reason: invalid class name */
public class AnonymousClass99J extends C133776hv {
    public static final Parcelable.Creator CREATOR = new C204589pb(21);
    public int A00 = 0;
    public int A01 = -1;
    public String A02;
    public String A03;
    public String A04;
    public String A05;

    public void A04(C617332a r8, AnonymousClass36K r9, int i) {
        C166587yw A07;
        int i2;
        boolean equals = "1".equals(r9.A0r("can-sell", (String) null));
        boolean A1W = C1899593h.A1W(r9, "can-payout", "1");
        boolean A1W2 = C1899593h.A1W(r9, "can-add-payout", "1");
        int A022 = (equals ? 1 : 0) + C18310x6.A02(A1W ? 1 : 0);
        int i3 = 0;
        if (A1W2) {
            i3 = 4;
        }
        this.A01 = A022 + i3;
        String A0r = r9.A0r("display-state", (String) null);
        if (TextUtils.isEmpty(A0r)) {
            A0r = "ACTIVE";
        }
        this.A07 = A0r;
        this.A09 = r9.A0r("merchant-id", (String) null);
        this.A0E = C1899593h.A1W(r9, "p2m-eligible", "1");
        this.A0F = C1899593h.A1W(r9, "p2p-eligible", "1");
        this.A0C = r9.A0r("support-phone-number", (String) null);
        this.A03 = r9.A0r("business-name", (String) null);
        this.A03 = r9.A0r("gateway-name", (String) null);
        try {
            this.A00 = r9.A0b("max_installment_count", 0);
        } catch (AnonymousClass24Y e) {
            C18260x0.A1Q(AnonymousClass001.A0o(), "Exception in parsing maxInstallmentCount: ", e);
        }
        this.A04 = r9.A0r("country", (String) null);
        this.A05 = r9.A0r("credential-id", (String) null);
        this.A02 = C615531h.A03(r9.A0r("created", (String) null));
        this.A06 = r9.A0r("dashboard-url", (String) null);
        this.A0B = r9.A0r("provider_contact_website", (String) null);
        this.A08 = r9.A0r("logo-uri", (String) null);
        this.A05 = r9.A0r("provider-type", (String) null);
        this.A01 = C615531h.A01(r9.A0r("pix-onboarding-state", (String) null), -1);
        this.A0D = AnonymousClass001.A0s();
        Iterator A0M = AnonymousClass36K.A0M(r9, "payout");
        while (A0M.hasNext()) {
            AnonymousClass36K r2 = (AnonymousClass36K) A0M.next();
            String A0L = AnonymousClass36K.A0L(r2, PublicKeyCredentialControllerUtility.JSON_KEY_TYPE);
            if ("bank".equals(A0L)) {
                AnonymousClass99G r0 = new AnonymousClass99G();
                r0.A04(r8, r2, 0);
                A07 = r0.A07();
                if (A07 != null) {
                    i2 = r0.A00;
                }
            } else if ("prepaid-card".equals(A0L)) {
                AnonymousClass99I r1 = new AnonymousClass99I();
                r1.A04(r8, r2, 0);
                r1.A00 = 8;
                A07 = r1.A07();
                if (A07 != null) {
                    i2 = r1.A01;
                }
            }
            A07.A04 = i2;
            A07.A0C = this.A05;
            this.A0D.add(A07);
        }
    }

    public void A05(String str) {
        if (str != null) {
            try {
                JSONObject A1H = AnonymousClass0x9.A1H(str);
                A0D(A1H);
                this.A01 = A1H.optInt("state", 0);
                this.A09 = A1H.optString("merchantId", (String) null);
                this.A0E = A1H.optBoolean("p2mEligible", false);
                this.A0F = A1H.optBoolean("p2pEligible", false);
                this.A0C = A1H.optString("supportPhoneNumber", (String) null);
                this.A06 = A1H.optString("dashboardUrl", (String) null);
                this.A04 = A1H.optString("notificationType", (String) null);
                this.A03 = A1H.optString("gatewayName", (String) null);
                this.A0B = A1H.optString("providerContactWebsite", (String) null);
                this.A08 = A1H.optString("logoUri", (String) null);
                this.A00 = A1H.optInt("maxInstallmentCount");
                this.A05 = A1H.optString("providerType", (String) null);
                this.A01 = A1H.optInt("pixOnboardingState");
            } catch (JSONException e) {
                C18260x0.A1S(AnonymousClass001.A0o(), "PAY: BrazilMerchantMethodData fromDBString threw: ", e);
            }
        }
    }

    public void A06(List list, int i) {
        throw AnonymousClass002.A0G("PAY: BrazilMerchantMethodData toNetwork unsupported");
    }

    public C166587yw A07() {
        C161357pU A002 = C161357pU.A00("BR");
        if (A002 == null) {
            return null;
        }
        return new C133706ho(A002, this, this.A05, this.A08, this.A09, this.A03, this.A00, this.A0E, this.A0F);
    }

    public LinkedHashSet A0A() {
        return new LinkedHashSet(Collections.singletonList(AnonymousClass1S3.A04));
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.A01);
        parcel.writeString(this.A09);
        parcel.writeString(this.A0C);
        parcel.writeString(this.A03);
        parcel.writeString(this.A03);
        parcel.writeString(this.A07);
        parcel.writeString(this.A04);
        parcel.writeString(this.A05);
        parcel.writeLong(this.A02);
        parcel.writeInt(this.A00);
        parcel.writeString(this.A02);
        parcel.writeString(this.A06);
        parcel.writeString(this.A04);
        parcel.writeByte(this.A0E ? (byte) 1 : 0);
        parcel.writeByte(this.A0F ? (byte) 1 : 0);
        parcel.writeString(this.A0B);
        parcel.writeString(this.A08);
        parcel.writeInt(this.A00);
        parcel.writeString(this.A05);
        parcel.writeInt(this.A01);
    }

    public String A03() {
        JSONObject A0C = A0C();
        try {
            A0C.put("v", 1);
            if (!TextUtils.isEmpty(this.A06)) {
                A0C.put("dashboardUrl", this.A06);
            }
            if (!TextUtils.isEmpty(this.A04)) {
                A0C.put("notificationType", this.A04);
            }
            if (!TextUtils.isEmpty(this.A03)) {
                A0C.put("gatewayName", this.A03);
            }
            if (!TextUtils.isEmpty(this.A0B)) {
                A0C.put("providerContactWebsite", this.A0B);
            }
            A0C.put("p2mEligible", this.A0E);
            A0C.put("p2pEligible", this.A0F);
            A0C.put("logoUri", this.A08);
            A0C.put("maxInstallmentCount", this.A00);
            if (!TextUtils.isEmpty(this.A05)) {
                A0C.put("providerType", this.A05);
            }
            A0C.put("pixOnboardingState", this.A01);
            return A0C.toString();
        } catch (JSONException e) {
            C18260x0.A1S(AnonymousClass001.A0o(), "PAY: BrazilMerchantMethodData toDBString threw: ", e);
            return null;
        }
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("[ merchantId: ");
        String str = this.A09;
        A0o.append(str);
        A0o.append(" p2mEligible: ");
        A0o.append(this.A0E);
        A0o.append(" p2pEligible: ");
        A0o.append(this.A0F);
        A0o.append(" state: ");
        A0o.append(this.A01);
        A0o.append(" supportPhoneNumber: ");
        A0o.append(this.A0C);
        A0o.append(" dashboardUrl: ");
        A0o.append(this.A06);
        A0o.append(" merchantId: ");
        A0o.append(str);
        A0o.append(" businessName: ");
        A0o.append(this.A03);
        A0o.append(" displayState: ");
        A0o.append(this.A07);
        A0o.append(" providerContactWebsite: ");
        A0o.append(this.A0B);
        A0o.append(" logoUri: ");
        A0o.append(this.A08);
        A0o.append("maxInstallmentCount: ");
        A0o.append(this.A00);
        A0o.append("providerType: ");
        A0o.append(this.A05);
        A0o.append("pixOnboardingState: ");
        A0o.append(this.A01);
        return AnonymousClass000.A0X("]", A0o);
    }

    public int describeContents() {
        return 0;
    }
}
