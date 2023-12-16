package com.facebook.msys.mci;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass0RZ;
import X.AnonymousClass0x9;
import X.AnonymousClass6C7;
import X.AnonymousClass8M9;
import X.C172568Lu;
import X.C173818Ru;
import X.C18280x3;
import X.C70453aW;
import android.os.Looper;
import com.facebook.simplejni.NativeHolder;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

public class Execution {
    public static final int INVALID_THREAD_PRIORITY = Integer.MIN_VALUE;
    public static volatile boolean sInitialized;
    public static final ConcurrentHashMap sThreadIds = AnonymousClass0x9.A1D();
    public static final ThreadLocal sThreadLocalExecutionContext = new C173818Ru();
    public static final AtomicInteger sThreadPriority = new AtomicInteger(Integer.MIN_VALUE);
    public static final ConcurrentHashMap sThreadPriorityMap = AnonymousClass0x9.A1D();
    public static Executor sUiThreadSchedulingExecutor;

    public static void executeAfter(C172568Lu r1, int i, long j) {
        executeAfterWithPriority(r1, i, 0, j);
    }

    public static void executeAfterWithPriority(C172568Lu r5, int i, int i2, long j) {
        C172568Lu r2 = r5;
        assertInitialized(r5.toString());
        int i3 = i;
        int i4 = i2;
        long j2 = j;
        if (sUiThreadSchedulingExecutor == null || Looper.myLooper() != Looper.getMainLooper()) {
            executeAfterWithPriorityInternal(r5, i3, i4, j);
        } else {
            sUiThreadSchedulingExecutor.execute(new C70453aW(r2, i3, i4, 0, j2));
        }
    }

    public static void executeAfterWithPriorityInternal(C172568Lu r6, int i, int i2, long j) {
        if (!nativeScheduleTask(r6, i, i2, ((double) j) / 1000.0d, r6.toString())) {
            throw AnonymousClass002.A0E(AnonymousClass000.A0Y("UNKNOWN execution context ", AnonymousClass001.A0o(), i));
        }
    }

    public static void executeAsync(C172568Lu r1, int i) {
        executeAsyncWithPriority(r1, i, 0);
    }

    public static native int nativeGetExecutionContext();

    public static native void nativeInitialize();

    public static native void nativeResetExecutorsTestingOnly();

    public static native boolean nativeScheduleTask(Runnable runnable, int i, int i2, double d, String str);

    public static native void nativeStartExecutor(int i);

    public static native void setLoggingThresholds(double d, double d2);

    public static void startExecutorThread(int i, String str) {
        new Thread(new AnonymousClass8M9(i, 0), AnonymousClass000.A0X("Context", AnonymousClass000.A0l(str))).start();
    }

    public static void assertInitialized(String str) {
        if (!sInitialized) {
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("Execution was called by ");
            A0o.append(str);
            A0o.append(" but was not initialized before being used");
            throw AnonymousClass6C7.A0e(A0o);
        }
    }

    public static int getExecutionContext() {
        if (sInitialized) {
            return AnonymousClass001.A0K(sThreadLocalExecutionContext.get());
        }
        return 0;
    }

    public static synchronized boolean initialize(Executor executor) {
        synchronized (Execution.class) {
            AnonymousClass0RZ.A01("Execution.initialize");
            try {
                if (sInitialized) {
                    AnonymousClass0RZ.A00();
                    return false;
                }
                sUiThreadSchedulingExecutor = executor;
                nativeInitialize();
                synchronized (TaskTracker.class) {
                    int i = 0;
                    if (!TaskTracker.sInitialized) {
                        TaskTracker[] taskTrackerArr = {TaskTracker.TRACKER_MAIN, TaskTracker.TRACKER_DATABASE, TaskTracker.TRACKER_NETWORK, TaskTracker.TRACKER_UTILITY, TaskTracker.TRACKER_CRYPTO, TaskTracker.TRACKER_DATABASE_READ_ONLY};
                        int[] iArr = new int[6];
                        String[] strArr = new String[6];
                        int i2 = 0;
                        do {
                            TaskTracker taskTracker = taskTrackerArr[i2];
                            iArr[i2] = taskTracker.mExecutionContext;
                            strArr[i2] = taskTracker.mQueueName;
                            i2++;
                        } while (i2 < 6);
                        NativeHolder[] initNativeHolders = TaskTracker.initNativeHolders(iArr, strArr);
                        do {
                            taskTrackerArr[i].mNativeHolder = initNativeHolders[i];
                            i++;
                        } while (i < 6);
                        TaskTracker.sInitialized = true;
                    }
                }
                sInitialized = true;
                AnonymousClass0RZ.A00();
                return true;
            } catch (Throwable th) {
                AnonymousClass0RZ.A00();
                throw th;
            }
        }
    }

    public static boolean isMCPEnabledForExecution() {
        return false;
    }

    public static void resetExecutorsForTestingOnly() {
        sThreadIds.clear();
        sThreadPriorityMap.clear();
        nativeResetExecutorsTestingOnly();
    }

    public static boolean setInitializedForTestingOnly(boolean z) {
        boolean z2 = sInitialized;
        sInitialized = z;
        return z2;
    }

    public static void setThreadPriorities(Map map) {
        sThreadPriorityMap.clear();
        if (map != null) {
            Iterator A0q = AnonymousClass000.A0q(map);
            while (A0q.hasNext()) {
                Map.Entry A0w = AnonymousClass001.A0w(A0q);
                setThreadPriority(C18280x3.A06(A0w), (Integer) A0w.getValue());
            }
        }
    }

    public static void setThreadPriority(int i, Integer num) {
        ConcurrentHashMap concurrentHashMap = sThreadPriorityMap;
        Integer valueOf = Integer.valueOf(i);
        concurrentHashMap.put(valueOf, num);
        sThreadIds.get(valueOf);
    }

    public static Executor setUiThreadSchedulingExecutorForTestingOnly(Executor executor) {
        Executor executor2 = sUiThreadSchedulingExecutor;
        sUiThreadSchedulingExecutor = executor;
        return executor2;
    }

    public static boolean callingThreadMatchesExecutionContext(int i) {
        return AnonymousClass000.A1U(getExecutionContext(), i);
    }

    public static void ensureNotOnDatabaseThread() {
        if (getExecutionContext() == 2) {
            throw AnonymousClass001.A0e("The task can not run on Database thread");
        }
    }

    public static void ensureNotOnMsysThread() {
        if (AnonymousClass000.A1S(getExecutionContext())) {
            throw AnonymousClass001.A0e("The task cannot run on any MSYS thread");
        }
    }

    public static void executeAsyncWithPriority(C172568Lu r2, int i, int i2) {
        assertInitialized(r2.toString());
        executeAfterWithPriority(r2, i, i2, 0);
    }

    public static void executePossiblySync(C172568Lu r1, int i) {
        assertInitialized(r1.toString());
        if (AnonymousClass000.A1U(getExecutionContext(), i)) {
            r1.run();
        } else {
            executeAsyncWithPriority(r1, i, 0);
        }
    }

    public static boolean isOnMsysMainContext() {
        return AnonymousClass001.A1T(getExecutionContext());
    }

    public static boolean isOnMsysThread() {
        return AnonymousClass000.A1S(getExecutionContext());
    }

    public static synchronized boolean initialize() {
        boolean initialize;
        synchronized (Execution.class) {
            initialize = initialize((Executor) null);
        }
        return initialize;
    }

    public static void setThreadPriorities(Integer num) {
        sThreadPriority.set(num.intValue());
    }
}
