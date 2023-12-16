package com.facebook.profilo.provider.atrace;

import X.AnonymousClass000;
import X.AnonymousClass78M;
import X.C126206Mw;
import com.facebook.profilo.logger.MultiBufferLogger;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public final class Atrace {
    public static boolean sHasHook;
    public static boolean sHookFailed;

    public static native void enableSystraceNative();

    public static native boolean installSystraceHook(MultiBufferLogger multiBufferLogger, int i);

    public static native boolean isEnabled();

    public static native void restoreSystraceNative();

    public static synchronized boolean hasHacks(MultiBufferLogger multiBufferLogger) {
        boolean z;
        synchronized (Atrace.class) {
            z = sHasHook;
            if (!z && !sHookFailed) {
                z = installSystraceHook(multiBufferLogger, C126206Mw.A00);
                sHasHook = z;
                sHookFailed = AnonymousClass000.A1T(z ? 1 : 0);
            }
        }
        return z;
    }

    public static void enableSystrace(MultiBufferLogger multiBufferLogger) {
        Method method;
        if (hasHacks(multiBufferLogger)) {
            enableSystraceNative();
            Field field = AnonymousClass78M.A00;
            if (field != null && (method = AnonymousClass78M.A01) != null) {
                try {
                    field.set((Object) null, method.invoke((Object) null, new Object[0]));
                } catch (IllegalAccessException | InvocationTargetException unused) {
                }
            }
        }
    }

    public static void restoreSystrace(MultiBufferLogger multiBufferLogger) {
        Method method;
        if (hasHacks(multiBufferLogger)) {
            restoreSystraceNative();
            Field field = AnonymousClass78M.A00;
            if (field != null && (method = AnonymousClass78M.A01) != null) {
                try {
                    field.set((Object) null, method.invoke((Object) null, new Object[0]));
                } catch (IllegalAccessException | InvocationTargetException unused) {
                }
            }
        }
    }
}
