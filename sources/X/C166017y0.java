package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.7y0  reason: invalid class name and case insensitive filesystem */
public final class C166017y0 implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C165067wT();
    public final C166187yH A00;
    public final String A01;
    public final String A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C166017y0) {
                C166017y0 r5 = (C166017y0) obj;
                if (!C162457s7.A0P(this.A01, r5.A01) || !C162457s7.A0P(this.A02, r5.A02) || !C162457s7.A0P(this.A00, r5.A00)) {
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
        parcel.writeString(this.A02);
        C166187yH r1 = this.A00;
        if (r1 == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        r1.writeToParcel(parcel, i);
    }

    public int describeContents() {
        return 0;
    }

    public int hashCode() {
        return (((C18270x1.A00(this.A01) * 31) + C18270x1.A00(this.A02)) * 31) + C18310x6.A07(this.A00);
    }

    public C166017y0(C166187yH r1, String str, String str2) {
        this.A01 = str;
        this.A02 = str2;
        this.A00 = r1;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("ProductComplianceInfo(countryCodeOrigin=");
        A0o.append(this.A01);
        A0o.append(", importerName=");
        A0o.append(this.A02);
        A0o.append(", importerAddress=");
        return C18260x0.A04(this.A00, A0o);
    }
}
