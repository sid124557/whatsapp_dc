package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.7y8  reason: invalid class name and case insensitive filesystem */
public final class C166097y8 implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C165407x1();
    public final int A00;
    public final int A01;
    public final String A02;

    public C166097y8(String str, int i, int i2) {
        C162457s7.A0J(str, 1);
        this.A02 = str;
        this.A01 = i;
        this.A00 = i2;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C166097y8) {
                C166097y8 r5 = (C166097y8) obj;
                if (!(C162457s7.A0P(this.A02, r5.A02) && this.A01 == r5.A01 && this.A00 == r5.A00)) {
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
        parcel.writeInt(this.A01);
        parcel.writeInt(this.A00);
    }

    public int describeContents() {
        return 0;
    }

    public int hashCode() {
        return ((C18310x6.A09(this.A02) + this.A01) * 31) + this.A00;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        AnonymousClass6C9.A0y(C166097y8.class, A0o);
        A0o.append("{url='");
        A0o.append(this.A02);
        A0o.append("', width='");
        A0o.append(this.A01);
        A0o.append("', height='");
        A0o.append(this.A00);
        return AnonymousClass000.A0X("'}", A0o);
    }
}
