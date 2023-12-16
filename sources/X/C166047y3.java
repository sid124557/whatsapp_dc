package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.7y3  reason: invalid class name and case insensitive filesystem */
public final class C166047y3 implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C165237wk();
    public final double A00;
    public final double A01;
    public final int A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C166047y3) {
                C166047y3 r7 = (C166047y3) obj;
                if (!(Double.compare(this.A00, r7.A00) == 0 && Double.compare(this.A01, r7.A01) == 0 && this.A02 == r7.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C162457s7.A0J(parcel, 0);
        parcel.writeDouble(this.A00);
        parcel.writeDouble(this.A01);
        parcel.writeInt(this.A02);
    }

    public int describeContents() {
        return 0;
    }

    public int hashCode() {
        return AnonymousClass000.A00(AnonymousClass0x2.A02(Double.doubleToLongBits(this.A00)), Double.doubleToLongBits(this.A01)) + this.A02;
    }

    public C166047y3(double d, double d2, int i) {
        this.A00 = d;
        this.A01 = d2;
        this.A02 = i;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("BusinessCluster(latitude=");
        A0o.append(this.A00);
        A0o.append(", longitude=");
        A0o.append(this.A01);
        A0o.append(", businessCount=");
        return C18260x0.A09(A0o, this.A02);
    }
}
