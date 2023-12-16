package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.7y1  reason: invalid class name and case insensitive filesystem */
public final class C166027y1 implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C165107wX();
    public final String A00;
    public final List A01;
    public final boolean A02;

    public C166027y1(String str, List list, boolean z) {
        C162457s7.A0J(str, 2);
        this.A02 = z;
        this.A00 = str;
        this.A01 = list;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C166027y1) {
                C166027y1 r5 = (C166027y1) obj;
                if (this.A02 != r5.A02 || !C162457s7.A0P(this.A00, r5.A00) || !C162457s7.A0P(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C162457s7.A0J(parcel, 0);
        parcel.writeByte(this.A02 ? (byte) 1 : 0);
        parcel.writeString(this.A00);
        List list = this.A01;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        Iterator A0w = AnonymousClass0x7.A0w(parcel, list);
        while (A0w.hasNext()) {
            ((C165977xw) A0w.next()).writeToParcel(parcel, i);
        }
    }

    public int describeContents() {
        return 0;
    }

    public int hashCode() {
        return AnonymousClass0x2.A07(this.A00, AnonymousClass0x9.A04(this.A02)) + AnonymousClass000.A07(this.A01);
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("ProductVariantAvailabilityListing(isAvailable=");
        A0o.append(this.A02);
        A0o.append(", productId=");
        A0o.append(this.A00);
        A0o.append(", options=");
        return C18260x0.A04(this.A01, A0o);
    }
}
