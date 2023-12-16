package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* renamed from: X.5dr  reason: invalid class name and case insensitive filesystem */
public final class C108965dr implements Parcelable {
    public static final C108345cq CREATOR = new C108345cq();
    public final double A00;
    public final float A01;
    public final int A02;
    public final ArrayList A03;
    public final ArrayList A04;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C108965dr) {
                C108965dr r7 = (C108965dr) obj;
                if (!(Double.compare(this.A00, r7.A00) == 0 && this.A02 == r7.A02 && Float.compare(this.A01, r7.A01) == 0 && C162457s7.A0P(this.A03, r7.A03) && C162457s7.A0P(this.A04, r7.A04))) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C162457s7.A0J(parcel, 0);
        parcel.writeDouble(this.A00);
        parcel.writeInt(this.A02);
        parcel.writeFloat(this.A01);
        parcel.writeList(this.A03);
        parcel.writeList(this.A04);
    }

    public int describeContents() {
        return 0;
    }

    public int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(this.A00);
        return AnonymousClass002.A02(this.A04, AnonymousClass000.A08(this.A03, ((((((int) (doubleToLongBits ^ (doubleToLongBits >>> 32))) * 31) + this.A02) * 31) + Float.floatToIntBits(this.A01)) * 31));
    }

    public C108965dr(ArrayList arrayList, ArrayList arrayList2, double d, float f, int i) {
        this.A00 = d;
        this.A02 = i;
        this.A01 = f;
        this.A03 = arrayList;
        this.A04 = arrayList2;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("MapViewConfig(maxBusinessDistanceInMeter=");
        A0o.append(this.A00);
        A0o.append(", maxNoOfBusinesses=");
        A0o.append(this.A02);
        A0o.append(", defaultZoomLevel=");
        A0o.append(this.A01);
        A0o.append(", layeredZoomLevels=");
        A0o.append(this.A03);
        A0o.append(", mapViewSegments=");
        return C18260x0.A04(this.A04, A0o);
    }

    public C108965dr() {
        this(AnonymousClass001.A0s(), AnonymousClass001.A0s(), 0.0d, 0.0f, 0);
    }
}
