package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.6TC  reason: invalid class name */
public class AnonymousClass6TC extends C1695389r {
    public static final Parcelable.Creator CREATOR = new C163907uZ();
    public final AnonymousClass6T6 A00;
    public final C127496Se A01;
    public final C127606Sp A02;
    public final C127616Sq A03;

    public int hashCode() {
        Object[] objArr = new Object[4];
        objArr[0] = this.A01;
        objArr[1] = this.A02;
        objArr[2] = this.A00;
        return C18310x6.A08(this.A03, objArr, 3);
    }

    public AnonymousClass6T6 A00() {
        return this.A00;
    }

    public boolean equals(Object obj) {
        if (obj instanceof AnonymousClass6TC) {
            AnonymousClass6TC r4 = (AnonymousClass6TC) obj;
            if (!AnonymousClass72K.A00(this.A01, r4.A01) || !AnonymousClass72K.A00(this.A02, r4.A02) || !AnonymousClass72K.A00(this.A00, r4.A00) || !AnonymousClass72K.A00(this.A03, r4.A03)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public AnonymousClass6TC(AnonymousClass6T6 r1, C127496Se r2, C127606Sp r3, C127616Sq r4) {
        this.A01 = r2;
        this.A02 = r3;
        this.A00 = r1;
        this.A03 = r4;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int A002 = C162417s1.A00(parcel);
        C162417s1.A0A(parcel, this.A01, 1, i, false);
        C162417s1.A0A(parcel, this.A02, 2, i, false);
        C162417s1.A0A(parcel, this.A00, 3, i, false);
        C162417s1.A0A(parcel, this.A03, 4, i, false);
        C162417s1.A06(parcel, A002);
    }
}
