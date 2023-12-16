package androidx.car.app.hardware.info;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass002;
import androidx.car.app.hardware.common.CarValue;
import java.util.Objects;

public class EvStatus {
    public final CarValue mEvChargePortConnected;
    public final CarValue mEvChargePortOpen;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EvStatus)) {
            return false;
        }
        EvStatus evStatus = (EvStatus) obj;
        return Objects.equals(this.mEvChargePortConnected, evStatus.mEvChargePortConnected) && Objects.equals(this.mEvChargePortOpen, evStatus.mEvChargePortOpen);
    }

    public EvStatus() {
        CarValue carValue = CarValue.A02;
        this.mEvChargePortOpen = carValue;
        this.mEvChargePortConnected = carValue;
    }

    public int hashCode() {
        Object[] A0M = AnonymousClass002.A0M();
        A0M[0] = this.mEvChargePortOpen;
        return AnonymousClass001.A0L(this.mEvChargePortConnected, A0M, 1);
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("[ EV charge port open: ");
        A0o.append(this.mEvChargePortOpen);
        A0o.append(", EV charge port connected: ");
        return AnonymousClass000.A0S(this.mEvChargePortConnected, A0o);
    }
}
