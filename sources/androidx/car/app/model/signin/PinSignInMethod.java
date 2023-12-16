package androidx.car.app.model.signin;

import X.AnonymousClass001;
import X.AnonymousClass002;
import X.C14810qJ;
import androidx.car.app.model.CarText;
import java.util.Objects;

public final class PinSignInMethod implements C14810qJ {
    public final CarText mPinCode = null;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PinSignInMethod)) {
            return false;
        }
        return Objects.equals(this.mPinCode, ((PinSignInMethod) obj).mPinCode);
    }

    public int hashCode() {
        return AnonymousClass001.A0L(this.mPinCode, AnonymousClass002.A0L(), 0);
    }
}
