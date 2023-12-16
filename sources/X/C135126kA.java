package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.6kA  reason: invalid class name and case insensitive filesystem */
public final class C135126kA extends C135186kG implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C165437x4();
    public final int A00;
    public final C135146kC A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C135126kA(C135146kC r3, int i) {
        super(r3, i);
        C162457s7.A0J(r3, 1);
        this.A01 = r3;
        this.A00 = i;
        throw new AnonymousClass24P("Invalid JID");
    }

    public void writeToParcel(Parcel parcel, int i) {
        C162457s7.A0J(parcel, 0);
        this.A01.writeToParcel(parcel, i);
        parcel.writeInt(this.A00);
    }

    public int describeContents() {
        return 0;
    }

    public int getDevice() {
        return this.A00;
    }

    public String getRawString() {
        String str = this.user;
        int i = this.A00;
        StringBuilder A0l = AnonymousClass000.A0l(str);
        A0l.append(':');
        A0l.append(i);
        return AnonymousClass0x2.A0e("interop", A0l, '@');
    }

    public String getServer() {
        return "interop";
    }

    public int getType() {
        return 23;
    }
}
