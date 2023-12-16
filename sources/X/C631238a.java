package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.38a  reason: invalid class name and case insensitive filesystem */
public final class C631238a implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C629337h();
    public final String A00;

    public C631238a(String str) {
        C162457s7.A0J(str, 1);
        this.A00 = str;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C631238a) && C162457s7.A0P(this.A00, ((C631238a) obj).A00));
    }

    public void writeToParcel(Parcel parcel, int i) {
        C162457s7.A0J(parcel, 0);
        parcel.writeString(this.A00);
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("ExtensionsCatalogResponseData(rawResponse=");
        return C18260x0.A07(this.A00, A0o);
    }
}
