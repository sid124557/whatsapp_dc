package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.5dO  reason: invalid class name and case insensitive filesystem */
public final class C108685dO implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C165007wN();
    public final String A00;
    public final String A01;
    public final String A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C108685dO) {
                C108685dO r5 = (C108685dO) obj;
                if (!C162457s7.A0P(this.A00, r5.A00) || !C162457s7.A0P(this.A02, r5.A02) || !C162457s7.A0P(this.A01, r5.A01)) {
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
        parcel.writeString(this.A02);
        parcel.writeString(this.A01);
    }

    public int describeContents() {
        return 0;
    }

    public int hashCode() {
        return AnonymousClass0x2.A07(this.A02, C18310x6.A09(this.A00)) + this.A01.hashCode();
    }

    public C108685dO(String str, String str2, String str3) {
        C18260x0.A0V(str, str2, str3);
        this.A00 = str;
        this.A02 = str2;
        this.A01 = str3;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("DeviceSimInfo{countryCode='");
        A0o.append(this.A00);
        A0o.append("', phoneNumber='");
        A0o.append(this.A02);
        A0o.append("', networkOperatorName='");
        A0o.append(this.A01);
        return AnonymousClass000.A0X("'}", A0o);
    }
}
