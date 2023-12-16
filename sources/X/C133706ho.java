package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.6ho  reason: invalid class name and case insensitive filesystem */
public final class C133706ho extends C166587yw {
    public static final Parcelable.Creator CREATOR = AnonymousClass91V.A00(104);
    public int A00;
    public String A01;
    public final String A02;
    public final boolean A03;
    public final boolean A04;

    public int describeContents() {
        return 0;
    }

    public C133706ho(Parcel parcel) {
        A0C(parcel);
        this.A01 = parcel.readString();
        boolean z = false;
        this.A03 = AnonymousClass000.A1U(parcel.readByte(), 1);
        this.A04 = parcel.readByte() == 1 ? true : z;
        this.A02 = parcel.readString();
        this.A00 = parcel.readInt();
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("[ MERCHANT: ");
        A0o.append(super.toString());
        A0o.append(" merchantId: ");
        A0o.append(this.A01);
        A0o.append(" p2mEligible: ");
        A0o.append(this.A03);
        A0o.append(" p2pEligible: ");
        A0o.append(this.A04);
        A0o.append(" logoUri: ");
        A0o.append(this.A02);
        A0o.append("maxInstallmentCount: ");
        A0o.append(this.A00);
        return AnonymousClass000.A0X(" ]", A0o);
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.A01);
        parcel.writeByte(this.A03 ? (byte) 1 : 0);
        parcel.writeByte(this.A04 ? (byte) 1 : 0);
        parcel.writeString(this.A02);
        parcel.writeInt(this.A00);
    }

    public C133706ho(C161357pU r1, C133796hx r2, String str, String str2, String str3, String str4, int i, boolean z, boolean z2) {
        this.A01 = str3;
        this.A03 = z;
        this.A04 = z2;
        this.A02 = str2;
        this.A00 = i;
        C626936e.A06(r1);
        this.A07 = r1;
        this.A0A = str;
        this.A08 = r2;
        A0D(str4);
    }
}
