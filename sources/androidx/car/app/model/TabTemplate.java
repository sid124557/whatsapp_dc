package androidx.car.app.model;

import X.AnonymousClass001;
import X.C14770qF;
import X.C14790qH;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class TabTemplate implements C14790qH {
    public final Action mHeaderAction = null;
    public final boolean mIsLoading = false;
    public final C14770qF mTabCallbackDelegate = null;
    public final TabContents mTabContents = null;
    public final List mTabs = Collections.emptyList();

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TabTemplate)) {
            return false;
        }
        TabTemplate tabTemplate = (TabTemplate) obj;
        return this.mIsLoading == tabTemplate.mIsLoading && Objects.equals(this.mHeaderAction, tabTemplate.mHeaderAction) && Objects.equals(this.mTabs, tabTemplate.mTabs) && Objects.equals(this.mTabContents, tabTemplate.mTabContents);
    }

    public int hashCode() {
        Object[] objArr = new Object[4];
        AnonymousClass001.A1R(objArr, this.mIsLoading);
        objArr[1] = this.mHeaderAction;
        objArr[2] = this.mTabs;
        return AnonymousClass001.A0L(this.mTabContents, objArr, 3);
    }

    public String toString() {
        return "TabTemplate";
    }
}
