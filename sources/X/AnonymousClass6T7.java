package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.6T7  reason: invalid class name */
public class AnonymousClass6T7 extends C1695389r {
    public static final Parcelable.Creator CREATOR = new C163497tu();
    public final int A00;
    public final String A01;

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof AnonymousClass6T7) {
                AnonymousClass6T7 r5 = (AnonymousClass6T7) obj;
                if (r5.A00 != this.A00 || !AnonymousClass72K.A00(r5.A01, this.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.A00;
    }

    public final String toString() {
        return AnonymousClass000.A0V(":", this.A01, C18320x8.A0j(this.A00));
    }

    public AnonymousClass6T7(int i, String str) {
        this.A00 = i;
        this.A01 = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A002 = C162417s1.A00(parcel);
        C162417s1.A07(parcel, 1, this.A00);
        C1695389r.A04(parcel, this.A01, A002);
    }
}
