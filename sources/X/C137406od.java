package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.6od  reason: invalid class name and case insensitive filesystem */
public final class C137406od extends C165787xd {
    public static final Parcelable.Creator CREATOR = new C165657xQ();
    public final String A00;

    public C137406od(String str) {
        C162457s7.A0J(str, 1);
        this.A00 = str;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C137406od) && C162457s7.A0P(this.A00, ((C137406od) obj).A00));
    }

    public void writeToParcel(Parcel parcel, int i) {
        C162457s7.A0J(parcel, 0);
        parcel.writeString(this.A00);
    }

    public int describeContents() {
        return 0;
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("Geosuspension(countryCode=");
        return C18260x0.A07(this.A00, A0o);
    }
}
