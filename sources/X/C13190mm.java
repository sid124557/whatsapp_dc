package X;

import java.io.File;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.0mm  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C13190mm implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ AnonymousClass0WK A02;
    public final /* synthetic */ File A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ List A05;
    public final /* synthetic */ List A06;
    public final /* synthetic */ CountDownLatch A07;
    public final /* synthetic */ AtomicReference A08;

    public final void run() {
        AnonymousClass0WK r0 = this.A02;
        File file = this.A03;
        String str = this.A04;
        int i = this.A00;
        long j = this.A01;
        AnonymousClass0WK.A01(r0, file, str, this.A05, this.A06, this.A07, this.A08, i, j);
    }

    public /* synthetic */ C13190mm(AnonymousClass0WK r1, File file, String str, List list, List list2, CountDownLatch countDownLatch, AtomicReference atomicReference, int i, long j) {
        this.A02 = r1;
        this.A03 = file;
        this.A04 = str;
        this.A00 = i;
        this.A01 = j;
        this.A05 = list;
        this.A06 = list2;
        this.A08 = atomicReference;
        this.A07 = countDownLatch;
    }
}
