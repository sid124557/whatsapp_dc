package X;

import android.system.Os;
import android.system.OsConstants;

/* renamed from: X.76K  reason: invalid class name */
public class AnonymousClass76K {
    public static final long A00;

    static {
        long j = 100;
        long sysconf = Os.sysconf(OsConstants._SC_CLK_TCK);
        if (sysconf > 0) {
            j = sysconf;
        }
        A00 = j;
    }
}
