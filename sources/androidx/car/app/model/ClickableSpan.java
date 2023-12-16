package androidx.car.app.model;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.C14690q7;

public final class ClickableSpan extends CarSpan {
    public final C14690q7 mOnClickDelegate = null;

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ClickableSpan)) {
            return false;
        }
        Boolean valueOf = Boolean.valueOf(AnonymousClass000.A1X(this.mOnClickDelegate));
        if (((ClickableSpan) obj).mOnClickDelegate != null) {
            z = false;
        }
        return AnonymousClass001.A1b(valueOf, z);
    }

    public int hashCode() {
        boolean z = true;
        Object[] objArr = new Object[1];
        if (this.mOnClickDelegate != null) {
            z = false;
        }
        return AnonymousClass001.A0L(Boolean.valueOf(z), objArr, 0);
    }

    public String toString() {
        return "[clickable]";
    }
}
