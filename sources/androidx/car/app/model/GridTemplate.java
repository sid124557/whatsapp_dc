package androidx.car.app.model;

import X.AnonymousClass001;
import X.C14790qH;
import java.util.Objects;

public final class GridTemplate implements C14790qH {
    public final ActionStrip mActionStrip = null;
    public final Action mHeaderAction = null;
    public final boolean mIsLoading = false;
    public final ItemList mSingleList = null;
    public final CarText mTitle = null;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GridTemplate)) {
            return false;
        }
        GridTemplate gridTemplate = (GridTemplate) obj;
        return this.mIsLoading == gridTemplate.mIsLoading && Objects.equals(this.mTitle, gridTemplate.mTitle) && Objects.equals(this.mHeaderAction, gridTemplate.mHeaderAction) && Objects.equals(this.mSingleList, gridTemplate.mSingleList) && Objects.equals(this.mActionStrip, gridTemplate.mActionStrip);
    }

    public int hashCode() {
        Object[] objArr = new Object[5];
        AnonymousClass001.A1R(objArr, this.mIsLoading);
        objArr[1] = this.mTitle;
        objArr[2] = this.mHeaderAction;
        objArr[3] = this.mSingleList;
        return AnonymousClass001.A0L(this.mActionStrip, objArr, 4);
    }

    public String toString() {
        return "GridTemplate";
    }
}
