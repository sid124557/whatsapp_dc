package androidx.car.app.model;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.C14730qB;
import X.C14740qC;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public final class ItemList {
    public final List mItems = Collections.emptyList();
    public final CarText mNoItemsMessage = null;
    public final C14730qB mOnItemVisibilityChangedDelegate = null;
    public final C14740qC mOnSelectedDelegate = null;
    public final int mSelectedIndex = 0;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ItemList)) {
            return false;
        }
        ItemList itemList = (ItemList) obj;
        return this.mSelectedIndex == itemList.mSelectedIndex && Objects.equals(this.mItems, itemList.mItems) && AnonymousClass001.A1b(Boolean.valueOf(AnonymousClass000.A1X(this.mOnSelectedDelegate)), AnonymousClass000.A1X(itemList.mOnSelectedDelegate)) && AnonymousClass001.A1b(Boolean.valueOf(AnonymousClass000.A1X(this.mOnItemVisibilityChangedDelegate)), AnonymousClass000.A1X(itemList.mOnItemVisibilityChangedDelegate)) && Objects.equals(this.mNoItemsMessage, itemList.mNoItemsMessage);
    }

    public int hashCode() {
        Object[] objArr = new Object[5];
        boolean z = false;
        objArr[0] = Integer.valueOf(this.mSelectedIndex);
        objArr[1] = this.mItems;
        AnonymousClass001.A1S(objArr, AnonymousClass000.A1X(this.mOnSelectedDelegate));
        if (this.mOnItemVisibilityChangedDelegate == null) {
            z = true;
        }
        objArr[3] = Boolean.valueOf(z);
        return AnonymousClass001.A0L(this.mNoItemsMessage, objArr, 4);
    }

    public String toString() {
        String str;
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("[ items: ");
        List list = this.mItems;
        if (list != null) {
            str = list.toString();
        } else {
            str = null;
        }
        A0o.append(str);
        A0o.append(", selected: ");
        A0o.append(this.mSelectedIndex);
        return AnonymousClass000.A0f(A0o);
    }
}
