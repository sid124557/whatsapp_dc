package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* renamed from: X.0ZP  reason: invalid class name */
public class AnonymousClass0ZP implements Parcelable {
    public static final Parcelable.Creator CREATOR = C17960wW.A00(17);
    public final List A00;
    public final List A01;

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeStringList(this.A00);
        parcel.writeTypedList(this.A01);
    }

    public AnonymousClass0ZP(Parcel parcel) {
        this.A00 = parcel.createStringArrayList();
        this.A01 = parcel.createTypedArrayList(C06780Ze.CREATOR);
    }
}
