package X;

import android.os.Bundle;
import android.os.Parcelable;

/* renamed from: X.0Hr  reason: invalid class name and case insensitive filesystem */
public final class C02810Hr {
    public static Object A00(Bundle bundle, Class cls, String str) {
        if (AnonymousClass0WZ.A02()) {
            return C02800Hq.A00(bundle, cls, str);
        }
        Parcelable parcelable = bundle.getParcelable(str);
        if (!cls.isInstance(parcelable)) {
            return null;
        }
        return parcelable;
    }
}
