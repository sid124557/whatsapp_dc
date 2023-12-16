package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.UserJid;

/* renamed from: X.1fY  reason: invalid class name */
public final class AnonymousClass1fY extends UserJid implements Parcelable {
    public static final AnonymousClass1fY A00 = new AnonymousClass1fY();
    public static final Parcelable.Creator CREATOR = new C630837w();

    public AnonymousClass1fY() {
        super("");
    }

    public DeviceJid getPrimaryDevice() {
        throw AnonymousClass002.A0G("getPrimaryDevice() must not be called for MeJid");
    }

    public int describeContents() {
        return 0;
    }

    public String getObfuscatedString() {
        return getRawString();
    }

    public String getServer() {
        return "status_me";
    }

    public int getType() {
        return 11;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C18310x6.A14(parcel);
    }
}
