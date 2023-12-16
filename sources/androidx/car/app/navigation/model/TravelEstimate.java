package androidx.car.app.navigation.model;

import X.AnonymousClass000;
import X.AnonymousClass001;
import androidx.car.app.model.CarColor;
import androidx.car.app.model.CarIcon;
import androidx.car.app.model.CarText;
import androidx.car.app.model.DateTimeWithZone;
import androidx.car.app.model.Distance;
import java.util.Objects;

public final class TravelEstimate {
    public final DateTimeWithZone mArrivalTimeAtDestination = null;
    public final Distance mRemainingDistance = null;
    public final CarColor mRemainingDistanceColor;
    public final CarColor mRemainingTimeColor;
    public final long mRemainingTimeSeconds = 0;
    public final CarIcon mTripIcon;
    public final CarText mTripText;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TravelEstimate)) {
            return false;
        }
        TravelEstimate travelEstimate = (TravelEstimate) obj;
        return Objects.equals(this.mRemainingDistance, travelEstimate.mRemainingDistance) && this.mRemainingTimeSeconds == travelEstimate.mRemainingTimeSeconds && Objects.equals(this.mArrivalTimeAtDestination, travelEstimate.mArrivalTimeAtDestination) && Objects.equals(this.mRemainingTimeColor, travelEstimate.mRemainingTimeColor) && Objects.equals(this.mRemainingDistanceColor, travelEstimate.mRemainingDistanceColor) && Objects.equals(this.mTripText, travelEstimate.mTripText) && Objects.equals(this.mTripIcon, travelEstimate.mTripIcon);
    }

    public int hashCode() {
        Object[] objArr = new Object[7];
        objArr[0] = this.mRemainingDistance;
        AnonymousClass001.A1Q(objArr, this.mRemainingTimeSeconds);
        objArr[2] = this.mArrivalTimeAtDestination;
        objArr[3] = this.mRemainingTimeColor;
        objArr[4] = this.mRemainingDistanceColor;
        objArr[5] = this.mTripText;
        return AnonymousClass001.A0L(this.mTripIcon, objArr, 6);
    }

    public TravelEstimate() {
        CarColor carColor = CarColor.A00;
        this.mRemainingTimeColor = carColor;
        this.mRemainingDistanceColor = carColor;
        this.mTripText = null;
        this.mTripIcon = null;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("[ remaining distance: ");
        A0o.append(this.mRemainingDistance);
        A0o.append(", time (s): ");
        A0o.append(this.mRemainingTimeSeconds);
        A0o.append(", ETA: ");
        return AnonymousClass000.A0S(this.mArrivalTimeAtDestination, A0o);
    }
}
