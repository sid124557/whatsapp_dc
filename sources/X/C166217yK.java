package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.7yK  reason: invalid class name and case insensitive filesystem */
public final class C166217yK implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C164997wM();
    public final int A00;
    public final int A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C166217yK) {
                C166217yK r5 = (C166217yK) obj;
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

    public final int A00(boolean z) {
        if (z) {
            return this.A00;
        }
        return this.A01;
    }

    public int describeContents() {
        return 0;
    }

    public int hashCode() {
        return (this.A01 * 31) + this.A00;
    }

    public C166217yK(int i, int i2) {
        this.A01 = i;
        this.A00 = i2;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("CdsColorData(lightColor=");
        A0o.append(this.A01);
        A0o.append(", darkColor=");
        return C18260x0.A09(A0o, this.A00);
    }
}
