package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.7yM  reason: invalid class name and case insensitive filesystem */
public final class C166237yM implements Parcelable {
    public static final Parcelable.Creator CREATOR = AnonymousClass91V.A00(30);
    public int A00;
    public final boolean A01;

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.A00);
        parcel.writeInt(this.A01 ? 1 : 0);
    }

    public C166237yM(Parcel parcel) {
        this.A00 = parcel.readInt();
        this.A01 = AnonymousClass001.A1T(parcel.readInt());
    }

    public C166237yM() {
        this.A01 = false;
    }
}
