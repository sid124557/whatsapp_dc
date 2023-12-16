package androidx.car.app.navigation.model;

import X.AnonymousClass001;
import X.C14820qK;
import androidx.car.app.model.CarIcon;
import androidx.car.app.model.CarText;
import java.util.Objects;

public final class MessageInfo implements C14820qK {
    public final CarIcon mImage = null;
    public final CarText mText = null;
    public final CarText mTitle = null;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MessageInfo)) {
            return false;
        }
        MessageInfo messageInfo = (MessageInfo) obj;
        return Objects.equals(this.mTitle, messageInfo.mTitle) && Objects.equals(this.mText, messageInfo.mText) && Objects.equals(this.mImage, messageInfo.mImage);
    }

    public int hashCode() {
        Object[] objArr = new Object[3];
        objArr[0] = this.mTitle;
        objArr[1] = this.mText;
        return AnonymousClass001.A0L(this.mImage, objArr, 2);
    }

    public String toString() {
        return "MessageInfo";
    }
}
