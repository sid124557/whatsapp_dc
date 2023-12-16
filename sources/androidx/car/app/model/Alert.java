package androidx.car.app.model;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.C14630q1;
import java.util.List;
import java.util.Objects;

public final class Alert {
    public final List mActions;
    public final C14630q1 mCallbackDelegate;
    public final long mDuration;
    public final CarIcon mIcon;
    public final int mId = 0;
    public final CarText mSubtitle;
    public final CarText mTitle;

    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof Alert) && this.mId == ((Alert) obj).mId;
        }
        return true;
    }

    public Alert() {
        Objects.requireNonNull("");
        this.mTitle = new CarText((CharSequence) "");
        this.mSubtitle = null;
        this.mIcon = null;
        this.mActions = AnonymousClass001.A0s();
        this.mDuration = 0;
        this.mCallbackDelegate = null;
    }

    public int hashCode() {
        Object[] A0L = AnonymousClass002.A0L();
        AnonymousClass000.A1L(A0L, this.mId);
        return Objects.hash(A0L);
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("[id: ");
        A0o.append(this.mId);
        A0o.append(", title: ");
        A0o.append(this.mTitle);
        A0o.append(", icon: ");
        return AnonymousClass000.A0S(this.mIcon, A0o);
    }
}
