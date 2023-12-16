package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* renamed from: X.6Sc  reason: invalid class name and case insensitive filesystem */
public class C127476Sc extends C1695389r {
    public static final Parcelable.Creator CREATOR = new C163727uH();
    public final boolean A00;

    public boolean equals(Object obj) {
        if (!(obj instanceof C127476Sc) || this.A00 != ((C127476Sc) obj).A00) {
            return false;
        }
        return true;
    }

    public C127476Sc(boolean z) {
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
