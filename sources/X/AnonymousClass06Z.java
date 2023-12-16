package X;

import android.os.Bundle;

/* renamed from: X.06Z  reason: invalid class name */
public final class AnonymousClass06Z extends AnonymousClass0KR {
    public final String A00;

    public AnonymousClass06Z(String str, Bundle bundle) {
        super("androidx.credentials.TYPE_PUBLIC_KEY_CREDENTIAL", bundle);
        this.A00 = str;
        if (!AnonymousClass0IM.A00(str)) {
            throw AnonymousClass001.A0c("registrationResponseJson must not be empty, and must be a valid JSON");
        }
    }
}
