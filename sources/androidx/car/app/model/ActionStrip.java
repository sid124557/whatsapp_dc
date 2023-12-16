package androidx.car.app.model;

import X.AnonymousClass000;
import X.AnonymousClass001;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public final class ActionStrip {
    public final List mActions = Collections.emptyList();

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ActionStrip)) {
            return false;
        }
        return Objects.equals(this.mActions, ((ActionStrip) obj).mActions);
    }

    public int hashCode() {
        return Objects.hashCode(this.mActions);
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("[action count: ");
        A0o.append(this.mActions.size());
        return AnonymousClass000.A0f(A0o);
    }
}
