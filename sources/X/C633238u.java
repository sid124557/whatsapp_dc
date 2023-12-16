package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* renamed from: X.38u  reason: invalid class name and case insensitive filesystem */
public final class C633238u implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C629237g();
    public int A00;
    public String A01;
    public String A02;
    public final List A03;
    public final boolean A04;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C633238u) {
                C633238u r5 = (C633238u) obj;
                if (this.A00 != r5.A00 || this.A04 != r5.A04 || !C162457s7.A0P(this.A03, r5.A03) || !C162457s7.A0P(this.A02, r5.A02) || !C162457s7.A0P(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C162457s7.A0J(parcel, 0);
        parcel.writeInt(this.A00);
        parcel.writeByte(this.A04 ? (byte) 1 : 0);
        parcel.writeStringList(this.A03);
        parcel.writeString(this.A02);
        parcel.writeString(this.A01);
    }

    public int hashCode() {
        return ((((AnonymousClass0x2.A01(this.A00 * 31, this.A04) + AnonymousClass000.A07(this.A03)) * 31) + C18270x1.A00(this.A02)) * 31) + AnonymousClass0x7.A07(this.A01);
    }

    public C633238u(String str, String str2, List list, int i, boolean z) {
        this.A00 = i;
        this.A04 = z;
        this.A03 = list;
        this.A02 = str;
        this.A01 = str2;
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("ProductStatus(status=");
        A0o.append(this.A00);
        A0o.append(", appealable=");
        A0o.append(this.A04);
        A0o.append(", reasonCodes=");
        A0o.append(this.A03);
        A0o.append(", rejectReason=");
        A0o.append(this.A02);
        A0o.append(", commerceUrl=");
        return C18260x0.A07(this.A01, A0o);
    }
}
