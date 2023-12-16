package androidx.car.app.hardware.info;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass002;
import androidx.car.app.hardware.common.CarValue;
import java.util.Objects;

public final class TollCard {
    public final CarValue mCardState = CarValue.A05;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TollCard)) {
            return false;
        }
        return Objects.equals(this.mCardState, ((TollCard) obj).mCardState);
    }

    public int hashCode() {
        return AnonymousClass001.A0L(this.mCardState, AnonymousClass002.A0L(), 0);
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("[ tollcard state: ");
        return AnonymousClass000.A0S(this.mCardState, A0o);
    }
}
