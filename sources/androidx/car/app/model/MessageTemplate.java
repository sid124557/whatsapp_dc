package androidx.car.app.model;

import X.AnonymousClass001;
import X.C14790qH;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public final class MessageTemplate implements C14790qH {
    public final List mActionList = Collections.emptyList();
    public final ActionStrip mActionStrip = null;
    public final CarText mDebugMessage = null;
    public final Action mHeaderAction = null;
    public final CarIcon mIcon = null;
    public final boolean mIsLoading = false;
    public final CarText mMessage = null;
    public final CarText mTitle = null;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MessageTemplate)) {
            return false;
        }
        MessageTemplate messageTemplate = (MessageTemplate) obj;
        return this.mIsLoading == messageTemplate.mIsLoading && Objects.equals(this.mTitle, messageTemplate.mTitle) && Objects.equals(this.mMessage, messageTemplate.mMessage) && Objects.equals(this.mDebugMessage, messageTemplate.mDebugMessage) && Objects.equals(this.mHeaderAction, messageTemplate.mHeaderAction) && Objects.equals(this.mActionList, messageTemplate.mActionList) && Objects.equals(this.mIcon, messageTemplate.mIcon) && Objects.equals(this.mActionStrip, messageTemplate.mActionStrip);
    }

    public int hashCode() {
        Object[] objArr = new Object[8];
        AnonymousClass001.A1R(objArr, this.mIsLoading);
        objArr[1] = this.mTitle;
        objArr[2] = this.mMessage;
        objArr[3] = this.mDebugMessage;
        objArr[4] = this.mHeaderAction;
        objArr[5] = this.mActionList;
        objArr[6] = this.mIcon;
        return AnonymousClass001.A0L(this.mActionStrip, objArr, 7);
    }

    public String toString() {
        return "MessageTemplate";
    }
}
