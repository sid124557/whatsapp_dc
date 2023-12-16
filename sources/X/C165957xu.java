package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.7xu  reason: invalid class name and case insensitive filesystem */
public final class C165957xu implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C165647xP();
    public final boolean A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C165957xu) && this.A00 == ((C165957xu) obj).A00);
    }

    public void writeToParcel(Parcel parcel, int i) {
        C162457s7.A0J(parcel, 0);
        parcel.writeByte(this.A00 ? (byte) 1 : 0);
    }

    public int describeContents() {
        return 0;
    }

    public int hashCode() {
        if (this.A00) {
            return 1231;
        }
        return 1237;
    }

    public C165957xu(boolean z) {
        this.A00 = z;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("PrivacyDisclosureNavBar(dimissButton=");
        return C18260x0.A0A(A0o, this.A00);
    }
}
