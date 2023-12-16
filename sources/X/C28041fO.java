package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.whatsapp.jid.Jid;

/* renamed from: X.1fO  reason: invalid class name and case insensitive filesystem */
public final class C28041fO extends Jid implements Parcelable {
    public static final C28041fO A00 = new C28041fO();
    public static final Parcelable.Creator CREATOR = new AnonymousClass381();

    public C28041fO() {
        super("");
    }

    public int describeContents() {
        return 0;
    }

    public String getServer() {
        return "g.us";
    }

    public int getType() {
        return 16;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C18310x6.A14(parcel);
    }
}
