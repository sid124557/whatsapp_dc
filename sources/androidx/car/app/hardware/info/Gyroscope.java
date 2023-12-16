package androidx.car.app.hardware.info;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass002;
import androidx.car.app.hardware.common.CarValue;
import java.util.Objects;

public final class Gyroscope {
    public final CarValue mRotations = CarValue.A04;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Gyroscope)) {
            return false;
        }
        return Objects.equals(this.mRotations, ((Gyroscope) obj).mRotations);
    }

    public int hashCode() {
        return AnonymousClass001.A0L(this.mRotations, AnonymousClass002.A0L(), 0);
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("[ rotations: ");
        A0o.append(this.mRotations);
        return AnonymousClass000.A0X(" ]", A0o);
    }
}
