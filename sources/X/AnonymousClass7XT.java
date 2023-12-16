package X;

import android.os.Build;
import android.os.Trace;

/* renamed from: X.7XT  reason: invalid class name */
public final class AnonymousClass7XT {
    public void A00() {
        if (C1454976c.A00) {
            Trace.endSection();
        }
    }

    public void A01(String str) {
        if (C1454976c.A00) {
            Trace.beginSection(str);
        }
    }

    public boolean A02() {
        if (!C1454976c.A00) {
            return false;
        }
        if (Build.VERSION.SDK_INT < 29 || Trace.isEnabled()) {
            return true;
        }
        return false;
    }
}
