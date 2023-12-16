package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.whatsapp.jid.UserJid;

/* renamed from: X.6kJ  reason: invalid class name and case insensitive filesystem */
public final class C135216kJ extends UserJid implements Parcelable {
    public static final C135216kJ A00 = new C135216kJ();
    public static final Parcelable.Creator CREATOR = new C165507xB();

    public C135216kJ() {
        super("0");
    }

    public int describeContents() {
        return 0;
    }

    public String getServer() {
        return "s.whatsapp.net";
    }

    public int getType() {
        return 7;
    }

    public String getObfuscatedString() {
        return getRawString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        C18310x6.A14(parcel);
    }
}
