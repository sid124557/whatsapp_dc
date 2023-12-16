package X;

import java.util.Iterator;

/* renamed from: X.6b9  reason: invalid class name and case insensitive filesystem */
public class C129956b9 extends C172878Nf {
    public final /* synthetic */ C129386aE this$0;
    public Iterator valueCollectionItr;
    public Iterator valueItr = C162467s8.emptyIterator();

    public C129956b9(C129386aE r2) {
        this.this$0 = r2;
        this.valueCollectionItr = r2.map.values().iterator();
    }

    public boolean hasNext() {
        if (this.valueItr.hasNext() || this.valueCollectionItr.hasNext()) {
            return true;
        }
        return false;
    }

    public Object next() {
        if (!this.valueItr.hasNext()) {
            this.valueItr = ((C174098Sy) this.valueCollectionItr.next()).iterator();
        }
        return this.valueItr.next();
    }
}
