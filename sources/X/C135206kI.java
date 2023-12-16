package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.whatsapp.jid.Jid;

/* renamed from: X.6kI  reason: invalid class name and case insensitive filesystem */
public final class C135206kI extends Jid implements Parcelable {
    public static final C135206kI A00 = new C135206kI();
    public static final Parcelable.Creator CREATOR = new C165497xA();

    public C135206kI() {
        super("");
    }

    public int describeContents() {
        return 0;
    }

    public String getServer() {
        return "s.whatsapp.net";
    }

    public int getType() {
        return 13;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C18310x6.A14(parcel);
    }
}
