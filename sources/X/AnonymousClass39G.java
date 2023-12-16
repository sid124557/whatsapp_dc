package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.39G  reason: invalid class name */
public class AnonymousClass39G implements Parcelable {
    public static final Parcelable.Creator CREATOR = AnonymousClass4IW.A00(15);
    public final int A00;
    public final long A01;
    public final String A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            AnonymousClass39G r7 = (AnonymousClass39G) obj;
            if (!(this.A01 == r7.A01 && this.A00 == r7.A00 && AnonymousClass75J.A00(this.A02, r7.A02))) {
                return false;
            }
        }
        return true;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.A01);
        parcel.writeInt(this.A00);
        parcel.writeString(this.A02);
    }

    public AnonymousClass39G(long j, int i, String str) {
        this.A01 = j;
        this.A00 = i;
        this.A02 = str;
    }

    public int describeContents() {
        return 0;
    }

    public int hashCode() {
        Object[] A1X = AnonymousClass0x9.A1X();
        C18280x3.A1S(A1X, this.A01);
        AnonymousClass000.A1M(A1X, this.A00);
        return C18310x6.A08(this.A02, A1X, 2);
    }

    public AnonymousClass39G(Parcel parcel) {
        long readLong = parcel.readLong();
        C626936e.A06(Long.valueOf(readLong));
        this.A01 = readLong;
        int readInt = parcel.readInt();
        C626936e.A06(Integer.valueOf(readInt));
        this.A00 = readInt;
        this.A02 = parcel.readString();
    }
}
