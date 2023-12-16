package X;

import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: X.6bL  reason: invalid class name and case insensitive filesystem */
public abstract class C130076bL extends C1447772x implements C188268yc {
    public static final C153187ao A00;
    public static final Object A01 = AnonymousClass002.A0D();
    public static final Logger A02;
    public static final boolean A03;
    public volatile C160107n3 listeners;
    public volatile Object value;
    public volatile C160067my waiters;

    public static void A02(C130076bL r4) {
        C160067my r1;
        C153187ao r2;
        C160107n3 r12;
        C160107n3 r3 = null;
        do {
            r1 = r4.waiters;
            r2 = A00;
        } while (!r2.A03(r1, C160067my.A00, r4));
        while (r1 != null) {
            Thread thread = r1.thread;
            if (thread != null) {
                r1.thread = null;
                LockSupport.unpark(thread);
            }
            r1 = r1.next;
        }
        do {
            r12 = r4.listeners;
        } while (!r2.A02(r12, C160107n3.A03, r4));
        while (r12 != null) {
            C160107n3 r0 = r12.A00;
            r12.A00 = r3;
            r3 = r12;
            r12 = r0;
        }
        while (r3 != null) {
            C160107n3 r22 = r3.A00;
            Runnable runnable = r3.A01;
            Objects.requireNonNull(runnable);
            Executor executor = r3.A02;
            Objects.requireNonNull(executor);
            A03(runnable, executor);
            r3 = r22;
        }
    }

    public final void A04(C160067my r6) {
        r6.thread = null;
        while (true) {
            C160067my r3 = this.waiters;
            if (r3 != C160067my.A00) {
                C160067my r2 = null;
                while (r3 != null) {
                    C160067my r1 = r3.next;
                    if (r3.thread != null) {
                        r2 = r3;
                    } else if (r2 != null) {
                        r2.next = r1;
                        if (r2.thread == null) {
                        }
                    } else if (!A00.A03(r3, r1, this)) {
                    }
                    r3 = r1;
                }
                return;
            }
            return;
        }
    }

    static {
        boolean z;
        C153187ao r6;
        Class<C160067my> cls = C160067my.class;
        try {
            z = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
        } catch (SecurityException unused) {
            z = false;
        }
        A03 = z;
        Class<C130076bL> cls2 = C130076bL.class;
        A02 = AnonymousClass6C8.A0m(cls2);
        Throwable th = null;
        try {
            r6 = new C130056bJ();
            th = null;
        } catch (Throwable th2) {
            th = th2;
            r6 = new C130036bH();
        }
        A00 = r6;
        if (th != null) {
            Logger logger = A02;
            Level level = Level.SEVERE;
            logger.log(level, "UnsafeAtomicHelper is broken!", th);
            logger.log(level, "SafeAtomicHelper is broken!", th);
        }
    }

