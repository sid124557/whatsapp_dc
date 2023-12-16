package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.7yF  reason: invalid class name and case insensitive filesystem */
public final class C166167yF implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C165577xI();
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C166167yF) {
                C166167yF r5 = (C166167yF) obj;
                if (!C162457s7.A0P(this.A02, r5.A02) || !C162457s7.A0P(this.A00, r5.A00) || !C162457s7.A0P(this.A03, r5.A03) || !C162457s7.A0P(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C162457s7.A0J(parcel, 0);
        parcel.writeString(this.A02);
        parcel.writeString(this.A00);
        parcel.writeString(this.A03);
        parcel.writeString(this.A01);
    }

    public int describeContents() {
        return 0;
    }

    public int hashCode() {
        return AnonymousClass0x7.A08(this.A01, AnonymousClass0x2.A07(this.A03, AnonymousClass0x2.A07(this.A00, C18310x6.A09(this.A02))));
    }

    public C166167yF(String str, String str2, String str3, String str4) {
        C18260x0.A0c(str, str2, str3, str4);
        this.A02 = str;
        this.A00 = str2;
        this.A03 = str3;
        this.A01 = str4;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("PaymentSupportFAQ(title=");
        AnonymousClass6C8.A1E(A0o, this.A02);
        A0o.append(this.A00);
        A0o.append(", url=");
        A0o.append(this.A03);
        A0o.append(", id=");
        return C18260x0.A07(this.A01, A0o);
    }
}
