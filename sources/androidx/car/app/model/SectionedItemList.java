package androidx.car.app.model;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass002;
import java.util.Objects;

public final class SectionedItemList {
    public final CarText mHeader = null;
    public final ItemList mItemList = null;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SectionedItemList)) {
            return false;
        }
        SectionedItemList sectionedItemList = (SectionedItemList) obj;
        return Objects.equals(this.mItemList, sectionedItemList.mItemList) && Objects.equals(this.mHeader, sectionedItemList.mHeader);
    }

    public int hashCode() {
        Object[] A0M = AnonymousClass002.A0M();
        A0M[0] = this.mItemList;
        return AnonymousClass001.A0L(this.mHeader, A0M, 1);
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("[ items: ");
        A0o.append(this.mItemList);
        A0o.append(", has header: ");
        A0o.append(AnonymousClass000.A1W(this.mHeader));
        return AnonymousClass000.A0f(A0o);
    }
}
