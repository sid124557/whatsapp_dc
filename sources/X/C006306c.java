package X;

import android.os.Bundle;

/* renamed from: X.06c  reason: invalid class name and case insensitive filesystem */
public final class C006306c extends AnonymousClass0KS {
    public final String A00;

    public C006306c(String str, Bundle bundle) {
        super("androidx.credentials.TYPE_PUBLIC_KEY_CREDENTIAL", bundle);
        this.A00 = str;
        if (!AnonymousClass0IM.A00(str)) {
            throw AnonymousClass001.A0c("authenticationResponseJson must not be empty, and must be a valid JSON");
        }
    }
}
