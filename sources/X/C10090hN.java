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

/* renamed from: X.0hN  reason: invalid class name and case insensitive filesystem */
public abstract class C10090hN implements C188268yc {
    public static final AnonymousClass0QP A00;
    public static final Object A01 = AnonymousClass002.A0D();
    public static final Logger A02;
    public static final boolean A03 = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
    public volatile AnonymousClass0TD listeners;
    public volatile Object value;
    public volatile C05970Vr waiters;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: java.util.concurrent.Future} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v8, resolved type: java.util.concurrent.Future} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.Object A03(java.util.concurrent.Future r1) {
        /*
            r0 = 0
        L_0x0001:
            java.lang.Object r1 = r1.get()     // Catch:{ InterruptedException -> 0x0006, all -> 0x0012 }
            goto L_0x0008
        L_0x0006:
            r0 = 1
            goto L_0x0001
        L_0x0008:
            if (r0 == 0) goto L_0x0011
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r0.interrupt()
        L_0x0011:
            return r1
        L_0x0012:
            r1 = move-exception
            if (r0 == 0) goto L_0x001c
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r0.interrupt()
        L_0x001c:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C10090hN.A03(java.util.concurrent.Future):java.lang.Object");
    }

    public static void A04(C10090hN r5) {
        AnonymousClass0TD r1;
        AnonymousClass0TD r4 = null;
        while (true) {
            C05970Vr r2 = r5.waiters;
            AnonymousClass0QP r3 = A00;
            if (r3.A03(r2, C05970Vr.A00, r5)) {
                while (r2 != null) {
                    Thread thread = r2.thread;
                    if (thread != null) {
                        r2.thread = null;
                        LockSupport.unpark(thread);
                    }
                    r2 = r2.next;
                }
                do {
                    r1 = r5.listeners;
                } while (!r3.A02(r1, AnonymousClass0TD.A03, r5));
                while (r1 != null) {
                    AnonymousClass0TD r0 = r1.A00;
                    r1.A00 = r4;
                    r4 = r1;
                    r1 = r0;
                }
                while (true) {
                    AnonymousClass0TD r22 = r4;
                    if (r4 != null) {
                        r4 = r4.A00;
                        Runnable runnable = r22.A01;
                        if (runnable instanceof AnonymousClass0l1) {
                            AnonymousClass0l1 r12 = (AnonymousClass0l1) runnable;
                            r5 = r12.A00;
                            if (r5.value == r12 && r3.A04(r5, r12, A01(r12.A01))) {
                                break;
                            }
                        } else {
                            A05(runnable, r22.A02);
                        }
                    } else {
                        return;
                    }
                }
            }
        }
    }

    public final void A07(C05970Vr r6) {
        r6.thread = null;
        while (true) {
            C05970Vr r3 = this.waiters;
            if (r3 != C05970Vr.A00) {
                C05970Vr r2 = null;
                while (r3 != null) {
                    C05970Vr r1 = r3.next;
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
        AnonymousClass0QP r4;
        Class<C05970Vr> cls = C05970Vr.class;
        Class<C10090hN> cls2 = C10090hN.class;
        A02 = Logger.getLogger(cls2.getName());
        try {
            r4 = new AnonymousClass0BS(AtomicReferenceFieldUpdater.newUpdater(cls, Thread.class, "thread"), AtomicReferenceFieldUpdater.newUpdater(cls, cls, "next"), AtomicReferenceFieldUpdater.newUpdater(cls2, cls, "waiters"), AtomicReferenceFieldUpdater.newUpdater(cls2, AnonymousClass0TD.class, "listeners"), AtomicReferenceFieldUpdater.newUpdater(cls2, Object.class, "value"));
            th = null;
        } catch (Throwable th) {
            th = th;
            r4 = new AnonymousClass0BR();
        }
        A00 = r4;
        if (th != null) {
            A02.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
    }

    public static Object A01(C188268yc r5) {
        Throwable th;
        if (r5 instanceof C10090hN) {
            Object obj = ((C10090hN) r5).value;
            if (!(obj instanceof AnonymousClass0T6)) {
                return obj;
            }
            AnonymousClass0T6 r1 = (AnonymousClass0T6) obj;
            if (!r1.A01) {
                return obj;
            }
            Throwable th2 = r1.A00;
            if (th2 != null) {
                return new AnonymousClass0T6(th2, false);
            }
        } else {
            boolean isCancelled = r5.isCancelled();
            if (!(!A03) || !isCancelled) {
                try {
                    Object A032 = A03(r5);
                    if (A032 == null) {
                        return A01;
                    }
                    return A032;
                } catch (ExecutionException e) {
                    th = e.getCause();
                    return new C05320Sw(th);
                } catch (CancellationException e2) {
                    if (isCancelled) {
                        return new AnonymousClass0T6(e2, false);
                    }
                    th = new IllegalArgumentException(AnonymousClass000.A0P(r5, "get() threw CancellationException, despite reporting isCancelled() == false: ", AnonymousClass001.A0o()), e2);
                    return new C05320Sw(th);
                } catch (Throwable th3) {
                    th = th3;
                    return new C05320Sw(th);
                }
            }
        }
        return AnonymousClass0T6.A02;
    }

    public static final Object A02(Object obj) {
        if (obj instanceof AnonymousClass0T6) {
            Throwable th = ((AnonymousClass0T6) obj).A00;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th);
            throw cancellationException;
        } else if (obj instanceof C05320Sw) {
            throw new ExecutionException(((C05320Sw) obj).A00);
        } else if (obj == A01) {
            return null;
        } else {
            return obj;
        }
    }

    public String A06() {
        String valueOf;
        Object obj = this.value;
        if (obj instanceof AnonymousClass0l1) {
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("setFuture=[");
            C188268yc r0 = ((AnonymousClass0l1) obj).A01;
            if (r0 == this) {
                valueOf = "this future";
            } else {
                valueOf = String.valueOf(r0);
            }
            return AnonymousClass000.A0W(valueOf, A0o);
        } else if (!(this instanceof ScheduledFuture)) {
            return null;
        } else {
            StringBuilder A0o2 = AnonymousClass001.A0o();
            A0o2.append("remaining delay=[");
            A0o2.append(((Delayed) this).getDelay(TimeUnit.MILLISECONDS));
            return AnonymousClass000.A0X(" ms]", A0o2);
        }
    }

    public void A09(Object obj) {
        if (obj == null) {
            obj = A01;
        }
        if (A00.A04(this, (Object) null, obj)) {
            A04(this);
        }
    }

    public void A0A(Throwable th) {
        if (A00.A04(this, (Object) null, new C05320Sw(th))) {
            A04(this);
        }
    }

    public final boolean cancel(boolean z) {
        AnonymousClass0T6 r3;
        Object obj = this.value;
        if (!AnonymousClass000.A1X(obj) && !(obj instanceof AnonymousClass0l1)) {
            return false;
        }
        if (A03) {
            r3 = new AnonymousClass0T6(new CancellationException("Future.cancel() was called."), z);
        } else if (z) {
            r3 = AnonymousClass0T6.A03;
        } else {
            r3 = AnonymousClass0T6.A02;
        }
        boolean z2 = false;
        C10090hN r2 = this;
        while (true) {
            if (A00.A04(r2, obj, r3)) {
                A04(r2);
                if (!(obj instanceof AnonymousClass0l1)) {
                    break;
                }
                C188268yc r22 = ((AnonymousClass0l1) obj).A01;
                if (r22 instanceof C10090hN) {
                    r2 = (C10090hN) r22;
                    obj = r2.value;
                    if (!AnonymousClass000.A1X(obj) && !(obj instanceof AnonymousClass0l1)) {
                        break;
                    }
                    z2 = true;
                } else {
                    r22.cancel(z);
                    return true;
                }
            } else {
                obj = r2.value;
                if (!(obj instanceof AnonymousClass0l1)) {
                    return z2;
                }
            }
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00ff, code lost:
        if (r7 != false) goto L_0x0101;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object get(long r16, java.util.concurrent.TimeUnit r18) {
        /*
            r15 = this;
            r2 = r16
            r7 = r18
            long r0 = r7.toNanos(r2)
            boolean r4 = java.lang.Thread.interrupted()
            if (r4 != 0) goto L_0x014e
            java.lang.Object r6 = r15.value
            boolean r5 = X.AnonymousClass000.A1W(r6)
            boolean r4 = r6 instanceof X.AnonymousClass0l1
            r4 = r4 ^ 1
            r5 = r5 & r4
            if (r5 == 0) goto L_0x0020
            java.lang.Object r0 = A02(r6)
            return r0
        L_0x0020:
            r13 = 0
            int r4 = (r0 > r13 ? 1 : (r0 == r13 ? 0 : -1))
            if (r4 <= 0) goto L_0x0052
            long r9 = java.lang.System.nanoTime()
            long r9 = r9 + r0
        L_0x002b:
            r11 = 1000(0x3e8, double:4.94E-321)
            int r4 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            if (r4 < 0) goto L_0x0078
            X.0Vr r8 = r15.waiters
            X.0Vr r5 = X.C05970Vr.A00
            if (r8 == r5) goto L_0x004b
            X.0Vr r6 = new X.0Vr
            r6.<init>()
        L_0x003c:
            r6.A00(r8)
            X.0QP r4 = A00
            boolean r4 = r4.A03(r8, r6, r15)
            if (r4 != 0) goto L_0x0055
            X.0Vr r8 = r15.waiters
            if (r8 != r5) goto L_0x003c
        L_0x004b:
            java.lang.Object r0 = r15.value
            java.lang.Object r0 = A02(r0)
            return r0
        L_0x0052:
            r9 = 0
            goto L_0x002b
        L_0x0055:
            java.util.concurrent.locks.LockSupport.parkNanos(r15, r0)
            boolean r0 = java.lang.Thread.interrupted()
            if (r0 != 0) goto L_0x0145
            java.lang.Object r4 = r15.value
            boolean r1 = X.AnonymousClass000.A1W(r4)
            boolean r0 = r4 instanceof X.AnonymousClass0l1
            r0 = r0 ^ 1
            r1 = r1 & r0
            if (r1 != 0) goto L_0x0140
            long r4 = java.lang.System.nanoTime()
            long r0 = r9 - r4
            int r4 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            if (r4 >= 0) goto L_0x0055
            r15.A07(r6)
        L_0x0078:
            int r4 = (r0 > r13 ? 1 : (r0 == r13 ? 0 : -1))
            if (r4 <= 0) goto L_0x009c
            java.lang.Object r4 = r15.value
            boolean r1 = X.AnonymousClass000.A1W(r4)
            boolean r0 = r4 instanceof X.AnonymousClass0l1
            r0 = r0 ^ 1
            r1 = r1 & r0
            if (r1 != 0) goto L_0x0140
            boolean r0 = java.lang.Thread.interrupted()
            if (r0 != 0) goto L_0x0096
            long r4 = java.lang.System.nanoTime()
            long r0 = r9 - r4
            goto L_0x0078
        L_0x0096:
            java.lang.InterruptedException r0 = new java.lang.InterruptedException
            r0.<init>()
            throw r0
        L_0x009c:
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
            if (r2 >= 0) goto L_0x0118
            java.lang.StringBuilder r3 = X.AnonymousClass000.A0l(r3)
            java.lang.String r2 = " (plus "
            java.lang.String r10 = X.AnonymousClass000.A0X(r2, r3)
            long r2 = -r0
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.NANOSECONDS
            long r5 = r7.convert(r2, r0)
            long r0 = r7.toNanos(r5)
            long r2 = r2 - r0
            int r1 = (r5 > r13 ? 1 : (r5 == r13 ? 0 : -1))
            if (r1 == 0) goto L_0x0101
            int r0 = (r2 > r11 ? 1 : (r2 == r11 ? 0 : -1))
            boolean r7 = X.AnonymousClass001.A1W(r0)
            if (r1 <= 0) goto L_0x00ff
            java.lang.StringBuilder r0 = X.AnonymousClass000.A0l(r10)
            r0.append(r5)
            java.lang.String r0 = X.AnonymousClass000.A0V(r8, r9, r0)
            if (r7 == 0) goto L_0x00fb
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0l(r0)
            java.lang.String r0 = ","
            java.lang.String r0 = X.AnonymousClass000.A0X(r0, r1)
        L_0x00fb:
            java.lang.String r10 = X.AnonymousClass000.A0T(r0, r8)
        L_0x00ff:
            if (r7 == 0) goto L_0x010e
        L_0x0101:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0l(r10)
            r1.append(r2)
            java.lang.String r0 = " nanoseconds "
            java.lang.String r10 = X.AnonymousClass000.A0X(r0, r1)
        L_0x010e:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0l(r10)
            java.lang.String r0 = "delay)"
            java.lang.String r3 = X.AnonymousClass000.A0X(r0, r1)
        L_0x0118:
            boolean r0 = r15.isDone()
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            if (r0 == 0) goto L_0x0131
            r1.append(r3)
            java.lang.String r0 = " but future completed as timeout expired"
            java.lang.String r1 = X.AnonymousClass000.A0X(r0, r1)
            java.util.concurrent.TimeoutException r0 = new java.util.concurrent.TimeoutException
            r0.<init>(r1)
            throw r0
        L_0x0131:
            r1.append(r3)
            java.lang.String r0 = " for "
            java.lang.String r1 = X.AnonymousClass000.A0V(r0, r4, r1)
            java.util.concurrent.TimeoutException r0 = new java.util.concurrent.TimeoutException
            r0.<init>(r1)
            throw r0
        L_0x0140:
            java.lang.Object r0 = A02(r4)
            return r0
        L_0x0145:
            r15.A07(r6)
            java.lang.InterruptedException r0 = new java.lang.InterruptedException
            r0.<init>()
            throw r0
        L_0x014e:
            java.lang.InterruptedException r0 = new java.lang.InterruptedException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C10090hN.get(long, java.util.concurrent.TimeUnit):java.lang.Object");
    }

    public final boolean isCancelled() {
        return this.value instanceof AnonymousClass0T6;
    }

    public final boolean isDone() {
        Object obj = this.value;
        return (!(obj instanceof AnonymousClass0l1)) & AnonymousClass000.A1W(obj);
    }

    public static void A05(Runnable runnable, Executor executor) {
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

    public void A08(C188268yc r6) {
        AnonymousClass0l1 r3;
        AnonymousClass0QP r2;
        C05320Sw r0;
        r6.getClass();
        Object obj = this.value;
        if (obj == null) {
            if (r6.isDone()) {
                if (A00.A04(this, (Object) null, A01(r6))) {
                    A04(this);
                    return;
                }
                return;
            }
            r3 = new AnonymousClass0l1(this, r6);
            r2 = A00;
            if (r2.A04(this, (Object) null, r3)) {
                try {
                    r6.AwV(r3, AnonymousClass0GK.A01);
                    return;
                } catch (Throwable unused) {
                    r0 = C05320Sw.A01;
                }
            } else {
                obj = this.value;
            }
        }
        if (obj instanceof AnonymousClass0T6) {
            r6.cancel(((AnonymousClass0T6) obj).A01);
            return;
        }
        return;
        r2.A04(this, r3, r0);
    }

    public final void AwV(Runnable runnable, Executor executor) {
        runnable.getClass();
        executor.getClass();
        AnonymousClass0TD r3 = this.listeners;
        AnonymousClass0TD r2 = AnonymousClass0TD.A03;
        if (r3 != r2) {
            AnonymousClass0TD r1 = new AnonymousClass0TD(runnable, executor);
            do {
                r1.A00 = r3;
                if (!A00.A02(r3, r1, this)) {
                    r3 = this.listeners;
                } else {
                    return;
                }
            } while (r3 != r2);
        }
        A05(runnable, executor);
    }

    public String toString() {
        String str;
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
                    str3 = A06();
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
            try {
                Object A032 = A03(this);
                A0o.append("SUCCESS, result=[");
                if (A032 == this) {
                    str2 = "this future";
                } else {
                    str2 = String.valueOf(A032);
                }
                A0o.append(str2);
                A0o.append("]");
            } catch (ExecutionException e2) {
                A0o.append("FAILURE, cause=[");
                A0o.append(e2.getCause());
                A0o.append("]");
            } catch (CancellationException unused) {
                str = "CANCELLED";
            } catch (RuntimeException e3) {
                A0o.append("UNKNOWN, cause=[");
                A0o.append(e3.getClass());
                str = " thrown from get()]";
            }
            return AnonymousClass000.A0X("]", A0o);
        }
        A0o.append(str);
        return AnonymousClass000.A0X("]", A0o);
    }

    public final Object get() {
        if (!Thread.interrupted()) {
            Object obj = this.value;
            if (!AnonymousClass000.A1W(obj) || !(!(obj instanceof AnonymousClass0l1))) {
                C05970Vr r3 = this.waiters;
                C05970Vr r1 = C05970Vr.A00;
                if (r3 != r1) {
                    C05970Vr r2 = new C05970Vr();
                    while (true) {
                        r2.A00(r3);
                        if (!A00.A03(r3, r2, this)) {
                            r3 = this.waiters;
                            if (r3 == r1) {
                                break;
                            }
                        } else {
                            do {
                                LockSupport.park(this);
                                if (!Thread.interrupted()) {
                                    obj = this.value;
                                } else {
                                    A07(r2);
                                    throw new InterruptedException();
                                }
                            } while (!(AnonymousClass000.A1W(obj) & (!(obj instanceof AnonymousClass0l1))));
                        }
                    }
                    obj = this.value;
                } else {
                    obj = this.value;
                }
            }
            return A02(obj);
        }
        throw new InterruptedException();
    }
}
