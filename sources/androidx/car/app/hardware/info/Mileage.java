package androidx.car.app.hardware.info;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass002;
import androidx.car.app.hardware.common.CarValue;
import java.util.Objects;

public final class Mileage {
    public final CarValue mDistanceDisplayUnit = CarValue.A05;
    public final CarValue mOdometerMeters = CarValue.A03;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Mileage)) {
            return false;
        }
        Mileage mileage = (Mileage) obj;
        CarValue carValue = this.mOdometerMeters;
        Objects.requireNonNull(carValue);
        CarValue carValue2 = mileage.mOdometerMeters;
        Objects.requireNonNull(carValue2);
        return Objects.equals(carValue, carValue2) && Objects.equals(this.mDistanceDisplayUnit, mileage.mDistanceDisplayUnit);
    }

    public int hashCode() {
        Object[] A0M = AnonymousClass002.A0M();
        CarValue carValue = this.mOdometerMeters;
        Objects.requireNonNull(carValue);
        A0M[0] = carValue;
        return AnonymousClass001.A0L(this.mDistanceDisplayUnit, A0M, 1);
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("[ odometer: ");
        CarValue carValue = this.mOdometerMeters;
        Objects.requireNonNull(carValue);
        A0o.append(carValue);
        A0o.append(", distance display unit: ");
        return AnonymousClass000.A0S(this.mDistanceDisplayUnit, A0o);
    }
}
