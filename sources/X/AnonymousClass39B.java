package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.39B  reason: invalid class name */
public class AnonymousClass39B implements Parcelable {
    public static final Parcelable.Creator CREATOR = AnonymousClass4IW.A00(29);
    public boolean A00;
    public final String A01;
    public final byte[] A02;

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.A00 ? 1 : 0);
        parcel.writeByteArray(this.A02);
        parcel.writeString(this.A01);
    }

    public AnonymousClass39B(byte[] bArr, String str, boolean z) {
        this.A02 = bArr;
        this.A01 = str;
        this.A00 = z;
    }

    public int describeContents() {
        return 0;
    }

    public AnonymousClass39B(Parcel parcel) {
        this.A00 = AnonymousClass000.A1S(parcel.readInt());
        this.A02 = parcel.createByteArray();
        this.A01 = C18310x6.A0l(parcel);
    }
}
