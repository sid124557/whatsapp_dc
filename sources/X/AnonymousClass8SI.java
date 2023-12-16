package X;

import java.lang.ref.PhantomReference;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.8SI  reason: invalid class name */
public abstract class AnonymousClass8SI extends PhantomReference {
    public AnonymousClass8SI A00;
    public AnonymousClass8SI A01;

    public abstract void destruct();

    public AnonymousClass8SI(Object obj) {
        super(obj, C155527f3.A03);
        AtomicReference atomicReference;
        AnonymousClass8SI r0;
        AnonymousClass7AV r2 = C155527f3.A01;
        do {
            atomicReference = r2.A00;
            r0 = (AnonymousClass8SI) atomicReference.get();
            this.A00 = r0;
        } while (!AnonymousClass0IR.A00(r0, this, atomicReference));
    }

    public AnonymousClass8SI() {
        super((Object) null, C155527f3.A03);
    }
}
