package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.5dZ  reason: invalid class name and case insensitive filesystem */
public final class C108795dZ implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C165747xZ();
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C108795dZ) {
                C108795dZ r5 = (C108795dZ) obj;
                if (!(this.A01 == r5.A01 && this.A03 == r5.A03 && this.A02 == r5.A02 && this.A00 == r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C162457s7.A0J(parcel, 0);
        parcel.writeInt(this.A01);
        parcel.writeInt(this.A03);
        parcel.writeInt(this.A02);
        parcel.writeInt(this.A00);
    }

    public int describeContents() {
        return 0;
    }

    public int hashCode() {
        return (((((this.A01 * 31) + this.A03) * 31) + this.A02) * 31) + this.A00;
    }

    public C108795dZ(int i, int i2, int i3, int i4) {
        this.A01 = i;
        this.A03 = i2;
        this.A02 = i3;
        this.A00 = i4;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("SmartFilter(filterId=");
        A0o.append(this.A01);
        A0o.append(", filterViewIdRes=");
        A0o.append(this.A03);
        A0o.append(", filterNameStringRes=");
        A0o.append(this.A02);
        A0o.append(", filterDrawableRes=");
        return C18260x0.A09(A0o, this.A00);
    }
}
