package androidx.car.app.model;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass002;

public final class CarLocation {
    public final double mLat = 0.0d;
    public final double mLng = 0.0d;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CarLocation)) {
            return false;
        }
        CarLocation carLocation = (CarLocation) obj;
        return Double.doubleToLongBits(this.mLat) == Double.doubleToLongBits(carLocation.mLat) && Double.doubleToLongBits(this.mLng) == Double.doubleToLongBits(carLocation.mLng);
    }

    public int hashCode() {
        Object[] A0M = AnonymousClass002.A0M();
        A0M[0] = Double.valueOf(this.mLat);
        return AnonymousClass001.A0L(Double.valueOf(this.mLng), A0M, 1);
    }

    public String toString() {
        StringBuilder A0p = AnonymousClass001.A0p();
        A0p.append(this.mLat);
        AnonymousClass001.A1M(A0p);
        A0p.append(this.mLng);
        return AnonymousClass000.A0f(A0p);
    }
}
