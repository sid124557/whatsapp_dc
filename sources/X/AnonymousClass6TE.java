package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.6TE  reason: invalid class name */
public final class AnonymousClass6TE extends C1695389r {
    public static final Parcelable.Creator CREATOR = new C164847w7();
    public final int A00;
    public final String A01;
    public final String A02;
    public final boolean A03;

    public final boolean equals(Object obj) {
        if (!(obj instanceof AnonymousClass6TE)) {
            return false;
        }
        return ((AnonymousClass6TE) obj).A01.equals(this.A01);
    }

    public final int hashCode() {
        return this.A01.hashCode();
    }

    public final String toString() {
        String str = this.A02;
        String str2 = this.A01;
        int i = this.A00;
        boolean z = this.A03;
        StringBuilder A0Y = AnonymousClass6CA.A0Y(AnonymousClass6C7.A06(str) + 45 + AnonymousClass6C7.A06(str2));
        A0Y.append("Node{");
        A0Y.append(str);
        A0Y.append(", id=");
        A0Y.append(str2);
        A0Y.append(", hops=");
        A0Y.append(i);
        A0Y.append(", isNearby=");
        A0Y.append(z);
        return AnonymousClass000.A0g(A0Y);
    }

    public AnonymousClass6TE(String str, String str2, int i, boolean z) {
        this.A01 = str;
        this.A02 = str2;
        this.A00 = i;
        this.A03 = z;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A002 = C162417s1.A00(parcel);
        C162417s1.A0B(parcel, this.A02, 3, C1695389r.A07(parcel, this.A01));
        C162417s1.A07(parcel, 4, this.A00);
        C162417s1.A09(parcel, 5, this.A03);
        C162417s1.A06(parcel, A002);
    }
}
