package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.38r  reason: invalid class name and case insensitive filesystem */
public final class C632938r implements Parcelable {
    public static final Parcelable.Creator CREATOR = new AnonymousClass38O();
    public int A00;
    public int A01;
    public String A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C632938r) {
                C632938r r5 = (C632938r) obj;
                if (!(C162457s7.A0P(this.A02, r5.A02) && this.A00 == r5.A00 && this.A01 == r5.A01)) {
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
        parcel.writeInt(this.A00);
        parcel.writeInt(this.A01);
    }

    public int hashCode() {
        return (((C18270x1.A00(this.A02) * 31) + this.A00) * 31) + this.A01;
    }

    public C632938r(String str, int i, int i2) {
        this.A02 = str;
        this.A00 = i;
        this.A01 = i2;
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("ShopContent(id=");
        A0o.append(this.A02);
        A0o.append(", surface=");
        A0o.append(this.A00);
        A0o.append(", version=");
        return C18260x0.A09(A0o, this.A01);
    }
}
