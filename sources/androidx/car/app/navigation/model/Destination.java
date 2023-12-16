package androidx.car.app.navigation.model;

import X.AnonymousClass000;
import X.AnonymousClass001;
import androidx.car.app.model.CarIcon;
import androidx.car.app.model.CarText;
import java.util.Objects;

public final class Destination {
    public final CarText mAddress = null;
    public final CarIcon mImage = null;
    public final CarText mName = null;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Destination)) {
            return false;
        }
        Destination destination = (Destination) obj;
        return Objects.equals(this.mName, destination.mName) && Objects.equals(this.mAddress, destination.mAddress) && Objects.equals(this.mImage, destination.mImage);
    }

    public int hashCode() {
        Object[] objArr = new Object[3];
        objArr[0] = this.mName;
        objArr[1] = this.mAddress;
        return AnonymousClass001.A0L(this.mImage, objArr, 2);
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("[name: ");
        AnonymousClass001.A1B(this.mName, A0o);
        A0o.append(", address: ");
        AnonymousClass001.A1B(this.mAddress, A0o);
        A0o.append(", image: ");
        return AnonymousClass000.A0S(this.mImage, A0o);
    }
}
