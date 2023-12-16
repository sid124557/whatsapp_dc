package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.5dV  reason: invalid class name and case insensitive filesystem */
public final class C108755dV implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C108315cn();
    public final C108665dM A00;
    public final C108695dP A01;
    public final List A02;
    public final List A03;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C108755dV) {
                C108755dV r5 = (C108755dV) obj;
                if (!C162457s7.A0P(this.A03, r5.A03) || !C162457s7.A0P(this.A02, r5.A02) || !C162457s7.A0P(this.A01, r5.A01) || !C162457s7.A0P(this.A00, r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C162457s7.A0J(parcel, 0);
        List list = this.A03;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            Iterator A0w = AnonymousClass0x7.A0w(parcel, list);
            while (A0w.hasNext()) {
                parcel.writeParcelable((Parcelable) A0w.next(), i);
            }
        }
        List list2 = this.A02;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            Iterator A0w2 = AnonymousClass0x7.A0w(parcel, list2);
            while (A0w2.hasNext()) {
                ((C165977xw) A0w2.next()).writeToParcel(parcel, i);
            }
        }
        C108695dP r0 = this.A01;
        if (r0 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            r0.writeToParcel(parcel, i);
        }
        C108665dM r02 = this.A00;
        if (r02 == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        r02.writeToParcel(parcel, i);
    }

    public int describeContents() {
        return 0;
    }

    public int hashCode() {
        return (((((AnonymousClass000.A07(this.A03) * 31) + AnonymousClass000.A07(this.A02)) * 31) + AnonymousClass000.A07(this.A01)) * 31) + C18310x6.A07(this.A00);
    }

    public C108755dV(C108665dM r1, C108695dP r2, List list, List list2) {
        this.A03 = list;
        this.A02 = list2;
        this.A01 = r2;
        this.A00 = r1;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("ProductVariantInfo(types=");
        A0o.append(this.A03);
        A0o.append(", properties=");
        A0o.append(this.A02);
        A0o.append(", listingDetails=");
        A0o.append(this.A01);
        A0o.append(", availability=");
        return C18260x0.A04(this.A00, A0o);
    }
}
