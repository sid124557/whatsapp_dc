package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.7yE  reason: invalid class name and case insensitive filesystem */
public final class C166157yE implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C165567xH();
    public final C166557yt A00;
    public final String A01;
    public final String A02;
    public final String A03;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C166157yE) {
                C166157yE r5 = (C166157yE) obj;
                if (!C162457s7.A0P(this.A00, r5.A00) || !C162457s7.A0P(this.A03, r5.A03) || !C162457s7.A0P(this.A01, r5.A01) || !C162457s7.A0P(this.A02, r5.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C162457s7.A0J(parcel, 0);
        parcel.writeParcelable(this.A00, i);
        parcel.writeString(this.A03);
        parcel.writeString(this.A01);
        parcel.writeString(this.A02);
    }

    public int describeContents() {
        return 0;
    }

    public int hashCode() {
        return AnonymousClass0x7.A08(this.A02, AnonymousClass0x2.A07(this.A01, AnonymousClass0x2.A07(this.A03, C18300x5.A04(this.A00))));
    }

    public C166157yE(C166557yt r1, String str, String str2, String str3) {
        C18260x0.A0c(r1, str, str2, str3);
        this.A00 = r1;
        this.A03 = str;
        this.A01 = str2;
        this.A02 = str3;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("PaymentAliasData(alias=");
        A0o.append(this.A00);
        A0o.append(", aliasType=");
        A0o.append(this.A03);
        A0o.append(", aliasId=");
        A0o.append(this.A01);
        A0o.append(", aliasStatus=");
        return C18260x0.A07(this.A02, A0o);
    }
}
