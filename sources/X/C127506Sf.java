package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* renamed from: X.6Sf  reason: invalid class name and case insensitive filesystem */
public final class C127506Sf extends C1695389r {
    public static final Parcelable.Creator CREATOR = new C163707uF();
    public final long A00;

    public final boolean equals(Object obj) {
        if (!(obj instanceof C127506Sf) || this.A00 != ((C127506Sf) obj).A00) {
            return false;
        }
        return true;
    }

    public C127506Sf(long j) {
        Long valueOf = Long.valueOf(j);
        C162177rO.A02(valueOf);
        this.A00 = valueOf.longValue();
    }

    public final int hashCode() {
        Object[] A0L = AnonymousClass002.A0L();
        C18280x3.A1S(A0L, this.A00);
        return Arrays.hashCode(A0L);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A002 = C162417s1.A00(parcel);
        C162417s1.A08(parcel, 1, this.A00);
        C162417s1.A06(parcel, A002);
    }
}
