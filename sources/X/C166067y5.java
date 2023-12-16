package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.7y5  reason: invalid class name and case insensitive filesystem */
public final class C166067y5 implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C165317ws();
    public final String A00;
    public final String A01;
    public final String A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C166067y5) {
                C166067y5 r5 = (C166067y5) obj;
                if (!C162457s7.A0P(this.A01, r5.A01) || !C162457s7.A0P(this.A00, r5.A00) || !C162457s7.A0P(this.A02, r5.A02)) {
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
        parcel.writeString(this.A02);
    }

    public int describeContents() {
        return 0;
    }

    public int hashCode() {
        return AnonymousClass0x7.A08(this.A02, AnonymousClass0x2.A07(this.A00, C18310x6.A09(this.A01)));
    }

    public C166067y5(String str, String str2, String str3) {
        C18260x0.A0V(str, str2, str3);
        this.A01 = str;
        this.A00 = str2;
        this.A02 = str3;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("CategoryInfo(name=");
        A0o.append(this.A01);
        A0o.append(", iconUrl=");
        A0o.append(this.A00);
        A0o.append(", rootCategoryId=");
        return C18260x0.A07(this.A02, A0o);
    }
}
