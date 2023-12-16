package androidx.car.app.hardware.common;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass002;
import java.util.Objects;

public final class CarZone {
    public static final CarZone A00 = new CarZone(16, 0);
    public final int mColumn = 0;
    public final int mRow = 0;

    public CarZone(int i, int i2) {
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CarZone)) {
            return false;
        }
        CarZone carZone = (CarZone) obj;
        return Objects.equals(Integer.valueOf(this.mColumn), Integer.valueOf(carZone.mColumn)) && Objects.equals(Integer.valueOf(this.mRow), Integer.valueOf(carZone.mRow));
    }

    public String toString() {
        String str;
        int i = this.mRow;
        String str2 = "UNKNOWN";
        if (i == 0) {
            str = "CAR_ZONE_ROW_ALL";
        } else if (i == 1) {
            str = "CAR_ZONE_ROW_FIRST";
        } else if (i == 2) {
            str = "CAR_ZONE_ROW_SECOND";
        } else if (i == 3) {
            str = "CAR_ZONE_ROW_THIRD";
        } else if (i != 4) {
            str = str2;
        } else {
            str = "CAR_ZONE_ROW_EXCLUDE_FIRST";
        }
        int i2 = this.mColumn;
        if (i2 == 16) {
            str2 = "CAR_ZONE_COLUMN_ALL";
        } else if (i2 == 32) {
            str2 = "CAR_ZONE_COLUMN_LEFT";
        } else if (i2 == 48) {
            str2 = "CAR_ZONE_COLUMN_CENTER";
        } else if (i2 == 64) {
            str2 = "CAR_ZONE_COLUMN_RIGHT";
        } else if (i2 == 80) {
            str2 = "CAR_ZONE_COLUMN_DRIVER";
        } else if (i2 == 96) {
            str2 = "CAR_ZONE_COLUMN_PASSENGER";
        }
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("[CarZone row value: ");
        A0o.append(str);
        A0o.append(", column value: ");
        return AnonymousClass000.A0W(str2, A0o);
    }

    public CarZone() {
    }

    public int hashCode() {
        Object[] A0M = AnonymousClass002.A0M();
        AnonymousClass000.A1L(A0M, this.mRow);
        AnonymousClass000.A1M(A0M, this.mColumn);
        return Objects.hash(A0M);
    }
}
