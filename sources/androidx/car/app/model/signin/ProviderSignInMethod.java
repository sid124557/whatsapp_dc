package androidx.car.app.model.signin;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.C14810qJ;
import androidx.car.app.model.Action;
import java.util.Objects;

public final class ProviderSignInMethod implements C14810qJ {
    public final Action mAction = null;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProviderSignInMethod)) {
            return false;
        }
        return Objects.equals(this.mAction, ((ProviderSignInMethod) obj).mAction);
    }

    public int hashCode() {
        return AnonymousClass001.A0L(this.mAction, AnonymousClass002.A0L(), 0);
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("[action:");
        return AnonymousClass000.A0S(this.mAction, A0o);
    }
}
