package androidx.car.app.hardware.info;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass002;
import androidx.car.app.hardware.common.CarValue;
import java.util.Objects;

public final class Accelerometer {
    public final CarValue mForces = CarValue.A04;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Accelerometer)) {
            return false;
        }
        return Objects.equals(this.mForces, ((Accelerometer) obj).mForces);
    }

    public int hashCode() {
        return AnonymousClass001.A0L(this.mForces, AnonymousClass002.A0L(), 0);
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("[ forces: ");
        A0o.append(this.mForces);
        return AnonymousClass000.A0X(" ]", A0o);
    }
}
