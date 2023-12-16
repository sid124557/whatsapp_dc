package androidx.car.app.navigation.model;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.C14710q9;
import X.C14790qH;
import X.C14830qL;
import androidx.car.app.model.Action;
import androidx.car.app.model.ActionStrip;
import androidx.car.app.model.CarText;
import androidx.car.app.model.Header;
import androidx.car.app.model.ItemList;
import java.util.Objects;

public final class PlaceListNavigationTemplate implements C14790qH {
    public final ActionStrip mActionStrip = null;
    public final Header mHeader = null;
    @Deprecated
    public final Action mHeaderAction = null;
    public final boolean mIsLoading = false;
    public final ItemList mItemList = null;
    public final ActionStrip mMapActionStrip = null;
    public final C14710q9 mOnContentRefreshDelegate = null;
    public final C14830qL mPanModeDelegate = null;
    @Deprecated
    public final CarText mTitle = null;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PlaceListNavigationTemplate)) {
            return false;
        }
        PlaceListNavigationTemplate placeListNavigationTemplate = (PlaceListNavigationTemplate) obj;
        return this.mIsLoading == placeListNavigationTemplate.mIsLoading && Objects.equals(this.mTitle, placeListNavigationTemplate.mTitle) && Objects.equals(this.mItemList, placeListNavigationTemplate.mItemList) && Objects.equals(this.mHeaderAction, placeListNavigationTemplate.mHeaderAction) && Objects.equals(this.mActionStrip, placeListNavigationTemplate.mActionStrip) && Objects.equals(this.mMapActionStrip, placeListNavigationTemplate.mMapActionStrip) && AnonymousClass001.A1b(Boolean.valueOf(AnonymousClass000.A1X(this.mPanModeDelegate)), AnonymousClass000.A1X(placeListNavigationTemplate.mPanModeDelegate)) && AnonymousClass001.A1b(Boolean.valueOf(AnonymousClass000.A1X(this.mOnContentRefreshDelegate)), AnonymousClass000.A1X(placeListNavigationTemplate.mOnContentRefreshDelegate)) && Objects.equals(this.mHeader, placeListNavigationTemplate.mHeader);
    }

    public int hashCode() {
        Object[] objArr = new Object[9];
        boolean z = false;
        objArr[0] = this.mTitle;
        AnonymousClass000.A1R(objArr, this.mIsLoading);
        objArr[2] = this.mItemList;
        objArr[3] = this.mHeaderAction;
        objArr[4] = this.mActionStrip;
        objArr[5] = this.mMapActionStrip;
        objArr[6] = Boolean.valueOf(AnonymousClass000.A1X(this.mPanModeDelegate));
        if (this.mOnContentRefreshDelegate == null) {
            z = true;
        }
        objArr[7] = Boolean.valueOf(z);
        return AnonymousClass001.A0L(this.mHeader, objArr, 8);
    }

    public String toString() {
        return "PlaceListNavigationTemplate";
    }
}
