package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.7xz  reason: invalid class name and case insensitive filesystem */
public final class C166007xz implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C165627xN();
    public final String A00;
    public final String A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C166007xz) {
                C166007xz r5 = (C166007xz) obj;
                if (!C162457s7.A0P(this.A00, r5.A00) || !C162457s7.A0P(this.A01, r5.A01)) {
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
    }

    public int describeContents() {
        return 0;
    }

    public int hashCode() {
        return AnonymousClass0x7.A08(this.A01, C18310x6.A09(this.A00));
    }

    public C166007xz(String str, String str2) {
        C18260x0.A0Q(str, str2);
        this.A00 = str;
        this.A01 = str2;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("PrivacyDisclosureButton(action=");
        A0o.append(this.A00);
        A0o.append(", label=");
        return C18260x0.A07(this.A01, A0o);
    }
}
