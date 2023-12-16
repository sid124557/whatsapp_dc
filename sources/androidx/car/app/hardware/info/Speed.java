package androidx.car.app.hardware.info;

import X.AnonymousClass000;
import X.AnonymousClass001;
import androidx.car.app.hardware.common.CarValue;
import java.util.Objects;

public final class Speed {
    public final CarValue mDisplaySpeedMetersPerSecond;
    public final CarValue mRawSpeedMetersPerSecond;
    public final CarValue mSpeedDisplayUnit = CarValue.A05;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Speed)) {
            return false;
        }
        Speed speed = (Speed) obj;
        CarValue carValue = this.mRawSpeedMetersPerSecond;
        Objects.requireNonNull(carValue);
        CarValue carValue2 = speed.mRawSpeedMetersPerSecond;
        Objects.requireNonNull(carValue2);
        if (Objects.equals(carValue, carValue2)) {
            CarValue carValue3 = this.mDisplaySpeedMetersPerSecond;
            Objects.requireNonNull(carValue3);
            CarValue carValue4 = speed.mDisplaySpeedMetersPerSecond;
            Objects.requireNonNull(carValue4);
            return Objects.equals(carValue3, carValue4) && Objects.equals(this.mSpeedDisplayUnit, speed.mSpeedDisplayUnit);
        }
    }

    public int hashCode() {
        Object[] objArr = new Object[3];
        CarValue carValue = this.mRawSpeedMetersPerSecond;
        Objects.requireNonNull(carValue);
        objArr[0] = carValue;
        CarValue carValue2 = this.mDisplaySpeedMetersPerSecond;
        Objects.requireNonNull(carValue2);
        objArr[1] = carValue2;
        return AnonymousClass001.A0L(this.mSpeedDisplayUnit, objArr, 2);
    }

    public Speed() {
        CarValue carValue = CarValue.A03;
        this.mRawSpeedMetersPerSecond = carValue;
        this.mDisplaySpeedMetersPerSecond = carValue;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("[ raw speed: ");
        CarValue carValue = this.mRawSpeedMetersPerSecond;
        Objects.requireNonNull(carValue);
        A0o.append(carValue);
        A0o.append(", display speed: ");
        CarValue carValue2 = this.mDisplaySpeedMetersPerSecond;
        Objects.requireNonNull(carValue2);
        A0o.append(carValue2);
        A0o.append(", speed display unit: ");
        return AnonymousClass000.A0S(this.mSpeedDisplayUnit, A0o);
    }
}
