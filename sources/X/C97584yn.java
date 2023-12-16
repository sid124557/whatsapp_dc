package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.4yn  reason: invalid class name and case insensitive filesystem */
public final class C97584yn extends C165797xe {
    public static final Parcelable.Creator CREATOR = new C108455d1();
    public final C165807xf A00;
    public final String A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C97584yn) {
                C97584yn r5 = (C97584yn) obj;
                if (!C162457s7.A0P(this.A01, r5.A01) || !C162457s7.A0P(this.A00, r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C162457s7.A0J(parcel, 0);
        parcel.writeString(this.A01);
        parcel.writeParcelable(this.A00, i);
    }

    public int describeContents() {
        return 0;
    }

    public int hashCode() {
        return AnonymousClass002.A02(this.A00, C18310x6.A09(this.A01));
    }

    public C97584yn(C165807xf r1, String str) {
        C18260x0.A0Q(str, r1);
        this.A01 = str;
        this.A00 = r1;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("Rating(id=");
        A0o.append(this.A01);
        A0o.append(", ratingType=");
        return C18260x0.A04(this.A00, A0o);
    }
}
