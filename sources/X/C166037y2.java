package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.7y2  reason: invalid class name and case insensitive filesystem */
public final class C166037y2 implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C165197wg();
    public final String A00;
    public final String A01;
    public final String A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C166037y2) {
                C166037y2 r5 = (C166037y2) obj;
                if (!C162457s7.A0P(this.A00, r5.A00) || !C162457s7.A0P(this.A01, r5.A01) || !C162457s7.A0P(this.A02, r5.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C162457s7.A0J(parcel, 0);
        parcel.writeString(this.A00);
        parcel.writeString(this.A01);
        parcel.writeString(this.A02);
    }

    public int describeContents() {
        return 0;
    }

    public int hashCode() {
        return (((C18270x1.A00(this.A00) * 31) + C18270x1.A00(this.A01)) * 31) + AnonymousClass0x7.A07(this.A02);
    }

    public C166037y2(String str, String str2, String str3) {
        this.A00 = str;
        this.A01 = str2;
        this.A02 = str3;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("BusinessCustomerCareDetails(email=");
        A0o.append(this.A00);
        A0o.append(", landlineNumber=");
        A0o.append(this.A01);
        A0o.append(", mobileNumber=");
        return C18260x0.A07(this.A02, A0o);
    }
}
