package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.6Sn  reason: invalid class name and case insensitive filesystem */
public class C127586Sn extends C1695389r {
    public static final Parcelable.Creator CREATOR = new C163367th();
    public final String A00;
    public final String A01;

    public boolean equals(Object obj) {
        if (obj instanceof C127586Sn) {
            C127586Sn r4 = (C127586Sn) obj;
            if (!AnonymousClass72K.A00(this.A00, r4.A00) || !AnonymousClass72K.A00(this.A01, r4.A01)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public C127586Sn(String str, String str2) {
        C162177rO.A03(str, "Account identifier cannot be null");
        String trim = str.trim();
        C162177rO.A07(trim, "Account identifier cannot be empty");
        this.A00 = trim;
        C162177rO.A05(str2);
        this.A01 = str2;
    }

    public int hashCode() {
        Object[] A0M = AnonymousClass002.A0M();
        A0M[0] = this.A00;
        return C18310x6.A08(this.A01, A0M, 1);
    }

    public void writeToParcel(Parcel parcel, int i) {
        int A002 = C162417s1.A00(parcel);
        C162417s1.A0B(parcel, this.A00, 1, false);
        C162417s1.A0B(parcel, this.A01, 2, false);
        C162417s1.A06(parcel, A002);
    }
}
