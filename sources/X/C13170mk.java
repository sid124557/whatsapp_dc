package X;

import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.0mk  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C13170mk implements Runnable {
    public final /* synthetic */ AnonymousClass0UW A00;
    public final /* synthetic */ AnonymousClass0UI A01;
    public final /* synthetic */ ArrayList A02;
    public final /* synthetic */ CountDownLatch A03;
    public final /* synthetic */ AtomicInteger A04;
    public final /* synthetic */ AtomicReference A05;

    public final void run() {
        AnonymousClass0UW r0 = this.A00;
        AnonymousClass0UI r1 = this.A01;
        AtomicReference atomicReference = this.A05;
        r0.A02(r1, this.A02, this.A03, this.A04, atomicReference);
    }

    public /* synthetic */ C13170mk(AnonymousClass0UW r1, AnonymousClass0UI r2, ArrayList arrayList, CountDownLatch countDownLatch, AtomicInteger atomicInteger, AtomicReference atomicReference) {
        this.A00 = r1;
        this.A01 = r2;
        this.A05 = atomicReference;
        this.A02 = arrayList;
        this.A04 = atomicInteger;
        this.A03 = countDownLatch;
    }
}
