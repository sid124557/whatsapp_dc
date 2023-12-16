package X;

import java.util.Iterator;

/* renamed from: X.8zh  reason: invalid class name and case insensitive filesystem */
public class C188918zh extends C129976bB {
    public Object A00;
    public Object A01;
    public final int A02 = 1;

    public C188918zh(Iterator it, C181308mY r3, int i) {
        this.A01 = it;
        this.A00 = r3;
    }

    public Object computeNext() {
        return this.A02 != 0 ? computeNext$Sets$2$1(this) : computeNext(this);
    }

    public static Object computeNext(C188918zh r2) {
        Object next;
        do {
            Iterator it = (Iterator) r2.A01;
            if (!it.hasNext()) {
                return r2.endOfData();
            }
            next = it.next();
        } while (!((C181308mY) r2.A00).AxD(next));
        return next;
    }

    public static Object computeNext$Sets$2$1(C188918zh r2) {
        Object next;
        do {
            Iterator it = (Iterator) r2.A00;
            if (!it.hasNext()) {
                return r2.endOfData();
            }
            next = it.next();
        } while (!((C129906b4) r2.A01).val$set2.contains(next));
        return next;
    }

    public C188918zh(C129906b4 r2, int i) {
        this.A01 = r2;
        this.A00 = r2.val$set1.iterator();
    }
}
