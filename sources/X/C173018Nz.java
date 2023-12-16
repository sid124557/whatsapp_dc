package X;

import java.util.ConcurrentModificationException;
import java.util.Iterator;

/* renamed from: X.8Nz  reason: invalid class name and case insensitive filesystem */
public class C173018Nz implements Iterator {
    public int expectedModCount;
    public int index;
    public int indexToRemove = -1;
    public int remaining;
    public final /* synthetic */ AnonymousClass8TH this$0;

    public C173018Nz(AnonymousClass8TH r3) {
        this.this$0 = r3;
        AnonymousClass8TE r1 = r3.biMap;
        this.index = r1.firstInInsertionOrder;
        this.expectedModCount = r1.modCount;
        this.remaining = r1.size;
    }

    private void checkForComodification() {
        if (this.this$0.biMap.modCount != this.expectedModCount) {
            throw new ConcurrentModificationException();
        }
    }

    public boolean hasNext() {
        checkForComodification();
        if (this.index == -2 || this.remaining <= 0) {
            return false;
        }
        return true;
    }

    public Object next() {
        if (hasNext()) {
            AnonymousClass8TH r0 = this.this$0;
            int i = this.index;
            Object forEntry = r0.forEntry(i);
            this.indexToRemove = i;
            this.index = r0.biMap.nextInInsertionOrder[i];
            this.remaining--;
            return forEntry;
        }
        throw AnonymousClass6CA.A0c();
    }

    public void remove() {
        checkForComodification();
        C160937oh.checkRemove(AnonymousClass001.A1X(this.indexToRemove, -1));
        this.this$0.biMap.removeEntry(this.indexToRemove);
        int i = this.index;
        AnonymousClass8TE r1 = this.this$0.biMap;
        if (i == r1.size) {
            this.index = this.indexToRemove;
        }
        this.indexToRemove = -1;
        this.expectedModCount = r1.modCount;
    }
}
