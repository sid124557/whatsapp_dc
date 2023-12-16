package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.6Sb  reason: invalid class name and case insensitive filesystem */
public class C127466Sb extends C1695389r {
    public static final Parcelable.Creator CREATOR = new C164047un();
    public final String A00;

    public boolean equals(Object obj) {
        if (!(obj instanceof C127466Sb)) {
            return false;
        }
        return this.A00.equals(((C127466Sb) obj).A00);
    }

    public C127466Sb(String str) {
        C162177rO.A02(str);
        this.A00 = str;
    }

    public int hashCode() {
        return C18310x6.A08(this.A00, AnonymousClass002.A0L(), 0);
    }

    public void writeToParcel(Parcel parcel, int i) {
        C1695389r.A04(parcel, this.A00, C162417s1.A00(parcel));
    }
}
