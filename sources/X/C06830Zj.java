package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.0Zj  reason: invalid class name and case insensitive filesystem */
public abstract class C06830Zj implements Parcelable {
    public static final C06830Zj A01 = new AnonymousClass07Z();
    public static final Parcelable.Creator CREATOR = new C18240wy(3);
    public final Parcelable A00;

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.A00, i);
    }

    public C06830Zj(Parcel parcel, ClassLoader classLoader) {
        Parcelable readParcelable = parcel.readParcelable(classLoader);
        this.A00 = readParcelable == null ? A01 : readParcelable;
    }

    public C06830Zj(Parcelable parcelable) {
        if (parcelable != null) {
            this.A00 = parcelable == A01 ? null : parcelable;
            return;
        }
        throw AnonymousClass001.A0c("superState must not be null");
    }

    public C06830Zj() {
        this.A00 = null;
    }
}
