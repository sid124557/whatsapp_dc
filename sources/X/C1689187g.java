package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* renamed from: X.87g  reason: invalid class name and case insensitive filesystem */
public final class C1689187g implements C187368x6 {
    public static final Parcelable.Creator CREATOR = AnonymousClass91V.A00(40);
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final String A05;
    public final String A06;
    public final byte[] A07;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || C1689187g.class != obj.getClass()) {
                return false;
            }
            C1689187g r5 = (C1689187g) obj;
            if (!(this.A03 == r5.A03 && this.A06.equals(r5.A06) && this.A05.equals(r5.A05) && this.A04 == r5.A04 && this.A02 == r5.A02 && this.A01 == r5.A01 && this.A00 == r5.A00 && Arrays.equals(this.A07, r5.A07))) {
                return false;
            }
        }
        return true;
    }

    public /* synthetic */ byte[] BEa() {
        return null;
    }

    public /* synthetic */ C166527yp BEb() {
        return null;
    }

    public int describeContents() {
        return 0;
    }

    public int hashCode() {
        int A072 = AnonymousClass0x2.A07(this.A06, (527 + this.A03) * 31);
        return AnonymousClass6CA.A09(this.A07, (((((((AnonymousClass0x2.A07(this.A05, A072) + this.A04) * 31) + this.A02) * 31) + this.A01) * 31) + this.A00) * 31);
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.A03);
        parcel.writeString(this.A06);
        parcel.writeString(this.A05);
        parcel.writeInt(this.A04);
        parcel.writeInt(this.A02);
        parcel.writeInt(this.A01);
        parcel.writeInt(this.A00);
        parcel.writeByteArray(this.A07);
    }

    public C1689187g(Parcel parcel) {
        this.A03 = parcel.readInt();
        this.A06 = parcel.readString();
        this.A05 = parcel.readString();
        this.A04 = parcel.readInt();
        this.A02 = parcel.readInt();
        this.A01 = parcel.readInt();
        this.A00 = parcel.readInt();
        this.A07 = parcel.createByteArray();
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("Picture: mimeType=");
        AnonymousClass6C8.A1E(A0o, this.A06);
        return AnonymousClass000.A0X(this.A05, A0o);
    }

    public C1689187g(String str, String str2, byte[] bArr, int i, int i2, int i3, int i4, int i5) {
        this.A03 = i;
        this.A06 = str;
        this.A05 = str2;
        this.A04 = i2;
        this.A02 = i3;
        this.A01 = i4;
        this.A00 = i5;
        this.A07 = bArr;
    }
}
