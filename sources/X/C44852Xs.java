package X;

import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.2Xs  reason: invalid class name and case insensitive filesystem */
public class C44852Xs {
    public final AnonymousClass4FV A00;
    public final AtomicInteger A01 = new AtomicInteger();

    public void A00(Boolean bool, Boolean bool2, int i) {
        AnonymousClass1Z8 r1 = new AnonymousClass1Z8();
        r1.A03 = AnonymousClass0x9.A0m(this.A01.getAndIncrement());
        r1.A02 = Integer.valueOf(i);
        r1.A00 = bool;
        r1.A01 = bool2;
        this.A00.BhD(r1);
    }

    public C44852Xs(AnonymousClass4FV r2) {
        this.A00 = r2;
    }
}
