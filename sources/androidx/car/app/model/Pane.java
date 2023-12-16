package androidx.car.app.model;

import X.AnonymousClass000;
import X.AnonymousClass001;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public final class Pane {
    public final List mActionList = Collections.emptyList();
    public final CarIcon mImage = null;
    public final boolean mIsLoading = false;
    public final List mRows = Collections.emptyList();

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Pane)) {
            return false;
        }
        Pane pane = (Pane) obj;
        return this.mIsLoading == pane.mIsLoading && Objects.equals(this.mActionList, pane.mActionList) && Objects.equals(this.mRows, pane.mRows) && Objects.equals(this.mImage, pane.mImage);
    }

    public int hashCode() {
        Object[] objArr = new Object[4];
        objArr[0] = this.mRows;
        objArr[1] = this.mActionList;
        AnonymousClass001.A1S(objArr, this.mIsLoading);
        return AnonymousClass001.A0L(this.mImage, objArr, 3);
    }

    public String toString() {
        String str;
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("[ rows: ");
        List list = this.mRows;
        if (list != null) {
            str = list.toString();
        } else {
            str = null;
        }
        A0o.append(str);
        A0o.append(", action list: ");
        return AnonymousClass000.A0S(this.mActionList, A0o);
    }
}
