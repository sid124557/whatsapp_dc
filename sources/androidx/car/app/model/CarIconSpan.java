package androidx.car.app.model;

import X.AnonymousClass000;
import X.AnonymousClass001;
import java.util.Objects;

public final class CarIconSpan extends CarSpan {
    public final int mAlignment = 1;
    public final CarIcon mIcon = null;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CarIconSpan)) {
            return false;
        }
        return Objects.equals(this.mIcon, ((CarIconSpan) obj).mIcon);
    }

    public int hashCode() {
        return Objects.hashCode(this.mIcon);
    }

    public String toString() {
        String str;
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("[icon: ");
        A0o.append(this.mIcon);
        A0o.append(", alignment: ");
        int i = this.mAlignment;
        if (i == 0) {
            str = "bottom";
        } else if (i == 1) {
            str = "baseline";
        } else if (i != 2) {
            str = "unknown";
        } else {
            str = "center";
        }
        return AnonymousClass000.A0W(str, A0o);
    }
}
