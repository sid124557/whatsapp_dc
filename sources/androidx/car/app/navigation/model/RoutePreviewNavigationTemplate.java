package androidx.car.app.navigation.model;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.C14790qH;
import X.C14830qL;
import androidx.car.app.model.Action;
import androidx.car.app.model.ActionStrip;
import androidx.car.app.model.CarText;
import androidx.car.app.model.Header;
import androidx.car.app.model.ItemList;
import java.util.Objects;

public final class RoutePreviewNavigationTemplate implements C14790qH {
    public final ActionStrip mActionStrip = null;
    public final Header mHeader = null;
    @Deprecated
    public final Action mHeaderAction = null;
    public final boolean mIsLoading = false;
    public final ItemList mItemList = null;
    public final ActionStrip mMapActionStrip = null;
    public final Action mNavigateAction = null;
    public final C14830qL mPanModeDelegate = null;
    @Deprecated
    public final CarText mTitle = null;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RoutePreviewNavigationTemplate)) {
            return false;
        }
        RoutePreviewNavigationTemplate routePreviewNavigationTemplate = (RoutePreviewNavigationTemplate) obj;
        return this.mIsLoading == routePreviewNavigationTemplate.mIsLoading && Objects.equals(this.mTitle, routePreviewNavigationTemplate.mTitle) && Objects.equals(this.mNavigateAction, routePreviewNavigationTemplate.mNavigateAction) && Objects.equals(this.mItemList, routePreviewNavigationTemplate.mItemList) && Objects.equals(this.mHeaderAction, routePreviewNavigationTemplate.mHeaderAction) && Objects.equals(this.mActionStrip, routePreviewNavigationTemplate.mActionStrip) && Objects.equals(this.mMapActionStrip, routePreviewNavigationTemplate.mMapActionStrip) && AnonymousClass001.A1b(Boolean.valueOf(AnonymousClass000.A1X(this.mPanModeDelegate)), AnonymousClass000.A1X(routePreviewNavigationTemplate.mPanModeDelegate)) && Objects.equals(this.mHeader, routePreviewNavigationTemplate.mHeader);
    }

    public int hashCode() {
        Object[] objArr = new Object[9];
        boolean z = false;
        objArr[0] = this.mTitle;
        AnonymousClass000.A1R(objArr, this.mIsLoading);
        objArr[2] = this.mNavigateAction;
        objArr[3] = this.mItemList;
        objArr[4] = this.mHeaderAction;
        objArr[5] = this.mActionStrip;
        objArr[6] = this.mMapActionStrip;
        if (this.mPanModeDelegate == null) {
            z = true;
        }
        objArr[7] = Boolean.valueOf(z);
        return AnonymousClass001.A0L(this.mHeader, objArr, 8);
    }

    public String toString() {
        return "RoutePreviewNavigationTemplate";
    }
}
