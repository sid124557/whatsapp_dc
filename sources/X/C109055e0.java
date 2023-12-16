package X;

import android.location.Location;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.5e0  reason: invalid class name and case insensitive filesystem */
public final class C109055e0 implements Parcelable, C185678u4 {
    public static final C108335cp CREATOR = new C108335cp();
    public double A00 = Double.NaN;
    public int A01 = -1;
    public int A02 = -1;
    public C109065e1 A03;
    public Double A04;
    public Double A05;
    public final double A06;
    public final double A07;
    public final double A08;
    public final C91824lC A09;
    public final String A0A;
    public final boolean A0B;

    public C109055e0(C109065e1 r3, C91824lC r4, String str, double d, double d2, double d3, boolean z) {
        C162457s7.A0J(r4, 6);
        this.A0A = str;
        this.A07 = d;
        this.A08 = d2;
        this.A0B = z;
        this.A06 = d3;
        this.A09 = r4;
        this.A03 = r3;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C109055e0) {
                C109055e0 r7 = (C109055e0) obj;
                if (!(C162457s7.A0P(this.A0A, r7.A0A) && Double.compare(this.A07, r7.A07) == 0 && Double.compare(this.A08, r7.A08) == 0 && this.A0B == r7.A0B && Double.compare(this.A06, r7.A06) == 0 && C162457s7.A0P(this.A09, r7.A09) && C162457s7.A0P(this.A03, r7.A03))) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public void writeToParcel(Parcel parcel, int i) {
        double d;
        C162457s7.A0J(parcel, 0);
        parcel.writeString(this.A0A);
        parcel.writeDouble(this.A07);
        parcel.writeDouble(this.A08);
        parcel.writeByte(this.A0B ? (byte) 1 : 0);
        parcel.writeDouble(this.A06);
        parcel.writeParcelable(this.A09, i);
        parcel.writeParcelable(this.A03, i);
        parcel.writeDouble(this.A00);
        Double d2 = this.A04;
        double d3 = -1.0d;
        if (d2 != null) {
            d = d2.doubleValue();
        } else {
            d = -1.0d;
        }
        parcel.writeDouble(d);
        parcel.writeInt(this.A01);
        parcel.writeInt(this.A02);
        Double d4 = this.A05;
        if (d4 != null) {
            d3 = d4.doubleValue();
        }
        parcel.writeDouble(d3);
    }

    public void AyI(Location location) {
        double d;
        Location location2 = new Location("");
        double d2 = this.A07;
        if (!Double.isNaN(d2)) {
            double d3 = this.A08;
            if (!(Double.isNaN(d3) || d2 == 0.0d || d3 == 0.0d)) {
                location2.setLatitude(d2);
                location2.setLongitude(d3);
                d = (double) location.distanceTo(location2);
                this.A00 = d;
            }
        }
        d = 0.0d;
        this.A00 = d;
    }

    public double B78() {
        return this.A00;
    }

    public Double BBb() {
        return this.A04;
    }

    public Double BBc() {
        return Double.valueOf(this.A06);
    }

    public int describeContents() {
        return 0;
    }

    public int hashCode() {
        return AnonymousClass000.A08(this.A09, AnonymousClass000.A00(AnonymousClass0x2.A01(AnonymousClass000.A00(AnonymousClass000.A00(C18310x6.A09(this.A0A), Double.doubleToLongBits(this.A07)), Double.doubleToLongBits(this.A08)), this.A0B), Double.doubleToLongBits(this.A06))) + AnonymousClass000.A07(this.A03);
    }

    public void Bn2(Double d) {
        this.A04 = d;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("MapBusinessProfile(id=");
        A0o.append(this.A0A);
        A0o.append(", latitude=");
        A0o.append(this.A07);
        A0o.append(", longitude=");
        A0o.append(this.A08);
        A0o.append(", isResponsive=");
        A0o.append(this.A0B);
        A0o.append(", bizPreRankScore=");
        A0o.append(this.A06);
        A0o.append(", categoryInfo=");
        A0o.append(this.A09);
        A0o.append(", minifiedBusinessProfile=");
        return C18260x0.A04(this.A03, A0o);
    }
}
