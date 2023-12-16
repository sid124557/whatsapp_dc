package androidx.car.app.hardware.info;

import X.AnonymousClass000;
import X.AnonymousClass001;
import androidx.car.app.hardware.common.CarValue;
import java.util.Objects;

public final class EnergyLevel {
    public final CarValue mBatteryPercent;
    public final CarValue mDistanceDisplayUnit;
    public final CarValue mEnergyIsLow = CarValue.A02;
    public final CarValue mFuelPercent;
    public final CarValue mFuelVolumeDisplayUnit;
    public final CarValue mRangeRemainingMeters;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EnergyLevel)) {
            return false;
        }
        EnergyLevel energyLevel = (EnergyLevel) obj;
        if (Objects.equals(this.mBatteryPercent, energyLevel.mBatteryPercent) && Objects.equals(this.mFuelPercent, energyLevel.mFuelPercent) && Objects.equals(this.mEnergyIsLow, energyLevel.mEnergyIsLow)) {
            CarValue carValue = this.mRangeRemainingMeters;
            Objects.requireNonNull(carValue);
            CarValue carValue2 = energyLevel.mRangeRemainingMeters;
            Objects.requireNonNull(carValue2);
            return Objects.equals(carValue, carValue2) && Objects.equals(this.mDistanceDisplayUnit, energyLevel.mDistanceDisplayUnit) && Objects.equals(this.mFuelVolumeDisplayUnit, energyLevel.mFuelVolumeDisplayUnit);
        }
    }

    public int hashCode() {
        Object[] objArr = new Object[6];
        objArr[0] = this.mBatteryPercent;
        objArr[1] = this.mFuelPercent;
        objArr[2] = this.mEnergyIsLow;
        CarValue carValue = this.mRangeRemainingMeters;
        Objects.requireNonNull(carValue);
        objArr[3] = carValue;
        objArr[4] = this.mDistanceDisplayUnit;
        return AnonymousClass001.A0L(this.mFuelVolumeDisplayUnit, objArr, 5);
    }

    public EnergyLevel() {
        CarValue carValue = CarValue.A03;
        this.mBatteryPercent = carValue;
        this.mFuelPercent = carValue;
        this.mRangeRemainingMeters = carValue;
        CarValue carValue2 = CarValue.A05;
        this.mDistanceDisplayUnit = carValue2;
        this.mFuelVolumeDisplayUnit = carValue2;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("[ battery percent: ");
        A0o.append(this.mBatteryPercent);
        A0o.append(", fuel percent: ");
        A0o.append(this.mFuelPercent);
        A0o.append(", energyIsLow: ");
        A0o.append(this.mEnergyIsLow);
        A0o.append(", range remaining: ");
        CarValue carValue = this.mRangeRemainingMeters;
        Objects.requireNonNull(carValue);
        A0o.append(carValue);
        A0o.append(", distance display unit: ");
        A0o.append(this.mDistanceDisplayUnit);
        A0o.append(", fuel volume display unit: ");
        return AnonymousClass000.A0S(this.mFuelVolumeDisplayUnit, A0o);
    }
}
