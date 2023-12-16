package X;

import java.io.File;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.0ml  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C13180ml implements Runnable {
    public final /* synthetic */ AnonymousClass0YL A00;
    public final /* synthetic */ File A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ List A03;
    public final /* synthetic */ List A04;
    public final /* synthetic */ CountDownLatch A05;
    public final /* synthetic */ AtomicReference A06;
    public final /* synthetic */ boolean A07;

    public final void run() {
        AnonymousClass0YL.A08(this.A00, this.A01, this.A02, this.A03, this.A04, this.A05, this.A06, this.A07);
    }

    public /* synthetic */ C13180ml(AnonymousClass0YL r1, File file, String str, List list, List list2, CountDownLatch countDownLatch, AtomicReference atomicReference, boolean z) {
        this.A00 = r1;
        this.A01 = file;
        this.A02 = str;
        this.A03 = list;
        this.A04 = list2;
        this.A06 = atomicReference;
        this.A07 = z;
        this.A05 = countDownLatch;
    }
}
