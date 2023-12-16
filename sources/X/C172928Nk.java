package X;

import java.util.Iterator;

/* renamed from: X.8Nk  reason: invalid class name and case insensitive filesystem */
public class C172928Nk implements Iterator {
    public boolean atStart = true;
    public final /* synthetic */ Iterator val$iterator;

    public C172928Nk(C129416aH r2, Iterator it) {
        this.val$iterator = it;
    }

    public boolean hasNext() {
        return this.val$iterator.hasNext();
    }

    public Object next() {
        Object next = this.val$iterator.next();
        this.atStart = false;
        return next;
    }

    public void remove() {
        C160937oh.checkRemove(!this.atStart);
        this.val$iterator.remove();
    }
}
