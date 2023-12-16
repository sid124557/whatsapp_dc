package androidx.test.internal.util;

import X.AnonymousClass001;
import android.os.StrictMode;
import androidx.test.internal.platform.ThreadChecker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ServiceLoader;

public final class Checks {
    public static final ThreadChecker A00;

    static {
        ThreadChecker threadChecker;
        Class<ThreadChecker> cls = ThreadChecker.class;
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        ArrayList A0s = AnonymousClass001.A0s();
        Iterator<S> it = ServiceLoader.load(cls).iterator();
        while (it.hasNext()) {
            A0s.add(it.next());
        }
        StrictMode.setThreadPolicy(allowThreadDiskReads);
        if (A0s.isEmpty()) {
            threadChecker = new ThreadChecker() {
            };
        } else if (A0s.size() == 1) {
            threadChecker = (ThreadChecker) A0s.get(0);
        } else {
            throw AnonymousClass001.A0e(String.format("Found more than one %s implementations.", new Object[]{cls.getName()}));
        }
        A00 = threadChecker;
    }
}
