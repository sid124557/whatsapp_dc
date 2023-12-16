package X;

import java.io.File;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.0mn  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C13200mn implements Runnable {
    public final /* synthetic */ AnonymousClass0UW A00;
    public final /* synthetic */ AnonymousClass0UI A01;
    public final /* synthetic */ File A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ List A04;
    public final /* synthetic */ CountDownLatch A05;
    public final /* synthetic */ AtomicBoolean A06;
    public final /* synthetic */ AtomicReference A07;
    public final /* synthetic */ boolean A08;

    public final void run() {
        AnonymousClass0UW r0 = this.A00;
        AtomicBoolean atomicBoolean = this.A06;
        boolean z = this.A08;
        File file = this.A02;
        AnonymousClass0UW.A00(r0, this.A01, file, this.A03, this.A04, this.A05, atomicBoolean, this.A07, z);
    }

    public /* synthetic */ C13200mn(AnonymousClass0UW r1, AnonymousClass0UI r2, File file, String str, List list, CountDownLatch countDownLatch, AtomicBoolean atomicBoolean, AtomicReference atomicReference, boolean z) {
        this.A00 = r1;
        this.A06 = atomicBoolean;
        this.A08 = z;
        this.A02 = file;
        this.A01 = r2;
        this.A03 = str;
        this.A04 = list;
        this.A07 = atomicReference;
        this.A05 = countDownLatch;
    }
}
