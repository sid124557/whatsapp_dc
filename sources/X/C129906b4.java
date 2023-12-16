package X;

import java.util.Collection;
import java.util.Collections;
import java.util.Set;

/* renamed from: X.6b4  reason: invalid class name and case insensitive filesystem */
public class C129906b4 extends AnonymousClass8TL<E> {
    public final /* synthetic */ Set val$set1;
    public final /* synthetic */ Set val$set2;

    public C172878Nf iterator() {
        return new C188918zh(this, 1);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C129906b4(Set set, Set set2) {
        super((C129896b3) null);
        this.val$set1 = set;
        this.val$set2 = set2;
    }

    public boolean contains(Object obj) {
        if (!this.val$set1.contains(obj) || !this.val$set2.contains(obj)) {
            return false;
        }
        return true;
    }

    public boolean containsAll(Collection collection) {
        if (!this.val$set1.containsAll(collection) || !this.val$set2.containsAll(collection)) {
            return false;
        }
        return true;
    }

    public boolean isEmpty() {
        return Collections.disjoint(this.val$set2, this.val$set1);
    }

    public int size() {
        int i = 0;
        for (Object contains : this.val$set1) {
            if (this.val$set2.contains(contains)) {
                i++;
            }
        }
        return i;
    }
}
