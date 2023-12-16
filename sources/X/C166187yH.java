package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.7yH  reason: invalid class name and case insensitive filesystem */
public final class C166187yH implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C165087wV();
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C166187yH) {
                C166187yH r5 = (C166187yH) obj;
                if (!C162457s7.A0P(this.A04, r5.A04) || !C162457s7.A0P(this.A05, r5.A05) || !C162457s7.A0P(this.A02, r5.A02) || !C162457s7.A0P(this.A00, r5.A00) || !C162457s7.A0P(this.A03, r5.A03) || !C162457s7.A0P(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C162457s7.A0J(parcel, 0);
        parcel.writeString(this.A04);
        parcel.writeString(this.A05);
        parcel.writeString(this.A02);
        parcel.writeString(this.A00);
        parcel.writeString(this.A03);
        parcel.writeString(this.A01);
    }

    public int describeContents() {
        return 0;
    }

    public int hashCode() {
        return (((((((((C18270x1.A00(this.A04) * 31) + C18270x1.A00(this.A05)) * 31) + C18270x1.A00(this.A02)) * 31) + C18270x1.A00(this.A00)) * 31) + C18270x1.A00(this.A03)) * 31) + AnonymousClass0x7.A07(this.A01);
    }

    public C166187yH(String str, String str2, String str3, String str4, String str5, String str6) {
        this.A04 = str;
        this.A05 = str2;
        this.A02 = str3;
        this.A00 = str4;
        this.A03 = str5;
        this.A01 = str6;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("ProductImportAddress(street1=");
        A0o.append(this.A04);
        A0o.append(", street2=");
        A0o.append(this.A05);
        A0o.append(", postalCode=");
        A0o.append(this.A02);
        A0o.append(", city=");
        A0o.append(this.A00);
        A0o.append(", region=");
        A0o.append(this.A03);
        A0o.append(", countryCode=");
        return C18260x0.A07(this.A01, A0o);
    }
}
