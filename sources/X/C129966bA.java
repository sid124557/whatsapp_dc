package X;

import java.util.Iterator;
import java.util.Objects;

/* renamed from: X.6bA  reason: invalid class name and case insensitive filesystem */
public class C129966bA extends C172878Nf {
    public int index = 0;
    public final /* synthetic */ Iterator[] val$elements;

    public C129966bA(Iterator[] itArr) {
        this.val$elements = itArr;
    }

    public boolean hasNext() {
        return AnonymousClass001.A1Y(this.index, this.val$elements.length);
    }

    public Iterator next() {
        if (hasNext()) {
            Iterator it = this.val$elements[this.index];
            Objects.requireNonNull(it);
            Iterator[] itArr = this.val$elements;
            int i = this.index;
            itArr[i] = null;
            this.index = i + 1;
            return it;
        }
        throw AnonymousClass6CA.A0c();
    }
}
