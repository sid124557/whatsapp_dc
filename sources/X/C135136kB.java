package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.whatsapp.jid.UserJid;

/* renamed from: X.6kB  reason: invalid class name and case insensitive filesystem */
public class C135136kB extends C135186kG implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C165457x6();
    public final int A00;
    public final UserJid A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C135136kB(UserJid userJid, int i) {
        super(userJid, i);
        C162457s7.A0J(userJid, 1);
        this.A01 = userJid;
        this.A00 = i;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C162457s7.A0J(parcel, 0);
        parcel.writeParcelable(this.A01, i);
        parcel.writeInt(this.A00);
    }

    public int describeContents() {
        return 0;
    }

    public int getAgent() {
        return 1;
    }

    public int getDevice() {
        return this.A00;
    }

    public String getServer() {
        return "lid";
    }

    public int getType() {
        return 19;
    }
}
