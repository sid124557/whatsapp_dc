package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.39A  reason: invalid class name */
public class AnonymousClass39A implements Parcelable {
    public static final Parcelable.Creator CREATOR = AnonymousClass4IW.A00(22);
    public final String A00;
    public final String A01;
    public final byte[] A02;

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A01);
        parcel.writeString(this.A00);
        parcel.writeByteArray(this.A02);
    }

    public AnonymousClass39A(String str, byte[] bArr, String str2) {
        this.A01 = str;
        this.A00 = str2;
        this.A02 = bArr;
    }

    public int describeContents() {
        return 0;
    }

    public AnonymousClass39A(Parcel parcel) {
        this.A01 = parcel.readString();
        this.A00 = parcel.readString();
        this.A02 = parcel.createByteArray();
    }
}
