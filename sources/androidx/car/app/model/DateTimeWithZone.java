package androidx.car.app.model;

import X.AnonymousClass000;
import X.AnonymousClass001;
import java.util.Date;
import java.util.Objects;
import java.util.concurrent.TimeUnit;

public final class DateTimeWithZone {
    public final long mTimeSinceEpochMillis = 0;
    public final int mZoneOffsetSeconds = 0;
    public final String mZoneShortName = null;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DateTimeWithZone)) {
            return false;
        }
        DateTimeWithZone dateTimeWithZone = (DateTimeWithZone) obj;
        return this.mTimeSinceEpochMillis == dateTimeWithZone.mTimeSinceEpochMillis && this.mZoneOffsetSeconds == dateTimeWithZone.mZoneOffsetSeconds && Objects.equals(this.mZoneShortName, dateTimeWithZone.mZoneShortName);
    }

    public int hashCode() {
        Object[] objArr = new Object[3];
        objArr[0] = Long.valueOf(this.mTimeSinceEpochMillis);
        AnonymousClass000.A1M(objArr, this.mZoneOffsetSeconds);
        return AnonymousClass001.A0L(this.mZoneShortName, objArr, 2);
    }

    static {
        TimeUnit.HOURS.toSeconds(1);
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("[time since epoch (ms): ");
        long j = this.mTimeSinceEpochMillis;
        A0o.append(j);
        A0o.append("( ");
        A0o.append(new Date(j));
        A0o.append(")  zone offset (s): ");
        A0o.append(this.mZoneOffsetSeconds);
        A0o.append(", zone: ");
        return AnonymousClass000.A0W(this.mZoneShortName, A0o);
    }
}
