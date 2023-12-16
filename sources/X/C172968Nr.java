package X;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.8Nr  reason: invalid class name and case insensitive filesystem */
public class C172968Nr implements Iterator {
    public Map.Entry entry;
    public final /* synthetic */ C129746ao this$1;
    public final /* synthetic */ Iterator val$entryIterator;

    public C172968Nr(C129746ao r1, Iterator it) {
        this.this$1 = r1;
        this.val$entryIterator = it;
    }

    public boolean hasNext() {
        return this.val$entryIterator.hasNext();
    }

    public Object next() {
        Map.Entry A0w = AnonymousClass001.A0w(this.val$entryIterator);
        this.entry = A0w;
        return A0w.getKey();
    }

    public void remove() {
        C162187rP.A05("no calls to next() since the last call to remove()", AnonymousClass000.A1W(this.entry));
        Collection collection = (Collection) this.entry.getValue();
        this.val$entryIterator.remove();
        C129366aC.access$220(this.this$1.this$0, collection.size());
        collection.clear();
        this.entry = null;
    }
}
