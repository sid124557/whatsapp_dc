package androidx.car.app.model.signin;

import X.AnonymousClass001;
import X.AnonymousClass002;
import X.C14810qJ;
import android.net.Uri;
import java.util.Objects;

public final class QRCodeSignInMethod implements C14810qJ {
    public final Uri mUri = null;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof QRCodeSignInMethod)) {
            return false;
        }
        return Objects.equals(this.mUri, ((QRCodeSignInMethod) obj).mUri);
    }

    public int hashCode() {
        return AnonymousClass001.A0L(this.mUri, AnonymousClass002.A0L(), 0);
    }
}
