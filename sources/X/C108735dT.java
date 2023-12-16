package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.5dT  reason: invalid class name and case insensitive filesystem */
public final class C108735dT implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C108485d4();
    public final C108895dj A00;
    public final C108895dj A01;
    public final C108895dj A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C108735dT) {
                C108735dT r5 = (C108735dT) obj;
                if (!C162457s7.A0P(this.A00, r5.A00) || !C162457s7.A0P(this.A01, r5.A01) || !C162457s7.A0P(this.A02, r5.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C162457s7.A0J(parcel, 0);
        parcel.writeParcelable(this.A00, i);
        parcel.writeParcelable(this.A01, i);
        parcel.writeParcelable(this.A02, i);
    }

    public int describeContents() {
        return 0;
    }

    public int hashCode() {
        return AnonymousClass002.A02(this.A02, AnonymousClass000.A08(this.A01, C18300x5.A04(this.A00)));
    }

    public C108735dT(C108895dj r1, C108895dj r2, C108895dj r3) {
        C18260x0.A0V(r1, r2, r3);
        this.A00 = r1;
        this.A01 = r2;
        this.A02 = r3;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("Fb4aUserEntityForNativeAuth(accessToken=");
        A0o.append(this.A00);
        A0o.append(", fullName=");
        A0o.append(this.A01);
        A0o.append(", profilePictureUrl=");
        return C18260x0.A04(this.A02, A0o);
    }
}
