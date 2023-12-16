package androidx.car.app.hardware.info;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass002;
import androidx.car.app.hardware.common.CarValue;
import java.util.Objects;

public final class Compass {
    public final CarValue mOrientations = CarValue.A04;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Compass)) {
            return false;
        }
        return Objects.equals(this.mOrientations, ((Compass) obj).mOrientations);
    }

    public int hashCode() {
        return AnonymousClass001.A0L(this.mOrientations, AnonymousClass002.A0L(), 0);
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("[ orientations: ");
        A0o.append(this.mOrientations);
        return AnonymousClass000.A0X(" ]", A0o);
    }
}
