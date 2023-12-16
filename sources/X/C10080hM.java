package X;

import java.util.concurrent.CancellationException;
import java.util.concurrent.Delayed;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: X.0hM  reason: invalid class name and case insensitive filesystem */
public abstract class C10080hM implements C188268yc {
    public static final AnonymousClass0QM A00;
    public static final Object A01 = AnonymousClass002.A0D();
    public static final Logger A02;
    public static final boolean A03 = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
    public volatile AnonymousClass0T9 listeners;
    public volatile Object value;
    public volatile C05950Vp waiters;

    public static void A02(C10080hM r4) {
        C05950Vp r1;
        AnonymousClass0QM r2;
        AnonymousClass0T9 r12;
        AnonymousClass0T9 r3 = null;
        do {
            r1 = r4.waiters;
            r2 = A00;
        } while (!r2.A03(r1, C05950Vp.A00, r4));
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
        } while (!r2.A02(r12, AnonymousClass0T9.A03, r4));
        while (r12 != null) {
            AnonymousClass0T9 r0 = r12.A00;
            r12.A00 = r3;
            r3 = r12;
            r12 = r0;
        }
        while (r3 != null) {
            AnonymousClass0T9 r22 = r3.A00;
            A03(r3.A01, r3.A02);
            r3 = r22;
        }
    }

    public final void A05(C05950Vp r6) {
        r6.thread = null;
        while (true) {
            C05950Vp r3 = this.waiters;
            if (r3 != C05950Vp.A00) {
                C05950Vp r2 = null;
                while (r3 != null) {
                    C05950Vp r1 = r3.next;
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
        AnonymousClass0QM r4;
        Class<C05950Vp> cls = C05950Vp.class;
        Class<C10080hM> cls2 = C10080hM.class;
        A02 = Logger.getLogger(cls2.getName());
        try {
            r4 = new AnonymousClass05E(AtomicReferenceFieldUpdater.newUpdater(cls, Thread.class, "thread"), AtomicReferenceFieldUpdater.newUpdater(cls, cls, "next"), AtomicReferenceFieldUpdater.newUpdater(cls2, cls, "waiters"), AtomicReferenceFieldUpdater.newUpdater(cls2, AnonymousClass0T9.class, "listeners"), AtomicReferenceFieldUpdater.newUpdater(cls2, Object.class, "value"));
            th = null;
        } catch (Throwable th) {
            th = th;
            r4 = new AnonymousClass05D();
        }
        A00 = r4;
        if (th != null) {
            A02.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
    }

    public static final Object A01(Object obj) {
        if (obj instanceof C05340Sy) {
            Throwable th = ((C05340Sy) obj).A00;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th);
            throw cancellationException;
        } else if (obj instanceof C05310Sv) {
            throw new ExecutionException(((C05310Sv) obj).A00);
        } else if (obj == A01) {
            return null;
        } else {
            return obj;
        }
    }

    public String A04() {
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("remaining delay=[");
        A0o.append(((Delayed) this).getDelay(TimeUnit.MILLISECONDS));
        return AnonymousClass000.A0X(" ms]", A0o);
    }

    public void A06(Throwable th) {
        if (A00.A04(this, (Object) null, new C05310Sv(th))) {
            A02(this);
        }
    }

    public boolean A07(Object obj) {
        if (obj == null) {
            obj = A01;
        }
        if (!A00.A04(this, (Object) null, obj)) {
            return false;
        }
        A02(this);
        return true;
    }

    public final boolean cancel(boolean z) {
        C05340Sy r1;
        Object obj = this.value;
        if (obj != null) {
            return false;
        }
        if (A03) {
            r1 = new C05340Sy(new CancellationException("Future.cancel() was called."));
        } else if (z) {
            r1 = C05340Sy.A02;
        } else {
            r1 = C05340Sy.A01;
        }
        if (!A00.A04(this, obj, r1)) {
            return false;
        }
        A02(this);
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00e4, code lost:
        if (r7 != false) goto L_0x00e6;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object get(long r16, java.util.concurrent.TimeUnit r18) {
        /*
            r15 = this;
            r2 = r16
            r7 = r18
            long r0 = r7.toNanos(r2)
            boolean r4 = java.lang.Thread.interrupted()
            if (r4 != 0) goto L_0x0133
            java.lang.Object r4 = r15.value
            if (r4 == 0) goto L_0x0017
            java.lang.Object r0 = A01(r4)
            return r0
        L_0x0017:
            r13 = 0
            int r4 = (r0 > r13 ? 1 : (r0 == r13 ? 0 : -1))
            if (r4 <= 0) goto L_0x0049
            long r9 = java.lang.System.nanoTime()
            long r9 = r9 + r0
        L_0x0022:
            r11 = 1000(0x3e8, double:4.94E-321)
            int r4 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            if (r4 < 0) goto L_0x0066
            X.0Vp r8 = r15.waiters
            X.0Vp r5 = X.C05950Vp.A00
            if (r8 == r5) goto L_0x0042
            X.0Vp r6 = new X.0Vp
            r6.<init>()
        L_0x0033:
            r6.A00(r8)
            X.0QM r4 = A00
            boolean r4 = r4.A03(r8, r6, r15)
            if (r4 != 0) goto L_0x004c
            X.0Vp r8 = r15.waiters
            if (r8 != r5) goto L_0x0033
        L_0x0042:
            java.lang.Object r0 = r15.value
            java.lang.Object r0 = A01(r0)
            return r0
        L_0x0049:
            r9 = 0
            goto L_0x0022
        L_0x004c:
            java.util.concurrent.locks.LockSupport.parkNanos(r15, r0)
            boolean r0 = java.lang.Thread.interrupted()
            if (r0 != 0) goto L_0x012a
            java.lang.Object r0 = r15.value
            if (r0 != 0) goto L_0x0125
            long r4 = java.lang.System.nanoTime()
            long r0 = r9 - r4
            int r4 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            if (r4 >= 0) goto L_0x004c
            r15.A05(r6)
        L_0x0066:
            int r4 = (r0 > r13 ? 1 : (r0 == r13 ? 0 : -1))
            if (r4 <= 0) goto L_0x0081
            java.lang.Object r0 = r15.value
            if (r0 != 0) goto L_0x0125
            boolean r0 = java.lang.Thread.interrupted()
            if (r0 != 0) goto L_0x007b
            long r4 = java.lang.System.nanoTime()
            long r0 = r9 - r4
            goto L_0x0066
        L_0x007b:
            java.lang.InterruptedException r0 = new java.lang.InterruptedException
            r0.<init>()
            throw r0
        L_0x0081:
            java.lang.String r4 = r15.toString()
            java.lang.String r6 = r7.toString()
            java.util.Locale r5 = java.util.Locale.ROOT
            java.lang.String r9 = r6.toLowerCase(r5)
            java.lang.StringBuilder r6 = X.AnonymousClass001.A0o()
            java.lang.String r5 = "Waited "
            r6.append(r5)
            r6.append(r2)
            java.lang.String r8 = " "
            java.lang.String r3 = X.AnonymousClass000.A0V(r8, r9, r6)
            long r5 = r0 + r11
            int r2 = (r5 > r13 ? 1 : (r5 == r13 ? 0 : -1))
            if (r2 >= 0) goto L_0x00fd
            java.lang.StringBuilder r3 = X.AnonymousClass000.A0l(r3)
            java.lang.String r2 = " (plus "
            java.lang.String r10 = X.AnonymousClass000.A0X(r2, r3)
            long r2 = -r0
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.NANOSECONDS
            long r5 = r7.convert(r2, r0)
            long r0 = r7.toNanos(r5)
            long r2 = r2 - r0
            int r1 = (r5 > r13 ? 1 : (r5 == r13 ? 0 : -1))
            if (r1 == 0) goto L_0x00e6
            int r0 = (r2 > r11 ? 1 : (r2 == r11 ? 0 : -1))
            boolean r7 = X.AnonymousClass001.A1W(r0)
            if (r1 <= 0) goto L_0x00e4
            java.lang.StringBuilder r0 = X.AnonymousClass000.A0l(r10)
            r0.append(r5)
            java.lang.String r0 = X.AnonymousClass000.A0V(r8, r9, r0)
            if (r7 == 0) goto L_0x00e0
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0l(r0)
            java.lang.String r0 = ","
            java.lang.String r0 = X.AnonymousClass000.A0X(r0, r1)
        L_0x00e0:
            java.lang.String r10 = X.AnonymousClass000.A0T(r0, r8)
        L_0x00e4:
            if (r7 == 0) goto L_0x00f3
        L_0x00e6:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0l(r10)
            r1.append(r2)
            java.lang.String r0 = " nanoseconds "
            java.lang.String r10 = X.AnonymousClass000.A0X(r0, r1)
        L_0x00f3:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0l(r10)
            java.lang.String r0 = "delay)"
            java.lang.String r3 = X.AnonymousClass000.A0X(r0, r1)
        L_0x00fd:
            boolean r0 = r15.isDone()
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            if (r0 == 0) goto L_0x0116
            r1.append(r3)
            java.lang.String r0 = " but future completed as timeout expired"
            java.lang.String r1 = X.AnonymousClass000.A0X(r0, r1)
            java.util.concurrent.TimeoutException r0 = new java.util.concurrent.TimeoutException
            r0.<init>(r1)
            throw r0
        L_0x0116:
            r1.append(r3)
            java.lang.String r0 = " for "
            java.lang.String r1 = X.AnonymousClass000.A0V(r0, r4, r1)
            java.util.concurrent.TimeoutException r0 = new java.util.concurrent.TimeoutException
            r0.<init>(r1)
            throw r0
        L_0x0125:
            java.lang.Object r0 = A01(r0)
            return r0
        L_0x012a:
            r15.A05(r6)
            java.lang.InterruptedException r0 = new java.lang.InterruptedException
            r0.<init>()
            throw r0
        L_0x0133:
            java.lang.InterruptedException r0 = new java.lang.InterruptedException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C10080hM.get(long, java.util.concurrent.TimeUnit):java.lang.Object");
    }

    public final boolean isCancelled() {
        return this.value instanceof C05340Sy;
    }

    public final boolean isDone() {
        return true & AnonymousClass000.A1W(this.value);
    }

    public static void A03(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e) {
            Logger logger = A02;
            Level level = Level.SEVERE;
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("RuntimeException while executing runnable ");
            A0o.append(runnable);
            logger.log(level, AnonymousClass000.A0P(executor, " with executor ", A0o), e);
        }
    }

    public final void AwV(Runnable runnable, Executor executor) {
        runnable.getClass();
        executor.getClass();
        AnonymousClass0T9 r3 = this.listeners;
        AnonymousClass0T9 r2 = AnonymousClass0T9.A03;
        if (r3 != r2) {
            AnonymousClass0T9 r1 = new AnonymousClass0T9(runnable, executor);
            do {
                r1.A00 = r3;
                if (!A00.A02(r3, r1, this)) {
                    r3 = this.listeners;
                } else {
                    return;
                }
            } while (r3 != r2);
        }
        A03(runnable, executor);
    }

    public String toString() {
        String str;
        Object obj;
        String str2;
        String str3;
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append(super.toString());
        A0o.append("[status=");
        if (isCancelled()) {
            str = "CANCELLED";
        } else {
            if (!isDone()) {
                try {
                    str3 = A04();
                } catch (RuntimeException e) {
                    StringBuilder A0o2 = AnonymousClass001.A0o();
                    A0o2.append("Exception thrown from implementation: ");
                    str3 = AnonymousClass000.A0R(e.getClass(), A0o2);
                }
                if (str3 != null && !str3.isEmpty()) {
                    AnonymousClass001.A1K("PENDING, info=[", str3, "]", A0o);
                    return AnonymousClass000.A0X("]", A0o);
                } else if (!isDone()) {
                    str = "PENDING";
                }
            }
            boolean z = false;
            while (true) {
                try {
                    obj = get();
                    break;
                } catch (InterruptedException unused) {
                    z = true;
                } catch (ExecutionException e2) {
                    A0o.append("FAILURE, cause=[");
                    A0o.append(e2.getCause());
                    A0o.append("]");
                } catch (CancellationException unused2) {
                    str = "CANCELLED";
                } catch (RuntimeException e3) {
                    A0o.append("UNKNOWN, cause=[");
                    A0o.append(e3.getClass());
                    str = " thrown from get()]";
                } catch (Throwable th) {
                    if (z) {
                        Thread.currentThread().interrupt();
                    }
                    throw th;
                }
            }
            if (z) {
                Thread.currentThread().interrupt();
            }
            A0o.append("SUCCESS, result=[");
            if (obj == this) {
                str2 = "this future";
            } else {
                str2 = String.valueOf(obj);
            }
            A0o.append(str2);
            A0o.append("]");
            return AnonymousClass000.A0X("]", A0o);
        }
        A0o.append(str);
        return AnonymousClass000.A0X("]", A0o);
    }

    public final Object get() {
        if (!Thread.interrupted()) {
            Object obj = this.value;
            if (obj == null) {
                C05950Vp r3 = this.waiters;
                C05950Vp r2 = C05950Vp.A00;
                if (r3 != r2) {
                    C05950Vp r1 = new C05950Vp();
                    while (true) {
                        r1.A00(r3);
                        if (!A00.A03(r3, r1, this)) {
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
                                    A05(r1);
                                    throw new InterruptedException();
                                }
                            } while (obj == null);
                        }
                    }
                } else {
                    obj = this.value;
                }
            }
            return A01(obj);
        }
        throw new InterruptedException();
    }
}
