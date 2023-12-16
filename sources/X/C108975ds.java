package X;

import android.location.Location;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.maps.model.LatLng;

/* renamed from: X.5ds  reason: invalid class name and case insensitive filesystem */
public final class C108975ds implements Parcelable {
    public static final Parcelable.Creator CREATOR = new AnonymousClass91V(14);
    public final double A00;
    public final double A01;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C108975ds)) {
            return false;
        }
        C108975ds r7 = (C108975ds) obj;
        return Math.abs(this.A00 - r7.A00) < 0.002d && Math.abs(this.A01 - r7.A01) < 2.0E-4d;
    }

    public static C108975ds A00(double d, double d2) {
        return new C108975ds(d, d2);
    }

    public static C108975ds A02(LatLng latLng) {
        return new C108975ds(latLng.A00, latLng.A01);
    }

    public static C108975ds A03(C109065e1 r5) {
        Double d = r5.A0B;
        C162457s7.A0C(d);
        double doubleValue = d.doubleValue();
        Double d2 = r5.A0C;
        C162457s7.A0C(d2);
        return new C108975ds(doubleValue, d2.doubleValue());
    }

    public static LatLng A04(C108975ds r5) {
        return new LatLng(r5.A00, r5.A01);
    }

    public double A05(C108975ds r9) {
        double d = this.A00;
        double d2 = r9.A00;
        return Math.sqrt(Math.pow(d - d2, 2.0d) + Math.pow((this.A01 - r9.A01) * Math.cos(Math.toRadians(d2)), 2.0d)) * 110250.0d;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeDouble(this.A00);
        parcel.writeDouble(this.A01);
    }

    public C108975ds(Parcel parcel) {
        this.A00 = parcel.readDouble();
        this.A01 = parcel.readDouble();
    }

    public static C108975ds A01(Location location) {
        return new C108975ds(location.getLatitude(), location.getLongitude());
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append(C108975ds.class.getSimpleName());
        A0o.append("{latitude=");
        A0o.append(this.A00);
        A0o.append(", longitude=");
        A0o.append(this.A01);
        return AnonymousClass000.A0X("}", A0o);
    }

    public int hashCode() {
        return (int) (((527.0d + this.A00) * 31.0d) + this.A01);
    }

    public C108975ds(double d, double d2) {
        this.A00 = d;
        this.A01 = d2;
    }
}
