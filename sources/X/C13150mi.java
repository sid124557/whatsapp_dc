package X;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.0mi  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C13150mi implements Runnable {
    public final /* synthetic */ C05580Ub A00;
    public final /* synthetic */ AnonymousClass0YL A01;
    public final /* synthetic */ AnonymousClass0UO A02;
    public final /* synthetic */ CountDownLatch A03;
    public final /* synthetic */ AtomicBoolean A04;
    public final /* synthetic */ AtomicReference A05;

    public final void run() {
        AnonymousClass0YL r1 = this.A01;
        AtomicReference atomicReference = this.A05;
        AnonymousClass0YL.A07(this.A00, r1, this.A02, this.A03, this.A04, atomicReference);
    }

    public /* synthetic */ C13150mi(C05580Ub r1, AnonymousClass0YL r2, AnonymousClass0UO r3, CountDownLatch countDownLatch, AtomicBoolean atomicBoolean, AtomicReference atomicReference) {
        this.A01 = r2;
        this.A05 = atomicReference;
        this.A00 = r1;
        this.A02 = r3;
        this.A04 = atomicBoolean;
        this.A03 = countDownLatch;
    }
}
