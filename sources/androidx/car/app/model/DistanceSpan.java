package androidx.car.app.model;

import X.AnonymousClass000;
import X.AnonymousClass001;
import java.util.Objects;

public final class DistanceSpan extends CarSpan {
    public final Distance mDistance = null;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DistanceSpan)) {
            return false;
        }
        return Objects.equals(this.mDistance, ((DistanceSpan) obj).mDistance);
    }

    public int hashCode() {
        return Objects.hashCode(this.mDistance);
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("[distance: ");
        return AnonymousClass000.A0S(this.mDistance, A0o);
    }
}
