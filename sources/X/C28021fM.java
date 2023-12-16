package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.UserJid;

/* renamed from: X.1fM  reason: invalid class name and case insensitive filesystem */
public final class C28021fM extends DeviceJid implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C630337r();
    public final int A00;
    public final UserJid A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C28021fM(UserJid userJid, int i) {
        super(userJid, i);
        C162457s7.A0J(userJid, 1);
        this.A01 = userJid;
        this.A00 = i;
        if (i != 99) {
            throw AnonymousClass24P.A00(AnonymousClass000.A0Y("device_id should be 99 for hosted device, is ", AnonymousClass001.A0o(), i));
        }
    }

    public void writeToParcel(Parcel parcel, int i) {
        C162457s7.A0J(parcel, 0);
        parcel.writeParcelable(this.A01, i);
        parcel.writeInt(this.A00);
    }

    public int describeContents() {
        return 0;
    }

    public int getDevice() {
        return this.A00;
    }

    public String getRawString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append(this.user);
        A0o.append(':');
        A0o.append(this.A00);
        A0o.append('@');
        return AnonymousClass000.A0X("hosted", A0o);
    }

    public String getServer() {
        return "hosted";
    }

    public int getType() {
        return 24;
    }
}
