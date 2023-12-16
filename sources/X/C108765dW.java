package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.5dW  reason: invalid class name and case insensitive filesystem */
public final class C108765dW implements Parcelable {
    public static final Parcelable.Creator CREATOR = new AnonymousClass6A9(1);
    public final double A00;
    public final double A01;
    public final int A02;
    public final String A03;

    public C108765dW(String str, double d, double d2, int i) {
        C162457s7.A0J(str, 4);
        this.A02 = i;
        this.A00 = d;
        this.A01 = d2;
        this.A03 = str;
    }

    public int hashCode() {
        Object[] objArr = new Object[4];
        AnonymousClass000.A1L(objArr, this.A02);
        objArr[1] = Double.valueOf(this.A00);
        objArr[2] = Double.valueOf(this.A01);
        return C18310x6.A08(this.A03, objArr, 3);
    }

    public void writeToParcel(Parcel parcel, int i) {
        C162457s7.A0J(parcel, 0);
        parcel.writeInt(this.A02);
        parcel.writeDouble(this.A00);
        parcel.writeDouble(this.A01);
        parcel.writeString(this.A03);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C108765dW)) {
            return false;
        }
        C108765dW r7 = (C108765dW) obj;
        if (this.A02 == r7.A02 && this.A00 == r7.A00 && this.A01 == r7.A01 && C162457s7.A0P(this.A03, r7.A03)) {
            return true;
        }
        return false;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("BusinessServiceArea:{'radius'='");
        A0o.append(this.A02);
        A0o.append("', 'latitude'='");
        A0o.append(this.A00);
        A0o.append("', 'longitude'='");
        A0o.append(this.A01);
        A0o.append("', 'areaDescription'='");
        A0o.append(this.A03);
        return AnonymousClass000.A0X("'}", A0o);
    }
}
