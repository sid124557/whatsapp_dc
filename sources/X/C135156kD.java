package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.6kD  reason: invalid class name and case insensitive filesystem */
public final class C135156kD extends AnonymousClass1fS {
    public static final C135156kD A00 = new C135156kD();
    public static final Parcelable.Creator CREATOR = new C165467x7();

    public C135156kD() {
        super("location");
    }

    public int describeContents() {
        return 0;
    }

    public String getServer() {
        return "broadcast";
    }

    public int getType() {
        return 6;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C18310x6.A14(parcel);
    }
}
