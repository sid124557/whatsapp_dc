package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.38g  reason: invalid class name and case insensitive filesystem */
public final class C631838g implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C629437i();
    public final int A00;
    public final int A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C631838g) {
                C631838g r5 = (C631838g) obj;
                if (!(this.A01 == r5.A01 && this.A00 == r5.A00)) {
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
        parcel.writeInt(this.A00);
    }

    public int hashCode() {
        return (this.A01 * 31) + this.A00;
    }

    public C631838g(int i, int i2) {
        this.A01 = i;
        this.A00 = i2;
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("BackwardCompatibilityEvent(reason=");
        A0o.append(this.A01);
        A0o.append(", feature=");
        return C18260x0.A09(A0o, this.A00);
    }
}
