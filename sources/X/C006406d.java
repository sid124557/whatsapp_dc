package X;

import android.os.Bundle;

/* renamed from: X.06d  reason: invalid class name and case insensitive filesystem */
public final class C006406d extends AnonymousClass0KS {
    public C006406d(String str, Bundle bundle) {
        super("android.credentials.TYPE_PASSWORD_CREDENTIAL", bundle);
        if (str.length() <= 0) {
            throw AnonymousClass001.A0c("password should not be empty");
        }
    }
}
