package X;

import java.lang.reflect.Method;
import java.util.concurrent.ScheduledThreadPoolExecutor;

/* renamed from: X.2Bh  reason: invalid class name and case insensitive filesystem */
public final class C39262Bh {
    public static final Method A00;

    static {
        Method method;
        Class<ScheduledThreadPoolExecutor> cls = ScheduledThreadPoolExecutor.class;
        try {
            method = cls.getMethod("setRemoveOnCancelPolicy", new Class[]{Boolean.TYPE});
        } catch (Throwable unused) {
            method = null;
        }
        A00 = method;
    }
}
