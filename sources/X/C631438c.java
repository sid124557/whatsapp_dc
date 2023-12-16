package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.38c  reason: invalid class name and case insensitive filesystem */
public final class C631438c implements Parcelable {
    public static final Parcelable.Creator CREATOR = new AnonymousClass38G();
    public final boolean A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C631438c) && this.A00 == ((C631438c) obj).A00);
    }

    public void writeToParcel(Parcel parcel, int i) {
        C162457s7.A0J(parcel, 0);
        parcel.writeByte(this.A00 ? (byte) 1 : 0);
    }

    public int hashCode() {
        if (this.A00) {
            return 1231;
        }
        return 1237;
    }

    public C631438c(boolean z) {
        this.A00 = z;
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("AvatarGetConfigEntity(hasAvatar=");
        return C18260x0.A0A(A0o, this.A00);
    }
}
