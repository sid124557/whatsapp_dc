package X;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.8Nv  reason: invalid class name and case insensitive filesystem */
public class C172998Nv implements Iterator {
    public Collection collection;
    public final Iterator delegateIterator;
    public final /* synthetic */ C129756ap this$1;

    public C172998Nv(C129756ap r2) {
        this.this$1 = r2;
        this.delegateIterator = AnonymousClass000.A0q(r2.submap);
    }

    public boolean hasNext() {
        return this.delegateIterator.hasNext();
    }

    public Map.Entry next() {
        Map.Entry A0w = AnonymousClass001.A0w(this.delegateIterator);
        this.collection = (Collection) A0w.getValue();
        return this.this$1.wrapEntry(A0w);
    }

    public void remove() {
        C162187rP.A05("no calls to next() since the last call to remove()", AnonymousClass000.A1W(this.collection));
        this.delegateIterator.remove();
        C129366aC.access$220(this.this$1.this$0, this.collection.size());
        this.collection.clear();
        this.collection = null;
    }
}
