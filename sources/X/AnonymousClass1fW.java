package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.whatsapp.jid.UserJid;

/* renamed from: X.1fW  reason: invalid class name */
public final class AnonymousClass1fW extends UserJid implements Parcelable {
    public static final AnonymousClass1fW A00 = new AnonymousClass1fW();
    public static final Parcelable.Creator CREATOR = new C630537t();

    public AnonymousClass1fW() {
        super("Server");
    }

    public int describeContents() {
        return 0;
    }

    public String getObfuscatedString() {
        return getRawString();
    }

    public String getServer() {
        return "s.whatsapp.net";
    }

    public int getType() {
        return 8;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C18310x6.A14(parcel);
    }
}
