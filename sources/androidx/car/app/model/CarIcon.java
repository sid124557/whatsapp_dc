package androidx.car.app.model;

import X.AnonymousClass000;
import X.AnonymousClass001;
import androidx.core.graphics.drawable.IconCompat;
import java.util.Objects;

public final class CarIcon {
    public static final CarIcon A00;
    public static final CarIcon A01;
    public static final CarIcon A02;
    public static final CarIcon A03;
    public static final CarIcon A04;
    public final IconCompat mIcon;
    public final CarColor mTint;
    public final int mType;

    public CarIcon(CarColor carColor, int i) {
        this.mType = i;
        this.mIcon = null;
        this.mTint = carColor;
    }

    public boolean equals(Object obj) {
        int A05;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CarIcon)) {
            return false;
        }
        CarIcon carIcon = (CarIcon) obj;
        if (this.mType == carIcon.mType && Objects.equals(this.mTint, carIcon.mTint)) {
            IconCompat iconCompat = carIcon.mIcon;
            IconCompat iconCompat2 = this.mIcon;
            if (iconCompat2 == null) {
                if (iconCompat == null) {
                    return true;
                }
            } else if (iconCompat != null && (A05 = iconCompat2.A05()) == iconCompat.A05()) {
                if (A05 == 2) {
                    return Objects.equals(this.mIcon.A0D(), iconCompat.A0D()) && this.mIcon.A04() == iconCompat.A04();
                }
                if (A05 != 4 || Objects.equals(this.mIcon.A0A(), iconCompat.A0A())) {
                    return true;
                }
            }
        }
    }

    public int hashCode() {
        Object valueOf;
        Object[] objArr = new Object[3];
        AnonymousClass000.A1L(objArr, this.mType);
        objArr[1] = this.mTint;
        IconCompat iconCompat = this.mIcon;
        if (iconCompat == null) {
            valueOf = null;
        } else {
            int A05 = iconCompat.A05();
            if (A05 == 2) {
                StringBuilder A0o = AnonymousClass001.A0o();
                A0o.append(this.mIcon.A0D());
                valueOf = AnonymousClass000.A0h(A0o, this.mIcon.A04());
            } else if (A05 == 4) {
                valueOf = this.mIcon.A0A();
            } else {
                valueOf = Integer.valueOf(A05);
            }
        }
        return AnonymousClass001.A0L(valueOf, objArr, 2);
    }

    static {
        CarColor carColor = CarColor.A00;
        A01 = new CarIcon(carColor, 5);
        A02 = new CarIcon(carColor, 3);
        A00 = new CarIcon(carColor, 4);
        A03 = new CarIcon(carColor, 6);
        A04 = new CarIcon(carColor, 7);
    }

    public String toString() {
        String str;
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("[type: ");
        int i = this.mType;
        if (i == 1) {
            str = "CUSTOM";
        } else if (i == 3) {
            str = "BACK";
        } else if (i == 4) {
            str = "ALERT";
        } else if (i == 5) {
            str = "APP";
        } else if (i == 6) {
            str = "ERROR";
        } else if (i != 7) {
            str = "<unknown>";
        } else {
            str = "PAN";
        }
        A0o.append(str);
        A0o.append(", tint: ");
        return AnonymousClass000.A0S(this.mTint, A0o);
    }

    public CarIcon() {
        this.mType = 1;
        this.mIcon = null;
        this.mTint = null;
    }
}
