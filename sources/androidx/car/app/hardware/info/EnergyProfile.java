package androidx.car.app.hardware.info;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass002;
import androidx.car.app.hardware.common.CarValue;
import java.util.Objects;

public final class EnergyProfile {
    public final CarValue mEvConnectorTypes;
    public final CarValue mFuelTypes;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EnergyProfile)) {
            return false;
        }
        EnergyProfile energyProfile = (EnergyProfile) obj;
        return Objects.equals(this.mEvConnectorTypes, energyProfile.mEvConnectorTypes) && Objects.equals(this.mFuelTypes, energyProfile.mFuelTypes);
    }

    public EnergyProfile() {
        CarValue carValue = CarValue.A06;
        this.mEvConnectorTypes = carValue;
        this.mFuelTypes = carValue;
    }

    public int hashCode() {
        Object[] A0M = AnonymousClass002.A0M();
        A0M[0] = this.mEvConnectorTypes;
        return AnonymousClass001.A0L(this.mFuelTypes, A0M, 1);
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("[ evConnectorTypes: ");
        A0o.append(this.mEvConnectorTypes);
        A0o.append(", fuelTypes: ");
        return AnonymousClass000.A0S(this.mFuelTypes, A0o);
    }
}
