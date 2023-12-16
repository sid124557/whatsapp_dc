package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.6eV  reason: invalid class name and case insensitive filesystem */
public final class C131986eV extends C165777xc {
    public static final Parcelable.Creator CREATOR = new C165037wQ();
    public final int A00;
    public final AnonymousClass59G A01;
    public final List A02;

    public C131986eV(AnonymousClass59G r2, List list, int i) {
        C162457s7.A0J(r2, 2);
        this.A02 = list;
        this.A01 = r2;
        this.A00 = i;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C131986eV) {
                C131986eV r5 = (C131986eV) obj;
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
        Iterator A0w = AnonymousClass0x7.A0w(parcel, this.A02);
        while (A0w.hasNext()) {
            parcel.writeParcelable((Parcelable) A0w.next(), i);
        }
        C18290x4.A1D(parcel, this.A01);
        parcel.writeInt(this.A00);
    }

    public int describeContents() {
        return 0;
    }

    public int hashCode() {
        return AnonymousClass000.A08(this.A01, C18300x5.A04(this.A02)) + this.A00;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("MediaUriListParams(mediaUriList=");
        A0o.append(this.A02);
        A0o.append(", entryPointSource=");
        A0o.append(this.A01);
        A0o.append(", lwiEntryPoint=");
        return C18260x0.A09(A0o, this.A00);
    }
}
