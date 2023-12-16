package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.1fQ  reason: invalid class name and case insensitive filesystem */
public final class C28061fQ extends C135136kB implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C630437s();
    public final int A00;
    public final C27981fH A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C28061fQ(C27981fH r2, int i) {
        super(r2, i);
        C162457s7.A0J(r2, 1);
        this.A01 = r2;
        this.A00 = i;
        if (i != 99) {
            throw AnonymousClass24P.A00("device_id should be 99 for hosted device");
        }
    }

    public void writeToParcel(Parcel parcel, int i) {
        C162457s7.A0J(parcel, 0);
        this.A01.writeToParcel(parcel, i);
        parcel.writeInt(this.A00);
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
        return AnonymousClass000.A0X("hosted.lid", A0o);
    }

    public String getServer() {
        return "hosted.lid";
    }

    public int getType() {
        return 25;
    }
}
