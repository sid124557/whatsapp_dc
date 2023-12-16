package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.whatsapp.jid.Jid;

/* renamed from: X.1fN  reason: invalid class name and case insensitive filesystem */
public final class C28031fN extends Jid implements Parcelable {
    public static final C28031fN A00 = new C28031fN();
    public static final Parcelable.Creator CREATOR = new AnonymousClass380();

    public C28031fN() {
        super("");
    }

    public int describeContents() {
        return 0;
    }

    public String getServer() {
        return "call";
    }

    public int getType() {
        return 20;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C18310x6.A14(parcel);
    }
}
