package X;

import java.util.List;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: X.3dv  reason: invalid class name and case insensitive filesystem */
public abstract class C72563dv implements AnonymousClass4GQ {
    public void A00(Throwable th) {
        Object obj;
        AnonymousClass4C7 r1;
        if (this instanceof AnonymousClass466) {
            AnonymousClass466 r4 = (AnonymousClass466) this;
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = AnonymousClass466.A05;
            do {
                obj = atomicReferenceFieldUpdater.get(r4);
                if (obj == AnonymousClass2CB.A04) {
                    return;
                }
            } while (!AnonymousClass0H6.A00(r4, obj, AnonymousClass2CB.A03, atomicReferenceFieldUpdater));
            List<C47162co> list = r4.A03;
            if (list != null) {
                for (C47162co r2 : list) {
                    Object obj2 = r2.A01;
                    if (obj2 instanceof C175778Zr) {
                        ((C175778Zr) obj2).A05(r2.A00);
                    } else if ((obj2 instanceof AnonymousClass4C7) && (r1 = (AnonymousClass4C7) obj2) != null) {
                        r1.dispose();
                    }
                }
                r4.A02 = AnonymousClass2CB.A01;
                r4.A03 = null;
            }
        } else if (this instanceof AnonymousClass464) {
            ((AnonymousClass464) this).A00.invoke(th);
        } else if (this instanceof AnonymousClass463) {
            ((AnonymousClass463) this).A00.dispose();
        } else if (this instanceof AnonymousClass462) {
            AnonymousClass462 r0 = (AnonymousClass462) this;
            if (th != null) {
                r0.A00.cancel(false);
            }
        } else {
            ((AnonymousClass465) this).A01();
        }
    }
}
