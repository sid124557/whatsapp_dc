package X;

/* renamed from: X.75e  reason: invalid class name and case insensitive filesystem */
public final class C1453575e {
    public static final void A00(C85494Gl r4, Throwable th) {
        Throwable A0Q;
        try {
            C188438yt r0 = (C188438yt) r4.get(C188438yt.A00);
            if (r0 != null) {
                r0.handleException(r4, th);
                return;
            }
        } catch (Throwable th2) {
            if (th != th2) {
                RuntimeException A0Q2 = AnonymousClass6CA.A0Q("Exception while trying to handle coroutine exception", th2);
                C154507dH.A00(A0Q2, th);
                th = A0Q2;
            }
        }
        for (C188438yt handleException : AnonymousClass786.A00) {
            try {
                handleException.handleException(r4, th);
            } catch (C143736zO unused) {
                return;
            } catch (Throwable th3) {
                if (th == th3) {
                    A0Q = th;
                } else {
                    A0Q = AnonymousClass6CA.A0Q("Exception while trying to handle coroutine exception", th3);
                    C154507dH.A00(A0Q, th);
                }
                Thread currentThread = Thread.currentThread();
                currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, A0Q);
            }
        }
        try {
            C154507dH.A00(th, new AnonymousClass8RV(r4));
        } catch (Throwable unused2) {
        }
        Thread currentThread2 = Thread.currentThread();
        currentThread2.getUncaughtExceptionHandler().uncaughtException(currentThread2, th);
    }
}
