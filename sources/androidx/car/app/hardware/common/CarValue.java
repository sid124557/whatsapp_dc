package androidx.car.app.hardware.common;

import X.AnonymousClass000;
import X.AnonymousClass001;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public final class CarValue {
    public static final CarValue A00 = new CarValue(2);
    public static final CarValue A01 = new CarValue(2);
    public static final CarValue A02 = new CarValue(0);
    public static final CarValue A03 = new CarValue(0);
    public static final CarValue A04 = new CarValue(0);
    public static final CarValue A05 = new CarValue(0);
    public static final CarValue A06 = new CarValue(0);
    public static final CarValue A07 = new CarValue(0);
    public final List mCarZones;
    public final int mStatus;
    public final long mTimestampMillis;
    public final Object mValue;

    public CarValue(int i) {
        this.mValue = null;
        this.mTimestampMillis = 0;
        this.mStatus = i;
        this.mCarZones = Collections.singletonList(CarZone.A00);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CarValue)) {
            return false;
        }
        CarValue carValue = (CarValue) obj;
        return Objects.equals(this.mValue, carValue.mValue) && this.mTimestampMillis == carValue.mTimestampMillis && this.mStatus == carValue.mStatus && Objects.equals(this.mCarZones, carValue.mCarZones);
    }

    public int hashCode() {
        Object[] objArr = new Object[4];
        objArr[0] = this.mValue;
        AnonymousClass001.A1Q(objArr, this.mTimestampMillis);
        AnonymousClass000.A1N(objArr, this.mStatus);
        return AnonymousClass001.A0L(this.mCarZones, objArr, 3);
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("[value: ");
        A0o.append(this.mValue);
        A0o.append(", timestamp: ");
        A0o.append(this.mTimestampMillis);
        A0o.append(", Status: ");
        A0o.append(this.mStatus);
        A0o.append(", CarZones: ");
        return AnonymousClass000.A0S(this.mCarZones, A0o);
    }

    public CarValue() {
        this.mValue = null;
        this.mTimestampMillis = 0;
        this.mStatus = 0;
        this.mCarZones = Collections.emptyList();
    }
}
