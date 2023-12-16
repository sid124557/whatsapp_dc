package androidx.car.app.navigation.model;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass002;
import java.util.Objects;

public final class LaneDirection {
    public final boolean mIsRecommended = false;
    public final int mShape = 1;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LaneDirection)) {
            return false;
        }
        LaneDirection laneDirection = (LaneDirection) obj;
        return this.mShape == laneDirection.mShape && this.mIsRecommended == laneDirection.mIsRecommended;
    }

    public int hashCode() {
        Object[] A0M = AnonymousClass002.A0M();
        AnonymousClass000.A1L(A0M, this.mShape);
        AnonymousClass000.A1R(A0M, this.mIsRecommended);
        return Objects.hash(A0M);
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("[shape: ");
        A0o.append(this.mShape);
        A0o.append(", isRecommended: ");
        A0o.append(this.mIsRecommended);
        return AnonymousClass000.A0f(A0o);
    }
}
