package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.6kE  reason: invalid class name and case insensitive filesystem */
public final class C135166kE extends AnonymousClass1fS implements Parcelable {
    public static final C135166kE A00 = new C135166kE();
    public static final Parcelable.Creator CREATOR = new C165517xC();

    public C135166kE() {
        super("status");
    }

    public int describeContents() {
        return 0;
    }

    public String getServer() {
        return "broadcast";
    }

    public int getType() {
        return 5;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C18310x6.A14(parcel);
    }
}
