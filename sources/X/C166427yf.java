package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.7yf  reason: invalid class name and case insensitive filesystem */
public final class C166427yf implements Parcelable {
    public static final C166427yf A0D = new C166427yf((String) null, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, false, false);
    public static final Parcelable.Creator CREATOR = AnonymousClass91V.A00(22);
    public final int A00;
    public final long A01;
    public final long A02;
    public final long A03;
    public final long A04;
    public final long A05;
    public final long A06;
    public final long A07;
    public final long A08;
    public final long A09;
    public final String A0A;
    public final boolean A0B;
    public final boolean A0C;

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C166427yf)) {
            return false;
        }
        C166427yf r7 = (C166427yf) obj;
        return r7.A03 == this.A03 && r7.A00 == this.A00 && r7.A07 == this.A07 && r7.A06 == this.A06 && r7.A08 == this.A08 && r7.A02 == this.A02 && r7.A09 == this.A09 && r7.A01 == this.A01 && r7.A0B == this.A0B && r7.A04 == this.A04 && r7.A05 == this.A05 && r7.A0C == this.A0C;
    }

    public int describeContents() {
        return 0;
    }

    public int hashCode() {
        long j = 1;
        int A002 = AnonymousClass000.A00(AnonymousClass000.A00(AnonymousClass000.A00(AnonymousClass000.A00(AnonymousClass000.A00(AnonymousClass000.A00(AnonymousClass000.A00(AnonymousClass000.A00(AnonymousClass000.A00(AnonymousClass000.A00(AnonymousClass0x2.A02(this.A03), (long) this.A00), this.A07), this.A06), this.A08), this.A02), this.A09), this.A01), C18290x4.A09(this.A0B ? 1 : 0)), this.A04), this.A05);
        if (!this.A0C) {
            j = 0;
        }
        return AnonymousClass0x2.A00(A002, j);
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.A03);
        parcel.writeInt(this.A00);
        parcel.writeLong(this.A07);
        parcel.writeLong(this.A06);
        parcel.writeLong(this.A08);
        parcel.writeLong(this.A02);
        parcel.writeLong(this.A09);
        parcel.writeLong(this.A01);
        parcel.writeInt(this.A0B ? 1 : 0);
        parcel.writeLong(this.A04);
        parcel.writeLong(this.A05);
        parcel.writeInt(this.A0C ? 1 : 0);
        parcel.writeString(this.A0A);
    }

    public C166427yf(Parcel parcel) {
        this.A03 = parcel.readLong();
        this.A00 = parcel.readInt();
        this.A07 = parcel.readLong();
        this.A06 = parcel.readLong();
        this.A08 = parcel.readLong();
        this.A02 = parcel.readLong();
        this.A09 = parcel.readLong();
        this.A01 = parcel.readLong();
        boolean z = false;
        this.A0B = AnonymousClass000.A1U(parcel.readInt(), 1);
        this.A04 = parcel.readLong();
        this.A05 = parcel.readLong();
        this.A0C = parcel.readInt() == 1 ? true : z;
        this.A0A = parcel.readString();
    }

    public C166427yf(String str, int i, long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, boolean z, boolean z2) {
        this.A03 = j;
        this.A00 = i;
        this.A07 = j2;
        this.A06 = j3;
        this.A08 = j4;
        this.A02 = j5;
        this.A09 = j6;
        this.A01 = j7;
        this.A0B = z;
        this.A04 = j8;
        this.A05 = j9;
        this.A0C = z2;
        this.A0A = str;
    }
}
