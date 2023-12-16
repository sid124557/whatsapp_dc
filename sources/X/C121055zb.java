package X;

import java.util.concurrent.locks.ReentrantLock;

/* renamed from: X.5zb  reason: invalid class name and case insensitive filesystem */
public final class C121055zb extends C829045j implements AnonymousClass4GP {
    public static final C121055zb A00 = new C121055zb();

    public C121055zb() {
        super(0);
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        if (C05850Vf.A03 == null) {
            ReentrantLock reentrantLock = C05850Vf.A02;
            reentrantLock.lock();
            try {
                if (C05850Vf.A03 == null) {
                    C05850Vf.A03 = new C05850Vf();
                }
                reentrantLock.unlock();
            } catch (Throwable th) {
                reentrantLock.unlock();
                throw th;
            }
        }
        C05850Vf r0 = C05850Vf.A03;
        C162457s7.A0H(r0);
        return r0;
    }
}
