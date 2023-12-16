package androidx.car.app.model;

import X.AnonymousClass000;
import X.AnonymousClass001;

public final class DurationSpan extends CarSpan {
    public final long mDurationSeconds = 0;

    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof DurationSpan) && this.mDurationSeconds == ((DurationSpan) obj).mDurationSeconds;
        }
        return true;
    }

    public int hashCode() {
        long j = this.mDurationSeconds;
        return (int) (j ^ (j >>> 32));
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("[seconds: ");
        A0o.append(this.mDurationSeconds);
        return AnonymousClass000.A0f(A0o);
    }
}
