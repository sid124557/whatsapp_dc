package androidx.car.app.navigation.model;

import X.AnonymousClass000;
import X.AnonymousClass001;
import androidx.car.app.model.CarText;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public final class Trip {
    public final CarText mCurrentRoad = null;
    public final List mDestinationTravelEstimates = Collections.emptyList();
    public final List mDestinations = Collections.emptyList();
    public final boolean mIsLoading = false;
    public final List mStepTravelEstimates = Collections.emptyList();
    public final List mSteps = Collections.emptyList();

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Trip)) {
            return false;
        }
        Trip trip = (Trip) obj;
        return Objects.equals(this.mDestinations, trip.mDestinations) && Objects.equals(this.mSteps, trip.mSteps) && Objects.equals(this.mDestinationTravelEstimates, trip.mDestinationTravelEstimates) && Objects.equals(this.mStepTravelEstimates, trip.mStepTravelEstimates) && Objects.equals(this.mCurrentRoad, trip.mCurrentRoad) && AnonymousClass001.A1b(Boolean.valueOf(this.mIsLoading), trip.mIsLoading);
    }

    public int hashCode() {
        Object[] objArr = new Object[5];
        objArr[0] = this.mDestinations;
        objArr[1] = this.mSteps;
        objArr[2] = this.mDestinationTravelEstimates;
        objArr[3] = this.mStepTravelEstimates;
        return AnonymousClass001.A0L(this.mCurrentRoad, objArr, 4);
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("[ destinations : ");
        AnonymousClass000.A1B(this.mDestinations, A0o);
        A0o.append(", steps: ");
        AnonymousClass000.A1B(this.mSteps, A0o);
        A0o.append(", dest estimates: ");
        AnonymousClass000.A1B(this.mDestinationTravelEstimates, A0o);
        A0o.append(", step estimates: ");
        AnonymousClass000.A1B(this.mStepTravelEstimates, A0o);
        A0o.append(", road: ");
        AnonymousClass001.A1B(this.mCurrentRoad, A0o);
        A0o.append(", isLoading: ");
        A0o.append(this.mIsLoading);
        return AnonymousClass000.A0f(A0o);
    }
}
