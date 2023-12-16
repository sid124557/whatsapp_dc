package X;

import java.lang.ref.PhantomReference;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.8SJ  reason: invalid class name */
public abstract class AnonymousClass8SJ extends PhantomReference {
    public AnonymousClass8SJ next;
    public AnonymousClass8SJ previous;

    public abstract void destruct();

    public AnonymousClass8SJ(Object obj) {
        super(obj, C155537f4.A03);
        AtomicReference atomicReference;
        AnonymousClass8SJ r0;
        C146497Am r2 = C155537f4.A01;
        do {
            atomicReference = r2.A00;
            r0 = (AnonymousClass8SJ) atomicReference.get();
            this.next = r0;
        } while (!AnonymousClass0IR.A00(r0, this, atomicReference));
    }

    public AnonymousClass8SJ() {
        super((Object) null, C155537f4.A03);
    }

    public /* synthetic */ AnonymousClass8SJ(C173688Rg r1) {
        this();
    }
}
