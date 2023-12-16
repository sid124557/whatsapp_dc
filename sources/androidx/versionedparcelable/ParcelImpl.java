package androidx.versionedparcelable;

import X.AnonymousClass0AX;
import X.C15260r3;
import X.C17960wW;
import android.os.Parcel;
import android.os.Parcelable;

public class ParcelImpl implements Parcelable {
    public static final Parcelable.Creator CREATOR = C17960wW.A00(31);
    public final C15260r3 A00;

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        new AnonymousClass0AX(parcel).A08(this.A00);
    }

    public ParcelImpl(Parcel parcel) {
        this.A00 = new AnonymousClass0AX(parcel).A03();
    }
}
