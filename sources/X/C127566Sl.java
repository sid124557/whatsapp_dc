package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* renamed from: X.6Sl  reason: invalid class name and case insensitive filesystem */
public final class C127566Sl extends C1695389r {
    public static final Parcelable.Creator CREATOR = new C163697uE();
    public final boolean A00;

    public final boolean equals(Object obj) {
        if (!(obj instanceof C127566Sl) || this.A00 != ((C127566Sl) obj).A00) {
            return false;
        }
        return true;
    }

    public C127566Sl(boolean z) {
        Boolean valueOf = Boolean.valueOf(z);
        C162177rO.A02(valueOf);
        this.A00 = valueOf.booleanValue();
    }

    public final int hashCode() {
        Object[] A0L = AnonymousClass002.A0L();
        AnonymousClass001.A1R(A0L, this.A00);
        return Arrays.hashCode(A0L);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A002 = C162417s1.A00(parcel);
        C162417s1.A09(parcel, 1, this.A00);
        C162417s1.A06(parcel, A002);
    }
}
