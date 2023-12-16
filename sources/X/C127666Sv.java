package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.6Sv  reason: invalid class name and case insensitive filesystem */
public class C127666Sv extends C1695389r {
    public static final Parcelable.Creator CREATOR = new C163897uY();
    public final int A00;
    public final short A01;
    public final short A02;

    public boolean equals(Object obj) {
        if (obj instanceof C127666Sv) {
            C127666Sv r4 = (C127666Sv) obj;
            if (this.A00 == r4.A00 && this.A01 == r4.A01 && this.A02 == r4.A02) {
                return true;
            }
            return false;
        }
        return false;
    }

    public C127666Sv(int i, short s, short s2) {
        this.A00 = i;
        this.A01 = s;
        this.A02 = s2;
    }

    public int hashCode() {
        Object[] A1X = AnonymousClass0x9.A1X();
        AnonymousClass000.A1L(A1X, this.A00);
        A1X[1] = Short.valueOf(this.A01);
        return C18310x6.A08(Short.valueOf(this.A02), A1X, 2);
    }

    public void writeToParcel(Parcel parcel, int i) {
        int A002 = C162417s1.A00(parcel);
        C162417s1.A07(parcel, 1, this.A00);
        short s = this.A01;
        parcel.writeInt(262146);
        parcel.writeInt(s);
        short s2 = this.A02;
        parcel.writeInt(262147);
        parcel.writeInt(s2);
        C162417s1.A06(parcel, A002);
    }
}
