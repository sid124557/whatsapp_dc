package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.math.BigDecimal;

/* renamed from: X.5dP  reason: invalid class name and case insensitive filesystem */
public final class C108695dP implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C165117wY();
    public final String A00;
    public final BigDecimal A01;
    public final boolean A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C108695dP) {
                C108695dP r5 = (C108695dP) obj;
                if (!C162457s7.A0P(this.A00, r5.A00) || this.A02 != r5.A02 || !C162457s7.A0P(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C162457s7.A0J(parcel, 0);
        parcel.writeString(this.A00);
        parcel.writeByte(this.A02 ? (byte) 1 : 0);
        parcel.writeSerializable(this.A01);
    }

    public int describeContents() {
        return 0;
    }

    public int hashCode() {
        return AnonymousClass0x2.A01(C18270x1.A00(this.A00) * 31, this.A02) + C18310x6.A07(this.A01);
    }

    public C108695dP(String str, BigDecimal bigDecimal, boolean z) {
        this.A00 = str;
        this.A02 = z;
        this.A01 = bigDecimal;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("ProductVariantListingDetails(description=");
        A0o.append(this.A00);
        A0o.append(", multiPrice=");
        A0o.append(this.A02);
        A0o.append(", lowestPrice=");
        return C18260x0.A04(this.A01, A0o);
    }
}
