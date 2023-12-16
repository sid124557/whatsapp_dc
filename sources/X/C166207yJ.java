package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.7yJ  reason: invalid class name and case insensitive filesystem */
public final class C166207yJ implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C165617xM();
    public String A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final String A0A;
    public final String A0B;
    public final boolean A0C;

    public C166207yJ(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, boolean z) {
        C18260x0.A0a(str, str3, str4, 1);
        C162457s7.A0J(str7, 7);
        C162457s7.A0J(str8, 8);
        C162457s7.A0J(str9, 10);
        C18270x1.A13(str10, str11);
        C162457s7.A0J(str12, 13);
        this.A07 = str;
        this.A06 = str2;
        this.A04 = str3;
        this.A0A = str4;
        this.A08 = str5;
        this.A09 = str6;
        this.A02 = str7;
        this.A0B = str8;
        this.A0C = z;
        this.A01 = str9;
        this.A03 = str10;
        this.A05 = str11;
        this.A00 = str12;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C166207yJ) {
                C166207yJ r5 = (C166207yJ) obj;
                if (!C162457s7.A0P(this.A07, r5.A07) || !C162457s7.A0P(this.A06, r5.A06) || !C162457s7.A0P(this.A04, r5.A04) || !C162457s7.A0P(this.A0A, r5.A0A) || !C162457s7.A0P(this.A08, r5.A08) || !C162457s7.A0P(this.A09, r5.A09) || !C162457s7.A0P(this.A02, r5.A02) || !C162457s7.A0P(this.A0B, r5.A0B) || this.A0C != r5.A0C || !C162457s7.A0P(this.A01, r5.A01) || !C162457s7.A0P(this.A03, r5.A03) || !C162457s7.A0P(this.A05, r5.A05) || !C162457s7.A0P(this.A00, r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C162457s7.A0J(parcel, 0);
        parcel.writeString(this.A07);
        parcel.writeString(this.A06);
        parcel.writeString(this.A04);
        parcel.writeString(this.A0A);
        parcel.writeString(this.A08);
        parcel.writeString(this.A09);
        parcel.writeString(this.A02);
        parcel.writeString(this.A0B);
        parcel.writeByte(this.A0C ? (byte) 1 : 0);
        parcel.writeString(this.A01);
        parcel.writeString(this.A03);
        parcel.writeString(this.A05);
        parcel.writeString(this.A00);
    }

    public int describeContents() {
        return 0;
    }

    public int hashCode() {
        int A072 = AnonymousClass0x2.A07(this.A04, (C18310x6.A09(this.A07) + C18270x1.A00(this.A06)) * 31);
        return AnonymousClass0x7.A08(this.A00, AnonymousClass0x2.A07(this.A05, AnonymousClass0x2.A07(this.A03, AnonymousClass0x2.A07(this.A01, AnonymousClass0x2.A01(AnonymousClass0x2.A07(this.A0B, AnonymousClass0x2.A07(this.A02, (((AnonymousClass0x2.A07(this.A0A, A072) + C18270x1.A00(this.A08)) * 31) + AnonymousClass0x7.A07(this.A09)) * 31)), this.A0C)))));
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("IndiaUpiInternationalQrCodeMetadata(payeeName=");
        A0o.append(this.A07);
        A0o.append(", merchantCode=");
        A0o.append(this.A06);
        A0o.append(", initiationMode=");
        A0o.append(this.A04);
        A0o.append(", purposeCode=");
        A0o.append(this.A0A);
        A0o.append(", presetAmount=");
        A0o.append(this.A08);
        A0o.append(", presetMinAmount=");
        A0o.append(this.A09);
        A0o.append(", externalPaymentSource=");
        A0o.append(this.A02);
        A0o.append(", vpa=");
        A0o.append(this.A0B);
        A0o.append(", isVpaVerifiedMerchant=");
        A0o.append(this.A0C);
        A0o.append(", baseCurrency=");
        A0o.append(this.A01);
        A0o.append(", fxConversionFactor=");
        A0o.append(this.A03);
        A0o.append(", markUpFee=");
        A0o.append(this.A05);
        A0o.append(", internationalPayDetails=");
        return C18260x0.A07(this.A00, A0o);
    }
}
