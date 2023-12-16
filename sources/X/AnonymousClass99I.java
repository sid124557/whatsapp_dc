package X;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.99I  reason: invalid class name */
public class AnonymousClass99I extends C133786hw {
    public static final Parcelable.Creator CREATOR = new C204589pb(18);
    public int A00 = 0;
    public int A01;
    public int A02 = 1;
    public String A03 = null;
    public String A04;
    public String A05;
    public String A06 = null;
    public boolean A07;
    public boolean A08;

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0128, code lost:
        if (X.C1899593h.A1W(r4, "default-eligible-p2p", "1") != false) goto L_0x012a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0097, code lost:
        if (X.C1899593h.A1W(r8, "default-debit", "1") != false) goto L_0x0099;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A04(X.C617332a r7, X.AnonymousClass36K r8, int r9) {
        /*
            r6 = this;
            java.lang.String r0 = "verified"
            r2 = 0
            java.lang.String r0 = r8.A0r(r0, r2)
            java.lang.String r5 = "1"
            boolean r0 = r5.equals(r0)
            r6.A0a = r0
            java.lang.String r0 = "automatic-binding"
            boolean r0 = X.C1899593h.A1W(r8, r0, r5)
            r6.A07 = r0
            java.lang.String r0 = "bank-name"
            java.lang.String r1 = r8.A0r(r0, r2)
            java.lang.String r0 = "bankName"
            X.7yt r0 = X.C161527pr.A01(r1, r0)
            r6.A08 = r0
            java.lang.String r0 = "bank-phone-number"
            java.lang.String r0 = r8.A0r(r0, r2)
            r6.A0B = r0
            java.lang.String r3 = "image"
            java.lang.String r0 = r8.A0r(r3, r2)
            r6.A0A = r0
            java.lang.String r0 = "time-last-added"
            java.lang.String r4 = r8.A0r(r0, r2)
            r0 = -1
            long r0 = X.C615531h.A04(r4, r0)
            r6.A06 = r0
            java.lang.String r0 = "pending-verification-type"
            java.lang.String r0 = r8.A0r(r0, r2)
            r6.A0O = r0
            java.lang.String r0 = "country"
            java.lang.String r0 = r8.A0r(r0, r2)
            r6.A0G = r0
            java.lang.String r0 = "credential-id"
            java.lang.String r0 = r8.A0r(r0, r2)
            r6.A0H = r0
            java.lang.String r0 = "type"
            java.lang.String r0 = r8.A0r(r0, r2)
            int r0 = X.C133736hr.A00(r0)
            r6.A00 = r0
            java.lang.String r0 = "created"
            java.lang.String r0 = r8.A0r(r0, r2)
            long r0 = X.C615531h.A03(r0)
            r6.A05 = r0
            java.lang.String r0 = "network-type"
            java.lang.String r0 = r8.A0r(r0, r2)
            int r0 = X.C133736hr.A01(r0)
            r6.A01 = r0
            java.lang.String r0 = "last4"
            java.lang.String r0 = r8.A0r(r0, r2)
            r6.A0J = r0
            java.lang.String r0 = "default-debit-p2p"
            boolean r0 = X.C1899593h.A1W(r8, r0, r5)
            r4 = 0
            if (r0 != 0) goto L_0x0099
            java.lang.String r0 = "default-debit"
            boolean r1 = X.C1899593h.A1W(r8, r0, r5)
            r0 = 0
            if (r1 == 0) goto L_0x009a
        L_0x0099:
            r0 = 1
        L_0x009a:
            r6.A0W = r0
            java.lang.String r0 = "default-credit-p2p"
            boolean r0 = X.C1899593h.A1W(r8, r0, r5)
            if (r0 != 0) goto L_0x00ac
            java.lang.String r0 = "default-credit"
            boolean r0 = X.C1899593h.A1W(r8, r0, r5)
            if (r0 == 0) goto L_0x00ad
        L_0x00ac:
            r4 = 1
        L_0x00ad:
            r6.A0V = r4
            java.lang.String r0 = "default-debit-p2m"
            boolean r0 = X.C1899593h.A1W(r8, r0, r5)
            r6.A0S = r0
            java.lang.String r0 = "default-credit-p2m"
            boolean r0 = X.C1899593h.A1W(r8, r0, r5)
            r6.A0R = r0
            java.lang.String r0 = "needs-device-binding"
            boolean r0 = X.C1899593h.A1W(r8, r0, r5)
            r6.A08 = r0
            java.lang.String r0 = "binding-type"
            java.lang.String r0 = r8.A0r(r0, r2)
            r6.A03 = r0
            java.lang.String r0 = "token-id"
            java.lang.String r0 = r8.A0r(r0, r2)
            r6.A06 = r0
            java.lang.String r0 = "p2p-eligible"
            boolean r0 = X.C1899593h.A1W(r8, r0, r5)
            r6.A0Y = r0
            java.lang.String r0 = "p2m-eligible"
            boolean r0 = X.C1899593h.A1W(r8, r0, r5)
            r6.A0U = r0
            java.lang.String r1 = "state"
            java.lang.String r0 = "UNSET"
            java.lang.String r0 = r8.A0r(r1, r0)
            r6.A0F = r0
            java.lang.String r0 = "display-state"
            java.lang.String r1 = r8.A0r(r0, r2)
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 == 0) goto L_0x00ff
            java.lang.String r1 = "ACTIVE"
        L_0x00ff:
            r6.A0I = r1
            java.lang.String r0 = "capabilities"
            X.36K r4 = r8.A0l(r0)
            if (r4 == 0) goto L_0x019b
            java.lang.String r0 = "editable"
            boolean r0 = X.C1899593h.A1W(r4, r0, r5)
            r6.A0P = r0
            java.lang.String r0 = "verifiable"
            boolean r0 = X.C1899593h.A1W(r4, r0, r5)
            r6.A0Z = r0
            java.lang.String r0 = "default-eligible"
            boolean r0 = X.C1899593h.A1W(r4, r0, r5)
            if (r0 != 0) goto L_0x012a
            java.lang.String r0 = "default-eligible-p2p"
            boolean r1 = X.C1899593h.A1W(r4, r0, r5)
            r0 = 0
            if (r1 == 0) goto L_0x012b
        L_0x012a:
            r0 = 1
        L_0x012b:
            r6.A0X = r0
            java.lang.String r0 = "default-eligible-p2m"
            boolean r0 = X.C1899593h.A1W(r4, r0, r5)
            r6.A0T = r0
            java.lang.String r0 = "p2p-send"
            java.lang.String r0 = r4.A0r(r0, r2)
            java.lang.String r0 = X.C133786hw.A00(r0)
            if (r0 != 0) goto L_0x0155
            boolean r0 = r6.A0Y
            if (r0 == 0) goto L_0x01cf
            java.lang.String r1 = "ACTIVE"
            java.lang.String r0 = r6.A0I
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x01cf
            boolean r0 = r6.A0a
            if (r0 == 0) goto L_0x01cc
            java.lang.String r0 = "ENABLED"
        L_0x0155:
            r6.A0N = r0
            java.lang.String r0 = "p2p-receive"
            java.lang.String r0 = r4.A0r(r0, r2)
            java.lang.String r0 = X.C133786hw.A00(r0)
            if (r0 != 0) goto L_0x0167
            java.lang.String r0 = r6.A0C()
        L_0x0167:
            r6.A0M = r0
            java.lang.String r0 = "p2m-send"
            java.lang.String r0 = r4.A0r(r0, r2)
            java.lang.String r0 = X.C133786hw.A00(r0)
            if (r0 != 0) goto L_0x0189
            boolean r0 = r6.A0U
            if (r0 == 0) goto L_0x01c9
            java.lang.String r1 = "ACTIVE"
            java.lang.String r0 = r6.A0I
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x01c9
            boolean r0 = r6.A0a
            if (r0 == 0) goto L_0x01c6
            java.lang.String r0 = "ENABLED"
        L_0x0189:
            r6.A0L = r0
            java.lang.String r0 = "p2m-receive"
            java.lang.String r0 = r4.A0r(r0, r2)
            java.lang.String r0 = X.C133786hw.A00(r0)
            if (r0 != 0) goto L_0x0199
            java.lang.String r0 = "DISABLED"
        L_0x0199:
            r6.A0K = r0
        L_0x019b:
            java.lang.String r0 = "verification-status"
            java.lang.String r0 = r8.A0r(r0, r2)
            int r0 = X.C166587yw.A04(r0)
            r6.A01 = r0
            X.36K r1 = r8.A0l(r3)
            java.lang.String r0 = "image-content-id"
            if (r1 == 0) goto L_0x01d2
            java.lang.String r0 = r1.A0r(r0, r2)
            r6.A0C = r0
            java.lang.String r0 = "image-url"
            java.lang.String r0 = r1.A0r(r0, r2)
            r6.A0E = r0
            java.lang.String r0 = "image-label-color"
            java.lang.String r0 = r1.A0r(r0, r2)
            r6.A0D = r0
            return
        L_0x01c6:
            java.lang.String r0 = "REQUIRES_VERIFICATION"
            goto L_0x0189
        L_0x01c9:
            java.lang.String r0 = "DISABLED"
            goto L_0x0189
        L_0x01cc:
            java.lang.String r0 = "REQUIRES_VERIFICATION"
            goto L_0x0155
        L_0x01cf:
            java.lang.String r0 = "DISABLED"
            goto L_0x0155
        L_0x01d2:
            java.lang.String r0 = r8.A0r(r0, r2)
            r6.A0C = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass99I.A04(X.32a, X.36K, int):void");
    }

    public void A05(String str) {
        String str2;
        String str3;
        if (str != null) {
            try {
                JSONObject A1H = AnonymousClass0x9.A1H(str);
                this.A0a = A1H.optBoolean("verified", false);
                this.A08 = C161527pr.A01(A1H.optString("bankName", (String) null), "bankName");
                this.A07 = C161527pr.A01(A1H.optString("bankCode", (String) null), "bankCode");
                this.A0B = A1H.optString("bankPhoneNumber", (String) null);
                this.A0A = A1H.optString("bankLogoUrl", this.A0A);
                this.A06 = A1H.optLong("timeLastAdded", -1);
                this.A0O = A1H.optString("verificationType", (String) null);
                this.A0Q = A1H.optBoolean("otpNumberMatch", false);
                this.A02 = A1H.optInt("otpLength", 8);
                String optString = A1H.optString("displayState", (String) null);
                if (TextUtils.isEmpty(optString)) {
                    optString = "ACTIVE";
                }
                this.A0I = optString;
                this.A0P = A1H.optBoolean("editable", false);
                this.A0Z = A1H.optBoolean("verifiable", false);
                String str4 = "p2pDefaultEligible";
                if (!A1H.has(str4)) {
                    str4 = "defaultEligible";
                }
                this.A0X = A1H.optBoolean(str4, false);
                this.A0T = A1H.optBoolean("p2mDefaultEligible", false);
                if (!this.A0Y || !"ACTIVE".equals(this.A0I)) {
                    str2 = "DISABLED";
                } else if (this.A0a) {
                    str2 = "ENABLED";
                } else {
                    str2 = "REQUIRES_VERIFICATION";
                }
                this.A0N = A1H.optString("p2pSend", str2);
                this.A0M = A1H.optString("p2pReceive", A0C());
                if (!this.A0U || !"ACTIVE".equals(this.A0I)) {
                    str3 = "DISABLED";
                } else if (this.A0a) {
                    str3 = "ENABLED";
                } else {
                    str3 = "REQUIRES_VERIFICATION";
                }
                this.A0L = A1H.optString("p2mSend", str3);
                this.A0K = A1H.optString("p2mReceive", "DISABLED");
                this.A02 = A1H.optInt("v", 1);
                this.A03 = A1H.optInt("paymentRails", 0);
                this.A0Y = A1H.optBoolean("p2pEligible", false);
                this.A0U = A1H.optBoolean("p2mEligible", false);
                this.A08 = A1H.optBoolean("needsDeviceBinding", false);
                this.A07 = A1H.optBoolean("automaticBinding", false);
                this.A03 = A1H.optString("bindingType", (String) null);
                this.A06 = A1H.optString("tokenId", (String) null);
                this.A0C = A1H.optString("cardImageContentId", (String) null);
                this.A0E = A1H.optString("cardImageUrl", (String) null);
                this.A0D = A1H.optString("cardImageLabelColor", (String) null);
                this.A0J = A1H.optString("lastFour", (String) null);
                this.A09 = Long.valueOf(A1H.optLong("cardDataUpdatedTimeMillis", 0));
                this.A05 = A1H.optString("notificationType", (String) null);
                this.A0F = A1H.optString("cardState", "UNSET");
                this.A01 = A1H.optInt("verificationStatus");
            } catch (JSONException e) {
                C18260x0.A1S(AnonymousClass001.A0o(), "PAY: BrazilCardMethodData fromDBString threw: ", e);
            }
        }
    }

    public void A06(List list, int i) {
        throw AnonymousClass002.A0G("PAY: BrazilCardMethodData toNetwork unsupported");
    }

    public C166587yw A07() {
        C161357pU A002 = C161357pU.A00("BR");
        String str = this.A0H;
        int i = this.A00;
        int A022 = C18310x6.A02(this.A0W ? 1 : 0);
        int A023 = C18310x6.A02(this.A0V ? 1 : 0);
        int A024 = C18310x6.A02(this.A0S ? 1 : 0);
        int A025 = C18310x6.A02(this.A0R ? 1 : 0);
        String str2 = this.A0J;
        long j = this.A05;
        C133736hr r2 = new C133736hr(A002, str, (String) C1899593h.A0X(this.A08), str2, i, A022, A023, A024, A025, this.A01);
        r2.A05 = j;
        r2.A08 = this;
        r2.A04 = this.A01;
        return r2;
    }

    public LinkedHashSet A0A() {
        return new LinkedHashSet(Collections.singletonList(AnonymousClass1S3.A04));
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeByte(this.A0a ? (byte) 1 : 0);
        parcel.writeParcelable(this.A08, i);
        parcel.writeString(this.A0B);
        parcel.writeString(this.A0A);
        parcel.writeString(this.A0O);
        parcel.writeByte(this.A0Q ? (byte) 1 : 0);
        parcel.writeInt(this.A03);
        parcel.writeByte(this.A0Y ? (byte) 1 : 0);
        parcel.writeByte(this.A0U ? (byte) 1 : 0);
        parcel.writeLong(this.A06);
        parcel.writeInt(this.A04);
        parcel.writeString(this.A0G);
        parcel.writeString(this.A0H);
        parcel.writeInt(this.A00);
        parcel.writeByte(this.A0W ? (byte) 1 : 0);
        parcel.writeByte(this.A0V ? (byte) 1 : 0);
        parcel.writeByte(this.A0S ? (byte) 1 : 0);
        parcel.writeByte(this.A0R ? (byte) 1 : 0);
        parcel.writeString(this.A0J);
        parcel.writeLong(this.A05);
        parcel.writeInt(this.A01);
        parcel.writeByte(this.A07 ? (byte) 1 : 0);
        parcel.writeByte(this.A08 ? (byte) 1 : 0);
        parcel.writeString(this.A03);
        parcel.writeString(this.A06);
        parcel.writeInt(this.A00);
        parcel.writeString(this.A04);
        parcel.writeInt(this.A01);
        parcel.writeString(this.A0C);
        parcel.writeString(this.A0E);
        parcel.writeString(this.A0D);
        parcel.writeLong(this.A09.longValue());
        parcel.writeString(this.A05);
        parcel.writeString(this.A0F);
        parcel.writeString(this.A0I);
        parcel.writeByte(this.A0P ? (byte) 1 : 0);
        parcel.writeByte(this.A0Z ? (byte) 1 : 0);
        parcel.writeByte(this.A0X ? (byte) 1 : 0);
        parcel.writeByte(this.A0T ? (byte) 1 : 0);
        parcel.writeString(this.A0N);
        parcel.writeString(this.A0M);
        parcel.writeString(this.A0L);
        parcel.writeString(this.A0K);
    }

    public String A03() {
        try {
            JSONObject A1G = AnonymousClass0x9.A1G();
            try {
                A1G.put("verified", this.A0a);
                C166557yt r1 = this.A08;
                if (!C161527pr.A03(r1)) {
                    C1899693i.A0r(r1, "bankName", A1G);
                }
                C166557yt r12 = this.A07;
                if (!C161527pr.A03(r12)) {
                    C1899693i.A0r(r12, "bankCode", A1G);
                }
                String str = this.A0B;
                if (str != null) {
                    A1G.put("bankPhoneNumber", str);
                }
                String str2 = this.A0A;
                if (str2 != null) {
                    A1G.put("bankLogoUrl", str2);
                }
                long j = this.A06;
                if (j >= 0) {
                    A1G.put("timeLastAdded", j);
                }
                String str3 = this.A0O;
                if (str3 != null) {
                    A1G.put("verificationType", str3);
                }
                if ("otp".equals(this.A0O)) {
                    A1G.put("otpNumberMatch", this.A0Q);
                }
                int i = this.A02;
                if (i >= 0) {
                    A1G.put("otpLength", i);
                }
                String str4 = this.A0I;
                if (str4 != null) {
                    A1G.put("displayState", str4);
                }
                try {
                    A1G.put("editable", this.A0P);
                    A1G.put("verifiable", this.A0Z);
                    A1G.put("p2pDefaultEligible", this.A0X);
                    A1G.put("p2mDefaultEligible", this.A0T);
                    A1G.put("p2pSend", this.A0N);
                    A1G.put("p2pReceive", this.A0M);
                    A1G.put("p2mSend", this.A0L);
                    A1G.put("p2mReceive", this.A0K);
                } catch (JSONException e) {
                    C18260x0.A1S(AnonymousClass001.A0o(), "PAY: PaymentMethodCardCountryData/addCapabilitiesToJson threw: ", e);
                }
            } catch (JSONException e2) {
                C18260x0.A1S(AnonymousClass001.A0o(), "PAY: PaymentMethodCardCountryData toJSONObject threw: ", e2);
            }
            A1G.put("v", this.A02);
            A1G.put("paymentRails", this.A03);
            A1G.put("needsDeviceBinding", this.A08);
            A1G.put("automaticBinding", this.A07);
            String str5 = this.A03;
            if (str5 != null) {
                A1G.put("bindingType", str5);
            }
            String str6 = this.A06;
            if (str6 != null) {
                A1G.put("tokenId", str6);
            }
            String str7 = this.A0C;
            if (str7 != null) {
                A1G.put("cardImageContentId", str7);
            }
            String str8 = this.A0E;
            if (str8 != null) {
                A1G.put("cardImageUrl", str8);
            }
            String str9 = this.A0D;
            if (str9 != null) {
                A1G.put("cardImageLabelColor", str9);
            }
            String str10 = this.A0J;
            if (str10 != null) {
                A1G.put("lastFour", str10);
            }
            Long l = this.A09;
            if (l != null) {
                A1G.put("cardDataUpdatedTimeMillis", l);
            }
            A1G.put("notificationType", this.A05);
            A1G.put("cardState", this.A0F);
            A1G.put("p2pEligible", this.A0Y);
            A1G.put("p2mEligible", this.A0U);
            A1G.put("verificationStatus", this.A01);
            return A1G.toString();
        } catch (JSONException e3) {
            C18260x0.A1S(AnonymousClass001.A0o(), "PAY: BrazilCardMethodData toDBString threw: ", e3);
            return null;
        }
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("[ verified: ");
        A0o.append(this.A0a);
        A0o.append(" automaticBinding: ");
        A0o.append(this.A07);
        A0o.append(" accountType: ");
        A0o.append(this.A00);
        A0o.append(" bankName: ");
        A0o.append(this.A08);
        A0o.append(" bankPhoneNumber: ");
        A0o.append(this.A0B);
        A0o.append(" bankLogoUrl: ");
        A0o.append(this.A0A);
        A0o.append(" verificationType: ");
        A0o.append(this.A0O);
        A0o.append(" otpNumberMatch: ");
        A0o.append(this.A0Q);
        A0o.append(" paymentRails: ");
        A0o.append(this.A03);
        A0o.append(" p2pEligible: ");
        A0o.append(this.A0Y);
        A0o.append(" p2mEligible: ");
        A0o.append(this.A0U);
        A0o.append(" timeLastAdded: ");
        A0o.append(this.A06);
        A0o.append(" needsDeviceBinding: ");
        A0o.append(this.A08);
        A0o.append(" bindingType: ");
        A0o.append(this.A03);
        A0o.append(" cardImageContentId: ");
        A0o.append(this.A0C);
        A0o.append(" cardImageUrl: ");
        A0o.append(this.A0E);
        A0o.append(" cardImageLabelColor: ");
        A0o.append(this.A0D);
        A0o.append(" notificationType: ");
        A0o.append(this.A05);
        A0o.append(" lastFour: ");
        A0o.append(this.A0J);
        A0o.append("payoutVerificationStatus: ");
        A0o.append(this.A01);
        A0o.append(" displayState: ");
        StringBuilder A0w = C18290x4.A0w(this.A0I, A0o);
        A0w.append(" capabilities { editable: ");
        A0w.append(this.A0P);
        A0w.append(", verifiable: ");
        A0w.append(this.A0Z);
        A0w.append(", p2pDefaultEligible: ");
        A0w.append(this.A0X);
        A0w.append(", p2mDefaultEligible: ");
        A0w.append(this.A0T);
        A0w.append(", p2pSend: ");
        A0w.append(this.A0N);
        A0w.append(", p2pReceive: ");
        A0w.append(this.A0M);
        A0w.append(", p2mSend: ");
        A0w.append(this.A0L);
        A0w.append(", p2mReceive: ");
        A0w.append(this.A0K);
        A0w.append("}");
        AnonymousClass000.A1B(A0w, A0o);
        return AnonymousClass000.A0X(" ]", A0o);
    }

    public int describeContents() {
        return 0;
    }
}
