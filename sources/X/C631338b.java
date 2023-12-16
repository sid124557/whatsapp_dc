package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.38b  reason: invalid class name and case insensitive filesystem */
public final class C631338b implements Parcelable {
    public static final Parcelable.Creator CREATOR = new AnonymousClass38D();
    public final boolean A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C631338b) && this.A00 == ((C631338b) obj).A00);
    }

    public void writeToParcel(Parcel parcel, int i) {
        C162457s7.A0J(parcel, 0);
        parcel.writeInt(this.A00 ? 1 : 0);
    }

    public int hashCode() {
        if (this.A00) {
            return 1231;
        }
        return 1237;
    }

    public C631338b(boolean z) {
        this.A00 = z;
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("MerchantAccountSettings(buyerInitiatedPaymentEnabled=");
        return C18260x0.A0A(A0o, this.A00);
    }
}
