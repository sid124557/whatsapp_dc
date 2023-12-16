package X;

import java.util.Iterator;
import java.util.Objects;

/* renamed from: X.8Nt  reason: invalid class name and case insensitive filesystem */
public final class C172988Nt implements Iterator {
    public boolean canRemove;
    public C153177an currentEntry;
    public final Iterator entryIterator;
    public int laterCount;
    public final C188168yS multiset;
    public int totalCount;

    public boolean hasNext() {
        if (this.laterCount > 0 || this.entryIterator.hasNext()) {
            return true;
        }
        return false;
    }

    public void remove() {
        C160937oh.checkRemove(this.canRemove);
        if (this.totalCount == 1) {
            this.entryIterator.remove();
        } else {
            C188168yS r1 = this.multiset;
            C153177an r0 = this.currentEntry;
            Objects.requireNonNull(r0);
            r1.remove(r0.getElement());
        }
        this.totalCount--;
        this.canRemove = false;
    }

    public C172988Nt(C188168yS r1, Iterator it) {
        this.multiset = r1;
        this.entryIterator = it;
    }

    public Object next() {
        if (hasNext()) {
            int i = this.laterCount;
            if (i == 0) {
                C153177an r0 = (C153177an) this.entryIterator.next();
                this.currentEntry = r0;
                i = r0.getCount();
                this.laterCount = i;
                this.totalCount = i;
            }
            this.laterCount = i - 1;
            this.canRemove = true;
            C153177an r02 = this.currentEntry;
            Objects.requireNonNull(r02);
            return r02.getElement();
        }
        throw AnonymousClass6CA.A0c();
    }
}
