package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.6eT  reason: invalid class name and case insensitive filesystem */
public final class C131966eT extends C165777xc {
    public static final Parcelable.Creator CREATOR = new C165017wO();
    public final int A00;
    public final AnonymousClass59G A01;

    public C131966eT(AnonymousClass59G r2, int i) {
        C162457s7.A0J(r2, 1);
        this.A01 = r2;
        this.A00 = i;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C131966eT) {
                C131966eT r5 = (C131966eT) obj;
                if (!(this.A01 == r5.A01 && this.A00 == r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C162457s7.A0J(parcel, 0);
        C18290x4.A1D(parcel, this.A01);
        parcel.writeInt(this.A00);
    }

    public int describeContents() {
        return 0;
    }

    public int hashCode() {
        return C18300x5.A04(this.A01) + this.A00;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("AdHubCentralEntryParams(entryPointSource=");
        A0o.append(this.A01);
        A0o.append(", lwiEntryPoint=");
        return C18260x0.A09(A0o, this.A00);
    }
}
