package androidx.car.app;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.C129526aS;
import androidx.car.app.navigation.model.NavigationTemplate;
import java.util.Objects;

public class SessionInfo {
    public static final C129526aS A00 = C129526aS.of(NavigationTemplate.class);
    public static final C129526aS A01 = C129526aS.of();
    public final int mDisplayType = 0;
    public final String mSessionId = "main";

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof SessionInfo)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        SessionInfo sessionInfo = (SessionInfo) obj;
        return this.mSessionId.equals(sessionInfo.mSessionId) && this.mDisplayType == sessionInfo.mDisplayType;
    }

    public int hashCode() {
        Object[] A0M = AnonymousClass002.A0M();
        A0M[0] = this.mSessionId;
        AnonymousClass000.A1M(A0M, this.mDisplayType);
        return Objects.hash(A0M);
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append(String.valueOf(this.mDisplayType));
        A0o.append('/');
        return AnonymousClass000.A0X(this.mSessionId, A0o);
    }
}
