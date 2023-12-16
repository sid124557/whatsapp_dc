package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* renamed from: X.6T6  reason: invalid class name */
public class AnonymousClass6T6 extends C1695389r {
    public static final Parcelable.Creator CREATOR = new C163927ub();
    public final boolean A00;

    public boolean A00() {
        return this.A00;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof AnonymousClass6T6) || this.A00 != ((AnonymousClass6T6) obj).A00) {
            return false;
        }
        return true;
    }

    public AnonymousClass6T6(boolean z) {
        this.A00 = z;
    }

    public int hashCode() {
        Object[] A0L = AnonymousClass002.A0L();
        AnonymousClass001.A1R(A0L, this.A00);
        return Arrays.hashCode(A0L);
    }

    public void writeToParcel(Parcel parcel, int i) {
        int A002 = C162417s1.A00(parcel);
        C162417s1.A09(parcel, 1, this.A00);
        C162417s1.A06(parcel, A002);
    }
}
