package X;

import java.util.ConcurrentModificationException;
import java.util.Iterator;

/* renamed from: X.8O4  reason: invalid class name */
public class AnonymousClass8O4 implements Iterator {
    public int currentIndex;
    public int expectedMetadata;
    public int indexToRemove = -1;
    public final /* synthetic */ AnonymousClass8TM this$0;

    public AnonymousClass8O4(AnonymousClass8TM r2) {
        this.this$0 = r2;
        this.expectedMetadata = r2.metadata;
        this.currentIndex = r2.firstEntryIndex();
    }

    private void checkForConcurrentModification() {
        if (this.this$0.metadata != this.expectedMetadata) {
            throw new ConcurrentModificationException();
        }
    }

    public boolean hasNext() {
        return AnonymousClass001.A1U(this.currentIndex);
    }

    public void incrementExpectedModCount() {
        this.expectedMetadata += 32;
    }

    public Object next() {
        checkForConcurrentModification();
        if (hasNext()) {
            int i = this.currentIndex;
            this.indexToRemove = i;
            Object access$100 = this.this$0.element(i);
            this.currentIndex = this.this$0.getSuccessor(this.currentIndex);
            return access$100;
        }
        throw AnonymousClass6CA.A0c();
    }

    public void remove() {
        checkForConcurrentModification();
        C160937oh.checkRemove(AnonymousClass001.A1U(this.indexToRemove));
        incrementExpectedModCount();
        AnonymousClass8TM r1 = this.this$0;
        r1.remove(r1.element(this.indexToRemove));
        this.currentIndex = this.this$0.adjustAfterRemove(this.currentIndex, this.indexToRemove);
        this.indexToRemove = -1;
    }
}
