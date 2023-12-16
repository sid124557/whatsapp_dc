package androidx.car.app.model;

import X.AnonymousClass001;
import X.C14790qH;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public final class ListTemplate implements C14790qH {
    public final ActionStrip mActionStrip = null;
    public final Action mHeaderAction = null;
    public final boolean mIsLoading = false;
    public final List mSectionedLists = Collections.emptyList();
    public final ItemList mSingleList = null;
    public final CarText mTitle = null;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ListTemplate)) {
            return false;
        }
        ListTemplate listTemplate = (ListTemplate) obj;
        return this.mIsLoading == listTemplate.mIsLoading && Objects.equals(this.mTitle, listTemplate.mTitle) && Objects.equals(this.mHeaderAction, listTemplate.mHeaderAction) && Objects.equals(this.mSingleList, listTemplate.mSingleList) && Objects.equals(this.mSectionedLists, listTemplate.mSectionedLists) && Objects.equals(this.mActionStrip, listTemplate.mActionStrip);
    }

    public int hashCode() {
        Object[] objArr = new Object[6];
        AnonymousClass001.A1R(objArr, this.mIsLoading);
        objArr[1] = this.mTitle;
        objArr[2] = this.mHeaderAction;
        objArr[3] = this.mSingleList;
        objArr[4] = this.mSectionedLists;
        return AnonymousClass001.A0L(this.mActionStrip, objArr, 5);
    }

    public String toString() {
        return "ListTemplate";
    }
}
