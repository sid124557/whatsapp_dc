package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* renamed from: X.6Sj  reason: invalid class name and case insensitive filesystem */
public final class C127546Sj extends C1695389r {
    public static final Parcelable.Creator CREATOR = new C164017uk();
    public final List A00;

    public final boolean equals(Object obj) {
        if (obj instanceof C127546Sj) {
            List list = this.A00;
            List list2 = ((C127546Sj) obj).A00;
            if (!list.containsAll(list2) || !list2.containsAll(list)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public C127546Sj(List list) {
        C162177rO.A02(list);
        this.A00 = list;
    }

    public final int hashCode() {
        return C18310x6.A08(AnonymousClass0x9.A15(this.A00), AnonymousClass002.A0L(), 0);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A002 = C162417s1.A00(parcel);
        C162417s1.A0D(parcel, this.A00, 1, false);
        C162417s1.A06(parcel, A002);
    }
}
