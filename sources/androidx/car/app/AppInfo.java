package androidx.car.app;

import X.AnonymousClass000;
import X.AnonymousClass001;
import java.util.Objects;

public final class AppInfo {
    public final int mLatestCarAppApiLevel = 0;
    public final String mLibraryVersion = null;
    public final int mMinCarAppApiLevel = 0;

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("Library version: [");
        String str = this.mLibraryVersion;
        Objects.requireNonNull(str);
        A0o.append(str);
        A0o.append("] Min Car Api Level: [");
        A0o.append(this.mMinCarAppApiLevel);
        A0o.append("] Latest Car App Api Level: [");
        A0o.append(this.mLatestCarAppApiLevel);
        return AnonymousClass000.A0f(A0o);
    }
}
