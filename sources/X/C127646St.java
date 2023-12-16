package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.6St  reason: invalid class name and case insensitive filesystem */
public class C127646St extends C1695389r {
    public static final Parcelable.Creator CREATOR = new C163337te();
    public final int A00;
    public final C127586Sn A01;
    public final String A02;

    public boolean equals(Object obj) {
        if (obj instanceof C127646St) {
            C127646St r4 = (C127646St) obj;
            if (!AnonymousClass72K.A00(this.A01, r4.A01) || !AnonymousClass72K.A00(this.A02, r4.A02) || this.A00 != r4.A00) {
                return false;
            }
            return true;
        }
        return false;
    }

    public C127646St(C127586Sn r1, String str, int i) {
        C162177rO.A02(r1);
        this.A01 = r1;
        this.A02 = str;
        this.A00 = i;
    }

    public int hashCode() {
        Object[] A0M = AnonymousClass002.A0M();
        A0M[0] = this.A01;
        return C18310x6.A08(this.A02, A0M, 1);
    }

    public void writeToParcel(Parcel parcel, int i) {
        int A002 = C162417s1.A00(parcel);
        C162417s1.A0A(parcel, this.A01, 1, i, false);
        C162417s1.A0B(parcel, this.A02, 2, false);
        C162417s1.A07(parcel, 3, this.A00);
        C162417s1.A06(parcel, A002);
    }
}
