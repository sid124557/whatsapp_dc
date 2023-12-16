package androidx.car.app.model;

import X.AnonymousClass001;
import X.C14790qH;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public final class LongMessageTemplate implements C14790qH {
    public final List mActionList = Collections.emptyList();
    public final ActionStrip mActionStrip = null;
    public final Action mHeaderAction = null;
    public final CarText mMessage = null;
    public final CarText mTitle = null;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LongMessageTemplate)) {
            return false;
        }
        LongMessageTemplate longMessageTemplate = (LongMessageTemplate) obj;
        return Objects.equals(this.mTitle, longMessageTemplate.mTitle) && Objects.equals(this.mMessage, longMessageTemplate.mMessage) && Objects.equals(this.mHeaderAction, longMessageTemplate.mHeaderAction) && Objects.equals(this.mActionList, longMessageTemplate.mActionList) && Objects.equals(this.mActionStrip, longMessageTemplate.mActionStrip);
    }

    public int hashCode() {
        Object[] objArr = new Object[5];
        objArr[0] = this.mTitle;
        objArr[1] = this.mMessage;
        objArr[2] = this.mHeaderAction;
        objArr[3] = this.mActionList;
        return AnonymousClass001.A0L(this.mActionStrip, objArr, 4);
    }

    public String toString() {
        return "LongMessageTemplate";
    }
}
