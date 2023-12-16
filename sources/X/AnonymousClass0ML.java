package X;

import android.os.Bundle;
import java.util.Set;

/* renamed from: X.0ML  reason: invalid class name */
public abstract class AnonymousClass0ML {
    public final Bundle A00;
    public final Bundle A01;
    public final String A02;
    public final Set A03;
    public final boolean A04;

    public AnonymousClass0ML(Bundle bundle, Bundle bundle2, String str, Set set, boolean z) {
        this.A02 = str;
        this.A01 = bundle;
        this.A00 = bundle2;
        this.A04 = z;
        this.A03 = set;
        bundle.putBoolean("androidx.credentials.BUNDLE_KEY_IS_AUTO_SELECT_ALLOWED", z);
        bundle2.putBoolean("androidx.credentials.BUNDLE_KEY_IS_AUTO_SELECT_ALLOWED", z);
    }
}
