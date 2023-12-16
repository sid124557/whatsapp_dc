package androidx.car.app.model;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.C14710q9;
import X.C14790qH;
import java.util.Objects;

public final class PlaceListMapTemplate implements C14790qH {
    public final ActionStrip mActionStrip = null;
    public final Place mAnchor = null;
    public final Action mHeaderAction = null;
    public final boolean mIsLoading = false;
    public final ItemList mItemList = null;
    public final C14710q9 mOnContentRefreshDelegate = null;
    public final boolean mShowCurrentLocation = false;
    public final CarText mTitle = null;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PlaceListMapTemplate)) {
            return false;
        }
        PlaceListMapTemplate placeListMapTemplate = (PlaceListMapTemplate) obj;
        return this.mShowCurrentLocation == placeListMapTemplate.mShowCurrentLocation && this.mIsLoading == placeListMapTemplate.mIsLoading && Objects.equals(this.mTitle, placeListMapTemplate.mTitle) && Objects.equals(this.mItemList, placeListMapTemplate.mItemList) && Objects.equals(this.mHeaderAction, placeListMapTemplate.mHeaderAction) && Objects.equals(this.mActionStrip, placeListMapTemplate.mActionStrip) && Objects.equals(this.mAnchor, placeListMapTemplate.mAnchor) && AnonymousClass001.A1b(Boolean.valueOf(AnonymousClass000.A1X(this.mOnContentRefreshDelegate)), AnonymousClass000.A1X(placeListMapTemplate.mOnContentRefreshDelegate));
    }

    public int hashCode() {
        Object[] objArr = new Object[8];
        boolean z = false;
        objArr[0] = Boolean.valueOf(this.mShowCurrentLocation);
        AnonymousClass000.A1R(objArr, this.mIsLoading);
        objArr[2] = this.mTitle;
        objArr[3] = this.mItemList;
        objArr[4] = this.mHeaderAction;
        objArr[5] = this.mActionStrip;
        objArr[6] = this.mAnchor;
        if (this.mOnContentRefreshDelegate == null) {
            z = true;
        }
        return AnonymousClass001.A0L(Boolean.valueOf(z), objArr, 7);
    }

    public String toString() {
        return "PlaceListMapTemplate";
    }
}
