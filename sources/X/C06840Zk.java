package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.0Zk  reason: invalid class name and case insensitive filesystem */
public class C06840Zk implements Parcelable {
    public static final Parcelable.Creator CREATOR = C17960wW.A00(28);
    public int A00;
    public int A01;
    public boolean A02;

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.A01);
        parcel.writeInt(this.A00);
        parcel.writeInt(this.A02 ? 1 : 0);
    }

    public C06840Zk(Parcel parcel) {
        this.A01 = parcel.readInt();
        this.A00 = parcel.readInt();
        this.A02 = AnonymousClass001.A1T(parcel.readInt());
    }

    public C06840Zk(C06840Zk r2) {
        this.A01 = r2.A01;
        this.A00 = r2.A00;
        this.A02 = r2.A02;
    }

    public C06840Zk() {
    }
}
