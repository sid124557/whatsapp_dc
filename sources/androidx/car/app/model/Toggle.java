package androidx.car.app.model;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.C14680q6;
import java.util.Objects;

public final class Toggle {
    public final boolean mIsChecked = false;
    public final boolean mIsEnabled = true;
    public final C14680q6 mOnCheckedChangeDelegate = null;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Toggle)) {
            return false;
        }
        Toggle toggle = (Toggle) obj;
        return this.mIsChecked == toggle.mIsChecked && this.mIsEnabled == toggle.mIsEnabled;
    }

    public int hashCode() {
        Object[] A0M = AnonymousClass002.A0M();
        AnonymousClass001.A1R(A0M, this.mIsChecked);
        AnonymousClass000.A1R(A0M, this.mIsEnabled);
        return Objects.hash(A0M);
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("[ isChecked: ");
        A0o.append(this.mIsChecked);
        A0o.append(", isEnabled: ");
        A0o.append(this.mIsEnabled);
        return AnonymousClass000.A0f(A0o);
    }
}
