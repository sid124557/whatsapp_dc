package androidx.car.app.hardware.info;

import X.AnonymousClass000;
import X.AnonymousClass001;
import androidx.car.app.hardware.common.CarValue;
import java.util.Objects;

public final class Model {
    public final CarValue mManufacturer;
    public final CarValue mName;
    public final CarValue mYear = CarValue.A05;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Model)) {
            return false;
        }
        Model model = (Model) obj;
        return Objects.equals(this.mName, model.mName) && Objects.equals(this.mYear, model.mYear) && Objects.equals(this.mManufacturer, model.mManufacturer);
    }

    public int hashCode() {
        Object[] objArr = new Object[3];
        objArr[0] = this.mName;
        objArr[1] = this.mYear;
        return AnonymousClass001.A0L(this.mManufacturer, objArr, 2);
    }

    public Model() {
        CarValue carValue = CarValue.A07;
        this.mName = carValue;
        this.mManufacturer = carValue;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("[ name: ");
        A0o.append(this.mName);
        A0o.append(", year: ");
        A0o.append(this.mYear);
        A0o.append(", manufacturer: ");
        return AnonymousClass000.A0S(this.mManufacturer, A0o);
    }
}
