package X;

import android.net.Uri;

/* renamed from: X.2UQ  reason: invalid class name */
public abstract class AnonymousClass2UQ {
    public boolean A00(Uri uri) {
        String host;
        if (this instanceof AnonymousClass15R) {
            AnonymousClass15R r0 = (AnonymousClass15R) this;
            if (uri == null || (host = uri.getHost()) == null) {
                return false;
            }
            for (String str : r0.A00) {
                if (host.equals(str) || host.endsWith(AnonymousClass000.A0V(".", str, AnonymousClass001.A0o()))) {
                    return true;
                }
            }
            return false;
        } else if (this instanceof AnonymousClass15Q) {
            AnonymousClass15Q r02 = (AnonymousClass15Q) this;
            if (uri != null) {
                return r02.A00.contains(uri.getScheme());
            }
            return false;
        } else {
            AnonymousClass15P r03 = (AnonymousClass15P) this;
            if (uri == null) {
                return false;
            }
            for (AnonymousClass2UQ A00 : r03.A00) {
                if (!A00.A00(uri)) {
                    return false;
                }
            }
            return true;
        }
    }
}
