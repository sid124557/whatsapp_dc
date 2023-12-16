package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.7yP  reason: invalid class name and case insensitive filesystem */
public class C166267yP implements Parcelable {
    public static final Parcelable.Creator CREATOR = AnonymousClass91V.A00(106);
    public String A00;
    public boolean A01;

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A00);
        parcel.writeByte(this.A01 ? (byte) 1 : 0);
    }

    public C166267yP(Parcel parcel) {
        this.A00 = "";
        boolean z = true;
        this.A01 = true;
        this.A00 = parcel.readString();
        this.A01 = parcel.readByte() == 0 ? false : z;
    }

    public C166267yP() {
        this.A00 = "";
        this.A01 = true;
    }
}
