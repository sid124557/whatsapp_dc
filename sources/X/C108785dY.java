package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.5dY  reason: invalid class name and case insensitive filesystem */
public final class C108785dY implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C165687xT();
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C108785dY) {
                C108785dY r5 = (C108785dY) obj;
                if (!C162457s7.A0P(this.A02, r5.A02) || !C162457s7.A0P(this.A01, r5.A01) || !C162457s7.A0P(this.A03, r5.A03) || !C162457s7.A0P(this.A00, r5.A00)) {
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
        parcel.writeString(this.A01);
        parcel.writeString(this.A03);
        parcel.writeString(this.A00);
    }

    public int describeContents() {
        return 0;
    }

    public int hashCode() {
        return AnonymousClass0x2.A07(this.A03, (C18310x6.A09(this.A02) + C18270x1.A00(this.A01)) * 31) + AnonymousClass0x7.A07(this.A00);
    }

    public C108785dY(String str, String str2, String str3, String str4) {
        C18260x0.A0R(str, str3);
        this.A02 = str;
        this.A01 = str2;
        this.A03 = str3;
        this.A00 = str4;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("SingleSelectListSectionItem(id=");
        A0o.append(this.A02);
        A0o.append(", header=");
        A0o.append(this.A01);
        A0o.append(", title=");
        A0o.append(this.A03);
        A0o.append(", description=");
        return C18260x0.A07(this.A00, A0o);
    }
}
