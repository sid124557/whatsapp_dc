package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.7yY  reason: invalid class name and case insensitive filesystem */
public class C166357yY implements Parcelable {
    public static final Parcelable.Creator CREATOR = AnonymousClass91V.A00(81);
    public final String A00;
    public final String A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C166357yY r5 = (C166357yY) obj;
            if (!this.A00.equals(r5.A00) || !this.A01.equals(r5.A01)) {
                return false;
            }
        }
        return true;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A00);
        parcel.writeString(this.A01);
    }

    public C166357yY(String str, String str2) {
        this.A00 = str;
        this.A01 = str2;
    }

    public int hashCode() {
        Object[] A0M = AnonymousClass002.A0M();
        A0M[0] = this.A00;
        return C18310x6.A08(this.A01, A0M, 1);
    }

    public C166357yY(Parcel parcel) {
        this.A00 = parcel.readString();
        this.A01 = parcel.readString();
    }
}
