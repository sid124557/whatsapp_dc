package X;

import java.util.ConcurrentModificationException;
import java.util.Iterator;

/* renamed from: X.8O6  reason: invalid class name */
public abstract class AnonymousClass8O6 implements Iterator {
    public int currentIndex;
    public int expectedMetadata;
    public int indexToRemove;
    public final /* synthetic */ AnonymousClass8TF this$0;

    public abstract Object getOutput(int i);

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

    public /* synthetic */ AnonymousClass8O6(AnonymousClass8TF r1, C188938zj r2) {
        this(r1);
    }

    public Object next() {
        checkForConcurrentModification();
        if (hasNext()) {
            int i = this.currentIndex;
            this.indexToRemove = i;
            Object output = getOutput(i);
            this.currentIndex = this.this$0.getSuccessor(this.currentIndex);
            return output;
        }
        throw AnonymousClass6CA.A0c();
    }

    public void remove() {
        checkForConcurrentModification();
        C160937oh.checkRemove(AnonymousClass001.A1U(this.indexToRemove));
        incrementExpectedModCount();
        AnonymousClass8TF r1 = this.this$0;
        r1.remove(r1.key(this.indexToRemove));
        this.currentIndex = this.this$0.adjustAfterRemove(this.currentIndex, this.indexToRemove);
        this.indexToRemove = -1;
    }

    public AnonymousClass8O6(AnonymousClass8TF r2) {
        this.this$0 = r2;
        this.expectedMetadata = r2.metadata;
        this.currentIndex = r2.firstEntryIndex();
        this.indexToRemove = -1;
    }
}
