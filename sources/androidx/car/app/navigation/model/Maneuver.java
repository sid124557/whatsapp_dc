package androidx.car.app.navigation.model;

import X.AnonymousClass000;
import X.AnonymousClass001;
import androidx.car.app.model.CarIcon;
import java.util.Objects;

public final class Maneuver {
    public final CarIcon mIcon = null;
    public final int mRoundaboutExitAngle = 0;
    public final int mRoundaboutExitNumber = 0;
    public final int mType = 0;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Maneuver)) {
            return false;
        }
        Maneuver maneuver = (Maneuver) obj;
        return this.mType == maneuver.mType && this.mRoundaboutExitNumber == maneuver.mRoundaboutExitNumber && this.mRoundaboutExitAngle == maneuver.mRoundaboutExitAngle && Objects.equals(this.mIcon, maneuver.mIcon);
    }

    public int hashCode() {
        Object[] objArr = new Object[4];
        AnonymousClass000.A1L(objArr, this.mType);
        AnonymousClass000.A1M(objArr, this.mRoundaboutExitNumber);
        AnonymousClass000.A1N(objArr, this.mRoundaboutExitAngle);
        return AnonymousClass001.A0L(this.mIcon, objArr, 3);
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("[type: ");
        A0o.append(this.mType);
        A0o.append(", exit #: ");
        A0o.append(this.mRoundaboutExitNumber);
        A0o.append(", exit angle: ");
        A0o.append(this.mRoundaboutExitAngle);
        A0o.append(", icon: ");
        return AnonymousClass000.A0S(this.mIcon, A0o);
    }
}
