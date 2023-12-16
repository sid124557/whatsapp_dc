package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.6Su  reason: invalid class name and case insensitive filesystem */
public class C127656Su extends C1695389r {
    public static final Parcelable.Creator CREATOR = new C163797uO();
    public final String A00;
    public final String A01;
    public final String A02;

    public boolean equals(Object obj) {
        if (obj instanceof C127656Su) {
            C127656Su r4 = (C127656Su) obj;
            if (!AnonymousClass72K.A00(this.A00, r4.A00) || !AnonymousClass72K.A00(this.A01, r4.A01) || !AnonymousClass72K.A00(this.A02, r4.A02)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public C127656Su(String str, String str2, String str3) {
        C162177rO.A02(str);
        this.A00 = str;
        C162177rO.A02(str2);
        this.A01 = str2;
        this.A02 = str3;
    }

    public int hashCode() {
        Object[] A1X = AnonymousClass0x9.A1X();
        A1X[0] = this.A00;
        A1X[1] = this.A01;
        return C18310x6.A08(this.A02, A1X, 2);
    }

    public void writeToParcel(Parcel parcel, int i) {
        int A002 = C162417s1.A00(parcel);
        boolean A07 = C1695389r.A07(parcel, this.A00);
        C162417s1.A0B(parcel, this.A01, 3, A07);
        C162417s1.A0B(parcel, this.A02, 4, A07);
        C162417s1.A06(parcel, A002);
    }
}
