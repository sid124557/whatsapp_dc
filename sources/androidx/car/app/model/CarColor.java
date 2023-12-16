package androidx.car.app.model;

import X.AnonymousClass000;
import X.AnonymousClass001;
import java.util.Objects;

public final class CarColor {
    public static final CarColor A00 = new CarColor(1);
    public final int mColor = 0;
    public final int mColorDark = 0;
    public final int mType = 1;

    public CarColor(int i) {
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CarColor)) {
            return false;
        }
        CarColor carColor = (CarColor) obj;
        return this.mColor == carColor.mColor && this.mColorDark == carColor.mColorDark && this.mType == carColor.mType;
    }

    public int hashCode() {
        Object[] objArr = new Object[3];
        AnonymousClass000.A1L(objArr, this.mType);
        AnonymousClass000.A1M(objArr, this.mColor);
        AnonymousClass000.A1N(objArr, this.mColorDark);
        return Objects.hash(objArr);
    }

    public String toString() {
        String str;
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("[type: ");
        switch (this.mType) {
            case 0:
                str = "CUSTOM";
                break;
            case 1:
                str = "DEFAULT";
                break;
            case 2:
                str = "PRIMARY";
                break;
            case 3:
                str = "SECONDARY";
                break;
            case 4:
                str = "RED";
                break;
            case 5:
                str = "GREEN";
                break;
            case 6:
                str = "BLUE";
                break;
            case 7:
                str = "YELLOW";
                break;
            default:
                str = "<unknown>";
                break;
        }
        A0o.append(str);
        A0o.append(", color: ");
        A0o.append(this.mColor);
        A0o.append(", dark: ");
        A0o.append(this.mColorDark);
        return AnonymousClass000.A0f(A0o);
    }

    public CarColor() {
    }
}
