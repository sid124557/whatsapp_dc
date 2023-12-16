package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.7yA  reason: invalid class name and case insensitive filesystem */
public final class C166117yA implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C165207wh();
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C166117yA) {
                C166117yA r5 = (C166117yA) obj;
                if (!C162457s7.A0P(this.A03, r5.A03) || !C162457s7.A0P(this.A00, r5.A00) || !C162457s7.A0P(this.A01, r5.A01) || !C162457s7.A0P(this.A02, r5.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C162457s7.A0J(parcel, 0);
        parcel.writeString(this.A03);
        parcel.writeString(this.A00);
        parcel.writeString(this.A01);
        parcel.writeString(this.A02);
    }

    public int describeContents() {
        return 0;
    }

    public int hashCode() {
        return (((((C18270x1.A00(this.A03) * 31) + C18270x1.A00(this.A00)) * 31) + C18270x1.A00(this.A01)) * 31) + AnonymousClass0x7.A07(this.A02);
    }

    public C166117yA(String str, String str2, String str3, String str4) {
        this.A03 = str;
        this.A00 = str2;
        this.A01 = str3;
        this.A02 = str4;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("BusinessGrievanceOfficerDetails(name=");
        A0o.append(this.A03);
        A0o.append(", email=");
        A0o.append(this.A00);
        A0o.append(", landlineNumber=");
        A0o.append(this.A01);
        A0o.append(", mobileNumber=");
        return C18260x0.A07(this.A02, A0o);
    }
}
