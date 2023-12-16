package androidx.car.app.hardware.info;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass002;
import androidx.car.app.hardware.common.CarValue;
import java.util.Objects;

public final class CarHardwareLocation {
    public static final CarValue A00 = new CarValue(2);
    public static final CarValue A01 = new CarValue(0);
    public final CarValue mLocation = A01;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CarHardwareLocation)) {
            return false;
        }
        return Objects.equals(this.mLocation, ((CarHardwareLocation) obj).mLocation);
    }

    public int hashCode() {
        return AnonymousClass001.A0L(this.mLocation, AnonymousClass002.A0L(), 0);
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("[ location: ");
        A0o.append(this.mLocation);
        return AnonymousClass000.A0X(" ]", A0o);
    }
}
