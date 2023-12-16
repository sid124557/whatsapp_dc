package X;

import java.util.ConcurrentModificationException;
import java.util.Iterator;

/* renamed from: X.8O3  reason: invalid class name */
public abstract class AnonymousClass8O3 implements Iterator {
    public int entryIndex;
    public int expectedModCount;
    public final /* synthetic */ C129376aD this$0;
    public int toRemove = -1;

    public abstract Object result(int i);

    public AnonymousClass8O3(C129376aD r3) {
        this.this$0 = r3;
        C162347rk r1 = r3.backingMap;
        this.entryIndex = r1.firstIndex();
        this.expectedModCount = r1.modCount;
    }

    private void checkForConcurrentModification() {
        if (this.this$0.backingMap.modCount != this.expectedModCount) {
            throw new ConcurrentModificationException();
        }
    }

    public boolean hasNext() {
        checkForConcurrentModification();
        return AnonymousClass001.A1U(this.entryIndex);
    }

    public Object next() {
        if (hasNext()) {
            Object result = result(this.entryIndex);
            int i = this.entryIndex;
            this.toRemove = i;
            this.entryIndex = this.this$0.backingMap.nextIndex(i);
            return result;
        }
        throw AnonymousClass6CA.A0c();
    }

    public void remove() {
        checkForConcurrentModification();
        C160937oh.checkRemove(AnonymousClass001.A1X(this.toRemove, -1));
        C129376aD r4 = this.this$0;
        r4.size -= (long) r4.backingMap.removeEntry(this.toRemove);
        C162347rk r2 = this.this$0.backingMap;
        this.entryIndex = r2.nextIndexAfterRemove(this.entryIndex, this.toRemove);
        this.toRemove = -1;
        this.expectedModCount = r2.modCount;
    }
}
