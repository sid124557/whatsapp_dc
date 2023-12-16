package androidx.car.app.navigation.model;

import X.AnonymousClass000;
import X.AnonymousClass001;
import androidx.car.app.model.CarIcon;
import androidx.car.app.model.CarText;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public final class Step {
    public final CarText mCue = null;
    public final List mLanes = Collections.emptyList();
    public final CarIcon mLanesImage = null;
    public final Maneuver mManeuver = null;
    public final CarText mRoad = null;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Step)) {
            return false;
        }
        Step step = (Step) obj;
        return Objects.equals(this.mManeuver, step.mManeuver) && Objects.equals(this.mLanes, step.mLanes) && Objects.equals(this.mLanesImage, step.mLanesImage) && Objects.equals(this.mCue, step.mCue) && Objects.equals(this.mRoad, step.mRoad);
    }

    public int hashCode() {
        Object[] objArr = new Object[5];
        objArr[0] = this.mManeuver;
        objArr[1] = this.mLanes;
        objArr[2] = this.mLanesImage;
        objArr[3] = this.mCue;
        return AnonymousClass001.A0L(this.mRoad, objArr, 4);
    }

    public String toString() {
        int i;
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("[maneuver: ");
        A0o.append(this.mManeuver);
        A0o.append(", lane count: ");
        List list = this.mLanes;
        if (list != null) {
            i = list.size();
        } else {
            i = 0;
        }
        A0o.append(i);
        A0o.append(", lanes image: ");
        A0o.append(this.mLanesImage);
        A0o.append(", cue: ");
        AnonymousClass001.A1B(this.mCue, A0o);
        A0o.append(", road: ");
        return AnonymousClass000.A0W(CarText.A00(this.mRoad), A0o);
    }
}
