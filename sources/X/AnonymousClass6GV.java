package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.6GV  reason: invalid class name */
public class AnonymousClass6GV extends C06830Zj {
    public static final Parcelable.Creator CREATOR = new C1897092i(3);
    public boolean A00;

    public AnonymousClass6GV(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.A00 = AnonymousClass001.A1T(parcel.readInt());
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.A00 ? 1 : 0);
    }

    public AnonymousClass6GV(Parcelable parcelable) {
        super(parcelable);
    }
}
