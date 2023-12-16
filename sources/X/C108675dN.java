package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.5dN  reason: invalid class name and case insensitive filesystem */
public final class C108675dN implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C165357ww();
    public final String A00;
    public final String A01;

    public C108675dN(String str, String str2) {
        C162457s7.A0J(str2, 2);
        this.A01 = str;
        this.A00 = str2;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C108675dN) {
                C108675dN r5 = (C108675dN) obj;
                if (!C162457s7.A0P(this.A01, r5.A01) || !C162457s7.A0P(this.A00, r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C162457s7.A0J(parcel, 0);
        parcel.writeString(this.A01);
        parcel.writeString(this.A00);
    }

    public int describeContents() {
        return 0;
    }

    public int hashCode() {
        return (C18270x1.A00(this.A01) * 31) + this.A00.hashCode();
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("PhoneNumberSelectionInfo{phoneNumberLabel='");
        A0o.append(this.A01);
        A0o.append("', phoneNumber='");
        A0o.append(this.A00);
        return AnonymousClass000.A0X("'}", A0o);
    }
}
