package androidx.car.app.navigation.model;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.C14790qH;
import X.C14820qK;
import X.C14830qL;
import androidx.car.app.model.ActionStrip;
import androidx.car.app.model.CarColor;
import androidx.car.app.model.Toggle;
import java.util.Objects;

public final class NavigationTemplate implements C14790qH {
    public final ActionStrip mActionStrip = null;
    public final CarColor mBackgroundColor = null;
    public final TravelEstimate mDestinationTravelEstimate = null;
    public final ActionStrip mMapActionStrip = null;
    public final C14820qK mNavigationInfo = null;
    public final C14830qL mPanModeDelegate = null;
    public final Toggle mPanModeToggle = null;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NavigationTemplate)) {
            return false;
        }
        NavigationTemplate navigationTemplate = (NavigationTemplate) obj;
        return Objects.equals(this.mNavigationInfo, navigationTemplate.mNavigationInfo) && Objects.equals(this.mBackgroundColor, navigationTemplate.mBackgroundColor) && Objects.equals(this.mDestinationTravelEstimate, navigationTemplate.mDestinationTravelEstimate) && Objects.equals(this.mActionStrip, navigationTemplate.mActionStrip) && Objects.equals(this.mMapActionStrip, navigationTemplate.mMapActionStrip) && Objects.equals(this.mPanModeToggle, navigationTemplate.mPanModeToggle) && AnonymousClass001.A1b(Boolean.valueOf(AnonymousClass000.A1X(this.mPanModeDelegate)), AnonymousClass000.A1X(navigationTemplate.mPanModeDelegate));
    }

    public int hashCode() {
        Object[] objArr = new Object[7];
        boolean z = false;
        objArr[0] = this.mNavigationInfo;
        objArr[1] = this.mBackgroundColor;
        objArr[2] = this.mDestinationTravelEstimate;
        objArr[3] = this.mActionStrip;
        objArr[4] = this.mMapActionStrip;
        objArr[5] = this.mPanModeToggle;
        if (this.mPanModeDelegate == null) {
            z = true;
        }
        return AnonymousClass001.A0L(Boolean.valueOf(z), objArr, 6);
    }

    public String toString() {
        return "NavigationTemplate";
    }
}
