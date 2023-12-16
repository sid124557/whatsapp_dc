package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.6Sm  reason: invalid class name and case insensitive filesystem */
public final class C127576Sm extends C1695389r {
    public static final Parcelable.Creator CREATOR = new C163307tb();
    public final String A00;
    public final boolean A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C127576Sm) {
                C127576Sm r5 = (C127576Sm) obj;
                if (this.A01 != r5.A01 || !AnonymousClass72K.A00(this.A00, r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public C127576Sm(boolean z, String str) {
        if (z) {
            C162177rO.A02(str);
        }
        this.A01 = z;
        this.A00 = str;
    }

    public int hashCode() {
        Object[] A0M = AnonymousClass002.A0M();
        AnonymousClass001.A1R(A0M, this.A01);
        return C18310x6.A08(this.A00, A0M, 1);
    }

    public void writeToParcel(Parcel parcel, int i) {
        int A002 = C162417s1.A00(parcel);
        C162417s1.A09(parcel, 1, this.A01);
        C1695389r.A04(parcel, this.A00, A002);
    }
}
