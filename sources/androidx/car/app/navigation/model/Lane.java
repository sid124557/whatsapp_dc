package androidx.car.app.navigation.model;

import X.AnonymousClass000;
import X.AnonymousClass001;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public final class Lane {
    public final List mDirections = Collections.emptyList();

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Lane)) {
            return false;
        }
        return Objects.equals(this.mDirections, ((Lane) obj).mDirections);
    }

    public int hashCode() {
        return Objects.hashCode(this.mDirections);
    }

    public String toString() {
        int i;
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("[direction count: ");
        List list = this.mDirections;
        if (list != null) {
            i = list.size();
        } else {
            i = 0;
        }
        A0o.append(i);
        return AnonymousClass000.A0f(A0o);
    }
}
