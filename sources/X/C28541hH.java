package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.1hH  reason: invalid class name and case insensitive filesystem */
public final class C28541hH extends AnonymousClass38S {
    public static final Parcelable.Creator CREATOR = new AnonymousClass387();
    public final C95804uY A00;

    public C28541hH(C95804uY r2) {
        C162457s7.A0J(r2, 1);
        this.A00 = r2;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C28541hH) && C162457s7.A0P(this.A00, ((C28541hH) obj).A00));
    }

    public void writeToParcel(Parcel parcel, int i) {
        C162457s7.A0J(parcel, 0);
        parcel.writeParcelable(this.A00, i);
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("Suspension(newsletterJid=");
        return C18260x0.A04(this.A00, A0o);
    }
}
