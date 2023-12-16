package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* renamed from: X.7yd  reason: invalid class name and case insensitive filesystem */
public final class C166407yd implements Parcelable {
    public static final Parcelable.Creator CREATOR = AnonymousClass91V.A00(109);
    public int A00;
    public int A01;
    public int A02;
    public String A03;
    public String A04;

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C166407yd)) {
            return false;
        }
        C166407yd r4 = (C166407yd) obj;
        return C162457s7.A0P(r4.A04, this.A04) && C162457s7.A0P(r4.A03, this.A03) && r4.A01 == this.A01 && r4.A02 == this.A02 && r4.A00 == this.A00;
    }

    public int hashCode() {
        Object[] objArr = new Object[5];
        objArr[0] = this.A04;
        objArr[1] = this.A03;
        AnonymousClass000.A1N(objArr, this.A01);
        AnonymousClass000.A1O(objArr, this.A02);
        C18280x3.A1P(objArr, this.A00);
        return Arrays.hashCode(objArr);
    }

    public void writeToParcel(Parcel parcel, int i) {
        C162457s7.A0J(parcel, 0);
        parcel.writeString(this.A04);
        parcel.writeString(this.A03);
        parcel.writeInt(this.A01);
        parcel.writeInt(this.A02);
        parcel.writeInt(this.A00);
    }

    public int describeContents() {
        return 0;
    }

    public C166407yd(Parcel parcel) {
        this.A04 = parcel.readString();
        this.A03 = parcel.readString();
        this.A01 = parcel.readInt();
        this.A02 = parcel.readInt();
        this.A00 = parcel.readInt();
    }

    public C166407yd() {
    }
}
