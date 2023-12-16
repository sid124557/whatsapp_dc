package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.391  reason: invalid class name */
public class AnonymousClass391 implements Parcelable {
    public static final Parcelable.Creator CREATOR = AnonymousClass4IW.A00(25);
    public boolean A00;

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeByte(this.A00 ? (byte) 1 : 0);
    }

    public AnonymousClass391(Parcel parcel) {
        this.A00 = AnonymousClass000.A1S(parcel.readByte());
    }

    public int describeContents() {
        return 0;
    }

    public AnonymousClass391(boolean z) {
        this.A00 = z;
    }
}
