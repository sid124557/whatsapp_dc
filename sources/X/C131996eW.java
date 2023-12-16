package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.6eW  reason: invalid class name and case insensitive filesystem */
public final class C131996eW extends C165777xc {
    public static final Parcelable.Creator CREATOR = new C165047wR();
    public final int A00;
    public final AnonymousClass59G A01;
    public final C109015dw A02;

    public C131996eW(AnonymousClass59G r2, C109015dw r3, int i) {
        C162457s7.A0J(r2, 2);
        this.A02 = r3;
        this.A01 = r2;
        this.A00 = i;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C131996eW) {
                C131996eW r5 = (C131996eW) obj;
                if (!(C162457s7.A0P(this.A02, r5.A02) && this.A01 == r5.A01 && this.A00 == r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C162457s7.A0J(parcel, 0);
        parcel.writeParcelable(this.A02, i);
        C18290x4.A1D(parcel, this.A01);
        parcel.writeInt(this.A00);
    }

    public int describeContents() {
        return 0;
    }

    public int hashCode() {
        return AnonymousClass000.A08(this.A01, AnonymousClass000.A07(this.A02) * 31) + this.A00;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("PromoteCatalogParams(product=");
        A0o.append(this.A02);
        A0o.append(", entryPointSource=");
        A0o.append(this.A01);
        A0o.append(", lwiEntryPoint=");
        return C18260x0.A09(A0o, this.A00);
    }
}
