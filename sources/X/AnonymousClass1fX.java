package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.UserJid;

/* renamed from: X.1fX  reason: invalid class name */
public final class AnonymousClass1fX extends UserJid implements Parcelable {
    public static final AnonymousClass1fX A00 = new AnonymousClass1fX();
    public static final Parcelable.Creator CREATOR = new C630637u();

    public AnonymousClass1fX() {
        super("");
    }

    public DeviceJid getPrimaryDevice() {
        throw AnonymousClass002.A0G("getPrimaryDevice() must not be called for LidMeJid");
    }

    public int describeContents() {
        return 0;
    }

    public String getObfuscatedString() {
        return getRawString();
    }

    public String getServer() {
        return "lid_me";
    }

    public int getType() {
        return 11;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C18310x6.A14(parcel);
    }
}
