package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.6kF  reason: invalid class name and case insensitive filesystem */
public final class C135176kF extends C95814uZ implements Parcelable {
    public static final C135176kF A00 = new C135176kF();
    public static final Parcelable.Creator CREATOR = new C165427x3();

    public C135176kF() {
        super("gdpr");
    }

    public int describeContents() {
        return 0;
    }

    public String getServer() {
        return "s.whatsapp.net";
    }

    public int getType() {
        return 9;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C18310x6.A14(parcel);
    }
}
