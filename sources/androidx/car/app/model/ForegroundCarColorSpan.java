package androidx.car.app.model;

import X.AnonymousClass000;
import X.AnonymousClass001;
import java.util.Objects;

public final class ForegroundCarColorSpan extends CarSpan {
    public final CarColor mCarColor = CarColor.A00;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ForegroundCarColorSpan)) {
            return false;
        }
        return Objects.equals(this.mCarColor, ((ForegroundCarColorSpan) obj).mCarColor);
    }

    public int hashCode() {
        return Objects.hashCode(this.mCarColor);
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("[color: ");
        return AnonymousClass000.A0S(this.mCarColor, A0o);
    }
}
