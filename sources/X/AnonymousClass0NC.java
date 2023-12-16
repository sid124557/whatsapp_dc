package X;

import androidx.lifecycle.CompositeGeneratedAdaptersObserver;
import androidx.lifecycle.FullLifecycleObserverAdapter;
import androidx.lifecycle.ReflectiveGenericLifecycleObserver;
import androidx.lifecycle.SingleGeneratedAdapterObserver;
import java.lang.reflect.Constructor;
import java.util.List;

/* renamed from: X.0NC  reason: invalid class name */
public class AnonymousClass0NC {
    public AnonymousClass0GC A00;
    public C17280vG A01;

    public AnonymousClass0NC(AnonymousClass0GC r5, C15110qn r6) {
        C17280vG r62;
        C17280vG r1;
        boolean z = r6 instanceof C17290vH;
        if (r6 instanceof C17280vG) {
            if (z) {
                r1 = new FullLifecycleObserverAdapter((C17290vH) r6, (C17280vG) r6);
            } else {
                r62 = (C17280vG) r6;
                r1 = r62;
            }
        } else if (z) {
            r1 = new FullLifecycleObserverAdapter((C17290vH) r6, (C17280vG) null);
        } else {
            Class<?> cls = r6.getClass();
            if (AnonymousClass0VU.A00(cls) == 2) {
                List list = (List) AnonymousClass0VU.A01.get(cls);
                if (list.size() == 1) {
                    AnonymousClass0VU.A01(r6, (Constructor) list.get(0));
                    r1 = new SingleGeneratedAdapterObserver();
                } else {
                    C15100qm[] r12 = new C15100qm[list.size()];
                    for (int i = 0; i < list.size(); i++) {
                        AnonymousClass0VU.A01(r6, (Constructor) list.get(i));
                        r12[i] = null;
                    }
                    r62 = new CompositeGeneratedAdaptersObserver(r12);
                    r1 = r62;
                }
            } else {
                r1 = new ReflectiveGenericLifecycleObserver(r6);
            }
        }
        this.A01 = r1;
        this.A00 = r5;
    }

    public void A00(AnonymousClass0GH r4, C15910sA r5) {
        AnonymousClass0GC A012 = r4.A01();
        AnonymousClass0GC r1 = this.A00;
        if (A012.compareTo(r1) < 0) {
            r1 = A012;
        }
        this.A00 = r1;
        this.A01.BcK(r4, r5);
        this.A00 = A012;
    }
}
