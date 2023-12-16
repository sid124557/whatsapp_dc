package androidx.car.app.model;

import X.AnonymousClass000;
import X.AnonymousClass001;
import java.util.List;
import java.util.Objects;

public final class Header {
    public final List mEndHeaderActions = AnonymousClass001.A0s();
    public final Action mStartHeaderAction = null;
    public final CarText mTitle = null;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Header)) {
            return false;
        }
        Header header = (Header) obj;
        return Objects.equals(this.mTitle, header.mTitle) && Objects.equals(this.mEndHeaderActions, header.mEndHeaderActions) && Objects.equals(this.mStartHeaderAction, header.mStartHeaderAction);
    }

    public int hashCode() {
        Object[] objArr = new Object[3];
        objArr[0] = this.mTitle;
        objArr[1] = this.mEndHeaderActions;
        return AnonymousClass001.A0L(this.mStartHeaderAction, objArr, 2);
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("Header: ");
        return AnonymousClass000.A0R(this.mTitle, A0o);
    }
}
