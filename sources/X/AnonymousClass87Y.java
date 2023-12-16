package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.87Y  reason: invalid class name */
public final class AnonymousClass87Y implements C187368x6 {
    public static final Parcelable.Creator CREATOR = AnonymousClass91V.A00(38);
    public final int A00;
    public final String A01;

    public /* synthetic */ byte[] BEa() {
        return null;
    }

    public /* synthetic */ C166527yp BEb() {
        return null;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A01);
        parcel.writeInt(this.A00);
    }

    public AnonymousClass87Y(int i, String str) {
        this.A00 = i;
        this.A01 = str;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("Ait(controlCode=");
        A0o.append(this.A00);
        A0o.append(",url=");
        A0o.append(this.A01);
        return AnonymousClass000.A0e(A0o);
    }
}
