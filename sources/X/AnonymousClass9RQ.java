package X;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.9RQ  reason: invalid class name */
public class AnonymousClass9RQ {
    public final /* synthetic */ C195639Yw A00;
    public final /* synthetic */ AtomicReference A01;
    public final /* synthetic */ AtomicReference A02;
    public final /* synthetic */ AtomicReference A03;

    public AnonymousClass9RQ(C195639Yw r1, AtomicReference atomicReference, AtomicReference atomicReference2, AtomicReference atomicReference3) {
        this.A00 = r1;
        this.A03 = atomicReference;
        this.A02 = atomicReference2;
        this.A01 = atomicReference3;
    }

    public void A00(double d) {
        AtomicReference atomicReference;
        Double valueOf;
        if (d == -1.0d) {
            atomicReference = this.A03;
            valueOf = AnonymousClass6C8.A0Z();
        } else {
            atomicReference = this.A02;
            valueOf = Double.valueOf(d * C1899593h.A00(this.A03));
        }
        atomicReference.set(valueOf);
    }
}
