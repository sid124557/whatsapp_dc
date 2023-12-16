package X;

import android.os.Bundle;

/* renamed from: X.0Lg  reason: invalid class name and case insensitive filesystem */
public abstract class C03710Lg {
    public final Bundle A00;
    public final Bundle A01;
    public final AnonymousClass0L8 A02;

    public C03710Lg(Bundle bundle, Bundle bundle2, AnonymousClass0L8 r7) {
        this.A01 = bundle;
        this.A00 = bundle2;
        this.A02 = r7;
        bundle.putBoolean("androidx.credentials.BUNDLE_KEY_IS_AUTO_SELECT_ALLOWED", false);
        bundle.putBoolean("androidx.credentials.BUNDLE_KEY_PREFER_IMMEDIATELY_AVAILABLE_CREDENTIALS", true);
        bundle2.putBoolean("androidx.credentials.BUNDLE_KEY_IS_AUTO_SELECT_ALLOWED", false);
    }
}
