package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.5dd  reason: invalid class name and case insensitive filesystem */
public final class C108835dd implements Parcelable {
    public static final C165307wr CREATOR = new C165307wr();
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final boolean A04;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C108835dd) {
                C108835dd r5 = (C108835dd) obj;
                if (!C162457s7.A0P(this.A01, r5.A01) || !C162457s7.A0P(this.A00, r5.A00) || !C162457s7.A0P(this.A03, r5.A03) || this.A04 != r5.A04 || !C162457s7.A0P(this.A02, r5.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C162457s7.A0J(parcel, 0);
        parcel.writeString(this.A01);
        parcel.writeString(this.A00);
        parcel.writeString(this.A03);
        if (this.A04) {
            parcel.writeByte((byte) 1);
        } else {
            parcel.writeByte((byte) 0);
        }
        parcel.writeString(this.A02);
    }

    public int describeContents() {
        return 0;
    }

    public int hashCode() {
        return AnonymousClass0x2.A01(AnonymousClass0x2.A07(this.A03, AnonymousClass0x2.A07(this.A00, C18310x6.A09(this.A01))), this.A04) + this.A02.hashCode();
    }

    public C108835dd(String str, String str2, String str3, String str4, boolean z) {
        C18260x0.A0V(str, str2, str3);
        C162457s7.A0J(str4, 5);
        this.A01 = str;
        this.A00 = str2;
        this.A03 = str3;
        this.A04 = z;
        this.A02 = str4;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("BusinessServiceOffering(categoryName=");
        A0o.append(this.A01);
        A0o.append(", categoryId=");
        A0o.append(this.A00);
        A0o.append(", offeringId=");
        A0o.append(this.A03);
        A0o.append(", isOffered=");
        A0o.append(this.A04);
        A0o.append(", offerName=");
        return C18260x0.A07(this.A02, A0o);
    }
}