    public static Object A01(Object obj) {
        if (obj instanceof C155967fo) {
            Throwable th = ((C155967fo) obj).A00;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th);
            throw cancellationException;
        } else if (obj instanceof C155897fh) {
            throw new ExecutionException(((C155897fh) obj).A00);
        } else if (obj == A01) {
            return null;
        } else {
            return obj;
        }
    }

    public void A05(Object obj) {
        if (obj == null) {
            obj = A01;
        }
        if (A00.A04(this, (Object) null, obj)) {
            A02(this);
        }
    }

    public void A06(Throwable th) {
        if (A00.A04(this, (Object) null, new C155897fh(th))) {
            A02(this);
        }
    }

    public void AwV(Runnable runnable, Executor executor) {
        C160107n3 r3;
        C160107n3 r2;
        C162187rP.A04(runnable, "Runnable was null.");
        C162187rP.A04(executor, "Executor was null.");
        if (isDone() || (r3 = this.listeners) == (r2 = C160107n3.A03)) {
            A03(runnable, executor);
        }
        C160107n3 r1 = new C160107n3(runnable, executor);
        do {
            r1.A00 = r3;
            if (!A00.A02(r3, r1, this)) {
                r3 = this.listeners;
            } else {
                return;
            }
        } while (r3 != r2);
        A03(runnable, executor);
    }

    public boolean cancel(boolean z) {
        C155967fo r1;
        Object obj = this.value;
        if (obj != null) {
            return false;
        }
        if (A03) {
            r1 = new C155967fo(new CancellationException("Future.cancel() was called."));
        } else {
            if (z) {
                r1 = C155967fo.A02;
            } else {
                r1 = C155967fo.A01;
            }
            Objects.requireNonNull(r1);
        }
        if (!A00.A04(this, obj, r1)) {
            return false;
        }
        A02(this);
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0107, code lost:
        if (r7 != false) goto L_0x0109;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object get(long r16, java.util.concurrent.TimeUnit r18) {
        /*
            r15 = this;
            r2 = r16
            r7 = r18
            long r0 = r7.toNanos(r2)
            boolean r4 = java.lang.Thread.interrupted()
            if (r4 != 0) goto L_0x0167
            java.lang.Object r4 = r15.value
            if (r4 == 0) goto L_0x0017
            java.lang.Object r0 = A01(r4)
            return r0
        L_0x0017:
            r13 = 0
            int r4 = (r0 > r13 ? 1 : (r0 == r13 ? 0 : -1))
            if (r4 <= 0) goto L_0x004c
            long r9 = java.lang.System.nanoTime()
            long r9 = r9 + r0
        L_0x0022:
            r11 = 1000(0x3e8, double:4.94E-321)
            int r4 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            if (r4 < 0) goto L_0x0072
            X.7my r8 = r15.waiters
            X.7my r5 = X.C160067my.A00
            if (r8 == r5) goto L_0x0042
            X.7my r6 = new X.7my
            r6.<init>()
        L_0x0033:
            X.7ao r4 = A00
            r4.A00(r6, r8)
            boolean r4 = r4.A03(r8, r6, r15)
            if (r4 != 0) goto L_0x004f
            X.7my r8 = r15.waiters
            if (r8 != r5) goto L_0x0033
        L_0x0042:
            java.lang.Object r0 = r15.value
            java.util.Objects.requireNonNull(r0)
            java.lang.Object r0 = A01(r0)
            return r0
        L_0x004c:
            r9 = 0
            goto L_0x0022
        L_0x004f:
            r4 = 2147483647999999999(0x1dcd64ffffffffff, double:3.98785104510193E-165)
            long r0 = java.lang.Math.min(r0, r4)
            java.util.concurrent.locks.LockSupport.parkNanos(r15, r0)
            boolean r0 = java.lang.Thread.interrupted()
            if (r0 != 0) goto L_0x015e
            java.lang.Object r0 = r15.value
            if (r0 != 0) goto L_0x0159
            long r4 = java.lang.System.nanoTime()
            long r0 = r9 - r4
            int r4 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            if (r4 >= 0) goto L_0x004f
            r15.A04(r6)
        L_0x0072:
            int r4 = (r0 > r13 ? 1 : (r0 == r13 ? 0 : -1))
            if (r4 <= 0) goto L_0x008d
            java.lang.Object r0 = r15.value
            if (r0 != 0) goto L_0x0159
            boolean r0 = java.lang.Thread.interrupted()
            if (r0 != 0) goto L_0x0087
            long r4 = java.lang.System.nanoTime()
            long r0 = r9 - r4
            goto L_0x0072
        L_0x0087:
            java.lang.InterruptedException r0 = new java.lang.InterruptedException
            r0.<init>()
            throw r0
        L_0x008d:
            java.lang.String r4 = r15.toString()
            java.lang.String r6 = r7.toString()
            java.util.Locale r5 = java.util.Locale.ROOT
            java.lang.String r9 = r6.toLowerCase(r5)
            int r5 = X.AnonymousClass6C7.A06(r9)
            int r5 = r5 + 28
            java.lang.StringBuilder r6 = X.AnonymousClass6CA.A0Y(r5)
            java.lang.String r5 = "Waited "
            r6.append(r5)
            r6.append(r2)
            java.lang.String r8 = " "
            java.lang.String r3 = X.AnonymousClass000.A0V(r8, r9, r6)
            long r5 = r0 + r11
            int r2 = (r5 > r13 ? 1 : (r5 == r13 ? 0 : -1))
            if (r2 >= 0) goto L_0x012a
            java.lang.String r3 = java.lang.String.valueOf(r3)
            java.lang.String r2 = " (plus "
            java.lang.String r10 = r3.concat(r2)
            long r2 = -r0
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.NANOSECONDS
            long r5 = r7.convert(r2, r0)
            long r0 = r7.toNanos(r5)
            long r2 = r2 - r0
            int r1 = (r5 > r13 ? 1 : (r5 == r13 ? 0 : -1))
            if (r1 == 0) goto L_0x0109
            int r0 = (r2 > r11 ? 1 : (r2 == r11 ? 0 : -1))
            boolean r7 = X.AnonymousClass001.A1W(r0)
            if (r1 <= 0) goto L_0x0107
            java.lang.String r1 = java.lang.String.valueOf(r10)
            int r0 = r1.length()
            int r0 = r0 + 21
            java.lang.StringBuilder r0 = X.AnonymousClass6C7.A0q(r9, r0)
            r0.append(r1)
            r0.append(r5)
            java.lang.String r0 = X.AnonymousClass000.A0V(r8, r9, r0)
            if (r7 == 0) goto L_0x00ff
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = ","
            java.lang.String r0 = r1.concat(r0)
        L_0x00ff:
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r10 = r0.concat(r8)
        L_0x0107:
            if (r7 == 0) goto L_0x0120
        L_0x0109:
            java.lang.String r1 = java.lang.String.valueOf(r10)
            int r0 = r1.length()
            int r0 = r0 + 33
            java.lang.StringBuilder r1 = X.AnonymousClass6C8.A0g(r0, r1)
            r1.append(r2)
            java.lang.String r0 = " nanoseconds "
            java.lang.String r10 = X.AnonymousClass000.A0X(r0, r1)
        L_0x0120:
            java.lang.String r1 = java.lang.String.valueOf(r10)
            java.lang.String r0 = "delay)"
            java.lang.String r3 = r1.concat(r0)
        L_0x012a:
            boolean r0 = r15.isDone()
            if (r0 == 0) goto L_0x0140
            java.lang.String r1 = java.lang.String.valueOf(r3)
            java.lang.String r0 = " but future completed as timeout expired"
            java.lang.String r1 = r1.concat(r0)
            java.util.concurrent.TimeoutException r0 = new java.util.concurrent.TimeoutException
            r0.<init>(r1)
            throw r0
        L_0x0140:
            int r0 = X.AnonymousClass6C7.A06(r3)
            int r0 = r0 + 5
            java.lang.StringBuilder r1 = X.AnonymousClass6C7.A0q(r4, r0)
            r1.append(r3)
            java.lang.String r0 = " for "
            java.lang.String r1 = X.AnonymousClass000.A0V(r0, r4, r1)
            java.util.concurrent.TimeoutException r0 = new java.util.concurrent.TimeoutException
            r0.<init>(r1)
            throw r0
        L_0x0159:
            java.lang.Object r0 = A01(r0)
            return r0
        L_0x015e:
            r15.A04(r6)
            java.lang.InterruptedException r0 = new java.lang.InterruptedException
            r0.<init>()
            throw r0
        L_0x0167:
            java.lang.InterruptedException r0 = new java.lang.InterruptedException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C130076bL.get(long, java.util.concurrent.TimeUnit):java.lang.Object");
    }

    public boolean isCancelled() {
        return this.value instanceof C155967fo;
    }

    public boolean isDone() {
        return true & AnonymousClass000.A1W(this.value);
    }

    public static void A03(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e) {
            Logger logger = A02;
            Level level = Level.SEVERE;
            String valueOf = String.valueOf(runnable);
            String valueOf2 = String.valueOf(executor);
            StringBuilder A0o = AnonymousClass6C7.A0o(valueOf.length() + 57, valueOf2);
            A0o.append("RuntimeException while executing runnable ");
            A0o.append(valueOf);
            logger.log(level, AnonymousClass000.A0V(" with executor ", valueOf2, A0o), e);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x0095  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String toString() {
        /*
            r7 = this;
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()
            java.lang.Class r3 = r7.getClass()
            java.lang.String r1 = r3.getName()
            java.lang.String r0 = "com.google.common.util.concurrent."
            boolean r0 = r1.startsWith(r0)
            if (r0 == 0) goto L_0x00fa
            java.lang.String r0 = r3.getSimpleName()
            r2.append(r0)
        L_0x001b:
            r0 = 64
            X.C18270x1.A18(r7, r2, r0)
            java.lang.String r0 = "[status="
            r2.append(r0)
            boolean r0 = r7.isCancelled()
            if (r0 == 0) goto L_0x0035
            java.lang.String r0 = "CANCELLED"
        L_0x002d:
            r2.append(r0)
        L_0x0030:
            java.lang.String r0 = X.AnonymousClass000.A0f(r2)
            return r0
        L_0x0035:
            boolean r0 = r7.isDone()
            if (r0 != 0) goto L_0x009c
            int r4 = r2.length()
            java.lang.String r0 = "PENDING"
            r2.append(r0)
            java.lang.String r5 = "]"
            boolean r0 = r7 instanceof java.util.concurrent.ScheduledFuture     // Catch:{ RuntimeException | StackOverflowError -> 0x006f }
            r1 = 0
            if (r0 == 0) goto L_0x0068
            r1 = r7
            java.util.concurrent.Delayed r1 = (java.util.concurrent.Delayed) r1     // Catch:{ RuntimeException | StackOverflowError -> 0x006f }
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ RuntimeException | StackOverflowError -> 0x006f }
            long r0 = r1.getDelay(r0)     // Catch:{ RuntimeException | StackOverflowError -> 0x006f }
            r3 = 41
            java.lang.StringBuilder r6 = X.AnonymousClass6CA.A0Y(r3)     // Catch:{ RuntimeException | StackOverflowError -> 0x006f }
            java.lang.String r3 = "remaining delay=["
            r6.append(r3)     // Catch:{ RuntimeException | StackOverflowError -> 0x006f }
            r6.append(r0)     // Catch:{ RuntimeException | StackOverflowError -> 0x006f }
            java.lang.String r0 = " ms]"
            java.lang.String r1 = X.AnonymousClass000.A0X(r0, r6)     // Catch:{ RuntimeException | StackOverflowError -> 0x006f }
        L_0x0068:
            boolean r0 = X.C159707mK.A00(r1)     // Catch:{ RuntimeException | StackOverflowError -> 0x006f }
            if (r0 == 0) goto L_0x0088
            goto L_0x008f
        L_0x006f:
            r0 = move-exception
            java.lang.Class r0 = r0.getClass()
            java.lang.String r3 = java.lang.String.valueOf(r0)
            int r0 = r3.length()
            int r0 = r0 + 38
            java.lang.StringBuilder r1 = X.AnonymousClass6CA.A0Y(r0)
            java.lang.String r0 = "Exception thrown from implementation: "
            java.lang.String r1 = X.AnonymousClass000.A0V(r0, r3, r1)
        L_0x0088:
            if (r1 == 0) goto L_0x008f
            java.lang.String r0 = ", info=["
            X.AnonymousClass001.A1K(r0, r1, r5, r2)
        L_0x008f:
            boolean r0 = r7.isDone()
            if (r0 == 0) goto L_0x0030
            int r0 = r2.length()
            r2.delete(r4, r0)
        L_0x009c:
            java.lang.String r4 = "]"
            r3 = 0
        L_0x009f:
            java.lang.Object r1 = r7.get()     // Catch:{ InterruptedException -> 0x00a4, all -> 0x00d3 }
            goto L_0x00a6
        L_0x00a4:
            r3 = 1
            goto L_0x009f
        L_0x00a6:
            if (r3 == 0) goto L_0x00ab
            X.C18300x5.A11()     // Catch:{ ExecutionException -> 0x00e8, CancellationException -> 0x00e4, RuntimeException -> 0x00da }
        L_0x00ab:
            java.lang.String r0 = "SUCCESS, result=["
            r2.append(r0)     // Catch:{ ExecutionException -> 0x00e8, CancellationException -> 0x00e4, RuntimeException -> 0x00da }
            if (r1 != 0) goto L_0x00b3
            goto L_0x00c9
        L_0x00b3:
            if (r1 != r7) goto L_0x00b8
            java.lang.String r0 = "this future"
            goto L_0x00cb
        L_0x00b8:
            java.lang.String r0 = X.AnonymousClass000.A0O(r1)     // Catch:{ ExecutionException -> 0x00e8, CancellationException -> 0x00e4, RuntimeException -> 0x00da }
            r2.append(r0)     // Catch:{ ExecutionException -> 0x00e8, CancellationException -> 0x00e4, RuntimeException -> 0x00da }
            java.lang.String r0 = "@"
            r2.append(r0)     // Catch:{ ExecutionException -> 0x00e8, CancellationException -> 0x00e4, RuntimeException -> 0x00da }
            java.lang.String r0 = X.AnonymousClass6CA.A0S(r1)     // Catch:{ ExecutionException -> 0x00e8, CancellationException -> 0x00e4, RuntimeException -> 0x00da }
            goto L_0x00cb
        L_0x00c9:
            java.lang.String r0 = "null"
        L_0x00cb:
            r2.append(r0)     // Catch:{ ExecutionException -> 0x00e8, CancellationException -> 0x00e4, RuntimeException -> 0x00da }
            r2.append(r4)     // Catch:{ ExecutionException -> 0x00e8, CancellationException -> 0x00e4, RuntimeException -> 0x00da }
            goto L_0x0030
        L_0x00d3:
            r0 = move-exception
            if (r3 == 0) goto L_0x00d9
            X.C18300x5.A11()     // Catch:{ ExecutionException -> 0x00e8, CancellationException -> 0x00e4, RuntimeException -> 0x00da }
        L_0x00d9:
            throw r0     // Catch:{ ExecutionException -> 0x00e8, CancellationException -> 0x00e4, RuntimeException -> 0x00da }
        L_0x00da:
            r1 = move-exception
            java.lang.String r0 = "UNKNOWN, cause=["
            X.AnonymousClass6C7.A1O(r2, r0, r1)
            java.lang.String r0 = " thrown from get()]"
            goto L_0x002d
        L_0x00e4:
            java.lang.String r0 = "CANCELLED"
            goto L_0x002d
        L_0x00e8:
            r1 = move-exception
            java.lang.String r0 = "FAILURE, cause=["
            r2.append(r0)
            java.lang.Throwable r0 = r1.getCause()
            r2.append(r0)
            r2.append(r4)
            goto L_0x0030
        L_0x00fa:
            r2.append(r1)
            goto L_0x001b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C130076bL.toString():java.lang.String");
    }

    public Object get() {
        if (!Thread.interrupted()) {
            Object obj = this.value;
            if (obj == null) {
                C160067my r3 = this.waiters;
                C160067my r2 = C160067my.A00;
                if (r3 != r2) {
                    C160067my r1 = new C160067my();
                    while (true) {
                        C153187ao r0 = A00;
                        r0.A00(r1, r3);
                        if (!r0.A03(r3, r1, this)) {
                            r3 = this.waiters;
                            if (r3 == r2) {
                                break;
                            }
                        } else {
                            do {
                                LockSupport.park(this);
                                if (!Thread.interrupted()) {
                                    obj = this.value;
                                } else {
                                    A04(r1);
                                    throw new InterruptedException();
                                }
                            } while (obj == null);
                        }
                    }
                } else {
                    obj = this.value;
                    Objects.requireNonNull(obj);
                }
            }
            return A01(obj);
        }
        throw new InterruptedException();
    }
}
